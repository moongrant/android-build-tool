package com.yalla.yalla.ui.activity.moment;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.vm.moment.MomentRecordEditVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p469o0OoooOO.o0oO0O0o;
import p509o0o0O0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentEditRecordScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentEditRecordScreen.kt\ncom/yalla/yalla/ui/activity/moment/MomentEditRecordScreen$ListContent$3$2$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,143:1\n171#2,12:144\n*S KotlinDebug\n*F\n+ 1 MomentEditRecordScreen.kt\ncom/yalla/yalla/ui/activity/moment/MomentEditRecordScreen$ListContent$3$2$1\n*L\n108#1:144,12\n*E\n"})
public final class Oooo0 extends Lambda implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentRecordEditVM f26233OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<p515o0o0O0O0.o0Oo0oo> f26234OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f26235OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ long f26236OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f26237OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(MomentRecordEditVM momentRecordEditVM, FragmentActivity fragmentActivity, MutableState<p515o0o0O0O0.o0Oo0oo> mutableState, long j, int i) {
        super(1);
        this.f26233OooO0Oo = momentRecordEditVM;
        this.f26235OooO0o0 = fragmentActivity;
        this.f26234OooO0o = mutableState;
        this.f26236OooO0oO = j;
        this.f26237OooO0oo = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyColumn = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        MomentRecordEditVM momentRecordEditVM = this.f26233OooO0Oo;
        final SnapshotStateList<MomentDetailModel> listData = momentRecordEditVM.getListData();
        int size = listData.size();
        Function1<Integer, Object> function1 = new Function1<Integer, Object>() { // from class: com.yalla.yalla.ui.activity.moment.MomentEditRecordScreen$ListContent$3$2$1$invoke$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Integer num) {
                listData.get(num.intValue());
                return null;
            }
        };
        final FragmentActivity fragmentActivity = this.f26235OooO0o0;
        final MutableState<p515o0o0O0O0.o0Oo0oo> mutableState = this.f26234OooO0o;
        LazyColumn.items(size, null, function1, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yalla.yalla.ui.activity.moment.MomentEditRecordScreen$ListContent$3$2$1$invoke$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public final Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                int i;
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
                    int i2 = (i & 112) | (i & 14);
                    MomentDetailModel momentDetailModel = (MomentDetailModel) listData.get(iIntValue);
                    composer2.startReplaceableGroup(-483455358);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composer2, 0, -1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
                    Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                    if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    o0000oo.OooO00o(momentDetailModel, iIntValue, MomentEditRecordScreen.ListContent$lambda$3(mutableState), MomentAdapterTag.MomentEditRecord, fragmentActivity, EnterRoomParentPage.Moments_Other_SharedRoom, null, false, false, null, false, 0L, null, null, null, null, composer2, (i2 & 112) | 1805832, 0, 65408);
                    com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl((float) 0.5d), BackgroundKt.m169backgroundbw27NRU$default(PaddingKt.m480paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(15), 0.0f, 0.0f, 0.0f, 14, null), o0oO0O0o.f47083o000o0o0, null, 2, null), composer2, 6, 0);
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
        }));
        if (momentRecordEditVM.getListData().size() > 0) {
            LazyListScope.CC.OooO(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(315383475, true, new Oooo000(momentRecordEditVM, this.f26236OooO0oO, this.f26237OooO0oo)), 3, null);
        }
        return Unit.INSTANCE;
    }
}
