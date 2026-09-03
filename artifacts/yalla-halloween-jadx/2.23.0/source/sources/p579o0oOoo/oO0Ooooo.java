package p579o0oOoo;

import android.content.Context;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.yalla.netimage.NetImageView;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p362o0OOo0O.OooOO0;
import p543o0oO0O00.OooO;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nComposeUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeUtil.kt\ncom/yalla/yalla/util/ComposeUtilKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,82:1\n76#2:83\n154#3:84\n154#3:85\n154#3:86\n154#3:87\n*S KotlinDebug\n*F\n+ 1 ComposeUtil.kt\ncom/yalla/yalla/util/ComposeUtilKt\n*L\n25#1:83\n28#1:84\n41#1:85\n53#1:86\n77#1:87\n*E\n"})
public final class oO0Ooooo {

    public static final class OooO00o extends Lambda implements Function1<Context, NetImageView> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f56616OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final NetImageView invoke(Context context) {
            Context context2 = context;
            Intrinsics.checkNotNullParameter(context2, "context");
            return new NetImageView(context2);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<NetImageView, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ OooOO0 f56617OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f56618OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(OooOO0 oooOO1, String str) {
            super(1);
            this.f56617OooO0Oo = oooOO1;
            this.f56618OooO0o0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(NetImageView netImageView) {
            NetImageView it = netImageView;
            Intrinsics.checkNotNullParameter(it, "it");
            OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(it.getContext());
            oooO00o.OooO00o(this.f56617OooO0Oo);
            oooO00o.f43911OooO0OO = this.f56618OooO0o0;
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0Oo(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ boolean f56619OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f56620OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ OooOO0 f56621OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Modifier f56622OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ float f56623OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ long f56624OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f56625OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f56626OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(String str, Modifier modifier, OooOO0 oooOO1, float f, long j, boolean z, int i, int i2) {
            super(2);
            this.f56620OooO0Oo = str;
            this.f56622OooO0o0 = modifier;
            this.f56621OooO0o = oooOO1;
            this.f56623OooO0oO = f;
            this.f56624OooO0oo = j;
            this.f56619OooO = z;
            this.f56625OooOO0 = i;
            this.f56626OooOO0O = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oO0Ooooo.OooO00o(this.f56620OooO0Oo, this.f56622OooO0o0, this.f56621OooO0o, this.f56623OooO0oO, this.f56624OooO0oo, this.f56619OooO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f56625OooOO0 | 1), this.f56626OooOO0O);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:86:0x0102  */
    /* JADX WARN: Code duplicated, block: B:89:0x011f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0121  */
    /* JADX WARN: Code duplicated, block: B:93:0x014c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0158  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@Nullable String str, @NotNull Modifier modifier, @Nullable OooOO0 oooOO1, float f, long j, boolean z, @Nullable Composer composer, int i, int i2) {
        int i3;
        float f2;
        int i4;
        long j2;
        int i5;
        int i6;
        boolean z2;
        int i7;
        OooOO0 oooOO0OooO0Oo;
        float fM3765constructorimpl;
        long jM1705getTransparent0d7_KjU;
        float fM3765constructorimpl2;
        boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(-769695547);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 128;
        }
        int i9 = i2 & 8;
        if (i9 == 0) {
            if ((i & 7168) == 0) {
                f2 = f;
                i3 |= composerStartRestartGroup.changed(f2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((57344 & i) == 0) {
                    j2 = j;
                    if (composerStartRestartGroup.changed(j2)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((458752 & i) == 0) {
                        z2 = z;
                        if (composerStartRestartGroup.changed(z2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    if (i8 != 4 && (i3 & 374491) == 74898 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        oooOO0OooO0Oo = oooOO1;
                        fM3765constructorimpl = f2;
                        jM1705getTransparent0d7_KjU = j2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i8 != 0) {
                                oooOO0OooO0Oo = OooO.OooO0Oo();
                                Intrinsics.checkNotNullExpressionValue(oooOO0OooO0Oo, "picture()");
                            } else {
                                oooOO0OooO0Oo = oooOO1;
                            }
                            if (i9 != 0) {
                                fM3765constructorimpl = Dp.m3765constructorimpl(0);
                            } else {
                                fM3765constructorimpl = f2;
                            }
                            if (i4 != 0) {
                                jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                            } else {
                                jM1705getTransparent0d7_KjU = j2;
                            }
                            if (i6 != 0) {
                                z2 = true;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            oooOO0OooO0Oo = oooOO1;
                            fM3765constructorimpl = f2;
                            jM1705getTransparent0d7_KjU = j2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-769695547, i, -1, "com.yalla.yalla.util.ImageNet (ComposeUtil.kt:36)");
                        }
                        Modifier modifierBorder = BorderKt.border(Modifier.INSTANCE, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), RoundedCornerShapeKt.getCircleShape());
                        if (z2) {
                            fM3765constructorimpl2 = fM3765constructorimpl;
                        } else {
                            fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                        }
                        AndroidView_androidKt.AndroidView(OooO00o.f56616OooO0Oo, modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder, fM3765constructorimpl2)), new OooO0O0(oooOO0OooO0Oo, str), composerStartRestartGroup, 6, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    z3 = z2;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str, modifier, oooOO0OooO0Oo, fM3765constructorimpl, jM1705getTransparent0d7_KjU, z3, i, i2));
                }
                i3 |= 196608;
                z2 = z;
                if (i8 != 4) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            oooOO0OooO0Oo = OooO.OooO0Oo();
                            Intrinsics.checkNotNullExpressionValue(oooOO0OooO0Oo, "picture()");
                        } else {
                            oooOO0OooO0Oo = oooOO1;
                        }
                        if (i9 != 0) {
                            fM3765constructorimpl = Dp.m3765constructorimpl(0);
                        } else {
                            fM3765constructorimpl = f2;
                        }
                        if (i4 != 0) {
                            jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                        } else {
                            jM1705getTransparent0d7_KjU = j2;
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                    } else {
                        if (i8 != 0) {
                            oooOO0OooO0Oo = OooO.OooO0Oo();
                            Intrinsics.checkNotNullExpressionValue(oooOO0OooO0Oo, "picture()");
                        } else {
                            oooOO0OooO0Oo = oooOO1;
                        }
                        if (i9 != 0) {
                            fM3765constructorimpl = Dp.m3765constructorimpl(0);
                        } else {
                            fM3765constructorimpl = f2;
                        }
                        if (i4 != 0) {
                            jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                        } else {
                            jM1705getTransparent0d7_KjU = j2;
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-769695547, i, -1, "com.yalla.yalla.util.ImageNet (ComposeUtil.kt:36)");
                    }
                    Modifier modifierBorder2 = BorderKt.border(Modifier.INSTANCE, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), RoundedCornerShapeKt.getCircleShape());
                    if (z2) {
                        fM3765constructorimpl2 = fM3765constructorimpl;
                    } else {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                    }
                    AndroidView_androidKt.AndroidView(OooO00o.f56616OooO0Oo, modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder2, fM3765constructorimpl2)), new OooO0O0(oooOO0OooO0Oo, str), composerStartRestartGroup, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            oooOO0OooO0Oo = OooO.OooO0Oo();
                            Intrinsics.checkNotNullExpressionValue(oooOO0OooO0Oo, "picture()");
                        } else {
                            oooOO0OooO0Oo = oooOO1;
                        }
                        if (i9 != 0) {
                            fM3765constructorimpl = Dp.m3765constructorimpl(0);
                        } else {
                            fM3765constructorimpl = f2;
                        }
                        if (i4 != 0) {
                            jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                        } else {
                            jM1705getTransparent0d7_KjU = j2;
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                    } else {
                        if (i8 != 0) {
                            oooOO0OooO0Oo = OooO.OooO0Oo();
                            Intrinsics.checkNotNullExpressionValue(oooOO0OooO0Oo, "picture()");
                        } else {
                            oooOO0OooO0Oo = oooOO1;
                        }
                        if (i9 != 0) {
                            fM3765constructorimpl = Dp.m3765constructorimpl(0);
                        } else {
                            fM3765constructorimpl = f2;
                        }
                        if (i4 != 0) {
                            jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                        } else {
                            jM1705getTransparent0d7_KjU = j2;
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-769695547, i, -1, "com.yalla.yalla.util.ImageNet (ComposeUtil.kt:36)");
                    }
                    Modifier modifierBorder3 = BorderKt.border(Modifier.INSTANCE, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), RoundedCornerShapeKt.getCircleShape());
                    if (z2) {
                        fM3765constructorimpl2 = fM3765constructorimpl;
                    } else {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                    }
                    AndroidView_androidKt.AndroidView(OooO00o.f56616OooO0Oo, modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder3, fM3765constructorimpl2)), new OooO0O0(oooOO0OooO0Oo, str), composerStartRestartGroup, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                z3 = z2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str, modifier, oooOO0OooO0Oo, fM3765constructorimpl, jM1705getTransparent0d7_KjU, z3, i, i2));
            }
            i3 |= 24576;
            j2 = j;
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((458752 & i) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if (i8 != 4) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            oooOO0OooO0Oo = OooO.OooO0Oo();
                            Intrinsics.checkNotNullExpressionValue(oooOO0OooO0Oo, "picture()");
                        } else {
                            oooOO0OooO0Oo = oooOO1;
                        }
                        if (i9 != 0) {
                            fM3765constructorimpl = Dp.m3765constructorimpl(0);
                        } else {
                            fM3765constructorimpl = f2;
                        }
                        if (i4 != 0) {
                            jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                        } else {
                            jM1705getTransparent0d7_KjU = j2;
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                    } else {
                        if (i8 != 0) {
                            oooOO0OooO0Oo = OooO.OooO0Oo();
                            Intrinsics.checkNotNullExpressionValue(oooOO0OooO0Oo, "picture()");
                        } else {
                            oooOO0OooO0Oo = oooOO1;
                        }
                        if (i9 != 0) {
                            fM3765constructorimpl = Dp.m3765constructorimpl(0);
                        } else {
                            fM3765constructorimpl = f2;
                        }
                        if (i4 != 0) {
                            jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                        } else {
                            jM1705getTransparent0d7_KjU = j2;
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-769695547, i, -1, "com.yalla.yalla.util.ImageNet (ComposeUtil.kt:36)");
                    }
                    Modifier modifierBorder4 = BorderKt.border(Modifier.INSTANCE, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), RoundedCornerShapeKt.getCircleShape());
                    if (z2) {
                        fM3765constructorimpl2 = fM3765constructorimpl;
                    } else {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                    }
                    AndroidView_androidKt.AndroidView(OooO00o.f56616OooO0Oo, modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder4, fM3765constructorimpl2)), new OooO0O0(oooOO0OooO0Oo, str), composerStartRestartGroup, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            oooOO0OooO0Oo = OooO.OooO0Oo();
                            Intrinsics.checkNotNullExpressionValue(oooOO0OooO0Oo, "picture()");
                        } else {
                            oooOO0OooO0Oo = oooOO1;
                        }
                        if (i9 != 0) {
                            fM3765constructorimpl = Dp.m3765constructorimpl(0);
                        } else {
                            fM3765constructorimpl = f2;
                        }
                        if (i4 != 0) {
                            jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                        } else {
                            jM1705getTransparent0d7_KjU = j2;
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                    } else {
                        if (i8 != 0) {
                            oooOO0OooO0Oo = OooO.OooO0Oo();
                            Intrinsics.checkNotNullExpressionValue(oooOO0OooO0Oo, "picture()");
                        } else {
                            oooOO0OooO0Oo = oooOO1;
                        }
                        if (i9 != 0) {
                            fM3765constructorimpl = Dp.m3765constructorimpl(0);
                        } else {
                            fM3765constructorimpl = f2;
                        }
                        if (i4 != 0) {
                            jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                        } else {
                            jM1705getTransparent0d7_KjU = j2;
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-769695547, i, -1, "com.yalla.yalla.util.ImageNet (ComposeUtil.kt:36)");
                    }
                    Modifier modifierBorder5 = BorderKt.border(Modifier.INSTANCE, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), RoundedCornerShapeKt.getCircleShape());
                    if (z2) {
                        fM3765constructorimpl2 = fM3765constructorimpl;
                    } else {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                    }
                    AndroidView_androidKt.AndroidView(OooO00o.f56616OooO0Oo, modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder5, fM3765constructorimpl2)), new OooO0O0(oooOO0OooO0Oo, str), composerStartRestartGroup, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                z3 = z2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str, modifier, oooOO0OooO0Oo, fM3765constructorimpl, jM1705getTransparent0d7_KjU, z3, i, i2));
            }
            i3 |= 196608;
            z2 = z;
            if (i8 != 4) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        oooOO0OooO0Oo = OooO.OooO0Oo();
                        Intrinsics.checkNotNullExpressionValue(oooOO0OooO0Oo, "picture()");
                    } else {
                        oooOO0OooO0Oo = oooOO1;
                    }
                    if (i9 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(0);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    } else {
                        jM1705getTransparent0d7_KjU = j2;
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                } else {
                    if (i8 != 0) {
                        oooOO0OooO0Oo = OooO.OooO0Oo();
                        Intrinsics.checkNotNullExpressionValue(oooOO0OooO0Oo, "picture()");
                    } else {
                        oooOO0OooO0Oo = oooOO1;
                    }
                    if (i9 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(0);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    } else {
                        jM1705getTransparent0d7_KjU = j2;
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-769695547, i, -1, "com.yalla.yalla.util.ImageNet (ComposeUtil.kt:36)");
                }
                Modifier modifierBorder6 = BorderKt.border(Modifier.INSTANCE, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), RoundedCornerShapeKt.getCircleShape());
                if (z2) {
                    fM3765constructorimpl2 = fM3765constructorimpl;
                } else {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                }
                AndroidView_androidKt.AndroidView(OooO00o.f56616OooO0Oo, modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder6, fM3765constructorimpl2)), new OooO0O0(oooOO0OooO0Oo, str), composerStartRestartGroup, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        oooOO0OooO0Oo = OooO.OooO0Oo();
                        Intrinsics.checkNotNullExpressionValue(oooOO0OooO0Oo, "picture()");
                    } else {
                        oooOO0OooO0Oo = oooOO1;
                    }
                    if (i9 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(0);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    } else {
                        jM1705getTransparent0d7_KjU = j2;
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                } else {
                    if (i8 != 0) {
                        oooOO0OooO0Oo = OooO.OooO0Oo();
                        Intrinsics.checkNotNullExpressionValue(oooOO0OooO0Oo, "picture()");
                    } else {
                        oooOO0OooO0Oo = oooOO1;
                    }
                    if (i9 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(0);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    } else {
                        jM1705getTransparent0d7_KjU = j2;
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-769695547, i, -1, "com.yalla.yalla.util.ImageNet (ComposeUtil.kt:36)");
                }
                Modifier modifierBorder7 = BorderKt.border(Modifier.INSTANCE, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), RoundedCornerShapeKt.getCircleShape());
                if (z2) {
                    fM3765constructorimpl2 = fM3765constructorimpl;
                } else {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                }
                AndroidView_androidKt.AndroidView(OooO00o.f56616OooO0Oo, modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder7, fM3765constructorimpl2)), new OooO0O0(oooOO0OooO0Oo, str), composerStartRestartGroup, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            z3 = z2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str, modifier, oooOO0OooO0Oo, fM3765constructorimpl, jM1705getTransparent0d7_KjU, z3, i, i2));
        }
        i3 |= 3072;
        f2 = f;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((57344 & i) == 0) {
                j2 = j;
                if (composerStartRestartGroup.changed(j2)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((458752 & i) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if (i8 != 4) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            oooOO0OooO0Oo = OooO.OooO0Oo();
                            Intrinsics.checkNotNullExpressionValue(oooOO0OooO0Oo, "picture()");
                        } else {
                            oooOO0OooO0Oo = oooOO1;
                        }
                        if (i9 != 0) {
                            fM3765constructorimpl = Dp.m3765constructorimpl(0);
                        } else {
                            fM3765constructorimpl = f2;
                        }
                        if (i4 != 0) {
                            jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                        } else {
                            jM1705getTransparent0d7_KjU = j2;
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                    } else {
                        if (i8 != 0) {
                            oooOO0OooO0Oo = OooO.OooO0Oo();
                            Intrinsics.checkNotNullExpressionValue(oooOO0OooO0Oo, "picture()");
                        } else {
                            oooOO0OooO0Oo = oooOO1;
                        }
                        if (i9 != 0) {
                            fM3765constructorimpl = Dp.m3765constructorimpl(0);
                        } else {
                            fM3765constructorimpl = f2;
                        }
                        if (i4 != 0) {
                            jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                        } else {
                            jM1705getTransparent0d7_KjU = j2;
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-769695547, i, -1, "com.yalla.yalla.util.ImageNet (ComposeUtil.kt:36)");
                    }
                    Modifier modifierBorder8 = BorderKt.border(Modifier.INSTANCE, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), RoundedCornerShapeKt.getCircleShape());
                    if (z2) {
                        fM3765constructorimpl2 = fM3765constructorimpl;
                    } else {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                    }
                    AndroidView_androidKt.AndroidView(OooO00o.f56616OooO0Oo, modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder8, fM3765constructorimpl2)), new OooO0O0(oooOO0OooO0Oo, str), composerStartRestartGroup, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            oooOO0OooO0Oo = OooO.OooO0Oo();
                            Intrinsics.checkNotNullExpressionValue(oooOO0OooO0Oo, "picture()");
                        } else {
                            oooOO0OooO0Oo = oooOO1;
                        }
                        if (i9 != 0) {
                            fM3765constructorimpl = Dp.m3765constructorimpl(0);
                        } else {
                            fM3765constructorimpl = f2;
                        }
                        if (i4 != 0) {
                            jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                        } else {
                            jM1705getTransparent0d7_KjU = j2;
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                    } else {
                        if (i8 != 0) {
                            oooOO0OooO0Oo = OooO.OooO0Oo();
                            Intrinsics.checkNotNullExpressionValue(oooOO0OooO0Oo, "picture()");
                        } else {
                            oooOO0OooO0Oo = oooOO1;
                        }
                        if (i9 != 0) {
                            fM3765constructorimpl = Dp.m3765constructorimpl(0);
                        } else {
                            fM3765constructorimpl = f2;
                        }
                        if (i4 != 0) {
                            jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                        } else {
                            jM1705getTransparent0d7_KjU = j2;
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-769695547, i, -1, "com.yalla.yalla.util.ImageNet (ComposeUtil.kt:36)");
                    }
                    Modifier modifierBorder9 = BorderKt.border(Modifier.INSTANCE, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), RoundedCornerShapeKt.getCircleShape());
                    if (z2) {
                        fM3765constructorimpl2 = fM3765constructorimpl;
                    } else {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                    }
                    AndroidView_androidKt.AndroidView(OooO00o.f56616OooO0Oo, modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder9, fM3765constructorimpl2)), new OooO0O0(oooOO0OooO0Oo, str), composerStartRestartGroup, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                z3 = z2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str, modifier, oooOO0OooO0Oo, fM3765constructorimpl, jM1705getTransparent0d7_KjU, z3, i, i2));
            }
            i3 |= 196608;
            z2 = z;
            if (i8 != 4) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        oooOO0OooO0Oo = OooO.OooO0Oo();
                        Intrinsics.checkNotNullExpressionValue(oooOO0OooO0Oo, "picture()");
                    } else {
                        oooOO0OooO0Oo = oooOO1;
                    }
                    if (i9 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(0);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    } else {
                        jM1705getTransparent0d7_KjU = j2;
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                } else {
                    if (i8 != 0) {
                        oooOO0OooO0Oo = OooO.OooO0Oo();
                        Intrinsics.checkNotNullExpressionValue(oooOO0OooO0Oo, "picture()");
                    } else {
                        oooOO0OooO0Oo = oooOO1;
                    }
                    if (i9 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(0);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    } else {
                        jM1705getTransparent0d7_KjU = j2;
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-769695547, i, -1, "com.yalla.yalla.util.ImageNet (ComposeUtil.kt:36)");
                }
                Modifier modifierBorder10 = BorderKt.border(Modifier.INSTANCE, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), RoundedCornerShapeKt.getCircleShape());
                if (z2) {
                    fM3765constructorimpl2 = fM3765constructorimpl;
                } else {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                }
                AndroidView_androidKt.AndroidView(OooO00o.f56616OooO0Oo, modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder10, fM3765constructorimpl2)), new OooO0O0(oooOO0OooO0Oo, str), composerStartRestartGroup, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        oooOO0OooO0Oo = OooO.OooO0Oo();
                        Intrinsics.checkNotNullExpressionValue(oooOO0OooO0Oo, "picture()");
                    } else {
                        oooOO0OooO0Oo = oooOO1;
                    }
                    if (i9 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(0);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    } else {
                        jM1705getTransparent0d7_KjU = j2;
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                } else {
                    if (i8 != 0) {
                        oooOO0OooO0Oo = OooO.OooO0Oo();
                        Intrinsics.checkNotNullExpressionValue(oooOO0OooO0Oo, "picture()");
                    } else {
                        oooOO0OooO0Oo = oooOO1;
                    }
                    if (i9 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(0);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    } else {
                        jM1705getTransparent0d7_KjU = j2;
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-769695547, i, -1, "com.yalla.yalla.util.ImageNet (ComposeUtil.kt:36)");
                }
                Modifier modifierBorder11 = BorderKt.border(Modifier.INSTANCE, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), RoundedCornerShapeKt.getCircleShape());
                if (z2) {
                    fM3765constructorimpl2 = fM3765constructorimpl;
                } else {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                }
                AndroidView_androidKt.AndroidView(OooO00o.f56616OooO0Oo, modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder11, fM3765constructorimpl2)), new OooO0O0(oooOO0OooO0Oo, str), composerStartRestartGroup, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            z3 = z2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str, modifier, oooOO0OooO0Oo, fM3765constructorimpl, jM1705getTransparent0d7_KjU, z3, i, i2));
        }
        i3 |= 24576;
        j2 = j;
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((458752 & i) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if (i8 != 4) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        oooOO0OooO0Oo = OooO.OooO0Oo();
                        Intrinsics.checkNotNullExpressionValue(oooOO0OooO0Oo, "picture()");
                    } else {
                        oooOO0OooO0Oo = oooOO1;
                    }
                    if (i9 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(0);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    } else {
                        jM1705getTransparent0d7_KjU = j2;
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                } else {
                    if (i8 != 0) {
                        oooOO0OooO0Oo = OooO.OooO0Oo();
                        Intrinsics.checkNotNullExpressionValue(oooOO0OooO0Oo, "picture()");
                    } else {
                        oooOO0OooO0Oo = oooOO1;
                    }
                    if (i9 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(0);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    } else {
                        jM1705getTransparent0d7_KjU = j2;
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-769695547, i, -1, "com.yalla.yalla.util.ImageNet (ComposeUtil.kt:36)");
                }
                Modifier modifierBorder12 = BorderKt.border(Modifier.INSTANCE, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), RoundedCornerShapeKt.getCircleShape());
                if (z2) {
                    fM3765constructorimpl2 = fM3765constructorimpl;
                } else {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                }
                AndroidView_androidKt.AndroidView(OooO00o.f56616OooO0Oo, modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder12, fM3765constructorimpl2)), new OooO0O0(oooOO0OooO0Oo, str), composerStartRestartGroup, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        oooOO0OooO0Oo = OooO.OooO0Oo();
                        Intrinsics.checkNotNullExpressionValue(oooOO0OooO0Oo, "picture()");
                    } else {
                        oooOO0OooO0Oo = oooOO1;
                    }
                    if (i9 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(0);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    } else {
                        jM1705getTransparent0d7_KjU = j2;
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                } else {
                    if (i8 != 0) {
                        oooOO0OooO0Oo = OooO.OooO0Oo();
                        Intrinsics.checkNotNullExpressionValue(oooOO0OooO0Oo, "picture()");
                    } else {
                        oooOO0OooO0Oo = oooOO1;
                    }
                    if (i9 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(0);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    } else {
                        jM1705getTransparent0d7_KjU = j2;
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-769695547, i, -1, "com.yalla.yalla.util.ImageNet (ComposeUtil.kt:36)");
                }
                Modifier modifierBorder13 = BorderKt.border(Modifier.INSTANCE, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), RoundedCornerShapeKt.getCircleShape());
                if (z2) {
                    fM3765constructorimpl2 = fM3765constructorimpl;
                } else {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                }
                AndroidView_androidKt.AndroidView(OooO00o.f56616OooO0Oo, modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder13, fM3765constructorimpl2)), new OooO0O0(oooOO0OooO0Oo, str), composerStartRestartGroup, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            z3 = z2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str, modifier, oooOO0OooO0Oo, fM3765constructorimpl, jM1705getTransparent0d7_KjU, z3, i, i2));
        }
        i3 |= 196608;
        z2 = z;
        if (i8 != 4) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    oooOO0OooO0Oo = OooO.OooO0Oo();
                    Intrinsics.checkNotNullExpressionValue(oooOO0OooO0Oo, "picture()");
                } else {
                    oooOO0OooO0Oo = oooOO1;
                }
                if (i9 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(0);
                } else {
                    fM3765constructorimpl = f2;
                }
                if (i4 != 0) {
                    jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                } else {
                    jM1705getTransparent0d7_KjU = j2;
                }
                if (i6 != 0) {
                    z2 = true;
                }
            } else {
                if (i8 != 0) {
                    oooOO0OooO0Oo = OooO.OooO0Oo();
                    Intrinsics.checkNotNullExpressionValue(oooOO0OooO0Oo, "picture()");
                } else {
                    oooOO0OooO0Oo = oooOO1;
                }
                if (i9 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(0);
                } else {
                    fM3765constructorimpl = f2;
                }
                if (i4 != 0) {
                    jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                } else {
                    jM1705getTransparent0d7_KjU = j2;
                }
                if (i6 != 0) {
                    z2 = true;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-769695547, i, -1, "com.yalla.yalla.util.ImageNet (ComposeUtil.kt:36)");
            }
            Modifier modifierBorder14 = BorderKt.border(Modifier.INSTANCE, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), RoundedCornerShapeKt.getCircleShape());
            if (z2) {
                fM3765constructorimpl2 = fM3765constructorimpl;
            } else {
                fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
            }
            AndroidView_androidKt.AndroidView(OooO00o.f56616OooO0Oo, modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder14, fM3765constructorimpl2)), new OooO0O0(oooOO0OooO0Oo, str), composerStartRestartGroup, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    oooOO0OooO0Oo = OooO.OooO0Oo();
                    Intrinsics.checkNotNullExpressionValue(oooOO0OooO0Oo, "picture()");
                } else {
                    oooOO0OooO0Oo = oooOO1;
                }
                if (i9 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(0);
                } else {
                    fM3765constructorimpl = f2;
                }
                if (i4 != 0) {
                    jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                } else {
                    jM1705getTransparent0d7_KjU = j2;
                }
                if (i6 != 0) {
                    z2 = true;
                }
            } else {
                if (i8 != 0) {
                    oooOO0OooO0Oo = OooO.OooO0Oo();
                    Intrinsics.checkNotNullExpressionValue(oooOO0OooO0Oo, "picture()");
                } else {
                    oooOO0OooO0Oo = oooOO1;
                }
                if (i9 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(0);
                } else {
                    fM3765constructorimpl = f2;
                }
                if (i4 != 0) {
                    jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                } else {
                    jM1705getTransparent0d7_KjU = j2;
                }
                if (i6 != 0) {
                    z2 = true;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-769695547, i, -1, "com.yalla.yalla.util.ImageNet (ComposeUtil.kt:36)");
            }
            Modifier modifierBorder15 = BorderKt.border(Modifier.INSTANCE, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), RoundedCornerShapeKt.getCircleShape());
            if (z2) {
                fM3765constructorimpl2 = fM3765constructorimpl;
            } else {
                fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
            }
            AndroidView_androidKt.AndroidView(OooO00o.f56616OooO0Oo, modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder15, fM3765constructorimpl2)), new OooO0O0(oooOO0OooO0Oo, str), composerStartRestartGroup, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        z3 = z2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str, modifier, oooOO0OooO0Oo, fM3765constructorimpl, jM1705getTransparent0d7_KjU, z3, i, i2));
    }

    @Composable
    @JvmName(name = "getDsp")
    public static final long OooO0O0(int i, @Nullable Composer composer) {
        composer.startReplaceableGroup(1020977118);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1020977118, 6, -1, "com.yalla.yalla.util.<get-dsp> (ComposeUtil.kt:24)");
        }
        long jMo326toSp0xMU5do = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo326toSp0xMU5do(Dp.m3765constructorimpl(i));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return jMo326toSp0xMU5do;
    }
}
