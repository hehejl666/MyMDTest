package myapplication.tutoclass.mymdtheme.UI.View;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import myapplication.tutoclass.mymdtheme.R;
import myapplication.tutoclass.mymdtheme.UI.Base.BaseFragment;

/**
 * Created by 17930 on 2016/2/15.
 */
public class FragmentZhuti extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View mview=inflater.inflate(R.layout.mdchange,container,false);
        return mview;
    }

    public static FragmentZhuti newInstance() {
        
        Bundle args = new Bundle();
        
        FragmentZhuti fragment = new FragmentZhuti();
        fragment.setArguments(args);
        return fragment;
    }
}
