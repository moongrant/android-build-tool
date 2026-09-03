package com.twitter.sdk.android.core;

import com.google.gson.annotations.SerializedName;
import com.twitter.sdk.android.core.OooO00o;

/* JADX INFO: loaded from: classes2.dex */
public class o000oOoO<T extends OooO00o> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @SerializedName("auth_token")
    private final T f21734OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @SerializedName("id")
    private final long f21735OooO0O0;

    public o000oOoO(T t, long j) {
        if (t == null) {
            throw new IllegalArgumentException("AuthToken must not be null.");
        }
        this.f21734OooO00o = t;
        this.f21735OooO0O0 = j;
    }

    public final T OooO00o() {
        return this.f21734OooO00o;
    }

    public final long OooO0O0() {
        return this.f21735OooO0O0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        o000oOoO o000oooo2 = (o000oOoO) obj;
        if (this.f21735OooO0O0 != o000oooo2.f21735OooO0O0) {
            return false;
        }
        T t = this.f21734OooO00o;
        T t2 = o000oooo2.f21734OooO00o;
        if (t != null) {
            return t.equals(t2);
        }
        return t2 == null;
    }

    public int hashCode() {
        T t = this.f21734OooO00o;
        int iHashCode = t != null ? t.hashCode() : 0;
        long j = this.f21735OooO0O0;
        return (iHashCode * 31) + ((int) (j ^ (j >>> 32)));
    }
}
