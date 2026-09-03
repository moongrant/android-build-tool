package com.google.firebase.messaging;

import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Pattern f20314OooO0Oo = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f20315OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f20316OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f20317OooO0OO;

    public o0000O0(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str));
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !f20314OooO0Oo.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", strSubstring, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        this.f20315OooO00o = strSubstring;
        this.f20316OooO0O0 = str;
        this.f20317OooO0OO = p031OoooO0.o0OoOo0.OooO00o(str, "!", str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof o0000O0)) {
            return false;
        }
        o0000O0 o0000o1 = (o0000O0) obj;
        return this.f20315OooO00o.equals(o0000o1.f20315OooO00o) && this.f20316OooO0O0.equals(o0000o1.f20316OooO0O0);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f20316OooO0O0, this.f20315OooO00o);
    }
}
