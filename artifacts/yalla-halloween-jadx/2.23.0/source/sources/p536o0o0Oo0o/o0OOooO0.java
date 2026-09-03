package p536o0o0Oo0o;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.MutableLiveData;
import com.code.android.util.o000000;
import com.code.android.util.o0O0O00;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.ui.screen.user.MyUserInfoScreen;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p018OooOoo0.OooOOO;
import p147o00Oo0Oo.o000OOo;
import p408o0Oo0o0O.o00Oo0;
import p417o0OoO0.o00000OO;
import p417o0OoO0.o0000O0O;
import p464o0Oooo.o000000O;
import p469o0OoooOO.o0oO0O0o;
import p517o0o0O0o.OooOOOO;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOooO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f55053OooO00o = ComposableLambdaKt.composableLambdaInstance(842414476, false, OooO00o.f55061OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f55054OooO0O0 = ComposableLambdaKt.composableLambdaInstance(-1227487035, false, OooO0O0.f55062OooO0Oo);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f55055OooO0OO = ComposableLambdaKt.composableLambdaInstance(-1825617516, false, OooO0OO.f55063OooO0Oo);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f55056OooO0Oo = ComposableLambdaKt.composableLambdaInstance(-878450573, false, OooO0o.f55064OooO0Oo);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f55058OooO0o0 = ComposableLambdaKt.composableLambdaInstance(542965575, false, OooO.f55060OooO0Oo);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f55057OooO0o = ComposableLambdaKt.composableLambdaInstance(-1535556562, false, OooOO0.f55065OooO0Oo);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f55059OooO0oO = ComposableLambdaKt.composableLambdaInstance(-1102558858, false, OooOO0O.f55066OooO0Oo);

    @SourceDebugExtension({"SMAP\nMyUserInfoScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyUserInfoScreen.kt\ncom/yalla/yalla/ui/screen/user/ComposableSingletons$MyUserInfoScreenKt$lambda-5$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1071:1\n81#2:1072\n*S KotlinDebug\n*F\n+ 1 MyUserInfoScreen.kt\ncom/yalla/yalla/ui/screen/user/ComposableSingletons$MyUserInfoScreenKt$lambda-5$1\n*L\n282#1:1072\n*E\n"})
    public static final class OooO extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f55060OooO0Oo = new OooO();

        public OooO() {
            super(3);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0059  */
        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            boolean z;
            RowScope MyInfoItem = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(MyInfoItem, "$this$MyInfoItem");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(542965575, iIntValue, -1, "com.yalla.yalla.ui.screen.user.ComposableSingletons$MyUserInfoScreenKt.lambda-5.<anonymous> (MyUserInfoScreen.kt:280)");
                }
                o000000O o000000o2 = o000000O.f46674OooO00o;
                State stateObserveAsState = LiveDataAdapterKt.observeAsState(o000000O.OooOO0o(), composer2, 8);
                Pair pair = (Pair) stateObserveAsState.getValue();
                if (pair != null) {
                    z = ((Boolean) pair.getFirst()).booleanValue();
                }
                if (z) {
                    composer2.startReplaceableGroup(-800133524);
                    OooOOOO oooOOOO = OooOOOO.f51970OooO00o;
                    Pair pair2 = (Pair) stateObserveAsState.getValue();
                    Boolean bool = pair2 != null ? (Boolean) pair2.getFirst() : null;
                    Pair pair3 = (Pair) stateObserveAsState.getValue();
                    OooOOOO.OooOOo(bool, pair3 != null ? (Integer) pair3.getSecond() : null, true, 0.0f, null, composer2, 262528, 24);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(-800133294);
                    TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.Join_Now, composer2, 0), (Modifier) null, o000OOo.OooO0OO(composer2).f37712OooOO0o, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                    composer2.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f55061OooO0Oo = new OooO00o();

        public OooO00o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(842414476, iIntValue, -1, "com.yalla.yalla.ui.screen.user.ComposableSingletons$MyUserInfoScreenKt.lambda-1.<anonymous> (MyUserInfoScreen.kt:113)");
                }
                MyUserInfoScreen.INSTANCE.OnScreen(composer2, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMyUserInfoScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyUserInfoScreen.kt\ncom/yalla/yalla/ui/screen/user/ComposableSingletons$MyUserInfoScreenKt$lambda-2$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1071:1\n72#2,6:1072\n78#2:1106\n72#2,6:1143\n78#2:1177\n82#2:1189\n82#2:1199\n78#3,11:1078\n78#3,11:1113\n78#3,11:1149\n91#3:1188\n91#3:1193\n91#3:1198\n456#4,8:1089\n464#4,3:1103\n456#4,8:1124\n464#4,3:1138\n456#4,8:1160\n464#4,3:1174\n467#4,3:1185\n467#4,3:1190\n467#4,3:1195\n4144#5,6:1097\n4144#5,6:1132\n4144#5,6:1168\n66#6,6:1107\n72#6:1141\n76#6:1194\n76#7:1142\n154#8:1178\n154#8:1179\n154#8:1180\n154#8:1181\n154#8:1182\n154#8:1183\n154#8:1184\n*S KotlinDebug\n*F\n+ 1 MyUserInfoScreen.kt\ncom/yalla/yalla/ui/screen/user/ComposableSingletons$MyUserInfoScreenKt$lambda-2$1\n*L\n139#1:1072,6\n139#1:1106\n153#1:1143,6\n153#1:1177\n153#1:1189\n139#1:1199\n139#1:1078,11\n144#1:1113,11\n153#1:1149,11\n153#1:1188\n144#1:1193\n139#1:1198\n139#1:1089,8\n139#1:1103,3\n144#1:1124,8\n144#1:1138,3\n153#1:1160,8\n153#1:1174,3\n153#1:1185,3\n144#1:1190,3\n139#1:1195,3\n139#1:1097,6\n144#1:1132,6\n153#1:1168,6\n144#1:1107,6\n144#1:1141\n144#1:1194\n145#1:1142\n154#1:1178\n156#1:1179\n158#1:1180\n160#1:1181\n162#1:1182\n164#1:1183\n166#1:1184\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f55062OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1227487035, iIntValue, -1, "com.yalla.yalla.ui.screen.user.ComposableSingletons$MyUserInfoScreenKt.lambda-2.<anonymous> (MyUserInfoScreen.kt:137)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                composer2.startReplaceableGroup(-483455358);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(companion2, top, composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierVerticalScroll$default);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o2 = OooOOO.OooO00o(companion2, false, composer2, 0, -1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer2);
                Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
                if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composer2.startReplaceableGroup(678162725);
                if (((Boolean) composer2.consume(o000OOo.f37692OooO00o)).booleanValue()) {
                    ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_my_info_bg_bottom, composer2, 0), (String) null, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composer2, 25016, 104);
                }
                composer2.endReplaceableGroup();
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO00o3 = androidx.compose.material.OooO0o.OooO00o(companion2, arrangement.getTop(), composer2, 0, -1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default2);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composer2);
                Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyOooO00o3, composerM1309constructorimpl3, currentCompositionLocalMap3);
                if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                float f = 20;
                com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(f), null, composer2, 6, 2);
                oO000O0.OooO(composer2, 0);
                com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(f), null, composer2, 6, 2);
                oO000O0.OooO0oO(composer2, 0);
                float f2 = 8;
                com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(f2), null, composer2, 6, 2);
                oO000O0.OooO0oo(composer2, 0);
                com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(f2), null, composer2, 6, 2);
                oO000O0.OooOO0O(composer2, 0);
                com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(f2), null, composer2, 6, 2);
                oO000O0.OooOO0(composer2, 0);
                com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(f2), null, composer2, 6, 2);
                oO000O0.OooOO0o(composer2, 0);
                com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(16), null, composer2, 6, 2);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMyUserInfoScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyUserInfoScreen.kt\ncom/yalla/yalla/ui/screen/user/ComposableSingletons$MyUserInfoScreenKt$lambda-3$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1071:1\n25#2:1072\n1097#3,6:1073\n154#4:1079\n*S KotlinDebug\n*F\n+ 1 MyUserInfoScreen.kt\ncom/yalla/yalla/ui/screen/user/ComposableSingletons$MyUserInfoScreenKt$lambda-3$1\n*L\n202#1:1072\n202#1:1073,6\n208#1:1079\n*E\n"})
    public static final class OooO0OO extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f55063OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(3);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0075  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            boolean z;
            RowScope MyInfoItem = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(MyInfoItem, "$this$MyInfoItem");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1825617516, iIntValue, -1, "com.yalla.yalla.ui.screen.user.ComposableSingletons$MyUserInfoScreenKt.lambda-3.<anonymous> (MyUserInfoScreen.kt:199)");
                }
                composer2.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer2.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    if (o000000.OooO00o(Integer.valueOf(o00Oo0.OooO00o().OooO0OO("firstRecharge", 0)))) {
                        o000000O o000000o2 = o000000O.f46674OooO00o;
                        if (o0OoOo0.OooO00o((Boolean) ((MutableLiveData) o000000O.f46712Oooo0o0.getValue()).getValue())) {
                            z = false;
                        } else {
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                    objRememberedValue = Boolean.valueOf(z);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                if (((Boolean) objRememberedValue).booleanValue()) {
                    ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.ic_first_charge_side, composer2, 0), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(24)), false, false, 0L, false, null, null, null, o0OO0o.f54984OooO0Oo, 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMyUserInfoScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyUserInfoScreen.kt\ncom/yalla/yalla/ui/screen/user/ComposableSingletons$MyUserInfoScreenKt$lambda-4$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1071:1\n154#2:1072\n154#2:1073\n154#2:1081\n154#2:1082\n154#2:1083\n36#3:1074\n36#3:1084\n1097#4,6:1075\n1097#4,6:1085\n81#5:1091\n81#5:1092\n*S KotlinDebug\n*F\n+ 1 MyUserInfoScreen.kt\ncom/yalla/yalla/ui/screen/user/ComposableSingletons$MyUserInfoScreenKt$lambda-4$1\n*L\n228#1:1072\n230#1:1073\n240#1:1081\n244#1:1082\n246#1:1083\n232#1:1074\n248#1:1084\n232#1:1075,6\n248#1:1085,6\n231#1:1091\n247#1:1092\n*E\n"})
    public static final class OooO0o extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f55064OooO0Oo = new OooO0o();

        public OooO0o() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            String strOooO0O0;
            String strOooO0O1;
            RowScope MyInfoItem = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(MyInfoItem, "$this$MyInfoItem");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-878450573, iIntValue, -1, "com.yalla.yalla.ui.screen.user.ComposableSingletons$MyUserInfoScreenKt.lambda-4.<anonymous> (MyUserInfoScreen.kt:223)");
                }
                Painter painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.icon_coin_main_slide, composer2, 0);
                Modifier.Companion companion = Modifier.INSTANCE;
                float f = 16;
                ImageKt.Image(painterPainterResource, (String) null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(f)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
                float f2 = 4;
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f2), null, composer2, 6, 2);
                o000000O o000000o2 = o000000O.f46674OooO00o;
                State stateObserveAsState = LiveDataAdapterKt.observeAsState(o000000O.OooO0O0(), 0L, composer2, 56);
                Long l = (Long) stateObserveAsState.getValue();
                composer2.startReplaceableGroup(1157296644);
                boolean zChanged = composer2.changed(l);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Long coin = (Long) stateObserveAsState.getValue();
                    Intrinsics.checkNotNullExpressionValue(coin, "coin");
                    if (coin.longValue() < 10000) {
                        strOooO0O0 = o0000O0O.OooO0O0(String.valueOf((Long) stateObserveAsState.getValue()));
                    } else {
                        Long coin2 = (Long) stateObserveAsState.getValue();
                        Intrinsics.checkNotNullExpressionValue(coin2, "coin");
                        strOooO0O0 = o00000OO.OooO0O0(coin2.longValue());
                    }
                    objRememberedValue = strOooO0O0;
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                TextKt.m1251Text4IGK_g((String) objRememberedValue, (Modifier) null, o0oO0O0o.f47022o0000O0O, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f), null, composer2, 6, 2);
                ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.icon_crystal_main_slide, composer2, 0), (String) null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(f)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f2), null, composer2, 6, 2);
                State stateObserveAsState2 = LiveDataAdapterKt.observeAsState(o000000O.OooO0Oo(), 0L, composer2, 56);
                Long l2 = (Long) stateObserveAsState2.getValue();
                composer2.startReplaceableGroup(1157296644);
                boolean zChanged2 = composer2.changed(l2);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Long crystal = (Long) stateObserveAsState2.getValue();
                    Intrinsics.checkNotNullExpressionValue(crystal, "crystal");
                    if (crystal.longValue() < 10000) {
                        strOooO0O1 = o0000O0O.OooO0O0(String.valueOf((Long) stateObserveAsState2.getValue()));
                    } else {
                        Long crystal2 = (Long) stateObserveAsState2.getValue();
                        Intrinsics.checkNotNullExpressionValue(crystal2, "crystal");
                        strOooO0O1 = o00000OO.OooO0O0(crystal2.longValue());
                    }
                    objRememberedValue2 = strOooO0O1;
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                TextKt.m1251Text4IGK_g((String) objRememberedValue2, (Modifier) null, o0oO0O0o.f47067o000OoO, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMyUserInfoScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyUserInfoScreen.kt\ncom/yalla/yalla/ui/screen/user/ComposableSingletons$MyUserInfoScreenKt$lambda-6$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1071:1\n81#2:1072\n*S KotlinDebug\n*F\n+ 1 MyUserInfoScreen.kt\ncom/yalla/yalla/ui/screen/user/ComposableSingletons$MyUserInfoScreenKt$lambda-6$1\n*L\n342#1:1072\n*E\n"})
    public static final class OooOO0 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f55065OooO0Oo = new OooOO0();

        public OooOO0() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope MyInfoItem = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(MyInfoItem, "$this$MyInfoItem");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1535556562, iIntValue, -1, "com.yalla.yalla.ui.screen.user.ComposableSingletons$MyUserInfoScreenKt.lambda-6.<anonymous> (MyUserInfoScreen.kt:340)");
                }
                o000000O o000000o2 = o000000O.f46674OooO00o;
                State stateObserveAsState = LiveDataAdapterKt.observeAsState(o000000O.OooOOO0(), composer2, 8);
                MyUserInfoScreen myUserInfoScreen = MyUserInfoScreen.INSTANCE;
                if (myUserInfoScreen.getLanguageMap().containsKey((Integer) stateObserveAsState.getValue())) {
                    Integer num2 = myUserInfoScreen.getLanguageMap().get((Integer) stateObserveAsState.getValue());
                    Intrinsics.checkNotNull(num2);
                    TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(num2.intValue(), composer2, 0), (Modifier) null, o000OOo.OooO0OO(composer2).f37712OooOO0o, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMyUserInfoScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyUserInfoScreen.kt\ncom/yalla/yalla/ui/screen/user/ComposableSingletons$MyUserInfoScreenKt$lambda-7$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1071:1\n154#2:1072\n154#2:1073\n81#3:1074\n*S KotlinDebug\n*F\n+ 1 MyUserInfoScreen.kt\ncom/yalla/yalla/ui/screen/user/ComposableSingletons$MyUserInfoScreenKt$lambda-7$1\n*L\n399#1:1072\n401#1:1073\n394#1:1074\n*E\n"})
    public static final class OooOO0O extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0O f55066OooO0Oo = new OooOO0O();

        public OooOO0O() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope MyInfoItem = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(MyInfoItem, "$this$MyInfoItem");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1102558858, iIntValue, -1, "com.yalla.yalla.ui.screen.user.ComposableSingletons$MyUserInfoScreenKt.lambda-7.<anonymous> (MyUserInfoScreen.kt:392)");
                }
                o000000O o000000o2 = o000000O.f46674OooO00o;
                if (Intrinsics.areEqual((Boolean) LiveDataAdapterKt.observeAsState(o000000O.OooOo0(), composer2, 8).getValue(), Boolean.FALSE) && o000000O.OooOoO0()) {
                    ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.main_unprotected, composer2, 0), (String) null, SizeKt.m523size3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(16)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(4), null, composer2, 6, 2);
                    TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.Unprotected, composer2, 0), (Modifier) null, o0oO0O0o.f47081o000o0Oo, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }
}
