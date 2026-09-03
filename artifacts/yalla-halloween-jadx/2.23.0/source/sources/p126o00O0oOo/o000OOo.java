package p126o00O0oOo;

import androidx.annotation.NonNull;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public interface o000OOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Charset f36731OooO00o = Charset.forName("UTF-8");

    void OooO00o(@NonNull MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
