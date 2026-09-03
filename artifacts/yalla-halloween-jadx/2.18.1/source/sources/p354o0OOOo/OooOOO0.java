package p354o0OOOo;

import android.util.Log;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicReference;
import o0O0O0o0.OooO0OO;
import p016OooOoO0.OooOo00;
import p357o0OOOo0O.o0000oo;
import p375o0OOo0oo.o0OOO0o;
import p375o0OOo0oo.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 implements OooOO0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO00o f38300OooO0OO = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0ooOOo<OooOO0> f38301OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AtomicReference<OooOO0> f38302OooO0O0 = new AtomicReference<>(null);

    public static final class OooO00o implements OooOOOO {
    }

    public OooOOO0(o0ooOOo<OooOO0> o0ooooo2) {
        this.f38301OooO00o = o0ooooo2;
        ((o0000oo) o0ooooo2).OooO00o(new OooO0OO(this, 2));
    }

    @Override // p354o0OOOo.OooOO0
    @NonNull
    public final OooOOOO OooO00o(@NonNull String str) {
        OooOO0 oooOO1 = this.f38302OooO0O0.get();
        return oooOO1 == null ? f38300OooO0OO : oooOO1.OooO00o(str);
    }

    @Override // p354o0OOOo.OooOO0
    public final boolean OooO0O0() {
        OooOO0 oooOO1 = this.f38302OooO0O0.get();
        return oooOO1 != null && oooOO1.OooO0O0();
    }

    @Override // p354o0OOOo.OooOO0
    public final boolean OooO0OO(@NonNull String str) {
        OooOO0 oooOO1 = this.f38302OooO0O0.get();
        return oooOO1 != null && oooOO1.OooO0OO(str);
    }

    @Override // p354o0OOOo.OooOO0
    public final void OooO0Oo(@NonNull final String str, @NonNull final String str2, final long j, @NonNull final p362o0OOOoo.o0ooOOo o0ooooo2) {
        String strOooO0Oo = OooOo00.OooO0Oo("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strOooO0Oo, null);
        }
        ((o0000oo) this.f38301OooO00o).OooO00o(new o0ooOOo.OooO00o() { // from class: o0OOOo.OooOO0O
            @Override // o0OOo0oo.o0ooOOo.OooO00o
            public final void OooO0O0(o0OOO0o o0ooo0o2) {
                ((OooOO0) o0ooo0o2.get()).OooO0Oo(str, str2, j, o0ooooo2);
            }
        });
    }
}
