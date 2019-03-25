package ch.uzh.rack.nlp.Lemmatizer;

import java.util.List;

public interface IStopWordProvider {
	public boolean isStopWord(String word);
	public List<String> getStopWords();
}
