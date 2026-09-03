package com.yalla.yalla.ui.activity.room;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.yalla.yalla.model.CountryListModel;
import com.yalla.yalla.model.CountryModel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.fragment.ExploreCountryRoomListFragment;
import com.yalla.yalla.ui.view.StateLayout;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import com.yalla.yalla.ui.vm.main.MoreRoomVM;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.o3;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/ExploreCountryRoomListActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nExploreCountryRoomListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExploreCountryRoomListActivity.kt\ncom/yalla/yalla/ui/activity/room/ExploreCountryRoomListActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,198:1\n22#2,2:199\n75#3,13:201\n*S KotlinDebug\n*F\n+ 1 ExploreCountryRoomListActivity.kt\ncom/yalla/yalla/ui/activity/room/ExploreCountryRoomListActivity\n*L\n37#1:199,2\n38#1:201,13\n*E\n"})
public final class ExploreCountryRoomListActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final /* synthetic */ int f26525OooOoo0 = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public o00000O f26527OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f26533OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f26534OooOoOO;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final com.code.android.util.o000O0Oo f26526OooOOoo = new com.code.android.util.o000O0Oo(Reflection.getOrCreateKotlinClass(o3.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f26529OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MoreRoomVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.room.ExploreCountryRoomListActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.room.ExploreCountryRoomListActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.room.ExploreCountryRoomListActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f26544OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26544OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final ArrayList f26528OooOo0 = new ArrayList();

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final ArrayList f26530OooOo0O = new ArrayList();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final ArrayList f26531OooOo0o = new ArrayList();

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f26532OooOoO = new OooO0O0();

    public static final class OooO extends Lambda implements Function1<ApiResult<CountryListModel>, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<CountryListModel> apiResult) {
            ApiResult<CountryListModel> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            ExploreCountryRoomListActivity.this.OooOo0();
            return Unit.INSTANCE;
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class OooO00o extends RecyclerView.OooOo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f26536OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f26537OooO0O0;

        public OooO00o(int i, int i2) {
            this.f26536OooO00o = i;
            this.f26537OooO0O0 = i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOo
        public final void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.o0OOO0o state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            super.getItemOffsets(outRect, view, parent, state);
            int i = this.f26536OooO00o;
            outRect.left = i;
            outRect.right = i;
            outRect.bottom = this.f26537OooO0O0;
        }
    }

    public static final class OooO0O0 extends FragmentStateAdapter {
        public OooO0O0() {
            super(ExploreCountryRoomListActivity.this);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @NotNull
        public final Fragment createFragment(int i) {
            return (Fragment) ExploreCountryRoomListActivity.this.f26531OooOo0o.get(i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return ExploreCountryRoomListActivity.this.f26531OooOo0o.size();
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<CountryListModel, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Ref.IntRef f26540OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Ref.IntRef intRef) {
            super(1);
            this.f26540OooO0o0 = intRef;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(CountryListModel countryListModel) {
            List<CountryModel> data;
            CountryListModel countryListModel2 = countryListModel;
            int i = ExploreCountryRoomListActivity.f26525OooOoo0;
            ExploreCountryRoomListActivity exploreCountryRoomListActivity = ExploreCountryRoomListActivity.this;
            exploreCountryRoomListActivity.OooOo().f58508OooO0Oo.OooO0Oo();
            ConstraintLayout constraintLayout = exploreCountryRoomListActivity.OooOo().f58510OooO0o0;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.topLayout");
            com.code.android.util.o000OO00.OooOOOO(constraintLayout);
            ArrayList arrayList = exploreCountryRoomListActivity.f26531OooOo0o;
            ArrayList arrayList2 = exploreCountryRoomListActivity.f26530OooOo0O;
            Ref.IntRef intRef = this.f26540OooO0o0;
            if (countryListModel2 != null && (data = countryListModel2.getData()) != null) {
                exploreCountryRoomListActivity.f26528OooOo0.addAll(data);
                int size = data.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (exploreCountryRoomListActivity.f26533OooOoO0 == com.code.android.util.o000000.OooO0o0(data.get(i2).getCid())) {
                        exploreCountryRoomListActivity.OooOo00(data.get(i2).getCid());
                        intRef.element = i2;
                    }
                    String name = data.get(i2).getName();
                    Intrinsics.checkNotNullExpressionValue(name, "countryList[index].name");
                    arrayList2.add(name);
                    ExploreCountryRoomListFragment.Companion companion = ExploreCountryRoomListFragment.INSTANCE;
                    int iOooO0o0 = com.code.android.util.o000000.OooO0o0(data.get(i2).getCid());
                    companion.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putInt("COUNTRY_ID", iOooO0o0);
                    ExploreCountryRoomListFragment exploreCountryRoomListFragment = new ExploreCountryRoomListFragment();
                    exploreCountryRoomListFragment.setArguments(bundle);
                    arrayList.add(exploreCountryRoomListFragment);
                }
            }
            Context context = exploreCountryRoomListActivity.OooOo().f58509OooO0o.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "binding.vpMoreRoom.context");
            Intrinsics.checkNotNullParameter(context, "context");
            o0oOOoo.o0oO0O0o.OooO00o oooO00o = new o0oOOoo.o0oO0O0o.OooO00o(context);
            oooO00o.OooO0O0(arrayList2);
            oooO00o.f56022OooO0o0 = com.code.android.util.o0000.OooO00o(oO00O0o.color_333333);
            oooO00o.f56024OooO0oo = com.code.android.util.o0000.OooO00o(oO00O0o.color_999999);
            float f = 8;
            oooO00o.f56037OooOo0O = com.code.android.util.o0000O0.OooO00o(f);
            oooO00o.f56020OooO0Oo = 15.0f;
            oooO00o.f56019OooO0OO = 15.0f;
            oooO00o.f56035OooOo0 = com.code.android.util.o0000O0.OooO00o(f);
            oooO00o.f56024OooO0oo = com.code.android.util.o0000.OooO00o(oO00O0o.color_alpha_38_A3);
            ViewPager2 viewPager2 = exploreCountryRoomListActivity.OooOo().f58509OooO0o;
            Intrinsics.checkNotNullExpressionValue(viewPager2, "binding.vpMoreRoom");
            oooO00o.OooO0OO(viewPager2);
            oooO00o.f56016OooO = com.code.android.util.o0000O0.OooO00o(2);
            oooO00o.f56025OooOO0 = com.code.android.util.o0000.OooO00o(oO00O0o.color_00d8c9);
            oooO00o.f56026OooOO0O = com.code.android.util.o0000O0.OooO00o(11);
            oooO00o.f56027OooOO0o = com.code.android.util.o0000O0.OooO00o(3);
            oooO00o.f56017OooO00o.setAdjustMode(false);
            YlTableLayout ylTableLayout = exploreCountryRoomListActivity.OooOo().f58511OooO0oO;
            Intrinsics.checkNotNullExpressionValue(ylTableLayout, "binding.ylMoreRoom");
            oooO00o.OooO00o(ylTableLayout);
            exploreCountryRoomListActivity.OooOo().f58509OooO0o.setOffscreenPageLimit(arrayList.size());
            exploreCountryRoomListActivity.OooOo().f58509OooO0o.setAdapter(exploreCountryRoomListActivity.f26532OooOoO);
            exploreCountryRoomListActivity.OooOo().f58509OooO0o.setCurrentItem(intRef.element);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<ApiError, Unit> {
        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            int i = ExploreCountryRoomListActivity.f26525OooOoo0;
            ExploreCountryRoomListActivity.this.OooOo().f58508OooO0Oo.OooO0o();
            return Unit.INSTANCE;
        }
    }

    public final o3 OooOo() {
        return (o3) this.f26526OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOoO0() {
        this.f26533OooOoO0 = getIntent().getIntExtra("COUNTRY_ID", 0);
        Ref.IntRef intRef = new Ref.IntRef();
        BaseActivityK.OooOo0o(this, null, 0L, 3);
        ((MoreRoomVM) this.f26529OooOo00.getValue()).getCountryList(2).observe(this, new p377o0OOoOo.o0000OO0(new OooO0OO(intRef), new OooO0o(), new OooO(), false, 8));
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f58505OooO00o);
        OooOOoo(oO00OOo0.countries);
        OooOo().f58508OooO0Oo.setEmptyText(com.code.android.util.o0000.OooO0OO(oO00OOo0.blank_ta_no_rooms));
        OooOo().f58508OooO0Oo.setEmptyImage(oOo00OO0.ic_empty_room_tag);
        OooOo().f58508OooO0Oo.setErrorImage(oOo00OO0.ic_empty_delete);
        StateLayout stateLayout = OooOo().f58508OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(stateLayout, "binding.stateLayout");
        StateLayout.OooOO0(stateLayout, 0, new o000000O(this), 3);
        OooOo().f58506OooO0O0.setOnClickListener(new o00000(this));
        OooOo().f58509OooO0o.registerOnPageChangeCallback(new o00000O0(this));
        OooOoO0();
    }
}
