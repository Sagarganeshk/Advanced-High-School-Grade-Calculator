# 🎓 Advanced High School Grade Calculator – Java Console App

A dynamic and beginner-friendly Java console application for high school students to calculate subject-wise marks, GPA, and grades with proper validation and pass/fail reporting.

Built using Java, this project is great for learning input handling, conditional logic, arrays, and console formatting.

---

## ✨ Features

✅ Enter any number of subjects  
✅ Custom subject names and marks input  
✅ Grade + GPA calculation per subject  
✅ Average GPA calculator  
✅ Pass/Fail status display  
✅ Input validation (0–100 only, no text)  
✅ Clean tabular report output

---

## 📊 Grading System

| Marks Range | Grade | GPA  |
|-------------|--------|------|
| 90–100      | A+     | 4.0  |
| 80–89       | A      | 3.7  |
| 70–79       | B      | 3.0  |
| 60–69       | C      | 2.0  |
| 50–59       | D      | 1.0  |
| Below 50    | F      | 0.0  |

---

## 💻 Sample Output

### ✅ Pass Example
```bash
Enter Student Name: sagar
Enter number of subjects: 3

Enter subject1 name: Math
Enter marks for Math (out of 100): 95

Enter subject2 name: English
Enter marks for English (out of 100): 88

Enter subject3 name: Hindi
Enter marks for Hindi (out of 100): 76

------ Final Report ------
Student: sagar
-------------------------------------
Subject      Marks     Grade   GPA
-------------------------------------

❌ Fail Example

Enter Student Name: Riya
Enter number of subjects: 4

Enter subject1 name: Science
Enter marks for Science (out of 100): 92

Enter subject2 name: Social
Enter marks for Social (out of 100): 43

Enter subject3 name: PE
Enter marks for PE (out of 100): 78

Enter subject4 name: History
Enter marks for History (out of 100): 55

------ Final Report ------
Student: Riya
-------------------------------------
Subject      Marks     Grade   GPA
-------------------------------------
Science      92        A+      4.0
Social       43        F       0.0
PE           78        B       3.0
History      55        D       1.0
-------------------------------------
Average GPA: 2.00
Result: ❌ Fail

⚠️ Invalid Input Example

Enter Student Name: Aryan
Enter number of subjects: 2

Enter subject1 name: Physics
Enter marks for Physics (out of 100): abc
Invalid input. Please enter a valid integer.

Enter marks for Physics (out of 100): 105
Marks must be between 0 and 100.

Enter marks for Physics (out of 100): 89

Enter subject2 name: Chemistry
Enter marks for Chemistry (out of 100): 92

------ Final Report ------
Student: Aryan
-------------------------------------
Subject      Marks     Grade   GPA
-------------------------------------
Physics      89        A       3.7
Chemistry    92        A+      4.0
-------------------------------------
Average GPA: 3.85
Result: ✅ Pass

