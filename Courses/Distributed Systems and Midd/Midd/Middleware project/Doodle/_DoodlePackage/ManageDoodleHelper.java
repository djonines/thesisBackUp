package _DoodlePackage;


/**
* _DoodlePackage/ManageDoodleHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Doodle.idl
* Saturday, April 14, 2012 4:19:04 PM CEST
*/


//----------------------------------------------
abstract public class ManageDoodleHelper
{
  private static String  _id = "IDL:DoodlePackage/ManageDoodle:1.0";

  public static void insert (org.omg.CORBA.Any a, _DoodlePackage.ManageDoodle that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static _DoodlePackage.ManageDoodle extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (_DoodlePackage.ManageDoodleHelper.id (), "ManageDoodle");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static _DoodlePackage.ManageDoodle read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_ManageDoodleStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, _DoodlePackage.ManageDoodle value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static _DoodlePackage.ManageDoodle narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof _DoodlePackage.ManageDoodle)
      return (_DoodlePackage.ManageDoodle)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _DoodlePackage._ManageDoodleStub stub = new _DoodlePackage._ManageDoodleStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static _DoodlePackage.ManageDoodle unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof _DoodlePackage.ManageDoodle)
      return (_DoodlePackage.ManageDoodle)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _DoodlePackage._ManageDoodleStub stub = new _DoodlePackage._ManageDoodleStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
