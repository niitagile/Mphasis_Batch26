package com.download.example;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.*;


import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
public class MainController {
	@PostMapping(value = "/upload",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public String fileUpload(@RequestParam("fileinfo") MultipartFile file) {
		String result = "File was uploaded successfully";

		try {
			//get name of original file
			File convertFile = new File("E://temp/"+file.getOriginalFilename());
			//create a new empty file with same name
			convertFile.createNewFile();
			//open that file in write mode
			FileOutputStream fout = new FileOutputStream(convertFile);
			//get all contents from user file to server file
			fout.write(file.getBytes());
			fout.close();
		} catch (IOException iex) {
			result = "Error " + iex.getMessage();
		} 

		return result;
	}

	
	@GetMapping("/download")
	public ResponseEntity downloadFileFromLocal() {
		//Get file path
				Path path = Paths.get("E://temp/hello.txt");
				Resource resource = null;
				try {
					//put file in resource object
					resource = new UrlResource(path.toUri());
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
				//prepare packet-- header and body
				return ResponseEntity.ok()
						.contentType(MediaType.parseMediaType("application/text"))
						.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
						.body(resource);
			}

	}
	




























