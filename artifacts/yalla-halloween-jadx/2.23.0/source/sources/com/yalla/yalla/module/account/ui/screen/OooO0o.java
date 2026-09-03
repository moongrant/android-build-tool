package com.yalla.yalla.module.account.ui.screen;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.material.TextFieldImplKt;
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
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.code.android.util.o0O0O00;
import com.facebook.OooOo;
import com.yalla.yalla.model.DeleteAccountReasonChooseModel;
import com.yalla.yalla.ui.vm.account.DeleteAccountReasonChooseVM;
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
import p417o0OoO0.o00Oo0;
import p579o0oOoo.oO0Ooooo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nDeleteAccountReasonFirstChooseScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeleteAccountReasonFirstChooseScreen.kt\ncom/yalla/yalla/module/account/ui/screen/DeleteAccountReasonFirstChooseScreen$MainContainer$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,162:1\n154#2:163\n154#2:164\n154#2:196\n154#2:197\n154#2:198\n76#3,2:165\n78#3:195\n82#3:203\n78#4,11:167\n91#4:202\n456#5,8:178\n464#5,3:192\n467#5,3:199\n4144#6,6:186\n*S KotlinDebug\n*F\n+ 1 DeleteAccountReasonFirstChooseScreen.kt\ncom/yalla/yalla/module/account/ui/screen/DeleteAccountReasonFirstChooseScreen$MainContainer$1$1\n*L\n124#1:163\n126#1:164\n140#1:196\n143#1:197\n150#1:198\n121#1:165,2\n121#1:195\n121#1:203\n121#1:167,11\n121#1:202\n121#1:178,8\n121#1:192,3\n121#1:199,3\n121#1:186,6\n*E\n"})
public final class OooO0o extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ DeleteAccountReasonChooseVM f23633OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(DeleteAccountReasonChooseVM deleteAccountReasonChooseVM) {
        super(4);
        this.f23633OooO0Oo = deleteAccountReasonChooseVM;
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
                ComposerKt.traceEventStart(-1542439203, iIntValue2, -1, "com.yalla.yalla.module.account.ui.screen.DeleteAccountReasonFirstChooseScreen.MainContainer.<anonymous>.<anonymous> (DeleteAccountReasonFirstChooseScreen.kt:118)");
            }
            DeleteAccountReasonChooseVM deleteAccountReasonChooseVM = this.f23633OooO0Oo;
            DeleteAccountReasonChooseModel deleteAccountReasonChooseModel = deleteAccountReasonChooseVM.getCancelReasonList().get(iIntValue);
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 12;
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(SizeKt.m509height3ABfNKs(BackgroundKt.m169backgroundbw27NRU$default(OooOo.OooO0O0(f, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null)), o000OOo.OooO0OO(composer2).f37703OooO0O0, null, 2, null), Dp.m3765constructorimpl(TextFieldImplKt.AnimationDuration)), false, false, 0L, false, null, null, null, new OooO0OO(deleteAccountReasonChooseModel, deleteAccountReasonChooseVM), 253);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            composer2.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyColumnMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ImageKt.Image(o00Oo0.OooO0Oo(deleteAccountReasonChooseModel.getPic(), null, composer2, 0, 1), (String) null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(48)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 432, 120);
            com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(10), null, composer2, 6, 2);
            String title = deleteAccountReasonChooseModel.getTitle();
            if (title == null) {
                title = "";
            }
            TextKt.m1251Text4IGK_g(title, PaddingKt.m478paddingVpY3zN4$default(companion, Dp.m3765constructorimpl(f), 0.0f, 2, null), o000OOo.OooO0OO(composer2).f37701OooO, oO0Ooooo.OooO0O0(14, composer2), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 196656, 0, 130512);
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
