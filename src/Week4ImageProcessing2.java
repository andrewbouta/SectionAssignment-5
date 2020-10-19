import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
/*
public class Week4ImageProcessing2 {
	public static void main(String args[]) throws IOException {
		
		BufferedImage buff = null;
		
		// File object
		File f = null;
		
		// read source image file
		try {
			f = new File("Milkmaid.PNG");
			buff = ImageIO.read(f);
		} catch (IOException e) {
			System.out.println("!!!" + e);
		}
		
		// get source image dimension
		int w = buff.getWidth();
		int h = buff.getHeight();
		
		// mirror image
		BufferedImage mirror = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
		
		// Creates mirror by pixels
	
		for(int i = 0; i < h; i++) {
			for(int p1 = 0, p2 = w - 1; p1 < w; p1++, p2--) {
				
				int pix = buff.getRGB(p1, i);
				
				// set mirrored image pixel value 
				mirror.setRGB(p1, p1, pix);
				mirror.setRGB(p2, p1, pix);
				
			}
		}
		return new ;
	}
}
*/
