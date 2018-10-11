package com.deloitte;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadValidateWriteFile {
	 Pattern pattern;
	 Matcher matcher;
	 String regex = "^(\\d{3}-?\\d{2}-?\\d{4})$";
	 	public ReadValidateWriteFile() {
		pattern = Pattern.compile(regex);
	}
		private boolean validate(String input) {
		matcher = pattern.matcher(input);
		return matcher.matches();
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        File f1 = new File("myfile.txt");
        File f2 = new File("myfile2.txt");
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        ReadValidateWriteFile rvw = new ReadValidateWriteFile();
        try {
			fr = new FileReader(f1);
			br = new BufferedReader(fr);
			fw = new FileWriter(f2,true);
			bw = new BufferedWriter(fw);
			String line = null;
			while((line = br.readLine())!=null) {
				boolean valid = rvw.validate(line);
				if(valid) {
					bw.write(line+" : Valid");
					bw.newLine();
				}
				else {
					bw.write(line+" : Invalid");
					bw.newLine();
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        finally {
        	try {
        		if(bw!=null)
        			bw.close();
        		if(br!=null)
        			br.close();
        	}
        	catch(IOException e) {}
        }
	}

}
