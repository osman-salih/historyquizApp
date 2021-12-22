package com.osman.salih;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class TopicsActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<TopicsCard> topicsCardsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topics);

        recyclerView = findViewById(R.id.recyclerView);
        initData();
        setRecyclerView();
    }

    private void setRecyclerView() {
        TopicsCardAdapter topicsCardAdapter = new TopicsCardAdapter(topicsCardsList);
        recyclerView.setAdapter(topicsCardAdapter);
        recyclerView.setHasFixedSize(true);
    }

    private void initData() {
        topicsCardsList = new ArrayList<>();

        topicsCardsList.add(new TopicsCard("Istanbul has had many names in its millennia-long history. When the city was first founded over 3,000 years ago, what was its name?", "It is also sometimes spelled Lygos. The city was founded sometime between the 13th and 11th centuries BC by Thracians, a tribe that lived mostly in South Eastern Europe. Very little of the original Ligos can still be seen today, except for some of the city walls."));
        topicsCardsList.add(new TopicsCard("Which ancient Roman Emperor sacked and then rebuilt Byzantium in AD 196? He also invaded what is now Scotland and expanded the Roman Empire to the Tigris River.", "Severus invaded the city as punishment for siding with his rival Pescennius Niger, who also claimed title of Roman Emperor. Severus easily claimed the city and renamed it Augusta Antonia, although it was quickly changed back to Byzantium. Under Roman rule, Byzantium would flourish and it would eventually be made into one of the most powerful cities in the world."));
        topicsCardsList.add(new TopicsCard("The Byzantine Emperor Justinian, who ruled from 527-565, is often considered the greatest leaders of the empire. One of his accomplishments was building the Hagia Sophia, still one of Istanbul's most famous attractions. Which of the following is NOT something the Hagia Sophia has been during its long history?", "When it was built in 532-537 (rebuilt 558-562 following an earthquake) it was originally a (pre-Schism) Orthodox church. It then became a Roman Catholic cathedral when Constantinople was captured during the Fourth Crusade in 1204. By 1261, it was reverted back to a Greek Orthodox cathedral when the Byzantines retook Constantinople. It was then converted into a mosque when the Ottomans invaded in 1453. It remained mosque even after the fall of the Ottoman Empire. In 1935, it became a museum and remains that way today.It should be noted that the current structure is not the original, but actually the third, begun in 532. The two previous ones burned down prior to the reign of Justinian."));
        topicsCardsList.add(new TopicsCard("What is the name of the famous building, seen in the picture in scale model, that was built in 1453 under the orders of Sultan Mehmed II and was to be the seat of Ottoman rule for 389 years?", "The Topkapi Palace a lavish complex and palace that was famous for mass gatherings and events that took place there. Among the buildings on site including a mint, shops and stalls, bakeries and magnificent courtyards. The palace has been renovated several times after fires and earthquakes badly damaged it over the centuries. The Tokapi Palace ceased being the seat of Ottoman Sultans in 1856 when the Dolmabahce Palace was used instead. Today, the Topkapi Palace is a museum and UNESCO World Heritage Site."));
        topicsCardsList.add(new TopicsCard("Who is the famous Ottoman architect and engineer who designed the Suleiman Mosque in Constantinople and is known for helping Suleiman the Magnificent accomplish his goal of expanding the arts within the Ottoman Empire?", "Mimar Sinan is credited with building and designing over 300 historical buildings in Istanbul, most of them mosques. Sinan is sometimes referred to as the Michelangelo of the Ottoman Empire. In addition to his own accomplishments, his students included Ustad Ahmad Lahauri, who designed the Taj Mahal, and Mimar Hayruddin, who designed the Stari Most in Mostar, Bosnia and Herzegovina."));
        topicsCardsList.add(new TopicsCard("Built in 1584 for Nurbanu Sultan, wife of Selim II, Cemberlitas Hamami is a famous example of what kind of structure, relatively common in modern Istanbul?", "It was designed by Mimar Sinan to be the most beautiful bath in the city. Today, Cemberlitas Hamami is a popular bathhouse for students as it is relatively inexpensive for being such a historic site. The men's pavilion is located on the historic side, while the women use a newer section but designed to look like the old."));
        topicsCardsList.add(new TopicsCard("During the Constantinople Massacre of 1821, the Ottomans attacked and massacred which group of the population?", "The Constantinople Massacre was in retaliation for the beginning of the Greek War of Independence, in which Greece would win its independence from the Ottoman Empire. Almost immediately after the war broke out, the Ottomans began attacking Greek citizens within Constantinople. Several prominent Greek citizens were executed, including Gregory V, the Ecumenical Patriarch of the Greek Church. The massacre was strongly condemned all over the world as it was seen as an attack on Christianity."));
        topicsCardsList.add(new TopicsCard("Who was the founder and the first president of the Republic of Turkey?", "Osman Ghazi was the founder of Ottoman Empire. Suleyman (the Magnificent) was the 10th Sultan of the Ottoman Empire. Ismet Inonu was the first prime minister of Turkey."));
        topicsCardsList.add(new TopicsCard("what was the name of the political party which ruled Turkey continuously from 1923 to 1950?", "The CHP ruled Turkey between 1923-1946 with a single party system. During these years two parties (Progressive Republican Party and Liberal Republican Party) were founded, but were closed down because they were deeply reactionary, despite their names. (The wanted to reverse many of Kemal Ataturk's reformes and turn Turkey into an Islamic theocracy). In 1946 the CHP won the elections and maintained its power."));
        topicsCardsList.add(new TopicsCard("Who were the president and prime minister of Turkey between 1950-1960?", "Celal Bayar had also been the prime minister in Mustafa Kemal Ataturk's last government. Celal Bayar and Adnan Menderes were both from Democratic Party. After the military coup, the party dissolved, Adnan Menderes were hanged."));
        topicsCardsList.add(new TopicsCard("Who was the first female prime minister of Turkey?", "Born in 1944, Tansu Ciller was prime minister from 1993 to 1996. Fatma Sahin co-founded the Justice and Development Party. Sabiha Gokcen was the first female pilot of Turkey. Halide Edip is a Turkish writer."));
        topicsCardsList.add(new TopicsCard("After World War I, Turkey waged a war against Greece.", "During WWI the allied powers had decided to give west Anatolia to Greece. After Mondros Armistice Agreement, Greece began to occupy Anatolia, but the Turks resisted it. After Turks had won Sakarya Battle, Greece went on the defensive. With the decisive Battle of Dumlupýnar in August 1922 the Greeks were defeated by Turkey."));
        topicsCardsList.add(new TopicsCard("The constitution used by Turkey went in effect in 1982.", "The Turkish Grand National Assembly was founded in 1920, three years before the establishment of the republic. Turkey has been governed under four constitutions: those of 1921, 1924, 1961 and 1982. The 1982 constitution has been amended a number of times."));
        topicsCardsList.add(new TopicsCard("What is the capital of Turkey?", "Istanbul is Turkey's largest city, but Ankara is the capital."));
        topicsCardsList.add(new TopicsCard("What is the name of the sea that Turkey's northern shore faces?", "Turkey's northern shore is Black Sea, while its southern shore is the Mediterranean Sea."));
        topicsCardsList.add(new TopicsCard("What is the state religion of Turkey?", "In 1928 the law designating Islam as the country's state religion was rescinded, and Turkey became a fully secular state."));
        topicsCardsList.add(new TopicsCard("The origin of Santa Claus is Bishop Nicholas of Turkey", "Bishop Nicholas (later Saint Nicholas) lived in Turkey in the 4th century."));
        topicsCardsList.add(new TopicsCard("Turkey straddles two continents, Europe and Asia.", "This is why the country is sometimes called a bridge between East and West."));
        topicsCardsList.add(new TopicsCard("The Ottoman Empire collapsed after the end of the Second World War.", "It collapsed after the end of World War I, not World War II."));
        topicsCardsList.add(new TopicsCard("Which of these countries has a national language that is related to Turkish?", "Azeri, Azerbaijan's national language, is a Turkic language. While there are some differences between the languages, they are mutually intelligible"));
    }

    @Override
    public void onBackPressed() {
        Intent cnn = new Intent( TopicsActivity.this, MainActivity.class );
        startActivity( cnn );
        finish();
    }
}