package p436o0OoOOo;

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
import p205o00o0o0o.o000O;
import p384o0OOoo0O.o000oOoO;
import p429o0OoOO.Oooo000;
import p562o0oOo000.o000000;
import p650o0ooo.o0OOO00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nGooglePayQuickUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayQuickUI.kt\ncom/yalla/yalla/manager/unBlur/googlepay/quick/GooglePayQuickUI\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,463:1\n1855#2,2:464\n1855#2,2:466\n*S KotlinDebug\n*F\n+ 1 GooglePayQuickUI.kt\ncom/yalla/yalla/manager/unBlur/googlepay/quick/GooglePayQuickUI\n*L\n112#1:464,2\n138#1:466,2\n*E\n"})
public final class o0000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final Lazy f47022OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f47023OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Lazy f47024OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public TextView f47025OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public RecyclerView f47026OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f47027OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public StateLayout f47028OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final Lazy f47029OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final Lazy f47030OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public Oooo000 f47031OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Lazy f47032OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f47033OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final ArrayList f47034OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f47035OooOOO0;

    public static final class OooO extends Lambda implements Function0<PayManager> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final PayManager invoke() {
            return new PayManager(o0000.this.f47023OooO00o);
        }
    }

    public static final class OooO00o extends Lambda implements Function0<o0000Ooo> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0000Ooo invoke() {
            return new o0000Ooo(o0000.this.f47023OooO00o);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<RechargeMenuModel, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(RechargeMenuModel rechargeMenuModel) {
            RechargeMenuModel rechargeMenuModel2 = rechargeMenuModel;
            o0000 o0000Var = o0000.this;
            if (rechargeMenuModel2 == null || rechargeMenuModel2.getData().isEmpty()) {
                StateLayout stateLayout = o0000Var.f47028OooO0o0;
                if (stateLayout != null) {
                    stateLayout.OooO0o0();
                }
            } else {
                o0000Var.f47034OooOOO.clear();
                o0000Var.f47034OooOOO.addAll(rechargeMenuModel2.getDataBan());
                List<RechargeMenuType> data = rechargeMenuModel2.getData();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = data.iterator();
                while (it.hasNext()) {
                    arrayList.add(((RechargeMenuType) it.next()).getSku());
                }
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(o0000Var.f47023OooO00o), Dispatchers.getIO(), null, new o000OO0O(arrayList, o0000Var, data, null), 2, null);
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
            StateLayout stateLayout = o0000.this.f47028OooO0o0;
            if (stateLayout != null) {
                stateLayout.OooO0o();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<o0OOO00> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0OOO00 invoke() {
            return new o0OOO00(o0000.this.f47023OooO00o);
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<GooglePayQuickVM> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final GooglePayQuickVM invoke() {
            return (GooglePayQuickVM) new ViewModelProvider(o0000.this.f47023OooO00o).get(GooglePayQuickVM.class);
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<WalletCoinVM> {
        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final WalletCoinVM invoke() {
            return (WalletCoinVM) new ViewModelProvider(o0000.this.f47023OooO00o).get(WalletCoinVM.class);
        }
    }

    public o0000(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f47023OooO00o = activity;
        this.f47024OooO0O0 = LazyKt.lazy(new OooO0o());
        this.f47029OooO0oO = LazyKt.lazy(new OooOO0());
        this.f47030OooO0oo = LazyKt.lazy(new OooOO0O());
        this.f47022OooO = LazyKt.lazy(new OooO());
        this.f47032OooOO0O = LazyKt.lazy(new OooO00o());
        this.f47034OooOOO = new ArrayList();
    }

    public static final void OooO00o(PayOrder payOrder, o0000 o0000Var) {
        o0000Var.f47033OooOO0o = true;
        o0000Var.OooO0o0().confirmRechargeOrder(payOrder).observe(o0000Var.f47023OooO00o, new o000oOoO(new o0000oo(payOrder, o0000Var), new o0000O0(payOrder, o0000Var), new o0000O0O(o0000Var), false, 8));
    }

    public static final void OooO0O0(PayOrder payOrder, o0000 o0000Var) {
        o0000Var.f47033OooOO0o = false;
        FragmentActivity fragmentActivity = o0000Var.f47023OooO00o;
        o000O o000o = new o000O(fragmentActivity);
        if (o0000Var.f47035OooOOO0 >= 3) {
            String string = fragmentActivity.getString(o000000.Validation_Failed);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            o000o.OooOoO(string);
            String string2 = fragmentActivity.getString(o000000.Validation_Failed_content);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            o000o.OooOo00(string2);
            String string3 = fragmentActivity.getString(o000000.Validation_Failed_Contact_Us);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            o000o.OooOo0o(string3);
            o000o.OooOo0O(new o000Oo0(o000o));
            String string4 = fragmentActivity.getString(o000000.Validate_Again);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            o000o.OooOOOo(string4);
            o000o.OooOo0(new o000O00(payOrder, o0000Var));
        } else {
            String string5 = fragmentActivity.getString(o000000.Purchase_Validation_Failed);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            o000o.OooOoO(string5);
            String string6 = fragmentActivity.getString(o000000.Purchase_Validation_Failed_content);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            o000o.OooOo00(string6);
            String string7 = fragmentActivity.getString(o000000.Validate_Again);
            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
            o000o.OooOOOo(string7);
            o000o.OooOo0(new o000O00O(payOrder, o0000Var));
        }
        o000o.OooOO0o();
    }

    public static final void OooO0OO(PayOrder payOrder, o0000 o0000Var) {
        o0000Var.getClass();
        if (StringsKt.isBlank(payOrder.getPurchaseToken())) {
            o0000Var.f47033OooOO0o = false;
        } else {
            o0000Var.f47033OooOO0o = true;
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(o0000Var.f47023OooO00o), Dispatchers.getIO(), null, new o000O0(o0000Var, payOrder, null), 2, null);
        }
    }

    public static void OooO0oO(o0000 o0000Var, String str, int i) {
        if ((i & 1) != 0) {
            str = o0000Var.f47023OooO00o.getString(o000000.loading);
        }
        ((o0OOO00) o0000Var.f47024OooO0O0.getValue()).OooO0o0(0L, str);
    }

    public final o0000Ooo OooO0Oo() {
        return (o0000Ooo) this.f47032OooOO0O.getValue();
    }

    public final void OooO0o() {
        OooO0o0().loadRechargeMenu().observe(this.f47023OooO00o, new o000oOoO(new OooO0O0(), new OooO0OO(), null, false, 12));
    }

    public final GooglePayQuickVM OooO0o0() {
        return (GooglePayQuickVM) this.f47029OooO0oO.getValue();
    }
}
