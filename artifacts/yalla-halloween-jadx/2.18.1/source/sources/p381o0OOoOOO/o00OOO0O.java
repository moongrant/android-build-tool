package p381o0OOoOOO;

import OooO0o.OooO0OO;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OOO0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Pattern f38785OooO0Oo = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f38786OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f38787OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f38788OooO0OO;

    public o00OOO0O(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str));
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !f38785OooO0Oo.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", strSubstring, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        this.f38786OooO00o = strSubstring;
        this.f38787OooO0O0 = str;
        this.f38788OooO0OO = OooO0OO.OooO00o(str, "!", str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof o00OOO0O)) {
            return false;
        }
        o00OOO0O o00ooo0o2 = (o00OOO0O) obj;
        return this.f38786OooO00o.equals(o00ooo0o2.f38786OooO00o) && this.f38787OooO0O0.equals(o00ooo0o2.f38787OooO0O0);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f38787OooO0O0, this.f38786OooO00o);
    }
}
