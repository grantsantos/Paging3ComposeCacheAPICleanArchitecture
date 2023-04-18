package com.example.paging3composecacheapicleanarchitecture.data.mappers

import com.example.paging3composecacheapicleanarchitecture.data.local.BeerEntity
import com.example.paging3composecacheapicleanarchitecture.data.remote.BeerDto
import com.example.paging3composecacheapicleanarchitecture.domain.Beer

fun BeerDto.toBeerEntity() : BeerEntity {
    return BeerEntity(
        id = id,
        name = name,
        tagline = tagline,
        first_brewed = first_brewed,
        description = description,
        image_url = image_url.orEmpty()
    )
}

fun BeerEntity.toBeer() : Beer {
    return Beer(
        id = id,
        name = name,
        tagline = tagline,
        firstBrewed = first_brewed,
        description = description,
        imageUrl = image_url
    )
}