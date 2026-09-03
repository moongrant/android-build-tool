package androidx.media3.session;

import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o000O0 implements o000OoO.o00000O0.OooO00o, o0O0o0O.OooO0OO.OooO00o, p559o0oOo.o00O0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f9304OooO0Oo;

    public /* synthetic */ o000O0(Object obj) {
        this.f9304OooO0Oo = obj;
    }

    @Override // o0O0o0O.OooO0OO.OooO00o
    public final void OooO00o(p301o0O0o0O.OooO0o oooO0o) {
        p285o0O0OOo.OooOO0O oooOO0O = (p285o0O0OOo.OooOO0O) this.f9304OooO0Oo;
        oooOO0O.getClass();
        p286o0O0OOoO.o0OOO0o o0ooo0o2 = p286o0O0OOoO.o0OOO0o.f41436OooO00o;
        o0ooo0o2.OooO0O0("AnalyticsConnector now available.");
        o0O0OOO0.OooO00o oooO00o = (o0O0OOO0.OooO00o) oooO0o.get();
        p287o0O0OOoo.o000000 o000000Var = new p287o0O0OOoo.o000000(oooO00o);
        p285o0O0OOo.OooOOO0 oooOOO0 = new p285o0O0OOo.OooOOO0();
        o0O0OOO0.OooO0O0 oooO0O0OooO0oO = oooO00o.OooO0oO("clx", oooOOO0);
        if (oooO0O0OooO0oO == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            o0O0OOO0.OooO0O0 oooO0O0OooO0oO2 = oooO00o.OooO0oO(AppMeasurement.CRASH_ORIGIN, oooOOO0);
            if (oooO0O0OooO0oO2 != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
            oooO0O0OooO0oO = oooO0O0OooO0oO2;
        }
        if (oooO0O0OooO0oO == null) {
            o0ooo0o2.OooO0Oo("Could not register Firebase Analytics listener; a listener is already registered.", null);
            return;
        }
        o0ooo0o2.OooO0O0("Registered Firebase Analytics listener.");
        p287o0O0OOoo.o000OOo o000ooo2 = new p287o0O0OOoo.o000OOo();
        p287o0O0OOoo.o0O0O00 o0o0o00 = new p287o0O0OOoo.o0O0O00(o000000Var, TimeUnit.MILLISECONDS);
        synchronized (oooOO0O) {
            Iterator it = oooOO0O.f41425OooO0OO.iterator();
            while (it.hasNext()) {
                o000ooo2.OooO00o((p464o0OooO0.o00000OO) it.next());
            }
            oooOOO0.f41428OooO0O0 = o000ooo2;
            oooOOO0.f41427OooO00o = o0o0o00;
            oooOO0O.f41424OooO0O0 = o000ooo2;
            oooOO0O.f41423OooO00o = o0o0o00;
        }
    }

    @Override // p559o0oOo.o00O0O
    public final void OooO0OO() {
        TopicBlackListActivity this$0 = (TopicBlackListActivity) this.f9304OooO0Oo;
        int i = TopicBlackListActivity.f25826OooOo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooOoO0(true);
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((o000OO0O) this.f9304OooO0Oo).getClass();
        throw null;
    }
}
