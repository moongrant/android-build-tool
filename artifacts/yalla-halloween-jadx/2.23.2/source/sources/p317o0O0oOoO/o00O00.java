package p317o0O0oOoO;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.OooO0O0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import o0O0OOO0.OooO00o;
import org.json.JSONObject;
import p301o0O0o0O.OooO0o;
import p302o0O0o0OO.o0000O0O;
import p318o0O0oOoo.o00O0;
import p318o0O0oOoo.o00O0OO;
import p318o0O0oOoo.o00OO00O;
import p318o0O0oOoo.oo00o;
import p318o0O0oOoo.oo0o0O0;
import p318o0O0oOoo.oo0oOO0;
import p626o0ooO.o0OOO0o;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public final class o00O00 {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final Clock f41945OooOO0 = DefaultClock.getInstance();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final Random f41946OooOO0O = new Random();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final HashMap f41947OooOO0o = new HashMap();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @GuardedBy("this")
    public final HashMap f41948OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @GuardedBy("this")
    public final HashMap f41949OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Context f41950OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ScheduledExecutorService f41951OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0OOO0o f41952OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final FirebaseABTesting f41953OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0000O0O f41954OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final OooO0o<o0O0OOO0.OooO00o> f41955OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f41956OooO0oo;

    public static class OooO00o implements BackgroundDetector.BackgroundStateChangeListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final AtomicReference<OooO00o> f41957OooO00o = new AtomicReference<>();

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public final void onBackgroundStateChanged(boolean z) {
            Clock clock = o00O00.f41945OooOO0;
            synchronized (o00O00.class) {
                Iterator it = o00O00.f41947OooOO0o.values().iterator();
                while (it.hasNext()) {
                    ((o00O0000) it.next()).OooO0OO(z);
                }
            }
        }
    }

    @VisibleForTesting
    public o00O00() {
        throw null;
    }

    public o00O00(Context context, @Blocking ScheduledExecutorService scheduledExecutorService, o0OOO0o o0ooo0o2, o0000O0O o0000o0o2, FirebaseABTesting firebaseABTesting, OooO0o<o0O0OOO0.OooO00o> oooO0o) {
        boolean z;
        this.f41949OooO00o = new HashMap();
        this.f41948OooO = new HashMap();
        this.f41950OooO0O0 = context;
        this.f41951OooO0OO = scheduledExecutorService;
        this.f41952OooO0Oo = o0ooo0o2;
        this.f41954OooO0o0 = o0000o0o2;
        this.f41953OooO0o = firebaseABTesting;
        this.f41955OooO0oO = oooO0o;
        o0ooo0o2.OooO00o();
        this.f41956OooO0oo = o0ooo0o2.f57664OooO0OO.f57675OooO0O0;
        AtomicReference<OooO00o> atomicReference = OooO00o.f41957OooO00o;
        Application application = (Application) context.getApplicationContext();
        AtomicReference<OooO00o> atomicReference2 = OooO00o.f41957OooO00o;
        if (atomicReference2.get() == null) {
            OooO00o oooO00o = new OooO00o();
            while (true) {
                if (atomicReference2.compareAndSet(null, oooO00o)) {
                    z = true;
                    break;
                } else if (atomicReference2.get() != null) {
                    z = false;
                    break;
                }
            }
            if (z) {
                BackgroundDetector.initialize(application);
                BackgroundDetector.getInstance().addListener(oooO00o);
            }
        }
        Tasks.call(scheduledExecutorService, new Callable() { // from class: o0O0oOoO.o00O000
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f41958OooO00o.OooO00o("firebase");
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [o0O0oOoO.o00oOoo] */
    @KeepForSdk
    @VisibleForTesting
    public final synchronized o00O0000 OooO00o(String str) {
        oo00o oo00oVarOooO0OO;
        oo00o oo00oVarOooO0OO2;
        oo00o oo00oVarOooO0OO3;
        OooO0O0 oooO0O0;
        oo0o0O0 oo0o0o0;
        oo00oVarOooO0OO = OooO0OO(str, "fetch");
        oo00oVarOooO0OO2 = OooO0OO(str, "activate");
        oo00oVarOooO0OO3 = OooO0OO(str, "defaults");
        oooO0O0 = new OooO0O0(this.f41950OooO0O0.getSharedPreferences(String.format("%s_%s_%s_%s", FirebaseABTesting.OriginService.REMOTE_CONFIG, this.f41956OooO0oo, str, "settings"), 0));
        oo0o0o0 = new oo0o0O0(this.f41951OooO0OO, oo00oVarOooO0OO2, oo00oVarOooO0OO3);
        o0OOO0o o0ooo0o2 = this.f41952OooO0Oo;
        OooO0o<o0O0OOO0.OooO00o> oooO0o = this.f41955OooO0oO;
        o0ooo0o2.OooO00o();
        final o00OO00O o00oo00o = (o0ooo0o2.f57663OooO0O0.equals("[DEFAULT]") && str.equals("firebase")) ? new o00OO00O(oooO0o) : null;
        if (o00oo00o != null) {
            oo0o0o0.OooO00o(new BiConsumer() { // from class: o0O0oOoO.o00oOoo
                @Override // com.google.android.gms.common.util.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    JSONObject jSONObjectOptJSONObject;
                    o00OO00O o00oo00o2 = o00oo00o;
                    String str2 = (String) obj;
                    o00O0 o00o1 = (o00O0) obj2;
                    OooO00o oooO00o = o00oo00o2.f42000OooO00o.get();
                    if (oooO00o == null) {
                        return;
                    }
                    JSONObject jSONObject = o00o1.f41977OooO0o0;
                    if (jSONObject.length() < 1) {
                        return;
                    }
                    JSONObject jSONObject2 = o00o1.f41973OooO0O0;
                    if (jSONObject2.length() >= 1 && (jSONObjectOptJSONObject = jSONObject.optJSONObject(str2)) != null) {
                        String strOptString = jSONObjectOptJSONObject.optString("choiceId");
                        if (strOptString.isEmpty()) {
                            return;
                        }
                        synchronized (o00oo00o2.f42001OooO0O0) {
                            if (!strOptString.equals(o00oo00o2.f42001OooO0O0.get(str2))) {
                                o00oo00o2.f42001OooO0O0.put(str2, strOptString);
                                Bundle bundle = new Bundle();
                                bundle.putString("arm_key", str2);
                                bundle.putString("arm_value", jSONObject2.optString(str2));
                                bundle.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                                bundle.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                                bundle.putString("group", jSONObjectOptJSONObject.optString("group"));
                                oooO00o.OooO00o("fp", "personalization_assignment", bundle);
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("_fpid", strOptString);
                                oooO00o.OooO00o("fp", "_fpc", bundle2);
                            }
                        }
                    }
                }
            });
        }
        return OooO0O0(this.f41952OooO0Oo, str, this.f41954OooO0o0, this.f41953OooO0o, this.f41951OooO0OO, oo00oVarOooO0OO, oo00oVarOooO0OO2, oo00oVarOooO0OO3, OooO0Oo(str, oo00oVarOooO0OO, oooO0O0), oo0o0o0, oooO0O0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    @VisibleForTesting
    public final synchronized o00O0000 OooO0O0(o0OOO0o o0ooo0o2, String str, o0000O0O o0000o0o2, FirebaseABTesting firebaseABTesting, ScheduledExecutorService scheduledExecutorService, oo00o oo00oVar, oo00o oo00oVar2, oo00o oo00oVar3, ConfigFetchHandler configFetchHandler, oo0o0O0 oo0o0o0, OooO0O0 oooO0O0) {
        boolean z;
        FirebaseABTesting firebaseABTesting2;
        if (!this.f41949OooO00o.containsKey(str)) {
            if (str.equals("firebase")) {
                o0ooo0o2.OooO00o();
                z = o0ooo0o2.f57663OooO0O0.equals("[DEFAULT]");
                if (z) {
                    firebaseABTesting2 = firebaseABTesting;
                } else {
                    firebaseABTesting2 = null;
                }
                o00O0000 o00o0001 = new o00O0000(o0000o0o2, firebaseABTesting2, scheduledExecutorService, oo00oVar, oo00oVar2, oo00oVar3, configFetchHandler, oo0o0o0, oooO0O0, OooO0o0(o0ooo0o2, o0000o0o2, configFetchHandler, oo00oVar2, this.f41950OooO0O0, str, oooO0O0));
                oo00oVar2.OooO0O0();
                oo00oVar3.OooO0O0();
                oo00oVar.OooO0O0();
                this.f41949OooO00o.put(str, o00o0001);
                f41947OooOO0o.put(str, o00o0001);
            }
            if (z) {
                firebaseABTesting2 = firebaseABTesting;
            } else {
                firebaseABTesting2 = null;
            }
            o00O0000 o00o0002 = new o00O0000(o0000o0o2, firebaseABTesting2, scheduledExecutorService, oo00oVar, oo00oVar2, oo00oVar3, configFetchHandler, oo0o0o0, oooO0O0, OooO0o0(o0ooo0o2, o0000o0o2, configFetchHandler, oo00oVar2, this.f41950OooO0O0, str, oooO0O0));
            oo00oVar2.OooO0O0();
            oo00oVar3.OooO0O0();
            oo00oVar.OooO0O0();
            this.f41949OooO00o.put(str, o00o0002);
            f41947OooOO0o.put(str, o00o0002);
        }
        return (o00O0000) this.f41949OooO00o.get(str);
    }

    public final oo00o OooO0OO(String str, String str2) {
        oo0oOO0 oo0ooo0;
        String str3 = String.format("%s_%s_%s_%s.json", FirebaseABTesting.OriginService.REMOTE_CONFIG, this.f41956OooO0oo, str, str2);
        ScheduledExecutorService scheduledExecutorService = this.f41951OooO0OO;
        Context context = this.f41950OooO0O0;
        HashMap map = oo0oOO0.f42019OooO0OO;
        synchronized (oo0oOO0.class) {
            HashMap map2 = oo0oOO0.f42019OooO0OO;
            if (!map2.containsKey(str3)) {
                map2.put(str3, new oo0oOO0(context, str3));
            }
            oo0ooo0 = (oo0oOO0) map2.get(str3);
        }
        return oo00o.OooO0OO(scheduledExecutorService, oo0ooo0);
    }

    @VisibleForTesting
    public final synchronized ConfigFetchHandler OooO0Oo(String str, oo00o oo00oVar, OooO0O0 oooO0O0) {
        o0000O0O o0000o0o2;
        OooO0o o00o000o2;
        ScheduledExecutorService scheduledExecutorService;
        Clock clock;
        Random random;
        String str2;
        o0OOO0o o0ooo0o2;
        o0000o0o2 = this.f41954OooO0o0;
        o0OOO0o o0ooo0o3 = this.f41952OooO0Oo;
        o0ooo0o3.OooO00o();
        o00o000o2 = o0ooo0o3.f57663OooO0O0.equals("[DEFAULT]") ? this.f41955OooO0oO : new o00O000o();
        scheduledExecutorService = this.f41951OooO0OO;
        clock = f41945OooOO0;
        random = f41946OooOO0O;
        o0OOO0o o0ooo0o4 = this.f41952OooO0Oo;
        o0ooo0o4.OooO00o();
        str2 = o0ooo0o4.f57664OooO0OO.f57674OooO00o;
        o0ooo0o2 = this.f41952OooO0Oo;
        o0ooo0o2.OooO00o();
        return new ConfigFetchHandler(o0000o0o2, o00o000o2, scheduledExecutorService, clock, random, oo00oVar, new ConfigFetchHttpClient(this.f41950OooO0O0, o0ooo0o2.f57664OooO0OO.f57675OooO0O0, str2, str, oooO0O0.f20066OooO00o.getLong("fetch_timeout_in_seconds", 60L), oooO0O0.f20066OooO00o.getLong("fetch_timeout_in_seconds", 60L)), oooO0O0, this.f41948OooO);
    }

    public final synchronized o00O0OO OooO0o0(o0OOO0o o0ooo0o2, o0000O0O o0000o0o2, ConfigFetchHandler configFetchHandler, oo00o oo00oVar, Context context, String str, OooO0O0 oooO0O0) {
        return new o00O0OO(o0ooo0o2, o0000o0o2, configFetchHandler, oo00oVar, context, str, oooO0O0, this.f41951OooO0OO);
    }
}
