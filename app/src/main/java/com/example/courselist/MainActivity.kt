package com.example.courselist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView


class MainActivity : AppCompatActivity() {
    internal var helper = DatabaseHandler(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val course: ImageView = findViewById(R.id.courseBtn)
        course.setOnClickListener {
            val intent = Intent(this, CourseListing::class.java)
            startActivity(intent)
        }

        val social: ImageView = findViewById(R.id.socialsBtn)
        social.setOnClickListener {
            val intent = Intent(this, Socials::class.java)
            startActivity(intent)
        }

        val directory: ImageView = findViewById(R.id.directoryBtn)
        directory.setOnClickListener {
            val intent = Intent(this, Directory::class.java)
            startActivity(intent)
        }

        val timetable: ImageView = findViewById(R.id.timetableBtn)
        timetable.setOnClickListener{
            val intent = Intent(this, Timetable::class.java)
            startActivity(intent)
        }

        val admission: ImageView = findViewById(R.id.admissionBtn)
        admission.setOnClickListener{
            val intent = Intent(this, Admission::class.java)
            startActivity(intent)
        }


        helper.insertData("ITT106","Computer Essentials & Troubleshooting","3","NONE", "This introductory course in computer troubleshooting and repairs is designed to give students hands-on experience in diagnosing and solving some of the common hardware and software problems that can occur during the normal usage of a computer.")
        helper.insertData("ITT201","Data Communications & Networks I","3","NONE", "This introductory course in Data Communications and Networks is designed to give students an understanding of networks and how they can be used in organizations to increase efficiency. It will also introduce IP addressing and subnets and briefly look at security issues in networking.")
        helper.insertData("ITT104","Database Management Systems I","3","NONE", "This introductory course covers the concepts related to the design and implementation of Database Management Systems. Case studies will be used to give students a practical sense of the issues to be considered in the implementation and use of Information technology, and to introduce the concepts, theories and laws or legal frameworks within which these issues are managed.")
        helper.insertData("ITT304","Database Management Systems II","3","Database Management Systems I", "This course is aimed at providing upper level undergraduate students with intermediate to advanced concepts in data modelling design and database administration. The course explores the variety of options available in database development and administration for current and future use on particular software platform technologies.")
        helper.insertData("POL100","Introduction to Politics","3","NONE", "To expose students to the nature and main forms of political institutions and government in the Caribbean as well as significant culture manifestations in the region.  Students will be able to identify main issues in Caribbean politics and Government and relate them to central political themes, concepts and theories. \n" +
                "\n" +
                "The course does not assume prior knowledge of core concepts; therefore a great deal of reading is obligatory.  The discipline of the subject matter will entail that students shed biases and prejudices for the adoption of an open mind in dealing with the content.")
        helper.insertData("ITT102","Discrete Mathematics I","3","College Algebra", "This introductory course aimed to provide a foundation level understanding of Information Technology. The main concepts covered the identification and explanation of basic computer components, set up a basic workstation, conduct of basic software installation, establishment of basic network connectivity, the identification of compatibility issues and the prevention of basic security risks. In the practical section of the course students will get hands-on experience using office productivity tools and setup a basic workstation.")
        helper.insertData("ITT300","Discrete Math II","3","Discrete Math I", "This course builds on the fundamentals of discrete mathematics covered in Discrete Structures I.  The main focus will be on developing a sound theoretical foundation for further work in computer science and information science.  The topics covered in this course will not be exhaustive to discrete structures but will provide the basis for pursuing other advanced courses in discrete structures and mathematics.")
        helper.insertData("ITT205","Systems Analysis & Design I","3","NONE", "This course covers the design of information systems and takes students right through to object oriented systems analysis and design using UML. The course will explore all aspects of the systems development life cycle (SDLC). The classes will use case studies to give students a practical sense of systems analysis and design and to introduce the concepts, methodologies, tools and techniques that can be used to develop systems.")
        helper.insertData("ITT305","System Analysis & Design II","3","Systems Analysis & Design I", "This course is considered a Writing Intensive Course. Therefore, it is expected that each of the assignments will reflect all of the good aspects of report structuring, writing and presentation discussed in both this course and all communications courses.\n" +
                "The course will be taught using lectures and seminars, which will focus on the advanced principles, theories and practices of systems analysis and design. The lectures will cover some of the advanced topics relative to the course, which students need to be familiar with in order to practice in the field. More advanced case studies will also be used to bring students closer to practical situations. In these case studies, students will be expected to present materials in simulation with real projects. The assignments may be based on advanced case material presented in the textbook(s) or other cases provided by the lecturer, at the lecturer’s discretion.")
        helper.insertData("ITT420","Mobile Application Development","3","NONE", "This course will introduce students to the core conceptual skills and basic practices needed to develop an Android application.  The course will focus on how the application communicates to retrieve, store and interact with other devices on any android platform. Topics will include memory management, user interface design, user interface building, input methods, data handling, and network techniques.")


        helper.insertTimeTableData("ITT106","Computer Essentials & Troubleshooting","Mon","8:30 pm", "10:30 pm")
        helper.insertTimeTableData("ITT201","Data Communications & Networks I","Mon","8:00 pm", "10:00 pm")
        helper.insertTimeTableData("ITT104","Database Management Systems I","Wed","8:00 pm", "9:00 pm")
        helper.insertTimeTableData("ITT304","Database Management Systems II","Sun","8:00 pm", "10:00 pm")
        helper.insertTimeTableData("POL100","Introduction to Politics","Sun","12:00 pm", "2:00 pm")
        helper.insertTimeTableData("ITT102","Discrete Mathematics I","Thur","8:30 pm", "10:30 pm")
        helper.insertTimeTableData("ITT300","Discrete Math II","Sat","8:00 pm", "10:00 pm")
        helper.insertTimeTableData("ITT205","Systems Analysis & Design I","Sun","12:00 pm", "2:00 pm")
        helper.insertTimeTableData("ITT305","System Analysis & Design II","Sun","2:00 pm", "4:00 pm")
        helper.insertTimeTableData("ITT420","Mobile Application Development","Thur","6:00 pm", "8:00 pm")

    }

}