package p317o0O0oOoO;

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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p042OooooO0.o00OO0O0;
import p302o0O0o0OO.o0000O0O;
import p318o0O0oOoo.o00O;
import p318o0O0oOoo.o00O0;
import p318o0O0oOoo.o00O0OO;
import p318o0O0oOoo.o00OO000;
import p318o0O0oOoo.oo00o;
import p318o0O0oOoo.oo0o0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o00O0OO f41959OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final FirebaseABTesting f41960OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Executor f41961OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final oo00o f41962OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oo00o f41963OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final oo0o0O0 f41964OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ConfigFetchHandler f41965OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO0O0 f41966OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o0000O0O f41967OooO0oo;

    public o00O0000(o0000O0O o0000o0o2, @Nullable FirebaseABTesting firebaseABTesting, ScheduledExecutorService scheduledExecutorService, oo00o oo00oVar, oo00o oo00oVar2, oo00o oo00oVar3, ConfigFetchHandler configFetchHandler, oo0o0O0 oo0o0o0, OooO0O0 oooO0O0, o00O0OO o00o0oo2) {
        this.f41967OooO0oo = o0000o0o2;
        this.f41960OooO00o = firebaseABTesting;
        this.f41961OooO0O0 = scheduledExecutorService;
        this.f41962OooO0OO = oo00oVar;
        this.f41963OooO0Oo = oo00oVar2;
        this.f41965OooO0o0 = configFetchHandler;
        this.f41964OooO0o = oo0o0o0;
        this.f41966OooO0oO = oooO0O0;
        this.f41959OooO = o00o0oo2;
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
        o00OO000 o00oo001;
        oo0o0O0 oo0o0o0 = this.f41964OooO0o;
        oo0o0o0.getClass();
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(oo0o0O0.OooO0OO(oo0o0o0.f42017OooO0OO));
        hashSet.addAll(oo0o0O0.OooO0OO(oo0o0o0.f42018OooO0Oo));
        HashMap map = new HashMap();
        for (String str : hashSet) {
            o00O0 o00o0OooO0O0 = oo0o0O0.OooO0O0(oo0o0o0.f42017OooO0OO);
            String string2 = null;
            if (o00o0OooO0O0 == null) {
                string = null;
            } else {
                try {
                    string = o00o0OooO0O0.f41973OooO0O0.getString(str);
                } catch (JSONException unused) {
                    string = null;
                }
            }
            if (string != null) {
                o00O0 o00o0OooO0O1 = oo0o0O0.OooO0O0(oo0o0o0.f42017OooO0OO);
                if (o00o0OooO0O1 != null) {
                    synchronized (oo0o0o0.f42015OooO00o) {
                        Iterator it = oo0o0o0.f42015OooO00o.iterator();
                        while (it.hasNext()) {
                            oo0o0o0.f42016OooO0O0.execute(new o00OO0O0(1, (BiConsumer) it.next(), str, o00o0OooO0O1));
                        }
                    }
                }
                o00oo001 = new o00OO000(string, 2);
            } else {
                o00O0 o00o0OooO0O2 = oo0o0O0.OooO0O0(oo0o0o0.f42018OooO0Oo);
                if (o00o0OooO0O2 != null) {
                    try {
                        string2 = o00o0OooO0O2.f41973OooO0O0.getString(str);
                    } catch (JSONException unused2) {
                    }
                }
                if (string2 != null) {
                    o00oo001 = new o00OO000(string2, 1);
                } else {
                    Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", "FirebaseRemoteConfigValue", str));
                    o00oo001 = new o00OO000("", 0);
                }
            }
            map.put(str, o00oo001);
        }
        return map;
    }

    @NonNull
    public final o00O OooO0O0() {
        o00O o00o2;
        OooO0O0 oooO0O0 = this.f41966OooO0oO;
        synchronized (oooO0O0.f20067OooO0O0) {
            oooO0O0.f20066OooO00o.getLong("last_fetch_time_in_millis", -1L);
            int i = oooO0O0.f20066OooO00o.getInt("last_fetch_status", 0);
            int[] iArr = ConfigFetchHandler.f20033OooOO0O;
            long j = oooO0O0.f20066OooO00o.getLong("fetch_timeout_in_seconds", 60L);
            if (j < 0) {
                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j)));
            }
            long j2 = oooO0O0.f20066OooO00o.getLong("minimum_fetch_interval_in_seconds", ConfigFetchHandler.f20032OooOO0);
            if (j2 < 0) {
                throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j2 + " is an invalid argument");
            }
            o00o2 = new o00O(i);
        }
        return o00o2;
    }

    public final void OooO0OO(boolean z) {
        o00O0OO o00o0oo2 = this.f41959OooO;
        synchronized (o00o0oo2) {
            o00o0oo2.f41994OooO0O0.f20082OooO0o0 = z;
            if (!z) {
                o00o0oo2.OooO00o();
            }
        }
    }
}
