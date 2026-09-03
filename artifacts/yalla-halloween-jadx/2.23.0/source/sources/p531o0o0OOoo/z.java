package p531o0o0OOoo;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOo00;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OooOO0O;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.OooO00o;
import androidx.compose.material.DividerKt;
import androidx.compose.material.OooO0o;
import androidx.compose.material.OooOOO0;
import androidx.compose.material.TabRowKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.LocalSoftwareKeyboardController;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.util.o000000;
import com.code.android.util.o0000O;
import com.code.android.util.o0O0O00;
import com.google.accompanist.pager.Pager;
import com.yalla.yalla.model.room.RoomUserRecordModel;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import net.sqlcipher.database.SQLiteDatabase;
import org.conscrypt.PSKKeyManager;
import p018OooOoo0.OooOOO;
import p147o00Oo0Oo.o000OOo;
import p153o00OoO0.OooOO0;
import p184o00o00o.Oooo000;
import p186o00o00oO.o00O00o0;
import p426o0OoOO.o000oOoO;
import p445o0OoOoo.o0oOO;
import p464o0Oooo.o000000O;
import p469o0OoooOO.o0oO0O0o;
import p507o0o00ooo.j1;
import p507o0o00ooo.t1;
import p517o0o0O0o.OooOOOO;
import p577o0oOoOoO.oOO00;
import p584o0oOooO0.oO00OOo0;
import p601o0oo0O0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomUserActionRecordScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomUserActionRecordScreen.kt\ncom/yalla/yalla/ui/screen/room/RoomUserActionRecordScreenKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 12 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 13 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 14 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,318:1\n72#2,6:319\n78#2:353\n82#2:399\n73#2,5:482\n78#2:515\n82#2:583\n72#2,6:586\n78#2:620\n82#2:675\n78#3,11:325\n91#3:398\n78#3,11:407\n78#3,11:449\n78#3,11:487\n78#3,11:523\n91#3:576\n91#3:582\n78#3,11:592\n78#3,11:637\n91#3:669\n91#3:674\n91#3:679\n91#3:695\n456#4,8:336\n464#4,3:350\n25#4:369\n25#4:380\n36#4:387\n467#4,3:395\n456#4,8:418\n464#4,3:432\n36#4:436\n456#4,8:460\n464#4,3:474\n456#4,8:498\n464#4,3:512\n456#4,8:534\n464#4,3:548\n467#4,3:573\n467#4,3:579\n456#4,8:603\n464#4,3:617\n36#4:621\n456#4,8:648\n464#4,3:662\n467#4,3:666\n467#4,3:671\n467#4,3:676\n467#4,3:692\n4144#5,6:344\n4144#5,6:426\n4144#5,6:468\n4144#5,6:506\n4144#5,6:542\n4144#5,6:611\n4144#5,6:656\n81#6,11:354\n486#7,4:365\n490#7,2:373\n494#7:379\n1097#8,3:370\n1100#8,3:376\n1097#8,6:381\n1097#8,6:388\n1097#8,6:437\n1097#8,6:622\n486#9:375\n164#10:394\n154#10:400\n154#10:478\n154#10:479\n154#10:480\n154#10:481\n154#10:571\n154#10:572\n154#10:578\n154#10:584\n154#10:585\n154#10:628\n154#10:629\n154#10:630\n154#10:631\n154#10,11:681\n66#11,6:401\n72#11:435\n67#11,5:632\n72#11:665\n76#11:670\n76#11:696\n73#12,6:443\n79#12:477\n72#12,7:516\n79#12:551\n83#12:577\n83#12:680\n1098#13:552\n927#13,6:553\n927#13,6:559\n927#13,6:565\n81#14:697\n107#14,2:698\n*S KotlinDebug\n*F\n+ 1 RoomUserActionRecordScreen.kt\ncom/yalla/yalla/ui/screen/room/RoomUserActionRecordScreenKt\n*L\n68#1:319,6\n68#1:353\n68#1:399\n211#1:482,5\n211#1:515\n211#1:583\n287#1:586,6\n287#1:620\n287#1:675\n68#1:325,11\n68#1:398\n190#1:407,11\n195#1:449,11\n211#1:487,11\n217#1:523,11\n217#1:576\n211#1:582\n287#1:592,11\n297#1:637,11\n297#1:669\n287#1:674\n195#1:679\n190#1:695\n68#1:336,8\n68#1:350,3\n75#1:369\n76#1:380\n80#1:387\n68#1:395,3\n190#1:418,8\n190#1:432,3\n199#1:436\n195#1:460,8\n195#1:474,3\n211#1:498,8\n211#1:512,3\n217#1:534,8\n217#1:548,3\n217#1:573,3\n211#1:579,3\n287#1:603,8\n287#1:617,3\n293#1:621\n297#1:648,8\n297#1:662,3\n297#1:666,3\n287#1:671,3\n195#1:676,3\n190#1:692,3\n68#1:344,6\n190#1:426,6\n195#1:468,6\n211#1:506,6\n217#1:542,6\n287#1:611,6\n297#1:656,6\n74#1:354,11\n75#1:365,4\n75#1:373,2\n75#1:379\n75#1:370,3\n75#1:376,3\n76#1:381,6\n80#1:388,6\n199#1:437,6\n293#1:622,6\n75#1:375\n152#1:394\n193#1:400\n205#1:478\n208#1:479\n209#1:480\n214#1:481\n253#1:571\n254#1:572\n261#1:578\n290#1:584\n291#1:585\n295#1:628\n301#1:629\n302#1:630\n303#1:631\n312#1:681,11\n190#1:401,6\n190#1:435\n297#1:632,5\n297#1:665\n297#1:670\n190#1:696\n195#1:443,6\n195#1:477\n217#1:516,7\n217#1:551\n217#1:577\n195#1:680\n219#1:552\n227#1:553,6\n233#1:559,6\n238#1:565,6\n76#1:697\n76#1:698,2\n*E\n"})
public final class z {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooO00o(RoomUserRecordModel roomUserRecordModel, String str, int i, Composer composer, int i2) {
        int i3;
        String strOooO00o;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(238358566);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(roomUserRecordModel) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i3 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(238358566, i3, -1, "com.yalla.yalla.ui.screen.room.OperationRecordItem (RoomUserActionRecordScreen.kt:188)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierOooO00o = OooOO0.OooO00o(70, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), composerStartRestartGroup, 733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO00o);
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
            Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(roomUserRecordModel);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new h(roomUserRecordModel);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(modifierFillMaxSize$default, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 255);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o2 = OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
            if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            OooOOOO oooOOOO = OooOOOO.f51970OooO00o;
            float f = 16;
            oooOOOO.OooOO0(roomUserRecordModel.getHeadUrl(), SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3765constructorimpl(40)), Dp.m3765constructorimpl(1), Color.m1660boximpl(o0oO0O0o.f47044o000O00), false, composerStartRestartGroup, 262576, 16);
            Arrangement.HorizontalOrVertical center = arrangement.getCenter();
            Modifier modifierOooO00o2 = OooOO0O.OooO00o(rowScopeInstance, PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(10), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false, 2, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o3 = o00O00o0.OooO00o(companion2, center, composerStartRestartGroup, 6, -1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOooO00o2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o3 = OooO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyOooO00o3, composerM1309constructorimpl3, currentCompositionLocalMap3);
            if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o4 = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically2, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl4 = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o4 = OooO.OooO00o(companion3, composerM1309constructorimpl4, measurePolicyOooO00o4, composerM1309constructorimpl4, currentCompositionLocalMap4);
            if (composerM1309constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                OooO0O0.OooO00o(currentCompositeKeyHash4, composerM1309constructorimpl4, currentCompositeKeyHash4, function2OooO00o4);
            }
            function3ModifierMaterializerOf4.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-1100220632);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            if (StringsKt.isBlank(str)) {
                builder.append(roomUserRecordModel.getNickName());
            } else {
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) roomUserRecordModel.getNickName(), str, 0, true, 2, (Object) null);
                if (iIndexOf$default < 0) {
                    composerStartRestartGroup.startReplaceableGroup(1539956487);
                    composerStartRestartGroup.endReplaceableGroup();
                    builder.append(roomUserRecordModel.getNickName());
                } else if (iIndexOf$default == 0) {
                    composerStartRestartGroup.startReplaceableGroup(1539956614);
                    int iPushStyle = builder.pushStyle(new SpanStyle(o000OOo.OooO0OO(composerStartRestartGroup).f37702OooO00o, TextUnitKt.getSp(16), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65532, (DefaultConstructorMarker) null));
                    try {
                        String strSubstring = roomUserRecordModel.getNickName().substring(0, str.length());
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        builder.append(strSubstring);
                        Unit unit = Unit.INSTANCE;
                        builder.pop(iPushStyle);
                        String strSubstring2 = roomUserRecordModel.getNickName().substring(str.length(), roomUserRecordModel.getNickName().length());
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        builder.append(strSubstring2);
                        composerStartRestartGroup.endReplaceableGroup();
                    } catch (Throwable th) {
                        builder.pop(iPushStyle);
                        throw th;
                    }
                } else if (iIndexOf$default == roomUserRecordModel.getNickName().length() - str.length()) {
                    composerStartRestartGroup.startReplaceableGroup(1539957054);
                    String strSubstring3 = roomUserRecordModel.getNickName().substring(0, roomUserRecordModel.getNickName().length() - str.length());
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    builder.append(strSubstring3);
                    int iPushStyle2 = builder.pushStyle(new SpanStyle(o000OOo.OooO0OO(composerStartRestartGroup).f37702OooO00o, TextUnitKt.getSp(16), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65532, (DefaultConstructorMarker) null));
                    try {
                        String strSubstring4 = roomUserRecordModel.getNickName().substring(iIndexOf$default, roomUserRecordModel.getNickName().length());
                        Intrinsics.checkNotNullExpressionValue(strSubstring4, "this as java.lang.String…ing(startIndex, endIndex)");
                        builder.append(strSubstring4);
                        Unit unit2 = Unit.INSTANCE;
                        builder.pop(iPushStyle2);
                        composerStartRestartGroup.endReplaceableGroup();
                    } catch (Throwable th2) {
                        builder.pop(iPushStyle2);
                        throw th2;
                    }
                } else {
                    composerStartRestartGroup.startReplaceableGroup(1539957450);
                    String strSubstring5 = roomUserRecordModel.getNickName().substring(0, iIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(strSubstring5, "this as java.lang.String…ing(startIndex, endIndex)");
                    builder.append(strSubstring5);
                    int iPushStyle3 = builder.pushStyle(new SpanStyle(o000OOo.OooO0OO(composerStartRestartGroup).f37702OooO00o, TextUnitKt.getSp(16), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65532, (DefaultConstructorMarker) null));
                    try {
                        String strSubstring6 = roomUserRecordModel.getNickName().substring(iIndexOf$default, str.length() + iIndexOf$default);
                        Intrinsics.checkNotNullExpressionValue(strSubstring6, "this as java.lang.String…ing(startIndex, endIndex)");
                        builder.append(strSubstring6);
                        Unit unit3 = Unit.INSTANCE;
                        builder.pop(iPushStyle3);
                        String strSubstring7 = roomUserRecordModel.getNickName().substring(str.length() + iIndexOf$default, roomUserRecordModel.getNickName().length());
                        Intrinsics.checkNotNullExpressionValue(strSubstring7, "this as java.lang.String…ing(startIndex, endIndex)");
                        builder.append(strSubstring7);
                        composerStartRestartGroup.endReplaceableGroup();
                    } catch (Throwable th3) {
                        builder.pop(iPushStyle3);
                        throw th3;
                    }
                }
            }
            builder.toAnnotatedString();
            AnnotatedString annotatedString = builder.toAnnotatedString();
            composerStartRestartGroup.endReplaceableGroup();
            long sp = TextUnitKt.getSp(16);
            long j = o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
            TextOverflow.Companion companion4 = TextOverflow.INSTANCE;
            TextKt.m1252TextIbK3jfQ(annotatedString, rowScopeInstance.weight(companion, 1.0f, false), j, sp, null, null, null, 0L, null, null, 0L, companion4.m3719getEllipsisgIe3tQ8(), false, 1, 0, null, null, null, composerStartRestartGroup, 3072, 3120, 251888);
            float f2 = 5;
            oooOOOO.OooO0oO(Integer.valueOf(roomUserRecordModel.getSex()), PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(f2), 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 560, 0);
            OooOOOO.OooOo0(null, Integer.valueOf(roomUserRecordModel.getKaVipLv()), null, 0.0f, PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(f2), 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 286720, 13);
            OooOOOO.OooOOo(Boolean.valueOf(o000000.OooO00o(Integer.valueOf(roomUserRecordModel.isVip()))), Integer.valueOf(roomUserRecordModel.getNvipLv()), false, 0.0f, null, composerStartRestartGroup, 262144, 28);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(f2), null, composerStartRestartGroup, 6, 2);
            int type = roomUserRecordModel.getType();
            if (type == 1) {
                composerStartRestartGroup.startReplaceableGroup(89780717);
                long execUserId = roomUserRecordModel.getExecUserId();
                o000000O o000000o2 = o000000O.f46674OooO00o;
                Long l = (Long) o000000O.OooOOo0().getValue();
                if (l != null && execUserId == l.longValue()) {
                    composerStartRestartGroup.startReplaceableGroup(89780762);
                    strOooO00o = StringResources_androidKt.stringResource(oO00OOo0.By_you, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(89780859);
                    strOooO00o = o0000O.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.By_Admin_x, composerStartRestartGroup, 0), roomUserRecordModel.getExecUserName());
                    composerStartRestartGroup.endReplaceableGroup();
                }
                composerStartRestartGroup.endReplaceableGroup();
            } else if (type == 2) {
                composerStartRestartGroup.startReplaceableGroup(89780916);
                long execUserId2 = roomUserRecordModel.getExecUserId();
                o000000O o000000o3 = o000000O.f46674OooO00o;
                Long l2 = (Long) o000000O.OooOOo0().getValue();
                if (l2 != null && execUserId2 == l2.longValue()) {
                    composerStartRestartGroup.startReplaceableGroup(89780991);
                    strOooO00o = StringResources_androidKt.stringResource(oO00OOo0.Banned_by_you, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(89781103);
                    strOooO00o = o0000O.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.Ban_by_Admin_x, composerStartRestartGroup, 0), roomUserRecordModel.getExecUserName());
                    composerStartRestartGroup.endReplaceableGroup();
                }
                composerStartRestartGroup.endReplaceableGroup();
            } else if (type == 3) {
                composerStartRestartGroup.startReplaceableGroup(89781186);
                long execUserId3 = roomUserRecordModel.getExecUserId();
                o000000O o000000o4 = o000000O.f46674OooO00o;
                Long l3 = (Long) o000000O.OooOOo0().getValue();
                if (l3 != null && execUserId3 == l3.longValue()) {
                    composerStartRestartGroup.startReplaceableGroup(89781261);
                    strOooO00o = StringResources_androidKt.stringResource(oO00OOo0.Unbanned_by_you, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(89781380);
                    strOooO00o = o0000O.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.Unbanned_by_Admin_x, composerStartRestartGroup, 0), roomUserRecordModel.getExecUserName());
                    composerStartRestartGroup.endReplaceableGroup();
                }
                composerStartRestartGroup.endReplaceableGroup();
            } else if (type != 4) {
                composerStartRestartGroup.startReplaceableGroup(-1511733821);
                composerStartRestartGroup.endReplaceableGroup();
                strOooO00o = "";
            } else {
                composerStartRestartGroup.startReplaceableGroup(89781463);
                long execUserId4 = roomUserRecordModel.getExecUserId();
                o000000O o000000o5 = o000000O.f46674OooO00o;
                Long l4 = (Long) o000000O.OooOOo0().getValue();
                if (l4 != null && execUserId4 == l4.longValue()) {
                    composerStartRestartGroup.startReplaceableGroup(89781538);
                    strOooO00o = StringResources_androidKt.stringResource(oO00OOo0.By_you, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(89781639);
                    strOooO00o = o0000O.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.By_Admin_x, composerStartRestartGroup, 0), roomUserRecordModel.getExecUserName());
                    composerStartRestartGroup.endReplaceableGroup();
                }
                composerStartRestartGroup.endReplaceableGroup();
            }
            TextKt.m1251Text4IGK_g(strOooO00o, (Modifier) null, o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion4.m3719getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 3120, 120818);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Alignment.Horizontal end = companion2.getEnd();
            Modifier modifierOooO00o3 = OooOO0.OooO00o(37, PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(34), 0.0f, Dp.m3765constructorimpl(f), 0.0f, 10, null), composerStartRestartGroup, -483455358);
            MeasurePolicy measurePolicyOooO0O0 = OooOOO0.OooO0O0(arrangement, end, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierOooO00o3);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor5);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl5 = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o5 = OooO.OooO00o(companion3, composerM1309constructorimpl5, measurePolicyOooO0O0, composerM1309constructorimpl5, currentCompositionLocalMap5);
            if (composerM1309constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                OooO0O0.OooO00o(currentCompositeKeyHash5, composerM1309constructorimpl5, currentCompositeKeyHash5, function2OooO00o5);
            }
            function3ModifierMaterializerOf5.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            Long lValueOf = Long.valueOf(roomUserRecordModel.getCreateTime());
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(lValueOf);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = o0000oo.OooO0Oo(roomUserRecordModel.getCreateTime(), System.currentTimeMillis());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            TextKt.m1251Text4IGK_g((String) objRememberedValue2, (Modifier) null, o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
            float f3 = 8;
            com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(f3), null, composerStartRestartGroup, 6, 2);
            composerStartRestartGroup.startReplaceableGroup(381779670);
            if (i == 0 && o000000.OooO00o(Integer.valueOf(roomUserRecordModel.isForbid()))) {
                Alignment center2 = companion2.getCenter();
                Modifier modifierOooO00o4 = o0oOO.OooO00o(f3, SizeKt.m530widthInVpY3zN4$default(SizeKt.m509height3ABfNKs(BackgroundKt.m168backgroundbw27NRU(companion, o000OOo.OooO0OO(composerStartRestartGroup).f37708OooO0oO, RoundedCornerShapeKt.RoundedCornerShape(50)), Dp.m3765constructorimpl(f)), Dp.m3765constructorimpl(50), 0.0f, 2, null), 0.0f, 2, null, composerStartRestartGroup, 733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor6 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierOooO00o4);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor6);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM1309constructorimpl6 = Updater.m1309constructorimpl(composerStartRestartGroup);
                Function2 function2OooO00o6 = OooO.OooO00o(companion3, composerM1309constructorimpl6, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl6, currentCompositionLocalMap6);
                if (composerM1309constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                    OooO0O0.OooO00o(currentCompositeKeyHash6, composerM1309constructorimpl6, currentCompositeKeyHash6, function2OooO00o6);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf6, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                composer2 = composerStartRestartGroup;
                TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.room_kick_record_forbid, composerStartRestartGroup, 0), (Modifier) null, o0oO0O0o.f46946OooO0O0, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                o000oOoO.OooO00o(composer2);
            } else {
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            DividerKt.m1058DivideroMI9zvI(boxScopeInstance.align(companion, companion2.getBottomStart()), o000OOo.OooO0OO(composer2).f37706OooO0o, Dp.m3765constructorimpl((float) 0.5d), Dp.m3765constructorimpl(66), composer2, 3456, 0);
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new i(roomUserRecordModel, str, i, i2));
    }

    public static final void OooO0O0(Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1884410007);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1884410007, i, -1, "com.yalla.yalla.ui.screen.room.RoomUserActionRecordScreenContent (RoomUserActionRecordScreen.kt:66)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o = OooO0o.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
                OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            t1.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.Action_Records, composerStartRestartGroup, 0), 0.0f, o000OOo.OooO0OO(composerStartRestartGroup).f37715OooOOOO, null, null, null, null, null, BackgroundKt.m169backgroundbw27NRU$default(companion, o000OOo.OooO0OO(composerStartRestartGroup).f37716OooOOOo, null, 2, null), composerStartRestartGroup, 0, SQLiteDatabase.MAX_SQL_CACHE_SIZE);
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(oOO00.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            oOO00 ooo00 = (oOO00) viewModel;
            Object objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objOooO00o == companion3.getEmpty()) {
                objOooO00o = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScopeOooO00o = OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objOooO00o, composerStartRestartGroup, -492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == companion3.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SoftwareKeyboardController current2 = LocalSoftwareKeyboardController.INSTANCE.getCurrent(composerStartRestartGroup, LocalSoftwareKeyboardController.$stable);
            j1 j1Var = j1.f49943OooO00o;
            String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.Search_user_name_or_id, composerStartRestartGroup, 0);
            k kVar = new k(ooo00, coroutineScopeOooO00o, (MutableState) objRememberedValue);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(current2);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion3.getEmpty()) {
                objRememberedValue2 = new l(current2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            j1Var.OooO00o(kVar, null, (Function1) objRememberedValue2, null, strStringResource, 0L, false, 0L, null, 0, null, null, null, 0L, 0L, 0, composerStartRestartGroup, 0, 2097152, 65514);
            Oooo000 oooo000OooO00o = p184o00o00o.o000oOoO.OooO00o(0, composerStartRestartGroup, 0, 1);
            TabRowKt.m1221TabRowpAZo6Ak(oooo000OooO00o.OooO0oO(), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), o0oO0O0o.f46945OooO00o, o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -614806921, true, new m(oooo000OooO00o)), b.f54485OooO00o, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2062154871, true, new s(oooo000OooO00o, coroutineScopeOooO00o)), composerStartRestartGroup, 1794096, 0);
            DividerKt.m1058DivideroMI9zvI(null, o000OOo.OooO0OO(composerStartRestartGroup).f37706OooO0o, Dp.m3765constructorimpl((float) 0.5d), 0.0f, composerStartRestartGroup, 384, 9);
            composer2 = composerStartRestartGroup;
            Pager.OooO00o(3, null, oooo000OooO00o, false, 0.0f, null, null, null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1244798364, true, new t(ooo00)), composerStartRestartGroup, 6, 6, 1018);
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new u(i));
    }

    public static final void OooO0OO(int i, String str, p143o00Oo000.OooO0O0 oooO0O0, p143o00Oo000.OooO0O0 oooO0O1, Composer composer, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1348954344);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1348954344, i2, -1, "com.yalla.yalla.ui.screen.room.RoomUserOperationRecordPage (RoomUserActionRecordScreen.kt:163)");
        }
        o000O0.OooO0O0 oooO0O0OooO00o = o000O0.OooOOO.OooO00o(oooO0O0.f37667OooO0oo, composerStartRestartGroup);
        o000O0.OooO0O0 oooO0O0OooO00o2 = o000O0.OooOOO.OooO00o(oooO0O1.f37667OooO0oo, composerStartRestartGroup);
        o000O0.OooO0O0 oooO0O2 = StringsKt.isBlank(str) ^ true ? oooO0O0OooO00o2 : oooO0O0OooO00o;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        ComposableLambda composableLambda = b.f54486OooO0O0;
        ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -825336636, true, new x(str, oooO0O0OooO00o2, oooO0O0OooO00o, i, i2));
        int i3 = o000O0.OooO0O0.f34327OooO0o0;
        p148o00Oo0o.o0O0O00.OooO00o(oooO0O2, modifierFillMaxSize$default, null, null, false, null, composableLambda, null, composableLambda2, composerStartRestartGroup, 102236216, 188);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new y(i, str, oooO0O0, oooO0O1, i2));
    }
}
