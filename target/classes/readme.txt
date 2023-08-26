@Conditional or Conditional Interface:
•	Use for validate or verify some thing before loading your bean in the context
•	Heavily used in message driven, micro-service, event driven micro-service etc.
•	Let as say u want to control the loading of a bean in a specific environment.We can use @Profile for this. yes right.
•	But profile annotation is restrict to write condition checking based on predefined properties.@Conditionl does not have this restriction
•	With the help of conditional interface u can check a predefined property or define own logic.
•	condition on it.

