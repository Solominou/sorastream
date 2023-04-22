import org.jetbrains.kotlin.konan.properties.Properties

// use an integer for version numbers
version = 123

android {
    defaultConfig {
        val properties = Properties()
        properties.load(project.rootProject.file("local.properties").inputStream())

        buildConfigField("String", "SORA_API", "\"${properties.getProperty("SORA_API")}\"")
        buildConfigField("String", "SORA_WEB", "\"${properties.getProperty("SORA_WEB")}\"")
        buildConfigField("String", "CRY_API", "\"${properties.getProperty("CRY_API")}\"")

    }
}

cloudstream {
    language = "en"
    // All of these properties are optional, you can safely remove them

     description = "#1 best extention based on MultiAPI"
     authors = listOf("Hexated", "Sora")

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
     * */
    status = 1 // will be 3 if unspecified
    tvTypes = listOf(
        "AsianDrama",
        "TvSeries",
        "Anime",
        "Movie",
    )

    iconUrl = "https://raw.githubusercontent.com/hexated/cloudstream-extensions-hexated/master/SoraStream/Icon.png"
}