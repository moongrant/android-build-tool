package o0O0OOO;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.Objects;
import p286o0O0O0oO.o0OO00O;
import p288o0O0OOo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO0OO implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Runnable f35563Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooOo f35564Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0OO00O f35565Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f35566Oooo0oo;

    public /* synthetic */ OooO0OO(OooOo oooOo, o0OO00O o0oo00o2, int i, Runnable runnable) {
        this.f35564Oooo0o = oooOo;
        this.f35565Oooo0oO = o0oo00o2;
        this.f35566Oooo0oo = i;
        this.f35563Oooo = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final OooOo oooOo = this.f35564Oooo0o;
        final o0OO00O o0oo00o2 = this.f35565Oooo0oO;
        final int i = this.f35566Oooo0oo;
        Runnable runnable = this.f35563Oooo;
        Objects.requireNonNull(oooOo);
        try {
            try {
                o00Oo0 o00oo1 = oooOo.f35586OooO0o;
                o0O0OOOo.OooO0o oooO0o = oooOo.f35584OooO0OO;
                Objects.requireNonNull(oooO0o);
                o00oo1.OooO0O0(new oOO00O.OooO0o(oooO0o));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) oooOo.f35582OooO00o.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    oooOo.OooO00o(o0oo00o2, i);
                } else {
                    oooOo.f35586OooO0o.OooO0O0(new o00Oo0.OooO00o() { // from class: o0O0OOO.OooOOO0
                        @Override // o0O0OOo.o00Oo0.OooO00o
                        public final Object OooO0O0() {
                            OooOo oooOo2 = oooOo;
                            oooOo2.f35585OooO0Oo.OooO00o(o0oo00o2, i + 1);
                            return null;
                        }
                    });
                }
            } catch (SynchronizationException unused) {
                oooOo.f35585OooO0Oo.OooO00o(o0oo00o2, i + 1);
            }
        } finally {
            runnable.run();
        }
    }
}
