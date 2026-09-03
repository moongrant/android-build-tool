package p160o00OoOO0;

import OooO00o.OooO00o;
import android.text.TextUtils;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.bean.AbsJavaBeanApi;
import com.app.base.model.UserCloseModel;
import com.facebook.appevents.AppEventsConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.common.model.ApiError1058;
import com.yalla.yalla.common.model.ApiResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p144o00Oo.OooO;
import p168o00Ooo0.o0O0O00;
import p485o0o000Oo.o00Oo0;
import p516o0o0O000.o0OOO0o;
import p551o0oOO.OooOOO;
import p551o0oOO.OooOOO0;
import p551o0oOO.OooOOOO;

/* JADX INFO: loaded from: classes.dex */
public final class o00OO000 extends OooO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o00OO0O0.OooO00o f32490OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooOOO f32491OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public HashMap<String, Boolean> f32492OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f32493OooO0o0;

    public o00OO000(OooOOO oooOOO, HashMap<String, Boolean> map, String str, o00OO0O0.OooO00o oooO00o) {
        this.f32491OooO0OO = oooOOO;
        this.f32492OooO0Oo = map;
        this.f32493OooO0o0 = str;
        this.f32490OooO0O0 = oooO00o;
    }

    @Override // p144o00Oo.OooO0o
    public final void OooO00o(Exception exc) {
        String key;
        Iterator<Map.Entry<String, Boolean>> it = this.f32492OooO0Oo.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                key = "";
                break;
            }
            Map.Entry<String, Boolean> next = it.next();
            if (!next.getValue().booleanValue()) {
                key = next.getKey();
                this.f32492OooO0Oo.put(key, Boolean.TRUE);
                break;
            }
        }
        OooOOO oooOOO = this.f32491OooO0OO;
        if (oooOOO != null) {
            oooOOO.toString();
        }
        if (TextUtils.isEmpty(key)) {
            o00OO0O0.OooO00o oooO00o = this.f32490OooO0O0;
            if (oooO00o != null) {
                oooO00o.afterRequest();
                this.f32490OooO0O0.onError(AppEventsConstants.EVENT_PARAM_VALUE_NO, "");
                return;
            }
            return;
        }
        Map<String, String> map = null;
        OooOOO oooOOO2 = this.f32491OooO0OO;
        if (oooOOO2 instanceof OooOOO0) {
            map = ((OooOOO0) oooOOO2).f44614OooO0Oo;
        } else if (oooOOO2 instanceof OooOOOO) {
            map = ((OooOOOO) oooOOO2).f44614OooO0Oo;
        }
        o00OO0O0.OooO00o(oooOOO2, map);
        OooOOO oooOOO3 = this.f32491OooO0OO;
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0(key);
        sbOooO0o0.append(this.f32493OooO0o0);
        oooOOO3.f44611OooO00o = sbOooO0o0.toString();
        oooOOO3.OooO0O0().OooO00o(new o00OO000(this.f32491OooO0OO, this.f32492OooO0Oo, this.f32493OooO0o0, this.f32490OooO0O0));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    @Override // p144o00Oo.OooO0o
    public final void OooO0O0(Object obj) {
        String string;
        String str = (String) obj;
        o00OO0O0.OooO00o oooO00o = this.f32490OooO0O0;
        if (oooO00o != null) {
            oooO00o.afterRequest();
        }
        try {
            if (TextUtils.isEmpty(str)) {
                string = "";
            } else {
                Object objOooO0o0 = com.app.base.Function.OooO.OooO0o0(str);
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
            o00OO0O0.OooO00o oooO00o2 = this.f32490OooO0O0;
            if (oooO00o2 != null) {
                oooO00o2.onFinish(str);
                return;
            }
            return;
        }
        if (iOooOO0o != 1007) {
            if (iOooOO0o == 1059) {
                ApiError1058 apiError1058 = (ApiError1058) o0Oo0oo.OooO0O0(str, ApiError1058.class);
                if (apiError1058 != null && apiError1058.getAdditionalData() != null) {
                    p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
                    oooOOO.OooOo00().postValue(apiError1058.getAdditionalData().getActiveToken());
                    oooOOO.OooOo().postValue(Long.valueOf(apiError1058.getAdditionalData().getUserId()));
                }
                LiveEventBus.get("ACTIVE_ACCOUNT").post(null);
                return;
            }
            if (iOooOO0o != 1004) {
                if (iOooOO0o == 1005) {
                    String strOooO00o = o00Oo0.f40897OooO0O0.OooO00o(str, true);
                    o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
                    ApiResult apiResult = (ApiResult) o0OOO0o.OooO0O0(strOooO00o, ApiResult.class);
                    this.f32490OooO0O0.onError(String.valueOf(apiResult.getCode()), apiResult.getMessage());
                    return;
                }
                if (iOooOO0o != 4002 && iOooOO0o != 4003) {
                    o00OO0O0.OooO00o oooO00o3 = this.f32490OooO0O0;
                    if (oooO00o3 != null) {
                        oooO00o3.onError(string, "");
                        return;
                    }
                    return;
                }
            }
        }
        try {
            AbsJavaBeanApi absJavaBeanApi = (AbsJavaBeanApi) o0Oo0oo.OooO0OO(str, new o00O().getType());
            if (absJavaBeanApi == null || absJavaBeanApi.getData() == null || ((UserCloseModel) absJavaBeanApi.getData()).getBlockingMsg() == null) {
                o00OO0O0.OooO00o oooO00o4 = this.f32490OooO0O0;
                if (oooO00o4 != null) {
                    oooO00o4.onError(string, "");
                }
            } else {
                o00OO0O0.OooO00o oooO00o5 = this.f32490OooO0O0;
                if (oooO00o5 != null) {
                    oooO00o5.onError(string, ((UserCloseModel) absJavaBeanApi.getData()).getBlockingMsg());
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            o00OO0O0.OooO00o oooO00o6 = this.f32490OooO0O0;
            if (oooO00o6 != null) {
                oooO00o6.onError(string, "");
            }
        }
    }

    @Override // p144o00Oo.OooO0o
    public final void OooO0OO(int i, String str, int i2) {
        o00OO0O0.OooO00o oooO00o = this.f32490OooO0O0;
        if (oooO00o != null) {
            oooO00o.onResponseLog(i, str, i2);
        }
    }
}
