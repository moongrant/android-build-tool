package com.airbnb.lottie;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static int f11806OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static volatile oo0O.OooO f11807OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static volatile oo0O.OooO0o f11808OooO0OO;

    public class OooO00o implements oo0O.OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Context f11809OooO00o;

        public OooO00o(Context context) {
            this.f11809OooO00o = context;
        }
    }

    public static void OooO00o() {
        int i = f11806OooO00o;
        if (i > 0) {
            f11806OooO00o = i - 1;
        }
    }

    @NonNull
    public static oo0O.OooO0o OooO0O0(@NonNull Context context) {
        Context applicationContext = context.getApplicationContext();
        oo0O.OooO0o oooO0o = f11808OooO0OO;
        if (oooO0o == null) {
            synchronized (oo0O.OooO0o.class) {
                oooO0o = f11808OooO0OO;
                if (oooO0o == null) {
                    oooO0o = new oo0O.OooO0o(new OooO00o(applicationContext));
                    f11808OooO0OO = oooO0o;
                }
            }
        }
        return oooO0o;
    }
}
