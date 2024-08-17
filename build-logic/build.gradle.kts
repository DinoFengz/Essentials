plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    maven(url = "https://repo.extendedclip.com/content/repositories/placeholderapi/")
    
}

dependencies {
    implementation("net.kyori", "indra-common", "3.1.3")
    implementation("com.github.johnrengelman", "shadow", "8.1.1")
    implementation("xyz.jpenilla", "run-task", "2.3.0")
}
