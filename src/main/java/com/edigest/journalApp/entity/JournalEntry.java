package com.edigest.journalApp.entity;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;


@Document(collation = "journalentry")
//@FieldDefaults(level = AccessLevel.PRIVATE)
public class JournalEntry {

	@Id
	private String id;
	private String title;
	private String content;
	private LocalDateTime date;

	public JournalEntry( String id, String title, String content, LocalDateTime date ) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public JournalEntry setId( String id ) {
		this.id = id;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public JournalEntry setTitle( String title ) {
		this.title = title;
		return this;
	}

	public String getContent() {
		return content;
	}

	public JournalEntry setContent( String content ) {
		this.content = content;
		return this;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public JournalEntry setDate( LocalDateTime date ) {
		this.date = date;
		return this;
	}
}
