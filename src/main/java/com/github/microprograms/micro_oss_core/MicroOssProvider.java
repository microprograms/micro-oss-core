package com.github.microprograms.micro_oss_core;

import java.io.Closeable;
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

public interface MicroOssProvider extends Closeable {
    void createTable(CreateTableCommand command) throws MicroOssException;

    void dropTable(DropTableCommand command) throws MicroOssException;

    long deleteObject(DeleteCommand command) throws MicroOssException;

    long insertObject(InsertCommand command) throws MicroOssException;

    List<Entity> selectObject(SelectCommand command) throws MicroOssException;

    long selectCount(SelectCountCommand command) throws MicroOssException;

    long updateObject(UpdateCommand command) throws MicroOssException;

    Transaction beginTransaction() throws MicroOssException;

    void close() throws MicroOssException;
}
