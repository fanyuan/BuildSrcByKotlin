

object Versions {
    val support_lib = "27.0.2"
    val retrofit = "2.3.0"
    val rxjava = "2.1.9"
    val kotlin_version = "1.4.21"
}

object Libs {
    val support_annotations = "com.android.support:support-annotations:${Versions.support_lib}"
    val support_appcompat_v7 = "com.android.support:appcompat-v7:${Versions.support_lib}"
    val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val retrofit_rxjava_adapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    val rxjava = "io.reactivex.rxjava2:rxjava:${Versions.rxjava}"

    val androidx_appcompat = "androidx.appcompat:appcompat:1.2.0"
    val material =  "com.google.android.material:material:1.2.1"
    val constraintlayout =  "androidx.constraintlayout:constraintlayout:2.0.4"
    val kotlin_stdlib =  "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin_version}"
    val junit = "junit:junit:4.+"
    val androidx_junit = "androidx.test.ext:junit:1.1.2"
    val espresso = "androidx.test.espresso:espresso-core:3.3.0"

}
