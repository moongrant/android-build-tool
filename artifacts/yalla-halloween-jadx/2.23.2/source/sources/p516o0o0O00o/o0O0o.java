package p516o0o0O00o;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ProgressIndicatorDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomBottomMenuCallingProcess.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomBottomMenuCallingProcess.kt\ncom/yalla/yalla/ui/composable/common/RoomBottomMenuCallingProcessKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,113:1\n76#2:114\n75#3,7:115\n154#4:122\n154#4:123\n*S KotlinDebug\n*F\n+ 1 RoomBottomMenuCallingProcess.kt\ncom/yalla/yalla/ui/composable/common/RoomBottomMenuCallingProcessKt\n*L\n35#1:114\n74#1:115,7\n111#1:122\n24#1:123\n*E\n"})
public final class o0O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final float f51548OooO00o = Dp.m3775constructorimpl(40);

    public static final class OooO00o extends Lambda implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ float f51549OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f51550OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Stroke f51551OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(float f, long j, Stroke stroke) {
            super(1);
            this.f51549OooO0Oo = f;
            this.f51551OooO0o0 = stroke;
            this.f51550OooO0o = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DrawScope drawScope) {
            DrawScope Canvas = drawScope;
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            float f = this.f51549OooO0Oo * 360.0f;
            Stroke stroke = this.f51551OooO0o0;
            float f2 = 2;
            float width = stroke.getWidth() / f2;
            float fM1516getWidthimpl = Size.m1516getWidthimpl(Canvas.mo2118getSizeNHjbRc()) / f2;
            androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, ColorKt.Color(4282730057L), fM1516getWidthimpl - width, OffsetKt.Offset(fM1516getWidthimpl, fM1516getWidthimpl), 0.0f, this.f51551OooO0o0, null, 0, 104, null);
            long j = this.f51550OooO0o;
            float width2 = stroke.getWidth() / f2;
            float fM1516getWidthimpl2 = Size.m1516getWidthimpl(Canvas.mo2118getSizeNHjbRc()) - (f2 * width2);
            androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo0O(Canvas, j, 270.0f, f, false, OffsetKt.Offset(width2, width2), SizeKt.Size(fM1516getWidthimpl2, fM1516getWidthimpl2), 0.0f, stroke, null, 0, 832, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f51552OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ float f51553OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f51554OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Modifier f51555OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ float f51556OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f51557OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(float f, Modifier modifier, long j, float f2, int i, int i2) {
            super(2);
            this.f51553OooO0Oo = f;
            this.f51555OooO0o0 = modifier;
            this.f51554OooO0o = j;
            this.f51556OooO0oO = f2;
            this.f51557OooO0oo = i;
            this.f51552OooO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0O0o.OooO00o(this.f51553OooO0Oo, this.f51555OooO0o0, this.f51554OooO0o, this.f51556OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f51557OooO0oo | 1), this.f51552OooO);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0074  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce A[PHI: r3 r4 r7
      0x00ce: PHI (r3v24 int) = (r3v13 int), (r3v26 int) binds: [B:71:0x00c3, B:63:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x00ce: PHI (r4v5 androidx.compose.ui.Modifier) = (r4v2 androidx.compose.ui.Modifier), (r4v8 androidx.compose.ui.Modifier) binds: [B:71:0x00c3, B:63:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x00ce: PHI (r7v11 long) = (r7v7 long), (r7v6 long) binds: [B:71:0x00c3, B:63:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x014a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0154  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(float f, @Nullable Modifier modifier, long j, float f2, @Nullable Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        long jM1039getPrimary0d7_KjU;
        float f3;
        Modifier modifier3;
        float fM1151getStrokeWidthD9Ej5fM;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1457233336);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 896) == 0) {
                if ((i2 & 4) == 0) {
                    jM1039getPrimary0d7_KjU = j;
                    int i6 = composerStartRestartGroup.changed(jM1039getPrimary0d7_KjU) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
                    i3 |= i6;
                } else {
                    jM1039getPrimary0d7_KjU = j;
                }
                i3 |= i6;
            } else {
                jM1039getPrimary0d7_KjU = j;
            }
            if ((i & 7168) == 0) {
                if ((i2 & 8) == 0) {
                    f3 = f2;
                    if (composerStartRestartGroup.changed(f3)) {
                        i4 = 2048;
                    }
                    i3 |= i4;
                } else {
                    f3 = f2;
                }
                i4 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                i3 |= i4;
            } else {
                f3 = f2;
            }
            if ((i3 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i5 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m1039getPrimary0d7_KjU();
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        fM1151getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1151getStrokeWidthD9Ej5fM();
                        i3 &= -7169;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1457233336, i3, -1, "com.yalla.yalla.ui.composable.common.RoomBottomMenuCustomCircularProgressIndicator (RoomBottomMenuCallingProcess.kt:32)");
                    }
                    float f4 = 1 - f;
                    CanvasKt.Canvas(androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(GraphicsLayerModifierKt.m1837graphicsLayerAp8cVGQ$default(modifier3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 180.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 130943, null), f4, null, 0, 6, null), f51548OooO00o), new OooO00o(f4, jM1039getPrimary0d7_KjU, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(fM1151getStrokeWidthD9Ej5fM), 0.0f, StrokeCap.INSTANCE.m2006getRoundKaPHkGw(), 0, null, 26, null)), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    modifier3 = modifier2;
                }
                fM1151getStrokeWidthD9Ej5fM = f3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1457233336, i3, -1, "com.yalla.yalla.ui.composable.common.RoomBottomMenuCustomCircularProgressIndicator (RoomBottomMenuCallingProcess.kt:32)");
                }
                float f5 = 1 - f;
                CanvasKt.Canvas(androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(GraphicsLayerModifierKt.m1837graphicsLayerAp8cVGQ$default(modifier3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 180.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 130943, null), f5, null, 0, 6, null), f51548OooO00o), new OooO00o(f5, jM1039getPrimary0d7_KjU, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(fM1151getStrokeWidthD9Ej5fM), 0.0f, StrokeCap.INSTANCE.m2006getRoundKaPHkGw(), 0, null, 26, null)), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                fM1151getStrokeWidthD9Ej5fM = f3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(f, modifier3, jM1039getPrimary0d7_KjU, fM1151getStrokeWidthD9Ej5fM, i, i2));
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                jM1039getPrimary0d7_KjU = j;
                if (composerStartRestartGroup.changed(jM1039getPrimary0d7_KjU)) {
                }
                i3 |= i6;
            } else {
                jM1039getPrimary0d7_KjU = j;
            }
            i3 |= i6;
        } else {
            jM1039getPrimary0d7_KjU = j;
        }
        if ((i & 7168) == 0) {
            if ((i2 & 8) == 0) {
                f3 = f2;
                if (composerStartRestartGroup.changed(f3)) {
                    i4 = 2048;
                }
                i3 |= i4;
            } else {
                f3 = f2;
            }
            i4 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            i3 |= i4;
        } else {
            f3 = f2;
        }
        if ((i3 & 5851) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m1039getPrimary0d7_KjU();
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    fM1151getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1151getStrokeWidthD9Ej5fM();
                    i3 &= -7169;
                } else {
                    fM1151getStrokeWidthD9Ej5fM = f3;
                }
            } else {
                if (i5 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m1039getPrimary0d7_KjU();
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    fM1151getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1151getStrokeWidthD9Ej5fM();
                    i3 &= -7169;
                } else {
                    fM1151getStrokeWidthD9Ej5fM = f3;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1457233336, i3, -1, "com.yalla.yalla.ui.composable.common.RoomBottomMenuCustomCircularProgressIndicator (RoomBottomMenuCallingProcess.kt:32)");
            }
            float f6 = 1 - f;
            CanvasKt.Canvas(androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(GraphicsLayerModifierKt.m1837graphicsLayerAp8cVGQ$default(modifier3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 180.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 130943, null), f6, null, 0, 6, null), f51548OooO00o), new OooO00o(f6, jM1039getPrimary0d7_KjU, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(fM1151getStrokeWidthD9Ej5fM), 0.0f, StrokeCap.INSTANCE.m2006getRoundKaPHkGw(), 0, null, 26, null)), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m1039getPrimary0d7_KjU();
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    fM1151getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1151getStrokeWidthD9Ej5fM();
                    i3 &= -7169;
                } else {
                    fM1151getStrokeWidthD9Ej5fM = f3;
                }
            } else {
                if (i5 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m1039getPrimary0d7_KjU();
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    fM1151getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1151getStrokeWidthD9Ej5fM();
                    i3 &= -7169;
                } else {
                    fM1151getStrokeWidthD9Ej5fM = f3;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1457233336, i3, -1, "com.yalla.yalla.ui.composable.common.RoomBottomMenuCustomCircularProgressIndicator (RoomBottomMenuCallingProcess.kt:32)");
            }
            float f7 = 1 - f;
            CanvasKt.Canvas(androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(GraphicsLayerModifierKt.m1837graphicsLayerAp8cVGQ$default(modifier3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 180.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 130943, null), f7, null, 0, 6, null), f51548OooO00o), new OooO00o(f7, jM1039getPrimary0d7_KjU, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(fM1151getStrokeWidthD9Ej5fM), 0.0f, StrokeCap.INSTANCE.m2006getRoundKaPHkGw(), 0, null, 26, null)), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(f, modifier3, jM1039getPrimary0d7_KjU, fM1151getStrokeWidthD9Ej5fM, i, i2));
    }
}
