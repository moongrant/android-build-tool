package p495o0o00Ooo;

import OooOo.OooO0o;
import android.app.Activity;
import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.OooOOO0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.model.room.RoomActivityModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p184o00o00o.OooOOOO;
import p184o00o00o.Oooo000;
import p417o0OoO0.o00Oo0;
import p464o0Oooo.o000000O;
import p469o0OoooOO.o0oO0O0o;
import p507o0o00ooo.oOOO00o0;
import p539o0o0OoOO.b0;
import p539o0o0OoOO.b1;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomActivityManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomActivityManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomActivityManagerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,226:1\n154#2:227\n154#2:263\n154#2:264\n154#2:265\n154#2:272\n154#2:308\n154#2:309\n72#3,6:228\n78#3:262\n82#3:270\n72#3,6:273\n78#3:307\n82#3:314\n78#4,11:234\n91#4:269\n78#4,11:279\n91#4:313\n456#5,8:245\n464#5,3:259\n467#5,3:266\n456#5,8:290\n464#5,3:304\n467#5,3:310\n4144#6,6:253\n4144#6,6:298\n76#7:271\n*S KotlinDebug\n*F\n+ 1 RoomActivityManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomActivityManagerKt\n*L\n79#1:227\n132#1:263\n138#1:264\n139#1:265\n152#1:272\n160#1:308\n164#1:309\n79#1:228,6\n79#1:262\n79#1:270\n151#1:273,6\n151#1:307\n151#1:314\n79#1:234,11\n79#1:269\n151#1:279,11\n151#1:313\n79#1:245,8\n79#1:259,3\n79#1:266,3\n151#1:290,8\n151#1:304,3\n151#1:310,3\n79#1:253,6\n151#1:298,6\n149#1:271\n*E\n"})
public final class o00OOOOo {
    public static final void OooO00o(List list, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-354861472);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-354861472, i, -1, "com.yalla.yalla.ui.activity.room.live.side.ActivityBanner (RoomActivityManager.kt:75)");
        }
        int size = list.size();
        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, Dp.m3765constructorimpl(10), 0.0f, 0.0f, 13, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO0O0 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM480paddingqDBjuR0$default);
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
        Function2 function2OooO00o = OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO0O0, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Pair pairOooO00o = oOOO00o0.OooO00o(true, size, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 3000L, list.size() > 1, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2147470895, true, new o00OOO00(list)), composerStartRestartGroup, 3462, 8160);
        composerStartRestartGroup.startReplaceableGroup(1636537775);
        if (size > 1) {
            com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(3), null, composerStartRestartGroup, 6, 2);
            Oooo000 oooo000 = (Oooo000) pairOooO00o.getFirst();
            Function1 function1 = (Function1) pairOooO00o.getSecond();
            float f = 4;
            OooOOOO.OooO00o(oooo000, null, size, function1, o0oO0O0o.f46946OooO0O0, ColorKt.Color(1096525283327L), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), 0.0f, null, composerStartRestartGroup, 14352384, 770);
        }
        if (OooO0o.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00OOO0(list, i));
    }

    public static final void OooO0O0(RoomActivityModel.RoomActivitys roomActivitys, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(581633319);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(581633319, i, -1, "com.yalla.yalla.ui.activity.room.live.side.ActivityInfo (RoomActivityManager.kt:147)");
        }
        Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        if (objConsume instanceof Activity) {
        }
        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, Dp.m3765constructorimpl(10), 0.0f, 0.0f, 13, null), false, false, 0L, false, null, null, null, new o00OOO0O(roomActivitys), 253);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO0O0 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
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
        Function2 function2OooO00o = OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO0O0, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        ImageKt.Image(o00Oo0.OooO0Oo(roomActivitys.imageurl, null, composerStartRestartGroup, 0, 1), (String) null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(40)), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 25008, 104);
        com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(4), null, composerStartRestartGroup, 6, 2);
        String title = roomActivitys.title;
        b1 b1Var = new b1(TextUnitKt.getSp(8), TextUnitKt.getSp(10));
        int iM3719getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8();
        long j = o0oO0O0o.f46958OooOOOO;
        int iM3671getCentere0LSkKk = TextAlign.INSTANCE.m3671getCentere0LSkKk();
        Intrinsics.checkNotNullExpressionValue(title, "title");
        b0.OooO00o(title, b1Var, null, j, null, null, null, 0L, null, TextAlign.m3664boximpl(iM3671getCentere0LSkKk), 0L, iM3719getEllipsisgIe3tQ8, false, 2, null, composerStartRestartGroup, 0, 3120, 22004);
        if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0o0Oo(roomActivitys, i));
    }

    public static final void OooO0OO(RoomActivityModel.RoomActivitys roomActivitys, boolean z) {
        Pair[] pairArr = new Pair[2];
        pairArr[0] = TuplesKt.to("type", Integer.valueOf(z ? 1 : 2));
        pairArr[1] = TuplesKt.to("url", roomActivitys != null ? roomActivitys.activityurl : null);
        o0OO000.OooO0O0("102248", MapsKt.mapOf(pairArr));
        o00OOOO0 onLogin = new o00OOOO0(roomActivitys);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            int i = LoginActivity.f25186OooOo0O;
            LoginActivity.OooO00o.OooO00o(activityOooO0O0);
        }
    }
}
