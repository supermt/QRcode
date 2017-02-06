package edu.uestc.MSStudio.TDC;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import net.glxn.qrgen.QRCode;

public class Application {

	public static void main(String[] args) throws Exception {
		// 生成一个二维码流
		ByteArrayOutputStream stream = QRCode.from("雷猴").stream();
		File out = new File("/code/test.png");
		if (!out.exists()) {
			try {
				out.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		FileOutputStream fos = new FileOutputStream(out);
		
		stream.writeTo(fos);
		
		System.out.print(out.toPath());
		
	}

}
