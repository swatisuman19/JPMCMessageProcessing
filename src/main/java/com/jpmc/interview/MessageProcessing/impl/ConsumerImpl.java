package com.jpmc.interview.MessageProcessing.impl;

import java.util.Queue;

import com.jpmc.interview.MessageProcessing.Interface.MessageConsumer;
import com.jpmc.interview.MessageProcessing.Service.Sale;

/**
 * @author swati
 * 
 */
public class ConsumerImpl implements MessageConsumer{


	public ConsumerImpl() {

	}

	/* (non-Javadoc)
	 * @see com.technical.test.MessageProcessing.Interface.MessageConsumer#consumeMessage(java.util.Queue)
	 * While consuming the Queue, calls sale.processNotification(message) to process the sale notice.
	 */
	
	public void consumeMessage(Queue<String> messageQ) {

		Sale sale = new Sale();
		messageQ.forEach(message -> {
			System.out.println("Message Read : " + message.toString());

			if (sale.processNotification(message.toString()))
				sale.log.report();
		});
	
		
	}



}
