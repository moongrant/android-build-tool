package com.yalla.yalla.ui.activity.store;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.colorspace.OooOO0;
import androidx.compose.ui.graphics.colorspace.OooOO0O;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O0Oo;
import com.code.android.util.o000OO00;
import com.yalla.yalla.model.ShopVehicleListModel;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.view.materialdesign.FixGridLayoutManager;
import com.yalla.yalla.ui.view.recyclerview.FixedRecyclerView;
import com.yalla.yalla.ui.vm.store.VehicleStoreVM;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p157o00OoOO0.o0OO00O;
import p464o0Oooo.o000000O;
import p499o0o00o0O.o00OO;
import p499o0o00o0O.o00OOO00;
import p499o0o00o0O.o00OOO0O;
import p499o0o00o0O.o0o0Oo;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p590o0oo0.OooOOOO;
import p641o0ooOOOO.na;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/store/VehicleStoreActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVehicleStoreActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleStoreActivity.kt\ncom/yalla/yalla/ui/activity/store/VehicleStoreActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,444:1\n22#2,2:445\n75#3,13:447\n*S KotlinDebug\n*F\n+ 1 VehicleStoreActivity.kt\ncom/yalla/yalla/ui/activity/store/VehicleStoreActivity\n*L\n55#1:445,2\n56#1:447,13\n*E\n"})
public final class VehicleStoreActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ int f27043OooOo = 0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public o00OO f27045OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f27047OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f27048OooOo0o;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f27044OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(na.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f27046OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(VehicleStoreVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.store.VehicleStoreActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f27052OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f27052OooO0Oo;
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

    public static final class OooO0O0 implements Observer<Response<List<ShopVehicleListModel>>> {
        public OooO0O0() {
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0030  */
        /* JADX WARN: Code duplicated, block: B:13:0x0037  */
        /* JADX WARN: Code duplicated, block: B:16:0x0042  */
        /* JADX WARN: Code duplicated, block: B:17:0x0046  */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(Response<List<ShopVehicleListModel>> response) {
            o00OO o00oo2;
            o00OO o00oo3;
            o00OO o00oo4;
            Response<List<ShopVehicleListModel>> response2 = response;
            boolean isSuccess = response2.getIsSuccess();
            VehicleStoreActivity vehicleStoreActivity = VehicleStoreActivity.this;
            if (!isSuccess || response2.getData() == null) {
                o00oo2 = vehicleStoreActivity.f27045OooOo0;
                o00oo3 = null;
                if (o00oo2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                    o00oo2 = null;
                }
                o00oo2.OooOoO0(null);
                o00oo4 = vehicleStoreActivity.f27045OooOo0;
                if (o00oo4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                } else {
                    o00oo3 = o00oo4;
                }
                o00oo3.Oooo00o();
            } else {
                List<ShopVehicleListModel> data = response2.getData();
                Intrinsics.checkNotNull(data);
                if (data.size() > 0) {
                    o00OO o00oo5 = vehicleStoreActivity.f27045OooOo0;
                    if (o00oo5 != null) {
                        List<ShopVehicleListModel> data2 = response2.getData();
                        Intrinsics.checkNotNull(data2);
                        o00oo5.OooOoO0(data2);
                    }
                } else {
                    o00oo2 = vehicleStoreActivity.f27045OooOo0;
                    o00oo3 = null;
                    if (o00oo2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                        o00oo2 = null;
                    }
                    o00oo2.OooOoO0(null);
                    o00oo4 = vehicleStoreActivity.f27045OooOo0;
                    if (o00oo4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                    } else {
                        o00oo3 = o00oo4;
                    }
                    o00oo3.Oooo00o();
                }
            }
            int i = VehicleStoreActivity.f27043OooOo;
            vehicleStoreActivity.OooOoO().f58470OooO0Oo.OooOooo(true, response2.getIsSuccess(), response2.getNoMoreData());
            vehicleStoreActivity.OooOo0();
        }
    }

    public static final void OooOo(VehicleStoreActivity vehicleStoreActivity, ShopVehicleListModel shopVehicleListModel, String str) {
        vehicleStoreActivity.getClass();
        o0OO00O o0oo00o2 = new o0OO00O(vehicleStoreActivity);
        o0oo00o2.OooOo00(str);
        o0oo00o2.OooOo(true);
        o0oo00o2.OooOo0(new o00OOO0O(shopVehicleListModel, vehicleStoreActivity));
        o0oo00o2.OooOO0o();
    }

    public static final void OooOoO0(VehicleStoreActivity vehicleStoreActivity, ShopVehicleListModel shopVehicleListModel, String str) {
        vehicleStoreActivity.getClass();
        o0OO00O o0oo00o2 = new o0OO00O(vehicleStoreActivity);
        o0oo00o2.OooOo00(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.vehicle_store_open_vip_auto_have), str));
        o0oo00o2.OooOo(true);
        o0oo00o2.OooOOOo(o0000.OooO0OO(oO00OOo0.Get_Yalla_Premium));
        o0oo00o2.OooOo0(new o0o0Oo(shopVehicleListModel, vehicleStoreActivity));
        o0oo00o2.OooOO0o();
    }

    public final na OooOoO() {
        return (na) this.f27044OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOoOO() {
        BaseActivityK.OooOo0o(this, null, 0L, 3);
        this.f27047OooOo0O = getIntent().getBooleanExtra("IS_FROM_OUTFIT", false);
        ((VehicleStoreVM) this.f27046OooOo00.getValue()).shopVehicleListAll().observe(this, new OooO0O0());
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoO().f58467OooO00o);
        OooOOoo(oO00OOo0.vehicle_store_title);
        HeaderLayout headerLayout = this.f22755OooOO0;
        if (headerLayout != null) {
            headerLayout.OooOoO0(oO00OOo0.vehicle_store_mine, new o00OOO00());
        }
        OooOoO().f58470OooO0Oo.setOnRefreshListener(new OooOO0(this));
        ConstraintLayout constraintLayout = OooOoO().f58468OooO0O0.f58547OooO0O0;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.footLayout.clThemeFoot");
        o000OO00.OooOOOO(constraintLayout);
        TextView textView = OooOoO().f58468OooO0O0.f58548OooO0OO;
        o000000O o000000o2 = o000000O.f46674OooO00o;
        textView.setText(OooOOOO.OooO0Oo(String.valueOf(o000000O.OooO0O0().getValue())));
        OooOoO().f58468OooO0O0.f58549OooO0Oo.setOnClickListener(new OooO0OO(this));
        o00OO o00oo2 = new o00OO(this, oO00OO0O.user_activity_vehicle_store_item);
        this.f27045OooOo0 = o00oo2;
        o00oo2.f10098OooO0o = new OooOO0O(this);
        o00oo2.OooOooo(oOo00OO0.ic_empty_delete);
        o00OO o00oo3 = this.f27045OooOo0;
        o00OO o00oo4 = null;
        if (o00oo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            o00oo3 = null;
        }
        o00oo3.Oooo000(oO00OOo0.no_data);
        OooOoO().f58469OooO0OO.setLayoutManager(new FixGridLayoutManager(this, 2));
        FixedRecyclerView fixedRecyclerView = OooOoO().f58469OooO0OO;
        o00OO o00oo5 = this.f27045OooOo0;
        if (o00oo5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        } else {
            o00oo4 = o00oo5;
        }
        fixedRecyclerView.setAdapter(o00oo4);
        OooOoOO();
    }
}
