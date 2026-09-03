package p283o0O0OOo;

import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p284o0O0OOoO.OooOO0O;
import p284o0O0OOoO.OooOOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOOO implements OooOOO0, OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public OooOO0O f42091OooO0Oo;

    @NonNull
    public static String OooO0OO(@NonNull Bundle bundle, @NonNull String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // p284o0O0OOoO.OooOOO0
    public final void OooO00o(@Nullable OooOO0O oooOO0O) {
        this.f42091OooO0Oo = oooOO0O;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    @Override // p283o0O0OOo.OooOOO0
    public final void OooO0O0(@NonNull Bundle bundle, @NonNull String str) {
        OooOO0O oooOO0O = this.f42091OooO0Oo;
        if (oooOO0O != null) {
            try {
                oooOO0O.OooO00o("$A$:" + OooO0OO(bundle, str));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }
}
