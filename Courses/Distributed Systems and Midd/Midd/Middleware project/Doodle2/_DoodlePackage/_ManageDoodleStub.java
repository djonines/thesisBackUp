package _DoodlePackage;


/**
* _DoodlePackage/_ManageDoodleStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Doodle.idl
* Saturday, April 14, 2012 4:19:04 PM CEST
*/


//----------------------------------------------
public class _ManageDoodleStub extends org.omg.CORBA.portable.ObjectImpl implements _DoodlePackage.ManageDoodle
{

  public _DoodlePackage.Doodle createDoodle (String nameDoodle, _DoodlePackage.DoodleParticipant creatorDoodle)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("createDoodle", true);
                $out.write_string (nameDoodle);
                _DoodlePackage.DoodleParticipantHelper.write ($out, creatorDoodle);
                $in = _invoke ($out);
                _DoodlePackage.Doodle $result = _DoodlePackage.DoodleHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return createDoodle (nameDoodle, creatorDoodle        );
            } finally {
                _releaseReply ($in);
            }
  } // createDoodle

  public void voteDoodle (_DoodlePackage.Doodle doodle, String dayhour, _DoodlePackage.DoodleParticipant participant)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("voteDoodle", true);
                _DoodlePackage.DoodleHelper.write ($out, doodle);
                $out.write_string (dayhour);
                _DoodlePackage.DoodleParticipantHelper.write ($out, participant);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                voteDoodle (doodle, dayhour, participant        );
            } finally {
                _releaseReply ($in);
            }
  } // voteDoodle

  public _DoodlePackage.Doodle getDoodle (String nameDoodle)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getDoodle", true);
                $out.write_string (nameDoodle);
                $in = _invoke ($out);
                _DoodlePackage.Doodle $result = _DoodlePackage.DoodleHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getDoodle (nameDoodle        );
            } finally {
                _releaseReply ($in);
            }
  } // getDoodle

  public _DoodlePackage.Doodle closeDoodle (_DoodlePackage.Doodle doodle, String finalDayHour, _DoodlePackage.DoodleParticipant creatorDoodle)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("closeDoodle", true);
                _DoodlePackage.DoodleHelper.write ($out, doodle);
                $out.write_string (finalDayHour);
                _DoodlePackage.DoodleParticipantHelper.write ($out, creatorDoodle);
                $in = _invoke ($out);
                _DoodlePackage.Doodle $result = _DoodlePackage.DoodleHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return closeDoodle (doodle, finalDayHour, creatorDoodle        );
            } finally {
                _releaseReply ($in);
            }
  } // closeDoodle

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:DoodlePackage/ManageDoodle:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _ManageDoodleStub