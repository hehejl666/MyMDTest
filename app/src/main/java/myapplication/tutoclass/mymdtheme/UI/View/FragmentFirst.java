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
public class FragmentFirst extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View mview=inflater.inflate(R.layout.content_main2,container,false);
        return mview;
    }

    public static FragmentFirst newInstance() {
        
        Bundle args = new Bundle();
        
        FragmentFirst fragment = new FragmentFirst();
        fragment.setArguments(args);
        return fragment;
    }
}
