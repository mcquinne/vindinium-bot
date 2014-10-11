package com.mcquinne.vindinium

import groovy.util.logging.Slf4j
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Slf4j
@ComponentScan
@Configuration
@EnableAutoConfiguration
class Application {

    static main( args ) {
        def ctx = SpringApplication.run(Application, args)
        log.info 'hello, world'
        ctx.close()
    }

}