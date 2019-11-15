package com.github.microprograms.micro_oss_core;

import com.github.microprograms.micro_oss_core.exception.MicroOssException;

public interface Transaction {

	String getTransactionId();

	void execute(MicroOssProvider microOssProvider) throws MicroOssException;
}
