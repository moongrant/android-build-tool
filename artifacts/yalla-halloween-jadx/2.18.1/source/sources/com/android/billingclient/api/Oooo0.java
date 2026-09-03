package com.android.billingclient.api;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f11242OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public List f11243OooO0O0;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f11244OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public ArrayList f11245OooO0O0;

        public OooO00o() {
        }

        public /* synthetic */ OooO00o(o000000 o000000Var) {
        }

        @NonNull
        public final Oooo0 OooO00o() {
            String str = this.f11244OooO00o;
            if (str == null) {
                throw new IllegalArgumentException("SKU type must be set");
            }
            ArrayList arrayList = this.f11245OooO0O0;
            if (arrayList == null) {
                throw new IllegalArgumentException("SKU list or SkuWithOffer list must be set");
            }
            Oooo0 oooo0 = new Oooo0();
            oooo0.f11242OooO00o = str;
            oooo0.f11243OooO0O0 = arrayList;
            return oooo0;
        }
    }
}
