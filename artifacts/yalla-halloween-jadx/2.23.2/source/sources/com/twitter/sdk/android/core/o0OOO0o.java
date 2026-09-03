package com.twitter.sdk.android.core;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO0o extends o000oOoO<TwitterAuthToken> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @SerializedName("user_name")
    private final String f21750OooO0OO;

    public static class OooO00o implements p348o0OOOOo.OooOo00<o0OOO0o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final com.google.gson.OooOOO0 f21751OooO00o = new com.google.gson.OooOOO0();

        @Override // p348o0OOOOo.OooOo00
        public final o0OOO0o OooO00o(String str) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    return (o0OOO0o) this.f21751OooO00o.OooO0OO(str, o0OOO0o.class);
                } catch (Exception e) {
                    o00O0O.OooO0OO().OooO0O0("Twitter", e.getMessage());
                }
            }
            return null;
        }

        @Override // p348o0OOOOo.OooOo00
        public final String OooO0O0(o0OOO0o o0ooo0o2) {
            o0OOO0o o0ooo0o3 = o0ooo0o2;
            if (o0ooo0o3 != null && o0ooo0o3.OooO00o() != null) {
                try {
                    return this.f21751OooO00o.OooO0oo(o0ooo0o3);
                } catch (Exception e) {
                    o00O0O.OooO0OO().OooO0O0("Twitter", e.getMessage());
                }
            }
            return "";
        }
    }

    public o0OOO0o(long j, TwitterAuthToken twitterAuthToken, String str) {
        super(twitterAuthToken, j);
        this.f21750OooO0OO = str;
    }

    @Override // com.twitter.sdk.android.core.o000oOoO
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o0OOO0o.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        String str = this.f21750OooO0OO;
        String str2 = ((o0OOO0o) obj).f21750OooO0OO;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    @Override // com.twitter.sdk.android.core.o000oOoO
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f21750OooO0OO;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
