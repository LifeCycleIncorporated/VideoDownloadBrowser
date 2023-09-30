package com.Life.videoDownloader.model;

import androidx.fragment.app.Fragment;

import com.Life.videoDownloader.VDApp;
import com.Life.videoDownloader.activity.MainActivity;

public class VDFragment extends Fragment {

    public MainActivity getVDActivity() {
        return (MainActivity) getActivity();
    }

    public VDApp getVDApp() {
        return (VDApp) getActivity().getApplication();
    }
}
