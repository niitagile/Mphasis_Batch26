package com.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TextEditor {
	//dependency
	@Autowired
	private SpellChecker spellchecker;
	
	
	public SpellChecker getSpellchecker() {
		return spellchecker;
	}

	public void setSpellchecker(SpellChecker spellchecker) {
		this.spellchecker = spellchecker;
	}

	public TextEditor() {
		System.out.println("TextEditor Constructor");
	}
	
	public void spellcheck() {
		spellchecker.checkSpelling();
	}
	

}
