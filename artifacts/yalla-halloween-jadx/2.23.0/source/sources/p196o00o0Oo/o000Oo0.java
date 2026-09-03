package p196o00o0Oo;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.Objects;
import p191o00o0O0O.Oooo0;
import p191o00o0O0O.o0Oo0oo;
import p198o00o0OoO.o00;
import p199o00o0Ooo.o00OOOO0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000Oo0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00O0000 f39012OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f39013OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f39014OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Runnable f39015OooO0oO;

    public /* synthetic */ o000Oo0(o00O0000 o00o0001, Oooo0 oooo0, int i, Runnable runnable) {
        this.f39012OooO0Oo = o00o0001;
        this.f39014OooO0o0 = oooo0;
        this.f39013OooO0o = i;
        this.f39015OooO0oO = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final o0Oo0oo o0oo0oo2 = this.f39014OooO0o0;
        final int i = this.f39013OooO0o;
        Runnable runnable = this.f39015OooO0oO;
        final o00O0000 o00o0001 = this.f39012OooO0Oo;
        o00OOOO0 o00oooo1 = o00o0001.f39025OooO0o;
        try {
            try {
                o00 o00Var = o00o0001.f39023OooO0OO;
                Objects.requireNonNull(o00Var);
                o00oooo1.OooO0OO(new o000O00O(o00Var));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) o00o0001.f39021OooO00o.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    o00o0001.OooO00o(o0oo0oo2, i);
                } else {
                    o00oooo1.OooO0OO(new o00OOOO0.OooO00o() { // from class: o00o0Oo.o000O0
                        @Override // o00o0Ooo.o00OOOO0.OooO00o
                        public final Object OooO0OO() {
                            o00o0001.f39024OooO0Oo.OooO0O0(o0oo0oo2, i + 1);
                            return null;
                        }
                    });
                }
            } catch (SynchronizationException unused) {
                o00o0001.f39024OooO0Oo.OooO0O0(o0oo0oo2, i + 1);
            }
        } finally {
            runnable.run();
        }
    }
}
