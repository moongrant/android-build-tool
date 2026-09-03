package p317o0O0oOo0;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.firebase.perf.util.OooO;
import com.google.firebase.perf.util.OooOO0O;
import com.google.firebase.perf.v1.AndroidApplicationInfo;
import com.google.firebase.perf.v1.ApplicationInfo;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import p058o0000Ooo.o00Oo0;
import p233o00oOoOO.o0O00O0o;
import p302o0O0o0O.OooO0o;
import p310o0O0oO0.o000OOo0;
import p310o0O0oO0.o00O000;
import p322o0O0oo0O.o000OOo;
import p628o0ooO.o0Oo0oo;
import p679oooOO0.oo0o0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0ooOOo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f41931OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f41932OooO0o0;

    public /* synthetic */ o0ooOOo(Object obj, int i) {
        this.f41931OooO0Oo = i;
        this.f41932OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o00O000 o00o001;
        String strOooO00o;
        String str;
        String str2;
        switch (this.f41931OooO0Oo) {
            case 0:
                o0OO00O o0oo00o2 = (o0OO00O) this.f41932OooO0o0;
                o0Oo0oo o0oo0oo2 = o0oo00o2.f41913OooO0oO;
                o0oo0oo2.OooO00o();
                Context context = o0oo0oo2.f57229OooO00o;
                o0oo00o2.f41919OooOOO0 = context;
                o0oo00o2.f41922OooOOo = context.getPackageName();
                o0oo00o2.f41918OooOOO = o000OOo0.OooO0o0();
                o0oo00o2.f41920OooOOOO = new o00oO0o(o0oo00o2.f41919OooOOO0, new OooOO0O(100L, 1L, TimeUnit.MINUTES));
                o0oo00o2.f41921OooOOOo = oo0o0Oo.OooO00o();
                OooO0o<o0O00O0o> oooO0o = o0oo00o2.f41915OooOO0;
                o000OOo0 o000ooo1 = o0oo00o2.f41918OooOOO;
                o000ooo1.getClass();
                o00O000 o00o002 = o00O000.f41788OooO00o;
                synchronized (o00O000.class) {
                    if (o00O000.f41788OooO00o == null) {
                        o00O000.f41788OooO00o = new o00O000();
                    }
                    o00o001 = o00O000.f41788OooO00o;
                }
                if (o000OOo.f42032OooO00o.booleanValue()) {
                    o00o001.getClass();
                    strOooO00o = "FIREPERF";
                } else {
                    o00o001.getClass();
                    long jLongValue = ((Long) o000ooo1.f41779OooO00o.getRemoteConfigValueOrDefault("fpr_log_source", -1L)).longValue();
                    Map<Long, String> map = o00O000.f41789OooO0O0;
                    if (!map.containsKey(Long.valueOf(jLongValue)) || (str = map.get(Long.valueOf(jLongValue))) == null) {
                        OooO<String> oooOOooO0Oo = o000ooo1.OooO0Oo(o00o001);
                        strOooO00o = oooOOooO0Oo.OooO0O0() ? oooOOooO0Oo.OooO00o() : "FIREPERF";
                    } else {
                        o000ooo1.f41781OooO0OO.OooO0o0("com.google.firebase.perf.LogSourceName", str);
                        strOooO00o = str;
                    }
                }
                o0oo00o2.f41916OooOO0O = new o00Ooo(oooO0o, strOooO00o);
                o0oo00o2.f41921OooOOOo.OooO0Oo(new WeakReference<>(o0OO00O.f41908OooOo0O));
                ApplicationInfo.OooO0O0 oooO0O0NewBuilder = ApplicationInfo.newBuilder();
                o0oo00o2.f41923OooOOo0 = oooO0O0NewBuilder;
                o0Oo0oo o0oo0oo3 = o0oo00o2.f41913OooO0oO;
                o0oo0oo3.OooO00o();
                oooO0O0NewBuilder.OooO0oo(o0oo0oo3.f57231OooO0OO.f57219OooO0O0);
                AndroidApplicationInfo.OooO0O0 oooO0O0NewBuilder2 = AndroidApplicationInfo.newBuilder();
                oooO0O0NewBuilder2.OooO0O0(o0oo00o2.f41922OooOOo);
                oooO0O0NewBuilder2.OooO0Oo();
                Context context2 = o0oo00o2.f41919OooOOO0;
                try {
                    str2 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
                    if (str2 == null) {
                        str2 = "";
                    }
                    while (true) {
                        ConcurrentLinkedQueue<oo000o> concurrentLinkedQueue = o0oo00o2.f41912OooO0o0;
                        if (concurrentLinkedQueue.isEmpty()) {
                            return;
                        }
                        oo000o oo000oVarPoll = concurrentLinkedQueue.poll();
                        if (oo000oVarPoll != null) {
                            o0oo00o2.f41917OooOO0o.execute(new o00Oo0(2, o0oo00o2, oo000oVarPoll));
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                oooO0O0NewBuilder2.OooO0o0(str2);
                oooO0O0NewBuilder.OooO0o0(oooO0O0NewBuilder2);
                o0oo00o2.f41911OooO0o.set(true);
                break;
            default:
                UserInfoEditActivity this$0 = (UserInfoEditActivity) this.f41932OooO0o0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoo();
                this$0.OooOoO().f45672OooO0O0.requestLayout();
                return;
        }
    }
}
