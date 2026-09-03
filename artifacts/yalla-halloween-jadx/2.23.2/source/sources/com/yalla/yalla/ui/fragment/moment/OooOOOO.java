package com.yalla.yalla.ui.fragment.moment;

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
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.vm.moment.MomentFollowingVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p022Oooo00O.o0O00oO0;
import p476o0OooooO.o0OOo000;
import p519o0o0O0OO.oo0oOO0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMainMomentFollowingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainMomentFollowingFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentFollowingFragment$initView$3$1$5$2$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,355:1\n171#2,12:356\n171#2,12:368\n*S KotlinDebug\n*F\n+ 1 MainMomentFollowingFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentFollowingFragment$initView$3$1$5$2$1\n*L\n244#1:356,12\n267#1:368,12\n*E\n"})
public final class OooOOOO extends Lambda implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentFollowingVM f28278OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<p521o0o0O0o0.o000OO> f28279OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MainMomentFollowingFragment f28280OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Dp> f28281OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(MomentFollowingVM momentFollowingVM, MainMomentFollowingFragment mainMomentFollowingFragment, MutableState<p521o0o0O0o0.o000OO> mutableState, MutableState<Dp> mutableState2) {
        super(1);
        this.f28278OooO0Oo = momentFollowingVM;
        this.f28280OooO0o0 = mainMomentFollowingFragment;
        this.f28279OooO0o = mutableState;
        this.f28281OooO0oO = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyColumn = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final SnapshotStateList<MomentDetailModel> snapshotStateList = p602o0oo00oo.o0000OO0.f57385OooO00o;
        boolean z = !snapshotStateList.isEmpty();
        final MutableState<p521o0o0O0o0.o000OO> mutableState = this.f28279OooO0o;
        final MainMomentFollowingFragment mainMomentFollowingFragment = this.f28280OooO0o0;
        if (z) {
            LazyColumn.items(snapshotStateList.size(), null, new Function1<Integer, Object>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentFollowingFragment$initView$3$1$5$2$1$invoke$$inlined$itemsIndexed$default$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Integer num) {
                    snapshotStateList.get(num.intValue());
                    return null;
                }
            }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentFollowingFragment$initView$3$1$5$2$1$invoke$$inlined$itemsIndexed$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                /* JADX WARN: Multi-variable type inference failed */
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
                        MomentDetailModel momentDetailModel = (MomentDetailModel) snapshotStateList.get(iIntValue);
                        composer2.startReplaceableGroup(-483455358);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composer2, 0, -1323940314);
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
                        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        oo0oOO0.OooO00o(momentDetailModel, iIntValue, (p521o0o0O0o0.o000OO) mutableState.getValue(), null, mainMomentFollowingFragment.getActivity(), null, null, false, false, null, false, o0OOo000.f48134OooO00o, null, null, null, null, composer2, (i2 & 112) | 1805832, 0, 63360);
                        com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl((float) 0.5d), BackgroundKt.m171backgroundbw27NRU$default(PaddingKt.m482paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(15), 0.0f, 0.0f, 0.0f, 14, null), p193o00o0O0O.o0000oo.OooO0OO(composer2).f38621OooO0o, null, 2, null), composer2, 6, 0);
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
        }
        final MomentFollowingVM momentFollowingVM = this.f28278OooO0Oo;
        final SnapshotStateList<MomentDetailModel> listData = momentFollowingVM.getListData();
        LazyColumn.items(listData.size(), null, new Function1<Integer, Object>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentFollowingFragment$initView$3$1$5$2$1$invoke$$inlined$itemsIndexed$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Integer num) {
                listData.get(num.intValue());
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentFollowingFragment$initView$3$1$5$2$1$invoke$$inlined$itemsIndexed$default$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            /* JADX WARN: Multi-variable type inference failed */
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
                    MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composer2, 0, -1323940314);
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
                    Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                    Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
                    if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    p521o0o0O0o0.o000OO o000oo2 = (p521o0o0O0o0.o000OO) mutableState.getValue();
                    MomentAdapterTag value = momentFollowingVM.getMomentAdapterTag().getValue();
                    MainMomentFollowingFragment mainMomentFollowingFragment2 = mainMomentFollowingFragment;
                    oo0oOO0.OooO00o(momentDetailModel, iIntValue, o000oo2, value, mainMomentFollowingFragment2.getActivity(), EnterRoomParentPage.Moments_Following_SharedRoom, new OooOO0(mainMomentFollowingFragment2), false, false, null, false, o0OOo000.f48134OooO00o, null, null, null, null, composer2, (i2 & 112) | 229896, 0, 63360);
                    com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl((float) 0.5d), BackgroundKt.m171backgroundbw27NRU$default(PaddingKt.m482paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(15), 0.0f, 0.0f, 0.0f, 14, null), p193o00o0O0O.o0000oo.OooO0OO(composer2).f38621OooO0o, null, 2, null), composer2, 6, 0);
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
        if (momentFollowingVM.getListData().size() > 0 || (!snapshotStateList.isEmpty())) {
            LazyListScope.CC.OooO(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1320067553, true, new OooOOO0(momentFollowingVM)), 3, null);
        } else {
            LazyListScope.CC.OooO(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1962276408, true, new OooOOO(this.f28281OooO0oO)), 3, null);
        }
        return Unit.INSTANCE;
    }
}
