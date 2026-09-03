package com.app.base.Function;

import android.text.TextUtils;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.bean.AbsJavaBeanApi;
import com.app.base.model.UserCloseModel;
import com.facebook.appevents.AppEventsConstants;
import com.yalla.yalla.common.model.ApiResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import p168o00Ooo0.o0O0O00;
import p485o0o000Oo.o00Oo0;
import p515o0o0O00.o00O00;
import p516o0o0O000.o0OOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends p144o00Oo.OooO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO0OO.OooO00o f11337OooO0O0;

    public OooO(OooO0OO.OooO00o oooO00o) {
        this.f11337OooO0O0 = oooO00o;
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

    @Override // p144o00Oo.OooO0o
    public final void OooO00o(Exception exc) {
        OooO0OO.OooO00o oooO00o = this.f11337OooO0O0;
        if (oooO00o != null) {
            oooO00o.afterRequest();
            this.f11337OooO0O0.onError(AppEventsConstants.EVENT_PARAM_VALUE_NO, "");
            o00O00.OooO0Oo(exc.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0031  */
    @Override // p144o00Oo.OooO0o
    public final void OooO0O0(Object obj) {
        String string;
        String str = (String) obj;
        OooO0OO.OooO00o oooO00o = this.f11337OooO0O0;
        if (oooO00o != null) {
            oooO00o.afterRequest();
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
        int iOooOO0o = o0O0O00.OooOO0o(string);
        if (iOooOO0o == 1000) {
            OooO0OO.OooO00o oooO00o2 = this.f11337OooO0O0;
            if (oooO00o2 != null) {
                oooO00o2.onFinish(str);
                return;
            }
            return;
        }
        if (iOooOO0o != 1007 && iOooOO0o != 1004) {
            if (iOooOO0o == 1005) {
                String strOooO00o = o00Oo0.f40897OooO0O0.OooO00o(str, true);
                o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
                ApiResult apiResult = (ApiResult) o0OOO0o.OooO0O0(strOooO00o, ApiResult.class);
                this.f11337OooO0O0.onError(String.valueOf(apiResult.getCode()), apiResult.getMessage());
                return;
            }
            if (iOooOO0o != 4002 && iOooOO0o != 4003) {
                OooO0OO.OooO00o oooO00o3 = this.f11337OooO0O0;
                if (oooO00o3 != null) {
                    oooO00o3.OooO0O0(string);
                    return;
                }
                return;
            }
        }
        try {
            AbsJavaBeanApi absJavaBeanApi = (AbsJavaBeanApi) o0Oo0oo.OooO0OO(str, new OooO0o().getType());
            if (absJavaBeanApi == null || absJavaBeanApi.getData() == null || ((UserCloseModel) absJavaBeanApi.getData()).getBlockingMsg() == null) {
                OooO0OO.OooO00o oooO00o4 = this.f11337OooO0O0;
                if (oooO00o4 != null) {
                    oooO00o4.OooO0O0(string);
                }
            } else {
                o00O00.OooO0O0("result : " + absJavaBeanApi.toJSONString());
                OooO0OO.OooO00o oooO00o5 = this.f11337OooO0O0;
                if (oooO00o5 != null) {
                    oooO00o5.onError(string, ((UserCloseModel) absJavaBeanApi.getData()).getBlockingMsg());
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            OooO0OO.OooO00o oooO00o6 = this.f11337OooO0O0;
            if (oooO00o6 != null) {
                oooO00o6.OooO0O0(string);
            }
        }
    }

    @Override // p144o00Oo.OooO0o
    public final void OooO0OO(int i, String str, int i2) {
        OooO0OO.OooO00o oooO00o = this.f11337OooO0O0;
        if (oooO00o != null) {
            oooO00o.OooO00o();
        }
    }
}
