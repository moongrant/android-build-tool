package p671oo0oOOo;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.BiConsumer;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.OooO0O0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import o0O0o0.OooO;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p313o0O0oOo.o0000;
import p313o0O0oOo.o000000;
import p313o0O0oOo.o000000O;
import p313o0O0oOo.o0000O00;
import p313o0O0oOo.o0000O0O;
import p313o0O0oOo.o000OO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o0000O00 f60913OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final FirebaseABTesting f60914OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Executor f60915OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000000 f60916OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000000 f60917OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0000 f60918OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ConfigFetchHandler f60919OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO0O0 f60920OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooO f60921OooO0oo;

    public OooOo(OooO oooO, @Nullable FirebaseABTesting firebaseABTesting, ScheduledExecutorService scheduledExecutorService, o000000 o000000Var, o000000 o000000Var2, o000000 o000000Var3, ConfigFetchHandler configFetchHandler, o0000 o0000Var, OooO0O0 oooO0O0, o0000O00 o0000o00) {
        this.f60921OooO0oo = oooO;
        this.f60914OooO00o = firebaseABTesting;
        this.f60915OooO0O0 = scheduledExecutorService;
        this.f60916OooO0OO = o000000Var;
        this.f60917OooO0Oo = o000000Var2;
        this.f60919OooO0o0 = configFetchHandler;
        this.f60918OooO0o = o0000Var;
        this.f60920OooO0oO = oooO0O0;
        this.f60913OooO = o0000o00;
    }

    @VisibleForTesting
    public static ArrayList OooO0Oo(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    @NonNull
    public final HashMap OooO00o() {
        String string;
        o000OO o000oo2;
        o0000 o0000Var = this.f60918OooO0o;
        o0000Var.getClass();
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(o0000.OooO0OO(o0000Var.f42535OooO0OO));
        hashSet.addAll(o0000.OooO0OO(o0000Var.f42536OooO0Oo));
        HashMap map = new HashMap();
        for (final String str : hashSet) {
            o000000O o000000oOooO0O0 = o0000.OooO0O0(o0000Var.f42535OooO0OO);
            String string2 = null;
            if (o000000oOooO0O0 == null) {
                string = null;
            } else {
                try {
                    string = o000000oOooO0O0.f42548OooO0O0.getString(str);
                } catch (JSONException unused) {
                    string = null;
                }
            }
            if (string != null) {
                final o000000O o000000oOooO0O1 = o0000.OooO0O0(o0000Var.f42535OooO0OO);
                if (o000000oOooO0O1 != null) {
                    synchronized (o0000Var.f42533OooO00o) {
                        for (final BiConsumer biConsumer : o0000Var.f42533OooO00o) {
                            o0000Var.f42534OooO0O0.execute(new Runnable() { // from class: o0O0oOo.o0000Ooo
                                @Override // java.lang.Runnable
                                public final void run() {
                                    biConsumer.accept(str, o000000oOooO0O1);
                                }
                            });
                        }
                    }
                }
                o000oo2 = new o000OO(string, 2);
            } else {
                o000000O o000000oOooO0O2 = o0000.OooO0O0(o0000Var.f42536OooO0Oo);
                if (o000000oOooO0O2 != null) {
                    try {
                        string2 = o000000oOooO0O2.f42548OooO0O0.getString(str);
                    } catch (JSONException unused2) {
                    }
                }
                if (string2 != null) {
                    o000oo2 = new o000OO(string2, 1);
                } else {
                    Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", "FirebaseRemoteConfigValue", str));
                    o000oo2 = new o000OO("", 0);
                }
            }
            map.put(str, o000oo2);
        }
        return map;
    }

    @NonNull
    public final o0000O0O OooO0O0() {
        o0000O0O o0000o0o2;
        OooO0O0 oooO0O0 = this.f60920OooO0oO;
        synchronized (oooO0O0.f20540OooO0O0) {
            oooO0O0.f20539OooO00o.getLong("last_fetch_time_in_millis", -1L);
            int i = oooO0O0.f20539OooO00o.getInt("last_fetch_status", 0);
            int[] iArr = ConfigFetchHandler.f20506OooOO0O;
            long j = oooO0O0.f20539OooO00o.getLong("fetch_timeout_in_seconds", 60L);
            if (j < 0) {
                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j)));
            }
            long j2 = oooO0O0.f20539OooO00o.getLong("minimum_fetch_interval_in_seconds", ConfigFetchHandler.f20505OooOO0);
            if (j2 < 0) {
                throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j2 + " is an invalid argument");
            }
            o0000o0o2 = new o0000O0O(i);
        }
        return o0000o0o2;
    }

    public final void OooO0OO(boolean z) {
        o0000O00 o0000o00 = this.f60913OooO;
        synchronized (o0000o00) {
            o0000o00.f42567OooO0O0.f20555OooO0o0 = z;
            if (!z) {
                o0000o00.OooO00o();
            }
        }
    }
}
