package p246o00oo0Oo;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.Objects;
import p238o00oOooo.o0O0o000;
import p238o00oOooo.o0OO00OO;
import p247o00oo0o.o000O00;
import p248o00oo0o0.o0000oo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O000 f40116OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f40117OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0OO00OO f40118OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Runnable f40119OooO0oO;

    public /* synthetic */ o0000(o000O000 o000o001, o0O0o000 o0o0o000, int i, Runnable runnable) {
        this.f40116OooO0Oo = o000o001;
        this.f40118OooO0o0 = o0o0o000;
        this.f40117OooO0o = i;
        this.f40119OooO0oO = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final o0OO00OO o0oo00oo2 = this.f40118OooO0o0;
        final int i = this.f40117OooO0o;
        Runnable runnable = this.f40119OooO0oO;
        final o000O000 o000o001 = this.f40116OooO0Oo;
        o000O00 o000o01 = o000o001.f40147OooO0o;
        try {
            try {
                o0000oo o0000ooVar = o000o001.f40145OooO0OO;
                Objects.requireNonNull(o0000ooVar);
                o000o01.OooO0OO(new o0000O00(o0000ooVar));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) o000o001.f40143OooO00o.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    o000o001.OooO00o(o0oo00oo2, i);
                } else {
                    o000o01.OooO0OO(new o000O00.OooO00o() { // from class: o00oo0Oo.o0000oo
                        @Override // o00oo0o.o000O00.OooO00o
                        public final Object OooO0OO() {
                            o000o001.f40146OooO0Oo.OooO00o(o0oo00oo2, i + 1);
                            return null;
                        }
                    });
                }
            } catch (SynchronizationException unused) {
                o000o001.f40146OooO0Oo.OooO00o(o0oo00oo2, i + 1);
            }
        } finally {
            runnable.run();
        }
    }
}
