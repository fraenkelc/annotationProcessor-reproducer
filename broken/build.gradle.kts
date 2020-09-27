plugins {
    java
    id("io.ebean")
}

dependencies {
    implementation(project(":model"))
    implementation("io.ebean:ebean:12.4.1")
    implementation("io.ebean:ebean-querybean:12.4.1")
    implementation("io.ebean:ebean-annotation:6.13")

    annotationProcessor("io.ebean:ebean-annotation:6.13")
    annotationProcessor("io.ebean:ebean-querybean:12.4.1")
    annotationProcessor("io.ebean:persistence-api:2.2.4")
    annotationProcessor("io.ebean:querybean-generator:12.4.1")

}

ebean {
    debugLevel = 9
    queryBeans = true
}