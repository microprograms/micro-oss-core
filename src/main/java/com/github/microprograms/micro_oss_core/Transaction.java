package com.github.microprograms.micro_oss_core;

import com.github.microprograms.micro_oss_core.exception.MicroOssTransactionException;
import com.github.microprograms.micro_oss_core.model.dml.WriteCommand;

public interface Transaction {
    int update(WriteCommand command) throws MicroOssTransactionException;

    void commit() throws MicroOssTransactionException;

    void rollback() throws MicroOssTransactionException;
}
