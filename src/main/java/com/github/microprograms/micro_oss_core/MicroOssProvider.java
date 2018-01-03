package com.github.microprograms.micro_oss_core;

import java.util.List;

import com.github.microprograms.micro_oss_core.exception.MicroOssException;
import com.github.microprograms.micro_oss_core.model.Entity;
import com.github.microprograms.micro_oss_core.model.ddl.CreateTableCommand;
import com.github.microprograms.micro_oss_core.model.ddl.DropTableCommand;
import com.github.microprograms.micro_oss_core.model.dml.DeleteCommand;
import com.github.microprograms.micro_oss_core.model.dml.InsertCommand;
import com.github.microprograms.micro_oss_core.model.dml.SelectCommand;
import com.github.microprograms.micro_oss_core.model.dml.SelectCountCommand;
import com.github.microprograms.micro_oss_core.model.dml.UpdateCommand;
import com.github.microprograms.micro_oss_core.model.dml.WriteCommand;

public interface MicroOssProvider {
    void createTable(CreateTableCommand command) throws MicroOssException;

    void dropTable(DropTableCommand command) throws MicroOssException;

    int deleteObject(DeleteCommand command) throws MicroOssException;

    int insertObject(InsertCommand command) throws MicroOssException;

    List<Entity> selectObject(SelectCommand command) throws MicroOssException;

    int selectCount(SelectCountCommand command) throws MicroOssException;

    int updateObject(UpdateCommand command) throws MicroOssException;

    void transaction(List<WriteCommand> commands) throws MicroOssException;
}
