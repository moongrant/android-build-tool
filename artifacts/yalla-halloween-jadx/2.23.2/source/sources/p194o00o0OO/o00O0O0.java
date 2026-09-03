package p194o00o0OO;

import androidx.compose.material.SwipeableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import com.facebook.internal.FacebookRequestErrorClassification;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O0 implements NestedScrollConnection {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SwipeableState<Object> f38689OooO0Oo;

    @DebugMetadata(c = "com.code.android.uikit.SwipeToLoadKt$PreUpPostDownNestedScrollConnection$1", f = "SwipeToLoad.kt", i = {}, l = {FacebookRequestErrorClassification.EC_INVALID_TOKEN}, m = "onPostFling-RZ2iAVY", n = {}, s = {})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f38690OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f38691OooO0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f38690OooO0Oo = obj;
            this.f38691OooO0o |= Integer.MIN_VALUE;
            return o00O0O0.this.mo333onPostFlingRZ2iAVY(0L, 0L, this);
        }
    }

    @DebugMetadata(c = "com.code.android.uikit.SwipeToLoadKt$PreUpPostDownNestedScrollConnection$1", f = "SwipeToLoad.kt", i = {}, l = {177}, m = "onPreFling-QWom1Mo", n = {}, s = {})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f38693OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f38694OooO0o;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f38693OooO0Oo = obj;
            this.f38694OooO0o |= Integer.MIN_VALUE;
            return o00O0O0.this.mo335onPreFlingQWom1Mo(0L, this);
        }
    }

    public o00O0O0(SwipeableState<Object> swipeableState) {
        this.f38689OooO0Oo = swipeableState;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public final Object mo333onPostFlingRZ2iAVY(long j, long j2, @NotNull Continuation<? super Velocity> continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f38691OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f38691OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object obj = oooO00o.f38690OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f38691OooO0o;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            float fM1448getYimpl = Offset.m1448getYimpl(OffsetKt.Offset(Velocity.m4000getXimpl(j2), Velocity.m4001getYimpl(j2)));
            oooO00o.f38691OooO0o = 1;
            if (this.f38689OooO0Oo.performFling(fM1448getYimpl, oooO00o) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Velocity.m3991boximpl(Velocity.INSTANCE.m4011getZero9UxMQ8M());
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo334onPostScrollDzOQY0M(long j, long j2, int i) {
        if (!NestedScrollSource.m2604equalsimpl0(i, NestedScrollSource.INSTANCE.m2609getDragWNlRxjI())) {
            return Offset.INSTANCE.m1463getZeroF1C5BW0();
        }
        return OffsetKt.Offset(0.0f, this.f38689OooO0Oo.performDrag(Offset.m1448getYimpl(j2)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    public final Object mo335onPreFlingQWom1Mo(long j, @NotNull Continuation<? super Velocity> continuation) {
        OooO0O0 oooO0O0;
        long jM4011getZero9UxMQ8M;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f38694OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f38694OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object obj = oooO0O0.f38693OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f38694OooO0o;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            float fM1448getYimpl = Offset.m1448getYimpl(OffsetKt.Offset(Velocity.m4000getXimpl(j), Velocity.m4001getYimpl(j)));
            if (fM1448getYimpl < 0.0f) {
                oooO0O0.f38694OooO0o = 1;
                if (this.f38689OooO0Oo.performFling(fM1448getYimpl, oooO0O0) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                jM4011getZero9UxMQ8M = Velocity.INSTANCE.m4011getZero9UxMQ8M();
            }
            return Velocity.m3991boximpl(jM4011getZero9UxMQ8M);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        jM4011getZero9UxMQ8M = Velocity.INSTANCE.m4011getZero9UxMQ8M();
        return Velocity.m3991boximpl(jM4011getZero9UxMQ8M);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public final long mo336onPreScrollOzD1aCk(long j, int i) {
        float fM1448getYimpl = Offset.m1448getYimpl(j);
        return (fM1448getYimpl >= 0.0f || !NestedScrollSource.m2604equalsimpl0(i, NestedScrollSource.INSTANCE.m2609getDragWNlRxjI())) ? Offset.INSTANCE.m1463getZeroF1C5BW0() : OffsetKt.Offset(0.0f, this.f38689OooO0Oo.performDrag(fM1448getYimpl));
    }
}
