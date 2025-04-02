plugins {
	kotlin("jvm") version "1.9.10"  // Updated version
	kotlin("plugin.spring") version "1.9.10"
	id("org.springframework.boot") version "3.4.4"
	id("io.spring.dependency-management") version "1.1.7"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

repositories {
	mavenCentral()  // This is where Gradle will fetch dependencies from
	gradlePluginPortal()  // Ensures Gradle can access required plugins
}

dependencies {
	// Spring Boot Dependencies
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	developmentOnly("org.springframework.boot:spring-boot-devtools")

	// Testing Dependencies - Spring Boot Starter Test already includes JUnit and AssertJ
	testImplementation("org.springframework.boot:spring-boot-starter-test")

	// Explicit JUnit 5 Dependencies (if needed)
	testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
	testImplementation("org.junit.jupiter:junit-jupiter-engine:5.8.2")

	// Explicit AssertJ (if needed)
	testImplementation("org.assertj:assertj-core:3.24.2")

	// Mockito Dependencies
	testImplementation("org.mockito:mockito-core:5.3.1")
	testImplementation("org.mockito:mockito-junit-jupiter:5.3.1")
	testImplementation("org.mockito.kotlin:mockito-kotlin:5.3.1")
	implementation(kotlin("test"))
}



kotlin {
	compilerOptions {
		freeCompilerArgs.addAll("-Xjsr305=strict")
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
