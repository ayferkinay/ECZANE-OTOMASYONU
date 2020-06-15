-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 15 Haz 2020, 15:00:46
-- Sunucu sürümü: 10.4.11-MariaDB
-- PHP Sürümü: 7.4.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `eczane_otomasyonu`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `hasta`
--

CREATE TABLE `hasta` (
  `id` int(11) NOT NULL,
  `hasta_tc` text COLLATE utf8mb4_turkish_ci NOT NULL,
  `hasta_ad` text COLLATE utf8mb4_turkish_ci NOT NULL,
  `hasta_yas` text COLLATE utf8mb4_turkish_ci NOT NULL,
  `hasta_iletisim` text COLLATE utf8mb4_turkish_ci NOT NULL,
  `hasta_eposta` text COLLATE utf8mb4_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Tablo döküm verisi `hasta`
--

INSERT INTO `hasta` (`id`, `hasta_tc`, `hasta_ad`, `hasta_yas`, `hasta_iletisim`, `hasta_eposta`) VALUES
(9, '6352635263', 'ayşe öz', '30', '05555555555', 'ayseoz@gmail.com'),
(10, '2553659897', 'aylin yılmaz', '20', '052648567', 'aylin@gmail.com'),
(12, '898426846', 'mehmet demir', '45', '0532987654', 'mehmet@gmail.com');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `ilac`
--

CREATE TABLE `ilac` (
  `id` int(11) NOT NULL,
  `ilacBarkodNo` text COLLATE utf8mb4_turkish_ci NOT NULL,
  `ilacAd` text COLLATE utf8mb4_turkish_ci NOT NULL,
  `ilacMg` text COLLATE utf8mb4_turkish_ci NOT NULL,
  `ilacAdet` text COLLATE utf8mb4_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Tablo döküm verisi `ilac`
--

INSERT INTO `ilac` (`id`, `ilacBarkodNo`, `ilacAd`, `ilacMg`, `ilacAdet`) VALUES
(6, '45641631', 'parol', '32', '8'),
(7, '3265321', 'katarin', '20', '3');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `hasta`
--
ALTER TABLE `hasta`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `ilac`
--
ALTER TABLE `ilac`
  ADD PRIMARY KEY (`id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `hasta`
--
ALTER TABLE `hasta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- Tablo için AUTO_INCREMENT değeri `ilac`
--
ALTER TABLE `ilac`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
