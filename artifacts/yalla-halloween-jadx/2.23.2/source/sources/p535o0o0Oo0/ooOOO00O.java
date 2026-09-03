package p535o0o0Oo0;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.session.o00O0;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.code.android.util.o0O0O00;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentInRoomStateModel;
import com.yalla.yalla.model.moment.MomentStateKt;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.vm.moment.MomentCommentsVM;
import com.yalla.yalla.ui.vm.moment.MomentGiftsVM;
import com.yalla.yalla.ui.vm.moment.MomentPraiseVM;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p194o00o0OO.o0O0ooO;
import p200o00o0OoO.o00OO00O;
import p475o0Ooooo0.o0O00oO0;
import p476o0OooooO.o0OOo000;
import p562o0oOo000.o000000;
import p587o0oOooOO.oo000000;
import p587o0oOooOO.w;
import p598o0oo00Oo.o0000O00;
import p605o0oo0O0O.o0O0O0Oo;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nVideoRightArea.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoRightArea.kt\ncom/yalla/yalla/ui/screen/moment/media/VideoRightAreaKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt\n+ 11 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,606:1\n76#2:607\n76#2:608\n76#2:710\n76#2:711\n76#2:818\n76#2:913\n25#3:609\n456#3,8:630\n464#3,3:644\n25#3:648\n36#3:655\n456#3,8:680\n464#3,3:694\n467#3,3:700\n467#3,3:705\n456#3,8:730\n464#3,3:744\n456#3,8:765\n464#3,3:779\n25#3:783\n25#3:790\n36#3:798\n467#3,3:806\n467#3,3:813\n25#3:819\n36#3:826\n36#3:836\n36#3:844\n456#3,8:868\n464#3,3:882\n36#3:899\n467#3,3:908\n50#3:915\n49#3:916\n456#3,8:940\n464#3,3:954\n467#3,3:961\n1097#4,6:610\n1097#4,6:649\n1097#4,6:656\n1097#4,6:784\n1097#4,6:791\n1097#4,6:799\n1097#4,6:820\n1097#4,6:827\n1097#4,6:837\n1097#4,6:845\n1097#4,6:900\n1097#4,6:917\n154#5:616\n154#5:662\n154#5:698\n154#5:699\n154#5:712\n154#5:748\n154#5:797\n154#5:805\n154#5:811\n154#5:812\n154#5:833\n154#5:834\n154#5:835\n154#5:843\n154#5,11:886\n154#5:897\n154#5:898\n154#5:906\n154#5:907\n154#5:914\n154#5:958\n154#5:959\n154#5:960\n76#6,2:617\n78#6:647\n82#6:709\n72#6,6:713\n78#6:747\n82#6:817\n72#6,6:923\n78#6:957\n82#6:965\n78#7,11:619\n78#7,11:669\n91#7:703\n91#7:708\n78#7,11:719\n78#7,11:754\n91#7:809\n91#7:816\n78#7,11:857\n91#7:911\n78#7,11:929\n91#7:964\n4144#8,6:638\n4144#8,6:688\n4144#8,6:738\n4144#8,6:773\n4144#8,6:876\n4144#8,6:948\n66#9,6:663\n72#9:697\n76#9:704\n67#9,5:749\n72#9:782\n76#9:810\n66#9,6:851\n72#9:885\n76#9:912\n76#10:966\n109#10,2:967\n75#11:969\n108#11,2:970\n81#12:972\n107#12,2:973\n81#12:975\n107#12,2:976\n81#12:978\n107#12,2:979\n*S KotlinDebug\n*F\n+ 1 VideoRightArea.kt\ncom/yalla/yalla/ui/screen/moment/media/VideoRightAreaKt\n*L\n111#1:607\n112#1:608\n325#1:710\n326#1:711\n429#1:818\n567#1:913\n113#1:609\n126#1:630,8\n126#1:644,3\n259#1:648\n260#1:655\n273#1:680,8\n273#1:694,3\n273#1:700,3\n126#1:705,3\n329#1:730,8\n329#1:744,3\n359#1:765,8\n359#1:779,3\n364#1:783\n365#1:790\n392#1:798\n359#1:806,3\n329#1:813,3\n431#1:819\n435#1:826\n446#1:836\n455#1:844\n461#1:868,8\n461#1:882,3\n482#1:899\n461#1:908,3\n572#1:915\n572#1:916\n570#1:940,8\n570#1:954,3\n570#1:961,3\n113#1:610,6\n259#1:649,6\n260#1:656,6\n364#1:784,6\n365#1:791,6\n392#1:799,6\n431#1:820,6\n435#1:827,6\n446#1:837,6\n455#1:845,6\n482#1:900,6\n572#1:917,6\n130#1:616\n275#1:662\n283#1:698\n289#1:699\n327#1:712\n362#1:748\n385#1:797\n395#1:805\n405#1:811\n406#1:812\n443#1:833\n444#1:834\n445#1:835\n453#1:843\n466#1:886,11\n467#1:897\n476#1:898\n502#1:906\n527#1:907\n568#1:914\n585#1:958\n593#1:959\n594#1:960\n126#1:617,2\n126#1:647\n126#1:709\n329#1:713,6\n329#1:747\n329#1:817\n570#1:923,6\n570#1:957\n570#1:965\n126#1:619,11\n273#1:669,11\n273#1:703\n126#1:708\n329#1:719,11\n359#1:754,11\n359#1:809\n329#1:816\n461#1:857,11\n461#1:911\n570#1:929,11\n570#1:964\n126#1:638,6\n273#1:688,6\n329#1:738,6\n359#1:773,6\n461#1:876,6\n570#1:948,6\n273#1:663,6\n273#1:697\n273#1:704\n359#1:749,5\n359#1:782\n359#1:810\n461#1:851,6\n461#1:885\n461#1:912\n113#1:966\n113#1:967,2\n259#1:969\n259#1:970,2\n364#1:972\n364#1:973,2\n365#1:975\n365#1:976,2\n431#1:978\n431#1:979,2\n*E\n"})
public final class ooOOO00O {

    public static final class OooO extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f54259OooO0Oo = new OooO();

        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.moment.media.VideoRightAreaKt$ProfileImageWithFollow$1$1", f = "VideoRightArea.kt", i = {}, l = {437}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f54260OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54261OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MutableState<Boolean> mutableState, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f54261OooO0o0 = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f54261OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f54260OooO0Oo;
            MutableState<Boolean> mutableState = this.f54261OooO0o0;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (mutableState.getValue().booleanValue()) {
                    this.f54260OooO0Oo = 1;
                    if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            mutableState.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f54262OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Function0<Unit> function0) {
            super(0);
            this.f54262OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ooo0o onLogin = new ooo0o(this.f54262OooO0Oo);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f24727OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Context, NetImageView> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f54263OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final NetImageView invoke(Context context) {
            Context context2 = context;
            Intrinsics.checkNotNullParameter(context2, "context");
            return new NetImageView(context2);
        }
    }

    public static final class OooO0o extends Lambda implements Function1<NetImageView, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54264OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(MomentDetailModel momentDetailModel) {
            super(1);
            this.f54264OooO0Oo = momentDetailModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(NetImageView netImageView) {
            NetImageView it = netImageView;
            Intrinsics.checkNotNullParameter(it, "it");
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(it.getContext());
            oooO00o.OooO00o(d1.OooO0OO());
            oooO00o.f43126OooO0OO = p184o00o00O0.OooO0OO.OooO0Oo(this.f54264OooO0Oo.getHeadUrl());
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0Oo(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f54265OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54266OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f54267OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f54268OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54269OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(boolean z, MomentVideoVM momentVideoVM, MomentDetailModel momentDetailModel, LifecycleOwner lifecycleOwner, MutableState<Boolean> mutableState) {
            super(0);
            this.f54265OooO0Oo = z;
            this.f54267OooO0o0 = momentVideoVM;
            this.f54266OooO0o = momentDetailModel;
            this.f54268OooO0oO = lifecycleOwner;
            this.f54269OooO0oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            if (!this.f54265OooO0Oo) {
                oO0Oo0o0 onLogin = new oO0Oo0o0(this.f54267OooO0o0, this.f54266OooO0o, this.f54268OooO0oO, this.f54269OooO0oo);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                } else {
                    Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                    if (activityOooO0O0 != null) {
                        int i = LoginActivity.f24727OooOo0O;
                        LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f54270OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54271OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f54272OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f54273OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f54274OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f54275OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f54276OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(MomentDetailModel momentDetailModel, MomentVideoVM momentVideoVM, long j, boolean z, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.f54271OooO0Oo = momentDetailModel;
            this.f54273OooO0o0 = momentVideoVM;
            this.f54272OooO0o = j;
            this.f54274OooO0oO = z;
            this.f54275OooO0oo = function0;
            this.f54270OooO = i;
            this.f54276OooOO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ooOOO00O.OooO00o(this.f54271OooO0Oo, this.f54273OooO0o0, this.f54272OooO0o, this.f54274OooO0oO, this.f54275OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f54270OooO | 1), this.f54276OooOO0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f54277OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(Function0<Unit> function0) {
            super(0);
            this.f54277OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oO0oO000 onLogin = new oO0oO000(this.f54277OooO0Oo);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f24727OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f54278OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(Function0<Unit> function0) {
            super(0);
            this.f54278OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oO0o0000 onLogin = new oO0o0000(this.f54278OooO0Oo);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f24727OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.moment.media.VideoRightAreaKt$VideoRightArea$1", f = "VideoRightArea.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f54279OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f54280OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54281OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLongState f54282OooO0oO;

        public static final class OooO00o extends Lambda implements Function1<p381o0OOoOo0.o00O0O<MomentInRoomStateModel>, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ MutableLongState f54283OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MutableLongState mutableLongState) {
                super(1);
                this.f54283OooO0Oo = mutableLongState;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(p381o0OOoOo0.o00O0O<MomentInRoomStateModel> o00o0o2) {
                p381o0OOoOo0.o00O0O<MomentInRoomStateModel> launchCollectApi = o00o0o2;
                Intrinsics.checkNotNullParameter(launchCollectApi, "$this$launchCollectApi");
                launchCollectApi.f43270OooO00o = new oOo00o00(this.f54283OooO0Oo);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(MomentVideoVM momentVideoVM, MomentDetailModel momentDetailModel, LifecycleOwner lifecycleOwner, MutableLongState mutableLongState, Continuation<? super OooOOOO> continuation) {
            super(2, continuation);
            this.f54279OooO0Oo = momentVideoVM;
            this.f54281OooO0o0 = momentDetailModel;
            this.f54280OooO0o = lifecycleOwner;
            this.f54282OooO0oO = mutableLongState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOOO(this.f54279OooO0Oo, this.f54281OooO0o0, this.f54280OooO0o, this.f54282OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            p381o0OOoOo0.o0OoOo0.OooO00o(this.f54279OooO0Oo.getInRoomState(this.f54281OooO0o0.getUserId()), this.f54280OooO0o, new OooO00o(this.f54282OooO0oO));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54284OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentCommentsVM f54285OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f54286OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MomentPraiseVM f54287OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MomentGiftsVM f54288OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(MomentDetailModel momentDetailModel, MomentVideoVM momentVideoVM, MomentCommentsVM momentCommentsVM, MomentPraiseVM momentPraiseVM, MomentGiftsVM momentGiftsVM) {
            super(0);
            this.f54284OooO0Oo = momentDetailModel;
            this.f54286OooO0o0 = momentVideoVM;
            this.f54285OooO0o = momentCommentsVM;
            this.f54287OooO0oO = momentPraiseVM;
            this.f54288OooO0oo = momentGiftsVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oOO0000 onLogin = new oOO0000(this.f54284OooO0Oo, this.f54286OooO0o0, this.f54285OooO0o, this.f54287OooO0oO, this.f54288OooO0oo);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f24727OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f54289OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f54290OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54291OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f54292OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f54293OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableLongState f54294OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(boolean z, MomentVideoVM momentVideoVM, MomentDetailModel momentDetailModel, LifecycleOwner lifecycleOwner, MutableLongState mutableLongState, AppCompatActivity appCompatActivity) {
            super(0);
            this.f54290OooO0Oo = z;
            this.f54292OooO0o0 = momentVideoVM;
            this.f54291OooO0o = momentDetailModel;
            this.f54293OooO0oO = lifecycleOwner;
            this.f54294OooO0oo = mutableLongState;
            this.f54289OooO = appCompatActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            if (!this.f54290OooO0Oo) {
                MutableLongState mutableLongState = this.f54294OooO0oo;
                o0oo0000.OooO00o.OooO0OO("106110", MapsKt.mapOf(TuplesKt.to("state", Integer.valueOf(mutableLongState.getLongValue() != 0 ? 1 : 0))));
                MomentDetailModel momentDetailModel = this.f54291OooO0o;
                p381o0OOoOo0.o0OoOo0.OooO00o(this.f54292OooO0o0.getInRoomState(momentDetailModel.getUserId()), this.f54293OooO0oO, new oOO00000(momentDetailModel, this.f54289OooO, mutableLongState));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54295OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f54296OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f54297OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<MomentDetailModel, Unit> f54298OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Oooo0(MomentDetailModel momentDetailModel, AppCompatActivity appCompatActivity, MomentVideoVM momentVideoVM, Function1<? super MomentDetailModel, Unit> function1) {
            super(0);
            this.f54295OooO0Oo = momentDetailModel;
            this.f54297OooO0o0 = appCompatActivity;
            this.f54296OooO0o = momentVideoVM;
            this.f54298OooO0oO = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oOO00O0 onLogin = new oOO00O0(this.f54295OooO0Oo, this.f54297OooO0o0, this.f54296OooO0o, this.f54298OooO0oO);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f24727OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54299OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f54300OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(MomentDetailModel momentDetailModel, MomentVideoVM momentVideoVM) {
            super(0);
            this.f54299OooO0Oo = momentDetailModel;
            this.f54300OooO0o0 = momentVideoVM;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0oo0000.OooO00o.OooO0O0("106112");
            MomentDetailModel momentDetailModel = this.f54299OooO0Oo;
            long userId = momentDetailModel.getUserId();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            Long l = (Long) o0O00oO0.OooOOo0().getValue();
            if (l != null && userId == l.longValue()) {
                String strOooO0OO = o0000.OooO0OO(o000000.video_feed_send_gift_tip);
                if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                    o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                    }
                }
            } else {
                oOO000 onLogin = new oOO000(momentDetailModel, this.f54300OooO0o0);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                } else {
                    Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                    if (activityOooO0O0 != null) {
                        int i = LoginActivity.f24727OooOo0O;
                        LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.moment.media.VideoRightAreaKt$VideoRightArea$2$5", f = "VideoRightArea.kt", i = {}, l = {263}, m = "invokeSuspend", n = {}, s = {})
    public static final class o000oOoO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f54301OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Animatable<Float, AnimationVector1D> f54302OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54303OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableFloatState f54304OooO0oO;

        public static final class OooO00o extends Lambda implements Function1<Animatable<Float, AnimationVector1D>, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ MutableFloatState f54305OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MutableFloatState mutableFloatState) {
                super(1);
                this.f54305OooO0Oo = mutableFloatState;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Animatable<Float, AnimationVector1D> animatable) {
                Animatable<Float, AnimationVector1D> animateTo = animatable;
                Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                this.f54305OooO0Oo.setFloatValue(animateTo.getValue().floatValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(MutableState<Boolean> mutableState, Animatable<Float, AnimationVector1D> animatable, MutableFloatState mutableFloatState, Continuation<? super o000oOoO> continuation) {
            super(2, continuation);
            this.f54303OooO0o0 = mutableState;
            this.f54302OooO0o = animatable;
            this.f54304OooO0oO = mutableFloatState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o000oOoO(this.f54303OooO0o0, this.f54302OooO0o, this.f54304OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o000oOoO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f54301OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!this.f54303OooO0o0.getValue().booleanValue()) {
                    Animatable<Float, AnimationVector1D> animatable = this.f54302OooO0o;
                    MutableFloatState mutableFloatState = this.f54304OooO0oO;
                    Float fBoxFloat = Boxing.boxFloat(mutableFloatState.getFloatValue() + 360.0f);
                    InfiniteRepeatableSpec infiniteRepeatableSpecM81infiniteRepeatable9IiC70o$default = AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(3500, 0, EasingKt.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null);
                    OooO00o oooO00o = new OooO00o(mutableFloatState);
                    this.f54301OooO0Oo = 1;
                    if (Animatable.animateTo$default(animatable, fBoxFloat, infiniteRepeatableSpecM81infiniteRepeatable9IiC70o$default, null, oooO00o, this, 4, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function1<GraphicsLayerScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Animatable<Float, AnimationVector1D> f54306OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(Animatable<Float, AnimationVector1D> animatable) {
            super(1);
            this.f54306OooO0Oo = animatable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(GraphicsLayerScope graphicsLayerScope) {
            GraphicsLayerScope graphicsLayer = graphicsLayerScope;
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.setRotationZ(this.f54306OooO0Oo.getValue().floatValue());
            return Unit.INSTANCE;
        }
    }

    public static final class o00Oo0 extends Lambda implements Function1<Context, NetImageView> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00Oo0 f54307OooO0Oo = new o00Oo0();

        public o00Oo0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final NetImageView invoke(Context context) {
            Context context2 = context;
            Intrinsics.checkNotNullParameter(context2, "context");
            return new NetImageView(context2);
        }
    }

    public static final class o00Ooo extends Lambda implements Function1<NetImageView, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54308OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(MomentDetailModel momentDetailModel) {
            super(1);
            this.f54308OooO0Oo = momentDetailModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(NetImageView netImageView) {
            NetImageView it = netImageView;
            Intrinsics.checkNotNullParameter(it, "it");
            it.setScaleType(ImageView.ScaleType.CENTER_CROP);
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(it.getContext());
            oooO00o.f43126OooO0OO = this.f54308OooO0Oo.getCoverPic();
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0Oo(it);
            return Unit.INSTANCE;
        }
    }

    public static final class o00oO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f54309OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f54310OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oO0o(boolean z, Function0<Unit> function0) {
            super(0);
            this.f54309OooO0Oo = z;
            this.f54310OooO0o0 = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            if (!this.f54309OooO0Oo) {
                oOO00OO onLogin = new oOO00OO(this.f54310OooO0o0);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                } else {
                    Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                    if (activityOooO0O0 != null) {
                        int i = LoginActivity.f24727OooOo0O;
                        LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0OO00O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f54311OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OO00O(MutableState<String> mutableState) {
            super(0);
            this.f54311OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f54311OooO0Oo.setValue("");
            return Unit.INSTANCE;
        }
    }

    public static final class o0OOO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f54312OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f54313OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54314OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f54315OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OOO0o(boolean z, MomentDetailModel momentDetailModel, MomentVideoVM momentVideoVM, LifecycleOwner lifecycleOwner) {
            super(0);
            this.f54312OooO0Oo = z;
            this.f54314OooO0o0 = momentDetailModel;
            this.f54313OooO0o = momentVideoVM;
            this.f54315OooO0oO = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            if (!this.f54312OooO0Oo) {
                oOO0O000 onLogin = new oOO0O000(this.f54314OooO0o0, this.f54313OooO0o, this.f54315OooO0oO);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                } else {
                    Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                    if (activityOooO0O0 != null) {
                        int i = LoginActivity.f24727OooOo0O;
                        LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.moment.media.VideoRightAreaKt$VideoRightLike$2$1$1", f = "VideoRightArea.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0Oo0oo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54316OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f54317OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54318OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0Oo0oo(MomentDetailModel momentDetailModel, MutableState<Boolean> mutableState, MutableState<String> mutableState2, Continuation<? super o0Oo0oo> continuation) {
            super(2, continuation);
            this.f54316OooO0Oo = momentDetailModel;
            this.f54318OooO0o0 = mutableState;
            this.f54317OooO0o = mutableState2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o0Oo0oo(this.f54316OooO0Oo, this.f54318OooO0o0, this.f54317OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o0Oo0oo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            MomentDetailModel momentDetailModel = this.f54316OooO0Oo;
            o0000O00.OooO0O0("isPraise = " + momentDetailModel.isPraise());
            MutableState<Boolean> mutableState = this.f54318OooO0o0;
            if (mutableState.getValue().booleanValue()) {
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            }
            this.f54317OooO0o.setValue(momentDetailModel.isPraise() ? "svga/anim_video_like.svga" : "svga/anim_video_unlike.svga");
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function1<GraphicsLayerScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Animatable<Float, AnimationVector1D> f54319OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(Animatable<Float, AnimationVector1D> animatable) {
            super(1);
            this.f54319OooO0Oo = animatable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(GraphicsLayerScope graphicsLayerScope) {
            GraphicsLayerScope graphicsLayer = graphicsLayerScope;
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.setRotationZ(this.f54319OooO0Oo.getValue().floatValue());
            return Unit.INSTANCE;
        }
    }

    public static final class o0ooOOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f54320OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f54321OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f54322OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f54323OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Modifier f54324OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f54325OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f54326OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0ooOOo(int i, String str, boolean z, Modifier modifier, Function0<Unit> function0, int i2, int i3) {
            super(2);
            this.f54321OooO0Oo = i;
            this.f54323OooO0o0 = str;
            this.f54322OooO0o = z;
            this.f54324OooO0oO = modifier;
            this.f54325OooO0oo = function0;
            this.f54320OooO = i2;
            this.f54326OooOO0 = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ooOOO00O.OooO0OO(this.f54321OooO0Oo, this.f54323OooO0o0, this.f54322OooO0o, this.f54324OooO0oO, this.f54325OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f54320OooO | 1), this.f54326OooOO0);
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54327OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54328OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentCommentsVM f54329OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f54330OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MomentPraiseVM f54331OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MomentGiftsVM f54332OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ boolean f54333OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ Function1<MomentDetailModel, Unit> f54334OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ int f54335OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ int f54336OooOOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public oo000o(MomentDetailModel momentDetailModel, MomentVideoVM momentVideoVM, MomentCommentsVM momentCommentsVM, MomentPraiseVM momentPraiseVM, MomentGiftsVM momentGiftsVM, MutableState<Boolean> mutableState, boolean z, Function1<? super MomentDetailModel, Unit> function1, int i, int i2) {
            super(2);
            this.f54328OooO0Oo = momentDetailModel;
            this.f54330OooO0o0 = momentVideoVM;
            this.f54329OooO0o = momentCommentsVM;
            this.f54331OooO0oO = momentPraiseVM;
            this.f54332OooO0oo = momentGiftsVM;
            this.f54327OooO = mutableState;
            this.f54333OooOO0 = z;
            this.f54334OooOO0O = function1;
            this.f54335OooOO0o = i;
            this.f54336OooOOO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ooOOO00O.OooO0O0(this.f54328OooO0Oo, this.f54330OooO0o0, this.f54329OooO0o, this.f54331OooO0oO, this.f54332OooO0oo, this.f54327OooO, this.f54333OooOO0, this.f54334OooOO0O, composer, RecomposeScopeImplKt.updateChangedFlags(this.f54335OooOO0o | 1), this.f54336OooOOO0);
            return Unit.INSTANCE;
        }
    }

    public static final class oo0o0Oo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54337OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f54338OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f54339OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f54340OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo0o0Oo(MomentDetailModel momentDetailModel, MomentVideoVM momentVideoVM, boolean z, int i) {
            super(2);
            this.f54337OooO0Oo = momentDetailModel;
            this.f54339OooO0o0 = momentVideoVM;
            this.f54338OooO0o = z;
            this.f54340OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54340OooO0oO | 1);
            MomentVideoVM momentVideoVM = this.f54339OooO0o0;
            boolean z = this.f54338OooO0o;
            ooOOO00O.OooO0Oo(this.f54337OooO0Oo, momentVideoVM, z, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(MomentDetailModel momentDetailModel, MomentVideoVM momentVideoVM, long j, boolean z, Function0<Unit> function0, Composer composer, int i, int i2) {
        Modifier modifierOooO0O0;
        Modifier modifierBorder;
        FiniteAnimationSpec finiteAnimationSpec;
        Composer composerStartRestartGroup = composer.startRestartGroup(-9513748);
        long j2 = (i2 & 4) != 0 ? 0L : j;
        Function0<Unit> function1 = (i2 & 16) != 0 ? null : function0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-9513748, i, -1, "com.yalla.yalla.ui.screen.moment.media.ProfileImageWithFollow (VideoRightArea.kt:427)");
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        Boolean boolValueOf = Boolean.valueOf(((Boolean) mutableState.getValue()).booleanValue());
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(mutableState);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new OooO00o(mutableState, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 64);
        if (j2 != 0) {
            composerStartRestartGroup.startReplaceableGroup(216304258);
            Modifier modifierOooO0O1 = kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO0O0(60, SizeKt.m530width3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(15), 7, null), Dp.m3775constructorimpl(50)), composerStartRestartGroup, 1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(function1);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new OooOOO0(function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            modifierOooO0O0 = o0O0O00.OooO0O0(modifierOooO0O1, false, false, 0L, false, null, null, null, (Function0) objRememberedValue3, 255);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(216304521);
            Modifier modifierClip = ClipKt.clip(PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(14), 7, null), RoundedCornerShapeKt.getCircleShape());
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged3 = composerStartRestartGroup.changed(function1);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new OooOOO(function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            modifierOooO0O0 = o0O0O00.OooO0O0(modifierClip, false, false, 0L, false, null, null, null, (Function0) objRememberedValue4, 255);
            composerStartRestartGroup.endReplaceableGroup();
        }
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierThen = companion2.then(modifierOooO0O0);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion3 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion3, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierThen);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier modifierAlign = boxScopeInstance.align(ClipKt.clip(SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion2, 0.0f, j2 != 0 ? Dp.m3775constructorimpl((float) 6.5d) : Dp.m3775constructorimpl(0), 0.0f, Dp.m3775constructorimpl(9), 5, null), Dp.m3775constructorimpl(46)), RoundedCornerShapeKt.getCircleShape()), companion3.getTopCenter());
        if (j2 != 0) {
            modifierBorder = companion2;
        } else {
            modifierBorder = BorderKt.border(companion2, BorderStrokeKt.m198BorderStrokecXLIe8U(Dp.m3775constructorimpl(1), Color.INSTANCE.m1718getWhite0d7_KjU()), RoundedCornerShapeKt.getCircleShape());
        }
        Modifier modifierThen2 = modifierAlign.then(modifierBorder);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged4 = composerStartRestartGroup.changed(function1);
        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
        if (zChanged4 || objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new OooO0O0(function1);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
        }
        composerStartRestartGroup.endReplaceableGroup();
        AndroidView_androidKt.AndroidView(OooO0OO.f54263OooO0Oo, o0O0O00.OooO0O0(modifierThen2, false, false, 0L, false, null, null, null, (Function0) objRememberedValue5, 255), new OooO0o(momentDetailModel), composerStartRestartGroup, 6, 0);
        composerStartRestartGroup.startReplaceableGroup(1759602187);
        if (j2 != 0) {
            finiteAnimationSpec = null;
            o0O0ooO.OooO00o(p562o0oOo000.o00oO0o.moment_user_in_room, 2000L, ContentScale.INSTANCE.getCrop(), 0, null, null, null, SizeKt.m517requiredSize3ABfNKs(boxScopeInstance.align(companion2, companion3.getTopCenter()), Dp.m3775constructorimpl(58)), composerStartRestartGroup, 432, 120);
        } else {
            finiteAnimationSpec = null;
        }
        FiniteAnimationSpec finiteAnimationSpec2 = finiteAnimationSpec;
        composerStartRestartGroup.endReplaceableGroup();
        AnimatedVisibilityKt.AnimatedVisibility(((Boolean) r36.getValue()).booleanValue(), SemanticsModifierKt.semantics$default(boxScopeInstance.align(companion2, companion3.getBottomCenter()), false, OooO.f54259OooO0Oo, 1, finiteAnimationSpec2), EnterExitTransitionKt.fadeIn$default(finiteAnimationSpec2, 0.0f, 3, finiteAnimationSpec2), EnterExitTransitionKt.fadeOut$default(finiteAnimationSpec2, 0.0f, 3, finiteAnimationSpec2), (String) null, oo00oO.f54253OooO00o, composerStartRestartGroup, 200064, 16);
        composerStartRestartGroup.startReplaceableGroup(216306773);
        if (!momentDetailModel.isFollow()) {
            long userId = momentDetailModel.getUserId();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            Long l = (Long) o0O00oO0.OooOOo0().getValue();
            if (l == null || userId != l.longValue()) {
                mutableState.setValue(Boolean.FALSE);
                ImageKt.Image(PainterResources_androidKt.painterResource(p562o0oOo000.o0O0O00.ic_video_follow, composerStartRestartGroup, 0), (String) null, o0O0O00.OooO0O0(boxScopeInstance.align(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m525size3ABfNKs(companion2, Dp.m3775constructorimpl(19)), RoundedCornerShapeKt.getCircleShape()), o0OOo000.f48367oOooo0o, null, 2, null), companion3.getBottomCenter()), false, false, 0L, false, null, null, null, new OooOO0(z, momentVideoVM, momentDetailModel, lifecycleOwner, mutableState), 255), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            }
        }
        if (androidx.compose.animation.OooOo.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(momentDetailModel, momentVideoVM, j2, z, function1, i, i2));
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0217  */
    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(@NotNull MomentDetailModel videoDetailModel, @NotNull MomentVideoVM videoVM, @NotNull MomentCommentsVM commentsVM, @NotNull MomentPraiseVM likesVM, @NotNull MomentGiftsVM giftsVM, @NotNull MutableState<Boolean> videoPauseState, boolean z, @Nullable Function1<? super MomentDetailModel, Unit> function1, @Nullable Composer composer, int i, int i2) {
        int i3;
        Continuation continuation;
        Intrinsics.checkNotNullParameter(videoDetailModel, "videoDetailModel");
        Intrinsics.checkNotNullParameter(videoVM, "videoVM");
        Intrinsics.checkNotNullParameter(commentsVM, "commentsVM");
        Intrinsics.checkNotNullParameter(likesVM, "likesVM");
        Intrinsics.checkNotNullParameter(giftsVM, "giftsVM");
        Intrinsics.checkNotNullParameter(videoPauseState, "videoPauseState");
        Composer composerStartRestartGroup = composer.startRestartGroup(2091203831);
        Function1<? super MomentDetailModel, Unit> function2 = (i2 & 128) != 0 ? null : function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2091203831, i, -1, "com.yalla.yalla.ui.screen.moment.media.VideoRightArea (VideoRightArea.kt:109)");
        }
        Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        AppCompatActivity appCompatActivity = objConsume instanceof AppCompatActivity ? (AppCompatActivity) objConsume : null;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotLongStateKt.mutableLongStateOf(0L);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableLongState mutableLongState = (MutableLongState) objRememberedValue;
        Function1<? super MomentDetailModel, Unit> function3 = function2;
        EffectsKt.LaunchedEffect(Unit.INSTANCE, new OooOOOO(videoVM, videoDetailModel, lifecycleOwner, mutableLongState, null), composerStartRestartGroup, 70);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
        Arrangement.Vertical bottom = Arrangement.INSTANCE.getBottom();
        Modifier.Companion companion3 = Modifier.INSTANCE;
        Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(PaddingKt.m482paddingqDBjuR0$default(companion3, 0.0f, 0.0f, Dp.m3775constructorimpl(4), 0.0f, 11, null), 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(bottom, centerHorizontally, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        OooO00o(videoDetailModel, videoVM, mutableLongState.getLongValue(), z, new OooOo00(z, videoVM, videoDetailModel, lifecycleOwner, mutableLongState, appCompatActivity), composerStartRestartGroup, ((i >> 9) & 7168) | 72, 0);
        int i4 = (i >> 12) & 896;
        OooO0Oo(videoDetailModel, videoVM, z, composerStartRestartGroup, i4 | 72);
        int i5 = MomentStateKt.isApprovedState(videoDetailModel) ? p562o0oOo000.o0O0O00.ic_video_comments : p562o0oOo000.o0O0O00.ic_video_comments_gray;
        composerStartRestartGroup.startReplaceableGroup(-1729067502);
        String strStringResource = videoDetailModel.getCommentNum() == 0 ? StringResources_androidKt.stringResource(o000000.video_feed_comment, composerStartRestartGroup, 0) : o0O0O0Oo.OooO0o(videoDetailModel.getCommentNum(), true);
        composerStartRestartGroup.endReplaceableGroup();
        Intrinsics.checkNotNull(strStringResource);
        OooO0OO(i5, strStringResource, z, o0O0O00.OooO0Oo(companion3, composerStartRestartGroup, 6), new OooOo(videoDetailModel, videoVM, commentsVM, likesVM, giftsVM), composerStartRestartGroup, i4, 0);
        if (MomentStateKt.isApprovedState(videoDetailModel)) {
            long userId = videoDetailModel.getUserId();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            Long l = (Long) o0O00oO0.OooOOo0().getValue();
            if (l != null && userId == l.longValue()) {
                i3 = p562o0oOo000.o0O0O00.ic_video_gift_gray;
            } else {
                i3 = p562o0oOo000.o0O0O00.ic_video_gift;
            }
        } else {
            i3 = p562o0oOo000.o0O0O00.ic_video_gift_gray;
        }
        int i6 = i3;
        composerStartRestartGroup.startReplaceableGroup(-1729066154);
        String strStringResource2 = videoDetailModel.getTotalPropValue() == 0 ? StringResources_androidKt.stringResource(o000000.video_feed_gift, composerStartRestartGroup, 0) : o0O0O0Oo.OooO0o(videoDetailModel.getTotalPropValue(), true);
        composerStartRestartGroup.endReplaceableGroup();
        Intrinsics.checkNotNull(strStringResource2);
        OooO0OO(i6, strStringResource2, z, null, new Oooo000(videoDetailModel, videoVM), composerStartRestartGroup, i4, 8);
        int i7 = MomentStateKt.isApprovedState(videoDetailModel) ? p562o0oOo000.o0O0O00.ic_video_share : p562o0oOo000.o0O0O00.ic_video_share_gray;
        composerStartRestartGroup.startReplaceableGroup(-1729065136);
        String strStringResource3 = videoDetailModel.getShareNum() == 0 ? StringResources_androidKt.stringResource(o000000.video_feed_share, composerStartRestartGroup, 0) : o0O0O0Oo.OooO0o(videoDetailModel.getShareNum(), true);
        composerStartRestartGroup.endReplaceableGroup();
        Intrinsics.checkNotNull(strStringResource3);
        OooO0OO(i7, strStringResource3, z, o0O0O00.OooO0Oo(companion3, composerStartRestartGroup, 6), new Oooo0(videoDetailModel, appCompatActivity, videoVM, function3), composerStartRestartGroup, i4, 0);
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableFloatState mutableFloatState = (MutableFloatState) objRememberedValue2;
        Boolean value = videoPauseState.getValue();
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(value);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = AnimatableKt.Animatable$default(mutableFloatState.getFloatValue(), 0.0f, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            continuation = null;
        } else {
            continuation = null;
        }
        composerStartRestartGroup.endReplaceableGroup();
        Animatable animatable = (Animatable) objRememberedValue3;
        EffectsKt.LaunchedEffect(videoPauseState.getValue(), new o000oOoO(videoPauseState, animatable, mutableFloatState, continuation), composerStartRestartGroup, 64);
        float f = 46;
        Modifier modifierClip = ClipKt.clip(SizeKt.m525size3ABfNKs(companion3, Dp.m3775constructorimpl(f)), RoundedCornerShapeKt.getCircleShape());
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierClip);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor2);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl2, measurePolicyOooO00o, composerM1320constructorimpl2, currentCompositionLocalMap2);
        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        ImageKt.Image(PainterResources_androidKt.painterResource(p562o0oOo000.o0O0O00.ic_video_music_play_bg, composerStartRestartGroup, 0), (String) null, GraphicsLayerModifierKt.graphicsLayer(ClipKt.clip(SizeKt.m525size3ABfNKs(companion3, Dp.m3775constructorimpl(f)), RoundedCornerShapeKt.getCircleShape()), new o0OoOo0(animatable)), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
        AndroidView_androidKt.AndroidView(o00Oo0.f54307OooO0Oo, GraphicsLayerModifierKt.graphicsLayer(boxScopeInstance.align(ClipKt.clip(SizeKt.m525size3ABfNKs(companion3, Dp.m3775constructorimpl(27)), RoundedCornerShapeKt.getCircleShape()), companion2.getCenter()), new o00O0O(animatable)), new o00Ooo(videoDetailModel), composerStartRestartGroup, 6, 0);
        if (com.facebook.appevents.OooOOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oo000o(videoDetailModel, videoVM, commentsVM, likesVM, giftsVM, videoPauseState, z, function3, i, i2));
    }

    /* JADX WARN: Code duplicated, block: B:46:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:73:0x013e  */
    /* JADX WARN: Code duplicated, block: B:76:0x014a  */
    /* JADX WARN: Code duplicated, block: B:77:0x014e  */
    /* JADX WARN: Code duplicated, block: B:80:0x015f  */
    /* JADX WARN: Code duplicated, block: B:82:0x016d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0263  */
    /* JADX WARN: Code duplicated, block: B:90:0x026f  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(int i, String str, boolean z, Modifier modifier, Function0<Unit> function0, Composer composer, int i2, int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Modifier modifier3;
        boolean zOooO00o;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1320constructorimpl;
        Function2 function2OooO00o;
        Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-784844880);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i6 = i3 & 8;
        if (i6 == 0) {
            if ((i2 & 7168) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            if ((i3 & 16) != 0) {
                i4 |= 24576;
            } else if ((57344 & i2) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i4 |= i5;
            }
            if ((46811 & i4) == 9362 || !composerStartRestartGroup.getSkipping()) {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-784844880, i4, -1, "com.yalla.yalla.ui.screen.moment.media.VideoRightItem (VideoRightArea.kt:565)");
                }
                float fMo326toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(Dp.m3775constructorimpl(3));
                Modifier.Companion companion = Modifier.INSTANCE;
                zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(function0);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zOooO00o || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new o00oO0o(z, function0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierOooO0O0 = o0O0O00.OooO0O0(companion, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier modifier5 = modifier3;
                ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, i4 & 14), (String) null, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(35)).then(modifier3), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                oo000000.OooO00o(str, new w(TextUnitKt.getSp(8), TextUnitKt.getSp(12)), SizeKt.m530width3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, Dp.m3775constructorimpl(2), 0.0f, Dp.m3775constructorimpl(15), 5, null), Dp.m3775constructorimpl(60)), o0OOo000.f48149OooOOo, null, FontWeight.INSTANCE.getMedium(), null, 0L, null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 1, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(o0OOo000.f48157OooOoO, 0L, fMo326toPx0680j_4, 2, null), (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16769023, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i4 >> 3) & 14) | 196992, 3072, 7632);
                if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o0ooOOo(i, str, z, modifier4, function0, i2, i3));
        }
        i4 |= 3072;
        modifier2 = modifier;
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((57344 & i2) == 0) {
            if (composerStartRestartGroup.changedInstance(function0)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i4 |= i5;
        }
        if ((46811 & i4) == 9362) {
            if (i6 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-784844880, i4, -1, "com.yalla.yalla.ui.screen.moment.media.VideoRightItem (VideoRightArea.kt:565)");
            }
            float fMo326toPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(Dp.m3775constructorimpl(3));
            Modifier.Companion companion3 = Modifier.INSTANCE;
            zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(function0);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zOooO00o) {
                objRememberedValue = new o00oO0o(z, function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new o00oO0o(z, function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierOooO0O1 = o0O0O00.OooO0O0(companion3, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
            Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally2, composerStartRestartGroup, 48, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            constructor = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO0O1);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyOooO00o2, composerM1320constructorimpl, currentCompositionLocalMap2);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            Modifier modifier6 = modifier3;
            ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, i4 & 14), (String) null, SizeKt.m525size3ABfNKs(companion3, Dp.m3775constructorimpl(35)).then(modifier3), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            oo000000.OooO00o(str, new w(TextUnitKt.getSp(8), TextUnitKt.getSp(12)), SizeKt.m530width3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion3, 0.0f, Dp.m3775constructorimpl(2), 0.0f, Dp.m3775constructorimpl(15), 5, null), Dp.m3775constructorimpl(60)), o0OOo000.f48149OooOOo, null, FontWeight.INSTANCE.getMedium(), null, 0L, null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 1, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(o0OOo000.f48157OooOoO, 0L, fMo326toPx0680j_5, 2, null), (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16769023, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i4 >> 3) & 14) | 196992, 3072, 7632);
            if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier6;
        } else {
            if (i6 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-784844880, i4, -1, "com.yalla.yalla.ui.screen.moment.media.VideoRightItem (VideoRightArea.kt:565)");
            }
            float fMo326toPx0680j_6 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(Dp.m3775constructorimpl(3));
            Modifier.Companion companion5 = Modifier.INSTANCE;
            zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(function0);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zOooO00o) {
                objRememberedValue = new o00oO0o(z, function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new o00oO0o(z, function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierOooO0O2 = o0O0O00.OooO0O0(companion5, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
            Alignment.Horizontal centerHorizontally3 = Alignment.INSTANCE.getCenterHorizontally();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o3 = androidx.compose.material.OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally3, composerStartRestartGroup, 48, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
            constructor = companion6.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOooO0O2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion6, composerM1320constructorimpl, measurePolicyOooO00o3, composerM1320constructorimpl, currentCompositionLocalMap3);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
            Modifier modifier7 = modifier3;
            ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, i4 & 14), (String) null, SizeKt.m525size3ABfNKs(companion5, Dp.m3775constructorimpl(35)).then(modifier3), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            oo000000.OooO00o(str, new w(TextUnitKt.getSp(8), TextUnitKt.getSp(12)), SizeKt.m530width3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion5, 0.0f, Dp.m3775constructorimpl(2), 0.0f, Dp.m3775constructorimpl(15), 5, null), Dp.m3775constructorimpl(60)), o0OOo000.f48149OooOOo, null, FontWeight.INSTANCE.getMedium(), null, 0L, null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 1, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(o0OOo000.f48157OooOoO, 0L, fMo326toPx0680j_6, 2, null), (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16769023, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i4 >> 3) & 14) | 196992, 3072, 7632);
            if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier7;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0ooOOo(i, str, z, modifier4, function0, i2, i3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0Oo(MomentDetailModel momentDetailModel, MomentVideoVM momentVideoVM, boolean z, Composer composer, int i) {
        Modifier.Companion companion;
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-552363209);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-552363209, i, -1, "com.yalla.yalla.ui.screen.moment.media.VideoRightLike (VideoRightArea.kt:323)");
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        float fMo326toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(Dp.m3775constructorimpl(3));
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(companion2, false, false, 0L, false, null, null, null, new o0OOO0o(z, momentDetailModel, momentVideoVM, lifecycleOwner), 253);
        Alignment.Companion companion3 = Alignment.INSTANCE;
        Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Alignment center = companion3.getCenter();
        float f = 36;
        Modifier modifierOooO00o = o00O0.OooO00o(f, companion2, composerStartRestartGroup, 733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO00o);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor2);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl2, measurePolicyRememberBoxMeasurePolicy, composerM1320constructorimpl2, currentCompositionLocalMap2);
        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion5 = Composer.INSTANCE;
        if (objRememberedValue == companion5.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion5.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(Boolean.valueOf(momentDetailModel.isPraise()), new o0Oo0oo(momentDetailModel, (MutableState) objRememberedValue2, mutableState, null), composerStartRestartGroup, 64);
        if (StringsKt.isBlank((String) mutableState.getValue())) {
            composerStartRestartGroup.startReplaceableGroup(-1240419698);
            if (momentDetailModel.isPraise()) {
                i2 = p562o0oOo000.o0O0O00.ic_video_like;
            } else {
                i2 = MomentStateKt.isApprovedState(momentDetailModel) ? p562o0oOo000.o0O0O00.ic_video_not_like : p562o0oOo000.o0O0O00.ic_video_not_like_gray;
            }
            companion = companion2;
            ImageKt.Image(PainterResources_androidKt.painterResource(i2, composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(companion2, Dp.m3775constructorimpl(f)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            companion = companion2;
            composerStartRestartGroup.startReplaceableGroup(-1240419191);
            String str = (String) mutableState.getValue();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion5.getEmpty()) {
                objRememberedValue3 = new o0OO00O(mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            o00OO00O.OooO00o(str, true, 1, null, (Function0) objRememberedValue3, SizeKt.m517requiredSize3ABfNKs(companion, Dp.m3775constructorimpl(48)), composerStartRestartGroup, 197040, 8);
            composerStartRestartGroup.endReplaceableGroup();
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        w wVar = new w(TextUnitKt.getSp(8), TextUnitKt.getSp(12));
        composerStartRestartGroup.startReplaceableGroup(-994571240);
        String strStringResource = momentDetailModel.getPraiseNum() == 0 ? StringResources_androidKt.stringResource(o000000.video_feed_like, composerStartRestartGroup, 0) : o0O0O0Oo.OooO0o(momentDetailModel.getPraiseNum(), true);
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierM530width3ABfNKs = SizeKt.m530width3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, Dp.m3775constructorimpl(2), 0.0f, Dp.m3775constructorimpl(16), 5, null), Dp.m3775constructorimpl(60));
        int iM3681getCentere0LSkKk = TextAlign.INSTANCE.m3681getCentere0LSkKk();
        long j = o0OOo000.f48135OooO0O0;
        FontWeight medium = FontWeight.INSTANCE.getMedium();
        TextStyle textStyle = new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(o0OOo000.f48157OooOoO, 0L, fMo326toPx0680j_4, 2, null), (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16769023, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNull(strStringResource);
        oo000000.OooO00o(strStringResource, wVar, modifierM530width3ABfNKs, j, null, medium, null, 0L, null, TextAlign.m3674boximpl(iM3681getCentere0LSkKk), 0L, 0, false, 0, textStyle, composerStartRestartGroup, 196992, 0, 15824);
        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oo0o0Oo(momentDetailModel, momentVideoVM, z, i));
    }
}
