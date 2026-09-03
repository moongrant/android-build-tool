package OooOO0;

import android.database.SQLException;
import android.util.Log;
import com.google.android.datatransport.Priority;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o000O0O0.OooOo;
import o000O0O0.o000oOoO;
import p191o00o0O0O.o000000;
import p191o00o0O0O.o0O0O00;
import p195o00o0OOo.o000O0O0;
import p296o0O0Oooo.o00O0OO0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f165OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f166OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f167OooO0o0;

    public /* synthetic */ OooO00o(int i, Object obj, Object obj2) {
        this.f165OooO0Oo = i;
        this.f167OooO0o0 = obj;
        this.f166OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f165OooO0Oo) {
            case 0:
                OooO this$0 = (OooO) this.f167OooO0o0;
                OooO0O0.OooO0o nativeAppInfo = (OooO0O0.OooO0o) this.f166OooO0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(nativeAppInfo, "$nativeAppInfo");
                this$0.OooO0o(nativeAppInfo);
                return;
            case 1:
                o000oOoO this$1 = (o000oOoO) this.f167OooO0o0;
                String[] tables = (String[]) this.f166OooO0o;
                int i = o000oOoO.OooO0O0.f34783OooO0o0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullParameter(tables, "$tables");
                OooOo oooOo = this$1.f34774OooO0O0;
                String[] tables2 = (String[]) Arrays.copyOf(tables, tables.length);
                oooOo.getClass();
                Intrinsics.checkNotNullParameter(tables2, "tables");
                synchronized (oooOo.f34740OooOO0O) {
                    Iterator<Map.Entry<K, V>> it = oooOo.f34740OooOO0O.iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        Intrinsics.checkNotNullExpressionValue(entry, "(observer, wrapper)");
                        OooOo.OooO0OO oooO0OO = (OooOo.OooO0OO) entry.getKey();
                        OooOo.OooO0o oooO0o = (OooOo.OooO0o) entry.getValue();
                        oooO0OO.getClass();
                        if (!(oooO0OO instanceof o000oOoO.OooO00o)) {
                            oooO0o.OooO0O0(tables2);
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                }
                return;
            default:
                o00O0OO0 o00o0oo1 = (o00O0OO0) this.f167OooO0o0;
                CountDownLatch countDownLatch = (CountDownLatch) this.f166OooO0o;
                o00o0oo1.getClass();
                try {
                    p176o00o0.o000oOoO<CrashlyticsReport> o000oooo2 = o00o0oo1.f42343OooO0oo;
                    Priority priority = Priority.HIGHEST;
                    if (o000oooo2 instanceof o0O0O00) {
                        o000000.OooO00o().f38927OooO0Oo.OooO00o(((o0O0O00) o000oooo2).f38937OooO00o.OooO0o0(priority), 1);
                    } else {
                        String strOooO0OO = o000O0O0.OooO0OO("ForcedSender");
                        if (Log.isLoggable(strOooO0OO, 5)) {
                            Log.w(strOooO0OO, String.format("Expected instance of `TransportImpl`, got `%s`.", o000oooo2));
                        }
                    }
                    break;
                } catch (SQLException unused) {
                }
                countDownLatch.countDown();
                return;
        }
    }
}
