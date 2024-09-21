plugins {
    alias(mobilex.plugins.androidLibrary)
    alias(mobilex.plugins.kotlinAndroid)
    `maven-publish`
}

android {
    namespace = Configs.namespace
    compileSdk = Configs.compileSdk

    defaultConfig {
        minSdk = Configs.minSdk
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = Configs.javaVersion
        targetCompatibility = Configs.javaVersion
    }
    kotlinOptions {
        jvmTarget = Configs.jvmTarget
    }
}

publishing {
    val ghUsername = System.getenv("USERNAME")
    val ghPassword = System.getenv("TOKEN")
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("${Configs.mavenDomain}/${ghUsername}/finance-launch")
            credentials {
                username = ghUsername
                password = ghPassword
            }
        }
    }
    publications {
        create<MavenPublication>("mavenAndroid") {
            afterEvaluate {
                from(components["release"])
            }
            groupId = "vn.finance.libs"
            artifactId = "ui-launch"
            version = "1.0.0" // Set your desired version here
        }
    }
}

dependencies {
    implementation(mobilex.androidxCoreKtx)
    implementation(mobilex.androidxCoreSplashscreen)
    implementation(mobilex.material)
}