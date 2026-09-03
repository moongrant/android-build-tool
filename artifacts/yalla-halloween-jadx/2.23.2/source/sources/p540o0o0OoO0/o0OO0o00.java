package p540o0o0OoO0;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import com.code.android.util.o0000O0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import o000O.o0ooOOo;
import p022Oooo00O.o0O00oO0;
import p476o0OooooO.o0OOo000;
import p516o0o0O00o.o0O0O0Oo;
import p562o0oOo000.o000000;
import p581o0oOoo.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nLiveRoomMemberTaskHostDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomMemberTaskHostDialog.kt\ncom/yalla/yalla/ui/dialog/room/LiveRoomMemberTaskHostDialog$TipPopup$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,487:1\n36#2:488\n456#2,8:512\n464#2,3:526\n456#2,8:553\n464#2,3:567\n467#2,3:571\n467#2,3:579\n1097#3,6:489\n72#4,6:495\n78#4:529\n82#4:583\n78#5,11:501\n78#5,11:542\n91#5:574\n91#5:582\n4144#6,6:520\n4144#6,6:561\n154#7:530\n154#7:531\n154#7:532\n154#7:533\n154#7:534\n154#7:535\n154#7:576\n154#7:578\n66#8,6:536\n72#8:570\n76#8:575\n58#9:577\n*S KotlinDebug\n*F\n+ 1 LiveRoomMemberTaskHostDialog.kt\ncom/yalla/yalla/ui/dialog/room/LiveRoomMemberTaskHostDialog$TipPopup$2\n*L\n446#1:488\n446#1:512,8\n446#1:526,3\n447#1:553,8\n447#1:567,3\n447#1:571,3\n446#1:579,3\n446#1:489,6\n446#1:495,6\n446#1:529\n446#1:583\n446#1:501,11\n447#1:542,11\n447#1:574\n446#1:582\n446#1:520,6\n447#1:561,6\n449#1:530\n451#1:531\n452#1:532\n456#1:533\n457#1:534\n458#1:535\n464#1:576\n466#1:578\n447#1:536,6\n447#1:570\n447#1:575\n464#1:577\n*E\n"})
public final class o0OO0o00 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<IntSize> f54838OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f54839OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0000oo f54840OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0o00(MutableState<IntSize> mutableState, o0000oo o0000ooVar, int i) {
        super(2);
        this.f54838OooO0Oo = mutableState;
        this.f54840OooO0o0 = o0000ooVar;
        this.f54839OooO0o = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-286984865, iIntValue, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomMemberTaskHostDialog.TipPopup.<anonymous> (LiveRoomMemberTaskHostDialog.kt:445)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            composer2.startReplaceableGroup(1157296644);
            MutableState<IntSize> mutableState = this.f54838OooO0Oo;
            boolean zChanged = composer2.changed(mutableState);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new o0OOooO0(mutableState);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(companion, (Function1) objRememberedValue);
            composer2.startReplaceableGroup(-483455358);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(companion2, top, composer2, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOnSizeChanged);
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
            Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierM480paddingVpY3zN4$default = PaddingKt.m480paddingVpY3zN4$default(companion, Dp.m3775constructorimpl(16), 0.0f, 2, null);
            float f = 12;
            float fM3775constructorimpl = Dp.m3775constructorimpl(f);
            RoundedCornerShape roundedCornerShapeM729RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f));
            long j = o0OOo000.f48161OooOoo0;
            Modifier modifierM478padding3ABfNKs = PaddingKt.m478padding3ABfNKs(SizeKt.m532widthInVpY3zN4$default(BackgroundKt.m170backgroundbw27NRU(ShadowKt.m1359shadows4CzXII$default(modifierM480paddingVpY3zN4$default, fM3775constructorimpl, roundedCornerShapeM729RoundedCornerShape0680j_4, false, j, j, 4, null), p193o00o0O0O.o0000oo.OooO0OO(composer2).f38618OooO0O0, RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f))), 0.0f, Dp.m3775constructorimpl(240), 1, null), Dp.m3775constructorimpl(f));
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer2, 0, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM478padding3ABfNKs);
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
            Function2 function2OooO00o2 = OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o, composerM1320constructorimpl2, currentCompositionLocalMap2);
            if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.host_Send_golds_gifts_desc_tip, composer2, 0), (Modifier) null, p193o00o0O0O.o0000oo.OooO0OO(composer2).f38626OooOO0O, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131066);
            o0ooOOo.OooO00o(composer2);
            BoxKt.Box(SizeKt.m527sizeVpY3zN4(BackgroundKt.m170backgroundbw27NRU(OffsetKt.m439offsetVpY3zN4$default(companion, Dp.m3775constructorimpl(o0000O0.OooO0o0(com.code.android.util.o000000.OooO0Oo(Float.valueOf(Offset.m1447getXimpl(this.f54840OooO0o0.f56615OooO0o0))) - this.f54839OooO0o, composer2) - Dp.m3775constructorimpl(7)), 0.0f, 2, null), p193o00o0O0O.o0000oo.OooO0OO(composer2).f38618OooO0O0, o0O0O0Oo.f51547OooO00o), Dp.m3775constructorimpl(15), Dp.m3775constructorimpl(8)), composer2, 0);
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
