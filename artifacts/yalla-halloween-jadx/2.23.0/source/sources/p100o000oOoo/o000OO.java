package p100o000oOoo;

import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.math.MathKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p097o000o0oO.o000O00;
import p111o000oooO.o00O00;
import p111o000oooO.o00O00O;
import p111o000oooO.o0O0ooO;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OO implements o00O00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0000O0 f35515OooO00o;

    public o000OO(o0000O0 o0000o1) {
        this.f35515OooO00o = o0000o1;
    }

    @Override // p111o000oooO.o00O00O
    @Nullable
    public final Object OooO00o(@NotNull o000O00 o000o01) {
        final MutableStateFlow<Size> mutableStateFlow = this.f35515OooO00o.f35470OooO0o0;
        return FlowKt.first(new Flow<o00O00>() { // from class: coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f8522OooO0Oo;

                /* JADX INFO: renamed from: coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                @DebugMetadata(c = "coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2", f = "AsyncImagePainter.kt", i = {}, l = {225}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                    public /* synthetic */ Object f8523OooO0Oo;

                    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                    public int f8525OooO0o0;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f8523OooO0Oo = obj;
                        this.f8525OooO0o0 |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f8522OooO0Oo = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    o00O00 o00o01;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.f8525OooO0o0;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f8525OooO0o0 = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.f8523OooO0Oo;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.f8525OooO0o0;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        long packedValue = ((Size) obj).getPackedValue();
                        boolean z = false;
                        if (packedValue == Size.INSTANCE.m1513getUnspecifiedNHjbRc()) {
                            o00o01 = o00O00.f35923OooO0OO;
                        } else {
                            if (((double) Size.m1505getWidthimpl(packedValue)) >= 0.5d && ((double) Size.m1502getHeightimpl(packedValue)) >= 0.5d) {
                                float fM1505getWidthimpl = Size.m1505getWidthimpl(packedValue);
                                o0O0ooO oooO00o = !Float.isInfinite(fM1505getWidthimpl) && !Float.isNaN(fM1505getWidthimpl) ? new o0O0ooO.OooO00o(MathKt.roundToInt(Size.m1505getWidthimpl(packedValue))) : o0O0ooO.OooO0O0.f35938OooO00o;
                                float fM1502getHeightimpl = Size.m1502getHeightimpl(packedValue);
                                if (!Float.isInfinite(fM1502getHeightimpl) && !Float.isNaN(fM1502getHeightimpl)) {
                                    z = true;
                                }
                                o00o01 = new o00O00(oooO00o, z ? new o0O0ooO.OooO00o(MathKt.roundToInt(Size.m1502getHeightimpl(packedValue))) : o0O0ooO.OooO0O0.f35938OooO00o);
                            } else {
                                o00o01 = null;
                            }
                        }
                        if (o00o01 != null) {
                            anonymousClass1.f8525OooO0o0 = 1;
                            if (this.f8522OooO0Oo.emit(o00o01, anonymousClass1) == coroutine_suspended) {
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
}
