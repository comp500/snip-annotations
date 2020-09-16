plugins {
    `java-library`
    `maven-publish`
}

group = "link.infra.snip"
version = "1.0"

repositories {
    jcenter()
}

dependencies {

}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}
