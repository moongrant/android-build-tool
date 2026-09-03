package p271o00ooooo;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@WorkerThread
public final class oO00o00O implements Runnable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Map f40589OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oO0OOO00 f40590OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Throwable f40591OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f40592OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final byte[] f40593OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f40594OooO0oo;

    public /* synthetic */ oO00o00O(String str, oO0OOO00 oo0ooo00, int i, IOException iOException, byte[] bArr, Map map) {
        Preconditions.checkNotNull(oo0ooo00);
        this.f40590OooO0Oo = oo0ooo00;
        this.f40592OooO0o0 = i;
        this.f40591OooO0o = iOException;
        this.f40593OooO0oO = bArr;
        this.f40594OooO0oo = str;
        this.f40589OooO = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40590OooO0Oo.OooO00o(this.f40594OooO0oo, this.f40592OooO0o0, this.f40591OooO0o, this.f40593OooO0oO, this.f40589OooO);
    }
}
