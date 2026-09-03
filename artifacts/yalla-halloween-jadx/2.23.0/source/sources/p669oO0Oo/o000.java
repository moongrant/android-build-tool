package p669oO0Oo;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
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
import com.zego.zegoavkit2.ZegoConstants;
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
import p579o0oOoo.oO0Ooooo;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f60426OooO00o = ComposableLambdaKt.composableLambdaInstance(-1641618585, false, OooO00o.f60427OooO0Oo);

    @SourceDebugExtension({"SMAP\nLiveRoomMemberUserRankDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomMemberUserRankDialog.kt\ncom/yalla/yalla/ui/dialog/room/ComposableSingletons$LiveRoomMemberUserRankDialogKt$lambda-1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,508:1\n154#2:509\n154#2:545\n154#2:546\n66#3,6:510\n72#3:544\n76#3:551\n78#4,11:516\n91#4:550\n456#5,8:527\n464#5,3:541\n467#5,3:547\n4144#6,6:535\n*S KotlinDebug\n*F\n+ 1 LiveRoomMemberUserRankDialog.kt\ncom/yalla/yalla/ui/dialog/room/ComposableSingletons$LiveRoomMemberUserRankDialogKt$lambda-1$1\n*L\n337#1:509\n343#1:545\n352#1:546\n335#1:510,6\n335#1:544\n335#1:551\n335#1:516,11\n335#1:550\n335#1:527,8\n335#1:541,3\n335#1:547,3\n335#1:535,6\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<LazyItemScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f60427OooO0Oo = new OooO00o();

        public OooO00o() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            LazyItemScope item = lazyItemScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1641618585, iIntValue, -1, "com.yalla.yalla.ui.dialog.room.ComposableSingletons$LiveRoomMemberUserRankDialogKt.lambda-1.<anonymous> (LiveRoomMemberUserRankDialog.kt:333)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(41)), 0.0f, 1, null);
                composer2.startReplaceableGroup(733328855);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(companion2, false, composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
                Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                float f = 16;
                TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.live_room_member_rank_member, composer2, 0) + ZegoConstants.ZegoVideoDataAuxPublishingStream + Math.max(com.yalla.yalla.service.room.OooO00o.f24986OooOOOO.OooO0o0() - 1, 0), boxScopeInstance.align(PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), companion2.getCenterStart()), o000OOo.OooO0OO(composer2).f37712OooOO0o, oO0Ooooo.OooO0O0(14, composer2), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131056);
                TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.Intimacy_Points, composer2, 0), boxScopeInstance.align(PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m3765constructorimpl(f), 0.0f, 11, null), companion2.getCenterEnd()), o000OOo.OooO0OO(composer2).f37712OooOO0o, oO0Ooooo.OooO0O0(14, composer2), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131056);
                if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }
}
