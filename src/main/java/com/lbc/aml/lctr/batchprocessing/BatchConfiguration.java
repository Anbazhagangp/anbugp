package com.lbc.aml.lctr.batchprocessing;

import javax.sql.DataSource;

import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BatchConfiguration {

	@Bean
	public FlatFileItemReader<?> reader() {
		return null;
	}

	@Bean
	public void processor() {
		
	}

	@Bean
	public JdbcBatchItemWriter<?> writer(DataSource dataSource) {
		return null;
	}

}
