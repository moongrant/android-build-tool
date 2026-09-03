package com.yalla.yalla.ui.activity.store;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O0;
import com.yalla.yalla.model.ShopVehicleListModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.view.materialdesign.FixGridLayoutManager;
import com.yalla.yalla.ui.view.recyclerview.FixedRecyclerView;
import com.yalla.yalla.ui.vm.store.VehicleStoreVM;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import o000O00O.o000O0o;
import o000O00O.o0Oo0oo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p205o00o0o0o.o000O;
import p405o0Oo0OOO.c2;
import p450o0OoOooO.oo0OOoo;
import p475o0Ooooo0.o0O00oO0;
import p505o0o00oOO.o0OOOO0o;
import p505o0o00oOO.o0OOo000;
import p505o0o00oOO.o0oo0000;
import p505o0o00oOO.oO0Oo;
import p562o0oOo000.o000000;
import p562o0oOo000.oo0o0Oo;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/store/VehicleStoreActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nVehicleStoreActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleStoreActivity.kt\ncom/yalla/yalla/ui/activity/store/VehicleStoreActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,444:1\n22#2,2:445\n75#3,13:447\n*S KotlinDebug\n*F\n+ 1 VehicleStoreActivity.kt\ncom/yalla/yalla/ui/activity/store/VehicleStoreActivity\n*L\n55#1:445,2\n56#1:447,13\n*E\n"})
public final class VehicleStoreActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ int f26578OooOo = 0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public o0OOOO0o f26580OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f26582OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f26583OooOo0o;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f26579OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(c2.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f26581OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(VehicleStoreVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.store.VehicleStoreActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f26586OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26586OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    @SourceDebugExtension({"SMAP\nVehicleStoreActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleStoreActivity.kt\ncom/yalla/yalla/ui/activity/store/VehicleStoreActivity$Companion\n+ 2 ActivityExt.kt\ncom/yalla/yalla/ext/ActivityExtKt\n*L\n1#1,444:1\n17#2,5:445\n*S KotlinDebug\n*F\n+ 1 VehicleStoreActivity.kt\ncom/yalla/yalla/ui/activity/store/VehicleStoreActivity$Companion\n*L\n437#1:445,5\n*E\n"})
    public static final class OooO00o {
        public static void OooO00o(@NotNull Context context, boolean z) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) VehicleStoreActivity.class);
            intent.putExtra("IS_FROM_OUTFIT", z);
            context.startActivity(intent);
        }
    }

    public static final void OooOo(VehicleStoreActivity vehicleStoreActivity, ShopVehicleListModel shopVehicleListModel, String str) {
        vehicleStoreActivity.getClass();
        o000O o000o = new o000O(vehicleStoreActivity);
        o000o.OooOo00(str);
        o000o.OooOo(true);
        o000o.OooOo0(new oO0Oo(shopVehicleListModel, vehicleStoreActivity));
        o000o.OooOO0o();
    }

    public static final void OooOoO0(VehicleStoreActivity vehicleStoreActivity, ShopVehicleListModel shopVehicleListModel, String str) {
        vehicleStoreActivity.getClass();
        o000O o000o = new o000O(vehicleStoreActivity);
        o000o.OooOo00(o0000O.OooO00o(o0000.OooO0OO(o000000.vehicle_store_open_vip_auto_have), str));
        o000o.OooOo(true);
        o000o.OooOOOo(o0000.OooO0OO(o000000.Get_Yalla_Premium));
        o000o.OooOo0(new o0oo0000(shopVehicleListModel, vehicleStoreActivity));
        o000o.OooOO0o();
    }

    public final c2 OooOoO() {
        return (c2) this.f26579OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOoOO() {
        BaseActivityK.OooOo0o(this, null, 0L, 3);
        this.f26582OooOo0O = getIntent().getBooleanExtra("IS_FROM_OUTFIT", false);
        ((VehicleStoreVM) this.f26581OooOo00.getValue()).shopVehicleListAll().observe(this, new oo0OOoo(this, 1));
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoO().f43757OooO00o);
        OooOOoo(o000000.vehicle_store_title);
        HeaderLayout headerLayout = this.f22282OooOO0;
        if (headerLayout != null) {
            headerLayout.OooOoO0(o000000.vehicle_store_mine, new o0OOo000());
        }
        int i = 2;
        OooOoO().f43760OooO0Oo.setOnRefreshListener(new o000O0o(this, i));
        ConstraintLayout clThemeFoot = OooOoO().f43758OooO0O0.f43784OooO0O0;
        Intrinsics.checkNotNullExpressionValue(clThemeFoot, "clThemeFoot");
        com.code.android.util.o000O.OooOOOO(clThemeFoot);
        TextView textView = OooOoO().f43758OooO0O0.f43785OooO0OO;
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        textView.setText(o0O0O0Oo.OooO0Oo(String.valueOf(o0O00oO0.OooO0O0().getValue())));
        OooOoO().f43758OooO0O0.f43786OooO0Oo.setOnClickListener(new OooO0OO(this));
        o0OOOO0o o0oooo0o2 = new o0OOOO0o(this, oo0o0Oo.user_activity_vehicle_store_item);
        this.f26580OooOo0 = o0oooo0o2;
        o0oooo0o2.f13176OooO0o = new o0Oo0oo(this, i);
        o0oooo0o2.OooOooo(p562o0oOo000.o0Oo0oo.ic_empty_delete);
        o0OOOO0o o0oooo0o3 = this.f26580OooOo0;
        o0OOOO0o o0oooo0o4 = null;
        if (o0oooo0o3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            o0oooo0o3 = null;
        }
        o0oooo0o3.Oooo000(o000000.no_data);
        OooOoO().f43759OooO0OO.setLayoutManager(new FixGridLayoutManager(this, 2));
        FixedRecyclerView fixedRecyclerView = OooOoO().f43759OooO0OO;
        o0OOOO0o o0oooo0o5 = this.f26580OooOo0;
        if (o0oooo0o5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        } else {
            o0oooo0o4 = o0oooo0o5;
        }
        fixedRecyclerView.setAdapter(o0oooo0o4);
        OooOoOO();
    }
}
