package p295o0O0OoO;

import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import com.yalla.yalla.ui.dialog.RoomLuckyNumberHistoryDialog;
import com.yalla.yalla.ui.fragment.MainMomentsTopicAddMoreFragment;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import p228o00oOo.o0000OO0;
import p296o0O0OoO0.OooOOOO;
import p296o0O0OoO0.o00oO0o;
import p356o0OOOo00.OooO0O0;
import p358o0OOOo0o.o0000O;
import p358o0OOOo0o.o000OO;
import p359o0OOOoO.Oooo0;
import p360o0OOOoO0.OooO;
import p360o0OOOoO0.OooO0o;
import p360o0OOOoO0.OooOO0;
import p375o0OOo0oo.o0OOO0o;
import p375o0OOo0oo.o0ooOOo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00Ooo implements OooOOOO.OooO0o, o0ooOOo.OooO00o, p186o00o00Oo.o0ooOOo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f35849OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f35850OooO0o0;

    public /* synthetic */ o00Ooo(Object obj, int i) {
        this.f35849OooO0Oo = i;
        this.f35850OooO0o0 = obj;
    }

    @Override // o0O0OoO0.OooOOOO.OooO0o
    public final long OooO00o(long j) {
        return ((o00oO0o) this.f35850OooO0o0).OooO0oO(j);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<o0OOOoO.Oooo0>] */
    @Override // o0OOo0oo.o0ooOOo.OooO00o
    public final void OooO0O0(o0OOO0o o0ooo0o2) {
        o000OO o000oo2 = (o000OO) this.f35850OooO0o0;
        Objects.requireNonNull(o000oo2);
        o0000OO0 o0000oo1 = o0000OO0.f33887OooO00o;
        o0000oo1.OooO0Oo("AnalyticsConnector now available.");
        OooO0O0 oooO0O0 = (OooO0O0) o0ooo0o2.get();
        OooOO0 oooOO1 = new OooOO0(oooO0O0);
        o0000O o0000o2 = new o0000O();
        OooO0O0.OooO00o oooO00oOooO0O0 = oooO0O0.OooO0O0("clx", o0000o2);
        if (oooO00oOooO0O0 == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            oooO00oOooO0O0 = oooO0O0.OooO0O0(AppMeasurement.CRASH_ORIGIN, o0000o2);
            if (oooO00oOooO0O0 != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
        }
        if (oooO00oOooO0O0 == null) {
            o0000oo1.OooOOO0("Could not register Firebase Analytics listener; a listener is already registered.", null);
            return;
        }
        o0000oo1.OooO0Oo("Registered Firebase Analytics listener.");
        OooO oooO = new OooO();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        OooO0o oooO0o = new OooO0o(oooOO1);
        synchronized (o000oo2) {
            Iterator it = o000oo2.f38390OooO0OO.iterator();
            while (it.hasNext()) {
                oooO.OooO00o((Oooo0) it.next());
            }
            o0000o2.f38382OooO0O0 = oooO;
            o0000o2.f38381OooO00o = oooO0o;
            o000oo2.f38389OooO0O0 = oooO;
            o000oo2.f38388OooO00o = oooO0o;
        }
    }

    @Override // p186o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        switch (this.f35849OooO0Oo) {
            case 2:
                RoomLuckyNumberHistoryDialog this$0 = (RoomLuckyNumberHistoryDialog) this.f35850OooO0o0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOOo0(true);
                break;
            default:
                MainMomentsTopicAddMoreFragment.m345initView$lambda2((MainMomentsTopicAddMoreFragment) this.f35850OooO0o0);
                break;
        }
    }
}
