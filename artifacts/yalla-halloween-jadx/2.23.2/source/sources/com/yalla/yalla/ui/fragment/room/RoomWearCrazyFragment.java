package com.yalla.yalla.ui.fragment.room;

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
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.yalla.yalla.model.SkillCardListModel;
import com.yalla.yalla.ui.adapter.o000Oo0;
import java.util.ArrayList;
import java.util.List;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public class RoomWearCrazyFragment extends com.yalla.yalla.base.fragment.OooO00o {
    private List<SkillCardListModel.DataBean> adapterData;
    private LinearLayout llBallWrapper;
    private Context mContext;
    private com.yalla.yalla.ui.adapter.Oooo0 pagerAdapter;
    private ViewPager vpData;
    private int wearType = 2;
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

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o000Oo0 f28585OooO0Oo;

        public OooO00o(o000Oo0 o000oo1) {
            this.f28585OooO0Oo = o000oo1;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SkillCardListModel.DataBean dataBean = (SkillCardListModel.DataBean) this.f28585OooO0Oo.f27090OooO0o0.get(i);
            if (dataBean == null || dataBean.warestype == 0) {
                return;
            }
            RoomWearCrazyFragment roomWearCrazyFragment = RoomWearCrazyFragment.this;
            roomWearCrazyFragment.GridViewItemIndex = i;
            roomWearCrazyFragment.updateSelectedBorder();
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
            RoomWearCrazyFragment roomWearCrazyFragment = RoomWearCrazyFragment.this;
            roomWearCrazyFragment.GridViewIndex = i;
            roomWearCrazyFragment.refreshPoint();
        }
    }

    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RoomWearCrazyFragment.this.updateSelectedBorder();
        }
    }

    private void initIntent() {
        this.adapterData = new ArrayList();
    }

    private void initPoint() {
        if (this.pageCount == 1) {
            return;
        }
        for (int i = 0; i < this.pageCount; i++) {
            ImageView imageView = new ImageView(this.mContext);
            if (i == 0) {
                imageView.setImageResource(p562o0oOo000.o0Oo0oo.icon_banner_point_green);
            } else {
                imageView.setImageResource(p562o0oOo000.o0Oo0oo.icon_banner_point_gray);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(new ViewGroup.LayoutParams(-2, -2));
            layoutParams.leftMargin = o0OO0.OooO0o.OooO0O0(this.mContext, 3.0d);
            layoutParams.rightMargin = o0OO0.OooO0o.OooO0O0(this.mContext, 3.0d);
            layoutParams.width = o0OO0.OooO0o.OooO0O0(this.mContext, 5.0d);
            layoutParams.height = o0OO0.OooO0o.OooO0O0(this.mContext, 5.0d);
            this.llBallWrapper.addView(imageView, layoutParams);
            this.wearPointViews.add(imageView);
        }
    }

    private void initView(View view) {
        this.vpData = (ViewPager) view.findViewById(o0OO00O.viewPager);
        this.llBallWrapper = (LinearLayout) view.findViewById(o0OO00O.llBallWrapper);
    }

    public static RoomWearCrazyFragment newInstance() {
        return new RoomWearCrazyFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshPoint() {
        for (int i = 0; i < this.wearPointViews.size(); i++) {
            if (i == this.GridViewIndex) {
                this.wearPointViews.get(i).setImageResource(p562o0oOo000.o0Oo0oo.icon_banner_point_green);
            } else {
                this.wearPointViews.get(i).setImageResource(p562o0oOo000.o0Oo0oo.icon_banner_point_gray);
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
            ((RelativeLayout) childAt.findViewById(o0OO00O.rl_item_wear_selected)).setVisibility(8);
        }
        View childAt2 = this.gridViews.get(this.GridViewIndex).getChildAt(this.GridViewItemIndex);
        if (childAt2 != null) {
            ((RelativeLayout) childAt2.findViewById(o0OO00O.rl_item_wear_selected)).setVisibility(0);
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
        this.rootView = layoutInflater.inflate(oo0o0Oo.fragment_wear_dialog, viewGroup, false);
        initIntent();
        initView(this.rootView);
        return this.rootView;
    }

    public void setData(List<SkillCardListModel.DataBean> list) {
        this.adapterData = list;
        this.columnNum = 2;
        this.pageSize = this.lineNum * 2;
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
            o000Oo0 o000oo1 = new o000Oo0(this.mContext, this.adapterData, i2, this.pageSize);
            gridView.setAdapter((ListAdapter) o000oo1);
            gridView.setGravity(17);
            gridView.setClickable(true);
            gridView.setFocusable(true);
            gridView.setNumColumns(this.columnNum);
            gridView.setSelector(new ColorDrawable(0));
            this.gridViews.add(gridView);
            gridView.setOnItemClickListener(new OooO00o(o000oo1));
        }
        com.yalla.yalla.ui.adapter.Oooo0 oooo0 = new com.yalla.yalla.ui.adapter.Oooo0(this.gridViews);
        this.pagerAdapter = oooo0;
        this.vpData.setAdapter(oooo0);
        this.vpData.setOffscreenPageLimit(this.pageCount);
        initPoint();
        this.vpData.OooO0O0(new OooO0O0());
        this.vpData.post(new OooO0OO());
    }
}
