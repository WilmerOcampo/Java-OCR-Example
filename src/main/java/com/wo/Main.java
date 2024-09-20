package com.wo;

import com.wo.service.OCRService;

public class Main {
    public static void main(String[] args) {
        // Option 1 (Recommended): using a service
        OCRService ocrService = new OCRService();
        String imagePath = "D:\\Tess4j\\example1.png"; // Image path
        String outputPath = "D:\\Tess4j\\example.txt"; // Exit route

        String text = ocrService.processImage(imagePath, outputPath); // Process the image

        if (text != null) {
            System.out.println("OCR completed successfully.");
        } else {
            System.out.println("The OCR process failed.");
        }

        // Option 2: all inside in the main
        /*ITesseract tesseract = new Tesseract();
        try {
            // If Tesseract-OCR would be installed in the path: D:\\Tesseract-OCR\\tessdata
            //tesseract.setDatapath("D:\\Tesseract-OCR\\tessdata");

            tesseract.setDatapath("src/main/resources/tesseract/tessdata");

            String text = tesseract.doOCR(new File("D:\\Tess4j\\example1.png"));
            System.out.println("Extracted text:\n\n" + text);

            FileWriter fileWriter = new FileWriter("D:\\Tess4j\\example.txt");

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(text);
            bufferedWriter.close();
            System.out.println("Text saved!");
        } catch (TesseractException | IOException e) {
            System.out.println("Error during OCR processing: " + e.getMessage() + ' ' + e);
        }*/
    }
}