package p448o0OoOoOO;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.Job;
import o0O000O.OooOO0;
import o0O000o0.OooO0o;
import org.jetbrains.annotations.NotNull;
import p276o0O000o.OooOO0O;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO0o00<IN, OUT> extends o0OO0o<IN, OUT> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final o0OOO0 f40279OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public String f40280OooO0oo;

    public static final class OooO00o implements o0O000o0.OooO00o<OUT> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o0OO0o00<IN, OUT> f40281OooO00o;

        public OooO00o(o0OO0o00<IN, OUT> o0oo0o01) {
            this.f40281OooO00o = o0oo0o01;
        }

        @Override // o0O000o0.OooO00o
        public final void OooO00o() {
            o0O000Oo.OooO00o.OooO00o(this.f40281OooO00o.f40280OooO0oo, "Received pong message!");
            o0OOO0 o0ooo1 = this.f40281OooO00o.f40279OooO;
            Job job = o0ooo1.f40285OooO0OO;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            o0ooo1.OooO00o();
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0OO0o00<IN, OUT> f40282Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o0OO0o00<IN, OUT> o0oo0o01) {
            super(0);
            this.f40282Oooo0o = o0oo0o01;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OO0oO0.OooO00o oooO00o = this.f40282Oooo0o.f40295OooO0O0;
            if (oooO00o != null) {
                oooO00o.OooO00o();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0o00(@NotNull o0OO pulseAdapter, @NotNull OooOO0O<IN> sender, @NotNull o0O000o0.OooO0O0<OUT> receiver, @NotNull OooOO0<IN, OUT> protocol) {
        super(pulseAdapter, sender, protocol);
        Intrinsics.checkNotNullParameter(pulseAdapter, "pulseAdapter");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        this.f40280OooO0oo = String.valueOf(Reflection.getOrCreateKotlinClass(protocol.getClass()).getSimpleName());
        this.f40279OooO = new o0OOO0(pulseAdapter.OooO00o(), new OooO0O0(this));
        OooO00o listener = new OooO00o(this);
        Intrinsics.checkNotNullParameter(listener, "listener");
        ((OooO0o) receiver).f35091OoooO0O = listener;
    }

    @Override // p448o0OoOoOO.o0OO0o
    @NotNull
    public final String OooO00o() {
        return this.f40280OooO0oo;
    }

    @Override // p448o0OoOoOO.o0OO0o, p448o0OoOoOO.o0OO0oO0
    public final void start() {
        super.start();
        this.f40279OooO.OooO00o();
    }

    @Override // p448o0OoOoOO.o0OO0o, p448o0OoOoOO.o0OO0oO0
    public final void stop() {
        super.stop();
        Job job = this.f40279OooO.f40285OooO0OO;
        if (job == null) {
            return;
        }
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
    }
}
