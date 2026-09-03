package p154o00Oo0oo;

import androidx.annotation.NonNull;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public interface o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Charset f37833OooO00o = Charset.forName("UTF-8");

    void OooO0O0(@NonNull MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
