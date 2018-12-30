# drools
Spring Boot Drools Sample Projects

I. DroolsHelloWorld<br>
  Sample drools program built on SpringBoot. 
  Important Files:
    1. resources/rules/apprules.drl
      The business rules file
    2. resources/META-INF/kmodule.xml
      The meta data file META-INF/kmodule.xml to create a named session ksession-rule. The ksession rule is applicable for all drl file contained in the pacakge rules.
      
      Testing - curl -kv localhost:8080/getmessage?msg=anand
      
