CREATE DATABASE TaskManagementSystem;

USE TaskManagementSystem;

CREATE TABLE Roles (
    RoleID INT PRIMARY KEY IDENTITY(1,1), 
    RoleName VARCHAR(50) NOT NULL
);

INSERT INTO Roles (RoleName) VALUES ('Admin'), ('Team Member');

CREATE TABLE Users (
    UserID INT PRIMARY KEY IDENTITY(1,1), 
    Username VARCHAR(50) NOT NULL UNIQUE,
    Password VARCHAR(50) NOT NULL,
    RoleID INT,
    FOREIGN KEY (RoleID) REFERENCES Roles(RoleID)
);

INSERT INTO Users (Username, Password, RoleID) 
VALUES ('admin', 'admin123', 1), ('member1', 'pass123', 2);

CREATE TABLE Tasks (
    TaskID INT PRIMARY KEY IDENTITY(1,1),
    TaskName VARCHAR(100) NOT NULL,
    TaskType VARCHAR(50) NOT NULL,
    TaskStatus VARCHAR(50) DEFAULT 'Pending',
    AssignedTo INT,
    CreatedAt DATETIME DEFAULT GETDATE(),
    FOREIGN KEY (AssignedTo) REFERENCES Users(UserID)
);

INSERT INTO Tasks (TaskName, TaskType, TaskStatus, AssignedTo)
VALUES ('Fix Bug #123', 'Bug', 'Pending', 2),
       ('Add Feature X', 'Feature', 'In Progress', 2);


SELECT * FROM Roles;
SELECT * FROM Users;
SELECT * FROM Tasks;