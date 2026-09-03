package com.google.firebase.messaging;

import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O00 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Pattern f19848OooO0Oo = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f19849OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f19850OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f19851OooO0OO;

    public o0000O00(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str));
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !f19848OooO0Oo.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", strSubstring, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        this.f19849OooO00o = strSubstring;
        this.f19850OooO0O0 = str;
        this.f19851OooO0OO = p031OoooO0.o0OoOo0.OooO0O0(str, "!", str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof o0000O00)) {
            return false;
        }
        o0000O00 o0000o00 = (o0000O00) obj;
        return this.f19849OooO00o.equals(o0000o00.f19849OooO00o) && this.f19850OooO0O0.equals(o0000o00.f19850OooO0O0);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f19850OooO0O0, this.f19849OooO00o);
    }
}
