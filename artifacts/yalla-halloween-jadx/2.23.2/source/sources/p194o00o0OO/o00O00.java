package p194o00o0OO;

import android.view.animation.OvershootInterpolator;
import androidx.compose.animation.OooO;
import androidx.compose.animation.OooOO0;
import androidx.compose.animation.Oooo000;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import com.google.logging.type.LogSeverity;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
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
import kotlin.random.Random;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nLikeClickAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LikeClickAnimation.kt\ncom/code/android/uikit/LikeClickAnimationKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,111:1\n25#2:112\n50#2:119\n49#2:120\n456#2,8:144\n464#2,3:158\n25#2:163\n25#2:170\n25#2:177\n25#2:184\n467#2,3:196\n1097#3,6:113\n1097#3,6:121\n1097#3,6:164\n1097#3,6:171\n1097#3,6:178\n1097#3,6:185\n66#4,6:127\n72#4:161\n76#4:200\n78#5,11:133\n91#5:199\n4144#6,6:152\n154#7:162\n154#7:193\n174#7:194\n75#8:191\n58#8:192\n64#8:195\n81#9:201\n*S KotlinDebug\n*F\n+ 1 LikeClickAnimation.kt\ncom/code/android/uikit/LikeClickAnimationKt\n*L\n41#1:112\n42#1:119\n42#1:120\n58#1:144,8\n58#1:158,3\n66#1:163\n67#1:170\n68#1:177\n88#1:184\n58#1:196,3\n41#1:113,6\n42#1:121,6\n66#1:164,6\n67#1:171,6\n68#1:178,6\n88#1:185,6\n58#1:127,6\n58#1:161\n58#1:200\n58#1:133,11\n58#1:199\n58#1:152,6\n65#1:162\n100#1:193\n103#1:194\n99#1:191\n99#1:192\n103#1:195\n62#1:201\n*E\n"})
public final class o00O00 {

    @DebugMetadata(c = "com.code.android.uikit.LikeClickAnimationKt$LikeClickAnimationView$1$1", f = "LikeClickAnimation.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateList<MutableState<DpOffset>> f38653OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<o00O000, Unit> f38654OooO0o0;

        /* JADX INFO: renamed from: o00o0OO.o00O00$OooO00o$OooO00o, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nLikeClickAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LikeClickAnimation.kt\ncom/code/android/uikit/LikeClickAnimationKt$LikeClickAnimationView$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,111:1\n1#2:112\n*E\n"})
        public static final class C0433OooO00o implements o00O000 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ SnapshotStateList<MutableState<DpOffset>> f38655OooO00o;

            public C0433OooO00o(SnapshotStateList<MutableState<DpOffset>> snapshotStateList) {
                this.f38655OooO00o = snapshotStateList;
            }

            @Override // p194o00o0OO.o00O000
            public final void OooO00o(long j) {
                MutableState<DpOffset> next;
                SnapshotStateList<MutableState<DpOffset>> snapshotStateList = this.f38655OooO00o;
                Iterator<MutableState<DpOffset>> it = snapshotStateList.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(next.getValue() == null));
                MutableState<DpOffset> mutableState = next;
                if (mutableState == null) {
                    snapshotStateList.add(SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(DpOffset.m3830boximpl(j), null, 2, null));
                } else {
                    mutableState.setValue(DpOffset.m3830boximpl(j));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(SnapshotStateList<MutableState<DpOffset>> snapshotStateList, Function1<? super o00O000, Unit> function1, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f38653OooO0Oo = snapshotStateList;
            this.f38654OooO0o0 = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f38653OooO0Oo, this.f38654OooO0o0, continuation);
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
            this.f38654OooO0o0.invoke(new C0433OooO00o(this.f38653OooO0Oo));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f38656OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f38657OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<o00O000, Unit> f38658OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f38659OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Modifier modifier, Function1<? super o00O000, Unit> function1, int i, int i2) {
            super(2);
            this.f38656OooO0Oo = modifier;
            this.f38658OooO0o0 = function1;
            this.f38657OooO0o = i;
            this.f38659OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f38657OooO0o | 1);
            o00O00.OooO00o(this.f38656OooO0Oo, this.f38658OooO0o0, composer, iUpdateChangedFlags, this.f38659OooO0oO);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.code.android.uikit.LikeClickAnimationKt$LikeClickAnimationView$2$1$2", f = "LikeClickAnimation.kt", i = {}, l = {73, 76, 78}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f38660OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Animatable<Float, AnimationVector1D> f38661OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Animatable<Float, AnimationVector1D> f38662OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Animatable<Float, AnimationVector1D> f38663OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ float f38664OooO0oo;

        @DebugMetadata(c = "com.code.android.uikit.LikeClickAnimationKt$LikeClickAnimationView$2$1$2$2", f = "LikeClickAnimation.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ Object f38665OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ Animatable<Float, AnimationVector1D> f38666OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ Animatable<Float, AnimationVector1D> f38667OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ Animatable<Float, AnimationVector1D> f38668OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public final /* synthetic */ float f38669OooO0oo;

            /* JADX INFO: renamed from: o00o0OO.o00O00$OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
            @DebugMetadata(c = "com.code.android.uikit.LikeClickAnimationKt$LikeClickAnimationView$2$1$2$2$1", f = "LikeClickAnimation.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0434OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public int f38670OooO0Oo;

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public final /* synthetic */ Animatable<Float, AnimationVector1D> f38671OooO0o0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0434OooO00o(Animatable<Float, AnimationVector1D> animatable, Continuation<? super C0434OooO00o> continuation) {
                    super(2, continuation);
                    this.f38671OooO0o0 = animatable;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0434OooO00o(this.f38671OooO0o0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C0434OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f38670OooO0Oo;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Animatable<Float, AnimationVector1D> animatable = this.f38671OooO0o0;
                        Float fBoxFloat = Boxing.boxFloat(1.0f);
                        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(LogSeverity.EMERGENCY_VALUE, 0, null, 6, null);
                        this.f38670OooO0Oo = 1;
                        if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
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

            @DebugMetadata(c = "com.code.android.uikit.LikeClickAnimationKt$LikeClickAnimationView$2$1$2$2$2", f = "LikeClickAnimation.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
            public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public int f38672OooO0Oo;

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public final /* synthetic */ Animatable<Float, AnimationVector1D> f38673OooO0o0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO0O0(Animatable<Float, AnimationVector1D> animatable, Continuation<? super OooO0O0> continuation) {
                    super(2, continuation);
                    this.f38673OooO0o0 = animatable;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new OooO0O0(this.f38673OooO0o0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f38672OooO0Oo;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Animatable<Float, AnimationVector1D> animatable = this.f38673OooO0o0;
                        Float fBoxFloat = Boxing.boxFloat(0.0f);
                        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(LogSeverity.EMERGENCY_VALUE, 0, null, 6, null);
                        this.f38672OooO0Oo = 1;
                        if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
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

            /* JADX INFO: renamed from: o00o0OO.o00O00$OooO0OO$OooO00o$OooO0OO, reason: collision with other inner class name */
            @DebugMetadata(c = "com.code.android.uikit.LikeClickAnimationKt$LikeClickAnimationView$2$1$2$2$3", f = "LikeClickAnimation.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0435OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public int f38674OooO0Oo;

                /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
                public final /* synthetic */ float f38675OooO0o;

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public final /* synthetic */ Animatable<Float, AnimationVector1D> f38676OooO0o0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0435OooO0OO(Animatable<Float, AnimationVector1D> animatable, float f, Continuation<? super C0435OooO0OO> continuation) {
                    super(2, continuation);
                    this.f38676OooO0o0 = animatable;
                    this.f38675OooO0o = f;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0435OooO0OO(this.f38676OooO0o0, this.f38675OooO0o, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C0435OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f38674OooO0Oo;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Animatable<Float, AnimationVector1D> animatable = this.f38676OooO0o0;
                        Float fBoxFloat = Boxing.boxFloat(this.f38675OooO0o * ((float) Random.INSTANCE.nextDouble(0.4d, 0.8d)));
                        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(LogSeverity.EMERGENCY_VALUE, 0, null, 6, null);
                        this.f38674OooO0Oo = 1;
                        if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(Animatable<Float, AnimationVector1D> animatable, Animatable<Float, AnimationVector1D> animatable2, Animatable<Float, AnimationVector1D> animatable3, float f, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f38667OooO0o0 = animatable;
                this.f38666OooO0o = animatable2;
                this.f38668OooO0oO = animatable3;
                this.f38669OooO0oo = f;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f38667OooO0o0, this.f38666OooO0o, this.f38668OooO0oO, this.f38669OooO0oo, continuation);
                oooO00o.f38665OooO0Oo = obj;
                return oooO00o;
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
                CoroutineScope coroutineScope = (CoroutineScope) this.f38665OooO0Oo;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C0434OooO00o(this.f38667OooO0o0, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new OooO0O0(this.f38666OooO0o, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C0435OooO0OO(this.f38668OooO0oO, this.f38669OooO0oo, null), 3, null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Animatable<Float, AnimationVector1D> animatable, Animatable<Float, AnimationVector1D> animatable2, Animatable<Float, AnimationVector1D> animatable3, float f, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f38662OooO0o0 = animatable;
            this.f38661OooO0o = animatable2;
            this.f38663OooO0oO = animatable3;
            this.f38664OooO0oo = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f38662OooO0o0, this.f38661OooO0o, this.f38663OooO0oO, this.f38664OooO0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0074 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            OooO00o oooO00o;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f38660OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    oooO00o = new OooO00o(this.f38662OooO0o0, this.f38661OooO0o, this.f38663OooO0oO, this.f38664OooO0oo, null);
                    this.f38660OooO0Oo = 3;
                    if (CoroutineScopeKt.coroutineScope(oooO00o, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            final OvershootInterpolator overshootInterpolator = new OvershootInterpolator();
            Animatable<Float, AnimationVector1D> animatable = this.f38662OooO0o0;
            Float fBoxFloat = Boxing.boxFloat(0.6f);
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(300, 0, new Easing() { // from class: o00o0OO.o00O00O
                @Override // androidx.compose.animation.core.Easing
                public final float transform(float f) {
                    return overshootInterpolator.getInterpolation(f);
                }
            }, 2, null);
            this.f38660OooO0Oo = 1;
            if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f38660OooO0Oo = 2;
            if (DelayKt.delay(250L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            oooO00o = new OooO00o(this.f38662OooO0o0, this.f38661OooO0o, this.f38663OooO0oO, this.f38664OooO0oo, null);
            this.f38660OooO0Oo = 3;
            if (CoroutineScopeKt.coroutineScope(oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f38677OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f38678OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<o00O000, Unit> f38679OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f38680OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(Modifier modifier, Function1<? super o00O000, Unit> function1, int i, int i2) {
            super(2);
            this.f38677OooO0Oo = modifier;
            this.f38679OooO0o0 = function1;
            this.f38678OooO0o = i;
            this.f38680OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f38678OooO0o | 1);
            o00O00.OooO00o(this.f38677OooO0Oo, this.f38679OooO0o0, composer, iUpdateChangedFlags, this.f38680OooO0oO);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@Nullable Modifier modifier, @NotNull Function1<? super o00O000, Unit> onCreatedControl, @Nullable Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Object obj;
        Intrinsics.checkNotNullParameter(onCreatedControl, "onCreatedControl");
        Composer composerStartRestartGroup = composer.startRestartGroup(1871892554);
        int currentMarker = composerStartRestartGroup.getCurrentMarker();
        int i4 = i2 & 1;
        int i5 = 2;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCreatedControl) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1871892554, i3, -1, "com.code.android.uikit.LikeClickAnimationView (LikeClickAnimation.kt:39)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged = composerStartRestartGroup.changed(snapshotStateList) | composerStartRestartGroup.changed(onCreatedControl);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new OooO00o(snapshotStateList, onCreatedControl, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 70);
            if (!snapshotStateList.isEmpty()) {
                Modifier modifierThen = Modifier.INSTANCE.then(modifier4);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Function2 function2OooO00o = OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-1829681816);
                int size = snapshotStateList.size();
                int i6 = 0;
                int i7 = -492369756;
                while (i6 < size) {
                    MutableState mutableState = (MutableState) snapshotStateList.get(i6);
                    if (((DpOffset) mutableState.getValue()) == null) {
                        composerStartRestartGroup.endToMarker(currentMarker);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(modifier4, onCreatedControl, i, i2));
                        return;
                    }
                    float fM3775constructorimpl = Dp.m3775constructorimpl(200);
                    composerStartRestartGroup.startReplaceableGroup(i7);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    Composer.Companion companion3 = Composer.INSTANCE;
                    if (objRememberedValue3 == companion3.getEmpty()) {
                        Animatable animatableAnimatable$default = AnimatableKt.Animatable$default(1.0f, 0.0f, i5, null);
                        composerStartRestartGroup.updateRememberedValue(animatableAnimatable$default);
                        obj = null;
                        objRememberedValue3 = animatableAnimatable$default;
                    } else {
                        obj = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Animatable animatable = (Animatable) objRememberedValue3;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    int i8 = size;
                    if (objRememberedValue4 == companion3.getEmpty()) {
                        Animatable animatableAnimatable$default2 = AnimatableKt.Animatable$default(1.0f, 0.0f, i5, obj);
                        composerStartRestartGroup.updateRememberedValue(animatableAnimatable$default2);
                        objRememberedValue4 = animatableAnimatable$default2;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Animatable animatable2 = (Animatable) objRememberedValue4;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    int i9 = i6;
                    if (objRememberedValue5 == companion3.getEmpty()) {
                        objRememberedValue5 = AnimatableKt.Animatable$default(0.0f, 0.0f, i5, obj);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Animatable animatable3 = (Animatable) objRememberedValue5;
                    SnapshotStateList snapshotStateList2 = snapshotStateList;
                    EffectsKt.LaunchedEffect(Unit.INSTANCE, new OooO0OO(animatable, animatable2, animatable3, fM3775constructorimpl, null), composerStartRestartGroup, 70);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == companion3.getEmpty()) {
                        objRememberedValue6 = Float.valueOf(Random.INSTANCE.nextInt(0, i5) == 0 ? -15.0f : 15.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    float fFloatValue = ((Number) objRememberedValue6).floatValue();
                    Painter painterPainterResource = PainterResources_androidKt.painterResource(o00O00OO.ic_like_click, composerStartRestartGroup, 0);
                    ContentScale fit = ContentScale.INSTANCE.getFit();
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    DpOffset dpOffset = (DpOffset) mutableState.getValue();
                    Intrinsics.checkNotNull(dpOffset);
                    float fM3775constructorimpl2 = Dp.m3775constructorimpl(DpOffset.m3836getXD9Ej5fM(dpOffset.getPackedValue()) - Dp.m3775constructorimpl(fM3775constructorimpl / i5));
                    DpOffset dpOffset2 = (DpOffset) mutableState.getValue();
                    Intrinsics.checkNotNull(dpOffset2);
                    ImageKt.Image(painterPainterResource, (String) null, RotateKt.rotate(AlphaKt.alpha(OffsetKt.m439offsetVpY3zN4$default(ScaleKt.scale(SizeKt.m525size3ABfNKs(OffsetKt.m439offsetVpY3zN4$default(OffsetKt.m438offsetVpY3zN4(companion4, fM3775constructorimpl2, Dp.m3775constructorimpl(DpOffset.m3838getYD9Ej5fM(dpOffset2.getPackedValue()) - fM3775constructorimpl)), 0.0f, Dp.m3775constructorimpl(20), 1, null), fM3775constructorimpl), ((Number) animatable.getValue()).floatValue()), 0.0f, Dp.m3775constructorimpl(-Dp.m3775constructorimpl(((Number) animatable3.getValue()).floatValue())), 1, null), ((Number) animatable2.getValue()).floatValue()), fFloatValue), (Alignment) null, fit, 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
                    i6 = i9 + 1;
                    size = i8;
                    i7 = -492369756;
                    modifier4 = modifier4;
                    currentMarker = currentMarker;
                    i5 = 2;
                    snapshotStateList = snapshotStateList2;
                }
                modifier3 = modifier4;
                o00O000o.OooO00o(composerStartRestartGroup);
            } else {
                modifier3 = modifier4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooO0o(modifier2, onCreatedControl, i, i2));
    }
}
