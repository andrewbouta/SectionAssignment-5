import acm.graphics.*;
import acm.program.*;



public class Week4ImageProcessing extends GraphicsProgram {
	
	public static final int FLIP_HORIZONTAL = -1;
	
	public void run() {
		GImage image = new GImage("Milkmaid.png");
		GImage image2 = new GImage("ImageProcessingTest.png");
		GImage flippedImage = createFlippedImage(image);
		GImage flippedImage2 = createFlippedImage(image2);
		
		image.scale(.75);
		add(image, 40, 50);
		
		flippedImage.scale(.75);
		add(flippedImage, 300, 50);
		
		image2.scale(.55);
		add(image2, 40, 320);
		
		flippedImage2.scale(.55);
		add(flippedImage2, 300, 320);
		
	}
		
		private GImage createFlippedImage(GImage image) {
			// gets copy of pixel array from image
			int[][] array = image.getPixelArray();
			
		    int height = array.length; // number of rows in a grid
			int width = array[0].length; // number of cols in a row
	
			
			// Iterates through the original image top-down
			// p1 is the index of the current row
			// p2 assigns it to the other side
			// Outer loop goes through array's rows, inner loop iterates through each element to split horizontally
			 for (int i = 0; i < height; i++) {
				 for (int p1 = 0; p1 < (width / 2); p1++) {
						int p2 = width - p1 - 1;
						// sets 'temp' to a the new array to swap the values; temp is used to keep data
						// temp = rows and columns of the left side;
						int temp = array[i][p1];
						// assigns the values of the second rows and cols to the first
						array[i][p1] = array[i][p2];
						// takes the first value out of the temporary storage, assigns it to the new rows and cols
						array[i][p2] = temp;
						
				 }
			}
			 

			/*  // for vertical flip
			for (int p1 = 0; p1 < height / 2; p1++) {
				int p2 = height - p1 - 1;
				
				int[] temp = array[p1];
				array[p1] = array[p2];
				array[p2] = temp;
			}
			*/
			return new GImage (array);		
	}
		
		
}
