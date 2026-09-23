pluginManagement {
    plugins {
        id("com.google.protobuf") version "0.9.4"
    }
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "zlink-framework-java-samples"

apply(from = settingsDir.resolve("gradle/zlink-sample-dependencies.settings.gradle.kts"))

include(
    ":java:Bingo:Client",
    ":java:Bingo:Server:Api",
    ":java:Bingo:Server:Configuration",
    ":java:Bingo:Server:Matchmaking",
    ":java:Bingo:Server:Play",
    ":java:Bingo:Server:Session",
    ":java:Bingo:Shared",
    ":java:DeliveryDispatch:Client",
    ":java:DeliveryDispatch:Server:Configuration",
    ":java:DeliveryDispatch:Server:CourierSession",
    ":java:DeliveryDispatch:Server:CourierSpotNode",
    ":java:DeliveryDispatch:Server:CustomerGateway",
    ":java:DeliveryDispatch:Server:Dispatch",
    ":java:DeliveryDispatch:Server:Tracking",
    ":java:DeliveryDispatch:Shared",
    ":java:GameQuest:Client",
    ":java:GameQuest:Server:Configuration",
    ":java:GameQuest:Server:GameApi",
    ":java:GameQuest:Server:QuestMission",
    ":java:GameQuest:Shared",
    ":java:ShoppingMall:Client",
    ":java:ShoppingMall:Server:CommerceApi",
    ":java:ShoppingMall:Server:Configuration",
    ":java:ShoppingMall:Server:OrderWorkflow",
    ":java:ShoppingMall:Server:Shared",
    ":java:ShoppingMall:Shared",
    ":java:TicTacToe:Client",
    ":java:TicTacToe:Server",
    ":java:TicTacToe:Shared",
    ":java:SupportChat:Client",
    ":java:SupportChat:Server:Api",
    ":java:SupportChat:Server:Configuration",
    ":java:SupportChat:Server:Session",
    ":java:SupportChat:Server:Support",
    ":java:SupportChat:Shared",
    ":java:ZoneWorld:Client",
    ":java:ZoneWorld:Server",
    ":java:ZoneWorld:Shared",
)
