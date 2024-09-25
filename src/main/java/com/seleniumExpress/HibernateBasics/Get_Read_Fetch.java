package com.seleniumExpress.HibernateBasics;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.seleniumExpress.Entity.Song;
import com.seleniumExpress.HibernateBasics.Utils.HibernateUtils;

public class Get_Read_Fetch {
	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

		if (sessionFactory != null) {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			//Song song = session.get(Song.class,3);
			Song song = session.load(Song.class,3);
			transaction.commit();
			System.out.println(song);
			System.out.println("Song Fetch Successfully");
		}

	}

}
