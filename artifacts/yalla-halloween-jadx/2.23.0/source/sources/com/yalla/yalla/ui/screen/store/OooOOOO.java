package com.yalla.yalla.ui.screen.store;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.code.android.util.o0O0O00;
import com.facebook.OooOo;
import com.yalla.yalla.model.StoreRoomChatBubbleModel;
import com.yalla.yalla.ui.vm.user.StoreRoomChatBubbleVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nStoreChatBubbleScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoreChatBubbleScreen.kt\ncom/yalla/yalla/ui/screen/store/StoreChatBubbleScreen$Content$1$1$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,517:1\n154#2:518\n72#3,6:519\n78#3:553\n82#3:558\n78#4,11:525\n91#4:557\n456#5,8:536\n464#5,3:550\n467#5,3:554\n4144#6,6:544\n*S KotlinDebug\n*F\n+ 1 StoreChatBubbleScreen.kt\ncom/yalla/yalla/ui/screen/store/StoreChatBubbleScreen$Content$1$1$2\n*L\n119#1:518\n116#1:519,6\n116#1:553\n116#1:558\n116#1:525,11\n116#1:557\n116#1:536,8\n116#1:550,3\n116#1:554,3\n116#1:544,6\n*E\n"})
public final class OooOOOO extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O0.OooO0O0<StoreRoomChatBubbleModel> f29704OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ StoreRoomChatBubbleVM f29705OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(o000O0.OooO0O0<StoreRoomChatBubbleModel> oooO0O0, StoreRoomChatBubbleVM storeRoomChatBubbleVM) {
        super(4);
        this.f29704OooO0Oo = oooO0O0;
        this.f29705OooO0o0 = storeRoomChatBubbleVM;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
        int i;
        LazyGridItemScope items = lazyGridItemScope;
        int iIntValue = num.intValue();
        Composer composer2 = composer;
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((iIntValue2 & 112) == 0) {
            i = (composer2.changed(iIntValue) ? 32 : 16) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((i & 721) == 144 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1335563456, iIntValue2, -1, "com.yalla.yalla.ui.screen.store.StoreChatBubbleScreen.Content.<anonymous>.<anonymous>.<anonymous> (StoreChatBubbleScreen.kt:113)");
            }
            StoreRoomChatBubbleModel storeRoomChatBubbleModelOooO00o = this.f29704OooO0Oo.OooO00o(iIntValue);
            if (storeRoomChatBubbleModelOooO00o != null) {
                Modifier modifierOooO0O0 = OooOo.OooO0O0(6, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null));
                StoreRoomChatBubbleVM storeRoomChatBubbleVM = this.f29705OooO0o0;
                Modifier modifierOooO0O1 = o0O0O00.OooO0O0(modifierOooO0O0, false, false, 0L, false, null, null, null, new OooOOO(storeRoomChatBubbleModelOooO00o, storeRoomChatBubbleVM), 253);
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO0O1);
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
                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                StoreChatBubbleScreen storeChatBubbleScreen = StoreChatBubbleScreen.INSTANCE;
                storeChatBubbleScreen.ItemBubbleInfo(storeRoomChatBubbleModelOooO00o, composer2, 72);
                storeChatBubbleScreen.ItemBubbleBuyButton(storeRoomChatBubbleModelOooO00o, storeRoomChatBubbleVM, composer2, 584);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
