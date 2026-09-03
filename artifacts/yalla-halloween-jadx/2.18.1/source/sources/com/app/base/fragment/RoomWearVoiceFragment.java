package com.app.base.fragment;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.app.base.model.SkillCardListModel;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.RoomUserInfoModel;
import java.util.ArrayList;
import java.util.List;
import p133o00OO00o.Oooo0;
import p418o0Oo0oo.oo000o;

/* JADX INFO: loaded from: classes.dex */
public class RoomWearVoiceFragment extends o00OOO0.OooO00o {
    private List<SkillCardListModel.DataBean> adapterData;
    private RoomUserInfoModel clickUserBean;
    private LinearLayout llBallWrapper;
    private Context mContext;
    private p133o00OO00o.OooO0o pagerAdapter;
    private ViewPager vpData;
    private int wearType;
    private List<GridView> gridViews = new ArrayList();
    private ArrayList<ImageView> wearPointViews = new ArrayList<>();
    private int pageSize = 6;
    private int pageCount = 0;
    private int lineNum = 2;
    private int columnNum = 3;
    private int GridViewIndex = 0;
    private int GridViewLastIndex = -1;
    private int GridViewItemIndex = 0;
    private int GridViewItemLastIndex = -1;

    public class OooO00o implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Oooo0 f11632Oooo0o;

        public OooO00o(Oooo0 oooo0) {
            this.f11632Oooo0o = oooo0;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SkillCardListModel.DataBean item = this.f11632Oooo0o.getItem(i);
            if (item == null || item.warestype == 0) {
                return;
            }
            RoomWearVoiceFragment.this.GridViewItemIndex = i;
            RoomWearVoiceFragment.this.updateSelectedBorder();
        }
    }

    public class OooO0O0 implements ViewPager.OooOOO0 {
        public OooO0O0() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageSelected(int i) {
            RoomWearVoiceFragment.this.GridViewIndex = i;
            RoomWearVoiceFragment.this.refreshPoint();
        }
    }

    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RoomWearVoiceFragment.this.updateSelectedBorder();
        }
    }

    private void initIntent() {
        this.adapterData = new ArrayList();
        if (getArguments() != null) {
            this.wearType = getArguments().getInt(SkillCardDataFragment.WEAR_TYPE_KEY, 1);
            this.clickUserBean = (RoomUserInfoModel) getArguments().getSerializable("user_key");
        }
    }

    private void initPoint() {
        if (this.pageCount == 1) {
            return;
        }
        for (int i = 0; i < this.pageCount; i++) {
            ImageView imageView = new ImageView(this.mContext);
            if (i == 0) {
                imageView.setImageResource(R.drawable.icon_banner_point_green);
            } else {
                imageView.setImageResource(R.drawable.icon_banner_point_gray);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(new ViewGroup.LayoutParams(-2, -2));
            layoutParams.leftMargin = oo000o.OooO00o(this.mContext, 3.0d);
            layoutParams.rightMargin = oo000o.OooO00o(this.mContext, 3.0d);
            layoutParams.width = oo000o.OooO00o(this.mContext, 5.0d);
            layoutParams.height = oo000o.OooO00o(this.mContext, 5.0d);
            this.llBallWrapper.addView(imageView, layoutParams);
            this.wearPointViews.add(imageView);
        }
    }

    private void initView(View view) {
        this.vpData = (ViewPager) view.findViewById(R.id.viewPager);
        this.llBallWrapper = (LinearLayout) view.findViewById(R.id.llBallWrapper);
    }

    public static RoomWearVoiceFragment newInstance(RoomUserInfoModel roomUserInfoModel) {
        RoomWearVoiceFragment roomWearVoiceFragment = new RoomWearVoiceFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("user_key", roomUserInfoModel);
        roomWearVoiceFragment.setArguments(bundle);
        return roomWearVoiceFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshPoint() {
        for (int i = 0; i < this.wearPointViews.size(); i++) {
            if (i == this.GridViewIndex) {
                this.wearPointViews.get(i).setImageResource(R.drawable.icon_banner_point_green);
            } else {
                this.wearPointViews.get(i).setImageResource(R.drawable.icon_banner_point_gray);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSelectedBorder() {
        View childAt;
        List<GridView> list = this.gridViews;
        if (list == null) {
            return;
        }
        if (this.GridViewItemLastIndex != -1 && (childAt = list.get(this.GridViewLastIndex).getChildAt(this.GridViewItemLastIndex)) != null) {
            childAt.findViewById(R.id.v_item_selected).setVisibility(8);
        }
        View childAt2 = this.gridViews.get(this.GridViewIndex).getChildAt(this.GridViewItemIndex);
        if (childAt2 != null) {
            childAt2.findViewById(R.id.v_item_selected).setVisibility(0);
            this.GridViewLastIndex = this.GridViewIndex;
            this.GridViewItemLastIndex = this.GridViewItemIndex;
        }
    }

    public SkillCardListModel.DataBean getSelectedWear() {
        int i = this.GridViewItemLastIndex;
        if (i == -1 || (this.pageSize * this.GridViewLastIndex) + i >= this.adapterData.size() || this.adapterData.get((this.pageSize * this.GridViewLastIndex) + this.GridViewItemLastIndex).warestype == 0) {
            return null;
        }
        return this.adapterData.get((this.pageSize * this.GridViewLastIndex) + this.GridViewItemLastIndex);
    }

    public void loadError(String str, String str2) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mContext = context;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.rootView = layoutInflater.inflate(R.layout.fragment_wear_dialog, viewGroup, false);
        initIntent();
        initView(this.rootView);
        return this.rootView;
    }

    public void setData(List<SkillCardListModel.DataBean> list) {
        this.adapterData = list;
        if (this.wearType == 1) {
            this.columnNum = 3;
        } else {
            this.columnNum = 2;
        }
        this.pageSize = this.lineNum * this.columnNum;
        if (list == null || list.size() <= 0) {
            this.adapterData = new ArrayList();
            for (int i = 0; i < this.pageSize; i++) {
                this.adapterData.add(new SkillCardListModel.DataBean());
            }
        }
        if (this.adapterData.size() % this.pageSize == 0) {
            this.pageCount = this.adapterData.size() / this.pageSize;
        } else {
            this.pageCount = (this.adapterData.size() / this.pageSize) + 1;
            for (int size = this.adapterData.size(); size < this.pageCount * this.pageSize; size++) {
                this.adapterData.add(new SkillCardListModel.DataBean());
            }
        }
        for (int i2 = 0; i2 < this.pageCount; i2++) {
            GridView gridView = new GridView(this.mContext);
            Oooo0 oooo0 = new Oooo0(this.mContext, this.adapterData, i2, this.pageSize);
            gridView.setAdapter((ListAdapter) oooo0);
            gridView.setGravity(17);
            gridView.setClickable(true);
            gridView.setFocusable(true);
            gridView.setNumColumns(this.columnNum);
            gridView.setSelector(new ColorDrawable(0));
            this.gridViews.add(gridView);
            gridView.setOnItemClickListener(new OooO00o(oooo0));
        }
        p133o00OO00o.OooO0o oooO0o = new p133o00OO00o.OooO0o(this.gridViews);
        this.pagerAdapter = oooO0o;
        this.vpData.setAdapter(oooO0o);
        this.vpData.setOffscreenPageLimit(this.pageCount);
        initPoint();
        this.vpData.OooO0O0(new OooO0O0());
        this.vpData.post(new OooO0OO());
    }
}
