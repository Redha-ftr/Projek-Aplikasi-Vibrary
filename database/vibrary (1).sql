-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 17, 2021 at 08:54 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `vibrary`
--

-- --------------------------------------------------------

--
-- Table structure for table `anggota`
--

CREATE TABLE `anggota` (
  `id` varchar(6) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `tgllahir` varchar(30) NOT NULL,
  `jk` varchar(10) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `nik` int(12) NOT NULL,
  `notelp` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `anggota`
--

INSERT INTO `anggota` (`id`, `nama`, `tgllahir`, `jk`, `alamat`, `nik`, `notelp`) VALUES
('A221', 'Gyu', 'kel, 23 Januari 1990', 'Laki-laki', 'Bali', 343434343, 628756789),
('A222', 'Hoshimaru', 'Seoul, 16 Juni 19196', 'Laki-laki', 'Seoul', 5546898, 17738967),
('A224', 'REDHA', 'L, 27 Desember 2000', 'Perempuan', 'Bukittinggi', 2000266735, 62876543),
('SVT12', 'hoshimaru', 'Seoul, 16 Juni 19196', 'Laki-laki', '55,Geryi', 5546898, 177389);

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `id` varchar(6) NOT NULL,
  `judul` varchar(30) NOT NULL,
  `pengarang` varchar(50) NOT NULL,
  `penerbit` varchar(50) NOT NULL,
  `tahun` int(11) NOT NULL,
  `isbn` int(20) NOT NULL,
  `Kat` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`id`, `judul`, `pengarang`, `penerbit`, `tahun`, `isbn`, `Kat`) VALUES
('B001', 'Tentang Kita', 'Reda Gaudiamo', 'Stiletto Book', 2015, 123456789, 'Novel'),
('B002', 'Harry Potter 4', 'J.K Rowling', 'Pottermore', 2000, 657664545, 'Novel'),
('B004', 'Duduk dulu', 'Syahid Muhammad', 'Gradien Mediatama', 2021, 9786022, 'Self Improvement'),
('B005', 'Sejarah Indonesia Modern', 'rickles', 'media', 2015, 67748857, 'Sejarah');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` varchar(6) NOT NULL,
  `password` varchar(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `peminjaman`
--

CREATE TABLE `peminjaman` (
  `idPinjam` varchar(6) NOT NULL,
  `idAnggota` varchar(6) NOT NULL,
  `idBuku` varchar(6) NOT NULL,
  `idPetugas` varchar(6) NOT NULL,
  `tglPinjam` date NOT NULL DEFAULT current_timestamp(),
  `tglKembali` date NOT NULL,
  `tgldikembalikan` date NOT NULL,
  `status` varchar(10) NOT NULL,
  `terlambat` int(11) NOT NULL,
  `denda` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `peminjaman`
--

INSERT INTO `peminjaman` (`idPinjam`, `idAnggota`, `idBuku`, `idPetugas`, `tglPinjam`, `tglKembali`, `tgldikembalikan`, `status`, `terlambat`, `denda`) VALUES
('T555', 'A221', 'B002', 'admin', '2021-06-18', '2021-06-24', '2021-06-30', 'Kembali', 3, 1500),
('T556', 'A221', 'B002', 'XX096', '2021-06-18', '2021-06-24', '2021-06-18', 'Pinjam', 0, 0),
('T666', 'A222', 'B002', 'TES1', '2021-06-09', '2021-06-23', '2021-06-25', 'Kembali', 2, 1000);

-- --------------------------------------------------------

--
-- Table structure for table `petugas`
--

CREATE TABLE `petugas` (
  `id` varchar(6) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `jk` varchar(15) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `nik` int(12) NOT NULL,
  `notelp` int(14) NOT NULL,
  `password` varchar(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `petugas`
--

INSERT INTO `petugas` (`id`, `nama`, `jk`, `alamat`, `nik`, `notelp`, `password`) VALUES
('admin', 'admin', 'Laki-laki', 'admin', 2222222, 12453432, 'admin'),
('TES1', 'tes', 'Laki-laki', 'tes', 1, 1, 'tes'),
('XX096', 'Rajendra', 'Laki-laki', 'Majalengka', 2345678, 823456745, 'reano'),
('XX112', 'Syafina', 'Perempuan', 'state, 565', 12234545, 123434545, '1234'),
('XX234', 'Arvelino', 'Laki-laki', 'jalan, 56 ', 2000897856, 628675643, 'wonu');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `anggota`
--
ALTER TABLE `anggota`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idKat` (`Kat`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD PRIMARY KEY (`idPinjam`),
  ADD KEY `idAnggota` (`idAnggota`),
  ADD KEY `idBuku` (`idBuku`),
  ADD KEY `idPetugas` (`idPetugas`);

--
-- Indexes for table `petugas`
--
ALTER TABLE `petugas`
  ADD PRIMARY KEY (`id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD CONSTRAINT `peminjaman_ibfk_1` FOREIGN KEY (`idAnggota`) REFERENCES `anggota` (`id`),
  ADD CONSTRAINT `peminjaman_ibfk_2` FOREIGN KEY (`idBuku`) REFERENCES `buku` (`id`),
  ADD CONSTRAINT `peminjaman_ibfk_3` FOREIGN KEY (`idPetugas`) REFERENCES `petugas` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
