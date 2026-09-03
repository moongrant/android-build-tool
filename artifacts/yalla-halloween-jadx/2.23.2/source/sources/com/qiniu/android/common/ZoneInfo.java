package com.qiniu.android.common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ZoneInfo {
    private static int DOMAIN_FROZEN_SECONDS = 600;
    public static final String EmptyRegionId = "sdkEmptyRegionId";
    public static final String SDKDefaultIOHost = "sdkDefaultIOHost";
    public List<String> allHosts;
    private final Date buildDate = new Date();
    public JSONObject detailInfo;
    public final List<String> domains;
    public final boolean http3Enabled;
    public final boolean ipv6;
    public final List<String> old_domains;
    public final String regionId;
    public final int ttl;

    @Deprecated
    public static class UploadServerGroup {
        public final ArrayList<String> allHosts;
        public final ArrayList<String> backup;
        public final String info;
        public final ArrayList<String> main;

        public UploadServerGroup(String str, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3) {
            this.info = str;
            this.main = arrayList;
            this.backup = arrayList2;
            this.allHosts = arrayList3;
        }

        public static UploadServerGroup buildInfoFromJson(JSONObject jSONObject) {
            String string = null;
            if (jSONObject == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            try {
                string = jSONObject.getString("info");
            } catch (JSONException unused) {
            }
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("main");
                for (int i = 0; i < jSONArray.length(); i++) {
                    String string2 = jSONArray.getString(i);
                    arrayList.add(string2);
                    arrayList3.add(string2);
                }
            } catch (JSONException unused2) {
            }
            try {
                JSONArray jSONArray2 = jSONObject.getJSONArray("backup");
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    String string3 = jSONArray2.getString(i2);
                    arrayList.add(string3);
                    arrayList3.add(string3);
                }
            } catch (JSONException unused3) {
            }
            return new UploadServerGroup(string, arrayList, arrayList2, arrayList3);
        }
    }

    private ZoneInfo(int i, boolean z, boolean z2, String str, List<String> list, List<String> list2) {
        this.ttl = i;
        this.http3Enabled = z;
        this.ipv6 = z2;
        this.regionId = str;
        this.domains = list;
        this.old_domains = list2;
    }

    public static ZoneInfo buildFromJson(JSONObject jSONObject) throws JSONException {
        boolean zOptBoolean;
        boolean zOptBoolean2;
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("ttl");
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("features");
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("http3");
            zOptBoolean = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optBoolean("enabled") : false;
            try {
                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("ipv6");
                zOptBoolean2 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optBoolean("enabled") : false;
            } catch (Exception unused) {
                zOptBoolean2 = false;
            }
        } catch (Exception unused2) {
            zOptBoolean = false;
        }
        String strOptString = jSONObject.optString("region", EmptyRegionId);
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("up");
        if (jSONObjectOptJSONObject3 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject3.optJSONArray("domains");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                String strOptString2 = jSONArrayOptJSONArray.optString(i);
                if (strOptString2 != null && strOptString2.length() > 0) {
                    arrayList2.add(strOptString2);
                    arrayList.add(strOptString2);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject3.optJSONArray("old");
        if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                String strOptString3 = jSONArrayOptJSONArray2.optString(i2);
                if (strOptString3 != null && strOptString3.length() > 0) {
                    arrayList3.add(strOptString3);
                    arrayList.add(strOptString3);
                }
            }
        }
        if (arrayList2.size() == 0 && arrayList3.size() == 0) {
            return null;
        }
        ZoneInfo zoneInfo = new ZoneInfo(iOptInt, zOptBoolean, zOptBoolean2, strOptString, arrayList2, arrayList3);
        zoneInfo.detailInfo = jSONObject;
        zoneInfo.allHosts = arrayList;
        return zoneInfo;
    }

    public static ZoneInfo buildInfo(List<String> list, String str) {
        return buildInfo(list, null, str);
    }

    public String getRegionId() {
        return this.regionId;
    }

    public boolean isValid() {
        return this.ttl > ((int) (((double) new Date().getTime()) * 0.001d)) - ((int) (((double) this.buildDate.getTime()) * 0.001d));
    }

    public String toString() {
        HashMap map = new HashMap();
        map.put("ttl", Integer.valueOf(this.ttl));
        map.put("allHost", this.allHosts);
        return new JSONObject(map).toString();
    }

    public static ZoneInfo buildInfo(List<String> list, List<String> list2, String str) {
        if (list == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("domains", new JSONArray((Collection) list));
        if (list2 != null) {
            map.put("old", new JSONArray((Collection) list2));
        }
        JSONObject jSONObject = new JSONObject(map);
        if (str == null) {
            str = EmptyRegionId;
        }
        HashMap map2 = new HashMap();
        map2.put("ttl", 86400000);
        map2.put("region", str);
        map2.put("up", jSONObject);
        try {
            return buildFromJson(new JSONObject(map2));
        } catch (JSONException unused) {
            return null;
        }
    }
}
