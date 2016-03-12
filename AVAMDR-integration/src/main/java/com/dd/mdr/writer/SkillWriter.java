package com.dd.mdr.writer;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.batch.item.database.JpaItemWriter;
import com.dd.mdr.bean.Skill;

public class SkillWriter extends JpaItemWriter<Skill> {
	
	@Override
	protected void doWrite(EntityManager entityManager, List<? extends Skill> skills) {
		// TODO Auto-generated method stub
		super.doWrite(entityManager, skills);
	}

}
