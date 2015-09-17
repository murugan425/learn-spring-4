/**
 * @author	: Murugan_Nagarajan
 * @date	: Sep 17, 2015
 * @time	: 9:19:33 PM
 */
package com.tamil.learnspring.spel;

import java.util.Random;

import org.springframework.stereotype.Component;

/**
 * @author Murugan_Nagarajan
 *
 */
@Component
public class RandomMsg {
	private static String[] greetMsg = {
		"Hello",
		"Hi Dude",
		"Welcome Sir"
	};
	
	public String sayHi() {
		Random random = new Random();
		return greetMsg[random.nextInt(greetMsg.length)];
	}
}
