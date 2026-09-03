package com.yalla.yalla.ui.fragment.mainroom;

import Oooo000.o000OO00;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o0000O;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager.widget.ViewPager;
import com.app.base.view.dialog.WelcomeDialog;
import com.booking.rtlviewpager.RtlViewPager;
import com.facebook.share.internal.ShareConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.statebutton.StateButton;
import com.yalla.yalla.common.constant.MainPage;
import com.yalla.yalla.common.manager.data.SharedMainMessageManager;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.model.CheckSignInModel;
import com.yalla.yalla.model.UserReturnRewardModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import com.yalla.yalla.ui.activity.store.ArrearsDetailActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment;
import com.yalla.yalla.ui.view.AutoImage;
import com.yalla.yalla.ui.vm.main.MainRoomVM;
import com.yalla.yalla.ui.vm.user.UserInfoVM;
import com.yalla.yalla.util.netimage.NetImageView;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsKt;
import o0O0O00.o000000;
import o0O0O00.o00Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.o00oO0o;
import p028Oooo0o0.o0O00o00;
import p028Oooo0o0.o0O0OO0;
import p031OoooO.o000Oo0;
import p031OoooO.o0OOO0o;
import p043OooooO0.o00;
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
import p142o00OOooO.o00O0000;
import p143o00OOooo.o00O0;
import p145o00Oo0.o00000O0;
import p168o00Ooo0.oo000o;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o000O0o;
import p261o00ooOoO.u;
import p263o00ooo.o000OO0O;
import p391o0OOooOo.o0O00000;
import p442o0OoOo0.o0OO00O;
import p462o0Ooo0o.o0000O00;
import p499o0o00OoO.o00000OO;
import p501o0o00o.o0000O0;
import p501o0o00o.o0000O0O;
import p501o0o00o.o0000OO0;
import p501o0o00o.o0000oo;
import p501o0o00o.o000OO;
import p502o0o00o0.o00000O;
import p524o0o0O0oO.oo00oO;
import p579o0oOoOOo.ooOOO0Oo;
import p579o0oOoOOo.r1;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.i8;
import p649o0ooOOoo.ya;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\bD\u0010EJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0002J\b\u0010\f\u001a\u00020\u0003H\u0002J\b\u0010\r\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0002J\b\u0010\u000f\u001a\u00020\u0003H\u0002J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u001a\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0014J/\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010 \u001a\u00020\u0003H\u0016J\b\u0010!\u001a\u00020\u0003H\u0016R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00103R\u001c\u00106\u001a\b\u0012\u0004\u0012\u00020\u0019058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\u001e\u00109\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u000308058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00107R\u0016\u0010:\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010.R+\u0010C\u001a\u00020;2\u0006\u0010<\u001a\u00020;8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006F"}, d2 = {"Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/ya;", "", "initObserver", "initView", "resumeLeavePage", "", "showIcon", "showIconAnim", "setCheckVisibility", "showWelcomeDialog", "loadUserReturnReward", "checkState", "checkSignIn", "showSignInDialog", "Lcom/yalla/yalla/model/UserReturnRewardModel;", "userReturnReward", "showUserReturnRewardDialog", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "", ShareConstants.WEB_DIALOG_PARAM_TITLE, "isSelected", "Lkotlin/Function0;", "onClick", "TabItem", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lo000oOoO/oOO00O;II)V", "onResume", "onStop", "Lcom/yalla/yalla/ui/vm/main/MainRoomVM;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lcom/yalla/yalla/ui/vm/main/MainRoomVM;", "vm", "Lcom/yalla/yalla/ui/vm/user/UserInfoVM;", "userVM$delegate", "getUserVM", "()Lcom/yalla/yalla/ui/vm/user/UserInfoVM;", "userVM", "isLoading", "Z", "Ljava/text/SimpleDateFormat;", "dateFormat", "Ljava/text/SimpleDateFormat;", "mLastShowDay", "Ljava/lang/String;", "mLastShowDayReturnReward", "", "titles", "Ljava/util/List;", "Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomBaseFragment;", "fragments", "isShowingDialog", "", "<set-?>", "currentSelectTab$delegate", "Lo000oOoO/o0O00OO;", "getCurrentSelectTab", "()I", "setCurrentSelectTab", "(I)V", "currentSelectTab", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MainRoomFragment extends p503o0o00o00.OooO<ya> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: currentSelectTab$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO currentSelectTab;

    @NotNull
    private SimpleDateFormat dateFormat;

    @NotNull
    private final List<MainRoomBaseFragment<?>> fragments;
    private boolean isLoading;
    private boolean isShowingDialog;

    @NotNull
    private String mLastShowDay;

    @NotNull
    private String mLastShowDayReturnReward;
    private List<String> titles;

    /* JADX INFO: renamed from: userVM$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy userVM;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm;

    public static final class OooO extends Lambda implements Function1<DialogInterface, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO f24371Oooo0o = new OooO();

        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DialogInterface dialogInterface) {
            DialogInterface it = dialogInterface;
            Intrinsics.checkNotNullParameter(it, "it");
            p498o0o00Oo0.OooOOO.f41216OooO00o.OooOOo0().postValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f24372Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Function0<Unit> function0) {
            super(0);
            this.f24372Oooo0o = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f24372Oooo0o.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f24373Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ String f24375Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f24376Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f24377OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f24378OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, boolean z, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.f24375Oooo0oO = str;
            this.f24376Oooo0oo = z;
            this.f24373Oooo = function0;
            this.f24378OoooO00 = i;
            this.f24377OoooO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            MainRoomFragment.this.TabItem(this.f24375Oooo0oO, this.f24376Oooo0oo, this.f24373Oooo, ooo00o, this.f24378OoooO00 | 1, this.f24377OoooO0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00000O f24379Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o00000O o00000o) {
            super(1);
            this.f24379Oooo0o = o00000o;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            this.f24379Oooo0o.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00000O f24380Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ MainRoomFragment f24381Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(o00000O o00000o, MainRoomFragment mainRoomFragment) {
            super(1);
            this.f24380Oooo0o = o00000o;
            this.f24381Oooo0oO = mainRoomFragment;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            this.f24380Oooo0o.f41544Oooo0oO.dismiss();
            TaskActivity.OooO00o oooO00o = TaskActivity.f22061o00Oo0;
            FragmentActivity fragmentActivityRequireActivity = this.f24381Oooo0oO.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "this@MainRoomFragment.requireActivity()");
            oooO00o.OooO00o(fragmentActivityRequireActivity);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<DialogInterface, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOO0 f24382Oooo0o = new OooOO0();

        public OooOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DialogInterface dialogInterface) {
            DialogInterface it = dialogInterface;
            Intrinsics.checkNotNullParameter(it, "it");
            p498o0o00Oo0.OooOOO.f41216OooO00o.OooOOo0().postValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<oOO00O, Integer, Unit> {
        public OooOO0O() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            oOO00O ooo00o2 = ooo00o;
            if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                p137o00OO0oo.OooOO0.f31650OooO00o.OooO00o(MainRoomFragment.this.getActivity(), ooo00o2, 72);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO implements ViewPager.OooOOO0 {
        public OooOOO() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageSelected(int i) {
            MainRoomFragment.this.setCurrentSelectTab(i);
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<oOO00O, Integer, Unit> {
        public OooOOO0() {
            super(2);
        }

        /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
        /* JADX WARN: Type inference failed for: r17v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
        /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
        /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            oOO00O composer = ooo00o;
            if ((num.intValue() & 11) == 2 && composer.OooOo0()) {
                composer.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                o00OOOO0 o00oooo0OooO0o0 = SizeKt.OooO0o0(oooO00o);
                MainRoomFragment mainRoomFragment = MainRoomFragment.this;
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
                ?? r1 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                oO00000o.OooO0O0(composer, oooO, r1);
                ?? r2 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                oO00000o.OooO0O0(composer, layoutDirection, r2);
                ?? r17 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r17, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-2137368960);
                o00OOOO0 o00oooo0OooO = PaddingKt.OooO(SizeKt.OooO0Oo(oooO00o), 48, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 40, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 10);
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
                ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r0, composer, oooO2, r1, composer, layoutDirection2, r2, composer, o00ooooo3, r17, composer, "composer", composer), composer, 0);
                mainRoomFragment.TabItem(p074o000O0oo.OooOOO.OooO00o(composer, 2058660585, -678309503, R.string.Mine, composer), mainRoomFragment.getCurrentSelectTab() == 0, new com.yalla.yalla.ui.fragment.mainroom.OooO00o(mainRoomFragment), composer, 4096, 0);
                mainRoomFragment.TabItem(o00000.OooO0OO.OooO00o(R.string.tab_recommend, composer), mainRoomFragment.getCurrentSelectTab() == 1, new com.yalla.yalla.ui.fragment.mainroom.OooO0O0(mainRoomFragment), composer, 4096, 0);
                mainRoomFragment.TabItem(o00000.OooO0OO.OooO00o(R.string.Popular, composer), mainRoomFragment.getCurrentSelectTab() == 2, new com.yalla.yalla.ui.fragment.mainroom.OooO0OO(mainRoomFragment), composer, 4096, 0);
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
                o000OO0O o000oo0oOooO00o = o00000.OooO0O0.OooO00o(R.drawable.icv_search, composer);
                long jOooOOoo = u.OooO0O0(composer).OooOOoo();
                o00OO0OO alignment2 = o00OO0O0.OooO00o.f4177OooO0oO;
                Intrinsics.checkNotNullParameter(oooO00o, "<this>");
                Intrinsics.checkNotNullParameter(alignment2, "alignment");
                p028Oooo0o0.o00O00O other = new p028Oooo0o0.o00O00O(alignment2, false);
                Intrinsics.checkNotNullParameter(other, "other");
                o0OOO0o.OooO00o(o000oo0oOooO00o, null, o000O0o.OooO0O0(SizeKt.OooOO0(PaddingKt.OooO(other, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 10, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 11), 24), false, false, new com.yalla.yalla.ui.fragment.mainroom.OooO0o(mainRoomFragment), new com.yalla.yalla.ui.fragment.mainroom.OooOO0(mainRoomFragment), 189), jOooOOoo, composer, 56, 0);
                o0O0OO0.OooO00o(composer);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOOOO f24386Oooo0o = new OooOOOO();

        public OooOOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            o0O00000.OooO0OO("Room_Debtreminder");
            Context context = setNoDoubleClickListener.getContext();
            if (context != null) {
                ArrearsDetailActivity.OooO00o oooO00o = ArrearsDetailActivity.f23194OooooOO;
                Intrinsics.checkNotNullParameter(context, "context");
                context.startActivity(new Intent(context, (Class<?>) ArrearsDetailActivity.class));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function1<View, Unit> {
        public OooOo() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            o0O00000.OooO0OO("Room_sign_in");
            MainRoomFragment.this.showSignInDialog();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<View, Unit> {
        public OooOo00() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            o0O00000.OooO0OO("Room_sign_in");
            MainRoomFragment.this.showSignInDialog();
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 implements o0Oo0OO0.OooOo00.OooO0O0 {
        public Oooo0() {
        }

        @Override // o0Oo0OO0.OooOo00.OooO0O0
        public final void onComplete(@NotNull p405o0Oo0OO0.OooOo videoItem) {
            Intrinsics.checkNotNullParameter(videoItem, "videoItem");
            MainRoomFragment.this.getBinding().f51008OooO0oO.setImageDrawable(new p405o0Oo0OO0.OooO(videoItem));
            MainRoomFragment.this.getBinding().f51008OooO0oO.OooO0OO();
        }

        @Override // o0Oo0OO0.OooOo00.OooO0O0
        public final void onError() {
        }
    }

    public static final class Oooo000 extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final Oooo000 f24390Oooo0o = new Oooo000();

        public Oooo000() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            p606o0oo0O.OooOo.OooO0O0("101050");
            com.yalla.yalla.ui.fragment.mainroom.OooOO0O onLogin = new com.yalla.yalla.ui.fragment.mainroom.OooOO0O(setNoDoubleClickListener);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = p254o00ooO0O.o00000O.f34254OooO00o.OooO0O0();
                if (activityOooO0O0 != null) {
                    LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
                    o00OO0O0.o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function1<DialogInterface, Unit> {
        public o000oOoO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DialogInterface dialogInterface) {
            DialogInterface it = dialogInterface;
            Intrinsics.checkNotNullParameter(it, "it");
            MainRoomFragment.this.isShowingDialog = false;
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function1<DialogInterface, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ UserReturnRewardModel f24392Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(UserReturnRewardModel userReturnRewardModel) {
            super(1);
            this.f24392Oooo0o = userReturnRewardModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DialogInterface dialogInterface) {
            DialogInterface it = dialogInterface;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f24392Oooo0o.setShowingLocal(false);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function1<DialogInterface, Unit> {
        public o0OoOo0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DialogInterface dialogInterface) {
            DialogInterface it = dialogInterface;
            Intrinsics.checkNotNullParameter(it, "it");
            MainRoomFragment.this.isShowingDialog = false;
            return Unit.INSTANCE;
        }
    }

    public MainRoomFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        this.vm = o0000O.OooO0O0(this, Reflection.getOrCreateKotlinClass(MainRoomVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o00OO0O.OooOO0.OooO00o(lazy, "owner.viewModelStore");
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Function0 f24399Oooo0o = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = this.f24399Oooo0o;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = o0000O.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment$special$$inlined$viewModels$default$5
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
        final Function0<Fragment> function1 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy2 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function1.invoke();
            }
        });
        this.userVM = o0000O.OooO0O0(this, Reflection.getOrCreateKotlinClass(UserInfoVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o00OO0O.OooOO0.OooO00o(lazy2, "owner.viewModelStore");
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment$special$$inlined$viewModels$default$9

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Function0 f24406Oooo0o = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function2 = this.f24406Oooo0o;
                if (function2 != null && (creationExtras = (CreationExtras) function2.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = o0000O.OooO00o(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment$special$$inlined$viewModels$default$10
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = o0000O.OooO00o(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        this.mLastShowDay = "";
        this.mLastShowDayReturnReward = "";
        this.fragments = new ArrayList();
        this.currentSelectTab = o0OOO00.OooO0Oo(1);
    }

    /* JADX INFO: renamed from: TabItem$lambda-14$lambda-12, reason: not valid java name */
    private static final float m443TabItem$lambda14$lambda12(oO0Oo<Float> oo0oo) {
        return oo0oo.getValue().floatValue();
    }

    /* JADX INFO: renamed from: TabItem$lambda-14$lambda-13, reason: not valid java name */
    private static final long m444TabItem$lambda14$lambda13(oO0Oo<o00000O0> oo0oo) {
        return oo0oo.getValue().f32070OooO00o;
    }

    private final void checkSignIn() {
        if (this.isLoading) {
            return;
        }
        this.isLoading = true;
        getVm().checkSignIn().observe(this, new p142o00OOooO.o00(this, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: checkSignIn$lambda-17, reason: not valid java name */
    public static final void m445checkSignIn$lambda17(MainRoomFragment this$0, Response response) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isLoading = false;
        if (!response.getIsSuccess()) {
            this$0.isLoading = false;
            ImageView imageView = this$0.getBinding().f51007OooO0o0;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivCheck");
            com.yalla.support.common.util.o00O0O.OooO00o(imageView);
            return;
        }
        String toDay = this$0.dateFormat.format(new Date());
        CheckSignInModel checkSignInModel = (CheckSignInModel) response.getData();
        if (checkSignInModel != null && checkSignInModel.getState() == 0) {
            Intrinsics.checkNotNullExpressionValue(toDay, "toDay");
            this$0.mLastShowDay = toDay;
            this$0.showSignInDialog();
            this$0.setCheckVisibility(false, true);
            SharedMainMessageManager.INSTANCE.isSignIn().postValue(Boolean.FALSE);
            return;
        }
        p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
        o00000OO o00000ooOooOOO0 = p497o0o00Oo.OooOOO0.OooOOO0();
        Intrinsics.checkNotNullExpressionValue(toDay, "toDay");
        o00000ooOooOOO0.OooOOOO(toDay);
        this$0.getVm().loadTaskListData();
        SharedMainMessageManager.INSTANCE.isSignIn().postValue(Boolean.TRUE);
    }

    private final void checkState() {
        if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.FALSE)) {
            return;
        }
        String today = this.dateFormat.format(new Date());
        if (Intrinsics.areEqual(this.mLastShowDay, today)) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(today, "today");
        this.mLastShowDay = today;
        p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
        if (!Intrinsics.areEqual(today, p497o0o00Oo.OooOOO0.OooOOO0().OooOO0O())) {
            checkSignIn();
        } else {
            getVm().loadTaskListData();
            SharedMainMessageManager.INSTANCE.isSignIn().postValue(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final int getCurrentSelectTab() {
        return ((Number) this.currentSelectTab.getValue()).intValue();
    }

    private final UserInfoVM getUserVM() {
        return (UserInfoVM) this.userVM.getValue();
    }

    private final MainRoomVM getVm() {
        return (MainRoomVM) this.vm.getValue();
    }

    private final void initObserver() {
        p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
        int i = 6;
        oooOOO.OooOooO().observe(getViewLifecycleOwner(), new o00O0000(this, i));
        Class cls = Integer.TYPE;
        LiveEventBus.get("MAIN_ROOM_PAGE", cls).observe(this, new o0000O0O(this, 4));
        LiveEventBus.get("DISMISS_CLOCK_ICON").observe(this, new o0000O0(this, i));
        LiveEventBus.get("SHOW_CLOCK_ANIMATION").observe(this, new o000OO(this, i));
        LiveEventBus.get("SHOW_CLOCK_ICON").observe(this, new o0000oo(this, i));
        int i2 = 7;
        ((MutableLiveData) p498o0o00Oo0.OooOOO.f41244OooOooO.getValue()).observe(this, new p501o0o00o.o0000O(this, i2));
        LiveEventBus.get("OPEN_MAIN_ACTIVITY_PAGE", cls).observe(this, new oo00oO(this, i));
        oooOOO.OooOOo0().observe(this, new o0000OO0(this, i2));
        oooOOO.OooOoOO().observe(this, new o00O0(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-0, reason: not valid java name */
    public static final void m446initObserver$lambda0(MainRoomFragment this$0, Boolean it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.booleanValue()) {
            this$0.resumeLeavePage();
        } else {
            this$0.getBinding().f51009OooO0oo.setCurrentItem(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-1, reason: not valid java name */
    public static final void m447initObserver$lambda1(MainRoomFragment this$0, Integer it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RtlViewPager rtlViewPager = this$0.getBinding().f51009OooO0oo;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        rtlViewPager.setCurrentItem(it.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-10, reason: not valid java name */
    public static final void m448initObserver$lambda10(MainRoomFragment this$0, UserReturnRewardModel userReturnRewardModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (userReturnRewardModel == null) {
            this$0.getBinding().f51006OooO0o.setImageDrawable(null);
            NetImageView netImageView = this$0.getBinding().f51006OooO0o;
            Intrinsics.checkNotNullExpressionValue(netImageView, "binding.ivUserReturnReward");
            com.yalla.support.common.util.o00O0O.OooO00o(netImageView);
            return;
        }
        if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
            if (userReturnRewardModel.defaultIsShowButton()) {
                NetImageView netImageView2 = this$0.getBinding().f51006OooO0o;
                Intrinsics.checkNotNullExpressionValue(netImageView2, "binding.ivUserReturnReward");
                com.yalla.support.common.util.o00O0O.OooO(netImageView2);
                oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this$0.getContext());
                oooO00o.f48429OooO0OO = p522o0o0O0o.o00O0.OooO0oO(userReturnRewardModel.getEntranceImgUrl());
                oooO00o.f48427OooO00o = 0;
                oooO00o.f48441OooOOOo = R.drawable.icon_picture_default;
                oooO00o.f48454OooOoo0 = 2;
                oooO00o.OooO0oO(28);
                oooO00o.f48432OooO0o0 = true;
                oooO00o.OooO0o(this$0.getBinding().f51006OooO0o);
            }
            this$0.showUserReturnRewardDialog(userReturnRewardModel);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-2, reason: not valid java name */
    public static final void m449initObserver$lambda2(MainRoomFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setCheckVisibility(false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-3, reason: not valid java name */
    public static final void m450initObserver$lambda3(MainRoomFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setCheckVisibility(false, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-4, reason: not valid java name */
    public static final void m451initObserver$lambda4(MainRoomFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setCheckVisibility(true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-5, reason: not valid java name */
    public static final void m452initObserver$lambda5(MainRoomFragment this$0, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!((Boolean) pair.getFirst()).booleanValue() || ((Number) pair.getSecond()).intValue() <= 0) {
            LinearLayoutCompat linearLayoutCompat = this$0.getBinding().f51005OooO0Oo.f49741OooO0O0;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "binding.ilArrears.llArrears");
            com.yalla.support.common.util.o00O0O.OooO00o(linearLayoutCompat);
        } else {
            this$0.getBinding().f51005OooO0Oo.f49742OooO0OO.setText(com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.main_arrears_amount_tip), p522o0o0O0o.o00O0.OooO0O0(String.valueOf(((Number) pair.getSecond()).intValue()))));
            LinearLayoutCompat linearLayoutCompat2 = this$0.getBinding().f51005OooO0Oo.f49741OooO0O0;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "binding.ilArrears.llArrears");
            com.yalla.support.common.util.o00O0O.OooO(linearLayoutCompat2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-6, reason: not valid java name */
    public static final void m453initObserver$lambda6(MainRoomFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (num == null) {
            return;
        }
        int iIntValue = num.intValue();
        if (iIntValue == MainPage.RecommendPage.getValue()) {
            this$0.getBinding().f51009OooO0oo.setCurrentItem(1);
        } else if (iIntValue == MainPage.PopularPage.getValue()) {
            this$0.getBinding().f51009OooO0oo.setCurrentItem(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-8, reason: not valid java name */
    public static final void m454initObserver$lambda8(MainRoomFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            Context context = this$0.getBinding().f51002OooO00o.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "binding.root.context");
            o00000O o00000o = new o00000O(context, 0);
            o00000o.OooO0o(false);
            i8 i8VarInflate = i8.inflate(this$0.getLayoutInflater(), o00000o.f41545Oooo0oo, true);
            Intrinsics.checkNotNullExpressionValue(i8VarInflate, "inflate(layoutInflater, getRootView(), true)");
            ImageView imageView = i8VarInflate.f49645OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivClose");
            com.yalla.support.common.util.o00O0O.OooO0Oo(imageView, new OooO0OO(o00000o));
            StateButton stateButton = i8VarInflate.f49644OooO0O0;
            Intrinsics.checkNotNullExpressionValue(stateButton, "binding.btConfirm");
            com.yalla.support.common.util.o00O0O.OooO0Oo(stateButton, new OooO0o(o00000o, this$0));
            o00000o.OooO00o(OooO.f24371Oooo0o);
            o00000o.OooO(OooOO0.f24382Oooo0o);
            o00000o.OooOO0();
        }
    }

    private final void initView() {
        getBinding().f51004OooO0OO.setContent(p043OooooO0.o00O0000.OooO0O0(1069639862, true, new OooOO0O()));
        getBinding().f51003OooO0O0.setContent(p043OooooO0.o00O0000.OooO0O0(-1744412499, true, new OooOOO0()));
        getBinding().f51009OooO0oo.OooO0O0(new OooOOO());
        LinearLayoutCompat linearLayoutCompat = getBinding().f51005OooO0Oo.f49741OooO0O0;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "binding.ilArrears.llArrears");
        com.yalla.support.common.util.o00O0O.OooO0Oo(linearLayoutCompat, OooOOOO.f24386Oooo0o);
        ImageView imageView = getBinding().f51007OooO0o0;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivCheck");
        com.yalla.support.common.util.o00O0O.OooO0Oo(imageView, new OooOo00());
        SVGAView sVGAView = getBinding().f51008OooO0oO;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.sivCheck");
        com.yalla.support.common.util.o00O0O.OooO0Oo(sVGAView, new OooOo());
        NetImageView netImageView = getBinding().f51006OooO0o;
        Intrinsics.checkNotNullExpressionValue(netImageView, "binding.ivUserReturnReward");
        com.yalla.support.common.util.o00O0O.OooO0Oo(netImageView, Oooo000.f24390Oooo0o);
        this.fragments.add(new MainRoomMineFragment());
        this.fragments.add(new MainRoomRecommendFragment());
        this.fragments.add(new MainRoomPopularFragment());
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        getBinding().f51009OooO0oo.setAdapter(new o0000O00(childFragmentManager, this.fragments));
        getBinding().f51009OooO0oo.setOffscreenPageLimit(2);
        this.titles = CollectionsKt.mutableListOf(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Mine), com.yalla.support.common.util.OooOOO.OooO0OO(R.string.tab_recommend), com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Popular));
    }

    private final void loadUserReturnReward() {
        String today = this.dateFormat.format(new Date());
        p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
        if (!Intrinsics.areEqual(oooOOO.OooOooO().getValue(), Boolean.TRUE) || Intrinsics.areEqual(this.mLastShowDayReturnReward, today)) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(today, "today");
        this.mLastShowDayReturnReward = today;
        if (oooOOO.OooOoOO().getValue() != null) {
            oooOOO.OooOoOO().postValue(null);
        } else {
            getUserVM().getUserReturnReward();
        }
    }

    private final void resumeLeavePage() {
        p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
        int iOooOO0o = p497o0o00Oo.OooOOO0.OooOOO0().OooOO0o();
        if (iOooOO0o == 0 || iOooOO0o == 1 || iOooOO0o == 2) {
            getBinding().f51009OooO0oo.setCurrentItem(0);
        } else if (iOooOO0o == 3) {
            getBinding().f51009OooO0oo.setCurrentItem(1);
        } else if (iOooOO0o == 4) {
            getBinding().f51009OooO0oo.setCurrentItem(2);
        }
        setCurrentSelectTab(getBinding().f51009OooO0oo.getCurrentItem());
    }

    private final void setCheckVisibility(boolean showIcon, boolean showIconAnim) {
        if (showIcon) {
            ImageView imageView = getBinding().f51007OooO0o0;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivCheck");
            com.yalla.support.common.util.o00O0O.OooO(imageView);
        } else {
            ImageView imageView2 = getBinding().f51007OooO0o0;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivCheck");
            com.yalla.support.common.util.o00O0O.OooO00o(imageView2);
        }
        if (!showIconAnim) {
            SVGAView sVGAView = getBinding().f51008OooO0oO;
            Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.sivCheck");
            com.yalla.support.common.util.o00O0O.OooO00o(sVGAView);
            return;
        }
        SVGAView sVGAView2 = getBinding().f51008OooO0oO;
        Intrinsics.checkNotNullExpressionValue(sVGAView2, "binding.sivCheck");
        com.yalla.support.common.util.o00O0O.OooO(sVGAView2);
        Context context = getContext();
        if (context == null) {
            return;
        }
        new p405o0Oo0OO0.OooOo00(context).OooO0oO("svga/anim_is_check.svga", new Oooo0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentSelectTab(int i) {
        this.currentSelectTab.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSignInDialog() {
        Context context;
        p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
        if (Intrinsics.areEqual(oooOOO.OooOOo0().getValue(), Boolean.TRUE)) {
            return;
        }
        boolean z = false;
        if (getActivity() == null) {
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null && activity.isFinishing()) {
            return;
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null && activity2.isDestroyed()) {
            z = true;
        }
        if (z) {
            return;
        }
        UserReturnRewardModel value = oooOOO.OooOoOO().getValue();
        if (p522o0o0O0o.oOO00O.OooO0OO(value != null ? Boolean.valueOf(value.getIsShowingLocal()) : null) || this.isShowingDialog || (context = getContext()) == null) {
            return;
        }
        ooOOO0Oo ooooo0oo = new ooOOO0Oo(context);
        ooooo0oo.OooO(new o000oOoO());
        ooooo0oo.OooO00o(new o0OoOo0());
        ooooo0oo.OooOO0();
        this.isShowingDialog = true;
    }

    private final void showUserReturnRewardDialog(UserReturnRewardModel userReturnReward) {
        FragmentActivity activity = getActivity();
        if (activity == null || activity.isFinishing() || activity.isDestroyed() || !userReturnReward.defaultIsShowDialog() || !userReturnReward.getDialogIsShow()) {
            return;
        }
        r1 r1Var = new r1(activity);
        r1Var.OooO00o(new o00O0O(userReturnReward));
        r1Var.f46262o000oOoO = userReturnReward;
        AutoImage autoImage = r1Var.OooOO0O().f49917OooO0O0;
        FragmentActivity fragmentActivity = r1Var.f46260OoooO;
        Objects.requireNonNull(autoImage);
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        autoImage.f24773Oooo = fragmentActivity;
        autoImage.f24779OoooO00 = R.drawable.icon_picture_default;
        autoImage.f24778OoooO0 = 16;
        autoImage.f24777OoooO = Boolean.TRUE;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        autoImage.f24780OoooO0O = scaleType;
        String data = p522o0o0O0o.o00O0.OooO0oO(userReturnReward.getDialogBgUrl());
        Intrinsics.checkNotNullParameter(data, "data");
        autoImage.f24775Oooo0oO = null;
        autoImage.f24776Oooo0oo = null;
        autoImage.removeAllViews();
        autoImage.f24774Oooo0o = data;
        if (autoImage.f24775Oooo0oO == null) {
            Context context = autoImage.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            autoImage.f24775Oooo0oO = new SVGAView(context, null, 0, 6, null);
        }
        SVGAView sVGAView = autoImage.f24775Oooo0oO;
        if (sVGAView != null) {
            sVGAView.setNotSvgaImageListener(new p601o0oo00Oo.o00oOoo(autoImage, sVGAView));
            sVGAView.f21010OooooO0 = autoImage.f24779OoooO00;
            sVGAView.OooO0oo(autoImage.f24774Oooo0o, autoImage.f24773Oooo);
            sVGAView.OooO();
            ImageView.ScaleType scaleType2 = autoImage.f24780OoooO0O;
            if (scaleType2 != null) {
                sVGAView.setScaleType(scaleType2);
            }
        }
        r1Var.OooOO0();
        userReturnReward.setShowingLocal(true);
        userReturnReward.setDialogIsShow(false);
    }

    private final void showWelcomeDialog() {
        Integer numValueOf;
        int i;
        Context context = getContext();
        if (context != null) {
            WelcomeDialog welcomeDialog = new WelcomeDialog((AppCompatActivity) context);
            String crystal = String.valueOf(p498o0o00Oo0.OooOOO.f41216OooO00o.OooO0o().getValue());
            Intrinsics.checkNotNullParameter(crystal, "crystal");
            String strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(o000O0O0.OooO0OO(R.string.welcome_reward), p016OooOoO0.OooOo00.OooO0Oo(" x", crystal));
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strOooO00o, "x", 0, false, 6, (Object) null);
            if (oo000o.OooO0o0()) {
                i = iIndexOf$default + 2;
                numValueOf = Integer.valueOf(i + 1);
            } else {
                numValueOf = Integer.valueOf(iIndexOf$default);
                i = iIndexOf$default - 1;
            }
            SpannableString spannableString = new SpannableString(strOooO00o);
            Drawable drawableOooO0O0 = o000O0O0.OooO0O0(R.drawable.icon_crystal_task_item_min);
            int minimumHeight = drawableOooO0O0.getMinimumHeight();
            drawableOooO0O0.setBounds(0, 0, minimumHeight + 1, minimumHeight + 4);
            spannableString.setSpan(new ImageSpan(drawableOooO0O0), i, numValueOf.intValue(), 17);
            TextView textView = welcomeDialog.f12168Oooo;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvWelcomeContent");
                textView = null;
            }
            textView.setText(spannableString);
            welcomeDialog.show();
            welcomeDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o0oOoo0.o00O00
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    MainRoomFragment.m455showWelcomeDialog$lambda16$lambda15(this.f46961Oooo0o, dialogInterface);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: showWelcomeDialog$lambda-16$lambda-15, reason: not valid java name */
    public static final void m455showWelcomeDialog$lambda16$lambda15(MainRoomFragment this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
        p497o0o00Oo.OooOOO0.OooO0o0().OooOoo0(false);
        this$0.loadUserReturnReward();
        this$0.checkState();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x007c  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:53:0x0108  */
    /* JADX WARN: Code duplicated, block: B:54:0x010c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0147  */
    /* JADX WARN: Code duplicated, block: B:58:0x014b  */
    /* JADX WARN: Code duplicated, block: B:61:0x015e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0161  */
    /* JADX WARN: Code duplicated, block: B:67:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v7, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void TabItem(@NotNull String title, boolean z, @NotNull Function0<Unit> onClick, @Nullable oOO00O ooo00o, int i, int i2) {
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
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        oOO00O composer = ooo00o.OooOOo(1716476500);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composer.Oooo0oo(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 112) == 0) {
                z2 = z;
                i3 |= composer.OooO0OO(z2) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                if (composer.Oooo0oo(onClick)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            i5 = i3;
            if ((i5 & 731) == 146 || !composer.OooOo0()) {
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
                o00OOOO0 o00oooo0OooO0oO = PaddingKt.OooO0oO(SizeKt.OooO0Oo(o000O0o.OooO0O0(oooO00o, false, false, null, (Function0) objOooO0o, 253)), 8, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
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
                oO0Oo oo0ooOooO0O0 = p023Oooo00O.o0OoOo0.OooO0O0(f, o00oO0o.OooO0Oo(ShopVehicleListModel.VehicleTagType_Vip300, 0, null, 6), composer, 48);
                p507o0o00oOO.o0000O0 o0000o1 = p507o0o00oOO.o0000O0.f41691OooO00o;
                if (z3) {
                    j = p507o0o00oOO.o0000O0.f41693OooO0OO;
                } else {
                    j = p507o0o00oOO.o0000O0.f41697OooO0oO;
                }
                oO0Oo oo0ooOooO00o = o000OO00.OooO00o(j, o00oO0o.OooO0Oo(ShopVehicleListModel.VehicleTagType_Vip300, 0, null, 6), composer, 48, 4);
                long jOooO0OO = o0000O0O.o00Oo0.OooO0OO(16);
                o00000oO.o0000O00.OooO00o oooO00o2 = p053o00000oO.o0000O00.f27125Oooo0oO;
                ooo00o2 = composer;
                p031OoooO.o000O0O0.OooO0OO(title, o0OO00O.OooO00o(m443TabItem$lambda14$lambda12(oo0ooOooO0O0)), m444TabItem$lambda14$lambda13(oo0ooOooO00o), jOooO0OO, null, p053o00000oO.o0000O00.f27130OoooO0O, null, 0L, null, null, 0L, 0, false, 0, null, null, ooo00o2, (i5 & 14) | 199680, 0, 65488);
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
            oo0oooOooOo.OooO00o(new OooO0O0(title, z4, onClick, i, i2));
        }
        i3 |= 48;
        z2 = z;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (composer.Oooo0oo(onClick)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        i5 = i3;
        if ((i5 & 731) == 146) {
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
            o00OOOO0 o00oooo0OooO0oO2 = PaddingKt.OooO0oO(SizeKt.OooO0Oo(o000O0o.OooO0O0(oooO00o3, false, false, null, (Function0) objOooO0o, 253)), 8, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
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
            oO0Oo oo0ooOooO0O1 = p023Oooo00O.o0OoOo0.OooO0O0(f, o00oO0o.OooO0Oo(ShopVehicleListModel.VehicleTagType_Vip300, 0, null, 6), composer, 48);
            p507o0o00oOO.o0000O0 o0000o2 = p507o0o00oOO.o0000O0.f41691OooO00o;
            if (z3) {
                j = p507o0o00oOO.o0000O0.f41693OooO0OO;
            } else {
                j = p507o0o00oOO.o0000O0.f41697OooO0oO;
            }
            oO0Oo oo0ooOooO00o2 = o000OO00.OooO00o(j, o00oO0o.OooO0Oo(ShopVehicleListModel.VehicleTagType_Vip300, 0, null, 6), composer, 48, 4);
            long jOooO0OO2 = o0000O0O.o00Oo0.OooO0OO(16);
            o00000oO.o0000O00.OooO00o oooO00o4 = p053o00000oO.o0000O00.f27125Oooo0oO;
            ooo00o2 = composer;
            p031OoooO.o000O0O0.OooO0OO(title, o0OO00O.OooO00o(m443TabItem$lambda14$lambda12(oo0ooOooO0O1)), m444TabItem$lambda14$lambda13(oo0ooOooO00o2), jOooO0OO2, null, p053o00000oO.o0000O00.f27130OoooO0O, null, 0L, null, null, 0L, 0, false, 0, null, null, ooo00o2, (i5 & 14) | 199680, 0, 65488);
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
            o00OOOO0 o00oooo0OooO0oO3 = PaddingKt.OooO0oO(SizeKt.OooO0Oo(o000O0o.OooO0O0(oooO00o5, false, false, null, (Function0) objOooO0o, 253)), 8, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
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
            oO0Oo oo0ooOooO0O2 = p023Oooo00O.o0OoOo0.OooO0O0(f, o00oO0o.OooO0Oo(ShopVehicleListModel.VehicleTagType_Vip300, 0, null, 6), composer, 48);
            p507o0o00oOO.o0000O0 o0000o3 = p507o0o00oOO.o0000O0.f41691OooO00o;
            if (z3) {
                j = p507o0o00oOO.o0000O0.f41693OooO0OO;
            } else {
                j = p507o0o00oOO.o0000O0.f41697OooO0oO;
            }
            oO0Oo oo0ooOooO00o3 = o000OO00.OooO00o(j, o00oO0o.OooO0Oo(ShopVehicleListModel.VehicleTagType_Vip300, 0, null, 6), composer, 48, 4);
            long jOooO0OO3 = o0000O0O.o00Oo0.OooO0OO(16);
            o00000oO.o0000O00.OooO00o oooO00o6 = p053o00000oO.o0000O00.f27125Oooo0oO;
            ooo00o2 = composer;
            p031OoooO.o000O0O0.OooO0OO(title, o0OO00O.OooO00o(m443TabItem$lambda14$lambda12(oo0ooOooO0O2)), m444TabItem$lambda14$lambda13(oo0ooOooO00o3), jOooO0OO3, null, p053o00000oO.o0000O00.f27130OoooO0O, null, 0L, null, null, 0L, 0, false, 0, null, null, ooo00o2, (i5 & 14) | 199680, 0, 65488);
            o0O0OO0.OooO00o(ooo00o2);
            z4 = z3;
        }
        oo0oooOooOo = ooo00o2.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0O0(title, z4, onClick, i, i2));
    }

    @Override // p462o0Ooo0o.o0000
    public void onLazyInit() {
        super.onLazyInit();
        this.dateFormat.setTimeZone(TimeZone.getTimeZone("GMT+02"));
        initView();
        initObserver();
    }

    @Override // p503o0o00o00.OooO, p462o0Ooo0o.o0000, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
        p499o0o00OoO.o0OO00O o0oo00oOooO0o0 = p497o0o00Oo.OooOOO0.OooO0o0();
        StringBuilder sbOooO00o = p142o00OOooO.o000OO00.OooO00o(o0oo00oOooO0o0, "welcome");
        sbOooO00o.append(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue());
        if (o0oo00oOooO0o0.OooO00o(sbOooO00o.toString(), false)) {
            showWelcomeDialog();
        } else {
            loadUserReturnReward();
            checkState();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (!Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE) || this.fragments.size() <= 0) {
            return;
        }
        int currentItem = getBinding().f51009OooO0oo.getCurrentItem();
        if (currentItem == 0) {
            this.fragments.get(getBinding().f51009OooO0oo.getCurrentItem()).saveLeavePage();
            return;
        }
        if (currentItem == 1) {
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p497o0o00Oo.OooOOO0.OooOOO0().OooOOOo(3);
        } else {
            if (currentItem != 2) {
                return;
            }
            p497o0o00Oo.OooOOO0 oooOOO1 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p497o0o00Oo.OooOOO0.OooOOO0().OooOOOo(4);
        }
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public ya getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ya yaVarInflate = ya.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(yaVarInflate, "inflate(inflater, container, false)");
        return yaVarInflate;
    }
}
