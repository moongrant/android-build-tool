package com.yalla.yalla.ui.activity.store;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.base.view.HeaderLayout;
import com.app.base.view.recyclerview.FixedRecyclerView;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.OooOo;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.materialdesign.FixGridLayoutManager;
import com.yalla.yalla.ui.vm.store.VehicleStoreVM;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p168o00Ooo0.o0O0O00;
import p176o00OoooO.oO000Oo;
import p176o00OoooO.oO000Oo0;
import p188o00o00o0.OooO0OO;
import p254o00ooO0O.o00O000o;
import p255o00ooO0o.oo0oOO0;
import p524o0o0O0oO.oo00oO;
import p564o0oOo00.o000;
import p564o0oOo00.o0000O;
import p564o0oOo00.o0000OO0;
import p564o0oOo00.o000O0o;
import p564o0oOo00.o000Oo0;
import p649o0ooOOoo.xh;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/store/VehicleStoreActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class VehicleStoreActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public static final OooO00o f23259OooooOO = new OooO00o();

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f23260OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(xh.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f23261Ooooo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(VehicleStoreVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.store.VehicleStoreActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.store.VehicleStoreActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.store.VehicleStoreActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f23266Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f23266Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public OooO0OO<ShopVehicleListModel> f23262Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public boolean f23263OooooO0;

    public static final class OooO00o {
        public final void OooO00o(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) VehicleStoreActivity.class));
        }
    }

    public static final void OooOoo(VehicleStoreActivity vehicleStoreActivity, ShopVehicleListModel shopVehicleListModel, String str) {
        oo0oOO0 oo0ooo0 = new oo0oOO0(vehicleStoreActivity);
        oo0ooo0.OooOo0O(str);
        oo0ooo0.OooOoOO(true);
        oo0ooo0.OooOo0o(new o000O0o(vehicleStoreActivity, shopVehicleListModel));
        oo0ooo0.OooOOO0();
    }

    public static final void OooOooO(VehicleStoreActivity vehicleStoreActivity, ShopVehicleListModel shopVehicleListModel, String str) {
        oo0oOO0 oo0ooo0 = new oo0oOO0(vehicleStoreActivity);
        oo0ooo0.OooOo0O(OooOo.OooO00o(OooOOO.OooO0OO(R.string.vehicle_store_open_vip_auto_have), str));
        oo0ooo0.OooOoOO(true);
        oo0ooo0.OooOOo0(OooOOO.OooO0OO(R.string.Get_Yalla_Premium));
        oo0ooo0.OooOo0o(new o000Oo0(vehicleStoreActivity, shopVehicleListModel));
        oo0ooo0.OooOOO0();
    }

    public final xh OooOooo() {
        return (xh) this.f23260OoooOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Oooo000() {
        BaseActivityK.OooOoo0(this, null, 0L, 3, null);
        ((VehicleStoreVM) this.f23261Ooooo00.getValue()).shopVehicleListAll().observe(this, new oo00oO(this, 4));
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOooo().f50981OooO00o);
        OooOo(R.string.vehicle_store_title);
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            headerLayout.OooOoo0(R.string.vehicle_store_mine, new o0000OO0());
        }
        OooOooo().f50984OooO0Oo.setOnRefreshListener(new oO000Oo0(this));
        ConstraintLayout constraintLayout = OooOooo().f50982OooO0O0.f51047OooO0O0;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.footLayout.clThemeFoot");
        o00O0O.OooO(constraintLayout);
        OooOooo().f50982OooO0O0.f51048OooO0OO.setText(o0O0O00.OooO0Oo(String.valueOf(p498o0o00Oo0.OooOOO.f41216OooO00o.OooO0OO().getValue())));
        OooOooo().f50982OooO0O0.f51049OooO0Oo.setOnClickListener(new o000(this));
        o0000O o0000o2 = new o0000O(this);
        this.f23262Ooooo0o = o0000o2;
        o0000o2.setOnItemClickListener(new oO000Oo(this, 2));
        OooO0OO<ShopVehicleListModel> oooO0OO = this.f23262Ooooo0o;
        OooO0OO<ShopVehicleListModel> oooO0OO2 = null;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            oooO0OO = null;
        }
        oooO0OO.setEmptyImageRes(R.drawable.ic_empty_delete);
        OooO0OO<ShopVehicleListModel> oooO0OO3 = this.f23262Ooooo0o;
        if (oooO0OO3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            oooO0OO3 = null;
        }
        oooO0OO3.setEmptyText(R.string.no_data);
        OooOooo().f50983OooO0OO.setLayoutManager(new FixGridLayoutManager(this, 2));
        FixedRecyclerView fixedRecyclerView = OooOooo().f50983OooO0OO;
        OooO0OO<ShopVehicleListModel> oooO0OO4 = this.f23262Ooooo0o;
        if (oooO0OO4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        } else {
            oooO0OO2 = oooO0OO4;
        }
        fixedRecyclerView.setAdapter(oooO0OO2);
        Oooo000();
    }
}
