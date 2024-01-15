package com.efesen.animatedheader_hidesonswipe.model

import com.efesen.animatedheader_hidesonswipe.R

/**
 * Created by Efe Şen on 9.01.2024.
 */
data class Item(val thumb: Int, val desc: String, val photographerName: String, val profilePhoto: Int) {
    companion object {

        fun generateMockData(): List<Item> {
            fun getMockCloudItems(): ArrayList<Item> {
                return arrayListOf(
                    Item(
                        R.drawable.video_thumb1,
                        "Behind The Camera",
                        "Suliman Sallehi 4.7K views 2 hours ago",
                        R.drawable.profile_avatar
                    ),

                    Item(
                        R.drawable.video_thumb2,
                        "Is simply dummy text of the printing and typesetting",
                        "Ashford Marx 8.1K views 22 hours ago",
                        R.drawable.profile_avatar
                    ),

                    Item(
                        R.drawable.video_thumb3,
                        "Ipsum has been the industry's standard dummy",
                        "Iam Hogir 93K views 1 day ago",
                        R.drawable.profile_avatar
                    ),

                    Item(
                        R.drawable.video_thumb4,
                        "It is a long established fact that a reader",
                        "Brett Sayles 922K views 1 months ago",
                        R.drawable.profile_avatar
                    ),

                    Item(
                        R.drawable.video_thumb5,
                        "Contrary to popular belief",
                        "David Bartus 139K views 1 year ago",
                        R.drawable.profile_avatar
                    )
                )
            }
            return getMockCloudItems()
        }
    }
}
