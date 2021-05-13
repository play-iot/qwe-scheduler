dependencies {
    api(QWELibs.core)
    implementation(ZeroLibs.scheduler)

    testImplementation(VertxLibs.junit)
    testImplementation(testFixtures(QWELibs.core))
}
