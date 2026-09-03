package p286o0O0OOoO;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.firebase.components.oo000o;
import java.util.concurrent.atomic.AtomicReference;
import p022Oooo00O.o00O00OO;
import p025Oooo0OO.o000O000;
import p291o0O0Oo0o.o00Oo0;
import p301o0O0o0O.OooO0OO;
import p301o0O0o0O.OooO0o;

/* JADX INFO: loaded from: classes3.dex */
public final class o00oO0o implements o00Ooo {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO00o f41433OooO0OO = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0OO<o00Ooo> f41434OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AtomicReference<o00Ooo> f41435OooO0O0 = new AtomicReference<>(null);

    public static final class OooO00o implements o0Oo0oo {
    }

    public o00oO0o(OooO0OO<o00Ooo> oooO0OO) {
        this.f41434OooO00o = oooO0OO;
        ((oo000o) oooO0OO).OooO00o(new o000O000(this));
    }

    @Override // p286o0O0OOoO.o00Ooo
    @NonNull
    public final o0Oo0oo OooO00o(@NonNull String str) {
        o00Ooo o00ooo2 = this.f41435OooO0O0.get();
        return o00ooo2 == null ? f41433OooO0OO : o00ooo2.OooO00o(str);
    }

    @Override // p286o0O0OOoO.o00Ooo
    public final boolean OooO0O0() {
        o00Ooo o00ooo2 = this.f41435OooO0O0.get();
        return o00ooo2 != null && o00ooo2.OooO0O0();
    }

    @Override // p286o0O0OOoO.o00Ooo
    public final boolean OooO0OO(@NonNull String str) {
        o00Ooo o00ooo2 = this.f41435OooO0O0.get();
        return o00ooo2 != null && o00ooo2.OooO0OO(str);
    }

    @Override // p286o0O0OOoO.o00Ooo
    public final void OooO0Oo(@NonNull final String str, @NonNull final String str2, final long j, @NonNull final o00Oo0 o00oo1) {
        String strOooO00o = o00O00OO.OooO00o("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strOooO00o, null);
        }
        ((oo000o) this.f41434OooO00o).OooO00o(new OooO0OO.OooO00o() { // from class: o0O0OOoO.oo000o
            @Override // o0O0o0O.OooO0OO.OooO00o
            public final void OooO00o(OooO0o oooO0o) {
                ((o00Ooo) oooO0o.get()).OooO0Oo(str, str2, j, o00oo1);
            }
        });
    }
}
