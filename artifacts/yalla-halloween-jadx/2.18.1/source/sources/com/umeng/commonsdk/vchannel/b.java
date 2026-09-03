package com.umeng.commonsdk.vchannel;

import OooO00o.OooO00o;
import android.content.Context;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p016OooOoO0.OooOo00;
import p708oo000o.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
public class b {
    private String b;
    private String a = "_$unknown";
    private long c = 0;
    private long d = 0;
    private String e = a.j;
    private Map<String, Object> f = null;

    public b(Context context) {
        this.b = UMGlobalContext.getInstance(context).getProcessName(context);
    }

    public String a() {
        return this.a;
    }

    public long b() {
        return this.c;
    }

    public Map<String, Object> c() {
        return this.f;
    }

    public JSONObject d() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.a);
            jSONObject.put("pn", this.b);
            jSONObject.put("ds", this.d);
            jSONObject.put("ts", this.c);
            Map<String, Object> map = this.f;
            if (map != null && map.size() > 0) {
                for (String str : this.f.keySet()) {
                    jSONObject.put(str, this.f.get(str));
                }
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(this.e, jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("ekv", jSONArray2);
            return jSONObject3;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String toString() {
        String string;
        StringBuilder sb = new StringBuilder("[");
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("id:");
        sbOooO0o0.append(this.a);
        sbOooO0o0.append(",");
        sb.append(sbOooO0o0.toString());
        sb.append("pn:" + this.b + ",");
        sb.append("ts:" + this.c + ",");
        Map<String, Object> map = this.f;
        if (map != null && map.size() > 0) {
            for (String str : this.f.keySet()) {
                Object obj = this.f.get(str);
                if (obj == null) {
                    string = OooOo00.OooO0Oo(str, ": null,");
                } else {
                    StringBuilder sbOooO00o = Oooo0.OooO00o(str, ": ");
                    sbOooO00o.append(obj.toString());
                    sbOooO00o.append(",");
                    string = sbOooO00o.toString();
                }
                sb.append(string);
            }
        }
        StringBuilder sbOooO0o1 = OooO00o.OooO0o0("ds:");
        sbOooO0o1.append(this.d);
        sbOooO0o1.append("]");
        sb.append(sbOooO0o1.toString());
        return sb.toString();
    }

    public void a(String str) {
        this.a = str;
    }

    public void a(long j) {
        this.c = j;
    }

    public void a(Map<String, Object> map) {
        this.f = map;
    }
}
