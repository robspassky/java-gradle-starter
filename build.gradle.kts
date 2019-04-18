plugins {
    id("org.springframework.boot") version "2.1.4.RELEASE"
    java
}

version = "0.0.1-SNAPSHOT"

repositories {
    jcenter()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter:2.1.4.RELEASE")
    //implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.1.4.RELEASE")
    //implementation("org.springframework.boot:spring-boot-starter-jdbc:2.1.4.RELEASE")
    //implementation("org.springframework.boot:spring-boot-starter-validation:2.1.4.RELEASE")
    //runtimeOnly("com.h2database:h2:1.4.199")
    //runtimeOnly("mysql:mysql-connector-java:8.0.15")
    testImplementation("org.springframework.boot:spring-boot-starter-test:2.1.4.RELEASE") {
        exclude(module = "junit")
    }
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.3.1")
    testImplementation("org.mockito:mockito-core:2.27.0")
    testImplementation("org.mockito:mockito-junit-jupiter:2.27.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.3.1")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
