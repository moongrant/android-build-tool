package p511o0o0O;

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
import androidx.appcompat.widget.o0000O0O;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.OooO0OO;
import androidx.viewpager2.widget.ViewPager2;
import com.code.android.uikit.marquee.MarqueeText;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000000;
import com.code.android.util.o0000O;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000O00O;
import com.code.android.util.o0OoOo0;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p205o00o0o0o.o0000OO0;
import p405o0Oo0OOO.e3;
import p405o0Oo0OOO.h1;
import p405o0Oo0OOO.o0O0o;
import p414o0Oo0oO.oO0OOo0o;
import p415o0Oo0oO0.o00Ooo;
import p423o0OoO0OO.o0000;
import p423o0OoO0OO.o00000;
import p423o0OoO0OO.o000000O;
import p423o0OoO0OO.o0000O00;
import p423o0OoO0OO.o0000Ooo;
import p423o0OoO0OO.o000O000;
import p423o0OoO0OO.o00O00OO;
import p423o0OoO0OO.o00O0OOO;
import p423o0OoO0OO.oo0oOO0;
import p429o0OoOO.o00oO0o;
import p429o0OoOO.oo000o;
import p475o0Ooooo0.o0O00oO0;
import p476o0OooooO.o0OOo000;
import p483o0o000Oo.o000OOo;
import p491o0o00O0o.o0OO00O;
import p491o0o00O0o.o0OOO0o;
import p491o0o00O0o.o0Oo0oo;
import p492o0o00OO0.oO000;
import p492o0o00OO0.oO0000Oo;
import p492o0o00OO0.oO000O0;
import p511o0o0O.OooOo;
import p511o0o0O.Oooo000;
import p511o0o0O.o00000OO;
import p511o0o0O.o00O0OO;
import p511o0o0O.oo0o0O0;
import p562o0oOo000.oo0o0Oo;
import p563o0oOo00O.o0O0O00;
import p573o0oOoOO.o0O0o0;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nGiftSendDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftSendDialog.kt\ncom/yalla/yalla/ui/dialog/giftDialog/GiftSendDialog\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1595:1\n23#2:1596\n215#3,2:1597\n215#3,2:1604\n1864#4,3:1599\n1855#4:1602\n1856#4:1606\n1855#4,2:1607\n1#5:1603\n*S KotlinDebug\n*F\n+ 1 GiftSendDialog.kt\ncom/yalla/yalla/ui/dialog/giftDialog/GiftSendDialog\n*L\n113#1:1596\n833#1:1597,2\n963#1:1604,2\n1109#1:1599,3\n957#1:1602\n957#1:1606\n976#1:1607,2\n*E\n"})
public final class o00000OO extends o0000OO0<o00000OO> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final GiftPropTypeShow f50958OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f50959OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final o00OO.OooO00o f50960OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final o000O0 f50961OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public Function1<? super GiftPropModel, Unit> f50962OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public Function2<? super WebPageInfo, ? super Boolean, Unit> f50963OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public GiftSendFragment f50964OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public Function1<? super WebPageInfo, Unit> f50965OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public RoomUserInfoModel f50966OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f50967OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public GiftPropModel f50968OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public GiftView f50969OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final Lazy f50970OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final ArrayList f50971OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f50972OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final Lazy f50973OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f50974OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final OooOo f50975OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public RoomUserInfoModel f50976OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    public o0O0O00 f50977OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f50978OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @NotNull
    public final Lazy f50979OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @Nullable
    public PopupWindow f50980OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @Nullable
    public Job f50981OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @NotNull
    public final ArrayList f50982OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f50983Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @NotNull
    public final Lazy f50984Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @Nullable
    public GiftPropModel f50985Oooo00o;

    public static final class OooO extends Lambda implements Function0<GiftCustomMadeWebManager> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final GiftCustomMadeWebManager invoke() {
            o00000OO o00000oo2 = o00000OO.this;
            FragmentActivity fragmentActivity = o00000oo2.f50959OooO0oO;
            FrameLayout overrideGiftContainer = o00000oo2.OooOOo0().f44518OooOOoo;
            Intrinsics.checkNotNullExpressionValue(overrideGiftContainer, "overrideGiftContainer");
            GiftCustomMadeWebManager giftCustomMadeWebManager = new GiftCustomMadeWebManager(fragmentActivity, overrideGiftContainer);
            giftCustomMadeWebManager.f27523OooO = new o00O0OO0(o00000oo2);
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
            SVGAView imageView = o00000oo2.OooOOo0().f44507OooO0oO;
            Intrinsics.checkNotNullExpressionValue(imageView, "giftEffectImage");
            GiftNumberView countView = o00000oo2.OooOOo0().f44505OooO0o;
            Intrinsics.checkNotNullExpressionValue(countView, "giftCount");
            o0000Ooo o0000ooo = new o0000Ooo(o00000oo2);
            o0000 o0000Var = new o0000(o00000oo2);
            o0000O00 o0000o00 = new o0000O00(o00000oo2);
            Intrinsics.checkNotNullParameter(imageView, "imageView");
            Intrinsics.checkNotNullParameter(countView, "countView");
            o00000 o00000Var = new o00000(o0000ooo);
            o0000Ooo o0000ooo2 = new o0000Ooo(countView, o0000ooo, o0000Var, o0000o00);
            o0000 o0000Var2 = new o0000(o0000o00);
            o0000O00 o0000o01 = new o0000O00(o0000oo.f51005OooO0Oo);
            Intrinsics.checkNotNullParameter(imageView, "<this>");
            float fOooO0O0 = o0000O0.OooO0O0(o000O000.f46650OooO00o);
            float fOooO0O1 = o0000O0.OooO0O0(o000O000.f46651OooO0O0);
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
            animatorSet.addListener(new o000000O(o00000Var, o0000ooo2, o0000Var2, o0000o01));
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
            return new Oooo000(o00000oo2.f38487OooO00o, o00000oo2.f50960OooO0oo, o00000oo2.f50958OooO);
        }
    }

    public static final class OooO0o extends Lambda implements Function0<ViewGroup> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewGroup invoke() {
            return o00000OO.this.f38489OooO0OO;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<h1> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final h1 invoke() {
            h1 h1VarOooO00o = h1.OooO00o(View.inflate(o00000OO.this.f38487OooO00o, oo0o0Oo.room_popupwindow_setting, null));
            Intrinsics.checkNotNullExpressionValue(h1VarOooO00o, "bind(...)");
            return h1VarOooO00o;
        }
    }

    public static final class OooOO0O implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f50991OooO0Oo;

        public OooOO0O(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f50991OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f50991OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f50991OooO0Oo;
        }

        public final int hashCode() {
            return this.f50991OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f50991OooO0Oo.invoke(obj);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.giftDialog.GiftSendDialog$showIntroducingTagGiftWindow$2", f = "GiftSendDialog.kt", i = {}, l = {1400, 1401}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f50992OooO0Oo;

        @DebugMetadata(c = "com.yalla.yalla.ui.dialog.giftDialog.GiftSendDialog$showIntroducingTagGiftWindow$2$1", f = "GiftSendDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ o00000OO f50994OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(o00000OO o00000oo2, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f50994OooO0Oo = o00000oo2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f50994OooO0Oo, continuation);
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
                PopupWindow popupWindow = this.f50994OooO0Oo.f50980OooOoo0;
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
            int i = this.f50992OooO0Oo;
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
            this.f50992OooO0Oo = 1;
            if (DelayKt.delay(3000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            OooO00o oooO00o = new OooO00o(o00000OO.this, null);
            this.f50992OooO0Oo = 2;
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
            o00000oo2.f50980OooOoo0 = null;
            Job job = o00000oo2.f50981OooOooO;
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
                webPageInfo.f32285OooO0oo = false;
                webPageInfo.f32280OooO = true;
                Intrinsics.checkNotNull(url);
                Intrinsics.checkNotNullParameter(url, "url");
                webPageInfo.f32283OooO0o0 = url;
                webPageInfo.f32291OooOOOO = o0OOo000.f48310o00O0Oo;
                Function2<? super WebPageInfo, ? super Boolean, Unit> function2 = o00000OO.this.f50963OooOO0o;
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
        public final /* synthetic */ RoomUserInfoModel f50997OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o00000OO f50998OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(RoomUserInfoModel roomUserInfoModel, o00000OO o00000oo2, Continuation<? super OooOo00> continuation) {
            super(2, continuation);
            this.f50997OooO0Oo = roomUserInfoModel;
            this.f50998OooO0o0 = o00000oo2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOo00(this.f50997OooO0Oo, this.f50998OooO0o0, continuation);
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
            RoomUserInfoModel roomUserInfoModel = this.f50997OooO0Oo;
            String value = roomUserInfoModel.getUserName().getValue();
            if (roomUserInfoModel.getUserId().getValue().longValue() > 0) {
                value = p412o0Oo0o0O.o000O000.OooO0O0(roomUserInfoModel.getUserId().getValue().longValue(), value);
            }
            this.f50998OooO0o0.OooOOo0().f44523OooOo0o.setText(value);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:20:0x027a  */
    /* JADX WARN: Multi-variable type inference failed */
    public o00000OO(@NotNull FragmentActivity currentActivity, @NotNull o00OO.OooO00o theme, @NotNull GiftPropTypeShow showIn) {
        super(currentActivity);
        Intrinsics.checkNotNullParameter(currentActivity, "currentActivity");
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(showIn, "showIn");
        this.f50959OooO0oO = currentActivity;
        this.f50960OooO0oo = theme;
        this.f50958OooO = showIn;
        this.f50961OooOO0 = new o000O0(Reflection.getOrCreateKotlinClass(o0O0o.class), this.f38487OooO00o, new OooO0o());
        this.f50966OooOOOO = Oooo000.f50937OooO0o0;
        int i = 1;
        this.f50967OooOOOo = 1;
        this.f50970OooOOoo = LazyKt.lazy(new OooO0OO());
        this.f50973OooOo00 = LazyKt.lazy(new OooO());
        this.f50972OooOo0 = new LinkedHashMap();
        this.f50974OooOo0O = new LinkedHashMap();
        OooOo oooOo = new OooOo(currentActivity);
        this.f50975OooOo0o = oooOo;
        this.f50971OooOo = new ArrayList();
        Window windowOooO0Oo = OooO0Oo();
        if (windowOooO0Oo != null) {
            windowOooO0Oo.setWindowAnimations(p562o0oOo000.o000000O.anim_bottom_top_bottom);
        }
        OooO0oo();
        ConstraintLayout constraintLayout = OooOOo0().f44501OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        int i2 = o000O000.f46650OooO00o;
        Object systemService = o000O00O.OooO00o().getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Point point = new Point();
        ((WindowManager) systemService).getDefaultDisplay().getSize(point);
        oo0oOO0.OooO0O0(constraintLayout, point.y);
        OooOOo0().f44522OooOo0O.setDialog(this);
        int i3 = 0;
        p391o0OOooo0.oo0o0Oo.OooO0Oo(false);
        ConstraintLayout constraintLayout2 = OooOOo0().f44501OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
        OooO0oO(constraintLayout2);
        int i4 = OooO00o.$EnumSwitchMapping$0[showIn.ordinal()];
        int i5 = 3;
        int i6 = 2;
        if (i4 == 1) {
            ImageView userUp = OooOOo0().f44525OooOoO0;
            Intrinsics.checkNotNullExpressionValue(userUp, "userUp");
            o000O.OooOOOO(userUp);
            ImageView ivAllRoom = OooOOo0().f44511OooOO0o;
            Intrinsics.checkNotNullExpressionValue(ivAllRoom, "ivAllRoom");
            o000O.OooOOOO(ivAllRoom);
            View vLine = OooOOo0().f44524OooOoO;
            Intrinsics.checkNotNullExpressionValue(vLine, "vLine");
            o000O.OooOOOO(vLine);
            ConstraintLayout layoutSendGiftEffect = OooOOo0().f44515OooOOOo;
            Intrinsics.checkNotNullExpressionValue(layoutSendGiftEffect, "layoutSendGiftEffect");
            o000O.OooO0O0(layoutSendGiftEffect);
        } else if (i4 == 2) {
            ImageView userUp2 = OooOOo0().f44525OooOoO0;
            Intrinsics.checkNotNullExpressionValue(userUp2, "userUp");
            o000O.OooO0O0(userUp2);
            ImageView ivAllRoom2 = OooOOo0().f44511OooOO0o;
            Intrinsics.checkNotNullExpressionValue(ivAllRoom2, "ivAllRoom");
            o000O.OooO0O0(ivAllRoom2);
            View vLine2 = OooOOo0().f44524OooOoO;
            Intrinsics.checkNotNullExpressionValue(vLine2, "vLine");
            o000O.OooO0O0(vLine2);
            ConstraintLayout layoutSendGiftEffect2 = OooOOo0().f44515OooOOOo;
            Intrinsics.checkNotNullExpressionValue(layoutSendGiftEffect2, "layoutSendGiftEffect");
            o000O.OooO0O0(layoutSendGiftEffect2);
        } else if (i4 == 3 || i4 == 4) {
            ImageView userUp3 = OooOOo0().f44525OooOoO0;
            Intrinsics.checkNotNullExpressionValue(userUp3, "userUp");
            o000O.OooO0O0(userUp3);
            ImageView ivAllRoom3 = OooOOo0().f44511OooOO0o;
            Intrinsics.checkNotNullExpressionValue(ivAllRoom3, "ivAllRoom");
            o000O.OooO0O0(ivAllRoom3);
            View vLine3 = OooOOo0().f44524OooOoO;
            Intrinsics.checkNotNullExpressionValue(vLine3, "vLine");
            o000O.OooO0O0(vLine3);
            ConstraintLayout layoutSendGiftEffect3 = OooOOo0().f44515OooOOOo;
            Intrinsics.checkNotNullExpressionValue(layoutSendGiftEffect3, "layoutSendGiftEffect");
            o000O.OooO0OO(layoutSendGiftEffect3);
        }
        GiftTopTipsView giftTopTipsView = OooOOo0().f44522OooOo0O;
        giftTopTipsView.getGiftBlindView().setGiftBlindListener(new o000O00O(this, giftTopTipsView));
        giftTopTipsView.setGiftCustomMadeClickListener(new o000O0(this));
        giftTopTipsView.getGiftTypeNotUpView().setViewListener(new o000O0Oo(this));
        giftTopTipsView.setGiftBlindClickListener(new o000OO0O(this));
        giftTopTipsView.setGiftNewClickListener(new o000O0O0(this));
        giftTopTipsView.setGiftWeekStarClickListener(new o000O(this));
        giftTopTipsView.setGiftMergeClickListener(new o000OO00(this));
        OooOOo0().f44518OooOOoo.setOnClickListener(new oO0000Oo(this, i));
        ImageView ivAllRoom4 = OooOOo0().f44511OooOO0o;
        Intrinsics.checkNotNullExpressionValue(ivAllRoom4, "ivAllRoom");
        o000O.OooO(ivAllRoom4, new o00O000(this));
        LinearLayout layoutUser = OooOOo0().f44516OooOOo;
        Intrinsics.checkNotNullExpressionValue(layoutUser, "layoutUser");
        o000O.OooO(layoutUser, new o00O00O(this));
        TextView giftNum = OooOOo0().f44508OooO0oo;
        Intrinsics.checkNotNullExpressionValue(giftNum, "giftNum");
        o000O.OooO(giftNum, new o00O00o0(this));
        TextView tvSend = OooOOo0().f44519OooOo;
        Intrinsics.checkNotNullExpressionValue(tvSend, "tvSend");
        o000O.OooO(tvSend, new oo00o(this));
        TextView crystal = OooOOo0().f44503OooO0OO;
        Intrinsics.checkNotNullExpressionValue(crystal, "crystal");
        o000O.OooO(crystal, new o00O0(this));
        TextView coin = OooOOo0().f44502OooO0O0;
        Intrinsics.checkNotNullExpressionValue(coin, "coin");
        o000O.OooO(coin, new o00O0O00(this));
        ImageView firstChargeReward = OooOOo0().f44506OooO0o0;
        Intrinsics.checkNotNullExpressionValue(firstChargeReward, "firstChargeReward");
        o000O.OooO(firstChargeReward, new o00O0O0O(this));
        if (o000000.OooO00o(Integer.valueOf(o00Ooo.OooO00o().OooO0OO("firstRecharge", 0)))) {
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (o0OoOo0.OooO00o((Boolean) ((MutableLiveData) o0O00oO0.f47974Oooo0o0.getValue()).getValue())) {
                ImageView firstChargeReward2 = OooOOo0().f44506OooO0o0;
                Intrinsics.checkNotNullExpressionValue(firstChargeReward2, "firstChargeReward");
                o000O.OooO0O0(firstChargeReward2);
            } else {
                ImageView firstChargeReward3 = OooOOo0().f44506OooO0o0;
                Intrinsics.checkNotNullExpressionValue(firstChargeReward3, "firstChargeReward");
                o000O.OooOOOO(firstChargeReward3);
            }
        } else {
            ImageView firstChargeReward4 = OooOOo0().f44506OooO0o0;
            Intrinsics.checkNotNullExpressionValue(firstChargeReward4, "firstChargeReward");
            o000O.OooO0O0(firstChargeReward4);
        }
        GiftWealthView giftWealthView = OooOOo0().f44500OooO;
        giftWealthView.OooO0O0(currentActivity);
        giftWealthView.setToWealthLevelListener(new o000OOo0(this));
        giftWealthView.setToRechargeListener(new o00(this));
        LinearLayout hintFirstSelectTotalGift = OooOOo0().f44510OooOO0O;
        Intrinsics.checkNotNullExpressionValue(hintFirstSelectTotalGift, "hintFirstSelectTotalGift");
        o000O.OooO(hintFirstSelectTotalGift, new o00O0000(this));
        LinearLayout hintFirstSelectAllUser = OooOOo0().f44509OooOO0;
        Intrinsics.checkNotNullExpressionValue(hintFirstSelectAllUser, "hintFirstSelectAllUser");
        o000O.OooO(hintFirstSelectAllUser, new o0O0ooO(this));
        ImageView sendCustomGiftWarn = OooOOo0().f44521OooOo00;
        Intrinsics.checkNotNullExpressionValue(sendCustomGiftWarn, "sendCustomGiftWarn");
        o000O.OooO(sendCustomGiftWarn, new o00oOoo(this));
        OooOoOO(this.f50966OooOOOO);
        oooOo.f50933OooO0o0 = new o0000O0O(this);
        OooOOo0().f44526OooOoOO.setAdapter(oooOo);
        MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = p391o0OOooo0.oo0o0Oo.f43573OooO00o;
        p391o0OOooo0.oo0o0Oo.OooO0o0(currentActivity, new o00000O(this, i3));
        o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
        o0O00oO0.OooO0O0().observe(currentActivity, new OooOO0O(new o000Oo0(this)));
        o0O00oO0.OooO0Oo().observe(currentActivity, new OooOO0O(new o000O00(this)));
        Class cls = Boolean.TYPE;
        LiveEventBus.get("JoinRoomDialogFromGiftSendDialogLink", cls).observe(currentActivity, new oo000o(this, i5));
        LiveEventBus.get("QuickRechargeDialogFromGiftSendDialog", cls).observe(currentActivity, new o00oO0o(this, i5));
        LiveEventBus.get("GiftSendDialogWealthLevelUnlock", cls).observe(currentActivity, new p433o0OoOOO0.o0000(this, i6));
        LiveEventBus.get("ReceiveCrystalDialogFromGiftSendDialog", cls).observe(currentActivity, new p433o0OoOOO0.o0000O00(this, i6));
        LiveEventBus.get("UserWealthLevel_Change", cls).observe(currentActivity, new oO000(this, i));
        this.f38488OooO0O0.f38482OooO0Oo.addObserver(new DefaultLifecycleObserver() { // from class: com.yalla.yalla.ui.dialog.giftDialog.GiftSendDialog$initObserve$8

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            @NotNull
            public final OooO00o f27574OooO0Oo;

            public static final class OooO00o extends ViewPager2.OnPageChangeCallback {

                /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
                public final /* synthetic */ o00000OO f27576OooO00o;

                public OooO00o(o00000OO o00000oo2) {
                    this.f27576OooO00o = o00000oo2;
                }

                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public final void onPageSelected(int i) {
                    super.onPageSelected(i);
                    o00000OO o00000oo2 = this.f27576OooO00o;
                    if (!o00000oo2.f50975OooOo0o.f50928OooO00o.isEmpty()) {
                        OooOo oooOo = o00000oo2.f50975OooOo0o;
                        if (oooOo.f50928OooO00o.size() > i) {
                            o00000oo2.f50964OooOOO = (GiftSendFragment) oooOo.f50928OooO00o.get(i);
                            o00000OO.OooOOO(o00000oo2);
                            Iterator it = oooOo.f50930OooO0OO.entrySet().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                Map.Entry entry = (Map.Entry) it.next();
                                if (Intrinsics.areEqual(oooOo.f50929OooO0O0.get(i), entry.getKey())) {
                                    oooOo.f50930OooO0OO.put(entry.getKey(), 0L);
                                    o0O0O00 o0o0o00 = o00000oo2.f50977OooOoO0;
                                    if (o0o0o00 != null) {
                                        o0o0o00.OooO0O0((String) entry.getKey(), ((Number) entry.getValue()).longValue() > 0);
                                    }
                                }
                            }
                            GiftSendFragment giftSendFragment = o00000oo2.f50964OooOOO;
                            if (giftSendFragment != null) {
                                if (giftSendFragment.getPageTypeUser() == GiftPropTypeUser.Backpack.getValue()) {
                                    oO0OOo0o oo0ooo0oOooO0o0 = o00Ooo.OooO0o0();
                                    oo0ooo0oOooO0o0.getClass();
                                    o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                                    if (!oo0ooo0oOooO0o0.OooO0O0("giftBackpackFirstReminderTips" + o0O00oO0.OooOOo0().getValue(), false)) {
                                        p205o00o0o0o.o000O o000o = new p205o00o0o0o.o000O(o00000oo2.f50959OooO0oO);
                                        o000o.OooOoO0(p562o0oOo000.o000000.backpack_info_title);
                                        o000o.OooOOoo(p562o0oOo000.o000000.backpack_info_content);
                                        o000o.OooOo0(oo0o0O0.f51071OooO0Oo);
                                        o000o.OooOO0o();
                                    }
                                    oO0OOo0o oo0ooo0oOooO0o1 = o00Ooo.OooO0o0();
                                    oo0ooo0oOooO0o1.getClass();
                                    o0000O0O.OooO0O0("giftBackpackFirstReminderTips", o0O00oO0.OooOOo0().getValue(), oo0ooo0oOooO0o1, true);
                                    GiftSendFragment giftSendFragment2 = o00000oo2.f50964OooOOO;
                                    if (giftSendFragment2 != null) {
                                        giftSendFragment2.setResumeListener(new o00O0OO(o00000oo2));
                                    }
                                    o00000oo2.OooOOOO();
                                    if (Intrinsics.areEqual(o00000oo2.f50966OooOOOO, Oooo000.f50936OooO0o)) {
                                        o00000oo2.OooOoOO(Oooo000.f50938OooO0oO);
                                    }
                                } else {
                                    o00000oo2.OooOOo0().f44508OooO0oo.setEnabled(true);
                                    o00000oo2.OooOOo0().f44508OooO0oo.setClickable(true);
                                    o00000oo2.OooOOo0().f44519OooOo.setEnabled(true);
                                    o00000oo2.OooOOo0().f44519OooOo.setClickable(true);
                                }
                                o00Ooo.OooOO0O().OooOOOo(giftSendFragment.getPageTypeUser(), false);
                                MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = p391o0OOooo0.oo0o0Oo.f43573OooO00o;
                                int pageTypeUser = giftSendFragment.getPageTypeUser();
                                List<GiftPropAll> value = p391o0OOooo0.oo0o0Oo.f43576OooO0Oo.getValue();
                                if (value != null) {
                                    for (GiftPropAll giftPropAll : value) {
                                        if (pageTypeUser == giftPropAll.getGiftPropTypeUser()) {
                                            giftPropAll.setRedPostCountLocal(0L);
                                        }
                                    }
                                }
                                o000OOo o000ooo2 = com.yalla.yalla.service.room.OooO00o.f24527OooOOo0;
                                MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData2 = p391o0OOooo0.oo0o0Oo.f43573OooO00o;
                                o000ooo2.OooO0Oo(p391o0OOooo0.oo0o0Oo.OooO0OO());
                            }
                        }
                    }
                }
            }

            {
                this.f27574OooO0Oo = new OooO00o(this.f27575OooO0o0);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onCreate(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                OooO0OO.OooO00o(this, owner);
                this.f27575OooO0o0.OooOOo0().f44526OooOoOO.registerOnPageChangeCallback(this.f27574OooO0Oo);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onDestroy(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                OooO0OO.OooO0O0(this, owner);
                this.f27575OooO0o0.OooOOo0().f44526OooOoOO.unregisterOnPageChangeCallback(this.f27574OooO0Oo);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                OooO0OO.OooO0OO(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onResume(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                OooO0OO.OooO0Oo(this, owner);
                this.f27575OooO0o0.OooOo0();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                OooO0OO.OooO0o0(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                OooO0OO.OooO0o(this, lifecycleOwner);
            }
        });
        LiveEventBus.get("GiftSendDialogSelectGift", GiftView.class).observe(currentActivity, new oO000O0(this, i));
        LiveEventBus.get("ShowIntroducingTagGiftWindow", GiftView.class).observe(currentActivity, new o0OOO0o(this, i6));
        LiveEventBus.get("OnLongClickShowIntroducingTagGiftWindow", GiftView.class).observe(currentActivity, new o0Oo0oo(this, i5));
        LiveEventBus.get("DismissIntroducingTagGiftWindow", cls).observe(currentActivity, new o0OO00O(this, i5));
        o0O00oO0.OooO0O0().observe(currentActivity, new OooOO0O(new o0000O(this)));
        o0O00oO0.OooO0Oo().observe(currentActivity, new OooOO0O(new o0000OO0(this)));
        com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24546OooOO0o.observe(currentActivity, new OooOO0O(new o000(this)));
        o0O00oO0.OooOO0o().observe(currentActivity, new OooOO0O(new o000O000(this)));
        o0O00oO0.OooOO0().observe(currentActivity, new OooOO0O(new o000O0o(this)));
        final o000OO o000oo2 = new o000OO(this);
        this.f38488OooO0O0.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: o00o00Oo.o00000O
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i7, KeyEvent keyEvent) {
                o0000oo this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function3 function3 = o000oo2;
                if (function3 == null) {
                    return false;
                }
                Integer numValueOf = Integer.valueOf(i7);
                Intrinsics.checkNotNull(keyEvent);
                return ((Boolean) function3.invoke(this$0, numValueOf, keyEvent)).booleanValue();
            }
        });
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of com.code.android.easydialog.EasyDialog");
        this.f50979OooOoo = LazyKt.lazy(new OooOO0());
        this.f50982OooOooo = new ArrayList();
        this.f50984Oooo00O = LazyKt.lazy(new OooO0O0());
    }

    public static final void OooOOO(o00000OO o00000oo2) {
        GiftSendFragment giftSendFragment = o00000oo2.f50964OooOOO;
        if (giftSendFragment != null) {
            GiftTypeNotUpTipsView giftTypeNotUpView = o00000oo2.OooOOo0().f44522OooOo0O.getGiftTypeNotUpView();
            int pageTypeUser = giftSendFragment.getPageTypeUser();
            oo0O oo0o = new oo0O(o00000oo2, giftSendFragment);
            giftTypeNotUpView.typeUser = pageTypeUser;
            e3 e3Var = giftTypeNotUpView.f30494OooO0Oo;
            NetImageView ivFg = e3Var.f43834OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(ivFg, "ivFg");
            o000O.OooO0O0(ivFg);
            NetImageView ivFgStart = e3Var.f43835OooO0o;
            Intrinsics.checkNotNullExpressionValue(ivFgStart, "ivFgStart");
            o000O.OooO0O0(ivFgStart);
            NetImageView ivFgEnd = e3Var.f43836OooO0o0;
            Intrinsics.checkNotNullExpressionValue(ivFgEnd, "ivFgEnd");
            o000O.OooO0O0(ivFgEnd);
            NetImageView ivFlags = e3Var.f43837OooO0oO;
            Intrinsics.checkNotNullExpressionValue(ivFlags, "ivFlags");
            o000O.OooO0O0(ivFlags);
            ImageView ivType = e3Var.f43838OooO0oo;
            Intrinsics.checkNotNullExpressionValue(ivType, "ivType");
            o000O.OooO0O0(ivType);
            MarqueeText tvInfo = e3Var.f43830OooO;
            Intrinsics.checkNotNullExpressionValue(tvInfo, "tvInfo");
            o000O.OooO0O0(tvInfo);
            int i = p562o0oOo000.o0OOO0o.white;
            tvInfo.setTextColor(com.code.android.util.o0000.OooO00o(i));
            tvInfo.setText("");
            ImageView ivArrow = e3Var.f43832OooO0O0;
            Intrinsics.checkNotNullExpressionValue(ivArrow, "ivArrow");
            o000O.OooO0O0(ivArrow);
            Intrinsics.checkNotNullExpressionValue(tvInfo, "tvInfo");
            MarqueeText.OooOO0o(tvInfo);
            int value = GiftPropTypeUser.Wealth.getValue();
            NetImageView netImageView = e3Var.f43833OooO0OO;
            if (pageTypeUser == value) {
                Intrinsics.checkNotNullExpressionValue(ivFgStart, "ivFgStart");
                o000O.OooOOOO(ivFgStart);
                ivFgStart.setImageResource(p562o0oOo000.o0O0O00.ic_gift_type_not_up_tips_fg_wealth_start);
                Intrinsics.checkNotNullExpressionValue(ivFgEnd, "ivFgEnd");
                o000O.OooOOOO(ivFgEnd);
                ivFgEnd.setImageResource(p562o0oOo000.o0O0O00.ic_gift_type_not_up_tips_fg_wealth_end);
                Intrinsics.checkNotNullExpressionValue(ivType, "ivType");
                o000O.OooOOOO(ivType);
                Intrinsics.checkNotNullExpressionValue(tvInfo, "tvInfo");
                o000O.OooOOOO(tvInfo);
                Intrinsics.checkNotNullExpressionValue(ivArrow, "ivArrow");
                o000O.OooOOOO(ivArrow);
                netImageView.setImageResource(p562o0oOo000.o0O0O00.ic_gift_type_tips_bg_wealth);
                ivType.setImageResource(p562o0oOo000.o0O0O00.ic_gift_type_not_up_wealth);
                tvInfo.setTextColor(com.code.android.util.o0000.OooO00o(i));
                tvInfo.setText(o00O0OOO.OooO0O0(p562o0oOo000.o000000.gift_type_not_up_tips_wealth, giftTypeNotUpView));
                ivArrow.setImageResource(p562o0oOo000.o0O0O00.ic_gift_type_not_up_arrow_wealth);
                oo0o.invoke(Boolean.TRUE);
                return;
            }
            if (pageTypeUser == GiftPropTypeUser.Vip.getValue()) {
                NetImageView ivFg2 = e3Var.f43834OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(ivFg2, "ivFg");
                o000O.OooOOOO(ivFg2);
                ivFg2.setImageResource(p562o0oOo000.o0O0O00.ic_gift_type_not_up_tips_fg_vip);
                Intrinsics.checkNotNullExpressionValue(ivType, "ivType");
                o000O.OooOOOO(ivType);
                Intrinsics.checkNotNullExpressionValue(tvInfo, "tvInfo");
                o000O.OooOOOO(tvInfo);
                Intrinsics.checkNotNullExpressionValue(ivArrow, "ivArrow");
                o000O.OooOOOO(ivArrow);
                netImageView.setImageResource(p562o0oOo000.o0Oo0oo.gift_type_tips_bg_vip);
                ivType.setImageResource(p562o0oOo000.o0O0O00.ic_gift_type_not_up_vip);
                tvInfo.setTextColor(com.code.android.util.o0000.OooO00o(i));
                tvInfo.setText(o00O0OOO.OooO0O0(p562o0oOo000.o000000.gift_type_not_up_tips_vip, giftTypeNotUpView));
                ivArrow.setImageResource(p562o0oOo000.o0O0O00.ic_gift_type_not_up_arrow_vip);
                oo0o.invoke(Boolean.TRUE);
                return;
            }
            if (pageTypeUser == GiftPropTypeUser.Member.getValue()) {
                Intrinsics.checkNotNullExpressionValue(ivType, "ivType");
                o000O.OooOOOO(ivType);
                Intrinsics.checkNotNullExpressionValue(tvInfo, "tvInfo");
                o000O.OooOOOO(tvInfo);
                Intrinsics.checkNotNullExpressionValue(ivArrow, "ivArrow");
                o000O.OooOOOO(ivArrow);
                netImageView.setImageResource(p562o0oOo000.o0Oo0oo.gift_type_tips_bg_member);
                ivType.setImageResource(p562o0oOo000.o0O0O00.ic_gift_type_not_up_member);
                tvInfo.setTextColor(com.code.android.util.o0000.OooO00o(i));
                tvInfo.setText(o00O0OOO.OooO0O0(p562o0oOo000.o000000.gift_type_not_up_tips_member, giftTypeNotUpView));
                ivArrow.setImageResource(p562o0oOo000.o0O0O00.ic_gift_type_not_up_arrow_member);
                oo0o.invoke(Boolean.TRUE);
                return;
            }
            if (pageTypeUser == GiftPropTypeUser.Premium.getValue()) {
                Intrinsics.checkNotNullExpressionValue(ivType, "ivType");
                o000O.OooOOOO(ivType);
                Intrinsics.checkNotNullExpressionValue(tvInfo, "tvInfo");
                o000O.OooOOOO(tvInfo);
                Intrinsics.checkNotNullExpressionValue(ivArrow, "ivArrow");
                o000O.OooOOOO(ivArrow);
                netImageView.setImageResource(p562o0oOo000.o0Oo0oo.gift_type_tips_bg_premium);
                ivType.setImageResource(p562o0oOo000.o0O0O00.ic_gift_type_not_up_premium);
                tvInfo.setTextColor(com.code.android.util.o0000.OooO00o(i));
                tvInfo.setText(o00O0OOO.OooO0O0(p562o0oOo000.o000000.gift_type_not_up_tips_premium, giftTypeNotUpView));
                ivArrow.setImageResource(p562o0oOo000.o0O0O00.ic_gift_type_not_up_arrow_premium);
                oo0o.invoke(Boolean.TRUE);
                return;
            }
            if (pageTypeUser != GiftPropTypeUser.Flags.getValue()) {
                oo0o.invoke(Boolean.FALSE);
                return;
            }
            Intrinsics.checkNotNullExpressionValue(ivFlags, "ivFlags");
            o000O.OooOOOO(ivFlags);
            ivFlags.setImageResource(p562o0oOo000.o0Oo0oo.gift_type_tips_bg_flags);
            Intrinsics.checkNotNullExpressionValue(tvInfo, "tvInfo");
            o000O.OooOOOO(tvInfo);
            netImageView.setImageDrawable(null);
            tvInfo.setTextColor(com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.white_65));
            tvInfo.setText(o00O0OOO.OooO0O0(p562o0oOo000.o000000.gift_type_not_up_tips_flags, giftTypeNotUpView));
            oo0o.invoke(Boolean.TRUE);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0077  */
    /* JADX WARN: Code duplicated, block: B:49:0x007d  */
    public static final void OooOOO0(o00000OO o00000oo2, GiftPropTypeTips giftPropTypeTips) {
        GiftSendFragment giftSendFragment;
        GiftTopTipsView giftTopTipsView = o00000oo2.OooOOo0().f44522OooOo0O;
        GiftPropModel giftPropModel = giftTopTipsView.f30469OooO0o;
        if (giftPropModel != null) {
            o00000OO o00000oo3 = giftTopTipsView.dialog;
            boolean z = (o00000oo3 == null || (giftSendFragment = o00000oo3.f50964OooOOO) == null || giftSendFragment.getPageTypeUser() != GiftPropTypeUser.Backpack.getValue()) ? false : true;
            ConstraintLayout constraintLayout = giftTopTipsView.f30474OooOO0O;
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
                    constraintLayout = giftTopTipsView.f30471OooO0oO;
                } else if (giftPropModel.getIsNew()) {
                    constraintLayout = giftTopTipsView.f30475OooOO0o;
                } else {
                    constraintLayout = null;
                }
            }
            if (o0OoOo0.OooO00o(constraintLayout != null ? Boolean.valueOf(o000O.OooO0o0(constraintLayout)) : null)) {
                return;
            }
            giftTopTipsView.OooO00o(constraintLayout);
        }
    }

    @Override // p185o00o00Oo.o0000oo
    public final void OooO0o0() {
        OooOo(true);
        this.f50982OooOooo.clear();
        this.f50983Oooo000 = false;
        this.f50978OooOoOO = false;
    }

    @Override // p185o00o00Oo.o0000oo
    public final void OooOO0o() {
        List<GiftPropModel> arrayList;
        GiftSendFragment giftSendFragment;
        MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = p391o0OOooo0.oo0o0Oo.f43573OooO00o;
        p391o0OOooo0.oo0o0Oo.OooO0Oo(false);
        MutableLiveData<List<GiftPropAll>> mutableLiveData2 = p391o0OOooo0.oo0o0Oo.f43576OooO0Oo;
        List<GiftPropAll> value = mutableLiveData2.getValue();
        if (value == null || value.isEmpty()) {
            o000O00.OooO00o(p562o0oOo000.o000000.network_failed);
            return;
        }
        super.OooOO0o();
        OooOo(true);
        this.f50982OooOooo.clear();
        this.f50983Oooo000 = false;
        this.f50978OooOoOO = false;
        OooOo(false);
        OooOOOO();
        GiftPropTypeShow giftPropTypeShow = GiftPropTypeShow.InRoom;
        GiftPropTypeShow giftPropTypeShow2 = this.f50958OooO;
        if (giftPropTypeShow2 == giftPropTypeShow && (giftSendFragment = this.f50964OooOOO) != null) {
            o0oo0000.OooO00o.OooO0OO("202020", MapsKt.mapOf(new Pair("gifttype", Integer.valueOf(giftSendFragment.getPageTypeUser())), new Pair("roomeventid", Integer.valueOf(giftSendFragment.getPageTypeUser())), new Pair("page", Integer.valueOf(giftSendFragment.getPageIndex() + 1))));
        }
        GiftPropModel giftPropModel = this.f50968OooOOo;
        if (giftPropModel != null && giftPropModel.getTypeUser() == GiftPropTypeUser.Backpack.getValue()) {
            GiftPropModel giftPropModel2 = this.f50968OooOOo;
            if (o0OoOo0.OooOO0(giftPropModel2 != null ? Long.valueOf(giftPropModel2.getGiftBackpackPropNum()) : null) < 1) {
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
                this.f50968OooOOo = null;
                if (!arrayList.isEmpty()) {
                    this.f50968OooOOo = arrayList.get(0);
                }
            }
        }
        OooOo0();
    }

    public final void OooOOOO() {
        LinearLayout hintFirstSelectAllUser = OooOOo0().f44509OooOO0;
        Intrinsics.checkNotNullExpressionValue(hintFirstSelectAllUser, "hintFirstSelectAllUser");
        if (!o000O.OooO0o0(hintFirstSelectAllUser)) {
            LinearLayout hintFirstSelectTotalGift = OooOOo0().f44510OooOO0O;
            Intrinsics.checkNotNullExpressionValue(hintFirstSelectTotalGift, "hintFirstSelectTotalGift");
            if (!o000O.OooO0o0(hintFirstSelectTotalGift)) {
                return;
            }
        }
        LinearLayout hintFirstSelectAllUser2 = OooOOo0().f44509OooOO0;
        Intrinsics.checkNotNullExpressionValue(hintFirstSelectAllUser2, "hintFirstSelectAllUser");
        o000O.OooO0O0(hintFirstSelectAllUser2);
        LinearLayout hintFirstSelectTotalGift2 = OooOOo0().f44510OooOO0O;
        Intrinsics.checkNotNullExpressionValue(hintFirstSelectTotalGift2, "hintFirstSelectTotalGift");
        o000O.OooO0O0(hintFirstSelectTotalGift2);
    }

    public final void OooOOOo() {
        Job job;
        PopupWindow popupWindow;
        PopupWindow popupWindow2 = this.f50980OooOoo0;
        boolean z = false;
        if ((popupWindow2 != null && popupWindow2.isShowing()) && (popupWindow = this.f50980OooOoo0) != null) {
            popupWindow.dismiss();
        }
        Job job2 = this.f50981OooOooO;
        if (job2 != null && job2.isActive()) {
            z = true;
        }
        if (!z || (job = this.f50981OooOooO) == null) {
            return;
        }
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
    }

    public final GiftCustomMadeWebManager OooOOo() {
        return (GiftCustomMadeWebManager) this.f50973OooOo00.getValue();
    }

    public final o0O0o OooOOo0() {
        return (o0O0o) this.f50961OooOO0.getValue();
    }

    public final h1 OooOOoo() {
        return (h1) this.f50979OooOoo.getValue();
    }

    public final void OooOo(boolean z) {
        if (z) {
            ConstraintLayout constraintLayout = OooOOo0().f44501OooO00o;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            o000O.OooO0O0(constraintLayout);
        } else {
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            o0O00oO0.OooOoO();
            ConstraintLayout constraintLayout2 = OooOOo0().f44501OooO00o;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
            o000O.OooOOOO(constraintLayout2);
        }
    }

    public final void OooOo0() {
        if (this.f38488OooO0O0.isShowing()) {
            if (this.f50958OooO == GiftPropTypeShow.InRoom) {
                if (com.yalla.yalla.service.room.OooO00o.f24519OooOO0.f48495OooO0OO.size() <= 1) {
                    OooOoOO(Oooo000.f50937OooO0o0);
                } else if (Intrinsics.areEqual(this.f50966OooOOOO, Oooo000.f50937OooO0o0)) {
                    OooOoOO(Oooo000.f50938OooO0oO);
                }
            }
            OooOoO(this.f50967OooOOOo);
            if (!this.f50978OooOoOO) {
                if (!this.f50975OooOo0o.f50928OooO00o.isEmpty()) {
                    GiftPropModel giftPropModel = this.f50968OooOOo;
                    if (giftPropModel == null) {
                        OooOo0O(0, null);
                    } else {
                        int i = 0;
                        int i2 = -1;
                        for (Object obj : this.f50971OooOo) {
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
                this.f50978OooOoOO = true;
            }
            ConstraintLayout constraintLayout = OooOOo0().f44512OooOOO;
            o00OO.OooO00o oooO00o = this.f50960OooO0oo;
            constraintLayout.setBackground(com.code.android.util.o0000.OooO0O0(oooO00o.f51042OooO00o));
            TextView textView = OooOOo0().f44523OooOo0o;
            int i4 = oooO00o.f51047OooO0o0;
            textView.setTextColor(com.code.android.util.o0000.OooO00o(i4));
            OooOOo0().f44508OooO0oo.setTextColor(com.code.android.util.o0000.OooO00o(i4));
            GiftView giftView = this.f50969OooOOo0;
            if (giftView != null) {
                giftView.setSelectedGift(true);
            }
        }
    }

    public final void OooOo00(GiftPropModel giftPropModel) {
        String string;
        if (this.f50983Oooo000) {
            return;
        }
        this.f50985Oooo00o = giftPropModel;
        ConstraintLayout layoutSendGiftEffect = OooOOo0().f44515OooOOOo;
        Intrinsics.checkNotNullExpressionValue(layoutSendGiftEffect, "layoutSendGiftEffect");
        o000O.OooOOOO(layoutSendGiftEffect);
        if (giftPropModel.isBlind() && o00O00OO.OooO0o(giftPropModel.getLocalSendResultImageUrl())) {
            String localSendResultImageUrl = giftPropModel.getLocalSendResultImageUrl();
            string = o0OoOo0.OooOOO(localSendResultImageUrl != null ? StringsKt.trim((CharSequence) localSendResultImageUrl).toString() : null, "");
        } else {
            string = StringsKt.trim((CharSequence) giftPropModel.getImageUrl()).toString();
        }
        SVGAView sVGAView = OooOOo0().f44507OooO0oO;
        int i = p562o0oOo000.o0Oo0oo.icon_gift_default_gray;
        sVGAView.f13232OooOooO = i;
        sVGAView.setImageResource(i);
        sVGAView.OooOO0O(string, null);
        OooOOo0().f44505OooO0o.setNumber(giftPropModel.getLocalCount());
        ((AnimatorSet) this.f50984Oooo00O.getValue()).start();
    }

    public final void OooOo0O(int i, Integer num) {
        OooOo oooOo = this.f50975OooOo0o;
        oooOo.f50931OooO0Oo = i;
        ArrayList arrayList = oooOo.f50928OooO00o;
        if (arrayList.size() > oooOo.f50931OooO0Oo) {
            OooOOo0().f44526OooOoOO.setCurrentItem(oooOo.f50931OooO0Oo);
            this.f50964OooOOO = (GiftSendFragment) arrayList.get(oooOo.f50931OooO0Oo);
        }
        if (num == null) {
            GiftSendFragment giftSendFragment = this.f50964OooOOO;
            if (giftSendFragment != null) {
                GiftSendFragment.initGiftId$default(giftSendFragment, 0, 1, null);
                return;
            }
            return;
        }
        GiftSendFragment giftSendFragment2 = this.f50964OooOOO;
        if (giftSendFragment2 != null) {
            giftSendFragment2.setGiftId(num.intValue());
        }
    }

    public final void OooOo0o(View view, GiftPropModel giftPropModel) {
        PopupWindow popupWindow;
        if (view == null || giftPropModel == null || (popupWindow = this.f50980OooOoo0) != null) {
            return;
        }
        boolean z = true;
        if (popupWindow != null && popupWindow.isShowing()) {
            return;
        }
        if (giftPropModel.getIsWeek()) {
            OooOOoo().f43903OooO0O0.setBackgroundResource(p562o0oOo000.o0Oo0oo.ic_gift_tag_week);
            OooOOoo().f43906OooO0o0.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.room_gift_popup_title_week_gift));
            OooOOoo().f43905OooO0Oo.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.room_gift_popup_content_week_gift));
        } else if (giftPropModel.getIsLuck()) {
            OooOOoo().f43903OooO0O0.setBackgroundResource(p562o0oOo000.o0Oo0oo.ic_gift_tag_luck);
            OooOOoo().f43906OooO0o0.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.room_gift_popup_title_luck_gift));
            OooOOoo().f43905OooO0Oo.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.room_gift_popup_content_luck_gift));
        } else if (giftPropModel.isCustomMade()) {
            OooOOoo().f43903OooO0O0.setBackgroundResource(p562o0oOo000.o0O0O00.ic_gift_tag_custom_made);
            OooOOoo().f43906OooO0o0.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.room_gift_popup_title_custom_made_gift_title));
            OooOOoo().f43905OooO0Oo.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.room_gift_popup_title_custom_made_gift_content));
        } else if (giftPropModel.isBlind()) {
            OooOOoo().f43903OooO0O0.setBackgroundResource(p562o0oOo000.o0Oo0oo.ic_gift_tag_blind);
            OooOOoo().f43906OooO0o0.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.room_gift_popup_title_blind_gift));
            OooOOoo().f43905OooO0Oo.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.room_gift_popup_content_blind_gift));
        } else if (giftPropModel.isAllSiteGift()) {
            OooOOoo().f43903OooO0O0.setBackgroundResource(p562o0oOo000.o0Oo0oo.ic_gift_tag_diamond);
            OooOOoo().f43906OooO0o0.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.room_gift_popup_title_full_site_gift));
            OooOOoo().f43905OooO0Oo.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.room_gift_popup_content_full_site_gift));
        } else if (giftPropModel.getIsDyEffect()) {
            OooOOoo().f43903OooO0O0.setBackgroundResource(p562o0oOo000.o0Oo0oo.ic_gift_tag_dy_effect);
            OooOOoo().f43906OooO0o0.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.room_gift_popup_title_activity_gift));
            OooOOoo().f43905OooO0Oo.setText(o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.room_gift_popup_content_dyeffect), String.valueOf(giftPropModel.getDyEffectLimitNumber())));
        } else if (giftPropModel.getIsSoundEffect()) {
            OooOOoo().f43903OooO0O0.setBackgroundResource(p562o0oOo000.o0Oo0oo.ic_gift_tag_sound_effect);
            OooOOoo().f43906OooO0o0.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.gift_sound_gifts_title));
            OooOOoo().f43905OooO0Oo.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.gift_sound_gifts_content));
        } else if (giftPropModel.getIsHot()) {
            OooOOoo().f43903OooO0O0.setBackgroundResource(p562o0oOo000.o0Oo0oo.ic_gift_tag_activity);
            OooOOoo().f43906OooO0o0.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.room_gift_popup_title_activity_gift));
            OooOOoo().f43905OooO0Oo.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.room_gift_popup_content_activity_gift));
        } else {
            OooOOoo().f43903OooO0O0.setBackgroundResource(0);
            OooOOoo().f43906OooO0o0.setText((CharSequence) null);
            OooOOoo().f43905OooO0Oo.setText((CharSequence) null);
            z = false;
        }
        if (z) {
            o0oo0000.OooO00o.OooO0O0("302005");
            OooOOO0 oooOOO0 = new OooOOO0(OooOOoo().f43902OooO00o);
            this.f50980OooOoo0 = oooOOO0;
            oooOOO0.setTouchable(false);
            OooOOoo().f43902OooO00o.measure(0, 0);
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            ViewGroup.LayoutParams layoutParams = OooOOoo().f43904OooO0OO.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            int measuredWidth = (OooOOoo().f43902OooO00o.getMeasuredWidth() - view.getWidth()) / 2;
            int i = iArr[0];
            if (i == 0) {
                layoutParams2.setMarginStart(p595o0oo00O.OooOo00.OooO0o0() ? (OooOOoo().f43902OooO00o.getMeasuredWidth() - view.getWidth()) / 2 : (view.getWidth() - OooOOoo().f43902OooO00o.getMeasuredWidth()) / 2);
            } else if (i == o000O000.f46650OooO00o - view.getWidth()) {
                layoutParams2.setMarginStart(p595o0oo00O.OooOo00.OooO0o0() ? (view.getWidth() - OooOOoo().f43902OooO00o.getMeasuredWidth()) / 2 : (OooOOoo().f43902OooO00o.getMeasuredWidth() - view.getWidth()) / 2);
            } else {
                layoutParams2.setMarginStart(0);
            }
            OooOOoo().f43904OooO0OO.setLayoutParams(layoutParams2);
            PopupWindow popupWindow2 = this.f50980OooOoo0;
            if (popupWindow2 != null) {
                popupWindow2.showAsDropDown(view, (view.getWidth() - OooOOoo().f43902OooO00o.getMeasuredWidth()) / 2, (-view.getHeight()) - OooOOoo().f43902OooO00o.getMeasuredHeight(), p595o0oo00O.OooOo00.OooO0o0() ? 8388613 : 8388611);
            }
            this.f50981OooOooO = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getDefault(), null, new OooOOO(null), 2, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    public final void OooOoO(int i) {
        this.f50967OooOOOo = i;
        OooOOo0().f44508OooO0oo.setText(String.valueOf(this.f50967OooOOOo));
        Drawable drawableOooO0O0 = com.code.android.util.o0000.OooO0O0(this.f50960OooO0oo.f51048OooO0oO);
        int i2 = OooO00o.$EnumSwitchMapping$0[this.f50958OooO.ordinal()];
        boolean z = false;
        if (i2 == 1) {
            RoomUserInfoModel roomUserInfoModel = this.f50966OooOOOO;
            RoomUserInfoModel roomUserInfoModel2 = Oooo000.f50937OooO0o0;
            if (Intrinsics.areEqual(roomUserInfoModel, Oooo000.f50936OooO0o)) {
                drawableOooO0O0 = null;
            } else if (Intrinsics.areEqual(this.f50966OooOOOO, Oooo000.f50938OooO0oO)) {
                GiftPropModel giftPropModel = this.f50968OooOOo;
                if (giftPropModel != null && giftPropModel.isBlind()) {
                    z = true;
                }
                if (z) {
                    drawableOooO0O0 = null;
                }
            }
        } else if (i2 == 3 || i2 == 4) {
            GiftPropModel giftPropModel2 = this.f50968OooOOo;
            if (giftPropModel2 != null && giftPropModel2.isBlind()) {
                z = true;
            }
            if (z) {
                drawableOooO0O0 = null;
            }
        }
        o0O0o0.OooO00o(OooOOo0().f44508OooO0oo, drawableOooO0O0, ViewLocation.end, p595o0oo00O.OooOo00.OooO0o0());
    }

    public final void OooOoO0() {
        p583o0oOoo00.o00000OO.f56680OooOo0O.observe(this.f50959OooO0oO, new OooOO0O(new OooOOOO()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOoOO(RoomUserInfoModel roomUserInfoModel) {
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Long l = (Long) o0O00oO0.OooOOo0().getValue();
        long jLongValue = roomUserInfoModel.getUserId().getValue().longValue();
        if (l == null || l.longValue() != jLongValue) {
            this.f50966OooOOOO = roomUserInfoModel;
        }
        RoomUserInfoModel user = this.f50966OooOOOO;
        GiftCustomMadeWebManager giftCustomMadeWebManagerOooOOo = OooOOo();
        giftCustomMadeWebManagerOooOOo.getClass();
        Intrinsics.checkNotNullParameter(user, "user");
        giftCustomMadeWebManagerOooOOo.f27528OooO0o = user;
        giftCustomMadeWebManagerOooOOo.OooO0OO();
        OooOOo0().f44525OooOoO0.setRotationX(0.0f);
        OooOOo0().f44523OooOo0o.setGravity(8388611);
        if (Intrinsics.areEqual(user, Oooo000.f50937OooO0o0)) {
            OooOOo0().f44523OooOo0o.setGravity(17);
            OooOOo0().f44523OooOo0o.setText("--");
            NetImageView ivHead = OooOOo0().f44513OooOOO0;
            Intrinsics.checkNotNullExpressionValue(ivHead, "ivHead");
            o000O.OooO0O0(ivHead);
            OooOOo0().f44516OooOOo.setBackgroundResource(p562o0oOo000.o0Oo0oo.shape_bg_gift_dialog_send_user);
            OooOOo0().f44524OooOoO.setBackgroundColor(com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.color_00d8c9));
            OooOOo0().f44511OooOO0o.setBackground(null);
        } else if (Intrinsics.areEqual(user, Oooo000.f50938OooO0oO)) {
            NetImageView ivHead2 = OooOOo0().f44513OooOOO0;
            Intrinsics.checkNotNullExpressionValue(ivHead2, "ivHead");
            o000O.OooOOOO(ivHead2);
            OooOOo0().f44523OooOo0o.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.room_dialog_send_gift_all_in_mic));
            OooOOo0().f44513OooOOO0.setImageResource(p562o0oOo000.o0Oo0oo.room_dialog_all_in_mic);
            OooOOo0().f44516OooOOo.setBackgroundResource(p562o0oOo000.o0Oo0oo.shape_bg_gift_dialog_send_user);
            OooOOo0().f44524OooOoO.setBackgroundColor(com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.color_00d8c9));
            OooOOo0().f44511OooOO0o.setBackground(null);
        } else if (Intrinsics.areEqual(user, Oooo000.f50936OooO0o)) {
            NetImageView ivHead3 = OooOOo0().f44513OooOOO0;
            Intrinsics.checkNotNullExpressionValue(ivHead3, "ivHead");
            o000O.OooO0O0(ivHead3);
            OooOOo0().f44523OooOo0o.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Everyone_in_room));
            OooOOo0().f44516OooOOo.setBackgroundResource(p562o0oOo000.o0Oo0oo.shape_bg_gift_dialog_send_user);
            OooOOo0().f44511OooOO0o.setBackgroundResource(p562o0oOo000.o0Oo0oo.shape_bg_dialog_gift_user_all_seleted);
            OooOOo0().f44524OooOoO.setBackgroundColor(com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.color_00d8c9));
        } else {
            NetImageView ivHead4 = OooOOo0().f44513OooOOO0;
            Intrinsics.checkNotNullExpressionValue(ivHead4, "ivHead");
            o000O.OooOOOO(ivHead4);
            OooOOo0().f44523OooOo0o.setText(user.getUserName().getValue());
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this.f38487OooO00o);
            oooO00o.f43126OooO0OO = p403o0Oo0OO.OooO0OO.OooO00o(user.getUserHeader().getValue());
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO00o(d1.OooO0OO());
            oooO00o.OooO0Oo(OooOOo0().f44513OooOOO0);
            OooOOo0().f44516OooOOo.setBackgroundResource(p562o0oOo000.o0Oo0oo.shape_bg_gift_dialog_send_user);
            OooOOo0().f44524OooOoO.setBackgroundColor(com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.color_00d8c9));
            OooOOo0().f44511OooOO0o.setBackground(null);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.f50959OooO0oO), null, null, new OooOo00(user, this, null), 3, null);
        }
        OooOOo0().f44523OooOo0o.invalidate();
        OooOOo0().f44523OooOo0o.requestLayout();
    }
}
