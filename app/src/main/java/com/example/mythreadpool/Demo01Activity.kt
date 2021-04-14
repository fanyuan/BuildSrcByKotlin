package com.example.mythreadpool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.Future
import java.util.concurrent.ThreadPoolExecutor

class Demo01Activity : AppCompatActivity() {
    var service = Executors.newCachedThreadPool()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo01)
    }
    lateinit var future:Future<Any>;
    var flag:Boolean = true
    var  task = MyTask();
    fun start(view: View) {
        //Toast.makeText(this,"start",Toast.LENGTH_SHORT).show()
        Log.d("ddebug","start")
        task = MyTask()
        service.execute(task)
    }
    fun stop01(view: View) {
        Log.d("ddebug","stop01")
        task.cancel()
    }
    fun stop02(view: View) {
        Log.d("ddebug","stop02")
        service.shutdownNow()
    }
    class MyTask():Runnable{
        private var isCancel = false
        var i = 0
        fun cancel(){
            isCancel = true
        }
        override fun run() {
            while (!isCancel && i < 100){
                Log.d("ddebug","MyTask ${i++}")
                try {
                    Thread.sleep(500)
                }catch (e:InterruptedException){
                    isCancel = true
                    Log.d("ddebug","人为取消了任务 InterruptedException ${e.message}")
                    break

                }

            }
            if (isCancel){
                Log.d("ddebug","人为取消了任务")
            }else{
                Log.d("ddebug","任务正常执行完成")
            }
        }

    }
}