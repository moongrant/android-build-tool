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
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.ArrearsDetailModel;
import com.yalla.yalla.model.ArrearsModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.store.ArrearsVM;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import o0o0000.OooOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o00O0O0O;
import p175o00OooOo.o0OO0O0;
import p254o00ooO0O.o00O000o;
import p391o0OOooOo.o0O00000;
import p522o0o0O0o.o00O0;
import p536o0o0OOoo.t0;
import p564o0oOo00.OooO;
import p564o0oOo00.OooOO0;
import p649o0ooOOoo.ea;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/store/ArrearsDetailActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class ArrearsDetailActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public static final OooO00o f23194OooooOO = new OooO00o();

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f23195OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(ea.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f23196Ooooo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ArrearsVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.store.ArrearsDetailActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f23206Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f23206Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f23197Ooooo0o = 1;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public p188o00o00o0.OooO0OO<ArrearsDetailModel> f23198OooooO0;

    public static final class OooO00o {
    }

    public static final class OooO0O0 extends Lambda implements Function1<ArrearsModel, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f23200Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(boolean z) {
            super(1);
            this.f23200Oooo0oO = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ArrearsModel arrearsModel) {
            List<ArrearsDetailModel> debtDetail;
            ArrearsModel arrearsModel2 = arrearsModel;
            int debtAmount = arrearsModel2 != null ? arrearsModel2.getDebtAmount() : 0;
            ArrearsDetailActivity arrearsDetailActivity = ArrearsDetailActivity.this;
            OooO00o oooO00o = ArrearsDetailActivity.f23194OooooOO;
            arrearsDetailActivity.OooOooO().f49235OooO0Oo.setText(ArrearsDetailActivity.OooOoo(ArrearsDetailActivity.this, debtAmount));
            p188o00o00o0.OooO0OO<ArrearsDetailModel> oooO0OO = null;
            if (this.f23200Oooo0oO) {
                p188o00o00o0.OooO0OO<ArrearsDetailModel> oooO0OO2 = ArrearsDetailActivity.this.f23198OooooO0;
                if (oooO0OO2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    oooO0OO2 = null;
                }
                oooO0OO2.setNewData(arrearsModel2 != null ? arrearsModel2.getDebtDetail() : null);
            } else if (arrearsModel2 != null && (debtDetail = arrearsModel2.getDebtDetail()) != null) {
                p188o00o00o0.OooO0OO<ArrearsDetailModel> oooO0OO3 = ArrearsDetailActivity.this.f23198OooooO0;
                if (oooO0OO3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    oooO0OO3 = null;
                }
                oooO0OO3.addData(debtDetail);
            }
            p188o00o00o0.OooO0OO<ArrearsDetailModel> oooO0OO4 = ArrearsDetailActivity.this.f23198OooooO0;
            if (oooO0OO4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                oooO0OO = oooO0OO4;
            }
            oooO0OO.setLoadComplete();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<ApiError, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            p188o00o00o0.OooO0OO<ArrearsDetailModel> oooO0OO = ArrearsDetailActivity.this.f23198OooooO0;
            if (oooO0OO == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                oooO0OO = null;
            }
            oooO0OO.loadError();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<ApiResult<ArrearsModel>, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f23203Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(boolean z) {
            super(1);
            this.f23203Oooo0oO = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<ArrearsModel> apiResult) {
            List<ArrearsDetailModel> debtDetail;
            ApiResult<ArrearsModel> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            ArrearsModel data = it.getData();
            boolean z = ((data == null || (debtDetail = data.getDebtDetail()) == null) ? 0 : debtDetail.size()) <= 0;
            ArrearsDetailActivity arrearsDetailActivity = ArrearsDetailActivity.this;
            OooO00o oooO00o = ArrearsDetailActivity.f23194OooooOO;
            arrearsDetailActivity.OooOooO().f49236OooO0o0.Oooo0o0(this.f23203Oooo0oO, it.isSuccess(), z);
            return Unit.INSTANCE;
        }
    }

    public static final String OooOoo(ArrearsDetailActivity arrearsDetailActivity, int i) {
        Objects.requireNonNull(arrearsDetailActivity);
        if (i >= 0) {
            return o00O0.OooO0O0(String.valueOf(i));
        }
        StringBuilder sbOooO00o = o00O0O0O.OooO00o('-');
        sbOooO00o.append(o00O0.OooO0O0(String.valueOf(Math.abs(i))));
        return sbOooO00o.toString();
    }

    public final ea OooOooO() {
        return (ea) this.f23195OoooOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOooo(boolean z) {
        this.f23197Ooooo0o = z ? 1 : 1 + this.f23197Ooooo0o;
        ((ArrearsVM) this.f23196Ooooo00.getValue()).getArrearsDetails(this.f23197Ooooo0o).observe(this, new OooOo(new OooO0O0(z), new OooO0OO(), new OooO0o(z), false, 8));
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, o00Oo00.OooO00o
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOooO().f49233OooO0O0)) {
            o0O00000.OooO0OO("Room_Debtreminder_recharge");
            Intrinsics.checkNotNullParameter(this, "context");
            Intent intent = new Intent(this, (Class<?>) WalletActivity.class);
            String simpleName = getClass().getSimpleName();
            p606o0oo0O.OooOo.OooO0OO("205001", MapsKt.mapOf(new Pair("url", simpleName)));
            intent.putExtra("FromInfo", simpleName);
            startActivity(intent);
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOooO().f49232OooO00o);
        OooOo(R.string.main_arrears_title);
        OooOooO().f49233OooO0O0.setOnClickListener(this);
        OooOooO().f49236OooO0o0.f12222o000O0Oo = new o0OO0O0(this, 2);
        OooOooO().f49236OooO0o0.f12224o000OO0O = new t0(this, 1);
        OooO oooO = new OooO(this);
        this.f23198OooooO0 = oooO;
        oooO.setEmptyImageRes(R.drawable.ic_empty_delete);
        p188o00o00o0.OooO0OO<ArrearsDetailModel> oooO0OO = this.f23198OooooO0;
        p188o00o00o0.OooO0OO<ArrearsDetailModel> oooO0OO2 = null;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        oooO0OO.setEmptyText(R.string.no_data);
        p188o00o00o0.OooO0OO<ArrearsDetailModel> oooO0OO3 = this.f23198OooooO0;
        if (oooO0OO3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO3 = null;
        }
        oooO0OO3.setLoadErrorClickListener(new OooOO0(this));
        OooOooO().f49234OooO0OO.setLayoutManager(new FixLinearLayoutManager(this));
        RecyclerView recyclerView = OooOooO().f49234OooO0OO;
        p188o00o00o0.OooO0OO<ArrearsDetailModel> oooO0OO4 = this.f23198OooooO0;
        if (oooO0OO4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            oooO0OO2 = oooO0OO4;
        }
        recyclerView.setAdapter(oooO0OO2);
        OooOooo(true);
    }
}
