package vn.finance.buildSrc

object Configs {
    const val namespace = "vn.finance.launch"

    object BuildModule {
        const val launch = ":launch"
    }

    object Demo {
        const val namespace = "vn.finance.demo"
        const val applicationId = "vn.finance.demo"
        const val versionCode = 1
        const val versionName = "1.0.0"
    }

    object Artifact {
        const val GROUP_ID = "vn.finance.libs"
        const val ARTIFACT_ID = "feature-launch"
        const val VERSION = "1.0.1"
    }
}
