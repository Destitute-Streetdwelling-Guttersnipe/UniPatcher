/*
Copyright (C) 2016, 2019-2020 Boris Timofeev

This file is part of UniPatcher.

UniPatcher is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

UniPatcher is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with UniPatcher.  If not, see <http://www.gnu.org/licenses/>.
*/
package org.emunix.unipatcher.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import org.emunix.unipatcher.ui.fragment.AboutFragment
import org.emunix.unipatcher.ui.fragment.FaqFragment

class HelpStateAdapter(fragmentActivity: FragmentActivity?) : FragmentStateAdapter(fragmentActivity!!) {
    companion object {
        const val POS_FAQ = 0
        const val POS_ABOUT = 1
        const val TOTAL_COUNT = 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            POS_FAQ -> FaqFragment()
            POS_ABOUT -> AboutFragment()
            else -> throw IllegalArgumentException("Unknown position for ViewPager2")
        }
    }

    override fun getItemCount(): Int {
        return TOTAL_COUNT
    }
}