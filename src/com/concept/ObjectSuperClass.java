package com.concept;

/*
 * What is super class in java, java.lang.Object
 * 
 * // Default behavior of toString() is to print class name, then
// @, then unsigned hexadecimal representation of the hash code
// of the object
public String toString()
{
    return getClass().getName() + "@" + Integer.toHexString(hashCode());
}
 * 
 * 
 * 
 */
public class ObjectSuperClass {

	public static void main(String[] args) {
		
		ObjectSuperClass objSu = new ObjectSuperClass();
		
		System.out.println(objSu);
		System.out.println(objSu.toString());
		
		System.out.println(objSu.getClass());
		

	}

}
