//**********************************************************************
//
// IBM Confidential OCO Source Material
// 5639-D57 (C) COPYRIGHT International Business Machines Corp. 2002
// The source code for this program is not published or otherwise divested
// of its trade secrets, irrespective of what has been deposited with the
// U.S. Copyright Office.
//
// Author: Michael J. Morton
//
//**********************************************************************
package com.ibm.defaultapplication;

import java.rmi.RemoteException;
import javax.ejb.EJBObject;

public interface Increment extends EJBObject
{
  public int increment() throws RemoteException;
  public int getTheValue() throws RemoteException;
}
