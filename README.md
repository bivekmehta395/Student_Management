# Student Management System (SMS)

## Overview

The **Student Management System (SMS)** is designed to streamline the management of student-related activities in educational institutions. This application currently includes two primary functionalities: **Quiz Management** and **Billing Management**. It aims to enhance the educational experience for both students and instructors by providing a comprehensive set of tools for assessments and financial tracking.

## Features

### Quiz Management
- **Create and Manage Quizzes**: Instructors can create quizzes with various question types, including multiple choice, true/false, and short answer.
- **Student Participation**: Students can access quizzes, submit their answers, and receive immediate feedback on their performance.
- **Results Analysis**: Detailed analytics are provided on quiz results, enabling instructors to evaluate student performance effectively.
- **Question Bank**: Maintain a repository of questions that can be reused across different quizzes to save time.

### Billing Management
- **Fee Structure Management**: Administrators can define and manage fee structures for various courses and programs.
- **Invoice Generation**: Automatically generate invoices for students based on their enrollment and courses taken.
- **Payment Tracking**: Track payments made by students, including overdue balances and payment history.
- **Financial Reporting**: Generate comprehensive reports to assess overall billing status and financial health.

## Future Enhancements

While the current version focuses on quiz and billing management, planned future features include:
- Attendance Management
- Course Management
- User Role Management (Students, Instructors, Admins)
- Grades and Report Card Management
- Communication Tools (Announcements, Messaging)
## Algorithm Used

### Quick Sort for Result Analysis

The **Quick Sort** algorithm is implemented to sort quiz results in ascending order. Quick Sort is an efficient, divide-and-conquer algorithm that works by selecting a 'pivot' element from the array and partitioning the other elements into two sub-arrays according to whether they are less than or greater than the pivot.

#### How Quick Sort Works:
1. **Choose a Pivot**: Select an element from the array as the pivot (commonly the last element).
2. **Partitioning**: Rearrange the array so that all elements less than the pivot come before it and all elements greater than the pivot come after it.
3. **Recursion**: Recursively apply the above steps to the sub-arrays of elements with smaller and larger values.

#### Time Complexity
- **Average Case**: O(n log n)
- **Worst Case**: O(n²) (when the smallest or largest element is always chosen as the pivot)
- **Best Case**: O(n log n)

### Implementation Example
Here’s a simple implementation of Quick Sort in JavaScript to sort quiz scores:

```javascript
# function quickSort(arr) {
    if (arr.length <= 1) {
        return arr;
    }
    const pivot = arr[arr.length - 1];
    const left = [];
    const right = [];

    for (let i = 0; i < arr.length - 1; i++) {
        if (arr[i] < pivot) {
            left.push(arr[i]);
        } else {
            right.push(arr[i]);
        }
    }

    return [...quickSort(left), pivot, ...quickSort(right)];
}

// Example usage:
const scores = [88, 72, 94, 67, 100, 85];
const sortedScores = quickSort(scores);
console.log(sortedScores); // Output: [67, 72, 85, 88, 94, 100]
```

## Screenshot
![Screenshot (46)](https://github.com/user-attachments/assets/39dd9dc2-28b4-4408-8b9a-9c50362faf44)

![Screenshot (47)](https://github.com/user-attachments/assets/7b1aa027-4d1b-4369-9f95-1964746c89bb)
![Screenshot (53)](https://github.com/user-attachments/assets/74c19888-f901-4367-9c21-d4217036f7ec)
![Screenshot (45)](https://github.com/user-attachments/assets/2698633c-be94-40dc-b085-cf5d67eec59c)

**Clone the Repository**:
```bash
   git clone https://github.com/bivekmehta395/student-management-system.git
