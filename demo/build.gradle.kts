import vn.finance.buildSrc.Configs

plugins {
    vn.core.plugins.androidApplication
}

android {
    namespace = Configs.Demo.NAMESPACE

    defaultConfig {
        applicationId = Configs.Demo.APPLICATION_ID
        versionCode = Configs.Demo.VERSION_CODE
        versionName = Configs.Demo.VERSION_NAME
    }
}

dependencies {
    implementation(libs.financeTheme)
    implementation(project(Configs.BuildModule.LAUNCH))
}