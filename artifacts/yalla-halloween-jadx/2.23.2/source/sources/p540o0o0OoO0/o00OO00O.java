package p540o0o0OoO0;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.OooOO0O;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.OooO0OO;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
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
import androidx.compose.ui.unit.TextUnitKt;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO00o;
import com.yallatech.support.platform.share.bean.ShareRequest;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import o000O.o0ooOOo;
import p194o00o0OO.o00O000o;
import p454o0Ooo000.OooOo00;
import p475o0Ooooo0.o0O00oO0;
import p476o0OooooO.o0OOo000;
import p483o0o000Oo.o0000oo;
import p523o0o0O0oo.oO000O0O;
import p540o0o0OoO0.o00O0OOO;
import p540o0o0OoO0.o00OO000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nLiveRoomApplyMicListDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomApplyMicListDialog.kt\ncom/yalla/yalla/ui/dialog/room/ComposableSingletons$LiveRoomApplyMicListDialogKt$lambda-2$1$2$2$2$4$2$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,374:1\n171#2,12:375\n*S KotlinDebug\n*F\n+ 1 LiveRoomApplyMicListDialog.kt\ncom/yalla/yalla/ui/dialog/room/ComposableSingletons$LiveRoomApplyMicListDialogKt$lambda-2$1$2$2$2$4$2$1\n*L\n198#1:375,12\n*E\n"})
public final class o00OO00O extends Lambda implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f54710OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO00O(boolean z) {
        super(1);
        this.f54710OooO0Oo = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyColumn = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final boolean z = this.f54710OooO0Oo;
        if (z) {
            o0000oo o0000ooVar = OooO00o.f24517OooO0oO;
            if (o0000ooVar.OooO0oO() == 0 && (!o0000ooVar.f48591OooOOo.isEmpty())) {
                LazyListScope.CC.OooO(LazyColumn, null, null, o00O00OO.f54689OooO00o, 3, null);
            }
        }
        final SnapshotStateList<Long> snapshotStateList = OooO00o.f24517OooO0oO.f48591OooOOo;
        LazyColumn.items(snapshotStateList.size(), null, new Function1<Integer, Object>() { // from class: com.yalla.yalla.ui.dialog.room.ComposableSingletons$LiveRoomApplyMicListDialogKt$lambda-2$1$2$2$2$4$2$1$invoke$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Integer num) {
                snapshotStateList.get(num.intValue());
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yalla.yalla.ui.dialog.room.ComposableSingletons$LiveRoomApplyMicListDialogKt$lambda-2$1$2$2$2$4$2$1$invoke$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r12v1 */
            /* JADX WARN: Type inference failed for: r12v11 */
            /* JADX WARN: Type inference failed for: r12v2, types: [androidx.compose.ui.Modifier, kotlin.coroutines.CoroutineContext] */
            @Override // kotlin.jvm.functions.Function4
            public final Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                int i;
                int i2;
                int i3;
                LazyItemScope items = lazyItemScope;
                int iIntValue = num.intValue();
                Composer composer2 = composer;
                int iIntValue2 = num2.intValue();
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((iIntValue2 & 14) == 0) {
                    i = (composer2.changed(items) ? 4 : 2) | iIntValue2;
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 112) == 0) {
                    i |= composer2.changed(iIntValue) ? 32 : 16;
                }
                if ((i & 731) == 146 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1091073711, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:179)");
                    }
                    long jLongValue = ((Number) snapshotStateList.get(iIntValue)).longValue();
                    ArrayList arrayList = OooO00o.f24511OooO00o;
                    RoomUserInfoModel roomUserInfoModelOooO0o0 = OooO00o.OooO0o0(Long.valueOf(jLongValue));
                    if (roomUserInfoModelOooO0o0 != null) {
                        Alignment.Companion companion = Alignment.INSTANCE;
                        Alignment.Vertical centerVertically = companion.getCenterVertically();
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Long lValueOf = Long.valueOf(jLongValue);
                        composer2.startReplaceableGroup(1157296644);
                        boolean zChanged = composer2.changed(lValueOf);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new o00O0OOO(jLongValue);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        float f = 60;
                        Modifier modifierM511height3ABfNKs = SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(o0O0O00.OooO0O0(companion2, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 255), 0.0f, 1, null), Dp.m3775constructorimpl(f));
                        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                        Long l = (Long) o0O00oO0.OooOOo0().getValue();
                        long j = (l != null && jLongValue == l.longValue()) ? o0OOo000.f48187OooooO0 : o0OOo000.f48134OooO00o;
                        ?? r12 = 0;
                        Modifier modifierOooO00o = OooOo00.OooO00o(16, BackgroundKt.m171backgroundbw27NRU$default(modifierM511height3ABfNKs, j, null, 2, null), 0.0f, 2, null, composer2, 693286680);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyOooO0O0 = OooO0OO.OooO0O0(arrangement, centerVertically, composer2, 48, -1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO00o);
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
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        Alignment.Vertical centerVertically2 = companion.getCenterVertically();
                        Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(OooOO0O.OooO00o(rowScopeInstance, companion2, 1.0f, false, 2, null), 0.0f, 1, null);
                        composer2.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyOooO0O1 = OooO0OO.OooO0O0(arrangement, centerVertically2, composer2, 48, -1323940314);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight$default);
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
                        Function2 function2OooO00o2 = OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO0O1, composerM1320constructorimpl2, currentCompositionLocalMap2);
                        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        }
                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-1163890502);
                        int iOooO0oO = OooO00o.f24517OooO0oO.OooO0oO();
                        boolean z2 = z;
                        if (iOooO0oO <= 0 || !z2) {
                            i2 = 13;
                            i3 = 2;
                        } else {
                            i2 = 13;
                            TextKt.m1261Text4IGK_g(String.valueOf(iIntValue + 1), SizeKt.m530width3ABfNKs(companion2, Dp.m3775constructorimpl(24)), p193o00o0O0O.o0000oo.OooO0OO(composer2).f38625OooOO0, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 131056);
                            composer2 = composer2;
                            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(4), null, composer2, 6, 2);
                            i3 = 2;
                            r12 = 0;
                        }
                        composer2.endReplaceableGroup();
                        oO0OO.OooO00o oooO00o = oO0OO.OooO00o.f59939OooO00o;
                        oooO00o.OooOO0((String) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.getUserHeader(), r12, composer2, 8, 1).getValue(), SizeKt.m525size3ABfNKs(companion2, Dp.m3775constructorimpl(36)), 0.0f, null, false, composer2, 262192, 28);
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(8), r12, composer2, 6, i3);
                        Composer composer3 = composer2;
                        oooO00o.OooOOOo((String) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.getUserName(), r12, composer2, 8, 1).getValue(), p193o00o0O0O.o0000oo.OooO0OO(composer2).f38625OooOO0, false, TextUnitKt.getSp(i2), 0, 0, null, false, rowScopeInstance.weight(companion2, 1.0f, false), composer2, 1073744896, 244);
                        float f2 = 5;
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f2), null, composer3, 6, 2);
                        oO000O0O oo000o0o = oO000O0O.f53112OooO00o;
                        oo000o0o.OooO00o((Integer) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.getMemberLevel(), null, composer3, 8, 1).getValue(), (String) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.getBadgeUrl(), null, composer3, 8, 1).getValue(), TextUnitKt.getSp(9), ((Boolean) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.isTopRank(), null, composer3, 8, 1).getValue()).booleanValue(), SizeKt.m525size3ABfNKs(companion2, Dp.m3775constructorimpl(19)), composer3, 221568, 0);
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f2), null, composer3, 6, 2);
                        oooO00o.OooOOO0((Integer) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.getUserLevel(), null, composer3, 8, 1).getValue(), 0L, 0L, null, composer3, ShareRequest.THUMB_DATA_SIZE_LIMIT, 14);
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f2), null, composer3, 6, 2);
                        composer3.startReplaceableGroup(-539555202);
                        if (z2 != 0) {
                            oo000o0o.OooO0OO(((Number) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.getRankWeek(), null, composer3, 8, 1).getValue()).intValue(), ((Number) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.getRankDay(), null, composer3, 8, 1).getValue()).intValue(), SizeKt.m527sizeVpY3zN4(companion2, Dp.m3775constructorimpl(24), Dp.m3775constructorimpl(i2)), composer3, 3456, 0);
                            oooO00o.OooOo(((Number) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.getWealthLevel(), null, composer3, 8, 1).getValue()).intValue(), (String) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.getWealthBadgeWithBg(), null, composer3, 8, 1).getValue(), null, 0L, composer3, ShareRequest.THUMB_DATA_SIZE_LIMIT, 12);
                            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f2), null, composer3, 6, 2);
                            oO0OO.OooO00o.OooOo0((Integer) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.getVipState(), null, composer3, 8, 1).getValue(), (Integer) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.getVipLevel(), null, composer3, 8, 1).getValue(), (Boolean) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.getShowVIP(), null, composer3, 8, 1).getValue(), 0.0f, null, composer3, 262144, 24);
                            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f2), null, composer3, 6, 2);
                            oO0OO.OooO00o.OooOOo((Boolean) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.isPremium(), null, composer3, 8, 1).getValue(), (Integer) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.getPremiumLevel(), null, composer3, 8, 1).getValue(), false, 0.0f, null, composer3, 262144, 28);
                        }
                        o00O000o.OooO00o(composer3);
                        if (z2) {
                            composer3.startReplaceableGroup(-539553332);
                            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(20), null, composer3, 6, 2);
                            Painter painterPainterResource = PainterResources_androidKt.painterResource(p562o0oOo000.o0O0O00.ic_apply_mic_invite, composer3, 0);
                            Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m527sizeVpY3zN4(companion2, Dp.m3775constructorimpl(40), Dp.m3775constructorimpl(28)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null);
                            Long lValueOf2 = Long.valueOf((long) r32);
                            composer3.startReplaceableGroup(1157296644);
                            boolean zChanged2 = composer3.changed(lValueOf2);
                            Object objRememberedValue2 = composer3.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new o00OO000(jLongValue);
                                composer3.updateRememberedValue(objRememberedValue2);
                            }
                            composer3.endReplaceableGroup();
                            ImageKt.Image(painterPainterResource, (String) null, PaddingKt.m479paddingVpY3zN4(o0O0O00.OooO0O0(modifierM171backgroundbw27NRU$default, false, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 255), Dp.m3775constructorimpl(11), Dp.m3775constructorimpl(f2)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                            composer3.endReplaceableGroup();
                        } else {
                            composer3.startReplaceableGroup(-539550083);
                            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f), null, composer3, 6, 2);
                            composer3.endReplaceableGroup();
                        }
                        o0ooOOo.OooO00o(composer3);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                return Unit.INSTANCE;
            }
        }));
        return Unit.INSTANCE;
    }
}
