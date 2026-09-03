package p507o0o00ooo;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ContentColorKt;
import androidx.compose.material.DividerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.qiniu.android.storage.Configuration;
import com.zego.zegoliveroom.constants.ZegoConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nScrollableTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollableTabRow.kt\ncom/yalla/yalla/ui/composable/common/TabRowDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,326:1\n76#2:327\n76#2:329\n164#3:328\n154#3:369\n154#3:370\n154#3:371\n154#3:372\n67#4,5:330\n72#4:363\n76#4:368\n78#5,11:335\n91#5:367\n456#6,8:346\n464#6,3:360\n467#6,3:364\n4144#7,6:354\n*S KotlinDebug\n*F\n+ 1 ScrollableTabRow.kt\ncom/yalla/yalla/ui/composable/common/TabRowDefaults\n*L\n172#1:327\n183#1:329\n182#1:328\n202#1:369\n203#1:370\n204#1:371\n205#1:372\n190#1:330,5\n190#1:363\n190#1:368\n190#1:335,11\n190#1:367\n190#1:346,8\n190#1:360,3\n190#1:364,3\n190#1:354,6\n*E\n"})
public final class q1 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final q1 f50178OooO00o = new q1();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final float f50179OooO0O0 = Dp.m3765constructorimpl(1);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final float f50180OooO0OO = Dp.m3765constructorimpl(24);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final float f50181OooO0Oo = Dp.m3765constructorimpl(3);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final float f50182OooO0o0 = Dp.m3765constructorimpl(52);

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f50183OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ float f50185OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Modifier f50186OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f50187OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f50188OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Modifier modifier, float f, long j, int i, int i2) {
            super(2);
            this.f50186OooO0o0 = modifier;
            this.f50185OooO0o = f;
            this.f50187OooO0oO = j;
            this.f50188OooO0oo = i;
            this.f50183OooO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            q1.this.OooO00o(this.f50186OooO0o0, this.f50185OooO0o, this.f50187OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f50188OooO0oo | 1), this.f50183OooO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ long f50189OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ float f50191OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Modifier f50192OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ float f50193OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Shape f50194OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ boolean f50195OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ Function3<Modifier, Composer, Integer, Unit> f50196OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ int f50197OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ int f50198OooOOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Modifier modifier, float f, float f2, Shape shape, long j, boolean z, Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, int i, int i2) {
            super(2);
            this.f50192OooO0o0 = modifier;
            this.f50191OooO0o = f;
            this.f50193OooO0oO = f2;
            this.f50194OooO0oo = shape;
            this.f50189OooO = j;
            this.f50195OooOO0 = z;
            this.f50196OooOO0O = function3;
            this.f50197OooOO0o = i;
            this.f50198OooOOO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            q1.this.OooO0O0(this.f50192OooO0o0, this.f50191OooO0o, this.f50193OooO0oO, this.f50194OooO0oo, this.f50189OooO, this.f50195OooOO0, this.f50196OooOO0O, composer, RecomposeScopeImplKt.updateChangedFlags(this.f50197OooOO0o | 1), this.f50198OooOOO0);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable Modifier modifier, float f, long j, @Nullable Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        float f2;
        long jM1669copywmQWz5c$default;
        Modifier modifier3;
        float f3;
        long j2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1177793273);
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
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                f2 = f;
                int i5 = composerStartRestartGroup.changed(f2) ? 32 : 16;
                i3 |= i5;
            } else {
                f2 = f;
            }
            i3 |= i5;
        } else {
            f2 = f;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                jM1669copywmQWz5c$default = j;
                int i6 = composerStartRestartGroup.changed(jM1669copywmQWz5c$default) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
                i3 |= i6;
            } else {
                jM1669copywmQWz5c$default = j;
            }
            i3 |= i6;
        } else {
            jM1669copywmQWz5c$default = j;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= composerStartRestartGroup.changed(this) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i3 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            f3 = f2;
            j2 = jM1669copywmQWz5c$default;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    f3 = f50179OooO0O0;
                } else {
                    f3 = f2;
                }
                if ((i2 & 4) != 0) {
                    jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    i3 &= -897;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                modifier3 = modifier2;
                f3 = f2;
            }
            long j3 = jM1669copywmQWz5c$default;
            int i7 = i3;
            j2 = j3;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1177793273, i7, -1, "com.yalla.yalla.ui.composable.common.TabRowDefaults.Divider (ScrollableTabRow.kt:168)");
            }
            DividerKt.m1058DivideroMI9zvI(modifier3, j2, f3, 0.0f, composerStartRestartGroup, (i7 & 14) | ((i7 >> 3) & 112) | ((i7 << 3) & 896), 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(modifier3, f3, j2, i, i2));
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0144 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x0146  */
    /* JADX WARN: Code duplicated, block: B:116:0x0149  */
    /* JADX WARN: Code duplicated, block: B:119:0x014f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0154  */
    /* JADX WARN: Code duplicated, block: B:123:0x015a  */
    /* JADX WARN: Code duplicated, block: B:126:0x0164  */
    /* JADX WARN: Code duplicated, block: B:127:0x0172  */
    /* JADX WARN: Code duplicated, block: B:130:0x0177  */
    /* JADX WARN: Code duplicated, block: B:131:0x018a  */
    /* JADX WARN: Code duplicated, block: B:133:0x018d  */
    /* JADX WARN: Code duplicated, block: B:134:0x018f  */
    /* JADX WARN: Code duplicated, block: B:136:0x0192  */
    /* JADX WARN: Code duplicated, block: B:137:0x0196  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:146:0x020a  */
    /* JADX WARN: Code duplicated, block: B:149:0x0216  */
    /* JADX WARN: Code duplicated, block: B:150:0x021a  */
    /* JADX WARN: Code duplicated, block: B:153:0x022b  */
    /* JADX WARN: Code duplicated, block: B:155:0x0239  */
    /* JADX WARN: Code duplicated, block: B:158:0x0255  */
    /* JADX WARN: Code duplicated, block: B:162:0x027f  */
    /* JADX WARN: Code duplicated, block: B:167:0x0294  */
    /* JADX WARN: Code duplicated, block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:96:0x0113  */
    /* JADX WARN: Code duplicated, block: B:98:0x011d  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public final void OooO0O0(@Nullable Modifier modifier, float f, float f2, @Nullable Shape shape, long j, boolean z, @Nullable Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, int i, int i2) {
        int i3;
        float f3;
        Shape shape2;
        long j2;
        boolean z2;
        int i4;
        Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function4;
        int i5;
        int i6;
        Modifier modifier2;
        float f4;
        Shape shapeM727RoundedCornerShape0680j_4;
        long jM1680unboximpl;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1309constructorimpl;
        Function2 function2OooO00o;
        float f5;
        long j3;
        boolean z3;
        Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function5;
        Modifier modifier3;
        Shape shape3;
        float f6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i7;
        Composer composerStartRestartGroup = composer.startRestartGroup(1482251921);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changed(f)) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                f3 = f2;
                int i9 = composerStartRestartGroup.changed(f3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
                i3 |= i9;
            } else {
                f3 = f2;
            }
            i3 |= i9;
        } else {
            f3 = f2;
        }
        if ((i & 7168) == 0) {
            if ((i2 & 8) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                    i7 = 2048;
                }
                i3 |= i7;
            } else {
                shape2 = shape;
            }
            i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            i3 |= i7;
        } else {
            shape2 = shape;
        }
        if ((57344 & i) == 0) {
            if ((i2 & 16) == 0) {
                j2 = j;
                int i10 = composerStartRestartGroup.changed(j2) ? 16384 : 8192;
                i3 |= i10;
            } else {
                j2 = j;
            }
            i3 |= i10;
        } else {
            j2 = j;
        }
        int i11 = i2 & 32;
        if (i11 == 0) {
            if ((458752 & i) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((3670016 & i) == 0) {
                    function4 = function3;
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i5 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i5 = 524288;
                    }
                    i3 |= i5;
                }
                if ((i2 & 128) != 0) {
                    if ((29360128 & i) == 0) {
                        if (composerStartRestartGroup.changed(this)) {
                            i6 = 8388608;
                        } else {
                            i6 = Configuration.BLOCK_SIZE;
                        }
                        i3 |= i6;
                    }
                    if ((i3 & 23967451) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i8 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                f4 = f50180OooO0OO;
                            } else {
                                f4 = f;
                            }
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                                f3 = f50181OooO0Oo;
                            }
                            float f7 = f3;
                            if ((i2 & 8) != 0) {
                                shapeM727RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl((float) 1.5d));
                                i3 &= -7169;
                            } else {
                                shapeM727RoundedCornerShape0680j_4 = shape2;
                            }
                            if ((i2 & 16) != 0) {
                                jM1680unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl();
                                i3 &= -57345;
                            } else {
                                jM1680unboximpl = j2;
                            }
                            if (i11 != 0) {
                                z2 = true;
                            } else {
                                z2 = z2;
                            }
                            if (i4 != 0) {
                                function4 = null;
                            }
                            j2 = jM1680unboximpl;
                            f3 = f7;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            modifier2 = modifier;
                            f4 = f;
                            shapeM727RoundedCornerShape0680j_4 = shape2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1482251921, i3, -1, "com.yalla.yalla.ui.composable.common.TabRowDefaults.Indicator (ScrollableTabRow.kt:177)");
                        }
                        if (function4 != null) {
                            composerStartRestartGroup.startReplaceableGroup(279245065);
                            function4.invoke(modifier2, composerStartRestartGroup, Integer.valueOf(((i3 >> 15) & 112) | (i3 & 14)));
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(279245108);
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                            Alignment center = Alignment.INSTANCE.getCenter();
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
                            function2OooO00o = OooO.OooO00o(companion, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
                            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composerStartRestartGroup.startReplaceableGroup(279245192);
                            if (z2) {
                                SpacerKt.Spacer(BackgroundKt.m168backgroundbw27NRU(SizeKt.m509height3ABfNKs(SizeKt.m528width3ABfNKs(Modifier.INSTANCE, f4), f3), j2, shapeM727RoundedCornerShape0680j_4), composerStartRestartGroup, 0);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f5 = f4;
                        j3 = j2;
                        z3 = z2;
                        function5 = function4;
                        modifier3 = modifier2;
                        float f8 = f3;
                        shape3 = shapeM727RoundedCornerShape0680j_4;
                        f6 = f8;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        f5 = f;
                        f6 = f3;
                        shape3 = shape2;
                        j3 = j2;
                        z3 = z2;
                        function5 = function4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(modifier3, f5, f6, shape3, j3, z3, function5, i, i2));
                }
                i3 |= 12582912;
                if ((i3 & 23967451) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            f4 = f50180OooO0OO;
                        } else {
                            f4 = f;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            f3 = f50181OooO0Oo;
                        }
                        float f9 = f3;
                        if ((i2 & 8) != 0) {
                            shapeM727RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl((float) 1.5d));
                            i3 &= -7169;
                        } else {
                            shapeM727RoundedCornerShape0680j_4 = shape2;
                        }
                        if ((i2 & 16) != 0) {
                            jM1680unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl();
                            i3 &= -57345;
                        } else {
                            jM1680unboximpl = j2;
                        }
                        if (i11 != 0) {
                            z2 = true;
                        } else {
                            z2 = z2;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        j2 = jM1680unboximpl;
                        f3 = f9;
                    } else {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            f4 = f50180OooO0OO;
                        } else {
                            f4 = f;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            f3 = f50181OooO0Oo;
                        }
                        float f10 = f3;
                        if ((i2 & 8) != 0) {
                            shapeM727RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl((float) 1.5d));
                            i3 &= -7169;
                        } else {
                            shapeM727RoundedCornerShape0680j_4 = shape2;
                        }
                        if ((i2 & 16) != 0) {
                            jM1680unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl();
                            i3 &= -57345;
                        } else {
                            jM1680unboximpl = j2;
                        }
                        if (i11 != 0) {
                            z2 = true;
                        } else {
                            z2 = z2;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        j2 = jM1680unboximpl;
                        f3 = f10;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1482251921, i3, -1, "com.yalla.yalla.ui.composable.common.TabRowDefaults.Indicator (ScrollableTabRow.kt:177)");
                    }
                    if (function4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(279245065);
                        function4.invoke(modifier2, composerStartRestartGroup, Integer.valueOf(((i3 >> 15) & 112) | (i3 & 14)));
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(279245108);
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                        Alignment center2 = Alignment.INSTANCE.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default2);
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
                        function2OooO00o = OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy2, composerM1309constructorimpl, currentCompositionLocalMap2);
                        if (composerM1309constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(279245192);
                        if (z2) {
                            SpacerKt.Spacer(BackgroundKt.m168backgroundbw27NRU(SizeKt.m509height3ABfNKs(SizeKt.m528width3ABfNKs(Modifier.INSTANCE, f4), f3), j2, shapeM727RoundedCornerShape0680j_4), composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f5 = f4;
                    j3 = j2;
                    z3 = z2;
                    function5 = function4;
                    modifier3 = modifier2;
                    float f11 = f3;
                    shape3 = shapeM727RoundedCornerShape0680j_4;
                    f6 = f11;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            f4 = f50180OooO0OO;
                        } else {
                            f4 = f;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            f3 = f50181OooO0Oo;
                        }
                        float f12 = f3;
                        if ((i2 & 8) != 0) {
                            shapeM727RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl((float) 1.5d));
                            i3 &= -7169;
                        } else {
                            shapeM727RoundedCornerShape0680j_4 = shape2;
                        }
                        if ((i2 & 16) != 0) {
                            jM1680unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl();
                            i3 &= -57345;
                        } else {
                            jM1680unboximpl = j2;
                        }
                        if (i11 != 0) {
                            z2 = true;
                        } else {
                            z2 = z2;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        j2 = jM1680unboximpl;
                        f3 = f12;
                    } else {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            f4 = f50180OooO0OO;
                        } else {
                            f4 = f;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            f3 = f50181OooO0Oo;
                        }
                        float f13 = f3;
                        if ((i2 & 8) != 0) {
                            shapeM727RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl((float) 1.5d));
                            i3 &= -7169;
                        } else {
                            shapeM727RoundedCornerShape0680j_4 = shape2;
                        }
                        if ((i2 & 16) != 0) {
                            jM1680unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl();
                            i3 &= -57345;
                        } else {
                            jM1680unboximpl = j2;
                        }
                        if (i11 != 0) {
                            z2 = true;
                        } else {
                            z2 = z2;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        j2 = jM1680unboximpl;
                        f3 = f13;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1482251921, i3, -1, "com.yalla.yalla.ui.composable.common.TabRowDefaults.Indicator (ScrollableTabRow.kt:177)");
                    }
                    if (function4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(279245065);
                        function4.invoke(modifier2, composerStartRestartGroup, Integer.valueOf(((i3 >> 15) & 112) | (i3 & 14)));
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(279245108);
                        Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                        Alignment center3 = Alignment.INSTANCE.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center3, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default3);
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
                        function2OooO00o = OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy3, composerM1309constructorimpl, currentCompositionLocalMap3);
                        if (composerM1309constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(279245192);
                        if (z2) {
                            SpacerKt.Spacer(BackgroundKt.m168backgroundbw27NRU(SizeKt.m509height3ABfNKs(SizeKt.m528width3ABfNKs(Modifier.INSTANCE, f4), f3), j2, shapeM727RoundedCornerShape0680j_4), composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f5 = f4;
                    j3 = j2;
                    z3 = z2;
                    function5 = function4;
                    modifier3 = modifier2;
                    float f14 = f3;
                    shape3 = shapeM727RoundedCornerShape0680j_4;
                    f6 = f14;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(modifier3, f5, f6, shape3, j3, z3, function5, i, i2));
            }
            i3 |= 1572864;
            function4 = function3;
            if ((i2 & 128) != 0) {
                if ((29360128 & i) == 0) {
                    if (composerStartRestartGroup.changed(this)) {
                        i6 = 8388608;
                    } else {
                        i6 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i6;
                }
                if ((i3 & 23967451) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            f4 = f50180OooO0OO;
                        } else {
                            f4 = f;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            f3 = f50181OooO0Oo;
                        }
                        float f15 = f3;
                        if ((i2 & 8) != 0) {
                            shapeM727RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl((float) 1.5d));
                            i3 &= -7169;
                        } else {
                            shapeM727RoundedCornerShape0680j_4 = shape2;
                        }
                        if ((i2 & 16) != 0) {
                            jM1680unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl();
                            i3 &= -57345;
                        } else {
                            jM1680unboximpl = j2;
                        }
                        if (i11 != 0) {
                            z2 = true;
                        } else {
                            z2 = z2;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        j2 = jM1680unboximpl;
                        f3 = f15;
                    } else {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            f4 = f50180OooO0OO;
                        } else {
                            f4 = f;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            f3 = f50181OooO0Oo;
                        }
                        float f16 = f3;
                        if ((i2 & 8) != 0) {
                            shapeM727RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl((float) 1.5d));
                            i3 &= -7169;
                        } else {
                            shapeM727RoundedCornerShape0680j_4 = shape2;
                        }
                        if ((i2 & 16) != 0) {
                            jM1680unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl();
                            i3 &= -57345;
                        } else {
                            jM1680unboximpl = j2;
                        }
                        if (i11 != 0) {
                            z2 = true;
                        } else {
                            z2 = z2;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        j2 = jM1680unboximpl;
                        f3 = f16;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1482251921, i3, -1, "com.yalla.yalla.ui.composable.common.TabRowDefaults.Indicator (ScrollableTabRow.kt:177)");
                    }
                    if (function4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(279245065);
                        function4.invoke(modifier2, composerStartRestartGroup, Integer.valueOf(((i3 >> 15) & 112) | (i3 & 14)));
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(279245108);
                        Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                        Alignment center4 = Alignment.INSTANCE.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(center4, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        constructor = companion4.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default4);
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
                        function2OooO00o = OooO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy4, composerM1309constructorimpl, currentCompositionLocalMap4);
                        if (composerM1309constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(279245192);
                        if (z2) {
                            SpacerKt.Spacer(BackgroundKt.m168backgroundbw27NRU(SizeKt.m509height3ABfNKs(SizeKt.m528width3ABfNKs(Modifier.INSTANCE, f4), f3), j2, shapeM727RoundedCornerShape0680j_4), composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f5 = f4;
                    j3 = j2;
                    z3 = z2;
                    function5 = function4;
                    modifier3 = modifier2;
                    float f17 = f3;
                    shape3 = shapeM727RoundedCornerShape0680j_4;
                    f6 = f17;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            f4 = f50180OooO0OO;
                        } else {
                            f4 = f;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            f3 = f50181OooO0Oo;
                        }
                        float f18 = f3;
                        if ((i2 & 8) != 0) {
                            shapeM727RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl((float) 1.5d));
                            i3 &= -7169;
                        } else {
                            shapeM727RoundedCornerShape0680j_4 = shape2;
                        }
                        if ((i2 & 16) != 0) {
                            jM1680unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl();
                            i3 &= -57345;
                        } else {
                            jM1680unboximpl = j2;
                        }
                        if (i11 != 0) {
                            z2 = true;
                        } else {
                            z2 = z2;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        j2 = jM1680unboximpl;
                        f3 = f18;
                    } else {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            f4 = f50180OooO0OO;
                        } else {
                            f4 = f;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            f3 = f50181OooO0Oo;
                        }
                        float f19 = f3;
                        if ((i2 & 8) != 0) {
                            shapeM727RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl((float) 1.5d));
                            i3 &= -7169;
                        } else {
                            shapeM727RoundedCornerShape0680j_4 = shape2;
                        }
                        if ((i2 & 16) != 0) {
                            jM1680unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl();
                            i3 &= -57345;
                        } else {
                            jM1680unboximpl = j2;
                        }
                        if (i11 != 0) {
                            z2 = true;
                        } else {
                            z2 = z2;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        j2 = jM1680unboximpl;
                        f3 = f19;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1482251921, i3, -1, "com.yalla.yalla.ui.composable.common.TabRowDefaults.Indicator (ScrollableTabRow.kt:177)");
                    }
                    if (function4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(279245065);
                        function4.invoke(modifier2, composerStartRestartGroup, Integer.valueOf(((i3 >> 15) & 112) | (i3 & 14)));
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(279245108);
                        Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                        Alignment center5 = Alignment.INSTANCE.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(center5, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                        constructor = companion5.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default5);
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
                        function2OooO00o = OooO.OooO00o(companion5, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy5, composerM1309constructorimpl, currentCompositionLocalMap5);
                        if (composerM1309constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        OooOO0.OooO00o(0, function3ModifierMaterializerOf5, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(279245192);
                        if (z2) {
                            SpacerKt.Spacer(BackgroundKt.m168backgroundbw27NRU(SizeKt.m509height3ABfNKs(SizeKt.m528width3ABfNKs(Modifier.INSTANCE, f4), f3), j2, shapeM727RoundedCornerShape0680j_4), composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f5 = f4;
                    j3 = j2;
                    z3 = z2;
                    function5 = function4;
                    modifier3 = modifier2;
                    float f110 = f3;
                    shape3 = shapeM727RoundedCornerShape0680j_4;
                    f6 = f110;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(modifier3, f5, f6, shape3, j3, z3, function5, i, i2));
            }
            i3 |= 12582912;
            if ((i3 & 23967451) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        f4 = f50180OooO0OO;
                    } else {
                        f4 = f;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        f3 = f50181OooO0Oo;
                    }
                    float f111 = f3;
                    if ((i2 & 8) != 0) {
                        shapeM727RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl((float) 1.5d));
                        i3 &= -7169;
                    } else {
                        shapeM727RoundedCornerShape0680j_4 = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        jM1680unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl();
                        i3 &= -57345;
                    } else {
                        jM1680unboximpl = j2;
                    }
                    if (i11 != 0) {
                        z2 = true;
                    } else {
                        z2 = z2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    j2 = jM1680unboximpl;
                    f3 = f111;
                } else {
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        f4 = f50180OooO0OO;
                    } else {
                        f4 = f;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        f3 = f50181OooO0Oo;
                    }
                    float f112 = f3;
                    if ((i2 & 8) != 0) {
                        shapeM727RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl((float) 1.5d));
                        i3 &= -7169;
                    } else {
                        shapeM727RoundedCornerShape0680j_4 = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        jM1680unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl();
                        i3 &= -57345;
                    } else {
                        jM1680unboximpl = j2;
                    }
                    if (i11 != 0) {
                        z2 = true;
                    } else {
                        z2 = z2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    j2 = jM1680unboximpl;
                    f3 = f112;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1482251921, i3, -1, "com.yalla.yalla.ui.composable.common.TabRowDefaults.Indicator (ScrollableTabRow.kt:177)");
                }
                if (function4 != null) {
                    composerStartRestartGroup.startReplaceableGroup(279245065);
                    function4.invoke(modifier2, composerStartRestartGroup, Integer.valueOf(((i3 >> 15) & 112) | (i3 & 14)));
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(279245108);
                    Modifier modifierFillMaxWidth$default6 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                    Alignment center6 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(center6, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    constructor = companion6.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default6);
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
                    function2OooO00o = OooO.OooO00o(companion6, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy6, composerM1309constructorimpl, currentCompositionLocalMap6);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    OooOO0.OooO00o(0, function3ModifierMaterializerOf6, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(279245192);
                    if (z2) {
                        SpacerKt.Spacer(BackgroundKt.m168backgroundbw27NRU(SizeKt.m509height3ABfNKs(SizeKt.m528width3ABfNKs(Modifier.INSTANCE, f4), f3), j2, shapeM727RoundedCornerShape0680j_4), composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f5 = f4;
                j3 = j2;
                z3 = z2;
                function5 = function4;
                modifier3 = modifier2;
                float f113 = f3;
                shape3 = shapeM727RoundedCornerShape0680j_4;
                f6 = f113;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        f4 = f50180OooO0OO;
                    } else {
                        f4 = f;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        f3 = f50181OooO0Oo;
                    }
                    float f114 = f3;
                    if ((i2 & 8) != 0) {
                        shapeM727RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl((float) 1.5d));
                        i3 &= -7169;
                    } else {
                        shapeM727RoundedCornerShape0680j_4 = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        jM1680unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl();
                        i3 &= -57345;
                    } else {
                        jM1680unboximpl = j2;
                    }
                    if (i11 != 0) {
                        z2 = true;
                    } else {
                        z2 = z2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    j2 = jM1680unboximpl;
                    f3 = f114;
                } else {
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        f4 = f50180OooO0OO;
                    } else {
                        f4 = f;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        f3 = f50181OooO0Oo;
                    }
                    float f115 = f3;
                    if ((i2 & 8) != 0) {
                        shapeM727RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl((float) 1.5d));
                        i3 &= -7169;
                    } else {
                        shapeM727RoundedCornerShape0680j_4 = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        jM1680unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl();
                        i3 &= -57345;
                    } else {
                        jM1680unboximpl = j2;
                    }
                    if (i11 != 0) {
                        z2 = true;
                    } else {
                        z2 = z2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    j2 = jM1680unboximpl;
                    f3 = f115;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1482251921, i3, -1, "com.yalla.yalla.ui.composable.common.TabRowDefaults.Indicator (ScrollableTabRow.kt:177)");
                }
                if (function4 != null) {
                    composerStartRestartGroup.startReplaceableGroup(279245065);
                    function4.invoke(modifier2, composerStartRestartGroup, Integer.valueOf(((i3 >> 15) & 112) | (i3 & 14)));
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(279245108);
                    Modifier modifierFillMaxWidth$default7 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                    Alignment center7 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy7 = BoxKt.rememberBoxMeasurePolicy(center7, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    constructor = companion7.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default7);
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
                    function2OooO00o = OooO.OooO00o(companion7, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy7, composerM1309constructorimpl, currentCompositionLocalMap7);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    OooOO0.OooO00o(0, function3ModifierMaterializerOf7, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(279245192);
                    if (z2) {
                        SpacerKt.Spacer(BackgroundKt.m168backgroundbw27NRU(SizeKt.m509height3ABfNKs(SizeKt.m528width3ABfNKs(Modifier.INSTANCE, f4), f3), j2, shapeM727RoundedCornerShape0680j_4), composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f5 = f4;
                j3 = j2;
                z3 = z2;
                function5 = function4;
                modifier3 = modifier2;
                float f116 = f3;
                shape3 = shapeM727RoundedCornerShape0680j_4;
                f6 = f116;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(modifier3, f5, f6, shape3, j3, z3, function5, i, i2));
        }
        i3 |= 196608;
        z2 = z;
        i4 = i2 & 64;
        if (i4 != 0) {
            if ((3670016 & i) == 0) {
                function4 = function3;
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i5 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i5 = 524288;
                }
                i3 |= i5;
            }
            if ((i2 & 128) != 0) {
                if ((29360128 & i) == 0) {
                    if (composerStartRestartGroup.changed(this)) {
                        i6 = 8388608;
                    } else {
                        i6 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i6;
                }
                if ((i3 & 23967451) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            f4 = f50180OooO0OO;
                        } else {
                            f4 = f;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            f3 = f50181OooO0Oo;
                        }
                        float f117 = f3;
                        if ((i2 & 8) != 0) {
                            shapeM727RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl((float) 1.5d));
                            i3 &= -7169;
                        } else {
                            shapeM727RoundedCornerShape0680j_4 = shape2;
                        }
                        if ((i2 & 16) != 0) {
                            jM1680unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl();
                            i3 &= -57345;
                        } else {
                            jM1680unboximpl = j2;
                        }
                        if (i11 != 0) {
                            z2 = true;
                        } else {
                            z2 = z2;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        j2 = jM1680unboximpl;
                        f3 = f117;
                    } else {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            f4 = f50180OooO0OO;
                        } else {
                            f4 = f;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            f3 = f50181OooO0Oo;
                        }
                        float f118 = f3;
                        if ((i2 & 8) != 0) {
                            shapeM727RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl((float) 1.5d));
                            i3 &= -7169;
                        } else {
                            shapeM727RoundedCornerShape0680j_4 = shape2;
                        }
                        if ((i2 & 16) != 0) {
                            jM1680unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl();
                            i3 &= -57345;
                        } else {
                            jM1680unboximpl = j2;
                        }
                        if (i11 != 0) {
                            z2 = true;
                        } else {
                            z2 = z2;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        j2 = jM1680unboximpl;
                        f3 = f118;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1482251921, i3, -1, "com.yalla.yalla.ui.composable.common.TabRowDefaults.Indicator (ScrollableTabRow.kt:177)");
                    }
                    if (function4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(279245065);
                        function4.invoke(modifier2, composerStartRestartGroup, Integer.valueOf(((i3 >> 15) & 112) | (i3 & 14)));
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(279245108);
                        Modifier modifierFillMaxWidth$default8 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                        Alignment center8 = Alignment.INSTANCE.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy8 = BoxKt.rememberBoxMeasurePolicy(center8, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                        constructor = companion8.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default8);
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
                        function2OooO00o = OooO.OooO00o(companion8, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy8, composerM1309constructorimpl, currentCompositionLocalMap8);
                        if (composerM1309constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        OooOO0.OooO00o(0, function3ModifierMaterializerOf8, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(279245192);
                        if (z2) {
                            SpacerKt.Spacer(BackgroundKt.m168backgroundbw27NRU(SizeKt.m509height3ABfNKs(SizeKt.m528width3ABfNKs(Modifier.INSTANCE, f4), f3), j2, shapeM727RoundedCornerShape0680j_4), composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f5 = f4;
                    j3 = j2;
                    z3 = z2;
                    function5 = function4;
                    modifier3 = modifier2;
                    float f119 = f3;
                    shape3 = shapeM727RoundedCornerShape0680j_4;
                    f6 = f119;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            f4 = f50180OooO0OO;
                        } else {
                            f4 = f;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            f3 = f50181OooO0Oo;
                        }
                        float f1110 = f3;
                        if ((i2 & 8) != 0) {
                            shapeM727RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl((float) 1.5d));
                            i3 &= -7169;
                        } else {
                            shapeM727RoundedCornerShape0680j_4 = shape2;
                        }
                        if ((i2 & 16) != 0) {
                            jM1680unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl();
                            i3 &= -57345;
                        } else {
                            jM1680unboximpl = j2;
                        }
                        if (i11 != 0) {
                            z2 = true;
                        } else {
                            z2 = z2;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        j2 = jM1680unboximpl;
                        f3 = f1110;
                    } else {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            f4 = f50180OooO0OO;
                        } else {
                            f4 = f;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            f3 = f50181OooO0Oo;
                        }
                        float f1111 = f3;
                        if ((i2 & 8) != 0) {
                            shapeM727RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl((float) 1.5d));
                            i3 &= -7169;
                        } else {
                            shapeM727RoundedCornerShape0680j_4 = shape2;
                        }
                        if ((i2 & 16) != 0) {
                            jM1680unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl();
                            i3 &= -57345;
                        } else {
                            jM1680unboximpl = j2;
                        }
                        if (i11 != 0) {
                            z2 = true;
                        } else {
                            z2 = z2;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        j2 = jM1680unboximpl;
                        f3 = f1111;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1482251921, i3, -1, "com.yalla.yalla.ui.composable.common.TabRowDefaults.Indicator (ScrollableTabRow.kt:177)");
                    }
                    if (function4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(279245065);
                        function4.invoke(modifier2, composerStartRestartGroup, Integer.valueOf(((i3 >> 15) & 112) | (i3 & 14)));
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(279245108);
                        Modifier modifierFillMaxWidth$default9 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                        Alignment center9 = Alignment.INSTANCE.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy9 = BoxKt.rememberBoxMeasurePolicy(center9, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                        constructor = companion9.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default9);
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
                        function2OooO00o = OooO.OooO00o(companion9, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy9, composerM1309constructorimpl, currentCompositionLocalMap9);
                        if (composerM1309constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        OooOO0.OooO00o(0, function3ModifierMaterializerOf9, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance9 = BoxScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(279245192);
                        if (z2) {
                            SpacerKt.Spacer(BackgroundKt.m168backgroundbw27NRU(SizeKt.m509height3ABfNKs(SizeKt.m528width3ABfNKs(Modifier.INSTANCE, f4), f3), j2, shapeM727RoundedCornerShape0680j_4), composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f5 = f4;
                    j3 = j2;
                    z3 = z2;
                    function5 = function4;
                    modifier3 = modifier2;
                    float f1112 = f3;
                    shape3 = shapeM727RoundedCornerShape0680j_4;
                    f6 = f1112;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(modifier3, f5, f6, shape3, j3, z3, function5, i, i2));
            }
            i3 |= 12582912;
            if ((i3 & 23967451) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        f4 = f50180OooO0OO;
                    } else {
                        f4 = f;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        f3 = f50181OooO0Oo;
                    }
                    float f1113 = f3;
                    if ((i2 & 8) != 0) {
                        shapeM727RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl((float) 1.5d));
                        i3 &= -7169;
                    } else {
                        shapeM727RoundedCornerShape0680j_4 = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        jM1680unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl();
                        i3 &= -57345;
                    } else {
                        jM1680unboximpl = j2;
                    }
                    if (i11 != 0) {
                        z2 = true;
                    } else {
                        z2 = z2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    j2 = jM1680unboximpl;
                    f3 = f1113;
                } else {
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        f4 = f50180OooO0OO;
                    } else {
                        f4 = f;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        f3 = f50181OooO0Oo;
                    }
                    float f1114 = f3;
                    if ((i2 & 8) != 0) {
                        shapeM727RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl((float) 1.5d));
                        i3 &= -7169;
                    } else {
                        shapeM727RoundedCornerShape0680j_4 = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        jM1680unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl();
                        i3 &= -57345;
                    } else {
                        jM1680unboximpl = j2;
                    }
                    if (i11 != 0) {
                        z2 = true;
                    } else {
                        z2 = z2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    j2 = jM1680unboximpl;
                    f3 = f1114;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1482251921, i3, -1, "com.yalla.yalla.ui.composable.common.TabRowDefaults.Indicator (ScrollableTabRow.kt:177)");
                }
                if (function4 != null) {
                    composerStartRestartGroup.startReplaceableGroup(279245065);
                    function4.invoke(modifier2, composerStartRestartGroup, Integer.valueOf(((i3 >> 15) & 112) | (i3 & 14)));
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(279245108);
                    Modifier modifierFillMaxWidth$default10 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                    Alignment center10 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy10 = BoxKt.rememberBoxMeasurePolicy(center10, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                    constructor = companion10.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default10);
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
                    function2OooO00o = OooO.OooO00o(companion10, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy10, composerM1309constructorimpl, currentCompositionLocalMap10);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    OooOO0.OooO00o(0, function3ModifierMaterializerOf10, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance10 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(279245192);
                    if (z2) {
                        SpacerKt.Spacer(BackgroundKt.m168backgroundbw27NRU(SizeKt.m509height3ABfNKs(SizeKt.m528width3ABfNKs(Modifier.INSTANCE, f4), f3), j2, shapeM727RoundedCornerShape0680j_4), composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f5 = f4;
                j3 = j2;
                z3 = z2;
                function5 = function4;
                modifier3 = modifier2;
                float f1115 = f3;
                shape3 = shapeM727RoundedCornerShape0680j_4;
                f6 = f1115;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        f4 = f50180OooO0OO;
                    } else {
                        f4 = f;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        f3 = f50181OooO0Oo;
                    }
                    float f1116 = f3;
                    if ((i2 & 8) != 0) {
                        shapeM727RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl((float) 1.5d));
                        i3 &= -7169;
                    } else {
                        shapeM727RoundedCornerShape0680j_4 = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        jM1680unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl();
                        i3 &= -57345;
                    } else {
                        jM1680unboximpl = j2;
                    }
                    if (i11 != 0) {
                        z2 = true;
                    } else {
                        z2 = z2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    j2 = jM1680unboximpl;
                    f3 = f1116;
                } else {
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        f4 = f50180OooO0OO;
                    } else {
                        f4 = f;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        f3 = f50181OooO0Oo;
                    }
                    float f1117 = f3;
                    if ((i2 & 8) != 0) {
                        shapeM727RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl((float) 1.5d));
                        i3 &= -7169;
                    } else {
                        shapeM727RoundedCornerShape0680j_4 = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        jM1680unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl();
                        i3 &= -57345;
                    } else {
                        jM1680unboximpl = j2;
                    }
                    if (i11 != 0) {
                        z2 = true;
                    } else {
                        z2 = z2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    j2 = jM1680unboximpl;
                    f3 = f1117;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1482251921, i3, -1, "com.yalla.yalla.ui.composable.common.TabRowDefaults.Indicator (ScrollableTabRow.kt:177)");
                }
                if (function4 != null) {
                    composerStartRestartGroup.startReplaceableGroup(279245065);
                    function4.invoke(modifier2, composerStartRestartGroup, Integer.valueOf(((i3 >> 15) & 112) | (i3 & 14)));
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(279245108);
                    Modifier modifierFillMaxWidth$default11 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                    Alignment center11 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy11 = BoxKt.rememberBoxMeasurePolicy(center11, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                    constructor = companion11.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default11);
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
                    function2OooO00o = OooO.OooO00o(companion11, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy11, composerM1309constructorimpl, currentCompositionLocalMap11);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    OooOO0.OooO00o(0, function3ModifierMaterializerOf11, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance11 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(279245192);
                    if (z2) {
                        SpacerKt.Spacer(BackgroundKt.m168backgroundbw27NRU(SizeKt.m509height3ABfNKs(SizeKt.m528width3ABfNKs(Modifier.INSTANCE, f4), f3), j2, shapeM727RoundedCornerShape0680j_4), composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f5 = f4;
                j3 = j2;
                z3 = z2;
                function5 = function4;
                modifier3 = modifier2;
                float f1118 = f3;
                shape3 = shapeM727RoundedCornerShape0680j_4;
                f6 = f1118;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(modifier3, f5, f6, shape3, j3, z3, function5, i, i2));
        }
        i3 |= 1572864;
        function4 = function3;
        if ((i2 & 128) != 0) {
            if ((29360128 & i) == 0) {
                if (composerStartRestartGroup.changed(this)) {
                    i6 = 8388608;
                } else {
                    i6 = Configuration.BLOCK_SIZE;
                }
                i3 |= i6;
            }
            if ((i3 & 23967451) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        f4 = f50180OooO0OO;
                    } else {
                        f4 = f;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        f3 = f50181OooO0Oo;
                    }
                    float f1119 = f3;
                    if ((i2 & 8) != 0) {
                        shapeM727RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl((float) 1.5d));
                        i3 &= -7169;
                    } else {
                        shapeM727RoundedCornerShape0680j_4 = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        jM1680unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl();
                        i3 &= -57345;
                    } else {
                        jM1680unboximpl = j2;
                    }
                    if (i11 != 0) {
                        z2 = true;
                    } else {
                        z2 = z2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    j2 = jM1680unboximpl;
                    f3 = f1119;
                } else {
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        f4 = f50180OooO0OO;
                    } else {
                        f4 = f;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        f3 = f50181OooO0Oo;
                    }
                    float f11110 = f3;
                    if ((i2 & 8) != 0) {
                        shapeM727RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl((float) 1.5d));
                        i3 &= -7169;
                    } else {
                        shapeM727RoundedCornerShape0680j_4 = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        jM1680unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl();
                        i3 &= -57345;
                    } else {
                        jM1680unboximpl = j2;
                    }
                    if (i11 != 0) {
                        z2 = true;
                    } else {
                        z2 = z2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    j2 = jM1680unboximpl;
                    f3 = f11110;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1482251921, i3, -1, "com.yalla.yalla.ui.composable.common.TabRowDefaults.Indicator (ScrollableTabRow.kt:177)");
                }
                if (function4 != null) {
                    composerStartRestartGroup.startReplaceableGroup(279245065);
                    function4.invoke(modifier2, composerStartRestartGroup, Integer.valueOf(((i3 >> 15) & 112) | (i3 & 14)));
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(279245108);
                    Modifier modifierFillMaxWidth$default12 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                    Alignment center12 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy12 = BoxKt.rememberBoxMeasurePolicy(center12, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap12 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                    constructor = companion12.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf12 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default12);
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
                    function2OooO00o = OooO.OooO00o(companion12, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy12, composerM1309constructorimpl, currentCompositionLocalMap12);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    OooOO0.OooO00o(0, function3ModifierMaterializerOf12, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance12 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(279245192);
                    if (z2) {
                        SpacerKt.Spacer(BackgroundKt.m168backgroundbw27NRU(SizeKt.m509height3ABfNKs(SizeKt.m528width3ABfNKs(Modifier.INSTANCE, f4), f3), j2, shapeM727RoundedCornerShape0680j_4), composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f5 = f4;
                j3 = j2;
                z3 = z2;
                function5 = function4;
                modifier3 = modifier2;
                float f11111 = f3;
                shape3 = shapeM727RoundedCornerShape0680j_4;
                f6 = f11111;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        f4 = f50180OooO0OO;
                    } else {
                        f4 = f;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        f3 = f50181OooO0Oo;
                    }
                    float f11112 = f3;
                    if ((i2 & 8) != 0) {
                        shapeM727RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl((float) 1.5d));
                        i3 &= -7169;
                    } else {
                        shapeM727RoundedCornerShape0680j_4 = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        jM1680unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl();
                        i3 &= -57345;
                    } else {
                        jM1680unboximpl = j2;
                    }
                    if (i11 != 0) {
                        z2 = true;
                    } else {
                        z2 = z2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    j2 = jM1680unboximpl;
                    f3 = f11112;
                } else {
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        f4 = f50180OooO0OO;
                    } else {
                        f4 = f;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        f3 = f50181OooO0Oo;
                    }
                    float f11113 = f3;
                    if ((i2 & 8) != 0) {
                        shapeM727RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl((float) 1.5d));
                        i3 &= -7169;
                    } else {
                        shapeM727RoundedCornerShape0680j_4 = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        jM1680unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl();
                        i3 &= -57345;
                    } else {
                        jM1680unboximpl = j2;
                    }
                    if (i11 != 0) {
                        z2 = true;
                    } else {
                        z2 = z2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    j2 = jM1680unboximpl;
                    f3 = f11113;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1482251921, i3, -1, "com.yalla.yalla.ui.composable.common.TabRowDefaults.Indicator (ScrollableTabRow.kt:177)");
                }
                if (function4 != null) {
                    composerStartRestartGroup.startReplaceableGroup(279245065);
                    function4.invoke(modifier2, composerStartRestartGroup, Integer.valueOf(((i3 >> 15) & 112) | (i3 & 14)));
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(279245108);
                    Modifier modifierFillMaxWidth$default13 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                    Alignment center13 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy13 = BoxKt.rememberBoxMeasurePolicy(center13, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap13 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                    constructor = companion13.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf13 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default13);
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
                    function2OooO00o = OooO.OooO00o(companion13, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy13, composerM1309constructorimpl, currentCompositionLocalMap13);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    OooOO0.OooO00o(0, function3ModifierMaterializerOf13, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance13 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(279245192);
                    if (z2) {
                        SpacerKt.Spacer(BackgroundKt.m168backgroundbw27NRU(SizeKt.m509height3ABfNKs(SizeKt.m528width3ABfNKs(Modifier.INSTANCE, f4), f3), j2, shapeM727RoundedCornerShape0680j_4), composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f5 = f4;
                j3 = j2;
                z3 = z2;
                function5 = function4;
                modifier3 = modifier2;
                float f11114 = f3;
                shape3 = shapeM727RoundedCornerShape0680j_4;
                f6 = f11114;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(modifier3, f5, f6, shape3, j3, z3, function5, i, i2));
        }
        i3 |= 12582912;
        if ((i3 & 23967451) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    f4 = f50180OooO0OO;
                } else {
                    f4 = f;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    f3 = f50181OooO0Oo;
                }
                float f11115 = f3;
                if ((i2 & 8) != 0) {
                    shapeM727RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl((float) 1.5d));
                    i3 &= -7169;
                } else {
                    shapeM727RoundedCornerShape0680j_4 = shape2;
                }
                if ((i2 & 16) != 0) {
                    jM1680unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl();
                    i3 &= -57345;
                } else {
                    jM1680unboximpl = j2;
                }
                if (i11 != 0) {
                    z2 = true;
                } else {
                    z2 = z2;
                }
                if (i4 != 0) {
                    function4 = null;
                }
                j2 = jM1680unboximpl;
                f3 = f11115;
            } else {
                if (i8 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    f4 = f50180OooO0OO;
                } else {
                    f4 = f;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    f3 = f50181OooO0Oo;
                }
                float f11116 = f3;
                if ((i2 & 8) != 0) {
                    shapeM727RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl((float) 1.5d));
                    i3 &= -7169;
                } else {
                    shapeM727RoundedCornerShape0680j_4 = shape2;
                }
                if ((i2 & 16) != 0) {
                    jM1680unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl();
                    i3 &= -57345;
                } else {
                    jM1680unboximpl = j2;
                }
                if (i11 != 0) {
                    z2 = true;
                } else {
                    z2 = z2;
                }
                if (i4 != 0) {
                    function4 = null;
                }
                j2 = jM1680unboximpl;
                f3 = f11116;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1482251921, i3, -1, "com.yalla.yalla.ui.composable.common.TabRowDefaults.Indicator (ScrollableTabRow.kt:177)");
            }
            if (function4 != null) {
                composerStartRestartGroup.startReplaceableGroup(279245065);
                function4.invoke(modifier2, composerStartRestartGroup, Integer.valueOf(((i3 >> 15) & 112) | (i3 & 14)));
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(279245108);
                Modifier modifierFillMaxWidth$default14 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                Alignment center14 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy14 = BoxKt.rememberBoxMeasurePolicy(center14, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap14 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                constructor = companion14.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf14 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default14);
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
                function2OooO00o = OooO.OooO00o(companion14, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy14, composerM1309constructorimpl, currentCompositionLocalMap14);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf14, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance14 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(279245192);
                if (z2) {
                    SpacerKt.Spacer(BackgroundKt.m168backgroundbw27NRU(SizeKt.m509height3ABfNKs(SizeKt.m528width3ABfNKs(Modifier.INSTANCE, f4), f3), j2, shapeM727RoundedCornerShape0680j_4), composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f5 = f4;
            j3 = j2;
            z3 = z2;
            function5 = function4;
            modifier3 = modifier2;
            float f11117 = f3;
            shape3 = shapeM727RoundedCornerShape0680j_4;
            f6 = f11117;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    f4 = f50180OooO0OO;
                } else {
                    f4 = f;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    f3 = f50181OooO0Oo;
                }
                float f11118 = f3;
                if ((i2 & 8) != 0) {
                    shapeM727RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl((float) 1.5d));
                    i3 &= -7169;
                } else {
                    shapeM727RoundedCornerShape0680j_4 = shape2;
                }
                if ((i2 & 16) != 0) {
                    jM1680unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl();
                    i3 &= -57345;
                } else {
                    jM1680unboximpl = j2;
                }
                if (i11 != 0) {
                    z2 = true;
                } else {
                    z2 = z2;
                }
                if (i4 != 0) {
                    function4 = null;
                }
                j2 = jM1680unboximpl;
                f3 = f11118;
            } else {
                if (i8 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    f4 = f50180OooO0OO;
                } else {
                    f4 = f;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    f3 = f50181OooO0Oo;
                }
                float f11119 = f3;
                if ((i2 & 8) != 0) {
                    shapeM727RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl((float) 1.5d));
                    i3 &= -7169;
                } else {
                    shapeM727RoundedCornerShape0680j_4 = shape2;
                }
                if ((i2 & 16) != 0) {
                    jM1680unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl();
                    i3 &= -57345;
                } else {
                    jM1680unboximpl = j2;
                }
                if (i11 != 0) {
                    z2 = true;
                } else {
                    z2 = z2;
                }
                if (i4 != 0) {
                    function4 = null;
                }
                j2 = jM1680unboximpl;
                f3 = f11119;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1482251921, i3, -1, "com.yalla.yalla.ui.composable.common.TabRowDefaults.Indicator (ScrollableTabRow.kt:177)");
            }
            if (function4 != null) {
                composerStartRestartGroup.startReplaceableGroup(279245065);
                function4.invoke(modifier2, composerStartRestartGroup, Integer.valueOf(((i3 >> 15) & 112) | (i3 & 14)));
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(279245108);
                Modifier modifierFillMaxWidth$default15 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                Alignment center15 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy15 = BoxKt.rememberBoxMeasurePolicy(center15, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap15 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                constructor = companion15.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf15 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default15);
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
                function2OooO00o = OooO.OooO00o(companion15, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy15, composerM1309constructorimpl, currentCompositionLocalMap15);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf15, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance15 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(279245192);
                if (z2) {
                    SpacerKt.Spacer(BackgroundKt.m168backgroundbw27NRU(SizeKt.m509height3ABfNKs(SizeKt.m528width3ABfNKs(Modifier.INSTANCE, f4), f3), j2, shapeM727RoundedCornerShape0680j_4), composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f5 = f4;
            j3 = j2;
            z3 = z2;
            function5 = function4;
            modifier3 = modifier2;
            float f111110 = f3;
            shape3 = shapeM727RoundedCornerShape0680j_4;
            f6 = f111110;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(modifier3, f5, f6, shape3, j3, z3, function5, i, i2));
    }
}
