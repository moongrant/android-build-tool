package com.yalla.yalla.util.Function;

import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.google.gson.reflect.TypeToken;
import com.yalla.yalla.api.old.ApiAppConfig$getWebErrorList$1;
import com.yalla.yalla.model.bean.AbsJavaBeanApi;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.user.UserCloseModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import p423o0OoO0o0.o000oOoO;
import p424o0OoO0oO.o000OO;
import p579o0oOoo.oOo00OO0;
import p590o0oo0.OooOOOO;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOO0 extends o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0o f32812OooO00o;

    public OooOO0(ApiAppConfig$getWebErrorList$1 apiAppConfig$getWebErrorList$1) {
        this.f32812OooO00o = apiAppConfig$getWebErrorList$1;
    }

    public static Object OooO0o0(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return new JSONTokener(str).nextValue();
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // p423o0OoO0o0.Oooo0
    public final void OooO00o(Exception exc) {
        OooO0o oooO0o = this.f32812OooO00o;
        if (oooO0o != null) {
            oooO0o.OooO0Oo();
            oooO0o.OooO0O0(AppEventsConstants.EVENT_PARAM_VALUE_NO, "");
            OooOOO0.OooO0Oo(exc.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    @Override // p423o0OoO0o0.Oooo0
    public final void OooO0O0(Object obj) {
        String string;
        String str = (String) obj;
        OooO0o oooO0o = this.f32812OooO00o;
        if (oooO0o != null) {
            oooO0o.OooO0Oo();
        }
        try {
            if (TextUtils.isEmpty(str)) {
                string = "";
            } else {
                Object objOooO0o0 = OooO0o0(str);
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
            if (oooO0o != null) {
                oooO0o.OooO0o0(str);
                return;
            }
            return;
        }
        if (iOooOO0O != 1007 && iOooOO0O != 1004) {
            if (iOooOO0O == 1005) {
                ApiResult apiResult = (ApiResult) com.code.android.json.OooO00o.OooO0OO(ApiResult.class, o000OO.OooO00o.OooO00o(str, true));
                oooO0o.OooO0O0(String.valueOf(apiResult.getCode()), apiResult.getMessage());
                return;
            } else if (iOooOO0O != 4002 && iOooOO0O != 4003) {
                if (oooO0o != null) {
                    oooO0o.OooO00o(string);
                    return;
                }
                return;
            }
        }
        try {
            AbsJavaBeanApi absJavaBeanApi = (AbsJavaBeanApi) oOo00OO0.OooO0O0(str, new TypeToken<AbsJavaBeanApi<UserCloseModel>>() { // from class: com.yalla.yalla.util.Function.WebApiCallback$1
            }.getType());
            if (absJavaBeanApi != null && absJavaBeanApi.getData() != null && ((UserCloseModel) absJavaBeanApi.getData()).getBlockingMsg() != null) {
                OooOOO0.OooO0O0("result : " + absJavaBeanApi.toJSONString());
                if (oooO0o != null) {
                    oooO0o.OooO0O0(string, ((UserCloseModel) absJavaBeanApi.getData()).getBlockingMsg());
                }
            } else if (oooO0o != null) {
                oooO0o.OooO00o(string);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            if (oooO0o != null) {
                oooO0o.OooO00o(string);
            }
        }
    }

    @Override // p423o0OoO0o0.Oooo0
    public final void OooO0OO(int i, int i2, String str) {
        OooO0o oooO0o = this.f32812OooO00o;
        if (oooO0o != null) {
            oooO0o.OooO0OO();
        }
    }
}
