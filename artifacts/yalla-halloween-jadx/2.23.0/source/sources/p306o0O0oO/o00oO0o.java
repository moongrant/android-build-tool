package p306o0O0oO;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import o0O0oo00.OooOOO;
import p308o0O0oO0O.o00O0O;
import p634o0ooO0oO.o00O00o0;
import p634o0ooO0oO.o00OO;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0oOOo;
import p634o0ooO0oO.oo00o;
import p646o0ooOoo.oO0Oo0oo;

/* JADX INFO: loaded from: classes3.dex */
public final class o00oO0o implements oo00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oo00o f42465OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Timer f42466OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00O0O f42467OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f42468OooO0oO;

    public o00oO0o(oo00o oo00oVar, OooOOO oooOOO, Timer timer, long j) {
        this.f42465OooO0Oo = oo00oVar;
        this.f42467OooO0o0 = new o00O0O(oooOOO);
        this.f42468OooO0oO = j;
        this.f42466OooO0o = timer;
    }

    @Override // p634o0ooO0oO.oo00o
    public final void onFailure(o00O00o0 o00o00o1, IOException iOException) {
        o00OOOOo o00ooooo2 = ((oO0Oo0oo) o00o00o1).f59655OooO0o0;
        o00O0O o00o0o2 = this.f42467OooO0o0;
        if (o00ooooo2 != null) {
            o00OO o00oo2 = o00ooooo2.f57313OooO00o;
            if (o00oo2 != null) {
                try {
                    o00o0o2.OooOO0O(new URL(o00oo2.f57202OooO).toString());
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }
            }
            String str = o00ooooo2.f57314OooO0O0;
            if (str != null) {
                o00o0o2.OooO0Oo(str);
            }
        }
        o00o0o2.OooO0oO(this.f42468OooO0oO);
        OooOo.OooO00o(this.f42466OooO0o, o00o0o2, o00o0o2);
        this.f42465OooO0Oo.onFailure(o00o00o1, iOException);
    }

    @Override // p634o0ooO0oO.oo00o
    public final void onResponse(o00O00o0 o00o00o1, o0oOOo o0oooo) throws IOException {
        FirebasePerfOkHttpClient.OooO00o(o0oooo, this.f42467OooO0o0, this.f42468OooO0oO, this.f42466OooO0o.OooO00o());
        this.f42465OooO0Oo.onResponse(o00o00o1, o0oooo);
    }
}
