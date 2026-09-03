package p671oo0oOOo;

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
import o0O0OO0O.OooO00o;
import o0O0o0.OooO;
import org.json.JSONObject;
import p281o0O0O0oO.OooOO0;
import p298o0O0o00o.OooO0OO;
import p313o0O0oOo.o0000;
import p313o0O0oOo.o000000;
import p313o0O0oOo.o000000O;
import p313o0O0oOo.o0000O;
import p313o0O0oOo.o0000O0;
import p313o0O0oOo.o0000O00;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public final class o00O0O {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final Clock f60925OooOO0 = DefaultClock.getInstance();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final Random f60926OooOO0O = new Random();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final HashMap f60927OooOO0o = new HashMap();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @GuardedBy("this")
    public final HashMap f60928OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @GuardedBy("this")
    public final HashMap f60929OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Context f60930OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ScheduledExecutorService f60931OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOO0 f60932OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final FirebaseABTesting f60933OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO f60934OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final OooO0OO<o0O0OO0O.OooO00o> f60935OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f60936OooO0oo;

    public static class OooO00o implements BackgroundDetector.BackgroundStateChangeListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final AtomicReference<OooO00o> f60937OooO00o = new AtomicReference<>();

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public final void onBackgroundStateChanged(boolean z) {
            Clock clock = o00O0O.f60925OooOO0;
            synchronized (o00O0O.class) {
                Iterator it = o00O0O.f60927OooOO0o.values().iterator();
                while (it.hasNext()) {
                    ((OooOo) it.next()).OooO0OO(z);
                }
            }
        }
    }

    @VisibleForTesting
    public o00O0O() {
        throw null;
    }

    public o00O0O(Context context, @Blocking ScheduledExecutorService scheduledExecutorService, OooOO0 oooOO1, OooO oooO, FirebaseABTesting firebaseABTesting, OooO0OO<o0O0OO0O.OooO00o> oooO0OO) {
        boolean z;
        this.f60929OooO00o = new HashMap();
        this.f60928OooO = new HashMap();
        this.f60930OooO0O0 = context;
        this.f60931OooO0OO = scheduledExecutorService;
        this.f60932OooO0Oo = oooOO1;
        this.f60934OooO0o0 = oooO;
        this.f60933OooO0o = firebaseABTesting;
        this.f60935OooO0oO = oooO0OO;
        oooOO1.OooO00o();
        this.f60936OooO0oo = oooOO1.f41951OooO0OO.f41961OooO0O0;
        AtomicReference<OooO00o> atomicReference = OooO00o.f60937OooO00o;
        Application application = (Application) context.getApplicationContext();
        AtomicReference<OooO00o> atomicReference2 = OooO00o.f60937OooO00o;
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
        Tasks.call(scheduledExecutorService, new Callable() { // from class: oo0oOOo.o000oOoO
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f60924OooO00o.OooO00o("firebase");
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [oo0oOOo.Oooo0] */
    @KeepForSdk
    @VisibleForTesting
    public final synchronized OooOo OooO00o(String str) {
        o000000 o000000VarOooO0OO;
        o000000 o000000VarOooO0OO2;
        o000000 o000000VarOooO0OO3;
        OooO0O0 oooO0O0;
        o0000 o0000Var;
        o000000VarOooO0OO = OooO0OO(str, "fetch");
        o000000VarOooO0OO2 = OooO0OO(str, "activate");
        o000000VarOooO0OO3 = OooO0OO(str, "defaults");
        oooO0O0 = new OooO0O0(this.f60930OooO0O0.getSharedPreferences(String.format("%s_%s_%s_%s", FirebaseABTesting.OriginService.REMOTE_CONFIG, this.f60936OooO0oo, str, "settings"), 0));
        o0000Var = new o0000(this.f60931OooO0OO, o000000VarOooO0OO2, o000000VarOooO0OO3);
        OooOO0 oooOO1 = this.f60932OooO0Oo;
        OooO0OO<o0O0OO0O.OooO00o> oooO0OO = this.f60935OooO0oO;
        oooOO1.OooO00o();
        final o0000O o0000o2 = (oooOO1.f41950OooO0O0.equals("[DEFAULT]") && str.equals("firebase")) ? new o0000O(oooO0OO) : null;
        if (o0000o2 != null) {
            o0000Var.OooO00o(new BiConsumer() { // from class: oo0oOOo.Oooo0
                @Override // com.google.android.gms.common.util.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    JSONObject jSONObjectOptJSONObject;
                    o0000O o0000o3 = o0000o2;
                    String str2 = (String) obj;
                    o000000O o000000o2 = (o000000O) obj2;
                    OooO00o oooO00o = o0000o3.f42561OooO00o.get();
                    if (oooO00o == null) {
                        return;
                    }
                    JSONObject jSONObject = o000000o2.f42552OooO0o0;
                    if (jSONObject.length() < 1) {
                        return;
                    }
                    JSONObject jSONObject2 = o000000o2.f42548OooO0O0;
                    if (jSONObject2.length() >= 1 && (jSONObjectOptJSONObject = jSONObject.optJSONObject(str2)) != null) {
                        String strOptString = jSONObjectOptJSONObject.optString("choiceId");
                        if (strOptString.isEmpty()) {
                            return;
                        }
                        synchronized (o0000o3.f42562OooO0O0) {
                            if (!strOptString.equals(o0000o3.f42562OooO0O0.get(str2))) {
                                o0000o3.f42562OooO0O0.put(str2, strOptString);
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
        return OooO0O0(this.f60932OooO0Oo, str, this.f60934OooO0o0, this.f60933OooO0o, this.f60931OooO0OO, o000000VarOooO0OO, o000000VarOooO0OO2, o000000VarOooO0OO3, OooO0Oo(str, o000000VarOooO0OO, oooO0O0), o0000Var, oooO0O0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    @VisibleForTesting
    public final synchronized OooOo OooO0O0(OooOO0 oooOO1, String str, OooO oooO, FirebaseABTesting firebaseABTesting, ScheduledExecutorService scheduledExecutorService, o000000 o000000Var, o000000 o000000Var2, o000000 o000000Var3, ConfigFetchHandler configFetchHandler, o0000 o0000Var, OooO0O0 oooO0O0) {
        boolean z;
        FirebaseABTesting firebaseABTesting2;
        if (!this.f60929OooO00o.containsKey(str)) {
            if (str.equals("firebase")) {
                oooOO1.OooO00o();
                z = oooOO1.f41950OooO0O0.equals("[DEFAULT]");
                if (z) {
                    firebaseABTesting2 = firebaseABTesting;
                } else {
                    firebaseABTesting2 = null;
                }
                OooOo oooOo = new OooOo(oooO, firebaseABTesting2, scheduledExecutorService, o000000Var, o000000Var2, o000000Var3, configFetchHandler, o0000Var, oooO0O0, OooO0o0(oooOO1, oooO, configFetchHandler, o000000Var2, this.f60930OooO0O0, str, oooO0O0));
                o000000Var2.OooO0O0();
                o000000Var3.OooO0O0();
                o000000Var.OooO0O0();
                this.f60929OooO00o.put(str, oooOo);
                f60927OooOO0o.put(str, oooOo);
            }
            if (z) {
                firebaseABTesting2 = firebaseABTesting;
            } else {
                firebaseABTesting2 = null;
            }
            OooOo oooOo2 = new OooOo(oooO, firebaseABTesting2, scheduledExecutorService, o000000Var, o000000Var2, o000000Var3, configFetchHandler, o0000Var, oooO0O0, OooO0o0(oooOO1, oooO, configFetchHandler, o000000Var2, this.f60930OooO0O0, str, oooO0O0));
            o000000Var2.OooO0O0();
            o000000Var3.OooO0O0();
            o000000Var.OooO0O0();
            this.f60929OooO00o.put(str, oooOo2);
            f60927OooOO0o.put(str, oooOo2);
        }
        return (OooOo) this.f60929OooO00o.get(str);
    }

    public final o000000 OooO0OO(String str, String str2) {
        o0000O0 o0000o1;
        String str3 = String.format("%s_%s_%s_%s.json", FirebaseABTesting.OriginService.REMOTE_CONFIG, this.f60936OooO0oo, str, str2);
        ScheduledExecutorService scheduledExecutorService = this.f60931OooO0OO;
        Context context = this.f60930OooO0O0;
        HashMap map = o0000O0.f42563OooO0OO;
        synchronized (o0000O0.class) {
            HashMap map2 = o0000O0.f42563OooO0OO;
            if (!map2.containsKey(str3)) {
                map2.put(str3, new o0000O0(context, str3));
            }
            o0000o1 = (o0000O0) map2.get(str3);
        }
        return o000000.OooO0OO(scheduledExecutorService, o0000o1);
    }

    @VisibleForTesting
    public final synchronized ConfigFetchHandler OooO0Oo(String str, o000000 o000000Var, OooO0O0 oooO0O0) {
        OooO oooO;
        OooO0OO o0oooo0;
        ScheduledExecutorService scheduledExecutorService;
        Clock clock;
        Random random;
        String str2;
        OooOO0 oooOO1;
        oooO = this.f60934OooO0o0;
        OooOO0 oooOO2 = this.f60932OooO0Oo;
        oooOO2.OooO00o();
        o0oooo0 = oooOO2.f41950OooO0O0.equals("[DEFAULT]") ? this.f60935OooO0oO : new o0OoOo0();
        scheduledExecutorService = this.f60931OooO0OO;
        clock = f60925OooOO0;
        random = f60926OooOO0O;
        OooOO0 oooOO3 = this.f60932OooO0Oo;
        oooOO3.OooO00o();
        str2 = oooOO3.f41951OooO0OO.f41960OooO00o;
        oooOO1 = this.f60932OooO0Oo;
        oooOO1.OooO00o();
        return new ConfigFetchHandler(oooO, o0oooo0, scheduledExecutorService, clock, random, o000000Var, new ConfigFetchHttpClient(this.f60930OooO0O0, oooOO1.f41951OooO0OO.f41961OooO0O0, str2, str, oooO0O0.f20539OooO00o.getLong("fetch_timeout_in_seconds", 60L), oooO0O0.f20539OooO00o.getLong("fetch_timeout_in_seconds", 60L)), oooO0O0, this.f60928OooO);
    }

    public final synchronized o0000O00 OooO0o0(OooOO0 oooOO1, OooO oooO, ConfigFetchHandler configFetchHandler, o000000 o000000Var, Context context, String str, OooO0O0 oooO0O0) {
        return new o0000O00(oooOO1, oooO, configFetchHandler, o000000Var, context, str, oooO0O0, this.f60931OooO0OO);
    }
}
