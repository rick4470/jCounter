CREATE TABLE WeekDay(
	WeekDayID int NOT NULL auto_increment primary key,
	DateCreated datetime not null,
	AppUserId int not null,
	Constraint FOREIGN KEY (AppUserId)
	REFERENCES AppUser(UserID)
)  