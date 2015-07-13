package ghumover2

import org.grails.databinding.BindingFormat

import java.sql.Timestamp

class Message {


	static belongsTo = [threadId: Conversation]

	Long messageId
    String messageText
	@BindingFormat("dd-MM-yyyy")
	Date messageTime
	String fromId
	String toId
	String fromName
	String toName


	static mapping = {
		id generator: 'increment',name: 'messageId'

	}






}
