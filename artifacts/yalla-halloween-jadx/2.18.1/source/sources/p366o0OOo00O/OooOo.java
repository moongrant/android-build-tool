package p366o0OOo00O;

import com.umeng.analytics.pro.d;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p139o00OOOo0.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo implements OooOOO {
    @Override // p366o0OOo00O.OooOOO
    public final OooO OooO00o(o0ooOOo o0ooooo2, JSONObject jSONObject) throws JSONException {
        long jCurrentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", 3600);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        OooO.OooO0O0 oooO0O0 = jSONObject.has(d.aw) ? new OooO.OooO0O0(jSONObject.getJSONObject(d.aw).optInt("max_custom_exception_events", 8)) : new OooO.OooO0O0(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        OooO.OooO00o oooO00o = new OooO.OooO00o(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false));
        long j = iOptInt;
        if (jSONObject.has("expires_at")) {
            jCurrentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            Objects.requireNonNull(o0ooooo2);
            jCurrentTimeMillis = (j * 1000) + System.currentTimeMillis();
        }
        return new OooO(jCurrentTimeMillis, oooO0O0, oooO00o, dOptDouble, dOptDouble2, iOptInt2);
    }
}
