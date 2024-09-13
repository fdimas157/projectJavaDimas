CREATE DATABASE pegadaian_project;
USE pegadaian_project;

CREATE TABLE anggota(
	username VARCHAR(50) PRIMARY KEY,
	pass VARCHAR(50),
	nama_depan VARCHAR(50),
	nama_belakang VARCHAR(50),
	no_hp CHAR(13),
	tgl_lahir DATE,
	jenis_kelamin ENUM('l', 'p')
);

CREATE TABLE gadai(
	username VARCHAR(50),
	jenis VARCHAR(50),
	jumlah INT,
	berat INT,
	surat VARCHAR(50),
	kantor VARCHAR(100),
	jadwal DATE,
	waktu VARCHAR(10),
	total INT,
	CONSTRAINT fk_user1 FOREIGN KEY(username) REFERENCES anggota(username)
);

CREATE TABLE upload_foto(
	username VARCHAR(50),
	link VARCHAR(100),
	CONSTRAINT fk_user2 FOREIGN KEY(username) REFERENCES anggota(username)
);