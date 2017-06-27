package com.example.sidneyseay.sidney2017summer.fragment;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.sidneyseay.sidney2017summer.ActivityA;
import com.example.sidneyseay.sidney2017summer.AdvanceListViewActivity;
import com.example.sidneyseay.sidney2017summer.AdvanceViewPagerActivity;
import com.example.sidneyseay.sidney2017summer.AnimationActivity;
import com.example.sidneyseay.sidney2017summer.CheckBoxActivity;
import com.example.sidneyseay.sidney2017summer.DialogActivity;
import com.example.sidneyseay.sidney2017summer.HandlerActivity;
import com.example.sidneyseay.sidney2017summer.NinePatchActivity;
import com.example.sidneyseay.sidney2017summer.NotificationActivity;
import com.example.sidneyseay.sidney2017summer.R;
import com.example.sidneyseay.sidney2017summer.RadioGroupActivity;
import com.example.sidneyseay.sidney2017summer.ResultActivity;
import com.example.sidneyseay.sidney2017summer.RunableHandlerActivity;
import com.example.sidneyseay.sidney2017summer.ScaleTypeActivity;
import com.example.sidneyseay.sidney2017summer.ViewPagerActivity;
import com.example.sidneyseay.sidney2017summer.adapter.ListNormalAdapter;
import com.example.sidneyseay.sidney2017summer.audio.BaseBean;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DemoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DemoFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private final Context context;


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private final ArrayList<String> contentList;
    private ListView listView;


    public DemoFragment() {
        context = getContext();
        contentList = new ArrayList<String>();
        contentList.add("ViewPager");
        contentList.add("ImageScaleType");
        contentList.add("9Patch");
        contentList.add("Notification");
        contentList.add("AdvanceListView");
        contentList.add("AdvanceViewPager");
        contentList.add("LaunchMode");
        contentList.add("ActivityResult");
        contentList.add("RadioGroup");
        contentList.add("CheckBox");
        contentList.add("Dialog");
        contentList.add("Handler");
        contentList.add("RunableHandler");
        contentList.add("Animation");

    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DemoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DemoFragment newInstance(String param1, String param2) {
        DemoFragment fragment = new DemoFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_demo, container, false);
        listView = (ListView)view.findViewById(R.id.fragment_demo_lv);
        ListNormalAdapter adapter = new ListNormalAdapter(this.getContext(), contentList);
        listView.setAdapter(adapter);
    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            switch (position){
                case 0:
                    Intent intent = new Intent(getActivity(), ViewPagerActivity.class);
                    startActivity(intent);
                    break;
                case 1:
                    Intent intent1 = new Intent(getActivity(), ScaleTypeActivity.class);
                    startActivity(intent1);
                    break;
                case 2:
                    Intent intent2 = new Intent(getActivity(), NinePatchActivity.class);
                    startActivity(intent2);
                    break;
                case 3:
                    Intent intent3 = new Intent(getActivity(), NotificationActivity.class);
                    startActivity(intent3);
                    break;
                case 4:
                    Intent intent4 = new Intent(getActivity(), AdvanceListViewActivity.class);
                    startActivity(intent4);
                    break;
                case 5:
                    Intent intent5 = new Intent(getActivity(), AdvanceViewPagerActivity.class);
                    startActivity(intent5);
                    break;
                case 6:
                    Intent intent6 = new Intent(getActivity(), ActivityA.class);
                    intent6.putExtra("StringInfo","fromDemoFragment");
                    intent6.putExtra("IntegerInfo",10);

                    Bundle bundle = new Bundle();
                    bundle.putString("StringBundle", "FromBundleDemo");
                    bundle.putInt("Bundle", 101);
                    intent6.putExtra("Bundle",bundle);

                    BaseBean bean = new BaseBean();
                    bean.setName("bean");
                    bundle.putSerializable("Object", bean);

                    startActivity(intent6);
                    break;
                case 7:
                    Intent intent7 = new Intent(getActivity(), ResultActivity.class);
                    startActivity(intent7);
                    break;
                case 8:
                    Intent intent8 = new Intent(getActivity(), RadioGroupActivity.class);
                    startActivity(intent8);
                    break;
                case 9:
                    Intent intent9 = new Intent(getActivity(), CheckBoxActivity.class);
                    startActivity(intent9);
                    break;
                case 10:
                    Intent intent10 = new Intent(getActivity(), DialogActivity.class);
                    startActivity(intent10);
                    break;
                case 11:
                    Intent intent11 = new Intent(getActivity(), HandlerActivity.class);
                    startActivity(intent11);
                    break;
                case 12:
                    Intent intent12 = new Intent(getActivity(), RunableHandlerActivity.class);
                    startActivity(intent12);
                    break;
                case 13:
                    Intent intent13 = new Intent(getActivity(), AnimationActivity.class);
                    startActivity(intent13);
                    break;
                default:
            }
        }
    });
        return view;
    }

}
