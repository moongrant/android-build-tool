package p587o0oOooOO;

import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.Oooo000;
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
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
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
import p476o0OooooO.o0OOo000;
import p507o0o00oo.Oooo0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0O0O00;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMainRoomRecommendTopRank.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainRoomRecommendTopRank.kt\ncom/yalla/yalla/ui/view/MainRoomRecommendTopRankKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,185:1\n36#2:186\n25#2:194\n456#2,8:221\n464#2,3:235\n25#2:239\n36#2:246\n467#2,3:253\n1097#3,6:187\n1097#3,6:195\n1097#3,6:240\n1097#3,6:247\n76#4:193\n154#5:201\n154#5:202\n154#5:203\n66#6,6:204\n72#6:238\n76#6:257\n78#7,11:210\n91#7:256\n4144#8,6:229\n81#9:258\n107#9,2:259\n*S KotlinDebug\n*F\n+ 1 MainRoomRecommendTopRank.kt\ncom/yalla/yalla/ui/view/MainRoomRecommendTopRankKt\n*L\n55#1:186\n66#1:194\n67#1:221,8\n67#1:235,3\n76#1:239\n85#1:246\n67#1:253,3\n55#1:187,6\n66#1:195,6\n76#1:240,6\n85#1:247,6\n64#1:193\n69#1:201\n70#1:202\n71#1:203\n67#1:204,6\n67#1:238\n67#1:257\n67#1:210,11\n67#1:256\n67#1:229,6\n66#1:258\n66#1:259,2\n*E\n"})
public final class r0 {

    public static final class OooO extends Lambda implements Function1<Context, BannerView> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ List<Integer[]> f56943OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<TopRankHeaderModel> f56944OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(List<Integer[]> list, MutableState<TopRankHeaderModel> mutableState) {
            super(1);
            this.f56943OooO0Oo = list;
            this.f56944OooO0o0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final BannerView invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            BannerView bannerView = new BannerView(it, null, 6, 0);
            Oooo0 oooo0 = new Oooo0(it, this.f56943OooO0Oo, this.f56944OooO0o0);
            oooo0.f56154OooO0Oo = true;
            bannerView.setAdapter(oooo0);
            bannerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            return bannerView;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f56945OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMainRoomRecommendTopRank.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainRoomRecommendTopRank.kt\ncom/yalla/yalla/ui/view/MainRoomRecommendTopRankKt$BgAndText$2\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,185:1\n66#2,6:186\n72#2:220\n76#2:227\n78#3,11:192\n91#3:226\n456#4,8:203\n464#4,3:217\n467#4,3:223\n4144#5,6:211\n154#6:221\n154#6:222\n*S KotlinDebug\n*F\n+ 1 MainRoomRecommendTopRank.kt\ncom/yalla/yalla/ui/view/MainRoomRecommendTopRankKt$BgAndText$2\n*L\n140#1:186,6\n140#1:220\n140#1:227\n140#1:192,11\n140#1:226\n140#1:203,8\n140#1:217,3\n140#1:223,3\n140#1:211,6\n152#1:221\n154#1:222\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ List<Integer[]> f56946OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f56947OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f56948OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(List<Integer[]> list, int i, int i2) {
            super(3);
            this.f56946OooO0Oo = list;
            this.f56948OooO0o0 = i;
            this.f56947OooO0o = i2;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(70565269, iIntValue, -1, "com.yalla.yalla.ui.view.BgAndText.<anonymous> (MainRoomRecommendTopRank.kt:139)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            composer2.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer2, 0, -1323940314);
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
            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            List<Integer[]> list = this.f56946OooO0Oo;
            ImageKt.Image(PainterResources_androidKt.painterResource(list.get(this.f56948OooO0o0)[0].intValue(), composer2, 0), (String) null, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, composer2, 25016, 104);
            oo000000.OooO00o(StringResources_androidKt.stringResource(list.get(this.f56947OooO0o)[1].intValue(), composer2, 0), new w(TextUnitKt.getSp(4), TextUnitKt.getSp(12)), PaddingKt.m482paddingqDBjuR0$default(boxScopeInstance.align(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(118)), companion2.getBottomCenter()), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(7), 7, null), o0OOo000.f48135OooO0O0, FontStyle.m3413boximpl(FontStyle.INSTANCE.m3420getItalic_LCdwA()), FontWeight.INSTANCE.getBlack(), null, 0L, null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 1, null, composer2, 196608, 3072, 24000);
            if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ List<Integer[]> f56949OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f56950OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f56951OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(List<Integer[]> list, int i, int i2) {
            super(2);
            this.f56949OooO0Oo = list;
            this.f56951OooO0o0 = i;
            this.f56950OooO0o = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f56950OooO0o | 1);
            r0.OooO00o(this.f56949OooO0Oo, this.f56951OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MainRoomRecommendVM f56952OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f56953OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(MainRoomRecommendVM mainRoomRecommendVM, int i) {
            super(2);
            this.f56952OooO0Oo = mainRoomRecommendVM;
            this.f56953OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f56953OooO0o0 | 1);
            r0.OooO0O0(this.f56952OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<BannerView, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<BannerView> f56954OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(MutableState<BannerView> mutableState) {
            super(1);
            this.f56954OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(BannerView bannerView) {
            BannerView it = bannerView;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f56954OooO0Oo.setValue(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f56955OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Integer> f56956OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(Context context, MutableState<Integer> mutableState) {
            super(0);
            this.f56955OooO0Oo = context;
            this.f56956OooO0o0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            String rankType;
            int iOooO0Oo = r0.OooO0Oo(this.f56956OooO0o0);
            if (iOooO0Oo == 0) {
                o0oo0000.OooO00o.OooO0O0("101092");
                TopVM.INSTANCE.getClass();
                rankType = TopVM.TYPE_ROOM_GIFT;
            } else if (iOooO0Oo == 1) {
                o0oo0000.OooO00o.OooO0O0("101093");
                TopVM.INSTANCE.getClass();
                rankType = TopVM.TYPE_GIFT_SENT;
            } else if (iOooO0Oo == 2) {
                o0oo0000.OooO00o.OooO0O0("101094");
                TopVM.INSTANCE.getClass();
                rankType = TopVM.TYPE_GIFT_RECEIVE;
            } else if (iOooO0Oo != 3) {
                o0oo0000.OooO00o.OooO0O0("101092");
                TopVM.INSTANCE.getClass();
                rankType = TopVM.TYPE_ROOM_GIFT;
            } else {
                o0oo0000.OooO00o.OooO0O0("101095");
                TopVM.INSTANCE.getClass();
                rankType = TopVM.TYPE_YALLA_BILLION;
            }
            int i = TopActivity.f25114OooOooO;
            Context context = this.f56955OooO0Oo;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(rankType, "rankType");
            Intent intent = new Intent(context, (Class<?>) TopActivity.class);
            TopVM.INSTANCE.getClass();
            intent.putExtra(TopVM.RANK_TYPE_KEY, rankType);
            context.startActivity(intent);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ List<Integer[]> f56957OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomRecommendVM f56958OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<TopRankHeaderModel> f56959OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f56960OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(List<Integer[]> list, MutableState<TopRankHeaderModel> mutableState, MainRoomRecommendVM mainRoomRecommendVM, int i) {
            super(2);
            this.f56957OooO0Oo = list;
            this.f56959OooO0o0 = mutableState;
            this.f56958OooO0o = mainRoomRecommendVM;
            this.f56960OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f56960OooO0oO | 1);
            MutableState<TopRankHeaderModel> mutableState = this.f56959OooO0o0;
            MainRoomRecommendVM mainRoomRecommendVM = this.f56958OooO0o;
            r0.OooO0OO(this.f56957OooO0Oo, mutableState, mainRoomRecommendVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.view.MainRoomRecommendTopRankKt$RankContainer$1$4", f = "MainRoomRecommendTopRank.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f56961OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ List<Integer[]> f56962OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<BannerView> f56963OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Integer> f56964OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(MutableState<BannerView> mutableState, List<Integer[]> list, MutableState<Integer> mutableState2, Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
            this.f56963OooO0o0 = mutableState;
            this.f56962OooO0o = list;
            this.f56964OooO0oO = mutableState2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO0(this.f56963OooO0o0, this.f56962OooO0o, this.f56964OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                int r1 = r5.f56961OooO0Oo
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
                r6.f56961OooO0Oo = r2
                r3 = 3000(0xbb8, double:1.482E-320)
                java.lang.Object r1 = kotlinx.coroutines.DelayKt.delay(r3, r6)
                if (r1 != r0) goto L27
                return r0
            L27:
                androidx.compose.runtime.MutableState<com.yalla.yalla.ui.view.banner.BannerView> r1 = r6.f56963OooO0o0
                java.lang.Object r1 = r1.getValue()
                com.yalla.yalla.ui.view.banner.BannerView r1 = (com.yalla.yalla.ui.view.banner.BannerView) r1
                if (r1 == 0) goto L46
                com.yalla.yalla.ui.view.banner.BannerView$initView$1 r3 = r1.f30282OooO0Oo
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
                androidx.compose.runtime.MutableState<java.lang.Integer> r1 = r6.f56964OooO0oO
                int r3 = p587o0oOooOO.r0.OooO0Oo(r1)
                java.util.List<java.lang.Integer[]> r4 = r6.f56962OooO0o
                int r4 = r4.size()
                int r4 = r4 - r2
                if (r3 != r4) goto L5e
                r3 = 0
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1.setValue(r3)
                goto L1c
            L5e:
                int r3 = p587o0oOooOO.r0.OooO0Oo(r1)
                int r3 = r3 + r2
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1.setValue(r3)
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: o0oOooOO.r0.OooOOO0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(List<Integer[]> list, int i, Composer composer, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1206814223);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1206814223, i2, -1, "com.yalla.yalla.ui.view.BgAndText (MainRoomRecommendTopRank.kt:134)");
        }
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            AnimatedVisibilityKt.AnimatedVisibility(i3 == i, SemanticsModifierKt.semantics$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), false, OooO00o.f56945OooO0Oo, 1, null), EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 70565269, true, new OooO0O0(list, i3, i)), composerStartRestartGroup, 200064, 16);
            i3++;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(list, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(@NotNull MainRoomRecommendVM viewModel, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1659056971);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1659056971, i, -1, "com.yalla.yalla.ui.view.MainRoomRecommendTopRank (MainRoomRecommendTopRank.kt:53)");
        }
        Unit unit = Unit.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(unit);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = CollectionsKt.arrayListOf(new Integer[]{Integer.valueOf(o0O0O00.main_room_recommend_rank_room_gift_bg), Integer.valueOf(o000000.Room_gifts_sent)}, new Integer[]{Integer.valueOf(o0O0O00.main_room_recommend_rank_gift_send_bg), Integer.valueOf(o000000.Gifts_sent)}, new Integer[]{Integer.valueOf(o0O0O00.main_room_recommend_rank_gift_received_bg), Integer.valueOf(o000000.Gifts_received)}, new Integer[]{Integer.valueOf(o0O0O00.main_room_recommend_rank_billionaire_bg), Integer.valueOf(o000000.Gold_Recharge)});
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
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(viewModel, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(List<Integer[]> list, MutableState<TopRankHeaderModel> mutableState, MainRoomRecommendVM mainRoomRecommendVM, Composer composer, int i) {
        Object obj;
        Composer composerStartRestartGroup = composer.startRestartGroup(-40961822);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-40961822, i, -1, "com.yalla.yalla.ui.view.RankContainer (MainRoomRecommendTopRank.kt:62)");
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
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ClipKt.clip(SizeKt.m511height3ABfNKs(PaddingKt.m481paddingqDBjuR0(companion2, Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(8), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(12)), Dp.m3775constructorimpl(98)), RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(16))), 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
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
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
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
        OooO oooO = new OooO(list, mutableState);
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, obj);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(mutableState3);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new OooOO0(mutableState3);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        AndroidView_androidKt.AndroidView(oooO, modifierFillMaxSize$default, (Function1) objRememberedValue3, composerStartRestartGroup, 48, 0);
        BoxKt.Box(com.code.android.util.o0O0O00.OooO0O0(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), false, false, 0L, false, null, null, null, new OooOO0O(context, mutableState2), 253), composerStartRestartGroup, 0);
        EffectsKt.LaunchedEffect(Unit.INSTANCE, new OooOOO0(mutableState3, list, mutableState2, null), composerStartRestartGroup, 70);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(list, mutableState, mainRoomRecommendVM, i));
    }

    public static final int OooO0Oo(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }
}
