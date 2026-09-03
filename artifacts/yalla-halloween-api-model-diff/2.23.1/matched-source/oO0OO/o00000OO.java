package oO0OO;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
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
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.viewpager2.widget.ViewPager2;
import com.code.android.uikit.marquee.MarqueeText;
import com.code.android.uikit.svga.SVGAView;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.model.gift.GiftPropAll;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.gift.GiftPropTypeShow;
import com.yalla.yalla.model.gift.GiftPropTypeShowKt;
import com.yalla.yalla.model.gift.GiftPropTypeTips;
import com.yalla.yalla.model.gift.GiftPropTypeUser;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.dialog.giftDialog.GiftCustomMadeWebManager;
import com.yalla.yalla.ui.fragment.GiftSendFragment;
import com.yalla.yalla.ui.view.GiftView;
import com.yalla.yalla.ui.view.gift.GiftNumberView;
import com.yalla.yalla.ui.view.gift.GiftTopTipsView;
import com.yalla.yalla.ui.view.gift.GiftTypeNotUpTipsView;
import com.yalla.yalla.ui.view.gift.GiftWealthView;
import com.yalla.yalla.ui.view.textView.ViewLocation;
import com.yalla.yalla.util.WebPageInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Function;
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
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o0000O0O.OooO0OO;
import oO0OO.OooOo;
import oO0OO.Oooo000;
import oO0OO.o00000OO;
import oO0OO.o00O0OO;
import oO0OO.oo0o0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p205o00o0o0o.o000O;
import p393o0OOooo0.o0OO00O;
import p407o0Oo0OOO.f3;
import p407o0Oo0OOO.i1;
import p416o0Oo0oO.oO0OOo0o;
import p417o0Oo0oO0.o00Oo0;
import p474o0OoooOO.oo0oO0;
import p477o0Ooooo0.o0O0o;
import p482o0o000O.OooOo00;
import p493o0o00O0o.r;
import p493o0o00O0o.s;
import p493o0o00O0o.t;
import p561o0oOOooo.a;
import p565o0oOo000.o000OOo;
import p593o0oOoooO.h0;
import p645o0ooOOO0.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nGiftSendDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftSendDialog.kt\ncom/yalla/yalla/ui/dialog/giftDialog/GiftSendDialog\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1595:1\n23#2:1596\n215#3,2:1597\n215#3,2:1604\n1864#4,3:1599\n1855#4:1602\n1856#4:1606\n1855#4,2:1607\n1#5:1603\n*S KotlinDebug\n*F\n+ 1 GiftSendDialog.kt\ncom/yalla/yalla/ui/dialog/giftDialog/GiftSendDialog\n*L\n113#1:1596\n833#1:1597,2\n963#1:1604,2\n1109#1:1599,3\n957#1:1602\n957#1:1606\n976#1:1607,2\n*E\n"})
public final class o00000OO extends p205o00o0o0o.o0000OO0<o00000OO> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final GiftPropTypeShow f58869OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f58870OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final o00OO.OooO00o f58871OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final com.code.android.util.o000O0 f58872OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public Function1<? super GiftPropModel, Unit> f58873OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public Function2<? super WebPageInfo, ? super Boolean, Unit> f58874OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public GiftSendFragment f58875OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public Function1<? super WebPageInfo, Unit> f58876OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public RoomUserInfoModel f58877OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f58878OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public GiftPropModel f58879OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public GiftView f58880OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final Lazy f58881OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final ArrayList f58882OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f58883OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final Lazy f58884OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f58885OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final OooOo f58886OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public RoomUserInfoModel f58887OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    public a f58888OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f58889OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @NotNull
    public final Lazy f58890OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @Nullable
    public PopupWindow f58891OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @Nullable
    public Job f58892OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @NotNull
    public final ArrayList f58893OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f58894Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @NotNull
    public final Lazy f58895Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @Nullable
    public GiftPropModel f58896Oooo00o;

    public static final class OooO extends Lambda implements Function0<GiftCustomMadeWebManager> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final GiftCustomMadeWebManager invoke() {
            o00000OO o00000oo2 = o00000OO.this;
            FragmentActivity fragmentActivity = o00000oo2.f58870OooO0oO;
            FrameLayout overrideGiftContainer = o00000oo2.OooOOo0().f44508OooOOoo;
            Intrinsics.checkNotNullExpressionValue(overrideGiftContainer, "overrideGiftContainer");
            GiftCustomMadeWebManager giftCustomMadeWebManager = new GiftCustomMadeWebManager(fragmentActivity, overrideGiftContainer);
            giftCustomMadeWebManager.f27532OooO = new o00O0OO0(o00000oo2);
            return giftCustomMadeWebManager;
        }
    }

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GiftPropTypeShow.values().length];
            try {
                iArr[GiftPropTypeShow.InRoom.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GiftPropTypeShow.InChat.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GiftPropTypeShow.InMomentDetail.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GiftPropTypeShow.InMomentList.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<AnimatorSet> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AnimatorSet invoke() {
            o00000OO o00000oo2 = o00000OO.this;
            SVGAView imageView = o00000oo2.OooOOo0().f44497OooO0oO;
            Intrinsics.checkNotNullExpressionValue(imageView, "giftEffectImage");
            GiftNumberView countView = o00000oo2.OooOOo0().f44495OooO0o;
            Intrinsics.checkNotNullExpressionValue(countView, "giftCount");
            o0000Ooo o0000ooo = new o0000Ooo(o00000oo2);
            o0000 o0000Var = new o0000(o00000oo2);
            o0000O00 o0000o00 = new o0000O00(o00000oo2);
            Intrinsics.checkNotNullParameter(imageView, "imageView");
            Intrinsics.checkNotNullParameter(countView, "countView");
            p425o0OoO0OO.o00000 o00000Var = new p425o0OoO0OO.o00000(o0000ooo);
            p425o0OoO0OO.o0000Ooo o0000ooo2 = new p425o0OoO0OO.o0000Ooo(countView, o0000ooo, o0000Var, o0000o00);
            p425o0OoO0OO.o0000 o0000Var2 = new p425o0OoO0OO.o0000(o0000o00);
            p425o0OoO0OO.o0000O00 o0000o01 = new p425o0OoO0OO.o0000O00(o0000oo.f58916OooO0Oo);
            Intrinsics.checkNotNullParameter(imageView, "<this>");
            float fOooO0O0 = com.code.android.util.o0000O0.OooO0O0(p425o0OoO0OO.o000.f46630OooO00o);
            float fOooO0O1 = com.code.android.util.o0000O0.OooO0O0(p425o0OoO0OO.o000.f46631OooO0O0);
            float f = 2;
            float[] values = {50 + fOooO0O0, fOooO0O0 / f, 0.0f};
            Intrinsics.checkNotNullParameter(imageView, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "TranslationX", Arrays.copyOf(values, 3));
            Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "ofFloat(...)");
            float[] values2 = {380 + fOooO0O1, fOooO0O1 / f, 0.0f};
            Intrinsics.checkNotNullParameter(imageView, "<this>");
            Intrinsics.checkNotNullParameter(values2, "values");
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView, "TranslationY", Arrays.copyOf(values2, 3));
            Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat2, "ofFloat(...)");
            float[] values3 = {0.25f, 1.5f, 1.0f};
            Intrinsics.checkNotNullParameter(imageView, "<this>");
            Intrinsics.checkNotNullParameter(values3, "values");
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(imageView, "scaleY", Arrays.copyOf(values3, 3));
            Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat3, "ofFloat(...)");
            float[] values4 = {0.25f, 1.5f, 1.0f};
            Intrinsics.checkNotNullParameter(imageView, "<this>");
            Intrinsics.checkNotNullParameter(values4, "values");
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(imageView, "scaleX", Arrays.copyOf(values4, 3));
            Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat4, "ofFloat(...)");
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
            animatorSet.setDuration(500L);
            animatorSet.addListener(new p425o0OoO0OO.o000000O(o00000Var, o0000ooo2, o0000Var2, o0000o01));
            return animatorSet;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Oooo000> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Oooo000 invoke() {
            o00000OO o00000oo2 = o00000OO.this;
            return new Oooo000(o00000oo2.f38482OooO00o, o00000oo2.f58871OooO0oo, o00000oo2.f58869OooO);
        }
    }

    public static final class OooO0o extends Lambda implements Function0<ViewGroup> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewGroup invoke() {
            return o00000OO.this.f38484OooO0OO;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<i1> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final i1 invoke() {
            i1 i1VarOooO00o = i1.OooO00o(View.inflate(o00000OO.this.f38482OooO00o, p565o0oOo000.o0OO00O.room_popupwindow_setting, null));
            Intrinsics.checkNotNullExpressionValue(i1VarOooO00o, "bind(...)");
            return i1VarOooO00o;
        }
    }

    public static final class OooOO0O implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f58902OooO0Oo;

        public OooOO0O(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f58902OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f58902OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f58902OooO0Oo;
        }

        public final int hashCode() {
            return this.f58902OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f58902OooO0Oo.invoke(obj);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.giftDialog.GiftSendDialog$showIntroducingTagGiftWindow$2", f = "GiftSendDialog.kt", i = {}, l = {1400, 1401}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f58903OooO0Oo;

        @DebugMetadata(c = "com.yalla.yalla.ui.dialog.giftDialog.GiftSendDialog$showIntroducingTagGiftWindow$2$1", f = "GiftSendDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ o00000OO f58905OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(o00000OO o00000oo2, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f58905OooO0Oo = o00000oo2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f58905OooO0Oo, continuation);
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
                PopupWindow popupWindow = this.f58905OooO0Oo.f58891OooOoo0;
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
            return o00000OO.this.new OooOOO(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f58903OooO0Oo;
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
            this.f58903OooO0Oo = 1;
            if (DelayKt.delay(3000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            OooO00o oooO00o = new OooO00o(o00000OO.this, null);
            this.f58903OooO0Oo = 2;
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
            o00000OO o00000oo2 = o00000OO.this;
            o00000oo2.f58891OooOoo0 = null;
            Job job = o00000oo2.f58892OooOooO;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
        }
    }

    public static final class OooOOOO extends Lambda implements Function1<String, Unit> {
        public OooOOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String url = str;
            if (!(url == null || StringsKt.isBlank(url))) {
                WebPageInfo webPageInfo = new WebPageInfo(WebFrom.UserWealthLevel);
                webPageInfo.f32291OooO0oo = false;
                webPageInfo.f32286OooO = true;
                Intrinsics.checkNotNull(url);
                Intrinsics.checkNotNullParameter(url, "url");
                webPageInfo.f32289OooO0o0 = url;
                webPageInfo.f32297OooOOOO = o0O0o.f48268o00O0Oo;
                Function2<? super WebPageInfo, ? super Boolean, Unit> function2 = o00000OO.this.f58874OooOO0o;
                if (function2 != null) {
                    function2.invoke(webPageInfo, Boolean.TRUE);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.giftDialog.GiftSendDialog$updateUserUI$1$1", f = "GiftSendDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOo00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f58908OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o00000OO f58909OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(RoomUserInfoModel roomUserInfoModel, o00000OO o00000oo2, Continuation<? super OooOo00> continuation) {
            super(2, continuation);
            this.f58908OooO0Oo = roomUserInfoModel;
            this.f58909OooO0o0 = o00000oo2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOo00(this.f58908OooO0Oo, this.f58909OooO0o0, continuation);
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
            RoomUserInfoModel roomUserInfoModel = this.f58908OooO0Oo;
            String value = roomUserInfoModel.getUserName().getValue();
            if (roomUserInfoModel.getUserId().getValue().longValue() > 0) {
                value = p414o0Oo0o0O.o000O00.OooO0O0(roomUserInfoModel.getUserId().getValue().longValue(), value);
            }
            this.f58909OooO0o0.OooOOo0().f44513OooOo0o.setText(value);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:20:0x027e  */
    /* JADX WARN: Multi-variable type inference failed */
    public o00000OO(@NotNull FragmentActivity currentActivity, @NotNull o00OO.OooO00o theme, @NotNull GiftPropTypeShow showIn) {
        super(currentActivity);
        Intrinsics.checkNotNullParameter(currentActivity, "currentActivity");
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(showIn, "showIn");
        this.f58870OooO0oO = currentActivity;
        this.f58871OooO0oo = theme;
        this.f58869OooO = showIn;
        this.f58872OooOO0 = new com.code.android.util.o000O0(Reflection.getOrCreateKotlinClass(p407o0Oo0OOO.o0O0o.class), this.f38482OooO00o, new OooO0o());
        this.f58877OooOOOO = Oooo000.f58849OooO0o0;
        int i = 1;
        this.f58878OooOOOo = 1;
        this.f58881OooOOoo = LazyKt.lazy(new OooO0OO());
        this.f58884OooOo00 = LazyKt.lazy(new OooO());
        this.f58883OooOo0 = new LinkedHashMap();
        this.f58885OooOo0O = new LinkedHashMap();
        OooOo oooOo = new OooOo(currentActivity);
        this.f58886OooOo0o = oooOo;
        this.f58882OooOo = new ArrayList();
        Window windowOooO0Oo = OooO0Oo();
        if (windowOooO0Oo != null) {
            windowOooO0Oo.setWindowAnimations(p565o0oOo000.o000000.anim_bottom_top_bottom);
        }
        OooO0oo();
        ConstraintLayout constraintLayout = OooOOo0().f44491OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        int i2 = p425o0OoO0OO.o000.f46630OooO00o;
        Object systemService = com.code.android.util.o000O00O.OooO00o().getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Point point = new Point();
        ((WindowManager) systemService).getDefaultDisplay().getSize(point);
        p425o0OoO0OO.o00O0OOO.OooO0O0(constraintLayout, point.y);
        OooOOo0().f44512OooOo0O.setDialog(this);
        p393o0OOooo0.o0OO00O.OooO0Oo(false);
        ConstraintLayout constraintLayout2 = OooOOo0().f44491OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
        OooO0oO(constraintLayout2);
        int i3 = OooO00o.$EnumSwitchMapping$0[showIn.ordinal()];
        int i4 = 3;
        int i5 = 2;
        if (i3 == 1) {
            ImageView userUp = OooOOo0().f44515OooOoO0;
            Intrinsics.checkNotNullExpressionValue(userUp, "userUp");
            com.code.android.util.o000O.OooOOOO(userUp);
            ImageView ivAllRoom = OooOOo0().f44501OooOO0o;
            Intrinsics.checkNotNullExpressionValue(ivAllRoom, "ivAllRoom");
            com.code.android.util.o000O.OooOOOO(ivAllRoom);
            View vLine = OooOOo0().f44514OooOoO;
            Intrinsics.checkNotNullExpressionValue(vLine, "vLine");
            com.code.android.util.o000O.OooOOOO(vLine);
            ConstraintLayout layoutSendGiftEffect = OooOOo0().f44505OooOOOo;
            Intrinsics.checkNotNullExpressionValue(layoutSendGiftEffect, "layoutSendGiftEffect");
            com.code.android.util.o000O.OooO0O0(layoutSendGiftEffect);
        } else if (i3 == 2) {
            ImageView userUp2 = OooOOo0().f44515OooOoO0;
            Intrinsics.checkNotNullExpressionValue(userUp2, "userUp");
            com.code.android.util.o000O.OooO0O0(userUp2);
            ImageView ivAllRoom2 = OooOOo0().f44501OooOO0o;
            Intrinsics.checkNotNullExpressionValue(ivAllRoom2, "ivAllRoom");
            com.code.android.util.o000O.OooO0O0(ivAllRoom2);
            View vLine2 = OooOOo0().f44514OooOoO;
            Intrinsics.checkNotNullExpressionValue(vLine2, "vLine");
            com.code.android.util.o000O.OooO0O0(vLine2);
            ConstraintLayout layoutSendGiftEffect2 = OooOOo0().f44505OooOOOo;
            Intrinsics.checkNotNullExpressionValue(layoutSendGiftEffect2, "layoutSendGiftEffect");
            com.code.android.util.o000O.OooO0O0(layoutSendGiftEffect2);
        } else if (i3 == 3 || i3 == 4) {
            ImageView userUp3 = OooOOo0().f44515OooOoO0;
            Intrinsics.checkNotNullExpressionValue(userUp3, "userUp");
            com.code.android.util.o000O.OooO0O0(userUp3);
            ImageView ivAllRoom3 = OooOOo0().f44501OooOO0o;
            Intrinsics.checkNotNullExpressionValue(ivAllRoom3, "ivAllRoom");
            com.code.android.util.o000O.OooO0O0(ivAllRoom3);
            View vLine3 = OooOOo0().f44514OooOoO;
            Intrinsics.checkNotNullExpressionValue(vLine3, "vLine");
            com.code.android.util.o000O.OooO0O0(vLine3);
            ConstraintLayout layoutSendGiftEffect3 = OooOOo0().f44505OooOOOo;
            Intrinsics.checkNotNullExpressionValue(layoutSendGiftEffect3, "layoutSendGiftEffect");
            com.code.android.util.o000O.OooO0OO(layoutSendGiftEffect3);
        }
        GiftTopTipsView giftTopTipsView = OooOOo0().f44512OooOo0O;
        giftTopTipsView.getGiftBlindView().setGiftBlindListener(new o000O00O(this, giftTopTipsView));
        giftTopTipsView.setGiftCustomMadeClickListener(new o000O0(this));
        giftTopTipsView.getGiftTypeNotUpView().setViewListener(new o000O0Oo(this));
        giftTopTipsView.setGiftBlindClickListener(new o000OO0O(this));
        giftTopTipsView.setGiftNewClickListener(new o000O0O0(this));
        giftTopTipsView.setGiftWeekStarClickListener(new o000O(this));
        giftTopTipsView.setGiftMergeClickListener(new o000OO00(this));
        OooOOo0().f44508OooOOoo.setOnClickListener(new View.OnClickListener() { // from class: oO0OO.o00000O
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o00000OO this$0 = this.f58867OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                FrameLayout overrideGiftContainer = this$0.OooOOo0().f44508OooOOoo;
                Intrinsics.checkNotNullExpressionValue(overrideGiftContainer, "overrideGiftContainer");
                com.code.android.util.o000O.OooO0O0(overrideGiftContainer);
            }
        });
        ImageView ivAllRoom4 = OooOOo0().f44501OooOO0o;
        Intrinsics.checkNotNullExpressionValue(ivAllRoom4, "ivAllRoom");
        com.code.android.util.o000O.OooO(ivAllRoom4, new o00O000(this));
        LinearLayout layoutUser = OooOOo0().f44506OooOOo;
        Intrinsics.checkNotNullExpressionValue(layoutUser, "layoutUser");
        com.code.android.util.o000O.OooO(layoutUser, new o00O00O(this));
        TextView giftNum = OooOOo0().f44498OooO0oo;
        Intrinsics.checkNotNullExpressionValue(giftNum, "giftNum");
        com.code.android.util.o000O.OooO(giftNum, new o00O00o0(this));
        TextView tvSend = OooOOo0().f44509OooOo;
        Intrinsics.checkNotNullExpressionValue(tvSend, "tvSend");
        com.code.android.util.o000O.OooO(tvSend, new oo00o(this));
        TextView crystal = OooOOo0().f44493OooO0OO;
        Intrinsics.checkNotNullExpressionValue(crystal, "crystal");
        com.code.android.util.o000O.OooO(crystal, new o00O0(this));
        TextView coin = OooOOo0().f44492OooO0O0;
        Intrinsics.checkNotNullExpressionValue(coin, "coin");
        com.code.android.util.o000O.OooO(coin, new o00O0O00(this));
        ImageView firstChargeReward = OooOOo0().f44496OooO0o0;
        Intrinsics.checkNotNullExpressionValue(firstChargeReward, "firstChargeReward");
        com.code.android.util.o000O.OooO(firstChargeReward, new o00O0O0O(this));
        if (com.code.android.util.o000000.OooO00o(Integer.valueOf(p417o0Oo0oO0.o00Oo0.OooO00o().OooO0OO("firstRecharge", 0)))) {
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            if (com.code.android.util.o0OoOo0.OooO00o((Boolean) ((MutableLiveData) oo0oO0.f48005Oooo0o0.getValue()).getValue())) {
                ImageView firstChargeReward2 = OooOOo0().f44496OooO0o0;
                Intrinsics.checkNotNullExpressionValue(firstChargeReward2, "firstChargeReward");
                com.code.android.util.o000O.OooO0O0(firstChargeReward2);
            } else {
                ImageView firstChargeReward3 = OooOOo0().f44496OooO0o0;
                Intrinsics.checkNotNullExpressionValue(firstChargeReward3, "firstChargeReward");
                com.code.android.util.o000O.OooOOOO(firstChargeReward3);
            }
        } else {
            ImageView firstChargeReward4 = OooOOo0().f44496OooO0o0;
            Intrinsics.checkNotNullExpressionValue(firstChargeReward4, "firstChargeReward");
            com.code.android.util.o000O.OooO0O0(firstChargeReward4);
        }
        GiftWealthView giftWealthView = OooOOo0().f44490OooO;
        giftWealthView.OooO0O0(currentActivity);
        giftWealthView.setToWealthLevelListener(new o000OOo0(this));
        giftWealthView.setToRechargeListener(new o00(this));
        LinearLayout hintFirstSelectTotalGift = OooOOo0().f44500OooOO0O;
        Intrinsics.checkNotNullExpressionValue(hintFirstSelectTotalGift, "hintFirstSelectTotalGift");
        com.code.android.util.o000O.OooO(hintFirstSelectTotalGift, new o00O0000(this));
        LinearLayout hintFirstSelectAllUser = OooOOo0().f44499OooOO0;
        Intrinsics.checkNotNullExpressionValue(hintFirstSelectAllUser, "hintFirstSelectAllUser");
        com.code.android.util.o000O.OooO(hintFirstSelectAllUser, new o0O0ooO(this));
        ImageView sendCustomGiftWarn = OooOOo0().f44511OooOo00;
        Intrinsics.checkNotNullExpressionValue(sendCustomGiftWarn, "sendCustomGiftWarn");
        com.code.android.util.o000O.OooO(sendCustomGiftWarn, new o00oOoo(this));
        OooOoOO(this.f58877OooOOOO);
        oooOo.f58845OooO0o0 = new o0000O0O(this);
        OooOOo0().f44516OooOoOO.setAdapter(oooOo);
        MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = p393o0OOooo0.o0OO00O.f43560OooO00o;
        p393o0OOooo0.o0OO00O.OooO0o0(currentActivity, new p505o0o00oO.o000O0(this, i));
        oo0oO0 oo0oo1 = oo0oO0.f47967OooO00o;
        oo0oO0.OooO0O0().observe(currentActivity, new OooOO0O(new o000Oo0(this)));
        oo0oO0.OooO0Oo().observe(currentActivity, new OooOO0O(new o000O00(this)));
        Class cls = Boolean.TYPE;
        LiveEventBus.get("JoinRoomDialogFromGiftSendDialogLink", cls).observe(currentActivity, new p431o0OoOO.oo000o(this, i));
        LiveEventBus.get("QuickRechargeDialogFromGiftSendDialog", cls).observe(currentActivity, new p431o0OoOO.o00oO0o(this, i4));
        LiveEventBus.get("GiftSendDialogWealthLevelUnlock", cls).observe(currentActivity, new p435o0OoOOO0.o0000Ooo(this, i4));
        LiveEventBus.get("ReceiveCrystalDialogFromGiftSendDialog", cls).observe(currentActivity, new p435o0OoOOO0.o0000(this, i5));
        LiveEventBus.get("UserWealthLevel_Change", cls).observe(currentActivity, new r(this, i));
        this.f38483OooO0O0.f38477OooO0Oo.addObserver(new DefaultLifecycleObserver() { // from class: com.yalla.yalla.ui.dialog.giftDialog.GiftSendDialog$initObserve$8

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            @NotNull
            public final OooO00o f27583OooO0Oo;

            public static final class OooO00o extends ViewPager2.OnPageChangeCallback {

                /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
                public final /* synthetic */ o00000OO f27585OooO00o;

                public OooO00o(o00000OO o00000oo2) {
                    this.f27585OooO00o = o00000oo2;
                }

                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public final void onPageSelected(int i) {
                    super.onPageSelected(i);
                    o00000OO o00000oo2 = this.f27585OooO00o;
                    if (!o00000oo2.f58886OooOo0o.f58840OooO00o.isEmpty()) {
                        OooOo oooOo = o00000oo2.f58886OooOo0o;
                        if (oooOo.f58840OooO00o.size() > i) {
                            o00000oo2.f58875OooOOO = (GiftSendFragment) oooOo.f58840OooO00o.get(i);
                            o00000OO.OooOOO(o00000oo2);
                            Iterator it = oooOo.f58842OooO0OO.entrySet().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                Map.Entry entry = (Map.Entry) it.next();
                                if (Intrinsics.areEqual(oooOo.f58841OooO0O0.get(i), entry.getKey())) {
                                    oooOo.f58842OooO0OO.put(entry.getKey(), 0L);
                                    a aVar = o00000oo2.f58888OooOoO0;
                                    if (aVar != null) {
                                        aVar.OooO0O0((String) entry.getKey(), ((Number) entry.getValue()).longValue() > 0);
                                    }
                                }
                            }
                            GiftSendFragment giftSendFragment = o00000oo2.f58875OooOOO;
                            if (giftSendFragment != null) {
                                if (giftSendFragment.getPageTypeUser() == GiftPropTypeUser.Backpack.getValue()) {
                                    oO0OOo0o oo0ooo0oOooO0o0 = o00Oo0.OooO0o0();
                                    oo0ooo0oOooO0o0.getClass();
                                    oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                                    if (!oo0ooo0oOooO0o0.OooO0O0("giftBackpackFirstReminderTips" + oo0oO0.OooOOo0().getValue(), false)) {
                                        o000O o000o = new o000O(o00000oo2.f58870OooO0oO);
                                        o000o.OooOoO0(o000OOo.backpack_info_title);
                                        o000o.OooOOoo(o000OOo.backpack_info_content);
                                        o000o.OooOo0(oo0o0O0.f58982OooO0Oo);
                                        o000o.OooOO0o();
                                    }
                                    oO0OOo0o oo0ooo0oOooO0o1 = o00Oo0.OooO0o0();
                                    oo0ooo0oOooO0o1.getClass();
                                    OooO0OO.OooO0OO("giftBackpackFirstReminderTips", oo0oO0.OooOOo0().getValue(), oo0ooo0oOooO0o1, true);
                                    GiftSendFragment giftSendFragment2 = o00000oo2.f58875OooOOO;
                                    if (giftSendFragment2 != null) {
                                        giftSendFragment2.setResumeListener(new o00O0OO(o00000oo2));
                                    }
                                    o00000oo2.OooOOOO();
                                    if (Intrinsics.areEqual(o00000oo2.f58877OooOOOO, Oooo000.f58848OooO0o)) {
                                        o00000oo2.OooOoOO(Oooo000.f58850OooO0oO);
                                    }
                                } else {
                                    o00000oo2.OooOOo0().f44498OooO0oo.setEnabled(true);
                                    o00000oo2.OooOOo0().f44498OooO0oo.setClickable(true);
                                    o00000oo2.OooOOo0().f44509OooOo.setEnabled(true);
                                    o00000oo2.OooOOo0().f44509OooOo.setClickable(true);
                                }
                                o00Oo0.OooOO0O().OooOOOo(giftSendFragment.getPageTypeUser(), false);
                                MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = o0OO00O.f43560OooO00o;
                                int pageTypeUser = giftSendFragment.getPageTypeUser();
                                List<GiftPropAll> value = o0OO00O.f43563OooO0Oo.getValue();
                                if (value != null) {
                                    for (GiftPropAll giftPropAll : value) {
                                        if (pageTypeUser == giftPropAll.getGiftPropTypeUser()) {
                                            giftPropAll.setRedPostCountLocal(0L);
                                        }
                                    }
                                }
                                OooOo00 oooOo00 = com.yalla.yalla.service.room.OooO00o.f24535OooOOo0;
                                MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData2 = o0OO00O.f43560OooO00o;
                                oooOo00.OooO0Oo(o0OO00O.OooO0OO());
                            }
                        }
                    }
                }
            }

            {
                this.f27583OooO0Oo = new OooO00o(this.f27584OooO0o0);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onCreate(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                androidx.lifecycle.OooO0OO.OooO00o(this, owner);
                this.f27584OooO0o0.OooOOo0().f44516OooOoOO.registerOnPageChangeCallback(this.f27583OooO0Oo);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onDestroy(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                androidx.lifecycle.OooO0OO.OooO0O0(this, owner);
                this.f27584OooO0o0.OooOOo0().f44516OooOoOO.unregisterOnPageChangeCallback(this.f27583OooO0Oo);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO0OO.OooO0OO(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onResume(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                androidx.lifecycle.OooO0OO.OooO0Oo(this, owner);
                this.f27584OooO0o0.OooOo0();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO0OO.OooO0o0(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO0OO.OooO0o(this, lifecycleOwner);
            }
        });
        LiveEventBus.get("GiftSendDialogSelectGift", GiftView.class).observe(currentActivity, new s(this, i));
        LiveEventBus.get("ShowIntroducingTagGiftWindow", GiftView.class).observe(currentActivity, new t(this, i));
        LiveEventBus.get("OnLongClickShowIntroducingTagGiftWindow", GiftView.class).observe(currentActivity, new p490o0o00O0.OooOO0(this, i5));
        LiveEventBus.get("DismissIntroducingTagGiftWindow", cls).observe(currentActivity, new p490o0o00O0.OooOO0O(this, i4));
        oo0oO0.OooO0O0().observe(currentActivity, new OooOO0O(new o0000O(this)));
        oo0oO0.OooO0Oo().observe(currentActivity, new OooOO0O(new o0000OO0(this)));
        com.yalla.yalla.service.room.OooO0O0.f24541OoooOOO.OooO00o().f24554OooOO0o.observe(currentActivity, new OooOO0O(new o000(this)));
        oo0oO0.OooOO0o().observe(currentActivity, new OooOO0O(new o000O000(this)));
        oo0oO0.OooOO0().observe(currentActivity, new OooOO0O(new o000O0o(this)));
        final o000OO o000oo2 = new o000OO(this);
        this.f38483OooO0O0.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: o00o00Oo.o00000O
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i6, KeyEvent keyEvent) {
                o0000oo this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function3 function3 = o000oo2;
                if (function3 == null) {
                    return false;
                }
                Integer numValueOf = Integer.valueOf(i6);
                Intrinsics.checkNotNull(keyEvent);
                return ((Boolean) function3.invoke(this$0, numValueOf, keyEvent)).booleanValue();
            }
        });
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of com.code.android.easydialog.EasyDialog");
        this.f58890OooOoo = LazyKt.lazy(new OooOO0());
        this.f58893OooOooo = new ArrayList();
        this.f58895Oooo00O = LazyKt.lazy(new OooO0O0());
    }

    public static final void OooOOO(o00000OO o00000oo2) {
        GiftSendFragment giftSendFragment = o00000oo2.f58875OooOOO;
        if (giftSendFragment != null) {
            GiftTypeNotUpTipsView giftTypeNotUpView = o00000oo2.OooOOo0().f44512OooOo0O.getGiftTypeNotUpView();
            int pageTypeUser = giftSendFragment.getPageTypeUser();
            oo0O oo0o = new oo0O(o00000oo2, giftSendFragment);
            giftTypeNotUpView.typeUser = pageTypeUser;
            f3 f3Var = giftTypeNotUpView.f30504OooO0Oo;
            NetImageView ivFg = f3Var.f43852OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(ivFg, "ivFg");
            com.code.android.util.o000O.OooO0O0(ivFg);
            NetImageView ivFgStart = f3Var.f43853OooO0o;
            Intrinsics.checkNotNullExpressionValue(ivFgStart, "ivFgStart");
            com.code.android.util.o000O.OooO0O0(ivFgStart);
            NetImageView ivFgEnd = f3Var.f43854OooO0o0;
            Intrinsics.checkNotNullExpressionValue(ivFgEnd, "ivFgEnd");
            com.code.android.util.o000O.OooO0O0(ivFgEnd);
            NetImageView ivFlags = f3Var.f43855OooO0oO;
            Intrinsics.checkNotNullExpressionValue(ivFlags, "ivFlags");
            com.code.android.util.o000O.OooO0O0(ivFlags);
            ImageView ivType = f3Var.f43856OooO0oo;
            Intrinsics.checkNotNullExpressionValue(ivType, "ivType");
            com.code.android.util.o000O.OooO0O0(ivType);
            MarqueeText tvInfo = f3Var.f43848OooO;
            Intrinsics.checkNotNullExpressionValue(tvInfo, "tvInfo");
            com.code.android.util.o000O.OooO0O0(tvInfo);
            int i = p565o0oOo000.o0ooOOo.white;
            tvInfo.setTextColor(com.code.android.util.o0000.OooO00o(i));
            tvInfo.setText("");
            ImageView ivArrow = f3Var.f43850OooO0O0;
            Intrinsics.checkNotNullExpressionValue(ivArrow, "ivArrow");
            com.code.android.util.o000O.OooO0O0(ivArrow);
            Intrinsics.checkNotNullExpressionValue(tvInfo, "tvInfo");
            MarqueeText.OooOO0o(tvInfo);
            int value = GiftPropTypeUser.Wealth.getValue();
            NetImageView netImageView = f3Var.f43851OooO0OO;
            if (pageTypeUser == value) {
                Intrinsics.checkNotNullExpressionValue(ivFgStart, "ivFgStart");
                com.code.android.util.o000O.OooOOOO(ivFgStart);
                ivFgStart.setImageResource(p565o0oOo000.oo0o0Oo.ic_gift_type_not_up_tips_fg_wealth_start);
                Intrinsics.checkNotNullExpressionValue(ivFgEnd, "ivFgEnd");
                com.code.android.util.o000O.OooOOOO(ivFgEnd);
                ivFgEnd.setImageResource(p565o0oOo000.oo0o0Oo.ic_gift_type_not_up_tips_fg_wealth_end);
                Intrinsics.checkNotNullExpressionValue(ivType, "ivType");
                com.code.android.util.o000O.OooOOOO(ivType);
                Intrinsics.checkNotNullExpressionValue(tvInfo, "tvInfo");
                com.code.android.util.o000O.OooOOOO(tvInfo);
                Intrinsics.checkNotNullExpressionValue(ivArrow, "ivArrow");
                com.code.android.util.o000O.OooOOOO(ivArrow);
                netImageView.setImageResource(p565o0oOo000.oo0o0Oo.ic_gift_type_tips_bg_wealth);
                ivType.setImageResource(p565o0oOo000.oo0o0Oo.ic_gift_type_not_up_wealth);
                tvInfo.setTextColor(com.code.android.util.o0000.OooO00o(i));
                tvInfo.setText(p425o0OoO0OO.o00O0OO.OooO0O0(p565o0oOo000.o000OOo.gift_type_not_up_tips_wealth, giftTypeNotUpView));
                ivArrow.setImageResource(p565o0oOo000.oo0o0Oo.ic_gift_type_not_up_arrow_wealth);
                oo0o.invoke(Boolean.TRUE);
                return;
            }
            if (pageTypeUser == GiftPropTypeUser.Vip.getValue()) {
                NetImageView ivFg2 = f3Var.f43852OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(ivFg2, "ivFg");
                com.code.android.util.o000O.OooOOOO(ivFg2);
                ivFg2.setImageResource(p565o0oOo000.oo0o0Oo.ic_gift_type_not_up_tips_fg_vip);
                Intrinsics.checkNotNullExpressionValue(ivType, "ivType");
                com.code.android.util.o000O.OooOOOO(ivType);
                Intrinsics.checkNotNullExpressionValue(tvInfo, "tvInfo");
                com.code.android.util.o000O.OooOOOO(tvInfo);
                Intrinsics.checkNotNullExpressionValue(ivArrow, "ivArrow");
                com.code.android.util.o000O.OooOOOO(ivArrow);
                netImageView.setImageResource(p565o0oOo000.o0OOO0o.gift_type_tips_bg_vip);
                ivType.setImageResource(p565o0oOo000.oo0o0Oo.ic_gift_type_not_up_vip);
                tvInfo.setTextColor(com.code.android.util.o0000.OooO00o(i));
                tvInfo.setText(p425o0OoO0OO.o00O0OO.OooO0O0(p565o0oOo000.o000OOo.gift_type_not_up_tips_vip, giftTypeNotUpView));
                ivArrow.setImageResource(p565o0oOo000.oo0o0Oo.ic_gift_type_not_up_arrow_vip);
                oo0o.invoke(Boolean.TRUE);
                return;
            }
            if (pageTypeUser == GiftPropTypeUser.Member.getValue()) {
                Intrinsics.checkNotNullExpressionValue(ivType, "ivType");
                com.code.android.util.o000O.OooOOOO(ivType);
                Intrinsics.checkNotNullExpressionValue(tvInfo, "tvInfo");
                com.code.android.util.o000O.OooOOOO(tvInfo);
                Intrinsics.checkNotNullExpressionValue(ivArrow, "ivArrow");
                com.code.android.util.o000O.OooOOOO(ivArrow);
                netImageView.setImageResource(p565o0oOo000.o0OOO0o.gift_type_tips_bg_member);
                ivType.setImageResource(p565o0oOo000.oo0o0Oo.ic_gift_type_not_up_member);
                tvInfo.setTextColor(com.code.android.util.o0000.OooO00o(i));
                tvInfo.setText(p425o0OoO0OO.o00O0OO.OooO0O0(p565o0oOo000.o000OOo.gift_type_not_up_tips_member, giftTypeNotUpView));
                ivArrow.setImageResource(p565o0oOo000.oo0o0Oo.ic_gift_type_not_up_arrow_member);
                oo0o.invoke(Boolean.TRUE);
                return;
            }
            if (pageTypeUser == GiftPropTypeUser.Premium.getValue()) {
                Intrinsics.checkNotNullExpressionValue(ivType, "ivType");
                com.code.android.util.o000O.OooOOOO(ivType);
                Intrinsics.checkNotNullExpressionValue(tvInfo, "tvInfo");
                com.code.android.util.o000O.OooOOOO(tvInfo);
                Intrinsics.checkNotNullExpressionValue(ivArrow, "ivArrow");
                com.code.android.util.o000O.OooOOOO(ivArrow);
                netImageView.setImageResource(p565o0oOo000.o0OOO0o.gift_type_tips_bg_premium);
                ivType.setImageResource(p565o0oOo000.oo0o0Oo.ic_gift_type_not_up_premium);
                tvInfo.setTextColor(com.code.android.util.o0000.OooO00o(i));
                tvInfo.setText(p425o0OoO0OO.o00O0OO.OooO0O0(p565o0oOo000.o000OOo.gift_type_not_up_tips_premium, giftTypeNotUpView));
                ivArrow.setImageResource(p565o0oOo000.oo0o0Oo.ic_gift_type_not_up_arrow_premium);
                oo0o.invoke(Boolean.TRUE);
                return;
            }
            if (pageTypeUser != GiftPropTypeUser.Flags.getValue()) {
                oo0o.invoke(Boolean.FALSE);
                return;
            }
            Intrinsics.checkNotNullExpressionValue(ivFlags, "ivFlags");
            com.code.android.util.o000O.OooOOOO(ivFlags);
            ivFlags.setImageResource(p565o0oOo000.o0OOO0o.gift_type_tips_bg_flags);
            Intrinsics.checkNotNullExpressionValue(tvInfo, "tvInfo");
            com.code.android.util.o000O.OooOOOO(tvInfo);
            netImageView.setImageDrawable(null);
            tvInfo.setTextColor(com.code.android.util.o0000.OooO00o(p565o0oOo000.o0ooOOo.white_65));
            tvInfo.setText(p425o0OoO0OO.o00O0OO.OooO0O0(p565o0oOo000.o000OOo.gift_type_not_up_tips_flags, giftTypeNotUpView));
            oo0o.invoke(Boolean.TRUE);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0077  */
    /* JADX WARN: Code duplicated, block: B:49:0x007d  */
    public static final void OooOOO0(o00000OO o00000oo2, GiftPropTypeTips giftPropTypeTips) {
        GiftSendFragment giftSendFragment;
        GiftTopTipsView giftTopTipsView = o00000oo2.OooOOo0().f44512OooOo0O;
        GiftPropModel giftPropModel = giftTopTipsView.f30479OooO0o;
        if (giftPropModel != null) {
            o00000OO o00000oo3 = giftTopTipsView.dialog;
            boolean z = (o00000oo3 == null || (giftSendFragment = o00000oo3.f58875OooOOO) == null || giftSendFragment.getPageTypeUser() != GiftPropTypeUser.Backpack.getValue()) ? false : true;
            ConstraintLayout constraintLayout = giftTopTipsView.f30484OooOO0O;
            if (z) {
                if ((giftPropTypeTips != null ? GiftTopTipsView.Oooo000.$EnumSwitchMapping$0[giftPropTypeTips.ordinal()] : -1) != 1) {
                    constraintLayout = null;
                }
                giftTopTipsView.OooO00o(constraintLayout);
                return;
            }
            int i = giftPropTypeTips != null ? GiftTopTipsView.Oooo000.$EnumSwitchMapping$0[giftPropTypeTips.ordinal()] : -1;
            if (i != 1) {
                if (i == 2) {
                    constraintLayout = giftTopTipsView.giftBlindView;
                } else if (i == 3) {
                    constraintLayout = giftTopTipsView.giftTypeNotUpView;
                } else if (i == 4) {
                    constraintLayout = giftTopTipsView.giftCustomMadeView;
                } else if (i != 5) {
                    constraintLayout = null;
                } else if (giftPropModel.isBlind()) {
                    constraintLayout = giftTopTipsView.giftBlindView;
                } else if (giftPropModel.isCustomMade()) {
                    constraintLayout = giftTopTipsView.giftCustomMadeView;
                } else if (giftPropModel.getIsWeek()) {
                    constraintLayout = giftTopTipsView.f30481OooO0oO;
                } else if (giftPropModel.getIsNew()) {
                    constraintLayout = giftTopTipsView.f30485OooOO0o;
                } else {
                    constraintLayout = null;
                }
            }
            if (com.code.android.util.o0OoOo0.OooO00o(constraintLayout != null ? Boolean.valueOf(com.code.android.util.o000O.OooO0o0(constraintLayout)) : null)) {
                return;
            }
            giftTopTipsView.OooO00o(constraintLayout);
        }
    }

    @Override // p185o00o00Oo.o0000oo
    public final void OooO0o0() {
        OooOo(true);
        this.f58893OooOooo.clear();
        this.f58894Oooo000 = false;
        this.f58889OooOoOO = false;
    }

    @Override // p185o00o00Oo.o0000oo
    public final void OooOO0o() {
        List<GiftPropModel> arrayList;
        GiftSendFragment giftSendFragment;
        MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = p393o0OOooo0.o0OO00O.f43560OooO00o;
        p393o0OOooo0.o0OO00O.OooO0Oo(false);
        MutableLiveData<List<GiftPropAll>> mutableLiveData2 = p393o0OOooo0.o0OO00O.f43563OooO0Oo;
        List<GiftPropAll> value = mutableLiveData2.getValue();
        if (value == null || value.isEmpty()) {
            com.code.android.util.o000O00.OooO00o(p565o0oOo000.o000OOo.network_failed);
            return;
        }
        super.OooOO0o();
        OooOo(true);
        this.f58893OooOooo.clear();
        this.f58894Oooo000 = false;
        this.f58889OooOoOO = false;
        OooOo(false);
        OooOOOO();
        GiftPropTypeShow giftPropTypeShow = GiftPropTypeShow.InRoom;
        GiftPropTypeShow giftPropTypeShow2 = this.f58869OooO;
        if (giftPropTypeShow2 == giftPropTypeShow && (giftSendFragment = this.f58875OooOOO) != null) {
            h0.OooO0OO("202020", MapsKt.mapOf(new Pair("gifttype", Integer.valueOf(giftSendFragment.getPageTypeUser())), new Pair("roomeventid", Integer.valueOf(giftSendFragment.getPageTypeUser())), new Pair("page", Integer.valueOf(giftSendFragment.getPageIndex() + 1))));
        }
        GiftPropModel giftPropModel = this.f58879OooOOo;
        if (giftPropModel != null && giftPropModel.getTypeUser() == GiftPropTypeUser.Backpack.getValue()) {
            GiftPropModel giftPropModel2 = this.f58879OooOOo;
            if (com.code.android.util.o0OoOo0.OooOO0(giftPropModel2 != null ? Long.valueOf(giftPropModel2.getGiftBackpackPropNum()) : null) < 1) {
                GiftPropTypeUser giftPropTypeUser = GiftPropTypeUser.Hot;
                int region = GiftPropTypeShowKt.getRegion(giftPropTypeShow2);
                Intrinsics.checkNotNullParameter(giftPropTypeUser, "giftPropTypeUser");
                List<GiftPropAll> value2 = mutableLiveData2.getValue();
                if (value2 == null) {
                    arrayList = new ArrayList<>();
                    break;
                }
                Iterator<T> it = value2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        arrayList = new ArrayList<>();
                        break;
                    }
                    GiftPropAll giftPropAll = (GiftPropAll) it.next();
                    if (giftPropTypeUser.getValue() == giftPropAll.getGiftPropTypeUser()) {
                        arrayList = giftPropAll.getListForRegion(region);
                        break;
                    }
                }
                this.f58879OooOOo = null;
                if (!arrayList.isEmpty()) {
                    this.f58879OooOOo = arrayList.get(0);
                }
            }
        }
        OooOo0();
    }

    public final void OooOOOO() {
        LinearLayout hintFirstSelectAllUser = OooOOo0().f44499OooOO0;
        Intrinsics.checkNotNullExpressionValue(hintFirstSelectAllUser, "hintFirstSelectAllUser");
        if (!com.code.android.util.o000O.OooO0o0(hintFirstSelectAllUser)) {
            LinearLayout hintFirstSelectTotalGift = OooOOo0().f44500OooOO0O;
            Intrinsics.checkNotNullExpressionValue(hintFirstSelectTotalGift, "hintFirstSelectTotalGift");
            if (!com.code.android.util.o000O.OooO0o0(hintFirstSelectTotalGift)) {
                return;
            }
        }
        LinearLayout hintFirstSelectAllUser2 = OooOOo0().f44499OooOO0;
        Intrinsics.checkNotNullExpressionValue(hintFirstSelectAllUser2, "hintFirstSelectAllUser");
        com.code.android.util.o000O.OooO0O0(hintFirstSelectAllUser2);
        LinearLayout hintFirstSelectTotalGift2 = OooOOo0().f44500OooOO0O;
        Intrinsics.checkNotNullExpressionValue(hintFirstSelectTotalGift2, "hintFirstSelectTotalGift");
        com.code.android.util.o000O.OooO0O0(hintFirstSelectTotalGift2);
    }

    public final void OooOOOo() {
        Job job;
        PopupWindow popupWindow;
        PopupWindow popupWindow2 = this.f58891OooOoo0;
        boolean z = false;
        if ((popupWindow2 != null && popupWindow2.isShowing()) && (popupWindow = this.f58891OooOoo0) != null) {
            popupWindow.dismiss();
        }
        Job job2 = this.f58892OooOooO;
        if (job2 != null && job2.isActive()) {
            z = true;
        }
        if (!z || (job = this.f58892OooOooO) == null) {
            return;
        }
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
    }

    public final GiftCustomMadeWebManager OooOOo() {
        return (GiftCustomMadeWebManager) this.f58884OooOo00.getValue();
    }

    public final p407o0Oo0OOO.o0O0o OooOOo0() {
        return (p407o0Oo0OOO.o0O0o) this.f58872OooOO0.getValue();
    }

    public final i1 OooOOoo() {
        return (i1) this.f58890OooOoo.getValue();
    }

    public final void OooOo(boolean z) {
        if (z) {
            ConstraintLayout constraintLayout = OooOOo0().f44491OooO00o;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            com.code.android.util.o000O.OooO0O0(constraintLayout);
        } else {
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            oo0oO0.OooOoOO();
            ConstraintLayout constraintLayout2 = OooOOo0().f44491OooO00o;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
            com.code.android.util.o000O.OooOOOO(constraintLayout2);
        }
    }

    public final void OooOo0() {
        if (this.f38483OooO0O0.isShowing()) {
            if (this.f58869OooO == GiftPropTypeShow.InRoom) {
                if (com.yalla.yalla.service.room.OooO00o.f24527OooOO0.f48581OooO0OO.size() <= 1) {
                    OooOoOO(Oooo000.f58849OooO0o0);
                } else if (Intrinsics.areEqual(this.f58877OooOOOO, Oooo000.f58849OooO0o0)) {
                    OooOoOO(Oooo000.f58850OooO0oO);
                }
            }
            OooOoO(this.f58878OooOOOo);
            if (!this.f58889OooOoOO) {
                if (!this.f58886OooOo0o.f58840OooO00o.isEmpty()) {
                    GiftPropModel giftPropModel = this.f58879OooOOo;
                    if (giftPropModel == null) {
                        OooOo0O(0, null);
                    } else {
                        int i = 0;
                        int i2 = -1;
                        for (Object obj : this.f58882OooOo) {
                            int i3 = i + 1;
                            if (i < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            if (giftPropModel.getTypeUser() == ((Number) obj).intValue() && i2 == -1) {
                                i2 = i;
                            }
                            i = i3;
                        }
                        OooOo0O(i2 != -1 ? i2 : 0, Integer.valueOf(giftPropModel.getGiftId()));
                    }
                }
                this.f58889OooOoOO = true;
            }
            ConstraintLayout constraintLayout = OooOOo0().f44502OooOOO;
            o00OO.OooO00o oooO00o = this.f58871OooO0oo;
            constraintLayout.setBackground(com.code.android.util.o0000.OooO0O0(oooO00o.f58953OooO00o));
            TextView textView = OooOOo0().f44513OooOo0o;
            int i4 = oooO00o.f58958OooO0o0;
            textView.setTextColor(com.code.android.util.o0000.OooO00o(i4));
            OooOOo0().f44498OooO0oo.setTextColor(com.code.android.util.o0000.OooO00o(i4));
            GiftView giftView = this.f58880OooOOo0;
            if (giftView != null) {
                giftView.setSelectedGift(true);
            }
        }
    }

    public final void OooOo00(GiftPropModel giftPropModel) {
        String string;
        if (this.f58894Oooo000) {
            return;
        }
        this.f58896Oooo00o = giftPropModel;
        ConstraintLayout layoutSendGiftEffect = OooOOo0().f44505OooOOOo;
        Intrinsics.checkNotNullExpressionValue(layoutSendGiftEffect, "layoutSendGiftEffect");
        com.code.android.util.o000O.OooOOOO(layoutSendGiftEffect);
        if (giftPropModel.isBlind() && p425o0OoO0OO.oOO00O.OooO0o(giftPropModel.getLocalSendResultImageUrl())) {
            String localSendResultImageUrl = giftPropModel.getLocalSendResultImageUrl();
            string = com.code.android.util.o0OoOo0.OooOOO(localSendResultImageUrl != null ? StringsKt.trim((CharSequence) localSendResultImageUrl).toString() : null, "");
        } else {
            string = StringsKt.trim((CharSequence) giftPropModel.getImageUrl()).toString();
        }
        SVGAView sVGAView = OooOOo0().f44497OooO0oO;
        int i = p565o0oOo000.o0OOO0o.icon_gift_default_gray;
        sVGAView.f13243OooOooO = i;
        sVGAView.setImageResource(i);
        sVGAView.OooOO0O(string, null);
        OooOOo0().f44495OooO0o.setNumber(giftPropModel.getLocalCount());
        ((AnimatorSet) this.f58895Oooo00O.getValue()).start();
    }

    public final void OooOo0O(int i, Integer num) {
        OooOo oooOo = this.f58886OooOo0o;
        oooOo.f58843OooO0Oo = i;
        ArrayList arrayList = oooOo.f58840OooO00o;
        if (arrayList.size() > oooOo.f58843OooO0Oo) {
            OooOOo0().f44516OooOoOO.setCurrentItem(oooOo.f58843OooO0Oo);
            this.f58875OooOOO = (GiftSendFragment) arrayList.get(oooOo.f58843OooO0Oo);
        }
        if (num == null) {
            GiftSendFragment giftSendFragment = this.f58875OooOOO;
            if (giftSendFragment != null) {
                GiftSendFragment.initGiftId$default(giftSendFragment, 0, 1, null);
                return;
            }
            return;
        }
        GiftSendFragment giftSendFragment2 = this.f58875OooOOO;
        if (giftSendFragment2 != null) {
            giftSendFragment2.setGiftId(num.intValue());
        }
    }

    public final void OooOo0o(View view, GiftPropModel giftPropModel) {
        PopupWindow popupWindow;
        if (view == null || giftPropModel == null || (popupWindow = this.f58891OooOoo0) != null) {
            return;
        }
        boolean z = true;
        if (popupWindow != null && popupWindow.isShowing()) {
            return;
        }
        if (giftPropModel.getIsWeek()) {
            OooOOoo().f43921OooO0O0.setBackgroundResource(p565o0oOo000.o0OOO0o.ic_gift_tag_week);
            OooOOoo().f43924OooO0o0.setText(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.room_gift_popup_title_week_gift));
            OooOOoo().f43923OooO0Oo.setText(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.room_gift_popup_content_week_gift));
        } else if (giftPropModel.getIsLuck()) {
            OooOOoo().f43921OooO0O0.setBackgroundResource(p565o0oOo000.o0OOO0o.ic_gift_tag_luck);
            OooOOoo().f43924OooO0o0.setText(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.room_gift_popup_title_luck_gift));
            OooOOoo().f43923OooO0Oo.setText(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.room_gift_popup_content_luck_gift));
        } else if (giftPropModel.isCustomMade()) {
            OooOOoo().f43921OooO0O0.setBackgroundResource(p565o0oOo000.oo0o0Oo.ic_gift_tag_custom_made);
            OooOOoo().f43924OooO0o0.setText(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.room_gift_popup_title_custom_made_gift_title));
            OooOOoo().f43923OooO0Oo.setText(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.room_gift_popup_title_custom_made_gift_content));
        } else if (giftPropModel.isBlind()) {
            OooOOoo().f43921OooO0O0.setBackgroundResource(p565o0oOo000.o0OOO0o.ic_gift_tag_blind);
            OooOOoo().f43924OooO0o0.setText(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.room_gift_popup_title_blind_gift));
            OooOOoo().f43923OooO0Oo.setText(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.room_gift_popup_content_blind_gift));
        } else if (giftPropModel.isAllSiteGift()) {
            OooOOoo().f43921OooO0O0.setBackgroundResource(p565o0oOo000.o0OOO0o.ic_gift_tag_diamond);
            OooOOoo().f43924OooO0o0.setText(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.room_gift_popup_title_full_site_gift));
            OooOOoo().f43923OooO0Oo.setText(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.room_gift_popup_content_full_site_gift));
        } else if (giftPropModel.getIsDyEffect()) {
            OooOOoo().f43921OooO0O0.setBackgroundResource(p565o0oOo000.o0OOO0o.ic_gift_tag_dy_effect);
            OooOOoo().f43924OooO0o0.setText(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.room_gift_popup_title_activity_gift));
            OooOOoo().f43923OooO0Oo.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.room_gift_popup_content_dyeffect), String.valueOf(giftPropModel.getDyEffectLimitNumber())));
        } else if (giftPropModel.getIsSoundEffect()) {
            OooOOoo().f43921OooO0O0.setBackgroundResource(p565o0oOo000.o0OOO0o.ic_gift_tag_sound_effect);
            OooOOoo().f43924OooO0o0.setText(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.gift_sound_gifts_title));
            OooOOoo().f43923OooO0Oo.setText(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.gift_sound_gifts_content));
        } else if (giftPropModel.getIsHot()) {
            OooOOoo().f43921OooO0O0.setBackgroundResource(p565o0oOo000.o0OOO0o.ic_gift_tag_activity);
            OooOOoo().f43924OooO0o0.setText(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.room_gift_popup_title_activity_gift));
            OooOOoo().f43923OooO0Oo.setText(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.room_gift_popup_content_activity_gift));
        } else {
            OooOOoo().f43921OooO0O0.setBackgroundResource(0);
            OooOOoo().f43924OooO0o0.setText((CharSequence) null);
            OooOOoo().f43923OooO0Oo.setText((CharSequence) null);
            z = false;
        }
        if (z) {
            h0.OooO0O0("302005");
            OooOOO0 oooOOO0 = new OooOOO0(OooOOoo().f43920OooO00o);
            this.f58891OooOoo0 = oooOOO0;
            oooOOO0.setTouchable(false);
            OooOOoo().f43920OooO00o.measure(0, 0);
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            ViewGroup.LayoutParams layoutParams = OooOOoo().f43922OooO0OO.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            int measuredWidth = (OooOOoo().f43920OooO00o.getMeasuredWidth() - view.getWidth()) / 2;
            int i = iArr[0];
            if (i == 0) {
                layoutParams2.setMarginStart(p596o0oo000O.OooO0o.OooO0o0() ? (OooOOoo().f43920OooO00o.getMeasuredWidth() - view.getWidth()) / 2 : (view.getWidth() - OooOOoo().f43920OooO00o.getMeasuredWidth()) / 2);
            } else if (i == p425o0OoO0OO.o000.f46630OooO00o - view.getWidth()) {
                layoutParams2.setMarginStart(p596o0oo000O.OooO0o.OooO0o0() ? (view.getWidth() - OooOOoo().f43920OooO00o.getMeasuredWidth()) / 2 : (OooOOoo().f43920OooO00o.getMeasuredWidth() - view.getWidth()) / 2);
            } else {
                layoutParams2.setMarginStart(0);
            }
            OooOOoo().f43922OooO0OO.setLayoutParams(layoutParams2);
            PopupWindow popupWindow2 = this.f58891OooOoo0;
            if (popupWindow2 != null) {
                popupWindow2.showAsDropDown(view, (view.getWidth() - OooOOoo().f43920OooO00o.getMeasuredWidth()) / 2, (-view.getHeight()) - OooOOoo().f43920OooO00o.getMeasuredHeight(), p596o0oo000O.OooO0o.OooO0o0() ? 8388613 : 8388611);
            }
            this.f58892OooOooO = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getDefault(), null, new OooOOO(null), 2, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    public final void OooOoO(int i) {
        this.f58878OooOOOo = i;
        OooOOo0().f44498OooO0oo.setText(String.valueOf(this.f58878OooOOOo));
        Drawable drawableOooO0O0 = com.code.android.util.o0000.OooO0O0(this.f58871OooO0oo.f58959OooO0oO);
        int i2 = OooO00o.$EnumSwitchMapping$0[this.f58869OooO.ordinal()];
        boolean z = false;
        if (i2 == 1) {
            RoomUserInfoModel roomUserInfoModel = this.f58877OooOOOO;
            RoomUserInfoModel roomUserInfoModel2 = Oooo000.f58849OooO0o0;
            if (Intrinsics.areEqual(roomUserInfoModel, Oooo000.f58848OooO0o)) {
                drawableOooO0O0 = null;
            } else if (Intrinsics.areEqual(this.f58877OooOOOO, Oooo000.f58850OooO0oO)) {
                GiftPropModel giftPropModel = this.f58879OooOOo;
                if (giftPropModel != null && giftPropModel.isBlind()) {
                    z = true;
                }
                if (z) {
                    drawableOooO0O0 = null;
                }
            }
        } else if (i2 == 3 || i2 == 4) {
            GiftPropModel giftPropModel2 = this.f58879OooOOo;
            if (giftPropModel2 != null && giftPropModel2.isBlind()) {
                z = true;
            }
            if (z) {
                drawableOooO0O0 = null;
            }
        }
        p572o0oOoO.o000O000.OooO00o(OooOOo0().f44498OooO0oo, drawableOooO0O0, ViewLocation.end, p596o0oo000O.OooO0o.OooO0o0());
    }

    public final void OooOoO0() {
        p585o0oOoo00.o00000OO.f56637OooOo0O.observe(this.f58870OooO0oO, new OooOO0O(new OooOOOO()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOoOO(RoomUserInfoModel roomUserInfoModel) {
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        Long l = (Long) oo0oO0.OooOOo0().getValue();
        long jLongValue = roomUserInfoModel.getUserId().getValue().longValue();
        if (l == null || l.longValue() != jLongValue) {
            this.f58877OooOOOO = roomUserInfoModel;
        }
        RoomUserInfoModel user = this.f58877OooOOOO;
        GiftCustomMadeWebManager giftCustomMadeWebManagerOooOOo = OooOOo();
        giftCustomMadeWebManagerOooOOo.getClass();
        Intrinsics.checkNotNullParameter(user, "user");
        giftCustomMadeWebManagerOooOOo.f27537OooO0o = user;
        giftCustomMadeWebManagerOooOOo.OooO0OO();
        OooOOo0().f44515OooOoO0.setRotationX(0.0f);
        OooOOo0().f44513OooOo0o.setGravity(8388611);
        if (Intrinsics.areEqual(user, Oooo000.f58849OooO0o0)) {
            OooOOo0().f44513OooOo0o.setGravity(17);
            OooOOo0().f44513OooOo0o.setText("--");
            NetImageView ivHead = OooOOo0().f44503OooOOO0;
            Intrinsics.checkNotNullExpressionValue(ivHead, "ivHead");
            com.code.android.util.o000O.OooO0O0(ivHead);
            OooOOo0().f44506OooOOo.setBackgroundResource(p565o0oOo000.o0OOO0o.shape_bg_gift_dialog_send_user);
            OooOOo0().f44514OooOoO.setBackgroundColor(com.code.android.util.o0000.OooO00o(p565o0oOo000.o0ooOOo.color_00d8c9));
            OooOOo0().f44501OooOO0o.setBackground(null);
        } else if (Intrinsics.areEqual(user, Oooo000.f58850OooO0oO)) {
            NetImageView ivHead2 = OooOOo0().f44503OooOOO0;
            Intrinsics.checkNotNullExpressionValue(ivHead2, "ivHead");
            com.code.android.util.o000O.OooOOOO(ivHead2);
            OooOOo0().f44513OooOo0o.setText(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.room_dialog_send_gift_all_in_mic));
            OooOOo0().f44503OooOOO0.setImageResource(p565o0oOo000.o0OOO0o.room_dialog_all_in_mic);
            OooOOo0().f44506OooOOo.setBackgroundResource(p565o0oOo000.o0OOO0o.shape_bg_gift_dialog_send_user);
            OooOOo0().f44514OooOoO.setBackgroundColor(com.code.android.util.o0000.OooO00o(p565o0oOo000.o0ooOOo.color_00d8c9));
            OooOOo0().f44501OooOO0o.setBackground(null);
        } else if (Intrinsics.areEqual(user, Oooo000.f58848OooO0o)) {
            NetImageView ivHead3 = OooOOo0().f44503OooOOO0;
            Intrinsics.checkNotNullExpressionValue(ivHead3, "ivHead");
            com.code.android.util.o000O.OooO0O0(ivHead3);
            OooOOo0().f44513OooOo0o.setText(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.Everyone_in_room));
            OooOOo0().f44506OooOOo.setBackgroundResource(p565o0oOo000.o0OOO0o.shape_bg_gift_dialog_send_user);
            OooOOo0().f44501OooOO0o.setBackgroundResource(p565o0oOo000.o0OOO0o.shape_bg_dialog_gift_user_all_seleted);
            OooOOo0().f44514OooOoO.setBackgroundColor(com.code.android.util.o0000.OooO00o(p565o0oOo000.o0ooOOo.color_00d8c9));
        } else {
            NetImageView ivHead4 = OooOOo0().f44503OooOOO0;
            Intrinsics.checkNotNullExpressionValue(ivHead4, "ivHead");
            com.code.android.util.o000O.OooOOOO(ivHead4);
            OooOOo0().f44513OooOo0o.setText(user.getUserName().getValue());
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this.f38482OooO00o);
            oooO00o.f43127OooO0OO = p405o0Oo0OO.OooO0OO.OooO00o(user.getUserHeader().getValue());
            oooO00o.f43125OooO00o = 0;
            oooO00o.OooO00o(o0O0O0Oo.OooO0OO());
            oooO00o.OooO0Oo(OooOOo0().f44503OooOOO0);
            OooOOo0().f44506OooOOo.setBackgroundResource(p565o0oOo000.o0OOO0o.shape_bg_gift_dialog_send_user);
            OooOOo0().f44514OooOoO.setBackgroundColor(com.code.android.util.o0000.OooO00o(p565o0oOo000.o0ooOOo.color_00d8c9));
            OooOOo0().f44501OooOO0o.setBackground(null);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.f58870OooO0oO), null, null, new OooOo00(user, this, null), 3, null);
        }
        OooOOo0().f44513OooOo0o.invalidate();
        OooOOo0().f44513OooOo0o.requestLayout();
    }
}
