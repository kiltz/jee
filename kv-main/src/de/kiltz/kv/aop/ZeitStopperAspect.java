package de.kiltz.kv.aop;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class ZeitStopperAspect {

	@AroundInvoke
	public Object info(InvocationContext ctx) throws Exception
	{
		long start = System.nanoTime();
		// Die eigentliche Ausführung
		Object o = ctx.proceed();
		long zeit = System.nanoTime() - start;
		System.out.printf("Rückgabe der Methode: %s ", o);
		System.out.println();
		System.out.printf("Vor Ausführung von %s benötigte %,d ns. ", ctx.getMethod().getName(), zeit);
		System.out.println();

		return o;
	}

}
