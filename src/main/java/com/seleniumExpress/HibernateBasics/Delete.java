package com.seleniumExpress.HibernateBasics;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.seleniumExpress.Entity.Song;
import com.seleniumExpress.HibernateBasics.Utils.HibernateUtils;

public class Delete {
	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

		if (sessionFactory != null) {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			Song song = session.get(Song.class,2);
			session.delete(song);
			transaction.commit();
			System.out.println("Song Deleted");
		}

	}

}
