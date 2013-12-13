CREATE TABLE MealItem(
	MealItemID int NOT NULL auto_increment primary key,
	MealID int NOT NULL,
	MealItemName varchar(50) NOT NULL,
	TotalWeight DECIMAL(18,0) NOT NULL,
	FatWeight DECIMAL(18,0) null,
	CarbWeight DECIMAL(18,0) null,
	ProteinWeight DECIMAL(18,0) null,
	Sodium DECIMAL(18,0) null,
	Constraint FOREIGN KEY (MealID)
	REFERENCES Meal(MealID)
)

