package p246o00oo0o0;

import android.support.v4.media.session.OooO0o;
import androidx.annotation.Nullable;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class o000OO0O implements Comparable<o000OO0O> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final long f40716OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f40717OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f40718OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f40719OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f40720OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final File f40721OooO0oo;

    public o000OO0O(String str, long j, long j2, long j3, @Nullable File file) {
        this.f40717OooO0Oo = str;
        this.f40719OooO0o0 = j;
        this.f40718OooO0o = j2;
        this.f40720OooO0oO = file != null;
        this.f40721OooO0oo = file;
        this.f40716OooO = j3;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final int compareTo(o000OO0O o000oo0o2) {
        String str = o000oo0o2.f40717OooO0Oo;
        String str2 = this.f40717OooO0Oo;
        if (!str2.equals(str)) {
            return str2.compareTo(o000oo0o2.f40717OooO0Oo);
        }
        long j = this.f40719OooO0o0 - o000oo0o2.f40719OooO0o0;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.f40719OooO0o0);
        sb.append(", ");
        return OooO0o.OooO0O0(sb, this.f40718OooO0o, "]");
    }
}
