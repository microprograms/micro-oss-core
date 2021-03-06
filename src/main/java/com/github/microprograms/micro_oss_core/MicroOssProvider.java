package com.github.microprograms.micro_oss_core;

import java.util.List;

import com.github.microprograms.micro_oss_core.exception.MicroOssException;
import com.github.microprograms.micro_oss_core.model.Field;
import com.github.microprograms.micro_oss_core.model.ddl.CreateTableCommand;
import com.github.microprograms.micro_oss_core.model.ddl.DropTableCommand;
import com.github.microprograms.micro_oss_core.model.dml.query.Condition;
import com.github.microprograms.micro_oss_core.model.dml.query.PagerRequest;
import com.github.microprograms.micro_oss_core.model.dml.query.SelectCommand;
import com.github.microprograms.micro_oss_core.model.dml.query.SelectCountCommand;
import com.github.microprograms.micro_oss_core.model.dml.query.Sort;
import com.github.microprograms.micro_oss_core.model.dml.update.DeleteCommand;
import com.github.microprograms.micro_oss_core.model.dml.update.InsertCommand;
import com.github.microprograms.micro_oss_core.model.dml.update.UpdateCommand;

public interface MicroOssProvider {

	MicroOssConfig getConfig();

	void createTable(CreateTableCommand command) throws MicroOssException;

	void dropTable(DropTableCommand command) throws MicroOssException;

	int insertObject(InsertCommand command) throws MicroOssException;

	int updateObject(UpdateCommand command) throws MicroOssException;

	int deleteObject(DeleteCommand command) throws MicroOssException;

	int queryCount(SelectCountCommand command) throws MicroOssException;

	QueryResult<?> query(SelectCommand command) throws MicroOssException;

	int insertObject(Object object) throws MicroOssException;

	int updateObject(Class<?> clz, List<Field> fields, Condition where) throws MicroOssException;

	int deleteObject(Class<?> clz, Condition where) throws MicroOssException;

	int queryCount(Class<?> clz, Condition where) throws MicroOssException;

	<T> QueryResult<T> query(Class<T> clz, Condition where) throws MicroOssException;

	<T> QueryResult<T> query(Class<T> clz, Condition where, List<Sort> sorts) throws MicroOssException;

	<T> QueryResult<T> query(Class<T> clz, Condition where, List<Sort> sorts, PagerRequest pager)
			throws MicroOssException;

	<T> QueryResult<T> query(Class<T> clz, List<String> fieldNames, Condition where, List<Sort> sorts,
			PagerRequest pager) throws MicroOssException;

	void execute(Transaction transaction) throws MicroOssException;
}
