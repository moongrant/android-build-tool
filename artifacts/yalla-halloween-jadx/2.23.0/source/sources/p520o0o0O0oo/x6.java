package p520o0o0O0oo;

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
import com.code.android.util.o0000;
import com.code.android.util.o000000;
import com.code.android.util.o0000O;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00O;
import com.code.android.util.o000O0Oo;
import com.code.android.util.o000OO00;
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
import com.yalla.yalla.ui.activity.room.o00000OO;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p157o00OoOO0.Oooo0;
import p157o00OoOO0.o0OO00O;
import p385o0OOooOO.oOO00O;
import p402o0Oo0OOO.o00O000o;
import p406o0Oo0Ooo.oOO0O0O;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o0O0O00;
import p417o0OoO0.Oooo000;
import p417o0OoO0.o0000O0O;
import p417o0OoO0.o000oOoO;
import p417o0OoO0.o0ooOOo;
import p464o0Oooo.o000000O;
import p475o0o000.o00Ooo;
import p520o0o0O0oo.c6;
import p520o0o0O0oo.d6;
import p520o0o0O0oo.v8;
import p520o0o0O0oo.w8;
import p520o0o0O0oo.x6;
import p553o0oOOoo.o0oO0O0o;
import p576o0oOoOo0.oO000Oo;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oO00Oo00;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.k1;
import p641o0ooOOOO.pb;
import p641o0ooOOOO.s9;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nGiftSendDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftSendDialog.kt\ncom/yalla/yalla/ui/dialog/giftDialog/GiftSendDialog\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1595:1\n23#2:1596\n215#3,2:1597\n1864#4,3:1599\n*S KotlinDebug\n*F\n+ 1 GiftSendDialog.kt\ncom/yalla/yalla/ui/dialog/giftDialog/GiftSendDialog\n*L\n113#1:1596\n833#1:1597,2\n1109#1:1599,3\n*E\n"})
public final class x6 extends Oooo0<x6> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final GiftPropTypeShow f53374OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f53375OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final h9.OooO00o f53376OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f53377OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public Function1<? super GiftPropModel, Unit> f53378OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public Function2<? super WebPageInfo, ? super Boolean, Unit> f53379OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public GiftSendFragment f53380OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public Function1<? super WebPageInfo, Unit> f53381OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public RoomUserInfoModel f53382OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f53383OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public GiftPropModel f53384OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public GiftView f53385OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final Lazy f53386OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final ArrayList f53387OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f53388OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final Lazy f53389OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f53390OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final c6 f53391OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public RoomUserInfoModel f53392OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    public o0oO0O0o f53393OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f53394OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @NotNull
    public final Lazy f53395OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @Nullable
    public PopupWindow f53396OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @Nullable
    public Job f53397OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @NotNull
    public final ArrayList f53398OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f53399Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @NotNull
    public final Lazy f53400Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @Nullable
    public GiftPropModel f53401Oooo00o;

    public static final class OooO extends Lambda implements Function0<GiftCustomMadeWebManager> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final GiftCustomMadeWebManager invoke() {
            x6 x6Var = x6.this;
            FragmentActivity fragmentActivity = x6Var.f53375OooO0oO;
            FrameLayout frameLayout = x6Var.OooOOo().f58234OooOOoo;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "mBinding.overrideGiftContainer");
            GiftCustomMadeWebManager giftCustomMadeWebManager = new GiftCustomMadeWebManager(fragmentActivity, frameLayout);
            giftCustomMadeWebManager.f27995OooO = new u8(x6Var);
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
            x6 x6Var = x6.this;
            SVGAView imageView = x6Var.OooOOo().f58223OooO0oO;
            Intrinsics.checkNotNullExpressionValue(imageView, "mBinding.giftEffectImage");
            GiftNumberView countView = x6Var.OooOOo().f58221OooO0o;
            Intrinsics.checkNotNullExpressionValue(countView, "mBinding.giftCount");
            y6 y6Var = new y6(x6Var);
            z6 z6Var = new z6(x6Var);
            a7 a7Var = new a7(x6Var);
            Intrinsics.checkNotNullParameter(imageView, "imageView");
            Intrinsics.checkNotNullParameter(countView, "countView");
            p417o0OoO0.OooOOO oooOOO = new p417o0OoO0.OooOOO(y6Var);
            Oooo000 oooo000 = new Oooo000(countView, y6Var, z6Var, a7Var);
            p417o0OoO0.Oooo0 oooo0 = new p417o0OoO0.Oooo0(a7Var);
            o000oOoO o000oooo2 = new o000oOoO(b7.f53252OooO0Oo);
            Intrinsics.checkNotNullParameter(imageView, "<this>");
            float fOooO0O0 = o0000O0.OooO0O0(o0ooOOo.f45529OooO00o);
            float fOooO0O1 = o0000O0.OooO0O0(o0ooOOo.f45530OooO0O0);
            float f = 2;
            float[] values = {50 + fOooO0O0, fOooO0O0 / f, 0.0f};
            Intrinsics.checkNotNullParameter(imageView, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "TranslationX", Arrays.copyOf(values, 3));
            Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "ofFloat(this, \"TranslationX\", *values)");
            float[] values2 = {380 + fOooO0O1, fOooO0O1 / f, 0.0f};
            Intrinsics.checkNotNullParameter(imageView, "<this>");
            Intrinsics.checkNotNullParameter(values2, "values");
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView, "TranslationY", Arrays.copyOf(values2, 3));
            Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat2, "ofFloat(this, \"TranslationY\", *values)");
            float[] values3 = {0.25f, 1.5f, 1.0f};
            Intrinsics.checkNotNullParameter(imageView, "<this>");
            Intrinsics.checkNotNullParameter(values3, "values");
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(imageView, "scaleY", Arrays.copyOf(values3, 3));
            Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat3, "ofFloat(this, \"scaleY\", *values)");
            float[] values4 = {0.25f, 1.5f, 1.0f};
            Intrinsics.checkNotNullParameter(imageView, "<this>");
            Intrinsics.checkNotNullParameter(values4, "values");
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(imageView, "scaleX", Arrays.copyOf(values4, 3));
            Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat4, "ofFloat(this, \"scaleX\", *values)");
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
            animatorSet.setDuration(500L);
            animatorSet.addListener(new p417o0OoO0.OooOOO0(oooOOO, oooo000, oooo0, o000oooo2));
            return animatorSet;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<d6> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final d6 invoke() {
            x6 x6Var = x6.this;
            return new d6(x6Var.f10133OooO00o, x6Var.f53376OooO0oo, x6Var.f53374OooO);
        }
    }

    public static final class OooO0o extends Lambda implements Function0<ViewGroup> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewGroup invoke() {
            return x6.this.f10135OooO0OO;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<s9> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final s9 invoke() {
            s9 s9VarOooO00o = s9.OooO00o(View.inflate(x6.this.f10133OooO00o, oO00OO0O.room_popupwindow_setting, null));
            Intrinsics.checkNotNullExpressionValue(s9VarOooO00o, "bind(FrameLayout.inflate…pupwindow_setting, null))");
            return s9VarOooO00o;
        }
    }

    public static final class OooOO0O implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f53407OooO0Oo;

        public OooOO0O(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f53407OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f53407OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f53407OooO0Oo;
        }

        public final int hashCode() {
            return this.f53407OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f53407OooO0Oo.invoke(obj);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.giftDialog.GiftSendDialog$updateUserUI$1$1", f = "GiftSendDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f53408OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ x6 f53409OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(RoomUserInfoModel roomUserInfoModel, x6 x6Var, Continuation<? super OooOOO> continuation) {
            super(2, continuation);
            this.f53408OooO0Oo = roomUserInfoModel;
            this.f53409OooO0o0 = x6Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO(this.f53408OooO0Oo, this.f53409OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            RoomUserInfoModel roomUserInfoModel = this.f53408OooO0Oo;
            String value = roomUserInfoModel.getUserName().getValue();
            if (roomUserInfoModel.getUserId().getValue().longValue() > 0) {
                value = oOO0O0O.OooO0O0(roomUserInfoModel.getUserId().getValue().longValue(), value);
            }
            this.f53409OooO0o0.OooOOo().f58239OooOo0o.setText(value);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<String, Unit> {
        public OooOOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String url = str;
            if (!(url == null || StringsKt.isBlank(url))) {
                WebPageInfo webPageInfo = new WebPageInfo(WebFrom.UserWealthLevel);
                webPageInfo.f32821OooO0oo = false;
                webPageInfo.f32816OooO = true;
                Intrinsics.checkNotNullExpressionValue(url, "url");
                Intrinsics.checkNotNullParameter(url, "url");
                webPageInfo.f32819OooO0o0 = url;
                webPageInfo.f32827OooOOOO = p469o0OoooOO.o0oO0O0o.f47118o00O0OOo;
                Function2<? super WebPageInfo, ? super Boolean, Unit> function2 = x6.this.f53379OooOO0o;
                if (function2 != null) {
                    function2.invoke(webPageInfo, Boolean.TRUE);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:22:0x0279  */
    /* JADX WARN: Multi-variable type inference failed */
    public x6(@NotNull FragmentActivity currentActivity, @NotNull h9.OooO00o theme, @NotNull GiftPropTypeShow showIn) {
        super(currentActivity);
        Intrinsics.checkNotNullParameter(currentActivity, "currentActivity");
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(showIn, "showIn");
        this.f53375OooO0oO = currentActivity;
        this.f53376OooO0oo = theme;
        this.f53374OooO = showIn;
        this.f53377OooOO0 = new o000O0Oo(Reflection.getOrCreateKotlinClass(k1.class), this.f10133OooO00o, new OooO0o());
        this.f53382OooOOOO = d6.f53265OooO0o0;
        int i = 1;
        this.f53383OooOOOo = 1;
        this.f53386OooOOoo = LazyKt.lazy(new OooO0OO());
        this.f53389OooOo00 = LazyKt.lazy(new OooO());
        this.f53388OooOo0 = new LinkedHashMap();
        this.f53390OooOo0O = new LinkedHashMap();
        c6 c6Var = new c6(currentActivity);
        this.f53391OooOo0o = c6Var;
        this.f53387OooOo = new ArrayList();
        Window windowOooO0Oo = OooO0Oo();
        if (windowOooO0Oo != null) {
            windowOooO0Oo.setWindowAnimations(oO00Oo00.anim_bottom_top_bottom);
        }
        OooO0oo();
        ConstraintLayout constraintLayout = OooOOo().f58217OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "mBinding.root");
        int i2 = o0ooOOo.f45529OooO00o;
        Object systemService = o000O0.OooO00o().getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Point point = new Point();
        ((WindowManager) systemService).getDefaultDisplay().getSize(point);
        p417o0OoO0.o000O0Oo.OooO0O0(constraintLayout, point.y);
        OooOOo().f58238OooOo0O.setDialog(this);
        oOO00O.OooO0Oo(false);
        ConstraintLayout constraintLayout2 = OooOOo().f58217OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "mBinding.root");
        OooO0oO(constraintLayout2);
        int i3 = OooO00o.$EnumSwitchMapping$0[showIn.ordinal()];
        if (i3 == 1) {
            ImageView imageView = OooOOo().f58241OooOoO0;
            Intrinsics.checkNotNullExpressionValue(imageView, "mBinding.userUp");
            o000OO00.OooOOOO(imageView);
            ImageView imageView2 = OooOOo().f58227OooOO0o;
            Intrinsics.checkNotNullExpressionValue(imageView2, "mBinding.ivAllRoom");
            o000OO00.OooOOOO(imageView2);
            View view = OooOOo().f58240OooOoO;
            Intrinsics.checkNotNullExpressionValue(view, "mBinding.vLine");
            o000OO00.OooOOOO(view);
            ConstraintLayout constraintLayout3 = OooOOo().f58231OooOOOo;
            Intrinsics.checkNotNullExpressionValue(constraintLayout3, "mBinding.layoutSendGiftEffect");
            o000OO00.OooO0O0(constraintLayout3);
        } else if (i3 == 2) {
            ImageView imageView3 = OooOOo().f58241OooOoO0;
            Intrinsics.checkNotNullExpressionValue(imageView3, "mBinding.userUp");
            o000OO00.OooO0O0(imageView3);
            ImageView imageView4 = OooOOo().f58227OooOO0o;
            Intrinsics.checkNotNullExpressionValue(imageView4, "mBinding.ivAllRoom");
            o000OO00.OooO0O0(imageView4);
            View view2 = OooOOo().f58240OooOoO;
            Intrinsics.checkNotNullExpressionValue(view2, "mBinding.vLine");
            o000OO00.OooO0O0(view2);
            ConstraintLayout constraintLayout4 = OooOOo().f58231OooOOOo;
            Intrinsics.checkNotNullExpressionValue(constraintLayout4, "mBinding.layoutSendGiftEffect");
            o000OO00.OooO0O0(constraintLayout4);
        } else if (i3 == 3 || i3 == 4) {
            ImageView imageView5 = OooOOo().f58241OooOoO0;
            Intrinsics.checkNotNullExpressionValue(imageView5, "mBinding.userUp");
            o000OO00.OooO0O0(imageView5);
            ImageView imageView6 = OooOOo().f58227OooOO0o;
            Intrinsics.checkNotNullExpressionValue(imageView6, "mBinding.ivAllRoom");
            o000OO00.OooO0O0(imageView6);
            View view3 = OooOOo().f58240OooOoO;
            Intrinsics.checkNotNullExpressionValue(view3, "mBinding.vLine");
            o000OO00.OooO0O0(view3);
            ConstraintLayout constraintLayout5 = OooOOo().f58231OooOOOo;
            Intrinsics.checkNotNullExpressionValue(constraintLayout5, "mBinding.layoutSendGiftEffect");
            o000OO00.OooO0OO(constraintLayout5);
        }
        GiftTopTipsView giftTopTipsView = OooOOo().f58238OooOo0O;
        giftTopTipsView.getGiftBlindView().setGiftBlindListener(new w7(this, giftTopTipsView));
        giftTopTipsView.setGiftCustomMadeClickListener(new x7(this));
        giftTopTipsView.getGiftTypeNotUpView().setViewListener(new y7(this));
        giftTopTipsView.setGiftBlindClickListener(new z7(this));
        giftTopTipsView.setGiftNewClickListener(new a8(this));
        giftTopTipsView.setGiftWeekStarClickListener(new b8(this));
        giftTopTipsView.setGiftMergeClickListener(new c8(this));
        OooOOo().f58234OooOOoo.setOnClickListener(new o00000OO(this, i));
        ImageView imageView7 = OooOOo().f58227OooOO0o;
        Intrinsics.checkNotNullExpressionValue(imageView7, "mBinding.ivAllRoom");
        o000OO00.OooO(imageView7, new i8(this));
        LinearLayout linearLayout = OooOOo().f58232OooOOo;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "mBinding.layoutUser");
        o000OO00.OooO(linearLayout, new l8(this));
        TextView textView = OooOOo().f58224OooO0oo;
        Intrinsics.checkNotNullExpressionValue(textView, "mBinding.giftNum");
        o000OO00.OooO(textView, new o8(this));
        TextView textView2 = OooOOo().f58235OooOo;
        Intrinsics.checkNotNullExpressionValue(textView2, "mBinding.tvSend");
        o000OO00.OooO(textView2, new p8(this));
        TextView textView3 = OooOOo().f58219OooO0OO;
        Intrinsics.checkNotNullExpressionValue(textView3, "mBinding.crystal");
        o000OO00.OooO(textView3, new q8(this));
        TextView textView4 = OooOOo().f58218OooO0O0;
        Intrinsics.checkNotNullExpressionValue(textView4, "mBinding.coin");
        o000OO00.OooO(textView4, new r8(this));
        ImageView imageView8 = OooOOo().f58222OooO0o0;
        Intrinsics.checkNotNullExpressionValue(imageView8, "mBinding.firstChargeReward");
        o000OO00.OooO(imageView8, new t8(this));
        if (o000000.OooO00o(Integer.valueOf(o00Oo0.OooO00o().OooO0OO("firstRecharge", 0)))) {
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (o0OoOo0.OooO00o((Boolean) ((MutableLiveData) o000000O.f46712Oooo0o0.getValue()).getValue())) {
                ImageView imageView9 = OooOOo().f58222OooO0o0;
                Intrinsics.checkNotNullExpressionValue(imageView9, "mBinding.firstChargeReward");
                o000OO00.OooO0O0(imageView9);
            } else {
                ImageView imageView10 = OooOOo().f58222OooO0o0;
                Intrinsics.checkNotNullExpressionValue(imageView10, "mBinding.firstChargeReward");
                o000OO00.OooOOOO(imageView10);
            }
        } else {
            ImageView imageView11 = OooOOo().f58222OooO0o0;
            Intrinsics.checkNotNullExpressionValue(imageView11, "mBinding.firstChargeReward");
            o000OO00.OooO0O0(imageView11);
        }
        GiftWealthView giftWealthView = OooOOo().f58216OooO;
        giftWealthView.OooO0O0(currentActivity);
        giftWealthView.setToWealthLevelListener(new d8(this));
        giftWealthView.setToRechargeListener(new e8(this));
        LinearLayout linearLayout2 = OooOOo().f58226OooOO0O;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "mBinding.hintFirstSelectTotalGift");
        o000OO00.OooO(linearLayout2, new f8(this));
        LinearLayout linearLayout3 = OooOOo().f58225OooOO0;
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "mBinding.hintFirstSelectAllUser");
        o000OO00.OooO(linearLayout3, new g8(this));
        ImageView imageView12 = OooOOo().f58237OooOo00;
        Intrinsics.checkNotNullExpressionValue(imageView12, "mBinding.sendCustomGiftWarn");
        o000OO00.OooO(imageView12, new h8(this));
        OooOoOO(this.f53382OooOOOO);
        c6Var.f53260OooO0o0 = new d7(this);
        OooOOo().f58242OooOoOO.setAdapter(c6Var);
        MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = oOO00O.f44351OooO00o;
        oOO00O.OooO0o0(currentActivity, new e7(this));
        o000000O o000000o3 = o000000O.f46674OooO00o;
        o000000O.OooO0O0().observe(currentActivity, new OooOO0O(new o7(this)));
        o000000O.OooO0Oo().observe(currentActivity, new OooOO0O(new p7(this)));
        Class cls = Boolean.TYPE;
        LiveEventBus.get("JoinRoomDialogFromGiftSendDialogLink", cls).observe(currentActivity, new q7(this));
        LiveEventBus.get("QuickRechargeDialogFromGiftSendDialog", cls).observe(currentActivity, new r7(this));
        LiveEventBus.get("GiftSendDialogWealthLevelUnlock", cls).observe(currentActivity, new s7(this));
        LiveEventBus.get("ReceiveCrystalDialogFromGiftSendDialog", cls).observe(currentActivity, new t7(this));
        LiveEventBus.get("UserWealthLevel_Change", cls).observe(currentActivity, new u7(this));
        this.f10134OooO0O0.f10128OooO0Oo.addObserver(new DefaultLifecycleObserver() { // from class: com.yalla.yalla.ui.dialog.giftDialog.GiftSendDialog$initObserve$8

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            @NotNull
            public final OooO00o f28047OooO0Oo;

            public static final class OooO00o extends ViewPager2.OnPageChangeCallback {

                /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
                public final /* synthetic */ x6 f28049OooO00o;

                public OooO00o(x6 x6Var) {
                    this.f28049OooO00o = x6Var;
                }

                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public final void onPageSelected(int i) {
                    super.onPageSelected(i);
                    x6 x6Var = this.f28049OooO00o;
                    if (!x6Var.f53391OooOo0o.f53255OooO00o.isEmpty()) {
                        c6 c6Var = x6Var.f53391OooOo0o;
                        if (c6Var.f53255OooO00o.size() > i) {
                            x6Var.f53380OooOOO = (GiftSendFragment) c6Var.f53255OooO00o.get(i);
                            x6.OooOOOo(x6Var);
                            Iterator it = c6Var.f53257OooO0OO.entrySet().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                Map.Entry entry = (Map.Entry) it.next();
                                if (Intrinsics.areEqual(c6Var.f53256OooO0O0.get(i), entry.getKey())) {
                                    c6Var.f53257OooO0OO.put(entry.getKey(), 0L);
                                    o0oO0O0o o0oo0o0o2 = x6Var.f53393OooOoO0;
                                    if (o0oo0o0o2 != null) {
                                        o0oo0o0o2.OooO0O0((String) entry.getKey(), ((Number) entry.getValue()).longValue() > 0);
                                    }
                                }
                            }
                            GiftSendFragment giftSendFragment = x6Var.f53380OooOOO;
                            if (giftSendFragment != null) {
                                if (giftSendFragment.getPageTypeUser() == GiftPropTypeUser.Backpack.getValue()) {
                                    o0O0O00 o0o0o00OooO0o0 = o00Oo0.OooO0o0();
                                    o0o0o00OooO0o0.getClass();
                                    o000000O o000000o2 = o000000O.f46674OooO00o;
                                    if (!o0o0o00OooO0o0.OooO0O0("giftBackpackFirstReminderTips" + o000000O.OooOOo0().getValue(), false)) {
                                        o0OO00O o0oo00o2 = new o0OO00O(x6Var.f53375OooO0oO);
                                        o0oo00o2.OooOoO0(oO00OOo0.backpack_info_title);
                                        o0oo00o2.OooOOoo(oO00OOo0.backpack_info_content);
                                        o0oo00o2.OooOo0(v8.f53356OooO0Oo);
                                        o0oo00o2.OooOO0o();
                                    }
                                    o0O0O00 o0o0o00OooO0o1 = o00Oo0.OooO0o0();
                                    o0o0o00OooO0o1.getClass();
                                    com.google.firebase.messaging.o0OO00O.OooO00o("giftBackpackFirstReminderTips", o000000O.OooOOo0().getValue(), o0o0o00OooO0o1, true);
                                    GiftSendFragment giftSendFragment2 = x6Var.f53380OooOOO;
                                    if (giftSendFragment2 != null) {
                                        giftSendFragment2.setResumeListener(new w8(x6Var));
                                    }
                                    x6Var.OooOOo0();
                                    if (Intrinsics.areEqual(x6Var.f53382OooOOOO, d6.f53264OooO0o)) {
                                        x6Var.OooOoOO(d6.f53266OooO0oO);
                                    }
                                } else {
                                    x6Var.OooOOo().f58224OooO0oo.setEnabled(true);
                                    x6Var.OooOOo().f58224OooO0oo.setClickable(true);
                                    x6Var.OooOOo().f58235OooOo.setEnabled(true);
                                    x6Var.OooOOo().f58235OooOo.setClickable(true);
                                }
                                o00Oo0.OooOO0O().OooOOOo(giftSendFragment.getPageTypeUser(), false);
                                MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = oOO00O.f44351OooO00o;
                                int pageTypeUser = giftSendFragment.getPageTypeUser();
                                List<GiftPropAll> value = oOO00O.f44354OooO0Oo.getValue();
                                if (value != null) {
                                    for (GiftPropAll giftPropAll : value) {
                                        if (pageTypeUser == giftPropAll.getGiftPropTypeUser()) {
                                            giftPropAll.setRedPostCountLocal(0L);
                                        }
                                    }
                                }
                                o00Ooo o00ooo2 = com.yalla.yalla.service.room.OooO00o.f24989OooOOo0;
                                MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData2 = oOO00O.f44351OooO00o;
                                o00ooo2.OooO0Oo(oOO00O.OooO0OO());
                            }
                        }
                    }
                }
            }

            {
                this.f28047OooO0Oo = new OooO00o(this.f28048OooO0o0);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onCreate(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                androidx.lifecycle.OooO00o.OooO00o(this, owner);
                this.f28048OooO0o0.OooOOo().f58242OooOoOO.registerOnPageChangeCallback(this.f28047OooO0Oo);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onDestroy(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                androidx.lifecycle.OooO00o.OooO0O0(this, owner);
                this.f28048OooO0o0.OooOOo().f58242OooOoOO.unregisterOnPageChangeCallback(this.f28047OooO0Oo);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO00o.OooO0OO(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onResume(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                androidx.lifecycle.OooO00o.OooO0Oo(this, owner);
                this.f28048OooO0o0.OooOo0O();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO00o.OooO0o0(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO00o.OooO0o(this, lifecycleOwner);
            }
        });
        LiveEventBus.get("GiftSendDialogSelectGift", GiftView.class).observe(currentActivity, new v7(this));
        LiveEventBus.get("ShowIntroducingTagGiftWindow", GiftView.class).observe(currentActivity, new g7(this));
        LiveEventBus.get("OnLongClickShowIntroducingTagGiftWindow", GiftView.class).observe(currentActivity, new h7(this));
        LiveEventBus.get("DismissIntroducingTagGiftWindow", cls).observe(currentActivity, new i7(this));
        o000000O.OooO0O0().observe(currentActivity, new OooOO0O(new j7(this)));
        o000000O.OooO0Oo().observe(currentActivity, new OooOO0O(new k7(this)));
        com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25008OooOO0o.observe(currentActivity, new OooOO0O(new l7(this)));
        o000000O.OooOO0o().observe(currentActivity, new OooOO0O(new m7(this)));
        o000000O.OooOO0().observe(currentActivity, new OooOO0O(new n7(this)));
        final f7 f7Var = new f7(this);
        this.f10134OooO0O0.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.code.android.easydialog.OooO00o
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i4, KeyEvent event) {
                OooO this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function3 function3 = f7Var;
                if (function3 == null) {
                    return false;
                }
                Integer numValueOf = Integer.valueOf(i4);
                Intrinsics.checkNotNullExpressionValue(event, "event");
                return ((Boolean) function3.invoke(this$0, numValueOf, event)).booleanValue();
            }
        });
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of com.code.android.easydialog.EasyDialog");
        this.f53395OooOoo = LazyKt.lazy(new OooOO0());
        this.f53398OooOooo = new ArrayList();
        this.f53400Oooo00O = LazyKt.lazy(new OooO0O0());
    }

    public static final void OooOOO(x6 x6Var, View view, GiftPropModel giftPropModel) {
        PopupWindow popupWindow;
        x6Var.getClass();
        if (view == null || giftPropModel == null || (popupWindow = x6Var.f53396OooOoo0) != null) {
            return;
        }
        boolean z = true;
        if (popupWindow != null && popupWindow.isShowing()) {
            return;
        }
        if (giftPropModel.getIsWeek()) {
            x6Var.OooOo00().f58809OooO0O0.setBackgroundResource(oOo00OO0.ic_gift_tag_week);
            x6Var.OooOo00().f58812OooO0o0.setText(o0000.OooO0OO(oO00OOo0.room_gift_popup_title_week_gift));
            x6Var.OooOo00().f58811OooO0Oo.setText(o0000.OooO0OO(oO00OOo0.room_gift_popup_content_week_gift));
        } else if (giftPropModel.getIsLuck()) {
            x6Var.OooOo00().f58809OooO0O0.setBackgroundResource(oOo00OO0.ic_gift_tag_luck);
            x6Var.OooOo00().f58812OooO0o0.setText(o0000.OooO0OO(oO00OOo0.room_gift_popup_title_luck_gift));
            x6Var.OooOo00().f58811OooO0Oo.setText(o0000.OooO0OO(oO00OOo0.room_gift_popup_content_luck_gift));
        } else if (giftPropModel.isCustomMade()) {
            x6Var.OooOo00().f58809OooO0O0.setBackgroundResource(oO00OOO.ic_gift_tag_custom_made);
            x6Var.OooOo00().f58812OooO0o0.setText(o0000.OooO0OO(oO00OOo0.room_gift_popup_title_custom_made_gift_title));
            x6Var.OooOo00().f58811OooO0Oo.setText(o0000.OooO0OO(oO00OOo0.room_gift_popup_title_custom_made_gift_content));
        } else if (giftPropModel.isBlind()) {
            x6Var.OooOo00().f58809OooO0O0.setBackgroundResource(oOo00OO0.ic_gift_tag_blind);
            x6Var.OooOo00().f58812OooO0o0.setText(o0000.OooO0OO(oO00OOo0.room_gift_popup_title_blind_gift));
            x6Var.OooOo00().f58811OooO0Oo.setText(o0000.OooO0OO(oO00OOo0.room_gift_popup_content_blind_gift));
        } else if (giftPropModel.isAllSiteGift()) {
            x6Var.OooOo00().f58809OooO0O0.setBackgroundResource(oOo00OO0.ic_gift_tag_diamond);
            x6Var.OooOo00().f58812OooO0o0.setText(o0000.OooO0OO(oO00OOo0.room_gift_popup_title_full_site_gift));
            x6Var.OooOo00().f58811OooO0Oo.setText(o0000.OooO0OO(oO00OOo0.room_gift_popup_content_full_site_gift));
        } else if (giftPropModel.getIsDyEffect()) {
            x6Var.OooOo00().f58809OooO0O0.setBackgroundResource(oOo00OO0.ic_gift_tag_dy_effect);
            x6Var.OooOo00().f58812OooO0o0.setText(o0000.OooO0OO(oO00OOo0.room_gift_popup_title_activity_gift));
            x6Var.OooOo00().f58811OooO0Oo.setText(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.room_gift_popup_content_dyeffect), String.valueOf(giftPropModel.getDyEffectLimitNumber())));
        } else if (giftPropModel.getIsSoundEffect()) {
            x6Var.OooOo00().f58809OooO0O0.setBackgroundResource(oOo00OO0.ic_gift_tag_sound_effect);
            x6Var.OooOo00().f58812OooO0o0.setText(o0000.OooO0OO(oO00OOo0.gift_sound_gifts_title));
            x6Var.OooOo00().f58811OooO0Oo.setText(o0000.OooO0OO(oO00OOo0.gift_sound_gifts_content));
        } else if (giftPropModel.getIsHot()) {
            x6Var.OooOo00().f58809OooO0O0.setBackgroundResource(oOo00OO0.ic_gift_tag_activity);
            x6Var.OooOo00().f58812OooO0o0.setText(o0000.OooO0OO(oO00OOo0.room_gift_popup_title_activity_gift));
            x6Var.OooOo00().f58811OooO0Oo.setText(o0000.OooO0OO(oO00OOo0.room_gift_popup_content_activity_gift));
        } else {
            x6Var.OooOo00().f58809OooO0O0.setBackgroundResource(0);
            x6Var.OooOo00().f58812OooO0o0.setText((CharSequence) null);
            x6Var.OooOo00().f58811OooO0Oo.setText((CharSequence) null);
            z = false;
        }
        if (z) {
            o0OO000.OooO00o("302005");
            y8 y8Var = new y8(x6Var, x6Var.OooOo00().f58808OooO00o);
            x6Var.f53396OooOoo0 = y8Var;
            y8Var.setTouchable(false);
            x6Var.OooOo00().f58808OooO00o.measure(0, 0);
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            ViewGroup.LayoutParams layoutParams = x6Var.OooOo00().f58810OooO0OO.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            int measuredWidth = (x6Var.OooOo00().f58808OooO00o.getMeasuredWidth() - view.getWidth()) / 2;
            int i = iArr[0];
            if (i == 0) {
                layoutParams2.setMarginStart(p591o0oo000O.OooO.OooO0o0() ? (x6Var.OooOo00().f58808OooO00o.getMeasuredWidth() - view.getWidth()) / 2 : (view.getWidth() - x6Var.OooOo00().f58808OooO00o.getMeasuredWidth()) / 2);
            } else if (i == o0ooOOo.f45529OooO00o - view.getWidth()) {
                layoutParams2.setMarginStart(p591o0oo000O.OooO.OooO0o0() ? (view.getWidth() - x6Var.OooOo00().f58808OooO00o.getMeasuredWidth()) / 2 : (x6Var.OooOo00().f58808OooO00o.getMeasuredWidth() - view.getWidth()) / 2);
            } else {
                layoutParams2.setMarginStart(0);
            }
            x6Var.OooOo00().f58810OooO0OO.setLayoutParams(layoutParams2);
            PopupWindow popupWindow2 = x6Var.f53396OooOoo0;
            if (popupWindow2 != null) {
                popupWindow2.showAsDropDown(view, (view.getWidth() - x6Var.OooOo00().f58808OooO00o.getMeasuredWidth()) / 2, (-view.getHeight()) - x6Var.OooOo00().f58808OooO00o.getMeasuredHeight(), p591o0oo000O.OooO.OooO0o0() ? 8388613 : 8388611);
            }
            x6Var.f53397OooOooO = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getDefault(), null, new z8(x6Var, null), 2, null);
        }
    }

    public static final void OooOOO0(x6 x6Var) {
        Job job;
        PopupWindow popupWindow;
        PopupWindow popupWindow2 = x6Var.f53396OooOoo0;
        boolean z = false;
        if ((popupWindow2 != null && popupWindow2.isShowing()) && (popupWindow = x6Var.f53396OooOoo0) != null) {
            popupWindow.dismiss();
        }
        Job job2 = x6Var.f53397OooOooO;
        if (job2 != null && job2.isActive()) {
            z = true;
        }
        if (!z || (job = x6Var.f53397OooOooO) == null) {
            return;
        }
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0077  */
    /* JADX WARN: Code duplicated, block: B:49:0x007d  */
    public static final void OooOOOO(x6 x6Var, GiftPropTypeTips giftPropTypeTips) {
        GiftSendFragment giftSendFragment;
        GiftTopTipsView giftTopTipsView = x6Var.OooOOo().f58238OooOo0O;
        GiftPropModel giftPropModel = giftTopTipsView.f31014OooO0o;
        if (giftPropModel != null) {
            x6 x6Var2 = giftTopTipsView.dialog;
            boolean z = (x6Var2 == null || (giftSendFragment = x6Var2.f53380OooOOO) == null || giftSendFragment.getPageTypeUser() != GiftPropTypeUser.Backpack.getValue()) ? false : true;
            ConstraintLayout constraintLayout = giftTopTipsView.f31019OooOO0O;
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
                    constraintLayout = giftTopTipsView.f31016OooO0oO;
                } else if (giftPropModel.getIsNew()) {
                    constraintLayout = giftTopTipsView.f31020OooOO0o;
                } else {
                    constraintLayout = null;
                }
            }
            if (o0OoOo0.OooO00o(constraintLayout != null ? Boolean.valueOf(o000OO00.OooO0o0(constraintLayout)) : null)) {
                return;
            }
            giftTopTipsView.OooO00o(constraintLayout);
        }
    }

    public static final void OooOOOo(x6 x6Var) {
        GiftSendFragment giftSendFragment = x6Var.f53380OooOOO;
        if (giftSendFragment != null) {
            GiftTypeNotUpTipsView giftTypeNotUpView = x6Var.OooOOo().f58238OooOo0O.getGiftTypeNotUpView();
            int pageTypeUser = giftSendFragment.getPageTypeUser();
            g9 g9Var = new g9(x6Var, giftSendFragment);
            giftTypeNotUpView.typeUser = pageTypeUser;
            pb pbVar = giftTypeNotUpView.f31039OooO0Oo;
            NetImageView netImageView = pbVar.f58632OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(netImageView, "binding.ivFg");
            o000OO00.OooO0O0(netImageView);
            NetImageView netImageView2 = pbVar.f58633OooO0o;
            Intrinsics.checkNotNullExpressionValue(netImageView2, "binding.ivFgStart");
            o000OO00.OooO0O0(netImageView2);
            NetImageView netImageView3 = pbVar.f58634OooO0o0;
            Intrinsics.checkNotNullExpressionValue(netImageView3, "binding.ivFgEnd");
            o000OO00.OooO0O0(netImageView3);
            NetImageView netImageView4 = pbVar.f58635OooO0oO;
            Intrinsics.checkNotNullExpressionValue(netImageView4, "binding.ivFlags");
            o000OO00.OooO0O0(netImageView4);
            ImageView imageView = pbVar.f58636OooO0oo;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivType");
            o000OO00.OooO0O0(imageView);
            MarqueeText marqueeText = pbVar.f58628OooO;
            Intrinsics.checkNotNullExpressionValue(marqueeText, "binding.tvInfo");
            o000OO00.OooO0O0(marqueeText);
            int i = oO00O0o.white;
            marqueeText.setTextColor(o0000.OooO00o(i));
            marqueeText.setText("");
            ImageView imageView2 = pbVar.f58630OooO0O0;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivArrow");
            o000OO00.OooO0O0(imageView2);
            Intrinsics.checkNotNullExpressionValue(marqueeText, "binding.tvInfo");
            MarqueeText.OooOO0o(marqueeText);
            int value = GiftPropTypeUser.Wealth.getValue();
            NetImageView netImageView5 = pbVar.f58631OooO0OO;
            if (pageTypeUser == value) {
                Intrinsics.checkNotNullExpressionValue(netImageView2, "binding.ivFgStart");
                o000OO00.OooOOOO(netImageView2);
                netImageView2.setImageResource(oO00OOO.ic_gift_type_not_up_tips_fg_wealth_start);
                Intrinsics.checkNotNullExpressionValue(netImageView3, "binding.ivFgEnd");
                o000OO00.OooOOOO(netImageView3);
                netImageView3.setImageResource(oO00OOO.ic_gift_type_not_up_tips_fg_wealth_end);
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivType");
                o000OO00.OooOOOO(imageView);
                Intrinsics.checkNotNullExpressionValue(marqueeText, "binding.tvInfo");
                o000OO00.OooOOOO(marqueeText);
                Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivArrow");
                o000OO00.OooOOOO(imageView2);
                netImageView5.setImageResource(oO00OOO.ic_gift_type_tips_bg_wealth);
                imageView.setImageResource(oO00OOO.ic_gift_type_not_up_wealth);
                marqueeText.setTextColor(o0000.OooO00o(i));
                marqueeText.setText(p417o0OoO0.o000O0.OooO0O0(oO00OOo0.gift_type_not_up_tips_wealth, giftTypeNotUpView));
                imageView2.setImageResource(oO00OOO.ic_gift_type_not_up_arrow_wealth);
                g9Var.invoke(Boolean.TRUE);
                return;
            }
            if (pageTypeUser == GiftPropTypeUser.Vip.getValue()) {
                NetImageView netImageView6 = pbVar.f58632OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(netImageView6, "binding.ivFg");
                o000OO00.OooOOOO(netImageView6);
                netImageView6.setImageResource(oO00OOO.ic_gift_type_not_up_tips_fg_vip);
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivType");
                o000OO00.OooOOOO(imageView);
                Intrinsics.checkNotNullExpressionValue(marqueeText, "binding.tvInfo");
                o000OO00.OooOOOO(marqueeText);
                Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivArrow");
                o000OO00.OooOOOO(imageView2);
                netImageView5.setImageResource(oOo00OO0.gift_type_tips_bg_vip);
                imageView.setImageResource(oO00OOO.ic_gift_type_not_up_vip);
                marqueeText.setTextColor(o0000.OooO00o(i));
                marqueeText.setText(p417o0OoO0.o000O0.OooO0O0(oO00OOo0.gift_type_not_up_tips_vip, giftTypeNotUpView));
                imageView2.setImageResource(oO00OOO.ic_gift_type_not_up_arrow_vip);
                g9Var.invoke(Boolean.TRUE);
                return;
            }
            if (pageTypeUser == GiftPropTypeUser.Member.getValue()) {
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivType");
                o000OO00.OooOOOO(imageView);
                Intrinsics.checkNotNullExpressionValue(marqueeText, "binding.tvInfo");
                o000OO00.OooOOOO(marqueeText);
                Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivArrow");
                o000OO00.OooOOOO(imageView2);
                netImageView5.setImageResource(oOo00OO0.gift_type_tips_bg_member);
                imageView.setImageResource(oO00OOO.ic_gift_type_not_up_member);
                marqueeText.setTextColor(o0000.OooO00o(i));
                marqueeText.setText(p417o0OoO0.o000O0.OooO0O0(oO00OOo0.gift_type_not_up_tips_member, giftTypeNotUpView));
                imageView2.setImageResource(oO00OOO.ic_gift_type_not_up_arrow_member);
                g9Var.invoke(Boolean.TRUE);
                return;
            }
            if (pageTypeUser == GiftPropTypeUser.Premium.getValue()) {
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivType");
                o000OO00.OooOOOO(imageView);
                Intrinsics.checkNotNullExpressionValue(marqueeText, "binding.tvInfo");
                o000OO00.OooOOOO(marqueeText);
                Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivArrow");
                o000OO00.OooOOOO(imageView2);
                netImageView5.setImageResource(oOo00OO0.gift_type_tips_bg_premium);
                imageView.setImageResource(oO00OOO.ic_gift_type_not_up_premium);
                marqueeText.setTextColor(o0000.OooO00o(i));
                marqueeText.setText(p417o0OoO0.o000O0.OooO0O0(oO00OOo0.gift_type_not_up_tips_premium, giftTypeNotUpView));
                imageView2.setImageResource(oO00OOO.ic_gift_type_not_up_arrow_premium);
                g9Var.invoke(Boolean.TRUE);
                return;
            }
            if (pageTypeUser != GiftPropTypeUser.Flags.getValue()) {
                g9Var.invoke(Boolean.FALSE);
                return;
            }
            Intrinsics.checkNotNullExpressionValue(netImageView4, "binding.ivFlags");
            o000OO00.OooOOOO(netImageView4);
            netImageView4.setImageResource(oOo00OO0.gift_type_tips_bg_flags);
            Intrinsics.checkNotNullExpressionValue(marqueeText, "binding.tvInfo");
            o000OO00.OooOOOO(marqueeText);
            netImageView5.setImageDrawable(null);
            marqueeText.setTextColor(o0000.OooO00o(oO00O0o.white_65));
            marqueeText.setText(p417o0OoO0.o000O0.OooO0O0(oO00OOo0.gift_type_not_up_tips_flags, giftTypeNotUpView));
            g9Var.invoke(Boolean.TRUE);
        }
    }

    @Override // com.code.android.easydialog.OooO
    public final void OooO0o0() {
        OooOo(true);
        this.f53398OooOooo.clear();
        this.f53399Oooo000 = false;
        this.f53394OooOoOO = false;
    }

    @Override // com.code.android.easydialog.OooO
    public final void OooOO0o() {
        List<GiftPropModel> arrayList;
        GiftSendFragment giftSendFragment;
        MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = oOO00O.f44351OooO00o;
        oOO00O.OooO0Oo(false);
        MutableLiveData<List<GiftPropAll>> mutableLiveData2 = oOO00O.f44354OooO0Oo;
        List<GiftPropAll> value = mutableLiveData2.getValue();
        if (value == null || value.isEmpty()) {
            o000O00O.OooO00o(oO00OOo0.network_failed);
            return;
        }
        super.OooOO0o();
        OooOo(true);
        this.f53398OooOooo.clear();
        this.f53399Oooo000 = false;
        this.f53394OooOoOO = false;
        OooOo(false);
        OooOOo0();
        GiftPropTypeShow giftPropTypeShow = GiftPropTypeShow.InRoom;
        GiftPropTypeShow giftPropTypeShow2 = this.f53374OooO;
        if (giftPropTypeShow2 == giftPropTypeShow && (giftSendFragment = this.f53380OooOOO) != null) {
            o0OO000.OooO0O0("202020", MapsKt.mapOf(new Pair("gifttype", Integer.valueOf(giftSendFragment.getPageTypeUser())), new Pair("roomeventid", Integer.valueOf(giftSendFragment.getPageTypeUser())), new Pair("page", Integer.valueOf(giftSendFragment.getPageIndex() + 1))));
        }
        GiftPropModel giftPropModel = this.f53384OooOOo;
        if (giftPropModel != null && giftPropModel.getTypeUser() == GiftPropTypeUser.Backpack.getValue()) {
            GiftPropModel giftPropModel2 = this.f53384OooOOo;
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
                this.f53384OooOOo = null;
                if (!arrayList.isEmpty()) {
                    this.f53384OooOOo = arrayList.get(0);
                }
            }
        }
        OooOo0O();
    }

    public final k1 OooOOo() {
        return (k1) this.f53377OooOO0.getValue();
    }

    public final void OooOOo0() {
        LinearLayout linearLayout = OooOOo().f58225OooOO0;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "mBinding.hintFirstSelectAllUser");
        if (!o000OO00.OooO0o0(linearLayout)) {
            LinearLayout linearLayout2 = OooOOo().f58226OooOO0O;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "mBinding.hintFirstSelectTotalGift");
            if (!o000OO00.OooO0o0(linearLayout2)) {
                return;
            }
        }
        LinearLayout linearLayout3 = OooOOo().f58225OooOO0;
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "mBinding.hintFirstSelectAllUser");
        o000OO00.OooO0O0(linearLayout3);
        LinearLayout linearLayout4 = OooOOo().f58226OooOO0O;
        Intrinsics.checkNotNullExpressionValue(linearLayout4, "mBinding.hintFirstSelectTotalGift");
        o000OO00.OooO0O0(linearLayout4);
    }

    public final GiftCustomMadeWebManager OooOOoo() {
        return (GiftCustomMadeWebManager) this.f53389OooOo00.getValue();
    }

    public final void OooOo(boolean z) {
        if (z) {
            ConstraintLayout constraintLayout = OooOOo().f58217OooO00o;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "mBinding.root");
            o000OO00.OooO0O0(constraintLayout);
        } else {
            o000000O o000000o2 = o000000O.f46674OooO00o;
            o000000O.OooOoOO();
            ConstraintLayout constraintLayout2 = OooOOo().f58217OooO00o;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "mBinding.root");
            o000OO00.OooOOOO(constraintLayout2);
        }
    }

    public final void OooOo0(GiftPropModel giftPropModel) {
        String string;
        if (this.f53399Oooo000) {
            return;
        }
        this.f53401Oooo00o = giftPropModel;
        ConstraintLayout constraintLayout = OooOOo().f58231OooOOOo;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "mBinding.layoutSendGiftEffect");
        o000OO00.OooOOOO(constraintLayout);
        if (giftPropModel.isBlind() && o0000O0O.OooO0o(giftPropModel.getLocalSendResultImageUrl())) {
            String localSendResultImageUrl = giftPropModel.getLocalSendResultImageUrl();
            string = o0OoOo0.OooOOO(localSendResultImageUrl != null ? StringsKt.trim((CharSequence) localSendResultImageUrl).toString() : null, "");
        } else {
            string = StringsKt.trim((CharSequence) giftPropModel.getImageUrl()).toString();
        }
        SVGAView sVGAView = OooOOo().f58223OooO0oO;
        int i = oOo00OO0.icon_gift_default_gray;
        sVGAView.f10172OooOooO = i;
        sVGAView.setImageResource(i);
        sVGAView.OooOO0O(string, null);
        OooOOo().f58221OooO0o.setNumber(giftPropModel.getLocalCount());
        ((AnimatorSet) this.f53400Oooo00O.getValue()).start();
    }

    public final s9 OooOo00() {
        return (s9) this.f53395OooOoo.getValue();
    }

    public final void OooOo0O() {
        if (this.f10134OooO0O0.isShowing()) {
            if (this.f53374OooO == GiftPropTypeShow.InRoom) {
                if (com.yalla.yalla.service.room.OooO00o.f24981OooOO0.f47414OooO0OO.size() <= 1) {
                    OooOoOO(d6.f53265OooO0o0);
                } else if (Intrinsics.areEqual(this.f53382OooOOOO, d6.f53265OooO0o0)) {
                    OooOoOO(d6.f53266OooO0oO);
                }
            }
            OooOoO(this.f53383OooOOOo);
            if (!this.f53394OooOoOO) {
                if (!this.f53391OooOo0o.f53255OooO00o.isEmpty()) {
                    GiftPropModel giftPropModel = this.f53384OooOOo;
                    if (giftPropModel == null) {
                        OooOo0o(0, null);
                    } else {
                        int i = 0;
                        int i2 = -1;
                        for (Object obj : this.f53387OooOo) {
                            int i3 = i + 1;
                            if (i < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            if (giftPropModel.getTypeUser() == ((Number) obj).intValue() && i2 == -1) {
                                i2 = i;
                            }
                            i = i3;
                        }
                        OooOo0o(i2 != -1 ? i2 : 0, Integer.valueOf(giftPropModel.getGiftId()));
                    }
                }
                this.f53394OooOoOO = true;
            }
            ConstraintLayout constraintLayout = OooOOo().f58228OooOOO;
            h9.OooO00o oooO00o = this.f53376OooO0oo;
            constraintLayout.setBackground(o0000.OooO0O0(oooO00o.f53293OooO00o));
            TextView textView = OooOOo().f58239OooOo0o;
            int i4 = oooO00o.f53298OooO0o0;
            textView.setTextColor(o0000.OooO00o(i4));
            OooOOo().f58224OooO0oo.setTextColor(o0000.OooO00o(i4));
            GiftView giftView = this.f53385OooOOo0;
            if (giftView != null) {
                giftView.setSelectedGift(true);
            }
        }
    }

    public final void OooOo0o(int i, Integer num) {
        c6 c6Var = this.f53391OooOo0o;
        c6Var.f53258OooO0Oo = i;
        ArrayList arrayList = c6Var.f53255OooO00o;
        if (arrayList.size() > c6Var.f53258OooO0Oo) {
            OooOOo().f58242OooOoOO.setCurrentItem(c6Var.f53258OooO0Oo);
            this.f53380OooOOO = (GiftSendFragment) arrayList.get(c6Var.f53258OooO0Oo);
        }
        if (num == null) {
            GiftSendFragment giftSendFragment = this.f53380OooOOO;
            if (giftSendFragment != null) {
                GiftSendFragment.initGiftId$default(giftSendFragment, 0, 1, null);
                return;
            }
            return;
        }
        GiftSendFragment giftSendFragment2 = this.f53380OooOOO;
        if (giftSendFragment2 != null) {
            giftSendFragment2.setGiftId(num.intValue());
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    public final void OooOoO(int i) {
        this.f53383OooOOOo = i;
        OooOOo().f58224OooO0oo.setText(String.valueOf(this.f53383OooOOOo));
        Drawable drawableOooO0O0 = o0000.OooO0O0(this.f53376OooO0oo.f53299OooO0oO);
        int i2 = OooO00o.$EnumSwitchMapping$0[this.f53374OooO.ordinal()];
        boolean z = false;
        if (i2 == 1) {
            RoomUserInfoModel roomUserInfoModel = this.f53382OooOOOO;
            RoomUserInfoModel roomUserInfoModel2 = d6.f53265OooO0o0;
            if (Intrinsics.areEqual(roomUserInfoModel, d6.f53264OooO0o)) {
                drawableOooO0O0 = null;
            } else if (Intrinsics.areEqual(this.f53382OooOOOO, d6.f53266OooO0oO)) {
                GiftPropModel giftPropModel = this.f53384OooOOo;
                if (giftPropModel != null && giftPropModel.isBlind()) {
                    z = true;
                }
                if (z) {
                    drawableOooO0O0 = null;
                }
            }
        } else if (i2 == 3 || i2 == 4) {
            GiftPropModel giftPropModel2 = this.f53384OooOOo;
            if (giftPropModel2 != null && giftPropModel2.isBlind()) {
                z = true;
            }
            if (z) {
                drawableOooO0O0 = null;
            }
        }
        oO000Oo.OooO00o(OooOOo().f58224OooO0oo, drawableOooO0O0, ViewLocation.end, p591o0oo000O.OooO.OooO0o0());
    }

    public final void OooOoO0() {
        o00O000o.f44511OooOo0O.observe(this.f53375OooO0oO, new OooOO0O(new OooOOO0()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOoOO(RoomUserInfoModel roomUserInfoModel) {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Long l = (Long) o000000O.OooOOo0().getValue();
        long jLongValue = roomUserInfoModel.getUserId().getValue().longValue();
        if (l == null || l.longValue() != jLongValue) {
            this.f53382OooOOOO = roomUserInfoModel;
        }
        RoomUserInfoModel user = this.f53382OooOOOO;
        GiftCustomMadeWebManager giftCustomMadeWebManagerOooOOoo = OooOOoo();
        giftCustomMadeWebManagerOooOOoo.getClass();
        Intrinsics.checkNotNullParameter(user, "user");
        giftCustomMadeWebManagerOooOOoo.f28000OooO0o = user;
        giftCustomMadeWebManagerOooOOoo.OooO0OO();
        OooOOo().f58241OooOoO0.setRotationX(0.0f);
        OooOOo().f58239OooOo0o.setGravity(8388611);
        if (Intrinsics.areEqual(user, d6.f53265OooO0o0)) {
            OooOOo().f58239OooOo0o.setGravity(17);
            OooOOo().f58239OooOo0o.setText("--");
            NetImageView netImageView = OooOOo().f58229OooOOO0;
            Intrinsics.checkNotNullExpressionValue(netImageView, "mBinding.ivHead");
            o000OO00.OooO0O0(netImageView);
            OooOOo().f58232OooOOo.setBackgroundResource(oOo00OO0.shape_bg_gift_dialog_send_user);
            OooOOo().f58240OooOoO.setBackgroundColor(o0000.OooO00o(oO00O0o.color_00d8c9));
            OooOOo().f58227OooOO0o.setBackground(null);
        } else if (Intrinsics.areEqual(user, d6.f53266OooO0oO)) {
            NetImageView netImageView2 = OooOOo().f58229OooOOO0;
            Intrinsics.checkNotNullExpressionValue(netImageView2, "mBinding.ivHead");
            o000OO00.OooOOOO(netImageView2);
            OooOOo().f58239OooOo0o.setText(o0000.OooO0OO(oO00OOo0.room_dialog_send_gift_all_in_mic));
            OooOOo().f58229OooOOO0.setImageResource(oOo00OO0.room_dialog_all_in_mic);
            OooOOo().f58232OooOOo.setBackgroundResource(oOo00OO0.shape_bg_gift_dialog_send_user);
            OooOOo().f58240OooOoO.setBackgroundColor(o0000.OooO00o(oO00O0o.color_00d8c9));
            OooOOo().f58227OooOO0o.setBackground(null);
        } else if (Intrinsics.areEqual(user, d6.f53264OooO0o)) {
            NetImageView netImageView3 = OooOOo().f58229OooOOO0;
            Intrinsics.checkNotNullExpressionValue(netImageView3, "mBinding.ivHead");
            o000OO00.OooO0O0(netImageView3);
            OooOOo().f58239OooOo0o.setText(o0000.OooO0OO(oO00OOo0.Everyone_in_room));
            OooOOo().f58232OooOOo.setBackgroundResource(oOo00OO0.shape_bg_gift_dialog_send_user);
            OooOOo().f58227OooOO0o.setBackgroundResource(oOo00OO0.shape_bg_dialog_gift_user_all_seleted);
            OooOOo().f58240OooOoO.setBackgroundColor(o0000.OooO00o(oO00O0o.color_00d8c9));
        } else {
            NetImageView netImageView4 = OooOOo().f58229OooOOO0;
            Intrinsics.checkNotNullExpressionValue(netImageView4, "mBinding.ivHead");
            o000OO00.OooOOOO(netImageView4);
            OooOOo().f58239OooOo0o.setText(user.getUserName().getValue());
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this.f10133OooO00o);
            oooO00o.f43911OooO0OO = p396o0Oo0O.OooOOO.OooO00o(user.getUserHeader().getValue());
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
            oooO00o.OooO0Oo(OooOOo().f58229OooOOO0);
            OooOOo().f58232OooOOo.setBackgroundResource(oOo00OO0.shape_bg_gift_dialog_send_user);
            OooOOo().f58240OooOoO.setBackgroundColor(o0000.OooO00o(oO00O0o.color_00d8c9));
            OooOOo().f58227OooOO0o.setBackground(null);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.f53375OooO0oO), null, null, new OooOOO(user, this, null), 3, null);
        }
        OooOOo().f58239OooOo0o.invalidate();
        OooOOo().f58239OooOo0o.requestLayout();
    }
}
