package com.bebektakvimi.ahmetmatematikci.mvcpatternkullanimi;

import android.content.Context;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Created by a on 18.04.2017.
 */

public class FileUtil {

    private Context _context;

    public FileUtil(Context context) {
       _context = context;
    }

    public void Write(String s) throws FileNotFoundException, IOException {

        try {
            File dir = _context.getDir("Veri", Context.MODE_PRIVATE);
            File file = new File(dir, "Ziyaret.txt");
            FileOutputStream fos = new FileOutputStream(file);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            osw.write(s);
            osw.close();
            fos.close();
        }catch (FileNotFoundException e) {
            throw  e;
        } catch (IOException e) {
            throw  e;
        }

    }
}
