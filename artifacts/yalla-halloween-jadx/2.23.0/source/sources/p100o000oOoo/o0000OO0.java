package p100o000oOoo;

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
import p097o000o0oO.o000O00;
import p111o000oooO.o00O00;
import p111o000oooO.o00O00O;
import p111o000oooO.o0O0ooO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000OO0 implements o00O00O, LayoutModifier {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Constraints> f35497OooO00o = StateFlowKt.MutableStateFlow(Constraints.m3721boximpl(o000O0.f35500OooO00o));

    public static final class OooO00o extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Placeable f35498OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Placeable placeable) {
            super(1);
            this.f35498OooO0Oo = placeable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope.place$default(placementScope, this.f35498OooO0Oo, 0, 0, 0.0f, 4, null);
            return Unit.INSTANCE;
        }
    }

    @Override // p111o000oooO.o00O00O
    @Nullable
    public final Object OooO00o(@NotNull o000O00 o000o01) {
        final MutableStateFlow<Constraints> mutableStateFlow = this.f35497OooO00o;
        return FlowKt.first(new Flow<o00O00>() { // from class: coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f8527OooO0Oo;

                /* JADX INFO: renamed from: coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                @DebugMetadata(c = "coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2", f = "AsyncImage.kt", i = {}, l = {225}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                    public /* synthetic */ Object f8528OooO0Oo;

                    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                    public int f8530OooO0o0;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f8528OooO0Oo = obj;
                        this.f8530OooO0o0 |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f8527OooO0Oo = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    o00O00 o00o01;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.f8530OooO0o0;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f8530OooO0o0 = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.f8528OooO0Oo;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.f8530OooO0o0;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        long value = ((Constraints) obj).getValue();
                        if (Constraints.m3737isZeroimpl(value)) {
                            o00o01 = null;
                        } else {
                            o00o01 = new o00O00(Constraints.m3729getHasBoundedWidthimpl(value) ? new o0O0ooO.OooO00o(Constraints.m3733getMaxWidthimpl(value)) : o0O0ooO.OooO0O0.f35938OooO00o, Constraints.m3728getHasBoundedHeightimpl(value) ? new o0O0ooO.OooO00o(Constraints.m3732getMaxHeightimpl(value)) : o0O0ooO.OooO0O0.f35938OooO00o);
                        }
                        if (o00o01 != null) {
                            anonymousClass1.f8530OooO0o0 = 1;
                            if (this.f8527OooO0Oo.emit(o00o01, anonymousClass1) == coroutine_suspended) {
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
            public final Object collect(@NotNull FlowCollector<? super o00O00> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = mutableStateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, o000o01);
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
        this.f35497OooO00o.setValue(Constraints.m3721boximpl(j));
        Placeable placeableMo2794measureBRTryo0 = measurable.mo2794measureBRTryo0(j);
        return MeasureScope.CC.OooOOo0(measureScope, placeableMo2794measureBRTryo0.getWidth(), placeableMo2794measureBRTryo0.getHeight(), null, new OooO00o(placeableMo2794measureBRTryo0), 4, null);
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
