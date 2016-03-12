package com.dd.mdr.processor;

import org.springframework.batch.item.ItemProcessor;
import com.dd.mdr.bean.Skill;

public class SkillProcessor implements ItemProcessor<Skill, Skill> {

	@Override
	public Skill process(Skill skill) throws Exception {
		// TODO Auto-generated method stub
		return skill;
	}

}
