package o0000O0;

import android.util.Base64;
import androidx.annotation.NonNull;
import java.util.List;
import p023Oooo00o.oO00Oo00;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f34054OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f34055OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f34056OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<List<byte[]>> f34057OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f34058OooO0o0;

    public OooOO0(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull List<List<byte[]>> list) {
        str.getClass();
        this.f34054OooO00o = str;
        str2.getClass();
        this.f34055OooO0O0 = str2;
        this.f34056OooO0OO = str3;
        list.getClass();
        this.f34057OooO0Oo = list;
        this.f34058OooO0o0 = oO00Oo00.OooO00o(str, "-", str2, "-", str3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f34054OooO00o + ", mProviderPackage: " + this.f34055OooO0O0 + ", mQuery: " + this.f34056OooO0OO + ", mCertificates:");
        int i = 0;
        while (true) {
            List<List<byte[]>> list = this.f34057OooO0Oo;
            if (i >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List<byte[]> list2 = list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list2.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i++;
        }
    }
}
