package p287o0O0OOoo;

import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p464o0OooO0.o00000OO;
import p464o0OooO0.o0000Ooo;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OOo implements oo0o0Oo, o0000Ooo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public o00000OO f41446OooO0Oo;

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

    @Override // p464o0OooO0.o0000Ooo
    public final void OooO00o(@Nullable o00000OO o00000oo2) {
        this.f41446OooO0Oo = o00000oo2;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    @Override // p287o0O0OOoo.oo0o0Oo
    public final void OooO0O0(@NonNull Bundle bundle, @NonNull String str) {
        o00000OO o00000oo2 = this.f41446OooO0Oo;
        if (o00000oo2 != null) {
            try {
                o00000oo2.OooO00o("$A$:" + OooO0OO(bundle, str));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }
}
