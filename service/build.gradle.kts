dependencies {
    api(project(":model"))
    api(ZeroLibs.scheduler)

    testImplementation(VertxLibs.junit)
    testImplementation(testFixtures(QWELibs.core))
}
