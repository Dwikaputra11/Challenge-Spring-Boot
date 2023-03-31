package com.challenge.chapter3.school_grade;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School implements Calculation{
    private final List<String> classesName;
    private final List<String> gradeByClass;
    private final Map<String, Integer> grades = new HashMap<>();

    public List<String> getGradeByClass() {
        return gradeByClass;
    }

    public School(List<String> classesName, List<String> gradeByClass) {
        this.classesName    = classesName;
        // sort grade to find modus and median
        gradeByClass        = sortAsNumbers(gradeByClass);
        this.gradeByClass   = gradeByClass;

        for(String i: gradeByClass){
            // penerapan exception
            try {
                grades.put(i, grades.get(i) + 1);
            }catch (NullPointerException e){
                grades.put(i, 1);
            }
        }
    }


    @Override
    public double getMean() {
        double value = 0.0;
        var count = gradeByClass.size();
        for(String i: gradeByClass){
            value += Double.parseDouble(i);
        }

        return value/count;
    }

    @Override
    public String getModus() {
        var maxVal = 0;
        var maxKey = "";
        for (Map.Entry<String,Integer> entry : grades.entrySet()) {
            if(maxVal < entry.getValue()){
                maxVal = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey + " (" + maxVal + ") V1";
    }

    public String getModusV2(){
        final int[] maxVal = {0};
        final String[] maxKey = {""};
        grades.forEach((key, value) -> {
            if(maxVal[0] < value){
                maxVal[0] = value;
                maxKey[0] = key;
            }
        });


        return maxKey[0] + " (" + maxVal[0] + ") V2";
    }

    @Override
    public String getMedian(){
        int mid = gradeByClass.size()/2;
        return gradeByClass.get(mid);
    }

    public String writeSchoolTxt(){
        StringBuilder str = new StringBuilder("Berikut Hasil Rekap Nilai Ujian Sekolah\n\n");

        str.append("Mean\t\t: ").append(getMean()).append("\n");
        str.append("Modus(n)\t: ").append(getModusV2()).append("\n");
        str.append("Median\t\t: ").append(getMedian()).append("\n\n");
        str.append("*n = banyak data\n\n");

        str.append("Sebaran Nilai Seluruh Siswa:\n");
        str.append("Nilai\t| Frekuensi\n");

        // penerapan java stream
        grades.forEach((key, value) ->{
            str.append(key).append("\t\t| ").append(value).append("\n");
        });

        str.append("\nDaftar nama kelas:\n");
        for(String name: classesName){
            str.append("- ").append(name).append("\n");
        }

        return str.toString();
    }
}
