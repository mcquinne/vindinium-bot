package com.mcquinne.vindinium

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.messaging.MessageChannel
import org.springframework.messaging.support.GenericMessage

@ComponentScan
@EnableAutoConfiguration
class Application {

    static main( args ) {
        def ctx = SpringApplication.run('classpath:main-context.xml')
        def sendMoveChannel = ctx.getBean('startTraining', MessageChannel)
        sendMoveChannel.send(new GenericMessage([:]))
    }

}