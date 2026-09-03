package p203o00o0o0o;

import android.util.Log;
import com.code.android.util.o0OoOo0;
import com.google.android.exoplayer2.Player;
import com.google.android.gms.measurement.AppMeasurement;
import com.yalla.yalla.ui.view.SearchLayout;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o0O0OOO.OooO00o;
import o0O0OOOo.OooO;
import p245o00oo0o.o00O;
import p283o0O0OOo.OooOOO;
import p283o0O0OOo.OooOo00;
import p284o0O0OOoO.OooOO0O;
import p298o0O0o00o.OooO0O0;
import p298o0O0o00o.OooO0OO;
import p597o0oo00o0.OooOOOO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00 implements o00O.OooO00o, OooO0O0.OooO00o, OooOOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f39152OooO0Oo;

    public /* synthetic */ o00(Object obj) {
        this.f39152OooO0Oo = obj;
    }

    @Override // o0O0o00o.OooO0O0.OooO00o
    public final void OooO00o(OooO0OO oooO0OO) {
        OooO00o oooO00o = (OooO00o) this.f39152OooO0Oo;
        oooO00o.getClass();
        OooO oooO = OooO.f42075OooO00o;
        oooO.OooO0O0("AnalyticsConnector now available.");
        o0O0OO0O.OooO00o oooO00o2 = (o0O0OO0O.OooO00o) oooO0OO.get();
        OooOo00 oooOo00 = new OooOo00(oooO00o2);
        o0O0OOO.OooO0O0 oooO0O0 = new o0O0OOO.OooO0O0();
        o0O0OO0O.OooO0O0 oooO0O0OooO0oO = oooO00o2.OooO0oO("clx", oooO0O0);
        if (oooO0O0OooO0oO == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            o0O0OO0O.OooO0O0 oooO0O0OooO0oO2 = oooO00o2.OooO0oO(AppMeasurement.CRASH_ORIGIN, oooO0O0);
            if (oooO0O0OooO0oO2 != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
            oooO0O0OooO0oO = oooO0O0OooO0oO2;
        }
        if (oooO0O0OooO0oO == null) {
            oooO.OooO0Oo("Could not register Firebase Analytics listener; a listener is already registered.", null);
            return;
        }
        oooO.OooO0O0("Registered Firebase Analytics listener.");
        p283o0O0OOo.OooOOOO oooOOOO = new p283o0O0OOo.OooOOOO();
        OooOOO oooOOO = new OooOOO(oooOo00, TimeUnit.MILLISECONDS);
        synchronized (oooO00o) {
            Iterator it = oooO00o.f42013OooO0OO.iterator();
            while (it.hasNext()) {
                oooOOOO.OooO00o((OooOO0O) it.next());
            }
            oooO0O0.f42015OooO0O0 = oooOOOO;
            oooO0O0.f42014OooO00o = oooOOO;
            oooO00o.f42012OooO0O0 = oooOOOO;
            oooO00o.f42011OooO00o = oooOOO;
        }
    }

    @Override // p597o0oo00o0.OooOOOO
    public final void OooO0OO(String str) {
        SearchLayout this$0 = (SearchLayout) this.f39152OooO0Oo;
        int i = SearchLayout.f30634OooOOO0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super String, Unit> function1 = this$0.f30638OooO0o0;
        if (function1 != null) {
            function1.invoke(o0OoOo0.OooOOO(str, ""));
        }
    }

    @Override // o00oo0o.o00O.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onTracksChanged(((o0O000o0) this.f39152OooO0Oo).f39261OooO.f40405OooO0Oo);
    }
}
