package com.beatphobia.mkroom;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.beatphobia.mkroom.service.quest.QuestBookingService;

import lombok.Setter;

@RunWith(SpringRunner.class)
@SpringBootTest
class MkroomApplicationTests {

	@Setter(onMethod_ = @Autowired)
	private QuestBookingService questBookingService;
	
	@Test
	void contextLoads() {
		System.out.println(questBookingService.selectAllQuestInfo());
	}

}
