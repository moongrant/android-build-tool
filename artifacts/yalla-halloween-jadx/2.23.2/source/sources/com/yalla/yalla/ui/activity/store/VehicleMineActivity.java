package com.yalla.yalla.ui.activity.store;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o000O0;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.materialdesign.FixGridLayoutManager;
import com.yalla.yalla.ui.view.recyclerview.FixedRecyclerView;
import com.yalla.yalla.ui.vm.store.VehicleStoreVM;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import o000O00O.o000OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p037OoooOo0.o00O0000;
import p405o0Oo0OOO.b2;
import p448o0OoOoo.o0O000o0;
import p505o0o00oOO.o0OO0oO0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/store/VehicleMineActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nVehicleMineActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleMineActivity.kt\ncom/yalla/yalla/ui/activity/store/VehicleMineActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,277:1\n22#2,2:278\n75#3,13:280\n1855#4,2:293\n*S KotlinDebug\n*F\n+ 1 VehicleMineActivity.kt\ncom/yalla/yalla/ui/activity/store/VehicleMineActivity\n*L\n48#1:278,2\n49#1:280,13\n67#1:293,2\n*E\n"})
public final class VehicleMineActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ int f26568OooOo = 0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public o0OO0oO0 f26570OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public long f26572OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f26573OooOo0o;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f26569OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(b2.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f26571OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(VehicleStoreVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.store.VehicleMineActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f26576OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26576OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    public final b2 OooOo() {
        return (b2) this.f26569OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f43736OooO00o);
        OooOOoo(o000000.vehicle_mine_title);
        int i = 2;
        OooOo().f43738OooO0OO.setOnRefreshListener(new o00O0000(this, i));
        o0OO0oO0 o0oo0oo1 = new o0OO0oO0(this, oo0o0Oo.user_activity_vehicle_mine_item);
        this.f26570OooOo0 = o0oo0oo1;
        o0oo0oo1.f13176OooO0o = new o000OO(this, i);
        o0oo0oo1.OooOooo(o0Oo0oo.ic_empty_delete);
        o0OO0oO0 o0oo0oo2 = this.f26570OooOo0;
        if (o0oo0oo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            o0oo0oo2 = null;
        }
        o0oo0oo2.Oooo000(o000000.vehicle_mine_empty_hint);
        OooOo().f43737OooO0O0.setLayoutManager(new FixGridLayoutManager(this, 2));
        FixedRecyclerView fixedRecyclerView = OooOo().f43737OooO0O0;
        o0OO0oO0 o0oo0oo3 = this.f26570OooOo0;
        if (o0oo0oo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            o0oo0oo3 = null;
        }
        fixedRecyclerView.setAdapter(o0oo0oo3);
        BaseActivityK.OooOo0o(this, null, 0L, 3);
        ((VehicleStoreVM) this.f26571OooOo00.getValue()).shopVehicleListMine().observe(this, new o0O000o0(this, 1));
    }
}
