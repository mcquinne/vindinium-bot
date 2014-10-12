package com.mcquinne.vindinium.domain

import com.mcquinne.vindinium.util.Direction
import groovy.transform.ToString

@ToString(includePackage = false)
class Hero {

    Integer id
    String name
    String userId
    Integer elo
    Position pos
    Direction lastDir
    Integer life
    Integer gold
    Integer mineCount
    Position spawnPos
    Boolean crashed

}
