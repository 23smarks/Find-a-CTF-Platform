# Find-a-CTF-Platform
 
Java GUI corresponding to a weighted decision matrix for various CTF platforms. The matrix was created after a careful evaluation of various CTF platforms. The closer to 5, the higher the ranking. These rankings were from my own personal observations. See the decision matrix with no weights applied below. 

<img width="352" alt="image" src="https://user-images.githubusercontent.com/56458880/236636143-784a69af-a443-43e2-9e87-006eee01eab9.png">

Slider values indicate weights applied to matrix. The CTF platform with the highest total score after the weighting is applied is recommended to the user.

User Interface:

<img width="316" alt="image" src="https://user-images.githubusercontent.com/56458880/236636246-7fe265a4-75f4-4bb3-8499-13cee8a693a6.png">

Idea behind script*:

<img width="299" alt="image" src="https://user-images.githubusercontent.com/56458880/236636272-d0a6dd58-be1d-4d1d-88e5-719908fab1c1.png">
* Preferences are given by user, then each corresponding criteria in the original matrix is multiplied by the weight specified by the user. The weighted criteria are then summed for each CTF platform and the highest scoring platform is returned. 

This was created after planning a CTF competition myself and noticing how difficult it was to choose a hosting platform in different scenarios. I wanted to simplify the process for others somewhat, especially for those with no familiarity with hosting CTF competitions. 

Planning on adding links, images, etc. in future updates.
