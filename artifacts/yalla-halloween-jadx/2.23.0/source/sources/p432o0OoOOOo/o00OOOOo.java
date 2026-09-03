package p432o0OoOOOo;

import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.common.manager.PayManager;
import com.yalla.yalla.data.db.table.PayOrder;
import com.yalla.yalla.manager.unBlur.googlepay.quick.GooglePayQuickVM;
import com.yalla.yalla.model.RechargeMenuModel;
import com.yalla.yalla.model.RechargeMenuType;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.ui.view.StateLayout;
import com.yalla.yalla.ui.vm.WalletCoinVM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p157o00OoOO0.o0OO00O;
import p377o0OOoOo.o0000OO0;
import p427o0OoOO00.Oooo0;
import p519o0o0O0oO.oO00O0oO;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nGooglePayQuickUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayQuickUI.kt\ncom/yalla/yalla/manager/unBlur/googlepay/quick/GooglePayQuickUI\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,463:1\n1855#2,2:464\n1855#2,2:466\n*S KotlinDebug\n*F\n+ 1 GooglePayQuickUI.kt\ncom/yalla/yalla/manager/unBlur/googlepay/quick/GooglePayQuickUI\n*L\n112#1:464,2\n138#1:466,2\n*E\n"})
public final class o00OOOOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final Lazy f45919OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f45920OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Lazy f45921OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public TextView f45922OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public RecyclerView f45923OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f45924OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public StateLayout f45925OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final Lazy f45926OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final Lazy f45927OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public Oooo0 f45928OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Lazy f45929OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f45930OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final ArrayList f45931OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f45932OooOOO0;

    public static final class OooO extends Lambda implements Function0<PayManager> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final PayManager invoke() {
            return new PayManager(o00OOOOo.this.f45920OooO00o);
        }
    }

    public static final class OooO00o extends Lambda implements Function0<o00OOOO0> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00OOOO0 invoke() {
            return new o00OOOO0(o00OOOOo.this.f45920OooO00o);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<RechargeMenuModel, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(RechargeMenuModel rechargeMenuModel) {
            RechargeMenuModel rechargeMenuModel2 = rechargeMenuModel;
            o00OOOOo o00ooooo2 = o00OOOOo.this;
            if (rechargeMenuModel2 == null || rechargeMenuModel2.getData().isEmpty()) {
                StateLayout stateLayout = o00ooooo2.f45925OooO0o0;
                if (stateLayout != null) {
                    stateLayout.OooO0o0();
                }
            } else {
                o00ooooo2.f45931OooOOO.clear();
                o00ooooo2.f45931OooOOO.addAll(rechargeMenuModel2.getDataBan());
                List<RechargeMenuType> data = rechargeMenuModel2.getData();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = data.iterator();
                while (it.hasNext()) {
                    arrayList.add(((RechargeMenuType) it.next()).getSku());
                }
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(o00ooooo2.f45920OooO00o), Dispatchers.getIO(), null, new o0OoO00O(arrayList, o00ooooo2, data, null), 2, null);
            }
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
            StateLayout stateLayout = o00OOOOo.this.f45925OooO0o0;
            if (stateLayout != null) {
                stateLayout.OooO0o();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<oO00O0oO> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oO00O0oO invoke() {
            return new oO00O0oO(o00OOOOo.this.f45920OooO00o);
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<GooglePayQuickVM> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final GooglePayQuickVM invoke() {
            return (GooglePayQuickVM) new ViewModelProvider(o00OOOOo.this.f45920OooO00o).get(GooglePayQuickVM.class);
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<WalletCoinVM> {
        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final WalletCoinVM invoke() {
            return (WalletCoinVM) new ViewModelProvider(o00OOOOo.this.f45920OooO00o).get(WalletCoinVM.class);
        }
    }

    public o00OOOOo(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f45920OooO00o = activity;
        this.f45921OooO0O0 = LazyKt.lazy(new OooO0o());
        this.f45926OooO0oO = LazyKt.lazy(new OooOO0());
        this.f45927OooO0oo = LazyKt.lazy(new OooOO0O());
        this.f45919OooO = LazyKt.lazy(new OooO());
        this.f45929OooOO0O = LazyKt.lazy(new OooO00o());
        this.f45931OooOOO = new ArrayList();
    }

    public static final void OooO00o(PayOrder payOrder, o00OOOOo o00ooooo2) {
        o00ooooo2.f45930OooOO0o = true;
        o00ooooo2.OooO0o0().confirmRechargeOrder(payOrder).observe(o00ooooo2.f45920OooO00o, new o0000OO0(new o0oOO(payOrder, o00ooooo2), new o0O00o0(payOrder, o00ooooo2), new oo00oO(o00ooooo2), false, 8));
    }

    public static final void OooO0O0(PayOrder payOrder, o00OOOOo o00ooooo2) {
        o00ooooo2.f45930OooOO0o = false;
        FragmentActivity fragmentActivity = o00ooooo2.f45920OooO00o;
        o0OO00O o0oo00o2 = new o0OO00O(fragmentActivity);
        if (o00ooooo2.f45932OooOOO0 >= 3) {
            String string = fragmentActivity.getString(oO00OOo0.Validation_Failed);
            Intrinsics.checkNotNullExpressionValue(string, "activity.getString(R.string.Validation_Failed)");
            o0oo00o2.OooOoO(string);
            String string2 = fragmentActivity.getString(oO00OOo0.Validation_Failed_content);
            Intrinsics.checkNotNullExpressionValue(string2, "activity.getString(R.str…alidation_Failed_content)");
            o0oo00o2.OooOo00(string2);
            String string3 = fragmentActivity.getString(oO00OOo0.Validation_Failed_Contact_Us);
            Intrinsics.checkNotNullExpressionValue(string3, "activity.getString(R.str…dation_Failed_Contact_Us)");
            o0oo00o2.OooOo0o(string3);
            o0oo00o2.OooOo0O(new o0O000O(o0oo00o2));
            String string4 = fragmentActivity.getString(oO00OOo0.Validate_Again);
            Intrinsics.checkNotNullExpressionValue(string4, "activity.getString(R.string.Validate_Again)");
            o0oo00o2.OooOOOo(string4);
            o0oo00o2.OooOo0(new o0OoOoOo(payOrder, o00ooooo2));
        } else {
            String string5 = fragmentActivity.getString(oO00OOo0.Purchase_Validation_Failed);
            Intrinsics.checkNotNullExpressionValue(string5, "activity.getString(R.str…rchase_Validation_Failed)");
            o0oo00o2.OooOoO(string5);
            String string6 = fragmentActivity.getString(oO00OOo0.Purchase_Validation_Failed_content);
            Intrinsics.checkNotNullExpressionValue(string6, "activity.getString(R.str…alidation_Failed_content)");
            o0oo00o2.OooOo00(string6);
            String string7 = fragmentActivity.getString(oO00OOo0.Validate_Again);
            Intrinsics.checkNotNullExpressionValue(string7, "activity.getString(R.string.Validate_Again)");
            o0oo00o2.OooOOOo(string7);
            o0oo00o2.OooOo0(new o0O000Oo(payOrder, o00ooooo2));
        }
        o0oo00o2.OooOO0o();
    }

    public static final void OooO0OO(PayOrder payOrder, o00OOOOo o00ooooo2) {
        o00ooooo2.getClass();
        if (StringsKt.isBlank(payOrder.getPurchaseToken())) {
            o00ooooo2.f45930OooOO0o = false;
        } else {
            o00ooooo2.f45930OooOO0o = true;
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(o00ooooo2.f45920OooO00o), Dispatchers.getIO(), null, new o0O000o0(o00ooooo2, payOrder, null), 2, null);
        }
    }

    public static void OooO0oO(o00OOOOo o00ooooo2, String str, int i) {
        if ((i & 1) != 0) {
            str = o00ooooo2.f45920OooO00o.getString(oO00OOo0.loading);
        }
        ((oO00O0oO) o00ooooo2.f45921OooO0O0.getValue()).OooO0o0(0L, str);
    }

    public final o00OOOO0 OooO0Oo() {
        return (o00OOOO0) this.f45929OooOO0O.getValue();
    }

    public final void OooO0o() {
        OooO0o0().loadRechargeMenu().observe(this.f45920OooO00o, new o0000OO0(new OooO0O0(), new OooO0OO(), null, false, 12));
    }

    public final GooglePayQuickVM OooO0o0() {
        return (GooglePayQuickVM) this.f45926OooO0oO.getValue();
    }
}
