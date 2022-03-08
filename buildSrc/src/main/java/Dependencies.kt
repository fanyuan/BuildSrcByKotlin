

object Versions {
    const val support_lib = "27.0.2"
    const val retrofit = "2.3.0"
    const val rxjava = "2.1.9"
    const val kotlin_version = "1.4.21"
    const val compileSdkVersion = 30
    @JvmStatic
    val buildToolsVersion = "30.0.3"
    @JvmStatic
    val minSdkVersion = 18
    @JvmStatic
    val targetSdkVersion = 30
}

object Libs {
    const val support_annotations = "com.android.support:support-annotations:${Versions.support_lib}"
    const val support_appcompat_v7 = "com.android.support:appcompat-v7:${Versions.support_lib}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofit_rxjava_adapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    const val rxjava = "io.reactivex.rxjava2:rxjava:${Versions.rxjava}"

    const val androidx_appcompat = "androidx.appcompat:appcompat:1.2.0"
    const val material =  "com.google.android.material:material:1.2.1"
    const val constraintlayout =  "androidx.constraintlayout:constraintlayout:2.0.4"
    const val kotlin_stdlib =  "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin_version}"
    const val junit = "junit:junit:4.+"
    const val androidx_junit = "androidx.test.ext:junit:1.1.2"
    const val espresso = "androidx.test.espresso:espresso-core:3.3.0"


    const val androidJUnitRunner = "androidx.test.runner.AndroidJUnitRunner"

}
