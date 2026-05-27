# 📱Assignment 2 (Student Details Form App) 

## 📌 Overview

This is a simple Android application built using **Java** and **XML** that allows users to enter and submit student details such as **Name, City, Course, and Email**.

The app demonstrates:

* UI design using XML
* Toolbar integration
* User input handling
* Toast message display

This project is perfect for beginners learning Android development.

---

## 🚀 Features

* 📋 User-friendly Student Form UI
* 🧾 Input fields:

  * Name
  * City
  * Course
  * Email
* 🔘 Submit button to display entered data
* 🧭 Toolbar with title & subtitle
* 📱 Edge-to-edge layout support
* ⚡ Simple and lightweight app

---

## 🛠️ Tech Stack

* **Language:** Java
* **UI:** XML (Android Layouts)
* **Framework:** Android SDK
* **IDE:** Android Studio

---

## 📂 Project Structure

```
app/
 ├── java/com/example/assignment2/
 │    └── MainActivity.java
 │
 ├── res/
 │    ├── layout/
 │    │    └── activity_main.xml
 │    │
 │    ├── values/
 │    │    ├── colors.xml
 │    │    ├── strings.xml
 │    │    └── themes.xml
 │
 └── AndroidManifest.xml
```

---

## 🧩 Layout (XML)

The UI is designed using a **LinearLayout** structure with:

* Toolbar (AppBar)
* Title TextView ("Student Details")
* Multiple input fields using EditText
* Submit Button

### 🔹 Key Components:

* `EditText` → for user input
* `TextView` → labels
* `Button` → submit action
* `Toolbar` → app header

---

## ⚙️ MainActivity (Java Logic)

### 🔹 Key Functionalities:

* Initialize UI components using `findViewById`
* Setup Toolbar with:

  * Title → *Student Details*
  * Subtitle → *Welcome to the Form*
* Handle button click event
* Capture user input
* Display output using **Toast**

### 🔹 Core Logic:

```java
String name = nameET.getText().toString();
String city = cityEt.getText().toString();
String course = courseET.getText().toString();
String email = emailET.getText().toString();

String output = "My name is " + name +
                " I live in " + city +
                " and my course and email id is: " +
                course + " " + email;

Toast.makeText(getApplicationContext(), output, Toast.LENGTH_SHORT).show();
```

---

## 📸 Screenshot

<img width="386" height="858" alt="image" src="https://github.com/user-attachments/assets/86d09ec4-f4b0-4337-a6e3-70fff3cdc17a" />




## ▶️ How to Run

1. Clone the repository:

```
git clone https://github.com/your-username/student-details-app.git
```

2. Open the project in **Android Studio**

3. Sync Gradle

4. Run the app on:

   * Android Emulator OR
   * Physical Device

---

## 🧪 How It Works

1. User enters details in the form
2. Clicks on **Submit**
3. App collects data from EditText fields
4. Displays a formatted message using Toast

---

## 🔮 Future Improvements

* ✅ Add input validation (empty fields, email format)
* 🎨 Upgrade UI using Material Design (TextInputLayout)
* 💾 Store data using SQLite or Firebase
* 📄 Add multiple activities/screens
* 🔔 Replace Toast with AlertDialog

---

## 🤝 Contributing

Contributions are welcome!

1. Fork the repository
2. Create a new branch
3. Commit your changes
4. Submit a Pull Request

---

## 📄 License

This project is licensed under the **MIT License**.

---

## 🙌 Author

**Divyansh Jain**

GitHub: https://github.com/Divyansh-jain2005

---

# 📱Assignment 3 (Basic Calculator App)

A simple and user-friendly **Basic Calculator Android App** built using **Java** and **XML**. This app performs basic arithmetic operations like Addition, Subtraction, Multiplication, and Division.

---

## 🚀 Features

* ➕ Addition
* ➖ Subtraction
* ✖️ Multiplication
* ➗ Division
* 📥 User input validation
* ⚠️ Handles divide-by-zero errors
* 🎨 Clean and responsive UI

---

## 🛠️ Tech Stack

* **Language:** Java
* **UI Design:** XML
* **IDE:** Android Studio
* **Minimum SDK:** (Add your version here)

---

## 📂 Project Structure

```
📦 BasicCalculator
 ┣ 📂 java/com/example/assignment3
 ┃ ┗ 📜 MainActivity.java
 ┣ 📂 res/layout
 ┃ ┗ 📜 activity_main.xml
 ┣ 📂 res/values
 ┃ ┗ 📜 colors.xml
 ┗ 📜 AndroidManifest.xml
```

---

## 📸 Screenshots
<img width="386" height="864" alt="image" src="https://github.com/user-attachments/assets/69233cd5-bdc0-4af3-9a38-f193c7976cf0" />

---

## 💡 How It Works

1. User enters two numbers
2. Clicks any operation button (+, −, ×, ÷)
3. Result is displayed instantly

---

## 🔢 Core Logic (Java)

```java
add.setOnClickListener(v -> {
    double a = Double.parseDouble(num1.getText().toString());
    double b = Double.parseDouble(num2.getText().toString());
    addEt1.setText(String.valueOf(a + b));
});
```

✔ Similar logic is used for Subtraction, Multiplication, and Division
✔ Division includes zero-check to prevent errors

---

## 🎨 UI Layout (XML)

* Uses **LinearLayout** for structure
* Input fields for numbers
* Buttons for operations
* TextViews to display results

```xml
<Button
    android:id="@+id/add"
    android:text="+"
    android:layout_width="0dp"
    android:layout_weight="1"
    android:layout_height="wrap_content"/>
```

---

## ⚠️ Error Handling

* Prevents app crash on empty input
* Handles divide-by-zero case
* Ensures smooth user experience

---

## 📌 Future Improvements

* 🧮 Add scientific calculator features
* 🌙 Dark mode support
* 🎯 Better UI with Material Design
* 🔄 Add clear/reset button

---

## 🧑‍💻 Author

**Divyansh Jain**

GitHub: https://github.com/Divyansh-jain2005

---

## 📄 License

This project is open-source and available under the MIT License.

---


# 📱Assignment 4 (User Preference Application) 

## 📌 Project Overview

This is a simple **Android application** developed using **Java and XML** that collects user information such as name, mobile number, address, gender, date of birth, and hobbies. After submission, the app displays all the entered details in a structured format.

---

## 🚀 Features

* 🧑 User Input Form (Name, Mobile, Address)
* 🚻 Gender Selection using Radio Buttons
* 📅 Date Picker Dialog for selecting Date of Birth
* 🎯 Hobby Selection using CheckBoxes
* 📄 Display of user details on button click
* ⚠️ Basic validation (e.g., gender selection)

---

## 🛠️ Technologies Used

* **Java** (Backend logic)
* **XML** (UI Design)
* **Android Studio**
* **Android SDK Components**

  * `EditText`
  * `RadioGroup`
  * `CheckBox`
  * `DatePickerDialog`
  * `TextView`
  * `Button`

---

## 📂 Project Structure

```
com.example.assignment4
│
├── MainActivity.java
└── res
    └── layout
        └── activity_main.xml
```

---

## 📱 UI Components

### 🧾 Input Fields

* Name
* Mobile Number
* Address

### 🚻 Gender Selection

* Male
* Female
* Other

### 📅 Date of Birth

* Selected using a DatePicker dialog

### 🎯 Hobbies

* Reading Books
* Dancing
* Singing
* Travelling

---

## ⚙️ How It Works

1. User enters personal details.
2. Selects gender using RadioButtons.
3. Clicks **"Select Date"** to pick DOB.
4. Chooses hobbies via CheckBoxes.
5. Clicks **SUBMIT** button.
6. App displays formatted output in TextView.

---

## 🧠 Core Logic

### 📅 Date Picker Implementation

* Uses `DatePickerDialog`
* Displays selected date on button

### 📊 Form Submission

* Collects all inputs
* Validates gender selection
* Builds output string using `StringBuilder`
* Displays result in TextView

---

## 🧾 Sample Output

```
My name is Divyansh
Mobile: 9876543210
DOB: 12/04/2004
Gender: Male
Hobbies: Reading Books, Dancing
```

---

## ⚠️ Validations Implemented

* Gender must be selected
* Prevents app crash if no selection is made

---

## 🎨 UI Highlights

* Simple and clean layout using LinearLayout
* Organized sections for better readability
* Responsive padding and spacing

---

## 📸 Screenshots

<img width="447" height="1007" alt="image" src="https://github.com/user-attachments/assets/931082ba-8350-4abd-b466-3dc4f3a2efba" />


---

## 🔧 Future Improvements

* Add input validation (empty fields, mobile format)
* Use **ConstraintLayout** for better performance
* Upgrade UI using **Material Design**
* Store user data using SQLite or Firebase
* Add dark mode 🌙

---

## ▶️ How to Run

1. Open project in **Android Studio**
2. Connect emulator or Android device
3. Click **Run ▶️**
4. Test the application

---


## 🧑‍💻 Author

**Divyansh Jain**

GitHub: https://github.com/Divyansh-jain2005

---

## 📜 License

This project is for educational purposes.

---



# 📱 Android Calculator App (Project)

A simple **Calculator Android Application** built using **Java** in **Android Studio**.  
This app performs basic arithmetic operations with a clean and user-friendly interface.

---

## 🚀 Features

- ➕ Addition
- ➖ Subtraction
- ✖️ Multiplication
- ➗ Division
- 🧹 Clear / Reset functionality
- 📱 Responsive Android UI
- ⚡ Fast calculations

---

## 🛠️ Built With

- **Java**
- **Android Studio**
- **XML (UI Design)**
- **Android SDK**

---

## 📂 Project Structure


Calculator-App
│
├── app
│ ├── src
│ │ ├── main
│ │ │ ├── java/com/example/calculator
│ │ │ │ └── MainActivity.java
│ │ │ ├── res
│ │ │ │ ├── layout
│ │ │ │ │ └── activity_main.xml
│ │ │ │ └── values
│ │ │ │ └── strings.xml
│ │
│ └── build.gradle
│
└── README.md


---

## 📸 Screenshots
<h2>Splash Screen</h2>
<img width="465" height="971" alt="image" src="https://github.com/user-attachments/assets/17e688dd-3031-4a08-a813-51fb2109081d" />
<h2>Calculator</h2>
<img width="465" height="1015" alt="image" src="https://github.com/user-attachments/assets/4d712039-a80a-4dd8-84ba-31ae1dac3c06" />
---
________________________________________
##  ⚙️ Installation

1. Clone the repository

``bash
git clone https://github.com/Divyansh-jain2005/calculator.git

Open the project in Android Studio

Sync Gradle and run the app on:

Android Emulator

Physical Android Device
________________________________________

## ▶️ How to Use

Open the calculator app.

Enter numbers using the keypad.

Select the arithmetic operation.

Press = to get the result.

Use C to clear the screen.
________________________________________

## 📚 Learning Purpose

This project is created for learning:

Android App Development

Java Programming

UI Design in Android

Event Handling
________________________________________

## 🤝 Contributing

Contributions are welcome!

Fork the repository

Create a new branch

Commit your changes

Push to your branch

Create a Pull Request
________________________________________

## 👨‍💻 Author

**Divyansh Jain**

GitHub: https://github.com/Divyansh--jain2005
________________________________________



     
# 📅Assignment 5 (Alarm App - Android Application)
Create an Alarm with Button
This project is a simple Android Alarm Application developed using Java in Android Studio.
The app allows users to select a time using a TimePicker and set an alarm by clicking a button. When the alarm triggers, a notification appears and the default alarm sound starts playing.
________________________________________
## 📱 Features
•	⏰ Set Alarm using TimePicker
•	🔔 Trigger Alarm Notification
•	🎵 Play Default Alarm Sound
•	❌ Stop Alarm using Notification Action Button
•	📢 Supports Android Notification Permissions
•	🎨 Simple and Clean UI using Material Toolbar
________________________________________
## 🛠️ Technologies Used
•	Java
•	Android Studio
•	XML Layout Design
•	AlarmManager
•	BroadcastReceiver
•	NotificationManager
•	MediaPlayer
________________________________________
## 📂 Project Structure
com.example.alarm
│
├── MainActivity.java
├── AlarmService.java
├── StopAlarm.java
│
├── res
│   ├── layout
│   │   └── activity_main.xml
│   │
│   ├── values
│   │   └── colors.xml
│
├── AndroidManifest.xml
________________________________________
## 📄 Files Description
## 1️⃣ activity_main.xml
This file contains the user interface of the application.
Components Used:
•	Toolbar
•	TimePicker
•	Button
Functionality:
•	User selects time using TimePicker
•	Clicking Set Alarm button schedules the alarm
________________________________________
## 2️⃣ MainActivity.java
This is the main activity of the application.
Functionality:
•	Requests notification permission for Android 13+
•	Gets selected time from TimePicker
•	Uses AlarmManager to schedule exact alarm
•	Displays success message using Toast
Important Classes Used:
•	AlarmManager
•	PendingIntent
•	Calendar
•	TimePicker
________________________________________
## 3️⃣ AlarmService.java
This class extends BroadcastReceiver.
Functionality:
•	Receives alarm broadcast
•	Plays default alarm ringtone using MediaPlayer
•	Creates alarm notification
•	Adds Cancel button in notification
Notification Features:
•	High priority notification
•	Alarm category
•	Cancel action button
________________________________________
## 4️⃣ StopAlarm.java
This class is responsible for stopping the alarm.
Functionality:
•	Stops MediaPlayer
•	Releases resources
•	Cancels notification
________________________________________
## 5️⃣ AndroidManifest.xml
Contains:
•	Required permissions
•	Activity declaration
•	BroadcastReceiver registration
Permissions Used:
<uses-permission android:name="android.permission.SCHEDULE_EXACT_ALARM"/>
<uses-permission android:name="android.permission.POST_NOTIFICATIONS"/>
<uses-permission android:name="android.permission.USE_EXACT_ALARM"/>
________________________________________
## 6️⃣ colors.xml
Defines custom colors used in the application UI.
<color name="na_bg">#7b2cbf</color>
________________________________________
## 🚀 How to Run the Project
1.	Open project in Android Studio
2.	Sync Gradle files
3.	Connect Android device or start emulator
4.	Run the application
5.	Select time using TimePicker
6.	Click Set Alarm
7.	Wait for alarm trigger
________________________________________
## 📷 ScreenShots

<img width="369" height="826" alt="image" src="https://github.com/user-attachments/assets/c920b209-7c3b-4fc0-959b-cac14d6dda6e" />

<img width="377" height="841" alt="image" src="https://github.com/user-attachments/assets/94f5808f-5c9c-4fc4-8584-a55299aabf71" />

________________________________________
## 🔔 Notification System
The app uses:
•	NotificationChannel
•	NotificationCompat.Builder
•	PendingIntent
to create and manage alarm notifications.
________________________________________
## 🎯 Learning Outcomes
By completing this project, you will learn:
•	Working with AlarmManager
•	Using BroadcastReceiver
•	Creating Android Notifications
•	Playing audio using MediaPlayer
•	Handling runtime permissions
•	Using PendingIntent
________________________________________
## 👨‍💻 Developed By
**Divyansh Jain**

GitHub:-https://github.com/Divyansh-jain2005
________________________________________
## 📌 Conclusion
This Android Alarm Application demonstrates how to create a basic alarm system using Java and Android components like AlarmManager, BroadcastReceiver, and NotificationManager. It is a beginner-friendly project useful for learning Android background services and notifications.





# 📅Assignment 6(To Do List App - Android Application)
Create a To Do List Application
This project is a simple Android To Do List application developed using Java in Android Studio.
The app allows users to add tasks dynamically using a Floating Action Button and remove tasks using a long press action.
________________________________________
## 📱 Features
•	➕ Add new tasks
•	🗑️ Delete tasks with confirmation dialog
•	📋 Display tasks in ListView
•	🎨 Simple and attractive UI
•	⚡ Floating Action Button support
•	🔔 Toast messages for user interaction
________________________________________
## 🛠️ Technologies Used
•	Java
•	Android Studio
•	XML Layout Design
•	ListView
•	ArrayAdapter
•	AlertDialog
•	FloatingActionButton
________________________________________
## 📂 Project Structure
com.example.assignment6
│
├── MainActivity.java
│
├── res
│   ├── layout
│   │   └── activity_main.xml
│   │
│   ├── values
│   │   └── colors.xml
│   │
│   └── drawable
│       └── baseline_add_24.xml
│
├── AndroidManifest.xml
________________________________________
## 📄 Files Description
## 1️⃣ activity_main.xml
This file contains the UI design of the application.
Components Used:
•	Toolbar
•	ListView
•	FloatingActionButton
Functionality:
•	Displays list of tasks
•	Floating button used to add tasks
________________________________________
## 2️⃣ MainActivity.java
This is the main activity of the application.
Functionalities:
➕ Add Task
•	Opens AlertDialog
•	Takes task input using EditText
•	Adds task to ArrayList
•	Updates ListView
🗑️ Delete Task
•	Long press on any task
•	Shows delete confirmation dialog
•	Removes selected task
📋 List Management
•	Uses ArrayAdapter
•	Dynamically updates task list
________________________________________
## 3️⃣ colors.xml
Defines custom colors used in the application UI.
<color name="lavender">#c8b6ff</color>
________________________________________
## 4️⃣ AndroidManifest.xml
Contains:
•	Application configuration
•	Main activity declaration
________________________________________
## 🚀 How to Run the Project
1.	Open project in Android Studio
2.	Sync Gradle files
3.	Connect Android device or start emulator
4.	Run the application
5.	Click on Floating Action Button ➕
6.	Enter task name
7.	Press Add
8.	Long press task to delete
________________________________________
## 📷 ScreenShots
<img width="453" height="1002" alt="image" src="https://github.com/user-attachments/assets/c62edeed-e856-4fdf-a606-aff7fe1dc93a" />
<img width="450" height="1006" alt="image" src="https://github.com/user-attachments/assets/d7aa8718-1d09-4d53-bf10-d25a42c89c4f" />

________________________________________
## 🧩 Components Used
Component	Purpose
ListView	Displays task list
ArrayAdapter	Connects data with ListView
FloatingActionButton	Adds new tasks
AlertDialog	Input and delete confirmation
Toast	Shows success messages
________________________________________
## 🎯 Learning Outcomes
By completing this project, you will learn:
•	Working with ListView
•	Using ArrayAdapter
•	Handling click and long-click events
•	Creating dialogs using AlertDialog
•	Dynamic data management using ArrayList
•	Designing Android UI with XML
________________________________________
## 🎨 UI Design
Toolbar Features:
•	Application title
•	Developer subtitle
•	Lavender background theme
Floating Action Button:
•	Positioned at bottom-right corner
•	Used for quick task addition
________________________________________
## 👨‍💻 Developed By
**Divyansh Jain**

GitHub:-https://github.com/Divyansh-jain2005
________________________________________
## 📌 Conclusion
This To Do List Android Application is a beginner-friendly project that demonstrates task management using ListView, ArrayAdapter, and AlertDialog. It helps in understanding dynamic UI updates and user interaction handling in Android development.


# 📅Assignment 7 (Android Date Picker App)

A simple Android application built using **Java** that allows users to select a date using a **DatePicker** and display the selected date on the screen.

---

## 🚀 Features

* 📆 Select date using DatePicker
* 🔘 Submit button to confirm selection
* 📝 Displays selected date in TextView
* 📱 Clean and simple UI design
* ⚡ Uses modern Edge-to-Edge layout support

---

## 🛠️ Technologies Used

* Java
* Android SDK
* XML (UI Design)
* Android Studio

---

## 📂 Project Structure

```
Assignment5/
│── java/com/example/assignment5/
│     └── MainActivity.java
│
│── res/layout/
│     └── activity_main.xml
```

---

## 📄 XML Layout (activity_main.xml)

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="center"
    tools:context=".MainActivity">

    <DatePicker
        android:id="@+id/datepicker"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />

    <Button
        android:id="@+id/btn"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="SUBMIT"
        android:layout_marginTop="20dp"/>

    <TextView
        android:id="@+id/output"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Selected Date:"
        android:textSize="20sp"
        android:layout_marginTop="20dp"/>

</LinearLayout>
```

---

## 💻 Java Code (MainActivity.java)

```java
package com.example.assignment5;

import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btn;
    DatePicker dp;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Handle edge-to-edge padding
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize views
        btn = findViewById(R.id.btn);
        dp = findViewById(R.id.datepicker);
        output = findViewById(R.id.output);

        // Button click event
        btn.setOnClickListener(v -> {
            int day = dp.getDayOfMonth();
            int month = dp.getMonth() + 1;
            int year = dp.getYear();

            output.setText("Selected Date: " + day + "/" + month + "/" + year);
        });
    }
}
```

---

## 📸 Screenshot

<img width="398" height="893" alt="image" src="https://github.com/user-attachments/assets/e954fb1b-e157-4ec5-81b2-ab9f0df76efc" />


---

## ⚙️ How to Run

1. Open the project in **Android Studio**
2. Connect an emulator or physical device
3. Click ▶️ Run
4. Select a date and press **SUBMIT**

---

## 📌 Future Improvements

* 🎨 Improve UI using Material Design
* 📅 Add DatePicker Dialog
* 🌍 Add date format options
* 🔔 Show Toast message on selection

---

## 👨‍💻 Author

**Divyansh Jain**
GitHub: https://github.com/Divyansh-jain2005

---

## 📜 License

This project is for educational purposes.



# 📅Assignment 8(Gallery App- Android Application)
Create a Gallery Application
This project is a simple Android Gallery Application developed using Java in Android Studio.
The app allows users to select single or multiple images from device storage and display them in a GridView.
________________________________________
## 📱 Features
•	🖼️ Select single image from gallery
•	📂 Select multiple images from gallery
•	📋 Display images in GridView
•	🎨 Simple and attractive UI
•	📱 Runtime permission handling
•	⚡ Custom Image Adapter implementation
________________________________________
## 🛠️ Technologies Used
•	Java
•	Android Studio
•	XML Layout Design
•	GridView
•	BaseAdapter
•	ImageView
•	MediaStore API
•	Runtime Permissions
________________________________________
## 📂 Project Structure
com.example.assignment7
│
├── MainActivity.java
├── ImageAdapter.java
│
├── res
│   ├── layout
│   │   ├── activity_main.xml
│   │   └── image_items.xml
│   │
│   ├── values
│   │   └── colors.xml
│
├── AndroidManifest.xml
________________________________________
## 📄 Files Description
## 1️⃣ activity_main.xml
This file contains the main user interface of the application.
Components Used:
•	Toolbar
•	Button
•	GridView
Functionality:
•	Button used to open gallery
•	GridView displays selected images
________________________________________
## 2️⃣ image_items.xml
This file defines the layout for individual image items displayed inside GridView.
Components Used:
•	ImageView
Properties:
•	centerCrop scale type
•	Fixed height for proper grid alignment
________________________________________
## 3️⃣ MainActivity.java
This is the main activity of the application.
Functionalities:
📂 Select Images
•	Opens gallery using:
Intent.ACTION_PICK
 🖼️ Multiple Image Selection
•	Uses:
Intent.EXTRA_ALLOW_MULTIPLE
 📱 Permission Handling
•	Requests:
Manifest.permission.READ_EXTERNAL_STORAGE
 📋 Display Images
•	Stores image URIs in ArrayList
•	Displays images using custom ImageAdapter
________________________________________
## 4️⃣ ImageAdapter.java
This class extends BaseAdapter.
Functionalities:
•	Inflates custom image layout
•	Loads image URI into ImageView
•	Dynamically updates GridView
Important Methods:
Method	Purpose
getCount()	Returns total images
getItem()	Returns image item
getView()	Displays image in GridView
________________________________________
## 5️⃣ colors.xml
Defines custom colors used in the application UI.
<color name="na_bg">#7b2cbf</color>
________________________________________
## 🚀 How to Run the Project
1.	Open project in Android Studio
2.	Sync Gradle files
3.	Connect Android device or start emulator
4.	Run the application
5.	Grant storage permission
6.	Click Select Image
7.	Choose single or multiple images
8.	Selected images will appear in GridView
________________________________________
## 📷 ScreenShots
<img width="352" height="792" alt="image" src="https://github.com/user-attachments/assets/0c80b24d-33ba-4b32-a127-6d815dc50d21" />

________________________________________
## 🧩 Components Used
Component	Purpose
GridView	Display images in grid
ImageView	Show selected images
BaseAdapter	Custom adapter for GridView
Intent	Open gallery
ArrayList	Store image URIs
________________________________________
## 🔐 Permissions Used

# <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE"/>

## 🎯 Learning Outcomes
By completing this project, you will learn:
•	Working with GridView
•	Creating custom adapters using BaseAdapter
•	Selecting images from gallery
•	Handling runtime permissions
•	Managing image URIs
•	Displaying dynamic image content

## 🎨 UI Design
Toolbar Features:
•	App title: Gallery App
•	Developer subtitle
•	Purple theme background
GridView Features:
•	3-column image layout
•	Dynamic image loading
•	Responsive image display

## 👨‍💻 Developed By
**Divyansh Jain**

GitHub:-https://github.com/Divyansh-jain2005

## 📌 Conclusion
This Gallery Android Application demonstrates how to select and display images from device storage using GridView and BaseAdapter. It is a beginner-friendly project useful for learning image handling, runtime permissions, and custom adapters in Android development.



# 📅Assignment 9(Emergency Alert App - Android Application)
Create an Emergency Alert Application
This project is a simple Android Emergency Alert Application developed using Java in Android Studio.
The app allows users to save emergency contact numbers, send emergency SMS alerts, and directly call saved contacts during emergency situations.
________________________________________
## 📱 Features
•	📞 Save emergency contact numbers
•	💾 Store contacts using SharedPreferences
•	📩 Send emergency SMS alert
•	☎️ Directly call emergency contact
•	🎨 Simple and user-friendly UI
•	🔐 Runtime permission handling
________________________________________
## 🛠️ Technologies Used
•	Java
•	Android Studio
•	XML Layout Design
•	SharedPreferences
•	Intent
•	SMS Manager
•	Runtime Permissions
________________________________________
## 📂 Project Structure
com.example.assignment8
│
├── MainActivity.java
│
├── res
│   ├── layout
│   │   └── activity_main.xml
│   │
│   ├── values
│   │   └── colors.xml
│
├── AndroidManifest.xml
________________________________________
## 📄 Files Description
## 1️⃣ activity_main.xml
This file contains the user interface design of the application.
Components Used:
•	Toolbar
•	TextView
•	EditText
•	Button
Functionalities:
•	Enter emergency contact numbers
•	Save contacts
•	Send SMS alerts
•	Dial emergency numbers
________________________________________
## 2️⃣ MainActivity.java
This is the main activity of the application.
________________________________________
## 📞 Save Emergency Contacts
The app stores contact numbers using:
SharedPreferences
Stored Contacts:
•	Contact 1
•	Contact 2
•	Contact 3
Save Functionality:
editor.putString("num1",num1.getText().toString());
________________________________________
## 📩 Send Emergency SMS
The app sends an emergency alert message using SMS intent.
Emergency Message:
I am in Problem!
SMS Intent Used:
Intent.ACTION_SENDTO
Features:
•	Sends message to multiple contacts
•	Opens default messaging application
________________________________________
## ☎️ Dial Emergency Contact
The app can directly call the saved contact using:
Intent.ACTION_CALL
Dial Features:
•	Automatically calls saved number
•	Emergency quick access support
________________________________________
## 3️⃣ colors.xml
Defines custom colors used in the application UI.
<color name="na_bg">#7b2cbf</color>
<color name="red">#dd2d4a</color>
<color name="na_gn">#0b6e4f</color>
________________________________________
## 4️⃣ AndroidManifest.xml
Contains:
•	Required permissions
•	Application configuration
•	Main activity declaration
Permissions Used:
<uses-permission android:name="android.permission.SEND_SMS"/>
<uses-permission android:name="android.permission.CALL_PHONE"/>
________________________________________
## 🚀 How to Run the Project
1.	Open project in Android Studio
2.	Sync Gradle files
3.	Connect Android device or start emulator
4.	Run the application
5.	Grant SMS and Call permissions
6.	Enter emergency contact numbers
7.	Click Save Contact
8.	Use:
o	Send SMS button to send alert
o	Dial Number button to call contact
________________________________________
## 📷 SceenShots
<img width="366" height="808" alt="image" src="https://github.com/user-attachments/assets/6758a2d9-703d-4db7-8fdb-c63847cff5d0" />

________________________________________
## 🧩 Components Used
Component	Purpose
EditText	Input contact numbers
Button	Perform actions
SharedPreferences	Save contacts locally
Intent	Send SMS and make calls
Toast	Display success messages
________________________________________
## 🔐 Permissions Handling
The app requests runtime permissions for:
Permission	Purpose
SEND_SMS	Send emergency messages
CALL_PHONE	Make emergency calls
________________________________________
## 🎯 Learning Outcomes
By completing this project, you will learn:
•	Working with SharedPreferences
•	Sending SMS using Android Intent
•	Making phone calls programmatically
•	Handling runtime permissions
•	Managing user input using EditText
•	Designing Android UI with XML
________________________________________
## 🎨 UI Design
Toolbar Features:
•	App title
•	Developer subtitle
•	Purple theme design
Button Colors:
Button	Color
Save Contact	Purple
Send SMS	Red
Dial Number	Green
________________________________________
## 👨‍💻 Developed By
**Divyansh Jain**

GitHub:-https://github.com/Divyansh-jain2005
________________________________________
## 📌 Conclusion
This Emergency Alert Android Application demonstrates how to manage emergency contacts, send SMS alerts, and make emergency phone calls using Android Intents and SharedPreferences. It is a beginner-friendly project useful for learning Android permissions, data storage, and communication features.



# 📅Assignment 10(WebView Browser App - Android Application)
Create a WebView Application
This project is a simple Android WebView Browser Application developed using Java in Android Studio.
The app allows users to enter a website URL and open the webpage directly inside the application using WebView.
________________________________________
## 📱 Features
•	🌐 Open websites inside the app
•	🔎 Enter custom URL
•	⚡ JavaScript support enabled
•	⬅️ Back navigation support
•	🎨 Simple and user-friendly UI
•	📱 Embedded mini browser functionality
________________________________________
## 🛠️ Technologies Used
•	Java
•	Android Studio
•	XML Layout Design
•	WebView
•	EditText
•	Button
________________________________________
## 📂 Project Structure
com.example.assignment9
│
├── MainActivity.java
│
├── res
│   ├── layout
│   │   └── activity_main.xml
│   │
│   ├── values
│   │   └── colors.xml
│
├── AndroidManifest.xml
________________________________________
## 📄 Files Description
## 1️⃣ activity_main.xml
This file contains the user interface of the application.
Components Used:
•	Toolbar
•	TextView
•	EditText
•	Button
•	WebView
Functionality:
•	User enters website URL
•	Clicking button loads webpage in WebView
________________________________________
## 2️⃣ MainActivity.java
This is the main activity of the application.
________________________________________
## 🌐 WebView Loading
The app loads websites using:
webView.loadUrl(uri);
JavaScript Support:
webView.getSettings().setJavaScriptEnabled(true);
________________________________________
## 🔎 URL Input
The user enters URL inside:
EditText
Example:
https://www.google.com
________________________________________
## ⬅️ Back Navigation
The app overrides:
onBackPressed()
Functionality:
•	Navigates to previous webpage
•	Exits app if no page history exists
________________________________________
## 3️⃣ colors.xml
Defines custom colors used in the application UI.
<color name="na_bg">#7b2cbf</color>
<color name="bg">#f7ede2</color>
________________________________________
## 4️⃣ AndroidManifest.xml
Contains:
•	Internet permission
•	Application configuration
•	Main activity declaration
Permission Used:
<uses-permission android:name="android.permission.INTERNET"/>
________________________________________
## 🚀 How to Run the Project
1.	Open project in Android Studio
2.	Sync Gradle files
3.	Connect Android device or start emulator
4.	Run the application
5.	Enter website URL
6.	Click Click Here button
7.	Website opens inside WebView
________________________________________
## 📸 Screenshot

<img width="415" height="867" alt="image" src="https://github.com/user-attachments/assets/2e6b3038-0e7a-44c1-8951-43ee74af528e" />

## 🧩 Components Used
Component	Purpose
WebView	Display web pages
EditText	Input website URL
Button	Load webpage
Toolbar	Application header

## 🎯 Learning Outcomes
By completing this project, you will learn:
•	Working with WebView
•	Loading websites inside Android app
•	Enabling JavaScript in WebView
•	Handling internet permissions
•	Managing back navigation
•	Designing Android UI using XML

## 🎨 UI Design
Toolbar Features:
•	App title: WebView App
•	Developer subtitle
•	Purple theme design
Layout Features:
•	URL input field
•	Embedded browser view
•	Simple and responsive interface
## 👨‍💻 Developed By

**Divyansh Jain**
GitHub:-https://github.com/Divyansh-jain2005

## 📌 Conclusion
This WebView Android Application demonstrates how to create a simple in-app browser using WebView. It helps in understanding webpage loading, JavaScript handling, and navigation management in Android development using Java and XML.


