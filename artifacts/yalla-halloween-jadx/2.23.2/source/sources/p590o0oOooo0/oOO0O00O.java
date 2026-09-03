package p590o0oOooo0;

import android.content.Context;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.InlineTextContentKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.yalla.netimage.NetImageView;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p368o0OOo0Oo.Oooo000;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nComposeUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeUtil.kt\ncom/yalla/yalla/util/ComposeUtilKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,134:1\n76#2:135\n154#3:136\n154#3:137\n154#3:138\n154#3:139\n25#4:140\n25#4:147\n1097#5,6:141\n1097#5,6:148\n1098#6:154\n1864#7,3:155\n*S KotlinDebug\n*F\n+ 1 ComposeUtil.kt\ncom/yalla/yalla/util/ComposeUtilKt\n*L\n34#1:135\n37#1:136\n50#1:137\n62#1:138\n86#1:139\n104#1:140\n108#1:147\n104#1:141,6\n108#1:148,6\n114#1:154\n115#1:155,3\n*E\n"})
public final class oOO0O00O {

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f57198OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f57199OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f57200OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Modifier f57201OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f57202OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f57203OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f57204OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO(String str, Modifier modifier, long j, long j2, Function2<? super Composer, ? super Integer, Unit> function2, int i, int i2) {
            super(2);
            this.f57199OooO0Oo = str;
            this.f57201OooO0o0 = modifier;
            this.f57200OooO0o = j;
            this.f57202OooO0oO = j2;
            this.f57203OooO0oo = function2;
            this.f57198OooO = i;
            this.f57204OooOO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oOO0O00O.OooO0O0(this.f57199OooO0Oo, this.f57201OooO0o0, this.f57200OooO0o, this.f57202OooO0oO, this.f57203OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f57198OooO | 1), this.f57204OooOO0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<Context, NetImageView> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f57205OooO0Oo = new OooO00o();

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
        public final /* synthetic */ Oooo000 f57206OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f57207OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Oooo000 oooo000, String str) {
            super(1);
            this.f57206OooO0Oo = oooo000;
            this.f57207OooO0o0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(NetImageView netImageView) {
            NetImageView it = netImageView;
            Intrinsics.checkNotNullParameter(it, "it");
            Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(it.getContext());
            oooO00o.OooO00o(this.f57206OooO0Oo);
            oooO00o.f43126OooO0OO = this.f57207OooO0o0;
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0Oo(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ boolean f57208OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f57209OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Oooo000 f57210OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Modifier f57211OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ float f57212OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ long f57213OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f57214OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f57215OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(String str, Modifier modifier, Oooo000 oooo000, float f, long j, boolean z, int i, int i2) {
            super(2);
            this.f57209OooO0Oo = str;
            this.f57211OooO0o0 = modifier;
            this.f57210OooO0o = oooo000;
            this.f57212OooO0oO = f;
            this.f57213OooO0oo = j;
            this.f57208OooO = z;
            this.f57214OooOO0 = i;
            this.f57215OooOO0O = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oOO0O00O.OooO00o(this.f57209OooO0Oo, this.f57211OooO0o0, this.f57210OooO0o, this.f57212OooO0oO, this.f57213OooO0oo, this.f57208OooO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f57214OooOO0 | 1), this.f57215OooOO0O);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function3<String, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f57216OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f57217OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(Function2<? super Composer, ? super Integer, Unit> function2, int i) {
            super(3);
            this.f57216OooO0Oo = function2;
            this.f57217OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(String str, Composer composer, Integer num) {
            String it = str;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(it, "it");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(173952372, iIntValue, -1, "com.yalla.yalla.util.TextAddTag.<anonymous> (ComposeUtil.kt:126)");
                }
                Function2<Composer, Integer, Unit> function2 = this.f57216OooO0Oo;
                if (function2 != null) {
                    function2.invoke(composer2, Integer.valueOf((this.f57217OooO0o0 >> 12) & 14));
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x015f  */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:76:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00da  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:89:0x0108  */
    /* JADX WARN: Code duplicated, block: B:92:0x0125  */
    /* JADX WARN: Code duplicated, block: B:93:0x0127  */
    /* JADX WARN: Code duplicated, block: B:96:0x0152  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@Nullable String str, @NotNull Modifier modifier, @Nullable Oooo000 oooo000, float f, long j, boolean z, @Nullable Composer composer, int i, int i2) {
        int i3;
        float f2;
        int i4;
        long j2;
        int i5;
        int i6;
        boolean z2;
        int i7;
        Oooo000 oooo000OooO0Oo;
        float fM3775constructorimpl;
        long jM1716getTransparent0d7_KjU;
        float fM3775constructorimpl2;
        float f3;
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
                    if (i8 != 4 && (374491 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        oooo000OooO0Oo = oooo000;
                        f3 = f2;
                        jM1716getTransparent0d7_KjU = j2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i8 != 0) {
                                oooo000OooO0Oo = d1.OooO0Oo();
                                Intrinsics.checkNotNullExpressionValue(oooo000OooO0Oo, "picture(...)");
                                i3 &= -897;
                            } else {
                                oooo000OooO0Oo = oooo000;
                            }
                            if (i9 != 0) {
                                fM3775constructorimpl = Dp.m3775constructorimpl(0);
                            } else {
                                fM3775constructorimpl = f2;
                            }
                            if (i4 != 0) {
                                jM1716getTransparent0d7_KjU = Color.INSTANCE.m1716getTransparent0d7_KjU();
                            } else {
                                jM1716getTransparent0d7_KjU = j2;
                            }
                            if (i6 != 0) {
                                z2 = true;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if (i8 != 0) {
                                i3 &= -897;
                            }
                            oooo000OooO0Oo = oooo000;
                            fM3775constructorimpl = f2;
                            jM1716getTransparent0d7_KjU = j2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-769695547, i3, -1, "com.yalla.yalla.util.ImageNet (ComposeUtil.kt:52)");
                        }
                        Modifier modifierBorder = BorderKt.border(Modifier.INSTANCE, new BorderStroke(fM3775constructorimpl, new SolidColor(jM1716getTransparent0d7_KjU, null), null), RoundedCornerShapeKt.getCircleShape());
                        if (z2) {
                            fM3775constructorimpl2 = fM3775constructorimpl;
                        } else {
                            fM3775constructorimpl2 = Dp.m3775constructorimpl(0);
                        }
                        AndroidView_androidKt.AndroidView(OooO00o.f57205OooO0Oo, modifier.then(PaddingKt.m478padding3ABfNKs(modifierBorder, fM3775constructorimpl2)), new OooO0O0(oooo000OooO0Oo, str), composerStartRestartGroup, 6, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f3 = fM3775constructorimpl;
                    }
                    z3 = z2;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str, modifier, oooo000OooO0Oo, f3, jM1716getTransparent0d7_KjU, z3, i, i2));
                }
                i3 |= 196608;
                z2 = z;
                if (i8 != 4) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            oooo000OooO0Oo = d1.OooO0Oo();
                            Intrinsics.checkNotNullExpressionValue(oooo000OooO0Oo, "picture(...)");
                            i3 &= -897;
                        } else {
                            oooo000OooO0Oo = oooo000;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f2;
                        }
                        if (i4 != 0) {
                            jM1716getTransparent0d7_KjU = Color.INSTANCE.m1716getTransparent0d7_KjU();
                        } else {
                            jM1716getTransparent0d7_KjU = j2;
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                    } else {
                        if (i8 != 0) {
                            oooo000OooO0Oo = d1.OooO0Oo();
                            Intrinsics.checkNotNullExpressionValue(oooo000OooO0Oo, "picture(...)");
                            i3 &= -897;
                        } else {
                            oooo000OooO0Oo = oooo000;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f2;
                        }
                        if (i4 != 0) {
                            jM1716getTransparent0d7_KjU = Color.INSTANCE.m1716getTransparent0d7_KjU();
                        } else {
                            jM1716getTransparent0d7_KjU = j2;
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-769695547, i3, -1, "com.yalla.yalla.util.ImageNet (ComposeUtil.kt:52)");
                    }
                    Modifier modifierBorder2 = BorderKt.border(Modifier.INSTANCE, new BorderStroke(fM3775constructorimpl, new SolidColor(jM1716getTransparent0d7_KjU, null), null), RoundedCornerShapeKt.getCircleShape());
                    if (z2) {
                        fM3775constructorimpl2 = fM3775constructorimpl;
                    } else {
                        fM3775constructorimpl2 = Dp.m3775constructorimpl(0);
                    }
                    AndroidView_androidKt.AndroidView(OooO00o.f57205OooO0Oo, modifier.then(PaddingKt.m478padding3ABfNKs(modifierBorder2, fM3775constructorimpl2)), new OooO0O0(oooo000OooO0Oo, str), composerStartRestartGroup, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f3 = fM3775constructorimpl;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            oooo000OooO0Oo = d1.OooO0Oo();
                            Intrinsics.checkNotNullExpressionValue(oooo000OooO0Oo, "picture(...)");
                            i3 &= -897;
                        } else {
                            oooo000OooO0Oo = oooo000;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f2;
                        }
                        if (i4 != 0) {
                            jM1716getTransparent0d7_KjU = Color.INSTANCE.m1716getTransparent0d7_KjU();
                        } else {
                            jM1716getTransparent0d7_KjU = j2;
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                    } else {
                        if (i8 != 0) {
                            oooo000OooO0Oo = d1.OooO0Oo();
                            Intrinsics.checkNotNullExpressionValue(oooo000OooO0Oo, "picture(...)");
                            i3 &= -897;
                        } else {
                            oooo000OooO0Oo = oooo000;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f2;
                        }
                        if (i4 != 0) {
                            jM1716getTransparent0d7_KjU = Color.INSTANCE.m1716getTransparent0d7_KjU();
                        } else {
                            jM1716getTransparent0d7_KjU = j2;
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-769695547, i3, -1, "com.yalla.yalla.util.ImageNet (ComposeUtil.kt:52)");
                    }
                    Modifier modifierBorder3 = BorderKt.border(Modifier.INSTANCE, new BorderStroke(fM3775constructorimpl, new SolidColor(jM1716getTransparent0d7_KjU, null), null), RoundedCornerShapeKt.getCircleShape());
                    if (z2) {
                        fM3775constructorimpl2 = fM3775constructorimpl;
                    } else {
                        fM3775constructorimpl2 = Dp.m3775constructorimpl(0);
                    }
                    AndroidView_androidKt.AndroidView(OooO00o.f57205OooO0Oo, modifier.then(PaddingKt.m478padding3ABfNKs(modifierBorder3, fM3775constructorimpl2)), new OooO0O0(oooo000OooO0Oo, str), composerStartRestartGroup, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f3 = fM3775constructorimpl;
                }
                z3 = z2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str, modifier, oooo000OooO0Oo, f3, jM1716getTransparent0d7_KjU, z3, i, i2));
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
                            oooo000OooO0Oo = d1.OooO0Oo();
                            Intrinsics.checkNotNullExpressionValue(oooo000OooO0Oo, "picture(...)");
                            i3 &= -897;
                        } else {
                            oooo000OooO0Oo = oooo000;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f2;
                        }
                        if (i4 != 0) {
                            jM1716getTransparent0d7_KjU = Color.INSTANCE.m1716getTransparent0d7_KjU();
                        } else {
                            jM1716getTransparent0d7_KjU = j2;
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                    } else {
                        if (i8 != 0) {
                            oooo000OooO0Oo = d1.OooO0Oo();
                            Intrinsics.checkNotNullExpressionValue(oooo000OooO0Oo, "picture(...)");
                            i3 &= -897;
                        } else {
                            oooo000OooO0Oo = oooo000;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f2;
                        }
                        if (i4 != 0) {
                            jM1716getTransparent0d7_KjU = Color.INSTANCE.m1716getTransparent0d7_KjU();
                        } else {
                            jM1716getTransparent0d7_KjU = j2;
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-769695547, i3, -1, "com.yalla.yalla.util.ImageNet (ComposeUtil.kt:52)");
                    }
                    Modifier modifierBorder4 = BorderKt.border(Modifier.INSTANCE, new BorderStroke(fM3775constructorimpl, new SolidColor(jM1716getTransparent0d7_KjU, null), null), RoundedCornerShapeKt.getCircleShape());
                    if (z2) {
                        fM3775constructorimpl2 = fM3775constructorimpl;
                    } else {
                        fM3775constructorimpl2 = Dp.m3775constructorimpl(0);
                    }
                    AndroidView_androidKt.AndroidView(OooO00o.f57205OooO0Oo, modifier.then(PaddingKt.m478padding3ABfNKs(modifierBorder4, fM3775constructorimpl2)), new OooO0O0(oooo000OooO0Oo, str), composerStartRestartGroup, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f3 = fM3775constructorimpl;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            oooo000OooO0Oo = d1.OooO0Oo();
                            Intrinsics.checkNotNullExpressionValue(oooo000OooO0Oo, "picture(...)");
                            i3 &= -897;
                        } else {
                            oooo000OooO0Oo = oooo000;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f2;
                        }
                        if (i4 != 0) {
                            jM1716getTransparent0d7_KjU = Color.INSTANCE.m1716getTransparent0d7_KjU();
                        } else {
                            jM1716getTransparent0d7_KjU = j2;
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                    } else {
                        if (i8 != 0) {
                            oooo000OooO0Oo = d1.OooO0Oo();
                            Intrinsics.checkNotNullExpressionValue(oooo000OooO0Oo, "picture(...)");
                            i3 &= -897;
                        } else {
                            oooo000OooO0Oo = oooo000;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f2;
                        }
                        if (i4 != 0) {
                            jM1716getTransparent0d7_KjU = Color.INSTANCE.m1716getTransparent0d7_KjU();
                        } else {
                            jM1716getTransparent0d7_KjU = j2;
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-769695547, i3, -1, "com.yalla.yalla.util.ImageNet (ComposeUtil.kt:52)");
                    }
                    Modifier modifierBorder5 = BorderKt.border(Modifier.INSTANCE, new BorderStroke(fM3775constructorimpl, new SolidColor(jM1716getTransparent0d7_KjU, null), null), RoundedCornerShapeKt.getCircleShape());
                    if (z2) {
                        fM3775constructorimpl2 = fM3775constructorimpl;
                    } else {
                        fM3775constructorimpl2 = Dp.m3775constructorimpl(0);
                    }
                    AndroidView_androidKt.AndroidView(OooO00o.f57205OooO0Oo, modifier.then(PaddingKt.m478padding3ABfNKs(modifierBorder5, fM3775constructorimpl2)), new OooO0O0(oooo000OooO0Oo, str), composerStartRestartGroup, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f3 = fM3775constructorimpl;
                }
                z3 = z2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str, modifier, oooo000OooO0Oo, f3, jM1716getTransparent0d7_KjU, z3, i, i2));
            }
            i3 |= 196608;
            z2 = z;
            if (i8 != 4) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        oooo000OooO0Oo = d1.OooO0Oo();
                        Intrinsics.checkNotNullExpressionValue(oooo000OooO0Oo, "picture(...)");
                        i3 &= -897;
                    } else {
                        oooo000OooO0Oo = oooo000;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        jM1716getTransparent0d7_KjU = Color.INSTANCE.m1716getTransparent0d7_KjU();
                    } else {
                        jM1716getTransparent0d7_KjU = j2;
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                } else {
                    if (i8 != 0) {
                        oooo000OooO0Oo = d1.OooO0Oo();
                        Intrinsics.checkNotNullExpressionValue(oooo000OooO0Oo, "picture(...)");
                        i3 &= -897;
                    } else {
                        oooo000OooO0Oo = oooo000;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        jM1716getTransparent0d7_KjU = Color.INSTANCE.m1716getTransparent0d7_KjU();
                    } else {
                        jM1716getTransparent0d7_KjU = j2;
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-769695547, i3, -1, "com.yalla.yalla.util.ImageNet (ComposeUtil.kt:52)");
                }
                Modifier modifierBorder6 = BorderKt.border(Modifier.INSTANCE, new BorderStroke(fM3775constructorimpl, new SolidColor(jM1716getTransparent0d7_KjU, null), null), RoundedCornerShapeKt.getCircleShape());
                if (z2) {
                    fM3775constructorimpl2 = fM3775constructorimpl;
                } else {
                    fM3775constructorimpl2 = Dp.m3775constructorimpl(0);
                }
                AndroidView_androidKt.AndroidView(OooO00o.f57205OooO0Oo, modifier.then(PaddingKt.m478padding3ABfNKs(modifierBorder6, fM3775constructorimpl2)), new OooO0O0(oooo000OooO0Oo, str), composerStartRestartGroup, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f3 = fM3775constructorimpl;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        oooo000OooO0Oo = d1.OooO0Oo();
                        Intrinsics.checkNotNullExpressionValue(oooo000OooO0Oo, "picture(...)");
                        i3 &= -897;
                    } else {
                        oooo000OooO0Oo = oooo000;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        jM1716getTransparent0d7_KjU = Color.INSTANCE.m1716getTransparent0d7_KjU();
                    } else {
                        jM1716getTransparent0d7_KjU = j2;
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                } else {
                    if (i8 != 0) {
                        oooo000OooO0Oo = d1.OooO0Oo();
                        Intrinsics.checkNotNullExpressionValue(oooo000OooO0Oo, "picture(...)");
                        i3 &= -897;
                    } else {
                        oooo000OooO0Oo = oooo000;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        jM1716getTransparent0d7_KjU = Color.INSTANCE.m1716getTransparent0d7_KjU();
                    } else {
                        jM1716getTransparent0d7_KjU = j2;
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-769695547, i3, -1, "com.yalla.yalla.util.ImageNet (ComposeUtil.kt:52)");
                }
                Modifier modifierBorder7 = BorderKt.border(Modifier.INSTANCE, new BorderStroke(fM3775constructorimpl, new SolidColor(jM1716getTransparent0d7_KjU, null), null), RoundedCornerShapeKt.getCircleShape());
                if (z2) {
                    fM3775constructorimpl2 = fM3775constructorimpl;
                } else {
                    fM3775constructorimpl2 = Dp.m3775constructorimpl(0);
                }
                AndroidView_androidKt.AndroidView(OooO00o.f57205OooO0Oo, modifier.then(PaddingKt.m478padding3ABfNKs(modifierBorder7, fM3775constructorimpl2)), new OooO0O0(oooo000OooO0Oo, str), composerStartRestartGroup, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f3 = fM3775constructorimpl;
            }
            z3 = z2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str, modifier, oooo000OooO0Oo, f3, jM1716getTransparent0d7_KjU, z3, i, i2));
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
                            oooo000OooO0Oo = d1.OooO0Oo();
                            Intrinsics.checkNotNullExpressionValue(oooo000OooO0Oo, "picture(...)");
                            i3 &= -897;
                        } else {
                            oooo000OooO0Oo = oooo000;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f2;
                        }
                        if (i4 != 0) {
                            jM1716getTransparent0d7_KjU = Color.INSTANCE.m1716getTransparent0d7_KjU();
                        } else {
                            jM1716getTransparent0d7_KjU = j2;
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                    } else {
                        if (i8 != 0) {
                            oooo000OooO0Oo = d1.OooO0Oo();
                            Intrinsics.checkNotNullExpressionValue(oooo000OooO0Oo, "picture(...)");
                            i3 &= -897;
                        } else {
                            oooo000OooO0Oo = oooo000;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f2;
                        }
                        if (i4 != 0) {
                            jM1716getTransparent0d7_KjU = Color.INSTANCE.m1716getTransparent0d7_KjU();
                        } else {
                            jM1716getTransparent0d7_KjU = j2;
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-769695547, i3, -1, "com.yalla.yalla.util.ImageNet (ComposeUtil.kt:52)");
                    }
                    Modifier modifierBorder8 = BorderKt.border(Modifier.INSTANCE, new BorderStroke(fM3775constructorimpl, new SolidColor(jM1716getTransparent0d7_KjU, null), null), RoundedCornerShapeKt.getCircleShape());
                    if (z2) {
                        fM3775constructorimpl2 = fM3775constructorimpl;
                    } else {
                        fM3775constructorimpl2 = Dp.m3775constructorimpl(0);
                    }
                    AndroidView_androidKt.AndroidView(OooO00o.f57205OooO0Oo, modifier.then(PaddingKt.m478padding3ABfNKs(modifierBorder8, fM3775constructorimpl2)), new OooO0O0(oooo000OooO0Oo, str), composerStartRestartGroup, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f3 = fM3775constructorimpl;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            oooo000OooO0Oo = d1.OooO0Oo();
                            Intrinsics.checkNotNullExpressionValue(oooo000OooO0Oo, "picture(...)");
                            i3 &= -897;
                        } else {
                            oooo000OooO0Oo = oooo000;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f2;
                        }
                        if (i4 != 0) {
                            jM1716getTransparent0d7_KjU = Color.INSTANCE.m1716getTransparent0d7_KjU();
                        } else {
                            jM1716getTransparent0d7_KjU = j2;
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                    } else {
                        if (i8 != 0) {
                            oooo000OooO0Oo = d1.OooO0Oo();
                            Intrinsics.checkNotNullExpressionValue(oooo000OooO0Oo, "picture(...)");
                            i3 &= -897;
                        } else {
                            oooo000OooO0Oo = oooo000;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f2;
                        }
                        if (i4 != 0) {
                            jM1716getTransparent0d7_KjU = Color.INSTANCE.m1716getTransparent0d7_KjU();
                        } else {
                            jM1716getTransparent0d7_KjU = j2;
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-769695547, i3, -1, "com.yalla.yalla.util.ImageNet (ComposeUtil.kt:52)");
                    }
                    Modifier modifierBorder9 = BorderKt.border(Modifier.INSTANCE, new BorderStroke(fM3775constructorimpl, new SolidColor(jM1716getTransparent0d7_KjU, null), null), RoundedCornerShapeKt.getCircleShape());
                    if (z2) {
                        fM3775constructorimpl2 = fM3775constructorimpl;
                    } else {
                        fM3775constructorimpl2 = Dp.m3775constructorimpl(0);
                    }
                    AndroidView_androidKt.AndroidView(OooO00o.f57205OooO0Oo, modifier.then(PaddingKt.m478padding3ABfNKs(modifierBorder9, fM3775constructorimpl2)), new OooO0O0(oooo000OooO0Oo, str), composerStartRestartGroup, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f3 = fM3775constructorimpl;
                }
                z3 = z2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str, modifier, oooo000OooO0Oo, f3, jM1716getTransparent0d7_KjU, z3, i, i2));
            }
            i3 |= 196608;
            z2 = z;
            if (i8 != 4) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        oooo000OooO0Oo = d1.OooO0Oo();
                        Intrinsics.checkNotNullExpressionValue(oooo000OooO0Oo, "picture(...)");
                        i3 &= -897;
                    } else {
                        oooo000OooO0Oo = oooo000;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        jM1716getTransparent0d7_KjU = Color.INSTANCE.m1716getTransparent0d7_KjU();
                    } else {
                        jM1716getTransparent0d7_KjU = j2;
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                } else {
                    if (i8 != 0) {
                        oooo000OooO0Oo = d1.OooO0Oo();
                        Intrinsics.checkNotNullExpressionValue(oooo000OooO0Oo, "picture(...)");
                        i3 &= -897;
                    } else {
                        oooo000OooO0Oo = oooo000;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        jM1716getTransparent0d7_KjU = Color.INSTANCE.m1716getTransparent0d7_KjU();
                    } else {
                        jM1716getTransparent0d7_KjU = j2;
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-769695547, i3, -1, "com.yalla.yalla.util.ImageNet (ComposeUtil.kt:52)");
                }
                Modifier modifierBorder10 = BorderKt.border(Modifier.INSTANCE, new BorderStroke(fM3775constructorimpl, new SolidColor(jM1716getTransparent0d7_KjU, null), null), RoundedCornerShapeKt.getCircleShape());
                if (z2) {
                    fM3775constructorimpl2 = fM3775constructorimpl;
                } else {
                    fM3775constructorimpl2 = Dp.m3775constructorimpl(0);
                }
                AndroidView_androidKt.AndroidView(OooO00o.f57205OooO0Oo, modifier.then(PaddingKt.m478padding3ABfNKs(modifierBorder10, fM3775constructorimpl2)), new OooO0O0(oooo000OooO0Oo, str), composerStartRestartGroup, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f3 = fM3775constructorimpl;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        oooo000OooO0Oo = d1.OooO0Oo();
                        Intrinsics.checkNotNullExpressionValue(oooo000OooO0Oo, "picture(...)");
                        i3 &= -897;
                    } else {
                        oooo000OooO0Oo = oooo000;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        jM1716getTransparent0d7_KjU = Color.INSTANCE.m1716getTransparent0d7_KjU();
                    } else {
                        jM1716getTransparent0d7_KjU = j2;
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                } else {
                    if (i8 != 0) {
                        oooo000OooO0Oo = d1.OooO0Oo();
                        Intrinsics.checkNotNullExpressionValue(oooo000OooO0Oo, "picture(...)");
                        i3 &= -897;
                    } else {
                        oooo000OooO0Oo = oooo000;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        jM1716getTransparent0d7_KjU = Color.INSTANCE.m1716getTransparent0d7_KjU();
                    } else {
                        jM1716getTransparent0d7_KjU = j2;
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-769695547, i3, -1, "com.yalla.yalla.util.ImageNet (ComposeUtil.kt:52)");
                }
                Modifier modifierBorder11 = BorderKt.border(Modifier.INSTANCE, new BorderStroke(fM3775constructorimpl, new SolidColor(jM1716getTransparent0d7_KjU, null), null), RoundedCornerShapeKt.getCircleShape());
                if (z2) {
                    fM3775constructorimpl2 = fM3775constructorimpl;
                } else {
                    fM3775constructorimpl2 = Dp.m3775constructorimpl(0);
                }
                AndroidView_androidKt.AndroidView(OooO00o.f57205OooO0Oo, modifier.then(PaddingKt.m478padding3ABfNKs(modifierBorder11, fM3775constructorimpl2)), new OooO0O0(oooo000OooO0Oo, str), composerStartRestartGroup, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f3 = fM3775constructorimpl;
            }
            z3 = z2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str, modifier, oooo000OooO0Oo, f3, jM1716getTransparent0d7_KjU, z3, i, i2));
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
                        oooo000OooO0Oo = d1.OooO0Oo();
                        Intrinsics.checkNotNullExpressionValue(oooo000OooO0Oo, "picture(...)");
                        i3 &= -897;
                    } else {
                        oooo000OooO0Oo = oooo000;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        jM1716getTransparent0d7_KjU = Color.INSTANCE.m1716getTransparent0d7_KjU();
                    } else {
                        jM1716getTransparent0d7_KjU = j2;
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                } else {
                    if (i8 != 0) {
                        oooo000OooO0Oo = d1.OooO0Oo();
                        Intrinsics.checkNotNullExpressionValue(oooo000OooO0Oo, "picture(...)");
                        i3 &= -897;
                    } else {
                        oooo000OooO0Oo = oooo000;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        jM1716getTransparent0d7_KjU = Color.INSTANCE.m1716getTransparent0d7_KjU();
                    } else {
                        jM1716getTransparent0d7_KjU = j2;
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-769695547, i3, -1, "com.yalla.yalla.util.ImageNet (ComposeUtil.kt:52)");
                }
                Modifier modifierBorder12 = BorderKt.border(Modifier.INSTANCE, new BorderStroke(fM3775constructorimpl, new SolidColor(jM1716getTransparent0d7_KjU, null), null), RoundedCornerShapeKt.getCircleShape());
                if (z2) {
                    fM3775constructorimpl2 = fM3775constructorimpl;
                } else {
                    fM3775constructorimpl2 = Dp.m3775constructorimpl(0);
                }
                AndroidView_androidKt.AndroidView(OooO00o.f57205OooO0Oo, modifier.then(PaddingKt.m478padding3ABfNKs(modifierBorder12, fM3775constructorimpl2)), new OooO0O0(oooo000OooO0Oo, str), composerStartRestartGroup, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f3 = fM3775constructorimpl;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        oooo000OooO0Oo = d1.OooO0Oo();
                        Intrinsics.checkNotNullExpressionValue(oooo000OooO0Oo, "picture(...)");
                        i3 &= -897;
                    } else {
                        oooo000OooO0Oo = oooo000;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        jM1716getTransparent0d7_KjU = Color.INSTANCE.m1716getTransparent0d7_KjU();
                    } else {
                        jM1716getTransparent0d7_KjU = j2;
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                } else {
                    if (i8 != 0) {
                        oooo000OooO0Oo = d1.OooO0Oo();
                        Intrinsics.checkNotNullExpressionValue(oooo000OooO0Oo, "picture(...)");
                        i3 &= -897;
                    } else {
                        oooo000OooO0Oo = oooo000;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        jM1716getTransparent0d7_KjU = Color.INSTANCE.m1716getTransparent0d7_KjU();
                    } else {
                        jM1716getTransparent0d7_KjU = j2;
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-769695547, i3, -1, "com.yalla.yalla.util.ImageNet (ComposeUtil.kt:52)");
                }
                Modifier modifierBorder13 = BorderKt.border(Modifier.INSTANCE, new BorderStroke(fM3775constructorimpl, new SolidColor(jM1716getTransparent0d7_KjU, null), null), RoundedCornerShapeKt.getCircleShape());
                if (z2) {
                    fM3775constructorimpl2 = fM3775constructorimpl;
                } else {
                    fM3775constructorimpl2 = Dp.m3775constructorimpl(0);
                }
                AndroidView_androidKt.AndroidView(OooO00o.f57205OooO0Oo, modifier.then(PaddingKt.m478padding3ABfNKs(modifierBorder13, fM3775constructorimpl2)), new OooO0O0(oooo000OooO0Oo, str), composerStartRestartGroup, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f3 = fM3775constructorimpl;
            }
            z3 = z2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str, modifier, oooo000OooO0Oo, f3, jM1716getTransparent0d7_KjU, z3, i, i2));
        }
        i3 |= 196608;
        z2 = z;
        if (i8 != 4) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    oooo000OooO0Oo = d1.OooO0Oo();
                    Intrinsics.checkNotNullExpressionValue(oooo000OooO0Oo, "picture(...)");
                    i3 &= -897;
                } else {
                    oooo000OooO0Oo = oooo000;
                }
                if (i9 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(0);
                } else {
                    fM3775constructorimpl = f2;
                }
                if (i4 != 0) {
                    jM1716getTransparent0d7_KjU = Color.INSTANCE.m1716getTransparent0d7_KjU();
                } else {
                    jM1716getTransparent0d7_KjU = j2;
                }
                if (i6 != 0) {
                    z2 = true;
                }
            } else {
                if (i8 != 0) {
                    oooo000OooO0Oo = d1.OooO0Oo();
                    Intrinsics.checkNotNullExpressionValue(oooo000OooO0Oo, "picture(...)");
                    i3 &= -897;
                } else {
                    oooo000OooO0Oo = oooo000;
                }
                if (i9 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(0);
                } else {
                    fM3775constructorimpl = f2;
                }
                if (i4 != 0) {
                    jM1716getTransparent0d7_KjU = Color.INSTANCE.m1716getTransparent0d7_KjU();
                } else {
                    jM1716getTransparent0d7_KjU = j2;
                }
                if (i6 != 0) {
                    z2 = true;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-769695547, i3, -1, "com.yalla.yalla.util.ImageNet (ComposeUtil.kt:52)");
            }
            Modifier modifierBorder14 = BorderKt.border(Modifier.INSTANCE, new BorderStroke(fM3775constructorimpl, new SolidColor(jM1716getTransparent0d7_KjU, null), null), RoundedCornerShapeKt.getCircleShape());
            if (z2) {
                fM3775constructorimpl2 = fM3775constructorimpl;
            } else {
                fM3775constructorimpl2 = Dp.m3775constructorimpl(0);
            }
            AndroidView_androidKt.AndroidView(OooO00o.f57205OooO0Oo, modifier.then(PaddingKt.m478padding3ABfNKs(modifierBorder14, fM3775constructorimpl2)), new OooO0O0(oooo000OooO0Oo, str), composerStartRestartGroup, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f3 = fM3775constructorimpl;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    oooo000OooO0Oo = d1.OooO0Oo();
                    Intrinsics.checkNotNullExpressionValue(oooo000OooO0Oo, "picture(...)");
                    i3 &= -897;
                } else {
                    oooo000OooO0Oo = oooo000;
                }
                if (i9 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(0);
                } else {
                    fM3775constructorimpl = f2;
                }
                if (i4 != 0) {
                    jM1716getTransparent0d7_KjU = Color.INSTANCE.m1716getTransparent0d7_KjU();
                } else {
                    jM1716getTransparent0d7_KjU = j2;
                }
                if (i6 != 0) {
                    z2 = true;
                }
            } else {
                if (i8 != 0) {
                    oooo000OooO0Oo = d1.OooO0Oo();
                    Intrinsics.checkNotNullExpressionValue(oooo000OooO0Oo, "picture(...)");
                    i3 &= -897;
                } else {
                    oooo000OooO0Oo = oooo000;
                }
                if (i9 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(0);
                } else {
                    fM3775constructorimpl = f2;
                }
                if (i4 != 0) {
                    jM1716getTransparent0d7_KjU = Color.INSTANCE.m1716getTransparent0d7_KjU();
                } else {
                    jM1716getTransparent0d7_KjU = j2;
                }
                if (i6 != 0) {
                    z2 = true;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-769695547, i3, -1, "com.yalla.yalla.util.ImageNet (ComposeUtil.kt:52)");
            }
            Modifier modifierBorder15 = BorderKt.border(Modifier.INSTANCE, new BorderStroke(fM3775constructorimpl, new SolidColor(jM1716getTransparent0d7_KjU, null), null), RoundedCornerShapeKt.getCircleShape());
            if (z2) {
                fM3775constructorimpl2 = fM3775constructorimpl;
            } else {
                fM3775constructorimpl2 = Dp.m3775constructorimpl(0);
            }
            AndroidView_androidKt.AndroidView(OooO00o.f57205OooO0Oo, modifier.then(PaddingKt.m478padding3ABfNKs(modifierBorder15, fM3775constructorimpl2)), new OooO0O0(oooo000OooO0Oo, str), composerStartRestartGroup, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f3 = fM3775constructorimpl;
        }
        z3 = z2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str, modifier, oooo000OooO0Oo, f3, jM1716getTransparent0d7_KjU, z3, i, i2));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:81:0x0111  */
    /* JADX WARN: Code duplicated, block: B:85:0x0133  */
    /* JADX WARN: Code duplicated, block: B:87:0x013b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0142  */
    /* JADX WARN: Code duplicated, block: B:91:0x014a  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c5  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
    public static final void OooO0O0(@NotNull String text, @Nullable Modifier modifier, long j, long j2, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        long j3;
        int i5;
        int i6;
        long j4;
        int i7;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function3;
        int i9;
        long jM1717getUnspecified0d7_KjU;
        long jM3967getUnspecifiedXSAIIZE;
        Object objRememberedValue;
        Composer.Companion companion;
        String str;
        Object objRememberedValue2;
        int i10;
        AnnotatedString.Builder builder;
        Function2<? super Composer, ? super Integer, Unit> function4;
        long j5;
        long j6;
        String str2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-571024235);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    j3 = j;
                    if (composerStartRestartGroup.changed(j3)) {
                        i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 7168) == 0) {
                        j4 = j2;
                        if (composerStartRestartGroup.changed(j4)) {
                            i7 = 2048;
                        } else {
                            i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        i3 |= 24576;
                        function3 = function2;
                    } else {
                        function3 = function2;
                        if ((i & 57344) == 0) {
                            if (composerStartRestartGroup.changedInstance(function3)) {
                                i9 = 16384;
                            } else {
                                i9 = 8192;
                            }
                            i3 |= i9;
                        }
                    }
                    if ((i3 & 46811) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j3;
                        }
                        if (i6 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j4;
                        }
                        if (i8 != 0) {
                            function3 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-571024235, i3, -1, "com.yalla.yalla.util.TextAddTag (ComposeUtil.kt:102)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = "Tag";
                            composerStartRestartGroup.updateRememberedValue("Tag");
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        str = (String) objRememberedValue;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        i10 = 0;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = StringsKt__StringsKt.split$default((CharSequence) text, new String[]{"ImageTag "}, true, 0, 4, (Object) null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        builder = new AnnotatedString.Builder(0, 1, null);
                        for (Object obj : (List) objRememberedValue2) {
                            int i12 = i10 + 1;
                            if (i10 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            str2 = (String) obj;
                            if (i10 == 0) {
                                builder.append(str2);
                                InlineTextContentKt.appendInlineContent$default(builder, str, null, 2, null);
                            } else {
                                builder.append(str2);
                            }
                            i10 = i12;
                        }
                        TextKt.m1262TextIbK3jfQ(builder.toAnnotatedString(), Modifier.INSTANCE.then(modifier2), jM1717getUnspecified0d7_KjU, jM3967getUnspecifiedXSAIIZE, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, MapsKt.mapOf(TuplesKt.to(str, new InlineTextContent(new Placeholder(TextUnitKt.getSp(15), TextUnitKt.getSp(15), PlaceholderVerticalAlign.INSTANCE.m3255getTextCenterJ6kI3mc(), null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173952372, true, new OooO0o(function3, i3))))), null, null, composerStartRestartGroup, (i3 & 896) | (i3 & 7168), 0, 229360);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function4 = function3;
                        j5 = jM1717getUnspecified0d7_KjU;
                        j6 = jM3967getUnspecifiedXSAIIZE;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        function4 = function3;
                        j5 = j3;
                        j6 = j4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO(text, modifier2, j5, j6, function4, i, i2));
                }
                i3 |= 3072;
                j4 = j2;
                i8 = i2 & 16;
                if (i8 != 0) {
                    i3 |= 24576;
                    function3 = function2;
                } else {
                    function3 = function2;
                    if ((i & 57344) == 0) {
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                }
                if ((i3 & 46811) == 9362) {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                    } else {
                        jM1717getUnspecified0d7_KjU = j3;
                    }
                    if (i6 != 0) {
                        jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE = j4;
                    }
                    if (i8 != 0) {
                        function3 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-571024235, i3, -1, "com.yalla.yalla.util.TextAddTag (ComposeUtil.kt:102)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = "Tag";
                        composerStartRestartGroup.updateRememberedValue("Tag");
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    str = (String) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    i10 = 0;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = StringsKt__StringsKt.split$default((CharSequence) text, new String[]{"ImageTag "}, true, 0, 4, (Object) null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    builder = new AnnotatedString.Builder(0, 1, null);
                    while (r4.hasNext()) {
                        int i13 = i10 + 1;
                        if (i10 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        str2 = (String) obj;
                        if (i10 == 0) {
                            builder.append(str2);
                            InlineTextContentKt.appendInlineContent$default(builder, str, null, 2, null);
                        } else {
                            builder.append(str2);
                        }
                        i10 = i13;
                    }
                    TextKt.m1262TextIbK3jfQ(builder.toAnnotatedString(), Modifier.INSTANCE.then(modifier2), jM1717getUnspecified0d7_KjU, jM3967getUnspecifiedXSAIIZE, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, MapsKt.mapOf(TuplesKt.to(str, new InlineTextContent(new Placeholder(TextUnitKt.getSp(15), TextUnitKt.getSp(15), PlaceholderVerticalAlign.INSTANCE.m3255getTextCenterJ6kI3mc(), null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173952372, true, new OooO0o(function3, i3))))), null, null, composerStartRestartGroup, (i3 & 896) | (i3 & 7168), 0, 229360);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function4 = function3;
                    j5 = jM1717getUnspecified0d7_KjU;
                    j6 = jM3967getUnspecifiedXSAIIZE;
                } else {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                    } else {
                        jM1717getUnspecified0d7_KjU = j3;
                    }
                    if (i6 != 0) {
                        jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE = j4;
                    }
                    if (i8 != 0) {
                        function3 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-571024235, i3, -1, "com.yalla.yalla.util.TextAddTag (ComposeUtil.kt:102)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = "Tag";
                        composerStartRestartGroup.updateRememberedValue("Tag");
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    str = (String) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    i10 = 0;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = StringsKt__StringsKt.split$default((CharSequence) text, new String[]{"ImageTag "}, true, 0, 4, (Object) null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    builder = new AnnotatedString.Builder(0, 1, null);
                    while (r4.hasNext()) {
                        int i14 = i10 + 1;
                        if (i10 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        str2 = (String) obj;
                        if (i10 == 0) {
                            builder.append(str2);
                            InlineTextContentKt.appendInlineContent$default(builder, str, null, 2, null);
                        } else {
                            builder.append(str2);
                        }
                        i10 = i14;
                    }
                    TextKt.m1262TextIbK3jfQ(builder.toAnnotatedString(), Modifier.INSTANCE.then(modifier2), jM1717getUnspecified0d7_KjU, jM3967getUnspecifiedXSAIIZE, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, MapsKt.mapOf(TuplesKt.to(str, new InlineTextContent(new Placeholder(TextUnitKt.getSp(15), TextUnitKt.getSp(15), PlaceholderVerticalAlign.INSTANCE.m3255getTextCenterJ6kI3mc(), null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173952372, true, new OooO0o(function3, i3))))), null, null, composerStartRestartGroup, (i3 & 896) | (i3 & 7168), 0, 229360);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function4 = function3;
                    j5 = jM1717getUnspecified0d7_KjU;
                    j6 = jM3967getUnspecifiedXSAIIZE;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO(text, modifier2, j5, j6, function4, i, i2));
            }
            i3 |= 384;
            j3 = j;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    j4 = j2;
                    if (composerStartRestartGroup.changed(j4)) {
                        i7 = 2048;
                    } else {
                        i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    i3 |= 24576;
                    function3 = function2;
                } else {
                    function3 = function2;
                    if ((i & 57344) == 0) {
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                }
                if ((i3 & 46811) == 9362) {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                    } else {
                        jM1717getUnspecified0d7_KjU = j3;
                    }
                    if (i6 != 0) {
                        jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE = j4;
                    }
                    if (i8 != 0) {
                        function3 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-571024235, i3, -1, "com.yalla.yalla.util.TextAddTag (ComposeUtil.kt:102)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = "Tag";
                        composerStartRestartGroup.updateRememberedValue("Tag");
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    str = (String) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    i10 = 0;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = StringsKt__StringsKt.split$default((CharSequence) text, new String[]{"ImageTag "}, true, 0, 4, (Object) null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    builder = new AnnotatedString.Builder(0, 1, null);
                    while (r4.hasNext()) {
                        int i15 = i10 + 1;
                        if (i10 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        str2 = (String) obj;
                        if (i10 == 0) {
                            builder.append(str2);
                            InlineTextContentKt.appendInlineContent$default(builder, str, null, 2, null);
                        } else {
                            builder.append(str2);
                        }
                        i10 = i15;
                    }
                    TextKt.m1262TextIbK3jfQ(builder.toAnnotatedString(), Modifier.INSTANCE.then(modifier2), jM1717getUnspecified0d7_KjU, jM3967getUnspecifiedXSAIIZE, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, MapsKt.mapOf(TuplesKt.to(str, new InlineTextContent(new Placeholder(TextUnitKt.getSp(15), TextUnitKt.getSp(15), PlaceholderVerticalAlign.INSTANCE.m3255getTextCenterJ6kI3mc(), null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173952372, true, new OooO0o(function3, i3))))), null, null, composerStartRestartGroup, (i3 & 896) | (i3 & 7168), 0, 229360);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function4 = function3;
                    j5 = jM1717getUnspecified0d7_KjU;
                    j6 = jM3967getUnspecifiedXSAIIZE;
                } else {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                    } else {
                        jM1717getUnspecified0d7_KjU = j3;
                    }
                    if (i6 != 0) {
                        jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE = j4;
                    }
                    if (i8 != 0) {
                        function3 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-571024235, i3, -1, "com.yalla.yalla.util.TextAddTag (ComposeUtil.kt:102)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = "Tag";
                        composerStartRestartGroup.updateRememberedValue("Tag");
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    str = (String) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    i10 = 0;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = StringsKt__StringsKt.split$default((CharSequence) text, new String[]{"ImageTag "}, true, 0, 4, (Object) null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    builder = new AnnotatedString.Builder(0, 1, null);
                    while (r4.hasNext()) {
                        int i16 = i10 + 1;
                        if (i10 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        str2 = (String) obj;
                        if (i10 == 0) {
                            builder.append(str2);
                            InlineTextContentKt.appendInlineContent$default(builder, str, null, 2, null);
                        } else {
                            builder.append(str2);
                        }
                        i10 = i16;
                    }
                    TextKt.m1262TextIbK3jfQ(builder.toAnnotatedString(), Modifier.INSTANCE.then(modifier2), jM1717getUnspecified0d7_KjU, jM3967getUnspecifiedXSAIIZE, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, MapsKt.mapOf(TuplesKt.to(str, new InlineTextContent(new Placeholder(TextUnitKt.getSp(15), TextUnitKt.getSp(15), PlaceholderVerticalAlign.INSTANCE.m3255getTextCenterJ6kI3mc(), null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173952372, true, new OooO0o(function3, i3))))), null, null, composerStartRestartGroup, (i3 & 896) | (i3 & 7168), 0, 229360);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function4 = function3;
                    j5 = jM1717getUnspecified0d7_KjU;
                    j6 = jM3967getUnspecifiedXSAIIZE;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO(text, modifier2, j5, j6, function4, i, i2));
            }
            i3 |= 3072;
            j4 = j2;
            i8 = i2 & 16;
            if (i8 != 0) {
                i3 |= 24576;
                function3 = function2;
            } else {
                function3 = function2;
                if ((i & 57344) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
            }
            if ((i3 & 46811) == 9362) {
                if (i11 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                } else {
                    jM1717getUnspecified0d7_KjU = j3;
                }
                if (i6 != 0) {
                    jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                } else {
                    jM3967getUnspecifiedXSAIIZE = j4;
                }
                if (i8 != 0) {
                    function3 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-571024235, i3, -1, "com.yalla.yalla.util.TextAddTag (ComposeUtil.kt:102)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = "Tag";
                    composerStartRestartGroup.updateRememberedValue("Tag");
                }
                composerStartRestartGroup.endReplaceableGroup();
                str = (String) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                i10 = 0;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = StringsKt__StringsKt.split$default((CharSequence) text, new String[]{"ImageTag "}, true, 0, 4, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                builder = new AnnotatedString.Builder(0, 1, null);
                while (r4.hasNext()) {
                    int i17 = i10 + 1;
                    if (i10 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    str2 = (String) obj;
                    if (i10 == 0) {
                        builder.append(str2);
                        InlineTextContentKt.appendInlineContent$default(builder, str, null, 2, null);
                    } else {
                        builder.append(str2);
                    }
                    i10 = i17;
                }
                TextKt.m1262TextIbK3jfQ(builder.toAnnotatedString(), Modifier.INSTANCE.then(modifier2), jM1717getUnspecified0d7_KjU, jM3967getUnspecifiedXSAIIZE, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, MapsKt.mapOf(TuplesKt.to(str, new InlineTextContent(new Placeholder(TextUnitKt.getSp(15), TextUnitKt.getSp(15), PlaceholderVerticalAlign.INSTANCE.m3255getTextCenterJ6kI3mc(), null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173952372, true, new OooO0o(function3, i3))))), null, null, composerStartRestartGroup, (i3 & 896) | (i3 & 7168), 0, 229360);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function3;
                j5 = jM1717getUnspecified0d7_KjU;
                j6 = jM3967getUnspecifiedXSAIIZE;
            } else {
                if (i11 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                } else {
                    jM1717getUnspecified0d7_KjU = j3;
                }
                if (i6 != 0) {
                    jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                } else {
                    jM3967getUnspecifiedXSAIIZE = j4;
                }
                if (i8 != 0) {
                    function3 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-571024235, i3, -1, "com.yalla.yalla.util.TextAddTag (ComposeUtil.kt:102)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = "Tag";
                    composerStartRestartGroup.updateRememberedValue("Tag");
                }
                composerStartRestartGroup.endReplaceableGroup();
                str = (String) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                i10 = 0;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = StringsKt__StringsKt.split$default((CharSequence) text, new String[]{"ImageTag "}, true, 0, 4, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                builder = new AnnotatedString.Builder(0, 1, null);
                while (r4.hasNext()) {
                    int i18 = i10 + 1;
                    if (i10 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    str2 = (String) obj;
                    if (i10 == 0) {
                        builder.append(str2);
                        InlineTextContentKt.appendInlineContent$default(builder, str, null, 2, null);
                    } else {
                        builder.append(str2);
                    }
                    i10 = i18;
                }
                TextKt.m1262TextIbK3jfQ(builder.toAnnotatedString(), Modifier.INSTANCE.then(modifier2), jM1717getUnspecified0d7_KjU, jM3967getUnspecifiedXSAIIZE, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, MapsKt.mapOf(TuplesKt.to(str, new InlineTextContent(new Placeholder(TextUnitKt.getSp(15), TextUnitKt.getSp(15), PlaceholderVerticalAlign.INSTANCE.m3255getTextCenterJ6kI3mc(), null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173952372, true, new OooO0o(function3, i3))))), null, null, composerStartRestartGroup, (i3 & 896) | (i3 & 7168), 0, 229360);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function3;
                j5 = jM1717getUnspecified0d7_KjU;
                j6 = jM3967getUnspecifiedXSAIIZE;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO(text, modifier2, j5, j6, function4, i, i2));
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                j3 = j;
                if (composerStartRestartGroup.changed(j3)) {
                    i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    j4 = j2;
                    if (composerStartRestartGroup.changed(j4)) {
                        i7 = 2048;
                    } else {
                        i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    i3 |= 24576;
                    function3 = function2;
                } else {
                    function3 = function2;
                    if ((i & 57344) == 0) {
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                }
                if ((i3 & 46811) == 9362) {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                    } else {
                        jM1717getUnspecified0d7_KjU = j3;
                    }
                    if (i6 != 0) {
                        jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE = j4;
                    }
                    if (i8 != 0) {
                        function3 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-571024235, i3, -1, "com.yalla.yalla.util.TextAddTag (ComposeUtil.kt:102)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = "Tag";
                        composerStartRestartGroup.updateRememberedValue("Tag");
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    str = (String) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    i10 = 0;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = StringsKt__StringsKt.split$default((CharSequence) text, new String[]{"ImageTag "}, true, 0, 4, (Object) null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    builder = new AnnotatedString.Builder(0, 1, null);
                    while (r4.hasNext()) {
                        int i19 = i10 + 1;
                        if (i10 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        str2 = (String) obj;
                        if (i10 == 0) {
                            builder.append(str2);
                            InlineTextContentKt.appendInlineContent$default(builder, str, null, 2, null);
                        } else {
                            builder.append(str2);
                        }
                        i10 = i19;
                    }
                    TextKt.m1262TextIbK3jfQ(builder.toAnnotatedString(), Modifier.INSTANCE.then(modifier2), jM1717getUnspecified0d7_KjU, jM3967getUnspecifiedXSAIIZE, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, MapsKt.mapOf(TuplesKt.to(str, new InlineTextContent(new Placeholder(TextUnitKt.getSp(15), TextUnitKt.getSp(15), PlaceholderVerticalAlign.INSTANCE.m3255getTextCenterJ6kI3mc(), null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173952372, true, new OooO0o(function3, i3))))), null, null, composerStartRestartGroup, (i3 & 896) | (i3 & 7168), 0, 229360);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function4 = function3;
                    j5 = jM1717getUnspecified0d7_KjU;
                    j6 = jM3967getUnspecifiedXSAIIZE;
                } else {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                    } else {
                        jM1717getUnspecified0d7_KjU = j3;
                    }
                    if (i6 != 0) {
                        jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE = j4;
                    }
                    if (i8 != 0) {
                        function3 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-571024235, i3, -1, "com.yalla.yalla.util.TextAddTag (ComposeUtil.kt:102)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = "Tag";
                        composerStartRestartGroup.updateRememberedValue("Tag");
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    str = (String) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    i10 = 0;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = StringsKt__StringsKt.split$default((CharSequence) text, new String[]{"ImageTag "}, true, 0, 4, (Object) null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    builder = new AnnotatedString.Builder(0, 1, null);
                    while (r4.hasNext()) {
                        int i110 = i10 + 1;
                        if (i10 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        str2 = (String) obj;
                        if (i10 == 0) {
                            builder.append(str2);
                            InlineTextContentKt.appendInlineContent$default(builder, str, null, 2, null);
                        } else {
                            builder.append(str2);
                        }
                        i10 = i110;
                    }
                    TextKt.m1262TextIbK3jfQ(builder.toAnnotatedString(), Modifier.INSTANCE.then(modifier2), jM1717getUnspecified0d7_KjU, jM3967getUnspecifiedXSAIIZE, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, MapsKt.mapOf(TuplesKt.to(str, new InlineTextContent(new Placeholder(TextUnitKt.getSp(15), TextUnitKt.getSp(15), PlaceholderVerticalAlign.INSTANCE.m3255getTextCenterJ6kI3mc(), null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173952372, true, new OooO0o(function3, i3))))), null, null, composerStartRestartGroup, (i3 & 896) | (i3 & 7168), 0, 229360);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function4 = function3;
                    j5 = jM1717getUnspecified0d7_KjU;
                    j6 = jM3967getUnspecifiedXSAIIZE;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO(text, modifier2, j5, j6, function4, i, i2));
            }
            i3 |= 3072;
            j4 = j2;
            i8 = i2 & 16;
            if (i8 != 0) {
                i3 |= 24576;
                function3 = function2;
            } else {
                function3 = function2;
                if ((i & 57344) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
            }
            if ((i3 & 46811) == 9362) {
                if (i11 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                } else {
                    jM1717getUnspecified0d7_KjU = j3;
                }
                if (i6 != 0) {
                    jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                } else {
                    jM3967getUnspecifiedXSAIIZE = j4;
                }
                if (i8 != 0) {
                    function3 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-571024235, i3, -1, "com.yalla.yalla.util.TextAddTag (ComposeUtil.kt:102)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = "Tag";
                    composerStartRestartGroup.updateRememberedValue("Tag");
                }
                composerStartRestartGroup.endReplaceableGroup();
                str = (String) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                i10 = 0;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = StringsKt__StringsKt.split$default((CharSequence) text, new String[]{"ImageTag "}, true, 0, 4, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                builder = new AnnotatedString.Builder(0, 1, null);
                while (r4.hasNext()) {
                    int i111 = i10 + 1;
                    if (i10 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    str2 = (String) obj;
                    if (i10 == 0) {
                        builder.append(str2);
                        InlineTextContentKt.appendInlineContent$default(builder, str, null, 2, null);
                    } else {
                        builder.append(str2);
                    }
                    i10 = i111;
                }
                TextKt.m1262TextIbK3jfQ(builder.toAnnotatedString(), Modifier.INSTANCE.then(modifier2), jM1717getUnspecified0d7_KjU, jM3967getUnspecifiedXSAIIZE, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, MapsKt.mapOf(TuplesKt.to(str, new InlineTextContent(new Placeholder(TextUnitKt.getSp(15), TextUnitKt.getSp(15), PlaceholderVerticalAlign.INSTANCE.m3255getTextCenterJ6kI3mc(), null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173952372, true, new OooO0o(function3, i3))))), null, null, composerStartRestartGroup, (i3 & 896) | (i3 & 7168), 0, 229360);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function3;
                j5 = jM1717getUnspecified0d7_KjU;
                j6 = jM3967getUnspecifiedXSAIIZE;
            } else {
                if (i11 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                } else {
                    jM1717getUnspecified0d7_KjU = j3;
                }
                if (i6 != 0) {
                    jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                } else {
                    jM3967getUnspecifiedXSAIIZE = j4;
                }
                if (i8 != 0) {
                    function3 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-571024235, i3, -1, "com.yalla.yalla.util.TextAddTag (ComposeUtil.kt:102)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = "Tag";
                    composerStartRestartGroup.updateRememberedValue("Tag");
                }
                composerStartRestartGroup.endReplaceableGroup();
                str = (String) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                i10 = 0;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = StringsKt__StringsKt.split$default((CharSequence) text, new String[]{"ImageTag "}, true, 0, 4, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                builder = new AnnotatedString.Builder(0, 1, null);
                while (r4.hasNext()) {
                    int i112 = i10 + 1;
                    if (i10 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    str2 = (String) obj;
                    if (i10 == 0) {
                        builder.append(str2);
                        InlineTextContentKt.appendInlineContent$default(builder, str, null, 2, null);
                    } else {
                        builder.append(str2);
                    }
                    i10 = i112;
                }
                TextKt.m1262TextIbK3jfQ(builder.toAnnotatedString(), Modifier.INSTANCE.then(modifier2), jM1717getUnspecified0d7_KjU, jM3967getUnspecifiedXSAIIZE, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, MapsKt.mapOf(TuplesKt.to(str, new InlineTextContent(new Placeholder(TextUnitKt.getSp(15), TextUnitKt.getSp(15), PlaceholderVerticalAlign.INSTANCE.m3255getTextCenterJ6kI3mc(), null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173952372, true, new OooO0o(function3, i3))))), null, null, composerStartRestartGroup, (i3 & 896) | (i3 & 7168), 0, 229360);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function3;
                j5 = jM1717getUnspecified0d7_KjU;
                j6 = jM3967getUnspecifiedXSAIIZE;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO(text, modifier2, j5, j6, function4, i, i2));
        }
        i3 |= 384;
        j3 = j;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 7168) == 0) {
                j4 = j2;
                if (composerStartRestartGroup.changed(j4)) {
                    i7 = 2048;
                } else {
                    i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                i3 |= 24576;
                function3 = function2;
            } else {
                function3 = function2;
                if ((i & 57344) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
            }
            if ((i3 & 46811) == 9362) {
                if (i11 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                } else {
                    jM1717getUnspecified0d7_KjU = j3;
                }
                if (i6 != 0) {
                    jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                } else {
                    jM3967getUnspecifiedXSAIIZE = j4;
                }
                if (i8 != 0) {
                    function3 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-571024235, i3, -1, "com.yalla.yalla.util.TextAddTag (ComposeUtil.kt:102)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = "Tag";
                    composerStartRestartGroup.updateRememberedValue("Tag");
                }
                composerStartRestartGroup.endReplaceableGroup();
                str = (String) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                i10 = 0;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = StringsKt__StringsKt.split$default((CharSequence) text, new String[]{"ImageTag "}, true, 0, 4, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                builder = new AnnotatedString.Builder(0, 1, null);
                while (r4.hasNext()) {
                    int i113 = i10 + 1;
                    if (i10 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    str2 = (String) obj;
                    if (i10 == 0) {
                        builder.append(str2);
                        InlineTextContentKt.appendInlineContent$default(builder, str, null, 2, null);
                    } else {
                        builder.append(str2);
                    }
                    i10 = i113;
                }
                TextKt.m1262TextIbK3jfQ(builder.toAnnotatedString(), Modifier.INSTANCE.then(modifier2), jM1717getUnspecified0d7_KjU, jM3967getUnspecifiedXSAIIZE, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, MapsKt.mapOf(TuplesKt.to(str, new InlineTextContent(new Placeholder(TextUnitKt.getSp(15), TextUnitKt.getSp(15), PlaceholderVerticalAlign.INSTANCE.m3255getTextCenterJ6kI3mc(), null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173952372, true, new OooO0o(function3, i3))))), null, null, composerStartRestartGroup, (i3 & 896) | (i3 & 7168), 0, 229360);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function3;
                j5 = jM1717getUnspecified0d7_KjU;
                j6 = jM3967getUnspecifiedXSAIIZE;
            } else {
                if (i11 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                } else {
                    jM1717getUnspecified0d7_KjU = j3;
                }
                if (i6 != 0) {
                    jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                } else {
                    jM3967getUnspecifiedXSAIIZE = j4;
                }
                if (i8 != 0) {
                    function3 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-571024235, i3, -1, "com.yalla.yalla.util.TextAddTag (ComposeUtil.kt:102)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = "Tag";
                    composerStartRestartGroup.updateRememberedValue("Tag");
                }
                composerStartRestartGroup.endReplaceableGroup();
                str = (String) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                i10 = 0;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = StringsKt__StringsKt.split$default((CharSequence) text, new String[]{"ImageTag "}, true, 0, 4, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                builder = new AnnotatedString.Builder(0, 1, null);
                while (r4.hasNext()) {
                    int i114 = i10 + 1;
                    if (i10 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    str2 = (String) obj;
                    if (i10 == 0) {
                        builder.append(str2);
                        InlineTextContentKt.appendInlineContent$default(builder, str, null, 2, null);
                    } else {
                        builder.append(str2);
                    }
                    i10 = i114;
                }
                TextKt.m1262TextIbK3jfQ(builder.toAnnotatedString(), Modifier.INSTANCE.then(modifier2), jM1717getUnspecified0d7_KjU, jM3967getUnspecifiedXSAIIZE, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, MapsKt.mapOf(TuplesKt.to(str, new InlineTextContent(new Placeholder(TextUnitKt.getSp(15), TextUnitKt.getSp(15), PlaceholderVerticalAlign.INSTANCE.m3255getTextCenterJ6kI3mc(), null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173952372, true, new OooO0o(function3, i3))))), null, null, composerStartRestartGroup, (i3 & 896) | (i3 & 7168), 0, 229360);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function3;
                j5 = jM1717getUnspecified0d7_KjU;
                j6 = jM3967getUnspecifiedXSAIIZE;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO(text, modifier2, j5, j6, function4, i, i2));
        }
        i3 |= 3072;
        j4 = j2;
        i8 = i2 & 16;
        if (i8 != 0) {
            i3 |= 24576;
            function3 = function2;
        } else {
            function3 = function2;
            if ((i & 57344) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
        }
        if ((i3 & 46811) == 9362) {
            if (i11 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (i4 != 0) {
                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
            } else {
                jM1717getUnspecified0d7_KjU = j3;
            }
            if (i6 != 0) {
                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
            } else {
                jM3967getUnspecifiedXSAIIZE = j4;
            }
            if (i8 != 0) {
                function3 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-571024235, i3, -1, "com.yalla.yalla.util.TextAddTag (ComposeUtil.kt:102)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = "Tag";
                composerStartRestartGroup.updateRememberedValue("Tag");
            }
            composerStartRestartGroup.endReplaceableGroup();
            str = (String) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            i10 = 0;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = StringsKt__StringsKt.split$default((CharSequence) text, new String[]{"ImageTag "}, true, 0, 4, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            builder = new AnnotatedString.Builder(0, 1, null);
            while (r4.hasNext()) {
                int i115 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                str2 = (String) obj;
                if (i10 == 0) {
                    builder.append(str2);
                    InlineTextContentKt.appendInlineContent$default(builder, str, null, 2, null);
                } else {
                    builder.append(str2);
                }
                i10 = i115;
            }
            TextKt.m1262TextIbK3jfQ(builder.toAnnotatedString(), Modifier.INSTANCE.then(modifier2), jM1717getUnspecified0d7_KjU, jM3967getUnspecifiedXSAIIZE, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, MapsKt.mapOf(TuplesKt.to(str, new InlineTextContent(new Placeholder(TextUnitKt.getSp(15), TextUnitKt.getSp(15), PlaceholderVerticalAlign.INSTANCE.m3255getTextCenterJ6kI3mc(), null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173952372, true, new OooO0o(function3, i3))))), null, null, composerStartRestartGroup, (i3 & 896) | (i3 & 7168), 0, 229360);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function4 = function3;
            j5 = jM1717getUnspecified0d7_KjU;
            j6 = jM3967getUnspecifiedXSAIIZE;
        } else {
            if (i11 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (i4 != 0) {
                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
            } else {
                jM1717getUnspecified0d7_KjU = j3;
            }
            if (i6 != 0) {
                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
            } else {
                jM3967getUnspecifiedXSAIIZE = j4;
            }
            if (i8 != 0) {
                function3 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-571024235, i3, -1, "com.yalla.yalla.util.TextAddTag (ComposeUtil.kt:102)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = "Tag";
                composerStartRestartGroup.updateRememberedValue("Tag");
            }
            composerStartRestartGroup.endReplaceableGroup();
            str = (String) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            i10 = 0;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = StringsKt__StringsKt.split$default((CharSequence) text, new String[]{"ImageTag "}, true, 0, 4, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            builder = new AnnotatedString.Builder(0, 1, null);
            while (r4.hasNext()) {
                int i116 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                str2 = (String) obj;
                if (i10 == 0) {
                    builder.append(str2);
                    InlineTextContentKt.appendInlineContent$default(builder, str, null, 2, null);
                } else {
                    builder.append(str2);
                }
                i10 = i116;
            }
            TextKt.m1262TextIbK3jfQ(builder.toAnnotatedString(), Modifier.INSTANCE.then(modifier2), jM1717getUnspecified0d7_KjU, jM3967getUnspecifiedXSAIIZE, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, MapsKt.mapOf(TuplesKt.to(str, new InlineTextContent(new Placeholder(TextUnitKt.getSp(15), TextUnitKt.getSp(15), PlaceholderVerticalAlign.INSTANCE.m3255getTextCenterJ6kI3mc(), null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173952372, true, new OooO0o(function3, i3))))), null, null, composerStartRestartGroup, (i3 & 896) | (i3 & 7168), 0, 229360);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function4 = function3;
            j5 = jM1717getUnspecified0d7_KjU;
            j6 = jM3967getUnspecifiedXSAIIZE;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(text, modifier2, j5, j6, function4, i, i2));
    }

    @Composable
    @JvmName(name = "getDsp")
    public static final long OooO0OO(int i, @Nullable Composer composer) {
        composer.startReplaceableGroup(1020977118);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1020977118, 6, -1, "com.yalla.yalla.util.<get-dsp> (ComposeUtil.kt:33)");
        }
        long jMo328toSp0xMU5do = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo328toSp0xMU5do(Dp.m3775constructorimpl(i));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return jMo328toSp0xMU5do;
    }
}
