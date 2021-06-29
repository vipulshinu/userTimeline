package com.users.userTimelineProject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.dataformat.csv.CsvMapper;
//import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.datacatalog.v1.DataCatalogClient;
import com.google.cloud.datacatalog.v1.Entry;
import com.google.cloud.datacatalog.v1.LookupEntryRequest;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import com.google.common.collect.Lists;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZonedDateTime;
import java.util.*;

@SpringBootApplication
public class UserTimelineProjectApplication {
	public static int[][] diagonalSort(int[][] mat) {
		int len = mat.length;
		for (int i = 0; i < len; i++) {
			Integer[] sorted = getElement(mat, i);
			putElement(mat, i, sorted);
		}
		int row = mat[0].length;
		for (int i = 1; i < mat[0].length; i++) {
			putElement(mat, row, i, getElement(mat, row, i));
		}
		return mat;
	}

	static Integer[] getElement(int[][] mat, int row, int col) {
		List<Integer> list = new ArrayList<>();
		for (int i = col; i < mat[0].length; i++) {
			list.add(mat[--row][i]);
		}
		return list.stream().sorted().toArray(Integer[]::new);
	}

	static void putElement(int[][] mat, int row, int col, Integer[] an) {
		int x = 0;
		for (int i = col; i < mat[0].length; i++) {
			mat[--row][i] = an[x++];
		}
	}

	static Integer[] getElement(int[][] mat, int row) {
		List<Integer> list = new ArrayList<>();
		int col = 0;
		for (int i = row; i >= 0; i--) {
			list.add(mat[i][col++]);

		}
		return list.stream().sorted().toArray(Integer[]::new);
	}

	static void putElement(int[][] mat, int row, Integer[] an) {
		int col = 0;
		for (int i = row; i >= 0; i--) {
			mat[i][col] = an[col];
			col++;
		}
	}


	public static void main(String[] args) throws IOException {
		//SpringApplication.run(UserTimelineProjectApplication.class,args);
//		int [][]a = {{1, 3},{9, 5}};
//		int[][] temp = diagonalSort(a);
//		for(int[] arr:temp){
//			System.out.println(Arrays.toString(arr));
//		}
//		int a=8;
//		int res=0;
//		List<Integer> l = new ArrayList<Integer>(Arrays.asList(1,3,2,9,1));
//		for (int i = 0; i + 1 < l.size(); i++)
//		{
//			// adding the alternate numbers
//		if((l.get(i)+l.get(i+1)) <= a){
//			System.out.println("a");
//				continue;
//		}
//		else{
//			System.out.println("b");
//			res=Math.abs((l.get(i)+l.get(i+1))-a);
//			System.out.println("res"+res);
//		}
//		}
//
//
//		System.out.println(res);

		/*CSV TO JSON CONVERTER*/
		/*File input = new File("src/main/resources/input.csv");
		File output = new File("src/main/resources/output.json");
		File json = new File("src/main/resources/input.json");
		JsonNode node = new ObjectMapper().readTree(json);
		System.out.println(node.findValue("key").asText());

		String s = " ";
		CsvSchema csvSchema = CsvSchema.builder().setUseHeader(true).setColumnSeparator('|').build();
		CsvMapper csvMapper = new CsvMapper();

		// Read data from CSV file
		List<Object> readAll = csvMapper.readerFor(Map.class).with(csvSchema).readValues(input).readAll();

		ObjectMapper mapper = new ObjectMapper();

		// Write JSON formated data to output.json file
		mapper.writerWithDefaultPrettyPrinter().writeValue(output, readAll);

		// Write JSON formated data to stdout
		//System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(readAll));*/

		SpringApplication.run(UserTimelineProjectApplication.class,args);

	}

}
