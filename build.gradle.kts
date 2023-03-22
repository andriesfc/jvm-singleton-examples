@file:Suppress("UnstableApiUsage")

plugins {
    java
    kotlin("jvm") version "1.8.10"
}

repositories {
    mavenCentral()
}

val javacVersion = 17
val junitJupiterVersion = "5.9.2"
val kotestVersion = "5.5.5"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(javacVersion))
    }
}

kotlin {
    jvmToolchain(javacVersion)
}

testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useJUnitJupiter(junitJupiterVersion)
            dependencies {
                implementation(platform("io.kotest:kotest-bom:$kotestVersion"))
                implementation("io.kotest:kotest-runner-junit5")
                implementation("io.kotest:kotest-assertions-core")
                implementation("io.kotest:kotest-extensions-junit5")
                implementation("io.kotest:kotest-extensions")
            }
        }
    }
}

