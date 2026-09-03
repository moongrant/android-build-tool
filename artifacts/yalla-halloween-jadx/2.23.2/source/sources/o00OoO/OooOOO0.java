package o00OoO;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.net.URL;
import java.security.MessageDigest;
import p174o00OooOo.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 implements p154o00Oo0oo.o0OOO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOO f37865OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final URL f37866OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final String f37867OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public URL f37868OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public String f37869OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public volatile byte[] f37870OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f37871OooO0oo;

    public OooOOO0(URL url) {
        OooOo00 oooOo00 = OooOOO.f37864OooO00o;
        o00OO00O.OooO0O0(url);
        this.f37866OooO0OO = url;
        this.f37867OooO0Oo = null;
        o00OO00O.OooO0O0(oooOo00);
        this.f37865OooO0O0 = oooOo00;
    }

    @Override // p154o00Oo0oo.o0OOO0o
    public final void OooO0O0(@NonNull MessageDigest messageDigest) {
        if (this.f37870OooO0oO == null) {
            this.f37870OooO0oO = OooO0OO().getBytes(p154o00Oo0oo.o0OOO0o.f37833OooO00o);
        }
        messageDigest.update(this.f37870OooO0oO);
    }

    public final String OooO0OO() {
        String str = this.f37867OooO0Oo;
        if (str != null) {
            return str;
        }
        URL url = this.f37866OooO0OO;
        o00OO00O.OooO0O0(url);
        return url.toString();
    }

    public final String OooO0Oo() {
        if (TextUtils.isEmpty(this.f37869OooO0o0)) {
            String string = this.f37867OooO0Oo;
            if (TextUtils.isEmpty(string)) {
                URL url = this.f37866OooO0OO;
                o00OO00O.OooO0O0(url);
                string = url.toString();
            }
            this.f37869OooO0o0 = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f37869OooO0o0;
    }

    @Override // p154o00Oo0oo.o0OOO0o
    public final boolean equals(Object obj) {
        if (!(obj instanceof OooOOO0)) {
            return false;
        }
        OooOOO0 oooOOO0 = (OooOOO0) obj;
        return OooO0OO().equals(oooOOO0.OooO0OO()) && this.f37865OooO0O0.equals(oooOOO0.f37865OooO0O0);
    }

    @Override // p154o00Oo0oo.o0OOO0o
    public final int hashCode() {
        if (this.f37871OooO0oo == 0) {
            int iHashCode = OooO0OO().hashCode();
            this.f37871OooO0oo = iHashCode;
            this.f37871OooO0oo = this.f37865OooO0O0.hashCode() + (iHashCode * 31);
        }
        return this.f37871OooO0oo;
    }

    public final String toString() {
        return OooO0OO();
    }

    public OooOOO0(String str) {
        OooOo00 oooOo00 = OooOOO.f37864OooO00o;
        this.f37866OooO0OO = null;
        if (!TextUtils.isEmpty(str)) {
            this.f37867OooO0Oo = str;
            o00OO00O.OooO0O0(oooOo00);
            this.f37865OooO0O0 = oooOo00;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
