package p669oO0Oo;

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
import androidx.compose.material.OooO;
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
import p147o00Oo0Oo.o000OOo;
import p426o0OoOO.o000oOoO;
import p445o0OoOoo.o0oOO;
import p464o0Oooo.o000000O;
import p469o0OoooOO.o0oO0O0o;
import p475o0o000.o000000;
import p516o0o0O0OO.o0ooOOo;
import p517o0o0O0o.OooOOOO;
import p584o0oOooO0.oO00OOO;
import p669oO0Oo.o00Oo0;
import p669oO0Oo.o00oO0o;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nLiveRoomApplyMicListDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomApplyMicListDialog.kt\ncom/yalla/yalla/ui/dialog/room/ComposableSingletons$LiveRoomApplyMicListDialogKt$lambda-2$1$2$2$2$4$2$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,369:1\n171#2,12:370\n*S KotlinDebug\n*F\n+ 1 LiveRoomApplyMicListDialog.kt\ncom/yalla/yalla/ui/dialog/room/ComposableSingletons$LiveRoomApplyMicListDialogKt$lambda-2$1$2$2$2$4$2$1\n*L\n197#1:370,12\n*E\n"})
public final class o0ooOOo extends Lambda implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f60771OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0ooOOo(boolean z) {
        super(1);
        this.f60771OooO0Oo = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyColumn = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final boolean z = this.f60771OooO0Oo;
        if (z) {
            o000000 o000000Var = OooO00o.f24979OooO0oO;
            if (o000000Var.OooO0oO() == 0 && (!o000000Var.f47386OooOOo.isEmpty())) {
                LazyListScope.CC.OooO(LazyColumn, null, null, OooOOO0.f60398OooO00o, 3, null);
            }
        }
        final SnapshotStateList<Long> snapshotStateList = OooO00o.f24979OooO0oO.f47386OooOOo;
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
                    ArrayList arrayList = OooO00o.f24973OooO00o;
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
                            objRememberedValue = new o00Oo0(jLongValue);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        float f = 60;
                        Modifier modifierM509height3ABfNKs = SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(o0O0O00.OooO0O0(companion2, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 255), 0.0f, 1, null), Dp.m3765constructorimpl(f));
                        o000000O o000000o2 = o000000O.f46674OooO00o;
                        Long l = (Long) o000000O.OooOOo0().getValue();
                        long j = (l != null && jLongValue == l.longValue()) ? o0oO0O0o.f46995OoooOoo : o0oO0O0o.f46945OooO00o;
                        ?? r12 = 0;
                        Modifier modifierOooO00o = o0oOO.OooO00o(16, BackgroundKt.m169backgroundbw27NRU$default(modifierM509height3ABfNKs, j, null, 2, null), 0.0f, 2, null, composer2, 693286680);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(arrangement, centerVertically, composer2, 48, -1323940314);
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
                        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        Alignment.Vertical centerVertically2 = companion.getCenterVertically();
                        Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(OooOO0O.OooO00o(rowScopeInstance, companion2, 1.0f, false, 2, null), 0.0f, 1, null);
                        composer2.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyOooO00o2 = OooO.OooO00o(arrangement, centerVertically2, composer2, 48, -1323940314);
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
                        Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer2);
                        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
                        if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        }
                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-1163890549);
                        int iOooO0oO = OooO00o.f24979OooO0oO.OooO0oO();
                        boolean z2 = z;
                        if (iOooO0oO <= 0 || !z2) {
                            i2 = 13;
                            i3 = 2;
                        } else {
                            i2 = 13;
                            TextKt.m1251Text4IGK_g(String.valueOf(iIntValue + 1), SizeKt.m528width3ABfNKs(companion2, Dp.m3765constructorimpl(24)), o000OOo.OooO0OO(composer2).f37710OooOO0, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 131056);
                            composer2 = composer2;
                            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(4), null, composer2, 6, 2);
                            i3 = 2;
                            r12 = 0;
                        }
                        composer2.endReplaceableGroup();
                        OooOOOO oooOOOO = OooOOOO.f51970OooO00o;
                        oooOOOO.OooOO0((String) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.getUserHeader(), r12, composer2, 8, 1).getValue(), SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(36)), 0.0f, null, false, composer2, 262192, 28);
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(8), r12, composer2, 6, i3);
                        Composer composer3 = composer2;
                        oooOOOO.OooOOOo((String) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.getUserName(), r12, composer2, 8, 1).getValue(), o000OOo.OooO0OO(composer2).f37710OooOO0, false, TextUnitKt.getSp(i2), 0, 0, null, false, rowScopeInstance.weight(companion2, 1.0f, false), composer2, 1073744896, 244);
                        float f2 = 5;
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f2), null, composer3, 6, 2);
                        o0ooOOo o0ooooo = o0ooOOo.f51940OooO00o;
                        o0ooooo.OooO00o((Integer) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.getMemberLevel(), null, composer3, 8, 1).getValue(), (String) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.getBadgeUrl(), null, composer3, 8, 1).getValue(), TextUnitKt.getSp(9), ((Boolean) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.isTopRank(), null, composer3, 8, 1).getValue()).booleanValue(), SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(19)), composer3, 221568, 0);
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f2), null, composer3, 6, 2);
                        oooOOOO.OooOOO0((Integer) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.getUserLevel(), null, composer3, 8, 1).getValue(), 0L, 0L, null, composer3, ShareRequest.THUMB_DATA_SIZE_LIMIT, 14);
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f2), null, composer3, 6, 2);
                        composer3.startReplaceableGroup(-539555249);
                        if (z2 != 0) {
                            o0ooooo.OooO0OO(((Number) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.getRankWeek(), null, composer3, 8, 1).getValue()).intValue(), ((Number) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.getRankDay(), null, composer3, 8, 1).getValue()).intValue(), SizeKt.m525sizeVpY3zN4(companion2, Dp.m3765constructorimpl(24), Dp.m3765constructorimpl(i2)), composer3, 3456, 0);
                            oooOOOO.OooOo(((Number) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.getWealthLevel(), null, composer3, 8, 1).getValue()).intValue(), (String) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.getWealthBadgeWithBg(), null, composer3, 8, 1).getValue(), null, 0L, composer3, ShareRequest.THUMB_DATA_SIZE_LIMIT, 12);
                            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f2), null, composer3, 6, 2);
                            OooOOOO.OooOo0((Integer) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.getVipState(), null, composer3, 8, 1).getValue(), (Integer) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.getVipLevel(), null, composer3, 8, 1).getValue(), (Boolean) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.getShowVIP(), null, composer3, 8, 1).getValue(), 0.0f, null, composer3, 262144, 24);
                            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f2), null, composer3, 6, 2);
                            OooOOOO.OooOOo((Boolean) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.isPremium(), null, composer3, 8, 1).getValue(), (Integer) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.getPremiumLevel(), null, composer3, 8, 1).getValue(), false, 0.0f, null, composer3, 262144, 28);
                        }
                        p148o00Oo0o.o0ooOOo.OooO00o(composer3);
                        if (z2) {
                            composer3.startReplaceableGroup(-539553533);
                            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(20), null, composer3, 6, 2);
                            Painter painterPainterResource = PainterResources_androidKt.painterResource(oO00OOO.ic_apply_mic_invite, composer3, 0);
                            Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(ClipKt.clip(SizeKt.m525sizeVpY3zN4(companion2, Dp.m3765constructorimpl(40), Dp.m3765constructorimpl(28)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0oO0O0o.f46993OoooOo0, null, 2, null);
                            Long lValueOf2 = Long.valueOf((long) r32);
                            composer3.startReplaceableGroup(1157296644);
                            boolean zChanged2 = composer3.changed(lValueOf2);
                            Object objRememberedValue2 = composer3.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new o00oO0o(jLongValue);
                                composer3.updateRememberedValue(objRememberedValue2);
                            }
                            composer3.endReplaceableGroup();
                            ImageKt.Image(painterPainterResource, (String) null, PaddingKt.m477paddingVpY3zN4(o0O0O00.OooO0O0(modifierM169backgroundbw27NRU$default, false, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 255), Dp.m3765constructorimpl(11), Dp.m3765constructorimpl(f2)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                            composer3.endReplaceableGroup();
                        } else {
                            composer3.startReplaceableGroup(-539550284);
                            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f), null, composer3, 6, 2);
                            composer3.endReplaceableGroup();
                        }
                        o000oOoO.OooO00o(composer3);
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
