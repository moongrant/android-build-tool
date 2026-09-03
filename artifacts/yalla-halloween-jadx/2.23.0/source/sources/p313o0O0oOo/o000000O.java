package p313o0O0oOo;

import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class o000000O {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Date f42546OooO0oO = new Date(0);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final JSONObject f42547OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final JSONObject f42548OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Date f42549OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final JSONArray f42550OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f42551OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final JSONObject f42552OooO0o0;

    public o000000O(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j);
        this.f42548OooO0O0 = jSONObject;
        this.f42549OooO0OO = date;
        this.f42550OooO0Oo = jSONArray;
        this.f42552OooO0o0 = jSONObject2;
        this.f42551OooO0o = j;
        this.f42547OooO00o = jSONObject3;
    }

    public static o000000O OooO00o(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        return new o000000O(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObjectOptJSONObject, jSONObject.optLong("template_version_number_key"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o000000O) {
            return this.f42547OooO00o.toString().equals(((o000000O) obj).toString());
        }
        return false;
    }

    public final int hashCode() {
        return this.f42547OooO00o.hashCode();
    }

    public final String toString() {
        return this.f42547OooO00o.toString();
    }
}
