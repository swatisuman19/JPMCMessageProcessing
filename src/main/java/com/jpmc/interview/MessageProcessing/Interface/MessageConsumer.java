package com.jpmc.interview.MessageProcessing.Interface;
import java.util.Queue;

/**
 * @author swati
 *
 */
public interface MessageConsumer {


	void consumeMessage(Queue<String> messageQ);



}
