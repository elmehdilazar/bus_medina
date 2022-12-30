-- phpMyAdmin SQL Dump
-- version 5.3.0-dev+20220627.78b2c1f4eb
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 30, 2022 at 06:35 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bus`
--

-- --------------------------------------------------------

--
-- Table structure for table `abonnement`
--

CREATE TABLE `abonnement` (
  `id_abonnement` int(11) NOT NULL,
  `date_debut` date DEFAULT NULL,
  `date_fin` date DEFAULT NULL,
  `type_abonnement` varchar(45) DEFAULT NULL,
  `id_ligne` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `idAdministrateur` int(11) NOT NULL,
  `nom_admin` varchar(45) DEFAULT NULL,
  `prenom_admin` varchar(45) DEFAULT NULL,
  `login_admin` varchar(45) DEFAULT NULL,
  `pass_admin` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `ligne`
--

CREATE TABLE `ligne` (
  `id_ligne` int(11) NOT NULL,
  `origine` varchar(45) DEFAULT NULL,
  `destination` varchar(45) DEFAULT NULL,
  `tarif` double DEFAULT NULL,
  `id_admin` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `personne`
--

CREATE TABLE `personne` (
  `CIN_PERSONNE` varchar(20) NOT NULL,
  `nom_perssonne` varchar(45) DEFAULT NULL,
  `prenom_personne` varchar(45) DEFAULT NULL,
  `numero_personne` int(11) DEFAULT NULL,
  `adresse_personne` varchar(45) DEFAULT NULL,
  `email_personne` varchar(45) DEFAULT NULL,
  `date_naissance` date DEFAULT NULL,
  `id_abonnement` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `quartier`
--

CREATE TABLE `quartier` (
  `idQuartier` int(11) NOT NULL,
  `nom_quartier` varchar(45) DEFAULT NULL,
  `stations_idstations` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `stations`
--

CREATE TABLE `stations` (
  `idstations` int(11) NOT NULL,
  `id_ligne` int(11) DEFAULT NULL,
  `nom_station` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `abonnement`
--
ALTER TABLE `abonnement`
  ADD PRIMARY KEY (`id_abonnement`),
  ADD KEY `id_ligne__idx` (`id_ligne`);

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`idAdministrateur`);

--
-- Indexes for table `ligne`
--
ALTER TABLE `ligne`
  ADD PRIMARY KEY (`id_ligne`),
  ADD KEY `id_admin_idx` (`id_admin`);

--
-- Indexes for table `personne`
--
ALTER TABLE `personne`
  ADD PRIMARY KEY (`CIN_PERSONNE`),
  ADD KEY `id_abb_idx` (`id_abonnement`);

--
-- Indexes for table `quartier`
--
ALTER TABLE `quartier`
  ADD PRIMARY KEY (`idQuartier`),
  ADD KEY `fk_Quartier_stations1_idx` (`stations_idstations`);

--
-- Indexes for table `stations`
--
ALTER TABLE `stations`
  ADD PRIMARY KEY (`idstations`),
  ADD KEY `ligne_for_idx` (`id_ligne`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `idAdministrateur` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `abonnement`
--
ALTER TABLE `abonnement`
  ADD CONSTRAINT `id_ligne_` FOREIGN KEY (`id_ligne`) REFERENCES `ligne` (`id_ligne`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `ligne`
--
ALTER TABLE `ligne`
  ADD CONSTRAINT `id_admin` FOREIGN KEY (`id_admin`) REFERENCES `administrateur` (`idAdministrateur`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Constraints for table `personne`
--
ALTER TABLE `personne`
  ADD CONSTRAINT `id_abb` FOREIGN KEY (`id_abonnement`) REFERENCES `abonnement` (`id_abonnement`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `quartier`
--
ALTER TABLE `quartier`
  ADD CONSTRAINT `fk_Quartier_stations1` FOREIGN KEY (`stations_idstations`) REFERENCES `stations` (`idstations`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `stations`
--
ALTER TABLE `stations`
  ADD CONSTRAINT `ligne_for` FOREIGN KEY (`id_ligne`) REFERENCES `ligne` (`id_ligne`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;



