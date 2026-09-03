package o0O0OOOo;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.firebase.components.o00Ooo;
import java.util.concurrent.atomic.AtomicReference;
import p022Oooo00O.o00O00OO;
import p203o00o0o0o.o0O0ooO;
import p287o0O0Oo0.OooOO0O;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO implements o0O0OOOo.OooO00o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO00o f42080OooO0OO = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final p298o0O0o00o.OooO0O0<o0O0OOOo.OooO00o> f42081OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AtomicReference<o0O0OOOo.OooO00o> f42082OooO0O0 = new AtomicReference<>(null);

    public static final class OooO00o implements OooOO0 {
    }

    public OooO0OO(p298o0O0o00o.OooO0O0<o0O0OOOo.OooO00o> oooO0O0) {
        this.f42081OooO00o = oooO0O0;
        ((o00Ooo) oooO0O0).OooO00o(new o0O0ooO(this));
    }

    @Override // o0O0OOOo.OooO00o
    @NonNull
    public final OooOO0 OooO00o(@NonNull String str) {
        o0O0OOOo.OooO00o oooO00o = this.f42082OooO0O0.get();
        return oooO00o == null ? f42080OooO0OO : oooO00o.OooO00o(str);
    }

    @Override // o0O0OOOo.OooO00o
    public final boolean OooO0O0() {
        o0O0OOOo.OooO00o oooO00o = this.f42082OooO0O0.get();
        return oooO00o != null && oooO00o.OooO0O0();
    }

    @Override // o0O0OOOo.OooO00o
    public final void OooO0OO(@NonNull final String str, @NonNull final String str2, final long j, @NonNull final OooOO0O oooOO0O) {
        String strOooO00o = o00O00OO.OooO00o("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strOooO00o, null);
        }
        ((o00Ooo) this.f42081OooO00o).OooO00o(new o0O0o00o.OooO0O0.OooO00o() { // from class: o0O0OOOo.OooO0O0
            @Override // o0O0o00o.OooO0O0.OooO00o
            public final void OooO00o(p298o0O0o00o.OooO0OO oooO0OO) {
                ((OooO00o) oooO0OO.get()).OooO0OO(str, str2, j, oooOO0O);
            }
        });
    }

    @Override // o0O0OOOo.OooO00o
    public final boolean OooO0Oo(@NonNull String str) {
        o0O0OOOo.OooO00o oooO00o = this.f42082OooO0O0.get();
        return oooO00o != null && oooO00o.OooO0Oo(str);
    }
}
