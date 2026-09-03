package p121o00O0Ooo;

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
import p118o00O0Oo.o0000;
import p130o00O0oo.o000O0Oo;
import p130o00O0oo.o000OO0O;
import p130o00O0oo.o000Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000oo implements o000OO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0000 f36455OooO00o;

    public o0000oo(o0000 o0000Var) {
        this.f36455OooO00o = o0000Var;
    }

    @Override // p130o00O0oo.o000OO0O
    @Nullable
    public final Object OooO0O0(@NotNull o0000 o0000Var) {
        final MutableStateFlow<Size> mutableStateFlow = this.f36455OooO00o.f36423OooO0o0;
        return FlowKt.first(new Flow<o000O0Oo>() { // from class: coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f11612OooO0Oo;

                /* JADX INFO: renamed from: coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                @DebugMetadata(c = "coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2", f = "AsyncImagePainter.kt", i = {}, l = {225}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                    public /* synthetic */ Object f11613OooO0Oo;

                    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                    public int f11615OooO0o0;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f11613OooO0Oo = obj;
                        this.f11615OooO0o0 |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f11612OooO0Oo = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    o000O0Oo o000o0oo2;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.f11615OooO0o0;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f11615OooO0o0 = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.f11613OooO0Oo;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.f11615OooO0o0;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        long packedValue = ((Size) obj).getPackedValue();
                        boolean z = false;
                        if (packedValue == Size.INSTANCE.m1524getUnspecifiedNHjbRc()) {
                            o000o0oo2 = o000O0Oo.f36770OooO0OO;
                        } else {
                            if (((double) Size.m1516getWidthimpl(packedValue)) >= 0.5d && ((double) Size.m1513getHeightimpl(packedValue)) >= 0.5d) {
                                float fM1516getWidthimpl = Size.m1516getWidthimpl(packedValue);
                                o000Oo0 oooO00o = !Float.isInfinite(fM1516getWidthimpl) && !Float.isNaN(fM1516getWidthimpl) ? new o000Oo0.OooO00o(MathKt.roundToInt(Size.m1516getWidthimpl(packedValue))) : o000Oo0.OooO0O0.f36778OooO00o;
                                float fM1513getHeightimpl = Size.m1513getHeightimpl(packedValue);
                                if (!Float.isInfinite(fM1513getHeightimpl) && !Float.isNaN(fM1513getHeightimpl)) {
                                    z = true;
                                }
                                o000o0oo2 = new o000O0Oo(oooO00o, z ? new o000Oo0.OooO00o(MathKt.roundToInt(Size.m1513getHeightimpl(packedValue))) : o000Oo0.OooO0O0.f36778OooO00o);
                            } else {
                                o000o0oo2 = null;
                            }
                        }
                        if (o000o0oo2 != null) {
                            anonymousClass1.f11615OooO0o0 = 1;
                            if (this.f11612OooO0Oo.emit(o000o0oo2, anonymousClass1) == coroutine_suspended) {
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
}
