import java.lang.annotation.Repeatable;

@Repeatable(Risks.class)
public @interface Risk{
public int level() default 1;
public String danger();
}
