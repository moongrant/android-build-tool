package com.app.base.fragment;

import Oooo000.o000OO00;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.platform.o00oOoo;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o0000O;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.app.base.fragment.MainMomentFragment;
import com.code.android.util.ToastUtil;
import com.facebook.share.internal.ShareConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.umeng.analytics.pro.ak;
import com.umeng.analytics.pro.d;
import com.umeng.commonsdk.internal.a;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.common.constant.MainPage;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.data.manager.SharedMessageVM;
import com.yalla.yalla.model.TopicCreateCheckModel;
import com.yalla.yalla.model.TopicState;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.moment.MomentMessageListActivity;
import com.yalla.yalla.ui.activity.moment.TopicCreateCheckActivity;
import com.yalla.yalla.ui.activity.moment.TopicReviewActivity;
import com.yalla.yalla.ui.fragment.MainMomentTopicFragment;
import com.yalla.yalla.ui.vm.moment.MomentVM;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import o00OO0O0.o0OOO0o;
import o0O0O00.o000000;
import o0O0O00.o00Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.o00oO0o;
import p028Oooo0o0.o0O00o00;
import p028Oooo0o0.o0O0O0O;
import p028Oooo0o0.o0O0OO0;
import p031OoooO.o000O0O0;
import p031OoooO.o000Oo0;
import p043OooooO0.o00;
import p043OooooO0.o00O0000;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OO0OO;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0O0O0o0;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p142o00OOooO.o0000;
import p142o00OOooO.o0000O0;
import p142o00OOooO.o0000O00;
import p142o00OOooO.o0000Ooo;
import p142o00OOooO.o0000oo;
import p145o00Oo0.o00000O0;
import p166o00OoOoo.o0O00O0o;
import p168o00Ooo0.o0OoOo0;
import p254o00ooO0O.o00000O;
import p254o00ooO0O.o000O0o;
import p391o0OOooOo.o0O00000;
import p442o0OoOo0.o0OO00O;
import p649o0ooOOoo.e9;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b/\u00100J\u0012\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\u0005H\u0002J\u001a\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0014J\b\u0010\u0011\u001a\u00020\u0005H\u0016J3\u0010\u0018\u001a\u00020\u0005*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001aH\u0016R\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R+\u0010.\u001a\u00020&2\u0006\u0010'\u001a\u00020&8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00061"}, d2 = {"Lcom/app/base/fragment/MainMomentFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/e9;", "", "isClick", "", "checkTopicState", "initView", "changeCreateImageButtonState", "initObserver", "uploadMomentStatisticalTime", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "onResume", "LOooo0o0/o0O0O0O;", "", ShareConstants.WEB_DIALOG_PARAM_TITLE, "isSelected", "Lkotlin/Function0;", "onClick", "TabItem", "(LOooo0o0/o0O0O0O;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lo000oOoO/oOO00O;II)V", "Landroid/view/View;", ak.aE, "onNoDoubleClick", "Lcom/yalla/yalla/ui/vm/moment/MomentVM;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lcom/yalla/yalla/ui/vm/moment/MomentVM;", "vm", "Lcom/yalla/yalla/model/TopicState;", "topicState", "Lcom/yalla/yalla/model/TopicState;", "", "<set-?>", "currentSelectTab$delegate", "Lo000oOoO/o0O00OO;", "getCurrentSelectTab", "()I", "setCurrentSelectTab", "(I)V", "currentSelectTab", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MainMomentFragment extends p503o0o00o00.OooO<e9> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: currentSelectTab$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO currentSelectTab;

    @Nullable
    private TopicState topicState;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm;

    @Nullable
    private p183o00o000O.OooO0O0 ylNavigator;

    public static final class OooO implements ViewPager.OooOOO0 {
        public OooO() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageSelected(int i) {
            MainMomentFragment.this.setCurrentSelectTab(i);
            MainMomentFragment.this.changeCreateImageButtonState();
            if (MainMomentFragment.this.topicState == null) {
                MainMomentFragment.checkTopicState$default(MainMomentFragment.this, false, 1, null);
            }
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f11569Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Function0<Unit> function0) {
            super(0);
            this.f11569Oooo0o = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f11569Oooo0o.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ boolean f11570Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O0O0O f11572Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f11573Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f11574OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f11575OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ int f11576OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o0O0O0O o0o0o0o, String str, boolean z, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.f11572Oooo0oO = o0o0o0o;
            this.f11573Oooo0oo = str;
            this.f11570Oooo = z;
            this.f11575OoooO00 = function0;
            this.f11574OoooO0 = i;
            this.f11576OoooO0O = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            MainMomentFragment.this.TabItem(this.f11572Oooo0oO, this.f11573Oooo0oo, this.f11570Oooo, this.f11575OoooO00, ooo00o, this.f11574OoooO0 | 1, this.f11576OoooO0O);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class OooO0OO {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TopicState.values().length];
            iArr[TopicState.NULL.ordinal()] = 1;
            iArr[TopicState.REVIEW.ordinal()] = 2;
            iArr[TopicState.CREATED.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ MainMomentTopicFragment f11577Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ MainMomentFollowingFragment f11579Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ MomentListFeaturedFragment f11580Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(MainMomentFollowingFragment mainMomentFollowingFragment, MomentListFeaturedFragment momentListFeaturedFragment, MainMomentTopicFragment mainMomentTopicFragment) {
            super(2);
            this.f11579Oooo0oO = mainMomentFollowingFragment;
            this.f11580Oooo0oo = momentListFeaturedFragment;
            this.f11577Oooo = mainMomentTopicFragment;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
        /* JADX WARN: Type inference failed for: r18v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
        /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
        /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            oOO00O composer = ooo00o;
            if ((num.intValue() & 11) == 2 && composer.OooOo0()) {
                composer.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                o00OOOO0 o00oooo0OooO0o0 = SizeKt.OooO0o0(oooO00o);
                MainMomentFragment mainMomentFragment = MainMomentFragment.this;
                MainMomentFollowingFragment mainMomentFollowingFragment = this.f11579Oooo0oO;
                MomentListFeaturedFragment momentListFeaturedFragment = this.f11580Oooo0oo;
                MainMomentTopicFragment mainMomentTopicFragment = this.f11577Oooo;
                composer.OooO0o0(733328855);
                o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                composer.OooO0o0(-1323940314);
                o0O0O0o0<o0000O0O.OooO> o0o0o0o0 = o000.f6356OooO0o0;
                o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6360OooOO0O;
                LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6364OooOOOO;
                o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0o0);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function0);
                } else {
                    composer.Oooo00O();
                }
                composer.OooOo0O();
                Intrinsics.checkNotNullParameter(composer, "composer");
                ?? r0 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r0);
                ?? r2 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                oO00000o.OooO0O0(composer, oooO, r2);
                ?? r3 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                oO00000o.OooO0O0(composer, layoutDirection, r3);
                ?? r18 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r18, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-2137368960);
                o00OOOO0 o00oooo0OooO = PaddingKt.OooO(SizeKt.OooO0Oo(oooO00o), 48, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 16, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 10);
                o00OO0OO alignment = o00OO0O0.OooO00o.f4175OooO0o;
                Intrinsics.checkNotNullParameter(o00oooo0OooO, "<this>");
                Intrinsics.checkNotNullParameter(alignment, "alignment");
                Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
                Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
                o00OOOO0 o00oooo0OooOOoo = o00oooo0OooO.OooOOoo(new p028Oooo0o0.o00O00O(alignment, false));
                composer.OooO0o0(693286680);
                p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
                o000000 o000000VarOooO00o = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, o00OO0O0.OooO00o.f4180OooOO0O, composer);
                composer.OooO0o0(-1323940314);
                o0000O0O.OooO oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooOOoo);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function0);
                } else {
                    composer.Oooo00O();
                }
                ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r0, composer, oooO2, r2, composer, layoutDirection2, r3, composer, o00ooooo3, r18, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-678309503);
                RowScopeInstance rowScopeInstance = RowScopeInstance.f5758OooO00o;
                mainMomentFragment.TabItem(rowScopeInstance, o00000.OooO0OO.OooO00o(R.string.moments_following, composer), mainMomentFragment.getCurrentSelectTab() == 0, new com.app.base.fragment.OooO0o(mainMomentFragment, mainMomentFollowingFragment), composer, a.k, 0);
                mainMomentFragment.TabItem(rowScopeInstance, o00000.OooO0OO.OooO00o(R.string.Featured, composer), mainMomentFragment.getCurrentSelectTab() == 1, new com.app.base.fragment.OooO(mainMomentFragment, momentListFeaturedFragment), composer, a.k, 0);
                mainMomentFragment.TabItem(rowScopeInstance, o00000.OooO0OO.OooO00o(R.string.Topics, composer), mainMomentFragment.getCurrentSelectTab() == 2, new com.app.base.fragment.OooOO0(mainMomentFragment, mainMomentTopicFragment), composer, a.k, 0);
                o00OO0O.OooOO0O.OooO00o(composer);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            OooOO0O onLogin = new OooOO0O(MainMomentFragment.this);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
                if (activityOooO0O0 != null) {
                    LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
                    o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public MainMomentFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.app.base.fragment.MainMomentFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.app.base.fragment.MainMomentFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        this.vm = o0000O.OooO0O0(this, Reflection.getOrCreateKotlinClass(MomentVM.class), new Function0<ViewModelStore>() { // from class: com.app.base.fragment.MainMomentFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o00OO0O.OooOO0.OooO00o(lazy, "owner.viewModelStore");
            }
        }, new Function0<CreationExtras>() { // from class: com.app.base.fragment.MainMomentFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Function0 f11585Oooo0o = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = this.f11585Oooo0o;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = o0000O.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.app.base.fragment.MainMomentFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = o0000O.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.currentSelectTab = o0OOO00.OooO0Oo(1);
    }

    /* JADX INFO: renamed from: TabItem$lambda-6$lambda-4, reason: not valid java name */
    private static final float m26TabItem$lambda6$lambda4(oO0Oo<Float> oo0oo) {
        return oo0oo.getValue().floatValue();
    }

    /* JADX INFO: renamed from: TabItem$lambda-6$lambda-5, reason: not valid java name */
    private static final long m27TabItem$lambda6$lambda5(oO0Oo<o00000O0> oo0oo) {
        return oo0oo.getValue().f32070OooO00o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeCreateImageButtonState() {
        p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
        Boolean value = oooOOO.OooOooO().getValue();
        Boolean bool = Boolean.FALSE;
        if (Intrinsics.areEqual(value, bool)) {
            ImageView imageView = getBinding().f49228OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivMainMomentCreate");
            o00O0O.OooO00o(imageView);
            return;
        }
        ImageView imageView2 = getBinding().f49228OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivMainMomentCreate");
        o00O0O.OooO(imageView2);
        if (getBinding().f49230OooO0o.getCurrentItem() == 2) {
            if (this.topicState == null && Intrinsics.areEqual(oooOOO.OooOooO().getValue(), bool)) {
                LiveEventBus.get("TOPIC_CREATE_VIEW_VISIBLE").post(Boolean.TRUE);
                return;
            }
            TopicState topicState = this.topicState;
            int i = topicState == null ? -1 : OooO0OO.$EnumSwitchMapping$0[topicState.ordinal()];
            if (i == -1) {
                LiveEventBus.get("TOPIC_CREATE_VIEW_VISIBLE").post(bool);
                return;
            }
            if (i == 1) {
                LiveEventBus.get("TOPIC_CREATE_VIEW_VISIBLE").post(Boolean.TRUE);
            } else if (i == 2) {
                LiveEventBus.get("TOPIC_CREATE_VIEW_VISIBLE").post(Boolean.TRUE);
            } else {
                if (i != 3) {
                    return;
                }
                LiveEventBus.get("TOPIC_CREATE_VIEW_VISIBLE").post(bool);
            }
        }
    }

    private final void checkTopicState(final boolean isClick) {
        if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.FALSE)) {
            return;
        }
        getVm().checkTopicState().observe(getViewLifecycleOwner(), new Observer() { // from class: o00OOooO.o0000O0O
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MainMomentFragment.m28checkTopicState$lambda2(this.f31930OooO00o, isClick, (Response) obj);
            }
        });
    }

    public static /* synthetic */ void checkTopicState$default(MainMomentFragment mainMomentFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        mainMomentFragment.checkTopicState(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: checkTopicState$lambda-2, reason: not valid java name */
    public static final void m28checkTopicState$lambda2(MainMomentFragment this$0, boolean z, Response response) {
        Context con;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!response.getIsSuccess()) {
            this$0.changeCreateImageButtonState();
            return;
        }
        TopicCreateCheckModel topicCreateCheckModel = (TopicCreateCheckModel) response.getData();
        if (topicCreateCheckModel != null) {
            this$0.topicState = topicCreateCheckModel.getTopicState();
            this$0.changeCreateImageButtonState();
            if (z && (con = this$0.getContext()) != null) {
                TopicState topicState = this$0.topicState;
                int i = topicState == null ? -1 : OooO0OO.$EnumSwitchMapping$0[topicState.ordinal()];
                Boolean boolValueOf3 = null;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return;
                        }
                        ToastUtil.f12567OooO00o.OooO00o(R.string.topic_exist);
                        LiveEventBus.get("TOPIC_TO_CREATED").post(null);
                        return;
                    }
                    TopicReviewActivity.OooO00o oooO00o = TopicReviewActivity.f22652Ooooo00;
                    Intrinsics.checkNotNullExpressionValue(con, "con");
                    Intrinsics.checkNotNullParameter(con, "context");
                    con.startActivity(new Intent(con, (Class<?>) TopicReviewActivity.class));
                    return;
                }
                TopicCreateCheckActivity.OooO00o oooO00o2 = TopicCreateCheckActivity.f22557Ooooo0o;
                Intrinsics.checkNotNullExpressionValue(con, "con");
                Integer userLevel = topicCreateCheckModel.getUserLevel();
                if (userLevel != null) {
                    boolValueOf = Boolean.valueOf(userLevel.intValue() == 1);
                } else {
                    boolValueOf = null;
                }
                Integer regTime = topicCreateCheckModel.getRegTime();
                if (regTime != null) {
                    boolValueOf2 = Boolean.valueOf(regTime.intValue() == 1);
                } else {
                    boolValueOf2 = null;
                }
                Integer keepLaw = topicCreateCheckModel.getKeepLaw();
                if (keepLaw != null) {
                    boolValueOf3 = Boolean.valueOf(keepLaw.intValue() == 1);
                }
                oooO00o2.OooO00o(con, boolValueOf, boolValueOf2, boolValueOf3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final int getCurrentSelectTab() {
        return ((Number) this.currentSelectTab.getValue()).intValue();
    }

    private final MomentVM getVm() {
        return (MomentVM) this.vm.getValue();
    }

    private final void initObserver() {
        LiveData<Integer> unreadMomentsMessageCount = SharedMessageVM.INSTANCE.getUnreadMomentsMessageCount();
        Intrinsics.checkNotNull(unreadMomentsMessageCount);
        int i = 0;
        unreadMomentsMessageCount.observe(getViewLifecycleOwner(), new o0000(this, i));
        LiveEventBus.get("MESSAGE_TOPIC_STATE_CHANGE").observe(this, new o0000oo(this, i));
        LiveEventBus.get("TOPIC_CREATE_CHECK").observe(this, new o0000O0(this, i));
        LiveEventBus.get("TOPIC_CREATE_CHECK_CLICK", Boolean.TYPE).observe(this, new o0000Ooo(this, i));
        LiveEventBus.get("OPEN_MAIN_ACTIVITY_PAGE", Integer.TYPE).observeSticky(this, new o0000O00(this, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-10, reason: not valid java name */
    public static final void m29initObserver$lambda10(MainMomentFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        checkTopicState$default(this$0, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-11, reason: not valid java name */
    public static final void m30initObserver$lambda11(MainMomentFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.checkTopicState(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-12, reason: not valid java name */
    public static final void m31initObserver$lambda12(MainMomentFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (num == null) {
            return;
        }
        int iIntValue = num.intValue();
        if (iIntValue == MainPage.MomentFollowingPage.getValue()) {
            this$0.getBinding().f49230OooO0o.setCurrentItem(0);
        } else if (iIntValue == MainPage.MomentFeaturedPage.getValue()) {
            this$0.getBinding().f49230OooO0o.setCurrentItem(1);
        } else if (iIntValue == MainPage.MomentTopicsPage.getValue()) {
            this$0.getBinding().f49230OooO0o.setCurrentItem(2);
        }
        this$0.setCurrentSelectTab(this$0.getBinding().f49230OooO0o.getCurrentItem());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-8, reason: not valid java name */
    public static final void m32initObserver$lambda8(MainMomentFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int iIntValue = num == null ? 0 : num.intValue();
        TextView textView = this$0.getBinding().f49231OooO0o0;
        if (textView != null) {
            textView.setVisibility(8);
            textView.setText("");
            if (iIntValue > 0) {
                textView.setVisibility(0);
                textView.setText(iIntValue + "");
                textView.setBackgroundResource(R.drawable.bg_red_point_circle);
                if (iIntValue > 99) {
                    textView.setText("...");
                    textView.setBackgroundResource(R.drawable.bg_red_point_oval);
                }
            }
        }
        LinearLayout linearLayout = this$0.getBinding().f49229OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llMainMomentNotice");
        o00O0O.OooO0oO(linearLayout, num == null || num.intValue() != 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-9, reason: not valid java name */
    public static final void m33initObserver$lambda9(MainMomentFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        checkTopicState$default(this$0, false, 1, null);
    }

    private final void initView() {
        o0OoOo0.OooO();
        MainMomentFollowingFragment mainMomentFollowingFragment = new MainMomentFollowingFragment();
        MomentListFeaturedFragment momentListFeaturedFragment = new MomentListFeaturedFragment();
        MainMomentTopicFragment mainMomentTopicFragment = new MainMomentTopicFragment();
        List listMutableListOf = CollectionsKt.mutableListOf(mainMomentFollowingFragment, momentListFeaturedFragment, mainMomentTopicFragment);
        getBinding().f49227OooO0O0.setContent(o00O0000.OooO0O0(209745728, true, new OooO0o(mainMomentFollowingFragment, momentListFeaturedFragment, mainMomentTopicFragment)));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        getBinding().f49230OooO0o.setAdapter(new p462o0Ooo0o.o0000O00(childFragmentManager, listMutableListOf));
        getBinding().f49230OooO0o.setOffscreenPageLimit(listMutableListOf.size() - 1);
        getBinding().f49230OooO0o.OooO0O0(new OooO());
        getBinding().f49229OooO0Oo.setOnClickListener(this);
        getBinding().f49228OooO0OO.setOnClickListener(this);
        o0O00O0o o0o00o0oOooO0O0 = com.android.billingclient.api.o00000O.OooO0O0();
        Objects.requireNonNull(o0o00o0oOooO0O0);
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("FIRST_FEATURED_MOMENT_FOR_NEW_USER");
        p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
        sbOooO0o0.append(String.valueOf(oooOOO.OooOo().getValue()));
        if (o0o00o0oOooO0O0.OooO0Oo(sbOooO0o0.toString(), true)) {
            getBinding().f49230OooO0o.setCurrentItem(1);
            o0O00O0o o0o00o0oOooO0O1 = com.android.billingclient.api.o00000O.OooO0O0();
            Objects.requireNonNull(o0o00o0oOooO0O1);
            StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("FIRST_FEATURED_MOMENT_FOR_NEW_USER");
            sbOooO0o1.append(String.valueOf(oooOOO.OooOo().getValue()));
            o0o00o0oOooO0O1.OooO0oo(sbOooO0o1.toString(), false);
            return;
        }
        if (com.android.billingclient.api.o00000O.OooO0O0().OooOOO0()) {
            getBinding().f49230OooO0o.setCurrentItem(2);
        } else {
            int lastLeaveMomentPage = getVm().getLastLeaveMomentPage();
            if (lastLeaveMomentPage == 0) {
                getBinding().f49230OooO0o.setCurrentItem(0);
            } else if (lastLeaveMomentPage == 1) {
                getBinding().f49230OooO0o.setCurrentItem(1);
            } else if (lastLeaveMomentPage == 2 || lastLeaveMomentPage == 3) {
                getBinding().f49230OooO0o.setCurrentItem(2);
            }
        }
        setCurrentSelectTab(getBinding().f49230OooO0o.getCurrentItem());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentSelectTab(int i) {
        this.currentSelectTab.setValue(Integer.valueOf(i));
    }

    private final void uploadMomentStatisticalTime() {
        getVm().momentsDurationAdd(com.android.billingclient.api.o00000O.OooO0O0().OooO0O0("MOMENT_STATISTICAL_TIME", 0L)).observe(getViewLifecycleOwner(), new Observer() { // from class: o00OOooO.o000OO
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MainMomentFragment.m34uploadMomentStatisticalTime$lambda13((ApiResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: uploadMomentStatisticalTime$lambda-13, reason: not valid java name */
    public static final void m34uploadMomentStatisticalTime$lambda13(ApiResult apiResult) {
        com.android.billingclient.api.o00000O.OooO0O0().OooOOo0(0L);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:37:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x009c  */
    /* JADX WARN: Code duplicated, block: B:52:0x009f  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:61:0x0124  */
    /* JADX WARN: Code duplicated, block: B:63:0x012d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0131  */
    /* JADX WARN: Code duplicated, block: B:67:0x016c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0170  */
    /* JADX WARN: Code duplicated, block: B:71:0x0183  */
    /* JADX WARN: Code duplicated, block: B:72:0x0186  */
    /* JADX WARN: Code duplicated, block: B:77:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:79:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v7, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void TabItem(@NotNull o0O0O0O o0o0o0o, @NotNull String title, boolean z, @NotNull Function0<Unit> onClick, @Nullable oOO00O ooo00o, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        boolean zOooo0oo;
        Object objOooO0o;
        o000000 o000000VarOooO00o;
        o0000O0O.OooO oooO;
        LayoutDirection layoutDirection;
        o00OOOOo o00ooooo2;
        Function0<o000000.OooO00o> function0;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0;
        float f;
        long j;
        oOO00O ooo00o2;
        boolean z4;
        oo0ooO oo0oooOooOo;
        Intrinsics.checkNotNullParameter(o0o0o0o, "<this>");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        oOO00O composer = ooo00o.OooOOo(-597701622);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composer.Oooo0oo(o0o0o0o) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composer.Oooo0oo(title) ? 32 : 16;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 896) == 0) {
                z2 = z;
                i3 |= composer.OooO0OO(z2) ? 256 : 128;
            }
            if ((i2 & 4) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (composer.Oooo0oo(onClick)) {
                    i4 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
            i5 = i3;
            if ((i5 & 5851) == 1170 || !composer.OooOo0()) {
                if (i6 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                o00OO0OO o00oo0oo = o00OO0O0.OooO00o.f4175OooO0o;
                o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                composer.OooO0o0(1157296644);
                zOooo0oo = composer.Oooo0oo(onClick);
                objOooO0o = composer.OooO0o();
                if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                    objOooO0o = new OooO00o(onClick);
                    composer.Oooo00o(objOooO0o);
                }
                composer.Oooo0o0();
                o00OOOO0 o00oooo0OooO0oO = PaddingKt.OooO0oO(o0o0o0o.OooO00o(SizeKt.OooO0Oo(o000O0o.OooO0O0(oooO00o, false, false, null, (Function0) objOooO0o, 253)), true), 8, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
                o000000VarOooO00o = o00O00O.OooO0OO.OooO00o(composer, 733328855, o00oo0oo, false, composer, -1323940314);
                oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
                layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
                o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0oO);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function0);
                } else {
                    composer.Oooo00O();
                }
                composer.OooOo0O();
                Intrinsics.checkNotNullParameter(composer, "composer");
                oO00000o.OooO0O0(composer, o000000VarOooO00o, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
                oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
                oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-2137368960);
                if (z3) {
                    f = 1.06f;
                } else {
                    f = 1.0f;
                }
                oO0Oo oo0ooOooO0O0 = p023Oooo00O.o0OoOo0.OooO0O0(f, o00oO0o.OooO0Oo(500, 0, null, 6), composer, 48);
                p507o0o00oOO.o0000O0 o0000o1 = p507o0o00oOO.o0000O0.f41691OooO00o;
                if (z3) {
                    j = p507o0o00oOO.o0000O0.f41693OooO0OO;
                } else {
                    j = p507o0o00oOO.o0000O0.f41697OooO0oO;
                }
                oO0Oo oo0ooOooO00o = o000OO00.OooO00o(j, o00oO0o.OooO0Oo(500, 0, null, 6), composer, 48, 4);
                long jOooO0OO = o0000O0O.o00Oo0.OooO0OO(16);
                o00000oO.o0000O00.OooO00o oooO00o2 = p053o00000oO.o0000O00.f27125Oooo0oO;
                ooo00o2 = composer;
                o000O0O0.OooO0OO(title, o0OO00O.OooO00o(m26TabItem$lambda6$lambda4(oo0ooOooO0O0)), m27TabItem$lambda6$lambda5(oo0ooOooO00o), jOooO0OO, null, p053o00000oO.o0000O00.f27130OoooO0O, null, 0L, null, null, 0L, 0, false, 0, null, null, ooo00o2, ((i5 >> 3) & 14) | 199680, 0, 65488);
                o0O0OO0.OooO00o(ooo00o2);
                z4 = z3;
            } else {
                composer.OooOoo0();
                z4 = z2;
                ooo00o2 = composer;
            }
            oo0oooOooOo = ooo00o2.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO0O0(o0o0o0o, title, z4, onClick, i, i2));
        }
        i3 |= 384;
        z2 = z;
        if ((i2 & 4) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (composer.Oooo0oo(onClick)) {
                i4 = RecyclerView.oo0o0Oo.FLAG_MOVED;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        i5 = i3;
        if ((i5 & 5851) == 1170) {
            if (i6 != 0) {
                z3 = false;
            } else {
                z3 = z2;
            }
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function4 = oo0o0O0.f29705OooO00o;
            o00OO0OO o00oo0oo2 = o00OO0O0.OooO00o.f4175OooO0o;
            o00OOOO0.OooO00o oooO00o3 = o00OOOO0.OooO00o.f4198Oooo0o;
            composer.OooO0o0(1157296644);
            zOooo0oo = composer.Oooo0oo(onClick);
            objOooO0o = composer.OooO0o();
            if (zOooo0oo) {
                objOooO0o = new OooO00o(onClick);
                composer.Oooo00o(objOooO0o);
            } else {
                objOooO0o = new OooO00o(onClick);
                composer.Oooo00o(objOooO0o);
            }
            composer.Oooo0o0();
            o00OOOO0 o00oooo0OooO0oO2 = PaddingKt.OooO0oO(o0o0o0o.OooO00o(SizeKt.OooO0Oo(o000O0o.OooO0O0(oooO00o3, false, false, null, (Function0) objOooO0o, 253)), true), 8, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
            o000000VarOooO00o = o00O00O.OooO0OO.OooO00o(composer, 733328855, o00oo0oo2, false, composer, -1323940314);
            oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
            layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
            o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0oO2);
            if (!(composer.OooOo0o() instanceof o00O000)) {
                o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                composer.OooOoO0(function0);
            } else {
                composer.Oooo00O();
            }
            composer.OooOo0O();
            Intrinsics.checkNotNullParameter(composer, "composer");
            oO00000o.OooO0O0(composer, o000000VarOooO00o, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
            oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
            oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-2137368960);
            if (z3) {
                f = 1.06f;
            } else {
                f = 1.0f;
            }
            oO0Oo oo0ooOooO0O1 = p023Oooo00O.o0OoOo0.OooO0O0(f, o00oO0o.OooO0Oo(500, 0, null, 6), composer, 48);
            p507o0o00oOO.o0000O0 o0000o2 = p507o0o00oOO.o0000O0.f41691OooO00o;
            if (z3) {
                j = p507o0o00oOO.o0000O0.f41693OooO0OO;
            } else {
                j = p507o0o00oOO.o0000O0.f41697OooO0oO;
            }
            oO0Oo oo0ooOooO00o2 = o000OO00.OooO00o(j, o00oO0o.OooO0Oo(500, 0, null, 6), composer, 48, 4);
            long jOooO0OO2 = o0000O0O.o00Oo0.OooO0OO(16);
            o00000oO.o0000O00.OooO00o oooO00o4 = p053o00000oO.o0000O00.f27125Oooo0oO;
            ooo00o2 = composer;
            o000O0O0.OooO0OO(title, o0OO00O.OooO00o(m26TabItem$lambda6$lambda4(oo0ooOooO0O1)), m27TabItem$lambda6$lambda5(oo0ooOooO00o2), jOooO0OO2, null, p053o00000oO.o0000O00.f27130OoooO0O, null, 0L, null, null, 0L, 0, false, 0, null, null, ooo00o2, ((i5 >> 3) & 14) | 199680, 0, 65488);
            o0O0OO0.OooO00o(ooo00o2);
            z4 = z3;
        } else {
            if (i6 != 0) {
                z3 = false;
            } else {
                z3 = z2;
            }
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function5 = oo0o0O0.f29705OooO00o;
            o00OO0OO o00oo0oo3 = o00OO0O0.OooO00o.f4175OooO0o;
            o00OOOO0.OooO00o oooO00o5 = o00OOOO0.OooO00o.f4198Oooo0o;
            composer.OooO0o0(1157296644);
            zOooo0oo = composer.Oooo0oo(onClick);
            objOooO0o = composer.OooO0o();
            if (zOooo0oo) {
                objOooO0o = new OooO00o(onClick);
                composer.Oooo00o(objOooO0o);
            } else {
                objOooO0o = new OooO00o(onClick);
                composer.Oooo00o(objOooO0o);
            }
            composer.Oooo0o0();
            o00OOOO0 o00oooo0OooO0oO3 = PaddingKt.OooO0oO(o0o0o0o.OooO00o(SizeKt.OooO0Oo(o000O0o.OooO0O0(oooO00o5, false, false, null, (Function0) objOooO0o, 253)), true), 8, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
            o000000VarOooO00o = o00O00O.OooO0OO.OooO00o(composer, 733328855, o00oo0oo3, false, composer, -1323940314);
            oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
            layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
            o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0oO3);
            if (!(composer.OooOo0o() instanceof o00O000)) {
                o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                composer.OooOoO0(function0);
            } else {
                composer.Oooo00O();
            }
            composer.OooOo0O();
            Intrinsics.checkNotNullParameter(composer, "composer");
            oO00000o.OooO0O0(composer, o000000VarOooO00o, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
            oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
            oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-2137368960);
            if (z3) {
                f = 1.06f;
            } else {
                f = 1.0f;
            }
            oO0Oo oo0ooOooO0O2 = p023Oooo00O.o0OoOo0.OooO0O0(f, o00oO0o.OooO0Oo(500, 0, null, 6), composer, 48);
            p507o0o00oOO.o0000O0 o0000o3 = p507o0o00oOO.o0000O0.f41691OooO00o;
            if (z3) {
                j = p507o0o00oOO.o0000O0.f41693OooO0OO;
            } else {
                j = p507o0o00oOO.o0000O0.f41697OooO0oO;
            }
            oO0Oo oo0ooOooO00o3 = o000OO00.OooO00o(j, o00oO0o.OooO0Oo(500, 0, null, 6), composer, 48, 4);
            long jOooO0OO3 = o0000O0O.o00Oo0.OooO0OO(16);
            o00000oO.o0000O00.OooO00o oooO00o6 = p053o00000oO.o0000O00.f27125Oooo0oO;
            ooo00o2 = composer;
            o000O0O0.OooO0OO(title, o0OO00O.OooO00o(m26TabItem$lambda6$lambda4(oo0ooOooO0O2)), m27TabItem$lambda6$lambda5(oo0ooOooO00o3), jOooO0OO3, null, p053o00000oO.o0000O00.f27130OoooO0O, null, 0L, null, null, 0L, 0, false, 0, null, null, ooo00o2, ((i5 >> 3) & 14) | 199680, 0, 65488);
            o0O0OO0.OooO00o(ooo00o2);
            z4 = z3;
        }
        oo0oooOooOo = ooo00o2.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0O0(o0o0o0o, title, z4, onClick, i, i2));
    }

    @Override // p462o0Ooo0o.o0000
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        initObserver();
        checkTopicState$default(this, false, 1, null);
    }

    @Override // p503o0o00o00.OooO
    public void onNoDoubleClick(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        super.onNoDoubleClick(v);
        int id = v.getId();
        if (id != R.id.ivMainMomentCreate) {
            if (id != R.id.llMainMomentNotice) {
                return;
            }
            o0O00000.OooO0OO("Moments_notice");
            Context context = getContext();
            if (context != null) {
                MomentMessageListActivity.f22334OoooooO.OooO00o(context);
                return;
            }
            return;
        }
        OooOO0 onLogin = new OooOO0();
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
        if (activityOooO0O0 != null) {
            LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
            o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
        }
    }

    @Override // p503o0o00o00.OooO, p462o0Ooo0o.o0000, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        changeCreateImageButtonState();
        uploadMomentStatisticalTime();
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public e9 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        e9 e9VarInflate = e9.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(e9VarInflate, "inflate(inflater)");
        return e9VarInflate;
    }
}
