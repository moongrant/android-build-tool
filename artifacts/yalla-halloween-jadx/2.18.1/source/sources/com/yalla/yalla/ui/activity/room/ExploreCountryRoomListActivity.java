package com.yalla.yalla.ui.activity.room;

import android.content.Context;
import android.content.Intent;
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
import com.app.base.model.CountryModel;
import com.app.base.view.indicator.YlTableLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.ui.view.StateLayout;
import com.yalla.yalla.model.CountryListModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.fragment.ExploreCountryRoomListFragment;
import com.yalla.yalla.ui.vm.main.MoreRoomVM;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o000Oo0;
import p254o00ooO0O.o00O000o;
import p254o00ooO0O.oOO00O;
import p544o0o0OoOO.w3;
import p544o0o0OoOO.x3;
import p544o0o0OoOO.y3;
import p649o0ooOOoo.fa;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/ExploreCountryRoomListActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "OooO0O0", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class ExploreCountryRoomListActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22797Ooooooo = new OooO00o();

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @Nullable
    public p188o00o00o0.OooO0OO<CountryModel> f22803OooooOo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public int f22805Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public boolean f22806OoooooO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f22798OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(fa.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22799Ooooo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MoreRoomVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.room.ExploreCountryRoomListActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f22816Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22816Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public final List<CountryModel> f22800Ooooo0o = new ArrayList();

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final List<String> f22801OooooO0 = new ArrayList();

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public final List<Fragment> f22802OooooOO = new ArrayList();

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @NotNull
    public final OooO0OO f22804Oooooo = new OooO0OO();

    public static final class OooO extends Lambda implements Function1<ApiError, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            ExploreCountryRoomListActivity exploreCountryRoomListActivity = ExploreCountryRoomListActivity.this;
            OooO00o oooO00o = ExploreCountryRoomListActivity.f22797Ooooooo;
            exploreCountryRoomListActivity.OooOoo().f49354OooO0Oo.OooO0o();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o {
        public final void OooO00o(@NotNull Context context, int i) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) ExploreCountryRoomListActivity.class);
            intent.putExtra("COUNTRY_ID", i);
            context.startActivity(intent);
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class OooO0O0 extends RecyclerView.OooOo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f22808OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f22809OooO0O0;

        public OooO0O0(int i, int i2) {
            this.f22808OooO00o = i;
            this.f22809OooO0O0 = i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOo
        public final void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.o0OOO0o state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            super.getItemOffsets(outRect, view, parent, state);
            int i = this.f22808OooO00o;
            outRect.left = i;
            outRect.right = i;
            outRect.bottom = this.f22809OooO0O0;
        }
    }

    public static final class OooO0OO extends FragmentStateAdapter {
        public OooO0OO() {
            super(ExploreCountryRoomListActivity.this);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<androidx.fragment.app.Fragment>] */
        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @NotNull
        public final Fragment createFragment(int i) {
            return (Fragment) ExploreCountryRoomListActivity.this.f22802OooooOO.get(i);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<androidx.fragment.app.Fragment>] */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return ExploreCountryRoomListActivity.this.f22802OooooOO.size();
        }
    }

    public static final class OooO0o extends Lambda implements Function1<CountryListModel, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Ref.IntRef f22812Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(Ref.IntRef intRef) {
            super(1);
            this.f22812Oooo0oO = intRef;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(CountryListModel countryListModel) {
            List<CountryModel> data;
            CountryListModel countryListModel2 = countryListModel;
            ExploreCountryRoomListActivity exploreCountryRoomListActivity = ExploreCountryRoomListActivity.this;
            OooO00o oooO00o = ExploreCountryRoomListActivity.f22797Ooooooo;
            exploreCountryRoomListActivity.OooOoo().f49354OooO0Oo.OooO0Oo();
            ConstraintLayout constraintLayout = ExploreCountryRoomListActivity.this.OooOoo().f49356OooO0o0;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.topLayout");
            oOO00O.OooO(constraintLayout);
            if (countryListModel2 != null && (data = countryListModel2.getData()) != null) {
                ExploreCountryRoomListActivity exploreCountryRoomListActivity2 = ExploreCountryRoomListActivity.this;
                Ref.IntRef intRef = this.f22812Oooo0oO;
                exploreCountryRoomListActivity2.f22800Ooooo0o.addAll(data);
                int size = data.size();
                for (int i = 0; i < size; i++) {
                    if (exploreCountryRoomListActivity2.f22805Oooooo0 == o000Oo0.OooO0OO(data.get(i).getCid(), 0)) {
                        exploreCountryRoomListActivity2.OooOoO0(data.get(i).getCid());
                        intRef.element = i;
                    }
                    List<String> list = exploreCountryRoomListActivity2.f22801OooooO0;
                    String name = data.get(i).getName();
                    Intrinsics.checkNotNullExpressionValue(name, "countryList[index].name");
                    list.add(name);
                    List<Fragment> list2 = exploreCountryRoomListActivity2.f22802OooooOO;
                    ExploreCountryRoomListFragment.Companion companion = ExploreCountryRoomListFragment.INSTANCE;
                    int iOooO0OO = o000Oo0.OooO0OO(data.get(i).getCid(), 0);
                    Objects.requireNonNull(companion);
                    Bundle bundle = new Bundle();
                    bundle.putInt("COUNTRY_ID", iOooO0OO);
                    ExploreCountryRoomListFragment exploreCountryRoomListFragment = new ExploreCountryRoomListFragment();
                    exploreCountryRoomListFragment.setArguments(bundle);
                    list2.add(exploreCountryRoomListFragment);
                }
            }
            Context context = ExploreCountryRoomListActivity.this.OooOoo().f49355OooO0o.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "binding.vpMoreRoom.context");
            Intrinsics.checkNotNullParameter(context, "context");
            o00o000O.OooO0O0.OooO00o oooO00o2 = new o00o000O.OooO0O0.OooO00o(context);
            oooO00o2.OooO0O0(ExploreCountryRoomListActivity.this.f22801OooooO0);
            oooO00o2.f32981OooO0o = o000O0O0.OooO00o(R.color.color_333333);
            oooO00o2.f32983OooO0oO = o000O0O0.OooO00o(R.color.color_999999);
            float f = 8;
            oooO00o2.f32995OooOo0 = com.yalla.support.common.util.OooOo00.OooO00o(f);
            oooO00o2.f32982OooO0o0 = 15.0f;
            oooO00o2.f32980OooO0Oo = 15.0f;
            oooO00o2.f32996OooOo00 = com.yalla.support.common.util.OooOo00.OooO00o(f);
            oooO00o2.f32983OooO0oO = o000O0O0.OooO00o(R.color.color_alpha_38_A3);
            ViewPager2 viewPager2 = ExploreCountryRoomListActivity.this.OooOoo().f49355OooO0o;
            Intrinsics.checkNotNullExpressionValue(viewPager2, "binding.vpMoreRoom");
            oooO00o2.OooO0Oo(viewPager2);
            oooO00o2.f32984OooO0oo = com.yalla.support.common.util.OooOo00.OooO00o(2);
            oooO00o2.f32976OooO = o000O0O0.OooO00o(R.color.color_00d8c9);
            oooO00o2.f32985OooOO0 = com.yalla.support.common.util.OooOo00.OooO00o(11);
            oooO00o2.f32986OooOO0O = com.yalla.support.common.util.OooOo00.OooO00o(3);
            oooO00o2.f32978OooO0O0.setAdjustMode(false);
            YlTableLayout ylTableLayout = ExploreCountryRoomListActivity.this.OooOoo().f49357OooO0oO;
            Intrinsics.checkNotNullExpressionValue(ylTableLayout, "binding.ylMoreRoom");
            oooO00o2.OooO00o(ylTableLayout);
            ExploreCountryRoomListActivity.this.OooOoo().f49355OooO0o.setOffscreenPageLimit(ExploreCountryRoomListActivity.this.f22802OooooOO.size());
            ExploreCountryRoomListActivity.this.OooOoo().f49355OooO0o.setAdapter(ExploreCountryRoomListActivity.this.f22804Oooooo);
            ExploreCountryRoomListActivity.this.OooOoo().f49355OooO0o.setCurrentItem(this.f22812Oooo0oO.element);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<ApiResult<CountryListModel>, Unit> {
        public OooOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<CountryListModel> apiResult) {
            ApiResult<CountryListModel> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            ExploreCountryRoomListActivity.this.OooOoO();
            return Unit.INSTANCE;
        }
    }

    public final fa OooOoo() {
        return (fa) this.f22798OoooOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOooO() {
        this.f22805Oooooo0 = getIntent().getIntExtra("COUNTRY_ID", 0);
        Ref.IntRef intRef = new Ref.IntRef();
        BaseActivityK.OooOoo0(this, null, 0L, 3, null);
        ((MoreRoomVM) this.f22799Ooooo00.getValue()).getCountryList(2).observe(this, new o0o0000.OooOo(new OooO0o(intRef), new OooO(), new OooOO0(), false, 8));
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f49351OooO00o);
        OooOo(R.string.countries);
        OooOoo().f49354OooO0Oo.setEmptyText(o000O0O0.OooO0OO(R.string.blank_ta_no_rooms));
        OooOoo().f49354OooO0Oo.setEmptyImage(R.drawable.ic_empty_room_tag);
        OooOoo().f49354OooO0Oo.setErrorImage(R.drawable.ic_empty_delete);
        StateLayout stateLayout = OooOoo().f49354OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(stateLayout, "binding.stateLayout");
        StateLayout.OooOO0(stateLayout, 0, new w3(this), 3);
        OooOoo().f49352OooO0O0.setOnClickListener(new x3(this));
        OooOoo().f49355OooO0o.registerOnPageChangeCallback(new y3(this));
        OooOooO();
    }
}
