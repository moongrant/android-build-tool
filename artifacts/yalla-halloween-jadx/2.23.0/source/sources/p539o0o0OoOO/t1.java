package p539o0o0OoOO;

import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.model.TopRankHeaderModel;
import com.yalla.yalla.ui.activity.main.TopActivity;
import com.yalla.yalla.ui.view.banner.BannerView;
import com.yalla.yalla.ui.vm.main.MainRoomRecommendVM;
import com.yalla.yalla.ui.vm.main.TopVM;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p018OooOoo0.OooOOO;
import p469o0OoooOO.o0oO0O0o;
import p500o0o00oO.o0OO00O;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nMainRoomRecommendTopRank.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainRoomRecommendTopRank.kt\ncom/yalla/yalla/ui/view/MainRoomRecommendTopRankKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,182:1\n36#2:183\n25#2:191\n456#2,8:218\n464#2,3:232\n25#2:236\n36#2:243\n467#2,3:250\n1097#3,6:184\n1097#3,6:192\n1097#3,6:237\n1097#3,6:244\n76#4:190\n154#5:198\n154#5:199\n154#5:200\n66#6,6:201\n72#6:235\n76#6:254\n78#7,11:207\n91#7:253\n4144#8,6:226\n81#9:255\n107#9,2:256\n*S KotlinDebug\n*F\n+ 1 MainRoomRecommendTopRank.kt\ncom/yalla/yalla/ui/view/MainRoomRecommendTopRankKt\n*L\n54#1:183\n65#1:191\n66#1:218,8\n66#1:232,3\n75#1:236\n84#1:243\n66#1:250,3\n54#1:184,6\n65#1:192,6\n75#1:237,6\n84#1:244,6\n63#1:190\n68#1:198\n69#1:199\n70#1:200\n66#1:201,6\n66#1:235\n66#1:254\n66#1:207,11\n66#1:253\n66#1:226,6\n65#1:255\n65#1:256,2\n*E\n"})
public final class t1 {

    public static final class OooO extends Lambda implements Function1<BannerView, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<BannerView> f55687OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(MutableState<BannerView> mutableState) {
            super(1);
            this.f55687OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(BannerView bannerView) {
            BannerView it = bannerView;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f55687OooO0Oo.setValue(it);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMainRoomRecommendTopRank.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainRoomRecommendTopRank.kt\ncom/yalla/yalla/ui/view/MainRoomRecommendTopRankKt$BgAndText$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,182:1\n66#2,6:183\n72#2:217\n76#2:224\n78#3,11:189\n91#3:223\n456#4,8:200\n464#4,3:214\n467#4,3:220\n4144#5,6:208\n154#6:218\n154#6:219\n*S KotlinDebug\n*F\n+ 1 MainRoomRecommendTopRank.kt\ncom/yalla/yalla/ui/view/MainRoomRecommendTopRankKt$BgAndText$1\n*L\n137#1:183,6\n137#1:217\n137#1:224\n137#1:189,11\n137#1:223\n137#1:200,8\n137#1:214,3\n137#1:220,3\n137#1:208,6\n149#1:218\n151#1:219\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ List<Integer[]> f55688OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f55689OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f55690OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(List<Integer[]> list, int i, int i2) {
            super(3);
            this.f55688OooO0Oo = list;
            this.f55690OooO0o0 = i;
            this.f55689OooO0o = i2;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(70565269, iIntValue, -1, "com.yalla.yalla.ui.view.BgAndText.<anonymous> (MainRoomRecommendTopRank.kt:135)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            composer2.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(companion2, false, composer2, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            List<Integer[]> list = this.f55688OooO0Oo;
            ImageKt.Image(PainterResources_androidKt.painterResource(list.get(this.f55690OooO0o0)[0].intValue(), composer2, 0), (String) null, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, composer2, 25016, 104);
            b0.OooO00o(StringResources_androidKt.stringResource(list.get(this.f55689OooO0o)[1].intValue(), composer2, 0), new b1(TextUnitKt.getSp(4), TextUnitKt.getSp(12)), PaddingKt.m480paddingqDBjuR0$default(boxScopeInstance.align(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(118)), companion2.getBottomCenter()), 0.0f, 0.0f, 0.0f, Dp.m3765constructorimpl(7), 7, null), o0oO0O0o.f46946OooO0O0, FontStyle.m3403boximpl(FontStyle.INSTANCE.m3410getItalic_LCdwA()), FontWeight.INSTANCE.getBlack(), null, 0L, null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 1, null, composer2, 196608, 3072, 24000);
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ List<Integer[]> f55691OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f55692OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f55693OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(List<Integer[]> list, int i, int i2) {
            super(2);
            this.f55691OooO0Oo = list;
            this.f55693OooO0o0 = i;
            this.f55692OooO0o = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55692OooO0o | 1);
            t1.OooO00o(this.f55691OooO0Oo, this.f55693OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MainRoomRecommendVM f55694OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f55695OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MainRoomRecommendVM mainRoomRecommendVM, int i) {
            super(2);
            this.f55694OooO0Oo = mainRoomRecommendVM;
            this.f55695OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55695OooO0o0 | 1);
            t1.OooO0O0(this.f55694OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<Context, BannerView> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ List<Integer[]> f55696OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<TopRankHeaderModel> f55697OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(List<Integer[]> list, MutableState<TopRankHeaderModel> mutableState) {
            super(1);
            this.f55696OooO0Oo = list;
            this.f55697OooO0o0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final BannerView invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            BannerView bannerView = new BannerView(it, null, 6, 0);
            o0OO00O o0oo00o2 = new o0OO00O(it, this.f55696OooO0Oo, this.f55697OooO0o0);
            o0oo00o2.f55774OooO0Oo = true;
            bannerView.setAdapter(o0oo00o2);
            bannerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            return bannerView;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f55698OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Integer> f55699OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(Context context, MutableState<Integer> mutableState) {
            super(0);
            this.f55698OooO0Oo = context;
            this.f55699OooO0o0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            String rankType;
            int iOooO0Oo = t1.OooO0Oo(this.f55699OooO0o0);
            if (iOooO0Oo == 0) {
                o0OO000.OooO00o("101092");
                TopVM.INSTANCE.getClass();
                rankType = TopVM.TYPE_ROOM_GIFT;
            } else if (iOooO0Oo == 1) {
                o0OO000.OooO00o("101093");
                TopVM.INSTANCE.getClass();
                rankType = TopVM.TYPE_GIFT_SENT;
            } else if (iOooO0Oo == 2) {
                o0OO000.OooO00o("101094");
                TopVM.INSTANCE.getClass();
                rankType = TopVM.TYPE_GIFT_RECEIVE;
            } else if (iOooO0Oo != 3) {
                o0OO000.OooO00o("101092");
                TopVM.INSTANCE.getClass();
                rankType = TopVM.TYPE_ROOM_GIFT;
            } else {
                o0OO000.OooO00o("101095");
                TopVM.INSTANCE.getClass();
                rankType = TopVM.TYPE_YALLA_BILLION;
            }
            int i = TopActivity.f25568OooOooO;
            Context context = this.f55698OooO0Oo;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(rankType, "rankType");
            Intent intent = new Intent(context, (Class<?>) TopActivity.class);
            TopVM.INSTANCE.getClass();
            intent.putExtra(TopVM.RANK_TYPE_KEY, rankType);
            context.startActivity(intent);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.view.MainRoomRecommendTopRankKt$RankContainer$1$4", f = "MainRoomRecommendTopRank.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f55700OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ List<Integer[]> f55701OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<BannerView> f55702OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Integer> f55703OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(MutableState<BannerView> mutableState, List<Integer[]> list, MutableState<Integer> mutableState2, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f55702OooO0o0 = mutableState;
            this.f55701OooO0o = list;
            this.f55703OooO0oO = mutableState2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0O(this.f55702OooO0o0, this.f55701OooO0o, this.f55703OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOO0O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0026 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x0031  */
        /* JADX WARN: Code duplicated, block: B:17:0x003e  */
        /* JADX WARN: Code duplicated, block: B:21:0x0055  */
        /* JADX WARN: Code duplicated, block: B:22:0x005e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:12:0x0027). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f55700OooO0Oo
                r2 = 1
                if (r1 == 0) goto L18
                if (r1 != r2) goto L10
                kotlin.ResultKt.throwOnFailure(r6)
                r6 = r5
                goto L27
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                kotlin.ResultKt.throwOnFailure(r6)
                r6 = r5
            L1c:
                r6.f55700OooO0Oo = r2
                r3 = 3000(0xbb8, double:1.482E-320)
                java.lang.Object r1 = kotlinx.coroutines.DelayKt.delay(r3, r6)
                if (r1 != r0) goto L27
                return r0
            L27:
                androidx.compose.runtime.MutableState<com.yalla.yalla.ui.view.banner.BannerView> r1 = r6.f55702OooO0o0
                java.lang.Object r1 = r1.getValue()
                com.yalla.yalla.ui.view.banner.BannerView r1 = (com.yalla.yalla.ui.view.banner.BannerView) r1
                if (r1 == 0) goto L46
                com.yalla.yalla.ui.view.banner.BannerView$initView$1 r3 = r1.f30827OooO0Oo
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                int r3 = r3.findFirstVisibleItemPosition()
                r4 = -1
                if (r3 != r4) goto L3e
                goto L43
            L3e:
                int r3 = r3 + 1
                r1.smoothScrollToPosition(r3)
            L43:
                kotlin.coroutines.jvm.internal.Boxing.boxInt(r3)
            L46:
                androidx.compose.runtime.MutableState<java.lang.Integer> r1 = r6.f55703OooO0oO
                int r3 = p539o0o0OoOO.t1.OooO0Oo(r1)
                java.util.List<java.lang.Integer[]> r4 = r6.f55701OooO0o
                int r4 = r4.size()
                int r4 = r4 - r2
                if (r3 != r4) goto L5e
                r3 = 0
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1.setValue(r3)
                goto L1c
            L5e:
                int r3 = p539o0o0OoOO.t1.OooO0Oo(r1)
                int r3 = r3 + r2
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1.setValue(r3)
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: o0o0OoOO.t1.OooOO0O.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ List<Integer[]> f55704OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomRecommendVM f55705OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<TopRankHeaderModel> f55706OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f55707OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(List<Integer[]> list, MutableState<TopRankHeaderModel> mutableState, MainRoomRecommendVM mainRoomRecommendVM, int i) {
            super(2);
            this.f55704OooO0Oo = list;
            this.f55706OooO0o0 = mutableState;
            this.f55705OooO0o = mainRoomRecommendVM;
            this.f55707OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55707OooO0oO | 1);
            MutableState<TopRankHeaderModel> mutableState = this.f55706OooO0o0;
            MainRoomRecommendVM mainRoomRecommendVM = this.f55705OooO0o;
            t1.OooO0OO(this.f55704OooO0Oo, mutableState, mainRoomRecommendVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(List<Integer[]> list, int i, Composer composer, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1206814223);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1206814223, i2, -1, "com.yalla.yalla.ui.view.BgAndText (MainRoomRecommendTopRank.kt:133)");
        }
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            AnimatedVisibilityKt.AnimatedVisibility(i3 == i, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 70565269, true, new OooO00o(list, i3, i)), composerStartRestartGroup, 200112, 16);
            i3++;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(list, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(@NotNull MainRoomRecommendVM viewModel, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1659056971);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1659056971, i, -1, "com.yalla.yalla.ui.view.MainRoomRecommendTopRank (MainRoomRecommendTopRank.kt:52)");
        }
        Unit unit = Unit.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(unit);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = CollectionsKt.arrayListOf(new Integer[]{Integer.valueOf(oO00OOO.main_room_recommend_rank_room_gift_bg), Integer.valueOf(oO00OOo0.Room_gifts_sent)}, new Integer[]{Integer.valueOf(oO00OOO.main_room_recommend_rank_gift_send_bg), Integer.valueOf(oO00OOo0.Gifts_sent)}, new Integer[]{Integer.valueOf(oO00OOO.main_room_recommend_rank_gift_received_bg), Integer.valueOf(oO00OOo0.Gifts_received)}, new Integer[]{Integer.valueOf(oO00OOO.main_room_recommend_rank_billionaire_bg), Integer.valueOf(oO00OOo0.Gold_Recharge)});
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        OooO0OO((ArrayList) objRememberedValue, viewModel.getRankList(), viewModel, composerStartRestartGroup, 520);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(viewModel, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(List<Integer[]> list, MutableState<TopRankHeaderModel> mutableState, MainRoomRecommendVM mainRoomRecommendVM, Composer composer, int i) {
        Object obj;
        Composer composerStartRestartGroup = composer.startRestartGroup(-40961822);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-40961822, i, -1, "com.yalla.yalla.ui.view.RankContainer (MainRoomRecommendTopRank.kt:61)");
        }
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) objRememberedValue;
        Modifier.Companion companion2 = Modifier.INSTANCE;
        float f = 15;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ClipKt.clip(SizeKt.m509height3ABfNKs(PaddingKt.m479paddingqDBjuR0(companion2, Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(8), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(12)), Dp.m3765constructorimpl(98)), RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(16))), 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        OooO00o(list, OooO0Oo(mutableState2), composerStartRestartGroup, 8);
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            obj = null;
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        } else {
            obj = null;
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState3 = (MutableState) objRememberedValue2;
        OooO0o oooO0o = new OooO0o(list, mutableState);
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, obj);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(mutableState3);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new OooO(mutableState3);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        AndroidView_androidKt.AndroidView(oooO0o, modifierFillMaxSize$default, (Function1) objRememberedValue3, composerStartRestartGroup, 48, 0);
        BoxKt.Box(o0O0O00.OooO0O0(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), false, false, 0L, false, null, null, null, new OooOO0(context, mutableState2), 253), composerStartRestartGroup, 0);
        EffectsKt.LaunchedEffect(Unit.INSTANCE, new OooOO0O(mutableState3, list, mutableState2, null), composerStartRestartGroup, 70);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(list, mutableState, mainRoomRecommendVM, i));
    }

    public static final int OooO0Oo(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }
}
