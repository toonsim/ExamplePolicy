# ExamplePolicy
Example policy for the policy verifier extension of ZAP


# How to create your own Policy Rules
1. Download the JAR you can find here: 
2. Create a new JAVA project and add the JAR as a dependency in your builder of choice, in the example project we use Gradle.
3. In your default (!) package create a policy rule class which extends _org.zaproxy.zap.extension.policyrulescanner.PolicyRule_
4. Create a constructor which takes a string argument:
	```Java
	public CookieAttributeRule(String policyName) {
	    	super(policyName);
	}
	```
5. Create a method isFlaggedBy which takes a _org.parosproxy.paros.network.HttpMessage_ argument 
	```Java
	public boolean isFlaggedBy(HttpMessage msg) {
	    return false; //change this for your rule
	}
	```
	 You can change this method according to your desired rule functionality. The rules in the example project at … will give you an idea of which kind of rules you could design.
6. Build a jar with your builder of choice. Be sure that only the rules are in the default package and that the content of our ZAP JAR is not present in your JAR.
7. Start up our ZAP, go to Options -> Policy Jar Loader -> Add.. -> navigate to your built JAR.
8. You can now check on violated rules at Options -> Flagged Rule Report
