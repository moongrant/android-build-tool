package p528o0o0OOOo;

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
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
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
import p150o00Oo0oO.o00000OO;
import p375o0OOoOO.o0000;
import p375o0OOoOO.o0000Ooo;
import p464o0Oooo.o000000O;
import p469o0OoooOO.o0oO0O0o;
import p539o0o0OoOO.b0;
import p539o0o0OoOO.b1;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oO0O0OoO;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nVideoRightArea.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoRightArea.kt\ncom/yalla/yalla/ui/screen/moment/media/VideoRightAreaKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt\n+ 11 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,605:1\n76#2:606\n76#2:607\n76#2:709\n76#2:710\n76#2:817\n76#2:912\n25#3:608\n456#3,8:629\n464#3,3:643\n25#3:647\n36#3:654\n456#3,8:679\n464#3,3:693\n467#3,3:699\n467#3,3:704\n456#3,8:729\n464#3,3:743\n456#3,8:764\n464#3,3:778\n25#3:782\n25#3:789\n36#3:797\n467#3,3:805\n467#3,3:812\n25#3:818\n36#3:825\n36#3:835\n36#3:843\n456#3,8:867\n464#3,3:881\n36#3:898\n467#3,3:907\n50#3:914\n49#3:915\n456#3,8:939\n464#3,3:953\n467#3,3:960\n1097#4,6:609\n1097#4,6:648\n1097#4,6:655\n1097#4,6:783\n1097#4,6:790\n1097#4,6:798\n1097#4,6:819\n1097#4,6:826\n1097#4,6:836\n1097#4,6:844\n1097#4,6:899\n1097#4,6:916\n154#5:615\n154#5:661\n154#5:697\n154#5:698\n154#5:711\n154#5:747\n154#5:796\n154#5:804\n154#5:810\n154#5:811\n154#5:832\n154#5:833\n154#5:834\n154#5:842\n154#5,11:885\n154#5:896\n154#5:897\n154#5:905\n154#5:906\n154#5:913\n154#5:957\n154#5:958\n154#5:959\n76#6,2:616\n78#6:646\n82#6:708\n72#6,6:712\n78#6:746\n82#6:816\n72#6,6:922\n78#6:956\n82#6:964\n78#7,11:618\n78#7,11:668\n91#7:702\n91#7:707\n78#7,11:718\n78#7,11:753\n91#7:808\n91#7:815\n78#7,11:856\n91#7:910\n78#7,11:928\n91#7:963\n4144#8,6:637\n4144#8,6:687\n4144#8,6:737\n4144#8,6:772\n4144#8,6:875\n4144#8,6:947\n66#9,6:662\n72#9:696\n76#9:703\n67#9,5:748\n72#9:781\n76#9:809\n66#9,6:850\n72#9:884\n76#9:911\n76#10:965\n109#10,2:966\n75#11:968\n108#11,2:969\n81#12:971\n107#12,2:972\n81#12:974\n107#12,2:975\n81#12:977\n107#12,2:978\n*S KotlinDebug\n*F\n+ 1 VideoRightArea.kt\ncom/yalla/yalla/ui/screen/moment/media/VideoRightAreaKt\n*L\n110#1:606\n111#1:607\n324#1:709\n325#1:710\n428#1:817\n566#1:912\n112#1:608\n125#1:629,8\n125#1:643,3\n258#1:647\n259#1:654\n272#1:679,8\n272#1:693,3\n272#1:699,3\n125#1:704,3\n328#1:729,8\n328#1:743,3\n358#1:764,8\n358#1:778,3\n363#1:782\n364#1:789\n391#1:797\n358#1:805,3\n328#1:812,3\n430#1:818\n434#1:825\n445#1:835\n454#1:843\n460#1:867,8\n460#1:881,3\n481#1:898\n460#1:907,3\n571#1:914\n571#1:915\n569#1:939,8\n569#1:953,3\n569#1:960,3\n112#1:609,6\n258#1:648,6\n259#1:655,6\n363#1:783,6\n364#1:790,6\n391#1:798,6\n430#1:819,6\n434#1:826,6\n445#1:836,6\n454#1:844,6\n481#1:899,6\n571#1:916,6\n129#1:615\n274#1:661\n282#1:697\n288#1:698\n326#1:711\n361#1:747\n384#1:796\n394#1:804\n404#1:810\n405#1:811\n442#1:832\n443#1:833\n444#1:834\n452#1:842\n465#1:885,11\n466#1:896\n475#1:897\n501#1:905\n526#1:906\n567#1:913\n584#1:957\n592#1:958\n593#1:959\n125#1:616,2\n125#1:646\n125#1:708\n328#1:712,6\n328#1:746\n328#1:816\n569#1:922,6\n569#1:956\n569#1:964\n125#1:618,11\n272#1:668,11\n272#1:702\n125#1:707\n328#1:718,11\n358#1:753,11\n358#1:808\n328#1:815\n460#1:856,11\n460#1:910\n569#1:928,11\n569#1:963\n125#1:637,6\n272#1:687,6\n328#1:737,6\n358#1:772,6\n460#1:875,6\n569#1:947,6\n272#1:662,6\n272#1:696\n272#1:703\n358#1:748,5\n358#1:781\n358#1:809\n460#1:850,6\n460#1:884\n460#1:911\n112#1:965\n112#1:966,2\n258#1:968\n258#1:969,2\n363#1:971\n363#1:972,2\n364#1:974\n364#1:975,2\n430#1:977\n430#1:978,2\n*E\n"})
public final class oOO0OoO0 {

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f54257OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54258OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f54259OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f54260OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54261OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(boolean z, MomentVideoVM momentVideoVM, MomentDetailModel momentDetailModel, LifecycleOwner lifecycleOwner, MutableState<Boolean> mutableState) {
            super(0);
            this.f54257OooO0Oo = z;
            this.f54259OooO0o0 = momentVideoVM;
            this.f54258OooO0o = momentDetailModel;
            this.f54260OooO0oO = lifecycleOwner;
            this.f54261OooO0oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            if (!this.f54257OooO0Oo) {
                oOOO00 onLogin = new oOOO00(this.f54259OooO0o0, this.f54258OooO0o, this.f54260OooO0oO, this.f54261OooO0oo);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                o000000O o000000o2 = o000000O.f46674OooO00o;
                if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                } else {
                    Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                    if (activityOooO0O0 != null) {
                        int i = LoginActivity.f25186OooOo0O;
                        LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.moment.media.VideoRightAreaKt$ProfileImageWithFollow$1$1", f = "VideoRightArea.kt", i = {}, l = {436}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f54262OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54263OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MutableState<Boolean> mutableState, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f54263OooO0o0 = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f54263OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f54262OooO0Oo;
            MutableState<Boolean> mutableState = this.f54263OooO0o0;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (mutableState.getValue().booleanValue()) {
                    this.f54262OooO0Oo = 1;
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
        public final /* synthetic */ Function0<Unit> f54264OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Function0<Unit> function0) {
            super(0);
            this.f54264OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ooooO0O0 onLogin = new ooooO0O0(this.f54264OooO0Oo);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f25186OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Context, NetImageView> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f54265OooO0Oo = new OooO0OO();

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
        public final /* synthetic */ MomentDetailModel f54266OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(MomentDetailModel momentDetailModel) {
            super(1);
            this.f54266OooO0Oo = momentDetailModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(NetImageView netImageView) {
            NetImageView it = netImageView;
            Intrinsics.checkNotNullParameter(it, "it");
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(it.getContext());
            oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
            oooO00o.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0Oo(this.f54266OooO0Oo.getHeadUrl());
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0Oo(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f54267OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54268OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f54269OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f54270OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f54271OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f54272OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f54273OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(MomentDetailModel momentDetailModel, MomentVideoVM momentVideoVM, long j, boolean z, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.f54268OooO0Oo = momentDetailModel;
            this.f54270OooO0o0 = momentVideoVM;
            this.f54269OooO0o = j;
            this.f54271OooO0oO = z;
            this.f54272OooO0oo = function0;
            this.f54267OooO = i;
            this.f54273OooOO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oOO0OoO0.OooO00o(this.f54268OooO0Oo, this.f54270OooO0o0, this.f54269OooO0o, this.f54271OooO0oO, this.f54272OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f54267OooO | 1), this.f54273OooOO0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f54274OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(Function0<Unit> function0) {
            super(0);
            this.f54274OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oOOO00Oo onLogin = new oOOO00Oo(this.f54274OooO0Oo);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f25186OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.moment.media.VideoRightAreaKt$VideoRightArea$1", f = "VideoRightArea.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f54275OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f54276OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54277OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLongState f54278OooO0oO;

        public static final class OooO00o extends Lambda implements Function1<o0000<MomentInRoomStateModel>, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ MutableLongState f54279OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MutableLongState mutableLongState) {
                super(1);
                this.f54279OooO0Oo = mutableLongState;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(o0000<MomentInRoomStateModel> o0000Var) {
                o0000<MomentInRoomStateModel> launchCollectApi = o0000Var;
                Intrinsics.checkNotNullParameter(launchCollectApi, "$this$launchCollectApi");
                launchCollectApi.f44046OooO00o = new oOOO0O0o(this.f54279OooO0Oo);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(MomentVideoVM momentVideoVM, MomentDetailModel momentDetailModel, LifecycleOwner lifecycleOwner, MutableLongState mutableLongState, Continuation<? super OooOOO> continuation) {
            super(2, continuation);
            this.f54275OooO0Oo = momentVideoVM;
            this.f54277OooO0o0 = momentDetailModel;
            this.f54276OooO0o = lifecycleOwner;
            this.f54278OooO0oO = mutableLongState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO(this.f54275OooO0Oo, this.f54277OooO0o0, this.f54276OooO0o, this.f54278OooO0oO, continuation);
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
            o0000Ooo.OooO00o(this.f54275OooO0Oo.getInRoomState(this.f54277OooO0o0.getUserId()), this.f54276OooO0o, new OooO00o(this.f54278OooO0oO));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f54280OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(Function0<Unit> function0) {
            super(0);
            this.f54280OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oOOO00o0 onLogin = new oOOO00o0(this.f54280OooO0Oo);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f25186OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f54281OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f54282OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54283OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f54284OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f54285OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableLongState f54286OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(boolean z, MomentVideoVM momentVideoVM, MomentDetailModel momentDetailModel, LifecycleOwner lifecycleOwner, MutableLongState mutableLongState, AppCompatActivity appCompatActivity) {
            super(0);
            this.f54282OooO0Oo = z;
            this.f54284OooO0o0 = momentVideoVM;
            this.f54283OooO0o = momentDetailModel;
            this.f54285OooO0oO = lifecycleOwner;
            this.f54286OooO0oo = mutableLongState;
            this.f54281OooO = appCompatActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            if (!this.f54282OooO0Oo) {
                MutableLongState mutableLongState = this.f54286OooO0oo;
                o0OO000.OooO0O0("106110", MapsKt.mapOf(TuplesKt.to("state", Integer.valueOf(mutableLongState.getLongValue() != 0 ? 1 : 0))));
                MomentDetailModel momentDetailModel = this.f54283OooO0o;
                o0000Ooo.OooO00o(this.f54284OooO0o0.getInRoomState(momentDetailModel.getUserId()), this.f54285OooO0oO, new oOOO0OOO(momentDetailModel, this.f54281OooO, mutableLongState));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54287OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f54288OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(MomentDetailModel momentDetailModel, MomentVideoVM momentVideoVM) {
            super(0);
            this.f54287OooO0Oo = momentDetailModel;
            this.f54288OooO0o0 = momentVideoVM;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OO000.OooO00o("106112");
            MomentDetailModel momentDetailModel = this.f54287OooO0Oo;
            long userId = momentDetailModel.getUserId();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            Long l = (Long) o000000O.OooOOo0().getValue();
            if (l != null && userId == l.longValue()) {
                String strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.video_feed_send_gift_tip);
                if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                    o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                    }
                }
            } else {
                oOOOOo0O onLogin = new oOOOOo0O(momentDetailModel, this.f54288OooO0o0);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                } else {
                    Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                    if (activityOooO0O0 != null) {
                        int i = LoginActivity.f25186OooOo0O;
                        LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54289OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentCommentsVM f54290OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f54291OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MomentPraiseVM f54292OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MomentGiftsVM f54293OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(MomentDetailModel momentDetailModel, MomentVideoVM momentVideoVM, MomentCommentsVM momentCommentsVM, MomentPraiseVM momentPraiseVM, MomentGiftsVM momentGiftsVM) {
            super(0);
            this.f54289OooO0Oo = momentDetailModel;
            this.f54291OooO0o0 = momentVideoVM;
            this.f54290OooO0o = momentCommentsVM;
            this.f54292OooO0oO = momentPraiseVM;
            this.f54293OooO0oo = momentGiftsVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oOOOoo00 onLogin = new oOOOoo00(this.f54289OooO0Oo, this.f54291OooO0o0, this.f54290OooO0o, this.f54292OooO0oO, this.f54293OooO0oo);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f25186OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.moment.media.VideoRightAreaKt$VideoRightArea$2$5", f = "VideoRightArea.kt", i = {}, l = {262}, m = "invokeSuspend", n = {}, s = {})
    public static final class Oooo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f54294OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Animatable<Float, AnimationVector1D> f54295OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54296OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableFloatState f54297OooO0oO;

        public static final class OooO00o extends Lambda implements Function1<Animatable<Float, AnimationVector1D>, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ MutableFloatState f54298OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MutableFloatState mutableFloatState) {
                super(1);
                this.f54298OooO0Oo = mutableFloatState;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Animatable<Float, AnimationVector1D> animatable) {
                Animatable<Float, AnimationVector1D> animateTo = animatable;
                Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                this.f54298OooO0Oo.setFloatValue(animateTo.getValue().floatValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(MutableState<Boolean> mutableState, Animatable<Float, AnimationVector1D> animatable, MutableFloatState mutableFloatState, Continuation<? super Oooo0> continuation) {
            super(2, continuation);
            this.f54296OooO0o0 = mutableState;
            this.f54295OooO0o = animatable;
            this.f54297OooO0oO = mutableFloatState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new Oooo0(this.f54296OooO0o0, this.f54295OooO0o, this.f54297OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((Oooo0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f54294OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!this.f54296OooO0o0.getValue().booleanValue()) {
                    Animatable<Float, AnimationVector1D> animatable = this.f54295OooO0o;
                    MutableFloatState mutableFloatState = this.f54297OooO0oO;
                    Float fBoxFloat = Boxing.boxFloat(mutableFloatState.getFloatValue() + 360.0f);
                    InfiniteRepeatableSpec infiniteRepeatableSpecM81infiniteRepeatable9IiC70o$default = AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(3500, 0, EasingKt.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null);
                    OooO00o oooO00o = new OooO00o(mutableFloatState);
                    this.f54294OooO0Oo = 1;
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

    public static final class Oooo000 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54299OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f54300OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f54301OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<MomentDetailModel, Unit> f54302OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Oooo000(MomentDetailModel momentDetailModel, AppCompatActivity appCompatActivity, MomentVideoVM momentVideoVM, Function1<? super MomentDetailModel, Unit> function1) {
            super(0);
            this.f54299OooO0Oo = momentDetailModel;
            this.f54301OooO0o0 = appCompatActivity;
            this.f54300OooO0o = momentVideoVM;
            this.f54302OooO0oO = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oOo0o00 onLogin = new oOo0o00(this.f54299OooO0Oo, this.f54301OooO0o0, this.f54300OooO0o, this.f54302OooO0oO);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f25186OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function1<GraphicsLayerScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Animatable<Float, AnimationVector1D> f54303OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(Animatable<Float, AnimationVector1D> animatable) {
            super(1);
            this.f54303OooO0Oo = animatable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(GraphicsLayerScope graphicsLayerScope) {
            GraphicsLayerScope graphicsLayer = graphicsLayerScope;
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.setRotationZ(this.f54303OooO0Oo.getValue().floatValue());
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function1<Context, NetImageView> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00O0O f54304OooO0Oo = new o00O0O();

        public o00O0O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final NetImageView invoke(Context context) {
            Context context2 = context;
            Intrinsics.checkNotNullParameter(context2, "context");
            return new NetImageView(context2);
        }
    }

    public static final class o00Oo0 extends Lambda implements Function1<NetImageView, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54305OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Oo0(MomentDetailModel momentDetailModel) {
            super(1);
            this.f54305OooO0Oo = momentDetailModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(NetImageView netImageView) {
            NetImageView it = netImageView;
            Intrinsics.checkNotNullParameter(it, "it");
            it.setScaleType(ImageView.ScaleType.CENTER_CROP);
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(it.getContext());
            oooO00o.f43911OooO0OO = this.f54305OooO0Oo.getCoverPic();
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0Oo(it);
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54306OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54307OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentCommentsVM f54308OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f54309OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MomentPraiseVM f54310OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MomentGiftsVM f54311OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ boolean f54312OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ Function1<MomentDetailModel, Unit> f54313OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ int f54314OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ int f54315OooOOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00Ooo(MomentDetailModel momentDetailModel, MomentVideoVM momentVideoVM, MomentCommentsVM momentCommentsVM, MomentPraiseVM momentPraiseVM, MomentGiftsVM momentGiftsVM, MutableState<Boolean> mutableState, boolean z, Function1<? super MomentDetailModel, Unit> function1, int i, int i2) {
            super(2);
            this.f54307OooO0Oo = momentDetailModel;
            this.f54309OooO0o0 = momentVideoVM;
            this.f54308OooO0o = momentCommentsVM;
            this.f54310OooO0oO = momentPraiseVM;
            this.f54311OooO0oo = momentGiftsVM;
            this.f54306OooO = mutableState;
            this.f54312OooOO0 = z;
            this.f54313OooOO0O = function1;
            this.f54314OooOO0o = i;
            this.f54315OooOOO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oOO0OoO0.OooO0O0(this.f54307OooO0Oo, this.f54309OooO0o0, this.f54308OooO0o, this.f54310OooO0oO, this.f54311OooO0oo, this.f54306OooO, this.f54312OooOO0, this.f54313OooOO0O, composer, RecomposeScopeImplKt.updateChangedFlags(this.f54314OooOO0o | 1), this.f54315OooOOO0);
            return Unit.INSTANCE;
        }
    }

    public static final class o00oO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f54316OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f54317OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f54318OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f54319OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Modifier f54320OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f54321OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f54322OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oO0o(int i, String str, boolean z, Modifier modifier, Function0<Unit> function0, int i2, int i3) {
            super(2);
            this.f54317OooO0Oo = i;
            this.f54319OooO0o0 = str;
            this.f54318OooO0o = z;
            this.f54320OooO0oO = modifier;
            this.f54321OooO0oo = function0;
            this.f54316OooO = i2;
            this.f54322OooOO0 = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oOO0OoO0.OooO0OO(this.f54317OooO0Oo, this.f54319OooO0o0, this.f54318OooO0o, this.f54320OooO0oO, this.f54321OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f54316OooO | 1), this.f54322OooOO0);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OO00O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54323OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f54324OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f54325OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f54326OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OO00O(MomentDetailModel momentDetailModel, MomentVideoVM momentVideoVM, boolean z, int i) {
            super(2);
            this.f54323OooO0Oo = momentDetailModel;
            this.f54325OooO0o0 = momentVideoVM;
            this.f54324OooO0o = z;
            this.f54326OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54326OooO0oO | 1);
            MomentVideoVM momentVideoVM = this.f54325OooO0o0;
            boolean z = this.f54324OooO0o;
            oOO0OoO0.OooO0Oo(this.f54323OooO0Oo, momentVideoVM, z, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.moment.media.VideoRightAreaKt$VideoRightLike$2$1$1", f = "VideoRightArea.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0OOO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54327OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f54328OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54329OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OOO0o(MomentDetailModel momentDetailModel, MutableState<Boolean> mutableState, MutableState<String> mutableState2, Continuation<? super o0OOO0o> continuation) {
            super(2, continuation);
            this.f54327OooO0Oo = momentDetailModel;
            this.f54329OooO0o0 = mutableState;
            this.f54328OooO0o = mutableState2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o0OOO0o(this.f54327OooO0Oo, this.f54329OooO0o0, this.f54328OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o0OOO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            MomentDetailModel momentDetailModel = this.f54327OooO0Oo;
            p592o0oo00O.OooOOO0.OooO0O0("isPraise = " + momentDetailModel.isPraise());
            MutableState<Boolean> mutableState = this.f54329OooO0o0;
            if (mutableState.getValue().booleanValue()) {
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            }
            this.f54328OooO0o.setValue(momentDetailModel.isPraise() ? "svga/anim_video_like.svga" : "svga/anim_video_unlike.svga");
            return Unit.INSTANCE;
        }
    }

    public static final class o0Oo0oo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f54330OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0Oo0oo(MutableState<String> mutableState) {
            super(0);
            this.f54330OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f54330OooO0Oo.setValue("");
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function1<GraphicsLayerScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Animatable<Float, AnimationVector1D> f54331OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(Animatable<Float, AnimationVector1D> animatable) {
            super(1);
            this.f54331OooO0Oo = animatable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(GraphicsLayerScope graphicsLayerScope) {
            GraphicsLayerScope graphicsLayer = graphicsLayerScope;
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.setRotationZ(this.f54331OooO0Oo.getValue().floatValue());
            return Unit.INSTANCE;
        }
    }

    public static final class o0ooOOo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f54332OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f54333OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54334OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f54335OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0ooOOo(boolean z, MomentDetailModel momentDetailModel, MomentVideoVM momentVideoVM, LifecycleOwner lifecycleOwner) {
            super(0);
            this.f54332OooO0Oo = z;
            this.f54334OooO0o0 = momentDetailModel;
            this.f54333OooO0o = momentVideoVM;
            this.f54335OooO0oO = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            if (!this.f54332OooO0Oo) {
                O0O0 onLogin = new O0O0(this.f54334OooO0o0, this.f54333OooO0o, this.f54335OooO0oO);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                o000000O o000000o2 = o000000O.f46674OooO00o;
                if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                } else {
                    Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                    if (activityOooO0O0 != null) {
                        int i = LoginActivity.f25186OooOo0O;
                        LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f54336OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f54337OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(boolean z, Function0<Unit> function0) {
            super(0);
            this.f54336OooO0Oo = z;
            this.f54337OooO0o0 = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            if (!this.f54336OooO0Oo) {
                oo000000 onLogin = new oo000000(this.f54337OooO0o0);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                o000000O o000000o2 = o000000O.f46674OooO00o;
                if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                } else {
                    Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                    if (activityOooO0O0 != null) {
                        int i = LoginActivity.f25186OooOo0O;
                        LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                    }
                }
            }
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
            ComposerKt.traceEventStart(-9513748, i, -1, "com.yalla.yalla.ui.screen.moment.media.ProfileImageWithFollow (VideoRightArea.kt:420)");
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
            composerStartRestartGroup.startReplaceableGroup(216304211);
            Modifier modifierOooO00o = p153o00OoO0.OooOO0.OooO00o(60, SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m3765constructorimpl(15), 7, null), Dp.m3765constructorimpl(50)), composerStartRestartGroup, 1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(function1);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new OooOO0O(function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            modifierOooO0O0 = o0O0O00.OooO0O0(modifierOooO00o, false, false, 0L, false, null, null, null, (Function0) objRememberedValue3, 255);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(216304474);
            Modifier modifierClip = ClipKt.clip(PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m3765constructorimpl(14), 7, null), RoundedCornerShapeKt.getCircleShape());
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged3 = composerStartRestartGroup.changed(function1);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new OooOOO0(function1);
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
        MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion3, false, composerStartRestartGroup, 0, -1323940314);
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
        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier modifierAlign = boxScopeInstance.align(ClipKt.clip(SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion2, 0.0f, j2 != 0 ? Dp.m3765constructorimpl((float) 6.5d) : Dp.m3765constructorimpl(0), 0.0f, Dp.m3765constructorimpl(9), 5, null), Dp.m3765constructorimpl(46)), RoundedCornerShapeKt.getCircleShape()), companion3.getTopCenter());
        if (j2 != 0) {
            modifierBorder = companion2;
        } else {
            modifierBorder = BorderKt.border(companion2, BorderStrokeKt.m196BorderStrokecXLIe8U(Dp.m3765constructorimpl(1), Color.INSTANCE.m1707getWhite0d7_KjU()), RoundedCornerShapeKt.getCircleShape());
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
        AndroidView_androidKt.AndroidView(OooO0OO.f54265OooO0Oo, o0O0O00.OooO0O0(modifierThen2, false, false, 0L, false, null, null, null, (Function0) objRememberedValue5, 255), new OooO0o(momentDetailModel), composerStartRestartGroup, 6, 0);
        composerStartRestartGroup.startReplaceableGroup(1759602140);
        if (j2 != 0) {
            finiteAnimationSpec = null;
            p148o00Oo0o.o00Ooo.OooO00o(oO0O0OoO.moment_user_in_room, 2000L, ContentScale.INSTANCE.getCrop(), 0, null, null, null, SizeKt.m515requiredSize3ABfNKs(boxScopeInstance.align(companion2, companion3.getTopCenter()), Dp.m3765constructorimpl(58)), composerStartRestartGroup, 432, 120);
        } else {
            finiteAnimationSpec = null;
        }
        FiniteAnimationSpec finiteAnimationSpec2 = finiteAnimationSpec;
        composerStartRestartGroup.endReplaceableGroup();
        AnimatedVisibilityKt.AnimatedVisibility(((Boolean) r36.getValue()).booleanValue(), boxScopeInstance.align(companion2, companion3.getBottomCenter()), EnterExitTransitionKt.fadeIn$default(finiteAnimationSpec2, 0.0f, 3, finiteAnimationSpec2), EnterExitTransitionKt.fadeOut$default(finiteAnimationSpec2, 0.0f, 3, finiteAnimationSpec2), (String) null, o0O0OOOo.f53721OooO00o, composerStartRestartGroup, 200064, 16);
        composerStartRestartGroup.startReplaceableGroup(216306712);
        if (!momentDetailModel.isFollow()) {
            long userId = momentDetailModel.getUserId();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            Long l = (Long) o000000O.OooOOo0().getValue();
            if (l == null || userId != l.longValue()) {
                mutableState.setValue(Boolean.FALSE);
                ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_video_follow, composerStartRestartGroup, 0), (String) null, o0O0O00.OooO0O0(boxScopeInstance.align(BackgroundKt.m169backgroundbw27NRU$default(ClipKt.clip(SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(19)), RoundedCornerShapeKt.getCircleShape()), o0oO0O0o.f47150o00OOOO0, null, 2, null), companion3.getBottomCenter()), false, false, 0L, false, null, null, null, new OooO(z, momentVideoVM, momentDetailModel, lifecycleOwner, mutableState), 255), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            }
        }
        if (OooOo.OooO0o.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(momentDetailModel, momentVideoVM, j2, z, function1, i, i2));
    }

    /* JADX WARN: Code duplicated, block: B:44:0x021a  */
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
            ComposerKt.traceEventStart(2091203831, i, -1, "com.yalla.yalla.ui.screen.moment.media.VideoRightArea (VideoRightArea.kt:99)");
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
        EffectsKt.LaunchedEffect(Unit.INSTANCE, new OooOOO(videoVM, videoDetailModel, lifecycleOwner, mutableLongState, null), composerStartRestartGroup, 70);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
        Arrangement.Vertical bottom = Arrangement.INSTANCE.getBottom();
        Modifier.Companion companion3 = Modifier.INSTANCE;
        Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(PaddingKt.m480paddingqDBjuR0$default(companion3, 0.0f, 0.0f, Dp.m3765constructorimpl(4), 0.0f, 11, null), 0.0f, 1, null);
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
        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyColumnMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        OooO00o(videoDetailModel, videoVM, mutableLongState.getLongValue(), z, new OooOOOO(z, videoVM, videoDetailModel, lifecycleOwner, mutableLongState, appCompatActivity), composerStartRestartGroup, ((i >> 9) & 7168) | 72, 0);
        int i4 = (i >> 12) & 896;
        OooO0Oo(videoDetailModel, videoVM, z, composerStartRestartGroup, i4 | 72);
        int i5 = MomentStateKt.isApprovedState(videoDetailModel) ? oO00OOO.ic_video_comments : oO00OOO.ic_video_comments_gray;
        composerStartRestartGroup.startReplaceableGroup(-1729067549);
        String strStringResource = videoDetailModel.getCommentNum() == 0 ? StringResources_androidKt.stringResource(oO00OOo0.video_feed_comment, composerStartRestartGroup, 0) : p590o0oo0.OooOOOO.OooO0o(videoDetailModel.getCommentNum(), true);
        composerStartRestartGroup.endReplaceableGroup();
        Intrinsics.checkNotNullExpressionValue(strStringResource, "if (videoDetailModel.com…       true\n            )");
        OooO0OO(i5, strStringResource, z, o0O0O00.OooO0Oo(companion3, composerStartRestartGroup, 6), new OooOo00(videoDetailModel, videoVM, commentsVM, likesVM, giftsVM), composerStartRestartGroup, i4, 0);
        if (MomentStateKt.isApprovedState(videoDetailModel)) {
            long userId = videoDetailModel.getUserId();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            Long l = (Long) o000000O.OooOOo0().getValue();
            if (l != null && userId == l.longValue()) {
                i3 = oO00OOO.ic_video_gift_gray;
            } else {
                i3 = oO00OOO.ic_video_gift;
            }
        } else {
            i3 = oO00OOO.ic_video_gift_gray;
        }
        int i6 = i3;
        composerStartRestartGroup.startReplaceableGroup(-1729066201);
        String strStringResource2 = videoDetailModel.getTotalPropValue() == 0 ? StringResources_androidKt.stringResource(oO00OOo0.video_feed_gift, composerStartRestartGroup, 0) : p590o0oo0.OooOOOO.OooO0o(videoDetailModel.getTotalPropValue(), true);
        composerStartRestartGroup.endReplaceableGroup();
        Intrinsics.checkNotNullExpressionValue(strStringResource2, "if (videoDetailModel.tot…       true\n            )");
        OooO0OO(i6, strStringResource2, z, null, new OooOo(videoDetailModel, videoVM), composerStartRestartGroup, i4, 8);
        int i7 = MomentStateKt.isApprovedState(videoDetailModel) ? oO00OOO.ic_video_share : oO00OOO.ic_video_share_gray;
        composerStartRestartGroup.startReplaceableGroup(-1729065183);
        String strStringResource3 = videoDetailModel.getShareNum() == 0 ? StringResources_androidKt.stringResource(oO00OOo0.video_feed_share, composerStartRestartGroup, 0) : p590o0oo0.OooOOOO.OooO0o(videoDetailModel.getShareNum(), true);
        composerStartRestartGroup.endReplaceableGroup();
        Intrinsics.checkNotNullExpressionValue(strStringResource3, "if (videoDetailModel.sha…       true\n            )");
        OooO0OO(i7, strStringResource3, z, o0O0O00.OooO0Oo(companion3, composerStartRestartGroup, 6), new Oooo000(videoDetailModel, appCompatActivity, videoVM, function3), composerStartRestartGroup, i4, 0);
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
        EffectsKt.LaunchedEffect(videoPauseState.getValue(), new Oooo0(videoPauseState, animatable, mutableFloatState, continuation), composerStartRestartGroup, 64);
        float f = 46;
        Modifier modifierClip = ClipKt.clip(SizeKt.m523size3ABfNKs(companion3, Dp.m3765constructorimpl(f)), RoundedCornerShapeKt.getCircleShape());
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
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
        Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl2, measurePolicyOooO00o, composerM1309constructorimpl2, currentCompositionLocalMap2);
        if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_video_music_play_bg, composerStartRestartGroup, 0), (String) null, GraphicsLayerModifierKt.graphicsLayer(ClipKt.clip(SizeKt.m523size3ABfNKs(companion3, Dp.m3765constructorimpl(f)), RoundedCornerShapeKt.getCircleShape()), new o000oOoO(animatable)), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
        AndroidView_androidKt.AndroidView(o00O0O.f54304OooO0Oo, GraphicsLayerModifierKt.graphicsLayer(boxScopeInstance.align(ClipKt.clip(SizeKt.m523size3ABfNKs(companion3, Dp.m3765constructorimpl(27)), RoundedCornerShapeKt.getCircleShape()), companion2.getCenter()), new o0OoOo0(animatable)), new o00Oo0(videoDetailModel), composerStartRestartGroup, 6, 0);
        if (o00000OO.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00Ooo(videoDetailModel, videoVM, commentsVM, likesVM, giftsVM, videoPauseState, z, function3, i, i2));
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
        Composer composerM1309constructorimpl;
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
                    ComposerKt.traceEventStart(-784844880, i4, -1, "com.yalla.yalla.ui.screen.moment.media.VideoRightItem (VideoRightArea.kt:558)");
                }
                float fMo324toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(Dp.m3765constructorimpl(3));
                Modifier.Companion companion = Modifier.INSTANCE;
                zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(function0);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zOooO00o || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new oo000o(z, function0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierOooO0O0 = o0O0O00.OooO0O0(companion, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally, composerStartRestartGroup, 48, -1323940314);
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
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO0O0, composerM1309constructorimpl, currentCompositionLocalMap);
                if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier modifier5 = modifier3;
                ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, i4 & 14), (String) null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(35)).then(modifier3), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                b0.OooO00o(str, new b1(TextUnitKt.getSp(8), TextUnitKt.getSp(12)), SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, Dp.m3765constructorimpl(2), 0.0f, Dp.m3765constructorimpl(15), 5, null), Dp.m3765constructorimpl(60)), o0oO0O0o.f46960OooOOo, null, FontWeight.INSTANCE.getMedium(), null, 0L, null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 1, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(o0oO0O0o.f46968OooOoO, 0L, fMo324toPx0680j_4, 2, null), (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16769023, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i4 >> 3) & 14) | 196992, 3072, 7632);
                if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
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
            scopeUpdateScopeEndRestartGroup.updateScope(new o00oO0o(i, str, z, modifier4, function0, i2, i3));
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
                ComposerKt.traceEventStart(-784844880, i4, -1, "com.yalla.yalla.ui.screen.moment.media.VideoRightItem (VideoRightArea.kt:558)");
            }
            float fMo324toPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(Dp.m3765constructorimpl(3));
            Modifier.Companion companion3 = Modifier.INSTANCE;
            zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(function0);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zOooO00o) {
                objRememberedValue = new oo000o(z, function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new oo000o(z, function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierOooO0O1 = o0O0O00.OooO0O0(companion3, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
            Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO0O1 = androidx.compose.material.OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally2, composerStartRestartGroup, 48, -1323940314);
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
            composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyOooO0O1, composerM1309constructorimpl, currentCompositionLocalMap2);
            if (composerM1309constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            Modifier modifier6 = modifier3;
            ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, i4 & 14), (String) null, SizeKt.m523size3ABfNKs(companion3, Dp.m3765constructorimpl(35)).then(modifier3), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            b0.OooO00o(str, new b1(TextUnitKt.getSp(8), TextUnitKt.getSp(12)), SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion3, 0.0f, Dp.m3765constructorimpl(2), 0.0f, Dp.m3765constructorimpl(15), 5, null), Dp.m3765constructorimpl(60)), o0oO0O0o.f46960OooOOo, null, FontWeight.INSTANCE.getMedium(), null, 0L, null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 1, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(o0oO0O0o.f46968OooOoO, 0L, fMo324toPx0680j_5, 2, null), (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16769023, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i4 >> 3) & 14) | 196992, 3072, 7632);
            if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
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
                ComposerKt.traceEventStart(-784844880, i4, -1, "com.yalla.yalla.ui.screen.moment.media.VideoRightItem (VideoRightArea.kt:558)");
            }
            float fMo324toPx0680j_6 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(Dp.m3765constructorimpl(3));
            Modifier.Companion companion5 = Modifier.INSTANCE;
            zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(function0);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zOooO00o) {
                objRememberedValue = new oo000o(z, function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new oo000o(z, function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierOooO0O2 = o0O0O00.OooO0O0(companion5, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
            Alignment.Horizontal centerHorizontally3 = Alignment.INSTANCE.getCenterHorizontally();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO0O2 = androidx.compose.material.OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally3, composerStartRestartGroup, 48, -1323940314);
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
            composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion6, composerM1309constructorimpl, measurePolicyOooO0O2, composerM1309constructorimpl, currentCompositionLocalMap3);
            if (composerM1309constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
            Modifier modifier7 = modifier3;
            ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, i4 & 14), (String) null, SizeKt.m523size3ABfNKs(companion5, Dp.m3765constructorimpl(35)).then(modifier3), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            b0.OooO00o(str, new b1(TextUnitKt.getSp(8), TextUnitKt.getSp(12)), SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion5, 0.0f, Dp.m3765constructorimpl(2), 0.0f, Dp.m3765constructorimpl(15), 5, null), Dp.m3765constructorimpl(60)), o0oO0O0o.f46960OooOOo, null, FontWeight.INSTANCE.getMedium(), null, 0L, null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 1, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(o0oO0O0o.f46968OooOoO, 0L, fMo324toPx0680j_6, 2, null), (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16769023, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i4 >> 3) & 14) | 196992, 3072, 7632);
            if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier7;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00oO0o(i, str, z, modifier4, function0, i2, i3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0Oo(MomentDetailModel momentDetailModel, MomentVideoVM momentVideoVM, boolean z, Composer composer, int i) {
        Modifier.Companion companion;
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-552363209);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-552363209, i, -1, "com.yalla.yalla.ui.screen.moment.media.VideoRightLike (VideoRightArea.kt:318)");
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        float fMo324toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(Dp.m3765constructorimpl(3));
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(companion2, false, false, 0L, false, null, null, null, new o0ooOOo(z, momentDetailModel, momentVideoVM, lifecycleOwner), 253);
        Alignment.Companion companion3 = Alignment.INSTANCE;
        Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally, composerStartRestartGroup, 48, -1323940314);
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
        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyOooO0O0, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Alignment center = companion3.getCenter();
        float f = 36;
        Modifier modifierOooO00o = com.facebook.OooOo00.OooO00o(f, companion2, composerStartRestartGroup, 733328855);
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
        Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl2, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl2, currentCompositionLocalMap2);
        if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
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
        EffectsKt.LaunchedEffect(Boolean.valueOf(momentDetailModel.isPraise()), new o0OOO0o(momentDetailModel, (MutableState) objRememberedValue2, mutableState, null), composerStartRestartGroup, 64);
        if (StringsKt.isBlank((String) mutableState.getValue())) {
            composerStartRestartGroup.startReplaceableGroup(-1240419745);
            if (momentDetailModel.isPraise()) {
                i2 = oO00OOO.ic_video_like;
            } else {
                i2 = MomentStateKt.isApprovedState(momentDetailModel) ? oO00OOO.ic_video_not_like : oO00OOO.ic_video_not_like_gray;
            }
            companion = companion2;
            ImageKt.Image(PainterResources_androidKt.painterResource(i2, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(f)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            companion = companion2;
            composerStartRestartGroup.startReplaceableGroup(-1240419238);
            String str = (String) mutableState.getValue();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion5.getEmpty()) {
                objRememberedValue3 = new o0Oo0oo(mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            p154o00OoO00.OooOo00.OooO00o(str, true, 1, null, (Function0) objRememberedValue3, SizeKt.m515requiredSize3ABfNKs(companion, Dp.m3765constructorimpl(48)), composerStartRestartGroup, 197040, 8);
            composerStartRestartGroup.endReplaceableGroup();
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        b1 b1Var = new b1(TextUnitKt.getSp(8), TextUnitKt.getSp(12));
        composerStartRestartGroup.startReplaceableGroup(-994571287);
        String strStringResource = momentDetailModel.getPraiseNum() == 0 ? StringResources_androidKt.stringResource(oO00OOo0.video_feed_like, composerStartRestartGroup, 0) : p590o0oo0.OooOOOO.OooO0o(momentDetailModel.getPraiseNum(), true);
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierM528width3ABfNKs = SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, Dp.m3765constructorimpl(2), 0.0f, Dp.m3765constructorimpl(16), 5, null), Dp.m3765constructorimpl(60));
        int iM3671getCentere0LSkKk = TextAlign.INSTANCE.m3671getCentere0LSkKk();
        long j = o0oO0O0o.f46946OooO0O0;
        FontWeight medium = FontWeight.INSTANCE.getMedium();
        TextStyle textStyle = new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(o0oO0O0o.f46968OooOoO, 0L, fMo324toPx0680j_4, 2, null), (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16769023, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullExpressionValue(strStringResource, "if (model.praiseNum == 0…it(model.praiseNum, true)");
        b0.OooO00o(strStringResource, b1Var, modifierM528width3ABfNKs, j, null, medium, null, 0L, null, TextAlign.m3664boximpl(iM3671getCentere0LSkKk), 0L, 0, false, 0, textStyle, composerStartRestartGroup, 196992, 0, 15824);
        if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0OO00O(momentDetailModel, momentVideoVM, z, i));
    }
}
