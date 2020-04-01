package src.main.execute;
import src.main.model.RenamePhotoCriteria;
import src.main.service.PhotoService;

public class RenamePhotos {
	public static PhotoService photoService = PhotoService.getInstance();
	
	/**
	 * rename the photo's file name to specified format
	 * target is photo or all photos in a folder, inside folder...
	 * ex) yyyyMMdd-HHmmss-0001-originName.jpg (taken date)
	 */
	public static void main(String[] args) {
		// photo file or directory path
//		String source = "C:\\Users\\ycrpa\\Downloads\\test";
//		String source = "C:\\Users\\ycrpa\\GoogleDrive\\사진\\20200326-091849.272-IMG_36401.JPG";
		String source = "C:\\Users\\ycrpa\\Downloads\\test\\20191016_155250.010_00001_00000.CR2";
		
		RenamePhotoCriteria criteria = new RenamePhotoCriteria();
		criteria.setAutoSequence(true);
//		criteria.setNumbering(true);
//		criteria.setAppendOriginal(true);
		photoService.renamePhotos(source, criteria);
	}
}
