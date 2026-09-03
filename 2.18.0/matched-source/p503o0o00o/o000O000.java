package p503o0o00o;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.OooO0O0;
import androidx.viewpager2.widget.ViewPager2;
import com.app.base.framework.view.marqueeText.MarqueeText;
import com.app.base.framework.view.textView.ViewLocation;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.common.ui.dialog.giftDialog.GiftBlindWebManager;
import com.yalla.yalla.common.ui.dialog.giftDialog.GiftCustomMadeWebManager;
import com.yalla.yalla.common.ui.fragment.GiftSendFragment;
import com.yalla.yalla.common.ui.view.GiftView;
import com.yalla.yalla.common.ui.view.PremiumLevel;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.model.DialogLinkManage;
import com.yalla.yalla.model.GiftPropModel;
import com.yalla.yalla.model.GiftPropSubDetailsModel;
import com.yalla.yalla.model.GiftPropTypeShow;
import com.yalla.yalla.model.GiftPropTypeUser;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import com.yalla.yalla.ui.view.GiftBlindTipsView;
import com.yalla.yalla.ui.view.GiftNumberView;
import com.yalla.yalla.ui.view.GiftTypeNotUpTipsView;
import com.yalla.yalla.ui.view.GiftWeekStarTipsView;
import com.yalla.yalla.util.netimage.NetImageView;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00OOooO.o00;
import p143o00OOooO.o000O;
import p143o00OOooO.o000OO0O;
import p143o00OOooO.o00O0000;
import p153o00Oo0o0.o00Oo00;
import p169o00Ooo0.o0O0O00;
import p169o00Ooo0.oo000o;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o000OO00;
import p255o00ooO0O.o00O000;
import p255o00ooO0O.o00O000o;
import p255o00ooO0O.o00oOoo;
import p256o00ooO0o.o00O00OO;
import p393o0OOooOo.o0O00000;
import p503o0o00o.o00000;
import p503o0o00o.o00000O0;
import p503o0o00o.o000O000;
import p522o0o0O0O0.o00Ooo;
import p524o0o0O0o.o000;
import p524o0o0O0o.o0000O0;
import p524o0o0O0o.o0000O0O;
import p524o0o0O0o.o000O0Oo;
import p524o0o0O0o.o000O0o;
import p524o0o0O0o.o000Oo0;
import p524o0o0O0o.o00O;
import p524o0o0O0o.o00O0;
import p524o0o0O0o.o00O00O;
import p524o0o0O0o.oOO00O;
import p524o0o0O0o.oo0o0O0;
import p532o0o0OOO.o00OO000;
import p532o0o0OOO.o00OO0O0;
import p608o0oo0O.OooOo;
import p618o0oo0Ooo.oO0O000o;
import p651o0ooOOoo.ch;
import p651o0ooOOoo.v7;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o000O000 extends o00O00OO<o000O000> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final GiftPropTypeShow f41453OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f41454OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final o00OO0O0.OooO00o f41455OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final o00O000o f41456OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f41457OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public Function1<? super WebPageInfo, Unit> f41458OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public GiftSendFragment f41459OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public Function1<? super WebPageInfo, Unit> f41460OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f41461OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final Lazy f41462OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final Lazy f41463OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final Lazy f41464OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public RoomUserInfoModel f41465OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public o00000 f41466OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public GiftView f41467OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f41468OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public GiftPropModel f41469OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public RoomUserInfoModel f41470OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f41471OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public List<Integer> f41472OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @Nullable
    public PopupWindow f41473OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public Job f41474OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public final Lazy f41475OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @NotNull
    public final List<GiftPropModel> f41476OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f41477OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @NotNull
    public final Lazy f41478Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @Nullable
    public GiftPropModel f41479Oooo00O;

    public static final class OooO extends Lambda implements Function0<ViewGroup> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewGroup invoke() {
            return o000O000.this.f34223OooO0OO;
        }
    }

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GiftPropTypeShow.values().length];
            iArr[GiftPropTypeShow.InRoom.ordinal()] = 1;
            iArr[GiftPropTypeShow.InChat.ordinal()] = 2;
            iArr[GiftPropTypeShow.InMomentDetail.ordinal()] = 3;
            iArr[GiftPropTypeShow.InMomentList.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<AnimatorSet> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AnimatorSet invoke() {
            SVGAView imageView = o000O000.this.OooOo00().f50769OooO;
            Intrinsics.checkNotNullExpressionValue(imageView, "mBinding.giftEffectImage");
            GiftNumberView countView = o000O000.this.OooOo00().f50776OooO0oO;
            Intrinsics.checkNotNullExpressionValue(countView, "mBinding.giftCount");
            o000O0o o000o0o2 = new o000O0o(o000O000.this);
            o000Oo0 o000oo1 = new o000Oo0(o000O000.this);
            o000O00 o000o01 = new o000O00(o000O000.this);
            o000O00O o000o00o2 = o000O00O.f41494Oooo;
            Intrinsics.checkNotNullParameter(imageView, "imageView");
            Intrinsics.checkNotNullParameter(countView, "countView");
            o0000O0O o0000o0o2 = new o0000O0O(o000o0o2);
            o000 o000Var = new o000(countView, o000o0o2, o000oo1, o000o01);
            p524o0o0O0o.o000O000 o000o001 = new p524o0o0O0o.o000O000(o000o01);
            o000O0o o000o0o3 = new o000O0o(o000o00o2);
            Intrinsics.checkNotNullParameter(imageView, "<this>");
            float fOooO0O0 = o000OO00.OooO0O0(o000O0Oo.f43004OooO00o);
            float fOooO0O1 = o000OO00.OooO0O0(o000O0Oo.f43005OooO0O0);
            float f = 2;
            float[] values = {50 + fOooO0O0, fOooO0O0 / f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE};
            Intrinsics.checkNotNullParameter(imageView, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "TranslationX", Arrays.copyOf(values, 3));
            Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "ofFloat(this, \"TranslationX\", *values)");
            ObjectAnimator objectAnimatorOooO00o = o000Oo0.OooO00o(imageView, 380 + fOooO0O1, fOooO0O1 / f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            float[] values2 = {0.25f, 1.5f, 1.0f};
            Intrinsics.checkNotNullParameter(imageView, "<this>");
            Intrinsics.checkNotNullParameter(values2, "values");
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView, "scaleY", Arrays.copyOf(values2, 3));
            Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat2, "ofFloat(this, \"scaleY\", *values)");
            float[] values3 = {0.25f, 1.5f, 1.0f};
            Intrinsics.checkNotNullParameter(imageView, "<this>");
            Intrinsics.checkNotNullParameter(values3, "values");
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(imageView, "scaleX", Arrays.copyOf(values3, 3));
            Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat3, "ofFloat(this, \"scaleX\", *values)");
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOooO00o, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
            animatorSet.setDuration(500L);
            animatorSet.addListener(new o0000O0(o0000o0o2, o000Var, o000o001, o000o0o3));
            return animatorSet;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<GiftBlindWebManager> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final GiftBlindWebManager invoke() {
            o000O000 o000o001 = o000O000.this;
            FragmentActivity fragmentActivity = o000o001.f41454OooO0oO;
            FrameLayout frameLayout = o000o001.OooOo00().f50789OooOo0;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "mBinding.overrideGiftContainer");
            return new GiftBlindWebManager(fragmentActivity, frameLayout);
        }
    }

    public static final class OooO0o extends Lambda implements Function0<o00000O0> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00000O0 invoke() {
            o000O000 o000o001 = o000O000.this;
            return new o00000O0(o000o001.f34221OooO00o, o000o001.f41455OooO0oo, o000o001.f41453OooO);
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<GiftCustomMadeWebManager> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final GiftCustomMadeWebManager invoke() {
            o000O000 o000o001 = o000O000.this;
            FragmentActivity fragmentActivity = o000o001.f41454OooO0oO;
            FrameLayout frameLayout = o000o001.OooOo00().f50789OooOo0;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "mBinding.overrideGiftContainer");
            GiftCustomMadeWebManager giftCustomMadeWebManager = new GiftCustomMadeWebManager(fragmentActivity, frameLayout);
            giftCustomMadeWebManager.f20911OooO = new o00OO00O(o000O000.this);
            return giftCustomMadeWebManager;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<ch> {
        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ch invoke() {
            ch chVarOooO00o = ch.OooO00o(View.inflate(o000O000.this.f34221OooO00o, R.layout.room_popupwindow_setting, null));
            Intrinsics.checkNotNullExpressionValue(chVarOooO00o, "bind(FrameLayout.inflate…pupwindow_setting, null))");
            return chVarOooO00o;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.ui.dialog.giftDialog.GiftSendDialog$showIntroducingTagGiftWindow$2", f = "GiftSendDialog.kt", i = {}, l = {1041, 1042}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f41486Oooo;

        @DebugMetadata(c = "com.yalla.yalla.common.ui.dialog.giftDialog.GiftSendDialog$showIntroducingTagGiftWindow$2$1", f = "GiftSendDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ o000O000 f41488Oooo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(o000O000 o000o001, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f41488Oooo = o000o001;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f41488Oooo, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                PopupWindow popupWindow = this.f41488Oooo.f41473OooOoOO;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                }
                return Unit.INSTANCE;
            }
        }

        public OooOOO(Continuation<? super OooOOO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return o000O000.this.new OooOOO(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f41486Oooo;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            this.f41486Oooo = 1;
            if (DelayKt.delay(3000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            OooO00o oooO00o = new OooO00o(o000O000.this, null);
            this.f41486Oooo = 2;
            if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends PopupWindow {
        public OooOOO0(LinearLayout linearLayout) {
            super((View) linearLayout, -2, -2, true);
        }

        @Override // android.widget.PopupWindow
        public final void dismiss() {
            super.dismiss();
            o000O000 o000o001 = o000O000.this;
            o000o001.f41473OooOoOO = null;
            Job job = o000o001.f41474OooOoo;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
        }
    }

    public static final class OooOOOO extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ GiftSendFragment f41490Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o000O000 f41491OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(GiftSendFragment giftSendFragment, o000O000 o000o001) {
            super(1);
            this.f41490Oooo = giftSendFragment;
            this.f41491OoooO00 = o000o001;
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00ff  */
        /* JADX WARN: Code duplicated, block: B:50:0x0140  */
        /* JADX WARN: Code duplicated, block: B:52:0x014d  */
        /* JADX WARN: Code duplicated, block: B:53:0x0159  */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            GiftPropModel giftPropModel;
            boolean zBooleanValue = bool.booleanValue();
            int pageType = this.f41490Oooo.getPageType();
            if (pageType == GiftPropTypeUser.Member.getValue()) {
                if (o00OO0O0.f43338OooooOo.OooO00o().OooOOO() || !zBooleanValue) {
                    o000O000 o000o001 = this.f41491OoooO00;
                    o000O000.OooOOOo(o000o001, o000o001.OooOo00().f50780OooOO0o);
                } else {
                    o000O000 o000o002 = this.f41491OoooO00;
                    o000O000.OooOOOo(o000o002, o000o002.OooOo00().f50779OooOO0O);
                }
            } else if (pageType == GiftPropTypeUser.Premium.getValue()) {
                Pair<Boolean, Integer> value = p500o0o00Oo0.OooOOO.f41235OooO00o.OooOOO0().getValue();
                if (value != null) {
                    o000O000 o000o003 = this.f41491OoooO00;
                    boolean zBooleanValue2 = value.getFirst().booleanValue();
                    PremiumLevel premiumLevelOooO00o = PremiumLevel.INSTANCE.OooO00o(value.getSecond());
                    if ((!zBooleanValue2 || premiumLevelOooO00o.getValue() <= 0) && zBooleanValue) {
                        o000O000.OooOOOo(o000o003, o000o003.OooOo00().f50779OooOO0O);
                    } else {
                        o000O000.OooOOOo(o000o003, o000o003.OooOo00().f50780OooOO0o);
                    }
                }
                if (this.f41491OoooO00.f41453OooO == GiftPropTypeShow.InRoom) {
                    o0O00000.OooO0OO("InRoom_gift_Nobility");
                }
            } else if (pageType == GiftPropTypeUser.Vip.getValue()) {
                Pair<Integer, Integer> value2 = p500o0o00Oo0.OooOOO.f41235OooO00o.OooO().getValue();
                if (oOO00O.OooO0Oo(value2 != null ? value2.getSecond() : null, 0) > 0 || !zBooleanValue) {
                    o000O000 o000o004 = this.f41491OoooO00;
                    o000O000.OooOOOo(o000o004, o000o004.OooOo00().f50780OooOO0o);
                } else {
                    o000O000 o000o005 = this.f41491OoooO00;
                    o000O000.OooOOOo(o000o005, o000o005.OooOo00().f50779OooOO0O);
                }
                if (this.f41491OoooO00.f41453OooO == GiftPropTypeShow.InRoom) {
                    o0O00000.OooO0OO("InRoom_gift_VIP");
                }
            } else if (pageType != GiftPropTypeUser.National.getValue()) {
                GiftPropModel giftPropModel2 = this.f41491OoooO00.f41469OooOo0O;
                if (giftPropModel2 != null) {
                    Intrinsics.checkNotNull(giftPropModel2);
                    if (giftPropModel2.getSubPropDetails() != null) {
                        GiftPropModel giftPropModel3 = this.f41491OoooO00.f41469OooOo0O;
                        Intrinsics.checkNotNull(giftPropModel3);
                        GiftPropSubDetailsModel subPropDetails = giftPropModel3.getSubPropDetails();
                        Intrinsics.checkNotNull(subPropDetails);
                        if (!subPropDetails.getSubProps().isEmpty()) {
                            o000O000 o000o006 = this.f41491OoooO00;
                            o000O000.OooOOOo(o000o006, o000o006.OooOo00().f50771OooO0O0);
                        } else {
                            giftPropModel = this.f41491OoooO00.f41469OooOo0O;
                            Intrinsics.checkNotNull(giftPropModel);
                            if (giftPropModel.isCustomMade()) {
                                o000O000 o000o007 = this.f41491OoooO00;
                                o000O000.OooOOOo(o000o007, o000o007.OooOo00().f50777OooO0oo);
                            } else {
                                o000O000 o000o008 = this.f41491OoooO00;
                                o000O000.OooOOOo(o000o008, o000o008.OooOo00().f50780OooOO0o);
                            }
                        }
                    } else {
                        giftPropModel = this.f41491OoooO00.f41469OooOo0O;
                        Intrinsics.checkNotNull(giftPropModel);
                        if (giftPropModel.isCustomMade()) {
                            o000O000 o000o009 = this.f41491OoooO00;
                            o000O000.OooOOOo(o000o009, o000o009.OooOo00().f50777OooO0oo);
                        } else {
                            o000O000 o000o0010 = this.f41491OoooO00;
                            o000O000.OooOOOo(o000o0010, o000o0010.OooOo00().f50780OooOO0o);
                        }
                    }
                }
            } else if (zBooleanValue) {
                o000O000 o000o0011 = this.f41491OoooO00;
                if (o000o0011.f41453OooO == GiftPropTypeShow.InRoom) {
                    o000O000.OooOOOo(o000o0011, o000o0011.OooOo00().f50779OooOO0O);
                } else {
                    o000O000 o000o0012 = this.f41491OoooO00;
                    o000O000.OooOOOo(o000o0012, o000o0012.OooOo00().f50780OooOO0o);
                }
            } else {
                o000O000 o000o0013 = this.f41491OoooO00;
                o000O000.OooOOOo(o000o0013, o000o0013.OooOo00().f50780OooOO0o);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.ui.dialog.giftDialog.GiftSendDialog$updateUserUI$1$1", f = "GiftSendDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOo00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f41492Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o000O000 f41493OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(RoomUserInfoModel roomUserInfoModel, o000O000 o000o001, Continuation<? super OooOo00> continuation) {
            super(2, continuation);
            this.f41492Oooo = roomUserInfoModel;
            this.f41493OoooO00 = o000o001;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOo00(this.f41492Oooo, this.f41493OoooO00, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOo00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            String userName = this.f41492Oooo.getUserName();
            if (this.f41492Oooo.getUserId() > 0) {
                userName = o00Ooo.f42780OooO00o.OooO0O0(this.f41492Oooo.getUserId(), userName);
            }
            this.f41493OoooO00.OooOo00().f50794OooOoO0.setText(userName);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O000(@NotNull FragmentActivity currentActivity, @NotNull o00OO0O0.OooO00o theme, @NotNull GiftPropTypeShow showIn) {
        super(currentActivity);
        Intrinsics.checkNotNullParameter(currentActivity, "currentActivity");
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(showIn, "showIn");
        this.f41454OooO0oO = currentActivity;
        this.f41455OooO0oo = theme;
        this.f41453OooO = showIn;
        this.f41456OooOO0 = new o00O000o(Reflection.getOrCreateKotlinClass(v7.class), this.f34221OooO00o, new OooO());
        this.f41462OooOOOo = LazyKt.lazy(new OooO0o());
        this.f41464OooOOo0 = LazyKt.lazy(new OooOO0());
        this.f41463OooOOo = LazyKt.lazy(new OooO0OO());
        Window windowOooO0o0 = OooO0o0();
        if (windowOooO0o0 != null) {
            windowOooO0o0.setWindowAnimations(R.style.anim_bottom_top_bottom);
        }
        OooO();
        ConstraintLayout constraintLayout = OooOo00().f50770OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "mBinding.root");
        int i = o000O0Oo.f43004OooO00o;
        o00O000 o00o001 = o00O000.f34368OooO00o;
        Object systemService = o00O000.OooO00o().getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Point point = new Point();
        ((WindowManager) systemService).getDefaultDisplay().getSize(point);
        o00O.OooO00o(constraintLayout, point.y);
        o00000O0.OooO00o oooO00o = o00000O0.f41431OooO0o0;
        this.f41465OooOOoo = o00000O0.f41430OooO0o;
        int i2 = 1;
        this.f41468OooOo00 = 1;
        oo0O.OooO0OO oooO0OO = oo0O.OooO0OO.f53343OooO00o;
        int i3 = 0;
        oooO0OO.OooO0Oo(false);
        ConstraintLayout constraintLayout2 = OooOo00().f50770OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "mBinding.root");
        OooO0oo(constraintLayout2);
        int i4 = OooO00o.$EnumSwitchMapping$0[showIn.ordinal()];
        if (i4 == 1) {
            ImageView imageView = OooOo00().f50795OooOoOO;
            Intrinsics.checkNotNullExpressionValue(imageView, "mBinding.userUp");
            p255o00ooO0O.oOO00O.OooO(imageView);
            ImageView imageView2 = OooOo00().f50783OooOOOO;
            Intrinsics.checkNotNullExpressionValue(imageView2, "mBinding.ivAllRoom");
            p255o00ooO0O.oOO00O.OooO(imageView2);
            View view = OooOo00().f50797OooOoo0;
            Intrinsics.checkNotNullExpressionValue(view, "mBinding.vLine");
            p255o00ooO0O.oOO00O.OooO(view);
            ConstraintLayout constraintLayout3 = OooOo00().f50785OooOOo;
            Intrinsics.checkNotNullExpressionValue(constraintLayout3, "mBinding.layoutSendGiftEffect");
            p255o00ooO0O.oOO00O.OooO00o(constraintLayout3);
        } else if (i4 == 2) {
            ImageView imageView3 = OooOo00().f50795OooOoOO;
            Intrinsics.checkNotNullExpressionValue(imageView3, "mBinding.userUp");
            p255o00ooO0O.oOO00O.OooO00o(imageView3);
            ImageView imageView4 = OooOo00().f50783OooOOOO;
            Intrinsics.checkNotNullExpressionValue(imageView4, "mBinding.ivAllRoom");
            p255o00ooO0O.oOO00O.OooO00o(imageView4);
            View view2 = OooOo00().f50797OooOoo0;
            Intrinsics.checkNotNullExpressionValue(view2, "mBinding.vLine");
            p255o00ooO0O.oOO00O.OooO00o(view2);
            ConstraintLayout constraintLayout4 = OooOo00().f50785OooOOo;
            Intrinsics.checkNotNullExpressionValue(constraintLayout4, "mBinding.layoutSendGiftEffect");
            p255o00ooO0O.oOO00O.OooO00o(constraintLayout4);
        } else if (i4 == 3 || i4 == 4) {
            ImageView imageView5 = OooOo00().f50795OooOoOO;
            Intrinsics.checkNotNullExpressionValue(imageView5, "mBinding.userUp");
            p255o00ooO0O.oOO00O.OooO00o(imageView5);
            ImageView imageView6 = OooOo00().f50783OooOOOO;
            Intrinsics.checkNotNullExpressionValue(imageView6, "mBinding.ivAllRoom");
            p255o00ooO0O.oOO00O.OooO00o(imageView6);
            View view3 = OooOo00().f50797OooOoo0;
            Intrinsics.checkNotNullExpressionValue(view3, "mBinding.vLine");
            p255o00ooO0O.oOO00O.OooO00o(view3);
            ConstraintLayout constraintLayout5 = OooOo00().f50785OooOOo;
            Intrinsics.checkNotNullExpressionValue(constraintLayout5, "mBinding.layoutSendGiftEffect");
            p255o00ooO0O.oOO00O.OooO0O0(constraintLayout5);
        }
        OooOo00().f50771OooO0O0.setGiftBlindListener(new o000OO00(this));
        OooOo00().f50771OooO0O0.setBlindDetailListener(new o00O0(this));
        OooOo00().f50777OooO0oo.setShowCustomMadeGiftListener(new o00O0O00(this));
        OooOo00().f50789OooOo0.setOnClickListener(new p144o00OOooo.oOO00O(this, 2));
        OooOo00().f50779OooOO0O.setViewListener(new o00O0O0(this));
        FrameLayout frameLayout = OooOo00().f50787OooOOoo;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "mBinding.layoutTop");
        p255o00ooO0O.oOO00O.OooO0oO(frameLayout, new o00O0O0O(this));
        ImageView imageView7 = OooOo00().f50783OooOOOO;
        Intrinsics.checkNotNullExpressionValue(imageView7, "mBinding.ivAllRoom");
        p255o00ooO0O.oOO00O.OooO0oO(imageView7, new o00O0OO0(this));
        LinearLayout linearLayout = OooOo00().f50790OooOo00;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "mBinding.layoutUser");
        p255o00ooO0O.oOO00O.OooO0oO(linearLayout, new o00O0OOO(this));
        TextView textView = OooOo00().f50778OooOO0;
        Intrinsics.checkNotNullExpressionValue(textView, "mBinding.giftNum");
        p255o00ooO0O.oOO00O.OooO0oO(textView, new o00OO000(this));
        TextView textView2 = OooOo00().f50793OooOoO;
        Intrinsics.checkNotNullExpressionValue(textView2, "mBinding.tvSend");
        p255o00ooO0O.oOO00O.OooO0oO(textView2, new o0O0ooO(this));
        GiftWeekStarTipsView giftWeekStarTipsView = OooOo00().f50780OooOO0o;
        Intrinsics.checkNotNullExpressionValue(giftWeekStarTipsView, "mBinding.giftWeekStarTipsView");
        p255o00ooO0O.oOO00O.OooO0oO(giftWeekStarTipsView, new o00oOoo(this));
        GiftBlindTipsView giftBlindTipsView = OooOo00().f50771OooO0O0;
        Intrinsics.checkNotNullExpressionValue(giftBlindTipsView, "mBinding.blindTipsView");
        p255o00ooO0O.oOO00O.OooO0oO(giftBlindTipsView, new o00O000(this));
        OooOo00().f50780OooOO0o.setRootClickListener(new o00O000o(this));
        TextView textView3 = OooOo00().f50772OooO0OO;
        Intrinsics.checkNotNullExpressionValue(textView3, "mBinding.coin");
        p255o00ooO0O.oOO00O.OooO0oO(textView3, new o00O00(this));
        TextView textView4 = OooOo00().f50791OooOo0O;
        Intrinsics.checkNotNullExpressionValue(textView4, "mBinding.recharge");
        p255o00ooO0O.oOO00O.OooO0oO(textView4, new o00O00O(this));
        ImageView imageView8 = OooOo00().f50774OooO0o;
        Intrinsics.checkNotNullExpressionValue(imageView8, "mBinding.firstChargeReward");
        p255o00ooO0O.oOO00O.OooO0oO(imageView8, new oOO00O(this));
        p499o0o00Oo.OooOOO0 oooOOO0 = p499o0o00Oo.OooOOO0.f41199OooO00o;
        if (p499o0o00Oo.OooOOO0.OooO00o().OooOO0O() == 0) {
            ImageView imageView9 = OooOo00().f50774OooO0o;
            Intrinsics.checkNotNullExpressionValue(imageView9, "mBinding.firstChargeReward");
            p255o00ooO0O.oOO00O.OooO00o(imageView9);
        } else {
            ImageView imageView10 = OooOo00().f50774OooO0o;
            Intrinsics.checkNotNullExpressionValue(imageView10, "mBinding.firstChargeReward");
            p255o00ooO0O.oOO00O.OooO(imageView10);
        }
        LinearLayout linearLayout2 = OooOo00().f50781OooOOO;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "mBinding.hintFirstSelectTotalGift");
        p255o00ooO0O.oOO00O.OooO0oO(linearLayout2, new o00O00OO(this));
        LinearLayout linearLayout3 = OooOo00().f50782OooOOO0;
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "mBinding.hintFirstSelectAllUser");
        p255o00ooO0O.oOO00O.OooO0oO(linearLayout3, new o00O00o0(this));
        ImageView imageView11 = OooOo00().f50792OooOo0o;
        Intrinsics.checkNotNullExpressionValue(imageView11, "mBinding.sendCustomGiftWarn");
        p255o00ooO0O.oOO00O.OooO0oO(imageView11, new oo00o(this));
        OooOooO(this.f41465OooOOoo);
        this.f41466OooOo = new o00000(currentActivity);
        this.f41472OooOoO0 = new ArrayList();
        oooO0OO.OooO0o0(currentActivity, new o000O(this, i2));
        ViewPager2 viewPager2 = OooOo00().f50796OooOoo;
        o00000 o00000Var = this.f41466OooOo;
        if (o00000Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o00000Var = null;
        }
        viewPager2.setAdapter(o00000Var);
        DialogLinkManage dialogLinkManage = DialogLinkManage.INSTANCE;
        dialogLinkManage.getJoinRoomDialogFromGiftSendDialogLink().observe(currentActivity, new o000OO0O(this));
        dialogLinkManage.getQuickRechargeDialogFromGiftSendDialog().observe(currentActivity, new o000O0O0(this));
        dialogLinkManage.getReceiveCrystalDialogFromGiftSendDialog().observe(currentActivity, new o000O(this));
        this.f34222OooO0O0.f34227Oooo.addObserver(new DefaultLifecycleObserver() { // from class: com.yalla.yalla.common.ui.dialog.giftDialog.GiftSendDialog$initObserve$4

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            @NotNull
            public final OooO00o f20923Oooo;

            public static final class OooO00o extends ViewPager2.OnPageChangeCallback {

                /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
                public final /* synthetic */ o000O000 f20925OooO00o;

                public OooO00o(o000O000 o000o001) {
                    this.f20925OooO00o = o000o001;
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.common.ui.fragment.GiftSendFragment>] */
                /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.common.ui.fragment.GiftSendFragment>] */
                /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.common.ui.fragment.GiftSendFragment>] */
                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public final void onPageSelected(int i) {
                    super.onPageSelected(i);
                    o00000 o00000Var = this.f20925OooO00o.f41466OooOo;
                    o00000 o00000Var2 = null;
                    if (o00000Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        o00000Var = null;
                    }
                    if (!o00000Var.f41414OooO00o.isEmpty()) {
                        o00000 o00000Var3 = this.f20925OooO00o.f41466OooOo;
                        if (o00000Var3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adapter");
                            o00000Var3 = null;
                        }
                        if (o00000Var3.f41414OooO00o.size() > i) {
                            o000O000 o000o001 = this.f20925OooO00o;
                            o00000 o00000Var4 = o000o001.f41466OooOo;
                            if (o00000Var4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                            } else {
                                o00000Var2 = o00000Var4;
                            }
                            o000o001.f41459OooOOO = (GiftSendFragment) o00000Var2.f41414OooO00o.get(i);
                            this.f20925OooO00o.OooOoo();
                        }
                    }
                }
            }

            {
                this.f20923Oooo = new OooO00o(this.f20924OoooO00);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final void onCreate(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                OooO0O0.OooO00o(this, owner);
                this.f20924OoooO00.OooOo00().f50796OooOoo.registerOnPageChangeCallback(this.f20923Oooo);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final void onDestroy(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                OooO0O0.OooO0O0(this, owner);
                this.f20924OoooO00.OooOo00().f50796OooOoo.unregisterOnPageChangeCallback(this.f20923Oooo);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                OooO0O0.OooO0OO(this, lifecycleOwner);
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.common.ui.fragment.GiftSendFragment>] */
            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final void onResume(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                OooO0O0.OooO0Oo(this, owner);
                if (this.f20924OoooO00.f41453OooO == GiftPropTypeShow.InRoom) {
                    o00OO000.OooOO0 oooOO1 = o00OO000.OooOO0.f43272OooO00o;
                    if (o00OO000.OooOO0.f43275OooO0Oo.size() > 1) {
                        RoomUserInfoModel roomUserInfoModel = this.f20924OoooO00.f41465OooOOoo;
                        o00000O0.OooO00o oooO00o2 = o00000O0.f41431OooO0o0;
                        if (Intrinsics.areEqual(roomUserInfoModel, o00000O0.f41430OooO0o)) {
                            this.f20924OoooO00.OooOooO(o00000O0.f41433OooO0oo);
                        }
                    } else {
                        o000O000 o000o001 = this.f20924OoooO00;
                        o00000O0.OooO00o oooO00o3 = o00000O0.f41431OooO0o0;
                        o000o001.OooOooO(o00000O0.f41430OooO0o);
                    }
                }
                o000O000 o000o002 = this.f20924OoooO00;
                o000o002.OooOoo0(o000o002.f41468OooOo00);
                o000O000 o000o003 = this.f20924OoooO00;
                if (!o000o003.f41471OooOoO) {
                    o00000 o00000Var2 = o000o003.f41466OooOo;
                    List<Integer> list = null;
                    if (o00000Var2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        o00000Var2 = null;
                    }
                    if (!o00000Var2.f41414OooO00o.isEmpty()) {
                        GiftPropModel giftPropModel = o000o003.f41469OooOo0O;
                        int i5 = 0;
                        if (giftPropModel == null) {
                            o000o003.OooOo(0, null);
                        } else {
                            List<Integer> list2 = o000o003.f41472OooOoO0;
                            if (list2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("giftTypeUserList");
                            } else {
                                list = list2;
                            }
                            int i6 = 0;
                            for (Object obj : list) {
                                int i7 = i6 + 1;
                                if (i6 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                if (giftPropModel.getTypeUser() == ((Number) obj).intValue()) {
                                    i5 = i6;
                                }
                                i6 = i7;
                            }
                            o000o003.OooOo(i5, Integer.valueOf(giftPropModel.getGiftId()));
                        }
                    }
                    o000o003.f41471OooOoO = true;
                }
                o000O000 o000o004 = this.f20924OoooO00;
                o0o00o.o00OO0O0.OooO00o oooO00o4 = o000o004.f41455OooO0oo;
                ConstraintLayout constraintLayout6 = o000o004.OooOo00().f50786OooOOo0;
                Objects.requireNonNull(oooO00o4);
                constraintLayout6.setBackground(OooOOO.OooO0O0(R.drawable.shape_bg_dialog_gift_send_bottom_black));
                o000o004.OooOo00().f50773OooO0Oo.setBackgroundColor(o000O0O0.OooO00o(R.color.color_white_8));
                o000o004.OooOo00().f50794OooOoO0.setTextColor(o000O0O0.OooO00o(R.color.color_white));
                o000o004.OooOo00().f50778OooOO0.setTextColor(o000O0O0.OooO00o(R.color.color_white));
                GiftView giftView = this.f20924OoooO00.f41467OooOo0;
                if (giftView != null) {
                    giftView.setSelectedGift(true);
                }
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                OooO0O0.OooO0o0(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                OooO0O0.OooO0o(this, lifecycleOwner);
            }
        });
        LiveEventBus.get("GiftSendDialogSelectGift", GiftView.class).observe(currentActivity, new o000OO0O(this, i2));
        LiveEventBus.get("ShowIntroducingTagGiftWindow", GiftView.class).observe(currentActivity, new p143o00OOooO.o000O0O0(this, i2));
        LiveEventBus.get("OnLongClickShowIntroducingTagGiftWindow", GiftView.class).observe(currentActivity, new o00(this, i2));
        LiveEventBus.get("DismissIntroducingTagGiftWindow", Boolean.TYPE).observe(currentActivity, new o00O0000(this, i2));
        p500o0o00Oo0.OooOOO oooOOO = p500o0o00Oo0.OooOOO.f41235OooO00o;
        oooOOO.OooO0OO().observe(currentActivity, new o000OO(this, i3));
        oooOOO.OooO0o().observe(currentActivity, new o0000O0O(this, i3));
        o00OO0O0.f43338OooooOo.OooO00o().f43354OooOOOO.observe(currentActivity, new o0000O(this, i3));
        oooOOO.OooOOO0().observe(currentActivity, new o0000O0(this, i3));
        oooOOO.OooO().observe(currentActivity, new o0000OO0(this, i3));
        final o000O0Oo o000o0oo2 = new o000O0Oo(this);
        this.f34222OooO0O0.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: o00oo0oO.o0000O
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i5, KeyEvent event) {
                Function3 function3 = o000o0oo2;
                o000O000 this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (function3 == null) {
                    return false;
                }
                Integer numValueOf = Integer.valueOf(i5);
                Intrinsics.checkNotNullExpressionValue(event, "event");
                return ((Boolean) function3.invoke(this$0, numValueOf, event)).booleanValue();
            }
        });
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of com.code.android.easydialog.EasyDialog");
        this.f41475OooOoo0 = LazyKt.lazy(new OooOO0O());
        this.f41476OooOooO = new ArrayList();
        this.f41478Oooo000 = LazyKt.lazy(new OooO0O0());
    }

    public static final GiftCustomMadeWebManager OooOOO(o000O000 o000o001) {
        return (GiftCustomMadeWebManager) o000o001.f41464OooOOo0.getValue();
    }

    public static final void OooOOOO(o000O000 o000o001) {
        Objects.requireNonNull(o000o001);
        p499o0o00Oo.OooOOO0 oooOOO0 = p499o0o00Oo.OooOOO0.f41199OooO00o;
        p499o0o00Oo.OooOOO0.OooO0Oo().OooOO0o();
        ConstraintLayout constraintLayout = o000o001.OooOo00().f50775OooO0o0;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "mBinding.customGiftWarnContainer");
        p255o00ooO0O.oOO00O.OooO00o(constraintLayout);
    }

    public static final void OooOOOo(o000O000 o000o001, View view) {
        Objects.requireNonNull(o000o001);
        if (view == null || p255o00ooO0O.oOO00O.OooO0Oo(view)) {
            return;
        }
        int id = view.getId();
        int childCount = o000o001.OooOo00().f50787OooOOoo.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View view2 = o000o001.OooOo00().f50787OooOOoo.getChildAt(i);
            if (view2.getId() == id) {
                Intrinsics.checkNotNullExpressionValue(view2, "view");
                p255o00ooO0O.oOO00O.OooO(view2);
            } else {
                Intrinsics.checkNotNullExpressionValue(view2, "view");
                p255o00ooO0O.oOO00O.OooO00o(view2);
            }
        }
    }

    public static final void OooOOo0(o000O000 o000o001) {
        Objects.requireNonNull(o000o001);
        WalletActivity.OooO00o oooO00o = WalletActivity.f23287ooOO;
        Context context = o000o001.f34221OooO00o;
        GiftPropModel giftPropModel = o000o001.f41469OooOo0O;
        oooO00o.OooO00o(context, !oOO00O.OooO0OO(giftPropModel != null ? Boolean.valueOf(giftPropModel.isCoin()) : null));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.GiftPropModel>] */
    @Override // p251o00oo0oO.o000O000
    public final void OooO0o() {
        OooOoOO(true);
        this.f41476OooOooO.clear();
        this.f41477OooOooo = false;
        this.f41471OooOoO = false;
    }

    @Override // p251o00oo0oO.o000O000
    public final void OooOOO0() {
        GiftSendFragment giftSendFragment;
        if (oo0O.OooO0OO.f53343OooO00o.OooO0OO()) {
            o00oOoo.OooO00o(R.string.network_failed);
            return;
        }
        super.OooOOO0();
        OooOoOO(false);
        OooOOo();
        if (this.f41453OooO != GiftPropTypeShow.InRoom || (giftSendFragment = this.f41459OooOOO) == null) {
            return;
        }
        OooOo.OooO0OO("202020", MapsKt.mapOf(new Pair("roomeventid", Integer.valueOf(giftSendFragment.getPageType())), new Pair("page", Integer.valueOf(giftSendFragment.getPageIndex() + 1))));
    }

    public final void OooOOo() {
        LinearLayout linearLayout = OooOo00().f50782OooOOO0;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "mBinding.hintFirstSelectAllUser");
        if (!p255o00ooO0O.oOO00O.OooO0Oo(linearLayout)) {
            LinearLayout linearLayout2 = OooOo00().f50781OooOOO;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "mBinding.hintFirstSelectTotalGift");
            if (!p255o00ooO0O.oOO00O.OooO0Oo(linearLayout2)) {
                return;
            }
        }
        LinearLayout linearLayout3 = OooOo00().f50782OooOOO0;
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "mBinding.hintFirstSelectAllUser");
        p255o00ooO0O.oOO00O.OooO00o(linearLayout3);
        LinearLayout linearLayout4 = OooOo00().f50781OooOOO;
        Intrinsics.checkNotNullExpressionValue(linearLayout4, "mBinding.hintFirstSelectTotalGift");
        p255o00ooO0O.oOO00O.OooO00o(linearLayout4);
    }

    public final void OooOOoo() {
        Job job;
        PopupWindow popupWindow;
        PopupWindow popupWindow2 = this.f41473OooOoOO;
        boolean z = false;
        if ((popupWindow2 != null && popupWindow2.isShowing()) && (popupWindow = this.f41473OooOoOO) != null) {
            popupWindow.dismiss();
        }
        Job job2 = this.f41474OooOoo;
        if (job2 != null && job2.isActive()) {
            z = true;
        }
        if (!z || (job = this.f41474OooOoo) == null) {
            return;
        }
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
    }

    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.common.ui.fragment.GiftSendFragment>] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.common.ui.fragment.GiftSendFragment>] */
    public final void OooOo(int i, Integer num) {
        this.f41461OooOOOO = i;
        o00000 o00000Var = this.f41466OooOo;
        if (o00000Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o00000Var = null;
        }
        if (o00000Var.f41414OooO00o.size() > this.f41461OooOOOO) {
            OooOo00().f50796OooOoo.setCurrentItem(this.f41461OooOOOO);
            o00000 o00000Var2 = this.f41466OooOo;
            if (o00000Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                o00000Var2 = null;
            }
            this.f41459OooOOO = (GiftSendFragment) o00000Var2.f41414OooO00o.get(this.f41461OooOOOO);
        }
        if (num == null) {
            GiftSendFragment giftSendFragment = this.f41459OooOOO;
            if (giftSendFragment != null) {
                GiftSendFragment.initGiftId$default(giftSendFragment, 0, 1, null);
                return;
            }
            return;
        }
        GiftSendFragment giftSendFragment2 = this.f41459OooOOO;
        if (giftSendFragment2 != null) {
            giftSendFragment2.setGiftId(num.intValue());
        }
    }

    public final ch OooOo0() {
        return (ch) this.f41475OooOoo0.getValue();
    }

    public final v7 OooOo00() {
        return (v7) this.f41456OooOO0.getValue();
    }

    public final void OooOo0O(GiftPropModel giftPropModel) {
        String string;
        if (this.f41477OooOooo) {
            return;
        }
        this.f41479Oooo00O = giftPropModel;
        ConstraintLayout constraintLayout = OooOo00().f50785OooOOo;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "mBinding.layoutSendGiftEffect");
        p255o00ooO0O.oOO00O.OooO(constraintLayout);
        if (giftPropModel.isBlind() && o00O0.OooO0o0(giftPropModel.getLocalSendResultImageUrl())) {
            String localSendResultImageUrl = giftPropModel.getLocalSendResultImageUrl();
            string = o00O0.OooO0oO(localSendResultImageUrl != null ? StringsKt.trim((CharSequence) localSendResultImageUrl).toString() : null);
        } else {
            string = StringsKt.trim((CharSequence) giftPropModel.getImageUrl()).toString();
        }
        SVGAView sVGAView = OooOo00().f50769OooO;
        sVGAView.f21029OooooOo = R.drawable.icon_gift_default_gray;
        sVGAView.OooO0oo(string, null);
        OooOo00().f50776OooO0oO.setNumber(giftPropModel.getLocalCount());
        ((AnimatorSet) this.f41478Oooo000.getValue()).start();
    }

    public final void OooOo0o() {
        GiftPropModel giftPropModel = this.f41469OooOo0O;
        if (oOO00O.OooO0OO(giftPropModel != null ? Boolean.valueOf(giftPropModel.isCoin()) : null)) {
            TextView textView = OooOo00().f50772OooO0OO;
            Intrinsics.checkNotNullExpressionValue(textView, "mBinding.coin");
            oo0o0O0.OooO0oo(textView, com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.icon_coin_main_slide));
            OooOo00().f50772OooO0OO.setText(o0O0O00.OooO0Oo(String.valueOf(p500o0o00Oo0.OooOOO.f41235OooO00o.OooO0OO().getValue())));
            OooOo00().f50772OooO0OO.setTextColor(o000O0O0.OooO00o(R.color.color_FAE976));
            OooOo00().f50791OooOo0O.setText(o000O0O0.OooO0OO(R.string.Recharge_));
            OooOo00().f50791OooOo0O.setTextColor(o000O0O0.OooO00o(R.color.color_FAE976));
            return;
        }
        TextView textView2 = OooOo00().f50772OooO0OO;
        Intrinsics.checkNotNullExpressionValue(textView2, "mBinding.coin");
        oo0o0O0.OooO0oo(textView2, com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.icon_crystal_main_slide));
        OooOo00().f50772OooO0OO.setText(o0O0O00.OooO0Oo(String.valueOf(p500o0o00Oo0.OooOOO.f41235OooO00o.OooO0o().getValue())));
        OooOo00().f50772OooO0OO.setTextColor(o000O0O0.OooO00o(R.color.color_crystal));
        OooOo00().f50791OooOo0O.setText(o000O0O0.OooO0OO(R.string.Store_Crystak_Earn_Cystals));
        OooOo00().f50791OooOo0O.setTextColor(o000O0O0.OooO00o(R.color.color_crystal));
    }

    public final void OooOoO(View view, GiftPropModel giftPropModel) {
        PopupWindow popupWindow;
        if (view == null || giftPropModel == null || (popupWindow = this.f41473OooOoOO) != null) {
            return;
        }
        boolean z = true;
        if (popupWindow != null && popupWindow.isShowing()) {
            return;
        }
        if (giftPropModel.getIsDyEffect()) {
            OooOo0().f49134OooO0O0.setBackgroundResource(R.drawable.ic_gift_tag_dy_effect);
            OooOo0().f49137OooO0o0.setText(o000O0O0.OooO0OO(R.string.room_gift_popup_title_activity_gift));
            OooOo0().f49136OooO0Oo.setText(com.yalla.support.common.util.OooOo.OooO00o(o000O0O0.OooO0OO(R.string.room_gift_popup_content_dyeffect), String.valueOf(giftPropModel.getDyEffectLimitNumber())));
        } else if (giftPropModel.getIsWeek()) {
            o0O00000.OooO0Oo("InRoom_gift_explain", 1);
            OooOo0().f49134OooO0O0.setBackgroundResource(R.drawable.ic_gift_tag_week);
            OooOo0().f49137OooO0o0.setText(o000O0O0.OooO0OO(R.string.room_gift_popup_title_week_gift));
            OooOo0().f49136OooO0Oo.setText(o000O0O0.OooO0OO(R.string.room_gift_popup_content_week_gift));
        } else if (giftPropModel.getIsLuck()) {
            o0O00000.OooO0Oo("InRoom_gift_explain", 1);
            OooOo0().f49134OooO0O0.setBackgroundResource(R.drawable.ic_gift_tag_luck);
            OooOo0().f49137OooO0o0.setText(o000O0O0.OooO0OO(R.string.room_gift_popup_title_luck_gift));
            OooOo0().f49136OooO0Oo.setText(o000O0O0.OooO0OO(R.string.room_gift_popup_content_luck_gift));
        } else if (giftPropModel.isAllSiteGift()) {
            o0O00000.OooO0Oo("InRoom_gift_explain", 3);
            OooOo0().f49134OooO0O0.setBackgroundResource(R.drawable.ic_gift_tag_diamond);
            OooOo0().f49137OooO0o0.setText(o000O0O0.OooO0OO(R.string.room_gift_popup_title_full_site_gift));
            OooOo0().f49136OooO0Oo.setText(o000O0O0.OooO0OO(R.string.room_gift_popup_content_full_site_gift));
        } else if (giftPropModel.getIsSoundEffect()) {
            OooOo0().f49134OooO0O0.setBackgroundResource(R.drawable.ic_gift_tag_sound_effect);
            OooOo0().f49137OooO0o0.setText(o000O0O0.OooO0OO(R.string.gift_sound_gifts_title));
            OooOo0().f49136OooO0Oo.setText(o000O0O0.OooO0OO(R.string.gift_sound_gifts_content));
        } else if (giftPropModel.isBlind()) {
            OooOo0().f49134OooO0O0.setBackgroundResource(R.drawable.ic_gift_tag_blind);
            OooOo0().f49137OooO0o0.setText(o000O0O0.OooO0OO(R.string.room_gift_popup_title_blind_gift));
            OooOo0().f49136OooO0Oo.setText(o000O0O0.OooO0OO(R.string.room_gift_popup_content_blind_gift));
        } else if (giftPropModel.isCustomMade()) {
            OooOo0().f49134OooO0O0.setBackgroundResource(R.mipmap.ic_gift_tag_custom_made);
            OooOo0().f49137OooO0o0.setText(o000O0O0.OooO0OO(R.string.room_gift_popup_title_custom_made_gift_title));
            OooOo0().f49136OooO0Oo.setText(o000O0O0.OooO0OO(R.string.room_gift_popup_title_custom_made_gift_content));
        } else if (giftPropModel.getIsHot()) {
            o0O00000.OooO0Oo("InRoom_gift_explain", 4);
            OooOo0().f49134OooO0O0.setBackgroundResource(R.drawable.ic_gift_tag_activity);
            OooOo0().f49137OooO0o0.setText(o000O0O0.OooO0OO(R.string.room_gift_popup_title_activity_gift));
            OooOo0().f49136OooO0Oo.setText(o000O0O0.OooO0OO(R.string.room_gift_popup_content_activity_gift));
        } else {
            OooOo0().f49134OooO0O0.setBackgroundResource(0);
            OooOo0().f49137OooO0o0.setText((CharSequence) null);
            OooOo0().f49136OooO0Oo.setText((CharSequence) null);
            z = false;
        }
        if (z) {
            OooOo.OooO0O0("302005");
            OooOOO0 oooOOO0 = new OooOOO0(OooOo0().f49133OooO00o);
            this.f41473OooOoOO = oooOOO0;
            oooOOO0.setTouchable(false);
            OooOo0().f49133OooO00o.measure(0, 0);
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            ViewGroup.LayoutParams layoutParams = OooOo0().f49135OooO0OO.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            int measuredWidth = (OooOo0().f49133OooO00o.getMeasuredWidth() - view.getWidth()) / 2;
            int i = iArr[0];
            if (i == 0) {
                layoutParams2.setMarginStart(oo000o.OooO0o0() ? (OooOo0().f49133OooO00o.getMeasuredWidth() - view.getWidth()) / 2 : (view.getWidth() - OooOo0().f49133OooO00o.getMeasuredWidth()) / 2);
            } else if (i == o000O0Oo.f43004OooO00o - view.getWidth()) {
                layoutParams2.setMarginStart(oo000o.OooO0o0() ? (view.getWidth() - OooOo0().f49133OooO00o.getMeasuredWidth()) / 2 : (OooOo0().f49133OooO00o.getMeasuredWidth() - view.getWidth()) / 2);
            } else {
                layoutParams2.setMarginStart(0);
            }
            OooOo0().f49135OooO0OO.setLayoutParams(layoutParams2);
            PopupWindow popupWindow2 = this.f41473OooOoOO;
            if (popupWindow2 != null) {
                popupWindow2.showAsDropDown(view, (view.getWidth() - OooOo0().f49133OooO00o.getMeasuredWidth()) / 2, (-view.getHeight()) - OooOo0().f49133OooO00o.getMeasuredHeight(), oo000o.OooO0o0() ? 8388613 : 8388611);
            }
            this.f41474OooOoo = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getDefault(), null, new OooOOO(null), 2, null);
        }
    }

    public final void OooOoO0(@NotNull RoomUserInfoModel user) {
        Intrinsics.checkNotNullParameter(user, "user");
        OooOooO(user);
    }

    public final void OooOoOO(boolean z) {
        if (z) {
            ConstraintLayout constraintLayout = OooOo00().f50770OooO00o;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "mBinding.root");
            p255o00ooO0O.oOO00O.OooO00o(constraintLayout);
        } else {
            ConstraintLayout constraintLayout2 = OooOo00().f50770OooO00o;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "mBinding.root");
            p255o00ooO0O.oOO00O.OooO(constraintLayout2);
        }
    }

    public final void OooOoo() {
        GiftSendFragment giftSendFragment = this.f41459OooOOO;
        if (giftSendFragment != null) {
            GiftTypeNotUpTipsView giftTypeNotUpTipsView = OooOo00().f50779OooOO0O;
            int pageType = giftSendFragment.getPageType();
            OooOOOO oooOOOO = new OooOOOO(giftSendFragment, this);
            giftTypeNotUpTipsView.type = pageType;
            NetImageView netImageView = giftTypeNotUpTipsView.f24834Oooo.f50925OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(netImageView, "binding.ivFg");
            p255o00ooO0O.oOO00O.OooO00o(netImageView);
            NetImageView netImageView2 = giftTypeNotUpTipsView.f24834Oooo.f50927OooO0o0;
            Intrinsics.checkNotNullExpressionValue(netImageView2, "binding.ivNational");
            p255o00ooO0O.oOO00O.OooO00o(netImageView2);
            ImageView imageView = giftTypeNotUpTipsView.f24834Oooo.f50926OooO0o;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivType");
            p255o00ooO0O.oOO00O.OooO00o(imageView);
            MarqueeText marqueeText = giftTypeNotUpTipsView.f24834Oooo.f50928OooO0oO;
            Intrinsics.checkNotNullExpressionValue(marqueeText, "binding.tvInfo");
            p255o00ooO0O.oOO00O.OooO00o(marqueeText);
            giftTypeNotUpTipsView.f24834Oooo.f50928OooO0oO.setTextColor(o000O0O0.OooO00o(R.color.white));
            giftTypeNotUpTipsView.f24834Oooo.f50928OooO0oO.setText("");
            ImageView imageView2 = giftTypeNotUpTipsView.f24834Oooo.f50923OooO0O0;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivArrow");
            p255o00ooO0O.oOO00O.OooO00o(imageView2);
            if (pageType == GiftPropTypeUser.Vip.getValue()) {
                NetImageView netImageView3 = giftTypeNotUpTipsView.f24834Oooo.f50925OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(netImageView3, "binding.ivFg");
                p255o00ooO0O.oOO00O.OooO(netImageView3);
                ImageView imageView3 = giftTypeNotUpTipsView.f24834Oooo.f50926OooO0o;
                Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivType");
                p255o00ooO0O.oOO00O.OooO(imageView3);
                MarqueeText marqueeText2 = giftTypeNotUpTipsView.f24834Oooo.f50928OooO0oO;
                Intrinsics.checkNotNullExpressionValue(marqueeText2, "binding.tvInfo");
                p255o00ooO0O.oOO00O.OooO(marqueeText2);
                ImageView imageView4 = giftTypeNotUpTipsView.f24834Oooo.f50923OooO0O0;
                Intrinsics.checkNotNullExpressionValue(imageView4, "binding.ivArrow");
                p255o00ooO0O.oOO00O.OooO(imageView4);
                giftTypeNotUpTipsView.f24834Oooo.f50924OooO0OO.setImageResource(R.drawable.gift_type_tips_bg_vip);
                giftTypeNotUpTipsView.f24834Oooo.f50926OooO0o.setImageResource(R.mipmap.ic_gift_type_not_up_vip);
                giftTypeNotUpTipsView.f24834Oooo.f50928OooO0oO.setTextColor(o000O0O0.OooO00o(R.color.white));
                giftTypeNotUpTipsView.f24834Oooo.f50928OooO0oO.setText(o000O0O0.OooO0OO(R.string.gift_type_not_up_tips_vip));
                giftTypeNotUpTipsView.f24834Oooo.f50923OooO0O0.setImageResource(R.mipmap.ic_gift_type_not_up_arrow_vip);
                oooOOOO.invoke(Boolean.TRUE);
                return;
            }
            if (pageType == GiftPropTypeUser.Member.getValue()) {
                ImageView imageView5 = giftTypeNotUpTipsView.f24834Oooo.f50926OooO0o;
                Intrinsics.checkNotNullExpressionValue(imageView5, "binding.ivType");
                p255o00ooO0O.oOO00O.OooO(imageView5);
                MarqueeText marqueeText3 = giftTypeNotUpTipsView.f24834Oooo.f50928OooO0oO;
                Intrinsics.checkNotNullExpressionValue(marqueeText3, "binding.tvInfo");
                p255o00ooO0O.oOO00O.OooO(marqueeText3);
                ImageView imageView6 = giftTypeNotUpTipsView.f24834Oooo.f50923OooO0O0;
                Intrinsics.checkNotNullExpressionValue(imageView6, "binding.ivArrow");
                p255o00ooO0O.oOO00O.OooO(imageView6);
                giftTypeNotUpTipsView.f24834Oooo.f50924OooO0OO.setImageResource(R.drawable.gift_type_tips_bg_member);
                giftTypeNotUpTipsView.f24834Oooo.f50926OooO0o.setImageResource(R.mipmap.ic_gift_type_not_up_member);
                giftTypeNotUpTipsView.f24834Oooo.f50928OooO0oO.setTextColor(o000O0O0.OooO00o(R.color.white));
                giftTypeNotUpTipsView.f24834Oooo.f50928OooO0oO.setText(o000O0O0.OooO0OO(R.string.gift_type_not_up_tips_member));
                giftTypeNotUpTipsView.f24834Oooo.f50923OooO0O0.setImageResource(R.mipmap.ic_gift_type_not_up_arrow_member);
                oooOOOO.invoke(Boolean.TRUE);
                return;
            }
            if (pageType != GiftPropTypeUser.Premium.getValue()) {
                if (pageType != GiftPropTypeUser.National.getValue()) {
                    oooOOOO.invoke(Boolean.FALSE);
                    return;
                }
                NetImageView netImageView4 = giftTypeNotUpTipsView.f24834Oooo.f50927OooO0o0;
                Intrinsics.checkNotNullExpressionValue(netImageView4, "binding.ivNational");
                p255o00ooO0O.oOO00O.OooO(netImageView4);
                giftTypeNotUpTipsView.f24834Oooo.f50927OooO0o0.setImageResource(R.drawable.gift_type_tips_bg_national);
                MarqueeText marqueeText4 = giftTypeNotUpTipsView.f24834Oooo.f50928OooO0oO;
                Intrinsics.checkNotNullExpressionValue(marqueeText4, "binding.tvInfo");
                p255o00ooO0O.oOO00O.OooO(marqueeText4);
                giftTypeNotUpTipsView.f24834Oooo.f50924OooO0OO.setImageDrawable(null);
                giftTypeNotUpTipsView.f24834Oooo.f50928OooO0oO.setTextColor(o000O0O0.OooO00o(R.color.white_65));
                giftTypeNotUpTipsView.f24834Oooo.f50928OooO0oO.setText(o000O0O0.OooO0OO(R.string.gift_type_not_up_tips_national));
                oooOOOO.invoke(Boolean.TRUE);
                return;
            }
            ImageView imageView7 = giftTypeNotUpTipsView.f24834Oooo.f50926OooO0o;
            Intrinsics.checkNotNullExpressionValue(imageView7, "binding.ivType");
            p255o00ooO0O.oOO00O.OooO(imageView7);
            MarqueeText marqueeText5 = giftTypeNotUpTipsView.f24834Oooo.f50928OooO0oO;
            Intrinsics.checkNotNullExpressionValue(marqueeText5, "binding.tvInfo");
            p255o00ooO0O.oOO00O.OooO(marqueeText5);
            ImageView imageView8 = giftTypeNotUpTipsView.f24834Oooo.f50923OooO0O0;
            Intrinsics.checkNotNullExpressionValue(imageView8, "binding.ivArrow");
            p255o00ooO0O.oOO00O.OooO(imageView8);
            giftTypeNotUpTipsView.f24834Oooo.f50924OooO0OO.setImageResource(R.drawable.gift_type_tips_bg_premium);
            giftTypeNotUpTipsView.f24834Oooo.f50926OooO0o.setImageResource(R.mipmap.ic_gift_type_not_up_premium);
            giftTypeNotUpTipsView.f24834Oooo.f50928OooO0oO.setTextColor(o000O0O0.OooO00o(R.color.white));
            giftTypeNotUpTipsView.f24834Oooo.f50928OooO0oO.setText(o000O0O0.OooO0OO(R.string.gift_type_not_up_tips_premium));
            giftTypeNotUpTipsView.f24834Oooo.f50923OooO0O0.setImageResource(R.mipmap.ic_gift_type_not_up_arrow_premium);
            oooOOOO.invoke(Boolean.TRUE);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    public final void OooOoo0(int i) {
        this.f41468OooOo00 = i;
        OooOo00().f50778OooOO0.setText(String.valueOf(this.f41468OooOo00));
        Objects.requireNonNull(this.f41455OooO0oo);
        Drawable drawableOooO0O0 = com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.icon_room_gift_top_white);
        int i2 = OooO00o.$EnumSwitchMapping$0[this.f41453OooO.ordinal()];
        boolean z = false;
        if (i2 == 1) {
            RoomUserInfoModel roomUserInfoModel = this.f41465OooOOoo;
            o00000O0.OooO00o oooO00o = o00000O0.f41431OooO0o0;
            if (Intrinsics.areEqual(roomUserInfoModel, o00000O0.f41433OooO0oo) || Intrinsics.areEqual(this.f41465OooOOoo, o00000O0.f41432OooO0oO)) {
                GiftPropModel giftPropModel = this.f41469OooOo0O;
                if (giftPropModel != null && giftPropModel.isBlind()) {
                    z = true;
                }
                if (z) {
                    drawableOooO0O0 = null;
                }
            }
        } else if (i2 == 3 || i2 == 4) {
            GiftPropModel giftPropModel2 = this.f41469OooOo0O;
            if (giftPropModel2 != null && giftPropModel2.isBlind()) {
                z = true;
            }
            if (z) {
                drawableOooO0O0 = null;
            }
        }
        o00Oo00.OooO00o(OooOo00().f50778OooOO0, drawableOooO0O0, ViewLocation.end, oo000o.OooO0o0());
    }

    public final void OooOooO(RoomUserInfoModel roomUserInfoModel) {
        Long value = p500o0o00Oo0.OooOOO.f41235OooO00o.OooOo().getValue();
        long userId = roomUserInfoModel.getUserId();
        if (value == null || value.longValue() != userId) {
            this.f41465OooOOoo = roomUserInfoModel;
        }
        RoomUserInfoModel user = this.f41465OooOOoo;
        GiftCustomMadeWebManager giftCustomMadeWebManager = (GiftCustomMadeWebManager) this.f41464OooOOo0.getValue();
        Objects.requireNonNull(giftCustomMadeWebManager);
        Intrinsics.checkNotNullParameter(user, "user");
        giftCustomMadeWebManager.f20916OooO0o = user;
        giftCustomMadeWebManager.OooO0OO();
        OooOo00().f50795OooOoOO.setRotationX(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        OooOo00().f50794OooOoO0.setText(user.getUserName());
        OooOo00().f50794OooOoO0.setGravity(8388611);
        o00000O0.OooO00o oooO00o = o00000O0.f41431OooO0o0;
        if (Intrinsics.areEqual(user, o00000O0.f41430OooO0o)) {
            OooOo00().f50794OooOoO0.setGravity(17);
            NetImageView netImageView = OooOo00().f50784OooOOOo;
            Intrinsics.checkNotNullExpressionValue(netImageView, "mBinding.ivHead");
            p255o00ooO0O.oOO00O.OooO00o(netImageView);
            OooOo00().f50790OooOo00.setBackgroundResource(R.drawable.shape_bg_gift_dialog_post_user);
            OooOo00().f50797OooOoo0.setBackgroundColor(o000O0O0.OooO00o(R.color.color_CCCCCC));
            OooOo00().f50783OooOOOO.setBackground(null);
        } else if (Intrinsics.areEqual(user, o00000O0.f41433OooO0oo)) {
            NetImageView netImageView2 = OooOo00().f50784OooOOOo;
            Intrinsics.checkNotNullExpressionValue(netImageView2, "mBinding.ivHead");
            p255o00ooO0O.oOO00O.OooO(netImageView2);
            OooOo00().f50784OooOOOo.setImageResource(R.drawable.room_dialog_all_in_mic);
            OooOo00().f50790OooOo00.setBackgroundResource(R.drawable.shape_bg_gift_dialog_send_user);
            OooOo00().f50797OooOoo0.setBackgroundColor(o000O0O0.OooO00o(R.color.color_00d8c9));
            OooOo00().f50783OooOOOO.setBackground(null);
        } else if (Intrinsics.areEqual(user, o00000O0.f41432OooO0oO)) {
            NetImageView netImageView3 = OooOo00().f50784OooOOOo;
            Intrinsics.checkNotNullExpressionValue(netImageView3, "mBinding.ivHead");
            p255o00ooO0O.oOO00O.OooO00o(netImageView3);
            OooOo00().f50790OooOo00.setBackgroundResource(R.drawable.shape_bg_gift_dialog_send_user);
            OooOo00().f50783OooOOOO.setBackgroundResource(R.drawable.shape_bg_dialog_gift_user_all_seleted);
            OooOo00().f50797OooOoo0.setBackgroundColor(o000O0O0.OooO00o(R.color.color_00d8c9));
        } else {
            NetImageView netImageView4 = OooOo00().f50784OooOOOo;
            Intrinsics.checkNotNullExpressionValue(netImageView4, "mBinding.ivHead");
            p255o00ooO0O.oOO00O.OooO(netImageView4);
            oO0O000o.OooO00o oooO00o2 = new oO0O000o.OooO00o(this.f34221OooO00o);
            oooO00o2.f48447OooO0OO = o00O00O.OooO00o(user.getUserHeader());
            oooO00o2.f48445OooO00o = 0;
            oooO00o2.OooO00o(o00OOO.OooO00o.OooO0o0());
            oooO00o2.OooO0o(OooOo00().f50784OooOOOo);
            OooOo00().f50790OooOo00.setBackgroundResource(R.drawable.shape_bg_gift_dialog_send_user);
            OooOo00().f50797OooOoo0.setBackgroundColor(o000O0O0.OooO00o(R.color.color_00d8c9));
            OooOo00().f50783OooOOOO.setBackground(null);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.f41454OooO0oO), null, null, new OooOo00(user, this, null), 3, null);
        }
        OooOo00().f50794OooOoO0.invalidate();
        OooOo00().f50794OooOoO0.requestLayout();
    }
}
