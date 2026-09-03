package com.android.billingclient.api;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.play_billing.zzb;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f9655OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f9656OooO0O0;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f9657OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f9658OooO0O0 = "";

        @NonNull
        public final OooOo00 OooO00o() {
            OooOo00 oooOo00 = new OooOo00();
            oooOo00.f9655OooO00o = this.f9657OooO00o;
            oooOo00.f9656OooO0O0 = this.f9658OooO0O0;
            return oooOo00;
        }
    }

    @NonNull
    public static OooO00o OooO0O0() {
        return new OooO00o();
    }

    public final int OooO00o() {
        return this.f9655OooO00o;
    }

    @NonNull
    public final String toString() {
        return p031OoooO0.o00Ooo.OooO00o("Response Code: ", zzb.zzl(this.f9655OooO00o), ", Debug Message: ", this.f9656OooO0O0);
    }
}
