plugins {
    id("java-library")
    id("connectly.spring-boot-service")
    kotlin("plugin.jpa")
}

group = "com.communisol"
version = "unspecified"

repositories {
    mavenCentral()
    maven { url = uri("https://repo.spring.io/snapshot") }
}

dependencies {
    implementation(projects.common)

    implementation(libs.spring.boot.starter.validation)
    implementation(libs.spring.boot.starter.amqp)
    implementation(libs.spring.boot.starter.websocket)

    implementation(libs.spring.boot.starter.data.jpa)
    runtimeOnly(libs.postgresql)

    testImplementation(kotlin("test"))}

tasks.test {
    useJUnitPlatform()
}
