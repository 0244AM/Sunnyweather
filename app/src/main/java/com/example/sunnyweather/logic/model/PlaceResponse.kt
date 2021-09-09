package com.example.sunnyweather.logic.model

data class PlaceResponse(val status:String, val place: List<Place>)

data class Place(val name: String, val location: Location,
                 @SerialzedName("formatted_address") val address: String)

data class Location(val lng: String, val lat: String)