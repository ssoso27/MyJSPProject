package day05.temp;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface PrintStars {
}

// javac -d C:\a\ PrintStars.java