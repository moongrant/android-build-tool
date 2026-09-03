package p485o0o00O0;

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
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
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
import com.yalla.yalla.ui.vm.moment.TopicDetailVM;
import com.yalla.yalla.ui.vm.moment.TopicPopularMomentVM;
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
import p469o0OoooOO.o0oO0O0o;
import p485o0o00O0.oO0O00O;
import p509o0o0O0.o0000oo;
import p515o0o0O0O0.o0Oo0oo;
import p579o0oOoo.oO0O0O00;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nTopicDetailContentComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicDetailContentComp.kt\ncom/yalla/yalla/ui/activity/moment/TopicDetailContentCompKt$TopicDetailContent$2$1$4$2$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,212:1\n171#2,12:213\n*S KotlinDebug\n*F\n+ 1 TopicDetailContentComp.kt\ncom/yalla/yalla/ui/activity/moment/TopicDetailContentCompKt$TopicDetailContent$2$1$4$2$1\n*L\n118#1:213,12\n*E\n"})
public final class oO0O0 extends Lambda implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Long f48061OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicPopularMomentVM f48062OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f48063OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f48064OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<oO0O0O00> f48065OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ TopicDetailVM f48066OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ int f48067OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ MutableState<o0Oo0oo> f48068OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ int f48069OooOO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O0(TopicPopularMomentVM topicPopularMomentVM, int i, FragmentActivity fragmentActivity, MutableState<oO0O0O00> mutableState, TopicDetailVM topicDetailVM, Long l, int i2, MutableState<o0Oo0oo> mutableState2, int i3) {
        super(1);
        this.f48062OooO0Oo = topicPopularMomentVM;
        this.f48064OooO0o0 = i;
        this.f48063OooO0o = fragmentActivity;
        this.f48065OooO0oO = mutableState;
        this.f48066OooO0oo = topicDetailVM;
        this.f48061OooO = l;
        this.f48067OooOO0 = i2;
        this.f48068OooOO0O = mutableState2;
        this.f48069OooOO0o = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyColumn = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        TopicPopularMomentVM topicPopularMomentVM = this.f48062OooO0Oo;
        final SnapshotStateList<MomentDetailModel> listData = topicPopularMomentVM.getListData();
        final int i = this.f48064OooO0o0;
        final FragmentActivity fragmentActivity = this.f48063OooO0o;
        final MutableState<oO0O0O00> mutableState = this.f48065OooO0oO;
        final TopicDetailVM topicDetailVM = this.f48066OooO0oo;
        final Long l = this.f48061OooO;
        final int i2 = this.f48067OooOO0;
        final MutableState<o0Oo0oo> mutableState2 = this.f48068OooOO0O;
        LazyColumn.items(listData.size(), null, new Function1<Integer, Object>() { // from class: com.yalla.yalla.ui.activity.moment.TopicDetailContentCompKt$TopicDetailContent$2$1$4$2$1$invoke$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Integer num) {
                listData.get(num.intValue());
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yalla.yalla.ui.activity.moment.TopicDetailContentCompKt$TopicDetailContent$2$1$4$2$1$invoke$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function4
            public final Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                int i3;
                LazyItemScope items = lazyItemScope;
                int iIntValue = num.intValue();
                Composer composer2 = composer;
                int iIntValue2 = num2.intValue();
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((iIntValue2 & 14) == 0) {
                    i3 = (composer2.changed(items) ? 4 : 2) | iIntValue2;
                } else {
                    i3 = iIntValue2;
                }
                if ((iIntValue2 & 112) == 0) {
                    i3 |= composer2.changed(iIntValue) ? 32 : 16;
                }
                if ((i3 & 731) == 146 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:179)");
                    }
                    int i4 = (i3 & 112) | (i3 & 14);
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
                    p515o0o0O0O0.o0Oo0oo o0oo0oo2 = (p515o0o0O0O0.o0Oo0oo) mutableState2.getValue();
                    MomentAdapterTag momentAdapterTag = i == 0 ? MomentAdapterTag.TopicDetailFragmentPopular : MomentAdapterTag.TopicDetailFragmentLatest;
                    FragmentActivity fragmentActivity2 = fragmentActivity;
                    EnterRoomParentPage enterRoomParentPage = EnterRoomParentPage.Moments_Topics_SharedRoom;
                    composer2.startReplaceableGroup(1157296644);
                    MutableState mutableState3 = mutableState;
                    boolean zChanged = composer2.changed(mutableState3);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new oO0O00O(mutableState3);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    Function1 function1 = (Function1) objRememberedValue;
                    TopicDetailVM topicDetailVM2 = topicDetailVM;
                    Long l2 = (Long) LiveDataAdapterKt.observeAsState(topicDetailVM2.getTopicOwnerId(), composer2, 8).getValue();
                    o0000oo.OooO00o(momentDetailModel, iIntValue, o0oo0oo2, momentAdapterTag, fragmentActivity2, enterRoomParentPage, function1, false, false, null, false, 0L, l2 != null ? l2.toString() : null, (Long) LiveDataAdapterKt.observeAsState(topicDetailVM2.getTopDyId(), composer2, 8).getValue(), (ArrayList) LiveDataAdapterKt.observeAsState(topicDetailVM2.getTopicManagerIds(), composer2, 8).getValue(), l, composer2, (i4 & 112) | 229896, ((i2 << 15) & 458752) | ShareRequest.THUMB_DATA_SIZE_LIMIT, 3968);
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
        if (topicPopularMomentVM.getListData().size() > 0) {
            LazyListScope.CC.OooO(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1253033220, true, new oO0O00oO(this.f48062OooO0Oo, this.f48064OooO0o0, this.f48061OooO, this.f48069OooOO0o, this.f48067OooOO0)), 3, null);
        } else {
            LazyListScope.CC.OooO(LazyColumn, null, null, o00oO0o.f47877OooO00o, 3, null);
        }
        return Unit.INSTANCE;
    }
}
