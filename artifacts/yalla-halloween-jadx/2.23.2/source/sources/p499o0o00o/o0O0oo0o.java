package p499o0o00o;

import android.app.Activity;
import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.OooOO0;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.code.android.util.o0O0O00;
import com.facebook.appevents.OooOOO0;
import com.yalla.yalla.model.room.RoomActivityModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p423o0OoO0OO.o000OO;
import p476o0OooooO.o0OOo000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomActivityManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomActivityManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomActivityManagerKt$ActivityBanner$1$pagerStateAndPageMapper$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,228:1\n76#2:229\n72#3,6:230\n78#3:264\n82#3:312\n78#4,11:236\n78#4,11:274\n91#4:306\n91#4:311\n456#5,8:247\n464#5,3:261\n456#5,8:285\n464#5,3:299\n467#5,3:303\n467#5,3:308\n4144#6,6:255\n4144#6,6:293\n154#7:265\n154#7:266\n65#8,7:267\n72#8:302\n76#8:307\n*S KotlinDebug\n*F\n+ 1 RoomActivityManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomActivityManagerKt$ActivityBanner$1$pagerStateAndPageMapper$1\n*L\n89#1:229\n93#1:230,6\n93#1:264\n93#1:312\n93#1:236,11\n110#1:274,11\n110#1:306\n93#1:311\n93#1:247,8\n93#1:261,3\n110#1:285,8\n110#1:299,3\n110#1:303,3\n93#1:308,3\n93#1:255,6\n110#1:293,6\n104#1:265\n108#1:266\n110#1:267,7\n110#1:302\n110#1:307\n*E\n"})
public final class o0O0oo0o extends Lambda implements Function3<Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ List<RoomActivityModel.RoomActivitys> f49948OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0oo0o(List<RoomActivityModel.RoomActivitys> list) {
        super(3);
        this.f49948OooO0Oo = list;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(Integer num, Composer composer, Integer num2) {
        int iIntValue = num.intValue();
        Composer composer2 = composer;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 14) == 0) {
            iIntValue2 |= composer2.changed(iIntValue) ? 4 : 2;
        }
        if ((iIntValue2 & 91) == 18 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2147470895, iIntValue2, -1, "com.yalla.yalla.ui.activity.room.live.side.ActivityBanner.<anonymous>.<anonymous> (RoomActivityManager.kt:88)");
            }
            Object objConsume = composer2.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            if (objConsume instanceof Activity) {
            }
            RoomActivityModel.RoomActivitys roomActivitys = this.f49948OooO0Oo.get(iIntValue);
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), false, false, 0L, false, null, null, null, new o0oO0O0o(roomActivitys), 253);
            composer2.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o = OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
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
            Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ImageKt.Image(o000OO.OooO0Oo(roomActivitys.imageurl, null, composer2, 0, 1), (String) null, SizeKt.m525size3ABfNKs(companion2, Dp.m3775constructorimpl(40)), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer2, 25008, 104);
            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(4), null, composer2, 6, 2);
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composer2, 0);
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion2);
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
            Function2 function2OooO00o2 = OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyRememberBoxMeasurePolicy, composerM1320constructorimpl2, currentCompositionLocalMap2);
            if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            long sp = TextUnitKt.getSp(10);
            TextOverflow.Companion companion4 = TextOverflow.INSTANCE;
            int iM3729getEllipsisgIe3tQ8 = companion4.m3729getEllipsisgIe3tQ8();
            long j = o0OOo000.f48134OooO00o;
            TextAlign.Companion companion5 = TextAlign.INSTANCE;
            TextKt.m1261Text4IGK_g(" \n", (Modifier) null, j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(companion5.m3681getCentere0LSkKk()), 0L, iM3729getEllipsisgIe3tQ8, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3078, 3120, 120306);
            String str = roomActivitys.title;
            long sp2 = TextUnitKt.getSp(10);
            int iM3729getEllipsisgIe3tQ9 = companion4.m3729getEllipsisgIe3tQ8();
            long j2 = o0OOo000.f48147OooOOOO;
            int iM3681getCentere0LSkKk = companion5.m3681getCentere0LSkKk();
            Intrinsics.checkNotNull(str);
            TextKt.m1261Text4IGK_g(str, (Modifier) null, j2, sp2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(iM3681getCentere0LSkKk), 0L, iM3729getEllipsisgIe3tQ9, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 3120, 120306);
            if (OooOOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
