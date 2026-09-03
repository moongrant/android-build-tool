package p360o0OOOoO0;

import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p359o0OOOoO.Oooo0;
import p359o0OOOoO.o000oOoO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO implements OooO0OO, o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Oooo0 f38391OooO0Oo;

    @NonNull
    public static String OooO0O0(@NonNull String str, @NonNull Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // p359o0OOOoO.o000oOoO
    public final void OooO00o(@Nullable Oooo0 oooo0) {
        this.f38391OooO0Oo = oooo0;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    @Override // p360o0OOOoO0.OooO0OO
    public final void OooO0OO(@NonNull String str, @NonNull Bundle bundle) {
        Oooo0 oooo0 = this.f38391OooO0Oo;
        if (oooo0 != null) {
            try {
                oooo0.OooO00o("$A$:" + OooO0O0(str, bundle));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }
}
