object Versions{
    // Material and androidX
    const val material = "1.3.0-alpha02"
    const val appCompat = "1.3.0-alpha02"
    const val constraintLayout = "2.0.1"
    const val swiperefreshlayout = "1.2.0-alpha01"

    // Firebase
    const val firebase = "26.0.0"

    // Gson
    const val gson = "2.9.0"

    //DI - HILT
    const val hilt = "2.32-alpha"

    // Room db
    const val room = "2.3.0-alpha02"

    // Lifecycle
    const val lifecycle = "2.3.0-alpha07"

    // Coroutines
    const val coroutines = "1.3.9"

    // Logging - debug builds
    const val timber = "4.7.1"
    const val leakCanary = "2.4"

    // Lottie - sleek animations
    const val lottie = "3.4.0"

    // Kotlin
    const val kotlinVersion = "1.4.0"
    const val coreKtx = "1.5.0-alpha02"

    // Gradle Plugins
    const val ktlint = "9.3.0"
    const val detekt = "1.12.0"
    const val spotless = "5.3.0"
    const val jacoco = "0.8.4"
    const val dokka = "1.4.0-rc-24"
    const val gradleVersionsPlugin = "0.29.0"
    const val slackKeeper = "0.7.0"

    // tests
    const val junit = "4.13"
    const val espresso = "3.3.0"
    const val roboelectric = "4.4-beta-1"
    const val androidXJUnit = "1.1.1"
    const val truth = "1.0.1"
    const val androidXTestCore = "1.3.0"
    const val runner = "1.3.0"
    const val rules = "1.3.0"
    const val archComponentTest = "2.1.0"
    const val kakao = "2.3.4"
    const val mockK = "1.10.0"
    const val liveDataTesting = "1.1.2"
}
object BuildPlugins {
    //All the build plugins are added here
    const val androidLibrary = "com.android.library"
    const val kapt = "kotlin-kapt"
    const val ktlintPlugin = "org.jlleitschuh.gradle.ktlint"
    const val detektPlugin = "io.gitlab.arturbosch.detekt"
    const val dokkaPlugin = "org.jetbrains.dokka"
    const val spotlessPlugin = "com.diffplug.spotless"
    const val androidApplication = "com.android.application"
    const val kotlinAndroid = "org.jetbrains.kotlin.android"
    const val kotlinAndroidExtensions = "org.jetbrains.kotlin.android.extensions"
    const val gradleVersionsPlugin = "com.github.ben-manes.versions"
    const val slackKeeper = "com.slack.keeper"
    const val jacocoAndroid = "com.hiya.jacoco-android"
}
object Libraries {
    // androidX and Material
    const val material = "com.google.android.material:material:${Versions.material}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val swiperefreshlayout =
        "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.swiperefreshlayout}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

    // Firebase
    const val bom = "com.google.firebase:firebase-bom:${Versions.firebase}"
    const val crashlytics = "com.google.firebase:firebase-crashlytics"

    // Gson
    const val gson = "com.squareup.retrofit2:converter-gson:${Versions.gson}"

    // DI - HILT
    const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltKapt = "com.google.dagger:hilt-compile:${Versions.hilt}"

    // Room db
    const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
    const val room = "androidx.room:room-ktx:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"

    // Lifecycle
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val livedata = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
    const val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    const val viewModelSavedState =
        "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.lifecycle}"

    // Coroutines
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val coroutinesAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"

    // Logging - debug builds
    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
    const val leakCanary = "com.squareup.leakcanary:leakcanary-android:${Versions.leakCanary}"

    // Kotlin
    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlinVersion}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"

    // Lottie
    const val lottie = "com.airbnb.android:lottie:${Versions.lottie}"
}
object TestLibraries {
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val jUnit = "junit:junit:${Versions.junit}"
    const val roboelectric = "org.robolectric:robolectric:${Versions.roboelectric}"
    const val androidXJUnit = "androidx.test.ext:junit:${Versions.androidXJUnit}"
    const val truth = "com.google.truth:truth:${Versions.truth}"
    const val androidXTestCore = "androidx.test:core:${Versions.androidXTestCore}"
    const val runner = "androidx.test:runner:${Versions.runner}"
    const val rules = "androidx.test:rules:${Versions.rules}"
    const val hiltTest = "com.google.dagger:hilt-android-testing:${Versions.hilt}"
    const val hiltKaptTest = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
    const val hiltInstrumentationTest = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
    const val hiltKaptInstrumentationTest = "com.google.dagger:hilt-android-testing:${Versions.hilt}"
    const val roomTest = "androidx.room:room-testing:${Versions.room}"
    const val coroutinesTest =
        "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
    const val archComponentTest =
        "androidx.arch.core:core-testing:${Versions.archComponentTest}"
    const val kakao = "com.agoda.kakao:kakao:${Versions.kakao}"
    const val mockK = "io.mockk:mockk:${Versions.mockK}"
    const val androidMockK = "io.mockk:mockk-android:${Versions.mockK}"
    const val liveDataTesting = "com.jraska.livedata:testing-ktx:${Versions.liveDataTesting}"
}
object AndroidSdk {
    const val minSdkVersion = 21
    const val compileSdkVersion = 30
    const val targetSdkVersion = compileSdkVersion
    const val versionCode = 1
    const val versionName = "1.0"
}