import vn.finance.buildSrc.Configs

plugins {
    vn.core.plugins.androidLibrary
    vn.core.plugins.androidCompose
    vn.core.plugins.androidPublishing
}

android {
    namespace = Configs.NAMESPACE
}

publishing {
    publications {
        create<MavenPublication>(Configs.Artifact.ARTIFACT_ID) {
            afterEvaluate {
                from(components["all"])
            }
            groupId = Configs.Artifact.GROUP_ID
            artifactId = Configs.Artifact.ARTIFACT_ID
            version = Configs.Artifact.VERSION // Set your desired version here
        }
    }
}

dependencies {
    implementation(mobilex.bundles.coreAndroidComponents)
    implementation(mobilex.bundles.jetpackComposeComponents)
    implementation(mobilex.androidxCoreSplashscreen)
}