package p516o0o0O0OO;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooOO0;
import androidx.compose.animation.OooOOOO;
import androidx.compose.animation.OooOo00;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.yalla.yalla.ui.composable.room.SoundRippleAnimationType;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p018OooOoo0.OooOOO;
import p469o0OoooOO.o0oO0O0o;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nSoundRippleComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SoundRippleComp.kt\ncom/yalla/yalla/ui/composable/room/SoundRippleComp\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,125:1\n25#2:126\n25#2:133\n25#2:140\n25#2:147\n25#2:154\n25#2:165\n25#2:176\n25#2:183\n456#2,8:207\n464#2,3:221\n467#2,3:225\n1097#3,6:127\n1097#3,6:134\n1097#3,6:141\n1097#3,6:148\n1097#3,6:155\n1097#3,3:166\n1100#3,3:172\n1097#3,6:177\n1097#3,6:184\n486#4,4:161\n490#4,2:169\n494#4:175\n486#5:171\n66#6,6:190\n72#6:224\n76#6:229\n78#7,11:196\n91#7:228\n4144#8,6:215\n81#9:230\n107#9,2:231\n81#9:233\n107#9,2:234\n81#9:236\n107#9,2:237\n81#9:239\n107#9,2:240\n81#9:242\n*S KotlinDebug\n*F\n+ 1 SoundRippleComp.kt\ncom/yalla/yalla/ui/composable/room/SoundRippleComp\n*L\n42#1:126\n43#1:133\n44#1:140\n46#1:147\n47#1:154\n49#1:165\n50#1:176\n52#1:183\n90#1:207,8\n90#1:221,3\n90#1:225,3\n42#1:127,6\n43#1:134,6\n44#1:141,6\n46#1:148,6\n47#1:155,6\n49#1:166,3\n49#1:172,3\n50#1:177,6\n52#1:184,6\n49#1:161,4\n49#1:169,2\n49#1:175\n49#1:171\n90#1:190,6\n90#1:224\n90#1:229\n90#1:196,11\n90#1:228\n90#1:215,6\n43#1:230\n43#1:231,2\n44#1:233\n44#1:234,2\n46#1:236\n46#1:237,2\n50#1:239\n50#1:240,2\n93#1:242\n*E\n"})
public final class o0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0000 f51866OooO00o = new o0000();

    public static final class OooO00o extends Lambda implements Function1<SoundRippleAnimationType, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Float> f51867OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f51868OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<SoundRippleAnimationType> f51869OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Job> f51870OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Animatable<Float, AnimationVector1D> f51871OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Color> f51872OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ List<Float> f51873OooOO0;

        /* JADX INFO: renamed from: o0o0O0OO.o0000$OooO00o$OooO00o, reason: collision with other inner class name */
        public /* synthetic */ class C0498OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SoundRippleAnimationType.values().length];
                try {
                    iArr[SoundRippleAnimationType.DEFAULT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SoundRippleAnimationType.MAGIC_CARD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SoundRippleAnimationType.PREMIUM.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(CoroutineScope coroutineScope, MutableState<Job> mutableState, MutableState<SoundRippleAnimationType> mutableState2, Animatable<Float, AnimationVector1D> animatable, MutableState<Color> mutableState3, MutableState<Float> mutableState4, List<Float> list) {
            super(1);
            this.f51868OooO0Oo = coroutineScope;
            this.f51870OooO0o0 = mutableState;
            this.f51869OooO0o = mutableState2;
            this.f51871OooO0oO = animatable;
            this.f51872OooO0oo = mutableState3;
            this.f51867OooO = mutableState4;
            this.f51873OooOO0 = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SoundRippleAnimationType soundRippleAnimationType) {
            Job jobLaunch$default;
            SoundRippleAnimationType type = soundRippleAnimationType;
            Intrinsics.checkNotNullParameter(type, "type");
            MutableState<Job> mutableState = this.f51870OooO0o0;
            if (mutableState.getValue() == null) {
                this.f51869OooO0o.setValue(type);
                int i = C0498OooO00o.$EnumSwitchMapping$0[type.ordinal()];
                MutableState<Color> mutableState2 = this.f51872OooO0oo;
                Animatable<Float, AnimationVector1D> animatable = this.f51871OooO0oO;
                if (i == 1) {
                    jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(this.f51868OooO0Oo, null, null, new o00000O(animatable, mutableState2, mutableState, null), 3, null);
                } else if (i == 2) {
                    jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(this.f51868OooO0Oo, null, null, new o00000OO(animatable, mutableState2, mutableState, null), 3, null);
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(this.f51868OooO0Oo, null, null, new o0000Ooo(this.f51867OooO, this.f51873OooOO0, mutableState, null), 3, null);
                }
                mutableState.setValue(jobLaunch$default);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Animatable<Float, AnimationVector1D> f51874OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Color> f51875OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Animatable<Float, AnimationVector1D> animatable, MutableState<Color> mutableState) {
            super(1);
            this.f51874OooO0Oo = animatable;
            this.f51875OooO0o0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DrawScope drawScope) {
            DrawScope Canvas = drawScope;
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            Animatable<Float, AnimationVector1D> animatable = this.f51874OooO0Oo;
            if (animatable.getValue().floatValue() > 0.0f) {
                float f = 2;
                float fM1505getWidthimpl = Size.m1505getWidthimpl(Canvas.mo2108getSizeNHjbRc()) / f;
                float fM1505getWidthimpl2 = (Size.m1505getWidthimpl(Canvas.mo2108getSizeNHjbRc()) * 0.7f) / 2.0f;
                float f2 = fM1505getWidthimpl - fM1505getWidthimpl2;
                float f3 = f2 / f;
                float fFloatValue = (animatable.getValue().floatValue() * 5.0f * f3) + fM1505getWidthimpl2;
                for (int i = 0; i < 4; i++) {
                    float f4 = fFloatValue - (i * f3);
                    float f5 = 1 - ((f4 - fM1505getWidthimpl2) / f2);
                    if (fM1505getWidthimpl2 <= f4 && f4 <= fM1505getWidthimpl) {
                        androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, Color.m1669copywmQWz5c$default(this.f51875OooO0o0.getValue().m1680unboximpl(), RangesKt.coerceIn(f5, 0.0f, 1.0f), 0.0f, 0.0f, 0.0f, 14, null), f4, 0L, 0.0f, null, null, 0, 124, null);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<Function1<? super SoundRippleAnimationType, Unit>, Unit> f51877OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Modifier f51878OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f51879OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f51880OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(Modifier modifier, Function1<? super Function1<? super SoundRippleAnimationType, Unit>, Unit> function1, int i, int i2) {
            super(2);
            this.f51878OooO0o0 = modifier;
            this.f51877OooO0o = function1;
            this.f51879OooO0oO = i;
            this.f51880OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0000.this.OooO00o(this.f51878OooO0o0, this.f51877OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f51879OooO0oO | 1), this.f51880OooO0oo);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable Modifier modifier, @NotNull Function1<? super Function1<? super SoundRippleAnimationType, Unit>, Unit> animationLauncher, @Nullable Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Intrinsics.checkNotNullParameter(animationLauncher, "animationLauncher");
        Composer composerStartRestartGroup = composer.startRestartGroup(-83607944);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(animationLauncher) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-83607944, i, -1, "com.yalla.yalla.ui.composable.room.SoundRippleComp.SoundRipple (SoundRippleComp.kt:36)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Animatable animatable = (Animatable) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Color.m1660boximpl(o0oO0O0o.f46946OooO0O0), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue2;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(SoundRippleAnimationType.DEFAULT, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) objRememberedValue3;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState3 = (MutableState) objRememberedValue4;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(1.0f), Float.valueOf(0.75f), Float.valueOf(1.0f), Float.valueOf(0.72f)});
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            List list = (List) objRememberedValue5;
            Object objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
            if (objOooO00o == companion.getEmpty()) {
                objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objOooO00o, composerStartRestartGroup, -492369756);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState4 = (MutableState) objRememberedValue6;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            if (composerStartRestartGroup.rememberedValue() == companion.getEmpty()) {
                OooO00o oooO00o = new OooO00o(coroutineScopeOooO00o, mutableState4, mutableState2, animatable, mutableState, mutableState3, list);
                animationLauncher.invoke(oooO00o);
                composerStartRestartGroup.updateRememberedValue(oooO00o);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierClipToBounds = ClipKt.clipToBounds(modifier3);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(Alignment.INSTANCE, r15, composerStartRestartGroup, r15, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, r15);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierClipToBounds);
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
            Function2 function2OooO00o = OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(r15, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (((SoundRippleAnimationType) mutableState2.getValue()) == SoundRippleAnimationType.PREMIUM) {
                composerStartRestartGroup.startReplaceableGroup(-742336525);
                if (((Number) mutableState3.getValue()).floatValue() > 0.0f) {
                    ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.room_mic_view, composerStartRestartGroup, 0), (String) null, boxScopeInstance.matchParentSize(ScaleKt.scale(Modifier.INSTANCE, AnimateAsStateKt.animateFloatAsState(((Number) mutableState3.getValue()).floatValue(), AnimationSpecKt.tween$default(200, r15, EasingKt.getFastOutLinearInEasing(), 2, null), 0.0f, "", null, composerStartRestartGroup, 3072, 20).getValue().floatValue())), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                }
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-742335893);
                CanvasKt.Canvas(boxScopeInstance.matchParentSize(Modifier.INSTANCE), new OooO0O0(animatable, mutableState), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(modifier3, animationLauncher, i, i2));
    }
}
