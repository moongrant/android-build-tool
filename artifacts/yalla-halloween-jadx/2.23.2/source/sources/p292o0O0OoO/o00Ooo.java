package p292o0O0OoO;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import p039OoooOoo.o0o0Oo;
import p289o0O0Oo0.o00000O0;
import p289o0O0Oo0.o000O00O;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Ooo implements o0ooOOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final AtomicReference<TaskCompletionSource<o0OoOo0>> f41657OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f41658OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0OOO0o f41659OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final oo000o f41660OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000O00O f41661OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o000oOoO f41662OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Oooo000 f41663OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o00000O0 f41664OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final AtomicReference<o0OoOo0> f41665OooO0oo;

    public o00Ooo(Context context, o0OOO0o o0ooo0o2, o000O00O o000o00o2, oo000o oo000oVar, Oooo000 oooo000, o000oOoO o000oooo2, o00000O0 o00000o1) {
        AtomicReference<o0OoOo0> atomicReference = new AtomicReference<>();
        this.f41665OooO0oo = atomicReference;
        this.f41657OooO = new AtomicReference<>(new TaskCompletionSource());
        this.f41658OooO00o = context;
        this.f41659OooO0O0 = o0ooo0o2;
        this.f41661OooO0Oo = o000o00o2;
        this.f41660OooO0OO = oo000oVar;
        this.f41663OooO0o0 = oooo000;
        this.f41662OooO0o = o000oooo2;
        this.f41664OooO0oO = o00000o1;
        atomicReference.set(Oooo0.OooO0O0(o000o00o2));
    }

    public static void OooO0OO(JSONObject jSONObject, String str) throws JSONException {
        StringBuilder sbOooO00o = o0o0Oo.OooO00o(str);
        sbOooO00o.append(jSONObject.toString());
        String string = sbOooO00o.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", string, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[Catch: Exception -> 0x0059, TRY_LEAVE, TryCatch #1 {Exception -> 0x0059, blocks: (B:23:0x004c, B:25:0x0054), top: B:39:0x004c }] */
    public final o0OoOo0 OooO00o(o00O0O o00o0o2) throws Throwable {
        o0OoOo0 o0oooo1 = null;
        try {
            if (!o00O0O.SKIP_CACHE_LOOKUP.equals(o00o0o2)) {
                JSONObject jSONObjectOooO00o = this.f41663OooO0o0.OooO00o();
                if (jSONObjectOooO00o != null) {
                    o0OoOo0 o0oooo0OooO00o = this.f41660OooO0OO.OooO00o(jSONObjectOooO00o);
                    if (o0oooo0OooO00o != null) {
                        OooO0OO(jSONObjectOooO00o, "Loaded cached settings: ");
                        this.f41661OooO0Oo.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (o00O0O.IGNORE_CACHE_EXPIRATION.equals(o00o0o2)) {
                            try {
                                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                    Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                                }
                                o0oooo1 = o0oooo0OooO00o;
                            } catch (Exception e) {
                                e = e;
                                o0oooo1 = o0oooo0OooO00o;
                                Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            }
                        } else {
                            if (!(o0oooo0OooO00o.f41677OooO0OO < jCurrentTimeMillis)) {
                                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                    Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                                }
                                o0oooo1 = o0oooo0OooO00o;
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
        return o0oooo1;
    }

    public final o0OoOo0 OooO0O0() {
        return this.f41665OooO0oo.get();
    }
}
