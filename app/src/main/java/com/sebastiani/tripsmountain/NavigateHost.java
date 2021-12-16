package com.sebastiani.tripsmountain;


import androidx.fragment.app.Fragment;

public interface NavigateHost{

    void navigateTo(Fragment fragment, boolean addToBackstack);
}