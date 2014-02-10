package org.musketeers.messenger

class Conversation {

    Contact initiator

    Contact participant

    List conversationItems

    static hasMany = [conversationItems:ConversationItem]
    static constraints = {
    }
}
