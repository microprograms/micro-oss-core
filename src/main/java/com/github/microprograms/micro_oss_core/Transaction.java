package com.github.microprograms.micro_oss_core;

import com.github.microprograms.micro_oss_core.exception.MicroOssTransactionException;
import com.github.microprograms.micro_oss_core.model.dml.DeleteCommand;
import com.github.microprograms.micro_oss_core.model.dml.InsertCommand;
import com.github.microprograms.micro_oss_core.model.dml.UpdateCommand;

public interface Transaction extends AutoCloseable {
    long deleteObject(DeleteCommand command) throws MicroOssTransactionException;

    long insertObject(InsertCommand command) throws MicroOssTransactionException;

    long updateObject(UpdateCommand command) throws MicroOssTransactionException;

    void commit() throws MicroOssTransactionException;

    void rollback() throws MicroOssTransactionException;

    void close() throws MicroOssTransactionException;
}
