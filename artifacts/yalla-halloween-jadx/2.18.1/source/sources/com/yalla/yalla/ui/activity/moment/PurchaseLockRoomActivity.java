package com.yalla.yalla.ui.activity.moment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.android.billingclient.api.o00000O;
import com.app.base.view.HeaderLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.LockShopModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00OOooo.o00O00OO;
import p166o00OoOoo.o0O00O0o;
import p254o00ooO0O.o0000O0O;
import p254o00ooO0O.o00O000o;
import p258o00ooOOo.c;
import p501o0o00o.o000OO;
import p538o0o0Oo0.o00OOOO0;
import p538o0o0Oo0.o00OOOOo;
import p538o0o0Oo0.o0o0Oo;
import p608o0oo0O0O.o000OOo0;
import p608o0oo0O0O.o00O0000;
import p608o0oo0O0O.o0O0ooO;
import p649o0ooOOoo.se;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/PurchaseLockRoomActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class PurchaseLockRoomActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22505OooooOO = new OooO00o();

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f22506OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(se.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22507Ooooo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(o0O0ooO.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.PurchaseLockRoomActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.moment.PurchaseLockRoomActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.moment.PurchaseLockRoomActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f22513Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22513Oooo0o;
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
    public final Lazy f22508Ooooo0o = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public List<LockShopModel.LockShopModelItem> f22509OooooO0 = new ArrayList();

    public static final class OooO00o {
        public final void OooO00o(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) PurchaseLockRoomActivity.class));
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<OooOo00> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooOo00 invoke() {
            return new OooOo00(PurchaseLockRoomActivity.this);
        }
    }

    public final p188o00o00o0.OooO0OO<LockShopModel.LockShopModelItem> OooOoo() {
        return (p188o00o00o0.OooO0OO) this.f22508Ooooo0o.getValue();
    }

    public final se OooOooO() {
        return (se) this.f22506OoooOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final o0O0ooO OooOooo() {
        return (o0O0ooO) this.f22507Ooooo00.getValue();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOooO().f50599OooO00o);
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            headerLayout.setTitle(R.string.room_lock);
        }
        int i = 2;
        OooOooO().f50600OooO0O0.f49980OooO0OO.setOnClickListener(new c(this, i));
        o0O00O0o o0o00o0oOooO0O0 = o00000O.OooO0O0();
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("HAS_ROOM");
        p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
        sbOooO0o0.append(oooOOO.OooOo().getValue());
        int i2 = 0;
        if (o0o00o0oOooO0O0.OooO0Oo(sbOooO0o0.toString(), false)) {
            OooOooO().f50600OooO0O0.f49979OooO0O0.setVisibility(8);
        } else {
            OooOooO().f50600OooO0O0.f49979OooO0O0.setVisibility(0);
        }
        OooOooO().f50602OooO0Oo.setOnClickListener(new o00O00OO(this, i));
        OooOooO().f50604OooO0o0.setLayoutManager(new FixLinearLayoutManager(this));
        OooOooO().f50604OooO0o0.setAdapter(OooOoo());
        OooOoo().setOnItemClickListener(new o0o0Oo(this, i2));
        OooOooO().f50601OooO0OO.setOnClickListener(this);
        Objects.requireNonNull(OooOooo());
        o0000O0O.OooO00o(new o000OOo0(null)).observe(this, new o0o0000.OooOo(new o00OOOO0(this), null, null, false, 14));
        Objects.requireNonNull(OooOooo());
        o0000O0O.OooO00o(new o00O0000(null)).observe(this, new o0o0000.OooOo(new o00OOOOo(this), null, null, false, 14));
        oooOOO.OooO0OO().observe(this, new o000OO(this, 3));
    }
}
