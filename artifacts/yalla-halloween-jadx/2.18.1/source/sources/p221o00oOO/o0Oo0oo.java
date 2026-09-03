package p221o00oOO;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Objects;
import p217o00oO00o.o000000;

/* JADX INFO: loaded from: classes.dex */
public final class o0Oo0oo implements o000000 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0OO00O f33754OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final URL f33755OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final String f33756OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public URL f33757OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public String f33758OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public volatile byte[] f33759OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f33760OooO0oo;

    public o0Oo0oo(URL url) {
        o0O0O00 o0o0o00 = o0OO00O.f33748OooO00o;
        Objects.requireNonNull(url, "Argument must not be null");
        this.f33755OooO0OO = url;
        this.f33756OooO0Oo = null;
        Objects.requireNonNull(o0o0o00, "Argument must not be null");
        this.f33754OooO0O0 = o0o0o00;
    }

    @Override // p217o00oO00o.o000000
    public final void OooO00o(@NonNull MessageDigest messageDigest) {
        if (this.f33759OooO0oO == null) {
            this.f33759OooO0oO = OooO0OO().getBytes(o000000.f33631OooO00o);
        }
        messageDigest.update(this.f33759OooO0oO);
    }

    public final String OooO0OO() {
        String str = this.f33756OooO0Oo;
        if (str != null) {
            return str;
        }
        URL url = this.f33755OooO0OO;
        Objects.requireNonNull(url, "Argument must not be null");
        return url.toString();
    }

    public final String OooO0Oo() {
        if (TextUtils.isEmpty(this.f33758OooO0o0)) {
            String string = this.f33756OooO0Oo;
            if (TextUtils.isEmpty(string)) {
                URL url = this.f33755OooO0OO;
                Objects.requireNonNull(url, "Argument must not be null");
                string = url.toString();
            }
            this.f33758OooO0o0 = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f33758OooO0o0;
    }

    @Override // p217o00oO00o.o000000
    public final boolean equals(Object obj) {
        if (!(obj instanceof o0Oo0oo)) {
            return false;
        }
        o0Oo0oo o0oo0oo2 = (o0Oo0oo) obj;
        return OooO0OO().equals(o0oo0oo2.OooO0OO()) && this.f33754OooO0O0.equals(o0oo0oo2.f33754OooO0O0);
    }

    @Override // p217o00oO00o.o000000
    public final int hashCode() {
        if (this.f33760OooO0oo == 0) {
            int iHashCode = OooO0OO().hashCode();
            this.f33760OooO0oo = iHashCode;
            this.f33760OooO0oo = this.f33754OooO0O0.hashCode() + (iHashCode * 31);
        }
        return this.f33760OooO0oo;
    }

    public final String toString() {
        return OooO0OO();
    }

    public o0Oo0oo(String str) {
        o0O0O00 o0o0o00 = o0OO00O.f33748OooO00o;
        this.f33755OooO0OO = null;
        if (!TextUtils.isEmpty(str)) {
            this.f33756OooO0Oo = str;
            Objects.requireNonNull(o0o0o00, "Argument must not be null");
            this.f33754OooO0O0 = o0o0o00;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
