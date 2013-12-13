CREATE TABLE Nutrient(
    NutrientID int NOT NULL auto_increment primary key,
    NutrientTypeID int NOT NULL,
    Calories decimal(18, 0) NOT NULL,
    Sodium decimal(18, 0) NULL,
    Weight decimal(18, 0) NULL,
    Name varchar(50) NULL
)
