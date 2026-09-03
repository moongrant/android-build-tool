package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.play_billing.zzu;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class BillingFlowParams {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f12694OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f12695OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f12696OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO0OO f12697OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ArrayList f12698OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public zzu f12699OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f12700OooO0oO;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f12701OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f12702OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public ArrayList f12703OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public ArrayList f12704OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public OooO0OO.OooO00o f12705OooO0o0;

        public OooO00o() {
            OooO0OO.OooO00o oooO00o = new OooO0OO.OooO00o();
            oooO00o.f12713OooO0O0 = true;
            this.f12705OooO0o0 = oooO00o;
        }

        @NonNull
        public final BillingFlowParams OooO00o() {
            ArrayList arrayList = this.f12704OooO0Oo;
            boolean z = true;
            boolean z2 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            ArrayList arrayList2 = this.f12703OooO0OO;
            boolean z3 = (arrayList2 == null || arrayList2.isEmpty()) ? false : true;
            if (!z2 && !z3) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            if (z2 && z3) {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            if (!z2) {
                OooO0O0 oooO0O0 = (OooO0O0) this.f12703OooO0OO.get(0);
                for (int i = 0; i < this.f12703OooO0OO.size(); i++) {
                    OooO0O0 oooO0O1 = (OooO0O0) this.f12703OooO0OO.get(i);
                    if (oooO0O1 == null) {
                        throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                    }
                    if (i != 0) {
                        ProductDetails productDetails = oooO0O1.f12706OooO00o;
                        if (!productDetails.f12755OooO0Oo.equals(oooO0O0.f12706OooO00o.f12755OooO0Oo) && !productDetails.f12755OooO0Oo.equals("play_pass_subs")) {
                            throw new IllegalArgumentException("All products should have same ProductType.");
                        }
                    }
                }
                String strOptString = oooO0O0.f12706OooO00o.f12753OooO0O0.optString(RemoteConfigConstants$RequestFieldKey.PACKAGE_NAME);
                for (OooO0O0 oooO0O2 : this.f12703OooO0OO) {
                    if (!oooO0O0.f12706OooO00o.f12755OooO0Oo.equals("play_pass_subs") && !oooO0O2.f12706OooO00o.f12755OooO0Oo.equals("play_pass_subs") && !strOptString.equals(oooO0O2.f12706OooO00o.f12753OooO0O0.optString(RemoteConfigConstants$RequestFieldKey.PACKAGE_NAME))) {
                        throw new IllegalArgumentException("All products must have the same package name.");
                    }
                }
            } else {
                if (this.f12704OooO0Oo.contains(null)) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
                if (this.f12704OooO0Oo.size() > 1) {
                    SkuDetails skuDetails = (SkuDetails) this.f12704OooO0Oo.get(0);
                    String strOooO0OO = skuDetails.OooO0OO();
                    ArrayList arrayList3 = this.f12704OooO0Oo;
                    int size = arrayList3.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        SkuDetails skuDetails2 = (SkuDetails) arrayList3.get(i2);
                        if (!strOooO0OO.equals("play_pass_subs") && !skuDetails2.OooO0OO().equals("play_pass_subs") && !strOooO0OO.equals(skuDetails2.OooO0OO())) {
                            throw new IllegalArgumentException("SKUs should have the same type.");
                        }
                    }
                    String strOptString2 = skuDetails.f12774OooO0O0.optString(RemoteConfigConstants$RequestFieldKey.PACKAGE_NAME);
                    ArrayList arrayList4 = this.f12704OooO0Oo;
                    int size2 = arrayList4.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        SkuDetails skuDetails3 = (SkuDetails) arrayList4.get(i3);
                        if (!strOooO0OO.equals("play_pass_subs") && !skuDetails3.OooO0OO().equals("play_pass_subs") && !strOptString2.equals(skuDetails3.f12774OooO0O0.optString(RemoteConfigConstants$RequestFieldKey.PACKAGE_NAME))) {
                            throw new IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                }
            }
            BillingFlowParams billingFlowParams = new BillingFlowParams();
            if ((!z2 || ((SkuDetails) this.f12704OooO0Oo.get(0)).f12774OooO0O0.optString(RemoteConfigConstants$RequestFieldKey.PACKAGE_NAME).isEmpty()) && (!z3 || ((OooO0O0) this.f12703OooO0OO.get(0)).f12706OooO00o.f12753OooO0O0.optString(RemoteConfigConstants$RequestFieldKey.PACKAGE_NAME).isEmpty())) {
                z = false;
            }
            billingFlowParams.f12694OooO00o = z;
            billingFlowParams.f12695OooO0O0 = this.f12701OooO00o;
            billingFlowParams.f12696OooO0OO = this.f12702OooO0O0;
            billingFlowParams.f12697OooO0Oo = this.f12705OooO0o0.OooO00o();
            ArrayList arrayList5 = this.f12704OooO0Oo;
            billingFlowParams.f12698OooO0o = arrayList5 != null ? new ArrayList(arrayList5) : new ArrayList();
            billingFlowParams.f12700OooO0oO = false;
            ArrayList arrayList6 = this.f12703OooO0OO;
            billingFlowParams.f12699OooO0o0 = arrayList6 != null ? zzu.zzk(arrayList6) : zzu.zzl();
            return billingFlowParams;
        }
    }

    @zzj
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ProductDetails f12706OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f12707OooO0O0;

        @zzj
        public static class OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public ProductDetails f12708OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public String f12709OooO0O0;
        }

        public /* synthetic */ OooO0O0(OooO00o oooO00o) {
            this.f12706OooO00o = oooO00o.f12708OooO00o;
            this.f12707OooO0O0 = oooO00o.f12709OooO0O0;
        }
    }

    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f12710OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f12711OooO0O0 = 0;

        public static class OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public String f12712OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public boolean f12713OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public int f12714OooO0OO = 0;

            @NonNull
            public final OooO0OO OooO00o() {
                boolean z = (TextUtils.isEmpty(this.f12712OooO00o) && TextUtils.isEmpty(null)) ? false : true;
                boolean z2 = !TextUtils.isEmpty(null);
                if (z && z2) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.f12713OooO0O0 && !z && !z2) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                OooO0OO oooO0OO = new OooO0OO();
                oooO0OO.f12710OooO00o = this.f12712OooO00o;
                oooO0OO.f12711OooO0O0 = this.f12714OooO0OO;
                return oooO0OO;
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ProrationMode {
        public static final int DEFERRED = 4;
        public static final int IMMEDIATE_AND_CHARGE_FULL_PRICE = 5;
        public static final int IMMEDIATE_AND_CHARGE_PRORATED_PRICE = 2;
        public static final int IMMEDIATE_WITHOUT_PRORATION = 3;
        public static final int IMMEDIATE_WITH_TIME_PRORATION = 1;
        public static final int UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY = 0;
    }
}
