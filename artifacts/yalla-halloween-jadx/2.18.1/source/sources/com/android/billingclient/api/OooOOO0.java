package com.android.billingclient.api;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.play_billing.zzb;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f11236OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f11237OooO0O0;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f11238OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f11239OooO0O0 = "";

        @NonNull
        public final OooOOO0 OooO00o() {
            OooOOO0 oooOOO0 = new OooOOO0();
            oooOOO0.f11236OooO00o = this.f11238OooO00o;
            oooOOO0.f11237OooO0O0 = this.f11239OooO0O0;
            return oooOOO0;
        }
    }

    @NonNull
    public static OooO00o OooO00o() {
        return new OooO00o();
    }

    @NonNull
    public final String toString() {
        String strZzk = zzb.zzk(this.f11236OooO00o);
        String str = this.f11237OooO0O0;
        StringBuilder sb = new StringBuilder(String.valueOf(strZzk).length() + 32 + String.valueOf(str).length());
        sb.append("Response Code: ");
        sb.append(strZzk);
        sb.append(", Debug Message: ");
        sb.append(str);
        return sb.toString();
    }
}
