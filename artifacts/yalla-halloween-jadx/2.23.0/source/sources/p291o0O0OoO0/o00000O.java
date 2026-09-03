package p291o0O0OoO0;

import android.util.Log;
import com.google.firebase.perf.util.OooO00o;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f42295OooO00o;

    public o00000O(OooO00o oooO00o) {
        this.f42295OooO00o = oooO00o;
    }

    public final o000000 OooO00o(JSONObject jSONObject) throws JSONException {
        o00000OO o0000o00;
        int i = jSONObject.getInt("settings_version");
        if (i != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.", null);
            o0000o00 = new o0O0O00();
        } else {
            o0000o00 = new o0000O00();
        }
        return o0000o00.OooO00o(this.f42295OooO00o, jSONObject);
    }
}
