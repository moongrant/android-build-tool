package p121o00O0Ooo;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.OooO0O0;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OooO0o;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p118o00O0Oo.o0000;
import p130o00O0oo.o000O0Oo;
import p130o00O0oo.o000OO0O;
import p130o00O0oo.o000Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O0O implements o000OO0O, LayoutModifier {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Constraints> f36452OooO00o = StateFlowKt.MutableStateFlow(Constraints.m3731boximpl(o000Oo0.f36479OooO00o));

    public static final class OooO00o extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Placeable f36453OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Placeable placeable) {
            super(1);
            this.f36453OooO0Oo = placeable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope.place$default(placementScope, this.f36453OooO0Oo, 0, 0, 0.0f, 4, null);
            return Unit.INSTANCE;
        }
    }

    @Override // p130o00O0oo.o000OO0O
    @Nullable
    public final Object OooO0O0(@NotNull o0000 o0000Var) {
        final MutableStateFlow<Constraints> mutableStateFlow = this.f36452OooO00o;
        return FlowKt.first(new Flow<o000O0Oo>() { // from class: coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f11617OooO0Oo;

                /* JADX INFO: renamed from: coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                @DebugMetadata(c = "coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2", f = "AsyncImage.kt", i = {}, l = {225}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                    public /* synthetic */ Object f11618OooO0Oo;

                    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                    public int f11620OooO0o0;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f11618OooO0Oo = obj;
                        this.f11620OooO0o0 |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f11617OooO0Oo = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    o000O0Oo o000o0oo2;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.f11620OooO0o0;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f11620OooO0o0 = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.f11618OooO0Oo;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.f11620OooO0o0;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        long value = ((Constraints) obj).getValue();
                        if (Constraints.m3747isZeroimpl(value)) {
                            o000o0oo2 = null;
                        } else {
                            o000o0oo2 = new o000O0Oo(Constraints.m3739getHasBoundedWidthimpl(value) ? new o000Oo0.OooO00o(Constraints.m3743getMaxWidthimpl(value)) : o000Oo0.OooO0O0.f36778OooO00o, Constraints.m3738getHasBoundedHeightimpl(value) ? new o000Oo0.OooO00o(Constraints.m3742getMaxHeightimpl(value)) : o000Oo0.OooO0O0.f36778OooO00o);
                        }
                        if (o000o0oo2 != null) {
                            anonymousClass1.f11620OooO0o0 = 1;
                            if (this.f11617OooO0Oo.emit(o000o0oo2, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public final Object collect(@NotNull FlowCollector<? super o000O0Oo> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = mutableStateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, o0000Var);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean all(Function1 function1) {
        return OooO0O0.OooO00o(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean any(Function1 function1) {
        return OooO0O0.OooO0O0(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return OooO0O0.OooO0OO(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return OooO0O0.OooO0Oo(this, obj, function2);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return OooO0o.OooO00o(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return OooO0o.OooO0O0(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo27measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j) {
        this.f36452OooO00o.setValue(Constraints.m3731boximpl(j));
        Placeable placeableMo2804measureBRTryo0 = measurable.mo2804measureBRTryo0(j);
        return MeasureScope.CC.OooOOo0(measureScope, placeableMo2804measureBRTryo0.getWidth(), placeableMo2804measureBRTryo0.getHeight(), null, new OooO00o(placeableMo2804measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return OooO0o.OooO0OO(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return OooO0o.OooO0Oo(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.OooO00o.OooO00o(this, modifier);
    }
}
