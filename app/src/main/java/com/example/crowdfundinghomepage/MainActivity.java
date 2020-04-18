package com.example.crowdfundinghomepage;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
        private RecyclerView mRecyclerView;
        private RecyclerView.Adapter mAdapter;
        private RecyclerView.LayoutManager mLayoutManager;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            //To display in actionbar
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setLogo(R.drawable.kisaanrakshakicon);
            getSupportActionBar().setDisplayUseLogoEnabled(true);
            ArrayList<SchemeEachItemClass> exampleList = new ArrayList<>();

            exampleList.add(new SchemeEachItemClass(R.drawable.kisaanrakshakicon, "National Mission For Sustainable Agriculture (NMSA)", "LNational Mission for Sustainable Agriculture (NMSA) has been formulated for enhancing agricultural productivity especially in rainfed areas focusing on integrated farming, water use efficiency, soil health management and synergizing resource conservation."));
            exampleList.add(new SchemeEachItemClass(R.drawable.kisaanrakshakicon, "Pradhan Mantri Krishi Sinchai Yojana (PMKSY)","Har Khet ko Pani Prime Minister Krishi Sinchayee Yojana Government of India is committed to accord high priority to water conservation and its management. To this effect Pradhan Mantri Krishi Sinchayee Yojana (PMKSY) has been formulated with the vision of extending the coverage of irrigation 'Har Khet ko pani' and improving water use efficiency 'More crop per drop' in a focused manner with end to end solution on various activities."));
            exampleList.add(new SchemeEachItemClass(R.drawable.kisaanrakshakicon, "Paramparagat Krishi Vikas Yojana (PKVY)", "The Paramparagat Krishi Vikas Yojana (PKVY), an initiative to promote organic farming in the country, was launched by the NDA government in 2015.According to the scheme, farmers will be encouraged to form groups or clusters and take to organic farming methods over large areas in the country."));
            exampleList.add(new SchemeEachItemClass(R.drawable.kisaanrakshakicon, "Pradhan Mantri Fasal Bima Yojana (PMFBY)", "Pradhan Mantri Fasal Bima Yojana (PMFBY) is the government sponsored crop insurance scheme that integrates multiple stakeholders on a single platform."));
            exampleList.add(new SchemeEachItemClass(R.drawable.kisaanrakshakicon, "Gramin Bhandaran Yojna", "Create scientific storage capacity with allied facilities in rural areas."));
            exampleList.add(new SchemeEachItemClass(R.drawable.kisaanrakshakicon, "Livestock insurance Scheme", "This scheme aims to provide protection mechanism to the farmers and cattle rearers against any eventual loss of their animals due to death and to demonstrate the benefit of the insurance of livestock to the people and popularize it with the ultimate goal of attaining qualitative improvement in livestock and their products."));
            exampleList.add(new SchemeEachItemClass(R.drawable.kisaanrakshakicon, "Scheme on Fisheries Training and Extension", "It was launched to provide training for fishery sector so as to assist in undertaking fisheries extension programmes effectively."));
            exampleList.add(new SchemeEachItemClass(R.drawable.kisaanrakshakicon, "National Scheme on Welfare of Fishermen","This scheme was launched to provide financial assistance to fishers for construction of house, community hall for recreation and common working place. It also aims to install tube-wells for drinking water and assistance during lean period through saving cum relief component."));
            exampleList.add(new SchemeEachItemClass(R.drawable.kisaanrakshakicon, "Micro Irrigation Fund (MIF)", "The government approved a dedicated Rs5,000 crore fund to bring more land area under micro-irrigation as part of its objective to boost agriculture production and farmers income.The fund has been set up under NABARD, which will provide this amount to states on concessional rate of interest to promote micro-irrigation, which currently has a coverage of only 10 million hectares as against the potential of 70 million hectares."));

            mRecyclerView = findViewById(R.id.recyclerView);
            mRecyclerView.setHasFixedSize(true);
            mLayoutManager = new LinearLayoutManager(this);
            mAdapter = new SchemeAdapter(exampleList);
            mRecyclerView.setLayoutManager(mLayoutManager);
            mRecyclerView.setAdapter(mAdapter);
        }

}
