package ch07;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class GetImage {

	public static void main(String[] args) {

		GetImage getImage = new GetImage();

		String strUrl = "https://previews.123rf.com/images/dionisvera/dionisvera1304/dionisvera130400046/19451482-%EC%9E%8E%EA%B3%BC-%EB%B9%A8%EA%B0%84-%EC%82%AC%EA%B3%BC.jpg"; // �ҷ��� URL

		try {

			getImage.saveImage(strUrl);

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

	private void saveImage(String strUrl) throws IOException {
		// �Ѳ����� ����Ʈ �ִ¹� shift + ctrl + o
		URL url = null;
		InputStream in = null;
		OutputStream out = null;

		try {

			url = new URL(strUrl);

			in = url.openStream();

			out = new FileOutputStream("C:/dev/test.jpg"); // ������

			while (true) {
				// �̹����� �о�´�.
				int data = in.read();
				if (data == -1) {
					break;
				}
				// �̹����� ����.
				out.write(data);

			}

			in.close();
			out.close();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}

		}
	}

}