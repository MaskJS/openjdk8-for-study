package org.omg.PortableServer;


/**
* org/omg/PortableServer/ImplicitActivationPolicyOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /build/openjdk-8-wnL82d/openjdk-8-8u171-b11/src/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Friday, April 27, 2018 5:19:47 PM UTC
*/


/**
	 * This policy specifies whether implicit activation 
	 * of servants is supported in the created POA.
	 */
public interface ImplicitActivationPolicyOperations  extends org.omg.CORBA.PolicyOperations
{

  /**
  	 * specifies the policy value
  	 */
  org.omg.PortableServer.ImplicitActivationPolicyValue value ();
} // interface ImplicitActivationPolicyOperations