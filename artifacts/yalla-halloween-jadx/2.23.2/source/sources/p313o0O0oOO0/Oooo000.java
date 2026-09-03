package p313o0O0oOO0;

import com.google.firebase.perf.v1.ApplicationInfo;
import p311o0O0oO0o.o0O0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo000 extends o00O0O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o0O0O00 f41855OooO0O0 = o0O0O00.OooO0Oo();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ApplicationInfo f41856OooO00o;

    public Oooo000(ApplicationInfo applicationInfo) {
        this.f41856OooO00o = applicationInfo;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0062 A[RETURN] */
    @Override // p313o0O0oOO0.o00O0O
    public final boolean OooO00o() {
        boolean z;
        o0O0O00 o0o0o00 = f41855OooO0O0;
        ApplicationInfo applicationInfo = this.f41856OooO00o;
        if (applicationInfo == null) {
            o0o0o00.OooO0o("ApplicationInfo is null");
        } else if (!applicationInfo.hasGoogleAppId()) {
            o0o0o00.OooO0o("GoogleAppId is null");
        } else if (!applicationInfo.hasAppInstanceId()) {
            o0o0o00.OooO0o("AppInstanceId is null");
        } else {
            if (applicationInfo.hasApplicationProcessState()) {
                if (applicationInfo.hasAndroidAppInfo()) {
                    if (applicationInfo.getAndroidAppInfo().hasPackageName()) {
                        if (!applicationInfo.getAndroidAppInfo().hasSdkVersion()) {
                            o0o0o00.OooO0o("AndroidAppInfo.sdkVersion is null");
                        }
                        if (z) {
                            return true;
                        }
                        o0o0o00.OooO0o("ApplicationInfo is invalid");
                        return false;
                    }
                    o0o0o00.OooO0o("AndroidAppInfo.packageName is null");
                }
                z = true;
                if (z) {
                    return true;
                }
                o0o0o00.OooO0o("ApplicationInfo is invalid");
                return false;
            }
            o0o0o00.OooO0o("ApplicationProcessState is null");
        }
        z = false;
        if (z) {
            return true;
        }
        o0o0o00.OooO0o("ApplicationInfo is invalid");
        return false;
    }
}
