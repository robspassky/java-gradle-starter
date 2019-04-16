plugins {
    java
    application
}

repositories {
    jcenter()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.3.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.3.1")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

application {
    mainClassName = "com.robspassky.basic.App"
}
