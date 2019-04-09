package org.omg.PortableServer;


/**
* org/omg/PortableServer/IdAssignmentPolicyValue.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/org/omg/PortableServer/poa.idl
* Friday, June 21, 2013 12:53:40 PM PDT
*/


/**
	 * The IdAssignmentPolicyValue can have the following
	 * values. USER_ID - Objects created with that POA are 
	 * assigned Object Ids only by the application. 
	 *  SYSTEM_ID - Objects created with that POA are 
	 * assigned Object Ids only by the POA. If the POA also 
	 * has the PERSISTENT policy, assigned Object Ids must 
	 * be unique across all instantiations of the same POA.
	 */
public class IdAssignmentPolicyValue implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 2;
  private static org.omg.PortableServer.IdAssignmentPolicyValue[] __array = new org.omg.PortableServer.IdAssignmentPolicyValue [__size];

  public static final int _USER_ID = 0;
  public static final org.omg.PortableServer.IdAssignmentPolicyValue USER_ID = new org.omg.PortableServer.IdAssignmentPolicyValue(_USER_ID);
  public static final int _SYSTEM_ID = 1;
  public static final org.omg.PortableServer.IdAssignmentPolicyValue SYSTEM_ID = new org.omg.PortableServer.IdAssignmentPolicyValue(_SYSTEM_ID);

  public int value ()
  {
    return __value;
  }

  public static org.omg.PortableServer.IdAssignmentPolicyValue from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected IdAssignmentPolicyValue (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class IdAssignmentPolicyValue
