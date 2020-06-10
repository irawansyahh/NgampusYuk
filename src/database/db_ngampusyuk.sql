-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 26, 2020 at 10:45 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_ngampusyuk`
--

-- --------------------------------------------------------

--
-- Table structure for table `scoreipa`
--

CREATE TABLE `scoreipa` (
  `english` varchar(4) NOT NULL,
  `indonesian` varchar(4) NOT NULL,
  `math` varchar(4) NOT NULL,
  `electivesubjects` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `scoreipa`
--

INSERT INTO `scoreipa` (`english`, `indonesian`, `math`, `electivesubjects`) VALUES
('44', '44', '44', '44'),
('77', '77', '77', '77'),
('80', '90', '80', '90'),
('80', '95', '85', '85'),
('90', '87', '88', '92');

-- --------------------------------------------------------

--
-- Table structure for table `scoreips`
--

CREATE TABLE `scoreips` (
  `english` varchar(4) NOT NULL,
  `indonesian` varchar(4) NOT NULL,
  `math` varchar(4) NOT NULL,
  `electivesubjects` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `scoreips`
--

INSERT INTO `scoreips` (`english`, `indonesian`, `math`, `electivesubjects`) VALUES
('88', '88', '88', '88'),
('90', '80', '80', '90');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `nama` varchar(30) NOT NULL,
  `gender` varchar(30) NOT NULL,
  `emailornohp` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`nama`, `gender`, `emailornohp`, `password`) VALUES
(' ', ' ', ' ', ' '),
(' ', ' ', 'Email or Phone Number', 'jPasswordField1'),
('ifdhal hadi', 'laki', 'ifdhalhadi19@gmail.com', 'manjomanjo'),
('irawan', 'laki', 'irawan@gmail.com', 'irawan'),
('Irsyad Muhamad', 'Laki-laki', 'irsyad@gmail.com', 'mbdmbdmbd'),
('Irawansyah', 'laki-laki', 'irws@telu.id', 'sinergi'),
('kamila', 'Perempuan', 'kamilahanum70@gmail.com', 'kamila'),
('kamila', 'perempuan', 'kamilahanum80@gmail.com', 'yoi');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`emailornohp`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
