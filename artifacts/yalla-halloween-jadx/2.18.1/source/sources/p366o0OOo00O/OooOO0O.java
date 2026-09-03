package p366o0OOo00O;

import OooO00o.OooO00o;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import p139o00OOOo0.o0ooOOo;
import p361o0OOOoOo.o0000O00;
import p418o0Oo0oo.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O implements OooOOOO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final AtomicReference<TaskCompletionSource<OooO>> f38635OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f38636OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOo00 f38637OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOOO0 f38638OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0ooOOo f38639OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO0o f38640OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0O0 f38641OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0000O00 f38642OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final AtomicReference<OooO> f38643OooO0oo;

    public OooOO0O(Context context, OooOo00 oooOo00, o0ooOOo o0ooooo2, OooOOO0 oooOOO0, OooO0O0 oooO0O0, OooO0o oooO0o, o0000O00 o0000o00) {
        AtomicReference<OooO> atomicReference = new AtomicReference<>();
        this.f38643OooO0oo = atomicReference;
        this.f38635OooO = new AtomicReference<>(new TaskCompletionSource());
        this.f38636OooO00o = context;
        this.f38637OooO0O0 = oooOo00;
        this.f38639OooO0Oo = o0ooooo2;
        this.f38638OooO0OO = oooOOO0;
        this.f38641OooO0o0 = oooO0O0;
        this.f38640OooO0o = oooO0o;
        this.f38642OooO0oO = o0000o00;
        atomicReference.set(OooO0OO.OooO0O0(o0ooooo2));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0051 A[Catch: Exception -> 0x0056, TRY_LEAVE, TryCatch #1 {Exception -> 0x0056, blocks: (B:23:0x0049, B:25:0x0051), top: B:39:0x0049 }] */
    public final OooO OooO00o(int i) throws Throwable {
        OooO oooO = null;
        try {
            if (!o00000O0.OooO00o(2, i)) {
                JSONObject jSONObjectOooO00o = this.f38641OooO0o0.OooO00o();
                if (jSONObjectOooO00o != null) {
                    OooO oooOOooO00o = this.f38638OooO0OO.OooO00o(jSONObjectOooO00o);
                    if (oooOOooO00o != null) {
                        OooO0OO(jSONObjectOooO00o, "Loaded cached settings: ");
                        Objects.requireNonNull(this.f38639OooO0Oo);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (o00000O0.OooO00o(3, i)) {
                            try {
                                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                    Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                                }
                                oooO = oooOOooO00o;
                            } catch (Exception e) {
                                e = e;
                                oooO = oooOOooO00o;
                                Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            }
                        } else {
                            if (!(oooOOooO00o.f38624OooO0OO < jCurrentTimeMillis)) {
                                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                    Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                                }
                                oooO = oooOOooO00o;
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
        return oooO;
    }

    public final OooO OooO0O0() {
        return this.f38643OooO0oo.get();
    }

    public final void OooO0OO(JSONObject jSONObject, String str) throws JSONException {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0(str);
        sbOooO0o0.append(jSONObject.toString());
        String string = sbOooO0o0.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", string, null);
        }
    }
}
