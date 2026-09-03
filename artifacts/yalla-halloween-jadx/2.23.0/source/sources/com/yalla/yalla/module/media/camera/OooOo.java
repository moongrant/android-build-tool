package com.yalla.yalla.module.media.camera;

import android.content.Context;
import android.util.Rational;
import androidx.arch.core.util.Function;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraInfoUnavailableException;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraState;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Oooo0;
import androidx.camera.core.ViewPort;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.o000O00O;
import androidx.camera.core.impl.o00O0;
import androidx.camera.core.impl.o0Oo0oo;
import androidx.camera.core.impl.o0o0Oo;
import androidx.camera.video.MediaSpec;
import androidx.camera.view.PreviewView;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.code.android.util.o00Oo0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o000O0Oo;
import p028Oooo0oO.o0O0ooO;
import p028Oooo0oO.o0oOOo;
import p030OoooO.OooOOO;
import p030OoooO.OooOo00;
import p031OoooO0.o000oOoO;
import p033OoooO0O.o00oO0o;
import p039OoooOoo.o00O000o;
import p039OoooOoo.o00O0O00;
import p039OoooOoo.o00OOO00;
import p039OoooOoo.oOO00O;
import p041Ooooo0o.o000000;
import p041Ooooo0o.o000000O;
import p452o0Ooo00O.o0OoOo0;
import p453o0Ooo00o.o00O0O;
import p468o0OoooO0.o0OO0O0;
import p637o0ooOO0.o00O00;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nCameraXComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraXComp.kt\ncom/yalla/yalla/module/media/camera/CameraXCompKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,160:1\n76#2:161\n486#3,4:162\n490#3,2:170\n494#3:176\n25#4:166\n25#4:177\n36#4:184\n1097#5,3:167\n1100#5,3:173\n1097#5,6:178\n1097#5,6:185\n486#6:172\n*S KotlinDebug\n*F\n+ 1 CameraXComp.kt\ncom/yalla/yalla/module/media/camera/CameraXCompKt\n*L\n40#1:161\n41#1:162,4\n41#1:170,2\n41#1:176\n41#1:166\n43#1:177\n51#1:184\n41#1:167,3\n41#1:173,3\n43#1:178,6\n51#1:185,6\n41#1:172\n*E\n"})
public final class OooOo {

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CameraViewModel f24349OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(CameraViewModel cameraViewModel) {
            super(0);
            this.f24349OooO0Oo = cameraViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            CameraControl cameraControlOooO0OO;
            o0OO0O0.OooO00o("_CameraX", "MediaPreviewScreen  VideoPreviewComp  play pause");
            o000O0Oo o000o0oo2 = this.f24349OooO0Oo.f24238OooOOo0;
            if (o000o0oo2 != null && (cameraControlOooO0OO = o000o0oo2.OooO0OO()) != null) {
                cameraControlOooO0OO.OooO0o0(false);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<Context, PreviewView> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<PreviewView> f24350OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MutableState<PreviewView> mutableState) {
            super(1);
            this.f24350OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final PreviewView invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            PreviewView value = this.f24350OooO0Oo.getValue();
            Intrinsics.checkNotNull(value);
            return value;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<PreviewView> f24351OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f24352OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ CameraViewModel f24353OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Context f24354OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f24355OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MutableState<PreviewView> mutableState, CameraViewModel cameraViewModel, CoroutineScope coroutineScope, Context context, Function0<Unit> function0) {
            super(1);
            this.f24351OooO0Oo = mutableState;
            this.f24353OooO0o0 = cameraViewModel;
            this.f24352OooO0o = coroutineScope;
            this.f24354OooO0oO = context;
            this.f24355OooO0oo = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutCoordinates layoutCoordinates) {
            LayoutCoordinates it = layoutCoordinates;
            Intrinsics.checkNotNullParameter(it, "it");
            MutableState<PreviewView> mutableState = this.f24351OooO0Oo;
            PreviewView value = mutableState.getValue();
            Intrinsics.checkNotNull(value);
            ViewPort viewPort = value.getViewPort();
            Rational rational = viewPort != null ? viewPort.f3520OooO0O0 : null;
            CameraViewModel cameraViewModel = this.f24353OooO0o0;
            ViewPort viewPort2 = cameraViewModel.f24222OooO00o;
            if (!Intrinsics.areEqual(rational, viewPort2 != null ? viewPort2.f3520OooO0O0 : null)) {
                PreviewView value2 = mutableState.getValue();
                Intrinsics.checkNotNull(value2);
                cameraViewModel.f24222OooO00o = value2.getViewPort();
                com.code.android.util.OooOOO.OooO0OO(this.f24352OooO0o, new Oooo000(this.f24353OooO0o0, this.f24354OooO0oO, this.f24351OooO0Oo, this.f24355OooO0oo, null));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<PreviewView, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f24356OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(PreviewView previewView) {
            PreviewView it = previewView;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CameraViewModel f24357OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(CameraViewModel cameraViewModel) {
            super(0);
            this.f24357OooO0Oo = cameraViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f24357OooO0Oo.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f24358OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f24359OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<PreviewView> f24360OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ CameraViewModel f24361OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f24362OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f24363OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(Modifier modifier, CameraViewModel cameraViewModel, MutableState<PreviewView> mutableState, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.f24359OooO0Oo = modifier;
            this.f24361OooO0o0 = cameraViewModel;
            this.f24360OooO0o = mutableState;
            this.f24362OooO0oO = function0;
            this.f24363OooO0oo = i;
            this.f24358OooO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooOo.OooO00o(this.f24359OooO0Oo, this.f24361OooO0o0, this.f24360OooO0o, this.f24362OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f24363OooO0oo | 1), this.f24358OooO);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.module.media.camera.CameraXCompKt", f = "CameraXComp.kt", i = {0, 0, 0}, l = {95}, m = "bindCameraUseCases", n = {"cameraViewModel", "context", "previewView"}, s = {"L$0", "L$1", "L$2"})
    public static final class OooOO0O extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f24364OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public CameraViewModel f24365OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public PreviewView f24366OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Context f24367OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public CameraViewModel f24368OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public /* synthetic */ Object f24369OooO0oo;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24369OooO0oo = obj;
            this.f24364OooO |= Integer.MIN_VALUE;
            return OooOo.OooO0O0(null, null, null, this);
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@Nullable Modifier modifier, @NotNull CameraViewModel cameraViewModel, @NotNull MutableState<PreviewView> previewView, @NotNull Function0<Unit> openCameraError, @Nullable Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(cameraViewModel, "cameraViewModel");
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        Intrinsics.checkNotNullParameter(openCameraError, "openCameraError");
        Composer composerStartRestartGroup = composer.startRestartGroup(1253473609);
        if ((i2 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1253473609, i, -1, "com.yalla.yalla.module.media.camera.CameraXComp (CameraXComp.kt:33)");
        }
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Object objOooO00o = androidx.compose.animation.OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
        Composer.Companion companion = Composer.INSTANCE;
        if (objOooO00o == companion.getEmpty()) {
            objOooO00o = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
        }
        composerStartRestartGroup.endReplaceableGroup();
        CoroutineScope coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objOooO00o, composerStartRestartGroup, -492369756);
        if (composerStartRestartGroup.rememberedValue() == companion.getEmpty()) {
            PreviewView previewView2 = new PreviewView(context);
            previewView2.setImplementationMode(PreviewView.ImplementationMode.COMPATIBLE);
            previewView.setValue(previewView2);
            composerStartRestartGroup.updateRememberedValue(previewView.getValue());
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(previewView);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new OooO00o(previewView);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        AndroidView_androidKt.AndroidView((Function1) objRememberedValue, OnGloballyPositionedModifierKt.onGloballyPositioned(modifier.then(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)), new OooO0O0(previewView, cameraViewModel, coroutineScopeOooO00o, context, openCameraError)), OooO0OO.f24356OooO0Oo, composerStartRestartGroup, 384, 0);
        o00Oo0.OooO00o(Lifecycle.Event.ON_RESUME, new OooO0o(cameraViewModel), composerStartRestartGroup, 6);
        o00Oo0.OooO00o(Lifecycle.Event.ON_PAUSE, new OooO(cameraViewModel), composerStartRestartGroup, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(modifier, cameraViewModel, previewView, openCameraError, i, i2));
    }

    /* JADX WARN: Code duplicated, block: B:141:0x0399  */
    /* JADX WARN: Code duplicated, block: B:69:0x019b  */
    /* JADX WARN: Code duplicated, block: B:71:0x019f  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Nullable
    public static final Object OooO0O0(@NotNull CameraViewModel cameraViewModel, @NotNull Context context, @Nullable PreviewView previewView, @NotNull Continuation<? super Unit> continuation) throws CameraInfoUnavailableException {
        OooOO0O oooOO0O;
        o00O000.OooO0o oooO0oOooO00o;
        CameraViewModel cameraViewModel2;
        androidx.camera.lifecycle.OooOO0 oooOO1;
        boolean zOooO0O0;
        CameraSelector cameraSelector;
        o00O000o o00o000o2;
        o000O0Oo o000o0ooOooO00o;
        CameraInfo cameraInfoOooO00o;
        LiveData<CameraState> liveDataOooO0O0;
        LifecycleOwner lifecycleOwner;
        LifecycleOwner lifecycleOwner2;
        CameraSelector camSelector;
        LifecycleOwner lifecycleOwner3;
        CameraViewModel cameraViewModel3 = cameraViewModel;
        final Context context2 = context;
        PreviewView previewView2 = previewView;
        if (continuation instanceof OooOO0O) {
            oooOO0O = (OooOO0O) continuation;
            int i = oooOO0O.f24364OooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOO0O.f24364OooO = i - Integer.MIN_VALUE;
            } else {
                oooOO0O = new OooOO0O(continuation);
            }
        } else {
            oooOO0O = new OooOO0O(continuation);
        }
        Object objOooO00o = oooOO0O.f24369OooO0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOO0O.f24364OooO;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO00o);
            if (previewView2 == null) {
                return Unit.INSTANCE;
            }
            androidx.camera.lifecycle.OooOO0 oooOO2 = androidx.camera.lifecycle.OooOO0.f3868OooO0o;
            context.getClass();
            final androidx.camera.lifecycle.OooOO0 oooOO3 = androidx.camera.lifecycle.OooOO0.f3868OooO0o;
            synchronized (oooOO3.f3869OooO00o) {
                oooO0oOooO00o = oooOO3.f3870OooO0O0;
                if (oooO0oOooO00o == null) {
                    final o0O0ooO o0o0ooo = new o0O0ooO(context2);
                    oooO0oOooO00o = o00O000.OooO00o(new o00O000.OooO0OO() { // from class: androidx.camera.lifecycle.OooO0OO
                        @Override // o0ooOO0.o00O000.OooO0OO
                        public final Object OooO0o0(o00O000.OooO00o oooO00o) {
                            OooOO0 oooOO4 = oooOO3;
                            final o0O0ooO o0o0ooo2 = o0o0ooo;
                            synchronized (oooOO4.f3869OooO00o) {
                                OooOOO oooOOOOooO0OO = OooOOO.OooO00o(oooOO4.f3871OooO0OO).OooO0OO(new p030OoooO.OooOO0() { // from class: androidx.camera.lifecycle.OooO0o
                                    @Override // p030OoooO.OooOO0
                                    public final com.google.common.util.concurrent.OooO00o apply(Object obj) {
                                        return o0o0ooo2.f1197OooOO0;
                                    }
                                }, o00oO0o.OooO00o());
                                OooO oooO = new OooO(o0o0ooo2, oooO00o);
                                oooOOOOooO0OO.OooO(new OooOo00.OooO0O0(oooOOOOooO0OO, oooO), o00oO0o.OooO00o());
                            }
                            return "ProcessCameraProvider-initializeCameraX";
                        }
                    });
                    oooOO3.f3870OooO0O0 = oooO0oOooO00o;
                }
            }
            p030OoooO.OooOO0O oooOO0OOooO0oo = p030OoooO.OooOo00.OooO0oo(oooO0oOooO00o, new Function() { // from class: androidx.camera.lifecycle.OooO0O0
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    OooOO0 oooOO4 = OooOO0.f3868OooO0o;
                    oooOO4.f3873OooO0o0 = (o0O0ooO) obj;
                    o000oOoO.OooO00o(context2);
                    oooOO4.getClass();
                    return oooOO4;
                }
            }, o00oO0o.OooO00o());
            Intrinsics.checkNotNullExpressionValue(oooOO0OOooO0oo, "getInstance(context)");
            oooOO0O.f24365OooO0Oo = cameraViewModel3;
            oooOO0O.f24367OooO0o0 = context2;
            oooOO0O.f24366OooO0o = previewView2;
            oooOO0O.f24368OooO0oO = cameraViewModel3;
            oooOO0O.f24364OooO = 1;
            objOooO00o = o00O00.OooO00o(oooOO0OOooO0oo, oooOO0O);
            if (objOooO00o == coroutine_suspended) {
                return coroutine_suspended;
            }
            cameraViewModel2 = cameraViewModel3;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cameraViewModel3 = oooOO0O.f24368OooO0oO;
            PreviewView previewView3 = oooOO0O.f24366OooO0o;
            Context context3 = oooOO0O.f24367OooO0o0;
            cameraViewModel2 = oooOO0O.f24365OooO0Oo;
            ResultKt.throwOnFailure(objOooO00o);
            previewView2 = previewView3;
            context2 = context3;
        }
        cameraViewModel3.f24237OooOOo = (androidx.camera.lifecycle.OooOO0) objOooO00o;
        Intrinsics.checkNotNullParameter(cameraViewModel2, "cameraViewModel");
        if (!(!cameraViewModel2.f24243OooOo0O.isEmpty())) {
            androidx.camera.lifecycle.OooOO0 oooOO4 = cameraViewModel2.f24237OooOOo;
            Intrinsics.checkNotNull(oooOO4);
            oooOO4.OooO0Oo();
            CameraSelector[] cameraSelectorArr = {CameraSelector.f3396OooO0OO, CameraSelector.f3395OooO0O0};
            for (int i3 = 0; i3 < 2; i3++) {
                CameraSelector cameraSelector2 = cameraSelectorArr[i3];
                try {
                    androidx.camera.lifecycle.OooOO0 oooOO5 = cameraViewModel2.f24237OooOOo;
                    Intrinsics.checkNotNull(oooOO5);
                    if (oooOO5.OooO0O0(cameraSelector2)) {
                        LifecycleOwner lifecycleOwner4 = cameraViewModel2.f24223OooO0O0;
                        if (lifecycleOwner4 != null) {
                            lifecycleOwner3 = lifecycleOwner4;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("viewLifecycleOwner");
                            lifecycleOwner3 = null;
                        }
                        Oooo0[] oooo0Arr = new Oooo0[0];
                        o0O0ooO o0o0ooo2 = oooOO4.f3873OooO0o0;
                        if ((o0o0ooo2 == null ? 0 : o0o0ooo2.OooO00o().OooO0Oo().f1103OooO0o0) == 2) {
                            camSelector = cameraSelector2;
                            throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
                        }
                        oooOO4.OooO0OO(1);
                        camSelector = cameraSelector2;
                        try {
                            o000O0Oo o000o0ooOooO00o2 = oooOO4.OooO00o(lifecycleOwner3, cameraSelector2, null, Collections.emptyList(), oooo0Arr);
                            Intrinsics.checkNotNullExpressionValue(o000o0ooOooO00o2, "provider.bindToLifecycle…ecycleOwner, camSelector)");
                            CameraInfo cameraInfoOooO00o2 = o000o0ooOooO00o2.OooO00o();
                            Set<androidx.camera.video.OooOO0O.OooOOO> set = androidx.camera.video.OooOO0O.f3912Ooooo00;
                            o000000 o000000Var = o000000O.f1761OooO0Oo;
                            ArrayList arrayListOooO0OO = new o00OOO00((o0Oo0oo) cameraInfoOooO00o2).OooO0OO(DynamicRange.f3400OooO0Oo);
                            Intrinsics.checkNotNullExpressionValue(arrayListOooO0OO, "getSupportedQualities(camera.cameraInfo)");
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : arrayListOooO0OO) {
                                if (CollectionsKt.listOf((Object[]) new o00O000o[]{o00O000o.f1673OooO0O0, o00O000o.f1672OooO00o}).contains((o00O000o) obj)) {
                                    arrayList.add(obj);
                                }
                            }
                            ArrayList arrayList2 = cameraViewModel2.f24243OooOo0O;
                            Intrinsics.checkNotNullExpressionValue(camSelector, "camSelector");
                            arrayList2.add(new o00O0O(camSelector, arrayList));
                        } catch (Exception unused) {
                            o0OO0O0.OooO00o("_CameraUtil", "Camera Face " + camSelector + " is not supported");
                        }
                        o0OO0O0.OooO00o("_CameraUtil", "Camera Face " + camSelector + " is not supported");
                    } else {
                        continue;
                    }
                } catch (Exception unused2) {
                    camSelector = cameraSelector2;
                }
            }
        }
        if (cameraViewModel2.OooO0oO()) {
            oooOO1 = cameraViewModel2.f24237OooOOo;
            if (oooOO1 != null) {
                zOooO0O0 = oooOO1.OooO0O0(CameraSelector.f3395OooO0O0);
            } else {
                zOooO0O0 = false;
            }
            if (zOooO0O0) {
                throw new IllegalStateException("Back and front camera are unavailable");
            }
            cameraSelector = CameraSelector.f3395OooO0O0;
        } else {
            androidx.camera.lifecycle.OooOO0 oooOO6 = cameraViewModel2.f24237OooOOo;
            if (oooOO6 != null ? oooOO6.OooO0O0(CameraSelector.f3396OooO0OO) : false) {
                cameraSelector = CameraSelector.f3396OooO0OO;
            } else {
                oooOO1 = cameraViewModel2.f24237OooOOo;
                if (oooOO1 != null) {
                    zOooO0O0 = oooOO1.OooO0O0(CameraSelector.f3395OooO0O0);
                } else {
                    zOooO0O0 = false;
                }
                if (zOooO0O0) {
                    throw new IllegalStateException("Back and front camera are unavailable");
                }
                cameraSelector = CameraSelector.f3395OooO0O0;
            }
        }
        cameraViewModel2.f24236OooOOOo = cameraSelector;
        Intrinsics.checkNotNullParameter(cameraViewModel2, "cameraViewModel");
        boolean zOooO0oO = cameraViewModel2.OooO0oO();
        ArrayList arrayList3 = cameraViewModel2.f24243OooOo0O;
        if (zOooO0oO) {
            Iterator it = arrayList3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    o00o000o2 = null;
                    break;
                }
                o00O0O o00o0o2 = (o00O0O) it.next();
                Integer numOooO0OO = o00o0o2.f46487OooO00o.OooO0OO();
                if (numOooO0OO != null && numOooO0OO.intValue() == 0) {
                    o00o000o2 = (o00O000o) CollectionsKt.getOrNull(o00o0o2.f46488OooO0O0, 0);
                    break;
                }
            }
        } else {
            Iterator it2 = arrayList3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    o00o000o2 = null;
                    break;
                }
                o00O0O o00o0o3 = (o00O0O) it2.next();
                Integer numOooO0OO2 = o00o0o3.f46487OooO00o.OooO0OO();
                if (numOooO0OO2 != null && numOooO0OO2.intValue() == 1) {
                    o00o000o2 = (o00O000o) CollectionsKt.getOrNull(o00o0o3.f46488OooO0O0, 0);
                    break;
                }
            }
        }
        if (o00o000o2 == null) {
            throw new IllegalStateException("camera quality is null");
        }
        o0OO0O0.OooO00o("_CameraX", "current video quality is " + o00o000o2);
        try {
            androidx.camera.lifecycle.OooOO0 oooOO7 = cameraViewModel2.f24237OooOOo;
            if (oooOO7 != null) {
                oooOO7.OooO0Oo();
            }
            ImageCapture.OooO0O0 oooO0O0 = new ImageCapture.OooO0O0();
            oooO0O0.f3423OooO00o.Oooo0oO(ImageOutputConfig.f3541OooOO0O, 1);
            oooO0O0.f3423OooO00o.Oooo0oO(o000O00O.f3694Oooo000, 1);
            oooO0O0.f3423OooO00o.Oooo0oO(o000O00O.f3695Oooo00O, Integer.valueOf(cameraViewModel2.OooO0o0()));
            cameraViewModel2.f24242OooOo00 = oooO0O0.OooO0OO();
            o00O0O00 o00o0o01 = androidx.camera.video.OooOO0O.f3916OooooOo;
            androidx.camera.video.OooO0O0.OooO00o OooO00o2 = MediaSpec.OooO00o();
            oOO00O ooo00oOooO00o = oOO00O.OooO00o(o00o000o2);
            androidx.camera.video.OooOo oooOo = OooO00o2.f3898OooO00o;
            if (oooOo == null) {
                throw new IllegalStateException("Property \"videoSpec\" has not been set");
            }
            androidx.camera.video.OooO.OooO00o oooO00oOooO0o = oooOo.OooO0o();
            oooO00oOooO0o.OooO0OO(ooo00oOooO00o);
            OooO00o2.OooO0O0(oooO00oOooO0o.OooO00o());
            androidx.camera.video.OooOO0O oooOO0O2 = new androidx.camera.video.OooOO0O(OooO00o2.OooO00o(), o00o0o01, o00o0o01);
            Intrinsics.checkNotNullExpressionValue(oooOO0O2, "Builder()\n            .s…ty))\n            .build()");
            CameraViewModel.OooO00o oooO00oOooO0oo = cameraViewModel2.OooO0oo();
            androidx.camera.video.OooOOOO.OooO0OO oooO0OO = androidx.camera.video.OooOOOO.f4001OooOoOO;
            androidx.camera.video.OooOOOO.OooO0O0 oooO0O1 = new androidx.camera.video.OooOOOO.OooO0O0(oooOO0O2);
            oooO0O1.f4018OooO00o.Oooo0oO(o0o0Oo.f3779OooOooO, UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE);
            oooO00oOooO0oo.f24251OooO0Oo = new androidx.camera.video.OooOOOO<>(new p040Ooooo00.OooO0o(o00O0.Oooo0O0(oooO0O1.f4018OooO00o)));
            ((androidx.camera.core.OooOOOO) cameraViewModel2.f24244OooOo0o.getValue()).Oooo00O(previewView2.getSurfaceProvider());
            o0oOOo.OooO00o oooO00o = new o0oOOo.OooO00o();
            oooO00o.f1208OooO0O0.add((androidx.camera.core.OooOOOO) cameraViewModel2.f24244OooOo0o.getValue());
            ImageCapture imageCapture = cameraViewModel2.f24242OooOo00;
            Intrinsics.checkNotNull(imageCapture);
            oooO00o.f1208OooO0O0.add(imageCapture);
            androidx.camera.video.OooOOOO<androidx.camera.video.OooOO0O> oooOOOO = cameraViewModel2.OooO0oo().f24251OooO0Oo;
            Intrinsics.checkNotNull(oooOOOO);
            oooO00o.f1208OooO0O0.add(oooOOOO);
            Intrinsics.checkNotNullExpressionValue(oooO00o, "Builder()\n            .a…deoState.mVideoCapture!!)");
            ViewPort viewPort = cameraViewModel2.f24222OooO00o;
            if (viewPort != null) {
                oooO00o.f1207OooO00o = viewPort;
            }
            androidx.camera.lifecycle.OooOO0 oooOO8 = cameraViewModel2.f24237OooOOo;
            if (oooOO8 != null) {
                LifecycleOwner lifecycleOwner5 = cameraViewModel2.f24223OooO0O0;
                if (lifecycleOwner5 != null) {
                    lifecycleOwner2 = lifecycleOwner5;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("viewLifecycleOwner");
                    lifecycleOwner2 = null;
                }
                CameraSelector cameraSelector3 = cameraViewModel2.f24236OooOOOo;
                Intrinsics.checkNotNull(cameraSelector3);
                o0oOOo o0ooooOooO00o = oooO00o.OooO00o();
                o0O0ooO o0o0ooo3 = oooOO8.f3873OooO0o0;
                if ((o0o0ooo3 == null ? 0 : o0o0ooo3.OooO00o().OooO0Oo().f1103OooO0o0) == 2) {
                    throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
                }
                oooOO8.OooO0OO(1);
                o000o0ooOooO00o = oooOO8.OooO00o(lifecycleOwner2, cameraSelector3, o0ooooOooO00o.f1203OooO00o, o0ooooOooO00o.f1205OooO0OO, (Oooo0[]) o0ooooOooO00o.f1204OooO0O0.toArray(new Oooo0[0]));
            } else {
                o000o0ooOooO00o = null;
            }
            cameraViewModel2.f24238OooOOo0 = o000o0ooOooO00o;
            cameraViewModel2.OooO0O0();
            Intrinsics.checkNotNullParameter(cameraViewModel2, "cameraViewModel");
            Intrinsics.checkNotNullParameter(context2, "context");
            o000O0Oo o000o0oo2 = cameraViewModel2.f24238OooOOo0;
            if (o000o0oo2 != null && (cameraInfoOooO00o = o000o0oo2.OooO00o()) != null && (liveDataOooO0O0 = cameraInfoOooO00o.OooO0O0()) != null) {
                LifecycleOwner lifecycleOwner6 = cameraViewModel2.f24223OooO0O0;
                if (lifecycleOwner6 != null) {
                    lifecycleOwner = lifecycleOwner6;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("viewLifecycleOwner");
                    lifecycleOwner = null;
                }
                liveDataOooO0O0.observe(lifecycleOwner, new o0OoOo0(new p452o0Ooo00O.o000oOoO(context2)));
            }
            return Unit.INSTANCE;
        } catch (Exception e) {
            o0OO0O0.OooO00o("_CameraX", "Use case binding failed :" + e);
        }
    }
}
