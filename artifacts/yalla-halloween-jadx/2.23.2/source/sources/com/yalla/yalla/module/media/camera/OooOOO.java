package com.yalla.yalla.module.media.camera;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import androidx.camera.core.ImageCapture;
import androidx.camera.view.PreviewView;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
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
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.content.ContextCompat;
import androidx.media3.session.o00O0O0;
import com.code.android.util.o0000O;
import com.code.android.util.o0O0O00;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.qiniu.android.storage.Configuration;
import com.yalla.yalla.model.media.SelectMusicModel;
import com.zego.zegoliveroom.constants.ZegoConstants;
import io.agora.rtc.Constants;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import net.sqlcipher.database.SQLiteDatabase;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p193o00o0O0O.o0000oo;
import p457o0Ooo0O.o00O00o0;
import p459o0Ooo0Oo.o0oOO;
import p460o0Ooo0o.o00OOO00;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nCameraCommonComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraCommonComp.kt\ncom/yalla/yalla/module/media/camera/CameraCommonCompKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 8 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 11 Composer.kt\nandroidx/compose/runtime/Updater\n+ 12 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 13 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 14 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,443:1\n154#2:444\n154#2:445\n154#2:446\n154#2:447\n154#2:452\n154#2:461\n154#2:469\n154#2:473\n154#2:474\n154#2:475\n154#2:476\n164#2:488\n154#2:505\n154#2:506\n154#2:507\n154#2:508\n154#2:509\n154#2:510\n154#2:511\n154#2:520\n154#2:556\n154#2:557\n154#2:592\n154#2:593\n154#2:594\n154#2:630\n154#2:631\n154#2:667\n154#2:668\n154#2:669\n154#2:686\n154#2:687\n154#2:688\n154#2:694\n154#2:702\n154#2:703\n154#2:717\n154#2:718\n154#2:719\n154#2:755\n154#2:756\n25#3:448\n25#3:457\n25#3:465\n83#3,3:478\n25#3:493\n50#3:512\n49#3:513\n456#3,8:538\n464#3,3:552\n467#3,3:558\n36#3:563\n36#3:570\n36#3:577\n50#3:584\n49#3:585\n456#3,8:612\n464#3,3:626\n456#3,8:649\n464#3,3:663\n50#3:670\n49#3:671\n50#3:678\n49#3:679\n467#3,3:689\n36#3:695\n467#3,3:704\n25#3:710\n456#3,8:737\n464#3,3:751\n467#3,3:757\n1097#4,3:449\n1100#4,3:453\n1097#4,3:458\n1100#4,3:462\n1097#4,3:466\n1100#4,3:470\n1097#4,6:481\n1097#4,3:494\n1100#4,3:500\n1097#4,6:514\n1097#4,6:564\n1097#4,6:571\n1097#4,6:578\n1097#4,6:586\n1097#4,6:672\n1097#4,6:680\n1097#4,6:696\n1097#4,6:711\n76#5:456\n76#5:487\n76#5:504\n76#5:709\n88#6:477\n486#7,4:489\n490#7,2:497\n494#7:503\n486#8:499\n73#9,6:521\n79#9:555\n83#9:562\n73#9,6:595\n79#9:629\n73#9,6:632\n79#9:666\n83#9:693\n83#9:708\n78#10,11:527\n91#10:561\n78#10,11:601\n78#10,11:638\n91#10:692\n91#10:707\n78#10,11:726\n91#10:760\n4144#11,6:546\n4144#11,6:620\n4144#11,6:657\n4144#11,6:745\n66#12,6:720\n72#12:754\n76#12:761\n81#13:762\n75#14:763\n75#14:764\n*S KotlinDebug\n*F\n+ 1 CameraCommonComp.kt\ncom/yalla/yalla/module/media/camera/CameraCommonCompKt\n*L\n78#1:444\n79#1:445\n80#1:446\n81#1:447\n92#1:452\n97#1:461\n103#1:469\n108#1:473\n112#1:474\n113#1:475\n114#1:476\n169#1:488\n200#1:505\n201#1:506\n228#1:507\n245#1:508\n246#1:509\n247#1:510\n249#1:511\n256#1:520\n261#1:556\n268#1:557\n325#1:592\n326#1:593\n327#1:594\n334#1:630\n336#1:631\n343#1:667\n351#1:668\n352#1:669\n369#1:686\n371#1:687\n375#1:688\n383#1:694\n390#1:702\n391#1:703\n422#1:717\n423#1:718\n424#1:719\n438#1:755\n439#1:756\n92#1:448\n95#1:457\n101#1:465\n116#1:478,3\n196#1:493\n251#1:512\n251#1:513\n242#1:538,8\n242#1:552,3\n242#1:558,3\n296#1:563\n299#1:570\n302#1:577\n306#1:584\n306#1:585\n322#1:612,8\n322#1:626,3\n331#1:649,8\n331#1:663,3\n353#1:670\n353#1:671\n365#1:678\n365#1:679\n331#1:689,3\n386#1:695\n322#1:704,3\n418#1:710\n420#1:737,8\n420#1:751,3\n420#1:757,3\n92#1:449,3\n92#1:453,3\n95#1:458,3\n95#1:462,3\n101#1:466,3\n101#1:470,3\n116#1:481,6\n196#1:494,3\n196#1:500,3\n251#1:514,6\n296#1:564,6\n299#1:571,6\n302#1:578,6\n306#1:586,6\n353#1:672,6\n365#1:680,6\n386#1:696,6\n418#1:711,6\n93#1:456\n168#1:487\n197#1:504\n416#1:709\n114#1:477\n196#1:489,4\n196#1:497,2\n196#1:503\n196#1:499\n242#1:521,6\n242#1:555\n242#1:562\n322#1:595,6\n322#1:629\n331#1:632,6\n331#1:666\n331#1:693\n322#1:708\n242#1:527,11\n242#1:561\n322#1:601,11\n331#1:638,11\n331#1:692\n322#1:707\n420#1:726,11\n420#1:760\n242#1:546,6\n322#1:620,6\n331#1:657,6\n420#1:745,6\n420#1:720,6\n420#1:754\n420#1:761\n92#1:762\n95#1:763\n101#1:764\n*E\n"})
public final class OooOOO {

    @DebugMetadata(c = "com.yalla.yalla.module.media.camera.CameraCommonCompKt$CameraFlashComp$2", f = "CameraCommonComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CameraViewModel f23812OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(CameraViewModel cameraViewModel, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f23812OooO0Oo = cameraViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO(this.f23812OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f23812OooO0Oo.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f23813OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23814OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(boolean z, Function0<Unit> function0) {
            super(0);
            this.f23813OooO0Oo = z;
            this.f23814OooO0o0 = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            if (this.f23813OooO0Oo) {
                this.f23814OooO0o0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f23815OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23816OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f23817OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f23818OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f23819OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(BoxScope boxScope, boolean z, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.f23815OooO0Oo = boxScope;
            this.f23817OooO0o0 = z;
            this.f23816OooO0o = function0;
            this.f23818OooO0oO = i;
            this.f23819OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooOOO.OooO00o(this.f23815OooO0Oo, this.f23817OooO0o0, this.f23816OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f23818OooO0oO | 1), this.f23819OooO0oo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f23820OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f23821OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Modifier modifier, int i) {
            super(2);
            this.f23820OooO0Oo = modifier;
            this.f23821OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23821OooO0o0 | 1);
            OooOOO.OooO0O0(this.f23820OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CameraViewModel f23822OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(CameraViewModel cameraViewModel) {
            super(0);
            this.f23822OooO0Oo = cameraViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0oo0000.OooO00o.OooO0O0("106077");
            CameraViewModel cameraViewModel = this.f23822OooO0Oo;
            Intrinsics.checkNotNullParameter(cameraViewModel, "cameraViewModel");
            int iOooO0o0 = cameraViewModel.OooO0o0();
            MutableState mutableState = cameraViewModel.f23774OooOo0;
            if (iOooO0o0 == 1) {
                mutableState.setValue(0);
            } else if (iOooO0o0 != 2) {
                mutableState.setValue(2);
            } else {
                mutableState.setValue(1);
            }
            try {
                o0oOO o0ooo2 = o0oOO.f47775OooO0O0;
                int iOooO0o1 = cameraViewModel.OooO0o0();
                o0ooo2.getClass();
                Intrinsics.checkNotNullParameter("flashMode", "key");
                SharedPreferences.Editor editorPutInt = o0ooo2.f47774OooO00o.edit().putInt("flashMode", iOooO0o1);
                if (editorPutInt != null) {
                    editorPutInt.commit();
                }
                ImageCapture imageCapture = cameraViewModel.f23775OooOo00;
                Intrinsics.checkNotNull(imageCapture);
                imageCapture.Oooo0O0(cameraViewModel.OooO0o0());
            } catch (Exception unused) {
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CameraViewModel f23823OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f23824OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(CameraViewModel cameraViewModel, int i) {
            super(2);
            this.f23823OooO0Oo = cameraViewModel;
            this.f23824OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23824OooO0o0 | 1);
            OooOOO.OooO0OO(this.f23823OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f23825OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Context f23826OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ CameraViewModel f23827OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<PreviewView> f23828OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(CoroutineScope coroutineScope, CameraViewModel cameraViewModel, Context context, MutableState<PreviewView> mutableState) {
            super(0);
            this.f23825OooO0Oo = coroutineScope;
            this.f23827OooO0o0 = cameraViewModel;
            this.f23826OooO0o = context;
            this.f23828OooO0oO = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            BuildersKt__Builders_commonKt.launch$default(this.f23825OooO0Oo, null, null, new com.yalla.yalla.module.media.camera.OooOOOO(this.f23827OooO0o0, this.f23826OooO0o, this.f23828OooO0oO, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.module.media.camera.OooOOO$OooOOO, reason: collision with other inner class name */
    public static final class C0304OooOOO extends Lambda implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableFloatState f23829OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ float f23830OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ float f23831OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f23832OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ float f23833OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Dp> f23834OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ MutableFloatState f23835OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0304OooOOO(float f, boolean z, float f2, float f3, MutableState<Dp> mutableState, MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2) {
            super(1);
            this.f23830OooO0Oo = f;
            this.f23832OooO0o0 = z;
            this.f23831OooO0o = f2;
            this.f23833OooO0oO = f3;
            this.f23834OooO0oo = mutableState;
            this.f23829OooO = mutableFloatState;
            this.f23835OooOO0 = mutableFloatState2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DrawScope drawScope) {
            DrawScope Canvas = drawScope;
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            float fM1515getMinDimensionimpl = Size.m1515getMinDimensionimpl(Canvas.mo2118getSizeNHjbRc());
            float fMo326toPx0680j_4 = Canvas.mo326toPx0680j_4(this.f23834OooO0oo.getValue().m3789unboximpl());
            float f = 2;
            androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, Color.m1680copywmQWz5c$default(ColorKt.Color(4294967295L), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), fM1515getMinDimensionimpl / f, 0L, 0.0f, null, null, 0, 124, null);
            float f2 = this.f23830OooO0Oo * 360;
            if (!this.f23832OooO0o0) {
                float f3 = fMo326toPx0680j_4 / f;
                androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo0O(Canvas, Color.INSTANCE.m1718getWhite0d7_KjU(), -90.0f, f2 + 3, false, OffsetKt.Offset(f3, f3), SizeKt.Size(Size.m1516getWidthimpl(Canvas.mo2118getSizeNHjbRc()) - fMo326toPx0680j_4, Size.m1513getHeightimpl(Canvas.mo2118getSizeNHjbRc()) - fMo326toPx0680j_4), 0.0f, new Stroke(fMo326toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 832, null);
            }
            float f4 = fMo326toPx0680j_4 / f;
            androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo0O(Canvas, ColorKt.Color(4293804647L), -90.0f, f2, false, OffsetKt.Offset(f4, f4), SizeKt.Size(Size.m1516getWidthimpl(Canvas.mo2118getSizeNHjbRc()) - fMo326toPx0680j_4, Size.m1513getHeightimpl(Canvas.mo2118getSizeNHjbRc()) - fMo326toPx0680j_4), 0.0f, new Stroke(fMo326toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 832, null);
            MutableFloatState mutableFloatState = this.f23829OooO;
            float floatValue = mutableFloatState.getFloatValue();
            MutableFloatState mutableFloatState2 = this.f23835OooOO0;
            float floatValue2 = (mutableFloatState2.getFloatValue() * f) - mutableFloatState.getFloatValue();
            float f5 = this.f23831OooO0o;
            float f6 = (floatValue2 * f5) + floatValue;
            long jM1718getWhite0d7_KjU = Color.INSTANCE.m1718getWhite0d7_KjU();
            float f7 = f6 / f;
            long jOffset = OffsetKt.Offset((Size.m1516getWidthimpl(Canvas.mo2118getSizeNHjbRc()) / f) - f7, (Size.m1516getWidthimpl(Canvas.mo2118getSizeNHjbRc()) / f) - f7);
            long jSize = SizeKt.Size(f6, f6);
            float f8 = this.f23833OooO0oO;
            androidx.compose.ui.graphics.drawscope.OooO0O0.Oooo0o(Canvas, jM1718getWhite0d7_KjU, jOffset, jSize, CornerRadiusKt.CornerRadius$default(((mutableFloatState2.getFloatValue() - Canvas.mo326toPx0680j_4(f8)) * f5) + Canvas.mo326toPx0680j_4(f8), 0.0f, 2, null), null, 0.0f, null, 0, 240, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CameraViewModel f23836OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f23837OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<PreviewView> f23838OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(CameraViewModel cameraViewModel, MutableState<PreviewView> mutableState, int i) {
            super(2);
            this.f23836OooO0Oo = cameraViewModel;
            this.f23838OooO0o0 = mutableState;
            this.f23837OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23837OooO0o | 1);
            OooOOO.OooO0Oo(this.f23836OooO0Oo, this.f23838OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ float f23839OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Modifier f23840OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f23841OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f23842OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(float f, boolean z, Modifier modifier, int i) {
            super(2);
            this.f23839OooO0Oo = f;
            this.f23841OooO0o0 = z;
            this.f23840OooO0o = modifier;
            this.f23842OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23842OooO0oO | 1);
            boolean z = this.f23841OooO0o0;
            Modifier modifier = this.f23840OooO0o;
            OooOOO.OooO0o0(this.f23839OooO0Oo, z, modifier, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<Long, Unit> f23843OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOo(Function1<? super Long, Unit> function1) {
            super(1);
            this.f23843OooO0Oo = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l) {
            long jLongValue = l.longValue();
            Function1<Long, Unit> function1 = this.f23843OooO0Oo;
            if (function1 != null) {
                function1.invoke(Long.valueOf(jLongValue));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<Long, Unit> f23844OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOo00(Function1<? super Long, Unit> function1) {
            super(1);
            this.f23844OooO0Oo = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l) {
            long jLongValue = l.longValue();
            Function1<Long, Unit> function1 = this.f23844OooO0Oo;
            if (function1 != null) {
                function1.invoke(Long.valueOf(jLongValue));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Oooo0 f23845OooO0Oo = new Oooo0();

        public Oooo0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            int iIntValue = num.intValue();
            if (iIntValue == 1) {
                o0oo0000.OooO00o.OooO0O0("106094");
            } else if (iIntValue == 2) {
                o0oo0000.OooO00o.OooO0O0("106095");
            } else if (iIntValue == 3) {
                o0oo0000.OooO00o.OooO0O0("106093");
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<Boolean, Unit> f23846OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Oooo000(Function1<? super Boolean, Unit> function1) {
            super(1);
            this.f23846OooO0Oo = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l) {
            l.longValue();
            p363o0OOo00O.OooO0o oooO0o = o00OOO00.f47803OooO00o;
            o00OOO00.OooO0O0();
            Function1<Boolean, Unit> function1 = this.f23846OooO0Oo;
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<SelectMusicModel> f23847OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f23848OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(MutableState<SelectMusicModel> mutableState, MutableState<Boolean> mutableState2) {
            super(1);
            this.f23847OooO0Oo = mutableState;
            this.f23848OooO0o0 = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l) {
            SelectMusicModel value;
            long jLongValue = l.longValue();
            MutableState<SelectMusicModel> mutableState = this.f23847OooO0Oo;
            if (mutableState.getValue() != null && (value = mutableState.getValue()) != null) {
                value.setStartPosition(jLongValue);
            }
            this.f23848OooO0o0.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f23849OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<Boolean, Unit> f23850OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00O0O(MutableState<Boolean> mutableState, Function1<? super Boolean, Unit> function1) {
            super(0);
            this.f23849OooO0Oo = mutableState;
            this.f23850OooO0o0 = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Boolean bool = Boolean.TRUE;
            this.f23849OooO0Oo.setValue(bool);
            Function1<Boolean, Unit> function1 = this.f23850OooO0o0;
            if (function1 != null) {
                function1.invoke(bool);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o00Oo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23851OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Oo0(Function0<Unit> function0) {
            super(0);
            this.f23851OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f23851OooO0Oo.invoke();
            o0oo0000.OooO00o.OooO0O0("106092");
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function1<SelectMusicModel, Unit> f23852OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f23853OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f23854OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<SelectMusicModel> f23855OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f23856OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23857OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f23858OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ MutableState<Function0<Unit>> f23859OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<Long, Unit> f23860OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ int f23861OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ Function1<Boolean, Unit> f23862OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final /* synthetic */ int f23863OooOOOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00Ooo(BoxScope boxScope, MutableState<SelectMusicModel> mutableState, boolean z, long j, Function0<Unit> function0, Function1<? super SelectMusicModel, Unit> function1, MutableState<Boolean> mutableState2, MutableState<Function0<Unit>> mutableState3, Function1<? super Long, Unit> function2, Function1<? super Boolean, Unit> function3, int i, int i2) {
            super(2);
            this.f23853OooO0Oo = boxScope;
            this.f23855OooO0o0 = mutableState;
            this.f23854OooO0o = z;
            this.f23856OooO0oO = j;
            this.f23857OooO0oo = function0;
            this.f23852OooO = function1;
            this.f23858OooOO0 = mutableState2;
            this.f23859OooOO0O = mutableState3;
            this.f23860OooOO0o = function2;
            this.f23862OooOOO0 = function3;
            this.f23861OooOOO = i;
            this.f23863OooOOOO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooOOO.OooO0o(this.f23853OooO0Oo, this.f23855OooO0o0, this.f23854OooO0o, this.f23856OooO0oO, this.f23857OooO0oo, this.f23852OooO, this.f23858OooOO0, this.f23859OooOO0O, this.f23860OooOO0o, this.f23862OooOOO0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f23861OooOOO | 1), this.f23863OooOOOO);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.module.media.camera.CameraCommonCompKt$PauseRecordingWarn$2", f = "CameraCommonComp.kt", i = {}, l = {FacebookRequestErrorClassification.EC_APP_NOT_INSTALLED}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00oO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f23864OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ CameraViewModel f23865OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oO0o(CameraViewModel cameraViewModel, Continuation<? super o00oO0o> continuation) {
            super(2, continuation);
            this.f23865OooO0o0 = cameraViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o00oO0o(this.f23865OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o00oO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f23864OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f23864OooO0Oo = 1;
                if (DelayKt.delay(5000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.f23865OooO0o0.f23773OooOo.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.module.media.camera.CameraCommonCompKt$VideoRecordingTimeComp$1", f = "CameraCommonComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0OO00O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f23866OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23867OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ CameraViewModel f23868OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OO00O(int i, CameraViewModel cameraViewModel, Function0<Unit> function0, Continuation<? super o0OO00O> continuation) {
            super(2, continuation);
            this.f23866OooO0Oo = i;
            this.f23868OooO0o0 = cameraViewModel;
            this.f23867OooO0o = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o0OO00O(this.f23866OooO0Oo, this.f23868OooO0o0, this.f23867OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o0OO00O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            if (this.f23866OooO0Oo >= this.f23868OooO0o0.OooO0oo().f23781OooO00o) {
                this.f23867OooO0o.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0OOO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CameraViewModel f23869OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OOO0o(CameraViewModel cameraViewModel) {
            super(0);
            this.f23869OooO0Oo = cameraViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f23869OooO0Oo.f23773OooOo.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    public static final class o0Oo0oo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f23870OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f23871OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ CameraViewModel f23872OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0Oo0oo(BoxScope boxScope, CameraViewModel cameraViewModel, int i) {
            super(2);
            this.f23870OooO0Oo = boxScope;
            this.f23872OooO0o0 = cameraViewModel;
            this.f23871OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23871OooO0o | 1);
            OooOOO.OooO0oO(this.f23870OooO0Oo, this.f23872OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<SelectMusicModel, Unit> f23873OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<SelectMusicModel> f23874OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o0OoOo0(Function1<? super SelectMusicModel, Unit> function1, MutableState<SelectMusicModel> mutableState) {
            super(0);
            this.f23873OooO0Oo = function1;
            this.f23874OooO0o0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MutableState<SelectMusicModel> mutableState = this.f23874OooO0o0;
            this.f23873OooO0Oo.invoke(mutableState.getValue());
            if (mutableState.getValue() != null) {
                o0oo0000.OooO00o.OooO0O0("106091");
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0ooOOo extends Lambda implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Drawable f23875OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0ooOOo(Drawable drawable) {
            super(1);
            this.f23875OooO0Oo = drawable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DrawScope drawScope) {
            DrawScope drawBehind = drawScope;
            Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
            Drawable drawable = this.f23875OooO0Oo;
            Intrinsics.checkNotNull(drawable);
            drawable.setBounds(0, 0, (int) Size.m1516getWidthimpl(drawBehind.mo2118getSizeNHjbRc()), (int) Size.m1513getHeightimpl(drawBehind.mo2118getSizeNHjbRc()));
            drawable.draw(AndroidCanvas_androidKt.getNativeCanvas(drawBehind.getDrawContext().getCanvas()));
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nCameraCommonComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraCommonComp.kt\ncom/yalla/yalla/module/media/camera/CameraCommonCompKt$PauseRecordingWarn$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,443:1\n63#2,5:444\n*S KotlinDebug\n*F\n+ 1 CameraCommonComp.kt\ncom/yalla/yalla/module/media/camera/CameraCommonCompKt$PauseRecordingWarn$1\n*L\n406#1:444,5\n*E\n"})
    public static final class oo000o extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CameraViewModel f23876OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(CameraViewModel cameraViewModel) {
            super(1);
            this.f23876OooO0Oo = cameraViewModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            o0oOO.f47775OooO0O0.OooO0O0("pauseRecordingVideo", false);
            return new p452o0Ooo0.OooOOO0(this.f23876OooO0Oo);
        }
    }

    public static final class oo0o0Oo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CameraViewModel f23877OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f23878OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23879OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo0o0Oo(CameraViewModel cameraViewModel, Function0<Unit> function0, int i) {
            super(2);
            this.f23877OooO0Oo = cameraViewModel;
            this.f23879OooO0o0 = function0;
            this.f23878OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23878OooO0o | 1);
            OooOOO.OooO0oo(this.f23877OooO0Oo, this.f23879OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    /* JADX WARN: Code duplicated, block: B:29:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:53:0x0116  */
    /* JADX WARN: Code duplicated, block: B:55:0x011e  */
    /* JADX WARN: Code duplicated, block: B:58:0x016d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0179  */
    /* JADX WARN: Code duplicated, block: B:62:0x017d  */
    /* JADX WARN: Code duplicated, block: B:65:0x018e  */
    /* JADX WARN: Code duplicated, block: B:67:0x019c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0228  */
    /* JADX WARN: Code duplicated, block: B:74:0x0232  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull BoxScope boxScope, boolean z, @NotNull Function0<Unit> onClick, @Nullable Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        float f;
        boolean zOooO00o;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1320constructorimpl;
        Function2 function2OooO00o;
        boolean z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-457942539);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 1;
        if (i5 == 0) {
            if ((i & 112) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            if ((i2 & 2) != 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                if (composerStartRestartGroup.changedInstance(onClick)) {
                    i4 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            if ((i3 & 731) == 146 || !composerStartRestartGroup.getSkipping()) {
                if (i5 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-457942539, i3, -1, "com.yalla.yalla.module.media.camera.AddMusicComp (CameraCommonComp.kt:240)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Alignment.Companion companion2 = Alignment.INSTANCE;
                Modifier modifierM532widthInVpY3zN4$default = androidx.compose.foundation.layout.SizeKt.m532widthInVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(boxScope.align(companion, companion2.getTopCenter()), 0.0f, Dp.m3775constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3775constructorimpl(36)), 0.0f, Dp.m3775constructorimpl(Constants.ERR_PUBLISH_STREAM_INTERNAL_SERVER_ERROR), 1, null);
                if (z3) {
                    f = 1.0f;
                } else {
                    f = 0.5f;
                }
                float f2 = 10;
                Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(o00O0O0.OooO00o(f2, AlphaKt.alpha(modifierM532widthInVpY3zN4$default, f)), Color.m1680copywmQWz5c$default(ColorKt.Color(0), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z3, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(onClick);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zOooO00o || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new OooO00o(z3, onClick);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierM480paddingVpY3zN4$default = PaddingKt.m480paddingVpY3zN4$default(o0O0O00.OooO0O0(modifierM171backgroundbw27NRU$default, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 255), Dp.m3775constructorimpl(12), 0.0f, 2, null);
                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM480paddingVpY3zN4$default);
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
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                ImageKt.Image(PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_camera_add_music, composerStartRestartGroup, 0), (String) null, androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(16)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
                z4 = z3;
                TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(p456o0Ooo00o.o00oO0o.Add_Sound, composerStartRestartGroup, 0), PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f2), 0.0f, 0.0f, 0.0f, 14, null), Color.INSTANCE.m1718getWhite0d7_KjU(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3504, 3120, 120816);
                if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                z4 = z2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(boxScope, z4, onClick, i, i2));
        }
        i3 |= 48;
        z2 = z;
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (composerStartRestartGroup.changedInstance(onClick)) {
                i4 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 731) == 146) {
            if (i5 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-457942539, i3, -1, "com.yalla.yalla.module.media.camera.AddMusicComp (CameraCommonComp.kt:240)");
            }
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Alignment.Companion companion5 = Alignment.INSTANCE;
            Modifier modifierM532widthInVpY3zN4$default2 = androidx.compose.foundation.layout.SizeKt.m532widthInVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(boxScope.align(companion4, companion5.getTopCenter()), 0.0f, Dp.m3775constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3775constructorimpl(36)), 0.0f, Dp.m3775constructorimpl(Constants.ERR_PUBLISH_STREAM_INTERNAL_SERVER_ERROR), 1, null);
            if (z3) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            float f3 = 10;
            Modifier modifierM171backgroundbw27NRU$default2 = BackgroundKt.m171backgroundbw27NRU$default(o00O0O0.OooO00o(f3, AlphaKt.alpha(modifierM532widthInVpY3zN4$default2, f)), Color.m1680copywmQWz5c$default(ColorKt.Color(0), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z3, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(onClick);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zOooO00o) {
                objRememberedValue = new OooO00o(z3, onClick);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new OooO00o(z3, onClick);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM480paddingVpY3zN4$default2 = PaddingKt.m480paddingVpY3zN4$default(o0O0O00.OooO0O0(modifierM171backgroundbw27NRU$default2, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 255), Dp.m3775constructorimpl(12), 0.0f, 2, null);
            Alignment.Vertical centerVertically2 = companion5.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO0O1 = androidx.compose.material.OooO0OO.OooO0O0(Arrangement.INSTANCE, centerVertically2, composerStartRestartGroup, 48, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
            constructor = companion6.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM480paddingVpY3zN4$default2);
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
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion6, composerM1320constructorimpl, measurePolicyOooO0O1, composerM1320constructorimpl, currentCompositionLocalMap2);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_camera_add_music, composerStartRestartGroup, 0), (String) null, androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(companion4, Dp.m3775constructorimpl(16)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            z4 = z3;
            TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(p456o0Ooo00o.o00oO0o.Add_Sound, composerStartRestartGroup, 0), PaddingKt.m482paddingqDBjuR0$default(companion4, Dp.m3775constructorimpl(f3), 0.0f, 0.0f, 0.0f, 14, null), Color.INSTANCE.m1718getWhite0d7_KjU(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3504, 3120, 120816);
            if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            if (i5 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-457942539, i3, -1, "com.yalla.yalla.module.media.camera.AddMusicComp (CameraCommonComp.kt:240)");
            }
            Modifier.Companion companion7 = Modifier.INSTANCE;
            Alignment.Companion companion8 = Alignment.INSTANCE;
            Modifier modifierM532widthInVpY3zN4$default3 = androidx.compose.foundation.layout.SizeKt.m532widthInVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(boxScope.align(companion7, companion8.getTopCenter()), 0.0f, Dp.m3775constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3775constructorimpl(36)), 0.0f, Dp.m3775constructorimpl(Constants.ERR_PUBLISH_STREAM_INTERNAL_SERVER_ERROR), 1, null);
            if (z3) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            float f4 = 10;
            Modifier modifierM171backgroundbw27NRU$default3 = BackgroundKt.m171backgroundbw27NRU$default(o00O0O0.OooO00o(f4, AlphaKt.alpha(modifierM532widthInVpY3zN4$default3, f)), Color.m1680copywmQWz5c$default(ColorKt.Color(0), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z3, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(onClick);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zOooO00o) {
                objRememberedValue = new OooO00o(z3, onClick);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new OooO00o(z3, onClick);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM480paddingVpY3zN4$default3 = PaddingKt.m480paddingVpY3zN4$default(o0O0O00.OooO0O0(modifierM171backgroundbw27NRU$default3, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 255), Dp.m3775constructorimpl(12), 0.0f, 2, null);
            Alignment.Vertical centerVertically3 = companion8.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO0O2 = androidx.compose.material.OooO0OO.OooO0O0(Arrangement.INSTANCE, centerVertically3, composerStartRestartGroup, 48, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
            constructor = companion9.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM480paddingVpY3zN4$default3);
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
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion9, composerM1320constructorimpl, measurePolicyOooO0O2, composerM1320constructorimpl, currentCompositionLocalMap3);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_camera_add_music, composerStartRestartGroup, 0), (String) null, androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(companion7, Dp.m3775constructorimpl(16)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            z4 = z3;
            TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(p456o0Ooo00o.o00oO0o.Add_Sound, composerStartRestartGroup, 0), PaddingKt.m482paddingqDBjuR0$default(companion7, Dp.m3775constructorimpl(f4), 0.0f, 0.0f, 0.0f, 14, null), Color.INSTANCE.m1718getWhite0d7_KjU(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3504, 3120, 120816);
            if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(boxScope, z4, onClick, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(@NotNull Modifier modifier, @Nullable Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(1288380587);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1288380587, i2, -1, "com.yalla.yalla.module.media.camera.CameraCapture (CameraCommonComp.kt:74)");
            }
            Modifier modifierM525size3ABfNKs = androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(25), 7, null), Dp.m3775constructorimpl(80));
            float fM3775constructorimpl = Dp.m3775constructorimpl(5);
            Color.Companion companion = Color.INSTANCE;
            BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(PaddingKt.m478padding3ABfNKs(BorderKt.m182borderxT4_qwU(modifierM525size3ABfNKs, fM3775constructorimpl, companion.m1718getWhite0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), Dp.m3775constructorimpl(8)), RoundedCornerShapeKt.getCircleShape()), companion.m1718getWhite0d7_KjU(), null, 2, null).then(modifier), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(modifier, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(@NotNull CameraViewModel cameraViewModel, @Nullable Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(cameraViewModel, "cameraViewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-745697022);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-745697022, i, -1, "com.yalla.yalla.module.media.camera.CameraFlashComp (CameraCommonComp.kt:211)");
        }
        int iOooO0o0 = cameraViewModel.OooO0o0();
        if (iOooO0o0 != 1) {
            i2 = iOooO0o0 != 2 ? p456o0Ooo00o.oo000o.ic_camera_flash_mode_auto : p456o0Ooo00o.oo000o.ic_camera_flash_mode_off;
        } else {
            i2 = p456o0Ooo00o.oo000o.ic_camera_flash_mode_on;
        }
        ImageKt.Image(PainterResources_androidKt.painterResource(i2, composerStartRestartGroup, 0), (String) null, o0O0O00.OooO0O0(androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(28)), false, false, 0L, false, null, null, null, new OooO0o(cameraViewModel), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        EffectsKt.LaunchedEffect(Boolean.valueOf(cameraViewModel.OooO()), Integer.valueOf(cameraViewModel.OooO0o0()), Boolean.valueOf(cameraViewModel.OooO0oO()), new OooO(cameraViewModel, null), composerStartRestartGroup, 4096);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(cameraViewModel, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0Oo(@NotNull CameraViewModel cameraViewModel, @NotNull MutableState<PreviewView> previewView, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(cameraViewModel, "cameraViewModel");
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        Composer composerStartRestartGroup = composer.startRestartGroup(497168873);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(497168873, i, -1, "com.yalla.yalla.module.media.camera.CameraSwitchComp (CameraCommonComp.kt:194)");
        }
        Object objOooO00o = androidx.compose.animation.OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
        if (objOooO00o == Composer.INSTANCE.getEmpty()) {
            objOooO00o = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
        }
        composerStartRestartGroup.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
        composerStartRestartGroup.endReplaceableGroup();
        ImageKt.Image(PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_camera_switch, composerStartRestartGroup, 0), (String) null, o0O0O00.OooO0O0(androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(24), 7, null), Dp.m3775constructorimpl(28)), false, false, 0L, false, null, null, null, new OooOO0O(coroutineScope, cameraViewModel, (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), previewView), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(cameraViewModel, previewView, i));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012c  */
    /* JADX WARN: Code duplicated, block: B:102:0x0132  */
    /* JADX WARN: Code duplicated, block: B:103:0x0135  */
    /* JADX WARN: Code duplicated, block: B:107:0x0143  */
    /* JADX WARN: Code duplicated, block: B:111:0x0159 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x015b  */
    /* JADX WARN: Code duplicated, block: B:113:0x015e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0162  */
    /* JADX WARN: Code duplicated, block: B:116:0x0165  */
    /* JADX WARN: Code duplicated, block: B:118:0x0169  */
    /* JADX WARN: Code duplicated, block: B:119:0x016c  */
    /* JADX WARN: Code duplicated, block: B:121:0x0170  */
    /* JADX WARN: Code duplicated, block: B:122:0x0173  */
    /* JADX WARN: Code duplicated, block: B:125:0x017b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0191 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:132:0x019d  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:145:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:148:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:150:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:153:0x0213  */
    /* JADX WARN: Code duplicated, block: B:155:0x021b  */
    /* JADX WARN: Code duplicated, block: B:158:0x0241  */
    /* JADX WARN: Code duplicated, block: B:160:0x0249  */
    /* JADX WARN: Code duplicated, block: B:164:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:165:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:168:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:171:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:172:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:175:0x030c  */
    /* JADX WARN: Code duplicated, block: B:177:0x031a  */
    /* JADX WARN: Code duplicated, block: B:180:0x039e  */
    /* JADX WARN: Code duplicated, block: B:183:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:184:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:187:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:189:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:192:0x040b  */
    /* JADX WARN: Code duplicated, block: B:196:0x0415  */
    /* JADX WARN: Code duplicated, block: B:199:0x0464  */
    /* JADX WARN: Code duplicated, block: B:201:0x046c  */
    /* JADX WARN: Code duplicated, block: B:204:0x04af  */
    /* JADX WARN: Code duplicated, block: B:206:0x04de  */
    /* JADX WARN: Code duplicated, block: B:208:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:210:0x053f  */
    /* JADX WARN: Code duplicated, block: B:213:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:215:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:218:0x060c  */
    /* JADX WARN: Code duplicated, block: B:223:0x061e  */
    /* JADX WARN: Code duplicated, block: B:225:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00df  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:88:0x0104  */
    /* JADX WARN: Code duplicated, block: B:90:0x010c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0112  */
    /* JADX WARN: Code duplicated, block: B:93:0x0115  */
    /* JADX WARN: Code duplicated, block: B:97:0x011d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0124  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o(@NotNull BoxScope boxScope, @NotNull MutableState<SelectMusicModel> selectMusicModel, boolean z, long j, @NotNull Function0<Unit> deleteMusic, @NotNull Function1<? super SelectMusicModel, Unit> direct2AddMusic, @Nullable MutableState<Boolean> mutableState, @Nullable MutableState<Function0<Unit>> mutableState2, @Nullable Function1<? super Long, Unit> function1, @Nullable Function1<? super Boolean, Unit> function2, @Nullable Composer composer, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        MutableState<Boolean> mutableState3;
        MutableState<Function0<Unit>> mutableState4;
        Function1<? super Long, Unit> function3;
        Function1<? super Boolean, Unit> function4;
        Modifier.Companion companion;
        float f;
        float f2;
        Function1<? super Boolean, Unit> function5;
        int currentCompositeKeyHash;
        MutableState<Boolean> mutableState5;
        Function0<ComposeUiNode> constructor;
        Composer composerM1320constructorimpl;
        Function2 function2OooO00o;
        int currentCompositeKeyHash2;
        Function0<ComposeUiNode> constructor2;
        Composer composerM1320constructorimpl2;
        Function2 function2OooO00o2;
        float f3;
        SelectMusicModel value;
        String str;
        boolean zChanged;
        Object objRememberedValue;
        Function1<? super Boolean, Unit> function6;
        float f4;
        Composer composer2;
        Object obj;
        boolean zChanged2;
        Object objRememberedValue2;
        Composer composer3;
        Function1<? super Boolean, Unit> function7;
        MutableState<Boolean> mutableState6;
        Function1<? super Long, Unit> function8;
        MutableState<Function0<Unit>> mutableState7;
        boolean zChanged3;
        Object objRememberedValue3;
        String displayName;
        SelectMusicModel value2;
        String str2;
        SelectMusicModel value3;
        long durationMs;
        boolean zChanged4;
        Object objRememberedValue4;
        boolean zChanged5;
        Object objRememberedValue5;
        boolean zChanged6;
        Object objRememberedValue6;
        boolean zChanged7;
        Object objRememberedValue7;
        String displayName2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Intrinsics.checkNotNullParameter(selectMusicModel, "selectMusicModel");
        Intrinsics.checkNotNullParameter(deleteMusic, "deleteMusic");
        Intrinsics.checkNotNullParameter(direct2AddMusic, "direct2AddMusic");
        Composer composerStartRestartGroup = composer.startRestartGroup(782343971);
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(selectMusicModel) ? 32 : 16;
        }
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 4) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i2 & 8) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(deleteMusic) ? 16384 : 8192;
        }
        if ((i2 & 16) == 0) {
            if ((458752 & i) == 0) {
                i4 = composerStartRestartGroup.changedInstance(direct2AddMusic) ? 131072 : 65536;
            }
            i5 = i2 & 32;
            if (i5 != 0) {
                if ((3670016 & i) == 0) {
                    if (composerStartRestartGroup.changed(mutableState)) {
                        i6 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i6 = 524288;
                    }
                    i3 |= i6;
                }
                i7 = i2 & 64;
                if (i7 != 0) {
                    if ((29360128 & i) == 0) {
                        if (composerStartRestartGroup.changed(mutableState2)) {
                            i8 = 8388608;
                        } else {
                            i8 = Configuration.BLOCK_SIZE;
                        }
                        i3 |= i8;
                    }
                    i9 = i2 & 128;
                    if (i9 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i10 = 67108864;
                        } else {
                            i10 = 33554432;
                        }
                        i3 |= i10;
                    }
                    i11 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i11 != 0) {
                        i3 |= 805306368;
                    } else if ((i & 1879048192) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i12 = 536870912;
                        } else {
                            i12 = SQLiteDatabase.CREATE_IF_NECESSARY;
                        }
                        i3 |= i12;
                    }
                    if ((i3 & 1533916891) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                        if (i5 != 0) {
                            mutableState3 = null;
                        } else {
                            mutableState3 = mutableState;
                        }
                        if (i7 != 0) {
                            mutableState4 = null;
                        } else {
                            mutableState4 = mutableState2;
                        }
                        if (i9 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        if (i11 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(782343971, i3, -1, "com.yalla.yalla.module.media.camera.MusicSelectedComp (CameraCommonComp.kt:288)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-1444899166);
                        if (mutableState3 != null && mutableState4 != null) {
                            value2 = selectMusicModel.getValue();
                            if (value2 != null || (displayName2 = value2.getDisplayName()) == null) {
                                str2 = "";
                            } else {
                                str2 = displayName2;
                            }
                            value3 = selectMusicModel.getValue();
                            if (value3 != null) {
                                durationMs = value3.getDurationMs();
                            } else {
                                durationMs = 0;
                            }
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged4 = composerStartRestartGroup.changed(function3);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new OooOo00(function3);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Function1 function9 = (Function1) objRememberedValue4;
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged5 = composerStartRestartGroup.changed(function3);
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue5 = new OooOo(function3);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Function1 function10 = (Function1) objRememberedValue5;
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged6 = composerStartRestartGroup.changed(function4);
                            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                            if (zChanged6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue6 = new Oooo000(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Function1 function11 = (Function1) objRememberedValue6;
                            Oooo0 oooo0 = Oooo0.f23845OooO0Oo;
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged7 = composerStartRestartGroup.changed(selectMusicModel) | composerStartRestartGroup.changed(mutableState3);
                            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                            if (zChanged7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue7 = new o000oOoO(selectMusicModel, mutableState3);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState4.setValue(o00O00o0.OooO00o(mutableState3, str2, durationMs, j, function9, function10, function11, oooo0, (Function1) objRememberedValue7, composerStartRestartGroup, ((i3 >> 18) & 14) | 100663296 | (i3 & 7168)));
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        companion = Modifier.INSTANCE;
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        f = 10;
                        Modifier modifierOooO00o = o00O0O0.OooO00o(f, androidx.compose.foundation.layout.SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(boxScope.align(companion, companion2.getTopCenter()), 0.0f, Dp.m3775constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3775constructorimpl(35)));
                        if (z) {
                            f2 = 1.0f;
                        } else {
                            f2 = 0.5f;
                        }
                        Modifier modifierAlpha = AlphaKt.alpha(modifierOooO00o, f2);
                        Alignment.Vertical centerVertically = companion2.getCenterVertically();
                        function5 = function4;
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Function1<? super Long, Unit> function12 = function3;
                        MutableState<Function0<Unit>> mutableState8 = mutableState4;
                        MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        mutableState5 = mutableState3;
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierAlpha);
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
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
                        float f5 = 12;
                        Modifier modifierWeight = rowScopeInstance.weight(PaddingKt.m482paddingqDBjuR0$default(BackgroundKt.m171backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(36)), Color.m1680copywmQWz5c$default(ColorKt.Color(0), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m3775constructorimpl(f5), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false);
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyOooO0O1 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically2, composerStartRestartGroup, 48, -1323940314);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor2 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierWeight);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                        function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO0O1, composerM1320constructorimpl2, currentCompositionLocalMap2);
                        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        f3 = 15;
                        ImageKt.Image(PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_camera_add_music, composerStartRestartGroup, 0), (String) null, androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
                        value = selectMusicModel.getValue();
                        if (value != null || (displayName = value.getDisplayName()) == null) {
                            str = "";
                        } else {
                            str = displayName;
                        }
                        long jM1718getWhite0d7_KjU = Color.INSTANCE.m1718getWhite0d7_KjU();
                        long sp = TextUnitKt.getSp(14);
                        Modifier modifierM532widthInVpY3zN4$default = androidx.compose.foundation.layout.SizeKt.m532widthInVpY3zN4$default(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, Dp.m3775constructorimpl(96), 1, null);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(direct2AddMusic) | composerStartRestartGroup.changed(selectMusicModel);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new o0OoOo0(direct2AddMusic, selectMusicModel);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        p197o00o0OOo.o00O0O0.OooO00o(str, jM1718getWhite0d7_KjU, sp, o0O0O00.OooO0O0(modifierM532widthInVpY3zN4$default, z, false, 0L, false, null, null, null, (Function0) objRememberedValue, 252), false, composerStartRestartGroup, 432, 16);
                        if (mutableState5 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-194151136);
                            Painter painterPainterResource = PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_camera_music_clip, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged3 = composerStartRestartGroup.changed(mutableState5) | composerStartRestartGroup.changed(function5);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new o00O0O(mutableState5, function5);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            function6 = function5;
                            ImageKt.Image(painterPainterResource, (String) null, androidx.compose.foundation.layout.SizeKt.m530width3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(PaddingKt.m480paddingVpY3zN4$default(o0O0O00.OooO0O0(companion, z, false, 0L, false, null, null, null, (Function0) objRememberedValue3, 252), Dp.m3775constructorimpl(f), 0.0f, 2, null), 0.0f, 1, null), Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                            composerStartRestartGroup.endReplaceableGroup();
                            obj = null;
                            composer2 = composerStartRestartGroup;
                            f4 = 0.0f;
                        } else {
                            function6 = function5;
                            f4 = 0.0f;
                            composer2 = composerStartRestartGroup;
                            composer2.startReplaceableGroup(-194150544);
                            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f), null, composer2, 6, 2);
                            composer2.endReplaceableGroup();
                            obj = null;
                        }
                        o000O.o0ooOOo.OooO00o(composer2);
                        Painter painterPainterResource2 = PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_remove_selected_music, composer2, 0);
                        Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(1), 0.0f, 0.0f, 0.0f, 14, null), f4, 1, obj), Color.m1680copywmQWz5c$default(ColorKt.Color(0), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                        composer2.startReplaceableGroup(1157296644);
                        zChanged2 = composer2.changed(deleteMusic);
                        objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new o00Oo0(deleteMusic);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        composer3 = composer2;
                        ImageKt.Image(painterPainterResource2, (String) null, androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(o0O0O00.OooO0O0(modifierM171backgroundbw27NRU$default, z, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 252), Dp.m3775constructorimpl(f), 0.0f, Dp.m3775constructorimpl(f5), 0.0f, 10, null), Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                        if (androidx.compose.material.OooO0o.OooO00o(composer3)) {
                            ComposerKt.traceEventEnd();
                        }
                        function7 = function6;
                        mutableState6 = mutableState5;
                        function8 = function12;
                        mutableState7 = mutableState8;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        mutableState6 = mutableState;
                        mutableState7 = mutableState2;
                        function8 = function1;
                        composer3 = composerStartRestartGroup;
                        function7 = function2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new o00Ooo(boxScope, selectMusicModel, z, j, deleteMusic, direct2AddMusic, mutableState6, mutableState7, function8, function7, i, i2));
                }
                i3 |= 12582912;
                i9 = i2 & 128;
                if (i9 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                    i3 |= i10;
                }
                i11 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i11 != 0) {
                    i3 |= 805306368;
                } else if ((i & 1879048192) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i12 = 536870912;
                    } else {
                        i12 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                    i3 |= i12;
                }
                if ((i3 & 1533916891) == 306783378) {
                    if (i5 != 0) {
                        mutableState3 = null;
                    } else {
                        mutableState3 = mutableState;
                    }
                    if (i7 != 0) {
                        mutableState4 = null;
                    } else {
                        mutableState4 = mutableState2;
                    }
                    if (i9 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if (i11 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(782343971, i3, -1, "com.yalla.yalla.module.media.camera.MusicSelectedComp (CameraCommonComp.kt:288)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-1444899166);
                    if (mutableState3 != null) {
                        value2 = selectMusicModel.getValue();
                        if (value2 != null) {
                            str2 = "";
                        } else {
                            str2 = "";
                        }
                        value3 = selectMusicModel.getValue();
                        if (value3 != null) {
                            durationMs = value3.getDurationMs();
                        } else {
                            durationMs = 0;
                        }
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged4 = composerStartRestartGroup.changed(function3);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged4) {
                            objRememberedValue4 = new OooOo00(function3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new OooOo00(function3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function1 function13 = (Function1) objRememberedValue4;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged5 = composerStartRestartGroup.changed(function3);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (zChanged5) {
                            objRememberedValue5 = new OooOo(function3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        } else {
                            objRememberedValue5 = new OooOo(function3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function1 function14 = (Function1) objRememberedValue5;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged6 = composerStartRestartGroup.changed(function4);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChanged6) {
                            objRememberedValue6 = new Oooo000(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new Oooo000(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function1 function15 = (Function1) objRememberedValue6;
                        Oooo0 oooo1 = Oooo0.f23845OooO0Oo;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged7 = composerStartRestartGroup.changed(selectMusicModel) | composerStartRestartGroup.changed(mutableState3);
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (zChanged7) {
                            objRememberedValue7 = new o000oOoO(selectMusicModel, mutableState3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        } else {
                            objRememberedValue7 = new o000oOoO(selectMusicModel, mutableState3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState4.setValue(o00O00o0.OooO00o(mutableState3, str2, durationMs, j, function13, function14, function15, oooo1, (Function1) objRememberedValue7, composerStartRestartGroup, ((i3 >> 18) & 14) | 100663296 | (i3 & 7168)));
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    companion = Modifier.INSTANCE;
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    f = 10;
                    Modifier modifierOooO00o2 = o00O0O0.OooO00o(f, androidx.compose.foundation.layout.SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(boxScope.align(companion, companion4.getTopCenter()), 0.0f, Dp.m3775constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3775constructorimpl(35)));
                    if (z) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.5f;
                    }
                    Modifier modifierAlpha2 = AlphaKt.alpha(modifierOooO00o2, f2);
                    Alignment.Vertical centerVertically3 = companion4.getCenterVertically();
                    function5 = function4;
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Function1<? super Long, Unit> function16 = function3;
                    MutableState<Function0<Unit>> mutableState9 = mutableState4;
                    MeasurePolicy measurePolicyOooO0O2 = androidx.compose.material.OooO0OO.OooO0O0(arrangement2, centerVertically3, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    mutableState5 = mutableState3;
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    constructor = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierAlpha2);
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
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion5, composerM1320constructorimpl, measurePolicyOooO0O2, composerM1320constructorimpl, currentCompositionLocalMap3);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    Alignment.Vertical centerVertically4 = companion4.getCenterVertically();
                    float f6 = 12;
                    Modifier modifierWeight2 = rowScopeInstance2.weight(PaddingKt.m482paddingqDBjuR0$default(BackgroundKt.m171backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(36)), Color.m1680copywmQWz5c$default(ColorKt.Color(0), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m3775constructorimpl(f6), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false);
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO0O3 = androidx.compose.material.OooO0OO.OooO0O0(arrangement2, centerVertically4, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierWeight2);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion5, composerM1320constructorimpl2, measurePolicyOooO0O3, composerM1320constructorimpl2, currentCompositionLocalMap4);
                    if (composerM1320constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    f3 = 15;
                    ImageKt.Image(PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_camera_add_music, composerStartRestartGroup, 0), (String) null, androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
                    value = selectMusicModel.getValue();
                    if (value != null) {
                        str = "";
                    } else {
                        str = "";
                    }
                    long jM1718getWhite0d7_KjU2 = Color.INSTANCE.m1718getWhite0d7_KjU();
                    long sp2 = TextUnitKt.getSp(14);
                    Modifier modifierM532widthInVpY3zN4$default2 = androidx.compose.foundation.layout.SizeKt.m532widthInVpY3zN4$default(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, Dp.m3775constructorimpl(96), 1, null);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(direct2AddMusic) | composerStartRestartGroup.changed(selectMusicModel);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new o0OoOo0(direct2AddMusic, selectMusicModel);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new o0OoOo0(direct2AddMusic, selectMusicModel);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    p197o00o0OOo.o00O0O0.OooO00o(str, jM1718getWhite0d7_KjU2, sp2, o0O0O00.OooO0O0(modifierM532widthInVpY3zN4$default2, z, false, 0L, false, null, null, null, (Function0) objRememberedValue, 252), false, composerStartRestartGroup, 432, 16);
                    if (mutableState5 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-194151136);
                        Painter painterPainterResource3 = PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_camera_music_clip, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged3 = composerStartRestartGroup.changed(mutableState5) | composerStartRestartGroup.changed(function5);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue3 = new o00O0O(mutableState5, function5);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new o00O0O(mutableState5, function5);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function6 = function5;
                        ImageKt.Image(painterPainterResource3, (String) null, androidx.compose.foundation.layout.SizeKt.m530width3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(PaddingKt.m480paddingVpY3zN4$default(o0O0O00.OooO0O0(companion, z, false, 0L, false, null, null, null, (Function0) objRememberedValue3, 252), Dp.m3775constructorimpl(f), 0.0f, 2, null), 0.0f, 1, null), Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        composerStartRestartGroup.endReplaceableGroup();
                        obj = null;
                        composer2 = composerStartRestartGroup;
                        f4 = 0.0f;
                    } else {
                        function6 = function5;
                        f4 = 0.0f;
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceableGroup(-194150544);
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f), null, composer2, 6, 2);
                        composer2.endReplaceableGroup();
                        obj = null;
                    }
                    o000O.o0ooOOo.OooO00o(composer2);
                    Painter painterPainterResource4 = PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_remove_selected_music, composer2, 0);
                    Modifier modifierM171backgroundbw27NRU$default2 = BackgroundKt.m171backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(1), 0.0f, 0.0f, 0.0f, 14, null), f4, 1, obj), Color.m1680copywmQWz5c$default(ColorKt.Color(0), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    composer2.startReplaceableGroup(1157296644);
                    zChanged2 = composer2.changed(deleteMusic);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new o00Oo0(deleteMusic);
                        composer2.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new o00Oo0(deleteMusic);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    composer3 = composer2;
                    ImageKt.Image(painterPainterResource4, (String) null, androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(o0O0O00.OooO0O0(modifierM171backgroundbw27NRU$default2, z, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 252), Dp.m3775constructorimpl(f), 0.0f, Dp.m3775constructorimpl(f6), 0.0f, 10, null), Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                    if (androidx.compose.material.OooO0o.OooO00o(composer3)) {
                        ComposerKt.traceEventEnd();
                    }
                    function7 = function6;
                    mutableState6 = mutableState5;
                    function8 = function16;
                    mutableState7 = mutableState9;
                } else {
                    if (i5 != 0) {
                        mutableState3 = null;
                    } else {
                        mutableState3 = mutableState;
                    }
                    if (i7 != 0) {
                        mutableState4 = null;
                    } else {
                        mutableState4 = mutableState2;
                    }
                    if (i9 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if (i11 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(782343971, i3, -1, "com.yalla.yalla.module.media.camera.MusicSelectedComp (CameraCommonComp.kt:288)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-1444899166);
                    if (mutableState3 != null) {
                        value2 = selectMusicModel.getValue();
                        if (value2 != null) {
                            str2 = "";
                        } else {
                            str2 = "";
                        }
                        value3 = selectMusicModel.getValue();
                        if (value3 != null) {
                            durationMs = value3.getDurationMs();
                        } else {
                            durationMs = 0;
                        }
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged4 = composerStartRestartGroup.changed(function3);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged4) {
                            objRememberedValue4 = new OooOo00(function3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new OooOo00(function3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function1 function17 = (Function1) objRememberedValue4;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged5 = composerStartRestartGroup.changed(function3);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (zChanged5) {
                            objRememberedValue5 = new OooOo(function3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        } else {
                            objRememberedValue5 = new OooOo(function3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function1 function18 = (Function1) objRememberedValue5;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged6 = composerStartRestartGroup.changed(function4);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChanged6) {
                            objRememberedValue6 = new Oooo000(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new Oooo000(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function1 function19 = (Function1) objRememberedValue6;
                        Oooo0 oooo2 = Oooo0.f23845OooO0Oo;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged7 = composerStartRestartGroup.changed(selectMusicModel) | composerStartRestartGroup.changed(mutableState3);
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (zChanged7) {
                            objRememberedValue7 = new o000oOoO(selectMusicModel, mutableState3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        } else {
                            objRememberedValue7 = new o000oOoO(selectMusicModel, mutableState3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState4.setValue(o00O00o0.OooO00o(mutableState3, str2, durationMs, j, function17, function18, function19, oooo2, (Function1) objRememberedValue7, composerStartRestartGroup, ((i3 >> 18) & 14) | 100663296 | (i3 & 7168)));
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    companion = Modifier.INSTANCE;
                    Alignment.Companion companion6 = Alignment.INSTANCE;
                    f = 10;
                    Modifier modifierOooO00o3 = o00O0O0.OooO00o(f, androidx.compose.foundation.layout.SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(boxScope.align(companion, companion6.getTopCenter()), 0.0f, Dp.m3775constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3775constructorimpl(35)));
                    if (z) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.5f;
                    }
                    Modifier modifierAlpha3 = AlphaKt.alpha(modifierOooO00o3, f2);
                    Alignment.Vertical centerVertically5 = companion6.getCenterVertically();
                    function5 = function4;
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    Arrangement arrangement3 = Arrangement.INSTANCE;
                    Function1<? super Long, Unit> function110 = function3;
                    MutableState<Function0<Unit>> mutableState10 = mutableState4;
                    MeasurePolicy measurePolicyOooO0O4 = androidx.compose.material.OooO0OO.OooO0O0(arrangement3, centerVertically5, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    mutableState5 = mutableState3;
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    constructor = companion7.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierAlpha3);
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
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion7, composerM1320constructorimpl, measurePolicyOooO0O4, composerM1320constructorimpl, currentCompositionLocalMap5);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf5, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                    Alignment.Vertical centerVertically6 = companion6.getCenterVertically();
                    float f7 = 12;
                    Modifier modifierWeight3 = rowScopeInstance3.weight(PaddingKt.m482paddingqDBjuR0$default(BackgroundKt.m171backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(36)), Color.m1680copywmQWz5c$default(ColorKt.Color(0), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m3775constructorimpl(f7), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false);
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO0O5 = androidx.compose.material.OooO0OO.OooO0O0(arrangement3, centerVertically6, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion7.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierWeight3);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion7, composerM1320constructorimpl2, measurePolicyOooO0O5, composerM1320constructorimpl2, currentCompositionLocalMap6);
                    if (composerM1320constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf6, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    f3 = 15;
                    ImageKt.Image(PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_camera_add_music, composerStartRestartGroup, 0), (String) null, androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
                    value = selectMusicModel.getValue();
                    if (value != null) {
                        str = "";
                    } else {
                        str = "";
                    }
                    long jM1718getWhite0d7_KjU3 = Color.INSTANCE.m1718getWhite0d7_KjU();
                    long sp3 = TextUnitKt.getSp(14);
                    Modifier modifierM532widthInVpY3zN4$default3 = androidx.compose.foundation.layout.SizeKt.m532widthInVpY3zN4$default(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, Dp.m3775constructorimpl(96), 1, null);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(direct2AddMusic) | composerStartRestartGroup.changed(selectMusicModel);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new o0OoOo0(direct2AddMusic, selectMusicModel);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new o0OoOo0(direct2AddMusic, selectMusicModel);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    p197o00o0OOo.o00O0O0.OooO00o(str, jM1718getWhite0d7_KjU3, sp3, o0O0O00.OooO0O0(modifierM532widthInVpY3zN4$default3, z, false, 0L, false, null, null, null, (Function0) objRememberedValue, 252), false, composerStartRestartGroup, 432, 16);
                    if (mutableState5 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-194151136);
                        Painter painterPainterResource5 = PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_camera_music_clip, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged3 = composerStartRestartGroup.changed(mutableState5) | composerStartRestartGroup.changed(function5);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue3 = new o00O0O(mutableState5, function5);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new o00O0O(mutableState5, function5);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function6 = function5;
                        ImageKt.Image(painterPainterResource5, (String) null, androidx.compose.foundation.layout.SizeKt.m530width3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(PaddingKt.m480paddingVpY3zN4$default(o0O0O00.OooO0O0(companion, z, false, 0L, false, null, null, null, (Function0) objRememberedValue3, 252), Dp.m3775constructorimpl(f), 0.0f, 2, null), 0.0f, 1, null), Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        composerStartRestartGroup.endReplaceableGroup();
                        obj = null;
                        composer2 = composerStartRestartGroup;
                        f4 = 0.0f;
                    } else {
                        function6 = function5;
                        f4 = 0.0f;
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceableGroup(-194150544);
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f), null, composer2, 6, 2);
                        composer2.endReplaceableGroup();
                        obj = null;
                    }
                    o000O.o0ooOOo.OooO00o(composer2);
                    Painter painterPainterResource6 = PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_remove_selected_music, composer2, 0);
                    Modifier modifierM171backgroundbw27NRU$default3 = BackgroundKt.m171backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(1), 0.0f, 0.0f, 0.0f, 14, null), f4, 1, obj), Color.m1680copywmQWz5c$default(ColorKt.Color(0), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    composer2.startReplaceableGroup(1157296644);
                    zChanged2 = composer2.changed(deleteMusic);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new o00Oo0(deleteMusic);
                        composer2.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new o00Oo0(deleteMusic);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    composer3 = composer2;
                    ImageKt.Image(painterPainterResource6, (String) null, androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(o0O0O00.OooO0O0(modifierM171backgroundbw27NRU$default3, z, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 252), Dp.m3775constructorimpl(f), 0.0f, Dp.m3775constructorimpl(f7), 0.0f, 10, null), Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                    if (androidx.compose.material.OooO0o.OooO00o(composer3)) {
                        ComposerKt.traceEventEnd();
                    }
                    function7 = function6;
                    mutableState6 = mutableState5;
                    function8 = function110;
                    mutableState7 = mutableState10;
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new o00Ooo(boxScope, selectMusicModel, z, j, deleteMusic, direct2AddMusic, mutableState6, mutableState7, function8, function7, i, i2));
            }
            i3 |= 1572864;
            i7 = i2 & 64;
            if (i7 != 0) {
                if ((29360128 & i) == 0) {
                    if (composerStartRestartGroup.changed(mutableState2)) {
                        i8 = 8388608;
                    } else {
                        i8 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i8;
                }
                i9 = i2 & 128;
                if (i9 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                    i3 |= i10;
                }
                i11 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i11 != 0) {
                    i3 |= 805306368;
                } else if ((i & 1879048192) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i12 = 536870912;
                    } else {
                        i12 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                    i3 |= i12;
                }
                if ((i3 & 1533916891) == 306783378) {
                    if (i5 != 0) {
                        mutableState3 = null;
                    } else {
                        mutableState3 = mutableState;
                    }
                    if (i7 != 0) {
                        mutableState4 = null;
                    } else {
                        mutableState4 = mutableState2;
                    }
                    if (i9 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if (i11 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(782343971, i3, -1, "com.yalla.yalla.module.media.camera.MusicSelectedComp (CameraCommonComp.kt:288)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-1444899166);
                    if (mutableState3 != null) {
                        value2 = selectMusicModel.getValue();
                        if (value2 != null) {
                            str2 = "";
                        } else {
                            str2 = "";
                        }
                        value3 = selectMusicModel.getValue();
                        if (value3 != null) {
                            durationMs = value3.getDurationMs();
                        } else {
                            durationMs = 0;
                        }
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged4 = composerStartRestartGroup.changed(function3);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged4) {
                            objRememberedValue4 = new OooOo00(function3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new OooOo00(function3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function1 function111 = (Function1) objRememberedValue4;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged5 = composerStartRestartGroup.changed(function3);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (zChanged5) {
                            objRememberedValue5 = new OooOo(function3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        } else {
                            objRememberedValue5 = new OooOo(function3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function1 function112 = (Function1) objRememberedValue5;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged6 = composerStartRestartGroup.changed(function4);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChanged6) {
                            objRememberedValue6 = new Oooo000(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new Oooo000(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function1 function113 = (Function1) objRememberedValue6;
                        Oooo0 oooo3 = Oooo0.f23845OooO0Oo;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged7 = composerStartRestartGroup.changed(selectMusicModel) | composerStartRestartGroup.changed(mutableState3);
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (zChanged7) {
                            objRememberedValue7 = new o000oOoO(selectMusicModel, mutableState3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        } else {
                            objRememberedValue7 = new o000oOoO(selectMusicModel, mutableState3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState4.setValue(o00O00o0.OooO00o(mutableState3, str2, durationMs, j, function111, function112, function113, oooo3, (Function1) objRememberedValue7, composerStartRestartGroup, ((i3 >> 18) & 14) | 100663296 | (i3 & 7168)));
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    companion = Modifier.INSTANCE;
                    Alignment.Companion companion8 = Alignment.INSTANCE;
                    f = 10;
                    Modifier modifierOooO00o4 = o00O0O0.OooO00o(f, androidx.compose.foundation.layout.SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(boxScope.align(companion, companion8.getTopCenter()), 0.0f, Dp.m3775constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3775constructorimpl(35)));
                    if (z) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.5f;
                    }
                    Modifier modifierAlpha4 = AlphaKt.alpha(modifierOooO00o4, f2);
                    Alignment.Vertical centerVertically7 = companion8.getCenterVertically();
                    function5 = function4;
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    Arrangement arrangement4 = Arrangement.INSTANCE;
                    Function1<? super Long, Unit> function114 = function3;
                    MutableState<Function0<Unit>> mutableState11 = mutableState4;
                    MeasurePolicy measurePolicyOooO0O6 = androidx.compose.material.OooO0OO.OooO0O0(arrangement4, centerVertically7, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    mutableState5 = mutableState3;
                    ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                    constructor = companion9.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierAlpha4);
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
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion9, composerM1320constructorimpl, measurePolicyOooO0O6, composerM1320constructorimpl, currentCompositionLocalMap7);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf7, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                    Alignment.Vertical centerVertically8 = companion8.getCenterVertically();
                    float f8 = 12;
                    Modifier modifierWeight4 = rowScopeInstance4.weight(PaddingKt.m482paddingqDBjuR0$default(BackgroundKt.m171backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(36)), Color.m1680copywmQWz5c$default(ColorKt.Color(0), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m3775constructorimpl(f8), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false);
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO0O7 = androidx.compose.material.OooO0OO.OooO0O0(arrangement4, centerVertically8, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion9.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierWeight4);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion9, composerM1320constructorimpl2, measurePolicyOooO0O7, composerM1320constructorimpl2, currentCompositionLocalMap8);
                    if (composerM1320constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf8, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    f3 = 15;
                    ImageKt.Image(PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_camera_add_music, composerStartRestartGroup, 0), (String) null, androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
                    value = selectMusicModel.getValue();
                    if (value != null) {
                        str = "";
                    } else {
                        str = "";
                    }
                    long jM1718getWhite0d7_KjU4 = Color.INSTANCE.m1718getWhite0d7_KjU();
                    long sp4 = TextUnitKt.getSp(14);
                    Modifier modifierM532widthInVpY3zN4$default4 = androidx.compose.foundation.layout.SizeKt.m532widthInVpY3zN4$default(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, Dp.m3775constructorimpl(96), 1, null);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(direct2AddMusic) | composerStartRestartGroup.changed(selectMusicModel);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new o0OoOo0(direct2AddMusic, selectMusicModel);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new o0OoOo0(direct2AddMusic, selectMusicModel);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    p197o00o0OOo.o00O0O0.OooO00o(str, jM1718getWhite0d7_KjU4, sp4, o0O0O00.OooO0O0(modifierM532widthInVpY3zN4$default4, z, false, 0L, false, null, null, null, (Function0) objRememberedValue, 252), false, composerStartRestartGroup, 432, 16);
                    if (mutableState5 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-194151136);
                        Painter painterPainterResource7 = PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_camera_music_clip, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged3 = composerStartRestartGroup.changed(mutableState5) | composerStartRestartGroup.changed(function5);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue3 = new o00O0O(mutableState5, function5);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new o00O0O(mutableState5, function5);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function6 = function5;
                        ImageKt.Image(painterPainterResource7, (String) null, androidx.compose.foundation.layout.SizeKt.m530width3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(PaddingKt.m480paddingVpY3zN4$default(o0O0O00.OooO0O0(companion, z, false, 0L, false, null, null, null, (Function0) objRememberedValue3, 252), Dp.m3775constructorimpl(f), 0.0f, 2, null), 0.0f, 1, null), Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        composerStartRestartGroup.endReplaceableGroup();
                        obj = null;
                        composer2 = composerStartRestartGroup;
                        f4 = 0.0f;
                    } else {
                        function6 = function5;
                        f4 = 0.0f;
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceableGroup(-194150544);
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f), null, composer2, 6, 2);
                        composer2.endReplaceableGroup();
                        obj = null;
                    }
                    o000O.o0ooOOo.OooO00o(composer2);
                    Painter painterPainterResource8 = PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_remove_selected_music, composer2, 0);
                    Modifier modifierM171backgroundbw27NRU$default4 = BackgroundKt.m171backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(1), 0.0f, 0.0f, 0.0f, 14, null), f4, 1, obj), Color.m1680copywmQWz5c$default(ColorKt.Color(0), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    composer2.startReplaceableGroup(1157296644);
                    zChanged2 = composer2.changed(deleteMusic);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new o00Oo0(deleteMusic);
                        composer2.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new o00Oo0(deleteMusic);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    composer3 = composer2;
                    ImageKt.Image(painterPainterResource8, (String) null, androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(o0O0O00.OooO0O0(modifierM171backgroundbw27NRU$default4, z, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 252), Dp.m3775constructorimpl(f), 0.0f, Dp.m3775constructorimpl(f8), 0.0f, 10, null), Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                    if (androidx.compose.material.OooO0o.OooO00o(composer3)) {
                        ComposerKt.traceEventEnd();
                    }
                    function7 = function6;
                    mutableState6 = mutableState5;
                    function8 = function114;
                    mutableState7 = mutableState11;
                } else {
                    if (i5 != 0) {
                        mutableState3 = null;
                    } else {
                        mutableState3 = mutableState;
                    }
                    if (i7 != 0) {
                        mutableState4 = null;
                    } else {
                        mutableState4 = mutableState2;
                    }
                    if (i9 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if (i11 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(782343971, i3, -1, "com.yalla.yalla.module.media.camera.MusicSelectedComp (CameraCommonComp.kt:288)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-1444899166);
                    if (mutableState3 != null) {
                        value2 = selectMusicModel.getValue();
                        if (value2 != null) {
                            str2 = "";
                        } else {
                            str2 = "";
                        }
                        value3 = selectMusicModel.getValue();
                        if (value3 != null) {
                            durationMs = value3.getDurationMs();
                        } else {
                            durationMs = 0;
                        }
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged4 = composerStartRestartGroup.changed(function3);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged4) {
                            objRememberedValue4 = new OooOo00(function3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new OooOo00(function3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function1 function115 = (Function1) objRememberedValue4;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged5 = composerStartRestartGroup.changed(function3);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (zChanged5) {
                            objRememberedValue5 = new OooOo(function3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        } else {
                            objRememberedValue5 = new OooOo(function3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function1 function116 = (Function1) objRememberedValue5;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged6 = composerStartRestartGroup.changed(function4);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChanged6) {
                            objRememberedValue6 = new Oooo000(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new Oooo000(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function1 function117 = (Function1) objRememberedValue6;
                        Oooo0 oooo4 = Oooo0.f23845OooO0Oo;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged7 = composerStartRestartGroup.changed(selectMusicModel) | composerStartRestartGroup.changed(mutableState3);
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (zChanged7) {
                            objRememberedValue7 = new o000oOoO(selectMusicModel, mutableState3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        } else {
                            objRememberedValue7 = new o000oOoO(selectMusicModel, mutableState3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState4.setValue(o00O00o0.OooO00o(mutableState3, str2, durationMs, j, function115, function116, function117, oooo4, (Function1) objRememberedValue7, composerStartRestartGroup, ((i3 >> 18) & 14) | 100663296 | (i3 & 7168)));
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    companion = Modifier.INSTANCE;
                    Alignment.Companion companion10 = Alignment.INSTANCE;
                    f = 10;
                    Modifier modifierOooO00o5 = o00O0O0.OooO00o(f, androidx.compose.foundation.layout.SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(boxScope.align(companion, companion10.getTopCenter()), 0.0f, Dp.m3775constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3775constructorimpl(35)));
                    if (z) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.5f;
                    }
                    Modifier modifierAlpha5 = AlphaKt.alpha(modifierOooO00o5, f2);
                    Alignment.Vertical centerVertically9 = companion10.getCenterVertically();
                    function5 = function4;
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    Arrangement arrangement5 = Arrangement.INSTANCE;
                    Function1<? super Long, Unit> function118 = function3;
                    MutableState<Function0<Unit>> mutableState12 = mutableState4;
                    MeasurePolicy measurePolicyOooO0O8 = androidx.compose.material.OooO0OO.OooO0O0(arrangement5, centerVertically9, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    mutableState5 = mutableState3;
                    ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                    constructor = companion11.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierAlpha5);
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
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion11, composerM1320constructorimpl, measurePolicyOooO0O8, composerM1320constructorimpl, currentCompositionLocalMap9);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf9, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance5 = RowScopeInstance.INSTANCE;
                    Alignment.Vertical centerVertically10 = companion10.getCenterVertically();
                    float f9 = 12;
                    Modifier modifierWeight5 = rowScopeInstance5.weight(PaddingKt.m482paddingqDBjuR0$default(BackgroundKt.m171backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(36)), Color.m1680copywmQWz5c$default(ColorKt.Color(0), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m3775constructorimpl(f9), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false);
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO0O9 = androidx.compose.material.OooO0OO.OooO0O0(arrangement5, centerVertically10, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion11.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(modifierWeight5);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion11, composerM1320constructorimpl2, measurePolicyOooO0O9, composerM1320constructorimpl2, currentCompositionLocalMap10);
                    if (composerM1320constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf10, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    f3 = 15;
                    ImageKt.Image(PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_camera_add_music, composerStartRestartGroup, 0), (String) null, androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
                    value = selectMusicModel.getValue();
                    if (value != null) {
                        str = "";
                    } else {
                        str = "";
                    }
                    long jM1718getWhite0d7_KjU5 = Color.INSTANCE.m1718getWhite0d7_KjU();
                    long sp5 = TextUnitKt.getSp(14);
                    Modifier modifierM532widthInVpY3zN4$default5 = androidx.compose.foundation.layout.SizeKt.m532widthInVpY3zN4$default(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, Dp.m3775constructorimpl(96), 1, null);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(direct2AddMusic) | composerStartRestartGroup.changed(selectMusicModel);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new o0OoOo0(direct2AddMusic, selectMusicModel);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new o0OoOo0(direct2AddMusic, selectMusicModel);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    p197o00o0OOo.o00O0O0.OooO00o(str, jM1718getWhite0d7_KjU5, sp5, o0O0O00.OooO0O0(modifierM532widthInVpY3zN4$default5, z, false, 0L, false, null, null, null, (Function0) objRememberedValue, 252), false, composerStartRestartGroup, 432, 16);
                    if (mutableState5 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-194151136);
                        Painter painterPainterResource9 = PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_camera_music_clip, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged3 = composerStartRestartGroup.changed(mutableState5) | composerStartRestartGroup.changed(function5);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue3 = new o00O0O(mutableState5, function5);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new o00O0O(mutableState5, function5);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function6 = function5;
                        ImageKt.Image(painterPainterResource9, (String) null, androidx.compose.foundation.layout.SizeKt.m530width3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(PaddingKt.m480paddingVpY3zN4$default(o0O0O00.OooO0O0(companion, z, false, 0L, false, null, null, null, (Function0) objRememberedValue3, 252), Dp.m3775constructorimpl(f), 0.0f, 2, null), 0.0f, 1, null), Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        composerStartRestartGroup.endReplaceableGroup();
                        obj = null;
                        composer2 = composerStartRestartGroup;
                        f4 = 0.0f;
                    } else {
                        function6 = function5;
                        f4 = 0.0f;
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceableGroup(-194150544);
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f), null, composer2, 6, 2);
                        composer2.endReplaceableGroup();
                        obj = null;
                    }
                    o000O.o0ooOOo.OooO00o(composer2);
                    Painter painterPainterResource10 = PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_remove_selected_music, composer2, 0);
                    Modifier modifierM171backgroundbw27NRU$default5 = BackgroundKt.m171backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(1), 0.0f, 0.0f, 0.0f, 14, null), f4, 1, obj), Color.m1680copywmQWz5c$default(ColorKt.Color(0), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    composer2.startReplaceableGroup(1157296644);
                    zChanged2 = composer2.changed(deleteMusic);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new o00Oo0(deleteMusic);
                        composer2.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new o00Oo0(deleteMusic);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    composer3 = composer2;
                    ImageKt.Image(painterPainterResource10, (String) null, androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(o0O0O00.OooO0O0(modifierM171backgroundbw27NRU$default5, z, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 252), Dp.m3775constructorimpl(f), 0.0f, Dp.m3775constructorimpl(f9), 0.0f, 10, null), Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                    if (androidx.compose.material.OooO0o.OooO00o(composer3)) {
                        ComposerKt.traceEventEnd();
                    }
                    function7 = function6;
                    mutableState6 = mutableState5;
                    function8 = function118;
                    mutableState7 = mutableState12;
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new o00Ooo(boxScope, selectMusicModel, z, j, deleteMusic, direct2AddMusic, mutableState6, mutableState7, function8, function7, i, i2));
            }
            i3 |= 12582912;
            i9 = i2 & 128;
            if (i9 != 0) {
                i3 |= 100663296;
            } else if ((i & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i3 |= i10;
            }
            i11 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i11 != 0) {
                i3 |= 805306368;
            } else if ((i & 1879048192) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i12 = 536870912;
                } else {
                    i12 = SQLiteDatabase.CREATE_IF_NECESSARY;
                }
                i3 |= i12;
            }
            if ((i3 & 1533916891) == 306783378) {
                if (i5 != 0) {
                    mutableState3 = null;
                } else {
                    mutableState3 = mutableState;
                }
                if (i7 != 0) {
                    mutableState4 = null;
                } else {
                    mutableState4 = mutableState2;
                }
                if (i9 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                if (i11 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(782343971, i3, -1, "com.yalla.yalla.module.media.camera.MusicSelectedComp (CameraCommonComp.kt:288)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1444899166);
                if (mutableState3 != null) {
                    value2 = selectMusicModel.getValue();
                    if (value2 != null) {
                        str2 = "";
                    } else {
                        str2 = "";
                    }
                    value3 = selectMusicModel.getValue();
                    if (value3 != null) {
                        durationMs = value3.getDurationMs();
                    } else {
                        durationMs = 0;
                    }
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged4 = composerStartRestartGroup.changed(function3);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged4) {
                        objRememberedValue4 = new OooOo00(function3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooOo00(function3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function1 function119 = (Function1) objRememberedValue4;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged5 = composerStartRestartGroup.changed(function3);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged5) {
                        objRememberedValue5 = new OooOo(function3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new OooOo(function3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function1 function1110 = (Function1) objRememberedValue5;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged6 = composerStartRestartGroup.changed(function4);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged6) {
                        objRememberedValue6 = new Oooo000(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new Oooo000(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function1 function1111 = (Function1) objRememberedValue6;
                    Oooo0 oooo5 = Oooo0.f23845OooO0Oo;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged7 = composerStartRestartGroup.changed(selectMusicModel) | composerStartRestartGroup.changed(mutableState3);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (zChanged7) {
                        objRememberedValue7 = new o000oOoO(selectMusicModel, mutableState3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    } else {
                        objRememberedValue7 = new o000oOoO(selectMusicModel, mutableState3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState4.setValue(o00O00o0.OooO00o(mutableState3, str2, durationMs, j, function119, function1110, function1111, oooo5, (Function1) objRememberedValue7, composerStartRestartGroup, ((i3 >> 18) & 14) | 100663296 | (i3 & 7168)));
                }
                composerStartRestartGroup.endReplaceableGroup();
                companion = Modifier.INSTANCE;
                Alignment.Companion companion12 = Alignment.INSTANCE;
                f = 10;
                Modifier modifierOooO00o6 = o00O0O0.OooO00o(f, androidx.compose.foundation.layout.SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(boxScope.align(companion, companion12.getTopCenter()), 0.0f, Dp.m3775constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3775constructorimpl(35)));
                if (z) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.5f;
                }
                Modifier modifierAlpha6 = AlphaKt.alpha(modifierOooO00o6, f2);
                Alignment.Vertical centerVertically11 = companion12.getCenterVertically();
                function5 = function4;
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Arrangement arrangement6 = Arrangement.INSTANCE;
                Function1<? super Long, Unit> function1112 = function3;
                MutableState<Function0<Unit>> mutableState13 = mutableState4;
                MeasurePolicy measurePolicyOooO0O10 = androidx.compose.material.OooO0OO.OooO0O0(arrangement6, centerVertically11, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap11 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                mutableState5 = mutableState3;
                ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                constructor = companion13.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11 = LayoutKt.modifierMaterializerOf(modifierAlpha6);
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
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion13, composerM1320constructorimpl, measurePolicyOooO0O10, composerM1320constructorimpl, currentCompositionLocalMap11);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance6 = RowScopeInstance.INSTANCE;
                Alignment.Vertical centerVertically12 = companion12.getCenterVertically();
                float f10 = 12;
                Modifier modifierWeight6 = rowScopeInstance6.weight(PaddingKt.m482paddingqDBjuR0$default(BackgroundKt.m171backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(36)), Color.m1680copywmQWz5c$default(ColorKt.Color(0), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m3775constructorimpl(f10), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO0O11 = androidx.compose.material.OooO0OO.OooO0O0(arrangement6, centerVertically12, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap12 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion13.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf12 = LayoutKt.modifierMaterializerOf(modifierWeight6);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion13, composerM1320constructorimpl2, measurePolicyOooO0O11, composerM1320constructorimpl2, currentCompositionLocalMap12);
                if (composerM1320constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf12, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                f3 = 15;
                ImageKt.Image(PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_camera_add_music, composerStartRestartGroup, 0), (String) null, androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
                value = selectMusicModel.getValue();
                if (value != null) {
                    str = "";
                } else {
                    str = "";
                }
                long jM1718getWhite0d7_KjU6 = Color.INSTANCE.m1718getWhite0d7_KjU();
                long sp6 = TextUnitKt.getSp(14);
                Modifier modifierM532widthInVpY3zN4$default6 = androidx.compose.foundation.layout.SizeKt.m532widthInVpY3zN4$default(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, Dp.m3775constructorimpl(96), 1, null);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(direct2AddMusic) | composerStartRestartGroup.changed(selectMusicModel);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new o0OoOo0(direct2AddMusic, selectMusicModel);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new o0OoOo0(direct2AddMusic, selectMusicModel);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                p197o00o0OOo.o00O0O0.OooO00o(str, jM1718getWhite0d7_KjU6, sp6, o0O0O00.OooO0O0(modifierM532widthInVpY3zN4$default6, z, false, 0L, false, null, null, null, (Function0) objRememberedValue, 252), false, composerStartRestartGroup, 432, 16);
                if (mutableState5 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-194151136);
                    Painter painterPainterResource11 = PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_camera_music_clip, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged3 = composerStartRestartGroup.changed(mutableState5) | composerStartRestartGroup.changed(function5);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue3 = new o00O0O(mutableState5, function5);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new o00O0O(mutableState5, function5);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    function6 = function5;
                    ImageKt.Image(painterPainterResource11, (String) null, androidx.compose.foundation.layout.SizeKt.m530width3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(PaddingKt.m480paddingVpY3zN4$default(o0O0O00.OooO0O0(companion, z, false, 0L, false, null, null, null, (Function0) objRememberedValue3, 252), Dp.m3775constructorimpl(f), 0.0f, 2, null), 0.0f, 1, null), Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    composerStartRestartGroup.endReplaceableGroup();
                    obj = null;
                    composer2 = composerStartRestartGroup;
                    f4 = 0.0f;
                } else {
                    function6 = function5;
                    f4 = 0.0f;
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(-194150544);
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f), null, composer2, 6, 2);
                    composer2.endReplaceableGroup();
                    obj = null;
                }
                o000O.o0ooOOo.OooO00o(composer2);
                Painter painterPainterResource12 = PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_remove_selected_music, composer2, 0);
                Modifier modifierM171backgroundbw27NRU$default6 = BackgroundKt.m171backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(1), 0.0f, 0.0f, 0.0f, 14, null), f4, 1, obj), Color.m1680copywmQWz5c$default(ColorKt.Color(0), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                composer2.startReplaceableGroup(1157296644);
                zChanged2 = composer2.changed(deleteMusic);
                objRememberedValue2 = composer2.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new o00Oo0(deleteMusic);
                    composer2.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new o00Oo0(deleteMusic);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                composer3 = composer2;
                ImageKt.Image(painterPainterResource12, (String) null, androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(o0O0O00.OooO0O0(modifierM171backgroundbw27NRU$default6, z, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 252), Dp.m3775constructorimpl(f), 0.0f, Dp.m3775constructorimpl(f10), 0.0f, 10, null), Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                if (androidx.compose.material.OooO0o.OooO00o(composer3)) {
                    ComposerKt.traceEventEnd();
                }
                function7 = function6;
                mutableState6 = mutableState5;
                function8 = function1112;
                mutableState7 = mutableState13;
            } else {
                if (i5 != 0) {
                    mutableState3 = null;
                } else {
                    mutableState3 = mutableState;
                }
                if (i7 != 0) {
                    mutableState4 = null;
                } else {
                    mutableState4 = mutableState2;
                }
                if (i9 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                if (i11 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(782343971, i3, -1, "com.yalla.yalla.module.media.camera.MusicSelectedComp (CameraCommonComp.kt:288)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1444899166);
                if (mutableState3 != null) {
                    value2 = selectMusicModel.getValue();
                    if (value2 != null) {
                        str2 = "";
                    } else {
                        str2 = "";
                    }
                    value3 = selectMusicModel.getValue();
                    if (value3 != null) {
                        durationMs = value3.getDurationMs();
                    } else {
                        durationMs = 0;
                    }
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged4 = composerStartRestartGroup.changed(function3);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged4) {
                        objRememberedValue4 = new OooOo00(function3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooOo00(function3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function1 function1113 = (Function1) objRememberedValue4;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged5 = composerStartRestartGroup.changed(function3);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged5) {
                        objRememberedValue5 = new OooOo(function3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new OooOo(function3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function1 function1114 = (Function1) objRememberedValue5;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged6 = composerStartRestartGroup.changed(function4);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged6) {
                        objRememberedValue6 = new Oooo000(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new Oooo000(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function1 function1115 = (Function1) objRememberedValue6;
                    Oooo0 oooo6 = Oooo0.f23845OooO0Oo;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged7 = composerStartRestartGroup.changed(selectMusicModel) | composerStartRestartGroup.changed(mutableState3);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (zChanged7) {
                        objRememberedValue7 = new o000oOoO(selectMusicModel, mutableState3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    } else {
                        objRememberedValue7 = new o000oOoO(selectMusicModel, mutableState3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState4.setValue(o00O00o0.OooO00o(mutableState3, str2, durationMs, j, function1113, function1114, function1115, oooo6, (Function1) objRememberedValue7, composerStartRestartGroup, ((i3 >> 18) & 14) | 100663296 | (i3 & 7168)));
                }
                composerStartRestartGroup.endReplaceableGroup();
                companion = Modifier.INSTANCE;
                Alignment.Companion companion14 = Alignment.INSTANCE;
                f = 10;
                Modifier modifierOooO00o7 = o00O0O0.OooO00o(f, androidx.compose.foundation.layout.SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(boxScope.align(companion, companion14.getTopCenter()), 0.0f, Dp.m3775constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3775constructorimpl(35)));
                if (z) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.5f;
                }
                Modifier modifierAlpha7 = AlphaKt.alpha(modifierOooO00o7, f2);
                Alignment.Vertical centerVertically13 = companion14.getCenterVertically();
                function5 = function4;
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Arrangement arrangement7 = Arrangement.INSTANCE;
                Function1<? super Long, Unit> function1116 = function3;
                MutableState<Function0<Unit>> mutableState14 = mutableState4;
                MeasurePolicy measurePolicyOooO0O12 = androidx.compose.material.OooO0OO.OooO0O0(arrangement7, centerVertically13, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap13 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                mutableState5 = mutableState3;
                ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                constructor = companion15.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf13 = LayoutKt.modifierMaterializerOf(modifierAlpha7);
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
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion15, composerM1320constructorimpl, measurePolicyOooO0O12, composerM1320constructorimpl, currentCompositionLocalMap13);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf13, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance7 = RowScopeInstance.INSTANCE;
                Alignment.Vertical centerVertically14 = companion14.getCenterVertically();
                float f11 = 12;
                Modifier modifierWeight7 = rowScopeInstance7.weight(PaddingKt.m482paddingqDBjuR0$default(BackgroundKt.m171backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(36)), Color.m1680copywmQWz5c$default(ColorKt.Color(0), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m3775constructorimpl(f11), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO0O13 = androidx.compose.material.OooO0OO.OooO0O0(arrangement7, centerVertically14, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap14 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion15.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf14 = LayoutKt.modifierMaterializerOf(modifierWeight7);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion15, composerM1320constructorimpl2, measurePolicyOooO0O13, composerM1320constructorimpl2, currentCompositionLocalMap14);
                if (composerM1320constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf14, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                f3 = 15;
                ImageKt.Image(PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_camera_add_music, composerStartRestartGroup, 0), (String) null, androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
                value = selectMusicModel.getValue();
                if (value != null) {
                    str = "";
                } else {
                    str = "";
                }
                long jM1718getWhite0d7_KjU7 = Color.INSTANCE.m1718getWhite0d7_KjU();
                long sp7 = TextUnitKt.getSp(14);
                Modifier modifierM532widthInVpY3zN4$default7 = androidx.compose.foundation.layout.SizeKt.m532widthInVpY3zN4$default(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, Dp.m3775constructorimpl(96), 1, null);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(direct2AddMusic) | composerStartRestartGroup.changed(selectMusicModel);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new o0OoOo0(direct2AddMusic, selectMusicModel);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new o0OoOo0(direct2AddMusic, selectMusicModel);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                p197o00o0OOo.o00O0O0.OooO00o(str, jM1718getWhite0d7_KjU7, sp7, o0O0O00.OooO0O0(modifierM532widthInVpY3zN4$default7, z, false, 0L, false, null, null, null, (Function0) objRememberedValue, 252), false, composerStartRestartGroup, 432, 16);
                if (mutableState5 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-194151136);
                    Painter painterPainterResource13 = PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_camera_music_clip, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged3 = composerStartRestartGroup.changed(mutableState5) | composerStartRestartGroup.changed(function5);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue3 = new o00O0O(mutableState5, function5);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new o00O0O(mutableState5, function5);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    function6 = function5;
                    ImageKt.Image(painterPainterResource13, (String) null, androidx.compose.foundation.layout.SizeKt.m530width3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(PaddingKt.m480paddingVpY3zN4$default(o0O0O00.OooO0O0(companion, z, false, 0L, false, null, null, null, (Function0) objRememberedValue3, 252), Dp.m3775constructorimpl(f), 0.0f, 2, null), 0.0f, 1, null), Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    composerStartRestartGroup.endReplaceableGroup();
                    obj = null;
                    composer2 = composerStartRestartGroup;
                    f4 = 0.0f;
                } else {
                    function6 = function5;
                    f4 = 0.0f;
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(-194150544);
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f), null, composer2, 6, 2);
                    composer2.endReplaceableGroup();
                    obj = null;
                }
                o000O.o0ooOOo.OooO00o(composer2);
                Painter painterPainterResource14 = PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_remove_selected_music, composer2, 0);
                Modifier modifierM171backgroundbw27NRU$default7 = BackgroundKt.m171backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(1), 0.0f, 0.0f, 0.0f, 14, null), f4, 1, obj), Color.m1680copywmQWz5c$default(ColorKt.Color(0), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                composer2.startReplaceableGroup(1157296644);
                zChanged2 = composer2.changed(deleteMusic);
                objRememberedValue2 = composer2.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new o00Oo0(deleteMusic);
                    composer2.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new o00Oo0(deleteMusic);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                composer3 = composer2;
                ImageKt.Image(painterPainterResource14, (String) null, androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(o0O0O00.OooO0O0(modifierM171backgroundbw27NRU$default7, z, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 252), Dp.m3775constructorimpl(f), 0.0f, Dp.m3775constructorimpl(f11), 0.0f, 10, null), Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                if (androidx.compose.material.OooO0o.OooO00o(composer3)) {
                    ComposerKt.traceEventEnd();
                }
                function7 = function6;
                mutableState6 = mutableState5;
                function8 = function1116;
                mutableState7 = mutableState14;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o00Ooo(boxScope, selectMusicModel, z, j, deleteMusic, direct2AddMusic, mutableState6, mutableState7, function8, function7, i, i2));
        }
        i4 = 196608;
        i3 |= i4;
        i5 = i2 & 32;
        if (i5 != 0) {
            if ((3670016 & i) == 0) {
                if (composerStartRestartGroup.changed(mutableState)) {
                    i6 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i6 = 524288;
                }
                i3 |= i6;
            }
            i7 = i2 & 64;
            if (i7 != 0) {
                if ((29360128 & i) == 0) {
                    if (composerStartRestartGroup.changed(mutableState2)) {
                        i8 = 8388608;
                    } else {
                        i8 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i8;
                }
                i9 = i2 & 128;
                if (i9 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                    i3 |= i10;
                }
                i11 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i11 != 0) {
                    i3 |= 805306368;
                } else if ((i & 1879048192) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i12 = 536870912;
                    } else {
                        i12 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                    i3 |= i12;
                }
                if ((i3 & 1533916891) == 306783378) {
                    if (i5 != 0) {
                        mutableState3 = null;
                    } else {
                        mutableState3 = mutableState;
                    }
                    if (i7 != 0) {
                        mutableState4 = null;
                    } else {
                        mutableState4 = mutableState2;
                    }
                    if (i9 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if (i11 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(782343971, i3, -1, "com.yalla.yalla.module.media.camera.MusicSelectedComp (CameraCommonComp.kt:288)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-1444899166);
                    if (mutableState3 != null) {
                        value2 = selectMusicModel.getValue();
                        if (value2 != null) {
                            str2 = "";
                        } else {
                            str2 = "";
                        }
                        value3 = selectMusicModel.getValue();
                        if (value3 != null) {
                            durationMs = value3.getDurationMs();
                        } else {
                            durationMs = 0;
                        }
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged4 = composerStartRestartGroup.changed(function3);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged4) {
                            objRememberedValue4 = new OooOo00(function3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new OooOo00(function3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function1 function1117 = (Function1) objRememberedValue4;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged5 = composerStartRestartGroup.changed(function3);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (zChanged5) {
                            objRememberedValue5 = new OooOo(function3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        } else {
                            objRememberedValue5 = new OooOo(function3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function1 function1118 = (Function1) objRememberedValue5;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged6 = composerStartRestartGroup.changed(function4);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChanged6) {
                            objRememberedValue6 = new Oooo000(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new Oooo000(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function1 function1119 = (Function1) objRememberedValue6;
                        Oooo0 oooo7 = Oooo0.f23845OooO0Oo;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged7 = composerStartRestartGroup.changed(selectMusicModel) | composerStartRestartGroup.changed(mutableState3);
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (zChanged7) {
                            objRememberedValue7 = new o000oOoO(selectMusicModel, mutableState3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        } else {
                            objRememberedValue7 = new o000oOoO(selectMusicModel, mutableState3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState4.setValue(o00O00o0.OooO00o(mutableState3, str2, durationMs, j, function1117, function1118, function1119, oooo7, (Function1) objRememberedValue7, composerStartRestartGroup, ((i3 >> 18) & 14) | 100663296 | (i3 & 7168)));
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    companion = Modifier.INSTANCE;
                    Alignment.Companion companion16 = Alignment.INSTANCE;
                    f = 10;
                    Modifier modifierOooO00o8 = o00O0O0.OooO00o(f, androidx.compose.foundation.layout.SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(boxScope.align(companion, companion16.getTopCenter()), 0.0f, Dp.m3775constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3775constructorimpl(35)));
                    if (z) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.5f;
                    }
                    Modifier modifierAlpha8 = AlphaKt.alpha(modifierOooO00o8, f2);
                    Alignment.Vertical centerVertically15 = companion16.getCenterVertically();
                    function5 = function4;
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    Arrangement arrangement8 = Arrangement.INSTANCE;
                    Function1<? super Long, Unit> function11110 = function3;
                    MutableState<Function0<Unit>> mutableState15 = mutableState4;
                    MeasurePolicy measurePolicyOooO0O14 = androidx.compose.material.OooO0OO.OooO0O0(arrangement8, centerVertically15, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap15 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    mutableState5 = mutableState3;
                    ComposeUiNode.Companion companion17 = ComposeUiNode.INSTANCE;
                    constructor = companion17.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf15 = LayoutKt.modifierMaterializerOf(modifierAlpha8);
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
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion17, composerM1320constructorimpl, measurePolicyOooO0O14, composerM1320constructorimpl, currentCompositionLocalMap15);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf15, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance8 = RowScopeInstance.INSTANCE;
                    Alignment.Vertical centerVertically16 = companion16.getCenterVertically();
                    float f12 = 12;
                    Modifier modifierWeight8 = rowScopeInstance8.weight(PaddingKt.m482paddingqDBjuR0$default(BackgroundKt.m171backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(36)), Color.m1680copywmQWz5c$default(ColorKt.Color(0), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m3775constructorimpl(f12), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false);
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO0O15 = androidx.compose.material.OooO0OO.OooO0O0(arrangement8, centerVertically16, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap16 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion17.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf16 = LayoutKt.modifierMaterializerOf(modifierWeight8);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion17, composerM1320constructorimpl2, measurePolicyOooO0O15, composerM1320constructorimpl2, currentCompositionLocalMap16);
                    if (composerM1320constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf16, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    f3 = 15;
                    ImageKt.Image(PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_camera_add_music, composerStartRestartGroup, 0), (String) null, androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
                    value = selectMusicModel.getValue();
                    if (value != null) {
                        str = "";
                    } else {
                        str = "";
                    }
                    long jM1718getWhite0d7_KjU8 = Color.INSTANCE.m1718getWhite0d7_KjU();
                    long sp8 = TextUnitKt.getSp(14);
                    Modifier modifierM532widthInVpY3zN4$default8 = androidx.compose.foundation.layout.SizeKt.m532widthInVpY3zN4$default(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, Dp.m3775constructorimpl(96), 1, null);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(direct2AddMusic) | composerStartRestartGroup.changed(selectMusicModel);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new o0OoOo0(direct2AddMusic, selectMusicModel);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new o0OoOo0(direct2AddMusic, selectMusicModel);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    p197o00o0OOo.o00O0O0.OooO00o(str, jM1718getWhite0d7_KjU8, sp8, o0O0O00.OooO0O0(modifierM532widthInVpY3zN4$default8, z, false, 0L, false, null, null, null, (Function0) objRememberedValue, 252), false, composerStartRestartGroup, 432, 16);
                    if (mutableState5 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-194151136);
                        Painter painterPainterResource15 = PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_camera_music_clip, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged3 = composerStartRestartGroup.changed(mutableState5) | composerStartRestartGroup.changed(function5);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue3 = new o00O0O(mutableState5, function5);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new o00O0O(mutableState5, function5);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function6 = function5;
                        ImageKt.Image(painterPainterResource15, (String) null, androidx.compose.foundation.layout.SizeKt.m530width3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(PaddingKt.m480paddingVpY3zN4$default(o0O0O00.OooO0O0(companion, z, false, 0L, false, null, null, null, (Function0) objRememberedValue3, 252), Dp.m3775constructorimpl(f), 0.0f, 2, null), 0.0f, 1, null), Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        composerStartRestartGroup.endReplaceableGroup();
                        obj = null;
                        composer2 = composerStartRestartGroup;
                        f4 = 0.0f;
                    } else {
                        function6 = function5;
                        f4 = 0.0f;
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceableGroup(-194150544);
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f), null, composer2, 6, 2);
                        composer2.endReplaceableGroup();
                        obj = null;
                    }
                    o000O.o0ooOOo.OooO00o(composer2);
                    Painter painterPainterResource16 = PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_remove_selected_music, composer2, 0);
                    Modifier modifierM171backgroundbw27NRU$default8 = BackgroundKt.m171backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(1), 0.0f, 0.0f, 0.0f, 14, null), f4, 1, obj), Color.m1680copywmQWz5c$default(ColorKt.Color(0), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    composer2.startReplaceableGroup(1157296644);
                    zChanged2 = composer2.changed(deleteMusic);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new o00Oo0(deleteMusic);
                        composer2.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new o00Oo0(deleteMusic);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    composer3 = composer2;
                    ImageKt.Image(painterPainterResource16, (String) null, androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(o0O0O00.OooO0O0(modifierM171backgroundbw27NRU$default8, z, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 252), Dp.m3775constructorimpl(f), 0.0f, Dp.m3775constructorimpl(f12), 0.0f, 10, null), Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                    if (androidx.compose.material.OooO0o.OooO00o(composer3)) {
                        ComposerKt.traceEventEnd();
                    }
                    function7 = function6;
                    mutableState6 = mutableState5;
                    function8 = function11110;
                    mutableState7 = mutableState15;
                } else {
                    if (i5 != 0) {
                        mutableState3 = null;
                    } else {
                        mutableState3 = mutableState;
                    }
                    if (i7 != 0) {
                        mutableState4 = null;
                    } else {
                        mutableState4 = mutableState2;
                    }
                    if (i9 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if (i11 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(782343971, i3, -1, "com.yalla.yalla.module.media.camera.MusicSelectedComp (CameraCommonComp.kt:288)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-1444899166);
                    if (mutableState3 != null) {
                        value2 = selectMusicModel.getValue();
                        if (value2 != null) {
                            str2 = "";
                        } else {
                            str2 = "";
                        }
                        value3 = selectMusicModel.getValue();
                        if (value3 != null) {
                            durationMs = value3.getDurationMs();
                        } else {
                            durationMs = 0;
                        }
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged4 = composerStartRestartGroup.changed(function3);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged4) {
                            objRememberedValue4 = new OooOo00(function3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new OooOo00(function3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function1 function11111 = (Function1) objRememberedValue4;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged5 = composerStartRestartGroup.changed(function3);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (zChanged5) {
                            objRememberedValue5 = new OooOo(function3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        } else {
                            objRememberedValue5 = new OooOo(function3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function1 function11112 = (Function1) objRememberedValue5;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged6 = composerStartRestartGroup.changed(function4);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChanged6) {
                            objRememberedValue6 = new Oooo000(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new Oooo000(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function1 function11113 = (Function1) objRememberedValue6;
                        Oooo0 oooo8 = Oooo0.f23845OooO0Oo;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged7 = composerStartRestartGroup.changed(selectMusicModel) | composerStartRestartGroup.changed(mutableState3);
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (zChanged7) {
                            objRememberedValue7 = new o000oOoO(selectMusicModel, mutableState3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        } else {
                            objRememberedValue7 = new o000oOoO(selectMusicModel, mutableState3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState4.setValue(o00O00o0.OooO00o(mutableState3, str2, durationMs, j, function11111, function11112, function11113, oooo8, (Function1) objRememberedValue7, composerStartRestartGroup, ((i3 >> 18) & 14) | 100663296 | (i3 & 7168)));
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    companion = Modifier.INSTANCE;
                    Alignment.Companion companion18 = Alignment.INSTANCE;
                    f = 10;
                    Modifier modifierOooO00o9 = o00O0O0.OooO00o(f, androidx.compose.foundation.layout.SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(boxScope.align(companion, companion18.getTopCenter()), 0.0f, Dp.m3775constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3775constructorimpl(35)));
                    if (z) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.5f;
                    }
                    Modifier modifierAlpha9 = AlphaKt.alpha(modifierOooO00o9, f2);
                    Alignment.Vertical centerVertically17 = companion18.getCenterVertically();
                    function5 = function4;
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    Arrangement arrangement9 = Arrangement.INSTANCE;
                    Function1<? super Long, Unit> function11114 = function3;
                    MutableState<Function0<Unit>> mutableState16 = mutableState4;
                    MeasurePolicy measurePolicyOooO0O16 = androidx.compose.material.OooO0OO.OooO0O0(arrangement9, centerVertically17, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap17 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    mutableState5 = mutableState3;
                    ComposeUiNode.Companion companion19 = ComposeUiNode.INSTANCE;
                    constructor = companion19.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf17 = LayoutKt.modifierMaterializerOf(modifierAlpha9);
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
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion19, composerM1320constructorimpl, measurePolicyOooO0O16, composerM1320constructorimpl, currentCompositionLocalMap17);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf17, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance9 = RowScopeInstance.INSTANCE;
                    Alignment.Vertical centerVertically18 = companion18.getCenterVertically();
                    float f13 = 12;
                    Modifier modifierWeight9 = rowScopeInstance9.weight(PaddingKt.m482paddingqDBjuR0$default(BackgroundKt.m171backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(36)), Color.m1680copywmQWz5c$default(ColorKt.Color(0), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m3775constructorimpl(f13), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false);
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO0O17 = androidx.compose.material.OooO0OO.OooO0O0(arrangement9, centerVertically18, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap18 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion19.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf18 = LayoutKt.modifierMaterializerOf(modifierWeight9);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion19, composerM1320constructorimpl2, measurePolicyOooO0O17, composerM1320constructorimpl2, currentCompositionLocalMap18);
                    if (composerM1320constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf18, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    f3 = 15;
                    ImageKt.Image(PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_camera_add_music, composerStartRestartGroup, 0), (String) null, androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
                    value = selectMusicModel.getValue();
                    if (value != null) {
                        str = "";
                    } else {
                        str = "";
                    }
                    long jM1718getWhite0d7_KjU9 = Color.INSTANCE.m1718getWhite0d7_KjU();
                    long sp9 = TextUnitKt.getSp(14);
                    Modifier modifierM532widthInVpY3zN4$default9 = androidx.compose.foundation.layout.SizeKt.m532widthInVpY3zN4$default(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, Dp.m3775constructorimpl(96), 1, null);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(direct2AddMusic) | composerStartRestartGroup.changed(selectMusicModel);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new o0OoOo0(direct2AddMusic, selectMusicModel);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new o0OoOo0(direct2AddMusic, selectMusicModel);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    p197o00o0OOo.o00O0O0.OooO00o(str, jM1718getWhite0d7_KjU9, sp9, o0O0O00.OooO0O0(modifierM532widthInVpY3zN4$default9, z, false, 0L, false, null, null, null, (Function0) objRememberedValue, 252), false, composerStartRestartGroup, 432, 16);
                    if (mutableState5 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-194151136);
                        Painter painterPainterResource17 = PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_camera_music_clip, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged3 = composerStartRestartGroup.changed(mutableState5) | composerStartRestartGroup.changed(function5);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue3 = new o00O0O(mutableState5, function5);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new o00O0O(mutableState5, function5);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function6 = function5;
                        ImageKt.Image(painterPainterResource17, (String) null, androidx.compose.foundation.layout.SizeKt.m530width3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(PaddingKt.m480paddingVpY3zN4$default(o0O0O00.OooO0O0(companion, z, false, 0L, false, null, null, null, (Function0) objRememberedValue3, 252), Dp.m3775constructorimpl(f), 0.0f, 2, null), 0.0f, 1, null), Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        composerStartRestartGroup.endReplaceableGroup();
                        obj = null;
                        composer2 = composerStartRestartGroup;
                        f4 = 0.0f;
                    } else {
                        function6 = function5;
                        f4 = 0.0f;
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceableGroup(-194150544);
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f), null, composer2, 6, 2);
                        composer2.endReplaceableGroup();
                        obj = null;
                    }
                    o000O.o0ooOOo.OooO00o(composer2);
                    Painter painterPainterResource18 = PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_remove_selected_music, composer2, 0);
                    Modifier modifierM171backgroundbw27NRU$default9 = BackgroundKt.m171backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(1), 0.0f, 0.0f, 0.0f, 14, null), f4, 1, obj), Color.m1680copywmQWz5c$default(ColorKt.Color(0), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    composer2.startReplaceableGroup(1157296644);
                    zChanged2 = composer2.changed(deleteMusic);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new o00Oo0(deleteMusic);
                        composer2.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new o00Oo0(deleteMusic);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    composer3 = composer2;
                    ImageKt.Image(painterPainterResource18, (String) null, androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(o0O0O00.OooO0O0(modifierM171backgroundbw27NRU$default9, z, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 252), Dp.m3775constructorimpl(f), 0.0f, Dp.m3775constructorimpl(f13), 0.0f, 10, null), Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                    if (androidx.compose.material.OooO0o.OooO00o(composer3)) {
                        ComposerKt.traceEventEnd();
                    }
                    function7 = function6;
                    mutableState6 = mutableState5;
                    function8 = function11114;
                    mutableState7 = mutableState16;
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new o00Ooo(boxScope, selectMusicModel, z, j, deleteMusic, direct2AddMusic, mutableState6, mutableState7, function8, function7, i, i2));
            }
            i3 |= 12582912;
            i9 = i2 & 128;
            if (i9 != 0) {
                i3 |= 100663296;
            } else if ((i & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i3 |= i10;
            }
            i11 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i11 != 0) {
                i3 |= 805306368;
            } else if ((i & 1879048192) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i12 = 536870912;
                } else {
                    i12 = SQLiteDatabase.CREATE_IF_NECESSARY;
                }
                i3 |= i12;
            }
            if ((i3 & 1533916891) == 306783378) {
                if (i5 != 0) {
                    mutableState3 = null;
                } else {
                    mutableState3 = mutableState;
                }
                if (i7 != 0) {
                    mutableState4 = null;
                } else {
                    mutableState4 = mutableState2;
                }
                if (i9 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                if (i11 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(782343971, i3, -1, "com.yalla.yalla.module.media.camera.MusicSelectedComp (CameraCommonComp.kt:288)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1444899166);
                if (mutableState3 != null) {
                    value2 = selectMusicModel.getValue();
                    if (value2 != null) {
                        str2 = "";
                    } else {
                        str2 = "";
                    }
                    value3 = selectMusicModel.getValue();
                    if (value3 != null) {
                        durationMs = value3.getDurationMs();
                    } else {
                        durationMs = 0;
                    }
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged4 = composerStartRestartGroup.changed(function3);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged4) {
                        objRememberedValue4 = new OooOo00(function3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooOo00(function3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function1 function11115 = (Function1) objRememberedValue4;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged5 = composerStartRestartGroup.changed(function3);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged5) {
                        objRememberedValue5 = new OooOo(function3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new OooOo(function3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function1 function11116 = (Function1) objRememberedValue5;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged6 = composerStartRestartGroup.changed(function4);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged6) {
                        objRememberedValue6 = new Oooo000(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new Oooo000(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function1 function11117 = (Function1) objRememberedValue6;
                    Oooo0 oooo9 = Oooo0.f23845OooO0Oo;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged7 = composerStartRestartGroup.changed(selectMusicModel) | composerStartRestartGroup.changed(mutableState3);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (zChanged7) {
                        objRememberedValue7 = new o000oOoO(selectMusicModel, mutableState3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    } else {
                        objRememberedValue7 = new o000oOoO(selectMusicModel, mutableState3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState4.setValue(o00O00o0.OooO00o(mutableState3, str2, durationMs, j, function11115, function11116, function11117, oooo9, (Function1) objRememberedValue7, composerStartRestartGroup, ((i3 >> 18) & 14) | 100663296 | (i3 & 7168)));
                }
                composerStartRestartGroup.endReplaceableGroup();
                companion = Modifier.INSTANCE;
                Alignment.Companion companion110 = Alignment.INSTANCE;
                f = 10;
                Modifier modifierOooO00o10 = o00O0O0.OooO00o(f, androidx.compose.foundation.layout.SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(boxScope.align(companion, companion110.getTopCenter()), 0.0f, Dp.m3775constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3775constructorimpl(35)));
                if (z) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.5f;
                }
                Modifier modifierAlpha10 = AlphaKt.alpha(modifierOooO00o10, f2);
                Alignment.Vertical centerVertically19 = companion110.getCenterVertically();
                function5 = function4;
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Arrangement arrangement10 = Arrangement.INSTANCE;
                Function1<? super Long, Unit> function11118 = function3;
                MutableState<Function0<Unit>> mutableState17 = mutableState4;
                MeasurePolicy measurePolicyOooO0O18 = androidx.compose.material.OooO0OO.OooO0O0(arrangement10, centerVertically19, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap19 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                mutableState5 = mutableState3;
                ComposeUiNode.Companion companion111 = ComposeUiNode.INSTANCE;
                constructor = companion111.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf19 = LayoutKt.modifierMaterializerOf(modifierAlpha10);
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
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion111, composerM1320constructorimpl, measurePolicyOooO0O18, composerM1320constructorimpl, currentCompositionLocalMap19);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf19, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance10 = RowScopeInstance.INSTANCE;
                Alignment.Vertical centerVertically110 = companion110.getCenterVertically();
                float f14 = 12;
                Modifier modifierWeight10 = rowScopeInstance10.weight(PaddingKt.m482paddingqDBjuR0$default(BackgroundKt.m171backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(36)), Color.m1680copywmQWz5c$default(ColorKt.Color(0), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m3775constructorimpl(f14), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO0O19 = androidx.compose.material.OooO0OO.OooO0O0(arrangement10, centerVertically110, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion111.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf110 = LayoutKt.modifierMaterializerOf(modifierWeight10);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion111, composerM1320constructorimpl2, measurePolicyOooO0O19, composerM1320constructorimpl2, currentCompositionLocalMap110);
                if (composerM1320constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf110, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                f3 = 15;
                ImageKt.Image(PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_camera_add_music, composerStartRestartGroup, 0), (String) null, androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
                value = selectMusicModel.getValue();
                if (value != null) {
                    str = "";
                } else {
                    str = "";
                }
                long jM1718getWhite0d7_KjU10 = Color.INSTANCE.m1718getWhite0d7_KjU();
                long sp10 = TextUnitKt.getSp(14);
                Modifier modifierM532widthInVpY3zN4$default10 = androidx.compose.foundation.layout.SizeKt.m532widthInVpY3zN4$default(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, Dp.m3775constructorimpl(96), 1, null);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(direct2AddMusic) | composerStartRestartGroup.changed(selectMusicModel);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new o0OoOo0(direct2AddMusic, selectMusicModel);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new o0OoOo0(direct2AddMusic, selectMusicModel);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                p197o00o0OOo.o00O0O0.OooO00o(str, jM1718getWhite0d7_KjU10, sp10, o0O0O00.OooO0O0(modifierM532widthInVpY3zN4$default10, z, false, 0L, false, null, null, null, (Function0) objRememberedValue, 252), false, composerStartRestartGroup, 432, 16);
                if (mutableState5 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-194151136);
                    Painter painterPainterResource19 = PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_camera_music_clip, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged3 = composerStartRestartGroup.changed(mutableState5) | composerStartRestartGroup.changed(function5);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue3 = new o00O0O(mutableState5, function5);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new o00O0O(mutableState5, function5);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    function6 = function5;
                    ImageKt.Image(painterPainterResource19, (String) null, androidx.compose.foundation.layout.SizeKt.m530width3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(PaddingKt.m480paddingVpY3zN4$default(o0O0O00.OooO0O0(companion, z, false, 0L, false, null, null, null, (Function0) objRememberedValue3, 252), Dp.m3775constructorimpl(f), 0.0f, 2, null), 0.0f, 1, null), Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    composerStartRestartGroup.endReplaceableGroup();
                    obj = null;
                    composer2 = composerStartRestartGroup;
                    f4 = 0.0f;
                } else {
                    function6 = function5;
                    f4 = 0.0f;
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(-194150544);
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f), null, composer2, 6, 2);
                    composer2.endReplaceableGroup();
                    obj = null;
                }
                o000O.o0ooOOo.OooO00o(composer2);
                Painter painterPainterResource110 = PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_remove_selected_music, composer2, 0);
                Modifier modifierM171backgroundbw27NRU$default10 = BackgroundKt.m171backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(1), 0.0f, 0.0f, 0.0f, 14, null), f4, 1, obj), Color.m1680copywmQWz5c$default(ColorKt.Color(0), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                composer2.startReplaceableGroup(1157296644);
                zChanged2 = composer2.changed(deleteMusic);
                objRememberedValue2 = composer2.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new o00Oo0(deleteMusic);
                    composer2.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new o00Oo0(deleteMusic);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                composer3 = composer2;
                ImageKt.Image(painterPainterResource110, (String) null, androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(o0O0O00.OooO0O0(modifierM171backgroundbw27NRU$default10, z, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 252), Dp.m3775constructorimpl(f), 0.0f, Dp.m3775constructorimpl(f14), 0.0f, 10, null), Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                if (androidx.compose.material.OooO0o.OooO00o(composer3)) {
                    ComposerKt.traceEventEnd();
                }
                function7 = function6;
                mutableState6 = mutableState5;
                function8 = function11118;
                mutableState7 = mutableState17;
            } else {
                if (i5 != 0) {
                    mutableState3 = null;
                } else {
                    mutableState3 = mutableState;
                }
                if (i7 != 0) {
                    mutableState4 = null;
                } else {
                    mutableState4 = mutableState2;
                }
                if (i9 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                if (i11 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(782343971, i3, -1, "com.yalla.yalla.module.media.camera.MusicSelectedComp (CameraCommonComp.kt:288)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1444899166);
                if (mutableState3 != null) {
                    value2 = selectMusicModel.getValue();
                    if (value2 != null) {
                        str2 = "";
                    } else {
                        str2 = "";
                    }
                    value3 = selectMusicModel.getValue();
                    if (value3 != null) {
                        durationMs = value3.getDurationMs();
                    } else {
                        durationMs = 0;
                    }
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged4 = composerStartRestartGroup.changed(function3);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged4) {
                        objRememberedValue4 = new OooOo00(function3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooOo00(function3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function1 function11119 = (Function1) objRememberedValue4;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged5 = composerStartRestartGroup.changed(function3);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged5) {
                        objRememberedValue5 = new OooOo(function3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new OooOo(function3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function1 function111110 = (Function1) objRememberedValue5;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged6 = composerStartRestartGroup.changed(function4);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged6) {
                        objRememberedValue6 = new Oooo000(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new Oooo000(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function1 function111111 = (Function1) objRememberedValue6;
                    Oooo0 oooo10 = Oooo0.f23845OooO0Oo;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged7 = composerStartRestartGroup.changed(selectMusicModel) | composerStartRestartGroup.changed(mutableState3);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (zChanged7) {
                        objRememberedValue7 = new o000oOoO(selectMusicModel, mutableState3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    } else {
                        objRememberedValue7 = new o000oOoO(selectMusicModel, mutableState3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState4.setValue(o00O00o0.OooO00o(mutableState3, str2, durationMs, j, function11119, function111110, function111111, oooo10, (Function1) objRememberedValue7, composerStartRestartGroup, ((i3 >> 18) & 14) | 100663296 | (i3 & 7168)));
                }
                composerStartRestartGroup.endReplaceableGroup();
                companion = Modifier.INSTANCE;
                Alignment.Companion companion112 = Alignment.INSTANCE;
                f = 10;
                Modifier modifierOooO00o11 = o00O0O0.OooO00o(f, androidx.compose.foundation.layout.SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(boxScope.align(companion, companion112.getTopCenter()), 0.0f, Dp.m3775constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3775constructorimpl(35)));
                if (z) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.5f;
                }
                Modifier modifierAlpha11 = AlphaKt.alpha(modifierOooO00o11, f2);
                Alignment.Vertical centerVertically111 = companion112.getCenterVertically();
                function5 = function4;
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Arrangement arrangement11 = Arrangement.INSTANCE;
                Function1<? super Long, Unit> function111112 = function3;
                MutableState<Function0<Unit>> mutableState18 = mutableState4;
                MeasurePolicy measurePolicyOooO0O110 = androidx.compose.material.OooO0OO.OooO0O0(arrangement11, centerVertically111, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                mutableState5 = mutableState3;
                ComposeUiNode.Companion companion113 = ComposeUiNode.INSTANCE;
                constructor = companion113.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111 = LayoutKt.modifierMaterializerOf(modifierAlpha11);
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
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion113, composerM1320constructorimpl, measurePolicyOooO0O110, composerM1320constructorimpl, currentCompositionLocalMap111);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf111, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance11 = RowScopeInstance.INSTANCE;
                Alignment.Vertical centerVertically112 = companion112.getCenterVertically();
                float f15 = 12;
                Modifier modifierWeight11 = rowScopeInstance11.weight(PaddingKt.m482paddingqDBjuR0$default(BackgroundKt.m171backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(36)), Color.m1680copywmQWz5c$default(ColorKt.Color(0), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m3775constructorimpl(f15), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO0O111 = androidx.compose.material.OooO0OO.OooO0O0(arrangement11, centerVertically112, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion113.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf112 = LayoutKt.modifierMaterializerOf(modifierWeight11);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion113, composerM1320constructorimpl2, measurePolicyOooO0O111, composerM1320constructorimpl2, currentCompositionLocalMap112);
                if (composerM1320constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf112, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                f3 = 15;
                ImageKt.Image(PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_camera_add_music, composerStartRestartGroup, 0), (String) null, androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
                value = selectMusicModel.getValue();
                if (value != null) {
                    str = "";
                } else {
                    str = "";
                }
                long jM1718getWhite0d7_KjU11 = Color.INSTANCE.m1718getWhite0d7_KjU();
                long sp11 = TextUnitKt.getSp(14);
                Modifier modifierM532widthInVpY3zN4$default11 = androidx.compose.foundation.layout.SizeKt.m532widthInVpY3zN4$default(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, Dp.m3775constructorimpl(96), 1, null);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(direct2AddMusic) | composerStartRestartGroup.changed(selectMusicModel);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new o0OoOo0(direct2AddMusic, selectMusicModel);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new o0OoOo0(direct2AddMusic, selectMusicModel);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                p197o00o0OOo.o00O0O0.OooO00o(str, jM1718getWhite0d7_KjU11, sp11, o0O0O00.OooO0O0(modifierM532widthInVpY3zN4$default11, z, false, 0L, false, null, null, null, (Function0) objRememberedValue, 252), false, composerStartRestartGroup, 432, 16);
                if (mutableState5 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-194151136);
                    Painter painterPainterResource111 = PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_camera_music_clip, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged3 = composerStartRestartGroup.changed(mutableState5) | composerStartRestartGroup.changed(function5);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue3 = new o00O0O(mutableState5, function5);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new o00O0O(mutableState5, function5);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    function6 = function5;
                    ImageKt.Image(painterPainterResource111, (String) null, androidx.compose.foundation.layout.SizeKt.m530width3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(PaddingKt.m480paddingVpY3zN4$default(o0O0O00.OooO0O0(companion, z, false, 0L, false, null, null, null, (Function0) objRememberedValue3, 252), Dp.m3775constructorimpl(f), 0.0f, 2, null), 0.0f, 1, null), Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    composerStartRestartGroup.endReplaceableGroup();
                    obj = null;
                    composer2 = composerStartRestartGroup;
                    f4 = 0.0f;
                } else {
                    function6 = function5;
                    f4 = 0.0f;
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(-194150544);
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f), null, composer2, 6, 2);
                    composer2.endReplaceableGroup();
                    obj = null;
                }
                o000O.o0ooOOo.OooO00o(composer2);
                Painter painterPainterResource112 = PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_remove_selected_music, composer2, 0);
                Modifier modifierM171backgroundbw27NRU$default11 = BackgroundKt.m171backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(1), 0.0f, 0.0f, 0.0f, 14, null), f4, 1, obj), Color.m1680copywmQWz5c$default(ColorKt.Color(0), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                composer2.startReplaceableGroup(1157296644);
                zChanged2 = composer2.changed(deleteMusic);
                objRememberedValue2 = composer2.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new o00Oo0(deleteMusic);
                    composer2.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new o00Oo0(deleteMusic);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                composer3 = composer2;
                ImageKt.Image(painterPainterResource112, (String) null, androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(o0O0O00.OooO0O0(modifierM171backgroundbw27NRU$default11, z, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 252), Dp.m3775constructorimpl(f), 0.0f, Dp.m3775constructorimpl(f15), 0.0f, 10, null), Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                if (androidx.compose.material.OooO0o.OooO00o(composer3)) {
                    ComposerKt.traceEventEnd();
                }
                function7 = function6;
                mutableState6 = mutableState5;
                function8 = function111112;
                mutableState7 = mutableState18;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o00Ooo(boxScope, selectMusicModel, z, j, deleteMusic, direct2AddMusic, mutableState6, mutableState7, function8, function7, i, i2));
        }
        i3 |= 1572864;
        i7 = i2 & 64;
        if (i7 != 0) {
            if ((29360128 & i) == 0) {
                if (composerStartRestartGroup.changed(mutableState2)) {
                    i8 = 8388608;
                } else {
                    i8 = Configuration.BLOCK_SIZE;
                }
                i3 |= i8;
            }
            i9 = i2 & 128;
            if (i9 != 0) {
                i3 |= 100663296;
            } else if ((i & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i3 |= i10;
            }
            i11 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i11 != 0) {
                i3 |= 805306368;
            } else if ((i & 1879048192) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i12 = 536870912;
                } else {
                    i12 = SQLiteDatabase.CREATE_IF_NECESSARY;
                }
                i3 |= i12;
            }
            if ((i3 & 1533916891) == 306783378) {
                if (i5 != 0) {
                    mutableState3 = null;
                } else {
                    mutableState3 = mutableState;
                }
                if (i7 != 0) {
                    mutableState4 = null;
                } else {
                    mutableState4 = mutableState2;
                }
                if (i9 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                if (i11 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(782343971, i3, -1, "com.yalla.yalla.module.media.camera.MusicSelectedComp (CameraCommonComp.kt:288)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1444899166);
                if (mutableState3 != null) {
                    value2 = selectMusicModel.getValue();
                    if (value2 != null) {
                        str2 = "";
                    } else {
                        str2 = "";
                    }
                    value3 = selectMusicModel.getValue();
                    if (value3 != null) {
                        durationMs = value3.getDurationMs();
                    } else {
                        durationMs = 0;
                    }
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged4 = composerStartRestartGroup.changed(function3);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged4) {
                        objRememberedValue4 = new OooOo00(function3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooOo00(function3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function1 function111113 = (Function1) objRememberedValue4;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged5 = composerStartRestartGroup.changed(function3);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged5) {
                        objRememberedValue5 = new OooOo(function3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new OooOo(function3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function1 function111114 = (Function1) objRememberedValue5;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged6 = composerStartRestartGroup.changed(function4);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged6) {
                        objRememberedValue6 = new Oooo000(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new Oooo000(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function1 function111115 = (Function1) objRememberedValue6;
                    Oooo0 oooo11 = Oooo0.f23845OooO0Oo;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged7 = composerStartRestartGroup.changed(selectMusicModel) | composerStartRestartGroup.changed(mutableState3);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (zChanged7) {
                        objRememberedValue7 = new o000oOoO(selectMusicModel, mutableState3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    } else {
                        objRememberedValue7 = new o000oOoO(selectMusicModel, mutableState3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState4.setValue(o00O00o0.OooO00o(mutableState3, str2, durationMs, j, function111113, function111114, function111115, oooo11, (Function1) objRememberedValue7, composerStartRestartGroup, ((i3 >> 18) & 14) | 100663296 | (i3 & 7168)));
                }
                composerStartRestartGroup.endReplaceableGroup();
                companion = Modifier.INSTANCE;
                Alignment.Companion companion114 = Alignment.INSTANCE;
                f = 10;
                Modifier modifierOooO00o12 = o00O0O0.OooO00o(f, androidx.compose.foundation.layout.SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(boxScope.align(companion, companion114.getTopCenter()), 0.0f, Dp.m3775constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3775constructorimpl(35)));
                if (z) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.5f;
                }
                Modifier modifierAlpha12 = AlphaKt.alpha(modifierOooO00o12, f2);
                Alignment.Vertical centerVertically113 = companion114.getCenterVertically();
                function5 = function4;
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Arrangement arrangement12 = Arrangement.INSTANCE;
                Function1<? super Long, Unit> function111116 = function3;
                MutableState<Function0<Unit>> mutableState19 = mutableState4;
                MeasurePolicy measurePolicyOooO0O112 = androidx.compose.material.OooO0OO.OooO0O0(arrangement12, centerVertically113, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                mutableState5 = mutableState3;
                ComposeUiNode.Companion companion115 = ComposeUiNode.INSTANCE;
                constructor = companion115.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf113 = LayoutKt.modifierMaterializerOf(modifierAlpha12);
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
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion115, composerM1320constructorimpl, measurePolicyOooO0O112, composerM1320constructorimpl, currentCompositionLocalMap113);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf113, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance12 = RowScopeInstance.INSTANCE;
                Alignment.Vertical centerVertically114 = companion114.getCenterVertically();
                float f16 = 12;
                Modifier modifierWeight12 = rowScopeInstance12.weight(PaddingKt.m482paddingqDBjuR0$default(BackgroundKt.m171backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(36)), Color.m1680copywmQWz5c$default(ColorKt.Color(0), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m3775constructorimpl(f16), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO0O113 = androidx.compose.material.OooO0OO.OooO0O0(arrangement12, centerVertically114, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion115.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf114 = LayoutKt.modifierMaterializerOf(modifierWeight12);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion115, composerM1320constructorimpl2, measurePolicyOooO0O113, composerM1320constructorimpl2, currentCompositionLocalMap114);
                if (composerM1320constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf114, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                f3 = 15;
                ImageKt.Image(PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_camera_add_music, composerStartRestartGroup, 0), (String) null, androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
                value = selectMusicModel.getValue();
                if (value != null) {
                    str = "";
                } else {
                    str = "";
                }
                long jM1718getWhite0d7_KjU12 = Color.INSTANCE.m1718getWhite0d7_KjU();
                long sp12 = TextUnitKt.getSp(14);
                Modifier modifierM532widthInVpY3zN4$default12 = androidx.compose.foundation.layout.SizeKt.m532widthInVpY3zN4$default(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, Dp.m3775constructorimpl(96), 1, null);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(direct2AddMusic) | composerStartRestartGroup.changed(selectMusicModel);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new o0OoOo0(direct2AddMusic, selectMusicModel);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new o0OoOo0(direct2AddMusic, selectMusicModel);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                p197o00o0OOo.o00O0O0.OooO00o(str, jM1718getWhite0d7_KjU12, sp12, o0O0O00.OooO0O0(modifierM532widthInVpY3zN4$default12, z, false, 0L, false, null, null, null, (Function0) objRememberedValue, 252), false, composerStartRestartGroup, 432, 16);
                if (mutableState5 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-194151136);
                    Painter painterPainterResource113 = PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_camera_music_clip, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged3 = composerStartRestartGroup.changed(mutableState5) | composerStartRestartGroup.changed(function5);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue3 = new o00O0O(mutableState5, function5);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new o00O0O(mutableState5, function5);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    function6 = function5;
                    ImageKt.Image(painterPainterResource113, (String) null, androidx.compose.foundation.layout.SizeKt.m530width3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(PaddingKt.m480paddingVpY3zN4$default(o0O0O00.OooO0O0(companion, z, false, 0L, false, null, null, null, (Function0) objRememberedValue3, 252), Dp.m3775constructorimpl(f), 0.0f, 2, null), 0.0f, 1, null), Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    composerStartRestartGroup.endReplaceableGroup();
                    obj = null;
                    composer2 = composerStartRestartGroup;
                    f4 = 0.0f;
                } else {
                    function6 = function5;
                    f4 = 0.0f;
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(-194150544);
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f), null, composer2, 6, 2);
                    composer2.endReplaceableGroup();
                    obj = null;
                }
                o000O.o0ooOOo.OooO00o(composer2);
                Painter painterPainterResource114 = PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_remove_selected_music, composer2, 0);
                Modifier modifierM171backgroundbw27NRU$default12 = BackgroundKt.m171backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(1), 0.0f, 0.0f, 0.0f, 14, null), f4, 1, obj), Color.m1680copywmQWz5c$default(ColorKt.Color(0), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                composer2.startReplaceableGroup(1157296644);
                zChanged2 = composer2.changed(deleteMusic);
                objRememberedValue2 = composer2.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new o00Oo0(deleteMusic);
                    composer2.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new o00Oo0(deleteMusic);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                composer3 = composer2;
                ImageKt.Image(painterPainterResource114, (String) null, androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(o0O0O00.OooO0O0(modifierM171backgroundbw27NRU$default12, z, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 252), Dp.m3775constructorimpl(f), 0.0f, Dp.m3775constructorimpl(f16), 0.0f, 10, null), Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                if (androidx.compose.material.OooO0o.OooO00o(composer3)) {
                    ComposerKt.traceEventEnd();
                }
                function7 = function6;
                mutableState6 = mutableState5;
                function8 = function111116;
                mutableState7 = mutableState19;
            } else {
                if (i5 != 0) {
                    mutableState3 = null;
                } else {
                    mutableState3 = mutableState;
                }
                if (i7 != 0) {
                    mutableState4 = null;
                } else {
                    mutableState4 = mutableState2;
                }
                if (i9 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                if (i11 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(782343971, i3, -1, "com.yalla.yalla.module.media.camera.MusicSelectedComp (CameraCommonComp.kt:288)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1444899166);
                if (mutableState3 != null) {
                    value2 = selectMusicModel.getValue();
                    if (value2 != null) {
                        str2 = "";
                    } else {
                        str2 = "";
                    }
                    value3 = selectMusicModel.getValue();
                    if (value3 != null) {
                        durationMs = value3.getDurationMs();
                    } else {
                        durationMs = 0;
                    }
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged4 = composerStartRestartGroup.changed(function3);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged4) {
                        objRememberedValue4 = new OooOo00(function3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooOo00(function3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function1 function111117 = (Function1) objRememberedValue4;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged5 = composerStartRestartGroup.changed(function3);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged5) {
                        objRememberedValue5 = new OooOo(function3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new OooOo(function3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function1 function111118 = (Function1) objRememberedValue5;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged6 = composerStartRestartGroup.changed(function4);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged6) {
                        objRememberedValue6 = new Oooo000(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new Oooo000(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function1 function111119 = (Function1) objRememberedValue6;
                    Oooo0 oooo12 = Oooo0.f23845OooO0Oo;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged7 = composerStartRestartGroup.changed(selectMusicModel) | composerStartRestartGroup.changed(mutableState3);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (zChanged7) {
                        objRememberedValue7 = new o000oOoO(selectMusicModel, mutableState3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    } else {
                        objRememberedValue7 = new o000oOoO(selectMusicModel, mutableState3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState4.setValue(o00O00o0.OooO00o(mutableState3, str2, durationMs, j, function111117, function111118, function111119, oooo12, (Function1) objRememberedValue7, composerStartRestartGroup, ((i3 >> 18) & 14) | 100663296 | (i3 & 7168)));
                }
                composerStartRestartGroup.endReplaceableGroup();
                companion = Modifier.INSTANCE;
                Alignment.Companion companion116 = Alignment.INSTANCE;
                f = 10;
                Modifier modifierOooO00o13 = o00O0O0.OooO00o(f, androidx.compose.foundation.layout.SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(boxScope.align(companion, companion116.getTopCenter()), 0.0f, Dp.m3775constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3775constructorimpl(35)));
                if (z) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.5f;
                }
                Modifier modifierAlpha13 = AlphaKt.alpha(modifierOooO00o13, f2);
                Alignment.Vertical centerVertically115 = companion116.getCenterVertically();
                function5 = function4;
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Arrangement arrangement13 = Arrangement.INSTANCE;
                Function1<? super Long, Unit> function1111110 = function3;
                MutableState<Function0<Unit>> mutableState110 = mutableState4;
                MeasurePolicy measurePolicyOooO0O114 = androidx.compose.material.OooO0OO.OooO0O0(arrangement13, centerVertically115, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                mutableState5 = mutableState3;
                ComposeUiNode.Companion companion117 = ComposeUiNode.INSTANCE;
                constructor = companion117.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf115 = LayoutKt.modifierMaterializerOf(modifierAlpha13);
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
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion117, composerM1320constructorimpl, measurePolicyOooO0O114, composerM1320constructorimpl, currentCompositionLocalMap115);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf115, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance13 = RowScopeInstance.INSTANCE;
                Alignment.Vertical centerVertically116 = companion116.getCenterVertically();
                float f17 = 12;
                Modifier modifierWeight13 = rowScopeInstance13.weight(PaddingKt.m482paddingqDBjuR0$default(BackgroundKt.m171backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(36)), Color.m1680copywmQWz5c$default(ColorKt.Color(0), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m3775constructorimpl(f17), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO0O115 = androidx.compose.material.OooO0OO.OooO0O0(arrangement13, centerVertically116, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion117.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf116 = LayoutKt.modifierMaterializerOf(modifierWeight13);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion117, composerM1320constructorimpl2, measurePolicyOooO0O115, composerM1320constructorimpl2, currentCompositionLocalMap116);
                if (composerM1320constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf116, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                f3 = 15;
                ImageKt.Image(PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_camera_add_music, composerStartRestartGroup, 0), (String) null, androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
                value = selectMusicModel.getValue();
                if (value != null) {
                    str = "";
                } else {
                    str = "";
                }
                long jM1718getWhite0d7_KjU13 = Color.INSTANCE.m1718getWhite0d7_KjU();
                long sp13 = TextUnitKt.getSp(14);
                Modifier modifierM532widthInVpY3zN4$default13 = androidx.compose.foundation.layout.SizeKt.m532widthInVpY3zN4$default(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, Dp.m3775constructorimpl(96), 1, null);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(direct2AddMusic) | composerStartRestartGroup.changed(selectMusicModel);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new o0OoOo0(direct2AddMusic, selectMusicModel);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new o0OoOo0(direct2AddMusic, selectMusicModel);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                p197o00o0OOo.o00O0O0.OooO00o(str, jM1718getWhite0d7_KjU13, sp13, o0O0O00.OooO0O0(modifierM532widthInVpY3zN4$default13, z, false, 0L, false, null, null, null, (Function0) objRememberedValue, 252), false, composerStartRestartGroup, 432, 16);
                if (mutableState5 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-194151136);
                    Painter painterPainterResource115 = PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_camera_music_clip, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged3 = composerStartRestartGroup.changed(mutableState5) | composerStartRestartGroup.changed(function5);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue3 = new o00O0O(mutableState5, function5);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new o00O0O(mutableState5, function5);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    function6 = function5;
                    ImageKt.Image(painterPainterResource115, (String) null, androidx.compose.foundation.layout.SizeKt.m530width3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(PaddingKt.m480paddingVpY3zN4$default(o0O0O00.OooO0O0(companion, z, false, 0L, false, null, null, null, (Function0) objRememberedValue3, 252), Dp.m3775constructorimpl(f), 0.0f, 2, null), 0.0f, 1, null), Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    composerStartRestartGroup.endReplaceableGroup();
                    obj = null;
                    composer2 = composerStartRestartGroup;
                    f4 = 0.0f;
                } else {
                    function6 = function5;
                    f4 = 0.0f;
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(-194150544);
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f), null, composer2, 6, 2);
                    composer2.endReplaceableGroup();
                    obj = null;
                }
                o000O.o0ooOOo.OooO00o(composer2);
                Painter painterPainterResource116 = PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_remove_selected_music, composer2, 0);
                Modifier modifierM171backgroundbw27NRU$default13 = BackgroundKt.m171backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(1), 0.0f, 0.0f, 0.0f, 14, null), f4, 1, obj), Color.m1680copywmQWz5c$default(ColorKt.Color(0), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                composer2.startReplaceableGroup(1157296644);
                zChanged2 = composer2.changed(deleteMusic);
                objRememberedValue2 = composer2.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new o00Oo0(deleteMusic);
                    composer2.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new o00Oo0(deleteMusic);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                composer3 = composer2;
                ImageKt.Image(painterPainterResource116, (String) null, androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(o0O0O00.OooO0O0(modifierM171backgroundbw27NRU$default13, z, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 252), Dp.m3775constructorimpl(f), 0.0f, Dp.m3775constructorimpl(f17), 0.0f, 10, null), Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                if (androidx.compose.material.OooO0o.OooO00o(composer3)) {
                    ComposerKt.traceEventEnd();
                }
                function7 = function6;
                mutableState6 = mutableState5;
                function8 = function1111110;
                mutableState7 = mutableState110;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o00Ooo(boxScope, selectMusicModel, z, j, deleteMusic, direct2AddMusic, mutableState6, mutableState7, function8, function7, i, i2));
        }
        i3 |= 12582912;
        i9 = i2 & 128;
        if (i9 != 0) {
            i3 |= 100663296;
        } else if ((i & 234881024) == 0) {
            if (composerStartRestartGroup.changedInstance(function1)) {
                i10 = 67108864;
            } else {
                i10 = 33554432;
            }
            i3 |= i10;
        }
        i11 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (i11 != 0) {
            i3 |= 805306368;
        } else if ((i & 1879048192) == 0) {
            if (composerStartRestartGroup.changedInstance(function2)) {
                i12 = 536870912;
            } else {
                i12 = SQLiteDatabase.CREATE_IF_NECESSARY;
            }
            i3 |= i12;
        }
        if ((i3 & 1533916891) == 306783378) {
            if (i5 != 0) {
                mutableState3 = null;
            } else {
                mutableState3 = mutableState;
            }
            if (i7 != 0) {
                mutableState4 = null;
            } else {
                mutableState4 = mutableState2;
            }
            if (i9 != 0) {
                function3 = null;
            } else {
                function3 = function1;
            }
            if (i11 != 0) {
                function4 = null;
            } else {
                function4 = function2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(782343971, i3, -1, "com.yalla.yalla.module.media.camera.MusicSelectedComp (CameraCommonComp.kt:288)");
            }
            composerStartRestartGroup.startReplaceableGroup(-1444899166);
            if (mutableState3 != null) {
                value2 = selectMusicModel.getValue();
                if (value2 != null) {
                    str2 = "";
                } else {
                    str2 = "";
                }
                value3 = selectMusicModel.getValue();
                if (value3 != null) {
                    durationMs = value3.getDurationMs();
                } else {
                    durationMs = 0;
                }
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged4 = composerStartRestartGroup.changed(function3);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged4) {
                    objRememberedValue4 = new OooOo00(function3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new OooOo00(function3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function1 function1111111 = (Function1) objRememberedValue4;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged5 = composerStartRestartGroup.changed(function3);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged5) {
                    objRememberedValue5 = new OooOo(function3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new OooOo(function3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function1 function1111112 = (Function1) objRememberedValue5;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged6 = composerStartRestartGroup.changed(function4);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged6) {
                    objRememberedValue6 = new Oooo000(function4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new Oooo000(function4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function1 function1111113 = (Function1) objRememberedValue6;
                Oooo0 oooo13 = Oooo0.f23845OooO0Oo;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged7 = composerStartRestartGroup.changed(selectMusicModel) | composerStartRestartGroup.changed(mutableState3);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (zChanged7) {
                    objRememberedValue7 = new o000oOoO(selectMusicModel, mutableState3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                } else {
                    objRememberedValue7 = new o000oOoO(selectMusicModel, mutableState3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState4.setValue(o00O00o0.OooO00o(mutableState3, str2, durationMs, j, function1111111, function1111112, function1111113, oooo13, (Function1) objRememberedValue7, composerStartRestartGroup, ((i3 >> 18) & 14) | 100663296 | (i3 & 7168)));
            }
            composerStartRestartGroup.endReplaceableGroup();
            companion = Modifier.INSTANCE;
            Alignment.Companion companion118 = Alignment.INSTANCE;
            f = 10;
            Modifier modifierOooO00o14 = o00O0O0.OooO00o(f, androidx.compose.foundation.layout.SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(boxScope.align(companion, companion118.getTopCenter()), 0.0f, Dp.m3775constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3775constructorimpl(35)));
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.5f;
            }
            Modifier modifierAlpha14 = AlphaKt.alpha(modifierOooO00o14, f2);
            Alignment.Vertical centerVertically117 = companion118.getCenterVertically();
            function5 = function4;
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Arrangement arrangement14 = Arrangement.INSTANCE;
            Function1<? super Long, Unit> function1111114 = function3;
            MutableState<Function0<Unit>> mutableState111 = mutableState4;
            MeasurePolicy measurePolicyOooO0O116 = androidx.compose.material.OooO0OO.OooO0O0(arrangement14, centerVertically117, composerStartRestartGroup, 48, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            mutableState5 = mutableState3;
            ComposeUiNode.Companion companion119 = ComposeUiNode.INSTANCE;
            constructor = companion119.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf117 = LayoutKt.modifierMaterializerOf(modifierAlpha14);
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
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion119, composerM1320constructorimpl, measurePolicyOooO0O116, composerM1320constructorimpl, currentCompositionLocalMap117);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf117, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance14 = RowScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically118 = companion118.getCenterVertically();
            float f18 = 12;
            Modifier modifierWeight14 = rowScopeInstance14.weight(PaddingKt.m482paddingqDBjuR0$default(BackgroundKt.m171backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(36)), Color.m1680copywmQWz5c$default(ColorKt.Color(0), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m3775constructorimpl(f18), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO0O117 = androidx.compose.material.OooO0OO.OooO0O0(arrangement14, centerVertically118, composerStartRestartGroup, 48, -1323940314);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor2 = companion119.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf118 = LayoutKt.modifierMaterializerOf(modifierWeight14);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion119, composerM1320constructorimpl2, measurePolicyOooO0O117, composerM1320constructorimpl2, currentCompositionLocalMap118);
            if (composerM1320constructorimpl2.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf118, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            f3 = 15;
            ImageKt.Image(PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_camera_add_music, composerStartRestartGroup, 0), (String) null, androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            value = selectMusicModel.getValue();
            if (value != null) {
                str = "";
            } else {
                str = "";
            }
            long jM1718getWhite0d7_KjU14 = Color.INSTANCE.m1718getWhite0d7_KjU();
            long sp14 = TextUnitKt.getSp(14);
            Modifier modifierM532widthInVpY3zN4$default14 = androidx.compose.foundation.layout.SizeKt.m532widthInVpY3zN4$default(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, Dp.m3775constructorimpl(96), 1, null);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(direct2AddMusic) | composerStartRestartGroup.changed(selectMusicModel);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new o0OoOo0(direct2AddMusic, selectMusicModel);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new o0OoOo0(direct2AddMusic, selectMusicModel);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            p197o00o0OOo.o00O0O0.OooO00o(str, jM1718getWhite0d7_KjU14, sp14, o0O0O00.OooO0O0(modifierM532widthInVpY3zN4$default14, z, false, 0L, false, null, null, null, (Function0) objRememberedValue, 252), false, composerStartRestartGroup, 432, 16);
            if (mutableState5 != null) {
                composerStartRestartGroup.startReplaceableGroup(-194151136);
                Painter painterPainterResource117 = PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_camera_music_clip, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged3 = composerStartRestartGroup.changed(mutableState5) | composerStartRestartGroup.changed(function5);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue3 = new o00O0O(mutableState5, function5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new o00O0O(mutableState5, function5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                function6 = function5;
                ImageKt.Image(painterPainterResource117, (String) null, androidx.compose.foundation.layout.SizeKt.m530width3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(PaddingKt.m480paddingVpY3zN4$default(o0O0O00.OooO0O0(companion, z, false, 0L, false, null, null, null, (Function0) objRememberedValue3, 252), Dp.m3775constructorimpl(f), 0.0f, 2, null), 0.0f, 1, null), Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                composerStartRestartGroup.endReplaceableGroup();
                obj = null;
                composer2 = composerStartRestartGroup;
                f4 = 0.0f;
            } else {
                function6 = function5;
                f4 = 0.0f;
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(-194150544);
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f), null, composer2, 6, 2);
                composer2.endReplaceableGroup();
                obj = null;
            }
            o000O.o0ooOOo.OooO00o(composer2);
            Painter painterPainterResource118 = PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_remove_selected_music, composer2, 0);
            Modifier modifierM171backgroundbw27NRU$default14 = BackgroundKt.m171backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(1), 0.0f, 0.0f, 0.0f, 14, null), f4, 1, obj), Color.m1680copywmQWz5c$default(ColorKt.Color(0), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            composer2.startReplaceableGroup(1157296644);
            zChanged2 = composer2.changed(deleteMusic);
            objRememberedValue2 = composer2.rememberedValue();
            if (zChanged2) {
                objRememberedValue2 = new o00Oo0(deleteMusic);
                composer2.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new o00Oo0(deleteMusic);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            composer3 = composer2;
            ImageKt.Image(painterPainterResource118, (String) null, androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(o0O0O00.OooO0O0(modifierM171backgroundbw27NRU$default14, z, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 252), Dp.m3775constructorimpl(f), 0.0f, Dp.m3775constructorimpl(f18), 0.0f, 10, null), Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
            if (androidx.compose.material.OooO0o.OooO00o(composer3)) {
                ComposerKt.traceEventEnd();
            }
            function7 = function6;
            mutableState6 = mutableState5;
            function8 = function1111114;
            mutableState7 = mutableState111;
        } else {
            if (i5 != 0) {
                mutableState3 = null;
            } else {
                mutableState3 = mutableState;
            }
            if (i7 != 0) {
                mutableState4 = null;
            } else {
                mutableState4 = mutableState2;
            }
            if (i9 != 0) {
                function3 = null;
            } else {
                function3 = function1;
            }
            if (i11 != 0) {
                function4 = null;
            } else {
                function4 = function2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(782343971, i3, -1, "com.yalla.yalla.module.media.camera.MusicSelectedComp (CameraCommonComp.kt:288)");
            }
            composerStartRestartGroup.startReplaceableGroup(-1444899166);
            if (mutableState3 != null) {
                value2 = selectMusicModel.getValue();
                if (value2 != null) {
                    str2 = "";
                } else {
                    str2 = "";
                }
                value3 = selectMusicModel.getValue();
                if (value3 != null) {
                    durationMs = value3.getDurationMs();
                } else {
                    durationMs = 0;
                }
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged4 = composerStartRestartGroup.changed(function3);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged4) {
                    objRememberedValue4 = new OooOo00(function3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new OooOo00(function3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function1 function1111115 = (Function1) objRememberedValue4;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged5 = composerStartRestartGroup.changed(function3);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged5) {
                    objRememberedValue5 = new OooOo(function3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new OooOo(function3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function1 function1111116 = (Function1) objRememberedValue5;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged6 = composerStartRestartGroup.changed(function4);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged6) {
                    objRememberedValue6 = new Oooo000(function4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new Oooo000(function4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function1 function1111117 = (Function1) objRememberedValue6;
                Oooo0 oooo14 = Oooo0.f23845OooO0Oo;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged7 = composerStartRestartGroup.changed(selectMusicModel) | composerStartRestartGroup.changed(mutableState3);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (zChanged7) {
                    objRememberedValue7 = new o000oOoO(selectMusicModel, mutableState3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                } else {
                    objRememberedValue7 = new o000oOoO(selectMusicModel, mutableState3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState4.setValue(o00O00o0.OooO00o(mutableState3, str2, durationMs, j, function1111115, function1111116, function1111117, oooo14, (Function1) objRememberedValue7, composerStartRestartGroup, ((i3 >> 18) & 14) | 100663296 | (i3 & 7168)));
            }
            composerStartRestartGroup.endReplaceableGroup();
            companion = Modifier.INSTANCE;
            Alignment.Companion companion1110 = Alignment.INSTANCE;
            f = 10;
            Modifier modifierOooO00o15 = o00O0O0.OooO00o(f, androidx.compose.foundation.layout.SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(boxScope.align(companion, companion1110.getTopCenter()), 0.0f, Dp.m3775constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3775constructorimpl(35)));
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.5f;
            }
            Modifier modifierAlpha15 = AlphaKt.alpha(modifierOooO00o15, f2);
            Alignment.Vertical centerVertically119 = companion1110.getCenterVertically();
            function5 = function4;
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Arrangement arrangement15 = Arrangement.INSTANCE;
            Function1<? super Long, Unit> function1111118 = function3;
            MutableState<Function0<Unit>> mutableState112 = mutableState4;
            MeasurePolicy measurePolicyOooO0O118 = androidx.compose.material.OooO0OO.OooO0O0(arrangement15, centerVertically119, composerStartRestartGroup, 48, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            mutableState5 = mutableState3;
            ComposeUiNode.Companion companion1111 = ComposeUiNode.INSTANCE;
            constructor = companion1111.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf119 = LayoutKt.modifierMaterializerOf(modifierAlpha15);
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
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion1111, composerM1320constructorimpl, measurePolicyOooO0O118, composerM1320constructorimpl, currentCompositionLocalMap119);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf119, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance15 = RowScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically1110 = companion1110.getCenterVertically();
            float f19 = 12;
            Modifier modifierWeight15 = rowScopeInstance15.weight(PaddingKt.m482paddingqDBjuR0$default(BackgroundKt.m171backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(36)), Color.m1680copywmQWz5c$default(ColorKt.Color(0), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m3775constructorimpl(f19), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO0O119 = androidx.compose.material.OooO0OO.OooO0O0(arrangement15, centerVertically1110, composerStartRestartGroup, 48, -1323940314);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap1110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor2 = companion1111.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1110 = LayoutKt.modifierMaterializerOf(modifierWeight15);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion1111, composerM1320constructorimpl2, measurePolicyOooO0O119, composerM1320constructorimpl2, currentCompositionLocalMap1110);
            if (composerM1320constructorimpl2.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1110, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            f3 = 15;
            ImageKt.Image(PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_camera_add_music, composerStartRestartGroup, 0), (String) null, androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            value = selectMusicModel.getValue();
            if (value != null) {
                str = "";
            } else {
                str = "";
            }
            long jM1718getWhite0d7_KjU15 = Color.INSTANCE.m1718getWhite0d7_KjU();
            long sp15 = TextUnitKt.getSp(14);
            Modifier modifierM532widthInVpY3zN4$default15 = androidx.compose.foundation.layout.SizeKt.m532widthInVpY3zN4$default(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, Dp.m3775constructorimpl(96), 1, null);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(direct2AddMusic) | composerStartRestartGroup.changed(selectMusicModel);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new o0OoOo0(direct2AddMusic, selectMusicModel);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new o0OoOo0(direct2AddMusic, selectMusicModel);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            p197o00o0OOo.o00O0O0.OooO00o(str, jM1718getWhite0d7_KjU15, sp15, o0O0O00.OooO0O0(modifierM532widthInVpY3zN4$default15, z, false, 0L, false, null, null, null, (Function0) objRememberedValue, 252), false, composerStartRestartGroup, 432, 16);
            if (mutableState5 != null) {
                composerStartRestartGroup.startReplaceableGroup(-194151136);
                Painter painterPainterResource119 = PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_camera_music_clip, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged3 = composerStartRestartGroup.changed(mutableState5) | composerStartRestartGroup.changed(function5);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue3 = new o00O0O(mutableState5, function5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new o00O0O(mutableState5, function5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                function6 = function5;
                ImageKt.Image(painterPainterResource119, (String) null, androidx.compose.foundation.layout.SizeKt.m530width3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(PaddingKt.m480paddingVpY3zN4$default(o0O0O00.OooO0O0(companion, z, false, 0L, false, null, null, null, (Function0) objRememberedValue3, 252), Dp.m3775constructorimpl(f), 0.0f, 2, null), 0.0f, 1, null), Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                composerStartRestartGroup.endReplaceableGroup();
                obj = null;
                composer2 = composerStartRestartGroup;
                f4 = 0.0f;
            } else {
                function6 = function5;
                f4 = 0.0f;
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(-194150544);
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f), null, composer2, 6, 2);
                composer2.endReplaceableGroup();
                obj = null;
            }
            o000O.o0ooOOo.OooO00o(composer2);
            Painter painterPainterResource1110 = PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_remove_selected_music, composer2, 0);
            Modifier modifierM171backgroundbw27NRU$default15 = BackgroundKt.m171backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(1), 0.0f, 0.0f, 0.0f, 14, null), f4, 1, obj), Color.m1680copywmQWz5c$default(ColorKt.Color(0), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            composer2.startReplaceableGroup(1157296644);
            zChanged2 = composer2.changed(deleteMusic);
            objRememberedValue2 = composer2.rememberedValue();
            if (zChanged2) {
                objRememberedValue2 = new o00Oo0(deleteMusic);
                composer2.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new o00Oo0(deleteMusic);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            composer3 = composer2;
            ImageKt.Image(painterPainterResource1110, (String) null, androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(o0O0O00.OooO0O0(modifierM171backgroundbw27NRU$default15, z, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 252), Dp.m3775constructorimpl(f), 0.0f, Dp.m3775constructorimpl(f19), 0.0f, 10, null), Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
            if (androidx.compose.material.OooO0o.OooO00o(composer3)) {
                ComposerKt.traceEventEnd();
            }
            function7 = function6;
            mutableState6 = mutableState5;
            function8 = function1111118;
            mutableState7 = mutableState112;
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00Ooo(boxScope, selectMusicModel, z, j, deleteMusic, direct2AddMusic, mutableState6, mutableState7, function8, function7, i, i2));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v3 ??, still in use, count: 1, list:
          (r12v3 ?? I:java.lang.Object) from 0x01a6: INVOKE (r13v4 ?? I:androidx.compose.runtime.Composer), (r12v3 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:423)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    public static final void OooO0o0(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v3 ??, still in use, count: 1, list:
          (r12v3 ?? I:java.lang.Object) from 0x01a6: INVOKE (r13v4 ?? I:androidx.compose.runtime.Composer), (r12v3 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:423)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r22v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0oO(@NotNull BoxScope boxScope, @NotNull CameraViewModel viewModel, @Nullable Composer composer, int i) {
        Composer composer2;
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1733726162);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1733726162, i, -1, "com.yalla.yalla.module.media.camera.PauseRecordingWarn (CameraCommonComp.kt:396)");
        }
        if (viewModel.OooO() || viewModel.OooO0oo().f23787OooO0oO.getValue() != CameraViewModel.VideoRecordState.Pause || !((Boolean) viewModel.f23773OooOo.getValue()).booleanValue() || viewModel.OooO0oo().f23782OooO0O0) {
            composer2 = composerStartRestartGroup;
        } else {
            Unit unit = Unit.INSTANCE;
            EffectsKt.DisposableEffect(unit, new oo000o(viewModel), composerStartRestartGroup, 6);
            EffectsKt.LaunchedEffect(unit, new o00oO0o(viewModel, null), composerStartRestartGroup, 70);
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                int i2 = p456o0Ooo00o.oo000o.ic_camera_pause_recording_warn;
                Object obj = ContextCompat.f5281OooO00o;
                objRememberedValue = ContextCompat.OooO0OO.OooO0O0(context, i2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierDrawBehind = DrawModifierKt.drawBehind(androidx.compose.foundation.layout.OffsetKt.m439offsetVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.m532widthInVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.m513heightInVpY3zN4$default(companion, Dp.m3775constructorimpl(45), 0.0f, 2, null), 0.0f, Dp.m3775constructorimpl(253), 1, null), 0.0f, Dp.m3775constructorimpl(-7), 1, null), new o0ooOOo((Drawable) objRememberedValue));
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(boxScope.align(modifierDrawBehind, companion2.getCenter()), false, false, 0L, false, null, null, null, new o0OOO0o(viewModel), 253);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(p456o0Ooo00o.o00oO0o.tap_to_continue_recording, composerStartRestartGroup, 0), PaddingKt.m480paddingVpY3zN4$default(PaddingKt.m482paddingqDBjuR0$default(boxScopeInstance.align(companion, companion2.getBottomCenter()), 0.0f, Dp.m3775constructorimpl(15), 0.0f, Dp.m3775constructorimpl(14), 5, null), Dp.m3775constructorimpl(27), 0.0f, 2, null), o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131056);
            o000O.o0ooOOo.OooO00o(composer2);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0Oo0oo(boxScope, viewModel, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0oo(@NotNull CameraViewModel cameraViewModel, @NotNull Function0<Unit> onComplete, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(cameraViewModel, "cameraViewModel");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Composer composerStartRestartGroup = composer.startRestartGroup(-650161854);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-650161854, i, -1, "com.yalla.yalla.module.media.camera.VideoRecordingTimeComp (CameraCommonComp.kt:166)");
        }
        float fMo326toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(Dp.m3775constructorimpl((float) 0.5d));
        int iOooO00o = (int) cameraViewModel.OooO0oo().OooO00o();
        TextKt.m1261Text4IGK_g(p031OoooO0.o0OoOo0.OooO0O0(o0000O.OooO0O0(cameraViewModel.OooO0oo().OooO00o()), "/", o0000O.OooO0O0(cameraViewModel.OooO0oo().f23781OooO00o)), (Modifier) null, Color.INSTANCE.m1718getWhite0d7_KjU(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.m1680copywmQWz5c$default(ColorKt.Color(0), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), OffsetKt.Offset(fMo326toPx0680j_4, fMo326toPx0680j_4), fMo326toPx0680j_4, null), (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16769023, (DefaultConstructorMarker) null), composerStartRestartGroup, 3456, 0, 65522);
        EffectsKt.LaunchedEffect(Integer.valueOf(iOooO00o), new o0OO00O(iOooO00o, cameraViewModel, onComplete, null), composerStartRestartGroup, 64);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oo0o0Oo(cameraViewModel, onComplete, i));
    }
}
