package org.musketeers.messenger

class ConversationItem {

    Contact author

    String message

    static hasOne = [conversation : Conversation]

    static constraints = {
    }
}
