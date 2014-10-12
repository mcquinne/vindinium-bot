package com.mcquinne.vindinium.domain

import groovy.transform.ToString

@ToString(includePackage = false)
class State {

    Game game
    Hero hero
    String token
    URL viewUrl
    URL playUrl

}
