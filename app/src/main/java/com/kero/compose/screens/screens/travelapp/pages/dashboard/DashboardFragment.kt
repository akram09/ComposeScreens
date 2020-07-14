package com.kero.compose.screens.screens.travelapp.pages.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams
import android.widget.FrameLayout
import androidx.compose.Recomposer
import androidx.compose.getValue
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.ui.core.setContent
import androidx.ui.livedata.observeAsState

class DashboardFragment: Fragment() {

    private val viewModel: DashboardViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel.init(resources)
        return FrameLayout(requireContext()).apply {
            layoutParams = LayoutParams(
                LayoutParams(
                    LayoutParams.MATCH_PARENT,
                    LayoutParams.MATCH_PARENT
                )
            )
            setContent(Recomposer.current()){
                val viewState by viewModel.state.observeAsState()
                if(viewState!=null){
                    Dashboard(viewState!!, viewModel::reducer)
                }
            }
        }
    }
}