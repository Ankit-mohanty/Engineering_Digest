package com.edigest.journalApp.service;

import com.edigest.journalApp.entity.JournalEntry;
import com.edigest.journalApp.repository.JournalEntryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
//@RequiredArgsConstructor
public class JournalEntryService {
	@Autowired
	private JournalEntryRepo journalEntryRepo;

	public void createContent( JournalEntry journalEntry ) {
		 journalEntryRepo.save(journalEntry);
	}

	public List<JournalEntry> getAll() {
		return journalEntryRepo.findAll();
	}

//	public JournalEntry updateById( String id, JournalEntry journalEntry ) {
//		Optional<JournalEntry> old = getDataById(id);
//		return journalEntryRepo.save(journalEntry);
//	}
//
//	public Optional<JournalEntry> getDataById( String id ) {
//		return Optional.ofNullable(journalEntryRepo.findById(id).orElse(null));
//	}
//
//	public String deleteDataById( String id ) {
//		journalEntryRepo.deleteById(id);
//		return "Deleted SuccessFully";
//	}

}
