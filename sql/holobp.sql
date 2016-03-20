-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Erstellungszeit: 14. Mrz 2016 um 21:49
-- Server-Version: 5.6.26
-- PHP-Version: 5.6.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `holobp`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `benutzerstammdaten`
--

CREATE TABLE IF NOT EXISTS `benutzerstammdaten` (
  `vorname` varchar(255) NOT NULL,
  `nachname` varchar(255) NOT NULL,
  `adresse` text NOT NULL,
  `bundesstaat` varchar(255) NOT NULL,
  `stadt` varchar(255) NOT NULL,
  `adresse_zusatz` varchar(255) NOT NULL,
  `plz` varchar(255) NOT NULL,
  `land` varchar(255) NOT NULL,
  `geburtstag` date NOT NULL,
  `email1` varchar(255) NOT NULL,
  `email2` varchar(255) NOT NULL,
  `email3` varchar(255) NOT NULL,
  `titel` varchar(255) NOT NULL,
  `subtitel` varchar(255) NOT NULL,
  `geburtsname` varchar(255) NOT NULL,
  `kuenstlername` varchar(255) NOT NULL,
  `geburtsort` varchar(255) NOT NULL,
  `sprache` varchar(255) NOT NULL,
  `interessen_id` int(9) NOT NULL,
  `id` int(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `interesse`
--

CREATE TABLE IF NOT EXISTS `interesse` (
  `name` varchar(255) NOT NULL,
  `interessen_id` int(9) NOT NULL,
  `id` int(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `id` int(9) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Daten für Tabelle `user`
--

INSERT INTO `user` (`username`, `password`, `email`, `id`) VALUES
('contact@allangrunert.de', 'test', 'contact@allangrunert.de', 1),
('contact@allangrunert.de', 'test', 'contact@allangrunert.de', 2);

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `benutzerstammdaten`
--
ALTER TABLE `benutzerstammdaten`
  ADD PRIMARY KEY (`id`);

--
-- Indizes für die Tabelle `interesse`
--
ALTER TABLE `interesse`
  ADD PRIMARY KEY (`id`);

--
-- Indizes für die Tabelle `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `benutzerstammdaten`
--
ALTER TABLE `benutzerstammdaten`
  MODIFY `id` int(9) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `interesse`
--
ALTER TABLE `interesse`
  MODIFY `id` int(9) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `user`
--
ALTER TABLE `user`
  MODIFY `id` int(9) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
