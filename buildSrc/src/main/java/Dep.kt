object Dep {
    object GradlePlugin {
        val android = "com.android.tools.build:gradle:3.6.1"
        val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.61"
    }

    object AndroidX {
        val appCompat = "androidx.appcompat:appcompat:1.1.0"
        val constraint = "androidx.constraintlayout:constraintlayout:1.1.2"

        val coreKtx = "androidx.core:core-ktx:1.2.0"
    }

    object Kotlin {
        val stdlibJvm = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.61"
    }

    object Test {
        val junit = "junit:junit:4.12"
        val espresso = "androidx.test.espresso:espresso-core:3.2.0"
    }
}