-- phpMyAdmin SQL Dump
-- version 4.0.6deb1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Nov 11, 2013 at 10:54 PM
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
  PRIMARY KEY (`UserID`),
  KEY `fk_license_number` (`LicenseID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `AppUser`
--

INSERT INTO `AppUser` (`UserID`, `LicenseID`, `FirstName`, `LastName`, `Gender`, `DOB`, `Weight`, `Height`, `ActivityLevel`, `TargetWeight`) VALUES
(3, 1, 'test', 'failed', 'm', '2013-11-07 00:00:00', 192, 65, 3, 110);

-- --------------------------------------------------------

--
-- Table structure for table `License`
--

CREATE TABLE IF NOT EXISTS `License` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `LicenseNumber` varchar(40) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `LicenseNumber` (`LicenseNumber`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `License`
--

INSERT INTO `License` (`ID`, `LicenseNumber`) VALUES
(1, 'hello');

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

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
  PRIMARY KEY (`MealItemID`),
  KEY `MealID` (`MealID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

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
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `AppUser`
--
ALTER TABLE `AppUser`
  ADD CONSTRAINT `fk_license_number` FOREIGN KEY (`LicenseID`) REFERENCES `License` (`ID`);

--
-- Constraints for table `Meal`
--
ALTER TABLE `Meal`
  ADD CONSTRAINT `Meal_ibfk_1` FOREIGN KEY (`WeekDayID`) REFERENCES `WeekDay` (`WeekDayID`);

--
-- Constraints for table `MealItem`
--
ALTER TABLE `MealItem`
  ADD CONSTRAINT `MealItem_ibfk_1` FOREIGN KEY (`MealID`) REFERENCES `Meal` (`MealID`);

--
-- Constraints for table `WeekDay`
--
ALTER TABLE `WeekDay`
  ADD CONSTRAINT `WeekDay_ibfk_1` FOREIGN KEY (`AppUserId`) REFERENCES `AppUser` (`UserID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
