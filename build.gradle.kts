
plugins {
    application
    kotlin("jvm") version "1.3.21"
}

application {
    mainClassName = "Main"


    dependencies {
        compile(kotlin("stdlib"))
        compile("com.google.code.gson:gson:2.8.1")

    }

    repositories {
        jcenter()
    }
}
