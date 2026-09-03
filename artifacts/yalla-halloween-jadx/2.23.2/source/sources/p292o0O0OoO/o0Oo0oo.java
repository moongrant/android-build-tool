package p292o0O0OoO;

import org.json.JSONException;
import org.json.JSONObject;
import p289o0O0Oo0.o000O00O;

/* JADX INFO: loaded from: classes3.dex */
public final class o0Oo0oo implements o00oO0o {
    @Override // p292o0O0OoO.o00oO0o
    public final o0OoOo0 OooO00o(o000O00O o000o00o2, JSONObject jSONObject) throws JSONException {
        long jCurrentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", 3600);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        o0OoOo0.OooO0O0 oooO0O0 = jSONObject.has("session") ? new o0OoOo0.OooO0O0(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new o0OoOo0.OooO0O0(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        o0OoOo0.OooO00o oooO00o = new o0OoOo0.OooO00o(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j = iOptInt;
        if (jSONObject.has("expires_at")) {
            jCurrentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            o000o00o2.getClass();
            jCurrentTimeMillis = (j * 1000) + System.currentTimeMillis();
        }
        return new o0OoOo0(jCurrentTimeMillis, oooO0O0, oooO00o, dOptDouble, dOptDouble2, iOptInt2);
    }
}
