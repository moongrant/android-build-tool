package p603o0oo00Oo;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.app.base.model.BarBannerModel;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.vm.AdVM;
import com.yalla.yalla.common.vm.BannerVM;
import com.youth.banner.Banner;
import com.youth.banner.indicator.CircleIndicator;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0o0000.OooOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00OOooO.o0000OO0;
import p207o00o0o0o.o000O;
import p255o00ooO0O.o0000Ooo;
import p500o0o00Oo0.OooOOO;
import p524o0o0O0o.o000O0Oo;
import p538o0o0OOoo.s0;
import p565o0oOo0.Oooo000;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o00O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Banner<Object, ?> f48085OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f48086OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public List<BarBannerModel.BarBannerItem> f48087OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Oooo000 f48088OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f48089OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Lazy f48090OooO0o0;

    public static final class OooO00o extends Lambda implements Function1<BarBannerModel, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(BarBannerModel barBannerModel) {
            BarBannerModel barBannerModel2 = barBannerModel;
            if (o0000Ooo.OooO00o(o00O0.this.f48086OooO0O0) && barBannerModel2 != null) {
                List<BarBannerModel.BarBannerItem> bannerList = barBannerModel2.getBannerList();
                if (!(bannerList == null || bannerList.isEmpty())) {
                    o00O0 o00o1 = o00O0.this;
                    Oooo000 oooo000 = o00o1.f48088OooO0Oo;
                    if (oooo000 == null) {
                        o00o1.f48088OooO0Oo = new Oooo000(barBannerModel2.getBannerList());
                        o00O0 o00o2 = o00O0.this;
                        Banner<Object, ?> banner = o00o2.f48085OooO00o;
                        Oooo000 oooo001 = o00o2.f48088OooO0Oo;
                        Intrinsics.checkNotNull(oooo001);
                        banner.setAdapter(oooo001);
                        o00O0 o00o3 = o00O0.this;
                        o00o3.f48085OooO00o.addBannerLifecycleObserver(o00o3.f48086OooO0O0);
                        o00O0.this.f48085OooO00o.isAutoLoop(true);
                        o00O0.this.f48085OooO00o.setDelayTime(barBannerModel2.delayTime());
                        o00O0.this.f48085OooO00o.setIntercept(false);
                        o00O0 o00o4 = o00O0.this;
                        Oooo000 oooo002 = o00o4.f48088OooO0Oo;
                        if (oooo002 != null) {
                            oooo002.setOnBannerListener(new s0(o00o4, 3));
                        }
                        o00O0.this.f48085OooO00o.setIndicator(new CircleIndicator(o00O0.this.f48086OooO0O0));
                        o00O0.this.f48085OooO00o.start();
                    } else {
                        int itemCount = oooo000 != null ? oooo000.getItemCount() : 0;
                        Oooo000 oooo003 = o00O0.this.f48088OooO0Oo;
                        if (oooo003 != null) {
                            oooo003.setDatas(null);
                        }
                        Oooo000 oooo004 = o00O0.this.f48088OooO0Oo;
                        if (oooo004 != null) {
                            oooo004.notifyItemRangeRemoved(0, itemCount);
                        }
                        Oooo000 oooo005 = o00O0.this.f48088OooO0Oo;
                        if (oooo005 != null) {
                            oooo005.setDatas(barBannerModel2.getBannerList());
                        }
                        Oooo000 oooo006 = o00O0.this.f48088OooO0Oo;
                        if (oooo006 != null) {
                            oooo006.notifyItemRangeInserted(0, barBannerModel2.getBannerList().size());
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<ApiResult<BarBannerModel>, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public static final OooO0O0 f48092Oooo = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<BarBannerModel> apiResult) {
            ApiResult<BarBannerModel> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<AdVM> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AdVM invoke() {
            return (AdVM) new ViewModelProvider(o00O0.this.f48086OooO0O0).get(AdVM.class);
        }
    }

    public static final class OooO0o extends Lambda implements Function0<BannerVM> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final BannerVM invoke() {
            return (BannerVM) new ViewModelProvider(o00O0.this.f48086OooO0O0).get(BannerVM.class);
        }
    }

    public o00O0(@NotNull Banner<Object, ?> banner, @NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f48085OooO00o = banner;
        this.f48086OooO0O0 = activity;
        this.f48087OooO0OO = new ArrayList();
        this.f48090OooO0o0 = LazyKt.lazy(new OooO0o());
        this.f48089OooO0o = LazyKt.lazy(new OooO0OO());
        banner.getLayoutParams().height = ((o000O0Oo.f43004OooO00o - o000O.OooO00o(16.0f)) * 4) / 15;
        OooO00o();
        OooOOO.f41235OooO00o.OooOooO().observe(activity, new o0000OO0(this, 6));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.app.base.model.BarBannerModel$BarBannerItem>] */
    public final void OooO00o() {
        this.f48087OooO0OO.clear();
        ((BannerVM) this.f48090OooO0o0.getValue()).getBarBanner().observe(this.f48086OooO0O0, new OooOo(new OooO00o(), null, OooO0O0.f48092Oooo, false, 10));
    }
}
