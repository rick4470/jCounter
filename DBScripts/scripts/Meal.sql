CREATE TABLE Meal(
	MealID int NOT NULL auto_increment primary key ,
	MealDate datetime NULL,
	MealName varchar(50) NOT NULL,
	WeekDayID int not null,
	Constraint FOREIGN KEY (WeekDayID)
	REFERENCES WeekDay(WeekDayID)
)

