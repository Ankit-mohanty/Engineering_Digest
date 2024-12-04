package com.edigest.journalApp.controller;

import com.edigest.journalApp.entity.JournalEntry;
import com.edigest.journalApp.service.JournalEntryService;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/journal")

public class JournalEntryControllerV2 {
	     @Autowired
	private JournalEntryService journalEntryService;

	@PostMapping
	public boolean createEntry(
			@RequestBody JournalEntry journalEntry
	                          ) {
		journalEntry.setDate(LocalDateTime.now());
		journalEntryService.createContent(journalEntry);
		return true;
	}

	@GetMapping
public  List<JournalEntry> allData(){
		return journalEntryService.getAll();
	}
	
}
/*
 * Methods inside the class should be public so that they can access and invoked ny spring framework or external http request.
 * */