package com.DI;

public class TextEditor {
	//dependency
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
