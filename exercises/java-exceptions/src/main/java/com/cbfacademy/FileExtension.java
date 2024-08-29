package com.cbfacademy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileExtension {
    public boolean check(String filename) throws FilenameException {
        if (filename == null || filename.isEmpty()) {
            throw new FilenameException("Filename cannot be null or empty");
        }
        return filename.endsWith(".java");
    }

    public Map<String, Integer> map(List<String> filenames) {
        Map<String, Integer> resultMap = new HashMap<>();

        for (String filename : filenames) {
            try { 
                if(filename == null) {
                    resultMap.put(null, -1);
                } else {
                    boolean isjavaFile = check(filename);
                    resultMap.put(filename, isjavaFile ? 1 : 0);
                }
            } catch (FilenameException e) {
                resultMap.put(filename, -1);
            }
        }
        return resultMap;
    }
    
}
