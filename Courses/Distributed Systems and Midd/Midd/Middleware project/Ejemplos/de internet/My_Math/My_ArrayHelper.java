package My_Math;


/**
* My_Math/My_ArrayHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.1"
* from Math.idl
* jeudi 22 ao�t 2002 19 h 49 CEST
*/

abstract public class My_ArrayHelper
{
  private static String  _id = "IDL:My_Math/My_Array:1.0";

  public static void insert (org.omg.CORBA.Any a, My_Math.My_Array that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static My_Math.My_Array extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [1];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_float);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_array_tc (My_Math.SIZE_MAX.value, _tcOf_members0 );
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_array_tc (My_Math.SIZE_MAX.value, _tcOf_members0 );
          _members0[0] = new org.omg.CORBA.StructMember (
            "bi_array",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (My_Math.My_ArrayHelper.id (), "My_Array", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static My_Math.My_Array read (org.omg.CORBA.portable.InputStream istream)
  {
    My_Math.My_Array value = new My_Math.My_Array ();
    value.bi_array = new float[My_Math.SIZE_MAX.value][];
    for (int _o0 = 0;_o0 < (My_Math.SIZE_MAX.value); ++_o0)
    {
      value.bi_array[_o0] = new float[My_Math.SIZE_MAX.value];
      for (int _o1 = 0;_o1 < (My_Math.SIZE_MAX.value); ++_o1)
      {
        value.bi_array[_o0][_o1] = istream.read_float ();
      }
    }
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, My_Math.My_Array value)
  {
    if (value.bi_array.length != (My_Math.SIZE_MAX.value))
      throw new org.omg.CORBA.MARSHAL (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    for (int _i0 = 0;_i0 < (My_Math.SIZE_MAX.value); ++_i0)
    {
      if (value.bi_array[_i0].length != (My_Math.SIZE_MAX.value))
        throw new org.omg.CORBA.MARSHAL (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
      for (int _i1 = 0;_i1 < (My_Math.SIZE_MAX.value); ++_i1)
      {
        ostream.write_float (value.bi_array[_i0][_i1]);
      }
    }
  }

}
