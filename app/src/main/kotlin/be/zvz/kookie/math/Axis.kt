/**
 *
 * _  __           _    _
 * | |/ /___   ___ | | _(_) ___
 * | ' // _ \ / _ \| |/ / |/ _ \
 * | . \ (_) | (_) |   <| |  __/
 * |_|\_\___/ \___/|_|\_\_|\___|
 *
 * A server software for Minecraft: Bedrock Edition
 *
 * Copyright (C) 2021 organization Team
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 */
package be.zvz.kookie.math

enum class Axis(val value: Int) {
    X(0),
    Y(1),
    Z(2);

    companion object {
        @JvmStatic
        fun fromInt(value: Int): Axis = when (value) {
            0 -> X
            1 -> Y
            2 -> Z
            else -> throw IllegalArgumentException("$value is invalid axis value")
        }
    }
}
