package p546o0oOO;

import androidx.compose.animation.OooO;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.qiniu.android.storage.Configuration;
import com.zego.zegoliveroom.constants.ZegoConstants;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p018OooOoo0.OooOOO;
import p141o00Oo.oo0o0Oo;
import p469o0OoooOO.o0oO0O0o;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nCustomSliderThumb.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomSliderThumb.kt\ncom/code/android/uikit/slider/CustomSliderThumbKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,177:1\n66#2,6:178\n72#2:212\n76#2:236\n66#2,6:237\n72#2:271\n76#2:294\n78#3,11:184\n91#3:235\n78#3,11:243\n91#3:293\n456#4,8:195\n464#4,3:209\n25#4:213\n83#4,3:220\n467#4,3:232\n456#4,8:254\n464#4,3:268\n25#4:272\n67#4,3:279\n66#4:282\n467#4,3:290\n4144#5,6:203\n4144#5,6:262\n1097#6,6:214\n1097#6,6:223\n1097#6,6:273\n1097#6,6:283\n81#7:229\n75#7:230\n75#7:231\n81#7:289\n*S KotlinDebug\n*F\n+ 1 CustomSliderThumb.kt\ncom/code/android/uikit/slider/CustomSliderThumbKt\n*L\n40#1:178,6\n40#1:212\n40#1:236\n116#1:237,6\n116#1:271\n116#1:294\n40#1:184,11\n40#1:235\n116#1:243,11\n116#1:293\n40#1:195,8\n40#1:209,3\n45#1:213\n46#1:220,3\n40#1:232,3\n116#1:254,8\n116#1:268,3\n121#1:272\n122#1:279,3\n122#1:282\n116#1:290,3\n40#1:203,6\n116#1:262,6\n45#1:214,6\n46#1:223,6\n121#1:273,6\n122#1:283,6\n84#1:229\n92#1:230\n93#1:231\n159#1:289\n*E\n"})
public final class OooOO0 {

    @DebugMetadata(c = "com.code.android.uikit.slider.CustomSliderThumbKt$CustomSliderThumb$1$1$1", f = "CustomSliderThumb.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f55846OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f55847OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f55848OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateList<Interaction> f55849OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f55850OooO0oo;

        /* JADX INFO: renamed from: o0oOO.OooOO0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0508OooO00o implements FlowCollector<Interaction> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f55851OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ Function1<Integer, Unit> f55852OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ SnapshotStateList<Interaction> f55853OooO0o0;

            /* JADX WARN: Multi-variable type inference failed */
            public C0508OooO00o(MutableState<Boolean> mutableState, SnapshotStateList<Interaction> snapshotStateList, Function1<? super Integer, Unit> function1) {
                this.f55851OooO0Oo = mutableState;
                this.f55853OooO0o0 = snapshotStateList;
                this.f55852OooO0o = function1;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Interaction interaction, Continuation continuation) {
                Interaction interaction2 = interaction;
                boolean z = interaction2 instanceof PressInteraction.Press;
                SnapshotStateList<Interaction> snapshotStateList = this.f55853OooO0o0;
                MutableState<Boolean> mutableState = this.f55851OooO0Oo;
                if (z) {
                    mutableState.setValue(Boxing.boxBoolean(true));
                    snapshotStateList.add(interaction2);
                } else if (interaction2 instanceof PressInteraction.Release) {
                    mutableState.setValue(Boxing.boxBoolean(false));
                    snapshotStateList.remove(((PressInteraction.Release) interaction2).getPress());
                } else if (interaction2 instanceof PressInteraction.Cancel) {
                    mutableState.setValue(Boxing.boxBoolean(false));
                    snapshotStateList.remove(((PressInteraction.Cancel) interaction2).getPress());
                } else if (interaction2 instanceof DragInteraction.Start) {
                    mutableState.setValue(Boxing.boxBoolean(true));
                    snapshotStateList.add(interaction2);
                    Function1<Integer, Unit> function1 = this.f55852OooO0o;
                    if (function1 != null) {
                        function1.invoke(Boxing.boxInt(3));
                    }
                } else if (interaction2 instanceof DragInteraction.Stop) {
                    mutableState.setValue(Boxing.boxBoolean(false));
                    snapshotStateList.remove(((DragInteraction.Stop) interaction2).getStart());
                } else if (interaction2 instanceof DragInteraction.Cancel) {
                    mutableState.setValue(Boxing.boxBoolean(false));
                    snapshotStateList.remove(((DragInteraction.Cancel) interaction2).getStart());
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(MutableInteractionSource mutableInteractionSource, MutableState<Boolean> mutableState, SnapshotStateList<Interaction> snapshotStateList, Function1<? super Integer, Unit> function1, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f55848OooO0o0 = mutableInteractionSource;
            this.f55847OooO0o = mutableState;
            this.f55849OooO0oO = snapshotStateList;
            this.f55850OooO0oo = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f55848OooO0o0, this.f55847OooO0o, this.f55849OooO0oO, this.f55850OooO0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f55846OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Interaction> interactions = this.f55848OooO0o0.getInteractions();
                C0508OooO00o c0508OooO00o = new C0508OooO00o(this.f55847OooO0o, this.f55849OooO0oO, this.f55850OooO0oo);
                this.f55846OooO0Oo = 1;
                if (interactions.collect(c0508OooO00o, this) == coroutine_suspended) {
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

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ float f55854OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f55855OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f55856OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ float f55857OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ oo0o0Oo f55858OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f55859OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ float f55860OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f55861OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f55862OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ int f55863OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ int f55864OooOOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(BoxScope boxScope, float f, MutableInteractionSource mutableInteractionSource, oo0o0Oo oo0o0oo, boolean z, float f2, float f3, MutableState<Boolean> mutableState, Function1<? super Integer, Unit> function1, int i, int i2) {
            super(2);
            this.f55855OooO0Oo = boxScope;
            this.f55857OooO0o0 = f;
            this.f55856OooO0o = mutableInteractionSource;
            this.f55858OooO0oO = oo0o0oo;
            this.f55859OooO0oo = z;
            this.f55854OooO = f2;
            this.f55860OooOO0 = f3;
            this.f55861OooOO0O = mutableState;
            this.f55862OooOO0o = function1;
            this.f55864OooOOO0 = i;
            this.f55863OooOOO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooOO0.OooO00o(this.f55855OooO0Oo, this.f55857OooO0o0, this.f55856OooO0o, this.f55858OooO0oO, this.f55859OooO0oo, this.f55854OooO, this.f55860OooOO0, this.f55861OooOO0O, this.f55862OooOO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f55864OooOOO0 | 1), this.f55863OooOOO);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.code.android.uikit.slider.CustomSliderThumbKt$CustomWhiteRoundSliderThumb$1$1$1", f = "CustomSliderThumb.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f55865OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f55866OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f55867OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateList<Interaction> f55868OooO0oO;

        public static final class OooO00o implements FlowCollector<Interaction> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f55869OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ SnapshotStateList<Interaction> f55870OooO0o0;

            public OooO00o(MutableState<Boolean> mutableState, SnapshotStateList<Interaction> snapshotStateList) {
                this.f55869OooO0Oo = mutableState;
                this.f55870OooO0o0 = snapshotStateList;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Interaction interaction, Continuation continuation) {
                Interaction interaction2 = interaction;
                boolean z = interaction2 instanceof PressInteraction.Press;
                SnapshotStateList<Interaction> snapshotStateList = this.f55870OooO0o0;
                MutableState<Boolean> mutableState = this.f55869OooO0Oo;
                if (z) {
                    mutableState.setValue(Boxing.boxBoolean(true));
                    snapshotStateList.add(interaction2);
                } else if (interaction2 instanceof PressInteraction.Release) {
                    mutableState.setValue(Boxing.boxBoolean(false));
                    snapshotStateList.remove(((PressInteraction.Release) interaction2).getPress());
                } else if (interaction2 instanceof PressInteraction.Cancel) {
                    mutableState.setValue(Boxing.boxBoolean(false));
                    snapshotStateList.remove(((PressInteraction.Cancel) interaction2).getPress());
                } else if (interaction2 instanceof DragInteraction.Start) {
                    mutableState.setValue(Boxing.boxBoolean(true));
                    snapshotStateList.add(interaction2);
                } else if (interaction2 instanceof DragInteraction.Stop) {
                    mutableState.setValue(Boxing.boxBoolean(false));
                    snapshotStateList.remove(((DragInteraction.Stop) interaction2).getStart());
                } else if (interaction2 instanceof DragInteraction.Cancel) {
                    mutableState.setValue(Boxing.boxBoolean(false));
                    snapshotStateList.remove(((DragInteraction.Cancel) interaction2).getStart());
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MutableInteractionSource mutableInteractionSource, MutableState<Boolean> mutableState, SnapshotStateList<Interaction> snapshotStateList, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f55867OooO0o0 = mutableInteractionSource;
            this.f55866OooO0o = mutableState;
            this.f55868OooO0oO = snapshotStateList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f55867OooO0o0, this.f55866OooO0o, this.f55868OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f55865OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Interaction> interactions = this.f55867OooO0o0.getInteractions();
                OooO00o oooO00o = new OooO00o(this.f55866OooO0o, this.f55868OooO0oO);
                this.f55865OooO0Oo = 1;
                if (interactions.collect(oooO00o, this) == coroutine_suspended) {
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

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ float f55871OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f55872OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f55873OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ float f55874OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ oo0o0Oo f55875OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f55876OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ float f55877OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f55878OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ int f55879OooOO0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(BoxScope boxScope, float f, MutableInteractionSource mutableInteractionSource, oo0o0Oo oo0o0oo, boolean z, float f2, float f3, MutableState<Boolean> mutableState, int i) {
            super(2);
            this.f55872OooO0Oo = boxScope;
            this.f55874OooO0o0 = f;
            this.f55873OooO0o = mutableInteractionSource;
            this.f55875OooO0oO = oo0o0oo;
            this.f55876OooO0oo = z;
            this.f55871OooO = f2;
            this.f55877OooOO0 = f3;
            this.f55878OooOO0O = mutableState;
            this.f55879OooOO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooOO0.OooO0O0(this.f55872OooO0Oo, this.f55874OooO0o0, this.f55873OooO0o, this.f55875OooO0oO, this.f55876OooO0oo, this.f55871OooO, this.f55877OooOO0, this.f55878OooOO0O, composer, RecomposeScopeImplKt.updateChangedFlags(this.f55879OooOO0o | 1));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:103:0x01c9 A[LOOP:0: B:102:0x01c7->B:103:0x01c9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x01da  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:113:0x021d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0237  */
    /* JADX WARN: Code duplicated, block: B:117:0x0283  */
    /* JADX WARN: Code duplicated, block: B:121:0x028d  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:46:0x0096  */
    /* JADX WARN: Code duplicated, block: B:48:0x009b  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:85:0x0103  */
    /* JADX WARN: Code duplicated, block: B:88:0x014f  */
    /* JADX WARN: Code duplicated, block: B:91:0x015b  */
    /* JADX WARN: Code duplicated, block: B:92:0x015f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0170  */
    /* JADX WARN: Code duplicated, block: B:97:0x017e  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull BoxScope CustomSliderThumb, float f, @NotNull MutableInteractionSource interactionSource, @NotNull oo0o0Oo colors, boolean z, float f2, float f3, @NotNull MutableState<Boolean> isPress, @Nullable Function1<? super Integer, Unit> function1, @Nullable Composer composer, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        Function1<? super Integer, Unit> function2;
        int i7;
        int i8;
        Function1<? super Integer, Unit> function3;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1309constructorimpl;
        Function2 function2OooO00o;
        Object objRememberedValue;
        SnapshotStateList snapshotStateList;
        int i9;
        Object[] objArr;
        int i10;
        boolean zChanged;
        Object objRememberedValue2;
        int i11;
        Object obj;
        Modifier modifierM168backgroundbw27NRU;
        int i12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i13;
        Intrinsics.checkNotNullParameter(CustomSliderThumb, "$this$CustomSliderThumb");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(isPress, "isPress");
        Composer composerStartRestartGroup = composer.startRestartGroup(-312818245);
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(CustomSliderThumb) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(interactionSource) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 16) == 0) {
            i13 = (458752 & i) == 0 ? composerStartRestartGroup.changed(f2) ? 131072 : 65536 : 196608;
            if ((i2 & 32) != 0) {
                if ((3670016 & i) == 0) {
                    if (composerStartRestartGroup.changed(f3)) {
                        i4 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i4 = 524288;
                    }
                }
                if ((i2 & 64) != 0) {
                    if ((29360128 & i) == 0) {
                        if (composerStartRestartGroup.changed(isPress)) {
                            i5 = 8388608;
                        } else {
                            i5 = Configuration.BLOCK_SIZE;
                        }
                    }
                    i6 = i2 & 128;
                    if (i6 != 0) {
                        if ((234881024 & i) == 0) {
                            function2 = function1;
                            if (composerStartRestartGroup.changedInstance(function2)) {
                                i7 = 67108864;
                            } else {
                                i7 = 33554432;
                            }
                            i3 |= i7;
                        }
                        i8 = i3;
                        if ((191693531 & i8) == 38338706 || !composerStartRestartGroup.getSkipping()) {
                            if (i6 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-312818245, i8, -1, "com.code.android.uikit.slider.CustomSliderThumb (CustomSliderThumb.kt:29)");
                            }
                            Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null);
                            Alignment.Companion companion = Alignment.INSTANCE;
                            Modifier modifierAlign = CustomSliderThumb.align(modifierM480paddingqDBjuR0$default, companion.getCenterStart());
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(companion, false, composerStartRestartGroup, 0, -1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierAlign);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                            function2OooO00o = OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            snapshotStateList = (SnapshotStateList) objRememberedValue;
                            i10 = 0;
                            objArr = new Object[]{interactionSource, isPress, snapshotStateList, function3};
                            composerStartRestartGroup.startReplaceableGroup(-568225417);
                            zChanged = false;
                            for (i9 = 4; i10 < i9; i9 = 4) {
                                zChanged |= composerStartRestartGroup.changed(objArr[i10]);
                                i10++;
                            }
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                i11 = 4;
                                obj = null;
                            } else {
                                i11 = 4;
                                obj = null;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, ((i8 >> 6) & 14) | 64);
                            if (isPress.getValue().booleanValue()) {
                                Modifier modifierScale = ScaleKt.scale(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, f2), f3 / f2);
                                int i14 = o0oO0O0o.f47152o00OOOo;
                                modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(modifierScale, o0oO0O0o.f46946OooO0O0, RoundedCornerShapeKt.getCircleShape());
                                i12 = 2;
                            } else {
                                modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(SizeKt.m525sizeVpY3zN4(OffsetKt.m437offsetVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f2 / i11), 0.0f, 2, obj), Dp.m3765constructorimpl(f2 / 2), f2), ColorKt.Color(4285392127L), RoundedCornerShapeKt.getCircleShape());
                                i12 = 2;
                            }
                            SpacerKt.Spacer(HoverableKt.hoverable$default(Modifier.INSTANCE.then(modifierM168backgroundbw27NRU), interactionSource, false, i12, obj), composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            function3 = function2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(CustomSliderThumb, f, interactionSource, colors, z, f2, f3, isPress, function3, i, i2));
                    }
                    i3 |= 100663296;
                    function2 = function1;
                    i8 = i3;
                    if ((191693531 & i8) == 38338706) {
                        if (i6 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-312818245, i8, -1, "com.code.android.uikit.slider.CustomSliderThumb (CustomSliderThumb.kt:29)");
                        }
                        Modifier modifierM480paddingqDBjuR0$default2 = PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null);
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        Modifier modifierAlign2 = CustomSliderThumb.align(modifierM480paddingqDBjuR0$default2, companion3.getCenterStart());
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyOooO00o2 = OooOOO.OooO00o(companion3, false, composerStartRestartGroup, 0, -1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        constructor = companion4.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierAlign2);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o = OooO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyOooO00o2, composerM1309constructorimpl, currentCompositionLocalMap2);
                        if (composerM1309constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = SnapshotStateKt.mutableStateListOf();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        snapshotStateList = (SnapshotStateList) objRememberedValue;
                        i10 = 0;
                        objArr = new Object[]{interactionSource, isPress, snapshotStateList, function3};
                        composerStartRestartGroup.startReplaceableGroup(-568225417);
                        zChanged = false;
                        while (i10 < i9) {
                            zChanged |= composerStartRestartGroup.changed(objArr[i10]);
                            i10++;
                        }
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            i11 = 4;
                            obj = null;
                        } else {
                            objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            i11 = 4;
                            obj = null;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, ((i8 >> 6) & 14) | 64);
                        if (isPress.getValue().booleanValue()) {
                            Modifier modifierScale2 = ScaleKt.scale(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, f2), f3 / f2);
                            int i15 = o0oO0O0o.f47152o00OOOo;
                            modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(modifierScale2, o0oO0O0o.f46946OooO0O0, RoundedCornerShapeKt.getCircleShape());
                            i12 = 2;
                        } else {
                            modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(SizeKt.m525sizeVpY3zN4(OffsetKt.m437offsetVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f2 / i11), 0.0f, 2, obj), Dp.m3765constructorimpl(f2 / 2), f2), ColorKt.Color(4285392127L), RoundedCornerShapeKt.getCircleShape());
                            i12 = 2;
                        }
                        SpacerKt.Spacer(HoverableKt.hoverable$default(Modifier.INSTANCE.then(modifierM168backgroundbw27NRU), interactionSource, false, i12, obj), composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        if (i6 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-312818245, i8, -1, "com.code.android.uikit.slider.CustomSliderThumb (CustomSliderThumb.kt:29)");
                        }
                        Modifier modifierM480paddingqDBjuR0$default3 = PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null);
                        Alignment.Companion companion5 = Alignment.INSTANCE;
                        Modifier modifierAlign3 = CustomSliderThumb.align(modifierM480paddingqDBjuR0$default3, companion5.getCenterStart());
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyOooO00o3 = OooOOO.OooO00o(companion5, false, composerStartRestartGroup, 0, -1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                        constructor = companion6.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierAlign3);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o = OooO.OooO00o(companion6, composerM1309constructorimpl, measurePolicyOooO00o3, composerM1309constructorimpl, currentCompositionLocalMap3);
                        if (composerM1309constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = SnapshotStateKt.mutableStateListOf();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        snapshotStateList = (SnapshotStateList) objRememberedValue;
                        i10 = 0;
                        objArr = new Object[]{interactionSource, isPress, snapshotStateList, function3};
                        composerStartRestartGroup.startReplaceableGroup(-568225417);
                        zChanged = false;
                        while (i10 < i9) {
                            zChanged |= composerStartRestartGroup.changed(objArr[i10]);
                            i10++;
                        }
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            i11 = 4;
                            obj = null;
                        } else {
                            objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            i11 = 4;
                            obj = null;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, ((i8 >> 6) & 14) | 64);
                        if (isPress.getValue().booleanValue()) {
                            Modifier modifierScale3 = ScaleKt.scale(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, f2), f3 / f2);
                            int i16 = o0oO0O0o.f47152o00OOOo;
                            modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(modifierScale3, o0oO0O0o.f46946OooO0O0, RoundedCornerShapeKt.getCircleShape());
                            i12 = 2;
                        } else {
                            modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(SizeKt.m525sizeVpY3zN4(OffsetKt.m437offsetVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f2 / i11), 0.0f, 2, obj), Dp.m3765constructorimpl(f2 / 2), f2), ColorKt.Color(4285392127L), RoundedCornerShapeKt.getCircleShape());
                            i12 = 2;
                        }
                        SpacerKt.Spacer(HoverableKt.hoverable$default(Modifier.INSTANCE.then(modifierM168backgroundbw27NRU), interactionSource, false, i12, obj), composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(CustomSliderThumb, f, interactionSource, colors, z, f2, f3, isPress, function3, i, i2));
                }
                i5 = 12582912;
                i3 |= i5;
                i6 = i2 & 128;
                if (i6 != 0) {
                    if ((234881024 & i) == 0) {
                        function2 = function1;
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i7 = 67108864;
                        } else {
                            i7 = 33554432;
                        }
                        i3 |= i7;
                    }
                    i8 = i3;
                    if ((191693531 & i8) == 38338706) {
                        if (i6 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-312818245, i8, -1, "com.code.android.uikit.slider.CustomSliderThumb (CustomSliderThumb.kt:29)");
                        }
                        Modifier modifierM480paddingqDBjuR0$default4 = PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null);
                        Alignment.Companion companion7 = Alignment.INSTANCE;
                        Modifier modifierAlign4 = CustomSliderThumb.align(modifierM480paddingqDBjuR0$default4, companion7.getCenterStart());
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyOooO00o4 = OooOOO.OooO00o(companion7, false, composerStartRestartGroup, 0, -1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                        constructor = companion8.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierAlign4);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o = OooO.OooO00o(companion8, composerM1309constructorimpl, measurePolicyOooO00o4, composerM1309constructorimpl, currentCompositionLocalMap4);
                        if (composerM1309constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = SnapshotStateKt.mutableStateListOf();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        snapshotStateList = (SnapshotStateList) objRememberedValue;
                        i10 = 0;
                        objArr = new Object[]{interactionSource, isPress, snapshotStateList, function3};
                        composerStartRestartGroup.startReplaceableGroup(-568225417);
                        zChanged = false;
                        while (i10 < i9) {
                            zChanged |= composerStartRestartGroup.changed(objArr[i10]);
                            i10++;
                        }
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            i11 = 4;
                            obj = null;
                        } else {
                            objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            i11 = 4;
                            obj = null;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, ((i8 >> 6) & 14) | 64);
                        if (isPress.getValue().booleanValue()) {
                            Modifier modifierScale4 = ScaleKt.scale(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, f2), f3 / f2);
                            int i17 = o0oO0O0o.f47152o00OOOo;
                            modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(modifierScale4, o0oO0O0o.f46946OooO0O0, RoundedCornerShapeKt.getCircleShape());
                            i12 = 2;
                        } else {
                            modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(SizeKt.m525sizeVpY3zN4(OffsetKt.m437offsetVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f2 / i11), 0.0f, 2, obj), Dp.m3765constructorimpl(f2 / 2), f2), ColorKt.Color(4285392127L), RoundedCornerShapeKt.getCircleShape());
                            i12 = 2;
                        }
                        SpacerKt.Spacer(HoverableKt.hoverable$default(Modifier.INSTANCE.then(modifierM168backgroundbw27NRU), interactionSource, false, i12, obj), composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        if (i6 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-312818245, i8, -1, "com.code.android.uikit.slider.CustomSliderThumb (CustomSliderThumb.kt:29)");
                        }
                        Modifier modifierM480paddingqDBjuR0$default5 = PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null);
                        Alignment.Companion companion9 = Alignment.INSTANCE;
                        Modifier modifierAlign5 = CustomSliderThumb.align(modifierM480paddingqDBjuR0$default5, companion9.getCenterStart());
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyOooO00o5 = OooOOO.OooO00o(companion9, false, composerStartRestartGroup, 0, -1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                        constructor = companion10.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierAlign5);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o = OooO.OooO00o(companion10, composerM1309constructorimpl, measurePolicyOooO00o5, composerM1309constructorimpl, currentCompositionLocalMap5);
                        if (composerM1309constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf5, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = SnapshotStateKt.mutableStateListOf();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        snapshotStateList = (SnapshotStateList) objRememberedValue;
                        i10 = 0;
                        objArr = new Object[]{interactionSource, isPress, snapshotStateList, function3};
                        composerStartRestartGroup.startReplaceableGroup(-568225417);
                        zChanged = false;
                        while (i10 < i9) {
                            zChanged |= composerStartRestartGroup.changed(objArr[i10]);
                            i10++;
                        }
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            i11 = 4;
                            obj = null;
                        } else {
                            objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            i11 = 4;
                            obj = null;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, ((i8 >> 6) & 14) | 64);
                        if (isPress.getValue().booleanValue()) {
                            Modifier modifierScale5 = ScaleKt.scale(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, f2), f3 / f2);
                            int i18 = o0oO0O0o.f47152o00OOOo;
                            modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(modifierScale5, o0oO0O0o.f46946OooO0O0, RoundedCornerShapeKt.getCircleShape());
                            i12 = 2;
                        } else {
                            modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(SizeKt.m525sizeVpY3zN4(OffsetKt.m437offsetVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f2 / i11), 0.0f, 2, obj), Dp.m3765constructorimpl(f2 / 2), f2), ColorKt.Color(4285392127L), RoundedCornerShapeKt.getCircleShape());
                            i12 = 2;
                        }
                        SpacerKt.Spacer(HoverableKt.hoverable$default(Modifier.INSTANCE.then(modifierM168backgroundbw27NRU), interactionSource, false, i12, obj), composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(CustomSliderThumb, f, interactionSource, colors, z, f2, f3, isPress, function3, i, i2));
                }
                i3 |= 100663296;
                function2 = function1;
                i8 = i3;
                if ((191693531 & i8) == 38338706) {
                    if (i6 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-312818245, i8, -1, "com.code.android.uikit.slider.CustomSliderThumb (CustomSliderThumb.kt:29)");
                    }
                    Modifier modifierM480paddingqDBjuR0$default6 = PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null);
                    Alignment.Companion companion11 = Alignment.INSTANCE;
                    Modifier modifierAlign6 = CustomSliderThumb.align(modifierM480paddingqDBjuR0$default6, companion11.getCenterStart());
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o6 = OooOOO.OooO00o(companion11, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                    constructor = companion12.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierAlign6);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = OooO.OooO00o(companion12, composerM1309constructorimpl, measurePolicyOooO00o6, composerM1309constructorimpl, currentCompositionLocalMap6);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf6, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateListOf();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    snapshotStateList = (SnapshotStateList) objRememberedValue;
                    i10 = 0;
                    objArr = new Object[]{interactionSource, isPress, snapshotStateList, function3};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged = false;
                    while (i10 < i9) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i10]);
                        i10++;
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        i11 = 4;
                        obj = null;
                    } else {
                        objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        i11 = 4;
                        obj = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, ((i8 >> 6) & 14) | 64);
                    if (isPress.getValue().booleanValue()) {
                        Modifier modifierScale6 = ScaleKt.scale(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, f2), f3 / f2);
                        int i19 = o0oO0O0o.f47152o00OOOo;
                        modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(modifierScale6, o0oO0O0o.f46946OooO0O0, RoundedCornerShapeKt.getCircleShape());
                        i12 = 2;
                    } else {
                        modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(SizeKt.m525sizeVpY3zN4(OffsetKt.m437offsetVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f2 / i11), 0.0f, 2, obj), Dp.m3765constructorimpl(f2 / 2), f2), ColorKt.Color(4285392127L), RoundedCornerShapeKt.getCircleShape());
                        i12 = 2;
                    }
                    SpacerKt.Spacer(HoverableKt.hoverable$default(Modifier.INSTANCE.then(modifierM168backgroundbw27NRU), interactionSource, false, i12, obj), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    if (i6 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-312818245, i8, -1, "com.code.android.uikit.slider.CustomSliderThumb (CustomSliderThumb.kt:29)");
                    }
                    Modifier modifierM480paddingqDBjuR0$default7 = PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null);
                    Alignment.Companion companion13 = Alignment.INSTANCE;
                    Modifier modifierAlign7 = CustomSliderThumb.align(modifierM480paddingqDBjuR0$default7, companion13.getCenterStart());
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o7 = OooOOO.OooO00o(companion13, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                    constructor = companion14.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierAlign7);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = OooO.OooO00o(companion14, composerM1309constructorimpl, measurePolicyOooO00o7, composerM1309constructorimpl, currentCompositionLocalMap7);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf7, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateListOf();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    snapshotStateList = (SnapshotStateList) objRememberedValue;
                    i10 = 0;
                    objArr = new Object[]{interactionSource, isPress, snapshotStateList, function3};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged = false;
                    while (i10 < i9) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i10]);
                        i10++;
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        i11 = 4;
                        obj = null;
                    } else {
                        objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        i11 = 4;
                        obj = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, ((i8 >> 6) & 14) | 64);
                    if (isPress.getValue().booleanValue()) {
                        Modifier modifierScale7 = ScaleKt.scale(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, f2), f3 / f2);
                        int i110 = o0oO0O0o.f47152o00OOOo;
                        modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(modifierScale7, o0oO0O0o.f46946OooO0O0, RoundedCornerShapeKt.getCircleShape());
                        i12 = 2;
                    } else {
                        modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(SizeKt.m525sizeVpY3zN4(OffsetKt.m437offsetVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f2 / i11), 0.0f, 2, obj), Dp.m3765constructorimpl(f2 / 2), f2), ColorKt.Color(4285392127L), RoundedCornerShapeKt.getCircleShape());
                        i12 = 2;
                    }
                    SpacerKt.Spacer(HoverableKt.hoverable$default(Modifier.INSTANCE.then(modifierM168backgroundbw27NRU), interactionSource, false, i12, obj), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(CustomSliderThumb, f, interactionSource, colors, z, f2, f3, isPress, function3, i, i2));
            }
            i4 = 1572864;
            i3 |= i4;
            if ((i2 & 64) != 0) {
                if ((29360128 & i) == 0) {
                    if (composerStartRestartGroup.changed(isPress)) {
                        i5 = 8388608;
                    } else {
                        i5 = Configuration.BLOCK_SIZE;
                    }
                }
                i6 = i2 & 128;
                if (i6 != 0) {
                    if ((234881024 & i) == 0) {
                        function2 = function1;
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i7 = 67108864;
                        } else {
                            i7 = 33554432;
                        }
                        i3 |= i7;
                    }
                    i8 = i3;
                    if ((191693531 & i8) == 38338706) {
                        if (i6 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-312818245, i8, -1, "com.code.android.uikit.slider.CustomSliderThumb (CustomSliderThumb.kt:29)");
                        }
                        Modifier modifierM480paddingqDBjuR0$default8 = PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null);
                        Alignment.Companion companion15 = Alignment.INSTANCE;
                        Modifier modifierAlign8 = CustomSliderThumb.align(modifierM480paddingqDBjuR0$default8, companion15.getCenterStart());
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyOooO00o8 = OooOOO.OooO00o(companion15, false, composerStartRestartGroup, 0, -1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion16 = ComposeUiNode.INSTANCE;
                        constructor = companion16.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierAlign8);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o = OooO.OooO00o(companion16, composerM1309constructorimpl, measurePolicyOooO00o8, composerM1309constructorimpl, currentCompositionLocalMap8);
                        if (composerM1309constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf8, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = SnapshotStateKt.mutableStateListOf();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        snapshotStateList = (SnapshotStateList) objRememberedValue;
                        i10 = 0;
                        objArr = new Object[]{interactionSource, isPress, snapshotStateList, function3};
                        composerStartRestartGroup.startReplaceableGroup(-568225417);
                        zChanged = false;
                        while (i10 < i9) {
                            zChanged |= composerStartRestartGroup.changed(objArr[i10]);
                            i10++;
                        }
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            i11 = 4;
                            obj = null;
                        } else {
                            objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            i11 = 4;
                            obj = null;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, ((i8 >> 6) & 14) | 64);
                        if (isPress.getValue().booleanValue()) {
                            Modifier modifierScale8 = ScaleKt.scale(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, f2), f3 / f2);
                            int i111 = o0oO0O0o.f47152o00OOOo;
                            modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(modifierScale8, o0oO0O0o.f46946OooO0O0, RoundedCornerShapeKt.getCircleShape());
                            i12 = 2;
                        } else {
                            modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(SizeKt.m525sizeVpY3zN4(OffsetKt.m437offsetVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f2 / i11), 0.0f, 2, obj), Dp.m3765constructorimpl(f2 / 2), f2), ColorKt.Color(4285392127L), RoundedCornerShapeKt.getCircleShape());
                            i12 = 2;
                        }
                        SpacerKt.Spacer(HoverableKt.hoverable$default(Modifier.INSTANCE.then(modifierM168backgroundbw27NRU), interactionSource, false, i12, obj), composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        if (i6 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-312818245, i8, -1, "com.code.android.uikit.slider.CustomSliderThumb (CustomSliderThumb.kt:29)");
                        }
                        Modifier modifierM480paddingqDBjuR0$default9 = PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null);
                        Alignment.Companion companion17 = Alignment.INSTANCE;
                        Modifier modifierAlign9 = CustomSliderThumb.align(modifierM480paddingqDBjuR0$default9, companion17.getCenterStart());
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyOooO00o9 = OooOOO.OooO00o(companion17, false, composerStartRestartGroup, 0, -1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion18 = ComposeUiNode.INSTANCE;
                        constructor = companion18.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierAlign9);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o = OooO.OooO00o(companion18, composerM1309constructorimpl, measurePolicyOooO00o9, composerM1309constructorimpl, currentCompositionLocalMap9);
                        if (composerM1309constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf9, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance9 = BoxScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = SnapshotStateKt.mutableStateListOf();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        snapshotStateList = (SnapshotStateList) objRememberedValue;
                        i10 = 0;
                        objArr = new Object[]{interactionSource, isPress, snapshotStateList, function3};
                        composerStartRestartGroup.startReplaceableGroup(-568225417);
                        zChanged = false;
                        while (i10 < i9) {
                            zChanged |= composerStartRestartGroup.changed(objArr[i10]);
                            i10++;
                        }
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            i11 = 4;
                            obj = null;
                        } else {
                            objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            i11 = 4;
                            obj = null;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, ((i8 >> 6) & 14) | 64);
                        if (isPress.getValue().booleanValue()) {
                            Modifier modifierScale9 = ScaleKt.scale(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, f2), f3 / f2);
                            int i112 = o0oO0O0o.f47152o00OOOo;
                            modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(modifierScale9, o0oO0O0o.f46946OooO0O0, RoundedCornerShapeKt.getCircleShape());
                            i12 = 2;
                        } else {
                            modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(SizeKt.m525sizeVpY3zN4(OffsetKt.m437offsetVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f2 / i11), 0.0f, 2, obj), Dp.m3765constructorimpl(f2 / 2), f2), ColorKt.Color(4285392127L), RoundedCornerShapeKt.getCircleShape());
                            i12 = 2;
                        }
                        SpacerKt.Spacer(HoverableKt.hoverable$default(Modifier.INSTANCE.then(modifierM168backgroundbw27NRU), interactionSource, false, i12, obj), composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(CustomSliderThumb, f, interactionSource, colors, z, f2, f3, isPress, function3, i, i2));
                }
                i3 |= 100663296;
                function2 = function1;
                i8 = i3;
                if ((191693531 & i8) == 38338706) {
                    if (i6 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-312818245, i8, -1, "com.code.android.uikit.slider.CustomSliderThumb (CustomSliderThumb.kt:29)");
                    }
                    Modifier modifierM480paddingqDBjuR0$default10 = PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null);
                    Alignment.Companion companion19 = Alignment.INSTANCE;
                    Modifier modifierAlign10 = CustomSliderThumb.align(modifierM480paddingqDBjuR0$default10, companion19.getCenterStart());
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o10 = OooOOO.OooO00o(companion19, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion110 = ComposeUiNode.INSTANCE;
                    constructor = companion110.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(modifierAlign10);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = OooO.OooO00o(companion110, composerM1309constructorimpl, measurePolicyOooO00o10, composerM1309constructorimpl, currentCompositionLocalMap10);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf10, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance10 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateListOf();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    snapshotStateList = (SnapshotStateList) objRememberedValue;
                    i10 = 0;
                    objArr = new Object[]{interactionSource, isPress, snapshotStateList, function3};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged = false;
                    while (i10 < i9) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i10]);
                        i10++;
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        i11 = 4;
                        obj = null;
                    } else {
                        objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        i11 = 4;
                        obj = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, ((i8 >> 6) & 14) | 64);
                    if (isPress.getValue().booleanValue()) {
                        Modifier modifierScale10 = ScaleKt.scale(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, f2), f3 / f2);
                        int i113 = o0oO0O0o.f47152o00OOOo;
                        modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(modifierScale10, o0oO0O0o.f46946OooO0O0, RoundedCornerShapeKt.getCircleShape());
                        i12 = 2;
                    } else {
                        modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(SizeKt.m525sizeVpY3zN4(OffsetKt.m437offsetVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f2 / i11), 0.0f, 2, obj), Dp.m3765constructorimpl(f2 / 2), f2), ColorKt.Color(4285392127L), RoundedCornerShapeKt.getCircleShape());
                        i12 = 2;
                    }
                    SpacerKt.Spacer(HoverableKt.hoverable$default(Modifier.INSTANCE.then(modifierM168backgroundbw27NRU), interactionSource, false, i12, obj), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    if (i6 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-312818245, i8, -1, "com.code.android.uikit.slider.CustomSliderThumb (CustomSliderThumb.kt:29)");
                    }
                    Modifier modifierM480paddingqDBjuR0$default11 = PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null);
                    Alignment.Companion companion111 = Alignment.INSTANCE;
                    Modifier modifierAlign11 = CustomSliderThumb.align(modifierM480paddingqDBjuR0$default11, companion111.getCenterStart());
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o11 = OooOOO.OooO00o(companion111, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion112 = ComposeUiNode.INSTANCE;
                    constructor = companion112.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11 = LayoutKt.modifierMaterializerOf(modifierAlign11);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = OooO.OooO00o(companion112, composerM1309constructorimpl, measurePolicyOooO00o11, composerM1309constructorimpl, currentCompositionLocalMap11);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance11 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateListOf();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    snapshotStateList = (SnapshotStateList) objRememberedValue;
                    i10 = 0;
                    objArr = new Object[]{interactionSource, isPress, snapshotStateList, function3};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged = false;
                    while (i10 < i9) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i10]);
                        i10++;
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        i11 = 4;
                        obj = null;
                    } else {
                        objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        i11 = 4;
                        obj = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, ((i8 >> 6) & 14) | 64);
                    if (isPress.getValue().booleanValue()) {
                        Modifier modifierScale11 = ScaleKt.scale(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, f2), f3 / f2);
                        int i114 = o0oO0O0o.f47152o00OOOo;
                        modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(modifierScale11, o0oO0O0o.f46946OooO0O0, RoundedCornerShapeKt.getCircleShape());
                        i12 = 2;
                    } else {
                        modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(SizeKt.m525sizeVpY3zN4(OffsetKt.m437offsetVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f2 / i11), 0.0f, 2, obj), Dp.m3765constructorimpl(f2 / 2), f2), ColorKt.Color(4285392127L), RoundedCornerShapeKt.getCircleShape());
                        i12 = 2;
                    }
                    SpacerKt.Spacer(HoverableKt.hoverable$default(Modifier.INSTANCE.then(modifierM168backgroundbw27NRU), interactionSource, false, i12, obj), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(CustomSliderThumb, f, interactionSource, colors, z, f2, f3, isPress, function3, i, i2));
            }
            i5 = 12582912;
            i3 |= i5;
            i6 = i2 & 128;
            if (i6 != 0) {
                if ((234881024 & i) == 0) {
                    function2 = function1;
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i7 = 67108864;
                    } else {
                        i7 = 33554432;
                    }
                    i3 |= i7;
                }
                i8 = i3;
                if ((191693531 & i8) == 38338706) {
                    if (i6 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-312818245, i8, -1, "com.code.android.uikit.slider.CustomSliderThumb (CustomSliderThumb.kt:29)");
                    }
                    Modifier modifierM480paddingqDBjuR0$default12 = PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null);
                    Alignment.Companion companion113 = Alignment.INSTANCE;
                    Modifier modifierAlign12 = CustomSliderThumb.align(modifierM480paddingqDBjuR0$default12, companion113.getCenterStart());
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o12 = OooOOO.OooO00o(companion113, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap12 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion114 = ComposeUiNode.INSTANCE;
                    constructor = companion114.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf12 = LayoutKt.modifierMaterializerOf(modifierAlign12);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = OooO.OooO00o(companion114, composerM1309constructorimpl, measurePolicyOooO00o12, composerM1309constructorimpl, currentCompositionLocalMap12);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf12, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance12 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateListOf();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    snapshotStateList = (SnapshotStateList) objRememberedValue;
                    i10 = 0;
                    objArr = new Object[]{interactionSource, isPress, snapshotStateList, function3};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged = false;
                    while (i10 < i9) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i10]);
                        i10++;
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        i11 = 4;
                        obj = null;
                    } else {
                        objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        i11 = 4;
                        obj = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, ((i8 >> 6) & 14) | 64);
                    if (isPress.getValue().booleanValue()) {
                        Modifier modifierScale12 = ScaleKt.scale(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, f2), f3 / f2);
                        int i115 = o0oO0O0o.f47152o00OOOo;
                        modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(modifierScale12, o0oO0O0o.f46946OooO0O0, RoundedCornerShapeKt.getCircleShape());
                        i12 = 2;
                    } else {
                        modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(SizeKt.m525sizeVpY3zN4(OffsetKt.m437offsetVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f2 / i11), 0.0f, 2, obj), Dp.m3765constructorimpl(f2 / 2), f2), ColorKt.Color(4285392127L), RoundedCornerShapeKt.getCircleShape());
                        i12 = 2;
                    }
                    SpacerKt.Spacer(HoverableKt.hoverable$default(Modifier.INSTANCE.then(modifierM168backgroundbw27NRU), interactionSource, false, i12, obj), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    if (i6 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-312818245, i8, -1, "com.code.android.uikit.slider.CustomSliderThumb (CustomSliderThumb.kt:29)");
                    }
                    Modifier modifierM480paddingqDBjuR0$default13 = PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null);
                    Alignment.Companion companion115 = Alignment.INSTANCE;
                    Modifier modifierAlign13 = CustomSliderThumb.align(modifierM480paddingqDBjuR0$default13, companion115.getCenterStart());
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o13 = OooOOO.OooO00o(companion115, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap13 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion116 = ComposeUiNode.INSTANCE;
                    constructor = companion116.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf13 = LayoutKt.modifierMaterializerOf(modifierAlign13);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = OooO.OooO00o(companion116, composerM1309constructorimpl, measurePolicyOooO00o13, composerM1309constructorimpl, currentCompositionLocalMap13);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf13, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance13 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateListOf();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    snapshotStateList = (SnapshotStateList) objRememberedValue;
                    i10 = 0;
                    objArr = new Object[]{interactionSource, isPress, snapshotStateList, function3};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged = false;
                    while (i10 < i9) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i10]);
                        i10++;
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        i11 = 4;
                        obj = null;
                    } else {
                        objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        i11 = 4;
                        obj = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, ((i8 >> 6) & 14) | 64);
                    if (isPress.getValue().booleanValue()) {
                        Modifier modifierScale13 = ScaleKt.scale(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, f2), f3 / f2);
                        int i116 = o0oO0O0o.f47152o00OOOo;
                        modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(modifierScale13, o0oO0O0o.f46946OooO0O0, RoundedCornerShapeKt.getCircleShape());
                        i12 = 2;
                    } else {
                        modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(SizeKt.m525sizeVpY3zN4(OffsetKt.m437offsetVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f2 / i11), 0.0f, 2, obj), Dp.m3765constructorimpl(f2 / 2), f2), ColorKt.Color(4285392127L), RoundedCornerShapeKt.getCircleShape());
                        i12 = 2;
                    }
                    SpacerKt.Spacer(HoverableKt.hoverable$default(Modifier.INSTANCE.then(modifierM168backgroundbw27NRU), interactionSource, false, i12, obj), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(CustomSliderThumb, f, interactionSource, colors, z, f2, f3, isPress, function3, i, i2));
            }
            i3 |= 100663296;
            function2 = function1;
            i8 = i3;
            if ((191693531 & i8) == 38338706) {
                if (i6 != 0) {
                    function3 = null;
                } else {
                    function3 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-312818245, i8, -1, "com.code.android.uikit.slider.CustomSliderThumb (CustomSliderThumb.kt:29)");
                }
                Modifier modifierM480paddingqDBjuR0$default14 = PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null);
                Alignment.Companion companion117 = Alignment.INSTANCE;
                Modifier modifierAlign14 = CustomSliderThumb.align(modifierM480paddingqDBjuR0$default14, companion117.getCenterStart());
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o14 = OooOOO.OooO00o(companion117, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap14 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion118 = ComposeUiNode.INSTANCE;
                constructor = companion118.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf14 = LayoutKt.modifierMaterializerOf(modifierAlign14);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = OooO.OooO00o(companion118, composerM1309constructorimpl, measurePolicyOooO00o14, composerM1309constructorimpl, currentCompositionLocalMap14);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf14, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance14 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateListOf();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                snapshotStateList = (SnapshotStateList) objRememberedValue;
                i10 = 0;
                objArr = new Object[]{interactionSource, isPress, snapshotStateList, function3};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged = false;
                while (i10 < i9) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i10]);
                    i10++;
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    i11 = 4;
                    obj = null;
                } else {
                    objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    i11 = 4;
                    obj = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, ((i8 >> 6) & 14) | 64);
                if (isPress.getValue().booleanValue()) {
                    Modifier modifierScale14 = ScaleKt.scale(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, f2), f3 / f2);
                    int i117 = o0oO0O0o.f47152o00OOOo;
                    modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(modifierScale14, o0oO0O0o.f46946OooO0O0, RoundedCornerShapeKt.getCircleShape());
                    i12 = 2;
                } else {
                    modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(SizeKt.m525sizeVpY3zN4(OffsetKt.m437offsetVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f2 / i11), 0.0f, 2, obj), Dp.m3765constructorimpl(f2 / 2), f2), ColorKt.Color(4285392127L), RoundedCornerShapeKt.getCircleShape());
                    i12 = 2;
                }
                SpacerKt.Spacer(HoverableKt.hoverable$default(Modifier.INSTANCE.then(modifierM168backgroundbw27NRU), interactionSource, false, i12, obj), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                if (i6 != 0) {
                    function3 = null;
                } else {
                    function3 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-312818245, i8, -1, "com.code.android.uikit.slider.CustomSliderThumb (CustomSliderThumb.kt:29)");
                }
                Modifier modifierM480paddingqDBjuR0$default15 = PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null);
                Alignment.Companion companion119 = Alignment.INSTANCE;
                Modifier modifierAlign15 = CustomSliderThumb.align(modifierM480paddingqDBjuR0$default15, companion119.getCenterStart());
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o15 = OooOOO.OooO00o(companion119, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap15 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion1110 = ComposeUiNode.INSTANCE;
                constructor = companion1110.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf15 = LayoutKt.modifierMaterializerOf(modifierAlign15);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = OooO.OooO00o(companion1110, composerM1309constructorimpl, measurePolicyOooO00o15, composerM1309constructorimpl, currentCompositionLocalMap15);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf15, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance15 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateListOf();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                snapshotStateList = (SnapshotStateList) objRememberedValue;
                i10 = 0;
                objArr = new Object[]{interactionSource, isPress, snapshotStateList, function3};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged = false;
                while (i10 < i9) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i10]);
                    i10++;
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    i11 = 4;
                    obj = null;
                } else {
                    objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    i11 = 4;
                    obj = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, ((i8 >> 6) & 14) | 64);
                if (isPress.getValue().booleanValue()) {
                    Modifier modifierScale15 = ScaleKt.scale(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, f2), f3 / f2);
                    int i118 = o0oO0O0o.f47152o00OOOo;
                    modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(modifierScale15, o0oO0O0o.f46946OooO0O0, RoundedCornerShapeKt.getCircleShape());
                    i12 = 2;
                } else {
                    modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(SizeKt.m525sizeVpY3zN4(OffsetKt.m437offsetVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f2 / i11), 0.0f, 2, obj), Dp.m3765constructorimpl(f2 / 2), f2), ColorKt.Color(4285392127L), RoundedCornerShapeKt.getCircleShape());
                    i12 = 2;
                }
                SpacerKt.Spacer(HoverableKt.hoverable$default(Modifier.INSTANCE.then(modifierM168backgroundbw27NRU), interactionSource, false, i12, obj), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(CustomSliderThumb, f, interactionSource, colors, z, f2, f3, isPress, function3, i, i2));
        }
        i3 |= i13;
        if ((i2 & 32) != 0) {
            if ((3670016 & i) == 0) {
                if (composerStartRestartGroup.changed(f3)) {
                    i4 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i4 = 524288;
                }
            }
            if ((i2 & 64) != 0) {
                if ((29360128 & i) == 0) {
                    if (composerStartRestartGroup.changed(isPress)) {
                        i5 = 8388608;
                    } else {
                        i5 = Configuration.BLOCK_SIZE;
                    }
                }
                i6 = i2 & 128;
                if (i6 != 0) {
                    if ((234881024 & i) == 0) {
                        function2 = function1;
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i7 = 67108864;
                        } else {
                            i7 = 33554432;
                        }
                        i3 |= i7;
                    }
                    i8 = i3;
                    if ((191693531 & i8) == 38338706) {
                        if (i6 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-312818245, i8, -1, "com.code.android.uikit.slider.CustomSliderThumb (CustomSliderThumb.kt:29)");
                        }
                        Modifier modifierM480paddingqDBjuR0$default16 = PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null);
                        Alignment.Companion companion1111 = Alignment.INSTANCE;
                        Modifier modifierAlign16 = CustomSliderThumb.align(modifierM480paddingqDBjuR0$default16, companion1111.getCenterStart());
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyOooO00o16 = OooOOO.OooO00o(companion1111, false, composerStartRestartGroup, 0, -1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap16 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion1112 = ComposeUiNode.INSTANCE;
                        constructor = companion1112.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf16 = LayoutKt.modifierMaterializerOf(modifierAlign16);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o = OooO.OooO00o(companion1112, composerM1309constructorimpl, measurePolicyOooO00o16, composerM1309constructorimpl, currentCompositionLocalMap16);
                        if (composerM1309constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf16, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance16 = BoxScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = SnapshotStateKt.mutableStateListOf();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        snapshotStateList = (SnapshotStateList) objRememberedValue;
                        i10 = 0;
                        objArr = new Object[]{interactionSource, isPress, snapshotStateList, function3};
                        composerStartRestartGroup.startReplaceableGroup(-568225417);
                        zChanged = false;
                        while (i10 < i9) {
                            zChanged |= composerStartRestartGroup.changed(objArr[i10]);
                            i10++;
                        }
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            i11 = 4;
                            obj = null;
                        } else {
                            objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            i11 = 4;
                            obj = null;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, ((i8 >> 6) & 14) | 64);
                        if (isPress.getValue().booleanValue()) {
                            Modifier modifierScale16 = ScaleKt.scale(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, f2), f3 / f2);
                            int i119 = o0oO0O0o.f47152o00OOOo;
                            modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(modifierScale16, o0oO0O0o.f46946OooO0O0, RoundedCornerShapeKt.getCircleShape());
                            i12 = 2;
                        } else {
                            modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(SizeKt.m525sizeVpY3zN4(OffsetKt.m437offsetVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f2 / i11), 0.0f, 2, obj), Dp.m3765constructorimpl(f2 / 2), f2), ColorKt.Color(4285392127L), RoundedCornerShapeKt.getCircleShape());
                            i12 = 2;
                        }
                        SpacerKt.Spacer(HoverableKt.hoverable$default(Modifier.INSTANCE.then(modifierM168backgroundbw27NRU), interactionSource, false, i12, obj), composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        if (i6 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-312818245, i8, -1, "com.code.android.uikit.slider.CustomSliderThumb (CustomSliderThumb.kt:29)");
                        }
                        Modifier modifierM480paddingqDBjuR0$default17 = PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null);
                        Alignment.Companion companion1113 = Alignment.INSTANCE;
                        Modifier modifierAlign17 = CustomSliderThumb.align(modifierM480paddingqDBjuR0$default17, companion1113.getCenterStart());
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyOooO00o17 = OooOOO.OooO00o(companion1113, false, composerStartRestartGroup, 0, -1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap17 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion1114 = ComposeUiNode.INSTANCE;
                        constructor = companion1114.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf17 = LayoutKt.modifierMaterializerOf(modifierAlign17);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o = OooO.OooO00o(companion1114, composerM1309constructorimpl, measurePolicyOooO00o17, composerM1309constructorimpl, currentCompositionLocalMap17);
                        if (composerM1309constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf17, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance17 = BoxScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = SnapshotStateKt.mutableStateListOf();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        snapshotStateList = (SnapshotStateList) objRememberedValue;
                        i10 = 0;
                        objArr = new Object[]{interactionSource, isPress, snapshotStateList, function3};
                        composerStartRestartGroup.startReplaceableGroup(-568225417);
                        zChanged = false;
                        while (i10 < i9) {
                            zChanged |= composerStartRestartGroup.changed(objArr[i10]);
                            i10++;
                        }
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            i11 = 4;
                            obj = null;
                        } else {
                            objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            i11 = 4;
                            obj = null;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, ((i8 >> 6) & 14) | 64);
                        if (isPress.getValue().booleanValue()) {
                            Modifier modifierScale17 = ScaleKt.scale(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, f2), f3 / f2);
                            int i1110 = o0oO0O0o.f47152o00OOOo;
                            modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(modifierScale17, o0oO0O0o.f46946OooO0O0, RoundedCornerShapeKt.getCircleShape());
                            i12 = 2;
                        } else {
                            modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(SizeKt.m525sizeVpY3zN4(OffsetKt.m437offsetVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f2 / i11), 0.0f, 2, obj), Dp.m3765constructorimpl(f2 / 2), f2), ColorKt.Color(4285392127L), RoundedCornerShapeKt.getCircleShape());
                            i12 = 2;
                        }
                        SpacerKt.Spacer(HoverableKt.hoverable$default(Modifier.INSTANCE.then(modifierM168backgroundbw27NRU), interactionSource, false, i12, obj), composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(CustomSliderThumb, f, interactionSource, colors, z, f2, f3, isPress, function3, i, i2));
                }
                i3 |= 100663296;
                function2 = function1;
                i8 = i3;
                if ((191693531 & i8) == 38338706) {
                    if (i6 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-312818245, i8, -1, "com.code.android.uikit.slider.CustomSliderThumb (CustomSliderThumb.kt:29)");
                    }
                    Modifier modifierM480paddingqDBjuR0$default18 = PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null);
                    Alignment.Companion companion1115 = Alignment.INSTANCE;
                    Modifier modifierAlign18 = CustomSliderThumb.align(modifierM480paddingqDBjuR0$default18, companion1115.getCenterStart());
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o18 = OooOOO.OooO00o(companion1115, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap18 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion1116 = ComposeUiNode.INSTANCE;
                    constructor = companion1116.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf18 = LayoutKt.modifierMaterializerOf(modifierAlign18);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = OooO.OooO00o(companion1116, composerM1309constructorimpl, measurePolicyOooO00o18, composerM1309constructorimpl, currentCompositionLocalMap18);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf18, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance18 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateListOf();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    snapshotStateList = (SnapshotStateList) objRememberedValue;
                    i10 = 0;
                    objArr = new Object[]{interactionSource, isPress, snapshotStateList, function3};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged = false;
                    while (i10 < i9) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i10]);
                        i10++;
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        i11 = 4;
                        obj = null;
                    } else {
                        objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        i11 = 4;
                        obj = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, ((i8 >> 6) & 14) | 64);
                    if (isPress.getValue().booleanValue()) {
                        Modifier modifierScale18 = ScaleKt.scale(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, f2), f3 / f2);
                        int i1111 = o0oO0O0o.f47152o00OOOo;
                        modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(modifierScale18, o0oO0O0o.f46946OooO0O0, RoundedCornerShapeKt.getCircleShape());
                        i12 = 2;
                    } else {
                        modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(SizeKt.m525sizeVpY3zN4(OffsetKt.m437offsetVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f2 / i11), 0.0f, 2, obj), Dp.m3765constructorimpl(f2 / 2), f2), ColorKt.Color(4285392127L), RoundedCornerShapeKt.getCircleShape());
                        i12 = 2;
                    }
                    SpacerKt.Spacer(HoverableKt.hoverable$default(Modifier.INSTANCE.then(modifierM168backgroundbw27NRU), interactionSource, false, i12, obj), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    if (i6 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-312818245, i8, -1, "com.code.android.uikit.slider.CustomSliderThumb (CustomSliderThumb.kt:29)");
                    }
                    Modifier modifierM480paddingqDBjuR0$default19 = PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null);
                    Alignment.Companion companion1117 = Alignment.INSTANCE;
                    Modifier modifierAlign19 = CustomSliderThumb.align(modifierM480paddingqDBjuR0$default19, companion1117.getCenterStart());
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o19 = OooOOO.OooO00o(companion1117, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap19 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion1118 = ComposeUiNode.INSTANCE;
                    constructor = companion1118.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf19 = LayoutKt.modifierMaterializerOf(modifierAlign19);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = OooO.OooO00o(companion1118, composerM1309constructorimpl, measurePolicyOooO00o19, composerM1309constructorimpl, currentCompositionLocalMap19);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf19, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance19 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateListOf();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    snapshotStateList = (SnapshotStateList) objRememberedValue;
                    i10 = 0;
                    objArr = new Object[]{interactionSource, isPress, snapshotStateList, function3};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged = false;
                    while (i10 < i9) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i10]);
                        i10++;
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        i11 = 4;
                        obj = null;
                    } else {
                        objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        i11 = 4;
                        obj = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, ((i8 >> 6) & 14) | 64);
                    if (isPress.getValue().booleanValue()) {
                        Modifier modifierScale19 = ScaleKt.scale(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, f2), f3 / f2);
                        int i1112 = o0oO0O0o.f47152o00OOOo;
                        modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(modifierScale19, o0oO0O0o.f46946OooO0O0, RoundedCornerShapeKt.getCircleShape());
                        i12 = 2;
                    } else {
                        modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(SizeKt.m525sizeVpY3zN4(OffsetKt.m437offsetVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f2 / i11), 0.0f, 2, obj), Dp.m3765constructorimpl(f2 / 2), f2), ColorKt.Color(4285392127L), RoundedCornerShapeKt.getCircleShape());
                        i12 = 2;
                    }
                    SpacerKt.Spacer(HoverableKt.hoverable$default(Modifier.INSTANCE.then(modifierM168backgroundbw27NRU), interactionSource, false, i12, obj), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(CustomSliderThumb, f, interactionSource, colors, z, f2, f3, isPress, function3, i, i2));
            }
            i5 = 12582912;
            i3 |= i5;
            i6 = i2 & 128;
            if (i6 != 0) {
                if ((234881024 & i) == 0) {
                    function2 = function1;
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i7 = 67108864;
                    } else {
                        i7 = 33554432;
                    }
                    i3 |= i7;
                }
                i8 = i3;
                if ((191693531 & i8) == 38338706) {
                    if (i6 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-312818245, i8, -1, "com.code.android.uikit.slider.CustomSliderThumb (CustomSliderThumb.kt:29)");
                    }
                    Modifier modifierM480paddingqDBjuR0$default110 = PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null);
                    Alignment.Companion companion1119 = Alignment.INSTANCE;
                    Modifier modifierAlign110 = CustomSliderThumb.align(modifierM480paddingqDBjuR0$default110, companion1119.getCenterStart());
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o110 = OooOOO.OooO00o(companion1119, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion11110 = ComposeUiNode.INSTANCE;
                    constructor = companion11110.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf110 = LayoutKt.modifierMaterializerOf(modifierAlign110);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = OooO.OooO00o(companion11110, composerM1309constructorimpl, measurePolicyOooO00o110, composerM1309constructorimpl, currentCompositionLocalMap110);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf110, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance110 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateListOf();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    snapshotStateList = (SnapshotStateList) objRememberedValue;
                    i10 = 0;
                    objArr = new Object[]{interactionSource, isPress, snapshotStateList, function3};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged = false;
                    while (i10 < i9) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i10]);
                        i10++;
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        i11 = 4;
                        obj = null;
                    } else {
                        objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        i11 = 4;
                        obj = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, ((i8 >> 6) & 14) | 64);
                    if (isPress.getValue().booleanValue()) {
                        Modifier modifierScale110 = ScaleKt.scale(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, f2), f3 / f2);
                        int i1113 = o0oO0O0o.f47152o00OOOo;
                        modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(modifierScale110, o0oO0O0o.f46946OooO0O0, RoundedCornerShapeKt.getCircleShape());
                        i12 = 2;
                    } else {
                        modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(SizeKt.m525sizeVpY3zN4(OffsetKt.m437offsetVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f2 / i11), 0.0f, 2, obj), Dp.m3765constructorimpl(f2 / 2), f2), ColorKt.Color(4285392127L), RoundedCornerShapeKt.getCircleShape());
                        i12 = 2;
                    }
                    SpacerKt.Spacer(HoverableKt.hoverable$default(Modifier.INSTANCE.then(modifierM168backgroundbw27NRU), interactionSource, false, i12, obj), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    if (i6 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-312818245, i8, -1, "com.code.android.uikit.slider.CustomSliderThumb (CustomSliderThumb.kt:29)");
                    }
                    Modifier modifierM480paddingqDBjuR0$default111 = PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null);
                    Alignment.Companion companion11111 = Alignment.INSTANCE;
                    Modifier modifierAlign111 = CustomSliderThumb.align(modifierM480paddingqDBjuR0$default111, companion11111.getCenterStart());
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o111 = OooOOO.OooO00o(companion11111, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion11112 = ComposeUiNode.INSTANCE;
                    constructor = companion11112.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111 = LayoutKt.modifierMaterializerOf(modifierAlign111);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = OooO.OooO00o(companion11112, composerM1309constructorimpl, measurePolicyOooO00o111, composerM1309constructorimpl, currentCompositionLocalMap111);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf111, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance111 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateListOf();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    snapshotStateList = (SnapshotStateList) objRememberedValue;
                    i10 = 0;
                    objArr = new Object[]{interactionSource, isPress, snapshotStateList, function3};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged = false;
                    while (i10 < i9) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i10]);
                        i10++;
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        i11 = 4;
                        obj = null;
                    } else {
                        objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        i11 = 4;
                        obj = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, ((i8 >> 6) & 14) | 64);
                    if (isPress.getValue().booleanValue()) {
                        Modifier modifierScale111 = ScaleKt.scale(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, f2), f3 / f2);
                        int i1114 = o0oO0O0o.f47152o00OOOo;
                        modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(modifierScale111, o0oO0O0o.f46946OooO0O0, RoundedCornerShapeKt.getCircleShape());
                        i12 = 2;
                    } else {
                        modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(SizeKt.m525sizeVpY3zN4(OffsetKt.m437offsetVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f2 / i11), 0.0f, 2, obj), Dp.m3765constructorimpl(f2 / 2), f2), ColorKt.Color(4285392127L), RoundedCornerShapeKt.getCircleShape());
                        i12 = 2;
                    }
                    SpacerKt.Spacer(HoverableKt.hoverable$default(Modifier.INSTANCE.then(modifierM168backgroundbw27NRU), interactionSource, false, i12, obj), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(CustomSliderThumb, f, interactionSource, colors, z, f2, f3, isPress, function3, i, i2));
            }
            i3 |= 100663296;
            function2 = function1;
            i8 = i3;
            if ((191693531 & i8) == 38338706) {
                if (i6 != 0) {
                    function3 = null;
                } else {
                    function3 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-312818245, i8, -1, "com.code.android.uikit.slider.CustomSliderThumb (CustomSliderThumb.kt:29)");
                }
                Modifier modifierM480paddingqDBjuR0$default112 = PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null);
                Alignment.Companion companion11113 = Alignment.INSTANCE;
                Modifier modifierAlign112 = CustomSliderThumb.align(modifierM480paddingqDBjuR0$default112, companion11113.getCenterStart());
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o112 = OooOOO.OooO00o(companion11113, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion11114 = ComposeUiNode.INSTANCE;
                constructor = companion11114.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf112 = LayoutKt.modifierMaterializerOf(modifierAlign112);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = OooO.OooO00o(companion11114, composerM1309constructorimpl, measurePolicyOooO00o112, composerM1309constructorimpl, currentCompositionLocalMap112);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf112, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance112 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateListOf();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                snapshotStateList = (SnapshotStateList) objRememberedValue;
                i10 = 0;
                objArr = new Object[]{interactionSource, isPress, snapshotStateList, function3};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged = false;
                while (i10 < i9) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i10]);
                    i10++;
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    i11 = 4;
                    obj = null;
                } else {
                    objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    i11 = 4;
                    obj = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, ((i8 >> 6) & 14) | 64);
                if (isPress.getValue().booleanValue()) {
                    Modifier modifierScale112 = ScaleKt.scale(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, f2), f3 / f2);
                    int i1115 = o0oO0O0o.f47152o00OOOo;
                    modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(modifierScale112, o0oO0O0o.f46946OooO0O0, RoundedCornerShapeKt.getCircleShape());
                    i12 = 2;
                } else {
                    modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(SizeKt.m525sizeVpY3zN4(OffsetKt.m437offsetVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f2 / i11), 0.0f, 2, obj), Dp.m3765constructorimpl(f2 / 2), f2), ColorKt.Color(4285392127L), RoundedCornerShapeKt.getCircleShape());
                    i12 = 2;
                }
                SpacerKt.Spacer(HoverableKt.hoverable$default(Modifier.INSTANCE.then(modifierM168backgroundbw27NRU), interactionSource, false, i12, obj), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                if (i6 != 0) {
                    function3 = null;
                } else {
                    function3 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-312818245, i8, -1, "com.code.android.uikit.slider.CustomSliderThumb (CustomSliderThumb.kt:29)");
                }
                Modifier modifierM480paddingqDBjuR0$default113 = PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null);
                Alignment.Companion companion11115 = Alignment.INSTANCE;
                Modifier modifierAlign113 = CustomSliderThumb.align(modifierM480paddingqDBjuR0$default113, companion11115.getCenterStart());
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o113 = OooOOO.OooO00o(companion11115, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion11116 = ComposeUiNode.INSTANCE;
                constructor = companion11116.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf113 = LayoutKt.modifierMaterializerOf(modifierAlign113);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = OooO.OooO00o(companion11116, composerM1309constructorimpl, measurePolicyOooO00o113, composerM1309constructorimpl, currentCompositionLocalMap113);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf113, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance113 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateListOf();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                snapshotStateList = (SnapshotStateList) objRememberedValue;
                i10 = 0;
                objArr = new Object[]{interactionSource, isPress, snapshotStateList, function3};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged = false;
                while (i10 < i9) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i10]);
                    i10++;
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    i11 = 4;
                    obj = null;
                } else {
                    objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    i11 = 4;
                    obj = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, ((i8 >> 6) & 14) | 64);
                if (isPress.getValue().booleanValue()) {
                    Modifier modifierScale113 = ScaleKt.scale(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, f2), f3 / f2);
                    int i1116 = o0oO0O0o.f47152o00OOOo;
                    modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(modifierScale113, o0oO0O0o.f46946OooO0O0, RoundedCornerShapeKt.getCircleShape());
                    i12 = 2;
                } else {
                    modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(SizeKt.m525sizeVpY3zN4(OffsetKt.m437offsetVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f2 / i11), 0.0f, 2, obj), Dp.m3765constructorimpl(f2 / 2), f2), ColorKt.Color(4285392127L), RoundedCornerShapeKt.getCircleShape());
                    i12 = 2;
                }
                SpacerKt.Spacer(HoverableKt.hoverable$default(Modifier.INSTANCE.then(modifierM168backgroundbw27NRU), interactionSource, false, i12, obj), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(CustomSliderThumb, f, interactionSource, colors, z, f2, f3, isPress, function3, i, i2));
        }
        i4 = 1572864;
        i3 |= i4;
        if ((i2 & 64) != 0) {
            if ((29360128 & i) == 0) {
                if (composerStartRestartGroup.changed(isPress)) {
                    i5 = 8388608;
                } else {
                    i5 = Configuration.BLOCK_SIZE;
                }
            }
            i6 = i2 & 128;
            if (i6 != 0) {
                if ((234881024 & i) == 0) {
                    function2 = function1;
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i7 = 67108864;
                    } else {
                        i7 = 33554432;
                    }
                    i3 |= i7;
                }
                i8 = i3;
                if ((191693531 & i8) == 38338706) {
                    if (i6 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-312818245, i8, -1, "com.code.android.uikit.slider.CustomSliderThumb (CustomSliderThumb.kt:29)");
                    }
                    Modifier modifierM480paddingqDBjuR0$default114 = PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null);
                    Alignment.Companion companion11117 = Alignment.INSTANCE;
                    Modifier modifierAlign114 = CustomSliderThumb.align(modifierM480paddingqDBjuR0$default114, companion11117.getCenterStart());
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o114 = OooOOO.OooO00o(companion11117, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion11118 = ComposeUiNode.INSTANCE;
                    constructor = companion11118.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf114 = LayoutKt.modifierMaterializerOf(modifierAlign114);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = OooO.OooO00o(companion11118, composerM1309constructorimpl, measurePolicyOooO00o114, composerM1309constructorimpl, currentCompositionLocalMap114);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf114, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance114 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateListOf();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    snapshotStateList = (SnapshotStateList) objRememberedValue;
                    i10 = 0;
                    objArr = new Object[]{interactionSource, isPress, snapshotStateList, function3};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged = false;
                    while (i10 < i9) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i10]);
                        i10++;
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        i11 = 4;
                        obj = null;
                    } else {
                        objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        i11 = 4;
                        obj = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, ((i8 >> 6) & 14) | 64);
                    if (isPress.getValue().booleanValue()) {
                        Modifier modifierScale114 = ScaleKt.scale(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, f2), f3 / f2);
                        int i1117 = o0oO0O0o.f47152o00OOOo;
                        modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(modifierScale114, o0oO0O0o.f46946OooO0O0, RoundedCornerShapeKt.getCircleShape());
                        i12 = 2;
                    } else {
                        modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(SizeKt.m525sizeVpY3zN4(OffsetKt.m437offsetVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f2 / i11), 0.0f, 2, obj), Dp.m3765constructorimpl(f2 / 2), f2), ColorKt.Color(4285392127L), RoundedCornerShapeKt.getCircleShape());
                        i12 = 2;
                    }
                    SpacerKt.Spacer(HoverableKt.hoverable$default(Modifier.INSTANCE.then(modifierM168backgroundbw27NRU), interactionSource, false, i12, obj), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    if (i6 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-312818245, i8, -1, "com.code.android.uikit.slider.CustomSliderThumb (CustomSliderThumb.kt:29)");
                    }
                    Modifier modifierM480paddingqDBjuR0$default115 = PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null);
                    Alignment.Companion companion11119 = Alignment.INSTANCE;
                    Modifier modifierAlign115 = CustomSliderThumb.align(modifierM480paddingqDBjuR0$default115, companion11119.getCenterStart());
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o115 = OooOOO.OooO00o(companion11119, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion111110 = ComposeUiNode.INSTANCE;
                    constructor = companion111110.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf115 = LayoutKt.modifierMaterializerOf(modifierAlign115);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = OooO.OooO00o(companion111110, composerM1309constructorimpl, measurePolicyOooO00o115, composerM1309constructorimpl, currentCompositionLocalMap115);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf115, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance115 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateListOf();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    snapshotStateList = (SnapshotStateList) objRememberedValue;
                    i10 = 0;
                    objArr = new Object[]{interactionSource, isPress, snapshotStateList, function3};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged = false;
                    while (i10 < i9) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i10]);
                        i10++;
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        i11 = 4;
                        obj = null;
                    } else {
                        objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        i11 = 4;
                        obj = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, ((i8 >> 6) & 14) | 64);
                    if (isPress.getValue().booleanValue()) {
                        Modifier modifierScale115 = ScaleKt.scale(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, f2), f3 / f2);
                        int i1118 = o0oO0O0o.f47152o00OOOo;
                        modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(modifierScale115, o0oO0O0o.f46946OooO0O0, RoundedCornerShapeKt.getCircleShape());
                        i12 = 2;
                    } else {
                        modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(SizeKt.m525sizeVpY3zN4(OffsetKt.m437offsetVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f2 / i11), 0.0f, 2, obj), Dp.m3765constructorimpl(f2 / 2), f2), ColorKt.Color(4285392127L), RoundedCornerShapeKt.getCircleShape());
                        i12 = 2;
                    }
                    SpacerKt.Spacer(HoverableKt.hoverable$default(Modifier.INSTANCE.then(modifierM168backgroundbw27NRU), interactionSource, false, i12, obj), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(CustomSliderThumb, f, interactionSource, colors, z, f2, f3, isPress, function3, i, i2));
            }
            i3 |= 100663296;
            function2 = function1;
            i8 = i3;
            if ((191693531 & i8) == 38338706) {
                if (i6 != 0) {
                    function3 = null;
                } else {
                    function3 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-312818245, i8, -1, "com.code.android.uikit.slider.CustomSliderThumb (CustomSliderThumb.kt:29)");
                }
                Modifier modifierM480paddingqDBjuR0$default116 = PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null);
                Alignment.Companion companion111111 = Alignment.INSTANCE;
                Modifier modifierAlign116 = CustomSliderThumb.align(modifierM480paddingqDBjuR0$default116, companion111111.getCenterStart());
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o116 = OooOOO.OooO00o(companion111111, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion111112 = ComposeUiNode.INSTANCE;
                constructor = companion111112.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf116 = LayoutKt.modifierMaterializerOf(modifierAlign116);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = OooO.OooO00o(companion111112, composerM1309constructorimpl, measurePolicyOooO00o116, composerM1309constructorimpl, currentCompositionLocalMap116);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf116, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance116 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateListOf();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                snapshotStateList = (SnapshotStateList) objRememberedValue;
                i10 = 0;
                objArr = new Object[]{interactionSource, isPress, snapshotStateList, function3};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged = false;
                while (i10 < i9) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i10]);
                    i10++;
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    i11 = 4;
                    obj = null;
                } else {
                    objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    i11 = 4;
                    obj = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, ((i8 >> 6) & 14) | 64);
                if (isPress.getValue().booleanValue()) {
                    Modifier modifierScale116 = ScaleKt.scale(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, f2), f3 / f2);
                    int i1119 = o0oO0O0o.f47152o00OOOo;
                    modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(modifierScale116, o0oO0O0o.f46946OooO0O0, RoundedCornerShapeKt.getCircleShape());
                    i12 = 2;
                } else {
                    modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(SizeKt.m525sizeVpY3zN4(OffsetKt.m437offsetVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f2 / i11), 0.0f, 2, obj), Dp.m3765constructorimpl(f2 / 2), f2), ColorKt.Color(4285392127L), RoundedCornerShapeKt.getCircleShape());
                    i12 = 2;
                }
                SpacerKt.Spacer(HoverableKt.hoverable$default(Modifier.INSTANCE.then(modifierM168backgroundbw27NRU), interactionSource, false, i12, obj), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                if (i6 != 0) {
                    function3 = null;
                } else {
                    function3 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-312818245, i8, -1, "com.code.android.uikit.slider.CustomSliderThumb (CustomSliderThumb.kt:29)");
                }
                Modifier modifierM480paddingqDBjuR0$default117 = PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null);
                Alignment.Companion companion111113 = Alignment.INSTANCE;
                Modifier modifierAlign117 = CustomSliderThumb.align(modifierM480paddingqDBjuR0$default117, companion111113.getCenterStart());
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o117 = OooOOO.OooO00o(companion111113, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion111114 = ComposeUiNode.INSTANCE;
                constructor = companion111114.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf117 = LayoutKt.modifierMaterializerOf(modifierAlign117);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = OooO.OooO00o(companion111114, composerM1309constructorimpl, measurePolicyOooO00o117, composerM1309constructorimpl, currentCompositionLocalMap117);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf117, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance117 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateListOf();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                snapshotStateList = (SnapshotStateList) objRememberedValue;
                i10 = 0;
                objArr = new Object[]{interactionSource, isPress, snapshotStateList, function3};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged = false;
                while (i10 < i9) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i10]);
                    i10++;
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    i11 = 4;
                    obj = null;
                } else {
                    objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    i11 = 4;
                    obj = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, ((i8 >> 6) & 14) | 64);
                if (isPress.getValue().booleanValue()) {
                    Modifier modifierScale117 = ScaleKt.scale(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, f2), f3 / f2);
                    int i11110 = o0oO0O0o.f47152o00OOOo;
                    modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(modifierScale117, o0oO0O0o.f46946OooO0O0, RoundedCornerShapeKt.getCircleShape());
                    i12 = 2;
                } else {
                    modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(SizeKt.m525sizeVpY3zN4(OffsetKt.m437offsetVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f2 / i11), 0.0f, 2, obj), Dp.m3765constructorimpl(f2 / 2), f2), ColorKt.Color(4285392127L), RoundedCornerShapeKt.getCircleShape());
                    i12 = 2;
                }
                SpacerKt.Spacer(HoverableKt.hoverable$default(Modifier.INSTANCE.then(modifierM168backgroundbw27NRU), interactionSource, false, i12, obj), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(CustomSliderThumb, f, interactionSource, colors, z, f2, f3, isPress, function3, i, i2));
        }
        i5 = 12582912;
        i3 |= i5;
        i6 = i2 & 128;
        if (i6 != 0) {
            if ((234881024 & i) == 0) {
                function2 = function1;
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i7 = 67108864;
                } else {
                    i7 = 33554432;
                }
                i3 |= i7;
            }
            i8 = i3;
            if ((191693531 & i8) == 38338706) {
                if (i6 != 0) {
                    function3 = null;
                } else {
                    function3 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-312818245, i8, -1, "com.code.android.uikit.slider.CustomSliderThumb (CustomSliderThumb.kt:29)");
                }
                Modifier modifierM480paddingqDBjuR0$default118 = PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null);
                Alignment.Companion companion111115 = Alignment.INSTANCE;
                Modifier modifierAlign118 = CustomSliderThumb.align(modifierM480paddingqDBjuR0$default118, companion111115.getCenterStart());
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o118 = OooOOO.OooO00o(companion111115, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion111116 = ComposeUiNode.INSTANCE;
                constructor = companion111116.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf118 = LayoutKt.modifierMaterializerOf(modifierAlign118);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = OooO.OooO00o(companion111116, composerM1309constructorimpl, measurePolicyOooO00o118, composerM1309constructorimpl, currentCompositionLocalMap118);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf118, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance118 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateListOf();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                snapshotStateList = (SnapshotStateList) objRememberedValue;
                i10 = 0;
                objArr = new Object[]{interactionSource, isPress, snapshotStateList, function3};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged = false;
                while (i10 < i9) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i10]);
                    i10++;
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    i11 = 4;
                    obj = null;
                } else {
                    objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    i11 = 4;
                    obj = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, ((i8 >> 6) & 14) | 64);
                if (isPress.getValue().booleanValue()) {
                    Modifier modifierScale118 = ScaleKt.scale(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, f2), f3 / f2);
                    int i11111 = o0oO0O0o.f47152o00OOOo;
                    modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(modifierScale118, o0oO0O0o.f46946OooO0O0, RoundedCornerShapeKt.getCircleShape());
                    i12 = 2;
                } else {
                    modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(SizeKt.m525sizeVpY3zN4(OffsetKt.m437offsetVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f2 / i11), 0.0f, 2, obj), Dp.m3765constructorimpl(f2 / 2), f2), ColorKt.Color(4285392127L), RoundedCornerShapeKt.getCircleShape());
                    i12 = 2;
                }
                SpacerKt.Spacer(HoverableKt.hoverable$default(Modifier.INSTANCE.then(modifierM168backgroundbw27NRU), interactionSource, false, i12, obj), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                if (i6 != 0) {
                    function3 = null;
                } else {
                    function3 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-312818245, i8, -1, "com.code.android.uikit.slider.CustomSliderThumb (CustomSliderThumb.kt:29)");
                }
                Modifier modifierM480paddingqDBjuR0$default119 = PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null);
                Alignment.Companion companion111117 = Alignment.INSTANCE;
                Modifier modifierAlign119 = CustomSliderThumb.align(modifierM480paddingqDBjuR0$default119, companion111117.getCenterStart());
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o119 = OooOOO.OooO00o(companion111117, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion111118 = ComposeUiNode.INSTANCE;
                constructor = companion111118.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf119 = LayoutKt.modifierMaterializerOf(modifierAlign119);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = OooO.OooO00o(companion111118, composerM1309constructorimpl, measurePolicyOooO00o119, composerM1309constructorimpl, currentCompositionLocalMap119);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf119, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance119 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateListOf();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                snapshotStateList = (SnapshotStateList) objRememberedValue;
                i10 = 0;
                objArr = new Object[]{interactionSource, isPress, snapshotStateList, function3};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged = false;
                while (i10 < i9) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i10]);
                    i10++;
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    i11 = 4;
                    obj = null;
                } else {
                    objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    i11 = 4;
                    obj = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, ((i8 >> 6) & 14) | 64);
                if (isPress.getValue().booleanValue()) {
                    Modifier modifierScale119 = ScaleKt.scale(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, f2), f3 / f2);
                    int i11112 = o0oO0O0o.f47152o00OOOo;
                    modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(modifierScale119, o0oO0O0o.f46946OooO0O0, RoundedCornerShapeKt.getCircleShape());
                    i12 = 2;
                } else {
                    modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(SizeKt.m525sizeVpY3zN4(OffsetKt.m437offsetVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f2 / i11), 0.0f, 2, obj), Dp.m3765constructorimpl(f2 / 2), f2), ColorKt.Color(4285392127L), RoundedCornerShapeKt.getCircleShape());
                    i12 = 2;
                }
                SpacerKt.Spacer(HoverableKt.hoverable$default(Modifier.INSTANCE.then(modifierM168backgroundbw27NRU), interactionSource, false, i12, obj), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(CustomSliderThumb, f, interactionSource, colors, z, f2, f3, isPress, function3, i, i2));
        }
        i3 |= 100663296;
        function2 = function1;
        i8 = i3;
        if ((191693531 & i8) == 38338706) {
            if (i6 != 0) {
                function3 = null;
            } else {
                function3 = function2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-312818245, i8, -1, "com.code.android.uikit.slider.CustomSliderThumb (CustomSliderThumb.kt:29)");
            }
            Modifier modifierM480paddingqDBjuR0$default1110 = PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null);
            Alignment.Companion companion111119 = Alignment.INSTANCE;
            Modifier modifierAlign1110 = CustomSliderThumb.align(modifierM480paddingqDBjuR0$default1110, companion111119.getCenterStart());
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o1110 = OooOOO.OooO00o(companion111119, false, composerStartRestartGroup, 0, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap1110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion1111110 = ComposeUiNode.INSTANCE;
            constructor = companion1111110.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1110 = LayoutKt.modifierMaterializerOf(modifierAlign1110);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            function2OooO00o = OooO.OooO00o(companion1111110, composerM1309constructorimpl, measurePolicyOooO00o1110, composerM1309constructorimpl, currentCompositionLocalMap1110);
            if (composerM1309constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1110, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance1110 = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            snapshotStateList = (SnapshotStateList) objRememberedValue;
            i10 = 0;
            objArr = new Object[]{interactionSource, isPress, snapshotStateList, function3};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            zChanged = false;
            while (i10 < i9) {
                zChanged |= composerStartRestartGroup.changed(objArr[i10]);
                i10++;
            }
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                i11 = 4;
                obj = null;
            } else {
                objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                i11 = 4;
                obj = null;
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, ((i8 >> 6) & 14) | 64);
            if (isPress.getValue().booleanValue()) {
                Modifier modifierScale1110 = ScaleKt.scale(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, f2), f3 / f2);
                int i11113 = o0oO0O0o.f47152o00OOOo;
                modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(modifierScale1110, o0oO0O0o.f46946OooO0O0, RoundedCornerShapeKt.getCircleShape());
                i12 = 2;
            } else {
                modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(SizeKt.m525sizeVpY3zN4(OffsetKt.m437offsetVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f2 / i11), 0.0f, 2, obj), Dp.m3765constructorimpl(f2 / 2), f2), ColorKt.Color(4285392127L), RoundedCornerShapeKt.getCircleShape());
                i12 = 2;
            }
            SpacerKt.Spacer(HoverableKt.hoverable$default(Modifier.INSTANCE.then(modifierM168backgroundbw27NRU), interactionSource, false, i12, obj), composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            if (i6 != 0) {
                function3 = null;
            } else {
                function3 = function2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-312818245, i8, -1, "com.code.android.uikit.slider.CustomSliderThumb (CustomSliderThumb.kt:29)");
            }
            Modifier modifierM480paddingqDBjuR0$default1111 = PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null);
            Alignment.Companion companion1111111 = Alignment.INSTANCE;
            Modifier modifierAlign1111 = CustomSliderThumb.align(modifierM480paddingqDBjuR0$default1111, companion1111111.getCenterStart());
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o1111 = OooOOO.OooO00o(companion1111111, false, composerStartRestartGroup, 0, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap1111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion1111112 = ComposeUiNode.INSTANCE;
            constructor = companion1111112.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1111 = LayoutKt.modifierMaterializerOf(modifierAlign1111);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            function2OooO00o = OooO.OooO00o(companion1111112, composerM1309constructorimpl, measurePolicyOooO00o1111, composerM1309constructorimpl, currentCompositionLocalMap1111);
            if (composerM1309constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1111, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance1111 = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            snapshotStateList = (SnapshotStateList) objRememberedValue;
            i10 = 0;
            objArr = new Object[]{interactionSource, isPress, snapshotStateList, function3};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            zChanged = false;
            while (i10 < i9) {
                zChanged |= composerStartRestartGroup.changed(objArr[i10]);
                i10++;
            }
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                i11 = 4;
                obj = null;
            } else {
                objRememberedValue2 = new OooO00o(interactionSource, isPress, snapshotStateList, function3, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                i11 = 4;
                obj = null;
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, ((i8 >> 6) & 14) | 64);
            if (isPress.getValue().booleanValue()) {
                Modifier modifierScale1111 = ScaleKt.scale(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, f2), f3 / f2);
                int i11114 = o0oO0O0o.f47152o00OOOo;
                modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(modifierScale1111, o0oO0O0o.f46946OooO0O0, RoundedCornerShapeKt.getCircleShape());
                i12 = 2;
            } else {
                modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(SizeKt.m525sizeVpY3zN4(OffsetKt.m437offsetVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f2 / i11), 0.0f, 2, obj), Dp.m3765constructorimpl(f2 / 2), f2), ColorKt.Color(4285392127L), RoundedCornerShapeKt.getCircleShape());
                i12 = 2;
            }
            SpacerKt.Spacer(HoverableKt.hoverable$default(Modifier.INSTANCE.then(modifierM168backgroundbw27NRU), interactionSource, false, i12, obj), composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(CustomSliderThumb, f, interactionSource, colors, z, f2, f3, isPress, function3, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(@NotNull BoxScope CustomWhiteRoundSliderThumb, float f, @NotNull MutableInteractionSource interactionSource, @NotNull oo0o0Oo colors, boolean z, float f2, float f3, @NotNull MutableState<Boolean> isPress, @Nullable Composer composer, int i) {
        int i2;
        Modifier modifierM168backgroundbw27NRU;
        Intrinsics.checkNotNullParameter(CustomWhiteRoundSliderThumb, "$this$CustomWhiteRoundSliderThumb");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(isPress, "isPress");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2926803);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(CustomWhiteRoundSliderThumb) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(interactionSource) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((458752 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(f2) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(f3) ? ZegoConstants.ErrorMask.RoomServerErrorMask : 524288;
        }
        if ((29360128 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(isPress) ? 8388608 : Configuration.BLOCK_SIZE;
        }
        if ((23921371 & i2) == 4784274 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2926803, i2, -1, "com.code.android.uikit.slider.CustomWhiteRoundSliderThumb (CustomSliderThumb.kt:106)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(companion, f, 0.0f, 0.0f, 0.0f, 14, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Modifier modifierAlign = CustomWhiteRoundSliderThumb.align(modifierM480paddingqDBjuR0$default, companion2.getCenterStart());
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierAlign);
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
            Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue == companion4.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
            int i3 = (i2 >> 6) & 14;
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            boolean zChanged = composerStartRestartGroup.changed(interactionSource) | composerStartRestartGroup.changed(isPress) | composerStartRestartGroup.changed(snapshotStateList);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion4.getEmpty()) {
                objRememberedValue2 = new OooO0OO(interactionSource, isPress, snapshotStateList, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i3 | 64);
            if (isPress.getValue().booleanValue()) {
                Modifier modifierScale = ScaleKt.scale(SizeKt.m523size3ABfNKs(companion, f2), f3 / f2);
                int i4 = o0oO0O0o.f47152o00OOOo;
                modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(modifierScale, o0oO0O0o.f46946OooO0O0, RoundedCornerShapeKt.getCircleShape());
            } else {
                Modifier modifierM523size3ABfNKs = SizeKt.m523size3ABfNKs(companion, f2);
                int i5 = o0oO0O0o.f47152o00OOOo;
                modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(modifierM523size3ABfNKs, o0oO0O0o.f46946OooO0O0, RoundedCornerShapeKt.getCircleShape());
            }
            SpacerKt.Spacer(HoverableKt.hoverable$default(companion.then(modifierM168backgroundbw27NRU), interactionSource, false, 2, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(CustomWhiteRoundSliderThumb, f, interactionSource, colors, z, f2, f3, isPress, i));
    }
}
