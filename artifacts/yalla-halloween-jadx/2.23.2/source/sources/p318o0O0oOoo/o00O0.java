package p318o0O0oOoo;

import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0 {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Date f41971OooO0oO = new Date(0);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final JSONObject f41972OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final JSONObject f41973OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Date f41974OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final JSONArray f41975OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f41976OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final JSONObject f41977OooO0o0;

    public o00O0(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j);
        this.f41973OooO0O0 = jSONObject;
        this.f41974OooO0OO = date;
        this.f41975OooO0Oo = jSONArray;
        this.f41977OooO0o0 = jSONObject2;
        this.f41976OooO0o = j;
        this.f41972OooO00o = jSONObject3;
    }

    public static o00O0 OooO00o(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        return new o00O0(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObjectOptJSONObject, jSONObject.optLong("template_version_number_key"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o00O0) {
            return this.f41972OooO00o.toString().equals(((o00O0) obj).toString());
        }
        return false;
    }

    public final int hashCode() {
        return this.f41972OooO00o.hashCode();
    }

    public final String toString() {
        return this.f41972OooO00o.toString();
    }
}
