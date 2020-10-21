object Libraries {

    object Kotlin {
        private const val version = "1.4.10" // Don't forget to update the version in buildSrc too !

        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$version"
    }

    object Androidx {
        const val appcompat = "androidx.appcompat:appcompat:1.2.0"
        const val constraintlayout = "androidx.constraintlayout:constraintlayout:2.0.1"
        const val recyclerview = "androidx.recyclerview:recyclerview:1.1.0"

        object Ktx {
            const val core = "androidx.core:core-ktx:1.3.1"
        }
    }

    object Glide {
        const val glide= "com.github.bumptech.glide:glide:4.11.0"
    }

    object Exoplayer {
        private const val version = "2.12.0"

        const val exoplayer = "com.google.android.exoplayer:exoplayer:$version"
        const val exoplayercore = "com.google.android.exoplayer:exoplayer-core:$version"
        const val exoplayerui = "com.google.android.exoplayer:exoplayer-ui:$version"
        const val exoplayerdash = "com.google.android.exoplayer:exoplayer-dash:$version"
        const val exoplayerhls = "com.google.android.exoplayer:exoplayer-hls:$version"
    }

    object TestLibraries {
        const val junit = "junit:junit:4.13"
    }

    object AndroidTestLibraries {
        const val runner = "androidx.test.ext:junit:1.1.1"

        object Espresso {
            private const val version = "3.3.0"

            const val core = "androidx.test.espresso:espresso-core:$version"
        }
    }

}