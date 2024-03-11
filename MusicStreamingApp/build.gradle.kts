// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    extra["compose_ui_version"] = "1.2.0"
    // Other buildscript configurations go here
}

plugins {
    id("com.android.application") version "8.3.0" apply false
    id("com.android.library") version "8.3.0" apply false
    id("org.jetbrains.kotlin.android") version "1.7.0" apply false
}

// Other configurations go here
