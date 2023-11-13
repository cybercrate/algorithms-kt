plugins {
    kotlin("jvm") version "1.9.0"
}

group = "com.wingmann"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

kotlin {
    jvmToolchain(8)
}

tasks.test {
    useJUnitPlatform()
}

tasks.jar {
    // Needed to optimize Gradle performance.
    dependsOn.addAll(listOf("compileJava", "compileKotlin", "processResources"))

    // Naming the jar.
    // archiveClassifier.set("standalone")
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE

    // From application plugin config.
    // manifest.attributes["Main-Class"] = application.mainClass

    val sourcesMain = sourceSets.main.get()
    val contents = configurations.runtimeClasspath.get().map {
        if (it.isDirectory) it else zipTree(it)
    } + sourcesMain.output

    from(contents)
}
