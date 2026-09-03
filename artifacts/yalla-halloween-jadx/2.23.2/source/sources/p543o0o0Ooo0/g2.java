package p543o0o0Ooo0;

import android.content.Context;
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
import p475o0Ooooo0.o0O00oO0;
import p476o0OooooO.o0OOo000;
import p496o0o00Oo0.oOOO0O0o;
import p519o0o0O0OO.oo0oOO0;
import p521o0o0O0o0.o000OO;
import p543o0o0Ooo0.d2;
import p543o0o0Ooo0.o2;
import p590o0oOooo0.l;
import p602o0oo00oo.o0000OO0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nUserMomentListScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserMomentListScreen.kt\ncom/yalla/yalla/ui/screen/user/UserMomentListScreenKt$UserMomentListContent$1$4$2$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,537:1\n136#2,12:538\n171#2,12:550\n171#2,12:562\n*S KotlinDebug\n*F\n+ 1 UserMomentListScreen.kt\ncom/yalla/yalla/ui/screen/user/UserMomentListScreenKt$UserMomentListContent$1$4$2$1\n*L\n261#1:538,12\n284#1:550,12\n307#1:562,12\n*E\n"})
public final class g2 extends Lambda implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ MutableState<l> f55415OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentUserListVM f55416OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Context f55417OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f55418OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f55419OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<o000OO> f55420OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(MomentUserListVM momentUserListVM, String str, Context context, FragmentActivity fragmentActivity, MutableState<o000OO> mutableState, MutableState<l> mutableState2) {
        super(1);
        this.f55416OooO0Oo = momentUserListVM;
        this.f55418OooO0o0 = str;
        this.f55417OooO0o = context;
        this.f55419OooO0oO = fragmentActivity;
        this.f55420OooO0oo = mutableState;
        this.f55415OooO = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyColumn = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        MomentUserListVM momentUserListVM = this.f55416OooO0Oo;
        boolean z = !momentUserListVM.getTopicList3().isEmpty();
        String str = this.f55418OooO0o0;
        if (z) {
            LazyListScope.CC.OooO(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1598730929, true, new b2(this.f55417OooO0o, str)), 3, null);
        }
        final SnapshotStateList<TopicInfoModel> topicList3 = momentUserListVM.getTopicList3();
        final UserMomentListScreenKt$UserMomentListContent$1$4$2$1$invoke$$inlined$items$default$1 userMomentListScreenKt$UserMomentListContent$1$4$2$1$invoke$$inlined$items$default$1 = UserMomentListScreenKt$UserMomentListContent$1$4$2$1$invoke$$inlined$items$default$1.f29594OooO0Oo;
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
                    o2.OooO0OO((TopicInfoModel) topicList3.get(iIntValue), composer2, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                return Unit.INSTANCE;
            }
        }));
        if (!momentUserListVM.getListData().isEmpty() || momentUserListVM.getScreenCurrent().getValue().getType() != -1) {
            LazyListScope.CC.OooO(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-3319624, true, new c2(momentUserListVM)), 3, null);
        }
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (oOOO0O0o.OooO00o(str)) {
            final SnapshotStateList<MomentDetailModel> snapshotStateList = o0000OO0.f57385OooO00o;
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
                final FragmentActivity fragmentActivity = this.f55419OooO0oO;
                final MutableState<o000OO> mutableState = this.f55420OooO0oo;
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
                            MeasurePolicy measurePolicyOooO0O0 = p022Oooo00O.o0O00oO0.OooO0O0(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composer2, 0, -1323940314);
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
                            oo0oOO0.OooO00o(momentDetailModel, iIntValue, (o000OO) mutableState.getValue(), null, fragmentActivity, null, null, false, false, null, false, 0L, null, null, null, null, composer2, (i2 & 112) | 1805832, 0, 65408);
                            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl((float) 0.5d), BackgroundKt.m171backgroundbw27NRU$default(PaddingKt.m482paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(15), 0.0f, 0.0f, 0.0f, 14, null), o0OOo000.f48274o000o0oo, null, 2, null), composer2, 6, 0);
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
        final FragmentActivity fragmentActivity2 = this.f55419OooO0oO;
        final MutableState<l> mutableState2 = this.f55415OooO;
        final MomentUserListVM momentUserListVM2 = this.f55416OooO0Oo;
        final MutableState<o000OO> mutableState3 = this.f55420OooO0oo;
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
                    MeasurePolicy measurePolicyOooO0O0 = p022Oooo00O.o0O00oO0.OooO0O0(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composer2, 0, -1323940314);
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
                    o000OO o000oo2 = (o000OO) mutableState3.getValue();
                    MomentAdapterTag momentAdapterTag = MomentAdapterTag.UserPostListActivity;
                    FragmentActivity fragmentActivity3 = fragmentActivity2;
                    EnterRoomParentPage enterRoomParentPage = EnterRoomParentPage.Moments_Other_SharedRoom;
                    composer2.startReplaceableGroup(1157296644);
                    MutableState mutableState4 = mutableState2;
                    boolean zChanged = composer2.changed(mutableState4);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new d2(mutableState4);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    oo0oOO0.OooO00o(momentDetailModel, iIntValue, o000oo2, momentAdapterTag, fragmentActivity3, enterRoomParentPage, (Function1) objRememberedValue, false, false, null, false, 0L, null, Long.valueOf(momentUserListVM2.getTopPostId()), null, null, composer2, (i2 & 112) | 232968, 0, 57216);
                    com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl((float) 0.5d), BackgroundKt.m171backgroundbw27NRU$default(PaddingKt.m482paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(15), 0.0f, 0.0f, 0.0f, 14, null), o0OOo000.f48274o000o0oo, null, 2, null), composer2, 6, 0);
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
        if (momentUserListVM.getListData().size() > 0 || (!o0000OO0.f57385OooO00o.isEmpty())) {
            LazyListScope.CC.OooO(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(460017398, true, new f2(momentUserListVM)), 3, null);
        } else {
            LazyListScope.CC.OooO(LazyColumn, null, null, oOO0OoO0.f55512OooO00o, 3, null);
        }
        return Unit.INSTANCE;
    }
}
