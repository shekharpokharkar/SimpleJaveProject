package com.seleniumExpress.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "song")
public class Song {
//Unique id 
	@Id
	@Column(name = "Sid")
	private int songId;
	@Column(name = "SName")
	private String songName;
	@Column(name = "Ssinger")
	private String songSinger;

	public int getSongId() {
		return songId;
	}

	public void setSongId(int songId) {
		this.songId = songId;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getSongSinger() {
		return songSinger;
	}

	public void setSongSinger(String songSinger) {
		this.songSinger = songSinger;
	}

	@Override
	public String toString() {
		return "Song [songId=" + songId + ", songName=" + songName + ", songSinger=" + songSinger + "]";
	}

}
