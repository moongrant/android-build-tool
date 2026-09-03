package p002OooO0Oo;

import OooO0O0.OooO0o;
import com.facebook.appevents.UserDataStore;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f110OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f111OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f112OooO0o0;

    public /* synthetic */ OooOOO0(int i, Object obj, Object obj2) {
        this.f110OooO0Oo = i;
        this.f112OooO0o0 = obj;
        this.f111OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f110OooO0Oo;
        Object obj = this.f111OooO0o;
        Object obj2 = this.f112OooO0o0;
        switch (i) {
            case 0:
                OooOo this$0 = (OooOo) obj2;
                OooO0o nativeAppInfo = (OooO0o) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(nativeAppInfo, "$nativeAppInfo");
                this$0.OooO0o(nativeAppInfo);
                break;
            default:
                UserDataStore.m4074writeDataIntoCache$lambda0((String) obj2, (String) obj);
                break;
        }
    }
}
