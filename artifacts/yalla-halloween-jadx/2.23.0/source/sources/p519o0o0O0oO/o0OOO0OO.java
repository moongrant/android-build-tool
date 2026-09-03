package p519o0o0O0oO;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0O0O00;
import com.google.accompanist.pager.Pager;
import com.yalla.yalla.model.RecommendNewPostModel;
import com.yalla.yalla.ui.view.BottomSheetBehaviorProperties;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p018OooOoo0.OooOOO;
import p184o00o00o.OooOo00;
import p184o00o00o.Oooo000;
import p184o00o00o.o000oOoO;
import p445o0OoOoo.o0oOO;
import p469o0OoooOO.o0oO0O0o;
import p517o0o0O0o.OooOOOO;
import p539o0o0OoOO.d0;
import p579o0oOoo.oO0O0O00;
import p584o0oOooO0.oO00OOO;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nFollowingMomentTopUserDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FollowingMomentTopUserDialog.kt\ncom/yalla/yalla/ui/dialog/FollowingMomentTopUserDialogKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 9 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,303:1\n36#2:304\n36#2:311\n456#2,8:337\n464#2,3:351\n25#2:355\n25#2:366\n50#2:377\n49#2:378\n467#2,3:385\n456#2,8:408\n464#2,3:422\n467#2,3:429\n50#2:434\n49#2:435\n50#2:442\n49#2:443\n456#2,8:469\n464#2,3:483\n467#2,3:493\n1097#3,6:305\n1097#3,6:312\n1097#3,6:356\n1097#3,3:367\n1100#3,3:373\n1097#3,6:379\n1097#3,6:436\n1097#3,6:444\n154#4:318\n154#4:319\n154#4:390\n154#4:426\n154#4:427\n154#4:428\n154#4:450\n154#4:451\n154#4:487\n154#4:488\n154#4:489\n154#4:490\n154#4:491\n154#4:492\n72#5,6:320\n78#5:354\n82#5:389\n78#6,11:326\n91#6:388\n78#6,11:397\n91#6:432\n78#6,11:458\n91#6:496\n4144#7,6:345\n4144#7,6:416\n4144#7,6:477\n486#8,4:362\n490#8,2:370\n494#8:376\n486#9:372\n66#10,6:391\n72#10:425\n76#10:433\n66#10,6:452\n72#10:486\n76#10:497\n81#11:498\n107#11,2:499\n*S KotlinDebug\n*F\n+ 1 FollowingMomentTopUserDialog.kt\ncom/yalla/yalla/ui/dialog/FollowingMomentTopUserDialogKt\n*L\n64#1:304\n89#1:311\n88#1:337,8\n88#1:351,3\n99#1:355\n102#1:366\n113#1:377\n113#1:378\n88#1:385,3\n194#1:408,8\n194#1:422,3\n194#1:429,3\n221#1:434\n221#1:435\n226#1:442\n226#1:443\n232#1:469,8\n232#1:483,3\n232#1:493,3\n64#1:305,6\n89#1:312,6\n99#1:356,6\n102#1:367,3\n102#1:373,3\n113#1:379,6\n221#1:436,6\n226#1:444,6\n92#1:318\n94#1:319\n197#1:390\n201#1:426\n202#1:427\n203#1:428\n235#1:450\n236#1:451\n243#1:487\n244#1:488\n251#1:489\n254#1:490\n288#1:491\n296#1:492\n88#1:320,6\n88#1:354\n88#1:389\n88#1:326,11\n88#1:388\n194#1:397,11\n194#1:432\n232#1:458,11\n232#1:496\n88#1:345,6\n194#1:416,6\n232#1:477,6\n102#1:362,4\n102#1:370,2\n102#1:376\n102#1:372\n194#1:391,6\n194#1:425\n194#1:433\n232#1:452,6\n232#1:486\n232#1:497\n99#1:498\n99#1:499,2\n*E\n"})
public final class o0OOO0OO {

    public static final class OooO extends Lambda implements Function1<GraphicsLayerScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f52741OooO0Oo = new OooO();

        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(GraphicsLayerScope graphicsLayerScope) {
            GraphicsLayerScope graphicsLayer = graphicsLayerScope;
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.setRotationY(180.0f);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.FollowingMomentTopUserDialogKt$RecommendUserList$1$1", f = "FollowingMomentTopUserDialog.kt", i = {}, l = {222}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f52742OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f52743OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Oooo000 f52744OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Oooo000 oooo000, int i, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f52744OooO0o0 = oooo000;
            this.f52743OooO0o = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f52744OooO0o0, this.f52743OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f52742OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f52742OooO0Oo = 1;
                Saver<Oooo000, ?> saver = Oooo000.f38642OooO0oo;
                if (this.f52744OooO0o0.OooO00o(this.f52743OooO0o, 0.0f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.FollowingMomentTopUserDialogKt$RecommendUserList$2$1", f = "FollowingMomentTopUserDialog.kt", i = {}, l = {227}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f52745OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f52746OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Oooo000 f52747OooO0o0;

        public static final class OooO00o extends Lambda implements Function0<Integer> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Oooo000 f52748OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(Oooo000 oooo000) {
                super(0);
                this.f52748OooO0Oo = oooo000;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return Integer.valueOf(this.f52748OooO0Oo.OooO0oO());
            }
        }

        /* JADX INFO: renamed from: o0o0O0oO.o0OOO0OO$OooO0O0$OooO0O0, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.ui.dialog.FollowingMomentTopUserDialogKt$RecommendUserList$2$1$2", f = "FollowingMomentTopUserDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0501OooO0O0 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ int f52749OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ Function1<Integer, Unit> f52750OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0501OooO0O0(Function1<? super Integer, Unit> function1, Continuation<? super C0501OooO0O0> continuation) {
                super(2, continuation);
                this.f52750OooO0o0 = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0501OooO0O0 c0501OooO0O0 = new C0501OooO0O0(this.f52750OooO0o0, continuation);
                c0501OooO0O0.f52749OooO0Oo = ((Number) obj).intValue();
                return c0501OooO0O0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Integer num, Continuation<? super Unit> continuation) {
                return ((C0501OooO0O0) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                this.f52750OooO0o0.invoke(Boxing.boxInt(this.f52749OooO0Oo));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Oooo000 oooo000, Function1<? super Integer, Unit> function1, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f52747OooO0o0 = oooo000;
            this.f52746OooO0o = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f52747OooO0o0, this.f52746OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f52745OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDebounce = FlowKt.debounce(SnapshotStateKt.snapshotFlow(new OooO00o(this.f52747OooO0o0)), 400L);
                C0501OooO0O0 c0501OooO0O0 = new C0501OooO0O0(this.f52746OooO0o, null);
                this.f52745OooO0Oo = 1;
                if (FlowKt.collectLatest(flowDebounce, c0501OooO0O0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f52751OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nFollowingMomentTopUserDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FollowingMomentTopUserDialog.kt\ncom/yalla/yalla/ui/dialog/FollowingMomentTopUserDialogKt$RecommendUserList$3$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,303:1\n50#2:304\n49#2:305\n50#2:313\n49#2:314\n456#2,8:338\n464#2,3:352\n467#2,3:356\n1097#3,6:306\n1097#3,6:315\n154#4:312\n66#5,6:321\n72#5:355\n76#5:360\n78#6,11:327\n91#6:359\n4144#7,6:346\n*S KotlinDebug\n*F\n+ 1 FollowingMomentTopUserDialog.kt\ncom/yalla/yalla/ui/dialog/FollowingMomentTopUserDialogKt$RecommendUserList$3$2\n*L\n261#1:304\n261#1:305\n274#1:313\n274#1:314\n259#1:338,8\n259#1:352,3\n259#1:356,3\n261#1:306,6\n274#1:315,6\n273#1:312\n259#1:321,6\n259#1:355\n259#1:360\n259#1:327,11\n259#1:359\n259#1:346,6\n*E\n"})
    public static final class OooO0o extends Lambda implements Function4<OooOo00, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f52752OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ List<RecommendNewPostModel> f52753OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(List list, int i, Function1 function1) {
            super(4);
            this.f52752OooO0Oo = function1;
            this.f52753OooO0o0 = list;
        }

        @Override // kotlin.jvm.functions.Function4
        public final Unit invoke(OooOo00 oooOo00, Integer num, Composer composer, Integer num2) {
            int i;
            OooOo00 HorizontalPager = oooOo00;
            int iIntValue = num.intValue();
            Composer composer2 = composer;
            int iIntValue2 = num2.intValue();
            Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
            if ((iIntValue2 & 14) == 0) {
                i = (composer2.changed(HorizontalPager) ? 4 : 2) | iIntValue2;
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
                    ComposerKt.traceEventStart(-578442812, i, -1, "com.yalla.yalla.ui.dialog.RecommendUserList.<anonymous>.<anonymous> (FollowingMomentTopUserDialog.kt:257)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Integer numValueOf = Integer.valueOf(iIntValue);
                composer2.startReplaceableGroup(511388516);
                boolean zChanged = composer2.changed(numValueOf) | composer2.changed(HorizontalPager);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new o0OOOO00(HorizontalPager, iIntValue);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                Modifier modifierM523size3ABfNKs = SizeKt.m523size3ABfNKs(GraphicsLayerModifierKt.graphicsLayer(companion, (Function1) objRememberedValue), Dp.m3765constructorimpl(32));
                Integer numValueOf2 = Integer.valueOf(iIntValue);
                composer2.startReplaceableGroup(511388516);
                Function1<Integer, Unit> function1 = this.f52752OooO0Oo;
                boolean zChanged2 = composer2.changed(numValueOf2) | composer2.changed(function1);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new o0OOOO0o(function1, iIntValue);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                Modifier modifierOooO0O0 = o0O0O00.OooO0O0(modifierM523size3ABfNKs, false, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 253);
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(Alignment.INSTANCE, false, composer2, 0, -1323940314);
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
                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                OooOOOO.f51970OooO00o.OooOO0(this.f52753OooO0o0.get(iIntValue).getUserHeader(), SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), 0.0f, null, false, composer2, 262192, 28);
                if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ List<RecommendNewPostModel> f52754OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f52755OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f52756OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52757OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(int i, int i2, List list, Function1 function1) {
            super(2);
            this.f52754OooO0Oo = list;
            this.f52756OooO0o0 = i;
            this.f52755OooO0o = function1;
            this.f52757OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52757OooO0oO | 1);
            int i = this.f52756OooO0o0;
            Function1<Integer, Unit> function1 = this.f52755OooO0o;
            o0OOO0OO.OooO0O0(this.f52754OooO0Oo, i, function1, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f52758OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(int i) {
            super(2);
            this.f52758OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0OOO0OO.OooO0OO(composer, RecomposeScopeImplKt.updateChangedFlags(this.f52758OooO0Oo | 1));
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(int i, @Nullable Composer composer, @NotNull MutableState showBottomSheetPosition, @Nullable FragmentActivity fragmentActivity, @NotNull oO0O0O00 momentGiftSendUtil, @NotNull List userList) {
        Intrinsics.checkNotNullParameter(showBottomSheetPosition, "showBottomSheetPosition");
        Intrinsics.checkNotNullParameter(userList, "userList");
        Intrinsics.checkNotNullParameter(momentGiftSendUtil, "momentGiftSendUtil");
        Composer composerStartRestartGroup = composer.startRestartGroup(835264471);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(835264471, i, -1, "com.yalla.yalla.ui.dialog.FollowingMomentTopUserDialog (FollowingMomentTopUserDialog.kt:55)");
        }
        if (((Number) showBottomSheetPosition.getValue()).intValue() >= 0) {
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(showBottomSheetPosition);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new o0O0oo00(showBottomSheetPosition);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            d0.OooO00o((Function0) objRememberedValue, o0O.f52611OooO0Oo, new com.yalla.yalla.ui.view.OooO00o(true, new BottomSheetBehaviorProperties(BottomSheetBehaviorProperties.State.Expanded, true, 1534), 61), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 742874880, true, new o0OO000(i, showBottomSheetPosition, fragmentActivity, momentGiftSendUtil, userList)), composerStartRestartGroup, 3120, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0OO000o(i, showBottomSheetPosition, fragmentActivity, momentGiftSendUtil, userList));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(List<RecommendNewPostModel> list, int i, Function1<? super Integer, Unit> function1, Composer composer, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(229740473);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(229740473, i2, -1, "com.yalla.yalla.ui.dialog.RecommendUserList (FollowingMomentTopUserDialog.kt:217)");
        }
        int i3 = (i2 >> 3) & 14;
        Oooo000 oooo000OooO00o = o000oOoO.OooO00o(i, composerStartRestartGroup, i3, 0);
        Integer numValueOf = Integer.valueOf(i);
        Integer numValueOf2 = Integer.valueOf(i);
        composerStartRestartGroup.startReplaceableGroup(511388516);
        boolean zChanged = composerStartRestartGroup.changed(numValueOf2) | composerStartRestartGroup.changed(oooo000OooO00o);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new OooO00o(oooo000OooO00o, i, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i3 | 64);
        composerStartRestartGroup.startReplaceableGroup(511388516);
        boolean zChanged2 = composerStartRestartGroup.changed(oooo000OooO00o) | composerStartRestartGroup.changed(function1);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new OooO0O0(oooo000OooO00o, function1, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(oooo000OooO00o, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 64);
        Modifier.Companion companion = Modifier.INSTANCE;
        float f = 40;
        Modifier modifierOooO00o = o0oOO.OooO00o(16, SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(f)), 0.0f, 2, null, composerStartRestartGroup, 733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO00o);
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
        ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_moment_top_user_center_bg, composerStartRestartGroup, 0), (String) null, OffsetKt.m437offsetVpY3zN4$default(SizeKt.m515requiredSize3ABfNKs(boxScopeInstance.align(companion, companion2.getCenter()), Dp.m3765constructorimpl(50)), 0.0f, Dp.m3765constructorimpl(0), 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
        Pager.OooO00o(list.size(), o0O0O00.OooO0O0(SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(f)), false, false, 0L, false, null, null, null, OooO0OO.f52751OooO0Oo, 253), oooo000OooO00o, false, 0.0f, PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(145), 0.0f, 2, null), null, null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -578442812, true, new OooO0o(list, i2, function1)), composerStartRestartGroup, 196608, 6, 984);
        int i4 = oO00OOO.ic_moment_top_user_shaow;
        float f2 = 48;
        ImageKt.Image(PainterResources_androidKt.painterResource(i4, composerStartRestartGroup, 0), (String) null, o0O0O00.OooO0Oo(SizeKt.m509height3ABfNKs(boxScopeInstance.align(companion, companion2.getTopStart()), Dp.m3765constructorimpl(f2)), composerStartRestartGroup, 0), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        ImageKt.Image(PainterResources_androidKt.painterResource(i4, composerStartRestartGroup, 0), (String) null, o0O0O00.OooO0Oo(GraphicsLayerModifierKt.graphicsLayer(SizeKt.m509height3ABfNKs(boxScopeInstance.align(companion, companion2.getTopEnd()), Dp.m3765constructorimpl(f2)), OooO.f52741OooO0Oo), composerStartRestartGroup, 0), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(i, i2, list, function1));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2126199518);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2126199518, i, -1, "com.yalla.yalla.ui.dialog.TopAnchor (FollowingMomentTopUserDialog.kt:192)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 24;
            Modifier modifierOooO00o = p153o00OoO0.OooOO0.OooO00o(f, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), composerStartRestartGroup, 733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO00o);
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
            SurfaceKt.m1185SurfaceFjzlyU(BoxScopeInstance.INSTANCE.align(ClipKt.clip(SizeKt.m509height3ABfNKs(SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, Dp.m3765constructorimpl(8), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(f)), Dp.m3765constructorimpl(4)), RoundedCornerShapeKt.getCircleShape()), companion2.getTopCenter()), null, o0oO0O0o.f46984Oooo0oO, 0L, null, 0.0f, o0O00000.f52616OooO00o, composerStartRestartGroup, 1572864, 58);
            if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooO0Oo(int i, Composer composer, MutableState mutableState, FragmentActivity fragmentActivity, oO0O0O00 oo0o0o00, List list) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-515188405);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-515188405, i, -1, "com.yalla.yalla.ui.dialog.FollowingUserMomentContent (FollowingMomentTopUserDialog.kt:81)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(mutableState);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new oo0oO0(mutableState);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m480paddingqDBjuR0$default(o0O0O00.OooO0O0(companion, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), 0.0f, Dp.m3765constructorimpl(48), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
        float f = 24;
        float f2 = 0;
        Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(ClipKt.clip(modifierFillMaxWidth$default, RoundedCornerShapeKt.m728RoundedCornerShapea9UjIt4(Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f2))), o0oO0O0o.f46946OooO0O0, null, 2, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM169backgroundbw27NRU$default);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        OooO0OO(composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion3 = Composer.INSTANCE;
        if (objRememberedValue2 == companion3.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(mutableState.getValue(), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) objRememberedValue2;
        Oooo000 oooo000OooO00o = o000oOoO.OooO00o(((Number) mutableState.getValue()).intValue(), composerStartRestartGroup, 0, 0);
        composerStartRestartGroup.startReplaceableGroup(773894976);
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue3 == companion3.getEmpty()) {
            objRememberedValue3 = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
        }
        composerStartRestartGroup.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue3).getCoroutineScope();
        composerStartRestartGroup.endReplaceableGroup();
        OooO0O0(list, ((Number) mutableState2.getValue()).intValue(), new o0OO00OO(coroutineScope, mutableState2, oooo000OooO00o), composerStartRestartGroup, 8);
        composerStartRestartGroup.startReplaceableGroup(511388516);
        boolean zChanged2 = composerStartRestartGroup.changed(oooo000OooO00o) | composerStartRestartGroup.changed(mutableState2);
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue4 == companion3.getEmpty()) {
            objRememberedValue4 = new o0OO00o0(oooo000OooO00o, mutableState2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(oooo000OooO00o, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 64);
        Pager.OooO00o(list.size(), androidx.compose.foundation.layout.OooOO0.OooO00o(columnScopeInstance, companion, 1.0f, false, 2, null), oooo000OooO00o, false, 0.0f, null, null, null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 364918662, true, new o0OOO00(mutableState2, fragmentActivity, oo0o0o00, list)), composerStartRestartGroup, 0, 6, 1016);
        if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0OOO0(i, mutableState, fragmentActivity, oo0o0o00, list));
    }
}
