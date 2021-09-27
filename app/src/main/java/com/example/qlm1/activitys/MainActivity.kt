package com.example.qlm1.activitys

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.qlm1.Page
import com.example.qlm1.ui.page.Home.HomePage
import com.example.qlm1.ui.page.Mine.MinePage
import com.example.qlm1.ui.page.Sub.SubPage
import com.example.qlm1.ui.theme.*
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalPagerApi
class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Qlm1Theme {
                // A surface container using the 'background' color from the theme
                Surface(color = GrayBackGround) {
                    val scaffoldState = rememberScaffoldState()
                    val scope = rememberCoroutineScope()
                    val navController = rememberNavController()
                    Scaffold(
                        scaffoldState = scaffoldState,
                        bottomBar = {
                            val items = listOf(
                                Page.Home,
                                Page.Sub,
                                Page.Local,
                                Page.Mine
                            )
                            BottomNavigation(backgroundColor = BottomBarBackground) {
                                val navBackStackEntry by navController.currentBackStackEntryAsState()
                                val currentDestination = navBackStackEntry?.destination
                                items.forEach { page ->
                                    BottomNavigationItem(
                                        icon = {
                                            Icon(
                                                imageVector = page.icon,
                                                contentDescription = page.label
                                            )
                                        },
                                        label = {
                                            Text(text = page.label)
                                        },
                                        selected = currentDestination?.hierarchy?.any { it.route == page.route } == true,
                                        onClick = {
                                            navController.navigate(page.route) {
                                                popUpTo(navController.graph.findStartDestination().id) {
                                                    saveState = true
                                                }
                                                launchSingleTop = true
                                                restoreState = true
                                            }
                                        }
                                    )
                                }
                            }
                        },
                        content = {
                            NavHost(
                                navController = navController,
                                startDestination = Page.Home.route,
                                modifier = Modifier.padding(it)
                            ) {
                                composable(Page.Home.route) { HomePage(this@MainActivity) }
                                composable(Page.Sub.route) { SubPage() }
                                composable(Page.Local.route) { LocalPage() }
                                composable(Page.Mine.route) { MinePage() }
                            }
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun AAAAAA() {
    Qlm1Theme {
        MinePage()
    }
}


@Composable
fun LocalPage() {
    Greeting(name = "local")
}

