/*
 * Copyright (c) 2020 Noonmaru
 *
 * Licensed under the General Public License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://opensource.org/licenses/gpl-2.0.php
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.github.noonmaru.tap.mojang

import com.github.noonmaru.tap.loader.LibraryLoader
import java.util.*

/**
 * @author Nemo
 */

interface ProfileSupport {
    fun getProfile(name: String): MojangProfile?
    fun getProfile(uniqueId: UUID): MojangProfile?
}

private val SUPPORT: ProfileSupport = LibraryLoader.load(ProfileSupport::class.java)

fun getProfile(name: String): MojangProfile? {
    return SUPPORT.getProfile(name)
}

fun getProfile(uniqueId: UUID): MojangProfile? {
    return SUPPORT.getProfile(uniqueId)
}