package com.ats.tests;

import java.util.List;

import com.ats.utils.JsonParserUtil;
import com.ats.utils.StructureValidationUtil;

public class ValidateTwoJsonStructures {

	public static void main(String[] args) {
		
		String expectedFilePath = System.getProperty("user.dir")+"/src/test/resources/expectedJsonStructure.json";
		String actualFilePath = System.getProperty("user.dir")+"/src/test/resources/actualJsonStructure.json";
		String expectedJson = JsonParserUtil.getJsonFromFile(expectedFilePath);
		String actualJson  = JsonParserUtil.getJsonFromFile(actualFilePath);

		List<String> resultOnStructureList = StructureValidationUtil.validateJsonStructure(actualJson, expectedJson);
		
		StructureValidationUtil.getResultOfStructureValidation(resultOnStructureList);

	}

}
