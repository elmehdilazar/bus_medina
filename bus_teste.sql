-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : mer. 11 jan. 2023 à 01:03
-- Version du serveur : 10.4.22-MariaDB
-- Version de PHP : 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `bus`
--

-- --------------------------------------------------------

--
-- Structure de la table `abonnement`
--

CREATE TABLE `abonnement` (
  `id_abonnement` int(11) NOT NULL,
  `date_debut` date DEFAULT NULL,
  `date_fin` date DEFAULT NULL,
  `type_abonnement` varchar(45) DEFAULT NULL,
  `id_client` text NOT NULL,
  `id_ligne` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `abonnement`
--

INSERT INTO `abonnement` (`id_abonnement`, `date_debut`, `date_fin`, `type_abonnement`, `id_client`, `id_ligne`) VALUES
(1, '2023-01-10', '2023-01-31', 'etudiant', 'a2', 1),
(2, '2023-01-10', '2023-01-10', 'travail', 'elmehdi', 1);

-- --------------------------------------------------------

--
-- Structure de la table `admin`
--

CREATE TABLE `admin` (
  `idAdministrateur` int(11) NOT NULL,
  `nom_admin` varchar(45) DEFAULT NULL,
  `prenom_admin` varchar(45) DEFAULT NULL,
  `login_admin` varchar(45) DEFAULT NULL,
  `pass_admin` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `admin`
--

INSERT INTO `admin` (`idAdministrateur`, `nom_admin`, `prenom_admin`, `login_admin`, `pass_admin`) VALUES
(1, 'mehdi', 'lhazar', 'mehdi', '0000');

-- --------------------------------------------------------

--
-- Structure de la table `ligne`
--

CREATE TABLE `ligne` (
  `id_ligne` int(11) NOT NULL,
  `nom_ligne` text NOT NULL,
  `origine` varchar(45) DEFAULT NULL,
  `destination` varchar(45) DEFAULT NULL,
  `tarif` double DEFAULT NULL,
  `id_admin` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `ligne`
--

INSERT INTO `ligne` (`id_ligne`, `nom_ligne`, `origine`, `destination`, `tarif`, `id_admin`) VALUES
(1, 'ligne_2', 'Moulay Youssef', 'Marjane', 5, 1),
(2, 'ligne_1', 'marjane ainsbaa', 'maarif', 5, 1),
(3, 'lige_3', 'Bernousi', 'Musé Alsa', 5, 1),
(4, 'ligne_4', 'Place De la concorde', 'Anassi', 5, 1);

-- --------------------------------------------------------

--
-- Structure de la table `personne`
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

--
-- Déchargement des données de la table `personne`
--

INSERT INTO `personne` (`CIN_PERSONNE`, `nom_perssonne`, `prenom_personne`, `numero_personne`, `adresse_personne`, `email_personne`, `date_naissance`, `id_abonnement`) VALUES
('a2', 'lazar', 'mehdi', 4579812, 'rabat', 'mehdi@gmail.com', '2016-10-05', 0),
('elmehdi', 'wahe', 'adnane', 1915262, 'Casablanca', 'adnane@gmail.com', '2023-01-10', 2);

-- --------------------------------------------------------

--
-- Structure de la table `quartier`
--

CREATE TABLE `quartier` (
  `idQuartier` int(11) NOT NULL,
  `nom_quartier` varchar(45) DEFAULT NULL,
  `stations_idstations` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `quartier`
--

INSERT INTO `quartier` (`idQuartier`, `nom_quartier`, `stations_idstations`) VALUES
(1, 'Sidi Bernoussi', 1),
(2, 'Ain Sbaa', 3),
(4, 'Dar Lamane', 8),
(5, 'Belvédère', 5),
(6, 'La Gironde', 3),
(7, 'La Résistance', 8),
(8, 'Anassi', 2);

-- --------------------------------------------------------

--
-- Structure de la table `stations`
--

CREATE TABLE `stations` (
  `idstations` int(11) NOT NULL,
  `id_ligne` int(11) DEFAULT NULL,
  `nom_station` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `stations`
--

INSERT INTO `stations` (`idstations`, `id_ligne`, `nom_station`) VALUES
(2, 3, 'Dar Lamane-Cnss'),
(3, 4, 'Eglise Zerktouni'),
(4, 2, 'Espace Les Palmiers'),
(5, 1, 'Musée Alsa'),
(6, 3, 'Ibnou Chahid'),
(7, 4, 'Apaei'),
(8, 2, 'Tribunal Ain Sbaa'),
(9, 3, 'Maarouf');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `abonnement`
--
ALTER TABLE `abonnement`
  ADD PRIMARY KEY (`id_abonnement`),
  ADD KEY `id_ligne__idx` (`id_ligne`);

--
-- Index pour la table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`idAdministrateur`);

--
-- Index pour la table `ligne`
--
ALTER TABLE `ligne`
  ADD PRIMARY KEY (`id_ligne`),
  ADD KEY `id_admin_idx` (`id_admin`);

--
-- Index pour la table `personne`
--
ALTER TABLE `personne`
  ADD PRIMARY KEY (`CIN_PERSONNE`),
  ADD KEY `id_abb_idx` (`id_abonnement`);

--
-- Index pour la table `quartier`
--
ALTER TABLE `quartier`
  ADD PRIMARY KEY (`idQuartier`),
  ADD KEY `fk_Quartier_stations1_idx` (`stations_idstations`);

--
-- Index pour la table `stations`
--
ALTER TABLE `stations`
  ADD PRIMARY KEY (`idstations`),
  ADD KEY `ligne_for_idx` (`id_ligne`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `admin`
--
ALTER TABLE `admin`
  MODIFY `idAdministrateur` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `abonnement`
--
ALTER TABLE `abonnement`
  ADD CONSTRAINT `id_ligne_` FOREIGN KEY (`id_ligne`) REFERENCES `ligne` (`id_ligne`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
