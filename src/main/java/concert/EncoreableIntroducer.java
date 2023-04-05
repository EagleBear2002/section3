package concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EncoreableIntroducer {
	@DeclareParents(value = "concert.Performance+",//后面的+表示应用到所有实现了该接口的Bean
			defaultImpl = DefaultEncoreable.class)
	public static Encoreable encoreable;
}