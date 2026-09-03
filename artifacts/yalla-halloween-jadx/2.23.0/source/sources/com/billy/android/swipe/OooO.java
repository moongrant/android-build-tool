package com.billy.android.swipe;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static OooO00o f9795OooO00o;

    public interface OooO00o {
        SmartSwipeWrapper OooO00o();
    }

    static {
        boolean z;
        try {
            try {
                Object objNewInstance = Class.forName("com.billy.android.swipe.androidx.WrapperFactory").getConstructor(new Class[0]).newInstance(new Object[0]);
                if (objNewInstance instanceof OooO00o) {
                    f9795OooO00o = (OooO00o) objNewInstance;
                }
                z = true;
            } catch (Exception unused) {
                z = false;
            }
            if (z) {
                return;
            }
            try {
                Object objNewInstance2 = Class.forName("com.billy.android.swipe.support.WrapperFactory").getConstructor(new Class[0]).newInstance(new Object[0]);
                if (objNewInstance2 instanceof OooO00o) {
                    f9795OooO00o = (OooO00o) objNewInstance2;
                }
            } catch (Exception unused2) {
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
