package p309o0O0oO0o;

import com.google.firebase.perf.v1.ApplicationInfo;
import p307o0O0oO0.OooOOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Ooo extends o0OOO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooOOO0 f42493OooO0O0 = OooOOO0.OooO0Oo();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ApplicationInfo f42494OooO00o;

    public o00Ooo(ApplicationInfo applicationInfo) {
        this.f42494OooO00o = applicationInfo;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0062 A[RETURN] */
    @Override // p309o0O0oO0o.o0OOO0o
    public final boolean OooO00o() {
        boolean z;
        OooOOO0 oooOOO0 = f42493OooO0O0;
        ApplicationInfo applicationInfo = this.f42494OooO00o;
        if (applicationInfo == null) {
            oooOOO0.OooO0o("ApplicationInfo is null");
        } else if (!applicationInfo.hasGoogleAppId()) {
            oooOOO0.OooO0o("GoogleAppId is null");
        } else if (!applicationInfo.hasAppInstanceId()) {
            oooOOO0.OooO0o("AppInstanceId is null");
        } else {
            if (applicationInfo.hasApplicationProcessState()) {
                if (applicationInfo.hasAndroidAppInfo()) {
                    if (applicationInfo.getAndroidAppInfo().hasPackageName()) {
                        if (!applicationInfo.getAndroidAppInfo().hasSdkVersion()) {
                            oooOOO0.OooO0o("AndroidAppInfo.sdkVersion is null");
                        }
                        if (z) {
                            return true;
                        }
                        oooOOO0.OooO0o("ApplicationInfo is invalid");
                        return false;
                    }
                    oooOOO0.OooO0o("AndroidAppInfo.packageName is null");
                }
                z = true;
                if (z) {
                    return true;
                }
                oooOOO0.OooO0o("ApplicationInfo is invalid");
                return false;
            }
            oooOOO0.OooO0o("ApplicationProcessState is null");
        }
        z = false;
        if (z) {
            return true;
        }
        oooOOO0.OooO0o("ApplicationInfo is invalid");
        return false;
    }
}
