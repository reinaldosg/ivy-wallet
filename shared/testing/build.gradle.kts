plugins {
    id("ivy.feature")
}

android {
    namespace = "com.ivy.testing"
}

dependencies {
    implementation(projects.shared.domain)
    implementation(projects.shared.base)

    // for this module we need test deps as "implementation" and not only "testImplementation"
    implementation(libs.bundles.testing)
}
