package com.ammar;

public class Youtube {

	public static void main(String[] args) {
	Channel AmmarChannel = new Channel();
	Subscriber s1=new Subscriber("Ammar");
	Subscriber s2=new Subscriber("Ammar2");
	AmmarChannel.subscribe(s1);
	AmmarChannel.subscribe(s2);
	
	s1.subscriberChannel(AmmarChannel);
	s2.subscriberChannel(AmmarChannel);
	
	AmmarChannel.upload("How to learn Java");
	}
}
