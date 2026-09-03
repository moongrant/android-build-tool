package p433o0OoOO0o;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.twitter.sdk.android.core.TwitterAuthToken;
import p386o0OOoo0O.o000OOo0;
import p434o0OoOOO.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O0Oo extends o0O00OO<TwitterAuthToken> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @SerializedName("user_name")
    private final String f39946OooO0OO;

    public static class OooO00o implements o0000oo<o0O0O0Oo> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000OOo0 f39947OooO00o = new o000OOo0();

        @Override // p434o0OoOOO.o0000oo
        public final o0O0O0Oo OooO00o(String str) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    return (o0O0O0Oo) this.f39947OooO00o.OooO0OO(str, o0O0O0Oo.class);
                } catch (Exception e) {
                    o0oO0Ooo.OooO0OO().OooO0OO("Twitter", e.getMessage());
                }
            }
            return null;
        }

        @Override // p434o0OoOOO.o0000oo
        public final String OooO0O0(o0O0O0Oo o0o0o0oo) {
            o0O0O0Oo o0o0o0oo2 = o0o0o0oo;
            if (o0o0o0oo2 != null && o0o0o0oo2.OooO00o() != null) {
                try {
                    return this.f39947OooO00o.OooO0oo(o0o0o0oo2);
                } catch (Exception e) {
                    o0oO0Ooo.OooO0OO().OooO0OO("Twitter", e.getMessage());
                }
            }
            return "";
        }
    }

    public o0O0O0Oo(TwitterAuthToken twitterAuthToken, long j, String str) {
        super(twitterAuthToken, j);
        this.f39946OooO0OO = str;
    }

    @Override // p433o0OoOO0o.o0O00OO
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o0O0O0Oo.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        String str = this.f39946OooO0OO;
        String str2 = ((o0O0O0Oo) obj).f39946OooO0OO;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    @Override // p433o0OoOO0o.o0O00OO
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f39946OooO0OO;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
