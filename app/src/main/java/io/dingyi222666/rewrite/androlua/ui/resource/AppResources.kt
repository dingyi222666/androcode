package io.dingyi222666.rewrite.androlua.ui.resource

import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.navigation.NavHostController

val LocalNavController = staticCompositionLocalOf<NavHostController> {
    error("No NavController provided!")
}


val LocalWindowSizeClass =
    staticCompositionLocalOf<WindowSizeClass> { error("No WindowSizeClass provided!") }
