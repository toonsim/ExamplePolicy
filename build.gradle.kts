plugins {
    java
}

group = "ExamplePolicy"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
//    testCompile("junit", "junit", "4.12")
    implementation(files("zap-2.9.0-SNAPSHOT.jar"))
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}