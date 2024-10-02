package JavaCustomAnnoations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// specification for validation
@Target({ElementType.TYPE, ElementType.METHOD})

// runtime tells java to keep this annotation running for it to be visible to other parts of the program


// only matter before code even compiles
//@Retention(RetentionPolicy.SOURCE)

@Retention(RetentionPolicy.RUNTIME)
public @interface VeryImportant {
}
