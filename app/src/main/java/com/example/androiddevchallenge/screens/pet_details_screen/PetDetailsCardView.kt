/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.screens.pet_details_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.testTag
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.AdoptionCase
import com.example.androiddevchallenge.ui.theme.BackgroundColor
import com.example.androiddevchallenge.ui.theme.PrimaryColor

@Composable
fun PetDetailsCardView(case: AdoptionCase) {
    Column(
        modifier = Modifier
            .semantics { testTag = "pet_details_view" }
            .background(color = BackgroundColor)
            .fillMaxSize()
    ) {
        Row(
            modifier = Modifier.padding(start = 30.dp, end = 30.dp, bottom = 30.dp)
        ) {
            PetSingleInfoView("Age", case.pet.age.toString(), Modifier.weight(1f))
            PetSingleInfoView("Gender", case.pet.gender, Modifier.weight(1f))
            PetSingleInfoView("Weight", case.pet.weight.toString() + " kg", Modifier.weight(1f))
        }

        Divider(
            modifier = Modifier.padding(start = 30.dp, end = 30.dp, bottom = 30.dp),
            color = PrimaryColor,
            thickness = 1.dp
        )

        OwnerDetailsView(case)
    }
}
