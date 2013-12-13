CREATE TABLE AppUser(
        UserID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
        LicenseID INT,
        FirstName varchar(50) NULL,
        LastName varchar(50) NULL,
        Gender char(2) NULL,
        DOB datetime NULL,
        Weight numeric(18, 0) NULL,
        Height numeric(18, 0) NULL,
        ActivityLevel int NULL,
        TargetWeight numeric(18, 0) NULL,
        CONSTRAINT fk_license_number FOREIGN KEY (LicenseID)                    
	REFERENCES License(ID)
)