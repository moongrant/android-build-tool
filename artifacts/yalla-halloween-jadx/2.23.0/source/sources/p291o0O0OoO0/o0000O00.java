package p291o0O0OoO0;

import com.google.firebase.perf.util.OooO00o;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O00 implements o00000OO {
    @Override // p291o0O0OoO0.o00000OO
    public final o000000 OooO00o(OooO00o oooO00o, JSONObject jSONObject) throws JSONException {
        long jCurrentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", 3600);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        o000000.OooO0O0 oooO0O0 = jSONObject.has("session") ? new o000000.OooO0O0(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new o000000.OooO0O0(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        o000000.OooO00o oooO00o2 = new o000000.OooO00o(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j = iOptInt;
        if (jSONObject.has("expires_at")) {
            jCurrentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            oooO00o.getClass();
            jCurrentTimeMillis = (j * 1000) + System.currentTimeMillis();
        }
        return new o000000(jCurrentTimeMillis, oooO0O0, oooO00o2, dOptDouble, dOptDouble2, iOptInt2);
    }
}
