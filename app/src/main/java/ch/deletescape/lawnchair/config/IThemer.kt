package ch.deletescape.lawnchair.preferences

import android.content.Context

interface IThemer {

    // -------------------
    // 1) App Theme
    // -------------------

    // -------------------
    // 2) All Apps Drawer
    // -------------------

    fun allAppsBackgroundColor(context: Context) : Int
    fun allAppsBackgroundColorBlur(context: Context) : Int
    /*
     * this color is used for the icon texts and for the nothing found text (attention: the nothing found text will look different, it has some alpha defined in xml!)
     */
    fun allAppsIconTextColor(context: Context, allAppsAlpha: Int) : Int
    fun allAppsIconTextLines(context: Context) : Int
    fun allAppsSearchTextColor(context: Context) : Int?
    /*
     * this color is also used for the market search button, the market item divider and the search bar divider
     * currently ignored as hint color for round search bar
     */
    fun allAppsSearchBarHintTextColor(context: Context) : Int
    fun allAppsFastScrollerHandleColor(context: Context) : Int
    fun allAppsFastScrollerPopupTintColor(context: Context): Int?
    fun allAppsFastScrollerPopupTextColor(context: Context) : Int
}