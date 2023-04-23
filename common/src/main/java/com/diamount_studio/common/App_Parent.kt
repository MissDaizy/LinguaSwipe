package com.diamount_studio.common

import android.app.Application

abstract class App_Parent: Application() {

    protected var statsClass: Class<*>? = null


}