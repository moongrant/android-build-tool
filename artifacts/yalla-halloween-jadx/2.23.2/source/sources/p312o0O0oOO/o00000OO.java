package p312o0O0oOO;

import androidx.compose.animation.OooOOO;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import p308o0O0oO.OooO;
import p316o0O0oOo0.o0OO00O;
import p641o0ooOO0o.o00OO;
import p641o0ooOO0o.o00OOO00;
import p641o0ooOO0o.o0O000O;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p653o0ooo00O.o0000O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000OO implements o00OOO00 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00OOO00 f41838OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Timer f41839OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO f41840OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f41841OooO0oO;

    public o00000OO(o00OOO00 o00ooo00, o0OO00O o0oo00o2, Timer timer, long j) {
        this.f41838OooO0Oo = o00ooo00;
        this.f41840OooO0o0 = new OooO(o0oo00o2);
        this.f41841OooO0oO = j;
        this.f41839OooO0o = timer;
    }

    @Override // p641o0ooOO0o.o00OOO00
    public final void onFailure(o00OO o00oo2, IOException iOException) {
        o0O00O0o o0o00o0o = ((o0000O0) o00oo2).f59307OooO0o0;
        OooO oooO = this.f41840OooO0o0;
        if (o0o00o0o != null) {
            o0O000O o0o000o = o0o00o0o.f57828OooO00o;
            if (o0o000o != null) {
                try {
                    oooO.OooOO0O(new URL(o0o000o.f57788OooO).toString());
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }
            }
            String str = o0o00o0o.f57829OooO0O0;
            if (str != null) {
                oooO.OooO0Oo(str);
            }
        }
        oooO.OooO0oO(this.f41841OooO0oO);
        OooOOO.OooO00o(this.f41839OooO0o, oooO, oooO);
        this.f41838OooO0Oo.onFailure(o00oo2, iOException);
    }

    @Override // p641o0ooOO0o.o00OOO00
    public final void onResponse(o00OO o00oo2, o0O00o00 o0o00o01) throws IOException {
        FirebasePerfOkHttpClient.OooO00o(o0o00o01, this.f41840OooO0o0, this.f41841OooO0oO, this.f41839OooO0o.OooO00o());
        this.f41838OooO0Oo.onResponse(o00oo2, o0o00o01);
    }
}
