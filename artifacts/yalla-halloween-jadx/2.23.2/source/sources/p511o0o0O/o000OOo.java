package p511o0o0O;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.OooO0OO;
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
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.code.android.util.o0000;
import com.facebook.appevents.OooOOO0;
import com.yalla.yalla.model.gift.MyGiftModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import o000O.o0ooOOo;
import p193o00o0O0O.o0000oo;
import p423o0OoO0OO.o000OO;
import p476o0OooooO.o0OOo000;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;
import p590o0oOooo0.oOO0O00O;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nGiftSendCheck.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftSendCheck.kt\ncom/yalla/yalla/ui/dialog/giftDialog/GiftSendCheck$checkForUserInfo$1$2$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,365:1\n72#2,6:366\n78#2:400\n82#2:493\n78#3,11:372\n78#3,11:410\n91#3:444\n78#3,11:453\n91#3:487\n91#3:492\n456#4,8:383\n464#4,3:397\n456#4,8:421\n464#4,3:435\n467#4,3:441\n456#4,8:464\n464#4,3:478\n467#4,3:484\n467#4,3:489\n4144#5,6:391\n4144#5,6:429\n4144#5,6:472\n154#6:401\n154#6:402\n154#6:439\n154#6:440\n154#6:446\n154#6:447\n154#6:482\n154#6:483\n72#7,7:403\n79#7:438\n83#7:445\n74#7,5:448\n79#7:481\n83#7:488\n*S KotlinDebug\n*F\n+ 1 GiftSendCheck.kt\ncom/yalla/yalla/ui/dialog/giftDialog/GiftSendCheck$checkForUserInfo$1$2$1\n*L\n288#1:366,6\n288#1:400\n288#1:493\n288#1:372,11\n301#1:410,11\n301#1:444\n320#1:453,11\n320#1:487\n288#1:492\n288#1:383,8\n288#1:397,3\n301#1:421,8\n301#1:435,3\n301#1:441,3\n320#1:464,8\n320#1:478,3\n320#1:484,3\n288#1:489,3\n288#1:391,6\n301#1:429,6\n320#1:472,6\n294#1:401\n299#1:402\n305#1:439\n308#1:440\n319#1:446\n322#1:447\n326#1:482\n343#1:483\n301#1:403,7\n301#1:438\n301#1:445\n320#1:448,5\n320#1:481\n320#1:488\n*E\n"})
public final class o000OOo extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MyGiftModel.Data f51018OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f51019OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo(MyGiftModel.Data data, boolean z) {
        super(3);
        this.f51018OooO0Oo = data;
        this.f51019OooO0o0 = z;
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0330  */
    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        Composer composer2;
        String strOooO0OO;
        long j;
        long j2;
        ColumnScope TextDialog = columnScope;
        Composer composer3 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(TextDialog, "$this$TextDialog");
        if ((iIntValue & 81) == 16 && composer3.getSkipping()) {
            composer3.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-320275373, iIntValue, -1, "com.yalla.yalla.ui.dialog.giftDialog.GiftSendCheck.checkForUserInfo.<anonymous>.<anonymous>.<anonymous> (GiftSendCheck.kt:287)");
            }
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            composer3.startReplaceableGroup(-483455358);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = OooOO0.OooO00o(arrangement, centerHorizontally, composer3, 48, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
            if (!(composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor);
            } else {
                composer3.useNode();
            }
            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer3);
            Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer3)), composer3, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MyGiftModel.Data data = this.f51018OooO0Oo;
            ComposeUiNode.Companion companion4 = companion3;
            ImageKt.Image(o000OO.OooO00o(data.getImageurl(), o0O0O00.f51058OooO0Oo, composer3, 48, 0), (String) null, SizeKt.m525size3ABfNKs(companion2, Dp.m3775constructorimpl(60)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 432, 120);
            composer3.startReplaceableGroup(1448257066);
            boolean z = this.f51019OooO0o0;
            if (z) {
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(8), null, composer3, 6, 2);
                Alignment.Vertical centerVertically = companion.getCenterVertically();
                composer3.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO0O0 = OooO0OO.OooO0O0(arrangement, centerVertically, composer3, 48, -1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion2);
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor2);
                } else {
                    composer3.useNode();
                }
                Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer3);
                Function2 function2OooO00o2 = OooO.OooO00o(companion4, composerM1320constructorimpl2, measurePolicyOooO0O0, composerM1320constructorimpl2, currentCompositionLocalMap2);
                if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer3)), composer3, 2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                companion4 = companion4;
                ImageKt.Image(PainterResources_androidKt.painterResource(data.isCoin() ? o0Oo0oo.coin_little : o0Oo0oo.icon_crystal_main_slide, composer3, 0), (String) null, SizeKt.m525size3ABfNKs(companion2, Dp.m3775constructorimpl(16)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 440, 120);
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(4), null, composer3, 6, 2);
                composer2 = composer3;
                TextKt.m1261Text4IGK_g(data.getPrice(), (Modifier) null, data.isCoin() ? o0OOo000.f48259o000Ooo : o0OOo000.f48236o000O0O, oOO0O00O.OooO0OO(18, composer3), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131058);
                o0ooOOo.OooO00o(composer2);
            } else {
                composer2 = composer3;
            }
            composer2.endReplaceableGroup();
            float f = 10;
            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(f), null, composer2, 6, 2);
            Arrangement.HorizontalOrVertical center = arrangement.getCenter();
            Modifier modifierM480paddingVpY3zN4$default = PaddingKt.m480paddingVpY3zN4$default(companion2, Dp.m3775constructorimpl(25), 0.0f, 2, null);
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, companion.getTop(), composer2, 6);
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM480paddingVpY3zN4$default);
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
            Function2 function2OooO00o3 = OooO.OooO00o(companion4, composerM1320constructorimpl3, measurePolicyRowMeasurePolicy, composerM1320constructorimpl3, currentCompositionLocalMap3);
            if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            long j3 = o0OOo000.f48231o000O;
            long jOooO0OO = oOO0O00O.OooO0OO(14, composer2);
            float fM3775constructorimpl = Dp.m3775constructorimpl(f);
            composer2.startReplaceableGroup(-2140532587);
            if (data.isGiftBlind()) {
                strOooO0OO = o0000.OooO0OO(o000000.user_gift_blind_tips);
            } else if (data.isGiftSupremeVip6()) {
                strOooO0OO = o0000.OooO0OO(o000000.vip6_send_for_userInfo_content);
            } else {
                if (data.isGiftMember() || data.iGiftCustomMade() || z) {
                    strOooO0OO = o0000.OooO0OO(o000000.user_gift_member_tips);
                } else {
                    long j4 = o0000oo.OooO0OO(composer2).f38627OooOO0o;
                    long jOooO0OO2 = oOO0O00O.OooO0OO(16, composer2);
                    j = j4;
                    fM3775constructorimpl = Dp.m3775constructorimpl(12);
                    j2 = jOooO0OO2;
                    strOooO0OO = o0000.OooO0OO(o000000.sold_out);
                }
                composer2.endReplaceableGroup();
                com.code.android.util.OooOO0.OooO0o(fM3775constructorimpl, null, composer2, 0, 2);
                TextKt.m1261Text4IGK_g(strOooO0OO, (Modifier) null, j, j2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 130546);
                if (OooOOO0.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            j = j3;
            j2 = jOooO0OO;
            composer2.endReplaceableGroup();
            com.code.android.util.OooOO0.OooO0o(fM3775constructorimpl, null, composer2, 0, 2);
            TextKt.m1261Text4IGK_g(strOooO0OO, (Modifier) null, j, j2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 130546);
            if (OooOOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
