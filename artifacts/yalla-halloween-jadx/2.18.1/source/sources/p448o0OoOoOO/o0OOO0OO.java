package p448o0OoOoOO;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.Job;
import o0O000O.OooOO0;
import o0O000o0.OooO0O0;
import org.jetbrains.annotations.NotNull;
import p276o0O000o.OooOO0O;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0OO<IN, OUT> extends o0OOOO00<OUT> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final OooOO0O<IN> f40288OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public String f40289OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final OooOO0<IN, OUT> f40290OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0OO(@NotNull o0OO pulseAdapter, @NotNull OooOO0O<IN> sender, @NotNull OooO0O0<OUT> receiver, @NotNull OooOO0<IN, OUT> protocol) {
        super(pulseAdapter, receiver);
        Intrinsics.checkNotNullParameter(pulseAdapter, "pulseAdapter");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        this.f40288OooO0Oo = sender;
        this.f40290OooO0o0 = protocol;
        this.f40289OooO0o = String.valueOf(Reflection.getOrCreateKotlinClass(protocol.getClass()).getSimpleName());
    }

    @Override // p448o0OoOoOO.o0OOOO00
    public final void OooO00o() {
        o0OOO0 o0ooo1 = this.f40291OooO0OO;
        Job job = o0ooo1.f40285OooO0OO;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        o0ooo1.OooO00o();
        this.f40290OooO0o0.OooO0o0();
        throw new IllegalArgumentException("Make sure you have override pongMessage method of PulseAdapter");
    }
}
