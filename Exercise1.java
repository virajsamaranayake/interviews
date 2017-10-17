package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

Make immutable class need to do below steps
1. Declare the calss as final 
2. Make all fields private
3. Don't provide Setters 
4. Make all mutable fields final 
5. Initialize all the fields via constructor 
6. Perform cloning of Objects in the getter methods 

*/
public final class Exercise1 {

	public static class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person(Set<String> phoneNumbers,String firstName,String lastName ) {
			this.phoneNumbers = phoneNumbers;
			this.firstName = firstname;
			this.lastName = lastname;
		}

		public Set<String> getPhoneNumbers() {
			return (Set<String>)phoneNumbers.clone();
		}
		
		
		public String getFirstName() {
			return firstName.clone();
		}
		
		
		public String getLastName() {
			return lastName.clone();
		}
		
	}
}