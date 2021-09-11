package com.chhonkar.springbootstart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	
	
	private List<Topic> topics = new ArrayList<> (Arrays.asList(
			new Topic("spring" ,"Spring Framework", "String Framework Description"),
			new Topic("Java", "COre Java", "COre Java Desription"),
			new Topic("JavaScript", "JavaScript", "JavaScript Description")
			));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}




	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}

}
