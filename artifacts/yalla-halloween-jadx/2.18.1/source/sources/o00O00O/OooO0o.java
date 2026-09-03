package o00O00O;

import androidx.compose.foundation.MutatePriority;
import code.easy.refresh.RefreshState;
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
import o0000O0O.o00oO0o;
import o0000O0O.oo000o;
import o00O0O.OooOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p346o0OOO0o.OooOOO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o implements OooOOO {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public float f30224Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final RefreshState f30225Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f30226Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f30227Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public float f30228OoooO00;

    @DebugMetadata(c = "code.easy.refresh.RefreshNestedScrollConnection$onPull$1", f = "RefreshNestedScrollConnection.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f30229Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ float f30231Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(float f, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f30231Oooo0oo = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OooO0o.this.new OooO00o(this.f30231Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f30229Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OooO0o.this.f30225Oooo0o.OooO0Oo(RefreshState.State.Pull);
                RefreshState refreshState = OooO0o.this.f30225Oooo0o;
                float f = this.f30231Oooo0oo;
                this.f30229Oooo0o = 1;
                Object objOooO0O0 = refreshState.f9859OooO0O0.OooO0O0(MutatePriority.UserInput, new OooO(refreshState, f, null), this);
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

    public OooO0o(@NotNull RefreshState refreshState, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(refreshState, "refreshState");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f30225Oooo0o = refreshState;
        this.f30226Oooo0oO = coroutineScope;
        this.f30227Oooo0oo = true;
        this.f30224Oooo = 2.5f;
    }

    @Override // p346o0OOO0o.OooOOO
    @Nullable
    public final Object OooO00o(long j, long j2, @NotNull Continuation<? super oo000o> continuation) {
        return new oo000o(o00oO0o.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, oo000o.OooO0OO(j2)));
    }

    @Override // p346o0OOO0o.OooOOO
    public final long OooO0O0(long j, int i) {
        if (!this.f30227Oooo0oo) {
            o00O0O.OooO.OooO00o oooO00o = o00O0O.OooO.f30391OooO0O0;
            return o00O0O.OooO.f30392OooO0OO;
        }
        if (this.f30225Oooo0o.OooO0OO() == RefreshState.State.Refresh) {
            o00O0O.OooO.OooO00o oooO00o2 = o00O0O.OooO.f30391OooO0O0;
            return o00O0O.OooO.f30392OooO0OO;
        }
        if (this.f30225Oooo0o.OooO0OO() == RefreshState.State.Finish) {
            o00O0O.OooO.OooO00o oooO00o3 = o00O0O.OooO.f30391OooO0O0;
            return o00O0O.OooO.f30392OooO0OO;
        }
        if ((i == 1) && o00O0O.OooO.OooO0Oo(j) < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            return OooO0o0(j);
        }
        o00O0O.OooO.OooO00o oooO00o4 = o00O0O.OooO.f30391OooO0O0;
        return o00O0O.OooO.f30392OooO0OO;
    }

    @Override // p346o0OOO0o.OooOOO
    @Nullable
    public final Object OooO0OO(long j, @NotNull Continuation<? super oo000o> continuation) {
        if (this.f30225Oooo0o.OooO0OO() != RefreshState.State.Pull) {
            oo000o.OooO00o oooO00o = oo000o.f27328OooO0O0;
            return new oo000o(oo000o.f27329OooO0OO);
        }
        if (this.f30225Oooo0o.OooO0O0() >= this.f30228OoooO00) {
            this.f30225Oooo0o.OooO0Oo(RefreshState.State.Refresh);
        } else {
            this.f30225Oooo0o.OooO0Oo(RefreshState.State.Close);
        }
        oo000o.OooO00o oooO00o2 = oo000o.f27328OooO0O0;
        return new oo000o(oo000o.f27329OooO0OO);
    }

    @Override // p346o0OOO0o.OooOOO
    public final long OooO0Oo(long j, long j2, int i) {
        if (!this.f30227Oooo0oo) {
            o00O0O.OooO.OooO00o oooO00o = o00O0O.OooO.f30391OooO0O0;
            return o00O0O.OooO.f30392OooO0OO;
        }
        if (this.f30225Oooo0o.OooO0OO() == RefreshState.State.Refresh) {
            o00O0O.OooO.OooO00o oooO00o2 = o00O0O.OooO.f30391OooO0O0;
            return o00O0O.OooO.f30392OooO0OO;
        }
        if (this.f30225Oooo0o.OooO0OO() == RefreshState.State.Finish) {
            o00O0O.OooO.OooO00o oooO00o3 = o00O0O.OooO.f30391OooO0O0;
            return o00O0O.OooO.f30392OooO0OO;
        }
        if ((i == 1) && o00O0O.OooO.OooO0Oo(j2) > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            return OooO0o0(j2);
        }
        o00O0O.OooO.OooO00o oooO00o4 = o00O0O.OooO.f30391OooO0O0;
        return o00O0O.OooO.f30392OooO0OO;
    }

    public final long OooO0o0(long j) {
        float fOooO0O0;
        float f = this.f30224Oooo;
        if (f == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            fOooO0O0 = 1.0f;
        } else {
            fOooO0O0 = 1 - (this.f30225Oooo0o.OooO0O0() / (this.f30228OoooO00 * f));
        }
        float fCoerceAtLeast = RangesKt.coerceAtLeast(this.f30225Oooo0o.OooO0O0() + (o00O0O.OooO.OooO0Oo(j) * fOooO0O0), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) - this.f30225Oooo0o.OooO0O0();
        if (Math.abs(fCoerceAtLeast) >= 0.5f) {
            BuildersKt__Builders_commonKt.launch$default(this.f30226Oooo0oO, null, null, new OooO00o(fCoerceAtLeast, null), 3, null);
            return OooOO0.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0O.OooO.OooO0Oo(j));
        }
        o00O0O.OooO.OooO00o oooO00o = o00O0O.OooO.f30391OooO0O0;
        return o00O0O.OooO.f30392OooO0OO;
    }
}
