package com.mcquinne.vindinium.domain

import groovy.transform.ToString

@ToString(includePackage = false)
class Game {

    String id
    Integer turn
    Integer maxTurns
    List<Hero> heroes
    Board board
    Boolean finished

}
