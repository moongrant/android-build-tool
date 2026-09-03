package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"DividerAlpha", "", "Divider", "", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "thickness", "Landroidx/compose/ui/unit/Dp;", "startIndent", "Divider-oMI9zvI", "(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDivider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Divider.kt\nandroidx/compose/material/DividerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,69:1\n154#2:70\n154#2:71\n174#2:73\n76#3:72\n*S KotlinDebug\n*F\n+ 1 Divider.kt\nandroidx/compose/material/DividerKt\n*L\n47#1:70\n48#1:71\n56#1:73\n56#1:72\n*E\n"})
public final class DividerKt {
    private static final float DividerAlpha = 0.12f;

    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:78:0x0108  */
    /* JADX WARN: Code duplicated, block: B:81:0x011c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0132  */
    /* JADX WARN: Code duplicated, block: B:85:0x015c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0168  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: Divider-oMI9zvI, reason: not valid java name */
    public static final void m1074DivideroMI9zvI(@Nullable Modifier modifier, long j, float f, float f2, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j2;
        float fM3775constructorimpl;
        int i4;
        float fM3775constructorimpl2;
        int i5;
        Modifier modifier3;
        long jM1680copywmQWz5c$default;
        boolean z;
        Modifier modifierM482paddingqDBjuR0$default;
        float fM3775constructorimpl3;
        final float f3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1249392198);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 112) == 0) {
            j2 = j;
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changed(j2)) ? 32 : 16;
        } else {
            j2 = j;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 896) == 0) {
                fM3775constructorimpl = f;
                i3 |= composerStartRestartGroup.changed(fM3775constructorimpl) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    fM3775constructorimpl2 = f2;
                    if (composerStartRestartGroup.changed(fM3775constructorimpl2)) {
                        i5 = 2048;
                    } else {
                        i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i5;
                }
                if ((i3 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i6 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1038getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1680copywmQWz5c$default = j2;
                        }
                        if (i7 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(1);
                        }
                        if (i4 != 0) {
                            fM3775constructorimpl2 = Dp.m3775constructorimpl(0);
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        jM1680copywmQWz5c$default = j2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1249392198, i, -1, "androidx.compose.material.Divider (Divider.kt:43)");
                    }
                    if (fM3775constructorimpl2 == 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        modifierM482paddingqDBjuR0$default = Modifier.INSTANCE;
                    } else {
                        modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, fM3775constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    composerStartRestartGroup.startReplaceableGroup(1228914189);
                    if (Dp.m3780equalsimpl0(fM3775constructorimpl, Dp.INSTANCE.m3793getHairlineD9Ej5fM())) {
                        fM3775constructorimpl3 = Dp.m3775constructorimpl(1.0f / ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).getDensity());
                    } else {
                        fM3775constructorimpl3 = fM3775constructorimpl;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3.then(modifierM482paddingqDBjuR0$default), 0.0f, 1, null), fM3775constructorimpl3), jM1680copywmQWz5c$default, null, 2, null), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    jM1680copywmQWz5c$default = j2;
                }
                f3 = fM3775constructorimpl2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier4 = modifier3;
                final long j3 = jM1680copywmQWz5c$default;
                final float f4 = fM3775constructorimpl;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DividerKt$Divider$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i8) {
                        DividerKt.m1074DivideroMI9zvI(modifier4, j3, f4, f3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            fM3775constructorimpl2 = f2;
            if ((i3 & 5851) == 1170) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1038getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1680copywmQWz5c$default = j2;
                    }
                    if (i7 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(1);
                    }
                    if (i4 != 0) {
                        fM3775constructorimpl2 = Dp.m3775constructorimpl(0);
                    }
                } else {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1038getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1680copywmQWz5c$default = j2;
                    }
                    if (i7 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(1);
                    }
                    if (i4 != 0) {
                        fM3775constructorimpl2 = Dp.m3775constructorimpl(0);
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1249392198, i, -1, "androidx.compose.material.Divider (Divider.kt:43)");
                }
                if (fM3775constructorimpl2 == 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, fM3775constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    modifierM482paddingqDBjuR0$default = Modifier.INSTANCE;
                }
                composerStartRestartGroup.startReplaceableGroup(1228914189);
                if (Dp.m3780equalsimpl0(fM3775constructorimpl, Dp.INSTANCE.m3793getHairlineD9Ej5fM())) {
                    fM3775constructorimpl3 = Dp.m3775constructorimpl(1.0f / ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).getDensity());
                } else {
                    fM3775constructorimpl3 = fM3775constructorimpl;
                }
                composerStartRestartGroup.endReplaceableGroup();
                BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3.then(modifierM482paddingqDBjuR0$default), 0.0f, 1, null), fM3775constructorimpl3), jM1680copywmQWz5c$default, null, 2, null), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1038getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1680copywmQWz5c$default = j2;
                    }
                    if (i7 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(1);
                    }
                    if (i4 != 0) {
                        fM3775constructorimpl2 = Dp.m3775constructorimpl(0);
                    }
                } else {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1038getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1680copywmQWz5c$default = j2;
                    }
                    if (i7 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(1);
                    }
                    if (i4 != 0) {
                        fM3775constructorimpl2 = Dp.m3775constructorimpl(0);
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1249392198, i, -1, "androidx.compose.material.Divider (Divider.kt:43)");
                }
                if (fM3775constructorimpl2 == 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, fM3775constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    modifierM482paddingqDBjuR0$default = Modifier.INSTANCE;
                }
                composerStartRestartGroup.startReplaceableGroup(1228914189);
                if (Dp.m3780equalsimpl0(fM3775constructorimpl, Dp.INSTANCE.m3793getHairlineD9Ej5fM())) {
                    fM3775constructorimpl3 = Dp.m3775constructorimpl(1.0f / ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).getDensity());
                } else {
                    fM3775constructorimpl3 = fM3775constructorimpl;
                }
                composerStartRestartGroup.endReplaceableGroup();
                BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3.then(modifierM482paddingqDBjuR0$default), 0.0f, 1, null), fM3775constructorimpl3), jM1680copywmQWz5c$default, null, 2, null), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            f3 = fM3775constructorimpl2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier5 = modifier3;
            final long j4 = jM1680copywmQWz5c$default;
            final float f5 = fM3775constructorimpl;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DividerKt$Divider$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i8) {
                    DividerKt.m1074DivideroMI9zvI(modifier5, j4, f5, f3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 384;
        fM3775constructorimpl = f;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                fM3775constructorimpl2 = f2;
                if (composerStartRestartGroup.changed(fM3775constructorimpl2)) {
                    i5 = 2048;
                } else {
                    i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i5;
            }
            if ((i3 & 5851) == 1170) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1038getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1680copywmQWz5c$default = j2;
                    }
                    if (i7 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(1);
                    }
                    if (i4 != 0) {
                        fM3775constructorimpl2 = Dp.m3775constructorimpl(0);
                    }
                } else {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1038getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1680copywmQWz5c$default = j2;
                    }
                    if (i7 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(1);
                    }
                    if (i4 != 0) {
                        fM3775constructorimpl2 = Dp.m3775constructorimpl(0);
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1249392198, i, -1, "androidx.compose.material.Divider (Divider.kt:43)");
                }
                if (fM3775constructorimpl2 == 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, fM3775constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    modifierM482paddingqDBjuR0$default = Modifier.INSTANCE;
                }
                composerStartRestartGroup.startReplaceableGroup(1228914189);
                if (Dp.m3780equalsimpl0(fM3775constructorimpl, Dp.INSTANCE.m3793getHairlineD9Ej5fM())) {
                    fM3775constructorimpl3 = Dp.m3775constructorimpl(1.0f / ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).getDensity());
                } else {
                    fM3775constructorimpl3 = fM3775constructorimpl;
                }
                composerStartRestartGroup.endReplaceableGroup();
                BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3.then(modifierM482paddingqDBjuR0$default), 0.0f, 1, null), fM3775constructorimpl3), jM1680copywmQWz5c$default, null, 2, null), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1038getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1680copywmQWz5c$default = j2;
                    }
                    if (i7 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(1);
                    }
                    if (i4 != 0) {
                        fM3775constructorimpl2 = Dp.m3775constructorimpl(0);
                    }
                } else {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1038getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1680copywmQWz5c$default = j2;
                    }
                    if (i7 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(1);
                    }
                    if (i4 != 0) {
                        fM3775constructorimpl2 = Dp.m3775constructorimpl(0);
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1249392198, i, -1, "androidx.compose.material.Divider (Divider.kt:43)");
                }
                if (fM3775constructorimpl2 == 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, fM3775constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    modifierM482paddingqDBjuR0$default = Modifier.INSTANCE;
                }
                composerStartRestartGroup.startReplaceableGroup(1228914189);
                if (Dp.m3780equalsimpl0(fM3775constructorimpl, Dp.INSTANCE.m3793getHairlineD9Ej5fM())) {
                    fM3775constructorimpl3 = Dp.m3775constructorimpl(1.0f / ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).getDensity());
                } else {
                    fM3775constructorimpl3 = fM3775constructorimpl;
                }
                composerStartRestartGroup.endReplaceableGroup();
                BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3.then(modifierM482paddingqDBjuR0$default), 0.0f, 1, null), fM3775constructorimpl3), jM1680copywmQWz5c$default, null, 2, null), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            f3 = fM3775constructorimpl2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier6 = modifier3;
            final long j5 = jM1680copywmQWz5c$default;
            final float f6 = fM3775constructorimpl;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DividerKt$Divider$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i8) {
                    DividerKt.m1074DivideroMI9zvI(modifier6, j5, f6, f3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        fM3775constructorimpl2 = f2;
        if ((i3 & 5851) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1038getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM1680copywmQWz5c$default = j2;
                }
                if (i7 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(1);
                }
                if (i4 != 0) {
                    fM3775constructorimpl2 = Dp.m3775constructorimpl(0);
                }
            } else {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1038getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM1680copywmQWz5c$default = j2;
                }
                if (i7 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(1);
                }
                if (i4 != 0) {
                    fM3775constructorimpl2 = Dp.m3775constructorimpl(0);
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1249392198, i, -1, "androidx.compose.material.Divider (Divider.kt:43)");
            }
            if (fM3775constructorimpl2 == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, fM3775constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null);
            } else {
                modifierM482paddingqDBjuR0$default = Modifier.INSTANCE;
            }
            composerStartRestartGroup.startReplaceableGroup(1228914189);
            if (Dp.m3780equalsimpl0(fM3775constructorimpl, Dp.INSTANCE.m3793getHairlineD9Ej5fM())) {
                fM3775constructorimpl3 = Dp.m3775constructorimpl(1.0f / ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).getDensity());
            } else {
                fM3775constructorimpl3 = fM3775constructorimpl;
            }
            composerStartRestartGroup.endReplaceableGroup();
            BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3.then(modifierM482paddingqDBjuR0$default), 0.0f, 1, null), fM3775constructorimpl3), jM1680copywmQWz5c$default, null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1038getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM1680copywmQWz5c$default = j2;
                }
                if (i7 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(1);
                }
                if (i4 != 0) {
                    fM3775constructorimpl2 = Dp.m3775constructorimpl(0);
                }
            } else {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1038getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM1680copywmQWz5c$default = j2;
                }
                if (i7 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(1);
                }
                if (i4 != 0) {
                    fM3775constructorimpl2 = Dp.m3775constructorimpl(0);
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1249392198, i, -1, "androidx.compose.material.Divider (Divider.kt:43)");
            }
            if (fM3775constructorimpl2 == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, fM3775constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null);
            } else {
                modifierM482paddingqDBjuR0$default = Modifier.INSTANCE;
            }
            composerStartRestartGroup.startReplaceableGroup(1228914189);
            if (Dp.m3780equalsimpl0(fM3775constructorimpl, Dp.INSTANCE.m3793getHairlineD9Ej5fM())) {
                fM3775constructorimpl3 = Dp.m3775constructorimpl(1.0f / ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).getDensity());
            } else {
                fM3775constructorimpl3 = fM3775constructorimpl;
            }
            composerStartRestartGroup.endReplaceableGroup();
            BoxKt.Box(BackgroundKt.m171backgroundbw27NRU$default(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3.then(modifierM482paddingqDBjuR0$default), 0.0f, 1, null), fM3775constructorimpl3), jM1680copywmQWz5c$default, null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        f3 = fM3775constructorimpl2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier7 = modifier3;
        final long j6 = jM1680copywmQWz5c$default;
        final float f7 = fM3775constructorimpl;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DividerKt$Divider$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i8) {
                DividerKt.m1074DivideroMI9zvI(modifier7, j6, f7, f3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }
}
