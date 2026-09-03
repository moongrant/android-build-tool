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
import com.code.android.util.o000O0;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.moment.PurchaseLockRoomActivity;
import com.yalla.yalla.ui.activity.room.CreateRoomActivity;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p269o00oooo0.o0O0oo0o;
import p405o0Oo0OOO.oo00;
import p475o0Ooooo0.o0O00oO0;
import p492o0o00OO0.o0O0OOO0;
import p492o0o00OO0.o0O0OOOo;
import p492o0o00OO0.o0O0o000;
import p492o0o00OO0.oo0OOoo;
import p571o0oOoO0.o0000oo;
import p585o0oOooO.o0OO000o;
import p585o0oOooO.o0OO00OO;
import p585o0oOooO.oo0ooO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/PurchaseLockRoomActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPurchaseLockRoomActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchaseLockRoomActivity.kt\ncom/yalla/yalla/ui/activity/moment/PurchaseLockRoomActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,171:1\n22#2,2:172\n75#3,13:174\n*S KotlinDebug\n*F\n+ 1 PurchaseLockRoomActivity.kt\ncom/yalla/yalla/ui/activity/moment/PurchaseLockRoomActivity\n*L\n37#1:172,2\n39#1:174,13\n*E\n"})
public final class PurchaseLockRoomActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final /* synthetic */ int f25791OooOo0o = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f25792OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(oo00.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25794OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(o0OO00OO.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.PurchaseLockRoomActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f25800OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25800OooO0Oo;
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
    public final Lazy f25793OooOo0 = LazyKt.lazy(new OooO00o());

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final ArrayList f25795OooOo0O = new ArrayList();

    public static final class OooO00o extends Lambda implements Function0<o0OOO0o> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0OOO0o invoke() {
            return new o0OOO0o(PurchaseLockRoomActivity.this, p562o0oOo000.oo0o0Oo.room_item_store_lockroom);
        }
    }

    public static final class OooO0O0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f25797OooO0Oo;

        public OooO0O0(o0O0OOOo function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f25797OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f25797OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f25797OooO0Oo;
        }

        public final int hashCode() {
            return this.f25797OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f25797OooO0Oo.invoke(obj);
        }
    }

    public final oo00 OooOo() {
        return (oo00) this.f25792OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f45244OooO00o);
        HeaderLayout headerLayout = this.f22282OooOO0;
        if (headerLayout != null) {
            headerLayout.setTitle(p562o0oOo000.o000000.room_lock);
        }
        OooOo().f45245OooO0O0.f45401OooO0OO.setOnClickListener(new View.OnClickListener() { // from class: o0o00OO0.o0O0OO0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = PurchaseLockRoomActivity.f25791OooOo0o;
                PurchaseLockRoomActivity context = this.f49296OooO0Oo;
                Intrinsics.checkNotNullParameter(context, "this$0");
                context.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                context.startActivity(new Intent(context, (Class<?>) CreateRoomActivity.class));
                context.finish();
            }
        });
        p477o0o00.OooO0o oooO0oOooO00o = o0O0oo0o.OooO00o();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        int i = 0;
        if (oooO0oOooO00o.OooO0O0("HAS_ROOM" + o0O00oO0.OooOOo0().getValue(), false)) {
            OooOo().f45245OooO0O0.f45400OooO0O0.setVisibility(8);
        } else {
            OooOo().f45245OooO0O0.f45400OooO0O0.setVisibility(0);
        }
        OooOo().f45247OooO0Oo.setOnClickListener(new o0O0OOO0(this, i));
        OooOo().f45249OooO0o0.setLayoutManager(new FixLinearLayoutManager(this));
        RecyclerView recyclerView = OooOo().f45249OooO0o0;
        Lazy lazy = this.f25793OooOo0;
        recyclerView.setAdapter((o0000oo) lazy.getValue());
        ((o0000oo) lazy.getValue()).f13176OooO0o = new o000O00O.o0OO00O(this, 4);
        OooOo().f45246OooO0OO.setOnClickListener(this);
        ViewModelLazy viewModelLazy = this.f25794OooOo00;
        ((o0OO00OO) viewModelLazy.getValue()).getClass();
        com.code.android.util.o00oO0o.OooO00o(new o0OO000o(null)).observe(this, new p384o0OOoo0O.o000oOoO(new oo0OOoo(this), null, null, false, 14));
        ((o0OO00OO) viewModelLazy.getValue()).getClass();
        com.code.android.util.o00oO0o.OooO00o(new oo0ooO(null)).observe(this, new p384o0OOoo0O.o000oOoO(new o0O0o000(this), null, null, false, 14));
        o0O00oO0.OooO0O0().observe(this, new OooO0O0(new o0O0OOOo(this)));
    }
}
