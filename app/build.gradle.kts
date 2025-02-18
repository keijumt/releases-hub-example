plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("com.releaseshub.gradle.plugin")
}

android {
    compileSdkVersion(29)
    buildToolsVersion = "29.0.2"
    defaultConfig {
        applicationId = "keijumt.releaseshub"
        minSdkVersion(23)
        targetSdkVersion(29)
        versionCode =1
        versionName ="1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(Dep.Kotlin.stdlibJvm)
    implementation(Dep.AndroidX.appCompat)
    implementation(Dep.AndroidX.coreKtx)
    implementation(Dep.AndroidX.constraint)
    testImplementation(Dep.Test.junit)
    androidTestImplementation(Dep.Test.espresso)
}

releasesHub {
    dependenciesBasePath = "buildSrc/src/main/java/"
    dependenciesClassNames = listOf("Dep.kt")
    pullRequestEnabled = true
    pullRequestsMax = 3
    pullRequestLabels = listOf("dependencies")
    gitHubUserName = "keijumt"
    gitHubUserEmail = "keijumt@gmail.com"
    gitHubRepositoryOwner = "keijumt"
    gitHubRepositoryName = "releases-hub-example"
}
