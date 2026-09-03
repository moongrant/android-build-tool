package p366o0OOo00O;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import p139o00OOOo0.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0ooOOo f38644OooO00o;

    public OooOOO0(o0ooOOo o0ooooo2) {
        this.f38644OooO00o = o0ooooo2;
    }

    public final OooO OooO00o(JSONObject jSONObject) throws JSONException {
        OooOOO oooOo;
        int i = jSONObject.getInt("settings_version");
        if (i != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.", null);
            oooOo = new OooO0OO();
        } else {
            oooOo = new OooOo();
        }
        return oooOo.OooO00o(this.f38644OooO00o, jSONObject);
    }
}
