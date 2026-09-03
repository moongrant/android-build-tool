package o0OO0OoO;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@WorkerThread
public final class o0ooOOo implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final byte[] f37880Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final o00oO0o f37881Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f37882Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final Throwable f37883Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final Map f37884OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final String f37885OoooO00;

    public /* synthetic */ o0ooOOo(String str, o00oO0o o00oo0o2, int i, Throwable th, byte[] bArr, Map map) {
        Preconditions.checkNotNull(o00oo0o2);
        this.f37881Oooo0o = o00oo0o2;
        this.f37882Oooo0oO = i;
        this.f37883Oooo0oo = th;
        this.f37880Oooo = bArr;
        this.f37885OoooO00 = str;
        this.f37884OoooO0 = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37881Oooo0o.OooO00o(this.f37885OoooO00, this.f37882Oooo0oO, this.f37883Oooo0oo, this.f37880Oooo, this.f37884OoooO0);
    }
}
