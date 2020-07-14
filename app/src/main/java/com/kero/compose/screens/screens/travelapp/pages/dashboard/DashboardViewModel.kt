package com.kero.compose.screens.screens.travelapp.pages.dashboard

import android.content.res.Resources
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kero.compose.screens.base.Event
import com.kero.compose.screens.screens.travelapp.api.Place
import com.kero.compose.screens.screens.travelapp.api.getPlaces
import com.kero.compose.screens.utils.launchCoroutines
import kotlinx.coroutines.launch

class DashboardViewModel: ViewModel() {
    private val _state = MutableLiveData(DashboardState())
    val state: LiveData<DashboardState>
        get() = _state
    private val _navigate = MutableLiveData<Event<Place>>()
    val navigate: LiveData<Event<Place>>
        get() = _navigate

    fun  reducer(action: DashboardAction){
        when(action){
            is GoToPlaceDetail-> _navigate.value = Event(action.placeDetail)
        }
    }
    fun init(ress: Resources){
        launchCoroutines(::getPlaces, ress ){
            _state.value = _state.value?.copy(places = it)
        }
    }
}
data class DashboardState(
    val places: List<Place> = emptyList()
)
