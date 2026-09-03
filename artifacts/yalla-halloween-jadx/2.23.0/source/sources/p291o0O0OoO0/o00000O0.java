package p291o0O0OoO0;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.perf.util.OooO00o;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import p039OoooOoo.o00OO;
import p285o0O0OOoo.o000OO;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000O0 implements o0000Ooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final AtomicReference<TaskCompletionSource<o000000>> f42296OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f42297OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000 f42298OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00000O f42299OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f42300OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o000OOo f42301OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final oo0o0Oo f42302OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o000OO f42303OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final AtomicReference<o000000> f42304OooO0oo;

    public o00000O0(Context context, o0000 o0000Var, OooO00o oooO00o, o00000O o00000o, oo0o0Oo oo0o0oo, o000OOo o000ooo2, o000OO o000oo2) {
        AtomicReference<o000000> atomicReference = new AtomicReference<>();
        this.f42304OooO0oo = atomicReference;
        this.f42296OooO = new AtomicReference<>(new TaskCompletionSource());
        this.f42297OooO00o = context;
        this.f42298OooO0O0 = o0000Var;
        this.f42300OooO0Oo = oooO00o;
        this.f42299OooO0OO = o00000o;
        this.f42302OooO0o0 = oo0o0oo;
        this.f42301OooO0o = o000ooo2;
        this.f42303OooO0oO = o000oo2;
        atomicReference.set(o0O0O00.OooO0O0(oooO00o));
    }

    public static void OooO0OO(JSONObject jSONObject, String str) throws JSONException {
        StringBuilder sbOooO00o = o00OO.OooO00o(str);
        sbOooO00o.append(jSONObject.toString());
        String string = sbOooO00o.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", string, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[Catch: Exception -> 0x0059, TRY_LEAVE, TryCatch #1 {Exception -> 0x0059, blocks: (B:23:0x004c, B:25:0x0054), top: B:39:0x004c }] */
    public final o000000 OooO00o(o000000O o000000o2) throws Throwable {
        o000000 o000000Var = null;
        try {
            if (!o000000O.SKIP_CACHE_LOOKUP.equals(o000000o2)) {
                JSONObject jSONObjectOooO00o = this.f42302OooO0o0.OooO00o();
                if (jSONObjectOooO00o != null) {
                    o000000 o000000VarOooO00o = this.f42299OooO0OO.OooO00o(jSONObjectOooO00o);
                    if (o000000VarOooO00o != null) {
                        OooO0OO(jSONObjectOooO00o, "Loaded cached settings: ");
                        this.f42300OooO0Oo.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (o000000O.IGNORE_CACHE_EXPIRATION.equals(o000000o2)) {
                            try {
                                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                    Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                                }
                                o000000Var = o000000VarOooO00o;
                            } catch (Exception e) {
                                e = e;
                                o000000Var = o000000VarOooO00o;
                                Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            }
                        } else {
                            if (!(o000000VarOooO00o.f42287OooO0OO < jCurrentTimeMillis)) {
                                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                    Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                                }
                                o000000Var = o000000VarOooO00o;
                            } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                            }
                        }
                    } else {
                        Log.e("FirebaseCrashlytics", "Failed to parse cached settings data.", null);
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        return o000000Var;
    }

    public final o000000 OooO0O0() {
        return this.f42304OooO0oo.get();
    }
}
