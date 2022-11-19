package org.battir.androidtrainingkotlin.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.battir.androidtrainingkotlin.R


//Create viewModel class
class MainViewModel : ViewModel() {
    //Our instance properties
    var userMutableLiveData: MutableLiveData<ArrayList<User>?> = MutableLiveData()
    var userArrayList: ArrayList<User>? = null

    //Initialize stuff
    fun init() {
        populateList()
        userMutableLiveData.value = userArrayList
    }

    //generate dummy users
    fun populateList() {
        var user = User()
        user.name = "Mohammad Hmedat"
        user.description = "The android trainer"
        user.img= R.drawable.male_young_64
        userArrayList = ArrayList()
        userArrayList!!.add(user)
        user = User()
        user.name = "Ghazal"
        user.description = "A very good girl"
        user.img=R.drawable.female_64
        userArrayList!!.add(user)
        user = User()
        user.name = "Zaid"
        user.description = "A very powerful guy"
        user.img=R.drawable.male_office_64
        userArrayList!!.add(user)
        user = User()
        user.name = "Nagham"
        user.description = "A very beautiful girl"
        user.img=R.drawable.feamle_avatar_64
        userArrayList!!.add(user)
        user = User()
        user.name = "MM"
        user.description = "A very kind guy"
        user.img=R.drawable.male_grandma_64
        userArrayList!!.add(user)
        user = User()
        user.name = "AA"
        user.description = "A very helpful girl"
        user.img=R.drawable.female_afro_mp4
        userArrayList!!.add(user)
    }

    fun appendUser(user:User){
        userArrayList!!.add(user)
        userMutableLiveData.postValue(userArrayList)
    }
    init {
        init()
    }
}
//end