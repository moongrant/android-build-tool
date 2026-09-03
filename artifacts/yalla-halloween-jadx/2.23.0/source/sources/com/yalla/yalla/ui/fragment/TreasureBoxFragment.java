package com.yalla.yalla.ui.fragment;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
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
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.uikit.svga.SVGAView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.mixedroom.model.TreasureBoxProgressModel;
import com.yalla.yalla.model.TreasureBoxModel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.view.StateLayout;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p577o0oOoOoO.oOO00OO;
import p577o0oOoOoO.ooooO000;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.w8;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b%\u0010&J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u001e\u0010\u000b\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0002J\u0016\u0010\u000e\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006H\u0002J\b\u0010\u000f\u001a\u00020\u0003H\u0002J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0003J\u001a\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u0003H\u0016R\u0016\u0010\u001e\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lcom/yalla/yalla/ui/fragment/TreasureBoxFragment;", "Lo0o0O/OooOO0O;", "Lo0ooOOOO/w8;", "", "fixSVGAAnimResume", "loadBoxInfo", "", "Lcom/yalla/yalla/model/TreasureBoxModel$Award;", "awards", "Lcom/yalla/yalla/model/TreasureBoxModel$Box;", "box", "showBoxAwards", "Lcom/yalla/yalla/model/TreasureBoxModel$Rank;", "userRank", "showOpenBox", "initView", "", "progress", "setProgress", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onResume", "boxLevel", "I", "users", "Ljava/util/List;", "Landroid/animation/ValueAnimator;", "valueAnimator", "Landroid/animation/ValueAnimator;", "<init>", "()V", "Companion", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTreasureBoxFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreasureBoxFragment.kt\ncom/yalla/yalla/ui/fragment/TreasureBoxFragment\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,265:1\n75#2,13:266\n1864#3,3:279\n*S KotlinDebug\n*F\n+ 1 TreasureBoxFragment.kt\ncom/yalla/yalla/ui/fragment/TreasureBoxFragment\n*L\n79#1:266,13\n110#1:279,3\n*E\n"})
public final class TreasureBoxFragment extends p508o0o0O.OooOO0O<w8> {
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

    public static final class OooO extends Lambda implements Function1<ApiError, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            TreasureBoxFragment.this.getBinding().f59178OooO00o.OooO0o();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.ui.fragment.TreasureBoxFragment$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
    }

    public static final class OooO0O0 extends Lambda implements Function1<TreasureBoxProgressModel, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(TreasureBoxProgressModel treasureBoxProgressModel) {
            TreasureBoxProgressModel treasureBoxProgressModel2 = treasureBoxProgressModel;
            if (treasureBoxProgressModel2 != null) {
                int boxLevel = treasureBoxProgressModel2.getBoxLevel();
                TreasureBoxFragment treasureBoxFragment = TreasureBoxFragment.this;
                if (boxLevel > treasureBoxFragment.boxLevel) {
                    treasureBoxFragment.setProgress(100);
                } else if (treasureBoxProgressModel2.getBoxLevel() == treasureBoxFragment.boxLevel) {
                    treasureBoxFragment.setProgress(treasureBoxProgressModel2.getPercent());
                } else {
                    treasureBoxFragment.setProgress(0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            TreasureBoxFragment treasureBoxFragment = TreasureBoxFragment.this;
            treasureBoxFragment.getBinding().f59178OooO00o.OooOO0O(false);
            treasureBoxFragment.loadBoxInfo();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<TreasureBoxModel, Unit> {
        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(TreasureBoxModel treasureBoxModel) {
            TreasureBoxModel treasureBoxModel2 = treasureBoxModel;
            TreasureBoxModel.Box box = treasureBoxModel2 != null ? treasureBoxModel2.getBox() : null;
            TreasureBoxFragment treasureBoxFragment = TreasureBoxFragment.this;
            if (box == null) {
                treasureBoxFragment.getBinding().f59178OooO00o.OooO0o();
            } else {
                if (treasureBoxModel2.getBox().isDraw()) {
                    treasureBoxFragment.showOpenBox(treasureBoxModel2.getUserRank());
                } else {
                    treasureBoxFragment.showBoxAwards(treasureBoxModel2.getAwards(), treasureBoxModel2.getBox());
                }
                StateLayout stateLayout = treasureBoxFragment.getBinding().f59178OooO00o;
                boolean enableStateChangeAnim = stateLayout.getEnableStateChangeAnim();
                stateLayout.setEnableStateChangeAnim(true);
                stateLayout.OooO0Oo();
                stateLayout.setEnableStateChangeAnim(enableStateChangeAnim);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 implements Observer<Object> {
        public OooOO0() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            TreasureBoxFragment.this.loadBoxInfo();
        }
    }

    public static final class OooOO0O implements Observer<Object> {
        public OooOO0O() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            TreasureBoxFragment.this.fixSVGAAnimResume();
        }
    }

    public static final class OooOOO0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f28317OooO0Oo;

        public OooOOO0(OooO0O0 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f28317OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f28317OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f28317OooO0Oo;
        }

        public final int hashCode() {
            return this.f28317OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28317OooO0Oo.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fixSVGAAnimResume() {
        getBinding().f59181OooO0Oo.OooOO0o();
        getBinding().f59183OooO0o0.OooOO0o();
        getBinding().f59182OooO0o.OooOO0o();
        getBinding().f59184OooO0oO.OooOO0o();
        getBinding().f59185OooO0oo.OooOO0o();
    }

    private final void initView() {
        getBinding().f59190OooOOO0.setEnabled(false);
        getBinding().f59177OooO.setOnClickListener(new View.OnClickListener() { // from class: com.yalla.yalla.ui.fragment.o000O000
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TreasureBoxFragment.initView$lambda$4(this.f28918OooO0Oo, view);
            }
        });
        getBinding().f59186OooOO0.setOnClickListener(new View.OnClickListener() { // from class: com.yalla.yalla.ui.fragment.o000O0o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TreasureBoxFragment.initView$lambda$6(this.f28923OooO0Oo, view);
            }
        });
        getBinding().f59187OooOO0O.setOnClickListener(new View.OnClickListener() { // from class: com.yalla.yalla.ui.fragment.o000Oo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TreasureBoxFragment.initView$lambda$8(this.f28929OooO0Oo, view);
            }
        });
        com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25038Oooo0oo.observe(requireActivity(), new OooOOO0(new OooO0O0()));
        getBinding().f59178OooO00o.OooOO0O(false);
        getBinding().f59178OooO00o.setErrorImage(oOo00OO0.room_ic_treasure_box_error);
        getBinding().f59178OooO00o.setErrorButtonBackground(oOo00OO0.room_shape_treasure_box_error_bg);
        StateLayout stateLayout = getBinding().f59178OooO00o;
        Intrinsics.checkNotNullExpressionValue(stateLayout, "binding.root");
        StateLayout.OooOO0(stateLayout, com.code.android.util.o0000.OooO00o(oO00O0o.white_50), new OooO0OO(), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$4(TreasureBoxFragment this$0, View view) {
        List<TreasureBoxModel.Rank> list;
        TreasureBoxModel.Rank rank;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getActivity() == null || (list = this$0.users) == null || (rank = (TreasureBoxModel.Rank) CollectionsKt.getOrNull(list, 0)) == null) {
            return;
        }
        o0OO000.OooO00o("102111");
        UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f27240Oooo0o, this$0.requireActivity(), String.valueOf(rank.getUserId()), false, 12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$6(TreasureBoxFragment this$0, View view) {
        List<TreasureBoxModel.Rank> list;
        TreasureBoxModel.Rank rank;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getActivity() == null || (list = this$0.users) == null || (rank = (TreasureBoxModel.Rank) CollectionsKt.getOrNull(list, 1)) == null) {
            return;
        }
        o0OO000.OooO00o("102111");
        UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f27240Oooo0o, this$0.requireActivity(), String.valueOf(rank.getUserId()), false, 12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$8(TreasureBoxFragment this$0, View view) {
        List<TreasureBoxModel.Rank> list;
        TreasureBoxModel.Rank rank;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getActivity() == null || (list = this$0.users) == null || (rank = (TreasureBoxModel.Rank) CollectionsKt.getOrNull(list, 2)) == null) {
            return;
        }
        o0OO000.OooO00o("102111");
        UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f27240Oooo0o, this$0.requireActivity(), String.valueOf(rank.getUserId()), false, 12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadBoxInfo() {
        final FragmentActivity activity = getActivity();
        if (activity != null) {
            ooooO000 ooooo000LoadBoxInfo$lambda$1$lambda$0 = loadBoxInfo$lambda$1$lambda$0(new ViewModelLazy(Reflection.getOrCreateKotlinClass(ooooO000.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.TreasureBoxFragment$loadBoxInfo$lambda$1$$inlined$viewModels$default$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final ViewModelStore invoke() {
                    ViewModelStore viewModelStore = activity.getViewModelStore();
                    Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                    return viewModelStore;
                }
            }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.TreasureBoxFragment$loadBoxInfo$lambda$1$$inlined$viewModels$default$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final ViewModelProvider.Factory invoke() {
                    ViewModelProvider.Factory defaultViewModelProviderFactory = activity.getDefaultViewModelProviderFactory();
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                    return defaultViewModelProviderFactory;
                }
            }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.TreasureBoxFragment$loadBoxInfo$lambda$1$$inlined$viewModels$default$3

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public final /* synthetic */ Function0 f28320OooO0Oo = null;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final CreationExtras invoke() {
                    CreationExtras creationExtras;
                    Function0 function0 = this.f28320OooO0Oo;
                    if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                        return creationExtras;
                    }
                    CreationExtras defaultViewModelCreationExtras = activity.getDefaultViewModelCreationExtras();
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                    return defaultViewModelCreationExtras;
                }
            }));
            int i = this.boxLevel;
            ooooo000LoadBoxInfo$lambda$1$lambda$0.getClass();
            com.code.android.util.o00oO0o.OooO00o(new oOO00OO(i, null)).observe(activity, new p377o0OOoOo.o0000OO0(new OooO0o(), new OooO(), null, false, 12));
        }
    }

    private static final ooooO000 loadBoxInfo$lambda$1$lambda$0(Lazy<ooooO000> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"SetTextI18n"})
    public final void setProgress(final int progress) {
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getBinding().f59190OooOOO0.getProgress(), progress);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.yalla.yalla.ui.fragment.o000
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                TreasureBoxFragment.setProgress$lambda$10$lambda$9(this.f28887OooO0Oo, progress, valueAnimator2);
            }
        });
        this.valueAnimator = valueAnimatorOfInt;
        valueAnimatorOfInt.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setProgress$lambda$10$lambda$9(TreasureBoxFragment this$0, int i, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        ProgressBar progressBar = this$0.getBinding().f59190OooOOO0;
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        progressBar.setProgress(((Integer) animatedValue).intValue());
        float width = ((this$0.getBinding().f59190OooOOO0.getWidth() - com.code.android.util.o0000O0.OooO00o(16)) * this$0.getBinding().f59190OooOOO0.getProgress()) / this$0.getBinding().f59190OooOOO0.getMax();
        View view = this$0.getBinding().f59200OooOo0o;
        Intrinsics.checkNotNullExpressionValue(view, "binding.vIndicator");
        p417o0OoO0.o000O0Oo.OooO0OO(view, (int) width);
        if (i == 0 || i == 100) {
            TextView textView = this$0.getBinding().f59195OooOOoo;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvIndicator");
            com.code.android.util.o000OO00.OooO0O0(textView);
            return;
        }
        this$0.getBinding().f59195OooOOoo.setText(i + "%");
        TextView textView2 = this$0.getBinding().f59195OooOOoo;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvIndicator");
        com.code.android.util.o000OO00.OooOOOO(textView2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showBoxAwards(List<TreasureBoxModel.Award> awards, TreasureBoxModel.Box box) {
        ConstraintLayout constraintLayout = getBinding().f59180OooO0OO;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.clRank");
        com.code.android.util.o000OO00.OooO0O0(constraintLayout);
        ConstraintLayout constraintLayout2 = getBinding().f59179OooO0O0;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.clAward");
        com.code.android.util.o000OO00.OooOOOO(constraintLayout2);
        setProgress(box.getPercent());
        int i = this.boxLevel;
        if (i == 1) {
            getBinding().f59188OooOO0o.setImageResource(oOo00OO0.room_ic_treasure_box_key_1);
        } else if (i == 5) {
            getBinding().f59188OooOO0o.setImageResource(oOo00OO0.room_ic_treasure_box_key_2);
        } else if (i == 10) {
            getBinding().f59188OooOO0o.setImageResource(oOo00OO0.room_ic_treasure_box_key_3);
        }
        int i2 = 0;
        for (Object obj : awards) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            TreasureBoxModel.Award award = (TreasureBoxModel.Award) obj;
            if (i2 == 0) {
                getBinding().f59189OooOOO.setText(award.getShowName());
                SVGAView sVGAView = getBinding().f59181OooO0Oo;
                String imageUrl = award.getImageUrl();
                Context context = com.code.android.util.o000O0.f10354OooO00o;
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                sVGAView.OooOO0O(imageUrl, activityOooO0O0 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O0 : null);
                sVGAView.OooOO0o();
            } else if (i2 == 1) {
                getBinding().f59191OooOOOO.setText(award.getShowName());
                SVGAView sVGAView2 = getBinding().f59183OooO0o0;
                String imageUrl2 = award.getImageUrl();
                Context context2 = com.code.android.util.o000O0.f10354OooO00o;
                Activity activityOooO0O1 = com.code.android.util.OooO0O0.OooO0O0();
                sVGAView2.OooOO0O(imageUrl2, activityOooO0O1 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O1 : null);
                sVGAView2.OooOO0o();
            } else if (i2 == 2) {
                getBinding().f59192OooOOOo.setText(award.getShowName());
                SVGAView sVGAView3 = getBinding().f59182OooO0o;
                String imageUrl3 = award.getImageUrl();
                Context context3 = com.code.android.util.o000O0.f10354OooO00o;
                Activity activityOooO0O2 = com.code.android.util.OooO0O0.OooO0O0();
                sVGAView3.OooOO0O(imageUrl3, activityOooO0O2 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O2 : null);
                sVGAView3.OooOO0o();
            } else if (i2 == 3) {
                getBinding().f59194OooOOo0.setText(award.getShowName());
                SVGAView sVGAView4 = getBinding().f59184OooO0oO;
                String imageUrl4 = award.getImageUrl();
                Context context4 = com.code.android.util.o000O0.f10354OooO00o;
                Activity activityOooO0O3 = com.code.android.util.OooO0O0.OooO0O0();
                sVGAView4.OooOO0O(imageUrl4, activityOooO0O3 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O3 : null);
                sVGAView4.OooOO0o();
            } else if (i2 == 4) {
                getBinding().f59193OooOOo.setText(award.getShowName());
                SVGAView sVGAView5 = getBinding().f59185OooO0oo;
                String imageUrl5 = award.getImageUrl();
                Context context5 = com.code.android.util.o000O0.f10354OooO00o;
                Activity activityOooO0O4 = com.code.android.util.OooO0O0.OooO0O0();
                sVGAView5.OooOO0O(imageUrl5, activityOooO0O4 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O4 : null);
                sVGAView5.OooOO0o();
            }
            i2 = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showOpenBox(List<TreasureBoxModel.Rank> userRank) {
        this.users = userRank;
        ConstraintLayout constraintLayout = getBinding().f59180OooO0OO;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.clRank");
        com.code.android.util.o000OO00.OooOOOO(constraintLayout);
        ConstraintLayout constraintLayout2 = getBinding().f59179OooO0O0;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.clAward");
        com.code.android.util.o000OO00.OooO0O0(constraintLayout2);
        if (CollectionsKt.getOrNull(userRank, 0) != null) {
            getBinding().f59198OooOo00.setText(userRank.get(0).getNickName());
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(getBinding().f59177OooO.getContext());
            String headUrl = userRank.get(0).getHeadUrl();
            int iOooO00o = com.code.android.util.o0000O0.OooO00o(60);
            oooO00o.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0oo(iOooO00o, iOooO00o, headUrl);
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
            oooO00o.OooO0O0(2, com.code.android.util.o0000.OooO00o(oO00O0o.color_FFFCCB80));
            oooO00o.OooO0Oo(getBinding().f59177OooO);
        } else {
            getBinding().f59198OooOo00.setText("");
            o0OOo0O.OooOO0.OooO00o oooO00o2 = new o0OOo0O.OooOO0.OooO00o(getBinding().f59177OooO.getContext());
            oooO00o2.f43915OooO0oO = oOo00OO0.room_ic_treasure_box_rank_no_user;
            oooO00o2.f43909OooO00o = 1;
            oooO00o2.OooO00o(p543o0oO0O00.OooO.OooO0OO());
            oooO00o2.OooO0O0(2, com.code.android.util.o0000.OooO00o(oO00O0o.color_FFFCCB80));
            oooO00o2.OooO0Oo(getBinding().f59177OooO);
        }
        if (CollectionsKt.getOrNull(userRank, 1) != null) {
            getBinding().f59197OooOo0.setText(userRank.get(1).getNickName());
            o0OOo0O.OooOO0.OooO00o oooO00o3 = new o0OOo0O.OooOO0.OooO00o(getBinding().f59186OooOO0.getContext());
            String headUrl2 = userRank.get(1).getHeadUrl();
            int iOooO00o2 = com.code.android.util.o0000O0.OooO00o(60);
            oooO00o3.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0oo(iOooO00o2, iOooO00o2, headUrl2);
            oooO00o3.f43909OooO00o = 0;
            oooO00o3.OooO00o(p543o0oO0O00.OooO.OooO0OO());
            oooO00o3.OooO0O0(2, com.code.android.util.o0000.OooO00o(oO00O0o.color_FFDEDFE4));
            oooO00o3.OooO0Oo(getBinding().f59186OooOO0);
        } else {
            getBinding().f59197OooOo0.setText("");
            o0OOo0O.OooOO0.OooO00o oooO00o4 = new o0OOo0O.OooOO0.OooO00o(getBinding().f59186OooOO0.getContext());
            oooO00o4.f43915OooO0oO = oOo00OO0.room_ic_treasure_box_rank_no_user;
            oooO00o4.f43909OooO00o = 1;
            oooO00o4.OooO00o(p543o0oO0O00.OooO.OooO0OO());
            oooO00o4.OooO0O0(2, com.code.android.util.o0000.OooO00o(oO00O0o.color_FFDEDFE4));
            oooO00o4.OooO0Oo(getBinding().f59186OooOO0);
        }
        if (CollectionsKt.getOrNull(userRank, 2) == null) {
            getBinding().f59199OooOo0O.setText("");
            o0OOo0O.OooOO0.OooO00o oooO00o5 = new o0OOo0O.OooOO0.OooO00o(getBinding().f59187OooOO0O.getContext());
            oooO00o5.f43915OooO0oO = oOo00OO0.room_ic_treasure_box_rank_no_user;
            oooO00o5.f43909OooO00o = 1;
            oooO00o5.OooO00o(p543o0oO0O00.OooO.OooO0OO());
            oooO00o5.OooO0O0(2, com.code.android.util.o0000.OooO00o(oO00O0o.color_FFEEC7AB));
            oooO00o5.OooO0Oo(getBinding().f59187OooOO0O);
            return;
        }
        getBinding().f59199OooOo0O.setText(userRank.get(2).getNickName());
        o0OOo0O.OooOO0.OooO00o oooO00o6 = new o0OOo0O.OooOO0.OooO00o(getBinding().f59187OooOO0O.getContext());
        String headUrl3 = userRank.get(2).getHeadUrl();
        int iOooO00o3 = com.code.android.util.o0000O0.OooO00o(60);
        oooO00o6.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0oo(iOooO00o3, iOooO00o3, headUrl3);
        oooO00o6.f43909OooO00o = 0;
        oooO00o6.OooO00o(p543o0oO0O00.OooO.OooO0OO());
        oooO00o6.OooO0O0(2, com.code.android.util.o0000.OooO00o(oO00O0o.color_FFEEC7AB));
        oooO00o6.OooO0Oo(getBinding().f59187OooOO0O);
    }

    @Override // p508o0o0O.OooOO0O, p401o0Oo0OO0.o00O0O, androidx.fragment.app.Fragment
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
        int i = 1;
        if (numValueOf == null || numValueOf.intValue() != 0) {
            if (numValueOf != null && numValueOf.intValue() == 1) {
                i = 5;
            } else if (numValueOf != null && numValueOf.intValue() == 2) {
                i = 10;
            }
        }
        this.boxLevel = i;
        initView();
        loadBoxInfo();
        LiveEventBus.get("ROOM_TREASURE_BOX_OPEN_DIALOG_DISMISS").observe(getViewLifecycleOwner(), new OooOO0());
        LiveEventBus.get("ROOM_TREASURE_BOX_DIALOG_SHOW").observe(getViewLifecycleOwner(), new OooOO0O());
    }

    @Override // p508o0o0O.OooOO0O
    @NotNull
    public w8 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        w8 w8VarInflate = w8.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(w8VarInflate, "inflate(inflater, container, false)");
        return w8VarInflate;
    }
}
