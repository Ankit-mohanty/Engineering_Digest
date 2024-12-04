package com.edigest.journalApp.controller;

import com.edigest.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/_journal")
public class JournalEntryController {

	private Map<String, JournalEntry> journalEntries = new HashMap<>();

	@PostMapping
	public boolean createEntry(
			@RequestBody JournalEntry journalEntry
	                          ) {
		journalEntry.setDate(LocalDateTime.now());
		journalEntries.put(journalEntry.getId(), journalEntry);
		return true;
	}

	@GetMapping("/get")
	public List<JournalEntry> getAll() {
		return new ArrayList<>(journalEntries.values());
	}

	@GetMapping("/id/{myId}")
	public JournalEntry getElementById(
			@PathVariable ObjectId myId
	                                  ) {
		return journalEntries.get(myId);
	}

	@DeleteMapping("/id/{myId}")
	public JournalEntry deleteElementById(
			@PathVariable ObjectId myId
	                                     ) {
		return journalEntries.remove(myId);
	}

	@PutMapping("/id/{myId}")
	public JournalEntry updateElementByID(
			@PathVariable String myId,
			@RequestBody JournalEntry journalEntry
	                                     ) {
		return journalEntries.put(myId, journalEntry);
	}
}
/*
 * Methods inside the class should be public so that they can access and invoked ny spring framework or external http request.
 * */