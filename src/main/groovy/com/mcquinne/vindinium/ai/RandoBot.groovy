package com.mcquinne.vindinium.ai

import com.mcquinne.vindinium.domain.State
import com.mcquinne.vindinium.util.Direction
import org.springframework.integration.annotation.ServiceActivator

class RandoBot {

    @ServiceActivator
    Direction showMeYourMoves(State state) {
        def dirs = Direction.values()
        dirs.getAt( Math.random() * dirs.size() as Integer )
    }

}
