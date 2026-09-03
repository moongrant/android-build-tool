package com.yalla.yalla.http.iteratehttp;

import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.google.gson.reflect.TypeToken;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.bean.AbsJavaBeanApi;
import com.yalla.yalla.model.http.ApiError1058;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.user.UserCloseModel;
import com.yalla.yalla.util.Function.OooOO0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o0OoO.OooOOO;
import org.json.JSONArray;
import org.json.JSONObject;
import p427o0OoO0oO.o00OOO0;
import p427o0OoO0oO.o00OOO0O;
import p427o0OoO0oO.o0o0Oo;
import p428o0OoO0oo.o00OOOOo;
import p475o0Ooooo0.o0O00oO0;
import p590o0oOooo0.oOOO00;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o extends o00OOOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0OO.OooO00o f22921OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00OOO0O f22922OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap<String, Boolean> f22923OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f22924OooO0Oo;

    public OooO00o(o00OOO0O o00ooo0o2, HashMap<String, Boolean> map, String str, OooO0OO.OooO00o oooO00o) {
        this.f22922OooO0O0 = o00ooo0o2;
        this.f22923OooO0OO = map;
        this.f22924OooO0Oo = str;
        this.f22921OooO00o = oooO00o;
    }

    @Override // p428o0OoO0oo.o00OOOO0
    public final void OooO00o(Exception exc) {
        String key;
        Map<String, String> map;
        HashMap<String, Boolean> map2 = this.f22923OooO0OO;
        Iterator<Map.Entry<String, Boolean>> it = map2.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                key = "";
                break;
            }
            Map.Entry<String, Boolean> next = it.next();
            if (!next.getValue().booleanValue()) {
                key = next.getKey();
                map2.put(key, Boolean.TRUE);
                break;
            }
        }
        o00OOO0O o00ooo0o2 = this.f22922OooO0O0;
        if (o00ooo0o2 != null) {
            o00ooo0o2.toString();
        }
        boolean zIsEmpty = TextUtils.isEmpty(key);
        OooO0OO.OooO00o oooO00o = this.f22921OooO00o;
        if (zIsEmpty) {
            if (oooO00o != null) {
                oooO00o.OooO0Oo();
                oooO00o.OooO0O0(AppEventsConstants.EVENT_PARAM_VALUE_NO, "");
                return;
            }
            return;
        }
        if (o00ooo0o2 instanceof o00OOO0) {
            map = ((o00OOO0) o00ooo0o2).f46767OooO0Oo;
        } else {
            map = o00ooo0o2 instanceof o0o0Oo ? ((o0o0Oo) o00ooo0o2).f46767OooO0Oo : null;
        }
        OooO0OO.OooO00o(o00ooo0o2, map);
        StringBuilder sb = new StringBuilder();
        sb.append(key);
        String str = this.f22924OooO0Oo;
        sb.append(str);
        o00ooo0o2.f46764OooO00o = sb.toString();
        o00ooo0o2.OooO0O0().OooO00o(new OooO00o(o00ooo0o2, map2, str, oooO00o));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    @Override // p428o0OoO0oo.o00OOOO0
    public final void OooO0O0(Object obj) {
        String string;
        String str = (String) obj;
        OooO0OO.OooO00o oooO00o = this.f22921OooO00o;
        if (oooO00o != null) {
            oooO00o.OooO0Oo();
        }
        try {
            if (TextUtils.isEmpty(str)) {
                string = "";
            } else {
                Object objOooO0o0 = OooOO0.OooO0o0(str);
                if (objOooO0o0 instanceof JSONArray) {
                    string = "1000";
                } else if (objOooO0o0 instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) objOooO0o0;
                    if (jSONObject.has("code")) {
                        string = jSONObject.getString("code");
                    } else {
                        string = "";
                    }
                } else {
                    string = "";
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        int iOooOO0O = o0O0O0Oo.OooOO0O(string);
        if (iOooOO0O == 1000) {
            if (oooO00o != null) {
                oooO00o.OooO0o0(str);
                return;
            }
            return;
        }
        if (iOooOO0O != 1007) {
            if (iOooOO0O == 1059) {
                ApiError1058 apiError1058 = (ApiError1058) oOOO00.OooO00o(str, ApiError1058.class);
                if (apiError1058 != null && apiError1058.getAdditionalData() != null) {
                    o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                    o0O00oO0.OooOOOO().postValue(apiError1058.getAdditionalData().getActiveToken());
                    o0O00oO0.OooOOo0().postValue(Long.valueOf(apiError1058.getAdditionalData().getUserId()));
                }
                LiveEventBus.get("ACTIVE_ACCOUNT").post(null);
                return;
            }
            if (iOooOO0O != 1004) {
                if (iOooOO0O == 1005) {
                    ApiResult apiResult = (ApiResult) com.code.android.json.OooO00o.OooO0OO(ApiResult.class, OooOOO.OooO00o.OooO00o(str, true));
                    oooO00o.OooO0O0(String.valueOf(apiResult.getCode()), apiResult.getMessage());
                    return;
                } else if (iOooOO0O != 4002 && iOooOO0O != 4003) {
                    if (oooO00o != null) {
                        oooO00o.OooO0O0(string, "");
                        return;
                    }
                    return;
                }
            }
        }
        try {
            AbsJavaBeanApi absJavaBeanApi = (AbsJavaBeanApi) oOOO00.OooO0O0(str, new TypeToken<AbsJavaBeanApi<UserCloseModel>>() { // from class: com.yalla.yalla.http.iteratehttp.IterateCallback$1
            }.getType());
            if (absJavaBeanApi == null || absJavaBeanApi.getData() == null || ((UserCloseModel) absJavaBeanApi.getData()).getBlockingMsg() == null) {
                if (oooO00o != null) {
                    oooO00o.OooO0O0(string, "");
                }
            } else if (oooO00o != null) {
                oooO00o.OooO0O0(string, ((UserCloseModel) absJavaBeanApi.getData()).getBlockingMsg());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            if (oooO00o != null) {
                oooO00o.OooO0O0(string, "");
            }
        }
    }

    @Override // p428o0OoO0oo.o00OOOO0
    public final void OooO0OO(int i, int i2, String str) {
        OooO0OO.OooO00o oooO00o = this.f22921OooO00o;
        if (oooO00o != null) {
            oooO00o.OooO0OO();
        }
    }
}
