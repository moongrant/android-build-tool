package com.code.android.uikit.swiprefresh;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooOO0;
import androidx.compose.animation.OooOOOO;
import androidx.compose.animation.OooOo;
import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
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
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import io.agora.rtc.Constants;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p201o00o0Ooo.o0O00o0;
import p201o00o0Ooo.oo00oO;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nEasySwipeRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EasySwipeRefresh.kt\ncom/code/android/uikit/swiprefresh/EasySwipeRefreshKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,177:1\n25#2:178\n25#2:191\n50#2:202\n49#2:203\n25#2:210\n456#2,8:234\n464#2,3:248\n467#2,3:254\n1097#3,6:179\n1097#3,3:192\n1100#3,3:198\n1097#3,6:204\n1097#3,6:211\n76#4:185\n76#4:253\n1#5:186\n486#6,4:187\n490#6,2:195\n494#6:201\n486#7:197\n66#8,6:217\n72#8:251\n76#8:258\n78#9,11:223\n91#9:257\n4144#10,6:242\n154#11:252\n81#12:259\n107#12,2:260\n*S KotlinDebug\n*F\n+ 1 EasySwipeRefresh.kt\ncom/code/android/uikit/swiprefresh/EasySwipeRefreshKt\n*L\n19#1:178\n106#1:191\n107#1:202\n107#1:203\n114#1:210\n142#1:234,8\n142#1:248,3\n142#1:254,3\n19#1:179,6\n106#1:192,3\n106#1:198,3\n107#1:204,6\n114#1:211,6\n105#1:185\n149#1:253\n106#1:187,4\n106#1:195,2\n106#1:201\n106#1:197\n142#1:217,6\n142#1:251\n142#1:258\n142#1:223,11\n142#1:257\n142#1:242,6\n149#1:252\n114#1:259\n114#1:260,2\n*E\n"})
public final class OooO0O0 {

    @DebugMetadata(c = "com.code.android.uikit.swiprefresh.EasySwipeRefreshKt$BasicRefresh$1", f = "EasySwipeRefresh.kt", i = {0}, l = {122, 127, Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED, 135}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ float f13239OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f13240OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ RefreshState f13241OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f13242OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ LazyListState f13243OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ long f13244OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ long f13245OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f13246OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f13247OooOO0o;

        /* JADX INFO: renamed from: com.code.android.uikit.swiprefresh.OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.code.android.uikit.swiprefresh.EasySwipeRefreshKt$BasicRefresh$1$1", f = "EasySwipeRefresh.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0197OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f13248OooO0Oo;

            public C0197OooO00o(Continuation<? super C0197OooO00o> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0197OooO00o(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return new C0197OooO00o(continuation).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f13248OooO0Oo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f13248OooO0Oo = 1;
                    if (DelayKt.delay(200L, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.code.android.uikit.swiprefresh.OooO0O0$OooO00o$OooO0O0, reason: collision with other inner class name */
        public /* synthetic */ class C0198OooO0O0 {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RefreshState.State.values().length];
                try {
                    iArr[RefreshState.State.Null.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RefreshState.State.Close.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[RefreshState.State.Finish.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[RefreshState.State.Refresh.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(RefreshState refreshState, LazyListState lazyListState, long j, float f, long j2, Function0<Unit> function0, MutableState<Boolean> mutableState, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f13241OooO0o = refreshState;
            this.f13243OooO0oO = lazyListState;
            this.f13244OooO0oo = j;
            this.f13239OooO = f;
            this.f13245OooOO0 = j2;
            this.f13246OooOO0O = function0;
            this.f13247OooOO0o = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f13241OooO0o, this.f13243OooO0oO, this.f13244OooO0oo, this.f13239OooO, this.f13245OooOO0, this.f13246OooOO0O, this.f13247OooOO0o, continuation);
            oooO00o.f13242OooO0o0 = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0092 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:38:0x00c3  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineScope scope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f13240OooO0Oo;
            long j = this.f13244OooO0oo;
            LazyListState lazyListState = this.f13243OooO0oO;
            RefreshState refreshState = this.f13241OooO0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope scope2 = (CoroutineScope) this.f13242OooO0o0;
                int i2 = C0198OooO0O0.$EnumSwitchMapping$0[refreshState.OooO0OO().ordinal()];
                MutableState<Boolean> mutableState = this.f13247OooOO0o;
                if (i2 == 1) {
                    mutableState.setValue(Boolean.FALSE);
                } else if (i2 == 2) {
                    if (lazyListState != null) {
                        Intrinsics.checkNotNullParameter(lazyListState, "<this>");
                        Intrinsics.checkNotNullParameter(scope2, "scope");
                        BuildersKt__Builders_commonKt.launch$default(scope2, null, null, new o0O00o0(lazyListState, null), 3, null);
                    }
                    this.f13242OooO0o0 = scope2;
                    this.f13240OooO0Oo = 1;
                    if (refreshState.OooO00o(0.0f, j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scope = scope2;
                    if (lazyListState != null) {
                        Intrinsics.checkNotNullParameter(lazyListState, "<this>");
                        Intrinsics.checkNotNullParameter(scope, "scope");
                        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new oo00oO(lazyListState, null), 3, null);
                    }
                    refreshState.OooO0o0(RefreshState.State.Null);
                } else if (i2 == 3) {
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    C0197OooO00o c0197OooO00o = new C0197OooO00o(null);
                    this.f13240OooO0Oo = 2;
                    if (BuildersKt.withContext(io2, c0197OooO00o, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.f13240OooO0Oo = 3;
                    if (refreshState.OooO00o(0.0f, j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    refreshState.OooO0o0(RefreshState.State.Null);
                } else if (i2 == 4) {
                    mutableState.setValue(Boolean.TRUE);
                    this.f13240OooO0Oo = 4;
                    if (refreshState.OooO00o(this.f13239OooO, this.f13245OooOO0, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.f13246OooOO0O.invoke();
                }
            } else if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    this.f13240OooO0Oo = 3;
                    if (refreshState.OooO00o(0.0f, j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i == 3) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.f13246OooOO0O.invoke();
                }
                refreshState.OooO0o0(RefreshState.State.Null);
            } else {
                CoroutineScope coroutineScope = (CoroutineScope) this.f13242OooO0o0;
                ResultKt.throwOnFailure(obj);
                scope = coroutineScope;
                if (lazyListState != null) {
                    Intrinsics.checkNotNullParameter(lazyListState, "<this>");
                    Intrinsics.checkNotNullParameter(scope, "scope");
                    BuildersKt__Builders_commonKt.launch$default(scope, null, null, new oo00oO(lazyListState, null), 3, null);
                }
                refreshState.OooO0o0(RefreshState.State.Null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.code.android.uikit.swiprefresh.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C0199OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ boolean f13249OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RefreshState f13250OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f13251OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ float f13252OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Modifier f13253OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ LazyListState f13254OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ boolean f13255OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ float f13256OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ long f13257OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ Function6<BoxScope, RefreshState.State, Dp, Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> f13258OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ long f13259OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f13260OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final /* synthetic */ int f13261OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public final /* synthetic */ int f13262OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final /* synthetic */ int f13263OooOOo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0199OooO0O0(RefreshState refreshState, float f, Function0<Unit> function0, Modifier modifier, LazyListState lazyListState, boolean z, boolean z2, float f2, long j, long j2, Function6<? super BoxScope, ? super RefreshState.State, ? super Dp, ? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function6, Function2<? super Composer, ? super Integer, Unit> function2, int i, int i2, int i3) {
            super(2);
            this.f13250OooO0Oo = refreshState;
            this.f13252OooO0o0 = f;
            this.f13251OooO0o = function0;
            this.f13253OooO0oO = modifier;
            this.f13254OooO0oo = lazyListState;
            this.f13249OooO = z;
            this.f13255OooOO0 = z2;
            this.f13256OooOO0O = f2;
            this.f13257OooOO0o = j;
            this.f13259OooOOO0 = j2;
            this.f13258OooOOO = function6;
            this.f13260OooOOOO = function2;
            this.f13261OooOOOo = i;
            this.f13263OooOOo0 = i2;
            this.f13262OooOOo = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooO0O0.OooO00o(this.f13250OooO0Oo, this.f13252OooO0o0, this.f13251OooO0o, this.f13253OooO0oO, this.f13254OooO0oo, this.f13249OooO, this.f13255OooOO0, this.f13256OooOO0O, this.f13257OooOO0o, this.f13259OooOOO0, this.f13258OooOOO, this.f13260OooOOOO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f13261OooOOOo | 1), RecomposeScopeImplKt.updateChangedFlags(this.f13263OooOOo0), this.f13262OooOOo);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nEasySwipeRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EasySwipeRefresh.kt\ncom/code/android/uikit/swiprefresh/EasySwipeRefreshKt$EasyRefresh$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,177:1\n66#2,6:178\n72#2:212\n76#2:217\n67#2,5:218\n72#2:251\n76#2:256\n78#3,11:184\n91#3:216\n78#3,11:223\n91#3:255\n456#4,8:195\n464#4,3:209\n467#4,3:213\n456#4,8:234\n464#4,3:248\n467#4,3:252\n4144#5,6:203\n4144#5,6:242\n*S KotlinDebug\n*F\n+ 1 EasySwipeRefresh.kt\ncom/code/android/uikit/swiprefresh/EasySwipeRefreshKt$EasyRefresh$1\n*L\n58#1:178,6\n58#1:212\n58#1:217\n62#1:218,5\n62#1:251\n62#1:256\n58#1:184,11\n58#1:216\n62#1:223,11\n62#1:255\n58#1:195,8\n58#1:209,3\n58#1:213,3\n62#1:234,8\n62#1:248,3\n62#1:252,3\n58#1:203,6\n62#1:242,6\n*E\n"})
    public static final class OooO0OO extends Lambda implements Function6<BoxScope, RefreshState.State, Dp, Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RefreshState f13264OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f13265OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function5<BoxScope, RefreshState.State, Dp, Composer, Integer, Unit> f13266OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(RefreshState refreshState, Function5<? super BoxScope, ? super RefreshState.State, ? super Dp, ? super Composer, ? super Integer, Unit> function5, int i) {
            super(6);
            this.f13264OooO0Oo = refreshState;
            this.f13266OooO0o0 = function5;
            this.f13265OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function6
        public final Unit invoke(BoxScope boxScope, RefreshState.State state, Dp dp, Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
            int i;
            BoxScope BasicRefresh = boxScope;
            RefreshState.State _state = state;
            float fM3789unboximpl = dp.m3789unboximpl();
            Function2<? super Composer, ? super Integer, ? extends Unit> _content = function2;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(BasicRefresh, "$this$BasicRefresh");
            Intrinsics.checkNotNullParameter(_state, "_state");
            Intrinsics.checkNotNullParameter(_content, "_content");
            if ((iIntValue & 112) == 0) {
                i = (composer2.changed(_state) ? 32 : 16) | iIntValue;
            } else {
                i = iIntValue;
            }
            if ((iIntValue & 896) == 0) {
                i |= composer2.changed(fM3789unboximpl) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            if ((iIntValue & 7168) == 0) {
                i |= composer2.changedInstance(_content) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            if ((46801 & i) == 9360 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1221294851, i, -1, "com.code.android.uikit.swiprefresh.EasyRefresh.<anonymous> (EasySwipeRefresh.kt:57)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierM439offsetVpY3zN4$default = OffsetKt.m439offsetVpY3zN4$default(companion, 0.0f, fM3789unboximpl, 1, null);
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
                Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                androidx.compose.material.OooO00o.OooO00o((i >> 9) & 14, _content, composer2);
                if (this.f13264OooO0Oo.OooO0OO() != RefreshState.State.Null) {
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ClipKt.clipToBounds(SizeKt.m511height3ABfNKs(companion, fM3789unboximpl)), 0.0f, 1, null);
                    Alignment bottomCenter = companion2.getBottomCenter();
                    Function5<BoxScope, RefreshState.State, Dp, Composer, Integer, Unit> function5 = this.f13266OooO0o0;
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer2);
                    Function2 function2OooO00o2 = OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyRememberBoxMeasurePolicy, composerM1320constructorimpl2, currentCompositionLocalMap2);
                    if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    function5.invoke(boxScopeInstance, _state, Dp.m3773boximpl(fM3789unboximpl), composer2, Integer.valueOf((i & 896) | (i & 112) | 6 | ((this.f13265OooO0o << 9) & 7168)));
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ boolean f13267OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RefreshState f13268OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f13269OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ float f13270OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Modifier f13271OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ LazyListState f13272OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ boolean f13273OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ float f13274OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ long f13275OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ Function5<BoxScope, RefreshState.State, Dp, Composer, Integer, Unit> f13276OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ long f13277OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f13278OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final /* synthetic */ int f13279OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public final /* synthetic */ int f13280OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final /* synthetic */ int f13281OooOOo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(RefreshState refreshState, float f, Function0<Unit> function0, Modifier modifier, LazyListState lazyListState, boolean z, boolean z2, float f2, long j, long j2, Function5<? super BoxScope, ? super RefreshState.State, ? super Dp, ? super Composer, ? super Integer, Unit> function5, Function2<? super Composer, ? super Integer, Unit> function2, int i, int i2, int i3) {
            super(2);
            this.f13268OooO0Oo = refreshState;
            this.f13270OooO0o0 = f;
            this.f13269OooO0o = function0;
            this.f13271OooO0oO = modifier;
            this.f13272OooO0oo = lazyListState;
            this.f13267OooO = z;
            this.f13273OooOO0 = z2;
            this.f13274OooOO0O = f2;
            this.f13275OooOO0o = j;
            this.f13277OooOOO0 = j2;
            this.f13276OooOOO = function5;
            this.f13278OooOOOO = function2;
            this.f13279OooOOOo = i;
            this.f13281OooOOo0 = i2;
            this.f13280OooOOo = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooO0O0.OooO0O0(this.f13268OooO0Oo, this.f13270OooO0o0, this.f13269OooO0o, this.f13271OooO0oO, this.f13272OooO0oo, this.f13267OooO, this.f13273OooOO0, this.f13274OooOO0O, this.f13275OooOO0o, this.f13277OooOOO0, this.f13276OooOOO, this.f13278OooOOOO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f13279OooOOOo | 1), RecomposeScopeImplKt.updateChangedFlags(this.f13281OooOOo0), this.f13280OooOOo);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[0]][0]]")
    public static final void OooO00o(@NotNull RefreshState refreshState, float f, @NotNull Function0<Unit> onRefresh, @Nullable Modifier modifier, @Nullable LazyListState lazyListState, boolean z, boolean z2, float f2, long j, long j2, @NotNull Function6<? super BoxScope, ? super RefreshState.State, ? super Dp, ? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> refreshIndicator, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i, int i2, int i3) {
        Object obj;
        Intrinsics.checkNotNullParameter(refreshState, "refreshState");
        Intrinsics.checkNotNullParameter(onRefresh, "onRefresh");
        Intrinsics.checkNotNullParameter(refreshIndicator, "refreshIndicator");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1177741051);
        Modifier modifier2 = (i3 & 8) != 0 ? Modifier.INSTANCE : modifier;
        LazyListState lazyListState2 = (i3 & 16) != 0 ? null : lazyListState;
        boolean z3 = (i3 & 32) != 0 ? true : z;
        boolean z4 = (i3 & 64) != 0 ? false : z2;
        float f3 = (i3 & 128) != 0 ? 2.5f : f2;
        long j3 = (i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? 300L : j;
        long j4 = (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? 300L : j2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1177741051, i, i2, "com.code.android.uikit.swiprefresh.BasicRefresh (EasySwipeRefresh.kt:103)");
        }
        float fMo326toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(f);
        composerStartRestartGroup.startReplaceableGroup(773894976);
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
        }
        composerStartRestartGroup.endReplaceableGroup();
        CoroutineScope coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue, composerStartRestartGroup, 511388516);
        boolean zChanged = composerStartRestartGroup.changed(refreshState) | composerStartRestartGroup.changed(coroutineScopeOooO00o);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            obj = objRememberedValue2;
            com.code.android.uikit.swiprefresh.OooO0OO oooO0OO = new com.code.android.uikit.swiprefresh.OooO0OO(refreshState, coroutineScopeOooO00o);
            oooO0OO.f13285OooO0oO = f3;
            composerStartRestartGroup.updateRememberedValue(oooO0OO);
            obj = oooO0OO;
        }
        obj = objRememberedValue2;
        composerStartRestartGroup.endReplaceableGroup();
        com.code.android.uikit.swiprefresh.OooO0OO oooO0OO2 = (com.code.android.uikit.swiprefresh.OooO0OO) obj;
        oooO0OO2.f13286OooO0oo = fMo326toPx0680j_4;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue3;
        float f4 = f3;
        Modifier modifier3 = modifier2;
        EffectsKt.LaunchedEffect(refreshState.OooO0OO(), new OooO00o(refreshState, lazyListState2, j4, fMo326toPx0680j_4, j3, onRefresh, mutableState, null), composerStartRestartGroup, 64);
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierThen = NestedScrollModifierKt.nestedScroll$default(ClipKt.clipToBounds(companion2), oooO0OO2, null, 2, null).then(modifier3);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierThen);
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
        Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-736706501);
        float fM3775constructorimpl = !z3 ? Dp.m3775constructorimpl(0) : ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo322toDpu2uoSUM(refreshState.OooO0O0());
        composerStartRestartGroup.endReplaceableGroup();
        refreshIndicator.invoke(boxScopeInstance, refreshState.OooO0OO(), Dp.m3773boximpl(fM3775constructorimpl), content, composerStartRestartGroup, Integer.valueOf(((i2 << 6) & 7168) | 6 | ((i2 << 12) & 57344)));
        composerStartRestartGroup.startReplaceableGroup(-231976993);
        if (((Boolean) mutableState.getValue()).booleanValue() && !z4) {
            BoxKt.Box(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), composerStartRestartGroup, 0);
        }
        if (OooOo.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new C0199OooO0O0(refreshState, f, onRefresh, modifier3, lazyListState2, z3, z4, f4, j3, j4, refreshIndicator, content, i, i2, i3));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void OooO0O0(@NotNull RefreshState refreshState, float f, @NotNull Function0<Unit> onRefresh, @Nullable Modifier modifier, @Nullable LazyListState lazyListState, boolean z, boolean z2, float f2, long j, long j2, @NotNull Function5<? super BoxScope, ? super RefreshState.State, ? super Dp, ? super Composer, ? super Integer, Unit> refreshIndicator, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(refreshState, "refreshState");
        Intrinsics.checkNotNullParameter(onRefresh, "onRefresh");
        Intrinsics.checkNotNullParameter(refreshIndicator, "refreshIndicator");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-388061258);
        Modifier modifier2 = (i3 & 8) != 0 ? Modifier.INSTANCE : modifier;
        LazyListState lazyListState2 = (i3 & 16) != 0 ? null : lazyListState;
        boolean z3 = (i3 & 32) != 0 ? true : z;
        boolean z4 = (i3 & 64) != 0 ? false : z2;
        float f3 = (i3 & 128) != 0 ? 3.5f : f2;
        long j3 = (i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? 300L : j;
        long j4 = (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? 300L : j2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-388061258, i, i2, "com.code.android.uikit.swiprefresh.EasyRefresh (EasySwipeRefresh.kt:45)");
        }
        OooO00o(refreshState, f, onRefresh, modifier2, lazyListState2, z3, z4, f3, j3, j4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1221294851, true, new OooO0OO(refreshState, refreshIndicator, i2)), content, composerStartRestartGroup, (i & 112) | 8 | (i & 896) | (i & 7168) | (57344 & i) | (458752 & i) | (3670016 & i) | (29360128 & i) | (234881024 & i) | (1879048192 & i), (i2 & 112) | 6, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(refreshState, f, onRefresh, modifier2, lazyListState2, z3, z4, f3, j3, j4, refreshIndicator, content, i, i2, i3));
    }

    @Composable
    @NotNull
    public static final RefreshState OooO0OO(@Nullable Composer composer) {
        composer.startReplaceableGroup(-890875943);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-890875943, 0, -1, "com.code.android.uikit.swiprefresh.rememberRefreshState (EasySwipeRefresh.kt:18)");
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new RefreshState();
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        RefreshState refreshState = (RefreshState) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return refreshState;
    }
}
