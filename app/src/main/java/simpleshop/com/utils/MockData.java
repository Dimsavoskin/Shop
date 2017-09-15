package simpleshop.com.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import simpleshop.com.model.books.Book;
import simpleshop.com.model.books.CookeryBook;
import simpleshop.com.model.books.EsotericsBook;
import simpleshop.com.model.books.ProgrammingBook;
import simpleshop.com.model.disc.Disc;

public class MockData {

    public static final String EMPTY_STRING = "";

    static public List<Book> getBooks() {
        final Random random = new Random();
        final List<Book> books = new ArrayList<>();
        books.add(new ProgrammingBook("CLR via C#", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, random.nextInt(500) + 10, "C#"));
        books.add(new EsotericsBook("Трансерфинг реальности", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, random.nextInt(500) + 10, random.nextInt(21)));
        books.add(new CookeryBook("Гастрономическая энциклопедия", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, random.nextInt(500) + 10, "Картошка"));
        books.add(new EsotericsBook("Энергия жизни", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, random.nextInt(500) + 10, random.nextInt(21)));
        books.add(new CookeryBook("Казан, мангал и другие мужские удовольствия", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, random.nextInt(500) + 10, "Рис"));
        books.add(new CookeryBook("О еде: строго конфиденциально", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, random.nextInt(500) + 10, "Лук"));
        books.add(new EsotericsBook("Принципы управления реальностью", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, random.nextInt(500) + 10, random.nextInt(21)));
        books.add(new ProgrammingBook("Ruby Hacking Guide", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, random.nextInt(500) + 10, "Ruby"));
        books.add(new CookeryBook("Хиты советской кухни. По ГОСТу и не только", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, random.nextInt(500) + 10, "Тушенка"));
        books.add(new ProgrammingBook("Язык программирования C", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, random.nextInt(500) + 10, "C"));
        books.add(new CookeryBook("Еда без правил. Простые принципы хорошей кухни", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, random.nextInt(500) + 10, "Говядина"));
        books.add(new EsotericsBook("Расписание школы жизни", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, random.nextInt(500) + 10, random.nextInt(21)));
        books.add(new ProgrammingBook("Microservices for Java Developers", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, random.nextInt(500) + 10, "Java"));
        books.add(new CookeryBook("О чем Эйнштейн рассказал своему повару", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, random.nextInt(500) + 10, "Вермишель"));
        books.add(new EsotericsBook("Роза Мира", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, random.nextInt(500) + 10, random.nextInt(21)));
        books.add(new CookeryBook("Пир льда и огня", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, random.nextInt(500) + 10, "Сосиски"));
        books.add(new CookeryBook("Пироговедение для начинающих", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, random.nextInt(500) + 10, "Мука"));
        return books;
    }

    static public List<Disc> getDisc() {
        final Random random = new Random();
        final List<Disc> discs = new ArrayList<>();
        discs.add(new Disc("The Beatles", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, Disc.DiscType.CD, Disc.DiscContent.MUSIC));
        discs.add(new Disc("Pink Floyd: Momentary Lapses", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, Disc.DiscType.CD, Disc.DiscContent.VIDEO));
        discs.add(new Disc("Led Zeppelin", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, Disc.DiscType.DVD, Disc.DiscContent.MUSIC));
        discs.add(new Disc("Guns N’Roses", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, Disc.DiscType.CD, Disc.DiscContent.MUSIC));
        discs.add(new Disc("B.B. King: Live At Montreux", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, Disc.DiscType.DVD, Disc.DiscContent.VIDEO));
        discs.add(new Disc("The Rolling Stones", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, Disc.DiscType.DVD, Disc.DiscContent.MUSIC));
        discs.add(new Disc("Microsoft Office 365", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, Disc.DiscType.CD, Disc.DiscContent.SOFTWARE));
        discs.add(new Disc("Shakira: En Vivo Desde Paris", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, Disc.DiscType.DVD, Disc.DiscContent.VIDEO));
        discs.add(new Disc("Visual studio 2015", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, Disc.DiscType.DVD, Disc.DiscContent.SOFTWARE));
        discs.add(new Disc("ABBA", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, Disc.DiscType.CD, Disc.DiscContent.MUSIC));
        discs.add(new Disc("Queen", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, Disc.DiscType.DVD, Disc.DiscContent.MUSIC));
        discs.add(new Disc("Pink Floyd: The Dark Side Of The Moon ", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, Disc.DiscType.CD, Disc.DiscContent.VIDEO));
        discs.add(new Disc("Boney M", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, Disc.DiscType.CD, Disc.DiscContent.MUSIC));
        discs.add(new Disc("IntelliJ IDEA", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, Disc.DiscType.DVD, Disc.DiscContent.SOFTWARE));
        discs.add(new Disc("Kaspersky Internet Security", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, Disc.DiscType.CD, Disc.DiscContent.SOFTWARE));
        return discs;
    }
}
