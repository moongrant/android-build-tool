package o000Oo0;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class OooO implements Comparable<OooO> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final long f34784OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f34785OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f34786OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f34787OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f34788OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final File f34789OooO0oo;

    public OooO(String str, long j, long j2, long j3, @Nullable File file) {
        this.f34785OooO0Oo = str;
        this.f34787OooO0o0 = j;
        this.f34786OooO0o = j2;
        this.f34788OooO0oO = file != null;
        this.f34789OooO0oo = file;
        this.f34784OooO = j3;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final int compareTo(OooO oooO) {
        String str = oooO.f34785OooO0Oo;
        String str2 = this.f34785OooO0Oo;
        if (!str2.equals(str)) {
            return str2.compareTo(oooO.f34785OooO0Oo);
        }
        long j = this.f34787OooO0o0 - oooO.f34787OooO0o0;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.f34787OooO0o0);
        sb.append(", ");
        return android.support.v4.media.session.OooO0OO.OooO0O0(sb, this.f34786OooO0o, "]");
    }
}
