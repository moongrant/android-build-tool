package p539o0o0OoOO;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.yalla.yalla.model.BarBannerModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.adapter.BannerAdapter;
import com.yalla.yalla.ui.vm.AdVM;
import com.yalla.yalla.ui.vm.BannerVM;
import com.youth.banner.Banner;
import com.youth.banner.indicator.CircleIndicator;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p377o0OOoOo.o0000OO0;
import p464o0Oooo.o000000O;
import p485o0o00O0.oOOOOo0O;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class r1 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f55655OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ArrayList f55656OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public BannerAdapter f55657OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Lazy f55658OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f55659OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Lazy f55660OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final Lazy f55661OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Function1<? super View, Unit> f55662OooO0oo;

    public static final class OooO extends Lambda implements Function0<View> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            return View.inflate(r1.this.f55655OooO00o, oO00OO0O.main_fragment_recommend_banner, null);
        }
    }

    public static final class OooO00o extends Lambda implements Function1<Boolean, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                r1.this.OooO00o();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<BarBannerModel, Unit> {
        public OooO0O0() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:41:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:43:0x00db  */
        /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:46:0x00e3  */
        /* JADX WARN: Code duplicated, block: B:48:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:51:0x00ee  */
        /* JADX WARN: Code duplicated, block: B:54:0x00f5  */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(BarBannerModel barBannerModel) {
            BannerAdapter bannerAdapter;
            int itemCount;
            Function1<? super View, Unit> function1;
            BannerAdapter bannerAdapter2;
            BannerAdapter bannerAdapter3;
            BarBannerModel barBannerModel2 = barBannerModel;
            r1 r1Var = r1.this;
            if (!com.code.android.util.OooO0OO.OooO00o(r1Var.f55655OooO00o) || barBannerModel2 == null) {
                bannerAdapter = r1Var.f55657OooO0OO;
                if (bannerAdapter != null) {
                    itemCount = bannerAdapter.getItemCount();
                } else {
                    itemCount = 0;
                }
                if (itemCount > 0) {
                    bannerAdapter2 = r1Var.f55657OooO0OO;
                    if (bannerAdapter2 != null) {
                        bannerAdapter2.setDatas(null);
                    }
                    bannerAdapter3 = r1Var.f55657OooO0OO;
                    if (bannerAdapter3 != null) {
                        bannerAdapter3.notifyItemRangeRemoved(0, itemCount);
                    }
                }
                function1 = r1Var.f55662OooO0oo;
                if (function1 != null) {
                    function1.invoke(null);
                }
            } else {
                List<BarBannerModel.BarBannerItem> bannerList = barBannerModel2.getBannerList();
                if (bannerList == null || bannerList.isEmpty()) {
                    bannerAdapter = r1Var.f55657OooO0OO;
                    if (bannerAdapter != null) {
                        itemCount = bannerAdapter.getItemCount();
                    } else {
                        itemCount = 0;
                    }
                    if (itemCount > 0) {
                        bannerAdapter2 = r1Var.f55657OooO0OO;
                        if (bannerAdapter2 != null) {
                            bannerAdapter2.setDatas(null);
                        }
                        bannerAdapter3 = r1Var.f55657OooO0OO;
                        if (bannerAdapter3 != null) {
                            bannerAdapter3.notifyItemRangeRemoved(0, itemCount);
                        }
                    }
                    function1 = r1Var.f55662OooO0oo;
                    if (function1 != null) {
                        function1.invoke(null);
                    }
                } else {
                    BannerAdapter bannerAdapter4 = r1Var.f55657OooO0OO;
                    if (bannerAdapter4 == null) {
                        r1Var.f55657OooO0OO = new BannerAdapter(barBannerModel2.getBannerList());
                        Lazy lazy = r1Var.f55661OooO0oO;
                        Banner banner = (Banner) lazy.getValue();
                        BannerAdapter bannerAdapter5 = r1Var.f55657OooO0OO;
                        Intrinsics.checkNotNull(bannerAdapter5);
                        banner.setAdapter(bannerAdapter5);
                        Banner banner2 = (Banner) lazy.getValue();
                        FragmentActivity fragmentActivity = r1Var.f55655OooO00o;
                        banner2.addBannerLifecycleObserver(fragmentActivity);
                        ((Banner) lazy.getValue()).isAutoLoop(true);
                        ((Banner) lazy.getValue()).setDelayTime(barBannerModel2.delayTime());
                        ((Banner) lazy.getValue()).setIntercept(false);
                        BannerAdapter bannerAdapter6 = r1Var.f55657OooO0OO;
                        if (bannerAdapter6 != null) {
                            bannerAdapter6.setOnBannerListener(new oOOOOo0O(r1Var));
                        }
                        ((Banner) lazy.getValue()).setIndicator(new CircleIndicator(fragmentActivity));
                        ((Banner) lazy.getValue()).start();
                    } else {
                        int itemCount2 = bannerAdapter4 != null ? bannerAdapter4.getItemCount() : 0;
                        BannerAdapter bannerAdapter7 = r1Var.f55657OooO0OO;
                        if (bannerAdapter7 != null) {
                            bannerAdapter7.setDatas(null);
                        }
                        BannerAdapter bannerAdapter8 = r1Var.f55657OooO0OO;
                        if (bannerAdapter8 != null) {
                            bannerAdapter8.notifyItemRangeRemoved(0, itemCount2);
                        }
                        BannerAdapter bannerAdapter9 = r1Var.f55657OooO0OO;
                        if (bannerAdapter9 != null) {
                            bannerAdapter9.setDatas(barBannerModel2.getBannerList());
                        }
                        BannerAdapter bannerAdapter10 = r1Var.f55657OooO0OO;
                        if (bannerAdapter10 != null) {
                            bannerAdapter10.notifyItemRangeInserted(0, barBannerModel2.getBannerList().size());
                        }
                    }
                    Function1<? super View, Unit> function2 = r1Var.f55662OooO0oo;
                    if (function2 != null) {
                        function2.invoke((View) r1Var.f55659OooO0o.getValue());
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<ApiResult<BarBannerModel>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f55666OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<BarBannerModel> apiResult) {
            ApiResult<BarBannerModel> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Banner<Object, ?>> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Banner<Object, ?> invoke() {
            return (Banner) ((View) r1.this.f55659OooO0o.getValue()).findViewById(oO00O0oO.banner);
        }
    }

    public static final class OooOO0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f55668OooO0Oo;

        public OooOO0(OooO00o function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f55668OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f55668OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f55668OooO0Oo;
        }

        public final int hashCode() {
            return this.f55668OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f55668OooO0Oo.invoke(obj);
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<AdVM> {
        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AdVM invoke() {
            return (AdVM) new ViewModelProvider(r1.this.f55655OooO00o).get(AdVM.class);
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<BannerVM> {
        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final BannerVM invoke() {
            return (BannerVM) new ViewModelProvider(r1.this.f55655OooO00o).get(BannerVM.class);
        }
    }

    public r1(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f55655OooO00o = activity;
        this.f55656OooO0O0 = new ArrayList();
        this.f55658OooO0Oo = LazyKt.lazy(new OooOOO0());
        this.f55660OooO0o0 = LazyKt.lazy(new OooOO0O());
        this.f55659OooO0o = LazyKt.lazy(new OooO());
        this.f55661OooO0oO = LazyKt.lazy(new OooO0o());
        OooO00o();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o000000O.OooOo0O().observe(activity, new OooOO0(new OooO00o()));
    }

    public final void OooO00o() {
        this.f55656OooO0O0.clear();
        ((BannerVM) this.f55658OooO0Oo.getValue()).getBarBanner().observe(this.f55655OooO00o, new o0000OO0(new OooO0O0(), null, OooO0OO.f55666OooO0Oo, false, 10));
    }
}
