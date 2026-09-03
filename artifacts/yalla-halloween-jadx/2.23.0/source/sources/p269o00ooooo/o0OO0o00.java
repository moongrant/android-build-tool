package p269o00ooooo;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@WorkerThread
public final class o0OO0o00 implements Runnable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Map f41200OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0OOooO0 f41201OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Throwable f41202OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f41203OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final byte[] f41204OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f41205OooO0oo;

    public /* synthetic */ o0OO0o00(String str, o0OOooO0 o0ooooo0, int i, IOException iOException, byte[] bArr, Map map) {
        Preconditions.checkNotNull(o0ooooo0);
        this.f41201OooO0Oo = o0ooooo0;
        this.f41203OooO0o0 = i;
        this.f41202OooO0o = iOException;
        this.f41204OooO0oO = bArr;
        this.f41205OooO0oo = str;
        this.f41200OooO = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41201OooO0Oo.OooO00o(this.f41205OooO0oo, this.f41203OooO0o0, this.f41202OooO0o, this.f41204OooO0oO, this.f41200OooO);
    }
}
