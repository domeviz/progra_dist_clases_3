plugins {
    id("java")
    id("io.quarkus") version "3.6.5"
    id("io.freefair.lombok") version "8.4"
}

group = "com.distribuida"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

val quarkusVersion = "3.6.5"

dependencies {
    implementation(enforcedPlatform("io.quarkus.platform:quarkus-bom:${quarkusVersion}"))

    implementation("io.quarkus:quarkus-arc") //CDI: Arc
    implementation("io.quarkus:quarkus-resteasy-reactive") //JAX-RS: RESTEasy
    implementation("io.quarkus:quarkus-resteasy-reactive-jackson") //JAX-RS-Json: Jackson
    implementation("io.quarkus:quarkus-hibernate-orm-panache") //JPA: Hibernate
    implementation("io.quarkus:quarkus-jdbc-postgresql") //Driver JDBC: PostgreSQL

    implementation("io.quarkus:quarkus-rest-client-reactive")
    implementation("io.quarkus:quarkus-rest-client-reactive-jackson")

    // Load Balancer
    //implementation("io.smallrye.stork:stork-service-discovery-static-list:2.6.0")

    //registro
    implementation("io.smallrye.reactive:smallrye-mutiny-vertx-consul-client")
    implementation("io.smallrye.stork:stork-service-discovery-consul:2.6.0")

    //--health
    implementation("io.quarkus:quarkus-smallrye-health")
}

tasks.test {
    useJUnitPlatform()
}