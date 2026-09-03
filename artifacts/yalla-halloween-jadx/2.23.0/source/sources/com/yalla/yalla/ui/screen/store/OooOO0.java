package com.yalla.yalla.ui.screen.store;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.LifecycleOwner;
import com.code.android.util.o0O0O00;
import com.facebook.OooOo;
import com.yalla.yalla.model.StoreRoomChatBubbleModel;
import com.yalla.yalla.ui.vm.user.StoreRoomChatBubbleMineVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p469o0OoooOO.o0oO0O0o;
import p571o0oOoOO.o0O0OOO0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nStoreChatBubbleMineScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoreChatBubbleMineScreen.kt\ncom/yalla/yalla/ui/screen/store/StoreChatBubbleMineScreen$MainContent$2$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,380:1\n154#2:381\n154#2:382\n154#2:383\n154#2:384\n72#3,6:385\n78#3:419\n82#3:424\n78#4,11:391\n91#4:423\n456#5,8:402\n464#5,3:416\n467#5,3:420\n4144#6,6:410\n*S KotlinDebug\n*F\n+ 1 StoreChatBubbleMineScreen.kt\ncom/yalla/yalla/ui/screen/store/StoreChatBubbleMineScreen$MainContent$2$1$1\n*L\n123#1:381\n125#1:382\n127#1:383\n128#1:384\n119#1:385,6\n119#1:419\n119#1:424\n119#1:391,11\n119#1:423\n119#1:402,8\n119#1:416,3\n119#1:420,3\n119#1:410,6\n*E\n"})
public final class OooOO0 extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O0.OooO0O0<StoreRoomChatBubbleModel> f29693OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0O0OOO0 f29694OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ StoreRoomChatBubbleMineVM f29695OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f29696OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(o000O0.OooO0O0<StoreRoomChatBubbleModel> oooO0O0, StoreRoomChatBubbleMineVM storeRoomChatBubbleMineVM, o0O0OOO0 o0o0ooo0, LifecycleOwner lifecycleOwner) {
        super(4);
        this.f29693OooO0Oo = oooO0O0;
        this.f29695OooO0o0 = storeRoomChatBubbleMineVM;
        this.f29694OooO0o = o0o0ooo0;
        this.f29696OooO0oO = lifecycleOwner;
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
                ComposerKt.traceEventStart(782755049, iIntValue2, -1, "com.yalla.yalla.ui.screen.store.StoreChatBubbleMineScreen.MainContent.<anonymous>.<anonymous>.<anonymous> (StoreChatBubbleMineScreen.kt:116)");
            }
            StoreRoomChatBubbleModel storeRoomChatBubbleModelOooO00o = this.f29693OooO0Oo.OooO00o(iIntValue);
            if (storeRoomChatBubbleModelOooO00o != null) {
                float f = 4;
                Modifier modifierOooO0O0 = o0O0O00.OooO0O0(OooOo.OooO0O0(6, PaddingKt.m476padding3ABfNKs(BorderKt.m180borderxT4_qwU(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3765constructorimpl(f), storeRoomChatBubbleModelOooO00o.getSelected() ? o0oO0O0o.f46997Ooooo0o : o0oO0O0o.f46945OooO00o, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(10))), Dp.m3765constructorimpl(f))), false, false, 0L, false, null, null, null, new OooO(storeRoomChatBubbleModelOooO00o, this.f29695OooO0o0, this.f29694OooO0o, this.f29696OooO0oO), 253);
                StoreRoomChatBubbleMineVM storeRoomChatBubbleMineVM = this.f29695OooO0o0;
                o0O0OOO0 o0o0ooo0 = this.f29694OooO0o;
                LifecycleOwner lifecycleOwner = this.f29696OooO0oO;
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                StoreChatBubbleMineScreen storeChatBubbleMineScreen = StoreChatBubbleMineScreen.INSTANCE;
                storeChatBubbleMineScreen.ItemBubbleInfo(storeRoomChatBubbleModelOooO00o, composer2, 56);
                storeChatBubbleMineScreen.ItemBubbleUseButton(storeRoomChatBubbleModelOooO00o, storeRoomChatBubbleMineVM, o0o0ooo0, lifecycleOwner, composer2, 29256);
                if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            } else if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
