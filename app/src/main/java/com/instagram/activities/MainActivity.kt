package com.instagram.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.instagram.R
import com.instagram.models.PostModel
import com.instagram.models.StoryModel
import java.util.*

class MainActivity : AppCompatActivity() {
    var btmNav: BottomNavigationView? = null
    var floatbtn: FloatingActionButton? = null

    //    RecyclerView rvStories;
    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btmNav = findViewById<BottomNavigationView>(R.id.nav_view)
        floatbtn = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        //        rvStories = findViewById(R.id.rvStories);
        getSupportActionBar()?.hide()
        val appBarConfiguration: AppBarConfiguration = AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_search, R.id.navigation_add, R.id.navigation_liked, R.id.navigation_profile
        ).build()
        val navController: NavController = Navigation.findNavController(this, R.id.nav_host_fragment)
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration)
       // NavigationUI.setupWithNavController(btmNav, navController)

        //float button
        floatbtn?.setOnClickListener {
            val intent = Intent(this, Postadd::class.java)
            startActivity(intent)
            }

//        Sample Datas------------------------
        listPosts.add(PostModel("1", "Pooja Pokharel", "new nepali actress ANMOL KC.. !! ", R.drawable.newimage, R.drawable.ujj))
        listPosts.add(PostModel("2", "kp oli", "I am play vital role.", R.drawable.post4, R.drawable.profilepic2))
        listPosts.add(PostModel("3", "pooja pokhrel", "world best team!", R.drawable.post7, R.drawable.ujj))
        listPosts.add(PostModel("4", "Meme Nepal", "jocks nepal", R.drawable.jok, R.drawable.memenepal))
        listPosts.add(PostModel("5", "anmol kc", "upcomming films poster", R.drawable.post5, R.drawable.logo_softwarica))
        listPosts.add(PostModel("6", "pooja pokharel", "softwarica college routine", R.drawable.postimg, R.drawable.ujj))
        listPosts.add(PostModel("7", "Meme Nepal", "joks nepal pvt ltd", R.drawable.jok, R.drawable.memenepal))
        listPosts.add(PostModel("8", "softwarica", "softwarica holidays", R.drawable.post8, R.drawable.logo_softwarica))
        listPosts.add(PostModel("9", "Pooja Pokharel", "Nepali cricket team photo united !!", R.drawable.nepaliteam, R.drawable.ujj))
        listPosts.add(PostModel("10", "Nepali Team", "Kp oli photo on post like!!", R.drawable.profilepic2, R.drawable.nepaliteam))
        listStories.add(StoryModel("1", "pooja pokhrel", R.drawable.ujj, 0))
        listStories.add(StoryModel("kp oli", R.drawable.profilepic2))
        listStories.add(StoryModel("softwarica", R.drawable.logo_softwarica))
        listStories.add(StoryModel("Meme Nepal", R.drawable.memenepal))
        listStories.add(StoryModel("Nepal Team", R.drawable.nepaliteam))
    }

    companion object {
        //    Fragment selectedFragment = null;
        var listPosts: MutableList<PostModel> = ArrayList<PostModel>()
        var listStories: MutableList<StoryModel> = ArrayList<StoryModel>()
    }
}