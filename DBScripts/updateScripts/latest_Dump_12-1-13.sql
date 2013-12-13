-- phpMyAdmin SQL Dump
-- version 4.0.6deb1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Dec 01, 2013 at 06:44 PM
-- Server version: 5.5.32-0ubuntu7
-- PHP Version: 5.5.3-1ubuntu2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `java`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`javaUser`@`localhost` PROCEDURE `ABC`()
BEGIN
      DECLARE a INT Default 1 ;
		DECLARE pkey INT;
      simple_loop: LOOP         
         insert into WeekDay (datecreated, AppUserId) values(date_add(Now(), INTERVAL -a DAY), 8);
		
		select WeekDayId into pkey from WeekDay order by WeekDayId desc limit 1;

		select pkey;
		 
		insert into Meal (MealName, WeekDayID) values ('Default', pkey);

		select MealID into pkey from Meal order by MealID desc limit 1;

		insert into MealItem (MealID, MealItemName, TotalWeight, TotalCalories) values (pkey, 'Stuff', 100, 200);
		 
         SET a=a+1;
         IF a=51 THEN
            LEAVE simple_loop;
         END IF;
   END LOOP simple_loop;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `AppUser`
--

CREATE TABLE IF NOT EXISTS `AppUser` (
  `UserID` int(11) NOT NULL AUTO_INCREMENT,
  `LicenseID` int(11) DEFAULT NULL,
  `FirstName` varchar(50) DEFAULT NULL,
  `LastName` varchar(50) DEFAULT NULL,
  `Gender` char(2) DEFAULT NULL,
  `DOB` datetime DEFAULT NULL,
  `Weight` decimal(18,0) DEFAULT NULL,
  `Height` decimal(18,0) DEFAULT NULL,
  `ActivityLevel` int(11) DEFAULT NULL,
  `TargetWeight` decimal(18,0) DEFAULT NULL,
  `InitialWeight` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`UserID`),
  KEY `fk_license_number` (`LicenseID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=16 ;

-- --------------------------------------------------------

--
-- Table structure for table `License`
--

CREATE TABLE IF NOT EXISTS `License` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `LicenseNumber` varchar(40) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `LicenseNumber` (`LicenseNumber`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `License`
--

INSERT INTO `License` (`ID`, `LicenseNumber`) VALUES
(4, 'apple'),
(1, 'hello'),
(3, 'parlevu');

-- --------------------------------------------------------

--
-- Table structure for table `Meal`
--

CREATE TABLE IF NOT EXISTS `Meal` (
  `MealID` int(11) NOT NULL AUTO_INCREMENT,
  `MealDate` datetime DEFAULT NULL,
  `MealName` varchar(50) NOT NULL,
  `WeekDayID` int(11) NOT NULL,
  PRIMARY KEY (`MealID`),
  KEY `WeekDayID` (`WeekDayID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=61 ;

--
-- Dumping data for table `Meal`
--

INSERT INTO `Meal` (`MealID`, `MealDate`, `MealName`, `WeekDayID`) VALUES
(6, '2013-11-28 23:30:22', 'Default Meal', 4),
(7, '2013-11-29 16:16:57', 'Default Meal', 5),
(8, '2013-11-29 17:56:16', 'Default Meal', 6),
(9, '2013-11-29 21:53:47', 'Default Meal', 7),
(10, '2013-12-01 09:23:39', 'Default Meal', 8),
(11, NULL, 'Default', 9),
(12, NULL, 'Default', 10),
(13, NULL, 'Default', 11),
(14, NULL, 'Default', 12),
(15, NULL, 'Default', 13),
(16, NULL, 'Default', 14),
(17, NULL, 'Default', 15),
(18, NULL, 'Default', 16),
(19, NULL, 'Default', 17),
(20, NULL, 'Default', 18),
(21, NULL, 'Default', 19),
(22, NULL, 'Default', 20),
(23, NULL, 'Default', 21),
(24, NULL, 'Default', 22),
(25, NULL, 'Default', 23),
(26, NULL, 'Default', 24),
(27, NULL, 'Default', 25),
(28, NULL, 'Default', 26),
(29, NULL, 'Default', 27),
(30, NULL, 'Default', 28),
(31, NULL, 'Default', 29),
(32, NULL, 'Default', 30),
(33, NULL, 'Default', 31),
(34, NULL, 'Default', 32),
(35, NULL, 'Default', 33),
(36, NULL, 'Default', 34),
(37, NULL, 'Default', 35),
(38, NULL, 'Default', 36),
(39, NULL, 'Default', 37),
(40, NULL, 'Default', 38),
(41, NULL, 'Default', 39),
(42, NULL, 'Default', 40),
(43, NULL, 'Default', 41),
(44, NULL, 'Default', 42),
(45, NULL, 'Default', 43),
(46, NULL, 'Default', 44),
(47, NULL, 'Default', 45),
(48, NULL, 'Default', 46),
(49, NULL, 'Default', 47),
(50, NULL, 'Default', 48),
(51, NULL, 'Default', 49),
(52, NULL, 'Default', 50),
(53, NULL, 'Default', 51),
(54, NULL, 'Default', 52),
(55, NULL, 'Default', 53),
(56, NULL, 'Default', 54),
(57, NULL, 'Default', 55),
(58, NULL, 'Default', 56),
(59, NULL, 'Default', 57),
(60, NULL, 'Default', 58);

-- --------------------------------------------------------

--
-- Table structure for table `MealItem`
--

CREATE TABLE IF NOT EXISTS `MealItem` (
  `MealItemID` int(11) NOT NULL AUTO_INCREMENT,
  `MealID` int(11) NOT NULL,
  `MealItemName` varchar(50) NOT NULL,
  `TotalWeight` decimal(18,0) NOT NULL,
  `FatWeight` decimal(18,0) DEFAULT NULL,
  `CarbWeight` decimal(18,0) DEFAULT NULL,
  `ProteinWeight` decimal(18,0) DEFAULT NULL,
  `Sodium` decimal(18,0) DEFAULT NULL,
  `TotalCalories` decimal(18,0) DEFAULT NULL,
  PRIMARY KEY (`MealItemID`),
  KEY `MealID` (`MealID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=56 ;

--
-- Dumping data for table `MealItem`
--

INSERT INTO `MealItem` (`MealItemID`, `MealID`, `MealItemName`, `TotalWeight`, `FatWeight`, `CarbWeight`, `ProteinWeight`, `Sodium`, `TotalCalories`) VALUES
(5, 6, 'Tofu', 0, 10, 0, 10, 5, NULL),
(6, 11, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(7, 12, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(8, 13, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(9, 14, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(10, 15, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(11, 16, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(12, 17, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(13, 18, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(14, 19, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(15, 20, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(16, 21, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(17, 22, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(18, 23, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(19, 24, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(20, 25, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(21, 26, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(22, 27, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(23, 28, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(24, 29, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(25, 30, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(26, 31, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(27, 32, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(28, 33, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(29, 34, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(30, 35, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(31, 36, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(32, 37, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(33, 38, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(34, 39, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(35, 40, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(36, 41, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(37, 42, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(38, 43, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(39, 44, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(40, 45, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(41, 46, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(42, 47, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(43, 48, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(44, 49, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(45, 50, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(46, 51, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(47, 52, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(48, 53, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(49, 54, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(50, 55, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(51, 56, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(52, 57, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(53, 58, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(54, 59, 'Stuff', 100, NULL, NULL, NULL, NULL, 200),
(55, 60, 'Stuff', 100, NULL, NULL, NULL, NULL, 200);

-- --------------------------------------------------------

--
-- Table structure for table `Nutrient`
--

CREATE TABLE IF NOT EXISTS `Nutrient` (
  `NutrientID` int(11) NOT NULL AUTO_INCREMENT,
  `NutrientTypeID` int(11) NOT NULL,
  `Calories` decimal(18,0) NOT NULL,
  `Sodium` decimal(18,0) DEFAULT NULL,
  `Weight` decimal(18,0) DEFAULT NULL,
  `Name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`NutrientID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `NutrientType`
--

CREATE TABLE IF NOT EXISTS `NutrientType` (
  `NutrientTypeID` int(11) NOT NULL AUTO_INCREMENT,
  `Description` varchar(50) NOT NULL,
  PRIMARY KEY (`NutrientTypeID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `WeekDay`
--

CREATE TABLE IF NOT EXISTS `WeekDay` (
  `WeekDayID` int(11) NOT NULL AUTO_INCREMENT,
  `DateCreated` datetime NOT NULL,
  `AppUserId` int(11) NOT NULL,
  PRIMARY KEY (`WeekDayID`),
  KEY `AppUserId` (`AppUserId`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=59 ;

--
-- Dumping data for table `WeekDay`
--

INSERT INTO `WeekDay` (`WeekDayID`, `DateCreated`, `AppUserId`) VALUES
(4, '2013-11-28 23:30:22', 4),
(5, '2013-11-29 16:16:57', 4),
(6, '2013-11-29 17:56:16', 14),
(7, '2013-11-29 21:53:47', 15),
(8, '2013-12-01 09:23:39', 15),
(9, '2013-11-30 11:26:40', 8),
(10, '2013-11-29 11:26:40', 8),
(11, '2013-11-28 11:26:40', 8),
(12, '2013-11-27 11:26:40', 8),
(13, '2013-11-26 11:26:40', 8),
(14, '2013-11-25 11:26:40', 8),
(15, '2013-11-24 11:26:40', 8),
(16, '2013-11-23 11:26:40', 8),
(17, '2013-11-22 11:26:40', 8),
(18, '2013-11-21 11:26:40', 8),
(19, '2013-11-20 11:26:40', 8),
(20, '2013-11-19 11:26:40', 8),
(21, '2013-11-18 11:26:40', 8),
(22, '2013-11-17 11:26:40', 8),
(23, '2013-11-16 11:26:40', 8),
(24, '2013-11-15 11:26:40', 8),
(25, '2013-11-14 11:26:40', 8),
(26, '2013-11-13 11:26:40', 8),
(27, '2013-11-12 11:26:40', 8),
(28, '2013-11-11 11:26:40', 8),
(29, '2013-11-10 11:26:40', 8),
(30, '2013-11-09 11:26:40', 8),
(31, '2013-11-08 11:26:40', 8),
(32, '2013-11-07 11:26:40', 8),
(33, '2013-11-06 11:26:40', 8),
(34, '2013-11-05 11:26:40', 8),
(35, '2013-11-04 11:26:40', 8),
(36, '2013-11-03 11:26:40', 8),
(37, '2013-11-02 11:26:40', 8),
(38, '2013-11-01 11:26:40', 8),
(39, '2013-10-31 11:26:40', 8),
(40, '2013-10-30 11:26:40', 8),
(41, '2013-10-29 11:26:40', 8),
(42, '2013-10-28 11:26:40', 8),
(43, '2013-10-27 11:26:40', 8),
(44, '2013-10-26 11:26:40', 8),
(45, '2013-10-25 11:26:40', 8),
(46, '2013-10-24 11:26:40', 8),
(47, '2013-10-23 11:26:40', 8),
(48, '2013-10-22 11:26:40', 8),
(49, '2013-10-21 11:26:40', 8),
(50, '2013-10-20 11:26:40', 8),
(51, '2013-10-19 11:26:40', 8),
(52, '2013-10-18 11:26:40', 8),
(53, '2013-10-17 11:26:40', 8),
(54, '2013-10-16 11:26:40', 8),
(55, '2013-10-15 11:26:40', 8),
(56, '2013-10-14 11:26:40', 8),
(57, '2013-10-13 11:26:40', 8),
(58, '2013-10-12 11:26:40', 8);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `AppUser`
--
ALTER TABLE `AppUser`
  ADD CONSTRAINT `fk_license_number` FOREIGN KEY (`LicenseID`) REFERENCES `License` (`ID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
