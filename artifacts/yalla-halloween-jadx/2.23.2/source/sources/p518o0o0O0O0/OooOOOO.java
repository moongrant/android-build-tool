package p518o0o0O0O0;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.OooOo00;
import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O00O;
import java.util.ArrayList;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010OooOOoo.OooOo;
import p195o00o0OO0.o00000OO;
import p371o0OOo0oO.o00oO0o;
import p476o0OooooO.o0OOo000;
import p562o0oOo000.o0O0O00;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nFacePanel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacePanel.kt\ncom/yalla/yalla/ui/composable/face_panel/FacePanelKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,302:1\n486#2,4:303\n490#2,2:311\n494#2:317\n25#3:307\n25#3:319\n36#3:326\n456#3,8:352\n464#3,3:366\n467#3,3:370\n456#3,8:392\n464#3,3:406\n36#3:410\n467#3,3:417\n36#3:425\n1097#4,3:308\n1100#4,3:314\n1097#4,6:320\n1097#4,3:327\n1100#4,3:332\n1097#4,6:411\n1097#4,6:426\n486#5:313\n154#6:318\n154#6:422\n154#6:423\n154#6:424\n154#6:432\n58#7:330\n75#7:331\n66#8,6:335\n72#8:369\n76#8:374\n66#8,6:375\n72#8:409\n76#8:421\n78#9,11:341\n91#9:373\n78#9,11:381\n91#9:420\n4144#10,6:360\n4144#10,6:400\n81#11:433\n107#11,2:434\n*S KotlinDebug\n*F\n+ 1 FacePanel.kt\ncom/yalla/yalla/ui/composable/face_panel/FacePanelKt\n*L\n70#1:303,4\n70#1:311,2\n70#1:317\n70#1:307\n81#1:319\n144#1:326\n145#1:352,8\n145#1:366,3\n145#1:370,3\n254#1:392,8\n254#1:406,3\n258#1:410\n254#1:417,3\n295#1:425\n70#1:308,3\n70#1:314,3\n81#1:320,6\n144#1:327,3\n144#1:332,3\n258#1:411,6\n295#1:426,6\n70#1:313\n73#1:318\n290#1:422\n291#1:423\n292#1:424\n298#1:432\n144#1:330\n144#1:331\n145#1:335,6\n145#1:369\n145#1:374\n254#1:375,6\n254#1:409\n254#1:421\n145#1:341,11\n145#1:373\n254#1:381,11\n254#1:420\n145#1:360,6\n254#1:400,6\n81#1:433\n81#1:434,2\n*E\n"})
public final class OooOOOO {

    public static final class OooO extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f51855OooO0Oo = new OooO();

        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.face_panel.FacePanelKt$FacePanel$1", f = "FacePanel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nFacePanel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacePanel.kt\ncom/yalla/yalla/ui/composable/face_panel/FacePanelKt$FacePanel$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,302:1\n154#2:303\n*S KotlinDebug\n*F\n+ 1 FacePanel.kt\ncom/yalla/yalla/ui/composable/face_panel/FacePanelKt$FacePanel$1\n*L\n76#1:303\n*E\n"})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ float f51856OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ p518o0o0O0O0.OooO0OO f51857OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(float f, p518o0o0O0O0.OooO0OO oooO0OO, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f51856OooO0Oo = f;
            this.f51857OooO0o0 = oooO0OO;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f51856OooO0Oo, this.f51857OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            float fM3775constructorimpl = Dp.m3775constructorimpl(0);
            float f = this.f51856OooO0Oo;
            if (Dp.m3774compareTo0680j_4(f, fM3775constructorimpl) > 0) {
                p518o0o0O0O0.OooO0OO oooO0OO = this.f51857OooO0o0;
                if (!Dp.m3780equalsimpl0(oooO0OO.OooO0o0(), f)) {
                    oooO0OO.f51838OooO0o0.setValue(Dp.m3773boximpl(f));
                    o00oO0o o00oo0o2 = o00oO0o.f43168OooO00o;
                    Context context = o000O00O.OooO00o();
                    int iOooO00o = o0000O0.OooO00o(f);
                    o00oo0o2.getClass();
                    Intrinsics.checkNotNullParameter(context, "context");
                    SharedPreferences sharedPreferencesOooO0O0 = o00oO0o.OooO0O0(context);
                    Intrinsics.checkNotNull(sharedPreferencesOooO0O0);
                    sharedPreferencesOooO0O0.edit().putInt(o00oO0o.f43170OooO0OO, iOooO00o).apply();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.face_panel.FacePanelKt$FacePanel$2", f = "FacePanel.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nFacePanel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacePanel.kt\ncom/yalla/yalla/ui/composable/face_panel/FacePanelKt$FacePanel$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,302:1\n154#2:303\n154#2:304\n154#2:305\n*S KotlinDebug\n*F\n+ 1 FacePanel.kt\ncom/yalla/yalla/ui/composable/face_panel/FacePanelKt$FacePanel$2\n*L\n87#1:303\n90#1:304\n115#1:305\n*E\n"})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f51858OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ p518o0o0O0O0.OooO0OO f51859OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ float f51860OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f51861OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(float f, p518o0o0O0O0.OooO0OO oooO0OO, MutableState<Boolean> mutableState, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f51860OooO0o0 = f;
            this.f51859OooO0o = oooO0OO;
            this.f51861OooO0oO = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f51860OooO0o0, this.f51859OooO0o, this.f51861OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f51858OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                float f = this.f51860OooO0o0;
                o0000O00.OooO0OO("AAQQA", "imeTargetHeight = " + Dp.m3786toStringimpl(f));
                Boolean bool = Boolean.FALSE;
                MutableState<Boolean> mutableState = this.f51861OooO0oO;
                mutableState.setValue(bool);
                float f2 = 0;
                int iM3774compareTo0680j_4 = Dp.m3774compareTo0680j_4(f, Dp.m3775constructorimpl(f2));
                p518o0o0O0O0.OooO0OO oooO0OO = this.f51859OooO0o;
                if (iM3774compareTo0680j_4 > 0) {
                    oooO0OO.f51840OooO0oo.setValue(bool);
                    if (Dp.m3780equalsimpl0(oooO0OO.OooO0O0(), Dp.m3775constructorimpl(f2))) {
                        oooO0OO.OooO0oo(true);
                        oooO0OO.f51835OooO0OO.invoke(Boxing.boxBoolean(true));
                    } else if (Dp.m3780equalsimpl0(f, oooO0OO.OooO0O0())) {
                        oooO0OO.OooO0oo(false);
                    } else if (Dp.m3774compareTo0680j_4(f, oooO0OO.OooO0O0()) < 0) {
                        oooO0OO.OooO0oo(false);
                        float fOooO0o0 = oooO0OO.OooO0o0();
                        this.f51858OooO0Oo = 1;
                        if (oooO0OO.OooO00o(fOooO0o0, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (Dp.m3774compareTo0680j_4(f, oooO0OO.OooO0O0()) > 0) {
                        mutableState.setValue(Boolean.TRUE);
                    }
                } else if (oooO0OO.OooO0OO()) {
                    oooO0OO.OooO0oo(false);
                } else if (Dp.m3774compareTo0680j_4(oooO0OO.OooO0O0(), Dp.m3775constructorimpl(f2)) > 0) {
                    oooO0OO.OooO0oo(true);
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

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.face_panel.FacePanelKt$FacePanel$3", f = "FacePanel.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f51862OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f51863OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ p518o0o0O0O0.OooO0OO f51864OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(p518o0o0O0O0.OooO0OO oooO0OO, MutableState<Boolean> mutableState, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f51864OooO0o0 = oooO0OO;
            this.f51863OooO0o = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f51864OooO0o0, this.f51863OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f51862OooO0Oo;
            p518o0o0O0O0.OooO0OO oooO0OO = this.f51864OooO0o0;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                boolean zOooO0o = oooO0OO.OooO0o();
                MutableState mutableState = oooO0OO.f51836OooO0Oo;
                if (zOooO0o && this.f51863OooO0o.getValue().booleanValue() && Dp.m3774compareTo0680j_4(oooO0OO.OooO0Oo(), oooO0OO.OooO0O0()) >= 0 && !((Boolean) mutableState.getValue()).booleanValue()) {
                    oooO0OO.OooO0oo(true);
                }
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    float fOooO0Oo = oooO0OO.OooO0Oo();
                    this.f51862OooO0Oo = 1;
                    Object objSnapTo = oooO0OO.f51834OooO0O0.snapTo(Boxing.boxFloat(fOooO0Oo), this);
                    if (objSnapTo != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objSnapTo = Unit.INSTANCE;
                    }
                    if (objSnapTo == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (oooO0OO.OooO0Oo() == 0.0f) {
                oooO0OO.f51835OooO0OO.invoke(Boxing.boxBoolean(false));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p518o0o0O0O0.OooO0OO f51865OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f51866OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(p518o0o0O0O0.OooO0OO oooO0OO, CoroutineScope coroutineScope) {
            super(0);
            this.f51865OooO0Oo = oooO0OO;
            this.f51866OooO0o0 = coroutineScope;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            p518o0o0O0O0.OooO0OO oooO0OO = this.f51865OooO0Oo;
            if (oooO0OO.OooO0OO()) {
                BuildersKt__Builders_commonKt.launch$default(this.f51866OooO0o0, null, null, new OooOo00(oooO0OO, null), 3, null);
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nFacePanel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacePanel.kt\ncom/yalla/yalla/ui/composable/face_panel/FacePanelKt$FacePanel$5$2\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,302:1\n66#2,6:303\n72#2:337\n76#2:354\n78#3,11:309\n91#3:353\n456#4,8:320\n464#4,3:334\n50#4:338\n49#4:339\n467#4,3:350\n4144#5,6:328\n1097#6,6:340\n154#7:346\n164#7:347\n154#7:348\n154#7:349\n*S KotlinDebug\n*F\n+ 1 FacePanel.kt\ncom/yalla/yalla/ui/composable/face_panel/FacePanelKt$FacePanel$5$2\n*L\n153#1:303,6\n153#1:337\n153#1:354\n153#1:309,11\n153#1:353\n153#1:320,8\n153#1:334,3\n159#1:338\n159#1:339\n153#1:350,3\n153#1:328,6\n159#1:340,6\n173#1:346\n187#1:347\n190#1:348\n197#1:349\n*E\n"})
    public static final class OooOO0 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f51867OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p518o0o0O0O0.OooO0OO f51868OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f51869OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ float f51870OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f51871OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f51872OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f51873OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f51874OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0(p518o0o0O0O0.OooO0OO oooO0OO, float f, Function1<? super String, Unit> function1, Function1<? super String, Unit> function2, int i, Function1<? super String, Unit> function3, Function0<Unit> function0, CoroutineScope coroutineScope) {
            super(3);
            this.f51868OooO0Oo = oooO0OO;
            this.f51870OooO0o0 = f;
            this.f51869OooO0o = function1;
            this.f51871OooO0oO = function2;
            this.f51872OooO0oo = i;
            this.f51867OooO = function3;
            this.f51873OooOO0 = function0;
            this.f51874OooOO0O = coroutineScope;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            Object obj;
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1999275283, iIntValue, -1, "com.yalla.yalla.ui.composable.face_panel.FacePanel.<anonymous>.<anonymous> (FacePanel.kt:152)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM439offsetVpY3zN4$default = OffsetKt.m439offsetVpY3zN4$default(SizeKt.m514requiredHeight3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), this.f51868OooO0Oo.OooO0o0()), 0.0f, this.f51870OooO0o0, 1, null);
            composer2.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer2, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM439offsetVpY3zN4$default);
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
            composer2.startReplaceableGroup(511388516);
            Function1<String, Unit> function1 = this.f51869OooO0o;
            boolean zChanged = composer2.changed(function1) | composer2.changed(this.f51871OooO0oO);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = objRememberedValue;
                ArrayList arrayList = new ArrayList();
                arrayList.add(new o00Ooo(-1));
                if (function1 != null) {
                    arrayList.add(new o00Ooo(-2));
                }
                composer2.updateRememberedValue(arrayList);
                obj = arrayList;
            }
            obj = objRememberedValue;
            composer2.endReplaceableGroup();
            List list = (List) obj;
            PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, new o00Oo0(list), composer2, 0, 3);
            float f = 42;
            Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(f), 7, null);
            Function1<String, Unit> function2 = this.f51867OooO;
            int i = this.f51872OooO0oo;
            PagerKt.m687HorizontalPagerxYaah8o(pagerStateRememberPagerState, modifierM482paddingqDBjuR0$default, null, null, 0, 0.0f, null, null, false, false, null, null, ComposableLambdaKt.composableLambda(composer2, 519604330, true, new OooOo(function2, i)), composer2, 48, 384, 4092);
            AnimatedVisibilityKt.AnimatedVisibility(pagerStateRememberPagerState.getCurrentPage() == 0, SemanticsModifierKt.semantics$default(boxScopeInstance.align(companion, companion2.getBottomEnd()), false, Oooo000.f51890OooO0Oo, 1, null), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer2, -1660632203, true, new Oooo0(boxScopeInstance, this.f51873OooOO0, i)), composer2, 196608, 28);
            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl((float) 0.5d), BackgroundKt.m171backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(PaddingKt.m482paddingqDBjuR0$default(boxScopeInstance.align(companion, companion2.getBottomEnd()), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(f), 7, null), 0.0f, 1, null), o0OOo000.f48284o000ooOO, null, 2, null), composer2, 6, 0);
            LazyDslKt.LazyRow(boxScopeInstance.align(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(f)), companion2.getBottomEnd()), null, null, false, null, null, null, false, new o00O0O(list, pagerStateRememberPagerState, this.f51874OooOO0O), composer2, 0, 254);
            if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Modifier f51875OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p518o0o0O0O0.OooO0OO f51876OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f51877OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f51878OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f51879OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f51880OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f51881OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f51882OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0O(p518o0o0O0O0.OooO0OO oooO0OO, Function1<? super String, Unit> function1, Function0<Unit> function0, Function1<? super String, Unit> function2, Function1<? super String, Unit> function3, Modifier modifier, int i, int i2) {
            super(2);
            this.f51876OooO0Oo = oooO0OO;
            this.f51878OooO0o0 = function1;
            this.f51877OooO0o = function0;
            this.f51879OooO0oO = function2;
            this.f51880OooO0oo = function3;
            this.f51875OooO = modifier;
            this.f51881OooOO0 = i;
            this.f51882OooOO0O = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooOOOO.OooO00o(this.f51876OooO0Oo, this.f51878OooO0o0, this.f51877OooO0o, this.f51879OooO0oO, this.f51880OooO0oo, this.f51875OooO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f51881OooOO0 | 1), this.f51882OooOO0O);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull p518o0o0O0O0.OooO0OO controller, @NotNull Function1<? super String, Unit> onEmojiFaceClick, @NotNull Function0<Unit> onDeleteClick, @Nullable Function1<? super String, Unit> function1, @Nullable Function1<? super String, Unit> function2, @Nullable Modifier modifier, @Nullable Composer composer, int i, int i2) {
        Continuation continuation;
        int i3;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(onEmojiFaceClick, "onEmojiFaceClick");
        Intrinsics.checkNotNullParameter(onDeleteClick, "onDeleteClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1272711119);
        Function1<? super String, Unit> function3 = (i2 & 8) != 0 ? null : function1;
        Function1<? super String, Unit> function4 = (i2 & 16) != 0 ? null : function2;
        Modifier modifier2 = (i2 & 32) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1272711119, i, -1, "com.yalla.yalla.ui.composable.face_panel.FacePanel (FacePanel.kt:68)");
        }
        Object objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
        Composer.Companion companion = Composer.INSTANCE;
        if (objOooO00o == companion.getEmpty()) {
            objOooO00o = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
        }
        composerStartRestartGroup.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
        composerStartRestartGroup.endReplaceableGroup();
        WindowInsets.Companion companion2 = WindowInsets.INSTANCE;
        if (androidx.compose.foundation.layout.o00oO0o.OooO00o(companion2, "<this>", composerStartRestartGroup, 1872863614)) {
            ComposerKt.traceEventStart(1872863614, 8, -1, "com.code.android.theme.util.<get-imeTargetHeight> (SystemUiUtil.kt:73)");
        }
        float f = 0;
        float fM3789unboximpl = ((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m3773boximpl(Dp.m3775constructorimpl(WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getImeAnimationTarget(companion2, composerStartRestartGroup, 8), composerStartRestartGroup, 0).getBottom() - o00000OO.OooO00o(companion2, composerStartRestartGroup))), Dp.m3773boximpl(Dp.m3775constructorimpl(f)))).m3789unboximpl();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composerStartRestartGroup.endReplaceableGroup();
        controller.f51839OooO0oO.setValue(Boolean.valueOf(Dp.m3774compareTo0680j_4(fM3789unboximpl, Dp.m3775constructorimpl(f)) > 0));
        EffectsKt.LaunchedEffect(Dp.m3773boximpl(fM3789unboximpl), new OooO00o(fM3789unboximpl, controller, null), composerStartRestartGroup, 64);
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == companion.getEmpty()) {
            continuation = null;
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        } else {
            continuation = null;
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        EffectsKt.LaunchedEffect(Dp.m3773boximpl(fM3789unboximpl), new OooO0O0(fM3789unboximpl, controller, mutableState, continuation), composerStartRestartGroup, 64);
        Intrinsics.checkNotNullParameter(companion2, "<this>");
        composerStartRestartGroup.startReplaceableGroup(1419080414);
        if (ComposerKt.isTraceInProgress()) {
            i3 = 8;
            ComposerKt.traceEventStart(1419080414, 8, -1, "com.code.android.theme.util.<get-imeHeight> (SystemUiUtil.kt:60)");
        } else {
            i3 = 8;
        }
        float fM3789unboximpl2 = ((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m3773boximpl(Dp.m3775constructorimpl(WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getIme(companion2, composerStartRestartGroup, i3), composerStartRestartGroup, 0).getBottom() - o00000OO.OooO00o(companion2, composerStartRestartGroup))), Dp.m3773boximpl(Dp.m3775constructorimpl(f)))).m3789unboximpl();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composerStartRestartGroup.endReplaceableGroup();
        controller.f51837OooO0o.setValue(Dp.m3773boximpl(fM3789unboximpl2));
        EffectsKt.LaunchedEffect(Dp.m3773boximpl(controller.OooO0Oo()), new OooO0OO(controller, mutableState, null), composerStartRestartGroup, 64);
        OooOo.OooO00o(controller.OooO0OO(), new OooO0o(controller, coroutineScope), composerStartRestartGroup, 0, 0);
        float fOooO0Oo = ((Boolean) controller.f51836OooO0Oo.getValue()).booleanValue() ? controller.OooO0Oo() : controller.OooO0O0();
        Dp dpM3773boximpl = Dp.m3773boximpl(fOooO0Oo);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(dpM3773boximpl);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = Dp.m3773boximpl(Dp.m3775constructorimpl(Dp.m3775constructorimpl(controller.OooO0o0() - fOooO0Oo) / 2));
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        float fM3789unboximpl3 = ((Dp) objRememberedValue2).m3789unboximpl();
        Modifier.Companion companion3 = Modifier.INSTANCE;
        Modifier modifierM511height3ABfNKs = SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion3.then(modifier2), 0.0f, 1, null), fOooO0Oo);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM511height3ABfNKs);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier modifier3 = modifier2;
        AnimatedVisibilityKt.AnimatedVisibility(controller.OooO0OO(), SemanticsModifierKt.semantics$default(companion3, false, OooO.f51855OooO0Oo, 1, null), EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1999275283, true, new OooOO0(controller, fM3789unboximpl3, function3, function4, i, onEmojiFaceClick, onDeleteClick, coroutineScope)), composerStartRestartGroup, 200064, 16);
        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(controller, onEmojiFaceClick, onDeleteClick, function3, function4, modifier3, i, i2));
    }

    public static final void OooO0O0(BoxScope boxScope, Function0 function0, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(924573582);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(924573582, i2, -1, "com.yalla.yalla.ui.composable.face_panel.EmojiFaceDeleteButton (FacePanel.kt:285)");
            }
            Painter painterPainterResource = PainterResources_androidKt.painterResource(o0O0O00.ic_new_face_emoji_delete, composerStartRestartGroup, 0);
            float f = 50;
            Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m511height3ABfNKs(SizeKt.m530width3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m3775constructorimpl(7), Dp.m3775constructorimpl(f), 3, null), Dp.m3775constructorimpl(f)), Dp.m3775constructorimpl(35)), RoundedCornerShapeKt.getCircleShape()), o0OOo000.f48286o000ooo0, null, 2, null);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(function0);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new p518o0o0O0O0.OooO(function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ImageKt.Image(painterPainterResource, (String) null, boxScope.align(PaddingKt.m478padding3ABfNKs(com.code.android.util.o0O0O00.OooO0O0(modifierM171backgroundbw27NRU$default, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 251), Dp.m3775constructorimpl(4)), Alignment.INSTANCE.getBottomEnd()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p518o0o0O0O0.OooOO0(boxScope, function0, i));
    }

    public static final void OooO0OO(Function1 function1, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1766298791);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1766298791, i2, -1, "com.yalla.yalla.ui.composable.face_panel.EmojiFaceList (FacePanel.kt:252)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            GridCells.Fixed fixed = new GridCells.Fixed(7);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(function1);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OooOOO0(function1, i2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            LazyGridDslKt.LazyVerticalGrid(fixed, null, null, null, false, null, null, null, false, (Function1) objRememberedValue, composerStartRestartGroup, 0, 510);
            if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(function1, i));
    }
}
