package com.airbnb.lottie;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static int f8716OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static volatile p114o00O00o.OooOO0O f8717OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static volatile p114o00O00o.OooOO0 f8718OooO0OO;

    public class OooO00o implements p114o00O00o.OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Context f8719OooO00o;

        public OooO00o(Context context) {
            this.f8719OooO00o = context;
        }
    }

    public static void OooO00o() {
        int i = f8716OooO00o;
        if (i > 0) {
            f8716OooO00o = i - 1;
        }
    }

    @NonNull
    public static p114o00O00o.OooOO0 OooO0O0(@NonNull Context context) {
        Context applicationContext = context.getApplicationContext();
        p114o00O00o.OooOO0 oooOO1 = f8718OooO0OO;
        if (oooOO1 == null) {
            synchronized (p114o00O00o.OooOO0.class) {
                oooOO1 = f8718OooO0OO;
                if (oooOO1 == null) {
                    oooOO1 = new p114o00O00o.OooOO0(new OooO00o(applicationContext));
                    f8718OooO0OO = oooOO1;
                }
            }
        }
        return oooOO1;
    }
}
