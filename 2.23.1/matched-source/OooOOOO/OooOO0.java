package OooOOOO;

import com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f189OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f190OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f191OooO0o0;

    public /* synthetic */ OooOO0(int i, Object obj, Object obj2) {
        this.f189OooO0Oo = i;
        this.f191OooO0o0 = obj;
        this.f190OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f189OooO0Oo;
        Object obj = this.f190OooO0o;
        Object obj2 = this.f191OooO0o0;
        switch (i) {
            case 0:
                OooOO0O this$0 = (OooOO0O) obj2;
                OooO0O0.OooO0o nativeAppInfo = (OooO0O0.OooO0o) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(nativeAppInfo, "$nativeAppInfo");
                this$0.OooO0oO(nativeAppInfo);
                break;
            default:
                InAppPurchaseBillingClientWrapper.m4091queryPurchaseHistory$lambda0((InAppPurchaseBillingClientWrapper) obj2, (Runnable) obj);
                break;
        }
    }
}
