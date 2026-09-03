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
    public boolean f9603OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f9604OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f9605OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO0OO f9606OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ArrayList f9607OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public zzu f9608OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f9609OooO0oO;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f9610OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f9611OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public ArrayList f9612OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public ArrayList f9613OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public OooO0OO.OooO00o f9614OooO0o0;

        public OooO00o() {
            OooO0OO.OooO00o oooO00o = new OooO0OO.OooO00o();
            oooO00o.f9622OooO0O0 = true;
            this.f9614OooO0o0 = oooO00o;
        }

        @NonNull
        public final BillingFlowParams OooO00o() {
            ArrayList arrayList = this.f9613OooO0Oo;
            boolean z = true;
            boolean z2 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            ArrayList arrayList2 = this.f9612OooO0OO;
            boolean z3 = (arrayList2 == null || arrayList2.isEmpty()) ? false : true;
            if (!z2 && !z3) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            if (z2 && z3) {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            if (!z2) {
                OooO0O0 oooO0O0 = (OooO0O0) this.f9612OooO0OO.get(0);
                for (int i = 0; i < this.f9612OooO0OO.size(); i++) {
                    OooO0O0 oooO0O1 = (OooO0O0) this.f9612OooO0OO.get(i);
                    if (oooO0O1 == null) {
                        throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                    }
                    if (i != 0) {
                        ProductDetails productDetails = oooO0O1.f9615OooO00o;
                        if (!productDetails.f9664OooO0Oo.equals(oooO0O0.f9615OooO00o.f9664OooO0Oo) && !productDetails.f9664OooO0Oo.equals("play_pass_subs")) {
                            throw new IllegalArgumentException("All products should have same ProductType.");
                        }
                    }
                }
                String strOptString = oooO0O0.f9615OooO00o.f9662OooO0O0.optString(RemoteConfigConstants$RequestFieldKey.PACKAGE_NAME);
                for (OooO0O0 oooO0O2 : this.f9612OooO0OO) {
                    if (!oooO0O0.f9615OooO00o.f9664OooO0Oo.equals("play_pass_subs") && !oooO0O2.f9615OooO00o.f9664OooO0Oo.equals("play_pass_subs") && !strOptString.equals(oooO0O2.f9615OooO00o.f9662OooO0O0.optString(RemoteConfigConstants$RequestFieldKey.PACKAGE_NAME))) {
                        throw new IllegalArgumentException("All products must have the same package name.");
                    }
                }
            } else {
                if (this.f9613OooO0Oo.contains(null)) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
                if (this.f9613OooO0Oo.size() > 1) {
                    SkuDetails skuDetails = (SkuDetails) this.f9613OooO0Oo.get(0);
                    String strOooO0OO = skuDetails.OooO0OO();
                    ArrayList arrayList3 = this.f9613OooO0Oo;
                    int size = arrayList3.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        SkuDetails skuDetails2 = (SkuDetails) arrayList3.get(i2);
                        if (!strOooO0OO.equals("play_pass_subs") && !skuDetails2.OooO0OO().equals("play_pass_subs") && !strOooO0OO.equals(skuDetails2.OooO0OO())) {
                            throw new IllegalArgumentException("SKUs should have the same type.");
                        }
                    }
                    String strOptString2 = skuDetails.f9683OooO0O0.optString(RemoteConfigConstants$RequestFieldKey.PACKAGE_NAME);
                    ArrayList arrayList4 = this.f9613OooO0Oo;
                    int size2 = arrayList4.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        SkuDetails skuDetails3 = (SkuDetails) arrayList4.get(i3);
                        if (!strOooO0OO.equals("play_pass_subs") && !skuDetails3.OooO0OO().equals("play_pass_subs") && !strOptString2.equals(skuDetails3.f9683OooO0O0.optString(RemoteConfigConstants$RequestFieldKey.PACKAGE_NAME))) {
                            throw new IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                }
            }
            BillingFlowParams billingFlowParams = new BillingFlowParams();
            if ((!z2 || ((SkuDetails) this.f9613OooO0Oo.get(0)).f9683OooO0O0.optString(RemoteConfigConstants$RequestFieldKey.PACKAGE_NAME).isEmpty()) && (!z3 || ((OooO0O0) this.f9612OooO0OO.get(0)).f9615OooO00o.f9662OooO0O0.optString(RemoteConfigConstants$RequestFieldKey.PACKAGE_NAME).isEmpty())) {
                z = false;
            }
            billingFlowParams.f9603OooO00o = z;
            billingFlowParams.f9604OooO0O0 = this.f9610OooO00o;
            billingFlowParams.f9605OooO0OO = this.f9611OooO0O0;
            billingFlowParams.f9606OooO0Oo = this.f9614OooO0o0.OooO00o();
            ArrayList arrayList5 = this.f9613OooO0Oo;
            billingFlowParams.f9607OooO0o = arrayList5 != null ? new ArrayList(arrayList5) : new ArrayList();
            billingFlowParams.f9609OooO0oO = false;
            ArrayList arrayList6 = this.f9612OooO0OO;
            billingFlowParams.f9608OooO0o0 = arrayList6 != null ? zzu.zzk(arrayList6) : zzu.zzl();
            return billingFlowParams;
        }
    }

    @zzj
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ProductDetails f9615OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f9616OooO0O0;

        @zzj
        public static class OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public ProductDetails f9617OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public String f9618OooO0O0;
        }

        public /* synthetic */ OooO0O0(OooO00o oooO00o) {
            this.f9615OooO00o = oooO00o.f9617OooO00o;
            this.f9616OooO0O0 = oooO00o.f9618OooO0O0;
        }
    }

    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f9619OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f9620OooO0O0 = 0;

        public static class OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public String f9621OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public boolean f9622OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public int f9623OooO0OO = 0;

            @NonNull
            public final OooO0OO OooO00o() {
                boolean z = (TextUtils.isEmpty(this.f9621OooO00o) && TextUtils.isEmpty(null)) ? false : true;
                boolean z2 = !TextUtils.isEmpty(null);
                if (z && z2) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.f9622OooO0O0 && !z && !z2) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                OooO0OO oooO0OO = new OooO0OO();
                oooO0OO.f9619OooO00o = this.f9621OooO00o;
                oooO0OO.f9620OooO0O0 = this.f9623OooO0OO;
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
