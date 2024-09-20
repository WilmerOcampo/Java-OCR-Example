package com.wo.service;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OCRService {
    private final ITesseract tesseract;

    public OCRService() {
        this.tesseract = new Tesseract();
        tesseract.setDatapath("src/main/resources/tesseract/tessdata");
    }

    public String processImage(String imagePath, String outputPath) {
        try {
            // Perform OCR on the image
            String text = tesseract.doOCR(new File(imagePath));
            System.out.println("Extracted text: \n\n" + text);

            // Writes the text to the output file
            FileWriter fileWriter = new FileWriter(outputPath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(text);
            bufferedWriter.close();
            System.out.println("Text saved in: \n" + outputPath);
            return text;

        } catch (TesseractException | IOException e) {
            System.out.println("Error during OCR processing: " + e.getMessage() + ' ' + e);
            return null;
        }
    }
}
