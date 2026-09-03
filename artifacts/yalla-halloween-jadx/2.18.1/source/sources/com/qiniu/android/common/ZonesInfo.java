package com.qiniu.android.common;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ZonesInfo {
    public final ArrayList<ZoneInfo> zonesInfo;

    public ZonesInfo(ArrayList<ZoneInfo> arrayList) {
        this.zonesInfo = arrayList;
    }

    public static ZonesInfo createZonesInfo(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("hosts");
                for (int i = 0; i < jSONArray.length(); i++) {
                    ZoneInfo zoneInfoBuildFromJson = ZoneInfo.buildFromJson(jSONArray.getJSONObject(i));
                    if (zoneInfoBuildFromJson != null && zoneInfoBuildFromJson.isValid()) {
                        arrayList.add(zoneInfoBuildFromJson);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return new ZonesInfo(arrayList);
    }

    public boolean isValid() {
        ArrayList<ZoneInfo> arrayList = this.zonesInfo;
        return arrayList != null && arrayList.size() > 0;
    }
}
