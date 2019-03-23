package ch.uzh.rack.Lemmatizer;

import java.util.List;

public class Example
{
    public static void main( String[] args )
    {
        String identifier = "getACarForEachCarOfCarsWhoAreRegistered";
        
        System.out.println("Running basic lemmatizer");
        ILemmatizer lemmatizer = new IdentifierLemmatizer();
        List<String> lemmas1 = lemmatizer.lemmatize(identifier);
        System.out.println(lemmas1);

        System.out.println("Running lemmatizer with duplicate removal");
        ILemmatizer lemmatizer2 = new IdentifierLemmatizer()
        								.enableDuplicateRemoval();
        List<String> lemmas2 = lemmatizer2.lemmatize(identifier);
        System.out.println(lemmas2);

        System.out.println("Running lemmatizer with stopword and duplicate removal");
        ILemmatizer lemmatizer3 = new IdentifierLemmatizer()
        								.enableDuplicateRemoval()
        								.enableStopWordRemoval();
        List<String> lemmas3 = lemmatizer3.lemmatize(identifier);
        System.out.println(lemmas3);
        
        System.out.println("Running lemmatizer with cautios stopword and duplicate removal");
        ILemmatizer lemmatizer4 = new IdentifierLemmatizer()
        								.enableDuplicateRemoval()
        								.enableStopWordRemoval()
        								.enableCautiosStopWordRemoval();
        List<String> lemmas4 = lemmatizer4.lemmatize(identifier);
        System.out.println(lemmas4);
    }

}
