-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 19, 2024 at 10:37 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bonheur_itangishaka_222009138_tcs`
--

-- --------------------------------------------------------

--
-- Table structure for table `activity`
--

CREATE TABLE `activity` (
  `ID` int(11) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Description` varchar(255) NOT NULL,
  `Date` datetime(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `activity`
--

INSERT INTO `activity` (`ID`, `Name`, `Description`, `Date`) VALUES
(1, 'dgdv', 'sfg', '0000-00-00 00:00:00.000000'),
(2, 'dsf', 'dqe', '0000-00-00 00:00:00.000000');

-- --------------------------------------------------------

--
-- Table structure for table `application`
--

CREATE TABLE `application` (
  `ID` int(11) NOT NULL,
  `TouristID` int(11) NOT NULL,
  `PlaceID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `application`
--

INSERT INTO `application` (`ID`, `TouristID`, `PlaceID`) VALUES
(1, 333, 344),
(2, 12, 1),
(3, 1, 2),
(4, 1, 2),
(6, 7, 8);

-- --------------------------------------------------------

--
-- Table structure for table `place`
--

CREATE TABLE `place` (
  `ID` int(11) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `Description` varchar(255) NOT NULL,
  `Location` varchar(50) NOT NULL,
  `Price` int(11) NOT NULL,
  `Date` datetime(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `place`
--

INSERT INTO `place` (`ID`, `Name`, `Description`, `Location`, `Price`, `Date`) VALUES
(9, 'gss', 'qsq', '11', 111, '2000-01-23 00:00:00.000000'),
(10, 'ggg', 'ddd', 'wwe', 12, '0000-00-00 00:00:00.000000'),
(11, 'g', 'ee', 'ee', 33, '0000-00-00 00:00:00.000000'),
(12, 'huye', 'welcome in huye', 'huye district', 250, '0000-00-00 00:00:00.000000'),
(13, 'hh', 'hj', 'oi', 88, '0000-00-00 00:00:00.000000'),
(14, 'df', 'df', 'd', 23, '0000-00-00 00:00:00.000000'),
(15, 'df', 'we', 'we', 12, '2020-02-03 00:00:00.000000'),
(16, 'eric', 'welcome', 'huye', 12, '2020-02-03 00:00:00.000000'),
(17, 'yyy', 'hyy', 'hy', 55, '2021-01-01 00:00:00.000000');

-- --------------------------------------------------------

--
-- Table structure for table `tourist`
--

CREATE TABLE `tourist` (
  `ID` int(11) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Phone` int(25) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Password` varchar(30) NOT NULL,
  `ConfirmPassword` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tourist`
--

INSERT INTO `tourist` (`ID`, `Name`, `Phone`, `Email`, `Password`, `ConfirmPassword`) VALUES
(1, 'rrr', 98, 'dhdhd', 'fsgsgsgh', ''),
(2, 'kalisa', 780482542, 'bonh@gmail.com', 'dddddddd', ''),
(3, 'kalisa', 780482542, 'bonh@gmail.com', 'ddddddd999', ''),
(4, 'wwr', 245, 'xgdg3', 'dfg', ''),
(5, 'boneri', 780482542, 'bonheuritangishaka72@gmail.com', 'bonheur', ''),
(6, 'all', 9, 'dfg', '12', '12');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `activity`
--
ALTER TABLE `activity`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `application`
--
ALTER TABLE `application`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `place`
--
ALTER TABLE `place`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `tourist`
--
ALTER TABLE `tourist`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `activity`
--
ALTER TABLE `activity`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `application`
--
ALTER TABLE `application`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `place`
--
ALTER TABLE `place`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `tourist`
--
ALTER TABLE `tourist`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
