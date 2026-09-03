package com.twitter.sdk.android.core;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public final class o0Oo0oo extends o0OoOo0<TwitterAuthToken> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @SerializedName("user_name")
    private final String f22227OooO0OO;

    public static class OooO00o implements p344o0OOOOOo.OooOOOO<o0Oo0oo> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final com.google.gson.OooOOO0 f22228OooO00o = new com.google.gson.OooOOO0();

        @Override // p344o0OOOOOo.OooOOOO
        public final o0Oo0oo OooO00o(String str) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    return (o0Oo0oo) this.f22228OooO00o.OooO0OO(str, o0Oo0oo.class);
                } catch (Exception e) {
                    o00Oo0.OooO0OO().OooO0O0("Twitter", e.getMessage());
                }
            }
            return null;
        }

        @Override // p344o0OOOOOo.OooOOOO
        public final String OooO0O0(o0Oo0oo o0oo0oo2) {
            o0Oo0oo o0oo0oo3 = o0oo0oo2;
            if (o0oo0oo3 != null && o0oo0oo3.OooO00o() != null) {
                try {
                    return this.f22228OooO00o.OooO0oo(o0oo0oo3);
                } catch (Exception e) {
                    o00Oo0.OooO0OO().OooO0O0("Twitter", e.getMessage());
                }
            }
            return "";
        }
    }

    public o0Oo0oo(long j, TwitterAuthToken twitterAuthToken, String str) {
        super(twitterAuthToken, j);
        this.f22227OooO0OO = str;
    }

    @Override // com.twitter.sdk.android.core.o0OoOo0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o0Oo0oo.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        String str = this.f22227OooO0OO;
        String str2 = ((o0Oo0oo) obj).f22227OooO0OO;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    @Override // com.twitter.sdk.android.core.o0OoOo0
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f22227OooO0OO;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
