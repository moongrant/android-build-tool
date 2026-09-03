package p448o0OoOoOO;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import o0O000O.OooO0o;
import o0O000O.OooOO0;
import o0O00O0.OooO0O0;
import org.jetbrains.annotations.NotNull;
import p276o0O000o.OooOO0O;

/* JADX INFO: loaded from: classes.dex */
public class o0OO0o<IN, OUT> extends o0OOooO0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o0OO f40273OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final OooOO0O<IN> f40274OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public String f40275OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final OooOO0<IN, OUT> f40276OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final OooO00o f40277OooO0oO;

    public static final class OooO00o extends OooO0O0 {

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o0OO0o<IN, OUT> f40278Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0OO0o<IN, OUT> o0oo0o2, CoroutineScope coroutineScope) {
            super(coroutineScope);
            this.f40278Oooo0oo = o0oo0o2;
        }

        @Override // o0O00O0.OooO0O0
        public final long OooO00o() {
            return this.f40278Oooo0oo.f40273OooO0OO.OooO0O0();
        }

        @Override // o0O00O0.OooO0O0
        public final void OooO0O0() {
            o0OO0o<IN, OUT> o0oo0o2 = this.f40278Oooo0oo;
            IN inOooO00o = o0oo0o2.f40276OooO0o0.OooO00o();
            if (inOooO00o == null) {
                throw new IllegalArgumentException("Make sure you have override pingMessage method of PulseAdapter");
            }
            o0oo0o2.f40274OooO0Oo.OooO00o(inOooO00o);
            o0O000Oo.OooO00o.OooO00o(o0oo0o2.OooO00o(), "Ping message sent!");
        }
    }

    public o0OO0o(@NotNull o0OO pulseAdapter, @NotNull OooOO0O<IN> sender, @NotNull OooOO0<IN, OUT> protocol) {
        Intrinsics.checkNotNullParameter(pulseAdapter, "pulseAdapter");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        this.f40273OooO0OO = pulseAdapter;
        this.f40274OooO0Oo = sender;
        this.f40276OooO0o0 = protocol;
        this.f40275OooO0o = String.valueOf(Reflection.getOrCreateKotlinClass(protocol.getClass()).getSimpleName());
        this.f40277OooO0oO = new OooO00o(this, OooO0o.OooO00o());
    }

    @NotNull
    public String OooO00o() {
        return this.f40275OooO0o;
    }

    @Override // p448o0OoOoOO.o0OO0oO0
    public void start() {
        if (!this.f40294OooO00o) {
            this.f40294OooO00o = true;
        }
        OooO00o oooO00o = this.f40277OooO0oO;
        Job job = oooO00o.f35115Oooo0oO;
        if (job != null && job.isActive()) {
            return;
        }
        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(oooO00o.f35114Oooo0o, null, CoroutineStart.LAZY, new o0O00O0.OooO00o(oooO00o, null), 1, null);
        oooO00o.f35115Oooo0oO = jobLaunch$default;
        jobLaunch$default.start();
    }

    @Override // p448o0OoOoOO.o0OO0oO0
    public void stop() {
        if (this.f40294OooO00o) {
            this.f40294OooO00o = false;
        }
        this.f40277OooO0oO.close();
    }
}
