package com.rosan.dhizuku.di.init

import com.rosan.dhizuku.di.dhizukuModule
import com.rosan.dhizuku.di.roomModule
import com.rosan.dhizuku.di.viewModelModule

val appModules = listOf(
    roomModule,
    viewModelModule,
    dhizukuModule
)