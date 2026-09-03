package p440o0OoOOoO;

import android.app.Application;
import android.content.Context;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class o0oOo0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f40190OooO00o;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Set<Application.ActivityLifecycleCallbacks> f40191OooO00o = new HashSet();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Application f40192OooO0O0;

        public OooO00o(Application application) {
            this.f40192OooO0O0 = application;
        }
    }

    public static abstract class OooO0O0 {
    }

    public o0oOo0O0(Context context) {
        this.f40190OooO00o = new OooO00o((Application) context.getApplicationContext());
    }
}
