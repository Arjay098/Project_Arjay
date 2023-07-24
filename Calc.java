/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
class Calc extends GradeCalculating {

    public Double enter(String a, String b, String c, String d, String e) {
        GradeCalculating grade = new GradeCalculating();
        String CalculusScore, PhysicsScore, ComputerProgScore, ContemporaryWorldScore, MMWScore;
        double average;
        double gpa = 0;

        CalculusScore = a;

        PhysicsScore = b;
        ComputerProgScore = c;
        ContemporaryWorldScore = d;
        MMWScore = e;

        double Calculus = Double.parseDouble(CalculusScore);
        double Physics = Double.parseDouble(PhysicsScore);
        double ComputerProg = Double.parseDouble(ComputerProgScore);
        double ContemporaryWorld = Double.parseDouble(ContemporaryWorldScore);
        double MMW = Double.parseDouble(MMWScore);

        average = ((Calculus + Physics + ComputerProg + ContemporaryWorld + MMW) / 5);

        return average;
    }

    public Double cal(String a) {
        GradeCalculating grade = new GradeCalculating();
        String CalculusScore;
        CalculusScore = a;
        double gpa = 0;
        double Calculus = Double.parseDouble(CalculusScore);

        if (Calculus >= 90) {
            grade.CalGrade.setText("A");
            gpa = gpa + 1.0;
        } else if (Calculus >= 80 && Calculus < 90) {
            grade.CalGrade.setText("B");
            gpa = gpa + 2.0;
        } else if (Calculus >= 70 && Calculus < 80) {
            grade.CalGrade.setText("C");
            gpa = gpa + 3.0;
        } else if (Calculus >= 60 && Calculus < 70) {
            grade.CalGrade.setText("D");
            gpa = gpa + 4.0;
        } else {
            grade.CalGrade.setText("F");
            gpa = gpa + 0;
        }
        return gpa;
    }

    public String cal2(String a) {
        GradeCalculating grade = new GradeCalculating();
        String CalculusScore;
        CalculusScore = a;
        double gpa = 0;
        String letter;
        double Calculus = Double.parseDouble(CalculusScore);

        if (Calculus >= 90) {
            letter = "A";
            gpa = gpa + 1.0;
        } else if (Calculus >= 80 && Calculus < 90) {
            letter = "B";

            grade.CalGrade.setText("B");
            gpa = gpa + 2.0;
        } else if (Calculus >= 70 && Calculus < 80) {
            letter = "C";

            grade.CalGrade.setText("C");
            gpa = gpa + 3.0;
        } else if (Calculus >= 60 && Calculus < 70) {
            grade.CalGrade.setText("D");
            letter = "D";

            gpa = gpa + 4.0;
        } else {
            grade.CalGrade.setText("F");
            letter = "E";

            gpa = gpa + 0;
        }
        return letter;
    }

    public Double phy(String a) {
        GradeCalculating grade = new GradeCalculating();
        String PhysicsScore;
        PhysicsScore = a;
        double gpa = 0;
        double Physics = Double.parseDouble(PhysicsScore);
        if (Physics >= 90) {
            grade.PhysGrade.setText("A");
            gpa = gpa + 1.0;
        } else if (Physics >= 80 && Physics < 90) {
            grade.PhysGrade.setText("B");
            gpa = gpa + 2.0;
        } else if (Physics >= 70 && Physics < 80) {
            grade.PhysGrade.setText("C");
            gpa = gpa + 3.0;
        } else if (Physics >= 60 && Physics < 70) {
            grade.PhysGrade.setText("D");
            gpa = gpa + 4.0;
        } else {
            grade.PhysGrade.setText("F");
            gpa = gpa + 0;

        }
        return gpa;
    }

    public String phy2(String a) {
        GradeCalculating grade = new GradeCalculating();
        String PhysicsScore;
        PhysicsScore = a;
        double gpa = 0;
        String letter;
        double Physics = Double.parseDouble(PhysicsScore);

        if (Physics >= 90) {
            letter = "A";
            gpa = gpa + 1.0;
        } else if (Physics >= 80 && Physics < 90) {
            letter = "B";

            grade.CalGrade.setText("B");
            gpa = gpa + 2.0;
        } else if (Physics >= 70 && Physics < 80) {
            letter = "C";

            gpa = gpa + 3.0;
        } else if (Physics >= 60 && Physics < 70) {
            grade.CalGrade.setText("D");
            letter = "D";

            gpa = gpa + 4.0;
        } else {
            grade.CalGrade.setText("F");
            letter = "E";

            gpa = gpa + 0;
        }
        return letter;
    }

    public Double prog(String a) {
        GradeCalculating grade = new GradeCalculating();
        String ComputerProgScore;
        ComputerProgScore = a;
        double gpa = 0;
        double ComputerProg = Double.parseDouble(ComputerProgScore);

        if (ComputerProg >= 90) {
            grade.CompGrade.setText("A");
            gpa = gpa + 1.0;
        } else if (ComputerProg >= 80 && ComputerProg < 90) {
            grade.CompGrade.setText("B");
            gpa = gpa + 2.0;
        } else if (ComputerProg >= 70 && ComputerProg < 80) {
            grade.CompGrade.setText("C");
            gpa = gpa + 3.0;
        } else if (ComputerProg >= 60 && ComputerProg < 70) {
            grade.CompGrade.setText("D");
            gpa = gpa + 4.0;
        } else {
            grade.CompGrade.setText("F");
            gpa = gpa + 0;

        }
        return gpa;
    }

    public String prog2(String a) {
        GradeCalculating grade = new GradeCalculating();
        String ComputerProgScore;
        ComputerProgScore = a;
        double gpa = 0;
        String letter;
        double ComputerProg = Double.parseDouble(ComputerProgScore);

        if (ComputerProg >= 90) {
            letter = "A";
            gpa = gpa + 1.0;
        } else if (ComputerProg >= 80 && ComputerProg < 90) {
            letter = "B";

            grade.CalGrade.setText("B");
            gpa = gpa + 2.0;
        } else if (ComputerProg >= 70 && ComputerProg < 80) {
            letter = "C";

            gpa = gpa + 3.0;
        } else if (ComputerProg >= 60 && ComputerProg < 70) {
            grade.CalGrade.setText("D");
            letter = "D";

            gpa = gpa + 4.0;
        } else {
            grade.CalGrade.setText("F");
            letter = "E";

            gpa = gpa + 0;
        }
        return letter;
    }

    public Double con(String a) {
        GradeCalculating grade = new GradeCalculating();
        String ContemporaryWorldScore;
        ContemporaryWorldScore = a;
        double gpa = 0;
        double ContemporaryWorld = Double.parseDouble(ContemporaryWorldScore);
        if (ContemporaryWorld >= 90) {
            grade.ContempGrade.setText("A");
            gpa = gpa + 1.0;
        } else if (ContemporaryWorld >= 80 && ContemporaryWorld < 90) {
            grade.ContempGrade.setText("B");
            gpa = gpa + 2.0;
        } else if (ContemporaryWorld >= 70 && ContemporaryWorld < 80) {
            grade.ContempGrade.setText("C");
            gpa = gpa + 3.0;
        } else if (ContemporaryWorld >= 60 && ContemporaryWorld < 70) {
            grade.ContempGrade.setText("D");
            gpa = gpa + 4.0;
        } else {
            grade.ContempGrade.setText("F");
            gpa = gpa + 0;

        }
        return gpa;
    }

    public String con2(String a) {
        GradeCalculating grade = new GradeCalculating();
        String ContemporaryWorldScore;
        ContemporaryWorldScore = a;
        double gpa = 0;
        String letter;
        double ContemporaryWorld = Double.parseDouble(ContemporaryWorldScore);

        if (ContemporaryWorld >= 90) {
            letter = "A";
            gpa = gpa + 1.0;
        } else if (ContemporaryWorld >= 80 && ContemporaryWorld < 90) {
            letter = "B";

            grade.CalGrade.setText("B");
            gpa = gpa + 2.0;
        } else if (ContemporaryWorld >= 70 && ContemporaryWorld < 80) {
            letter = "C";

            gpa = gpa + 3.0;
        } else if (ContemporaryWorld >= 60 && ContemporaryWorld < 70) {
            grade.CalGrade.setText("D");
            letter = "D";

            gpa = gpa + 4.0;
        } else {
            grade.CalGrade.setText("F");
            letter = "E";

            gpa = gpa + 0;
        }
        return letter;
    }

    public Double mmw(String a) {
        GradeCalculating grade = new GradeCalculating();
        String MMWScore;
        MMWScore = a;
        double gpa = 0;
        double MMW = Double.parseDouble(MMWScore);
        if (MMW >= 90) {
            grade.MMWGrade.setText("A");
            gpa = gpa + 1.0;
        } else if (MMW >= 80 && MMW < 90) {
            grade.MMWGrade.setText("B");
            gpa = gpa + 2.0;
        } else if (MMW >= 70 && MMW < 80) {
            grade.MMWGrade.setText("C");
            gpa = gpa + 3.0;
        } else if (MMW >= 60 && MMW < 70) {
            grade.MMWGrade.setText("D");
            gpa = gpa + 4.0;
        } else {
            grade.MMWGrade.setText("F");
            gpa = gpa + 0;

        }
        return gpa;
    }

    public String mmw2(String a) {
        GradeCalculating grade = new GradeCalculating();
        String MMWScore;
        MMWScore = a;
        double gpa = 0;
        String letter;
        double MMW = Double.parseDouble(MMWScore);

        if (MMW >= 90) {
            letter = "A";
            gpa = gpa + 1.0;
        } else if (MMW >= 80 && MMW < 90) {
            letter = "B";

            grade.CalGrade.setText("B");
            gpa = gpa + 2.0;
        } else if (MMW >= 70 && MMW < 80) {
            letter = "C";

            gpa = gpa + 3.0;
        } else if (MMW >= 60 && MMW < 70) {
            grade.CalGrade.setText("D");
            letter = "D";

            gpa = gpa + 4.0;
        } else {
            grade.CalGrade.setText("F");
            letter = "E";

            gpa = gpa + 0;
        }
        return letter;
    }
}
