package com.brownfield.pss.book.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(BookingSource.class)
public class Sender {

	/**
	 * RabbitMessagingTemplate template;
	 * 
	 * @Autowired Sender(RabbitMessagingTemplate template) { this.template =
	 *            template; }
	 * 
	 * @Bean Queue queue() { return new Queue("SearchQ", false); }
	 * 
	 * @Bean Queue queue1() { return new Queue("CheckINQ", false); }
	 * 
	 *       public void send(Object message) {
	 *       template.convertAndSend("SearchQ", message); }
	 **/

	@Output(BookingSource.InventoryQ)
	@Autowired
	private MessageChannel messageChannel;

	public void send(Object message) {
		// template.convertAndSend("InventoryQ", message);
		messageChannel.send(MessageBuilder.withPayload(message).build());
	}
}

interface BookingSource {
	public static String InventoryQ = "inventoryQ";

	@Output("inventoryQ")
	public MessageChannel inventoryQ();

}
