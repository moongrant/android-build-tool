package com.yalla.yalla.ui.activity.store;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.code.android.util.o000O0Oo;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.ArrearsDetailModel;
import com.yalla.yalla.model.ArrearsModel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.store.ArrearsDetailActivity;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.store.ArrearsVM;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o00O00OO;
import p377o0OOoOo.o0000OO0;
import p417o0OoO0.o0000O0O;
import p499o0o00o0O.o000;
import p499o0o00o0O.o0000O;
import p499o0o00o0O.o000O000;
import p562o0oOo0O.o000oOoO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.n3;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/store/ArrearsDetailActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nArrearsDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrearsDetailActivity.kt\ncom/yalla/yalla/ui/activity/store/ArrearsDetailActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,113:1\n22#2,2:114\n75#3,13:116\n*S KotlinDebug\n*F\n+ 1 ArrearsDetailActivity.kt\ncom/yalla/yalla/ui/activity/store/ArrearsDetailActivity\n*L\n27#1:114,2\n28#1:116,13\n*E\n"})
public final class ArrearsDetailActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final /* synthetic */ int f26968OooOo0o = 0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public o000 f26972OooOo0O;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f26969OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(n3.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f26971OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ArrearsVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.store.ArrearsDetailActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.store.ArrearsDetailActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.store.ArrearsDetailActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f26980OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26980OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f26970OooOo0 = 1;

    @SourceDebugExtension({"SMAP\nArrearsDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrearsDetailActivity.kt\ncom/yalla/yalla/ui/activity/store/ArrearsDetailActivity$loadData$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n1#2:114\n*E\n"})
    public static final class OooO00o extends Lambda implements Function1<ArrearsModel, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f26974OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(boolean z) {
            super(1);
            this.f26974OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ArrearsModel arrearsModel) {
            List<ArrearsDetailModel> debtDetail;
            ArrearsModel arrearsModel2 = arrearsModel;
            int debtAmount = arrearsModel2 != null ? arrearsModel2.getDebtAmount() : 0;
            int i = ArrearsDetailActivity.f26968OooOo0o;
            ArrearsDetailActivity arrearsDetailActivity = ArrearsDetailActivity.this;
            arrearsDetailActivity.OooOoO0().f58446OooO0Oo.setText(ArrearsDetailActivity.OooOo(arrearsDetailActivity, debtAmount));
            o000 o000Var = null;
            if (this.f26974OooO0o0) {
                o000 o000Var2 = arrearsDetailActivity.f26972OooOo0O;
                if (o000Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    o000Var2 = null;
                }
                o000Var2.OooOoO0(arrearsModel2 != null ? arrearsModel2.getDebtDetail() : null);
            } else if (arrearsModel2 != null && (debtDetail = arrearsModel2.getDebtDetail()) != null) {
                o000 o000Var3 = arrearsDetailActivity.f26972OooOo0O;
                if (o000Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    o000Var3 = null;
                }
                o000Var3.OooO0O0(debtDetail);
            }
            o000 o000Var4 = arrearsDetailActivity.f26972OooOo0O;
            if (o000Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                o000Var = o000Var4;
            }
            o000Var.Oooo00o();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<ApiError, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            o000 o000Var = ArrearsDetailActivity.this.f26972OooOo0O;
            if (o000Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                o000Var = null;
            }
            o000Var.OooOoo();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<ApiResult<ArrearsModel>, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f26977OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(boolean z) {
            super(1);
            this.f26977OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<ArrearsModel> apiResult) {
            List<ArrearsDetailModel> debtDetail;
            ApiResult<ArrearsModel> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            ArrearsModel data = it.getData();
            boolean z = ((data == null || (debtDetail = data.getDebtDetail()) == null) ? 0 : debtDetail.size()) <= 0;
            int i = ArrearsDetailActivity.f26968OooOo0o;
            ArrearsDetailActivity.this.OooOoO0().f58447OooO0o0.OooOooo(this.f26977OooO0o0, it.isSuccess(), z);
            return Unit.INSTANCE;
        }
    }

    public static final String OooOo(ArrearsDetailActivity arrearsDetailActivity, int i) {
        arrearsDetailActivity.getClass();
        return i >= 0 ? o0000O0O.OooO0O0(String.valueOf(i)) : o00O00OO.OooO00o("-", o0000O0O.OooO0O0(String.valueOf(Math.abs(i))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOoO(boolean z) {
        this.f26970OooOo0 = z ? 1 : 1 + this.f26970OooOo0;
        ((ArrearsVM) this.f26971OooOo00.getValue()).getArrearsDetails(this.f26970OooOo0).observe(this, new o0000OO0(new OooO00o(z), new OooO0O0(), new OooO0OO(z), false, 8));
    }

    public final n3 OooOoO0() {
        return (n3) this.f26969OooOOoo.getValue();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p629o0ooO0O0.o00000OO
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOoO0().f58444OooO0O0)) {
            o0OO000.OooO00o("101020");
            Intrinsics.checkNotNullParameter(this, "context");
            Intent intent = new Intent(this, (Class<?>) WalletActivity.class);
            String strOooO0OO = com.code.android.util.OooO0O0.OooO0OO();
            LiveEventBus.get("RechargeFromUserInfo_OK").post(Boolean.TRUE);
            o0OO000.OooO0O0("205001", MapsKt.mapOf(new Pair("url", strOooO0OO)));
            intent.putExtra("FromInfo", strOooO0OO);
            startActivity(intent);
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoO0().f58443OooO00o);
        OooOOoo(oO00OOo0.main_arrears_title);
        OooOoO0().f58444OooO0O0.setOnClickListener(this);
        OooOoO0().f58447OooO0o0.f31258o00000OO = new o0000O(this);
        OooOoO0().f58447OooO0o0.f31259o00000Oo = new o000oOoO() { // from class: o0o00o0O.o0000OO0
            @Override // p562o0oOo0O.o000oOoO
            public final void OooO0O0() {
                int i = ArrearsDetailActivity.f26968OooOo0o;
                ArrearsDetailActivity this$0 = this.f49362OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoO(false);
            }
        };
        o000 o000Var = new o000(this, oO00OO0O.main_item_arrears_detail);
        this.f26972OooOo0O = o000Var;
        o000Var.OooOooo(oOo00OO0.ic_empty_delete);
        o000 o000Var2 = this.f26972OooOo0O;
        o000 o000Var3 = null;
        if (o000Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o000Var2 = null;
        }
        o000Var2.Oooo000(oO00OOo0.no_data);
        o000 o000Var4 = this.f26972OooOo0O;
        if (o000Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o000Var4 = null;
        }
        o000Var4.Oooo0OO(new o000O000(this));
        OooOoO0().f58445OooO0OO.setLayoutManager(new FixLinearLayoutManager(this));
        RecyclerView recyclerView = OooOoO0().f58445OooO0OO;
        o000 o000Var5 = this.f26972OooOo0O;
        if (o000Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            o000Var3 = o000Var5;
        }
        recyclerView.setAdapter(o000Var3);
        OooOoO(true);
    }
}
