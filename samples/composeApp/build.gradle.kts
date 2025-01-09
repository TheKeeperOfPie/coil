import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackConfig

plugins {
    id("kotlin-multiplatform")
    id("org.jetbrains.compose")
    id("org.jetbrains.kotlin.plugin.compose")
}

kotlin {
    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        moduleName = "composeApp"
        browser {
            val rootDirPath = project.rootDir.path
            val projectDirPath = project.projectDir.path
            commonWebpackConfig {
                outputFileName = "composeApp.js"
                devServer = devServer ?: KotlinWebpackConfig.DevServer()
            }
        }
        binaries.executable()
    }

    sourceSets {
        commonMain.dependencies {
            implementation("io.coil-kt.coil3:coil-compose:3.1.0-SNAPSHOT")
//            implementation(projects.coilCompose)
            implementation(compose.components.resources)
            implementation(compose.material3)
        }
    }
    compilerOptions {
        //freeCompilerArgs.add("-Xwasm-use-new-exception-proposal")
    }
}


