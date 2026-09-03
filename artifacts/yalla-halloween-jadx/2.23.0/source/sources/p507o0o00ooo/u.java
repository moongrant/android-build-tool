package p507o0o00ooo;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.zego.zegoliveroom.constants.ZegoConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nDashContainerComposable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DashContainerComposable.kt\ncom/yalla/yalla/ui/composable/common/DashContainerComposable\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n154#2:55\n154#2:56\n154#2:57\n154#2:58\n76#3:59\n76#3:61\n76#3:62\n76#3:63\n1#4:60\n*S KotlinDebug\n*F\n+ 1 DashContainerComposable.kt\ncom/yalla/yalla/ui/composable/common/DashContainerComposable\n*L\n26#1:55\n27#1:56\n28#1:57\n29#1:58\n33#1:59\n36#1:61\n37#1:62\n41#1:63\n*E\n"})
public final class u {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final u f50265OooO00o = new u();

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f50266OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ float f50267OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f50268OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f50269OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Stroke f50270OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Function2<? super Composer, ? super Integer, Unit> function2, int i, float f, long j, Stroke stroke) {
            super(2);
            this.f50266OooO0Oo = function2;
            this.f50268OooO0o0 = i;
            this.f50267OooO0o = f;
            this.f50269OooO0oO = j;
            this.f50270OooO0oo = stroke;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-433690282, iIntValue, -1, "com.yalla.yalla.ui.composable.common.DashContainerComposable.DashContainer.<anonymous> (DashContainerComposable.kt:44)");
                }
                this.f50266OooO0Oo.invoke(composer2, Integer.valueOf((this.f50268OooO0o0 >> 18) & 14));
                CanvasKt.Canvas(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), new t(this.f50267OooO0o, this.f50269OooO0oO, this.f50270OooO0oo), composer2, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ float f50271OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f50273OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Modifier f50274OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ float f50275OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ float f50276OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ float f50277OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f50278OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ int f50279OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ int f50280OooOOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Modifier modifier, long j, float f, float f2, float f3, float f4, Function2<? super Composer, ? super Integer, Unit> function2, int i, int i2) {
            super(2);
            this.f50274OooO0o0 = modifier;
            this.f50273OooO0o = j;
            this.f50275OooO0oO = f;
            this.f50276OooO0oo = f2;
            this.f50271OooO = f3;
            this.f50277OooOO0 = f4;
            this.f50278OooOO0O = function2;
            this.f50279OooOO0o = i;
            this.f50280OooOOO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            u.this.OooO00o(this.f50274OooO0o0, this.f50273OooO0o, this.f50275OooO0oO, this.f50276OooO0oo, this.f50271OooO, this.f50277OooOO0, this.f50278OooOO0O, composer, RecomposeScopeImplKt.updateChangedFlags(this.f50279OooOO0o | 1), this.f50280OooOOO0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:86:0x0102  */
    /* JADX WARN: Code duplicated, block: B:88:0x010c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0116  */
    /* JADX WARN: Code duplicated, block: B:91:0x011e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0126  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d7  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public final void OooO00o(@NotNull Modifier modifier, long j, float f, float f2, float f3, float f4, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i, int i2) {
        int i3;
        float fM3765constructorimpl;
        int i4;
        float fM3765constructorimpl2;
        int i5;
        int i6;
        float fM3765constructorimpl3;
        int i7;
        int i8;
        int i9;
        int i10;
        float fM3765constructorimpl4;
        float f5;
        float f6;
        float f7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1853729262);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 == 0) {
            if ((i & 896) == 0) {
                fM3765constructorimpl = f;
                i3 |= composerStartRestartGroup.changed(fM3765constructorimpl) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    fM3765constructorimpl2 = f2;
                    if (composerStartRestartGroup.changed(fM3765constructorimpl2)) {
                        i5 = 2048;
                    } else {
                        i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((57344 & i) == 0) {
                        fM3765constructorimpl3 = f3;
                        if (composerStartRestartGroup.changed(fM3765constructorimpl3)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        i3 |= 196608;
                    } else if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changed(f4)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i10 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((i3 & 2995931) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        if (i11 != 0) {
                            fM3765constructorimpl = Dp.m3765constructorimpl(1);
                        }
                        if (i4 != 0) {
                            fM3765constructorimpl2 = Dp.m3765constructorimpl(9);
                        }
                        if (i6 != 0) {
                            fM3765constructorimpl3 = Dp.m3765constructorimpl(10);
                        }
                        if (i8 != 0) {
                            fM3765constructorimpl4 = Dp.m3765constructorimpl(6);
                        } else {
                            fM3765constructorimpl4 = f4;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1853729262, i3, -1, "com.yalla.yalla.ui.composable.common.DashContainerComposable.DashContainer (DashContainerComposable.kt:22)");
                        }
                        int i12 = i3;
                        float f8 = fM3765constructorimpl3;
                        float f9 = fM3765constructorimpl;
                        float f10 = fM3765constructorimpl4;
                        float f11 = fM3765constructorimpl2;
                        SurfaceKt.m1185SurfaceFjzlyU(modifier, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(fM3765constructorimpl4), 0L, 0L, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -433690282, true, new OooO00o(content, i12, ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl4), j, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl), 0.0f, 0, 0, PathEffect.INSTANCE.dashPathEffect(new float[]{((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl2), ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl3)}, 0.0f), 14, null))), composerStartRestartGroup, (i12 & 14) | 1572864, 60);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f5 = f8;
                        f6 = f10;
                        f7 = f9;
                        fM3765constructorimpl2 = f11;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        f7 = fM3765constructorimpl;
                        f5 = fM3765constructorimpl3;
                        f6 = f4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(modifier, j, f7, fM3765constructorimpl2, f5, f6, content, i, i2));
                }
                i3 |= 24576;
                fM3765constructorimpl3 = f3;
                i8 = i2 & 32;
                if (i8 != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(f4)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i10 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((i3 & 2995931) == 599186) {
                    if (i11 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(1);
                    }
                    if (i4 != 0) {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(9);
                    }
                    if (i6 != 0) {
                        fM3765constructorimpl3 = Dp.m3765constructorimpl(10);
                    }
                    if (i8 != 0) {
                        fM3765constructorimpl4 = Dp.m3765constructorimpl(6);
                    } else {
                        fM3765constructorimpl4 = f4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1853729262, i3, -1, "com.yalla.yalla.ui.composable.common.DashContainerComposable.DashContainer (DashContainerComposable.kt:22)");
                    }
                    int i13 = i3;
                    float f12 = fM3765constructorimpl3;
                    float f13 = fM3765constructorimpl;
                    float f14 = fM3765constructorimpl4;
                    float f15 = fM3765constructorimpl2;
                    SurfaceKt.m1185SurfaceFjzlyU(modifier, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(fM3765constructorimpl4), 0L, 0L, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -433690282, true, new OooO00o(content, i13, ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl4), j, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl), 0.0f, 0, 0, PathEffect.INSTANCE.dashPathEffect(new float[]{((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl2), ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl3)}, 0.0f), 14, null))), composerStartRestartGroup, (i13 & 14) | 1572864, 60);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f5 = f12;
                    f6 = f14;
                    f7 = f13;
                    fM3765constructorimpl2 = f15;
                } else {
                    if (i11 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(1);
                    }
                    if (i4 != 0) {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(9);
                    }
                    if (i6 != 0) {
                        fM3765constructorimpl3 = Dp.m3765constructorimpl(10);
                    }
                    if (i8 != 0) {
                        fM3765constructorimpl4 = Dp.m3765constructorimpl(6);
                    } else {
                        fM3765constructorimpl4 = f4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1853729262, i3, -1, "com.yalla.yalla.ui.composable.common.DashContainerComposable.DashContainer (DashContainerComposable.kt:22)");
                    }
                    int i14 = i3;
                    float f16 = fM3765constructorimpl3;
                    float f17 = fM3765constructorimpl;
                    float f18 = fM3765constructorimpl4;
                    float f19 = fM3765constructorimpl2;
                    SurfaceKt.m1185SurfaceFjzlyU(modifier, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(fM3765constructorimpl4), 0L, 0L, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -433690282, true, new OooO00o(content, i14, ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl4), j, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl), 0.0f, 0, 0, PathEffect.INSTANCE.dashPathEffect(new float[]{((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl2), ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl3)}, 0.0f), 14, null))), composerStartRestartGroup, (i14 & 14) | 1572864, 60);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f5 = f16;
                    f6 = f18;
                    f7 = f17;
                    fM3765constructorimpl2 = f19;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(modifier, j, f7, fM3765constructorimpl2, f5, f6, content, i, i2));
            }
            i3 |= 3072;
            fM3765constructorimpl2 = f2;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((57344 & i) == 0) {
                    fM3765constructorimpl3 = f3;
                    if (composerStartRestartGroup.changed(fM3765constructorimpl3)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(f4)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i10 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((i3 & 2995931) == 599186) {
                    if (i11 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(1);
                    }
                    if (i4 != 0) {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(9);
                    }
                    if (i6 != 0) {
                        fM3765constructorimpl3 = Dp.m3765constructorimpl(10);
                    }
                    if (i8 != 0) {
                        fM3765constructorimpl4 = Dp.m3765constructorimpl(6);
                    } else {
                        fM3765constructorimpl4 = f4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1853729262, i3, -1, "com.yalla.yalla.ui.composable.common.DashContainerComposable.DashContainer (DashContainerComposable.kt:22)");
                    }
                    int i15 = i3;
                    float f110 = fM3765constructorimpl3;
                    float f111 = fM3765constructorimpl;
                    float f112 = fM3765constructorimpl4;
                    float f113 = fM3765constructorimpl2;
                    SurfaceKt.m1185SurfaceFjzlyU(modifier, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(fM3765constructorimpl4), 0L, 0L, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -433690282, true, new OooO00o(content, i15, ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl4), j, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl), 0.0f, 0, 0, PathEffect.INSTANCE.dashPathEffect(new float[]{((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl2), ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl3)}, 0.0f), 14, null))), composerStartRestartGroup, (i15 & 14) | 1572864, 60);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f5 = f110;
                    f6 = f112;
                    f7 = f111;
                    fM3765constructorimpl2 = f113;
                } else {
                    if (i11 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(1);
                    }
                    if (i4 != 0) {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(9);
                    }
                    if (i6 != 0) {
                        fM3765constructorimpl3 = Dp.m3765constructorimpl(10);
                    }
                    if (i8 != 0) {
                        fM3765constructorimpl4 = Dp.m3765constructorimpl(6);
                    } else {
                        fM3765constructorimpl4 = f4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1853729262, i3, -1, "com.yalla.yalla.ui.composable.common.DashContainerComposable.DashContainer (DashContainerComposable.kt:22)");
                    }
                    int i16 = i3;
                    float f114 = fM3765constructorimpl3;
                    float f115 = fM3765constructorimpl;
                    float f116 = fM3765constructorimpl4;
                    float f117 = fM3765constructorimpl2;
                    SurfaceKt.m1185SurfaceFjzlyU(modifier, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(fM3765constructorimpl4), 0L, 0L, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -433690282, true, new OooO00o(content, i16, ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl4), j, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl), 0.0f, 0, 0, PathEffect.INSTANCE.dashPathEffect(new float[]{((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl2), ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl3)}, 0.0f), 14, null))), composerStartRestartGroup, (i16 & 14) | 1572864, 60);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f5 = f114;
                    f6 = f116;
                    f7 = f115;
                    fM3765constructorimpl2 = f117;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(modifier, j, f7, fM3765constructorimpl2, f5, f6, content, i, i2));
            }
            i3 |= 24576;
            fM3765constructorimpl3 = f3;
            i8 = i2 & 32;
            if (i8 != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(f4)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i10 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
            if ((i3 & 2995931) == 599186) {
                if (i11 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(1);
                }
                if (i4 != 0) {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(9);
                }
                if (i6 != 0) {
                    fM3765constructorimpl3 = Dp.m3765constructorimpl(10);
                }
                if (i8 != 0) {
                    fM3765constructorimpl4 = Dp.m3765constructorimpl(6);
                } else {
                    fM3765constructorimpl4 = f4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1853729262, i3, -1, "com.yalla.yalla.ui.composable.common.DashContainerComposable.DashContainer (DashContainerComposable.kt:22)");
                }
                int i17 = i3;
                float f118 = fM3765constructorimpl3;
                float f119 = fM3765constructorimpl;
                float f1110 = fM3765constructorimpl4;
                float f1111 = fM3765constructorimpl2;
                SurfaceKt.m1185SurfaceFjzlyU(modifier, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(fM3765constructorimpl4), 0L, 0L, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -433690282, true, new OooO00o(content, i17, ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl4), j, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl), 0.0f, 0, 0, PathEffect.INSTANCE.dashPathEffect(new float[]{((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl2), ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl3)}, 0.0f), 14, null))), composerStartRestartGroup, (i17 & 14) | 1572864, 60);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f5 = f118;
                f6 = f1110;
                f7 = f119;
                fM3765constructorimpl2 = f1111;
            } else {
                if (i11 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(1);
                }
                if (i4 != 0) {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(9);
                }
                if (i6 != 0) {
                    fM3765constructorimpl3 = Dp.m3765constructorimpl(10);
                }
                if (i8 != 0) {
                    fM3765constructorimpl4 = Dp.m3765constructorimpl(6);
                } else {
                    fM3765constructorimpl4 = f4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1853729262, i3, -1, "com.yalla.yalla.ui.composable.common.DashContainerComposable.DashContainer (DashContainerComposable.kt:22)");
                }
                int i18 = i3;
                float f1112 = fM3765constructorimpl3;
                float f1113 = fM3765constructorimpl;
                float f1114 = fM3765constructorimpl4;
                float f1115 = fM3765constructorimpl2;
                SurfaceKt.m1185SurfaceFjzlyU(modifier, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(fM3765constructorimpl4), 0L, 0L, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -433690282, true, new OooO00o(content, i18, ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl4), j, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl), 0.0f, 0, 0, PathEffect.INSTANCE.dashPathEffect(new float[]{((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl2), ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl3)}, 0.0f), 14, null))), composerStartRestartGroup, (i18 & 14) | 1572864, 60);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f5 = f1112;
                f6 = f1114;
                f7 = f1113;
                fM3765constructorimpl2 = f1115;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(modifier, j, f7, fM3765constructorimpl2, f5, f6, content, i, i2));
        }
        i3 |= 384;
        fM3765constructorimpl = f;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                fM3765constructorimpl2 = f2;
                if (composerStartRestartGroup.changed(fM3765constructorimpl2)) {
                    i5 = 2048;
                } else {
                    i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((57344 & i) == 0) {
                    fM3765constructorimpl3 = f3;
                    if (composerStartRestartGroup.changed(fM3765constructorimpl3)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(f4)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i10 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((i3 & 2995931) == 599186) {
                    if (i11 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(1);
                    }
                    if (i4 != 0) {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(9);
                    }
                    if (i6 != 0) {
                        fM3765constructorimpl3 = Dp.m3765constructorimpl(10);
                    }
                    if (i8 != 0) {
                        fM3765constructorimpl4 = Dp.m3765constructorimpl(6);
                    } else {
                        fM3765constructorimpl4 = f4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1853729262, i3, -1, "com.yalla.yalla.ui.composable.common.DashContainerComposable.DashContainer (DashContainerComposable.kt:22)");
                    }
                    int i19 = i3;
                    float f1116 = fM3765constructorimpl3;
                    float f1117 = fM3765constructorimpl;
                    float f1118 = fM3765constructorimpl4;
                    float f1119 = fM3765constructorimpl2;
                    SurfaceKt.m1185SurfaceFjzlyU(modifier, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(fM3765constructorimpl4), 0L, 0L, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -433690282, true, new OooO00o(content, i19, ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl4), j, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl), 0.0f, 0, 0, PathEffect.INSTANCE.dashPathEffect(new float[]{((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl2), ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl3)}, 0.0f), 14, null))), composerStartRestartGroup, (i19 & 14) | 1572864, 60);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f5 = f1116;
                    f6 = f1118;
                    f7 = f1117;
                    fM3765constructorimpl2 = f1119;
                } else {
                    if (i11 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(1);
                    }
                    if (i4 != 0) {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(9);
                    }
                    if (i6 != 0) {
                        fM3765constructorimpl3 = Dp.m3765constructorimpl(10);
                    }
                    if (i8 != 0) {
                        fM3765constructorimpl4 = Dp.m3765constructorimpl(6);
                    } else {
                        fM3765constructorimpl4 = f4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1853729262, i3, -1, "com.yalla.yalla.ui.composable.common.DashContainerComposable.DashContainer (DashContainerComposable.kt:22)");
                    }
                    int i110 = i3;
                    float f11110 = fM3765constructorimpl3;
                    float f11111 = fM3765constructorimpl;
                    float f11112 = fM3765constructorimpl4;
                    float f11113 = fM3765constructorimpl2;
                    SurfaceKt.m1185SurfaceFjzlyU(modifier, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(fM3765constructorimpl4), 0L, 0L, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -433690282, true, new OooO00o(content, i110, ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl4), j, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl), 0.0f, 0, 0, PathEffect.INSTANCE.dashPathEffect(new float[]{((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl2), ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl3)}, 0.0f), 14, null))), composerStartRestartGroup, (i110 & 14) | 1572864, 60);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f5 = f11110;
                    f6 = f11112;
                    f7 = f11111;
                    fM3765constructorimpl2 = f11113;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(modifier, j, f7, fM3765constructorimpl2, f5, f6, content, i, i2));
            }
            i3 |= 24576;
            fM3765constructorimpl3 = f3;
            i8 = i2 & 32;
            if (i8 != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(f4)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i10 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
            if ((i3 & 2995931) == 599186) {
                if (i11 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(1);
                }
                if (i4 != 0) {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(9);
                }
                if (i6 != 0) {
                    fM3765constructorimpl3 = Dp.m3765constructorimpl(10);
                }
                if (i8 != 0) {
                    fM3765constructorimpl4 = Dp.m3765constructorimpl(6);
                } else {
                    fM3765constructorimpl4 = f4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1853729262, i3, -1, "com.yalla.yalla.ui.composable.common.DashContainerComposable.DashContainer (DashContainerComposable.kt:22)");
                }
                int i111 = i3;
                float f11114 = fM3765constructorimpl3;
                float f11115 = fM3765constructorimpl;
                float f11116 = fM3765constructorimpl4;
                float f11117 = fM3765constructorimpl2;
                SurfaceKt.m1185SurfaceFjzlyU(modifier, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(fM3765constructorimpl4), 0L, 0L, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -433690282, true, new OooO00o(content, i111, ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl4), j, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl), 0.0f, 0, 0, PathEffect.INSTANCE.dashPathEffect(new float[]{((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl2), ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl3)}, 0.0f), 14, null))), composerStartRestartGroup, (i111 & 14) | 1572864, 60);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f5 = f11114;
                f6 = f11116;
                f7 = f11115;
                fM3765constructorimpl2 = f11117;
            } else {
                if (i11 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(1);
                }
                if (i4 != 0) {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(9);
                }
                if (i6 != 0) {
                    fM3765constructorimpl3 = Dp.m3765constructorimpl(10);
                }
                if (i8 != 0) {
                    fM3765constructorimpl4 = Dp.m3765constructorimpl(6);
                } else {
                    fM3765constructorimpl4 = f4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1853729262, i3, -1, "com.yalla.yalla.ui.composable.common.DashContainerComposable.DashContainer (DashContainerComposable.kt:22)");
                }
                int i112 = i3;
                float f11118 = fM3765constructorimpl3;
                float f11119 = fM3765constructorimpl;
                float f111110 = fM3765constructorimpl4;
                float f111111 = fM3765constructorimpl2;
                SurfaceKt.m1185SurfaceFjzlyU(modifier, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(fM3765constructorimpl4), 0L, 0L, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -433690282, true, new OooO00o(content, i112, ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl4), j, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl), 0.0f, 0, 0, PathEffect.INSTANCE.dashPathEffect(new float[]{((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl2), ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl3)}, 0.0f), 14, null))), composerStartRestartGroup, (i112 & 14) | 1572864, 60);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f5 = f11118;
                f6 = f111110;
                f7 = f11119;
                fM3765constructorimpl2 = f111111;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(modifier, j, f7, fM3765constructorimpl2, f5, f6, content, i, i2));
        }
        i3 |= 3072;
        fM3765constructorimpl2 = f2;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((57344 & i) == 0) {
                fM3765constructorimpl3 = f3;
                if (composerStartRestartGroup.changed(fM3765constructorimpl3)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(f4)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i10 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
            if ((i3 & 2995931) == 599186) {
                if (i11 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(1);
                }
                if (i4 != 0) {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(9);
                }
                if (i6 != 0) {
                    fM3765constructorimpl3 = Dp.m3765constructorimpl(10);
                }
                if (i8 != 0) {
                    fM3765constructorimpl4 = Dp.m3765constructorimpl(6);
                } else {
                    fM3765constructorimpl4 = f4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1853729262, i3, -1, "com.yalla.yalla.ui.composable.common.DashContainerComposable.DashContainer (DashContainerComposable.kt:22)");
                }
                int i113 = i3;
                float f111112 = fM3765constructorimpl3;
                float f111113 = fM3765constructorimpl;
                float f111114 = fM3765constructorimpl4;
                float f111115 = fM3765constructorimpl2;
                SurfaceKt.m1185SurfaceFjzlyU(modifier, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(fM3765constructorimpl4), 0L, 0L, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -433690282, true, new OooO00o(content, i113, ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl4), j, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl), 0.0f, 0, 0, PathEffect.INSTANCE.dashPathEffect(new float[]{((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl2), ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl3)}, 0.0f), 14, null))), composerStartRestartGroup, (i113 & 14) | 1572864, 60);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f5 = f111112;
                f6 = f111114;
                f7 = f111113;
                fM3765constructorimpl2 = f111115;
            } else {
                if (i11 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(1);
                }
                if (i4 != 0) {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(9);
                }
                if (i6 != 0) {
                    fM3765constructorimpl3 = Dp.m3765constructorimpl(10);
                }
                if (i8 != 0) {
                    fM3765constructorimpl4 = Dp.m3765constructorimpl(6);
                } else {
                    fM3765constructorimpl4 = f4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1853729262, i3, -1, "com.yalla.yalla.ui.composable.common.DashContainerComposable.DashContainer (DashContainerComposable.kt:22)");
                }
                int i114 = i3;
                float f111116 = fM3765constructorimpl3;
                float f111117 = fM3765constructorimpl;
                float f111118 = fM3765constructorimpl4;
                float f111119 = fM3765constructorimpl2;
                SurfaceKt.m1185SurfaceFjzlyU(modifier, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(fM3765constructorimpl4), 0L, 0L, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -433690282, true, new OooO00o(content, i114, ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl4), j, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl), 0.0f, 0, 0, PathEffect.INSTANCE.dashPathEffect(new float[]{((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl2), ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl3)}, 0.0f), 14, null))), composerStartRestartGroup, (i114 & 14) | 1572864, 60);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f5 = f111116;
                f6 = f111118;
                f7 = f111117;
                fM3765constructorimpl2 = f111119;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(modifier, j, f7, fM3765constructorimpl2, f5, f6, content, i, i2));
        }
        i3 |= 24576;
        fM3765constructorimpl3 = f3;
        i8 = i2 & 32;
        if (i8 != 0) {
            i3 |= 196608;
        } else if ((i & 458752) == 0) {
            if (composerStartRestartGroup.changed(f4)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 3670016) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i10 = ZegoConstants.ErrorMask.RoomServerErrorMask;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        if ((i3 & 2995931) == 599186) {
            if (i11 != 0) {
                fM3765constructorimpl = Dp.m3765constructorimpl(1);
            }
            if (i4 != 0) {
                fM3765constructorimpl2 = Dp.m3765constructorimpl(9);
            }
            if (i6 != 0) {
                fM3765constructorimpl3 = Dp.m3765constructorimpl(10);
            }
            if (i8 != 0) {
                fM3765constructorimpl4 = Dp.m3765constructorimpl(6);
            } else {
                fM3765constructorimpl4 = f4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1853729262, i3, -1, "com.yalla.yalla.ui.composable.common.DashContainerComposable.DashContainer (DashContainerComposable.kt:22)");
            }
            int i115 = i3;
            float f1111110 = fM3765constructorimpl3;
            float f1111111 = fM3765constructorimpl;
            float f1111112 = fM3765constructorimpl4;
            float f1111113 = fM3765constructorimpl2;
            SurfaceKt.m1185SurfaceFjzlyU(modifier, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(fM3765constructorimpl4), 0L, 0L, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -433690282, true, new OooO00o(content, i115, ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl4), j, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl), 0.0f, 0, 0, PathEffect.INSTANCE.dashPathEffect(new float[]{((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl2), ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl3)}, 0.0f), 14, null))), composerStartRestartGroup, (i115 & 14) | 1572864, 60);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f5 = f1111110;
            f6 = f1111112;
            f7 = f1111111;
            fM3765constructorimpl2 = f1111113;
        } else {
            if (i11 != 0) {
                fM3765constructorimpl = Dp.m3765constructorimpl(1);
            }
            if (i4 != 0) {
                fM3765constructorimpl2 = Dp.m3765constructorimpl(9);
            }
            if (i6 != 0) {
                fM3765constructorimpl3 = Dp.m3765constructorimpl(10);
            }
            if (i8 != 0) {
                fM3765constructorimpl4 = Dp.m3765constructorimpl(6);
            } else {
                fM3765constructorimpl4 = f4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1853729262, i3, -1, "com.yalla.yalla.ui.composable.common.DashContainerComposable.DashContainer (DashContainerComposable.kt:22)");
            }
            int i116 = i3;
            float f1111114 = fM3765constructorimpl3;
            float f1111115 = fM3765constructorimpl;
            float f1111116 = fM3765constructorimpl4;
            float f1111117 = fM3765constructorimpl2;
            SurfaceKt.m1185SurfaceFjzlyU(modifier, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(fM3765constructorimpl4), 0L, 0L, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -433690282, true, new OooO00o(content, i116, ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl4), j, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl), 0.0f, 0, 0, PathEffect.INSTANCE.dashPathEffect(new float[]{((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl2), ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM3765constructorimpl3)}, 0.0f), 14, null))), composerStartRestartGroup, (i116 & 14) | 1572864, 60);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f5 = f1111114;
            f6 = f1111116;
            f7 = f1111115;
            fM3765constructorimpl2 = f1111117;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(modifier, j, f7, fM3765constructorimpl2, f5, f6, content, i, i2));
    }
}
