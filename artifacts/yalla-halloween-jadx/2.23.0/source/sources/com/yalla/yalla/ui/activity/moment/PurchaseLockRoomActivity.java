package com.yalla.yalla.ui.activity.moment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.o0000OO0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.code.android.util.OooO0O0;
import com.code.android.util.o000O0Oo;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.room.LockShopModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.moment.PurchaseLockRoomActivity;
import com.yalla.yalla.ui.activity.room.CreateRoomActivity;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p157o00OoOO0.o0OO00O;
import p464o0Oooo.o000000O;
import p480o0o000Oo.o0OOO0o;
import p485o0o00O0.o0O;
import p485o0o00O0.o0O0oo00;
import p485o0o00O0.o0oOo0O0;
import p564o0oOo0OO.o000O;
import p580o0oOoo0.o000OOo0;
import p580o0oOoo0.o00O0000;
import p580o0oOoo0.o0O0ooO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.i7;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/PurchaseLockRoomActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPurchaseLockRoomActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchaseLockRoomActivity.kt\ncom/yalla/yalla/ui/activity/moment/PurchaseLockRoomActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,171:1\n22#2,2:172\n75#3,13:174\n*S KotlinDebug\n*F\n+ 1 PurchaseLockRoomActivity.kt\ncom/yalla/yalla/ui/activity/moment/PurchaseLockRoomActivity\n*L\n37#1:172,2\n39#1:174,13\n*E\n"})
public final class PurchaseLockRoomActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final /* synthetic */ int f26240OooOo0o = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f26241OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(i7.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f26243OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(o0O0ooO.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.PurchaseLockRoomActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f26249OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26249OooO0Oo;
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
    public final Lazy f26242OooOo0 = LazyKt.lazy(new OooO00o());

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final ArrayList f26244OooOo0O = new ArrayList();

    public static final class OooO00o extends Lambda implements Function0<o0OOO0o> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0OOO0o invoke() {
            return new o0OOO0o(PurchaseLockRoomActivity.this, oO00OO0O.room_item_store_lockroom);
        }
    }

    public static final class OooO0O0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f26246OooO0Oo;

        public OooO0O0(o0oOo0O0 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f26246OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f26246OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f26246OooO0Oo;
        }

        public final int hashCode() {
            return this.f26246OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f26246OooO0Oo.invoke(obj);
        }
    }

    public final i7 OooOo() {
        return (i7) this.f26241OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f58122OooO00o);
        HeaderLayout headerLayout = this.f22755OooOO0;
        if (headerLayout != null) {
            headerLayout.setTitle(oO00OOo0.room_lock);
        }
        OooOo().f58123OooO0O0.f57603OooO0OO.setOnClickListener(new View.OnClickListener() { // from class: o0o00O0.o0O0o00O
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = PurchaseLockRoomActivity.f26240OooOo0o;
                PurchaseLockRoomActivity context = this.f47979OooO0Oo;
                Intrinsics.checkNotNullParameter(context, "this$0");
                context.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                context.startActivity(new Intent(context, (Class<?>) CreateRoomActivity.class));
                context.finish();
            }
        });
        p480o0o000Oo.o0OOO0o o0ooo0oOooO0O0 = o0000OO0.OooO0O0();
        p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
        if (o0ooo0oOooO0O0.OooO0O0("HAS_ROOM" + p464o0Oooo.o000000O.OooOOo0().getValue(), false)) {
            OooOo().f58123OooO0O0.f57602OooO0O0.setVisibility(8);
        } else {
            OooOo().f58123OooO0O0.f57602OooO0O0.setVisibility(0);
        }
        OooOo().f58125OooO0Oo.setOnClickListener(new View.OnClickListener() { // from class: o0o00O0.o0O0o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = PurchaseLockRoomActivity.f26240OooOo0o;
                PurchaseLockRoomActivity context = this.f47977OooO0Oo;
                Intrinsics.checkNotNullParameter(context, "this$0");
                context.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                Intent intent = new Intent(context, (Class<?>) WalletActivity.class);
                String strOooO0OO = OooO0O0.OooO0OO();
                LiveEventBus.get("RechargeFromUserInfo_OK").post(Boolean.TRUE);
                o0OO000.OooO0O0("205001", MapsKt.mapOf(new Pair("url", strOooO0OO)));
                intent.putExtra("FromInfo", strOooO0OO);
                context.startActivity(intent);
            }
        });
        OooOo().f58127OooO0o0.setLayoutManager(new FixLinearLayoutManager(this));
        RecyclerView recyclerView = OooOo().f58127OooO0o0;
        Lazy lazy = this.f26242OooOo0;
        recyclerView.setAdapter((o000O) lazy.getValue());
        ((o000O) lazy.getValue()).f10098OooO0o = new BaseQuickAdapter.OooO0o() { // from class: o0o00O0.o0O0o000
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
            public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                int i2 = PurchaseLockRoomActivity.f26240OooOo0o;
                PurchaseLockRoomActivity this$0 = this.f47978OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o0OOO0o o0ooo0oOooO0O1 = o0000OO0.OooO0O0();
                o000000O o000000o3 = o000000O.f46674OooO00o;
                if (o0ooo0oOooO0O1.OooO0O0("HAS_ROOM" + o000000O.OooOOo0().getValue(), false)) {
                    LockShopModel.LockShopModelItem lockShopModelItem = (LockShopModel.LockShopModelItem) this$0.f26244OooOo0O.get(i);
                    o0OO00O o0oo00o2 = new o0OO00O(this$0);
                    o0oo00o2.OooOOoo(oO00OOo0.purchase_roomlock);
                    o0oo00o2.OooOo(true);
                    o0oo00o2.OooOo0(new o0OO000o(this$0, lockShopModelItem));
                    o0oo00o2.OooOO0o();
                }
            }
        };
        OooOo().f58124OooO0OO.setOnClickListener(this);
        ViewModelLazy viewModelLazy = this.f26243OooOo00;
        ((o0O0ooO) viewModelLazy.getValue()).getClass();
        com.code.android.util.o00oO0o.OooO00o(new o000OOo0(null)).observe(this, new p377o0OOoOo.o0000OO0(new o0O0oo00(this), null, null, false, 14));
        ((o0O0ooO) viewModelLazy.getValue()).getClass();
        com.code.android.util.o00oO0o.OooO00o(new o00O0000(null)).observe(this, new p377o0OOoOo.o0000OO0(new o0O(this), null, null, false, 14));
        p464o0Oooo.o000000O.OooO0O0().observe(this, new OooO0O0(new o0oOo0O0(this)));
    }
}
