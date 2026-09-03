package com.twitter.sdk.android.core;

import com.google.gson.annotations.SerializedName;
import com.twitter.sdk.android.core.OooO00o;

/* JADX INFO: loaded from: classes4.dex */
public class o0OoOo0<T extends OooO00o> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @SerializedName("auth_token")
    private final T f22229OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @SerializedName("id")
    private final long f22230OooO0O0;

    public o0OoOo0(T t, long j) {
        if (t == null) {
            throw new IllegalArgumentException("AuthToken must not be null.");
        }
        this.f22229OooO00o = t;
        this.f22230OooO0O0 = j;
    }

    public final T OooO00o() {
        return this.f22229OooO00o;
    }

    public final long OooO0O0() {
        return this.f22230OooO0O0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        o0OoOo0 o0oooo0 = (o0OoOo0) obj;
        if (this.f22230OooO0O0 != o0oooo0.f22230OooO0O0) {
            return false;
        }
        T t = this.f22229OooO00o;
        T t2 = o0oooo0.f22229OooO00o;
        if (t != null) {
            return t.equals(t2);
        }
        return t2 == null;
    }

    public int hashCode() {
        T t = this.f22229OooO00o;
        int iHashCode = t != null ? t.hashCode() : 0;
        long j = this.f22230OooO0O0;
        return (iHashCode * 31) + ((int) (j ^ (j >>> 32)));
    }
}
