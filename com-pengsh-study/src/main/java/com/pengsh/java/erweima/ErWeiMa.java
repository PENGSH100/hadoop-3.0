package com.pengsh.java.erweima;

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

/**
 * @author pengsh
 * @Date: 2020/7/14 10:05
 */
public class ErWeiMa {

    public String decode(String filepath) throws IOException, NotFoundException {
        BufferedImage bufferedImage = ImageIO.read(new FileInputStream(filepath));
        LuminanceSource source = new BufferedImageLuminanceSource(bufferedImage);
        Binarizer binarizer = new HybridBinarizer(source);
        BinaryBitmap bitmap = new BinaryBitmap(binarizer);
        HashMap<DecodeHintType, Object> decodeHints = new HashMap<DecodeHintType, Object>();
        decodeHints.put(DecodeHintType.CHARACTER_SET, "UTF-8");
        Result result = new MultiFormatReader().decode(bitmap, decodeHints);
        return result.getText();
    }
    public void encode(String content, String filepath) throws WriterException, IOException {
        int width = 100;
        int height = 100;
        Map<EncodeHintType, Object> encodeHints = new HashMap<EncodeHintType, Object>();
        encodeHints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
        BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height, encodeHints);
        Path path = FileSystems.getDefault().getPath(filepath);
        MatrixToImageWriter.writeToPath(bitMatrix, "png", path);
    }
}


