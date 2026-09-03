package com.yalla.yalla.ui.activity.store;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.base.view.recyclerview.FixedRecyclerView;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.materialdesign.FixGridLayoutManager;
import com.yalla.yalla.ui.vm.store.VehicleStoreVM;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o0O0OOOo.Oooo000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p188o00o00o0.OooO0OO;
import p254o00ooO0O.o00O000o;
import p501o0o00o.o000OO;
import p564o0oOo00.o0000;
import p564o0oOo00.o00000O0;
import p649o0ooOOoo.wh;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/store/VehicleMineActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class VehicleMineActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f23249OooooOo = new OooO00o();

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f23250OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(wh.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f23251Ooooo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(VehicleStoreVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.store.VehicleMineActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.store.VehicleMineActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.store.VehicleMineActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f23257Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f23257Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public OooO0OO<ShopVehicleListModel> f23252Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public long f23253OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public boolean f23254OooooOO;

    public static final class OooO00o {
    }

    public final wh OooOoo() {
        return (wh) this.f23250OoooOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOooO() {
        BaseActivityK.OooOoo0(this, null, 0L, 3, null);
        ((VehicleStoreVM) this.f23251Ooooo00.getValue()).shopVehicleListMine().observe(this, new o000OO(this, 5));
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f50905OooO00o);
        OooOo(R.string.vehicle_mine_title);
        OooOoo().f50907OooO0OO.setOnRefreshListener(new o00000O0(this));
        o0000 o0000Var = new o0000(this);
        this.f23252Ooooo0o = o0000Var;
        o0000Var.setOnItemClickListener(new Oooo000(this));
        OooO0OO<ShopVehicleListModel> oooO0OO = this.f23252Ooooo0o;
        OooO0OO<ShopVehicleListModel> oooO0OO2 = null;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            oooO0OO = null;
        }
        oooO0OO.setEmptyImageRes(R.drawable.ic_empty_delete);
        OooO0OO<ShopVehicleListModel> oooO0OO3 = this.f23252Ooooo0o;
        if (oooO0OO3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            oooO0OO3 = null;
        }
        oooO0OO3.setEmptyText(R.string.vehicle_mine_empty_hint);
        OooOoo().f50906OooO0O0.setLayoutManager(new FixGridLayoutManager(this, 2));
        FixedRecyclerView fixedRecyclerView = OooOoo().f50906OooO0O0;
        OooO0OO<ShopVehicleListModel> oooO0OO4 = this.f23252Ooooo0o;
        if (oooO0OO4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        } else {
            oooO0OO2 = oooO0OO4;
        }
        fixedRecyclerView.setAdapter(oooO0OO2);
        OooOooO();
    }
}
