package p546o0o0Ooo0;

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
import p022Oooo00O.o00OOO00;
import p386o0OOoo0O.o0OoOo0;
import p474o0OoooOO.oo0oO0;
import p565o0oOo000.o0OO00O;
import p565o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oO0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f55609OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ArrayList f55610OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public BannerAdapter f55611OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Lazy f55612OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f55613OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Lazy f55614OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final Lazy f55615OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Function1<? super View, Unit> f55616OooO0oo;

    public static final class OooO extends Lambda implements Function0<View> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            return View.inflate(oO0000O.this.f55609OooO00o, o0OO00O.main_fragment_recommend_banner, null);
        }
    }

    public static final class OooO00o extends Lambda implements Function1<Boolean, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                oO0000O.this.OooO00o();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<BarBannerModel, Unit> {
        public OooO0O0() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:41:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:43:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:44:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:46:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:48:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:51:0x00ef  */
        /* JADX WARN: Code duplicated, block: B:54:0x00f6  */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(BarBannerModel barBannerModel) {
            BannerAdapter bannerAdapter;
            int itemCount;
            Function1<? super View, Unit> function1;
            BannerAdapter bannerAdapter2;
            BannerAdapter bannerAdapter3;
            BarBannerModel barBannerModel2 = barBannerModel;
            oO0000O oo0000o = oO0000O.this;
            if (!com.code.android.util.OooO0OO.OooO00o(oo0000o.f55609OooO00o) || barBannerModel2 == null) {
                bannerAdapter = oo0000o.f55611OooO0OO;
                if (bannerAdapter != null) {
                    itemCount = bannerAdapter.getItemCount();
                } else {
                    itemCount = 0;
                }
                if (itemCount > 0) {
                    bannerAdapter2 = oo0000o.f55611OooO0OO;
                    if (bannerAdapter2 != null) {
                        bannerAdapter2.setDatas(null);
                    }
                    bannerAdapter3 = oo0000o.f55611OooO0OO;
                    if (bannerAdapter3 != null) {
                        bannerAdapter3.notifyItemRangeRemoved(0, itemCount);
                    }
                }
                function1 = oo0000o.f55616OooO0oo;
                if (function1 != null) {
                    function1.invoke(null);
                }
            } else {
                List<BarBannerModel.BarBannerItem> bannerList = barBannerModel2.getBannerList();
                if (bannerList == null || bannerList.isEmpty()) {
                    bannerAdapter = oo0000o.f55611OooO0OO;
                    if (bannerAdapter != null) {
                        itemCount = bannerAdapter.getItemCount();
                    } else {
                        itemCount = 0;
                    }
                    if (itemCount > 0) {
                        bannerAdapter2 = oo0000o.f55611OooO0OO;
                        if (bannerAdapter2 != null) {
                            bannerAdapter2.setDatas(null);
                        }
                        bannerAdapter3 = oo0000o.f55611OooO0OO;
                        if (bannerAdapter3 != null) {
                            bannerAdapter3.notifyItemRangeRemoved(0, itemCount);
                        }
                    }
                    function1 = oo0000o.f55616OooO0oo;
                    if (function1 != null) {
                        function1.invoke(null);
                    }
                } else {
                    BannerAdapter bannerAdapter4 = oo0000o.f55611OooO0OO;
                    if (bannerAdapter4 == null) {
                        oo0000o.f55611OooO0OO = new BannerAdapter(barBannerModel2.getBannerList());
                        Lazy lazy = oo0000o.f55615OooO0oO;
                        Banner banner = (Banner) lazy.getValue();
                        BannerAdapter bannerAdapter5 = oo0000o.f55611OooO0OO;
                        Intrinsics.checkNotNull(bannerAdapter5);
                        banner.setAdapter(bannerAdapter5);
                        Banner banner2 = (Banner) lazy.getValue();
                        FragmentActivity fragmentActivity = oo0000o.f55609OooO00o;
                        banner2.addBannerLifecycleObserver(fragmentActivity);
                        ((Banner) lazy.getValue()).isAutoLoop(true);
                        ((Banner) lazy.getValue()).setDelayTime(barBannerModel2.delayTime());
                        ((Banner) lazy.getValue()).setIntercept(false);
                        BannerAdapter bannerAdapter6 = oo0000o.f55611OooO0OO;
                        if (bannerAdapter6 != null) {
                            bannerAdapter6.setOnBannerListener(new o00OOO00(oo0000o, 6));
                        }
                        ((Banner) lazy.getValue()).setIndicator(new CircleIndicator(fragmentActivity));
                        ((Banner) lazy.getValue()).start();
                    } else {
                        int itemCount2 = bannerAdapter4 != null ? bannerAdapter4.getItemCount() : 0;
                        BannerAdapter bannerAdapter7 = oo0000o.f55611OooO0OO;
                        if (bannerAdapter7 != null) {
                            bannerAdapter7.setDatas(null);
                        }
                        BannerAdapter bannerAdapter8 = oo0000o.f55611OooO0OO;
                        if (bannerAdapter8 != null) {
                            bannerAdapter8.notifyItemRangeRemoved(0, itemCount2);
                        }
                        BannerAdapter bannerAdapter9 = oo0000o.f55611OooO0OO;
                        if (bannerAdapter9 != null) {
                            bannerAdapter9.setDatas(barBannerModel2.getBannerList());
                        }
                        BannerAdapter bannerAdapter10 = oo0000o.f55611OooO0OO;
                        if (bannerAdapter10 != null) {
                            bannerAdapter10.notifyItemRangeInserted(0, barBannerModel2.getBannerList().size());
                        }
                    }
                    Function1<? super View, Unit> function2 = oo0000o.f55616OooO0oo;
                    if (function2 != null) {
                        function2.invoke((View) oo0000o.f55613OooO0o.getValue());
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<ApiResult<BarBannerModel>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f55620OooO0Oo = new OooO0OO();

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
            return (Banner) ((View) oO0000O.this.f55613OooO0o.getValue()).findViewById(o0Oo0oo.banner);
        }
    }

    public static final class OooOO0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f55622OooO0Oo;

        public OooOO0(OooO00o function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f55622OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f55622OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f55622OooO0Oo;
        }

        public final int hashCode() {
            return this.f55622OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f55622OooO0Oo.invoke(obj);
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<AdVM> {
        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AdVM invoke() {
            return (AdVM) new ViewModelProvider(oO0000O.this.f55609OooO00o).get(AdVM.class);
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<BannerVM> {
        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final BannerVM invoke() {
            return (BannerVM) new ViewModelProvider(oO0000O.this.f55609OooO00o).get(BannerVM.class);
        }
    }

    public oO0000O(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f55609OooO00o = activity;
        this.f55610OooO0O0 = new ArrayList();
        this.f55612OooO0Oo = LazyKt.lazy(new OooOOO0());
        this.f55614OooO0o0 = LazyKt.lazy(new OooOO0O());
        this.f55613OooO0o = LazyKt.lazy(new OooO());
        this.f55615OooO0oO = LazyKt.lazy(new OooO0o());
        OooO00o();
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        oo0oO0.OooOo0O().observe(activity, new OooOO0(new OooO00o()));
    }

    public final void OooO00o() {
        this.f55610OooO0O0.clear();
        ((BannerVM) this.f55612OooO0Oo.getValue()).getBarBanner().observe(this.f55609OooO00o, new o0OoOo0(new OooO0O0(), null, OooO0OO.f55620OooO0Oo, false, 10));
    }
}
