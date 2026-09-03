package p292o0O0OoO;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import p289o0O0Oo0.o000O00O;

/* JADX INFO: loaded from: classes3.dex */
public final class oo000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000O00O f41685OooO00o;

    public oo000o(o000O00O o000o00o2) {
        this.f41685OooO00o = o000o00o2;
    }

    public final o0OoOo0 OooO00o(JSONObject jSONObject) throws JSONException {
        o00oO0o o0oo0oo2;
        int i = jSONObject.getInt("settings_version");
        if (i != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.", null);
            o0oo0oo2 = new Oooo0();
        } else {
            o0oo0oo2 = new o0Oo0oo();
        }
        return o0oo0oo2.OooO00o(this.f41685OooO00o, jSONObject);
    }
}
