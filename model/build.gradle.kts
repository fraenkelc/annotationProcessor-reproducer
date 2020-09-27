plugins {
    `java-library`
    id("io.ebean")
}

dependencies {
    implementation("io.ebean:ebean:12.4.1")
    implementation("io.ebean:ebean-querybean:12.4.1")
    implementation("io.ebean:ebean-annotation:6.13")

    annotationProcessor("io.ebean:ebean-annotation:6.13")
    annotationProcessor("io.ebean:ebean-querybean:12.4.1")
    annotationProcessor("io.ebean:persistence-api:2.2.4")
    annotationProcessor("io.ebean:querybean-generator:12.4.1")
}

ebean {
    debugLevel = 1
    queryBeans = true
}