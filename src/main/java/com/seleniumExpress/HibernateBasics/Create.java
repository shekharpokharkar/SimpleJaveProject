package com.seleniumExpress.HibernateBasics;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.seleniumExpress.Entity.Song;
import com.seleniumExpress.HibernateBasics.Utils.HibernateUtils;

public class Create {
	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

		if (sessionFactory != null) {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			Song s1 = new Song();
			s1.setSongId(3);
			s1.setSongName("Lag Ja gale3");
			s1.setSongSinger("Lata Didi3");
			session.save(s1);
			transaction.commit();
			System.out.println("Song Saved");
		}

	}

}
