package o00O0OOO;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.WorkerParameters;
import oo00o.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o00oO0o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00000O0 f36300OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final WorkerParameters.OooO00o f36301OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final oo00o.o0ooOOo f36302OooO0o0;

    public o00oO0o(@NonNull o00000O0 o00000o1, @NonNull oo00o.o0ooOOo o0ooooo, @Nullable WorkerParameters.OooO00o oooO00o) {
        this.f36300OooO0Oo = o00000o1;
        this.f36302OooO0o0 = o0ooooo;
        this.f36301OooO0o = oooO00o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f36300OooO0Oo.f60223OooO0o.OooOO0(this.f36302OooO0o0, this.f36301OooO0o);
    }
}
