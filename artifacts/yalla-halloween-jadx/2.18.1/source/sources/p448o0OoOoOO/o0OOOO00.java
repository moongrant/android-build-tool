package p448o0OoOoOO;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public class o0OOOO00<OUT> extends o0OOooO0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o0OOO0 f40291OooO0OO;

    public static final class OooO00o implements o0O000o0.OooO00o<OUT> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o0OOOO00<OUT> f40292OooO00o;

        public OooO00o(o0OOOO00<OUT> o0oooo01) {
            this.f40292OooO00o = o0oooo01;
        }

        @Override // o0O000o0.OooO00o
        public final void OooO00o() {
            this.f40292OooO00o.OooO00o();
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0OOOO00<OUT> f40293Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o0OOOO00<OUT> o0oooo01) {
            super(0);
            this.f40293Oooo0o = o0oooo01;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OO0oO0.OooO00o oooO00o = this.f40293Oooo0o.f40295OooO0O0;
            if (oooO00o != null) {
                oooO00o.OooO00o();
            }
            return Unit.INSTANCE;
        }
    }

    public o0OOOO00(@NotNull o0OO pulseAdapter, @NotNull o0O000o0.OooO0O0<OUT> receiver) {
        Intrinsics.checkNotNullParameter(pulseAdapter, "pulseAdapter");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        this.f40291OooO0OO = new o0OOO0(pulseAdapter.OooO00o(), new OooO0O0(this));
        receiver.OooooOo(new OooO00o(this));
    }

    public void OooO00o() {
        o0OOO0 o0ooo1 = this.f40291OooO0OO;
        Job job = o0ooo1.f40285OooO0OO;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        o0ooo1.OooO00o();
    }

    @Override // p448o0OoOoOO.o0OO0oO0
    public final void start() {
        if (!this.f40294OooO00o) {
            this.f40294OooO00o = true;
        }
        this.f40291OooO0OO.OooO00o();
    }

    @Override // p448o0OoOoOO.o0OO0oO0
    public final void stop() {
        if (this.f40294OooO00o) {
            this.f40294OooO00o = false;
        }
        Job job = this.f40291OooO0OO.f40285OooO0OO;
        if (job == null) {
            return;
        }
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
    }
}
