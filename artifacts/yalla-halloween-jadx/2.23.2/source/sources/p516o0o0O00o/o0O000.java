package p516o0o0O00o;

import androidx.compose.animation.OooOOOO;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import com.qiniu.android.storage.Configuration;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import net.sqlcipher.database.SQLiteDatabase;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nScrollableTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollableTabRow.kt\ncom/yalla/yalla/ui/composable/common/ScrollableTabRowKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,326:1\n135#2:327\n174#3:328\n*S KotlinDebug\n*F\n+ 1 ScrollableTabRow.kt\ncom/yalla/yalla/ui/composable/common/ScrollableTabRowKt\n*L\n211#1:327\n326#1:328\n*E\n"})
public final class o0O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final TweenSpec f51469OooO00o = AnimationSpecKt.tween$default(SQLiteDatabase.MAX_SQL_CACHE_SIZE, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    public static final class OooO00o extends Lambda implements Function3<List<? extends o0O00o00>, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f51470OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i) {
            super(3);
            this.f51470OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(List<? extends o0O00o00> list, Composer composer, Integer num) {
            List<? extends o0O00o00> tabPositions = list;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1050084203, iIntValue, -1, "com.yalla.yalla.ui.composable.common.ScrollableTabRow.<anonymous> (ScrollableTabRow.kt:59)");
            }
            o0O00oO0 o0o00oo1 = o0O00oO0.f51523OooO00o;
            Modifier.Companion companion = Modifier.INSTANCE;
            final o0O00o00 currentTabPosition = tabPositions.get(this.f51470OooO0Oo);
            Intrinsics.checkNotNullParameter(companion, "<this>");
            Intrinsics.checkNotNullParameter(currentTabPosition, "currentTabPosition");
            o0o00oo1.OooO0O0(ComposedModifierKt.composed(companion, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: com.yalla.yalla.ui.composable.common.ScrollableTabRowKt$tabIndicatorOffset$$inlined$debugInspectorInfo$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(InspectorInfo inspectorInfo) {
                    InspectorInfo inspectorInfo2 = inspectorInfo;
                    Intrinsics.checkNotNullParameter(inspectorInfo2, "$this$null");
                    inspectorInfo2.setName("tabIndicatorOffset");
                    inspectorInfo2.setValue(currentTabPosition);
                    return Unit.INSTANCE;
                }
            } : InspectableValueKt.getNoInspectorInfo(), new o0O00(currentTabPosition)), 0.0f, 0.0f, null, 0L, false, null, composer2, 12582912, 126);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nScrollableTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollableTabRow.kt\ncom/yalla/yalla/ui/composable/common/ScrollableTabRowKt$ScrollableTabRow$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,326:1\n486#2,4:327\n490#2,2:335\n494#2:341\n25#3:331\n50#3:342\n49#3:343\n1097#4,3:332\n1100#4,3:338\n1097#4,6:344\n486#5:337\n*S KotlinDebug\n*F\n+ 1 ScrollableTabRow.kt\ncom/yalla/yalla/ui/composable/common/ScrollableTabRowKt$ScrollableTabRow$2\n*L\n75#1:327,4\n75#1:335,2\n75#1:341\n75#1:331\n76#1:342\n76#1:343\n75#1:332,3\n75#1:338,3\n76#1:344,6\n75#1:337\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f51471OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ float f51472OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f51473OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f51474OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f51475OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function3<List<o0O00o00>, Composer, Integer, Unit> f51476OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(float f, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, int i, Function3<? super List<o0O00o00>, ? super Composer, ? super Integer, Unit> function4, int i2) {
            super(2);
            this.f51472OooO0Oo = f;
            this.f51474OooO0o0 = function2;
            this.f51473OooO0o = function3;
            this.f51475OooO0oO = i;
            this.f51476OooO0oo = function4;
            this.f51471OooO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1118638900, iIntValue, -1, "com.yalla.yalla.ui.composable.common.ScrollableTabRow.<anonymous> (ScrollableTabRow.kt:73)");
                }
                ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                composer2.startReplaceableGroup(773894976);
                composer2.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer2.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2), composer2);
                }
                composer2.endReplaceableGroup();
                CoroutineScope coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue, composer2, 511388516);
                boolean zChanged = composer2.changed(scrollStateRememberScrollState) | composer2.changed(coroutineScopeOooO00o);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new o0O0000O(scrollStateRememberScrollState, coroutineScopeOooO00o);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                SubcomposeLayoutKt.SubcomposeLayout(ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null))), new o0O000Oo(this.f51472OooO0Oo, this.f51474OooO0o0, this.f51473OooO0o, (o0O0000O) objRememberedValue2, this.f51475OooO0oO, this.f51476OooO0oo, this.f51471OooO), composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function3<List<o0O00o00>, Composer, Integer, Unit> f51477OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f51478OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f51479OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Modifier f51480OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f51481OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ float f51482OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f51483OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f51484OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ int f51485OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ int f51486OooOOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(int i, Modifier modifier, long j, long j2, float f, Function3<? super List<o0O00o00>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function4, int i2, int i3) {
            super(2);
            this.f51478OooO0Oo = i;
            this.f51480OooO0o0 = modifier;
            this.f51479OooO0o = j;
            this.f51481OooO0oO = j2;
            this.f51482OooO0oo = f;
            this.f51477OooO = function3;
            this.f51483OooOO0 = function2;
            this.f51484OooOO0O = function4;
            this.f51485OooOO0o = i2;
            this.f51486OooOOO0 = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0O000.OooO00o(this.f51478OooO0Oo, this.f51480OooO0o0, this.f51479OooO0o, this.f51481OooO0oO, this.f51482OooO0oo, this.f51477OooO, this.f51483OooOO0, this.f51484OooOO0O, composer, RecomposeScopeImplKt.updateChangedFlags(this.f51485OooOO0o | 1), this.f51486OooOOO0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0137 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x0139  */
    /* JADX WARN: Code duplicated, block: B:107:0x013c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0142  */
    /* JADX WARN: Code duplicated, block: B:113:0x0154  */
    /* JADX WARN: Code duplicated, block: B:115:0x0160  */
    /* JADX WARN: Code duplicated, block: B:116:0x0163  */
    /* JADX WARN: Code duplicated, block: B:118:0x0166  */
    /* JADX WARN: Code duplicated, block: B:119:0x0173  */
    /* JADX WARN: Code duplicated, block: B:121:0x0177  */
    /* JADX WARN: Code duplicated, block: B:122:0x017a  */
    /* JADX WARN: Code duplicated, block: B:126:0x018c  */
    /* JADX WARN: Code duplicated, block: B:129:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:134:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:93:0x0110  */
    /* JADX WARN: Code duplicated, block: B:95:0x0118  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    public static final void OooO00o(int i, @Nullable Modifier modifier, long j, long j2, float f, @Nullable Function3<? super List<o0O00o00>, ? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @NotNull Function2<? super Composer, ? super Integer, Unit> tabs, @Nullable Composer composer, int i2, int i3) {
        int i4;
        long primarySurface;
        long jM1057contentColorForek8zF_U;
        int i5;
        float f2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Modifier modifier2;
        float f3;
        Function3<? super List<o0O00o00>, ? super Composer, ? super Integer, Unit> function3ComposableLambda;
        Function2<? super Composer, ? super Integer, Unit> function4;
        Function2<? super Composer, ? super Integer, Unit> function5;
        int i12;
        Function3<? super List<o0O00o00>, ? super Composer, ? super Integer, Unit> function6;
        Function3<? super List<o0O00o00>, ? super Composer, ? super Integer, Unit> function7;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i13;
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Composer composerStartRestartGroup = composer.startRestartGroup(-571933040);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i14 = i3 & 2;
        if (i14 == 0) {
            if ((i2 & 112) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i2 & 896) == 0) {
                if ((i3 & 4) == 0) {
                    primarySurface = j;
                    int i15 = composerStartRestartGroup.changed(primarySurface) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
                    i4 |= i15;
                } else {
                    primarySurface = j;
                }
                i4 |= i15;
            } else {
                primarySurface = j;
            }
            if ((i2 & 7168) == 0) {
                if ((i3 & 8) == 0) {
                    jM1057contentColorForek8zF_U = j2;
                    if (composerStartRestartGroup.changed(jM1057contentColorForek8zF_U)) {
                        i13 = 2048;
                    }
                    i4 |= i13;
                } else {
                    jM1057contentColorForek8zF_U = j2;
                }
                i13 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                i4 |= i13;
            } else {
                jM1057contentColorForek8zF_U = j2;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((57344 & i2) == 0) {
                    f2 = f;
                    if (composerStartRestartGroup.changed(f2)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= 196608;
                } else if ((i2 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i10 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i10 = 524288;
                    }
                    i4 |= i10;
                }
                if ((i3 & 128) != 0) {
                    if ((29360128 & i2) == 0) {
                        if (composerStartRestartGroup.changedInstance(tabs)) {
                            i11 = 8388608;
                        } else {
                            i11 = Configuration.BLOCK_SIZE;
                        }
                    }
                    if ((23967451 & i4) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i3 & 4) != 0) {
                                primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable));
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                                i4 &= -7169;
                            }
                            if (i5 != 0) {
                                f3 = o0O00oO0.f51527OooO0o0;
                            } else {
                                f3 = f2;
                            }
                            if (i7 != 0) {
                                function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1050084203, true, new OooO00o(i));
                            } else {
                                function3ComposableLambda = function3;
                            }
                            if (i9 != 0) {
                                function4 = o00O00O.f51355OooO00o;
                            } else {
                                function4 = function2;
                            }
                            function5 = function4;
                            Function3<? super List<o0O00o00>, ? super Composer, ? super Integer, Unit> function8 = function3ComposableLambda;
                            i12 = i4;
                            function6 = function8;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            modifier2 = modifier;
                            function5 = function2;
                            i12 = i4;
                            f3 = f2;
                            function6 = function3;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-571933040, i12, -1, "com.yalla.yalla.ui.composable.common.ScrollableTabRow (ScrollableTabRow.kt:67)");
                        }
                        SurfaceKt.m1201SurfaceFjzlyU(modifier2, null, primarySurface, jM1057contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1118638900, true, new OooO0O0(f3, tabs, function5, i, function6, i12)), composerStartRestartGroup, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function7 = function6;
                        f2 = f3;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        function7 = function3;
                        function5 = function2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(i, modifier3, primarySurface, jM1057contentColorForek8zF_U, f2, function7, function5, tabs, i2, i3));
                }
                i11 = 12582912;
                i4 |= i11;
                if ((23967451 & i4) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            f3 = o0O00oO0.f51527OooO0o0;
                        } else {
                            f3 = f2;
                        }
                        if (i7 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1050084203, true, new OooO00o(i));
                        } else {
                            function3ComposableLambda = function3;
                        }
                        if (i9 != 0) {
                            function4 = o00O00O.f51355OooO00o;
                        } else {
                            function4 = function2;
                        }
                        function5 = function4;
                        Function3<? super List<o0O00o00>, ? super Composer, ? super Integer, Unit> function9 = function3ComposableLambda;
                        i12 = i4;
                        function6 = function9;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            f3 = o0O00oO0.f51527OooO0o0;
                        } else {
                            f3 = f2;
                        }
                        if (i7 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1050084203, true, new OooO00o(i));
                        } else {
                            function3ComposableLambda = function3;
                        }
                        if (i9 != 0) {
                            function4 = o00O00O.f51355OooO00o;
                        } else {
                            function4 = function2;
                        }
                        function5 = function4;
                        Function3<? super List<o0O00o00>, ? super Composer, ? super Integer, Unit> function10 = function3ComposableLambda;
                        i12 = i4;
                        function6 = function10;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-571933040, i12, -1, "com.yalla.yalla.ui.composable.common.ScrollableTabRow (ScrollableTabRow.kt:67)");
                    }
                    SurfaceKt.m1201SurfaceFjzlyU(modifier2, null, primarySurface, jM1057contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1118638900, true, new OooO0O0(f3, tabs, function5, i, function6, i12)), composerStartRestartGroup, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function7 = function6;
                    f2 = f3;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            f3 = o0O00oO0.f51527OooO0o0;
                        } else {
                            f3 = f2;
                        }
                        if (i7 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1050084203, true, new OooO00o(i));
                        } else {
                            function3ComposableLambda = function3;
                        }
                        if (i9 != 0) {
                            function4 = o00O00O.f51355OooO00o;
                        } else {
                            function4 = function2;
                        }
                        function5 = function4;
                        Function3<? super List<o0O00o00>, ? super Composer, ? super Integer, Unit> function11 = function3ComposableLambda;
                        i12 = i4;
                        function6 = function11;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            f3 = o0O00oO0.f51527OooO0o0;
                        } else {
                            f3 = f2;
                        }
                        if (i7 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1050084203, true, new OooO00o(i));
                        } else {
                            function3ComposableLambda = function3;
                        }
                        if (i9 != 0) {
                            function4 = o00O00O.f51355OooO00o;
                        } else {
                            function4 = function2;
                        }
                        function5 = function4;
                        Function3<? super List<o0O00o00>, ? super Composer, ? super Integer, Unit> function12 = function3ComposableLambda;
                        i12 = i4;
                        function6 = function12;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-571933040, i12, -1, "com.yalla.yalla.ui.composable.common.ScrollableTabRow (ScrollableTabRow.kt:67)");
                    }
                    SurfaceKt.m1201SurfaceFjzlyU(modifier2, null, primarySurface, jM1057contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1118638900, true, new OooO0O0(f3, tabs, function5, i, function6, i12)), composerStartRestartGroup, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function7 = function6;
                    f2 = f3;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(i, modifier3, primarySurface, jM1057contentColorForek8zF_U, f2, function7, function5, tabs, i2, i3));
            }
            i4 |= 24576;
            f2 = f;
            i7 = i3 & 32;
            if (i7 != 0) {
                i4 |= 196608;
            } else if ((i2 & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i4 |= i8;
            }
            i9 = i3 & 64;
            if (i9 != 0) {
                i4 |= 1572864;
            } else if ((i2 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i10 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i10 = 524288;
                }
                i4 |= i10;
            }
            if ((i3 & 128) != 0) {
                if ((29360128 & i2) == 0) {
                    if (composerStartRestartGroup.changedInstance(tabs)) {
                        i11 = 8388608;
                    } else {
                        i11 = Configuration.BLOCK_SIZE;
                    }
                }
                if ((23967451 & i4) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            f3 = o0O00oO0.f51527OooO0o0;
                        } else {
                            f3 = f2;
                        }
                        if (i7 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1050084203, true, new OooO00o(i));
                        } else {
                            function3ComposableLambda = function3;
                        }
                        if (i9 != 0) {
                            function4 = o00O00O.f51355OooO00o;
                        } else {
                            function4 = function2;
                        }
                        function5 = function4;
                        Function3<? super List<o0O00o00>, ? super Composer, ? super Integer, Unit> function13 = function3ComposableLambda;
                        i12 = i4;
                        function6 = function13;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            f3 = o0O00oO0.f51527OooO0o0;
                        } else {
                            f3 = f2;
                        }
                        if (i7 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1050084203, true, new OooO00o(i));
                        } else {
                            function3ComposableLambda = function3;
                        }
                        if (i9 != 0) {
                            function4 = o00O00O.f51355OooO00o;
                        } else {
                            function4 = function2;
                        }
                        function5 = function4;
                        Function3<? super List<o0O00o00>, ? super Composer, ? super Integer, Unit> function14 = function3ComposableLambda;
                        i12 = i4;
                        function6 = function14;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-571933040, i12, -1, "com.yalla.yalla.ui.composable.common.ScrollableTabRow (ScrollableTabRow.kt:67)");
                    }
                    SurfaceKt.m1201SurfaceFjzlyU(modifier2, null, primarySurface, jM1057contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1118638900, true, new OooO0O0(f3, tabs, function5, i, function6, i12)), composerStartRestartGroup, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function7 = function6;
                    f2 = f3;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            f3 = o0O00oO0.f51527OooO0o0;
                        } else {
                            f3 = f2;
                        }
                        if (i7 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1050084203, true, new OooO00o(i));
                        } else {
                            function3ComposableLambda = function3;
                        }
                        if (i9 != 0) {
                            function4 = o00O00O.f51355OooO00o;
                        } else {
                            function4 = function2;
                        }
                        function5 = function4;
                        Function3<? super List<o0O00o00>, ? super Composer, ? super Integer, Unit> function15 = function3ComposableLambda;
                        i12 = i4;
                        function6 = function15;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            f3 = o0O00oO0.f51527OooO0o0;
                        } else {
                            f3 = f2;
                        }
                        if (i7 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1050084203, true, new OooO00o(i));
                        } else {
                            function3ComposableLambda = function3;
                        }
                        if (i9 != 0) {
                            function4 = o00O00O.f51355OooO00o;
                        } else {
                            function4 = function2;
                        }
                        function5 = function4;
                        Function3<? super List<o0O00o00>, ? super Composer, ? super Integer, Unit> function16 = function3ComposableLambda;
                        i12 = i4;
                        function6 = function16;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-571933040, i12, -1, "com.yalla.yalla.ui.composable.common.ScrollableTabRow (ScrollableTabRow.kt:67)");
                    }
                    SurfaceKt.m1201SurfaceFjzlyU(modifier2, null, primarySurface, jM1057contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1118638900, true, new OooO0O0(f3, tabs, function5, i, function6, i12)), composerStartRestartGroup, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function7 = function6;
                    f2 = f3;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(i, modifier3, primarySurface, jM1057contentColorForek8zF_U, f2, function7, function5, tabs, i2, i3));
            }
            i11 = 12582912;
            i4 |= i11;
            if ((23967451 & i4) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        f3 = o0O00oO0.f51527OooO0o0;
                    } else {
                        f3 = f2;
                    }
                    if (i7 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1050084203, true, new OooO00o(i));
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i9 != 0) {
                        function4 = o00O00O.f51355OooO00o;
                    } else {
                        function4 = function2;
                    }
                    function5 = function4;
                    Function3<? super List<o0O00o00>, ? super Composer, ? super Integer, Unit> function17 = function3ComposableLambda;
                    i12 = i4;
                    function6 = function17;
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        f3 = o0O00oO0.f51527OooO0o0;
                    } else {
                        f3 = f2;
                    }
                    if (i7 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1050084203, true, new OooO00o(i));
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i9 != 0) {
                        function4 = o00O00O.f51355OooO00o;
                    } else {
                        function4 = function2;
                    }
                    function5 = function4;
                    Function3<? super List<o0O00o00>, ? super Composer, ? super Integer, Unit> function18 = function3ComposableLambda;
                    i12 = i4;
                    function6 = function18;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-571933040, i12, -1, "com.yalla.yalla.ui.composable.common.ScrollableTabRow (ScrollableTabRow.kt:67)");
                }
                SurfaceKt.m1201SurfaceFjzlyU(modifier2, null, primarySurface, jM1057contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1118638900, true, new OooO0O0(f3, tabs, function5, i, function6, i12)), composerStartRestartGroup, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function7 = function6;
                f2 = f3;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        f3 = o0O00oO0.f51527OooO0o0;
                    } else {
                        f3 = f2;
                    }
                    if (i7 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1050084203, true, new OooO00o(i));
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i9 != 0) {
                        function4 = o00O00O.f51355OooO00o;
                    } else {
                        function4 = function2;
                    }
                    function5 = function4;
                    Function3<? super List<o0O00o00>, ? super Composer, ? super Integer, Unit> function19 = function3ComposableLambda;
                    i12 = i4;
                    function6 = function19;
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        f3 = o0O00oO0.f51527OooO0o0;
                    } else {
                        f3 = f2;
                    }
                    if (i7 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1050084203, true, new OooO00o(i));
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i9 != 0) {
                        function4 = o00O00O.f51355OooO00o;
                    } else {
                        function4 = function2;
                    }
                    function5 = function4;
                    Function3<? super List<o0O00o00>, ? super Composer, ? super Integer, Unit> function110 = function3ComposableLambda;
                    i12 = i4;
                    function6 = function110;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-571933040, i12, -1, "com.yalla.yalla.ui.composable.common.ScrollableTabRow (ScrollableTabRow.kt:67)");
                }
                SurfaceKt.m1201SurfaceFjzlyU(modifier2, null, primarySurface, jM1057contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1118638900, true, new OooO0O0(f3, tabs, function5, i, function6, i12)), composerStartRestartGroup, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function7 = function6;
                f2 = f3;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(i, modifier3, primarySurface, jM1057contentColorForek8zF_U, f2, function7, function5, tabs, i2, i3));
        }
        i4 |= 48;
        if ((i2 & 896) == 0) {
            if ((i3 & 4) == 0) {
                primarySurface = j;
                if (composerStartRestartGroup.changed(primarySurface)) {
                }
                i4 |= i15;
            } else {
                primarySurface = j;
            }
            i4 |= i15;
        } else {
            primarySurface = j;
        }
        if ((i2 & 7168) == 0) {
            if ((i3 & 8) == 0) {
                jM1057contentColorForek8zF_U = j2;
                if (composerStartRestartGroup.changed(jM1057contentColorForek8zF_U)) {
                    i13 = 2048;
                }
                i4 |= i13;
            } else {
                jM1057contentColorForek8zF_U = j2;
            }
            i13 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            i4 |= i13;
        } else {
            jM1057contentColorForek8zF_U = j2;
        }
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((57344 & i2) == 0) {
                f2 = f;
                if (composerStartRestartGroup.changed(f2)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i4 |= i6;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                i4 |= 196608;
            } else if ((i2 & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i4 |= i8;
            }
            i9 = i3 & 64;
            if (i9 != 0) {
                i4 |= 1572864;
            } else if ((i2 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i10 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i10 = 524288;
                }
                i4 |= i10;
            }
            if ((i3 & 128) != 0) {
                if ((29360128 & i2) == 0) {
                    if (composerStartRestartGroup.changedInstance(tabs)) {
                        i11 = 8388608;
                    } else {
                        i11 = Configuration.BLOCK_SIZE;
                    }
                }
                if ((23967451 & i4) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            f3 = o0O00oO0.f51527OooO0o0;
                        } else {
                            f3 = f2;
                        }
                        if (i7 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1050084203, true, new OooO00o(i));
                        } else {
                            function3ComposableLambda = function3;
                        }
                        if (i9 != 0) {
                            function4 = o00O00O.f51355OooO00o;
                        } else {
                            function4 = function2;
                        }
                        function5 = function4;
                        Function3<? super List<o0O00o00>, ? super Composer, ? super Integer, Unit> function111 = function3ComposableLambda;
                        i12 = i4;
                        function6 = function111;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            f3 = o0O00oO0.f51527OooO0o0;
                        } else {
                            f3 = f2;
                        }
                        if (i7 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1050084203, true, new OooO00o(i));
                        } else {
                            function3ComposableLambda = function3;
                        }
                        if (i9 != 0) {
                            function4 = o00O00O.f51355OooO00o;
                        } else {
                            function4 = function2;
                        }
                        function5 = function4;
                        Function3<? super List<o0O00o00>, ? super Composer, ? super Integer, Unit> function112 = function3ComposableLambda;
                        i12 = i4;
                        function6 = function112;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-571933040, i12, -1, "com.yalla.yalla.ui.composable.common.ScrollableTabRow (ScrollableTabRow.kt:67)");
                    }
                    SurfaceKt.m1201SurfaceFjzlyU(modifier2, null, primarySurface, jM1057contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1118638900, true, new OooO0O0(f3, tabs, function5, i, function6, i12)), composerStartRestartGroup, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function7 = function6;
                    f2 = f3;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            f3 = o0O00oO0.f51527OooO0o0;
                        } else {
                            f3 = f2;
                        }
                        if (i7 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1050084203, true, new OooO00o(i));
                        } else {
                            function3ComposableLambda = function3;
                        }
                        if (i9 != 0) {
                            function4 = o00O00O.f51355OooO00o;
                        } else {
                            function4 = function2;
                        }
                        function5 = function4;
                        Function3<? super List<o0O00o00>, ? super Composer, ? super Integer, Unit> function113 = function3ComposableLambda;
                        i12 = i4;
                        function6 = function113;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            f3 = o0O00oO0.f51527OooO0o0;
                        } else {
                            f3 = f2;
                        }
                        if (i7 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1050084203, true, new OooO00o(i));
                        } else {
                            function3ComposableLambda = function3;
                        }
                        if (i9 != 0) {
                            function4 = o00O00O.f51355OooO00o;
                        } else {
                            function4 = function2;
                        }
                        function5 = function4;
                        Function3<? super List<o0O00o00>, ? super Composer, ? super Integer, Unit> function114 = function3ComposableLambda;
                        i12 = i4;
                        function6 = function114;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-571933040, i12, -1, "com.yalla.yalla.ui.composable.common.ScrollableTabRow (ScrollableTabRow.kt:67)");
                    }
                    SurfaceKt.m1201SurfaceFjzlyU(modifier2, null, primarySurface, jM1057contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1118638900, true, new OooO0O0(f3, tabs, function5, i, function6, i12)), composerStartRestartGroup, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function7 = function6;
                    f2 = f3;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(i, modifier3, primarySurface, jM1057contentColorForek8zF_U, f2, function7, function5, tabs, i2, i3));
            }
            i11 = 12582912;
            i4 |= i11;
            if ((23967451 & i4) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        f3 = o0O00oO0.f51527OooO0o0;
                    } else {
                        f3 = f2;
                    }
                    if (i7 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1050084203, true, new OooO00o(i));
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i9 != 0) {
                        function4 = o00O00O.f51355OooO00o;
                    } else {
                        function4 = function2;
                    }
                    function5 = function4;
                    Function3<? super List<o0O00o00>, ? super Composer, ? super Integer, Unit> function115 = function3ComposableLambda;
                    i12 = i4;
                    function6 = function115;
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        f3 = o0O00oO0.f51527OooO0o0;
                    } else {
                        f3 = f2;
                    }
                    if (i7 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1050084203, true, new OooO00o(i));
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i9 != 0) {
                        function4 = o00O00O.f51355OooO00o;
                    } else {
                        function4 = function2;
                    }
                    function5 = function4;
                    Function3<? super List<o0O00o00>, ? super Composer, ? super Integer, Unit> function116 = function3ComposableLambda;
                    i12 = i4;
                    function6 = function116;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-571933040, i12, -1, "com.yalla.yalla.ui.composable.common.ScrollableTabRow (ScrollableTabRow.kt:67)");
                }
                SurfaceKt.m1201SurfaceFjzlyU(modifier2, null, primarySurface, jM1057contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1118638900, true, new OooO0O0(f3, tabs, function5, i, function6, i12)), composerStartRestartGroup, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function7 = function6;
                f2 = f3;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        f3 = o0O00oO0.f51527OooO0o0;
                    } else {
                        f3 = f2;
                    }
                    if (i7 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1050084203, true, new OooO00o(i));
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i9 != 0) {
                        function4 = o00O00O.f51355OooO00o;
                    } else {
                        function4 = function2;
                    }
                    function5 = function4;
                    Function3<? super List<o0O00o00>, ? super Composer, ? super Integer, Unit> function117 = function3ComposableLambda;
                    i12 = i4;
                    function6 = function117;
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        f3 = o0O00oO0.f51527OooO0o0;
                    } else {
                        f3 = f2;
                    }
                    if (i7 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1050084203, true, new OooO00o(i));
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i9 != 0) {
                        function4 = o00O00O.f51355OooO00o;
                    } else {
                        function4 = function2;
                    }
                    function5 = function4;
                    Function3<? super List<o0O00o00>, ? super Composer, ? super Integer, Unit> function118 = function3ComposableLambda;
                    i12 = i4;
                    function6 = function118;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-571933040, i12, -1, "com.yalla.yalla.ui.composable.common.ScrollableTabRow (ScrollableTabRow.kt:67)");
                }
                SurfaceKt.m1201SurfaceFjzlyU(modifier2, null, primarySurface, jM1057contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1118638900, true, new OooO0O0(f3, tabs, function5, i, function6, i12)), composerStartRestartGroup, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function7 = function6;
                f2 = f3;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(i, modifier3, primarySurface, jM1057contentColorForek8zF_U, f2, function7, function5, tabs, i2, i3));
        }
        i4 |= 24576;
        f2 = f;
        i7 = i3 & 32;
        if (i7 != 0) {
            i4 |= 196608;
        } else if ((i2 & 458752) == 0) {
            if (composerStartRestartGroup.changedInstance(function3)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i4 |= i8;
        }
        i9 = i3 & 64;
        if (i9 != 0) {
            i4 |= 1572864;
        } else if ((i2 & 3670016) == 0) {
            if (composerStartRestartGroup.changedInstance(function2)) {
                i10 = ZegoConstants.ErrorMask.RoomServerErrorMask;
            } else {
                i10 = 524288;
            }
            i4 |= i10;
        }
        if ((i3 & 128) != 0) {
            if ((29360128 & i2) == 0) {
                if (composerStartRestartGroup.changedInstance(tabs)) {
                    i11 = 8388608;
                } else {
                    i11 = Configuration.BLOCK_SIZE;
                }
            }
            if ((23967451 & i4) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        f3 = o0O00oO0.f51527OooO0o0;
                    } else {
                        f3 = f2;
                    }
                    if (i7 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1050084203, true, new OooO00o(i));
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i9 != 0) {
                        function4 = o00O00O.f51355OooO00o;
                    } else {
                        function4 = function2;
                    }
                    function5 = function4;
                    Function3<? super List<o0O00o00>, ? super Composer, ? super Integer, Unit> function119 = function3ComposableLambda;
                    i12 = i4;
                    function6 = function119;
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        f3 = o0O00oO0.f51527OooO0o0;
                    } else {
                        f3 = f2;
                    }
                    if (i7 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1050084203, true, new OooO00o(i));
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i9 != 0) {
                        function4 = o00O00O.f51355OooO00o;
                    } else {
                        function4 = function2;
                    }
                    function5 = function4;
                    Function3<? super List<o0O00o00>, ? super Composer, ? super Integer, Unit> function1110 = function3ComposableLambda;
                    i12 = i4;
                    function6 = function1110;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-571933040, i12, -1, "com.yalla.yalla.ui.composable.common.ScrollableTabRow (ScrollableTabRow.kt:67)");
                }
                SurfaceKt.m1201SurfaceFjzlyU(modifier2, null, primarySurface, jM1057contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1118638900, true, new OooO0O0(f3, tabs, function5, i, function6, i12)), composerStartRestartGroup, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function7 = function6;
                f2 = f3;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        f3 = o0O00oO0.f51527OooO0o0;
                    } else {
                        f3 = f2;
                    }
                    if (i7 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1050084203, true, new OooO00o(i));
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i9 != 0) {
                        function4 = o00O00O.f51355OooO00o;
                    } else {
                        function4 = function2;
                    }
                    function5 = function4;
                    Function3<? super List<o0O00o00>, ? super Composer, ? super Integer, Unit> function1111 = function3ComposableLambda;
                    i12 = i4;
                    function6 = function1111;
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        f3 = o0O00oO0.f51527OooO0o0;
                    } else {
                        f3 = f2;
                    }
                    if (i7 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1050084203, true, new OooO00o(i));
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i9 != 0) {
                        function4 = o00O00O.f51355OooO00o;
                    } else {
                        function4 = function2;
                    }
                    function5 = function4;
                    Function3<? super List<o0O00o00>, ? super Composer, ? super Integer, Unit> function1112 = function3ComposableLambda;
                    i12 = i4;
                    function6 = function1112;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-571933040, i12, -1, "com.yalla.yalla.ui.composable.common.ScrollableTabRow (ScrollableTabRow.kt:67)");
                }
                SurfaceKt.m1201SurfaceFjzlyU(modifier2, null, primarySurface, jM1057contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1118638900, true, new OooO0O0(f3, tabs, function5, i, function6, i12)), composerStartRestartGroup, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function7 = function6;
                f2 = f3;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(i, modifier3, primarySurface, jM1057contentColorForek8zF_U, f2, function7, function5, tabs, i2, i3));
        }
        i11 = 12582912;
        i4 |= i11;
        if ((23967451 & i4) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i14 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i3 & 4) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable));
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                    i4 &= -7169;
                }
                if (i5 != 0) {
                    f3 = o0O00oO0.f51527OooO0o0;
                } else {
                    f3 = f2;
                }
                if (i7 != 0) {
                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1050084203, true, new OooO00o(i));
                } else {
                    function3ComposableLambda = function3;
                }
                if (i9 != 0) {
                    function4 = o00O00O.f51355OooO00o;
                } else {
                    function4 = function2;
                }
                function5 = function4;
                Function3<? super List<o0O00o00>, ? super Composer, ? super Integer, Unit> function1113 = function3ComposableLambda;
                i12 = i4;
                function6 = function1113;
            } else {
                if (i14 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i3 & 4) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable));
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                    i4 &= -7169;
                }
                if (i5 != 0) {
                    f3 = o0O00oO0.f51527OooO0o0;
                } else {
                    f3 = f2;
                }
                if (i7 != 0) {
                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1050084203, true, new OooO00o(i));
                } else {
                    function3ComposableLambda = function3;
                }
                if (i9 != 0) {
                    function4 = o00O00O.f51355OooO00o;
                } else {
                    function4 = function2;
                }
                function5 = function4;
                Function3<? super List<o0O00o00>, ? super Composer, ? super Integer, Unit> function1114 = function3ComposableLambda;
                i12 = i4;
                function6 = function1114;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-571933040, i12, -1, "com.yalla.yalla.ui.composable.common.ScrollableTabRow (ScrollableTabRow.kt:67)");
            }
            SurfaceKt.m1201SurfaceFjzlyU(modifier2, null, primarySurface, jM1057contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1118638900, true, new OooO0O0(f3, tabs, function5, i, function6, i12)), composerStartRestartGroup, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function7 = function6;
            f2 = f3;
            modifier3 = modifier2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i14 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i3 & 4) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable));
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                    i4 &= -7169;
                }
                if (i5 != 0) {
                    f3 = o0O00oO0.f51527OooO0o0;
                } else {
                    f3 = f2;
                }
                if (i7 != 0) {
                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1050084203, true, new OooO00o(i));
                } else {
                    function3ComposableLambda = function3;
                }
                if (i9 != 0) {
                    function4 = o00O00O.f51355OooO00o;
                } else {
                    function4 = function2;
                }
                function5 = function4;
                Function3<? super List<o0O00o00>, ? super Composer, ? super Integer, Unit> function1115 = function3ComposableLambda;
                i12 = i4;
                function6 = function1115;
            } else {
                if (i14 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i3 & 4) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable));
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                    i4 &= -7169;
                }
                if (i5 != 0) {
                    f3 = o0O00oO0.f51527OooO0o0;
                } else {
                    f3 = f2;
                }
                if (i7 != 0) {
                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1050084203, true, new OooO00o(i));
                } else {
                    function3ComposableLambda = function3;
                }
                if (i9 != 0) {
                    function4 = o00O00O.f51355OooO00o;
                } else {
                    function4 = function2;
                }
                function5 = function4;
                Function3<? super List<o0O00o00>, ? super Composer, ? super Integer, Unit> function1116 = function3ComposableLambda;
                i12 = i4;
                function6 = function1116;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-571933040, i12, -1, "com.yalla.yalla.ui.composable.common.ScrollableTabRow (ScrollableTabRow.kt:67)");
            }
            SurfaceKt.m1201SurfaceFjzlyU(modifier2, null, primarySurface, jM1057contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1118638900, true, new OooO0O0(f3, tabs, function5, i, function6, i12)), composerStartRestartGroup, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function7 = function6;
            f2 = f3;
            modifier3 = modifier2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(i, modifier3, primarySurface, jM1057contentColorForek8zF_U, f2, function7, function5, tabs, i2, i3));
    }
}
