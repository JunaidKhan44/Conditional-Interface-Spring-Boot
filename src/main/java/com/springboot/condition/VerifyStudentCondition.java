/**
 * 
 */
package com.springboot.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author Junaid.Khan
 *
 */

public class VerifyStudentCondition implements Condition{

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		
		return "allow"
				.equalsIgnoreCase(context.getEnvironment().getProperty("api.student.generate.token"));
	}

	
	
}
