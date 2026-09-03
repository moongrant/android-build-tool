package com.yalla.yalla.ui.activity.store;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.colorspace.OooO0o;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o000O0Oo;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.materialdesign.FixGridLayoutManager;
import com.yalla.yalla.ui.view.recyclerview.FixedRecyclerView;
import com.yalla.yalla.ui.vm.store.VehicleStoreVM;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p499o0o00o0O.o00O0O0O;
import p499o0o00o0O.o00O0OOO;
import p499o0o00o0O.oo0oOO0;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.ma;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/store/VehicleMineActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVehicleMineActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleMineActivity.kt\ncom/yalla/yalla/ui/activity/store/VehicleMineActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,277:1\n22#2,2:278\n75#3,13:280\n*S KotlinDebug\n*F\n+ 1 VehicleMineActivity.kt\ncom/yalla/yalla/ui/activity/store/VehicleMineActivity\n*L\n48#1:278,2\n49#1:280,13\n*E\n"})
public final class VehicleMineActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ int f27033OooOo = 0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public o00O0OOO f27035OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public long f27037OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f27038OooOo0o;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f27034OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(ma.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f27036OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(VehicleStoreVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.store.VehicleMineActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f27041OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f27041OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    public final ma OooOo() {
        return (ma) this.f27034OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f58425OooO00o);
        OooOOoo(oO00OOo0.vehicle_mine_title);
        OooOo().f58427OooO0OO.setOnRefreshListener(new o00O0O0O(this, 0));
        o00O0OOO o00o0ooo2 = new o00O0OOO(this, oO00OO0O.user_activity_vehicle_mine_item);
        this.f27035OooOo0 = o00o0ooo2;
        o00o0ooo2.f10098OooO0o = new OooO0o(this);
        o00o0ooo2.OooOooo(oOo00OO0.ic_empty_delete);
        o00O0OOO o00o0ooo3 = this.f27035OooOo0;
        if (o00o0ooo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            o00o0ooo3 = null;
        }
        o00o0ooo3.Oooo000(oO00OOo0.vehicle_mine_empty_hint);
        OooOo().f58426OooO0O0.setLayoutManager(new FixGridLayoutManager(this, 2));
        FixedRecyclerView fixedRecyclerView = OooOo().f58426OooO0O0;
        o00O0OOO o00o0ooo4 = this.f27035OooOo0;
        if (o00o0ooo4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            o00o0ooo4 = null;
        }
        fixedRecyclerView.setAdapter(o00o0ooo4);
        BaseActivityK.OooOo0o(this, null, 0L, 3);
        ((VehicleStoreVM) this.f27036OooOo00.getValue()).shopVehicleListMine().observe(this, new oo0oOO0(this));
    }
}
