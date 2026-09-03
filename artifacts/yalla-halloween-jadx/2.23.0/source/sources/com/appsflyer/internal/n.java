package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class n {
    public final Context values;

    public n() {
    }

    public n(Context context) {
        this.values = context.getApplicationContext();
    }

    public static Map<String, Object> AFInAppEventParameterName(@NonNull JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objAFInAppEventParameterName = jSONObject.get(next);
            if (objAFInAppEventParameterName instanceof JSONArray) {
                objAFInAppEventParameterName = AFInAppEventParameterName((JSONArray) objAFInAppEventParameterName);
            } else if (objAFInAppEventParameterName instanceof JSONObject) {
                objAFInAppEventParameterName = AFInAppEventParameterName((JSONObject) objAFInAppEventParameterName);
            }
            map.put(next, objAFInAppEventParameterName);
        }
        return map;
    }

    private static Object AFInAppEventType(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    jSONArray.put(AFInAppEventType(it.next()));
                }
                return jSONArray;
            }
            if (!obj.getClass().isArray()) {
                if (obj instanceof Map) {
                    return AFKeystoreWrapper((Map) obj);
                }
                return ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) ? obj : obj.toString();
            }
            int length = Array.getLength(obj);
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < length; i++) {
                jSONArray2.put(AFInAppEventType(Array.get(obj, i)));
            }
            return jSONArray2;
        } catch (Exception unused) {
            return JSONObject.NULL;
        }
    }

    public static JSONObject AFKeystoreWrapper(Map<String, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), AFInAppEventType(entry.getValue()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    private static List<Object> AFInAppEventParameterName(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object objAFInAppEventParameterName = jSONArray.get(i);
            if (objAFInAppEventParameterName instanceof JSONArray) {
                objAFInAppEventParameterName = AFInAppEventParameterName((JSONArray) objAFInAppEventParameterName);
            } else if (objAFInAppEventParameterName instanceof JSONObject) {
                objAFInAppEventParameterName = AFInAppEventParameterName((JSONObject) objAFInAppEventParameterName);
            }
            arrayList.add(objAFInAppEventParameterName);
        }
        return arrayList;
    }
}
