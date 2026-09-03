package o00OO00O;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.net.URL;
import java.security.MessageDigest;
import p126o00O0oOo.o000OOo;
import p532o0o0Oo.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 implements o000OOo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOO f37103OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final URL f37104OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final String f37105OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public URL f37106OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public String f37107OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public volatile byte[] f37108OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f37109OooO0oo;

    public OooOOO0(URL url) {
        OooOo00 oooOo00 = OooOOO.f37102OooO00o;
        o0000O00.OooO0O0(url);
        this.f37104OooO0OO = url;
        this.f37105OooO0Oo = null;
        o0000O00.OooO0O0(oooOo00);
        this.f37103OooO0O0 = oooOo00;
    }

    @Override // p126o00O0oOo.o000OOo
    public final void OooO00o(@NonNull MessageDigest messageDigest) {
        if (this.f37108OooO0oO == null) {
            this.f37108OooO0oO = OooO0OO().getBytes(o000OOo.f36731OooO00o);
        }
        messageDigest.update(this.f37108OooO0oO);
    }

    public final String OooO0OO() {
        String str = this.f37105OooO0Oo;
        if (str != null) {
            return str;
        }
        URL url = this.f37104OooO0OO;
        o0000O00.OooO0O0(url);
        return url.toString();
    }

    public final String OooO0Oo() {
        if (TextUtils.isEmpty(this.f37107OooO0o0)) {
            String string = this.f37105OooO0Oo;
            if (TextUtils.isEmpty(string)) {
                URL url = this.f37104OooO0OO;
                o0000O00.OooO0O0(url);
                string = url.toString();
            }
            this.f37107OooO0o0 = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f37107OooO0o0;
    }

    @Override // p126o00O0oOo.o000OOo
    public final boolean equals(Object obj) {
        if (!(obj instanceof OooOOO0)) {
            return false;
        }
        OooOOO0 oooOOO0 = (OooOOO0) obj;
        return OooO0OO().equals(oooOOO0.OooO0OO()) && this.f37103OooO0O0.equals(oooOOO0.f37103OooO0O0);
    }

    @Override // p126o00O0oOo.o000OOo
    public final int hashCode() {
        if (this.f37109OooO0oo == 0) {
            int iHashCode = OooO0OO().hashCode();
            this.f37109OooO0oo = iHashCode;
            this.f37109OooO0oo = this.f37103OooO0O0.hashCode() + (iHashCode * 31);
        }
        return this.f37109OooO0oo;
    }

    public final String toString() {
        return OooO0OO();
    }

    public OooOOO0(String str) {
        OooOo00 oooOo00 = OooOOO.f37102OooO00o;
        this.f37104OooO0OO = null;
        if (!TextUtils.isEmpty(str)) {
            this.f37105OooO0Oo = str;
            o0000O00.OooO0O0(oooOo00);
            this.f37103OooO0O0 = oooOo00;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
