package com.google.accompanist.pager;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.qiniu.android.storage.Configuration;
import com.zego.zegoliveroom.constants.ZegoConstants;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ConstantsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import net.sqlcipher.database.SQLiteDatabase;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p230o00oOo0o.o00000;
import p230o00oOo0o.o000000;
import p230o00oOo0o.o000OOo;
import p230o00oOo0o.o0O0O00;
import p230o00oOo0o.o0OO00O;
import p230o00oOo0o.o0Oo0oo;
import p623o0oo0oo0.o00O00;

/* JADX INFO: loaded from: classes3.dex */
@JvmName(name = "Pager")
@SourceDebugExtension({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\ncom/google/accompanist/pager/Pager\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,580:1\n154#2:581\n154#2:582\n154#2:583\n154#2:584\n1#3:585\n36#4:586\n50#4:593\n49#4:594\n36#4:601\n36#4:608\n67#4,3:616\n66#4:619\n36#4:626\n36#4:633\n83#4,3:640\n83#4,3:649\n1114#5,6:587\n1114#5,6:595\n1114#5,6:602\n1114#5,6:609\n1114#5,6:620\n1114#5,6:627\n1114#5,6:634\n1114#5,6:643\n1114#5,6:652\n76#6:615\n*S KotlinDebug\n*F\n+ 1 Pager.kt\ncom/google/accompanist/pager/Pager\n*L\n275#1:581\n276#1:582\n337#1:583\n338#1:584\n384#1:586\n389#1:593\n389#1:594\n394#1:601\n403#1:608\n409#1:616,3\n409#1:619\n413#1:626\n417#1:633\n435#1:640,3\n464#1:649,3\n384#1:587,6\n389#1:595,6\n394#1:602,6\n403#1:609,6\n409#1:620,6\n413#1:627,6\n417#1:634,6\n435#1:643,6\n464#1:652,6\n408#1:615\n*E\n"})
public final class Pager {

    @DebugMetadata(c = "com.google.accompanist.pager.Pager$Pager$6$1", f = "Pager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\ncom/google/accompanist/pager/Pager$Pager$6$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,580:1\n1#2:581\n*E\n"})
    public static final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Density f13803OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ float f13804OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o000000 f13805OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(Density density, o000000 o000000Var, float f, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f13803OooO0Oo = density;
            this.f13805OooO0o0 = o000000Var;
            this.f13804OooO0o = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO(this.f13803OooO0Oo, this.f13805OooO0o0, this.f13804OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f13805OooO0o0.f39754OooO0OO.setValue(Integer.valueOf(this.f13803OooO0Oo.mo320roundToPx0680j_4(this.f13804OooO0o)));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f13806OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f13807OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o000000 f13808OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Modifier f13809OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f13810OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ float f13811OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Alignment.Vertical f13812OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ FlingBehavior f13813OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Object> f13814OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ Function4<o0O0O00, Integer, Composer, Integer, Unit> f13815OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ boolean f13816OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final /* synthetic */ int f13817OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final /* synthetic */ int f13818OooOOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final /* synthetic */ int f13819OooOOo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(int i, Modifier modifier, o000000 o000000Var, boolean z, float f, PaddingValues paddingValues, Alignment.Vertical vertical, FlingBehavior flingBehavior, Function1<? super Integer, ? extends Object> function1, boolean z2, Function4<? super o0O0O00, ? super Integer, ? super Composer, ? super Integer, Unit> function4, int i2, int i3, int i4) {
            super(2);
            this.f13807OooO0Oo = i;
            this.f13809OooO0o0 = modifier;
            this.f13808OooO0o = o000000Var;
            this.f13810OooO0oO = z;
            this.f13811OooO0oo = f;
            this.f13806OooO = paddingValues;
            this.f13812OooOO0 = vertical;
            this.f13813OooOO0O = flingBehavior;
            this.f13814OooOO0o = function1;
            this.f13816OooOOO0 = z2;
            this.f13815OooOOO = function4;
            this.f13817OooOOOO = i2;
            this.f13818OooOOOo = i3;
            this.f13819OooOOo0 = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            Pager.OooO00o(this.f13807OooO0Oo, this.f13809OooO0o0, this.f13808OooO0o, this.f13810OooO0oO, this.f13811OooO0oo, this.f13806OooO, this.f13812OooOO0, this.f13813OooOO0O, this.f13814OooOO0o, this.f13816OooOOO0, this.f13815OooOOO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f13817OooOOOO | 1), RecomposeScopeImplKt.updateChangedFlags(this.f13818OooOOOo), this.f13819OooOOo0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ FlingBehavior f13820OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(FlingBehavior flingBehavior) {
            super(0);
            this.f13820OooO0Oo = flingBehavior;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            FlingBehavior flingBehavior = this.f13820OooO0Oo;
            o00O00 o00o01 = flingBehavior instanceof o00O00 ? (o00O00) flingBehavior : null;
            if (o00o01 != null) {
                return (Integer) o00o01.f57611OooO0o.getValue();
            }
            return null;
        }
    }

    @DebugMetadata(c = "com.google.accompanist.pager.Pager$Pager$3$1", f = "Pager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o000000 f13821OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f13822OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o000000 o000000Var, int i, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f13821OooO0Oo = o000000Var;
            this.f13822OooO0o0 = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f13821OooO0Oo, this.f13822OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            int i = this.f13822OooO0o0 - 1;
            o000000 o000000Var = this.f13821OooO0Oo;
            int iCoerceAtLeast = RangesKt.coerceAtLeast(Math.min(i, o000000Var.OooO0oO()), 0);
            if (iCoerceAtLeast != o000000Var.OooO0oO()) {
                o000000Var.f39753OooO0O0.setValue(Integer.valueOf(iCoerceAtLeast));
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.google.accompanist.pager.Pager$Pager$5$1", f = "Pager.kt", i = {}, l = {406}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f13823OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o000000 f13824OooO0o0;

        public static final class OooO00o extends Lambda implements Function0<Integer> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ o000000 f13825OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(o000000 o000000Var) {
                super(0);
                this.f13825OooO0Oo = o000000Var;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                LazyListItemInfo lazyListItemInfoOooO0o0 = this.f13825OooO0Oo.OooO0o0();
                if (lazyListItemInfoOooO0o0 != null) {
                    return Integer.valueOf(lazyListItemInfoOooO0o0.getIndex());
                }
                return null;
            }
        }

        public static final class OooO0O0 implements FlowCollector<Integer> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ o000000 f13826OooO0Oo;

            public OooO0O0(o000000 o000000Var) {
                this.f13826OooO0Oo = o000000Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Integer num, Continuation continuation) {
                int index;
                o000000 o000000Var = this.f13826OooO0Oo;
                LazyListItemInfo lazyListItemInfoOooO0o0 = o000000Var.OooO0o0();
                if (lazyListItemInfoOooO0o0 != null && (index = lazyListItemInfoOooO0o0.getIndex()) != o000000Var.OooO0oO()) {
                    o000000Var.f39753OooO0O0.setValue(Integer.valueOf(index));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(o000000 o000000Var, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f13824OooO0o0 = o000000Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(this.f13824OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f13823OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o000000 o000000Var = this.f13824OooO0o0;
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(SnapshotStateKt.snapshotFlow(new OooO00o(o000000Var)));
                OooO0O0 oooO0O0 = new OooO0O0(o000000Var);
                this.f13823OooO0Oo = 1;
                if (flowDistinctUntilChanged.collect(oooO0O0, this) == coroutine_suspended) {
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

    public static final class OooOO0 extends Lambda implements Function1<LazyListScope, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f13827OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f13828OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0Oo0oo f13829OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Object> f13830OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function4<o0O0O00, Integer, Composer, Integer, Unit> f13831OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ o000OOo f13832OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0(int i, Function1<? super Integer, ? extends Object> function1, o0Oo0oo o0oo0oo2, Function4<? super o0O0O00, ? super Integer, ? super Composer, ? super Integer, Unit> function4, o000OOo o000ooo2, int i2) {
            super(1);
            this.f13828OooO0Oo = i;
            this.f13830OooO0o0 = function1;
            this.f13829OooO0o = o0oo0oo2;
            this.f13831OooO0oO = function4;
            this.f13832OooO0oo = o000ooo2;
            this.f13827OooO = i2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LazyListScope lazyListScope) {
            LazyListScope LazyColumn = lazyListScope;
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            LazyListScope.CC.OooOO0O(LazyColumn, this.f13828OooO0Oo, this.f13830OooO0o0, null, ComposableLambdaKt.composableLambdaInstance(1889356237, true, new com.google.accompanist.pager.OooO00o(this.f13829OooO0o, this.f13831OooO0oO, this.f13832OooO0oo, this.f13827OooO)), 4, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<LazyListScope, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f13833OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f13834OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0Oo0oo f13835OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Object> f13836OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function4<o0O0O00, Integer, Composer, Integer, Unit> f13837OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ o000OOo f13838OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0O(int i, Function1<? super Integer, ? extends Object> function1, o0Oo0oo o0oo0oo2, Function4<? super o0O0O00, ? super Integer, ? super Composer, ? super Integer, Unit> function4, o000OOo o000ooo2, int i2) {
            super(1);
            this.f13834OooO0Oo = i;
            this.f13836OooO0o0 = function1;
            this.f13835OooO0o = o0oo0oo2;
            this.f13837OooO0oO = function4;
            this.f13838OooO0oo = o000ooo2;
            this.f13833OooO = i2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LazyListScope lazyListScope) {
            LazyListScope LazyRow = lazyListScope;
            Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
            LazyListScope.CC.OooOO0O(LazyRow, this.f13834OooO0Oo, this.f13836OooO0o0, null, ComposableLambdaKt.composableLambdaInstance(-70560628, true, new com.google.accompanist.pager.OooO0O0(this.f13835OooO0o, this.f13837OooO0oO, this.f13838OooO0oo, this.f13833OooO)), 4, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f13839OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f13840OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o000000 f13841OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Modifier f13842OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f13843OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ float f13844OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Alignment.Horizontal f13845OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ FlingBehavior f13846OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Object> f13847OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ Function4<o0O0O00, Integer, Composer, Integer, Unit> f13848OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ boolean f13849OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final /* synthetic */ int f13850OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final /* synthetic */ int f13851OooOOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final /* synthetic */ int f13852OooOOo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOOO(int i, Modifier modifier, o000000 o000000Var, boolean z, float f, PaddingValues paddingValues, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, Function1<? super Integer, ? extends Object> function1, boolean z2, Function4<? super o0O0O00, ? super Integer, ? super Composer, ? super Integer, Unit> function4, int i2, int i3, int i4) {
            super(2);
            this.f13840OooO0Oo = i;
            this.f13842OooO0o0 = modifier;
            this.f13841OooO0o = o000000Var;
            this.f13843OooO0oO = z;
            this.f13844OooO0oo = f;
            this.f13839OooO = paddingValues;
            this.f13845OooOO0 = horizontal;
            this.f13846OooOO0O = flingBehavior;
            this.f13847OooOO0o = function1;
            this.f13849OooOOO0 = z2;
            this.f13848OooOOO = function4;
            this.f13850OooOOOO = i2;
            this.f13851OooOOOo = i3;
            this.f13852OooOOo0 = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            Pager.OooO0OO(this.f13840OooO0Oo, this.f13842OooO0o0, this.f13841OooO0o, this.f13843OooO0oO, this.f13844OooO0oo, this.f13839OooO, this.f13845OooOO0, this.f13846OooOO0O, this.f13847OooOO0o, this.f13849OooOOO0, this.f13848OooOOO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f13850OooOOOO | 1), RecomposeScopeImplKt.updateChangedFlags(this.f13851OooOOOo), this.f13852OooOOo0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ boolean f13853OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f13854OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o000000 f13855OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Modifier f13856OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f13857OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ float f13858OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ FlingBehavior f13859OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Object> f13860OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f13861OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ Alignment.Vertical f13862OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ boolean f13863OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final /* synthetic */ Alignment.Horizontal f13864OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final /* synthetic */ Function4<o0O0O00, Integer, Composer, Integer, Unit> f13865OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public final /* synthetic */ int f13866OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final /* synthetic */ int f13867OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public final /* synthetic */ int f13868OooOOoo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOOO0(int i, Modifier modifier, o000000 o000000Var, boolean z, float f, boolean z2, FlingBehavior flingBehavior, Function1<? super Integer, ? extends Object> function1, PaddingValues paddingValues, boolean z3, Alignment.Vertical vertical, Alignment.Horizontal horizontal, Function4<? super o0O0O00, ? super Integer, ? super Composer, ? super Integer, Unit> function4, int i2, int i3, int i4) {
            super(2);
            this.f13854OooO0Oo = i;
            this.f13856OooO0o0 = modifier;
            this.f13855OooO0o = o000000Var;
            this.f13857OooO0oO = z;
            this.f13858OooO0oo = f;
            this.f13853OooO = z2;
            this.f13859OooOO0 = flingBehavior;
            this.f13860OooOO0O = function1;
            this.f13861OooOO0o = paddingValues;
            this.f13863OooOOO0 = z3;
            this.f13862OooOOO = vertical;
            this.f13864OooOOOO = horizontal;
            this.f13865OooOOOo = function4;
            this.f13867OooOOo0 = i2;
            this.f13866OooOOo = i3;
            this.f13868OooOOoo = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            Pager.OooO0O0(this.f13854OooO0Oo, this.f13856OooO0o0, this.f13855OooO0o, this.f13857OooO0oO, this.f13858OooO0oo, this.f13853OooO, this.f13859OooOO0, this.f13860OooOO0O, this.f13861OooOO0o, this.f13863OooOOO0, this.f13862OooOOO, this.f13864OooOOOO, this.f13865OooOOOo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f13867OooOOo0 | 1), RecomposeScopeImplKt.updateChangedFlags(this.f13866OooOOo), this.f13868OooOOoo);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012c  */
    /* JADX WARN: Code duplicated, block: B:102:0x0132  */
    /* JADX WARN: Code duplicated, block: B:104:0x0138  */
    /* JADX WARN: Code duplicated, block: B:105:0x013b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0143  */
    /* JADX WARN: Code duplicated, block: B:110:0x0146  */
    /* JADX WARN: Code duplicated, block: B:112:0x014a  */
    /* JADX WARN: Code duplicated, block: B:114:0x0150  */
    /* JADX WARN: Code duplicated, block: B:115:0x0152  */
    /* JADX WARN: Code duplicated, block: B:117:0x0156  */
    /* JADX WARN: Code duplicated, block: B:120:0x0162  */
    /* JADX WARN: Code duplicated, block: B:126:0x0185  */
    /* JADX WARN: Code duplicated, block: B:128:0x018f  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:139:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:140:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:146:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:149:0x01db  */
    /* JADX WARN: Code duplicated, block: B:151:0x01df  */
    /* JADX WARN: Code duplicated, block: B:152:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:154:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:155:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:158:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:159:0x0210  */
    /* JADX WARN: Code duplicated, block: B:161:0x0214  */
    /* JADX WARN: Code duplicated, block: B:162:0x0216  */
    /* JADX WARN: Code duplicated, block: B:165:0x021c  */
    /* JADX WARN: Code duplicated, block: B:166:0x022d  */
    /* JADX WARN: Code duplicated, block: B:169:0x0246  */
    /* JADX WARN: Code duplicated, block: B:172:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:177:0x02be  */
    /* JADX WARN: Code duplicated, block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00da  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:89:0x0105  */
    /* JADX WARN: Code duplicated, block: B:90:0x010c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0112  */
    /* JADX WARN: Code duplicated, block: B:94:0x0118  */
    /* JADX WARN: Code duplicated, block: B:95:0x011b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0125  */
    @Deprecated(message = "\naccompanist/pager is deprecated.\nThe androidx.compose equivalent of HorizontalPager is androidx.compose.foundation.pager.HorizontalPager\nFor more migration information, please visit https://google.github.io/accompanist/pager/#migration\n", replaceWith = @ReplaceWith(expression = "HorizontalPager", imports = {"androidx.compose.foundation.pager.HorizontalPager"}))
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void OooO00o(int i, @Nullable Modifier modifier, @Nullable o000000 o000000Var, boolean z, float f, @Nullable PaddingValues paddingValues, @Nullable Alignment.Vertical vertical, @Nullable FlingBehavior flingBehavior, @Nullable Function1<? super Integer, ? extends Object> function1, boolean z2, @NotNull Function4<? super o0O0O00, ? super Integer, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i2, int i3, int i4) {
        int i5;
        int i6;
        boolean z3;
        int i7;
        int i8;
        int i9;
        int i10;
        PaddingValues paddingValues2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Modifier modifier2;
        o000000 o000000VarOooO00o;
        float fM3775constructorimpl;
        PaddingValues paddingValuesM471PaddingValues0680j_4;
        Alignment.Vertical centerVertically;
        FlingBehavior flingBehaviorOooO00o;
        Function1<? super Integer, ? extends Object> function2;
        Modifier modifier3;
        boolean z4;
        Function1<? super Integer, ? extends Object> function3;
        PaddingValues paddingValues3;
        o000000 o000000Var2;
        FlingBehavior flingBehavior2;
        float f2;
        boolean z5;
        Alignment.Vertical vertical2;
        Composer composer2;
        Modifier modifier4;
        o000000 o000000Var3;
        boolean z6;
        float f3;
        PaddingValues paddingValues4;
        Alignment.Vertical vertical3;
        FlingBehavior flingBehavior3;
        Function1<? super Integer, ? extends Object> function4;
        boolean z7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-131850087);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i20 = i4 & 2;
        if (i20 == 0) {
            if ((i2 & 112) == 0) {
                i5 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i2 & 896) != 0) {
                i5 |= ((i4 & 4) == 0 || !composerStartRestartGroup.changed(o000000Var)) ? 128 : PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            i6 = i4 & 8;
            if (i6 != 0) {
                if ((i2 & 7168) == 0) {
                    z3 = z;
                    if (composerStartRestartGroup.changed(z3)) {
                        i7 = 2048;
                    } else {
                        i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i5 |= i7;
                }
                i8 = i4 & 16;
                if (i8 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 57344) == 0) {
                    if (composerStartRestartGroup.changed(f)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 32;
                if (i10 != 0) {
                    i5 |= 196608;
                    paddingValues2 = paddingValues;
                } else {
                    paddingValues2 = paddingValues;
                    if ((i2 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(paddingValues2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i5 |= i11;
                    }
                }
                i12 = i4 & 64;
                if (i12 != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(vertical)) {
                        i13 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i13 = 524288;
                    }
                    i5 |= i13;
                }
                if ((i2 & 29360128) != 0) {
                    i5 |= ((i4 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
                }
                i14 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i14 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                    i5 |= i15;
                }
                i16 = i4 & ConstantsKt.MINIMUM_BLOCK_SIZE;
                if (i16 != 0) {
                    i5 |= 805306368;
                } else if ((i2 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i17 = 536870912;
                    } else {
                        i17 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                    i5 |= i17;
                }
                if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                    i18 = i3 | 6;
                } else if ((i3 & 14) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = 4;
                    } else {
                        i19 = 2;
                    }
                    i18 = i3 | i19;
                } else {
                    i18 = i3;
                }
                if ((i5 & 1533916891) != 306783378 && (i18 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier;
                    o000000Var3 = o000000Var;
                    f3 = f;
                    vertical3 = vertical;
                    flingBehavior3 = flingBehavior;
                    z7 = z2;
                    composer2 = composerStartRestartGroup;
                    z6 = z3;
                    paddingValues4 = paddingValues2;
                    function4 = function1;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        Modifier modifier5 = modifier2;
                        if ((i4 & 4) != 0) {
                            o000000VarOooO00o = o00000.OooO00o(0, composerStartRestartGroup, 0, 1);
                            i5 &= -897;
                        } else {
                            o000000VarOooO00o = o000000Var;
                        }
                        if (i6 != 0) {
                            z3 = false;
                        }
                        if (i8 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f;
                        }
                        if (i10 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i12 != 0) {
                            centerVertically = Alignment.INSTANCE.getCenterVertically();
                        } else {
                            centerVertically = vertical;
                        }
                        if ((i4 & 128) != 0) {
                            o0OO00O.OooO00o oooO00o = o0OO00O.f39788OooO00o;
                            flingBehaviorOooO00o = o0OO00O.OooO00o(o000000VarOooO00o, PaddingKt.calculateEndPadding(paddingValuesM471PaddingValues0680j_4, LayoutDirection.Ltr), composerStartRestartGroup, ((i5 >> 6) & 14) | 24576);
                            i5 &= -29360129;
                        } else {
                            flingBehaviorOooO00o = flingBehavior;
                        }
                        if (i14 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        modifier3 = modifier5;
                        if (i16 != 0) {
                            function3 = function2;
                            paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                            o000000Var2 = o000000VarOooO00o;
                            flingBehavior2 = flingBehaviorOooO00o;
                            f2 = fM3775constructorimpl;
                            z5 = z3;
                            vertical2 = centerVertically;
                            z4 = true;
                        } else {
                            z4 = z2;
                            function3 = function2;
                            paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                            o000000Var2 = o000000VarOooO00o;
                            flingBehavior2 = flingBehaviorOooO00o;
                            f2 = fM3775constructorimpl;
                            z5 = z3;
                            vertical2 = centerVertically;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i4 & 4) != 0) {
                            i5 &= -897;
                        }
                        if ((i4 & 128) != 0) {
                            i5 &= -29360129;
                        }
                        modifier3 = modifier;
                        o000000Var2 = o000000Var;
                        f2 = f;
                        vertical2 = vertical;
                        flingBehavior2 = flingBehavior;
                        function3 = function1;
                        z4 = z2;
                        z5 = z3;
                        paddingValues3 = paddingValues2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-131850087, i5, i18, "com.google.accompanist.pager.HorizontalPager (Pager.kt:269)");
                    }
                    int i21 = i5 >> 3;
                    composer2 = composerStartRestartGroup;
                    OooO0O0(i, modifier3, o000000Var2, z5, f2, false, flingBehavior2, function3, paddingValues3, z4, vertical2, null, content, composer2, (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i21 & 3670016) | (i21 & 29360128) | ((i5 << 9) & 234881024) | (i5 & 1879048192), ((i18 << 6) & 896) | ((i5 >> 18) & 14), 2048);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    o000000Var3 = o000000Var2;
                    z6 = z5;
                    f3 = f2;
                    paddingValues4 = paddingValues3;
                    vertical3 = vertical2;
                    flingBehavior3 = flingBehavior2;
                    function4 = function3;
                    z7 = z4;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(i, modifier4, o000000Var3, z6, f3, paddingValues4, vertical3, flingBehavior3, function4, z7, content, i2, i3, i4));
            }
            i5 |= 3072;
            z3 = z;
            i8 = i4 & 16;
            if (i8 != 0) {
                i5 |= 24576;
            } else if ((i2 & 57344) == 0) {
                if (composerStartRestartGroup.changed(f)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i5 |= i9;
            }
            i10 = i4 & 32;
            if (i10 != 0) {
                i5 |= 196608;
                paddingValues2 = paddingValues;
            } else {
                paddingValues2 = paddingValues;
                if ((i2 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(paddingValues2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i5 |= i11;
                }
            }
            i12 = i4 & 64;
            if (i12 != 0) {
                i5 |= 1572864;
            } else if ((i2 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(vertical)) {
                    i13 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i13 = 524288;
                }
                i5 |= i13;
            }
            if ((i2 & 29360128) != 0) {
                i5 |= ((i4 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
            }
            i14 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i14 != 0) {
                i5 |= 100663296;
            } else if ((i2 & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i15 = 67108864;
                } else {
                    i15 = 33554432;
                }
                i5 |= i15;
            }
            i16 = i4 & ConstantsKt.MINIMUM_BLOCK_SIZE;
            if (i16 != 0) {
                i5 |= 805306368;
            } else if ((i2 & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i17 = 536870912;
                } else {
                    i17 = SQLiteDatabase.CREATE_IF_NECESSARY;
                }
                i5 |= i17;
            }
            if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                i18 = i3 | 6;
            } else if ((i3 & 14) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i19 = 4;
                } else {
                    i19 = 2;
                }
                i18 = i3 | i19;
            } else {
                i18 = i3;
            }
            if ((i5 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    Modifier modifier6 = modifier2;
                    if ((i4 & 4) != 0) {
                        o000000VarOooO00o = o00000.OooO00o(0, composerStartRestartGroup, 0, 1);
                        i5 &= -897;
                    } else {
                        o000000VarOooO00o = o000000Var;
                    }
                    if (i6 != 0) {
                        z3 = false;
                    }
                    if (i8 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f;
                    }
                    if (i10 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i12 != 0) {
                        centerVertically = Alignment.INSTANCE.getCenterVertically();
                    } else {
                        centerVertically = vertical;
                    }
                    if ((i4 & 128) != 0) {
                        o0OO00O.OooO00o oooO00o2 = o0OO00O.f39788OooO00o;
                        flingBehaviorOooO00o = o0OO00O.OooO00o(o000000VarOooO00o, PaddingKt.calculateEndPadding(paddingValuesM471PaddingValues0680j_4, LayoutDirection.Ltr), composerStartRestartGroup, ((i5 >> 6) & 14) | 24576);
                        i5 &= -29360129;
                    } else {
                        flingBehaviorOooO00o = flingBehavior;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    modifier3 = modifier6;
                    if (i16 != 0) {
                        function3 = function2;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        o000000Var2 = o000000VarOooO00o;
                        flingBehavior2 = flingBehaviorOooO00o;
                        f2 = fM3775constructorimpl;
                        z5 = z3;
                        vertical2 = centerVertically;
                        z4 = true;
                    } else {
                        z4 = z2;
                        function3 = function2;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        o000000Var2 = o000000VarOooO00o;
                        flingBehavior2 = flingBehaviorOooO00o;
                        f2 = fM3775constructorimpl;
                        z5 = z3;
                        vertical2 = centerVertically;
                    }
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    Modifier modifier7 = modifier2;
                    if ((i4 & 4) != 0) {
                        o000000VarOooO00o = o00000.OooO00o(0, composerStartRestartGroup, 0, 1);
                        i5 &= -897;
                    } else {
                        o000000VarOooO00o = o000000Var;
                    }
                    if (i6 != 0) {
                        z3 = false;
                    }
                    if (i8 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f;
                    }
                    if (i10 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i12 != 0) {
                        centerVertically = Alignment.INSTANCE.getCenterVertically();
                    } else {
                        centerVertically = vertical;
                    }
                    if ((i4 & 128) != 0) {
                        o0OO00O.OooO00o oooO00o3 = o0OO00O.f39788OooO00o;
                        flingBehaviorOooO00o = o0OO00O.OooO00o(o000000VarOooO00o, PaddingKt.calculateEndPadding(paddingValuesM471PaddingValues0680j_4, LayoutDirection.Ltr), composerStartRestartGroup, ((i5 >> 6) & 14) | 24576);
                        i5 &= -29360129;
                    } else {
                        flingBehaviorOooO00o = flingBehavior;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    modifier3 = modifier7;
                    if (i16 != 0) {
                        function3 = function2;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        o000000Var2 = o000000VarOooO00o;
                        flingBehavior2 = flingBehaviorOooO00o;
                        f2 = fM3775constructorimpl;
                        z5 = z3;
                        vertical2 = centerVertically;
                        z4 = true;
                    } else {
                        z4 = z2;
                        function3 = function2;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        o000000Var2 = o000000VarOooO00o;
                        flingBehavior2 = flingBehaviorOooO00o;
                        f2 = fM3775constructorimpl;
                        z5 = z3;
                        vertical2 = centerVertically;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-131850087, i5, i18, "com.google.accompanist.pager.HorizontalPager (Pager.kt:269)");
                }
                int i22 = i5 >> 3;
                composer2 = composerStartRestartGroup;
                OooO0O0(i, modifier3, o000000Var2, z5, f2, false, flingBehavior2, function3, paddingValues3, z4, vertical2, null, content, composer2, (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i22 & 3670016) | (i22 & 29360128) | ((i5 << 9) & 234881024) | (i5 & 1879048192), ((i18 << 6) & 896) | ((i5 >> 18) & 14), 2048);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                o000000Var3 = o000000Var2;
                z6 = z5;
                f3 = f2;
                paddingValues4 = paddingValues3;
                vertical3 = vertical2;
                flingBehavior3 = flingBehavior2;
                function4 = function3;
                z7 = z4;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    Modifier modifier8 = modifier2;
                    if ((i4 & 4) != 0) {
                        o000000VarOooO00o = o00000.OooO00o(0, composerStartRestartGroup, 0, 1);
                        i5 &= -897;
                    } else {
                        o000000VarOooO00o = o000000Var;
                    }
                    if (i6 != 0) {
                        z3 = false;
                    }
                    if (i8 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f;
                    }
                    if (i10 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i12 != 0) {
                        centerVertically = Alignment.INSTANCE.getCenterVertically();
                    } else {
                        centerVertically = vertical;
                    }
                    if ((i4 & 128) != 0) {
                        o0OO00O.OooO00o oooO00o4 = o0OO00O.f39788OooO00o;
                        flingBehaviorOooO00o = o0OO00O.OooO00o(o000000VarOooO00o, PaddingKt.calculateEndPadding(paddingValuesM471PaddingValues0680j_4, LayoutDirection.Ltr), composerStartRestartGroup, ((i5 >> 6) & 14) | 24576);
                        i5 &= -29360129;
                    } else {
                        flingBehaviorOooO00o = flingBehavior;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    modifier3 = modifier8;
                    if (i16 != 0) {
                        function3 = function2;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        o000000Var2 = o000000VarOooO00o;
                        flingBehavior2 = flingBehaviorOooO00o;
                        f2 = fM3775constructorimpl;
                        z5 = z3;
                        vertical2 = centerVertically;
                        z4 = true;
                    } else {
                        z4 = z2;
                        function3 = function2;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        o000000Var2 = o000000VarOooO00o;
                        flingBehavior2 = flingBehaviorOooO00o;
                        f2 = fM3775constructorimpl;
                        z5 = z3;
                        vertical2 = centerVertically;
                    }
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    Modifier modifier9 = modifier2;
                    if ((i4 & 4) != 0) {
                        o000000VarOooO00o = o00000.OooO00o(0, composerStartRestartGroup, 0, 1);
                        i5 &= -897;
                    } else {
                        o000000VarOooO00o = o000000Var;
                    }
                    if (i6 != 0) {
                        z3 = false;
                    }
                    if (i8 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f;
                    }
                    if (i10 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i12 != 0) {
                        centerVertically = Alignment.INSTANCE.getCenterVertically();
                    } else {
                        centerVertically = vertical;
                    }
                    if ((i4 & 128) != 0) {
                        o0OO00O.OooO00o oooO00o5 = o0OO00O.f39788OooO00o;
                        flingBehaviorOooO00o = o0OO00O.OooO00o(o000000VarOooO00o, PaddingKt.calculateEndPadding(paddingValuesM471PaddingValues0680j_4, LayoutDirection.Ltr), composerStartRestartGroup, ((i5 >> 6) & 14) | 24576);
                        i5 &= -29360129;
                    } else {
                        flingBehaviorOooO00o = flingBehavior;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    modifier3 = modifier9;
                    if (i16 != 0) {
                        function3 = function2;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        o000000Var2 = o000000VarOooO00o;
                        flingBehavior2 = flingBehaviorOooO00o;
                        f2 = fM3775constructorimpl;
                        z5 = z3;
                        vertical2 = centerVertically;
                        z4 = true;
                    } else {
                        z4 = z2;
                        function3 = function2;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        o000000Var2 = o000000VarOooO00o;
                        flingBehavior2 = flingBehaviorOooO00o;
                        f2 = fM3775constructorimpl;
                        z5 = z3;
                        vertical2 = centerVertically;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-131850087, i5, i18, "com.google.accompanist.pager.HorizontalPager (Pager.kt:269)");
                }
                int i23 = i5 >> 3;
                composer2 = composerStartRestartGroup;
                OooO0O0(i, modifier3, o000000Var2, z5, f2, false, flingBehavior2, function3, paddingValues3, z4, vertical2, null, content, composer2, (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i23 & 3670016) | (i23 & 29360128) | ((i5 << 9) & 234881024) | (i5 & 1879048192), ((i18 << 6) & 896) | ((i5 >> 18) & 14), 2048);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                o000000Var3 = o000000Var2;
                z6 = z5;
                f3 = f2;
                paddingValues4 = paddingValues3;
                vertical3 = vertical2;
                flingBehavior3 = flingBehavior2;
                function4 = function3;
                z7 = z4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(i, modifier4, o000000Var3, z6, f3, paddingValues4, vertical3, flingBehavior3, function4, z7, content, i2, i3, i4));
        }
        i5 |= 48;
        if ((i2 & 896) != 0) {
            i5 |= ((i4 & 4) == 0 || !composerStartRestartGroup.changed(o000000Var)) ? 128 : PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        i6 = i4 & 8;
        if (i6 != 0) {
            if ((i2 & 7168) == 0) {
                z3 = z;
                if (composerStartRestartGroup.changed(z3)) {
                    i7 = 2048;
                } else {
                    i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i5 |= i7;
            }
            i8 = i4 & 16;
            if (i8 != 0) {
                i5 |= 24576;
            } else if ((i2 & 57344) == 0) {
                if (composerStartRestartGroup.changed(f)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i5 |= i9;
            }
            i10 = i4 & 32;
            if (i10 != 0) {
                i5 |= 196608;
                paddingValues2 = paddingValues;
            } else {
                paddingValues2 = paddingValues;
                if ((i2 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(paddingValues2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i5 |= i11;
                }
            }
            i12 = i4 & 64;
            if (i12 != 0) {
                i5 |= 1572864;
            } else if ((i2 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(vertical)) {
                    i13 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i13 = 524288;
                }
                i5 |= i13;
            }
            if ((i2 & 29360128) != 0) {
                i5 |= ((i4 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
            }
            i14 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i14 != 0) {
                i5 |= 100663296;
            } else if ((i2 & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i15 = 67108864;
                } else {
                    i15 = 33554432;
                }
                i5 |= i15;
            }
            i16 = i4 & ConstantsKt.MINIMUM_BLOCK_SIZE;
            if (i16 != 0) {
                i5 |= 805306368;
            } else if ((i2 & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i17 = 536870912;
                } else {
                    i17 = SQLiteDatabase.CREATE_IF_NECESSARY;
                }
                i5 |= i17;
            }
            if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                i18 = i3 | 6;
            } else if ((i3 & 14) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i19 = 4;
                } else {
                    i19 = 2;
                }
                i18 = i3 | i19;
            } else {
                i18 = i3;
            }
            if ((i5 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    Modifier modifier10 = modifier2;
                    if ((i4 & 4) != 0) {
                        o000000VarOooO00o = o00000.OooO00o(0, composerStartRestartGroup, 0, 1);
                        i5 &= -897;
                    } else {
                        o000000VarOooO00o = o000000Var;
                    }
                    if (i6 != 0) {
                        z3 = false;
                    }
                    if (i8 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f;
                    }
                    if (i10 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i12 != 0) {
                        centerVertically = Alignment.INSTANCE.getCenterVertically();
                    } else {
                        centerVertically = vertical;
                    }
                    if ((i4 & 128) != 0) {
                        o0OO00O.OooO00o oooO00o6 = o0OO00O.f39788OooO00o;
                        flingBehaviorOooO00o = o0OO00O.OooO00o(o000000VarOooO00o, PaddingKt.calculateEndPadding(paddingValuesM471PaddingValues0680j_4, LayoutDirection.Ltr), composerStartRestartGroup, ((i5 >> 6) & 14) | 24576);
                        i5 &= -29360129;
                    } else {
                        flingBehaviorOooO00o = flingBehavior;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    modifier3 = modifier10;
                    if (i16 != 0) {
                        function3 = function2;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        o000000Var2 = o000000VarOooO00o;
                        flingBehavior2 = flingBehaviorOooO00o;
                        f2 = fM3775constructorimpl;
                        z5 = z3;
                        vertical2 = centerVertically;
                        z4 = true;
                    } else {
                        z4 = z2;
                        function3 = function2;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        o000000Var2 = o000000VarOooO00o;
                        flingBehavior2 = flingBehaviorOooO00o;
                        f2 = fM3775constructorimpl;
                        z5 = z3;
                        vertical2 = centerVertically;
                    }
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    Modifier modifier11 = modifier2;
                    if ((i4 & 4) != 0) {
                        o000000VarOooO00o = o00000.OooO00o(0, composerStartRestartGroup, 0, 1);
                        i5 &= -897;
                    } else {
                        o000000VarOooO00o = o000000Var;
                    }
                    if (i6 != 0) {
                        z3 = false;
                    }
                    if (i8 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f;
                    }
                    if (i10 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i12 != 0) {
                        centerVertically = Alignment.INSTANCE.getCenterVertically();
                    } else {
                        centerVertically = vertical;
                    }
                    if ((i4 & 128) != 0) {
                        o0OO00O.OooO00o oooO00o7 = o0OO00O.f39788OooO00o;
                        flingBehaviorOooO00o = o0OO00O.OooO00o(o000000VarOooO00o, PaddingKt.calculateEndPadding(paddingValuesM471PaddingValues0680j_4, LayoutDirection.Ltr), composerStartRestartGroup, ((i5 >> 6) & 14) | 24576);
                        i5 &= -29360129;
                    } else {
                        flingBehaviorOooO00o = flingBehavior;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    modifier3 = modifier11;
                    if (i16 != 0) {
                        function3 = function2;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        o000000Var2 = o000000VarOooO00o;
                        flingBehavior2 = flingBehaviorOooO00o;
                        f2 = fM3775constructorimpl;
                        z5 = z3;
                        vertical2 = centerVertically;
                        z4 = true;
                    } else {
                        z4 = z2;
                        function3 = function2;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        o000000Var2 = o000000VarOooO00o;
                        flingBehavior2 = flingBehaviorOooO00o;
                        f2 = fM3775constructorimpl;
                        z5 = z3;
                        vertical2 = centerVertically;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-131850087, i5, i18, "com.google.accompanist.pager.HorizontalPager (Pager.kt:269)");
                }
                int i24 = i5 >> 3;
                composer2 = composerStartRestartGroup;
                OooO0O0(i, modifier3, o000000Var2, z5, f2, false, flingBehavior2, function3, paddingValues3, z4, vertical2, null, content, composer2, (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i24 & 3670016) | (i24 & 29360128) | ((i5 << 9) & 234881024) | (i5 & 1879048192), ((i18 << 6) & 896) | ((i5 >> 18) & 14), 2048);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                o000000Var3 = o000000Var2;
                z6 = z5;
                f3 = f2;
                paddingValues4 = paddingValues3;
                vertical3 = vertical2;
                flingBehavior3 = flingBehavior2;
                function4 = function3;
                z7 = z4;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    Modifier modifier12 = modifier2;
                    if ((i4 & 4) != 0) {
                        o000000VarOooO00o = o00000.OooO00o(0, composerStartRestartGroup, 0, 1);
                        i5 &= -897;
                    } else {
                        o000000VarOooO00o = o000000Var;
                    }
                    if (i6 != 0) {
                        z3 = false;
                    }
                    if (i8 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f;
                    }
                    if (i10 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i12 != 0) {
                        centerVertically = Alignment.INSTANCE.getCenterVertically();
                    } else {
                        centerVertically = vertical;
                    }
                    if ((i4 & 128) != 0) {
                        o0OO00O.OooO00o oooO00o8 = o0OO00O.f39788OooO00o;
                        flingBehaviorOooO00o = o0OO00O.OooO00o(o000000VarOooO00o, PaddingKt.calculateEndPadding(paddingValuesM471PaddingValues0680j_4, LayoutDirection.Ltr), composerStartRestartGroup, ((i5 >> 6) & 14) | 24576);
                        i5 &= -29360129;
                    } else {
                        flingBehaviorOooO00o = flingBehavior;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    modifier3 = modifier12;
                    if (i16 != 0) {
                        function3 = function2;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        o000000Var2 = o000000VarOooO00o;
                        flingBehavior2 = flingBehaviorOooO00o;
                        f2 = fM3775constructorimpl;
                        z5 = z3;
                        vertical2 = centerVertically;
                        z4 = true;
                    } else {
                        z4 = z2;
                        function3 = function2;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        o000000Var2 = o000000VarOooO00o;
                        flingBehavior2 = flingBehaviorOooO00o;
                        f2 = fM3775constructorimpl;
                        z5 = z3;
                        vertical2 = centerVertically;
                    }
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    Modifier modifier13 = modifier2;
                    if ((i4 & 4) != 0) {
                        o000000VarOooO00o = o00000.OooO00o(0, composerStartRestartGroup, 0, 1);
                        i5 &= -897;
                    } else {
                        o000000VarOooO00o = o000000Var;
                    }
                    if (i6 != 0) {
                        z3 = false;
                    }
                    if (i8 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f;
                    }
                    if (i10 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i12 != 0) {
                        centerVertically = Alignment.INSTANCE.getCenterVertically();
                    } else {
                        centerVertically = vertical;
                    }
                    if ((i4 & 128) != 0) {
                        o0OO00O.OooO00o oooO00o9 = o0OO00O.f39788OooO00o;
                        flingBehaviorOooO00o = o0OO00O.OooO00o(o000000VarOooO00o, PaddingKt.calculateEndPadding(paddingValuesM471PaddingValues0680j_4, LayoutDirection.Ltr), composerStartRestartGroup, ((i5 >> 6) & 14) | 24576);
                        i5 &= -29360129;
                    } else {
                        flingBehaviorOooO00o = flingBehavior;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    modifier3 = modifier13;
                    if (i16 != 0) {
                        function3 = function2;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        o000000Var2 = o000000VarOooO00o;
                        flingBehavior2 = flingBehaviorOooO00o;
                        f2 = fM3775constructorimpl;
                        z5 = z3;
                        vertical2 = centerVertically;
                        z4 = true;
                    } else {
                        z4 = z2;
                        function3 = function2;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        o000000Var2 = o000000VarOooO00o;
                        flingBehavior2 = flingBehaviorOooO00o;
                        f2 = fM3775constructorimpl;
                        z5 = z3;
                        vertical2 = centerVertically;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-131850087, i5, i18, "com.google.accompanist.pager.HorizontalPager (Pager.kt:269)");
                }
                int i25 = i5 >> 3;
                composer2 = composerStartRestartGroup;
                OooO0O0(i, modifier3, o000000Var2, z5, f2, false, flingBehavior2, function3, paddingValues3, z4, vertical2, null, content, composer2, (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i25 & 3670016) | (i25 & 29360128) | ((i5 << 9) & 234881024) | (i5 & 1879048192), ((i18 << 6) & 896) | ((i5 >> 18) & 14), 2048);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                o000000Var3 = o000000Var2;
                z6 = z5;
                f3 = f2;
                paddingValues4 = paddingValues3;
                vertical3 = vertical2;
                flingBehavior3 = flingBehavior2;
                function4 = function3;
                z7 = z4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(i, modifier4, o000000Var3, z6, f3, paddingValues4, vertical3, flingBehavior3, function4, z7, content, i2, i3, i4));
        }
        i5 |= 3072;
        z3 = z;
        i8 = i4 & 16;
        if (i8 != 0) {
            i5 |= 24576;
        } else if ((i2 & 57344) == 0) {
            if (composerStartRestartGroup.changed(f)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i5 |= i9;
        }
        i10 = i4 & 32;
        if (i10 != 0) {
            i5 |= 196608;
            paddingValues2 = paddingValues;
        } else {
            paddingValues2 = paddingValues;
            if ((i2 & 458752) == 0) {
                if (composerStartRestartGroup.changed(paddingValues2)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i5 |= i11;
            }
        }
        i12 = i4 & 64;
        if (i12 != 0) {
            i5 |= 1572864;
        } else if ((i2 & 3670016) == 0) {
            if (composerStartRestartGroup.changed(vertical)) {
                i13 = ZegoConstants.ErrorMask.RoomServerErrorMask;
            } else {
                i13 = 524288;
            }
            i5 |= i13;
        }
        if ((i2 & 29360128) != 0) {
            i5 |= ((i4 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
        }
        i14 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (i14 != 0) {
            i5 |= 100663296;
        } else if ((i2 & 234881024) == 0) {
            if (composerStartRestartGroup.changedInstance(function1)) {
                i15 = 67108864;
            } else {
                i15 = 33554432;
            }
            i5 |= i15;
        }
        i16 = i4 & ConstantsKt.MINIMUM_BLOCK_SIZE;
        if (i16 != 0) {
            i5 |= 805306368;
        } else if ((i2 & 1879048192) == 0) {
            if (composerStartRestartGroup.changed(z2)) {
                i17 = 536870912;
            } else {
                i17 = SQLiteDatabase.CREATE_IF_NECESSARY;
            }
            i5 |= i17;
        }
        if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
            i18 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i18 = i3 | i19;
        } else {
            i18 = i3;
        }
        if ((i5 & 1533916891) != 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i20 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                Modifier modifier14 = modifier2;
                if ((i4 & 4) != 0) {
                    o000000VarOooO00o = o00000.OooO00o(0, composerStartRestartGroup, 0, 1);
                    i5 &= -897;
                } else {
                    o000000VarOooO00o = o000000Var;
                }
                if (i6 != 0) {
                    z3 = false;
                }
                if (i8 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(0);
                } else {
                    fM3775constructorimpl = f;
                }
                if (i10 != 0) {
                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                } else {
                    paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                }
                if (i12 != 0) {
                    centerVertically = Alignment.INSTANCE.getCenterVertically();
                } else {
                    centerVertically = vertical;
                }
                if ((i4 & 128) != 0) {
                    o0OO00O.OooO00o oooO00o10 = o0OO00O.f39788OooO00o;
                    flingBehaviorOooO00o = o0OO00O.OooO00o(o000000VarOooO00o, PaddingKt.calculateEndPadding(paddingValuesM471PaddingValues0680j_4, LayoutDirection.Ltr), composerStartRestartGroup, ((i5 >> 6) & 14) | 24576);
                    i5 &= -29360129;
                } else {
                    flingBehaviorOooO00o = flingBehavior;
                }
                if (i14 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                modifier3 = modifier14;
                if (i16 != 0) {
                    function3 = function2;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    o000000Var2 = o000000VarOooO00o;
                    flingBehavior2 = flingBehaviorOooO00o;
                    f2 = fM3775constructorimpl;
                    z5 = z3;
                    vertical2 = centerVertically;
                    z4 = true;
                } else {
                    z4 = z2;
                    function3 = function2;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    o000000Var2 = o000000VarOooO00o;
                    flingBehavior2 = flingBehaviorOooO00o;
                    f2 = fM3775constructorimpl;
                    z5 = z3;
                    vertical2 = centerVertically;
                }
            } else {
                if (i20 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                Modifier modifier15 = modifier2;
                if ((i4 & 4) != 0) {
                    o000000VarOooO00o = o00000.OooO00o(0, composerStartRestartGroup, 0, 1);
                    i5 &= -897;
                } else {
                    o000000VarOooO00o = o000000Var;
                }
                if (i6 != 0) {
                    z3 = false;
                }
                if (i8 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(0);
                } else {
                    fM3775constructorimpl = f;
                }
                if (i10 != 0) {
                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                } else {
                    paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                }
                if (i12 != 0) {
                    centerVertically = Alignment.INSTANCE.getCenterVertically();
                } else {
                    centerVertically = vertical;
                }
                if ((i4 & 128) != 0) {
                    o0OO00O.OooO00o oooO00o11 = o0OO00O.f39788OooO00o;
                    flingBehaviorOooO00o = o0OO00O.OooO00o(o000000VarOooO00o, PaddingKt.calculateEndPadding(paddingValuesM471PaddingValues0680j_4, LayoutDirection.Ltr), composerStartRestartGroup, ((i5 >> 6) & 14) | 24576);
                    i5 &= -29360129;
                } else {
                    flingBehaviorOooO00o = flingBehavior;
                }
                if (i14 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                modifier3 = modifier15;
                if (i16 != 0) {
                    function3 = function2;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    o000000Var2 = o000000VarOooO00o;
                    flingBehavior2 = flingBehaviorOooO00o;
                    f2 = fM3775constructorimpl;
                    z5 = z3;
                    vertical2 = centerVertically;
                    z4 = true;
                } else {
                    z4 = z2;
                    function3 = function2;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    o000000Var2 = o000000VarOooO00o;
                    flingBehavior2 = flingBehaviorOooO00o;
                    f2 = fM3775constructorimpl;
                    z5 = z3;
                    vertical2 = centerVertically;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-131850087, i5, i18, "com.google.accompanist.pager.HorizontalPager (Pager.kt:269)");
            }
            int i26 = i5 >> 3;
            composer2 = composerStartRestartGroup;
            OooO0O0(i, modifier3, o000000Var2, z5, f2, false, flingBehavior2, function3, paddingValues3, z4, vertical2, null, content, composer2, (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i26 & 3670016) | (i26 & 29360128) | ((i5 << 9) & 234881024) | (i5 & 1879048192), ((i18 << 6) & 896) | ((i5 >> 18) & 14), 2048);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            o000000Var3 = o000000Var2;
            z6 = z5;
            f3 = f2;
            paddingValues4 = paddingValues3;
            vertical3 = vertical2;
            flingBehavior3 = flingBehavior2;
            function4 = function3;
            z7 = z4;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i20 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                Modifier modifier16 = modifier2;
                if ((i4 & 4) != 0) {
                    o000000VarOooO00o = o00000.OooO00o(0, composerStartRestartGroup, 0, 1);
                    i5 &= -897;
                } else {
                    o000000VarOooO00o = o000000Var;
                }
                if (i6 != 0) {
                    z3 = false;
                }
                if (i8 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(0);
                } else {
                    fM3775constructorimpl = f;
                }
                if (i10 != 0) {
                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                } else {
                    paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                }
                if (i12 != 0) {
                    centerVertically = Alignment.INSTANCE.getCenterVertically();
                } else {
                    centerVertically = vertical;
                }
                if ((i4 & 128) != 0) {
                    o0OO00O.OooO00o oooO00o12 = o0OO00O.f39788OooO00o;
                    flingBehaviorOooO00o = o0OO00O.OooO00o(o000000VarOooO00o, PaddingKt.calculateEndPadding(paddingValuesM471PaddingValues0680j_4, LayoutDirection.Ltr), composerStartRestartGroup, ((i5 >> 6) & 14) | 24576);
                    i5 &= -29360129;
                } else {
                    flingBehaviorOooO00o = flingBehavior;
                }
                if (i14 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                modifier3 = modifier16;
                if (i16 != 0) {
                    function3 = function2;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    o000000Var2 = o000000VarOooO00o;
                    flingBehavior2 = flingBehaviorOooO00o;
                    f2 = fM3775constructorimpl;
                    z5 = z3;
                    vertical2 = centerVertically;
                    z4 = true;
                } else {
                    z4 = z2;
                    function3 = function2;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    o000000Var2 = o000000VarOooO00o;
                    flingBehavior2 = flingBehaviorOooO00o;
                    f2 = fM3775constructorimpl;
                    z5 = z3;
                    vertical2 = centerVertically;
                }
            } else {
                if (i20 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                Modifier modifier17 = modifier2;
                if ((i4 & 4) != 0) {
                    o000000VarOooO00o = o00000.OooO00o(0, composerStartRestartGroup, 0, 1);
                    i5 &= -897;
                } else {
                    o000000VarOooO00o = o000000Var;
                }
                if (i6 != 0) {
                    z3 = false;
                }
                if (i8 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(0);
                } else {
                    fM3775constructorimpl = f;
                }
                if (i10 != 0) {
                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                } else {
                    paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                }
                if (i12 != 0) {
                    centerVertically = Alignment.INSTANCE.getCenterVertically();
                } else {
                    centerVertically = vertical;
                }
                if ((i4 & 128) != 0) {
                    o0OO00O.OooO00o oooO00o13 = o0OO00O.f39788OooO00o;
                    flingBehaviorOooO00o = o0OO00O.OooO00o(o000000VarOooO00o, PaddingKt.calculateEndPadding(paddingValuesM471PaddingValues0680j_4, LayoutDirection.Ltr), composerStartRestartGroup, ((i5 >> 6) & 14) | 24576);
                    i5 &= -29360129;
                } else {
                    flingBehaviorOooO00o = flingBehavior;
                }
                if (i14 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                modifier3 = modifier17;
                if (i16 != 0) {
                    function3 = function2;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    o000000Var2 = o000000VarOooO00o;
                    flingBehavior2 = flingBehaviorOooO00o;
                    f2 = fM3775constructorimpl;
                    z5 = z3;
                    vertical2 = centerVertically;
                    z4 = true;
                } else {
                    z4 = z2;
                    function3 = function2;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    o000000Var2 = o000000VarOooO00o;
                    flingBehavior2 = flingBehaviorOooO00o;
                    f2 = fM3775constructorimpl;
                    z5 = z3;
                    vertical2 = centerVertically;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-131850087, i5, i18, "com.google.accompanist.pager.HorizontalPager (Pager.kt:269)");
            }
            int i27 = i5 >> 3;
            composer2 = composerStartRestartGroup;
            OooO0O0(i, modifier3, o000000Var2, z5, f2, false, flingBehavior2, function3, paddingValues3, z4, vertical2, null, content, composer2, (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i27 & 3670016) | (i27 & 29360128) | ((i5 << 9) & 234881024) | (i5 & 1879048192), ((i18 << 6) & 896) | ((i5 >> 18) & 14), 2048);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            o000000Var3 = o000000Var2;
            z6 = z5;
            f3 = f2;
            paddingValues4 = paddingValues3;
            vertical3 = vertical2;
            flingBehavior3 = flingBehavior2;
            function4 = function3;
            z7 = z4;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(i, modifier4, o000000Var3, z6, f3, paddingValues4, vertical3, flingBehavior3, function4, z7, content, i2, i3, i4));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v2 ??, still in use, count: 1, list:
          (r13v2 ?? I:java.lang.Object) from 0x0455: INVOKE (r14v1 ?? I:androidx.compose.runtime.Composer), (r13v2 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:87)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void OooO0O0(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v2 ??, still in use, count: 1, list:
          (r13v2 ?? I:java.lang.Object) from 0x0455: INVOKE (r14v1 ?? I:androidx.compose.runtime.Composer), (r13v2 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:87)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r31v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    /* JADX WARN: Code duplicated, block: B:100:0x012c  */
    /* JADX WARN: Code duplicated, block: B:102:0x0132  */
    /* JADX WARN: Code duplicated, block: B:104:0x0138  */
    /* JADX WARN: Code duplicated, block: B:105:0x013b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0143  */
    /* JADX WARN: Code duplicated, block: B:110:0x0146  */
    /* JADX WARN: Code duplicated, block: B:112:0x014a  */
    /* JADX WARN: Code duplicated, block: B:114:0x0150  */
    /* JADX WARN: Code duplicated, block: B:115:0x0152  */
    /* JADX WARN: Code duplicated, block: B:117:0x0156  */
    /* JADX WARN: Code duplicated, block: B:120:0x0162  */
    /* JADX WARN: Code duplicated, block: B:126:0x0185  */
    /* JADX WARN: Code duplicated, block: B:128:0x018f  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:139:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:140:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:146:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:149:0x01db  */
    /* JADX WARN: Code duplicated, block: B:151:0x01df  */
    /* JADX WARN: Code duplicated, block: B:152:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:154:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:155:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:158:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:159:0x020e  */
    /* JADX WARN: Code duplicated, block: B:161:0x0212  */
    /* JADX WARN: Code duplicated, block: B:162:0x0214  */
    /* JADX WARN: Code duplicated, block: B:165:0x021a  */
    /* JADX WARN: Code duplicated, block: B:166:0x022b  */
    /* JADX WARN: Code duplicated, block: B:169:0x0244  */
    /* JADX WARN: Code duplicated, block: B:172:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:177:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00da  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:89:0x0105  */
    /* JADX WARN: Code duplicated, block: B:90:0x010c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0112  */
    /* JADX WARN: Code duplicated, block: B:94:0x0118  */
    /* JADX WARN: Code duplicated, block: B:95:0x011b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0125  */
    @Deprecated(message = "\naccompanist/pager is deprecated.\nThe androidx.compose equivalent of VerticalPager is androidx.compose.foundation.pager.VerticalPager.\nFor more migration information, please visit https://google.github.io/accompanist/pager/#migration\n")
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void OooO0OO(int i, @Nullable Modifier modifier, @Nullable o000000 o000000Var, boolean z, float f, @Nullable PaddingValues paddingValues, @Nullable Alignment.Horizontal horizontal, @Nullable FlingBehavior flingBehavior, @Nullable Function1<? super Integer, ? extends Object> function1, boolean z2, @NotNull Function4<? super o0O0O00, ? super Integer, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i2, int i3, int i4) {
        int i5;
        int i6;
        boolean z3;
        int i7;
        int i8;
        int i9;
        int i10;
        PaddingValues paddingValues2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Modifier modifier2;
        o000000 o000000VarOooO00o;
        float fM3775constructorimpl;
        PaddingValues paddingValuesM471PaddingValues0680j_4;
        Alignment.Horizontal centerHorizontally;
        FlingBehavior flingBehaviorOooO00o;
        Function1<? super Integer, ? extends Object> function2;
        Modifier modifier3;
        boolean z4;
        Function1<? super Integer, ? extends Object> function3;
        PaddingValues paddingValues3;
        o000000 o000000Var2;
        FlingBehavior flingBehavior2;
        float f2;
        boolean z5;
        Alignment.Horizontal horizontal2;
        Composer composer2;
        Modifier modifier4;
        o000000 o000000Var3;
        boolean z6;
        float f3;
        PaddingValues paddingValues4;
        Alignment.Horizontal horizontal3;
        FlingBehavior flingBehavior3;
        Function1<? super Integer, ? extends Object> function4;
        boolean z7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(323934645);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i20 = i4 & 2;
        if (i20 == 0) {
            if ((i2 & 112) == 0) {
                i5 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i2 & 896) != 0) {
                i5 |= ((i4 & 4) == 0 || !composerStartRestartGroup.changed(o000000Var)) ? 128 : PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            i6 = i4 & 8;
            if (i6 != 0) {
                if ((i2 & 7168) == 0) {
                    z3 = z;
                    if (composerStartRestartGroup.changed(z3)) {
                        i7 = 2048;
                    } else {
                        i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i5 |= i7;
                }
                i8 = i4 & 16;
                if (i8 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 57344) == 0) {
                    if (composerStartRestartGroup.changed(f)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 32;
                if (i10 != 0) {
                    i5 |= 196608;
                    paddingValues2 = paddingValues;
                } else {
                    paddingValues2 = paddingValues;
                    if ((i2 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(paddingValues2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i5 |= i11;
                    }
                }
                i12 = i4 & 64;
                if (i12 != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(horizontal)) {
                        i13 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i13 = 524288;
                    }
                    i5 |= i13;
                }
                if ((i2 & 29360128) != 0) {
                    i5 |= ((i4 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
                }
                i14 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i14 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                    i5 |= i15;
                }
                i16 = i4 & ConstantsKt.MINIMUM_BLOCK_SIZE;
                if (i16 != 0) {
                    i5 |= 805306368;
                } else if ((i2 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i17 = 536870912;
                    } else {
                        i17 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                    i5 |= i17;
                }
                if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                    i18 = i3 | 6;
                } else if ((i3 & 14) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = 4;
                    } else {
                        i19 = 2;
                    }
                    i18 = i3 | i19;
                } else {
                    i18 = i3;
                }
                if ((i5 & 1533916891) != 306783378 && (i18 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier;
                    o000000Var3 = o000000Var;
                    f3 = f;
                    horizontal3 = horizontal;
                    flingBehavior3 = flingBehavior;
                    composer2 = composerStartRestartGroup;
                    z6 = z3;
                    paddingValues4 = paddingValues2;
                    function4 = function1;
                    z7 = z2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        Modifier modifier5 = modifier2;
                        if ((i4 & 4) != 0) {
                            o000000VarOooO00o = o00000.OooO00o(0, composerStartRestartGroup, 0, 1);
                            i5 &= -897;
                        } else {
                            o000000VarOooO00o = o000000Var;
                        }
                        if (i6 != 0) {
                            z3 = false;
                        }
                        if (i8 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f;
                        }
                        if (i10 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i12 != 0) {
                            centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        } else {
                            centerHorizontally = horizontal;
                        }
                        if ((i4 & 128) != 0) {
                            o0OO00O.OooO00o oooO00o = o0OO00O.f39788OooO00o;
                            flingBehaviorOooO00o = o0OO00O.OooO00o(o000000VarOooO00o, paddingValuesM471PaddingValues0680j_4.getBottom(), composerStartRestartGroup, ((i5 >> 6) & 14) | 24576);
                            i5 &= -29360129;
                        } else {
                            flingBehaviorOooO00o = flingBehavior;
                        }
                        if (i14 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        modifier3 = modifier5;
                        if (i16 != 0) {
                            function3 = function2;
                            paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                            o000000Var2 = o000000VarOooO00o;
                            flingBehavior2 = flingBehaviorOooO00o;
                            f2 = fM3775constructorimpl;
                            z5 = z3;
                            horizontal2 = centerHorizontally;
                            z4 = true;
                        } else {
                            z4 = z2;
                            function3 = function2;
                            paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                            o000000Var2 = o000000VarOooO00o;
                            flingBehavior2 = flingBehaviorOooO00o;
                            f2 = fM3775constructorimpl;
                            z5 = z3;
                            horizontal2 = centerHorizontally;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i4 & 4) != 0) {
                            i5 &= -897;
                        }
                        if ((i4 & 128) != 0) {
                            i5 &= -29360129;
                        }
                        modifier3 = modifier;
                        o000000Var2 = o000000Var;
                        f2 = f;
                        horizontal2 = horizontal;
                        flingBehavior2 = flingBehavior;
                        function3 = function1;
                        z4 = z2;
                        z5 = z3;
                        paddingValues3 = paddingValues2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(323934645, i5, i18, "com.google.accompanist.pager.VerticalPager (Pager.kt:331)");
                    }
                    int i21 = i5 >> 3;
                    composer2 = composerStartRestartGroup;
                    OooO0O0(i, modifier3, o000000Var2, z5, f2, true, flingBehavior2, function3, paddingValues3, z4, null, horizontal2, content, composer2, (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i21 & 3670016) | (i21 & 29360128) | ((i5 << 9) & 234881024) | (i5 & 1879048192), ((i18 << 6) & 896) | ((i5 >> 15) & 112), LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    o000000Var3 = o000000Var2;
                    z6 = z5;
                    f3 = f2;
                    paddingValues4 = paddingValues3;
                    horizontal3 = horizontal2;
                    flingBehavior3 = flingBehavior2;
                    function4 = function3;
                    z7 = z4;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(i, modifier4, o000000Var3, z6, f3, paddingValues4, horizontal3, flingBehavior3, function4, z7, content, i2, i3, i4));
            }
            i5 |= 3072;
            z3 = z;
            i8 = i4 & 16;
            if (i8 != 0) {
                i5 |= 24576;
            } else if ((i2 & 57344) == 0) {
                if (composerStartRestartGroup.changed(f)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i5 |= i9;
            }
            i10 = i4 & 32;
            if (i10 != 0) {
                i5 |= 196608;
                paddingValues2 = paddingValues;
            } else {
                paddingValues2 = paddingValues;
                if ((i2 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(paddingValues2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i5 |= i11;
                }
            }
            i12 = i4 & 64;
            if (i12 != 0) {
                i5 |= 1572864;
            } else if ((i2 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(horizontal)) {
                    i13 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i13 = 524288;
                }
                i5 |= i13;
            }
            if ((i2 & 29360128) != 0) {
                i5 |= ((i4 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
            }
            i14 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i14 != 0) {
                i5 |= 100663296;
            } else if ((i2 & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i15 = 67108864;
                } else {
                    i15 = 33554432;
                }
                i5 |= i15;
            }
            i16 = i4 & ConstantsKt.MINIMUM_BLOCK_SIZE;
            if (i16 != 0) {
                i5 |= 805306368;
            } else if ((i2 & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i17 = 536870912;
                } else {
                    i17 = SQLiteDatabase.CREATE_IF_NECESSARY;
                }
                i5 |= i17;
            }
            if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                i18 = i3 | 6;
            } else if ((i3 & 14) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i19 = 4;
                } else {
                    i19 = 2;
                }
                i18 = i3 | i19;
            } else {
                i18 = i3;
            }
            if ((i5 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    Modifier modifier6 = modifier2;
                    if ((i4 & 4) != 0) {
                        o000000VarOooO00o = o00000.OooO00o(0, composerStartRestartGroup, 0, 1);
                        i5 &= -897;
                    } else {
                        o000000VarOooO00o = o000000Var;
                    }
                    if (i6 != 0) {
                        z3 = false;
                    }
                    if (i8 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f;
                    }
                    if (i10 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i12 != 0) {
                        centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    } else {
                        centerHorizontally = horizontal;
                    }
                    if ((i4 & 128) != 0) {
                        o0OO00O.OooO00o oooO00o2 = o0OO00O.f39788OooO00o;
                        flingBehaviorOooO00o = o0OO00O.OooO00o(o000000VarOooO00o, paddingValuesM471PaddingValues0680j_4.getBottom(), composerStartRestartGroup, ((i5 >> 6) & 14) | 24576);
                        i5 &= -29360129;
                    } else {
                        flingBehaviorOooO00o = flingBehavior;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    modifier3 = modifier6;
                    if (i16 != 0) {
                        function3 = function2;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        o000000Var2 = o000000VarOooO00o;
                        flingBehavior2 = flingBehaviorOooO00o;
                        f2 = fM3775constructorimpl;
                        z5 = z3;
                        horizontal2 = centerHorizontally;
                        z4 = true;
                    } else {
                        z4 = z2;
                        function3 = function2;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        o000000Var2 = o000000VarOooO00o;
                        flingBehavior2 = flingBehaviorOooO00o;
                        f2 = fM3775constructorimpl;
                        z5 = z3;
                        horizontal2 = centerHorizontally;
                    }
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    Modifier modifier7 = modifier2;
                    if ((i4 & 4) != 0) {
                        o000000VarOooO00o = o00000.OooO00o(0, composerStartRestartGroup, 0, 1);
                        i5 &= -897;
                    } else {
                        o000000VarOooO00o = o000000Var;
                    }
                    if (i6 != 0) {
                        z3 = false;
                    }
                    if (i8 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f;
                    }
                    if (i10 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i12 != 0) {
                        centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    } else {
                        centerHorizontally = horizontal;
                    }
                    if ((i4 & 128) != 0) {
                        o0OO00O.OooO00o oooO00o3 = o0OO00O.f39788OooO00o;
                        flingBehaviorOooO00o = o0OO00O.OooO00o(o000000VarOooO00o, paddingValuesM471PaddingValues0680j_4.getBottom(), composerStartRestartGroup, ((i5 >> 6) & 14) | 24576);
                        i5 &= -29360129;
                    } else {
                        flingBehaviorOooO00o = flingBehavior;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    modifier3 = modifier7;
                    if (i16 != 0) {
                        function3 = function2;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        o000000Var2 = o000000VarOooO00o;
                        flingBehavior2 = flingBehaviorOooO00o;
                        f2 = fM3775constructorimpl;
                        z5 = z3;
                        horizontal2 = centerHorizontally;
                        z4 = true;
                    } else {
                        z4 = z2;
                        function3 = function2;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        o000000Var2 = o000000VarOooO00o;
                        flingBehavior2 = flingBehaviorOooO00o;
                        f2 = fM3775constructorimpl;
                        z5 = z3;
                        horizontal2 = centerHorizontally;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(323934645, i5, i18, "com.google.accompanist.pager.VerticalPager (Pager.kt:331)");
                }
                int i22 = i5 >> 3;
                composer2 = composerStartRestartGroup;
                OooO0O0(i, modifier3, o000000Var2, z5, f2, true, flingBehavior2, function3, paddingValues3, z4, null, horizontal2, content, composer2, (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i22 & 3670016) | (i22 & 29360128) | ((i5 << 9) & 234881024) | (i5 & 1879048192), ((i18 << 6) & 896) | ((i5 >> 15) & 112), LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                o000000Var3 = o000000Var2;
                z6 = z5;
                f3 = f2;
                paddingValues4 = paddingValues3;
                horizontal3 = horizontal2;
                flingBehavior3 = flingBehavior2;
                function4 = function3;
                z7 = z4;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    Modifier modifier8 = modifier2;
                    if ((i4 & 4) != 0) {
                        o000000VarOooO00o = o00000.OooO00o(0, composerStartRestartGroup, 0, 1);
                        i5 &= -897;
                    } else {
                        o000000VarOooO00o = o000000Var;
                    }
                    if (i6 != 0) {
                        z3 = false;
                    }
                    if (i8 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f;
                    }
                    if (i10 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i12 != 0) {
                        centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    } else {
                        centerHorizontally = horizontal;
                    }
                    if ((i4 & 128) != 0) {
                        o0OO00O.OooO00o oooO00o4 = o0OO00O.f39788OooO00o;
                        flingBehaviorOooO00o = o0OO00O.OooO00o(o000000VarOooO00o, paddingValuesM471PaddingValues0680j_4.getBottom(), composerStartRestartGroup, ((i5 >> 6) & 14) | 24576);
                        i5 &= -29360129;
                    } else {
                        flingBehaviorOooO00o = flingBehavior;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    modifier3 = modifier8;
                    if (i16 != 0) {
                        function3 = function2;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        o000000Var2 = o000000VarOooO00o;
                        flingBehavior2 = flingBehaviorOooO00o;
                        f2 = fM3775constructorimpl;
                        z5 = z3;
                        horizontal2 = centerHorizontally;
                        z4 = true;
                    } else {
                        z4 = z2;
                        function3 = function2;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        o000000Var2 = o000000VarOooO00o;
                        flingBehavior2 = flingBehaviorOooO00o;
                        f2 = fM3775constructorimpl;
                        z5 = z3;
                        horizontal2 = centerHorizontally;
                    }
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    Modifier modifier9 = modifier2;
                    if ((i4 & 4) != 0) {
                        o000000VarOooO00o = o00000.OooO00o(0, composerStartRestartGroup, 0, 1);
                        i5 &= -897;
                    } else {
                        o000000VarOooO00o = o000000Var;
                    }
                    if (i6 != 0) {
                        z3 = false;
                    }
                    if (i8 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f;
                    }
                    if (i10 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i12 != 0) {
                        centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    } else {
                        centerHorizontally = horizontal;
                    }
                    if ((i4 & 128) != 0) {
                        o0OO00O.OooO00o oooO00o5 = o0OO00O.f39788OooO00o;
                        flingBehaviorOooO00o = o0OO00O.OooO00o(o000000VarOooO00o, paddingValuesM471PaddingValues0680j_4.getBottom(), composerStartRestartGroup, ((i5 >> 6) & 14) | 24576);
                        i5 &= -29360129;
                    } else {
                        flingBehaviorOooO00o = flingBehavior;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    modifier3 = modifier9;
                    if (i16 != 0) {
                        function3 = function2;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        o000000Var2 = o000000VarOooO00o;
                        flingBehavior2 = flingBehaviorOooO00o;
                        f2 = fM3775constructorimpl;
                        z5 = z3;
                        horizontal2 = centerHorizontally;
                        z4 = true;
                    } else {
                        z4 = z2;
                        function3 = function2;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        o000000Var2 = o000000VarOooO00o;
                        flingBehavior2 = flingBehaviorOooO00o;
                        f2 = fM3775constructorimpl;
                        z5 = z3;
                        horizontal2 = centerHorizontally;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(323934645, i5, i18, "com.google.accompanist.pager.VerticalPager (Pager.kt:331)");
                }
                int i23 = i5 >> 3;
                composer2 = composerStartRestartGroup;
                OooO0O0(i, modifier3, o000000Var2, z5, f2, true, flingBehavior2, function3, paddingValues3, z4, null, horizontal2, content, composer2, (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i23 & 3670016) | (i23 & 29360128) | ((i5 << 9) & 234881024) | (i5 & 1879048192), ((i18 << 6) & 896) | ((i5 >> 15) & 112), LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                o000000Var3 = o000000Var2;
                z6 = z5;
                f3 = f2;
                paddingValues4 = paddingValues3;
                horizontal3 = horizontal2;
                flingBehavior3 = flingBehavior2;
                function4 = function3;
                z7 = z4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(i, modifier4, o000000Var3, z6, f3, paddingValues4, horizontal3, flingBehavior3, function4, z7, content, i2, i3, i4));
        }
        i5 |= 48;
        if ((i2 & 896) != 0) {
            i5 |= ((i4 & 4) == 0 || !composerStartRestartGroup.changed(o000000Var)) ? 128 : PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        i6 = i4 & 8;
        if (i6 != 0) {
            if ((i2 & 7168) == 0) {
                z3 = z;
                if (composerStartRestartGroup.changed(z3)) {
                    i7 = 2048;
                } else {
                    i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i5 |= i7;
            }
            i8 = i4 & 16;
            if (i8 != 0) {
                i5 |= 24576;
            } else if ((i2 & 57344) == 0) {
                if (composerStartRestartGroup.changed(f)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i5 |= i9;
            }
            i10 = i4 & 32;
            if (i10 != 0) {
                i5 |= 196608;
                paddingValues2 = paddingValues;
            } else {
                paddingValues2 = paddingValues;
                if ((i2 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(paddingValues2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i5 |= i11;
                }
            }
            i12 = i4 & 64;
            if (i12 != 0) {
                i5 |= 1572864;
            } else if ((i2 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(horizontal)) {
                    i13 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i13 = 524288;
                }
                i5 |= i13;
            }
            if ((i2 & 29360128) != 0) {
                i5 |= ((i4 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
            }
            i14 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i14 != 0) {
                i5 |= 100663296;
            } else if ((i2 & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i15 = 67108864;
                } else {
                    i15 = 33554432;
                }
                i5 |= i15;
            }
            i16 = i4 & ConstantsKt.MINIMUM_BLOCK_SIZE;
            if (i16 != 0) {
                i5 |= 805306368;
            } else if ((i2 & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i17 = 536870912;
                } else {
                    i17 = SQLiteDatabase.CREATE_IF_NECESSARY;
                }
                i5 |= i17;
            }
            if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                i18 = i3 | 6;
            } else if ((i3 & 14) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i19 = 4;
                } else {
                    i19 = 2;
                }
                i18 = i3 | i19;
            } else {
                i18 = i3;
            }
            if ((i5 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    Modifier modifier10 = modifier2;
                    if ((i4 & 4) != 0) {
                        o000000VarOooO00o = o00000.OooO00o(0, composerStartRestartGroup, 0, 1);
                        i5 &= -897;
                    } else {
                        o000000VarOooO00o = o000000Var;
                    }
                    if (i6 != 0) {
                        z3 = false;
                    }
                    if (i8 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f;
                    }
                    if (i10 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i12 != 0) {
                        centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    } else {
                        centerHorizontally = horizontal;
                    }
                    if ((i4 & 128) != 0) {
                        o0OO00O.OooO00o oooO00o6 = o0OO00O.f39788OooO00o;
                        flingBehaviorOooO00o = o0OO00O.OooO00o(o000000VarOooO00o, paddingValuesM471PaddingValues0680j_4.getBottom(), composerStartRestartGroup, ((i5 >> 6) & 14) | 24576);
                        i5 &= -29360129;
                    } else {
                        flingBehaviorOooO00o = flingBehavior;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    modifier3 = modifier10;
                    if (i16 != 0) {
                        function3 = function2;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        o000000Var2 = o000000VarOooO00o;
                        flingBehavior2 = flingBehaviorOooO00o;
                        f2 = fM3775constructorimpl;
                        z5 = z3;
                        horizontal2 = centerHorizontally;
                        z4 = true;
                    } else {
                        z4 = z2;
                        function3 = function2;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        o000000Var2 = o000000VarOooO00o;
                        flingBehavior2 = flingBehaviorOooO00o;
                        f2 = fM3775constructorimpl;
                        z5 = z3;
                        horizontal2 = centerHorizontally;
                    }
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    Modifier modifier11 = modifier2;
                    if ((i4 & 4) != 0) {
                        o000000VarOooO00o = o00000.OooO00o(0, composerStartRestartGroup, 0, 1);
                        i5 &= -897;
                    } else {
                        o000000VarOooO00o = o000000Var;
                    }
                    if (i6 != 0) {
                        z3 = false;
                    }
                    if (i8 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f;
                    }
                    if (i10 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i12 != 0) {
                        centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    } else {
                        centerHorizontally = horizontal;
                    }
                    if ((i4 & 128) != 0) {
                        o0OO00O.OooO00o oooO00o7 = o0OO00O.f39788OooO00o;
                        flingBehaviorOooO00o = o0OO00O.OooO00o(o000000VarOooO00o, paddingValuesM471PaddingValues0680j_4.getBottom(), composerStartRestartGroup, ((i5 >> 6) & 14) | 24576);
                        i5 &= -29360129;
                    } else {
                        flingBehaviorOooO00o = flingBehavior;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    modifier3 = modifier11;
                    if (i16 != 0) {
                        function3 = function2;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        o000000Var2 = o000000VarOooO00o;
                        flingBehavior2 = flingBehaviorOooO00o;
                        f2 = fM3775constructorimpl;
                        z5 = z3;
                        horizontal2 = centerHorizontally;
                        z4 = true;
                    } else {
                        z4 = z2;
                        function3 = function2;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        o000000Var2 = o000000VarOooO00o;
                        flingBehavior2 = flingBehaviorOooO00o;
                        f2 = fM3775constructorimpl;
                        z5 = z3;
                        horizontal2 = centerHorizontally;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(323934645, i5, i18, "com.google.accompanist.pager.VerticalPager (Pager.kt:331)");
                }
                int i24 = i5 >> 3;
                composer2 = composerStartRestartGroup;
                OooO0O0(i, modifier3, o000000Var2, z5, f2, true, flingBehavior2, function3, paddingValues3, z4, null, horizontal2, content, composer2, (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i24 & 3670016) | (i24 & 29360128) | ((i5 << 9) & 234881024) | (i5 & 1879048192), ((i18 << 6) & 896) | ((i5 >> 15) & 112), LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                o000000Var3 = o000000Var2;
                z6 = z5;
                f3 = f2;
                paddingValues4 = paddingValues3;
                horizontal3 = horizontal2;
                flingBehavior3 = flingBehavior2;
                function4 = function3;
                z7 = z4;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    Modifier modifier12 = modifier2;
                    if ((i4 & 4) != 0) {
                        o000000VarOooO00o = o00000.OooO00o(0, composerStartRestartGroup, 0, 1);
                        i5 &= -897;
                    } else {
                        o000000VarOooO00o = o000000Var;
                    }
                    if (i6 != 0) {
                        z3 = false;
                    }
                    if (i8 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f;
                    }
                    if (i10 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i12 != 0) {
                        centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    } else {
                        centerHorizontally = horizontal;
                    }
                    if ((i4 & 128) != 0) {
                        o0OO00O.OooO00o oooO00o8 = o0OO00O.f39788OooO00o;
                        flingBehaviorOooO00o = o0OO00O.OooO00o(o000000VarOooO00o, paddingValuesM471PaddingValues0680j_4.getBottom(), composerStartRestartGroup, ((i5 >> 6) & 14) | 24576);
                        i5 &= -29360129;
                    } else {
                        flingBehaviorOooO00o = flingBehavior;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    modifier3 = modifier12;
                    if (i16 != 0) {
                        function3 = function2;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        o000000Var2 = o000000VarOooO00o;
                        flingBehavior2 = flingBehaviorOooO00o;
                        f2 = fM3775constructorimpl;
                        z5 = z3;
                        horizontal2 = centerHorizontally;
                        z4 = true;
                    } else {
                        z4 = z2;
                        function3 = function2;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        o000000Var2 = o000000VarOooO00o;
                        flingBehavior2 = flingBehaviorOooO00o;
                        f2 = fM3775constructorimpl;
                        z5 = z3;
                        horizontal2 = centerHorizontally;
                    }
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    Modifier modifier13 = modifier2;
                    if ((i4 & 4) != 0) {
                        o000000VarOooO00o = o00000.OooO00o(0, composerStartRestartGroup, 0, 1);
                        i5 &= -897;
                    } else {
                        o000000VarOooO00o = o000000Var;
                    }
                    if (i6 != 0) {
                        z3 = false;
                    }
                    if (i8 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f;
                    }
                    if (i10 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i12 != 0) {
                        centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    } else {
                        centerHorizontally = horizontal;
                    }
                    if ((i4 & 128) != 0) {
                        o0OO00O.OooO00o oooO00o9 = o0OO00O.f39788OooO00o;
                        flingBehaviorOooO00o = o0OO00O.OooO00o(o000000VarOooO00o, paddingValuesM471PaddingValues0680j_4.getBottom(), composerStartRestartGroup, ((i5 >> 6) & 14) | 24576);
                        i5 &= -29360129;
                    } else {
                        flingBehaviorOooO00o = flingBehavior;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    modifier3 = modifier13;
                    if (i16 != 0) {
                        function3 = function2;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        o000000Var2 = o000000VarOooO00o;
                        flingBehavior2 = flingBehaviorOooO00o;
                        f2 = fM3775constructorimpl;
                        z5 = z3;
                        horizontal2 = centerHorizontally;
                        z4 = true;
                    } else {
                        z4 = z2;
                        function3 = function2;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        o000000Var2 = o000000VarOooO00o;
                        flingBehavior2 = flingBehaviorOooO00o;
                        f2 = fM3775constructorimpl;
                        z5 = z3;
                        horizontal2 = centerHorizontally;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(323934645, i5, i18, "com.google.accompanist.pager.VerticalPager (Pager.kt:331)");
                }
                int i25 = i5 >> 3;
                composer2 = composerStartRestartGroup;
                OooO0O0(i, modifier3, o000000Var2, z5, f2, true, flingBehavior2, function3, paddingValues3, z4, null, horizontal2, content, composer2, (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i25 & 3670016) | (i25 & 29360128) | ((i5 << 9) & 234881024) | (i5 & 1879048192), ((i18 << 6) & 896) | ((i5 >> 15) & 112), LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                o000000Var3 = o000000Var2;
                z6 = z5;
                f3 = f2;
                paddingValues4 = paddingValues3;
                horizontal3 = horizontal2;
                flingBehavior3 = flingBehavior2;
                function4 = function3;
                z7 = z4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(i, modifier4, o000000Var3, z6, f3, paddingValues4, horizontal3, flingBehavior3, function4, z7, content, i2, i3, i4));
        }
        i5 |= 3072;
        z3 = z;
        i8 = i4 & 16;
        if (i8 != 0) {
            i5 |= 24576;
        } else if ((i2 & 57344) == 0) {
            if (composerStartRestartGroup.changed(f)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i5 |= i9;
        }
        i10 = i4 & 32;
        if (i10 != 0) {
            i5 |= 196608;
            paddingValues2 = paddingValues;
        } else {
            paddingValues2 = paddingValues;
            if ((i2 & 458752) == 0) {
                if (composerStartRestartGroup.changed(paddingValues2)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i5 |= i11;
            }
        }
        i12 = i4 & 64;
        if (i12 != 0) {
            i5 |= 1572864;
        } else if ((i2 & 3670016) == 0) {
            if (composerStartRestartGroup.changed(horizontal)) {
                i13 = ZegoConstants.ErrorMask.RoomServerErrorMask;
            } else {
                i13 = 524288;
            }
            i5 |= i13;
        }
        if ((i2 & 29360128) != 0) {
            i5 |= ((i4 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
        }
        i14 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (i14 != 0) {
            i5 |= 100663296;
        } else if ((i2 & 234881024) == 0) {
            if (composerStartRestartGroup.changedInstance(function1)) {
                i15 = 67108864;
            } else {
                i15 = 33554432;
            }
            i5 |= i15;
        }
        i16 = i4 & ConstantsKt.MINIMUM_BLOCK_SIZE;
        if (i16 != 0) {
            i5 |= 805306368;
        } else if ((i2 & 1879048192) == 0) {
            if (composerStartRestartGroup.changed(z2)) {
                i17 = 536870912;
            } else {
                i17 = SQLiteDatabase.CREATE_IF_NECESSARY;
            }
            i5 |= i17;
        }
        if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
            i18 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i18 = i3 | i19;
        } else {
            i18 = i3;
        }
        if ((i5 & 1533916891) != 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i20 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                Modifier modifier14 = modifier2;
                if ((i4 & 4) != 0) {
                    o000000VarOooO00o = o00000.OooO00o(0, composerStartRestartGroup, 0, 1);
                    i5 &= -897;
                } else {
                    o000000VarOooO00o = o000000Var;
                }
                if (i6 != 0) {
                    z3 = false;
                }
                if (i8 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(0);
                } else {
                    fM3775constructorimpl = f;
                }
                if (i10 != 0) {
                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                } else {
                    paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                }
                if (i12 != 0) {
                    centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                } else {
                    centerHorizontally = horizontal;
                }
                if ((i4 & 128) != 0) {
                    o0OO00O.OooO00o oooO00o10 = o0OO00O.f39788OooO00o;
                    flingBehaviorOooO00o = o0OO00O.OooO00o(o000000VarOooO00o, paddingValuesM471PaddingValues0680j_4.getBottom(), composerStartRestartGroup, ((i5 >> 6) & 14) | 24576);
                    i5 &= -29360129;
                } else {
                    flingBehaviorOooO00o = flingBehavior;
                }
                if (i14 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                modifier3 = modifier14;
                if (i16 != 0) {
                    function3 = function2;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    o000000Var2 = o000000VarOooO00o;
                    flingBehavior2 = flingBehaviorOooO00o;
                    f2 = fM3775constructorimpl;
                    z5 = z3;
                    horizontal2 = centerHorizontally;
                    z4 = true;
                } else {
                    z4 = z2;
                    function3 = function2;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    o000000Var2 = o000000VarOooO00o;
                    flingBehavior2 = flingBehaviorOooO00o;
                    f2 = fM3775constructorimpl;
                    z5 = z3;
                    horizontal2 = centerHorizontally;
                }
            } else {
                if (i20 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                Modifier modifier15 = modifier2;
                if ((i4 & 4) != 0) {
                    o000000VarOooO00o = o00000.OooO00o(0, composerStartRestartGroup, 0, 1);
                    i5 &= -897;
                } else {
                    o000000VarOooO00o = o000000Var;
                }
                if (i6 != 0) {
                    z3 = false;
                }
                if (i8 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(0);
                } else {
                    fM3775constructorimpl = f;
                }
                if (i10 != 0) {
                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                } else {
                    paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                }
                if (i12 != 0) {
                    centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                } else {
                    centerHorizontally = horizontal;
                }
                if ((i4 & 128) != 0) {
                    o0OO00O.OooO00o oooO00o11 = o0OO00O.f39788OooO00o;
                    flingBehaviorOooO00o = o0OO00O.OooO00o(o000000VarOooO00o, paddingValuesM471PaddingValues0680j_4.getBottom(), composerStartRestartGroup, ((i5 >> 6) & 14) | 24576);
                    i5 &= -29360129;
                } else {
                    flingBehaviorOooO00o = flingBehavior;
                }
                if (i14 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                modifier3 = modifier15;
                if (i16 != 0) {
                    function3 = function2;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    o000000Var2 = o000000VarOooO00o;
                    flingBehavior2 = flingBehaviorOooO00o;
                    f2 = fM3775constructorimpl;
                    z5 = z3;
                    horizontal2 = centerHorizontally;
                    z4 = true;
                } else {
                    z4 = z2;
                    function3 = function2;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    o000000Var2 = o000000VarOooO00o;
                    flingBehavior2 = flingBehaviorOooO00o;
                    f2 = fM3775constructorimpl;
                    z5 = z3;
                    horizontal2 = centerHorizontally;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(323934645, i5, i18, "com.google.accompanist.pager.VerticalPager (Pager.kt:331)");
            }
            int i26 = i5 >> 3;
            composer2 = composerStartRestartGroup;
            OooO0O0(i, modifier3, o000000Var2, z5, f2, true, flingBehavior2, function3, paddingValues3, z4, null, horizontal2, content, composer2, (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i26 & 3670016) | (i26 & 29360128) | ((i5 << 9) & 234881024) | (i5 & 1879048192), ((i18 << 6) & 896) | ((i5 >> 15) & 112), LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            o000000Var3 = o000000Var2;
            z6 = z5;
            f3 = f2;
            paddingValues4 = paddingValues3;
            horizontal3 = horizontal2;
            flingBehavior3 = flingBehavior2;
            function4 = function3;
            z7 = z4;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i20 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                Modifier modifier16 = modifier2;
                if ((i4 & 4) != 0) {
                    o000000VarOooO00o = o00000.OooO00o(0, composerStartRestartGroup, 0, 1);
                    i5 &= -897;
                } else {
                    o000000VarOooO00o = o000000Var;
                }
                if (i6 != 0) {
                    z3 = false;
                }
                if (i8 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(0);
                } else {
                    fM3775constructorimpl = f;
                }
                if (i10 != 0) {
                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                } else {
                    paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                }
                if (i12 != 0) {
                    centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                } else {
                    centerHorizontally = horizontal;
                }
                if ((i4 & 128) != 0) {
                    o0OO00O.OooO00o oooO00o12 = o0OO00O.f39788OooO00o;
                    flingBehaviorOooO00o = o0OO00O.OooO00o(o000000VarOooO00o, paddingValuesM471PaddingValues0680j_4.getBottom(), composerStartRestartGroup, ((i5 >> 6) & 14) | 24576);
                    i5 &= -29360129;
                } else {
                    flingBehaviorOooO00o = flingBehavior;
                }
                if (i14 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                modifier3 = modifier16;
                if (i16 != 0) {
                    function3 = function2;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    o000000Var2 = o000000VarOooO00o;
                    flingBehavior2 = flingBehaviorOooO00o;
                    f2 = fM3775constructorimpl;
                    z5 = z3;
                    horizontal2 = centerHorizontally;
                    z4 = true;
                } else {
                    z4 = z2;
                    function3 = function2;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    o000000Var2 = o000000VarOooO00o;
                    flingBehavior2 = flingBehaviorOooO00o;
                    f2 = fM3775constructorimpl;
                    z5 = z3;
                    horizontal2 = centerHorizontally;
                }
            } else {
                if (i20 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                Modifier modifier17 = modifier2;
                if ((i4 & 4) != 0) {
                    o000000VarOooO00o = o00000.OooO00o(0, composerStartRestartGroup, 0, 1);
                    i5 &= -897;
                } else {
                    o000000VarOooO00o = o000000Var;
                }
                if (i6 != 0) {
                    z3 = false;
                }
                if (i8 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(0);
                } else {
                    fM3775constructorimpl = f;
                }
                if (i10 != 0) {
                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                } else {
                    paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                }
                if (i12 != 0) {
                    centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                } else {
                    centerHorizontally = horizontal;
                }
                if ((i4 & 128) != 0) {
                    o0OO00O.OooO00o oooO00o13 = o0OO00O.f39788OooO00o;
                    flingBehaviorOooO00o = o0OO00O.OooO00o(o000000VarOooO00o, paddingValuesM471PaddingValues0680j_4.getBottom(), composerStartRestartGroup, ((i5 >> 6) & 14) | 24576);
                    i5 &= -29360129;
                } else {
                    flingBehaviorOooO00o = flingBehavior;
                }
                if (i14 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                modifier3 = modifier17;
                if (i16 != 0) {
                    function3 = function2;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    o000000Var2 = o000000VarOooO00o;
                    flingBehavior2 = flingBehaviorOooO00o;
                    f2 = fM3775constructorimpl;
                    z5 = z3;
                    horizontal2 = centerHorizontally;
                    z4 = true;
                } else {
                    z4 = z2;
                    function3 = function2;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    o000000Var2 = o000000VarOooO00o;
                    flingBehavior2 = flingBehaviorOooO00o;
                    f2 = fM3775constructorimpl;
                    z5 = z3;
                    horizontal2 = centerHorizontally;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(323934645, i5, i18, "com.google.accompanist.pager.VerticalPager (Pager.kt:331)");
            }
            int i27 = i5 >> 3;
            composer2 = composerStartRestartGroup;
            OooO0O0(i, modifier3, o000000Var2, z5, f2, true, flingBehavior2, function3, paddingValues3, z4, null, horizontal2, content, composer2, (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i27 & 3670016) | (i27 & 29360128) | ((i5 << 9) & 234881024) | (i5 & 1879048192), ((i18 << 6) & 896) | ((i5 >> 15) & 112), LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            o000000Var3 = o000000Var2;
            z6 = z5;
            f3 = f2;
            paddingValues4 = paddingValues3;
            horizontal3 = horizontal2;
            flingBehavior3 = flingBehavior2;
            function4 = function3;
            z7 = z4;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(i, modifier4, o000000Var3, z6, f3, paddingValues4, horizontal3, flingBehavior3, function4, z7, content, i2, i3, i4));
    }
}
