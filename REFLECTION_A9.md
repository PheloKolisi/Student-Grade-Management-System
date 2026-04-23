# Reflection – Assignment 9

Designing the domain model and class diagram for the Student Grade Management System presented several challenges and learning opportunities. One of the main challenges was identifying the correct level of abstraction for the domain entities. Initially, it was difficult to decide how detailed each class should be, especially when defining attributes and methods. Including too many attributes made the model complex, while too few reduced clarity.

Another challenge was defining relationships between entities. Understanding how entities such as Student, Subject, and Grade interact required careful consideration of the system’s requirements and use cases. For example, ensuring that a grade is linked to both a student and a subject was essential for maintaining data integrity.

Aligning the class diagram with previous assignments, such as use cases and state diagrams, was also challenging. It required revisiting earlier work to ensure consistency across all system models. For instance, the "Capture Grades" use case directly influenced the design of the Grade class and its methods.

Trade-offs were made during the design process. One example is choosing association relationships instead of more complex inheritance structures to keep the design simple and understandable. While inheritance could have been used for roles like Lecturer and Student, using separate classes provided better clarity for this system.

Another trade-off involved balancing simplicity and scalability. The system was designed to be simple enough for implementation while still allowing future expansion, such as adding more user roles or advanced reporting features.

This assignment provided valuable insights into object-oriented design. It highlighted the importance of clear structure, proper relationships, and alignment with system requirements. Additionally, it demonstrated how class diagrams serve as a blueprint for system implementation, making it easier to translate design into code.

Overall, this assignment improved my understanding of domain modeling and reinforced the importance of consistency and clarity in software design.
