import org.gradle.api.JavaVersion

object Configs {
    const val namespace = "vn.finance.launch"
    const val minSdk = 24
    const val targetSdk = 34
    const val compileSdk = 34
    const val jvmTarget = "17"
    const val kotlinCompilerExtensionVersion = "1.5.14"
    val javaVersion = JavaVersion.VERSION_17
    const val mavenDomain = "https://maven.pkg.github.com"

    object BuildModule {
        const val launch = ":launch"
    }

    object Demo {
        const val namespace = "vn.finance.demo"
        const val applicationId = "vn.finance.demo"
        const val versionCode = 1
        const val versionName = "1.0.0"
    }
}


