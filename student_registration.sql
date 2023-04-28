-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 28, 2023 at 06:41 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `student_registration`
--

-- --------------------------------------------------------

--
-- Table structure for table `batch_details`
--

CREATE TABLE `batch_details` (
  `course_code` char(10) NOT NULL,
  `batch_number` char(20) NOT NULL,
  `batch_name` char(50) NOT NULL,
  `batch_capacity` int(5) NOT NULL,
  `tution_fee` decimal(9,2) NOT NULL,
  `batch_start_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `batch_details`
--

INSERT INTO `batch_details` (`course_code`, `batch_number`, `batch_name`, `batch_capacity`, `tution_fee`, `batch_start_date`) VALUES
('HD', 'HD-2023-01', 'Haridresser-2023-01', 20, '500.00', '2023-04-03');

-- --------------------------------------------------------

--
-- Table structure for table `course_details`
--

CREATE TABLE `course_details` (
  `course_code` char(10) NOT NULL,
  `course_name` char(20) NOT NULL,
  `level` char(7) NOT NULL,
  `type` char(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `course_details`
--

INSERT INTO `course_details` (`course_code`, `course_name`, `level`, `type`) VALUES
('HD', 'Haridresser', 'Level 3', 'PT');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `batch_details`
--
ALTER TABLE `batch_details`
  ADD PRIMARY KEY (`batch_number`),
  ADD KEY `foreign_key` (`course_code`);

--
-- Indexes for table `course_details`
--
ALTER TABLE `course_details`
  ADD PRIMARY KEY (`course_code`,`level`,`type`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `batch_details`
--
ALTER TABLE `batch_details`
  ADD CONSTRAINT `foreign_key` FOREIGN KEY (`course_code`) REFERENCES `course_details` (`course_code`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
