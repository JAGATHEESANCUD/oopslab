Experiment 11 - Student Management (JavaFX + JDBC + MySQL)

This one needs two things installed that a plain JDK doesn't include:
  1. JavaFX SDK
  2. MySQL Connector/J (the JDBC driver jar)

I could not compile or run this in this sandbox (no JavaFX/MySQL here),
so double check it on your own machine before your viva. The code itself
is a straight, cleaned-up copy of your printout.

Setup:
  1. Run setup.sql in MySQL first (creates the studentdb database and
     students table).
  2. Update the DriverManager.getConnection(...) call in
     StudentManagementApp.java if your MySQL username/password differ
     from root/1234.

Compile (adjust the paths to wherever you installed JavaFX and the
MySQL connector):

  javac --module-path "C:\Program Files\Java\openjfx-22.0.1_windows-x64_bin-sdk\javafx-sdk-22.0.1\lib" --add-modules javafx.controls,javafx.fxml StudentManagementApp.java

Run:

  java --module-path "C:\Program Files\Java\openjfx-22.0.1_windows-x64_bin-sdk\javafx-sdk-22.0.1\lib;C:\Program Files\Java\mysql-connector-j-8.4.0\mysql-connector-j-8.4.0.jar" --add-modules javafx.controls,javafx.fxml -cp ".;C:\Program Files\Java\mysql-connector-j-8.4.0\mysql-connector-j-8.4.0.jar" StudentManagementApp
