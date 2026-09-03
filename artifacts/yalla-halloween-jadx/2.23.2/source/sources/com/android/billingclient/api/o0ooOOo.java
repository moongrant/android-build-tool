package com.android.billingclient.api;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f12853OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public List f12854OooO0O0;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f12855OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public ArrayList f12856OooO0O0;

        public /* synthetic */ OooO00o(int i) {
        }

        @NonNull
        public final o0ooOOo OooO00o() {
            String str = this.f12855OooO00o;
            if (str == null) {
                throw new IllegalArgumentException("SKU type must be set");
            }
            ArrayList arrayList = this.f12856OooO0O0;
            if (arrayList == null) {
                throw new IllegalArgumentException("SKU list or SkuWithOffer list must be set");
            }
            o0ooOOo o0ooooo = new o0ooOOo();
            o0ooooo.f12853OooO00o = str;
            o0ooooo.f12854OooO0O0 = arrayList;
            return o0ooooo;
        }
    }
}
