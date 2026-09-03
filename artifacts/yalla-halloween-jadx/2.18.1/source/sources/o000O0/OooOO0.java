package o000O0;

import android.util.Base64;
import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f28049OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f28050OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f28051OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<List<byte[]>> f28052OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f28053OooO0o0;

    public OooOO0(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull List<List<byte[]>> list) {
        Objects.requireNonNull(str);
        this.f28049OooO00o = str;
        Objects.requireNonNull(str2);
        this.f28050OooO0O0 = str2;
        this.f28051OooO0OO = str3;
        Objects.requireNonNull(list);
        this.f28052OooO0Oo = list;
        this.f28053OooO0o0 = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("FontRequest {mProviderAuthority: ");
        sbOooO0o0.append(this.f28049OooO00o);
        sbOooO0o0.append(", mProviderPackage: ");
        sbOooO0o0.append(this.f28050OooO0O0);
        sbOooO0o0.append(", mQuery: ");
        sbOooO0o0.append(this.f28051OooO0OO);
        sbOooO0o0.append(", mCertificates:");
        sb.append(sbOooO0o0.toString());
        for (int i = 0; i < this.f28052OooO0Oo.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.f28052OooO0Oo.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        return p058o0000OoO.OooO.OooO00o(sb, "}", "mCertificatesArray: 0");
    }
}
