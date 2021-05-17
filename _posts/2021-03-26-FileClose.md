---
layout:     post
title:      "FileClose"
subtitle:   " \"Java Stuty\""
date:       2021-03-26 12:00
author:     "Chungman"
catalog: true
tags:
    - Java_Study
    - Lecture15(0326)
---

# FileIO 예제
# FileClose
```
package Java0326.Lecture15.FileIO;

import java.io.InputStream;
import java.io.OutputStream;

public class FileClose {

	public static void close(InputStream is) {
		if(is != null) {
			try {
				is.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void close(OutputStream os) {
		if(os != null) {
			try {
				os.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(InputStream bis, InputStream is) {
		FileClose.close(bis);
		FileClose.close(is);
	}
	
	public static void close(OutputStream bos, OutputStream os) {
		FileClose.close(bos);
		FileClose.close(os);
	}
}
```
