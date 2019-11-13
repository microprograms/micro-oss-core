package com.github.microprograms.micro_oss_core.model.dml.update;

import com.github.microprograms.micro_oss_core.model.Entity;

public class InsertCommand {
	private Entity entity;

	public InsertCommand(Entity entity) {
		this.entity = entity;
	}

	public Entity getEntity() {
		return entity;
	}

	public void setEntity(Entity entity) {
		this.entity = entity;
	}
}
