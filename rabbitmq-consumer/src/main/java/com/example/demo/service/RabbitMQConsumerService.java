package com.example.demo.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ItemDao;
import com.example.demo.model.Item;

@Service
public class RabbitMQConsumerService {
	
	private ItemDao itemDao;
	
	@Autowired
	public RabbitMQConsumerService(ItemDao itemDao) {
		super();
		this.itemDao = itemDao;
	}

	private static final String QUEUE = "items-queue";

	@RabbitListener(queues = QUEUE)
	public void receiveMessage(Item item) {

		System.out.println("Received Message from Items Queue >>" + item);
		itemDao.save(item);
		
	}
}
