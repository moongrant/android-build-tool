package p502o0o00o0;

import android.app.Activity;
import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOo;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.OooO0o;
import androidx.compose.material.OooOO0;
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
import p230o00oOo0o.o000000;
import p230o00oOo0o.oo0o0Oo;
import p425o0OoO0OO.o0000O0O;
import p474o0OoooOO.oo0oO0;
import p477o0Ooooo0.o0O0o;
import p515o0o0O00.o00000;
import p546o0o0Ooo0.o0O00OO;
import p546o0o0Ooo0.o0OOooO0;
import p593o0oOoooO.h0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomActivityManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomActivityManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomActivityManagerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,228:1\n154#2:229\n154#2:265\n154#2:266\n154#2:267\n154#2:274\n154#2:310\n154#2:311\n72#3,6:230\n78#3:264\n82#3:272\n72#3,6:275\n78#3:309\n82#3:316\n78#4,11:236\n91#4:271\n78#4,11:281\n91#4:315\n456#5,8:247\n464#5,3:261\n467#5,3:268\n456#5,8:292\n464#5,3:306\n467#5,3:312\n4144#6,6:255\n4144#6,6:300\n76#7:273\n*S KotlinDebug\n*F\n+ 1 RoomActivityManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomActivityManagerKt\n*L\n81#1:229\n134#1:265\n140#1:266\n141#1:267\n154#1:274\n162#1:310\n166#1:311\n81#1:230,6\n81#1:264\n81#1:272\n153#1:275,6\n153#1:309\n153#1:316\n81#1:236,11\n81#1:271\n153#1:281,11\n153#1:315\n81#1:247,8\n81#1:261,3\n81#1:268,3\n153#1:292,8\n153#1:306,3\n153#1:312,3\n81#1:255,6\n153#1:300,6\n151#1:273\n*E\n"})
public final class o0OO0oO0 {
    public static final void OooO00o(List list, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-354861472);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-354861472, i, -1, "com.yalla.yalla.ui.activity.room.live.side.ActivityBanner (RoomActivityManager.kt:77)");
        }
        int size = list.size();
        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, Dp.m3775constructorimpl(10), 0.0f, 0.0f, 13, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO00o = OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM482paddingqDBjuR0$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Pair pairOooO00o = o00000.OooO00o(true, size, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 3000L, list.size() > 1, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2147470895, true, new o0OO0(list)), composerStartRestartGroup, 3462, 8160);
        composerStartRestartGroup.startReplaceableGroup(1636537868);
        if (size > 1) {
            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(3), null, composerStartRestartGroup, 6, 2);
            o000000 o000000Var = (o000000) pairOooO00o.getFirst();
            Function1 function1 = (Function1) pairOooO00o.getSecond();
            float f = 4;
            oo0o0Oo.OooO00o(o000000Var, null, size, function1, o0O0o.f48093OooO0O0, ColorKt.Color(1096525283327L), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f), 0.0f, null, composerStartRestartGroup, 14352384, 770);
        }
        if (OooOo.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0OO0O0(list, i));
    }

    public static final void OooO0O0(RoomActivityModel.RoomActivitys roomActivitys, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(581633319);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(581633319, i, -1, "com.yalla.yalla.ui.activity.room.live.side.ActivityInfo (RoomActivityManager.kt:149)");
        }
        Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        if (objConsume instanceof Activity) {
        }
        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, Dp.m3775constructorimpl(10), 0.0f, 0.0f, 13, null), false, false, 0L, false, null, null, null, new o0OOooO0(roomActivitys), 253);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO00o = OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally, composerStartRestartGroup, 48, -1323940314);
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
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        ImageKt.Image(o0000O0O.OooO0Oo(roomActivitys.imageurl, null, composerStartRestartGroup, 0, 1), (String) null, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(40)), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 25008, 104);
        com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(4), null, composerStartRestartGroup, 6, 2);
        String str = roomActivitys.title;
        o0OOooO0 o0ooooo0 = new o0OOooO0(TextUnitKt.getSp(8), TextUnitKt.getSp(10));
        int iM3729getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8();
        long j = o0O0o.f48105OooOOOO;
        int iM3681getCentere0LSkKk = TextAlign.INSTANCE.m3681getCentere0LSkKk();
        Intrinsics.checkNotNull(str);
        o0O00OO.OooO00o(str, o0ooooo0, null, j, null, null, null, 0L, null, TextAlign.m3674boximpl(iM3681getCentere0LSkKk), 0L, iM3729getEllipsisgIe3tQ8, false, 2, null, composerStartRestartGroup, 0, 3120, 22004);
        if (OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0OO0o00(roomActivitys, i));
    }

    public static final void OooO0OO(RoomActivityModel.RoomActivitys roomActivitys, boolean z) {
        Pair[] pairArr = new Pair[2];
        pairArr[0] = TuplesKt.to("type", Integer.valueOf(z ? 1 : 2));
        pairArr[1] = TuplesKt.to("url", roomActivitys != null ? roomActivitys.activityurl : null);
        h0.OooO0OO("102248", MapsKt.mapOf(pairArr));
        o0OO0o onLogin = new o0OO0o(roomActivitys);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        if (Intrinsics.areEqual(oo0oO0.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            int i = LoginActivity.f24734OooOo0O;
            LoginActivity.OooO00o.OooO00o(activityOooO0O0);
        }
    }
}
