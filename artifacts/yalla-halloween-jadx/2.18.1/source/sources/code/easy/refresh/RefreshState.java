package code.easy.refresh;

import Oooo0.o00O0O0O;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.Oooo0;
import p023Oooo00O.o0000oo;
import p023Oooo00O.o000oOoO;
import p023Oooo00O.o00OO00O;
import p023Oooo00O.o0Oo0oo;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class RefreshState {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Oooo0<Float, o0Oo0oo> f9858OooO00o = o000oOoO.OooO0o0(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00O0O0O f9859OooO0O0 = new o00O0O0O();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f9860OooO0OO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(State.Null);

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcode/easy/refresh/RefreshState$State;", "", "Null", "Pull", "Refresh", "Finish", "Close", "lib_release"}, k = 1, mv = {1, 5, 1})
    public enum State {
        Null,
        Pull,
        Refresh,
        Finish,
        Close
    }

    @Nullable
    public final Object OooO00o(float f, long j, @NotNull Continuation<? super Unit> continuation) {
        Object objOooO0OO = Oooo0.OooO0OO(this.f9858OooO00o, Boxing.boxFloat(f), new o00OO00O((int) j, (o0000oo) null, 6), null, continuation, 12);
        return objOooO0OO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOooO0OO : Unit.INSTANCE;
    }

    public final float OooO0O0() {
        return this.f9858OooO00o.OooO0o().floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final State OooO0OO() {
        return (State) this.f9860OooO0OO.getValue();
    }

    public final void OooO0Oo(@NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "<set-?>");
        this.f9860OooO0OO.setValue(state);
    }
}
