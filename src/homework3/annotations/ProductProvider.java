package homework3.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)

public @interface ProductProvider {

    String country() default "Belarus";
    int lifeTime() default 0;
    String[] parts() default {};
}
