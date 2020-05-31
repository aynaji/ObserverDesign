package com.ammar;

public class Subscriber {

	private String name;
	private Channel channel= new Channel();
	public void update() {
		System.out.println("Video uploaded");
	}
	
	public Subscriber(String name) {
		super();
		this.name = name;
	}

	public void subscriberChannel(Channel ch) {
		channel=ch;
	}
}
