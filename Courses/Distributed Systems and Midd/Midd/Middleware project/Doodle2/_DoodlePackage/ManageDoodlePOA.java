package _DoodlePackage;


/**
* _DoodlePackage/ManageDoodlePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Doodle.idl
* Saturday, April 14, 2012 4:19:04 PM CEST
*/


//----------------------------------------------
public abstract class ManageDoodlePOA extends org.omg.PortableServer.Servant
 implements _DoodlePackage.ManageDoodleOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("createDoodle", new java.lang.Integer (0));
    _methods.put ("voteDoodle", new java.lang.Integer (1));
    _methods.put ("getDoodle", new java.lang.Integer (2));
    _methods.put ("closeDoodle", new java.lang.Integer (3));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // _DoodlePackage/ManageDoodle/createDoodle
       {
         String nameDoodle = in.read_string ();
         _DoodlePackage.DoodleParticipant creatorDoodle = _DoodlePackage.DoodleParticipantHelper.read (in);
         _DoodlePackage.Doodle $result = null;
         $result = this.createDoodle (nameDoodle, creatorDoodle);
         out = $rh.createReply();
         _DoodlePackage.DoodleHelper.write (out, $result);
         break;
       }

       case 1:  // _DoodlePackage/ManageDoodle/voteDoodle
       {
         _DoodlePackage.Doodle doodle = _DoodlePackage.DoodleHelper.read (in);
         String dayhour = in.read_string ();
         _DoodlePackage.DoodleParticipant participant = _DoodlePackage.DoodleParticipantHelper.read (in);
         this.voteDoodle (doodle, dayhour, participant);
         out = $rh.createReply();
         break;
       }

       case 2:  // _DoodlePackage/ManageDoodle/getDoodle
       {
         String nameDoodle = in.read_string ();
         _DoodlePackage.Doodle $result = null;
         $result = this.getDoodle (nameDoodle);
         out = $rh.createReply();
         _DoodlePackage.DoodleHelper.write (out, $result);
         break;
       }

       case 3:  // _DoodlePackage/ManageDoodle/closeDoodle
       {
         _DoodlePackage.Doodle doodle = _DoodlePackage.DoodleHelper.read (in);
         String finalDayHour = in.read_string ();
         _DoodlePackage.DoodleParticipant creatorDoodle = _DoodlePackage.DoodleParticipantHelper.read (in);
         _DoodlePackage.Doodle $result = null;
         $result = this.closeDoodle (doodle, finalDayHour, creatorDoodle);
         out = $rh.createReply();
         _DoodlePackage.DoodleHelper.write (out, $result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:DoodlePackage/ManageDoodle:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public ManageDoodle _this() 
  {
    return ManageDoodleHelper.narrow(
    super._this_object());
  }

  public ManageDoodle _this(org.omg.CORBA.ORB orb) 
  {
    return ManageDoodleHelper.narrow(
    super._this_object(orb));
  }


} // class ManageDoodlePOA
