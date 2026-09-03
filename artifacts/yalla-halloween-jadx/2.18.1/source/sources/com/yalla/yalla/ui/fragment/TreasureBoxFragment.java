package com.yalla.yalla.ui.fragment;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.base.mixedroom.model.TreasureBoxProgressModel;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.common.ui.view.StateLayout;
import com.yalla.yalla.model.TreasureBoxModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.fragment.TreasureBoxFragment;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.oOO00O;
import p391o0OOooOo.o0O00000;
import p530o0o0OOO.o00OO00O;
import p534o0o0OOo0.o00OOOO0;
import p534o0o0OOo0.o0O0o;
import p579o0oOoOOo.l1;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.gg;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b%\u0010&J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u001e\u0010\u000b\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0002J\u0016\u0010\u000e\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006H\u0002J\b\u0010\u000f\u001a\u00020\u0003H\u0002J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0003J\u001a\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u0003H\u0016R\u0016\u0010\u001e\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lcom/yalla/yalla/ui/fragment/TreasureBoxFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/gg;", "", "fixSVGAAnimResume", "loadBoxInfo", "", "Lcom/yalla/yalla/model/TreasureBoxModel$Award;", "awards", "Lcom/yalla/yalla/model/TreasureBoxModel$Box;", "box", "showBoxAwards", "Lcom/yalla/yalla/model/TreasureBoxModel$Rank;", "userRank", "showOpenBox", "initView", "", "progress", "setProgress", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onResume", "boxLevel", "I", "users", "Ljava/util/List;", "Landroid/animation/ValueAnimator;", "valueAnimator", "Landroid/animation/ValueAnimator;", "<init>", "()V", "Companion", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class TreasureBoxFragment extends p503o0o00o00.OooO<gg> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private static final String Key_data = "data";
    private int boxLevel = 1;

    @Nullable
    private List<TreasureBoxModel.Rank> users;

    @Nullable
    private ValueAnimator valueAnimator;

    /* JADX INFO: renamed from: com.yalla.yalla.ui.fragment.TreasureBoxFragment$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            TreasureBoxFragment.this.getBinding().f49468OooO00o.OooOO0O(false);
            TreasureBoxFragment.this.loadBoxInfo();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<TreasureBoxModel, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(TreasureBoxModel treasureBoxModel) {
            TreasureBoxModel treasureBoxModel2 = treasureBoxModel;
            if ((treasureBoxModel2 != null ? treasureBoxModel2.getBox() : null) == null) {
                TreasureBoxFragment.this.getBinding().f49468OooO00o.OooO0o();
            } else {
                if (treasureBoxModel2.getBox().isDraw()) {
                    TreasureBoxFragment.this.showOpenBox(treasureBoxModel2.getUserRank());
                } else {
                    TreasureBoxFragment.this.showBoxAwards(treasureBoxModel2.getAwards(), treasureBoxModel2.getBox());
                }
                StateLayout stateLayout = TreasureBoxFragment.this.getBinding().f49468OooO00o;
                boolean enableStateChangeAnim = stateLayout.getEnableStateChangeAnim();
                stateLayout.setEnableStateChangeAnim(true);
                stateLayout.OooO0Oo();
                stateLayout.setEnableStateChangeAnim(enableStateChangeAnim);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<ApiError, Unit> {
        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            TreasureBoxFragment.this.getBinding().f49468OooO00o.OooO0o();
            return Unit.INSTANCE;
        }
    }

    private final void fixSVGAAnimResume() {
        getBinding().f49471OooO0Oo.OooO();
        getBinding().f49473OooO0o0.OooO();
        getBinding().f49472OooO0o.OooO();
        getBinding().f49474OooO0oO.OooO();
        getBinding().f49475OooO0oo.OooO();
    }

    private final void initView() {
        getBinding().f49480OooOOO0.setEnabled(false);
        int i = 2;
        getBinding().f49467OooO.setOnClickListener(new o00OOOO0(this, i));
        getBinding().f49476OooOO0.setOnClickListener(new o0O0o(this, 4));
        getBinding().f49477OooOO0O.setOnClickListener(new l1(this, i));
        o00OO00O.f43313OooooOo.OooO00o().f43363OoooOOo.observe(requireActivity(), new p142o00OOooO.o0O0O00(this, 3));
        getBinding().f49468OooO00o.OooOO0O(false);
        getBinding().f49468OooO00o.setErrorImage(R.drawable.room_ic_treasure_box_error);
        getBinding().f49468OooO00o.setErrorButtonBackground(R.drawable.room_shape_treasure_box_error_bg);
        StateLayout stateLayout = getBinding().f49468OooO00o;
        Intrinsics.checkNotNullExpressionValue(stateLayout, "binding.root");
        StateLayout.OooOO0(stateLayout, p254o00ooO0O.o000O0O0.OooO00o(R.color.white_50), new OooO0O0(), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-10, reason: not valid java name */
    public static final void m420initView$lambda10(TreasureBoxFragment this$0, View view) {
        List<TreasureBoxModel.Rank> list;
        TreasureBoxModel.Rank rank;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getActivity() == null || (list = this$0.users) == null || (rank = (TreasureBoxModel.Rank) CollectionsKt.getOrNull(list, 2)) == null) {
            return;
        }
        o0O00000.OooO0OO("InRoom_treasure_top3");
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f23452o0ooOO0;
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        UserInfoActivity.OooO00o.OooO0Oo(oooO00o, fragmentActivityRequireActivity, String.valueOf(rank.getUserId()), false, 12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-11, reason: not valid java name */
    public static final void m421initView$lambda11(TreasureBoxFragment this$0, TreasureBoxProgressModel treasureBoxProgressModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (treasureBoxProgressModel == null) {
            return;
        }
        if (treasureBoxProgressModel.getBoxLevel() > this$0.boxLevel) {
            this$0.setProgress(100);
        } else if (treasureBoxProgressModel.getBoxLevel() == this$0.boxLevel) {
            this$0.setProgress(treasureBoxProgressModel.getPercent());
        } else {
            this$0.setProgress(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-6, reason: not valid java name */
    public static final void m422initView$lambda6(TreasureBoxFragment this$0, View view) {
        List<TreasureBoxModel.Rank> list;
        TreasureBoxModel.Rank rank;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getActivity() == null || (list = this$0.users) == null || (rank = (TreasureBoxModel.Rank) CollectionsKt.getOrNull(list, 0)) == null) {
            return;
        }
        o0O00000.OooO0OO("InRoom_treasure_top3");
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f23452o0ooOO0;
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        UserInfoActivity.OooO00o.OooO0Oo(oooO00o, fragmentActivityRequireActivity, String.valueOf(rank.getUserId()), false, 12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-8, reason: not valid java name */
    public static final void m423initView$lambda8(TreasureBoxFragment this$0, View view) {
        List<TreasureBoxModel.Rank> list;
        TreasureBoxModel.Rank rank;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getActivity() == null || (list = this$0.users) == null || (rank = (TreasureBoxModel.Rank) CollectionsKt.getOrNull(list, 1)) == null) {
            return;
        }
        o0O00000.OooO0OO("InRoom_treasure_top3");
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f23452o0ooOO0;
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        UserInfoActivity.OooO00o.OooO0Oo(oooO00o, fragmentActivityRequireActivity, String.valueOf(rank.getUserId()), false, 12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadBoxInfo() {
        final FragmentActivity activity = getActivity();
        if (activity != null) {
            p607o0oo0O0.o0Oo0oo o0oo0ooM424loadBoxInfo$lambda3$lambda2 = m424loadBoxInfo$lambda3$lambda2(new ViewModelLazy(Reflection.getOrCreateKotlinClass(p607o0oo0O0.o0Oo0oo.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.TreasureBoxFragment$loadBoxInfo$lambda-3$$inlined$viewModels$default$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final ViewModelStore invoke() {
                    ViewModelStore viewModelStore = activity.getViewModelStore();
                    Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                    return viewModelStore;
                }
            }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.TreasureBoxFragment$loadBoxInfo$lambda-3$$inlined$viewModels$default$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final ViewModelProvider.Factory invoke() {
                    ViewModelProvider.Factory defaultViewModelProviderFactory = activity.getDefaultViewModelProviderFactory();
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                    return defaultViewModelProviderFactory;
                }
            }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.TreasureBoxFragment$loadBoxInfo$lambda-3$$inlined$viewModels$default$3

                /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                public final /* synthetic */ Function0 f24297Oooo0o = null;

                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final CreationExtras invoke() {
                    CreationExtras creationExtras;
                    Function0 function0 = this.f24297Oooo0o;
                    if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                        return creationExtras;
                    }
                    CreationExtras defaultViewModelCreationExtras = activity.getDefaultViewModelCreationExtras();
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                    return defaultViewModelCreationExtras;
                }
            }));
            int i = this.boxLevel;
            Objects.requireNonNull(o0oo0ooM424loadBoxInfo$lambda3$lambda2);
            p254o00ooO0O.o0000O0O.OooO00o(new p607o0oo0O0.o0OOO0o(i, null)).observe(activity, new o0o0000.OooOo(new OooO0OO(), new OooO0o(), null, false, 12));
        }
    }

    /* JADX INFO: renamed from: loadBoxInfo$lambda-3$lambda-2, reason: not valid java name */
    private static final p607o0oo0O0.o0Oo0oo m424loadBoxInfo$lambda3$lambda2(Lazy<p607o0oo0O0.o0Oo0oo> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onViewCreated$lambda-0, reason: not valid java name */
    public static final void m425onViewCreated$lambda0(TreasureBoxFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadBoxInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onViewCreated$lambda-1, reason: not valid java name */
    public static final void m426onViewCreated$lambda1(TreasureBoxFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.fixSVGAAnimResume();
    }

    @SuppressLint({"SetTextI18n"})
    private final void setProgress(final int progress) {
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getBinding().f49480OooOOO0.getProgress(), progress);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0oOoOoO.f3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                TreasureBoxFragment.m427setProgress$lambda13$lambda12(this.f46852Oooo0o, progress, valueAnimator2);
            }
        });
        this.valueAnimator = valueAnimatorOfInt;
        valueAnimatorOfInt.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setProgress$lambda-13$lambda-12, reason: not valid java name */
    public static final void m427setProgress$lambda13$lambda12(TreasureBoxFragment this$0, int i, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ProgressBar progressBar = this$0.getBinding().f49480OooOOO0;
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        progressBar.setProgress(((Integer) animatedValue).intValue());
        float width = ((this$0.getBinding().f49480OooOOO0.getWidth() - com.yalla.support.common.util.OooOo00.OooO00o(16)) * this$0.getBinding().f49480OooOOO0.getProgress()) / this$0.getBinding().f49480OooOOO0.getMax();
        View view = this$0.getBinding().f49490OooOo0o;
        Intrinsics.checkNotNullExpressionValue(view, "binding.vIndicator");
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.getLayoutParams().width = (int) width;
        view.requestLayout();
        if (i == 0 || i == 100) {
            TextView textView = this$0.getBinding().f49485OooOOoo;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvIndicator");
            oOO00O.OooO00o(textView);
            return;
        }
        TextView textView2 = this$0.getBinding().f49485OooOOoo;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append('%');
        textView2.setText(sb.toString());
        TextView textView3 = this$0.getBinding().f49485OooOOoo;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvIndicator");
        oOO00O.OooO(textView3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showBoxAwards(List<TreasureBoxModel.Award> awards, TreasureBoxModel.Box box) {
        ConstraintLayout constraintLayout = getBinding().f49470OooO0OO;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.clRank");
        oOO00O.OooO00o(constraintLayout);
        ConstraintLayout constraintLayout2 = getBinding().f49469OooO0O0;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.clAward");
        oOO00O.OooO(constraintLayout2);
        setProgress(box.getPercent());
        int i = this.boxLevel;
        if (i == 1) {
            getBinding().f49478OooOO0o.setImageResource(R.drawable.room_ic_treasure_box_key_1);
        } else if (i == 5) {
            getBinding().f49478OooOO0o.setImageResource(R.drawable.room_ic_treasure_box_key_2);
        } else if (i == 10) {
            getBinding().f49478OooOO0o.setImageResource(R.drawable.room_ic_treasure_box_key_3);
        }
        int i2 = 0;
        for (Object obj : awards) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            TreasureBoxModel.Award award = (TreasureBoxModel.Award) obj;
            if (i2 == 0) {
                getBinding().f49479OooOOO.setText(award.getShowName());
                SVGAView sVGAView = getBinding().f49471OooO0Oo;
                String imageUrl = award.getImageUrl();
                Context contextOooO0O0 = com.yalla.support.common.util.OooO0O0.f20502OooO00o.OooO0O0();
                if (contextOooO0O0 == null && (contextOooO0O0 = p031OoooO.o0000O.f2657OooO00o) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(d.R);
                    contextOooO0O0 = null;
                }
                sVGAView.OooO0oo(imageUrl, contextOooO0O0 instanceof FragmentActivity ? (FragmentActivity) contextOooO0O0 : null);
                sVGAView.OooO();
            } else if (i2 == 1) {
                getBinding().f49481OooOOOO.setText(award.getShowName());
                SVGAView sVGAView2 = getBinding().f49473OooO0o0;
                String imageUrl2 = award.getImageUrl();
                Context contextOooO0O1 = com.yalla.support.common.util.OooO0O0.f20502OooO00o.OooO0O0();
                if (contextOooO0O1 == null && (contextOooO0O1 = p031OoooO.o0000O.f2657OooO00o) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(d.R);
                    contextOooO0O1 = null;
                }
                sVGAView2.OooO0oo(imageUrl2, contextOooO0O1 instanceof FragmentActivity ? (FragmentActivity) contextOooO0O1 : null);
                sVGAView2.OooO();
            } else if (i2 == 2) {
                getBinding().f49482OooOOOo.setText(award.getShowName());
                SVGAView sVGAView3 = getBinding().f49472OooO0o;
                String imageUrl3 = award.getImageUrl();
                Context contextOooO0O2 = com.yalla.support.common.util.OooO0O0.f20502OooO00o.OooO0O0();
                if (contextOooO0O2 == null && (contextOooO0O2 = p031OoooO.o0000O.f2657OooO00o) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(d.R);
                    contextOooO0O2 = null;
                }
                sVGAView3.OooO0oo(imageUrl3, contextOooO0O2 instanceof FragmentActivity ? (FragmentActivity) contextOooO0O2 : null);
                sVGAView3.OooO();
            } else if (i2 == 3) {
                getBinding().f49484OooOOo0.setText(award.getShowName());
                SVGAView sVGAView4 = getBinding().f49474OooO0oO;
                String imageUrl4 = award.getImageUrl();
                Context contextOooO0O3 = com.yalla.support.common.util.OooO0O0.f20502OooO00o.OooO0O0();
                if (contextOooO0O3 == null && (contextOooO0O3 = p031OoooO.o0000O.f2657OooO00o) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(d.R);
                    contextOooO0O3 = null;
                }
                sVGAView4.OooO0oo(imageUrl4, contextOooO0O3 instanceof FragmentActivity ? (FragmentActivity) contextOooO0O3 : null);
                sVGAView4.OooO();
            } else if (i2 == 4) {
                getBinding().f49483OooOOo.setText(award.getShowName());
                SVGAView sVGAView5 = getBinding().f49475OooO0oo;
                String imageUrl5 = award.getImageUrl();
                Context contextOooO0O4 = com.yalla.support.common.util.OooO0O0.f20502OooO00o.OooO0O0();
                if (contextOooO0O4 == null && (contextOooO0O4 = p031OoooO.o0000O.f2657OooO00o) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(d.R);
                    contextOooO0O4 = null;
                }
                sVGAView5.OooO0oo(imageUrl5, contextOooO0O4 instanceof FragmentActivity ? (FragmentActivity) contextOooO0O4 : null);
                sVGAView5.OooO();
            }
            i2 = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showOpenBox(List<TreasureBoxModel.Rank> userRank) {
        this.users = userRank;
        ConstraintLayout constraintLayout = getBinding().f49470OooO0OO;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.clRank");
        oOO00O.OooO(constraintLayout);
        ConstraintLayout constraintLayout2 = getBinding().f49469OooO0O0;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.clAward");
        oOO00O.OooO00o(constraintLayout2);
        if (CollectionsKt.getOrNull(userRank, 0) != null) {
            getBinding().f49488OooOo00.setText(userRank.get(0).getNickName());
            oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(getBinding().f49467OooO.getContext());
            oooO00o.f48429OooO0OO = CloudImageUtilKt.imgSize$default(userRank.get(0).getHeadUrl(), com.yalla.support.common.util.OooOo00.OooO00o(60), false, 2, null);
            oooO00o.f48427OooO00o = 0;
            oooO00o.OooO00o(o00OOO.OooO00o.OooO0O0(2, p254o00ooO0O.o000O0O0.OooO00o(R.color.color_FFFCCB80)));
            oooO00o.OooO0o(getBinding().f49467OooO);
        } else {
            getBinding().f49488OooOo00.setText("");
            oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(getBinding().f49467OooO.getContext());
            oooO00o2.f48433OooO0oO = R.drawable.room_ic_treasure_box_rank_no_user;
            oooO00o2.f48427OooO00o = 1;
            oooO00o2.OooO00o(o00OOO.OooO00o.OooO0O0(2, p254o00ooO0O.o000O0O0.OooO00o(R.color.color_FFFCCB80)));
            oooO00o2.OooO0o(getBinding().f49467OooO);
        }
        if (CollectionsKt.getOrNull(userRank, 1) != null) {
            getBinding().f49487OooOo0.setText(userRank.get(1).getNickName());
            oO0O00.OooO00o oooO00o3 = new oO0O00.OooO00o(getBinding().f49476OooOO0.getContext());
            oooO00o3.f48429OooO0OO = CloudImageUtilKt.imgSize$default(userRank.get(1).getHeadUrl(), com.yalla.support.common.util.OooOo00.OooO00o(60), false, 2, null);
            oooO00o3.f48427OooO00o = 0;
            oooO00o3.OooO00o(o00OOO.OooO00o.OooO0O0(2, p254o00ooO0O.o000O0O0.OooO00o(R.color.color_FFDEDFE4)));
            oooO00o3.OooO0o(getBinding().f49476OooOO0);
        } else {
            getBinding().f49487OooOo0.setText("");
            oO0O00.OooO00o oooO00o4 = new oO0O00.OooO00o(getBinding().f49476OooOO0.getContext());
            oooO00o4.f48433OooO0oO = R.drawable.room_ic_treasure_box_rank_no_user;
            oooO00o4.f48427OooO00o = 1;
            oooO00o4.OooO00o(o00OOO.OooO00o.OooO0O0(2, p254o00ooO0O.o000O0O0.OooO00o(R.color.color_FFDEDFE4)));
            oooO00o4.OooO0o(getBinding().f49476OooOO0);
        }
        if (CollectionsKt.getOrNull(userRank, 2) != null) {
            getBinding().f49489OooOo0O.setText(userRank.get(2).getNickName());
            oO0O00.OooO00o oooO00o5 = new oO0O00.OooO00o(getBinding().f49477OooOO0O.getContext());
            oooO00o5.f48429OooO0OO = CloudImageUtilKt.imgSize$default(userRank.get(2).getHeadUrl(), com.yalla.support.common.util.OooOo00.OooO00o(60), false, 2, null);
            oooO00o5.f48427OooO00o = 0;
            oooO00o5.OooO00o(o00OOO.OooO00o.OooO0O0(2, p254o00ooO0O.o000O0O0.OooO00o(R.color.color_FFEEC7AB)));
            oooO00o5.OooO0o(getBinding().f49477OooOO0O);
            return;
        }
        getBinding().f49489OooOo0O.setText("");
        oO0O00.OooO00o oooO00o6 = new oO0O00.OooO00o(getBinding().f49477OooOO0O.getContext());
        oooO00o6.f48433OooO0oO = R.drawable.room_ic_treasure_box_rank_no_user;
        oooO00o6.f48427OooO00o = 1;
        oooO00o6.OooO00o(o00OOO.OooO00o.OooO0O0(2, p254o00ooO0O.o000O0O0.OooO00o(R.color.color_FFEEC7AB)));
        oooO00o6.OooO0o(getBinding().f49477OooOO0O);
    }

    @Override // p503o0o00o00.OooO, p462o0Ooo0o.o0000, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        fixSVGAAnimResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        Integer numValueOf = arguments != null ? Integer.valueOf(arguments.getInt("data")) : null;
        int i = 5;
        int i2 = 1;
        if (numValueOf == null || numValueOf.intValue() != 0) {
            if (numValueOf != null && numValueOf.intValue() == 1) {
                i2 = 5;
            } else if (numValueOf != null && numValueOf.intValue() == 2) {
                i2 = 10;
            }
        }
        this.boxLevel = i2;
        initView();
        loadBoxInfo();
        LiveEventBus.get("ROOM_TREASURE_BOX_OPEN_DIALOG_DISMISS").observe(getViewLifecycleOwner(), new p142o00OOooO.oo0o0Oo(this, 4));
        LiveEventBus.get("ROOM_TREASURE_BOX_DIALOG_SHOW").observe(getViewLifecycleOwner(), new p142o00OOooO.o0ooOOo(this, i));
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public gg getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        gg ggVarInflate = gg.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(ggVarInflate, "inflate(inflater, container, false)");
        return ggVarInflate;
    }
}
