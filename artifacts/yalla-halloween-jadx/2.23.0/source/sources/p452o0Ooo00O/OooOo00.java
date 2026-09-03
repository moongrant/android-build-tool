package p452o0Ooo00O;

import android.os.Bundle;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.OooOOO;
import androidx.compose.material.OooOOO0;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.TextUnitKt;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.module.media.camera.CameraViewModel;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p454o0Ooo0O.Oooo000;
import p469o0OoooOO.o0oO0O0o;
import p547o0oOO0Oo.o000O0O0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nCameraBottomChooseComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraBottomChooseComp.kt\ncom/yalla/yalla/module/media/camera/CameraBottomChooseCompKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,166:1\n25#2:167\n25#2:175\n25#2:183\n25#2:192\n36#2:203\n50#2:210\n49#2:211\n456#2,8:236\n464#2,3:250\n467#2,3:254\n50#2:260\n49#2:261\n456#2,8:285\n464#2,3:299\n467#2,3:308\n1097#3,3:168\n1100#3,3:172\n1097#3,3:176\n1100#3,3:180\n1097#3,3:184\n1100#3,3:188\n1097#3,6:193\n1097#3,6:204\n1097#3,6:212\n1097#3,6:262\n154#4:171\n154#4:179\n154#4:187\n154#4:218\n154#4:219\n164#4:303\n154#4:304\n154#4:305\n154#4:306\n154#4:307\n76#5:191\n76#5:259\n75#6:199\n58#6:200\n75#6:201\n58#6:202\n74#7,5:220\n79#7:253\n83#7:258\n78#8,11:225\n91#8:257\n78#8,11:274\n91#8:311\n4144#9,6:244\n4144#9,6:293\n72#10,6:268\n78#10:302\n82#10:312\n81#11:313\n107#11,2:314\n*S KotlinDebug\n*F\n+ 1 CameraBottomChooseComp.kt\ncom/yalla/yalla/module/media/camera/CameraBottomChooseCompKt\n*L\n50#1:167\n51#1:175\n52#1:183\n56#1:192\n65#1:203\n79#1:210\n79#1:211\n76#1:236,8\n76#1:250,3\n76#1:254,3\n135#1:260\n135#1:261\n133#1:285,8\n133#1:299,3\n133#1:308,3\n50#1:168,3\n50#1:172,3\n51#1:176,3\n51#1:180,3\n52#1:184,3\n52#1:188,3\n56#1:193,6\n65#1:204,6\n79#1:212,6\n135#1:262,6\n50#1:171\n51#1:179\n52#1:187\n89#1:218\n90#1:219\n151#1:303\n152#1:304\n158#1:305\n159#1:306\n160#1:307\n54#1:191\n131#1:259\n60#1:199\n60#1:200\n62#1:201\n62#1:202\n76#1:220,5\n76#1:253\n76#1:258\n76#1:225,11\n76#1:257\n133#1:274,11\n133#1:311\n76#1:244,6\n133#1:293,6\n133#1:268,6\n133#1:302\n133#1:312\n56#1:313\n56#1:314,2\n*E\n"})
public final class OooOo00 {

    public static final class OooO extends Lambda implements Function1<Dp, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f46461OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(MutableState<Boolean> mutableState) {
            super(1);
            this.f46461OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Dp dp) {
            dp.m3779unboximpl();
            this.f46461OooO0Oo.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nCameraBottomChooseComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraBottomChooseComp.kt\ncom/yalla/yalla/module/media/camera/CameraBottomChooseCompKt$CameraBottomChooseLayout$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,166:1\n154#2:167\n*S KotlinDebug\n*F\n+ 1 CameraBottomChooseComp.kt\ncom/yalla/yalla/module/media/camera/CameraBottomChooseCompKt$CameraBottomChooseLayout$1$1\n*L\n80#1:167\n*E\n"})
    public static final class OooO00o extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Dp> f46462OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Density f46463OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Density density, MutableState mutableState) {
            super(1);
            this.f46462OooO0Oo = mutableState;
            this.f46463OooO0o0 = density;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutCoordinates layoutCoordinates) {
            LayoutCoordinates coordinates = layoutCoordinates;
            Intrinsics.checkNotNullParameter(coordinates, "coordinates");
            MutableState<Dp> mutableState = this.f46462OooO0Oo;
            if (Dp.m3770equalsimpl0(mutableState.getValue().m3779unboximpl(), Dp.m3765constructorimpl(0))) {
                mutableState.setValue(Dp.m3763boximpl(this.f46463OooO0o0.mo321toDpu2uoSUM((int) Size.m1505getWidthimpl(IntSizeKt.m3935toSizeozmzZPI(coordinates.mo2801getSizeYbymL2g())))));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CameraViewModel f46464OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(CameraViewModel cameraViewModel) {
            super(0);
            this.f46464OooO0Oo = cameraViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            CameraViewModel cameraViewModel = this.f46464OooO0Oo;
            if (!cameraViewModel.OooO()) {
                o0OO000.OooO00o("106078");
                cameraViewModel.f24235OooOOOO.setValue(Boolean.TRUE);
                Oooo000.f46496OooO0O0.OooO0O0("showTakePicture", true);
                cameraViewModel.OooO0O0();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CameraViewModel f46465OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(CameraViewModel cameraViewModel) {
            super(0);
            this.f46465OooO0Oo = cameraViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            CameraViewModel cameraViewModel = this.f46465OooO0Oo;
            if (!cameraViewModel.OooO0OO()) {
                o000O00O.OooO0O0(o0000.OooO0OO(p450o0Ooo00.OooO.moment_send_page_only_add_photo));
            } else if (cameraViewModel.OooO()) {
                o0OO000.OooO00o("106079");
                cameraViewModel.f24235OooOOOO.setValue(Boolean.FALSE);
                Oooo000.f46496OooO0O0.OooO0O0("showTakePicture", false);
                cameraViewModel.OooO0O0();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CameraViewModel f46466OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f46467OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Bundle f46468OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(CameraViewModel cameraViewModel, Bundle bundle, int i) {
            super(2);
            this.f46466OooO0Oo = cameraViewModel;
            this.f46468OooO0o0 = bundle;
            this.f46467OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f46467OooO0o | 1);
            OooOo00.OooO00o(this.f46466OooO0Oo, this.f46468OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nCameraBottomChooseComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraBottomChooseComp.kt\ncom/yalla/yalla/module/media/camera/CameraBottomChooseCompKt$CommonTextComp$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,166:1\n154#2:167\n*S KotlinDebug\n*F\n+ 1 CameraBottomChooseComp.kt\ncom/yalla/yalla/module/media/camera/CameraBottomChooseCompKt$CommonTextComp$1$1\n*L\n136#1:167\n*E\n"})
    public static final class OooOO0 extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Dp> f46469OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Density f46470OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(Density density, MutableState mutableState) {
            super(1);
            this.f46469OooO0Oo = mutableState;
            this.f46470OooO0o0 = density;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutCoordinates layoutCoordinates) {
            LayoutCoordinates coordinates = layoutCoordinates;
            Intrinsics.checkNotNullParameter(coordinates, "coordinates");
            MutableState<Dp> mutableState = this.f46469OooO0Oo;
            if (Dp.m3770equalsimpl0(mutableState.getValue().m3779unboximpl(), Dp.m3765constructorimpl(0))) {
                mutableState.setValue(Dp.m3763boximpl(this.f46470OooO0o0.mo321toDpu2uoSUM((int) Size.m1505getWidthimpl(IntSizeKt.m3935toSizeozmzZPI(coordinates.mo2801getSizeYbymL2g())))));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f46471OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Dp> f46472OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f46473OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f46474OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f46475OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(Modifier modifier, String str, MutableState<Dp> mutableState, boolean z, int i) {
            super(2);
            this.f46471OooO0Oo = modifier;
            this.f46473OooO0o0 = str;
            this.f46472OooO0o = mutableState;
            this.f46474OooO0oO = z;
            this.f46475OooO0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooOo00.OooO0O0(this.f46471OooO0Oo, this.f46473OooO0o0, this.f46472OooO0o, this.f46474OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f46475OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull CameraViewModel viewModel, @NotNull Bundle params, @Nullable Composer composer, int i) {
        float fM3765constructorimpl;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(params, "params");
        Composer composerStartRestartGroup = composer.startRestartGroup(-533376032);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-533376032, i, -1, "com.yalla.yalla.module.media.camera.CameraBottomChooseLayout (CameraBottomChooseComp.kt:48)");
        }
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m3763boximpl(Dp.m3765constructorimpl(0)), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m3763boximpl(Dp.m3765constructorimpl(0)), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) objRememberedValue2;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m3763boximpl(Dp.m3765constructorimpl(0)), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState3 = (MutableState) objRememberedValue3;
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState4 = (MutableState) objRememberedValue4;
        if (viewModel.OooO()) {
            float f = 2;
            fM3765constructorimpl = Dp.m3765constructorimpl(Dp.m3765constructorimpl(((Dp) mutableState3.getValue()).m3779unboximpl() / f) - Dp.m3765constructorimpl(((Dp) mutableState.getValue()).m3779unboximpl() / f));
        } else {
            float f2 = 2;
            fM3765constructorimpl = Dp.m3765constructorimpl(Dp.m3765constructorimpl(Dp.m3765constructorimpl(((Dp) mutableState3.getValue()).m3779unboximpl() / f2) - Dp.m3765constructorimpl(((Dp) mutableState2.getValue()).m3779unboximpl() / f2)) - ((Dp) mutableState.getValue()).m3779unboximpl());
        }
        AnimationSpec animationSpecTween$default = ((Boolean) mutableState4.getValue()).booleanValue() ? AnimationSpecKt.tween$default(0, 0, null, 6, null) : AnimationSpecKt.spring$default(0.0f, 0.0f, Dp.m3763boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Dp.INSTANCE)), 3, null);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(mutableState4);
        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new OooO(mutableState4);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
        }
        composerStartRestartGroup.endReplaceableGroup();
        State<Dp> stateM70animateDpAsStateAjpBEmI = AnimateAsStateKt.m70animateDpAsStateAjpBEmI(fM3765constructorimpl, animationSpecTween$default, "", (Function1) objRememberedValue5, composerStartRestartGroup, 448, 0);
        Modifier modifierM169backgroundbw27NRU$default = o000O0O0.f55880OooO00o.getValue().booleanValue() ? BackgroundKt.m169backgroundbw27NRU$default(Modifier.INSTANCE, Color.INSTANCE.m1696getBlack0d7_KjU(), null, 2, null) : o0O0O00.OooO0OO(Modifier.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m1660boximpl(o0oO0O0o.f46945OooO00o), Color.m1660boximpl(o0oO0O0o.f46969OooOoO0)}), RectangleShapeKt.getRectangleShape(), true);
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(511388516);
        boolean zChanged2 = composerStartRestartGroup.changed(mutableState3) | composerStartRestartGroup.changed(density);
        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = new OooO00o(density, mutableState3);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierThen = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierFillMaxSize$default, (Function1) objRememberedValue6).then(modifierM169backgroundbw27NRU$default);
        float f3 = 0;
        Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(modifierThen, Dp.m3764compareTo0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3779unboximpl(), Dp.m3765constructorimpl(f3)) < 0 ? Dp.m3765constructorimpl(f3) : stateM70animateDpAsStateAjpBEmI.getValue().m3779unboximpl(), 0.0f, 0.0f, 0.0f, 14, null);
        Dp.m3770equalsimpl0(stateM70animateDpAsStateAjpBEmI.getValue().m3779unboximpl(), Dp.m3765constructorimpl(f3));
        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(Alignment.INSTANCE, start, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM480paddingqDBjuR0$default);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(2070009002);
        if (!((viewModel.OooO() || viewModel.OooO0oo().f24254OooO0oO.getValue() == CameraViewModel.VideoRecordState.IDLE) ? false : true)) {
            composerStartRestartGroup.startReplaceableGroup(-649021819);
            if (viewModel.OooO0Oo()) {
                OooO0O0(ClickableKt.m202clickableXHw0xAI$default(companion2, false, null, null, new OooO0O0(viewModel), 7, null), StringResources_androidKt.stringResource(p450o0Ooo00.OooO.Photo, composerStartRestartGroup, 0), mutableState, viewModel.OooO(), composerStartRestartGroup, 384);
            }
            composerStartRestartGroup.endReplaceableGroup();
            OooO0O0(o0O0O00.OooO0O0(companion2, false, false, 0L, false, null, null, null, new OooO0OO(viewModel), 253), StringResources_androidKt.stringResource(p450o0Ooo00.OooO.Video, composerStartRestartGroup, 0), mutableState2, !viewModel.OooO(), composerStartRestartGroup, 384);
        }
        if (OooOo.OooO0o.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(viewModel, params, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(Modifier modifier, String str, MutableState<Dp> mutableState, boolean z, Composer composer, int i) {
        int i2;
        long jM1707getWhite0d7_KjU;
        Composer composerStartRestartGroup = composer.startRestartGroup(91268648);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(mutableState) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i2 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(91268648, i2, -1, "com.yalla.yalla.module.media.camera.CommonTextComp (CameraBottomChooseComp.kt:129)");
            }
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Modifier.Companion companion = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(density);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OooOO0(density, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierThen = OnGloballyPositionedModifierKt.onGloballyPositioned(companion, (Function1) objRememberedValue).then(modifier);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO0O0 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO0O0, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (z) {
                jM1707getWhite0d7_KjU = Color.INSTANCE.m1707getWhite0d7_KjU();
            } else {
                int i3 = o0oO0O0o.f47152o00OOOo;
                jM1707getWhite0d7_KjU = o0oO0O0o.f46990OoooOO0;
            }
            TextKt.m1251Text4IGK_g(str, PaddingKt.m478paddingVpY3zN4$default(PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, Dp.m3765constructorimpl((float) 18.5d), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(20), 0.0f, 2, null), jM1707getWhite0d7_KjU, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i2 >> 3) & 14) | 3120, 0, 131056);
            composerStartRestartGroup.startReplaceableGroup(-1919818553);
            if (z) {
                SpacerKt.Spacer(BackgroundKt.m169backgroundbw27NRU$default(ClipKt.clip(SizeKt.m509height3ABfNKs(SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, Dp.m3765constructorimpl(4), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(6)), Dp.m3765constructorimpl(2)), RoundedCornerShapeKt.getCircleShape()), Color.INSTANCE.m1707getWhite0d7_KjU(), null, 2, null), composerStartRestartGroup, 0);
            }
            if (OooOo.OooO0o.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(modifier, str, mutableState, z, i));
    }
}
