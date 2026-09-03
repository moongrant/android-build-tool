package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.app.base.model.RankModel2;
import com.app.base.view.banner.BannerView;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.vm.main.MainRoomExploreViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p133o00OO00o.OooOO0;
import p153o00Oo0oO.o0ooOOo;
import p160o00OoOO0.o00OO0O0;
import p502o0o00o0.o000;
import p502o0o00o0.o000O0o;
import p502o0o00o0.o000Oo0;
import p605o0oo00oo.oO0OOo0o;
import p649o0ooOOoo.q8;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010B!\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\f\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0002R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/yalla/yalla/ui/view/MainRoomPopularTopView;", "Landroid/widget/FrameLayout;", "Landroidx/appcompat/app/AppCompatActivity;", "getActivity", "Lcom/yalla/yalla/ui/vm/main/MainRoomExploreViewModel;", "Oooo0oo", "Lkotlin/Lazy;", "getMViewModel", "()Lcom/yalla/yalla/ui/vm/main/MainRoomExploreViewModel;", "mViewModel", "Landroid/content/Context;", d.R, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "def", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MainRoomPopularTopView extends FrameLayout {

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public static final /* synthetic */ int f24841OoooOo0 = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f24842Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final ArrayList<Integer> f24843Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f24844Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy mViewModel;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public p282o0O00o0.OooO<List<RankModel2>> f24846OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public p282o0O00o0.OooO<List<RankModel2>> f24847OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public p282o0O00o0.OooO<List<RankModel2>> f24848OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public p282o0O00o0.OooO<List<RankModel2>> f24849OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public OooOO0<Integer> f24850OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @NotNull
    public q8 f24851OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @NotNull
    public final OooO00o f24852OoooOOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final long f24853o000oOoO;

    public static final class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            MainRoomPopularTopView mainRoomPopularTopView = MainRoomPopularTopView.this;
            if (mainRoomPopularTopView.f24844Oooo0oO) {
                mainRoomPopularTopView.f24851OoooOOO.f50356OooO0o0.OooO0OO();
                MainRoomPopularTopView.this.f24851OoooOOO.f50354OooO0Oo.OooO0OO();
                MainRoomPopularTopView.this.f24851OoooOOO.f50353OooO0OO.OooO0OO();
                MainRoomPopularTopView.this.f24851OoooOOO.f50352OooO0O0.OooO0OO();
                MainRoomPopularTopView.this.f24851OoooOOO.f50355OooO0o.OooO0OO();
            }
            MainRoomPopularTopView mainRoomPopularTopView2 = MainRoomPopularTopView.this;
            mainRoomPopularTopView2.f24851OoooOOO.f50354OooO0Oo.postDelayed(this, mainRoomPopularTopView2.f24853o000oOoO);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<MainRoomExploreViewModel> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MainRoomExploreViewModel invoke() {
            return (MainRoomExploreViewModel) new ViewModelProvider(MainRoomPopularTopView.this.getActivity()).get(MainRoomExploreViewModel.class);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainRoomPopularTopView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f24843Oooo0o = CollectionsKt.arrayListOf(Integer.valueOf(R.string.Hourly), Integer.valueOf(R.string.Daily), Integer.valueOf(R.string.Weekly), Integer.valueOf(R.string.Monthly));
        this.mViewModel = LazyKt.lazy(new OooO0O0());
        this.f24853o000oOoO = 3000L;
        q8 q8VarInflate = q8.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(q8VarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f24851OoooOOO = q8VarInflate;
        OooO0OO();
        OooO0O0();
        this.f24852OoooOOo = new OooO00o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppCompatActivity getActivity() {
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        return (AppCompatActivity) context;
    }

    private final MainRoomExploreViewModel getMViewModel() {
        return (MainRoomExploreViewModel) this.mViewModel.getValue();
    }

    public final void OooO0O0() {
        MainRoomExploreViewModel mViewModel = getMViewModel();
        Objects.requireNonNull(mViewModel);
        oO0OOo0o oo0ooo0o = new oO0OOo0o(mViewModel);
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32267OoooOoO, mapOooO0O0, oo0ooo0o);
    }

    public final void OooO0OO() {
        this.f24848OoooO00 = new p133o00OO00o.OooO(getContext());
        this.f24847OoooO0 = new p133o00OO00o.OooO(getContext());
        this.f24849OoooO0O = new p133o00OO00o.OooO(getContext());
        this.f24846OoooO = new p133o00OO00o.OooO(getContext());
        this.f24850OoooOO0 = new OooOO0<>(getContext());
        p282o0O00o0.OooO<List<RankModel2>> oooO = this.f24848OoooO00;
        p282o0O00o0.OooO<List<RankModel2>> oooO2 = null;
        if (oooO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerRoomAdapter");
            oooO = null;
        }
        oooO.f35205OooO0Oo = true;
        p282o0O00o0.OooO<List<RankModel2>> oooO3 = this.f24847OoooO0;
        if (oooO3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerGiftSendAdapter");
            oooO3 = null;
        }
        oooO3.f35205OooO0Oo = true;
        p282o0O00o0.OooO<List<RankModel2>> oooO4 = this.f24849OoooO0O;
        if (oooO4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerGiftReceivedAdapter");
            oooO4 = null;
        }
        oooO4.f35205OooO0Oo = true;
        p282o0O00o0.OooO<List<RankModel2>> oooO5 = this.f24846OoooO;
        if (oooO5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerTotalAdapter");
            oooO5 = null;
        }
        oooO5.f35205OooO0Oo = true;
        OooOO0<Integer> oooOO1 = this.f24850OoooOO0;
        if (oooOO1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerTitleAdapter");
            oooOO1 = null;
        }
        oooOO1.f35205OooO0Oo = true;
        this.f24851OoooOOO.f50356OooO0o0.setEnabled(false);
        this.f24851OoooOOO.f50354OooO0Oo.setEnabled(false);
        this.f24851OoooOOO.f50353OooO0OO.setEnabled(false);
        this.f24851OoooOOO.f50352OooO0O0.setEnabled(false);
        this.f24851OoooOOO.f50355OooO0o.setEnabled(false);
        BannerView bannerView = this.f24851OoooOOO.f50356OooO0o0;
        OooOO0<Integer> oooOO2 = this.f24850OoooOO0;
        if (oooOO2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerTitleAdapter");
            oooOO2 = null;
        }
        bannerView.setAdapter(oooOO2);
        BannerView bannerView2 = this.f24851OoooOOO.f50354OooO0Oo;
        p282o0O00o0.OooO<List<RankModel2>> oooO6 = this.f24848OoooO00;
        if (oooO6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerRoomAdapter");
            oooO6 = null;
        }
        bannerView2.setAdapter(oooO6);
        BannerView bannerView3 = this.f24851OoooOOO.f50353OooO0OO;
        p282o0O00o0.OooO<List<RankModel2>> oooO7 = this.f24847OoooO0;
        if (oooO7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerGiftSendAdapter");
            oooO7 = null;
        }
        bannerView3.setAdapter(oooO7);
        BannerView bannerView4 = this.f24851OoooOOO.f50352OooO0O0;
        p282o0O00o0.OooO<List<RankModel2>> oooO8 = this.f24849OoooO0O;
        if (oooO8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerGiftReceivedAdapter");
            oooO8 = null;
        }
        bannerView4.setAdapter(oooO8);
        BannerView bannerView5 = this.f24851OoooOOO.f50355OooO0o;
        p282o0O00o0.OooO<List<RankModel2>> oooO9 = this.f24846OoooO;
        if (oooO9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerTotalAdapter");
        } else {
            oooO2 = oooO9;
        }
        bannerView5.setAdapter(oooO2);
        this.f24851OoooOOO.f50350OooO.setOnClickListener(new o000O0o(this, 1));
        this.f24851OoooOOO.f50358OooO0oo.setOnClickListener(new o000Oo0(this, 1));
        this.f24851OoooOOO.f50357OooO0oO.setOnClickListener(new o000(this, 1));
        this.f24851OoooOOO.f50359OooOO0.setOnClickListener(new o00OO0O0.OooO0O0(this, 4));
        ((MutableLiveData) getMViewModel().f25465OooO00o.getValue()).observe(getActivity(), new p142o00OOooO.o000(this, 4));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainRoomPopularTopView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f24843Oooo0o = CollectionsKt.arrayListOf(Integer.valueOf(R.string.Hourly), Integer.valueOf(R.string.Daily), Integer.valueOf(R.string.Weekly), Integer.valueOf(R.string.Monthly));
        this.mViewModel = LazyKt.lazy(new OooO0O0());
        this.f24853o000oOoO = 3000L;
        q8 q8VarInflate = q8.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(q8VarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f24851OoooOOO = q8VarInflate;
        OooO0OO();
        OooO0O0();
        this.f24852OoooOOo = new OooO00o();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainRoomPopularTopView(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f24843Oooo0o = CollectionsKt.arrayListOf(Integer.valueOf(R.string.Hourly), Integer.valueOf(R.string.Daily), Integer.valueOf(R.string.Weekly), Integer.valueOf(R.string.Monthly));
        this.mViewModel = LazyKt.lazy(new OooO0O0());
        this.f24853o000oOoO = 3000L;
        q8 q8VarInflate = q8.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(q8VarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f24851OoooOOO = q8VarInflate;
        OooO0OO();
        OooO0O0();
        this.f24852OoooOOo = new OooO00o();
    }
}
