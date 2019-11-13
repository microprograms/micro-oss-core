package com.github.microprograms.micro_oss_core;

import com.github.microprograms.micro_oss_core.exception.MicroOssException;

@FunctionalInterface
public interface Transaction {
	void execute(MicroOssProvider microOssProvider) throws MicroOssException;
}
