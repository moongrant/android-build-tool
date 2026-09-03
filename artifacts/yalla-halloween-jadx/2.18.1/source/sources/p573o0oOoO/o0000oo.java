package p573o0oOoO;

import androidx.compose.foundation.MutatePriority;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o0000O0O.oo000o;
import o00O0O.OooO;
import o00O0O.OooOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p346o0OOO0o.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000oo implements OooOOO {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f45659Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final o000OO f45660Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f45661Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final float f45662Oooo0oo;

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.refresh.SwipeNestedScrollConnection$onScroll$1", f = "SwipeNestedScrollConnection.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f45663Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ float f45665Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(float f, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f45665Oooo0oo = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return o0000oo.this.new OooO00o(this.f45665Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f45663Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o000OO o000oo2 = o0000oo.this.f45660Oooo0o;
                float f = this.f45665Oooo0oo;
                this.f45663Oooo0o = 1;
                Object objOooO0O0 = o000oo2.f45667OooO0O0.OooO0O0(MutatePriority.UserInput, new o0000O0O(o000oo2, f, null), this);
                if (objOooO0O0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objOooO0O0 = Unit.INSTANCE;
                }
                if (objOooO0O0 == coroutine_suspended) {
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

    public o0000oo(@NotNull o000OO state, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f45660Oooo0o = state;
        this.f45661Oooo0oO = coroutineScope;
        this.f45662Oooo0oo = 0.3f;
        this.f45659Oooo = true;
    }

    @Override // p346o0OOO0o.OooOOO
    public final Object OooO00o(long j, long j2, Continuation continuation) {
        oo000o.OooO00o oooO00o = oo000o.f27328OooO0O0;
        return new oo000o(oo000o.f27329OooO0OO);
    }

    @Override // p346o0OOO0o.OooOOO
    public final long OooO0O0(long j, int i) {
        if (!this.f45659Oooo) {
            OooO.OooO00o oooO00o = OooO.f30391OooO0O0;
            return OooO.f30392OooO0OO;
        }
        if ((i == 1) && OooO.OooO0Oo(j) < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            return OooO0o0(j);
        }
        OooO.OooO00o oooO00o2 = OooO.f30391OooO0O0;
        return OooO.f30392OooO0OO;
    }

    @Override // p346o0OOO0o.OooOOO
    @Nullable
    public final Object OooO0OO(long j, @NotNull Continuation<? super oo000o> continuation) {
        this.f45660Oooo0o.f45670OooO0o0.setValue(Boolean.FALSE);
        oo000o.OooO00o oooO00o = oo000o.f27328OooO0O0;
        return new oo000o(oo000o.f27329OooO0OO);
    }

    @Override // p346o0OOO0o.OooOOO
    public final long OooO0Oo(long j, long j2, int i) {
        if (!this.f45659Oooo) {
            OooO.OooO00o oooO00o = OooO.f30391OooO0O0;
            return OooO.f30392OooO0OO;
        }
        if ((i == 1) && OooO.OooO0Oo(j2) > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            return OooO0o0(j2);
        }
        OooO.OooO00o oooO00o2 = OooO.f30391OooO0O0;
        return OooO.f30392OooO0OO;
    }

    public final long OooO0o0(long j) {
        this.f45660Oooo0o.f45670OooO0o0.setValue(Boolean.TRUE);
        float fCoerceAtLeast = RangesKt.coerceAtLeast(this.f45660Oooo0o.OooO00o() + (OooO.OooO0Oo(j) * this.f45662Oooo0oo), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) - this.f45660Oooo0o.OooO00o();
        if (Math.abs(fCoerceAtLeast) >= 0.5f) {
            BuildersKt__Builders_commonKt.launch$default(this.f45661Oooo0oO, null, null, new OooO00o(fCoerceAtLeast, null), 3, null);
            return OooOO0.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, fCoerceAtLeast / this.f45662Oooo0oo);
        }
        OooO.OooO00o oooO00o = OooO.f30391OooO0O0;
        return OooO.f30392OooO0OO;
    }
}
