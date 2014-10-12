package com.mcquinne.vindinium.util

import org.springframework.integration.annotation.Transformer


class CommandTransformer {

    String key  //DI

    @Transformer
    Map transform( message ) {
        if ( message instanceof Map ) {
            message.key = key
            return message
        }

        if ( message instanceof Direction ) {
            return [key: key, dir:Direction]
        }

        return [key: key]
    }

}
