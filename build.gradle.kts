extra["projectType"] =  "application"

version = "1.6.0"

val harmonysoftLibsVersion by extra { "3.5.0" }
val mentalMateLibrariesVersion by extra { "2.7.0" }

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-webflux")

    implementation("tech.harmonysoft:mental-mate-llm:$mentalMateLibrariesVersion")
    implementation("tech.harmonysoft:mental-mate-data-storage-aws-s3:$mentalMateLibrariesVersion")
    implementation("tech.harmonysoft:mental-mate-meta-storage:$mentalMateLibrariesVersion")
    implementation("tech.harmonysoft:mental-mate-util:$mentalMateLibrariesVersion")

    implementation("tech.harmonysoft:harmonysoft-slf4j-spring:$harmonysoftLibsVersion")
    implementation("tech.harmonysoft:harmonysoft-default-implementations:$harmonysoftLibsVersion")

    implementation("aws.sdk.kotlin:s3:1.2.7")

    testImplementation("tech.harmonysoft:mental-mate-data-storage-memory:$mentalMateLibrariesVersion")
    testImplementation("tech.harmonysoft:mental-mate-data-storage-test:$mentalMateLibrariesVersion")
    testImplementation("tech.harmonysoft:mental-mate-meta-storage-mongo:$mentalMateLibrariesVersion")
    testImplementation("tech.harmonysoft:mental-mate-llm-test:$mentalMateLibrariesVersion")

    testImplementation("tech.harmonysoft:harmonysoft-http-client-apache-cucumber-spring:$harmonysoftLibsVersion")
    testImplementation("tech.harmonysoft:harmonysoft-test-environment:$harmonysoftLibsVersion")
}
