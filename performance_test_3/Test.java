import com.solbox.delivery.secure.Encryption;

public class Test {
	//static int i=0;	
public static void main(String[] args)  {
          int i=0;
		while (i<1000000) {
          Encryption.urlEncorder("a/b/c/e/d/f/d/e/f/e/file.mp4" , "aaaa", 3600, 0, false);
		  i++;
		}
	}
}

