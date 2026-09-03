package com.yalla.yalla.ui.adapter.roomExplore;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.code.android.util.o0000O0;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.base.abs.AbsListener.AbsListenerTag;
import com.yalla.yalla.base.abs.AbsView.AbsView;
import com.yalla.yalla.model.CategoryModel;
import com.yalla.yalla.model.CountryModel;
import com.yalla.yalla.ui.activity.room.CountryTagActivity;
import com.yalla.yalla.ui.activity.room.ExploreCountryRoomListActivity;
import com.yalla.yalla.ui.adapter.RecAdapterTag;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p400o0Oo0O0.OooOOO0;
import p510o0o00ooo.v4;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public class RoomExploreHeadView extends AbsView {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public LinearLayout f27270OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public RecyclerView f27271OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public TextView f27272OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public View f27273OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public RecAdapterTag f27274OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final v4 f27275OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public GridView f27276OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public ArrayList f27277OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public View f27278OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public ArrayList f27279OooOo00;

    public class OooO00o implements OooOOO0<CountryModel, AbsListenerTag> {
        public OooO00o() {
        }

        @Override // p400o0Oo0O0.OooOOO0
        public final void OooO00o(int i, Object obj, Object obj2) {
            CountryModel countryModel = (CountryModel) obj;
            if (TextUtils.isEmpty(countryModel.getCid()) || TextUtils.isEmpty(countryModel.getName())) {
                return;
            }
            int i2 = ExploreCountryRoomListActivity.f26073OooOoo0;
            Activity context = RoomExploreHeadView.this.f22259OooO0o;
            int iOooO0o = o0OoOo0.OooO0o(0, countryModel.getCid());
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) ExploreCountryRoomListActivity.class);
            intent.putExtra("COUNTRY_ID", iOooO0o);
            context.startActivity(intent);
        }
    }

    public class OooO0O0 extends RecyclerView.o00O0O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ FixLinearLayoutManager f27281OooO00o;

        public OooO0O0(FixLinearLayoutManager fixLinearLayoutManager) {
            this.f27281OooO00o = fixLinearLayoutManager;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00O0O
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00O0O
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            int iFindLastCompletelyVisibleItemPosition = this.f27281OooO00o.findLastCompletelyVisibleItemPosition();
            RoomExploreHeadView roomExploreHeadView = RoomExploreHeadView.this;
            if (iFindLastCompletelyVisibleItemPosition >= roomExploreHeadView.f27279OooOo00.size() - 1) {
                roomExploreHeadView.f27273OooOOOO.setVisibility(8);
            } else {
                roomExploreHeadView.f27273OooOOOO.setVisibility(0);
            }
        }
    }

    public RoomExploreHeadView(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        v4 v4Var = new v4(fragmentActivity);
        this.f27275OooOOo = v4Var;
        this.f27276OooOOo0.setAdapter((ListAdapter) v4Var);
        v4Var.f57682OooO0Oo = new OooO00o();
    }

    public final void OooO(List<CategoryModel> list, boolean z) {
        RecyclerView recyclerView;
        if (list == null) {
            this.f27279OooOo00 = new ArrayList();
        }
        if (z) {
            this.f27279OooOo00.clear();
            if (list != null) {
                this.f27279OooOo00.addAll(list);
            }
        }
        RecyclerView recyclerView2 = this.f27271OooOOO;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(8);
        }
        ArrayList arrayList = this.f27279OooOo00;
        if (arrayList == null || arrayList.isEmpty() || (recyclerView = this.f27271OooOOO) == null) {
            return;
        }
        recyclerView.setVisibility(0);
        FixLinearLayoutManager fixLinearLayoutManager = new FixLinearLayoutManager(this.f22259OooO0o);
        fixLinearLayoutManager.setOrientation(0);
        this.f27271OooOOO.setLayoutManager(fixLinearLayoutManager);
        if (this.f27274OooOOOo == null) {
            this.f27274OooOOOo = new RecAdapterTag(this.f27279OooOo00);
        }
        this.f27271OooOOO.setAdapter(this.f27274OooOOOo);
        this.f27271OooOOO.addOnScrollListener(new OooO0O0(fixLinearLayoutManager));
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsView
    public final int OooO0OO() {
        return oo0o0Oo.room_explore_head_view;
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsView
    public final void OooO0Oo() {
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsView
    public final void OooO0o() {
        this.f27270OooOO0o = (LinearLayout) OooO00o(o0OO00O.room_explore_head_country_layout);
        this.f27272OooOOO0 = (TextView) OooO0O0(o0OO00O.room_explore_head_view_tv_more);
        this.f27276OooOOo0 = (GridView) OooO00o(o0OO00O.room_explore_head_gridview_country);
        this.f27271OooOOO = (RecyclerView) OooO00o(o0OO00O.room_explore_head_view_rec_item_rec_tag);
        this.f27273OooOOOO = OooO00o(o0OO00O.ivShadow);
        this.f27278OooOo0 = OooO00o(o0OO00O.countryTitle);
        OooO0o0();
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsView
    public final void OooO0o0() {
        LinearLayout linearLayout = this.f27270OooOO0o;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        RecyclerView recyclerView = this.f27271OooOOO;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsView
    public final void OooO0oO(Object obj) {
        this.f22261OooO0oO = null;
        this.f22262OooO0oo = -1;
        OooO0oo(6, this.f27277OooOOoo, false);
        OooO(this.f27279OooOo00, false);
    }

    public final void OooO0oo(int i, List list, boolean z) {
        this.f27278OooOo0.setVisibility(0);
        if (this.f27277OooOOoo == null) {
            this.f27277OooOOoo = new ArrayList();
        }
        this.f27272OooOOO0.setVisibility(8);
        if (z) {
            this.f27277OooOOoo.clear();
            if (list != null && !list.isEmpty()) {
                if (list.size() > i) {
                    this.f27272OooOOO0.setVisibility(0);
                }
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (i2 < i) {
                        this.f27277OooOOoo.add((CountryModel) list.get(i2));
                    }
                }
            }
        }
        LinearLayout linearLayout = this.f27270OooOO0o;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        this.f27276OooOOo0.setVisibility(8);
        ArrayList arrayList = this.f27277OooOOoo;
        if (arrayList == null || arrayList.isEmpty() || this.f27270OooOO0o == null) {
            return;
        }
        this.f27276OooOOo0.setVisibility(0);
        this.f27270OooOO0o.setVisibility(0);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f27276OooOOo0.getLayoutParams();
        if (i == 3) {
            layoutParams.height = o0000O0.OooO00o(40);
        }
        if (i == 6) {
            layoutParams.height = o0000O0.OooO00o(90);
        }
        this.f27276OooOOo0.setLayoutParams(layoutParams);
        v4 v4Var = this.f27275OooOOo;
        if (v4Var != null) {
            v4Var.OooO0o0(this.f27277OooOOoo);
        }
    }

    @Override // p400o0Oo0O0.OooOO0O
    public final void onClickNotDouble(View view) {
        if (view.getId() == o0OO00O.room_explore_head_view_tv_more) {
            o0oo0000.OooO00o.OooO0O0("101084");
            Activity activity = this.f22259OooO0o;
            activity.startActivity(new Intent(activity, (Class<?>) CountryTagActivity.class));
        }
    }
}
