package ch.uzh.rack.Lemmatizer;

import java.util.List;

public class Example
{
    public static void main( String[] args )
    {
        String identifier = "getACarOrMultipleCarsForEachAccount";
        ILemmatizer lemmatizer = new IdentifierLemmatizer();
        List<String> lemmas;
        
        System.out.println("Running basic lemmatizer");
        lemmas = lemmatizer.lemmatize(identifier);
        System.out.println(lemmas);

        System.out.println("Running lemmatizer with duplicate removal");
        lemmatizer = new IdentifierLemmatizer()
                         .enableDuplicateRemoval();
        
        lemmas = lemmatizer.lemmatize(identifier);
        System.out.println(lemmas);

        System.out.println("Running lemmatizer with stopword and duplicate removal");
        lemmatizer = new IdentifierLemmatizer()
                         .enableDuplicateRemoval()
                         .enableStopWordRemoval();
        
        lemmas = lemmatizer.lemmatize(identifier);
        System.out.println(lemmas);
        
        System.out.println("Running lemmatizer with cautios stopword and duplicate removal");
        lemmatizer = new IdentifierLemmatizer()
                         .enableDuplicateRemoval()
                         .enableStopWordRemoval()
                         .enableCautiosStopWordRemoval();
        
        lemmas = lemmatizer.lemmatize(identifier);
        System.out.println(lemmas);
    }

}
