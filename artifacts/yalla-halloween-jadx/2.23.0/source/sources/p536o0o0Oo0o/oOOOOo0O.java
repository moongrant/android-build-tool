package p536o0o0Oo0o;

import android.content.Context;
import androidx.camera.core.impl.o00OOO00;
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
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.screen.user.UserMomentListScreenKt$UserMomentListContent$1$4$2$1$invoke$$inlined$items$default$1;
import com.yalla.yalla.ui.vm.moment.MomentUserListVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p464o0Oooo.o000000O;
import p469o0OoooOO.o0oO0O0o;
import p509o0o0O0.o0000oo;
import p515o0o0O0O0.o0Oo0oo;
import p536o0o0Oo0o.O0OO00;
import p536o0o0Oo0o.oOOO0OO0;
import p579o0oOoo.oO0O0O00;
import p596o0oo00o.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nUserMomentListScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserMomentListScreen.kt\ncom/yalla/yalla/ui/screen/user/UserMomentListScreenKt$UserMomentListContent$1$4$2$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,537:1\n136#2,12:538\n171#2,12:550\n171#2,12:562\n*S KotlinDebug\n*F\n+ 1 UserMomentListScreen.kt\ncom/yalla/yalla/ui/screen/user/UserMomentListScreenKt$UserMomentListContent$1$4$2$1\n*L\n261#1:538,12\n284#1:550,12\n307#1:562,12\n*E\n"})
public final class oOOOOo0O extends Lambda implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ MutableState<oO0O0O00> f55223OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentUserListVM f55224OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Context f55225OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f55226OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f55227OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<o0Oo0oo> f55228OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOOOo0O(MomentUserListVM momentUserListVM, String str, Context context, FragmentActivity fragmentActivity, MutableState<o0Oo0oo> mutableState, MutableState<oO0O0O00> mutableState2) {
        super(1);
        this.f55224OooO0Oo = momentUserListVM;
        this.f55226OooO0o0 = str;
        this.f55225OooO0o = context;
        this.f55227OooO0oO = fragmentActivity;
        this.f55228OooO0oo = mutableState;
        this.f55223OooO = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyColumn = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        MomentUserListVM momentUserListVM = this.f55224OooO0Oo;
        boolean z = !momentUserListVM.getTopicList3().isEmpty();
        String str = this.f55226OooO0o0;
        if (z) {
            LazyListScope.CC.OooO(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1598730929, true, new oOOO00o0(this.f55225OooO0o, str)), 3, null);
        }
        final SnapshotStateList<TopicInfoModel> topicList3 = momentUserListVM.getTopicList3();
        final UserMomentListScreenKt$UserMomentListContent$1$4$2$1$invoke$$inlined$items$default$1 userMomentListScreenKt$UserMomentListContent$1$4$2$1$invoke$$inlined$items$default$1 = UserMomentListScreenKt$UserMomentListContent$1$4$2$1$invoke$$inlined$items$default$1.f30138OooO0Oo;
        LazyColumn.items(topicList3.size(), null, new Function1<Integer, Object>() { // from class: com.yalla.yalla.ui.screen.user.UserMomentListScreenKt$UserMomentListContent$1$4$2$1$invoke$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Integer num) {
                return userMomentListScreenKt$UserMomentListContent$1$4$2$1$invoke$$inlined$items$default$1.invoke(topicList3.get(num.intValue()));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yalla.yalla.ui.screen.user.UserMomentListScreenKt$UserMomentListContent$1$4$2$1$invoke$$inlined$items$default$4
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
                        ComposerKt.traceEventStart(-632812321, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:144)");
                    }
                    O0OO00.OooO0OO((TopicInfoModel) topicList3.get(iIntValue), composer2, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                return Unit.INSTANCE;
            }
        }));
        if (!momentUserListVM.getListData().isEmpty() || momentUserListVM.getScreenCurrent().getValue().getType() != -1) {
            LazyListScope.CC.OooO(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-3319624, true, new oOOO0O0o(momentUserListVM)), 3, null);
        }
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (o00OOO00.OooO0O0(str)) {
            final SnapshotStateList<MomentDetailModel> snapshotStateList = OooOOOO.f56843OooO00o;
            if (!snapshotStateList.isEmpty()) {
                int size = snapshotStateList.size();
                Function1<Integer, Object> function1 = new Function1<Integer, Object>() { // from class: com.yalla.yalla.ui.screen.user.UserMomentListScreenKt$UserMomentListContent$1$4$2$1$invoke$$inlined$itemsIndexed$default$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Integer num) {
                        snapshotStateList.get(num.intValue());
                        return null;
                    }
                };
                final FragmentActivity fragmentActivity = this.f55227OooO0oO;
                final MutableState<o0Oo0oo> mutableState = this.f55228OooO0oo;
                LazyColumn.items(size, null, function1, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yalla.yalla.ui.screen.user.UserMomentListScreenKt$UserMomentListContent$1$4$2$1$invoke$$inlined$itemsIndexed$default$3
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
                            o0000oo.OooO00o(momentDetailModel, iIntValue, (o0Oo0oo) mutableState.getValue(), null, fragmentActivity, null, null, false, false, null, false, 0L, null, null, null, null, composer2, (i2 & 112) | 1805832, 0, 65408);
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
            }
        }
        final SnapshotStateList<MomentDetailModel> listData = momentUserListVM.getListData();
        final FragmentActivity fragmentActivity2 = this.f55227OooO0oO;
        final MutableState<oO0O0O00> mutableState2 = this.f55223OooO;
        final MomentUserListVM momentUserListVM2 = this.f55224OooO0Oo;
        final MutableState<o0Oo0oo> mutableState3 = this.f55228OooO0oo;
        LazyColumn.items(listData.size(), null, new Function1<Integer, Object>() { // from class: com.yalla.yalla.ui.screen.user.UserMomentListScreenKt$UserMomentListContent$1$4$2$1$invoke$$inlined$itemsIndexed$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Integer num) {
                listData.get(num.intValue());
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yalla.yalla.ui.screen.user.UserMomentListScreenKt$UserMomentListContent$1$4$2$1$invoke$$inlined$itemsIndexed$default$6
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
                    o0Oo0oo o0oo0oo2 = (o0Oo0oo) mutableState3.getValue();
                    MomentAdapterTag momentAdapterTag = MomentAdapterTag.UserPostListActivity;
                    FragmentActivity fragmentActivity3 = fragmentActivity2;
                    EnterRoomParentPage enterRoomParentPage = EnterRoomParentPage.Moments_Other_SharedRoom;
                    composer2.startReplaceableGroup(1157296644);
                    MutableState mutableState4 = mutableState2;
                    boolean zChanged = composer2.changed(mutableState4);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new oOOO0OO0(mutableState4);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    o0000oo.OooO00o(momentDetailModel, iIntValue, o0oo0oo2, momentAdapterTag, fragmentActivity3, enterRoomParentPage, (Function1) objRememberedValue, false, false, null, false, 0L, null, Long.valueOf(momentUserListVM2.getTopPostId()), null, null, composer2, (i2 & 112) | 232968, 0, 57216);
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
        if (momentUserListVM.getListData().size() > 0 || (!OooOOOO.f56843OooO00o.isEmpty())) {
            LazyListScope.CC.OooO(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(460017398, true, new oOOOoo00(momentUserListVM)), 3, null);
        } else {
            LazyListScope.CC.OooO(LazyColumn, null, null, o0OOO0OO.f54994OooO00o, 3, null);
        }
        return Unit.INSTANCE;
    }
}
