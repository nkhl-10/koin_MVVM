`plugins {
id("com.android.application")
id("org.jetbrains.kotlin.android")
id("kotlin-kapt")
}`

`// Koin for dependency injection
implementation("io.insert-koin:koin-android:3.3.3")
//view model
implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
// Room for local database
//    implementation("androidx.room:room-runtime:2.6.1")
implementation ("androidx.room:room-ktx:2.6.1")

    kapt("androidx.room:room-compiler:2.6.1")
// Retrofit for network requests
implementation("com.squareup.retrofit2:retrofit:2.9.0")
implementation("com.squareup.retrofit2:converter-gson:2.9.0")
//Coroutines
implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.1")`



