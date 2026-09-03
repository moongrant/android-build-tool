package p217o00oO00o;

import androidx.annotation.NonNull;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public interface o000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Charset f33631OooO00o = Charset.forName("UTF-8");

    void OooO00o(@NonNull MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
