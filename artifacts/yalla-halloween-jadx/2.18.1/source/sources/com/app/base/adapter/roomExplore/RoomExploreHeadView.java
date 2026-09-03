package com.app.base.adapter.roomExplore;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.framework.abs.AbsListener.AbsListenerTag;
import com.app.base.framework.abs.AbsView.AbsView;
import com.app.base.model.CategoryModel;
import com.app.base.model.CountryModel;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.ui.activity.room.CountryTagActivity;
import com.yalla.yalla.ui.activity.room.ExploreCountryRoomListActivity;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import o00OO0O.OooO0OO;
import p133o00OO00o.OooOOOO;

/* JADX INFO: loaded from: classes.dex */
public class RoomExploreHeadView extends AbsView {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public TextView f11406OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public RecyclerView f11407OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public View f11408OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public OooOOOO f11409OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public GridView f11410OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public OooO0OO f11411Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public List<CountryModel> f11412Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public List<CategoryModel> f11413OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public View f11414OooooOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public LinearLayout f11415o000oOoO;

    public class OooO00o implements o00Oo00.OooO0O0<CountryModel, AbsListenerTag> {
        public OooO00o() {
        }

        @Override // o00Oo00.OooO0O0
        public final void OooO0O0(CountryModel countryModel, int i, AbsListenerTag absListenerTag) {
            CountryModel countryModel2 = countryModel;
            if (TextUtils.isEmpty(countryModel2.getCid()) || TextUtils.isEmpty(countryModel2.getName())) {
                return;
            }
            ExploreCountryRoomListActivity.f22797Ooooooo.OooO00o(RoomExploreHeadView.this.f11711Oooo0oo, OooO.OooO0Oo(countryModel2.getCid(), 0));
        }
    }

    public class OooO0O0 extends RecyclerView.o00O0O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ FixLinearLayoutManager f11417OooO00o;

        public OooO0O0(FixLinearLayoutManager fixLinearLayoutManager) {
            this.f11417OooO00o = fixLinearLayoutManager;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00O0O
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<com.app.base.model.CategoryModel>] */
        @Override // androidx.recyclerview.widget.RecyclerView.o00O0O
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (this.f11417OooO00o.findLastCompletelyVisibleItemPosition() >= RoomExploreHeadView.this.f11413OooooO0.size() - 1) {
                RoomExploreHeadView.this.f11408OoooOo0.setVisibility(8);
            } else {
                RoomExploreHeadView.this.f11408OoooOo0.setVisibility(0);
            }
        }
    }

    public RoomExploreHeadView(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        OooO0OO oooO0OO = new OooO0OO(this.f11711Oooo0oo);
        this.f11411Ooooo00 = oooO0OO;
        this.f11410OoooOoo.setAdapter((ListAdapter) oooO0OO);
        this.f11411Ooooo00.f32546Oooo0o = new OooO00o();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<com.app.base.model.CountryModel>] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList, java.util.List<com.app.base.model.CountryModel>] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList, java.util.List<com.app.base.model.CountryModel>] */
    public final void OooO(List<CountryModel> list, boolean z, int i) {
        this.f11414OooooOO.setVisibility(0);
        if (this.f11412Ooooo0o == null) {
            this.f11412Ooooo0o = new ArrayList();
        }
        this.f11406OoooOOO.setVisibility(8);
        if (z) {
            this.f11412Ooooo0o.clear();
            if (list != null && !list.isEmpty()) {
                if (list.size() > i) {
                    this.f11406OoooOOO.setVisibility(0);
                }
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (i2 < i) {
                        this.f11412Ooooo0o.add(list.get(i2));
                    }
                }
            }
        }
        LinearLayout linearLayout = this.f11415o000oOoO;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        this.f11410OoooOoo.setVisibility(8);
        ?? r5 = this.f11412Ooooo0o;
        if (r5 == 0 || r5.isEmpty() || this.f11415o000oOoO == null) {
            return;
        }
        this.f11410OoooOoo.setVisibility(0);
        this.f11415o000oOoO.setVisibility(0);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f11410OoooOoo.getLayoutParams();
        if (i == 3) {
            layoutParams.height = OooOo00.OooO00o(40.0f);
        }
        if (i == 6) {
            layoutParams.height = OooOo00.OooO00o(90.0f);
        }
        this.f11410OoooOoo.setLayoutParams(layoutParams);
        OooO0OO oooO0OO = this.f11411Ooooo00;
        if (oooO0OO != null) {
            oooO0OO.OooO0o0(this.f11412Ooooo0o);
        }
    }

    @Override // com.app.base.framework.abs.AbsView.AbsView
    public final int OooO0OO() {
        return R.layout.room_explore_head_view;
    }

    @Override // com.app.base.framework.abs.AbsView.AbsView
    public final void OooO0Oo() {
    }

    @Override // com.app.base.framework.abs.AbsView.AbsView
    public final void OooO0o() {
        this.f11415o000oOoO = (LinearLayout) OooO00o(R.id.room_explore_head_country_layout);
        this.f11406OoooOOO = (TextView) OooO0O0(R.id.room_explore_head_view_tv_more);
        this.f11410OoooOoo = (GridView) OooO00o(R.id.room_explore_head_gridview_country);
        this.f11407OoooOOo = (RecyclerView) OooO00o(R.id.room_explore_head_view_rec_item_rec_tag);
        this.f11408OoooOo0 = OooO00o(R.id.ivShadow);
        this.f11414OooooOO = OooO00o(R.id.countryTitle);
        LinearLayout linearLayout = this.f11415o000oOoO;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        RecyclerView recyclerView = this.f11407OoooOOo;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
    }

    @Override // com.app.base.framework.abs.AbsView.AbsView
    public final void OooO0o0() {
        LinearLayout linearLayout = this.f11415o000oOoO;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        RecyclerView recyclerView = this.f11407OoooOOo;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.app.base.framework.abs.AbsView.AbsView
    public final void OooO0oo(Object obj, int i) {
        this.f11708Oooo = obj;
        this.f11714OoooO00 = i;
        OooO(this.f11412Ooooo0o, false, 6);
        OooOO0(this.f11413OooooO0, false);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void OooOO0(List<CategoryModel> list, boolean z) {
        RecyclerView recyclerView;
        if (list == null) {
            this.f11413OooooO0 = new ArrayList();
        }
        if (z) {
            this.f11413OooooO0.clear();
            if (list != null) {
                this.f11413OooooO0.addAll(list);
            }
        }
        RecyclerView recyclerView2 = this.f11407OoooOOo;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(8);
        }
        List<CategoryModel> list2 = this.f11413OooooO0;
        if (list2 == 0 || list2.isEmpty() || (recyclerView = this.f11407OoooOOo) == null) {
            return;
        }
        recyclerView.setVisibility(0);
        FixLinearLayoutManager fixLinearLayoutManager = new FixLinearLayoutManager(this.f11711Oooo0oo);
        fixLinearLayoutManager.setOrientation(0);
        this.f11407OoooOOo.setLayoutManager(fixLinearLayoutManager);
        if (this.f11409OoooOoO == null) {
            this.f11409OoooOoO = new OooOOOO(this.f11413OooooO0);
        }
        this.f11407OoooOOo.setAdapter(this.f11409OoooOoO);
        this.f11407OoooOOo.addOnScrollListener(new OooO0O0(fixLinearLayoutManager));
    }

    @Override // o00Oo00.OooO00o
    public final void onClickNotDouble(View view) {
        if (view.getId() == R.id.room_explore_head_view_tv_more) {
            this.f11711Oooo0oo.startActivity(new Intent(this.f11711Oooo0oo, (Class<?>) CountryTagActivity.class));
        }
    }
}
