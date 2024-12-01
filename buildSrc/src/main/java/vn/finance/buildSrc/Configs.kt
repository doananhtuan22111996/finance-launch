package vn.finance.buildSrc

object Configs {
    const val NAMESPACE = "vn.finance.launch"

    object BuildModule {
        const val LAUNCH = ":launch"
    }

    object Demo {
        const val NAMESPACE = "vn.finance.demo"
        const val APPLICATION_ID = "vn.finance.demo"
        const val VERSION_CODE = 1
        const val VERSION_NAME = "1.0.0"
    }

    object Artifact {
        const val GROUP_ID = "vn.finance.libs"
        const val ARTIFACT_ID = "feature-launch"
        const val VERSION = "1.0.2"
    }
}
