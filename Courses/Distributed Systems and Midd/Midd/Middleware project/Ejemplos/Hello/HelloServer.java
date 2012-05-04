import HelloApp.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;
import org.omg.PortableServer.POA;

import java.util.Properties;

class HelloImpl extends HelloPOA {
  private ORB orb;

  public void setORB(ORB orb_val) {
    orb = orb_val; 
  }
    
  // implement sayHello() method
  public String sayHello() {
    return "\nHello bro! Rodry !!\n";
  }
    
  // implement shutdown() method
  public void shutdown() {
    orb.shutdown(false);
  }
}

// ***************************************************************

public class HelloServer {

  public static void main(String args[]) {
	  
	  try{
      // create and initialize the ORB
      ORB orb = ORB.init(args, null);

      // get reference to rootpoa & activate the POAManager
      POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
      rootpoa.the_POAManager().activate();

      // create servant and register it with the ORB
      HelloImpl helloImpl = new HelloImpl();
      helloImpl.setORB(orb); 

      //------------------------------------------------------
      // get object reference from the servant (related with Addressing)
      org.omg.CORBA.Object ref = rootpoa.servant_to_reference(helloImpl); //like a pointer but distributed
      Hello href = HelloHelper.narrow(ref); //make narrow casting the ref to they specific properties
      //------------------------------------------------------
      
      // get the root naming context
      org.omg.CORBA.Object objRef =
          orb.resolve_initial_references("NameService");
      // Use NamingContextExt which is part of the Interoperable
      // Naming Service (INS) specification.
      NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
      //------------------------------------------------------
      
      // bind the Object Reference in Naming
      String name = "Hello";
      NameComponent path[] = ncRef.to_name( name ); //NAME
      ncRef.rebind(path, href); //ADDRESS

      //------------------------------------------------------
      
      System.out.println("HelloServer ready and waiting ...");

      // wait for invocations from clients
      orb.run();
    } 
	
      catch (Exception e) {
        System.err.println("ERROR: " + e);
        e.printStackTrace(System.out);
      }
	  
      System.out.println("HelloServer Exiting ...");
	
  }
}