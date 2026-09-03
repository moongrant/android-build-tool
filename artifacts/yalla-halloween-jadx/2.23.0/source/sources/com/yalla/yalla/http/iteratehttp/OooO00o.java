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
import org.json.JSONArray;
import org.json.JSONObject;
import p421o0OoO0Oo.o00000;
import p421o0OoO0Oo.o000000O;
import p421o0OoO0Oo.o00000O0;
import p423o0OoO0o0.o000oOoO;
import p424o0OoO0oO.o000OO;
import p579o0oOoo.oOo00OO0;
import p590o0oo0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o extends o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0OO.OooO00o f23390OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00000 f23391OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap<String, Boolean> f23392OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f23393OooO0Oo;

    public OooO00o(o00000 o00000Var, HashMap<String, Boolean> map, String str, OooO0OO.OooO00o oooO00o) {
        this.f23391OooO0O0 = o00000Var;
        this.f23392OooO0OO = map;
        this.f23393OooO0Oo = str;
        this.f23390OooO00o = oooO00o;
    }

    @Override // p423o0OoO0o0.Oooo0
    public final void OooO00o(Exception exc) {
        String key;
        Map<String, String> map;
        HashMap<String, Boolean> map2 = this.f23392OooO0OO;
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
        o00000 o00000Var = this.f23391OooO0O0;
        if (o00000Var != null) {
            o00000Var.toString();
        }
        boolean zIsEmpty = TextUtils.isEmpty(key);
        OooO0OO.OooO00o oooO00o = this.f23390OooO00o;
        if (zIsEmpty) {
            if (oooO00o != null) {
                oooO00o.OooO0Oo();
                oooO00o.OooO0O0(AppEventsConstants.EVENT_PARAM_VALUE_NO, "");
                return;
            }
            return;
        }
        if (o00000Var instanceof o000000O) {
            map = ((o000000O) o00000Var).f45567OooO0Oo;
        } else {
            map = o00000Var instanceof o00000O0 ? ((o00000O0) o00000Var).f45567OooO0Oo : null;
        }
        OooO0OO.OooO00o(o00000Var, map);
        StringBuilder sb = new StringBuilder();
        sb.append(key);
        String str = this.f23393OooO0Oo;
        sb.append(str);
        o00000Var.f45564OooO00o = sb.toString();
        o00000Var.OooO0O0().OooO00o(new OooO00o(o00000Var, map2, str, oooO00o));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    @Override // p423o0OoO0o0.Oooo0
    public final void OooO0O0(Object obj) {
        String string;
        String str = (String) obj;
        OooO0OO.OooO00o oooO00o = this.f23390OooO00o;
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
        int iOooOO0O = OooOOOO.OooOO0O(string);
        if (iOooOO0O == 1000) {
            if (oooO00o != null) {
                oooO00o.OooO0o0(str);
                return;
            }
            return;
        }
        if (iOooOO0O != 1007) {
            if (iOooOO0O == 1059) {
                ApiError1058 apiError1058 = (ApiError1058) oOo00OO0.OooO00o(str, ApiError1058.class);
                if (apiError1058 != null && apiError1058.getAdditionalData() != null) {
                    p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
                    p464o0Oooo.o000000O.OooOOOO().postValue(apiError1058.getAdditionalData().getActiveToken());
                    p464o0Oooo.o000000O.OooOOo0().postValue(Long.valueOf(apiError1058.getAdditionalData().getUserId()));
                }
                LiveEventBus.get("ACTIVE_ACCOUNT").post(null);
                return;
            }
            if (iOooOO0O != 1004) {
                if (iOooOO0O == 1005) {
                    ApiResult apiResult = (ApiResult) com.code.android.json.OooO00o.OooO0OO(ApiResult.class, o000OO.OooO00o.OooO00o(str, true));
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
            AbsJavaBeanApi absJavaBeanApi = (AbsJavaBeanApi) oOo00OO0.OooO0O0(str, new TypeToken<AbsJavaBeanApi<UserCloseModel>>() { // from class: com.yalla.yalla.http.iteratehttp.IterateCallback$1
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

    @Override // p423o0OoO0o0.Oooo0
    public final void OooO0OO(int i, int i2, String str) {
        OooO0OO.OooO00o oooO00o = this.f23390OooO00o;
        if (oooO00o != null) {
            oooO00o.OooO0OO();
        }
    }
}
