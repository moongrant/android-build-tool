package o0OOOOOO;

import android.app.Application;
import android.content.Context;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f42822OooO00o;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final HashSet f42823OooO00o = new HashSet();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Application f42824OooO0O0;

        public OooO00o(Application application) {
            this.f42824OooO0O0 = application;
        }
    }

    /* JADX INFO: renamed from: o0OOOOOO.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static abstract class AbstractC0449OooO0O0 {
    }

    public OooO0O0(Context context) {
        this.f42822OooO00o = new OooO00o((Application) context.getApplicationContext());
    }
}
