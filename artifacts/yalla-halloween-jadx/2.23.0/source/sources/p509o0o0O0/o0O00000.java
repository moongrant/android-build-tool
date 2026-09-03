package p509o0o0O0;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.OooO00o;
import androidx.compose.material.OooOOO0;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0O0O00;
import com.facebook.OooOo;
import com.yalla.yalla.model.RecommendNewPostModel;
import com.yalla.yalla.ui.vm.moment.MomentFollowingVM;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147o00Oo0Oo.o000OOo;
import p509o0o0O0.o0O000;
import p509o0o0O0.o0O0000O;
import p517o0o0O0o.OooOOOO;
import p519o0o0O0oO.o0OOO0OO;
import p579o0oOoo.oO0O0O00;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentTopFollowUsersComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentTopFollowUsersComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentTopFollowUsersCompKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,194:1\n71#2,7:195\n78#2:230\n82#2:235\n78#3,11:202\n91#3:234\n78#3,11:248\n91#3:283\n78#3,11:294\n91#3:328\n456#4,8:213\n464#4,3:227\n467#4,3:231\n25#4:236\n456#4,8:259\n464#4,3:273\n467#4,3:280\n456#4,8:305\n464#4,3:319\n467#4,3:325\n4144#5,6:221\n4144#5,6:267\n4144#5,6:313\n1097#6,6:237\n67#7,5:243\n72#7:276\n76#7:284\n154#8:277\n154#8:278\n154#8:279\n154#8:285\n154#8:286\n154#8:287\n154#8:323\n154#8:324\n73#9,6:288\n79#9:322\n83#9:329\n*S KotlinDebug\n*F\n+ 1 MomentTopFollowUsersComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentTopFollowUsersCompKt\n*L\n56#1:195,7\n56#1:230\n56#1:235\n56#1:202,11\n56#1:234\n85#1:248,11\n85#1:283\n165#1:294,11\n165#1:328\n56#1:213,8\n56#1:227,3\n56#1:231,3\n81#1:236\n85#1:259,8\n85#1:273,3\n85#1:280,3\n165#1:305,8\n165#1:319,3\n165#1:325,3\n56#1:221,6\n85#1:267,6\n165#1:313,6\n81#1:237,6\n85#1:243,5\n85#1:276\n85#1:284\n92#1:277\n94#1:278\n96#1:279\n167#1:285\n169#1:286\n171#1:287\n179#1:323\n185#1:324\n165#1:288,6\n165#1:322\n165#1:329\n*E\n"})
public final class o0O00000 {

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f50969OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i) {
            super(2);
            this.f50969OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0O00000.OooO00o(composer, RecomposeScopeImplKt.updateChangedFlags(this.f50969OooO0Oo | 1));
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMomentTopFollowUsersComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentTopFollowUsersComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentTopFollowUsersCompKt$MomentFollowUserList$1$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,194:1\n171#2,12:195\n81#3:207\n107#3,2:208\n*S KotlinDebug\n*F\n+ 1 MomentTopFollowUsersComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentTopFollowUsersCompKt$MomentFollowUserList$1$1\n*L\n102#1:195,12\n115#1:207\n115#1:208,2\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function1<LazyListScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ List<RecommendNewPostModel> f50970OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentFollowingVM f50971OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Integer> f50972OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(List<RecommendNewPostModel> list, MutableState<Integer> mutableState, MomentFollowingVM momentFollowingVM) {
            super(1);
            this.f50970OooO0Oo = list;
            this.f50972OooO0o0 = mutableState;
            this.f50971OooO0o = momentFollowingVM;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LazyListScope lazyListScope) {
            LazyListScope LazyRow = lazyListScope;
            Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
            LazyListScope.CC.OooO(LazyRow, null, null, Oooo000.f50392OooO00o, 3, null);
            final List<RecommendNewPostModel> list = this.f50970OooO0Oo;
            int size = list.size();
            Function1<Integer, Object> function1 = new Function1<Integer, Object>() { // from class: com.yalla.yalla.ui.composable.moment.MomentTopFollowUsersCompKt$MomentFollowUserList$1$1$invoke$$inlined$itemsIndexed$default$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Integer num) {
                    list.get(num.intValue());
                    return null;
                }
            };
            final MutableState<Integer> mutableState = this.f50972OooO0o0;
            final MomentFollowingVM momentFollowingVM = this.f50971OooO0o;
            LazyRow.items(size, null, function1, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yalla.yalla.ui.composable.moment.MomentTopFollowUsersCompKt$MomentFollowUserList$1$1$invoke$$inlined$itemsIndexed$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function4
                public final Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    int i;
                    Modifier modifierOooO00o;
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
                        RecommendNewPostModel recommendNewPostModel = (RecommendNewPostModel) list.get(iIntValue);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierOooO0O0 = OooO00o.OooO0O0(items, SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(75)), 0.0f, 1, null);
                        Integer numValueOf = Integer.valueOf(iIntValue);
                        composer2.startReplaceableGroup(511388516);
                        MutableState mutableState2 = mutableState;
                        boolean zChanged = composer2.changed(numValueOf) | composer2.changed(mutableState2);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new o0O0000O(mutableState2, iIntValue);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        Modifier modifierOooO0O1 = o0O0O00.OooO0O0(modifierOooO0O0, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        composer2.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyOooO0O0 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                        Function2 function2OooO00o = OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO0O0, composerM1309constructorimpl, currentCompositionLocalMap);
                        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-492369756);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        MutableState mutableState3 = (MutableState) objRememberedValue2;
                        EffectsKt.LaunchedEffect(momentFollowingVM.isUserListChange().getValue(), new o0O000(recommendNewPostModel, mutableState3, null), composer2, 64);
                        if (((Boolean) mutableState3.getValue()).booleanValue()) {
                            modifierOooO00o = o0O0O00.OooO00o(companion, Dp.m3765constructorimpl(26), null, Brush.Companion.m1627linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m1660boximpl(ColorKt.Color(4294957599L)), Color.m1660boximpl(ColorKt.Color(4294934758L))}), OffsetKt.Offset(0.0f, 0.0f), OffsetKt.Offset(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), 0, 8, (Object) null), Dp.m3763boximpl(Dp.m3765constructorimpl(2)), 18);
                        } else {
                            modifierOooO00o = companion;
                        }
                        OooOOOO.f51970OooO00o.OooOO0(recommendNewPostModel.getUserHeader(), SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, Dp.m3765constructorimpl(15), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(46)).then(modifierOooO00o), 0.0f, null, false, composer2, 262144, 28);
                        com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(10), null, composer2, 6, 2);
                        TextKt.m1251Text4IGK_g(recommendNewPostModel.getUserName(), SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(65)), o000OOo.OooO0OO(composer2).f37701OooO, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 3120, 120304);
                        if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    return Unit.INSTANCE;
                }
            }));
            LazyListScope.CC.OooO(LazyRow, null, null, Oooo000.f50393OooO0O0, 3, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ List<RecommendNewPostModel> f50973OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f50974OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentFollowingVM f50975OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ oO0O0O00 f50976OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f50977OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(List<RecommendNewPostModel> list, MomentFollowingVM momentFollowingVM, FragmentActivity fragmentActivity, oO0O0O00 oo0o0o00, int i) {
            super(2);
            this.f50973OooO0Oo = list;
            this.f50975OooO0o0 = momentFollowingVM;
            this.f50974OooO0o = fragmentActivity;
            this.f50976OooO0oO = oo0o0o00;
            this.f50977OooO0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0O00000.OooO0O0(this.f50973OooO0Oo, this.f50975OooO0o0, this.f50974OooO0o, this.f50976OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f50977OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentFollowingVM f50978OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ oO0O0O00 f50979OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f50980OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f50981OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(MomentFollowingVM momentFollowingVM, FragmentActivity fragmentActivity, oO0O0O00 oo0o0o00, int i) {
            super(2);
            this.f50978OooO0Oo = momentFollowingVM;
            this.f50980OooO0o0 = fragmentActivity;
            this.f50979OooO0o = oo0o0o00;
            this.f50981OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f50981OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f50980OooO0o0;
            oO0O0O00 oo0o0o00 = this.f50979OooO0o;
            o0O00000.OooO0OO(this.f50978OooO0Oo, fragmentActivity, oo0o0o00, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1565161091);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1565161091, i, -1, "com.yalla.yalla.ui.composable.moment.MomentEmptyFollowerUser (MomentTopFollowUsersComp.kt:163)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 8;
            Modifier modifierM478paddingVpY3zN4$default = PaddingKt.m478paddingVpY3zN4$default(SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m478paddingVpY3zN4$default(companion, 0.0f, Dp.m3765constructorimpl(f), 1, null), 0.0f, 1, null), Dp.m3765constructorimpl(62)), Dp.m3765constructorimpl(35), 0.0f, 2, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM478paddingVpY3zN4$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_empty_moment_recomment, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(39)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            composer2 = composerStartRestartGroup;
            TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.no_posts_yet_see_recommended_posts_below, composerStartRestartGroup, 0), PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 131056);
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(List<RecommendNewPostModel> list, MomentFollowingVM momentFollowingVM, FragmentActivity fragmentActivity, oO0O0O00 oo0o0o00, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1500308280);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1500308280, i, -1, "com.yalla.yalla.ui.composable.moment.MomentFollowUserList (MomentTopFollowUsersComp.kt:74)");
        }
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(-1, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        o0OOO0OO.OooO00o(4678, composerStartRestartGroup, mutableState, fragmentActivity, oo0o0o00, list);
        Alignment.Companion companion = Alignment.INSTANCE;
        Alignment centerStart = companion.getCenterStart();
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(centerStart, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        float f = 15;
        LazyDslKt.LazyRow(OooOo.OooO0O0(f, SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m477paddingVpY3zN4(companion2, Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(8)), 0.0f, 1, null), Dp.m3765constructorimpl(97))), null, null, false, null, companion.getCenterVertically(), null, false, new OooO0O0(list, mutableState, momentFollowingVM), composerStartRestartGroup, 196608, 222);
        if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(list, momentFollowingVM, fragmentActivity, oo0o0o00, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(@NotNull MomentFollowingVM newMomentVM, @Nullable FragmentActivity fragmentActivity, @NotNull oO0O0O00 momentGiftSendUtil, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(newMomentVM, "newMomentVM");
        Intrinsics.checkNotNullParameter(momentGiftSendUtil, "momentGiftSendUtil");
        Composer composerStartRestartGroup = composer.startRestartGroup(585223593);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(585223593, i, -1, "com.yalla.yalla.ui.composable.moment.MomentTopFollowUsersComp (MomentTopFollowUsersComp.kt:54)");
        }
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-72291061);
        if (newMomentVM.getShowRecommendTop().getValue().booleanValue()) {
            OooO00o(composerStartRestartGroup, 0);
        }
        composerStartRestartGroup.endReplaceableGroup();
        SnapshotStateList<RecommendNewPostModel> headUserList = newMomentVM.getHeadUserList();
        composerStartRestartGroup.startReplaceableGroup(1956864523);
        if (!headUserList.isEmpty()) {
            OooO0O0(headUserList, newMomentVM, fragmentActivity, momentGiftSendUtil, composerStartRestartGroup, 4672);
        }
        if (OooOo.OooO0o.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(newMomentVM, fragmentActivity, momentGiftSendUtil, i));
    }
}
