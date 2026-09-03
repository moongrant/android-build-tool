package p543o0o0Ooo0;

import androidx.compose.animation.Oooo000;
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
import p193o00o0O0O.o0000oo;
import p415o0Oo0oO0.o00Ooo;
import p423o0OoO0OO.o00O00OO;
import p423o0OoO0OO.o00oOoo;
import p475o0Ooooo0.o0O00oO0;
import p476o0OooooO.o0OOo000;
import p562o0oOo000.o000000;
import p562o0oOo000.o0O0O00;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f55483OooO00o = ComposableLambdaKt.composableLambdaInstance(842414476, false, OooO00o.f55490OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f55484OooO0O0 = ComposableLambdaKt.composableLambdaInstance(-1227487035, false, OooO0O0.f55491OooO0Oo);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f55485OooO0OO = ComposableLambdaKt.composableLambdaInstance(-1825617516, false, OooO0OO.f55492OooO0Oo);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f55486OooO0Oo = ComposableLambdaKt.composableLambdaInstance(-878450573, false, OooO0o.f55493OooO0Oo);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f55488OooO0o0 = ComposableLambdaKt.composableLambdaInstance(542965575, false, OooO.f55489OooO0Oo);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f55487OooO0o = ComposableLambdaKt.composableLambdaInstance(-1535556562, false, OooOO0.f55494OooO0Oo);

    @SourceDebugExtension({"SMAP\nMyUserInfoScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyUserInfoScreen.kt\ncom/yalla/yalla/ui/screen/user/ComposableSingletons$MyUserInfoScreenKt$lambda-5$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1073:1\n81#2:1074\n*S KotlinDebug\n*F\n+ 1 MyUserInfoScreen.kt\ncom/yalla/yalla/ui/screen/user/ComposableSingletons$MyUserInfoScreenKt$lambda-5$1\n*L\n283#1:1074\n*E\n"})
    public static final class OooO extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f55489OooO0Oo = new OooO();

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
                    ComposerKt.traceEventStart(542965575, iIntValue, -1, "com.yalla.yalla.ui.screen.user.ComposableSingletons$MyUserInfoScreenKt.lambda-5.<anonymous> (MyUserInfoScreen.kt:282)");
                }
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                State stateObserveAsState = LiveDataAdapterKt.observeAsState(o0O00oO0.OooOO0o(), composer2, 8);
                Pair pair = (Pair) stateObserveAsState.getValue();
                if (pair != null) {
                    z = ((Boolean) pair.getFirst()).booleanValue();
                }
                if (z) {
                    composer2.startReplaceableGroup(-800133462);
                    oO0OO.OooO00o oooO00o = oO0OO.OooO00o.f59939OooO00o;
                    Pair pair2 = (Pair) stateObserveAsState.getValue();
                    Boolean bool = pair2 != null ? (Boolean) pair2.getFirst() : null;
                    Pair pair3 = (Pair) stateObserveAsState.getValue();
                    oO0OO.OooO00o.OooOOo(bool, pair3 != null ? (Integer) pair3.getSecond() : null, true, 0.0f, null, composer2, 262528, 24);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(-800133232);
                    TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.Join_Now, composer2, 0), (Modifier) null, o0000oo.OooO0OO(composer2).f38627OooOO0o, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
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
        public static final OooO00o f55490OooO0Oo = new OooO00o();

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
                    ComposerKt.traceEventStart(842414476, iIntValue, -1, "com.yalla.yalla.ui.screen.user.ComposableSingletons$MyUserInfoScreenKt.lambda-1.<anonymous> (MyUserInfoScreen.kt:115)");
                }
                MyUserInfoScreen.INSTANCE.OnScreen(composer2, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMyUserInfoScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyUserInfoScreen.kt\ncom/yalla/yalla/ui/screen/user/ComposableSingletons$MyUserInfoScreenKt$lambda-2$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1073:1\n72#2,6:1074\n78#2:1108\n72#2,6:1145\n78#2:1179\n82#2:1191\n82#2:1201\n78#3,11:1080\n78#3,11:1115\n78#3,11:1151\n91#3:1190\n91#3:1195\n91#3:1200\n456#4,8:1091\n464#4,3:1105\n456#4,8:1126\n464#4,3:1140\n456#4,8:1162\n464#4,3:1176\n467#4,3:1187\n467#4,3:1192\n467#4,3:1197\n4144#5,6:1099\n4144#5,6:1134\n4144#5,6:1170\n66#6,6:1109\n72#6:1143\n76#6:1196\n76#7:1144\n154#8:1180\n154#8:1181\n154#8:1182\n154#8:1183\n154#8:1184\n154#8:1185\n154#8:1186\n*S KotlinDebug\n*F\n+ 1 MyUserInfoScreen.kt\ncom/yalla/yalla/ui/screen/user/ComposableSingletons$MyUserInfoScreenKt$lambda-2$1\n*L\n140#1:1074,6\n140#1:1108\n154#1:1145,6\n154#1:1179\n154#1:1191\n140#1:1201\n140#1:1080,11\n145#1:1115,11\n154#1:1151,11\n154#1:1190\n145#1:1195\n140#1:1200\n140#1:1091,8\n140#1:1105,3\n145#1:1126,8\n145#1:1140,3\n154#1:1162,8\n154#1:1176,3\n154#1:1187,3\n145#1:1192,3\n140#1:1197,3\n140#1:1099,6\n145#1:1134,6\n154#1:1170,6\n145#1:1109,6\n145#1:1143\n145#1:1196\n146#1:1144\n155#1:1180\n157#1:1181\n159#1:1182\n161#1:1183\n163#1:1184\n165#1:1185\n167#1:1186\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f55491OooO0Oo = new OooO0O0();

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
                    ComposerKt.traceEventStart(-1227487035, iIntValue, -1, "com.yalla.yalla.ui.screen.user.ComposableSingletons$MyUserInfoScreenKt.lambda-2.<anonymous> (MyUserInfoScreen.kt:139)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                composer2.startReplaceableGroup(-483455358);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO0O0 = p022Oooo00O.o0O00oO0.OooO0O0(companion2, top, composer2, 0, -1323940314);
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
                Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer2, 0, -1323940314);
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
                Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer2);
                Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o, composerM1320constructorimpl2, currentCompositionLocalMap2);
                if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composer2.startReplaceableGroup(678162787);
                if (((Boolean) composer2.consume(o0000oo.f38633OooO00o)).booleanValue()) {
                    ImageKt.Image(PainterResources_androidKt.painterResource(o0O0O00.ic_my_info_bg_bottom, composer2, 0), (String) null, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composer2, 25016, 104);
                }
                composer2.endReplaceableGroup();
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO0O1 = p022Oooo00O.o0O00oO0.OooO0O0(companion2, arrangement.getTop(), composer2, 0, -1323940314);
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
                Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composer2);
                Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO0O1, composerM1320constructorimpl3, currentCompositionLocalMap3);
                if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                float f = 20;
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(f), null, composer2, 6, 2);
                oo000000.OooO(composer2, 0);
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(f), null, composer2, 6, 2);
                oo000000.OooO0oO(composer2, 0);
                float f2 = 8;
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(f2), null, composer2, 6, 2);
                oo000000.OooO0oo(composer2, 0);
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(f2), null, composer2, 6, 2);
                oo000000.OooOO0O(composer2, 0);
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(f2), null, composer2, 6, 2);
                oo000000.OooOO0(composer2, 0);
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(f2), null, composer2, 6, 2);
                oo000000.OooOO0o(composer2, 0);
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(16), null, composer2, 6, 2);
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

    @SourceDebugExtension({"SMAP\nMyUserInfoScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyUserInfoScreen.kt\ncom/yalla/yalla/ui/screen/user/ComposableSingletons$MyUserInfoScreenKt$lambda-3$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1073:1\n25#2:1074\n1097#3,6:1075\n154#4:1081\n*S KotlinDebug\n*F\n+ 1 MyUserInfoScreen.kt\ncom/yalla/yalla/ui/screen/user/ComposableSingletons$MyUserInfoScreenKt$lambda-3$1\n*L\n203#1:1074\n203#1:1075,6\n209#1:1081\n*E\n"})
    public static final class OooO0OO extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f55492OooO0Oo = new OooO0OO();

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
                    ComposerKt.traceEventStart(-1825617516, iIntValue, -1, "com.yalla.yalla.ui.screen.user.ComposableSingletons$MyUserInfoScreenKt.lambda-3.<anonymous> (MyUserInfoScreen.kt:201)");
                }
                composer2.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer2.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    if (com.code.android.util.o000000.OooO00o(Integer.valueOf(o00Ooo.OooO00o().OooO0OO("firstRecharge", 0)))) {
                        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                        if (o0OoOo0.OooO00o((Boolean) ((MutableLiveData) o0O00oO0.f47974Oooo0o0.getValue()).getValue())) {
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
                    ImageKt.Image(PainterResources_androidKt.painterResource(o0Oo0oo.ic_first_charge_side, composer2, 0), (String) null, com.code.android.util.o0O0O00.OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(24)), false, false, 0L, false, null, null, null, oOO0O0O.f55501OooO0Oo, 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMyUserInfoScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyUserInfoScreen.kt\ncom/yalla/yalla/ui/screen/user/ComposableSingletons$MyUserInfoScreenKt$lambda-4$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1073:1\n154#2:1074\n154#2:1075\n154#2:1083\n154#2:1084\n154#2:1085\n36#3:1076\n36#3:1086\n1097#4,6:1077\n1097#4,6:1087\n81#5:1093\n81#5:1094\n*S KotlinDebug\n*F\n+ 1 MyUserInfoScreen.kt\ncom/yalla/yalla/ui/screen/user/ComposableSingletons$MyUserInfoScreenKt$lambda-4$1\n*L\n229#1:1074\n231#1:1075\n241#1:1083\n245#1:1084\n247#1:1085\n233#1:1076\n249#1:1086\n233#1:1077,6\n249#1:1087,6\n232#1:1093\n248#1:1094\n*E\n"})
    public static final class OooO0o extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f55493OooO0Oo = new OooO0o();

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
                    ComposerKt.traceEventStart(-878450573, iIntValue, -1, "com.yalla.yalla.ui.screen.user.ComposableSingletons$MyUserInfoScreenKt.lambda-4.<anonymous> (MyUserInfoScreen.kt:225)");
                }
                Painter painterPainterResource = PainterResources_androidKt.painterResource(o0Oo0oo.icon_coin_main_slide, composer2, 0);
                Modifier.Companion companion = Modifier.INSTANCE;
                float f = 16;
                ImageKt.Image(painterPainterResource, (String) null, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
                float f2 = 4;
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f2), null, composer2, 6, 2);
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                State stateObserveAsState = LiveDataAdapterKt.observeAsState(o0O00oO0.OooO0O0(), 0L, composer2, 56);
                Long l = (Long) stateObserveAsState.getValue();
                composer2.startReplaceableGroup(1157296644);
                boolean zChanged = composer2.changed(l);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Long l2 = (Long) stateObserveAsState.getValue();
                    Intrinsics.checkNotNullExpressionValue(l2, "access$invoke$lambda$0(...)");
                    if (l2.longValue() < 10000) {
                        strOooO0O0 = o00O00OO.OooO0O0(String.valueOf((Long) stateObserveAsState.getValue()));
                    } else {
                        Long l3 = (Long) stateObserveAsState.getValue();
                        Intrinsics.checkNotNullExpressionValue(l3, "access$invoke$lambda$0(...)");
                        strOooO0O0 = o00oOoo.OooO0O0(l3.longValue());
                    }
                    objRememberedValue = strOooO0O0;
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                TextKt.m1261Text4IGK_g((String) objRememberedValue, (Modifier) null, o0OOo000.f48213o0000OO0, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f), null, composer2, 6, 2);
                ImageKt.Image(PainterResources_androidKt.painterResource(o0Oo0oo.icon_crystal_main_slide, composer2, 0), (String) null, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f2), null, composer2, 6, 2);
                State stateObserveAsState2 = LiveDataAdapterKt.observeAsState(o0O00oO0.OooO0Oo(), 0L, composer2, 56);
                Long l4 = (Long) stateObserveAsState2.getValue();
                composer2.startReplaceableGroup(1157296644);
                boolean zChanged2 = composer2.changed(l4);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Long l5 = (Long) stateObserveAsState2.getValue();
                    Intrinsics.checkNotNullExpressionValue(l5, "access$invoke$lambda$2(...)");
                    if (l5.longValue() < 10000) {
                        strOooO0O1 = o00O00OO.OooO0O0(String.valueOf((Long) stateObserveAsState2.getValue()));
                    } else {
                        Long l6 = (Long) stateObserveAsState2.getValue();
                        Intrinsics.checkNotNullExpressionValue(l6, "access$invoke$lambda$2(...)");
                        strOooO0O1 = o00oOoo.OooO0O0(l6.longValue());
                    }
                    objRememberedValue2 = strOooO0O1;
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                TextKt.m1261Text4IGK_g((String) objRememberedValue2, (Modifier) null, o0OOo000.f48236o000O0O, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMyUserInfoScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyUserInfoScreen.kt\ncom/yalla/yalla/ui/screen/user/ComposableSingletons$MyUserInfoScreenKt$lambda-6$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1073:1\n81#2:1074\n*S KotlinDebug\n*F\n+ 1 MyUserInfoScreen.kt\ncom/yalla/yalla/ui/screen/user/ComposableSingletons$MyUserInfoScreenKt$lambda-6$1\n*L\n343#1:1074\n*E\n"})
    public static final class OooOO0 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f55494OooO0Oo = new OooOO0();

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
                    ComposerKt.traceEventStart(-1535556562, iIntValue, -1, "com.yalla.yalla.ui.screen.user.ComposableSingletons$MyUserInfoScreenKt.lambda-6.<anonymous> (MyUserInfoScreen.kt:342)");
                }
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                State stateObserveAsState = LiveDataAdapterKt.observeAsState(o0O00oO0.OooOOO0(), composer2, 8);
                MyUserInfoScreen myUserInfoScreen = MyUserInfoScreen.INSTANCE;
                if (myUserInfoScreen.getLanguageMap().containsKey((Integer) stateObserveAsState.getValue())) {
                    Integer num2 = myUserInfoScreen.getLanguageMap().get((Integer) stateObserveAsState.getValue());
                    Intrinsics.checkNotNull(num2);
                    TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(num2.intValue(), composer2, 0), (Modifier) null, o0000oo.OooO0OO(composer2).f38627OooOO0o, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }
}
