plugins {
    java
    application
}

repositories {
    jcenter()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.3.1")
    testImplementation("org.mockito:mockito-core:2.27.0")
    testImplementation("org.mockito:mockito-junit-jupiter:2.27.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.3.1")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

application {
    mainClassName = "com.robspassky.basic.App"
}
