package p160o00OoOO0;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.common.support.apollo.Apollo;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.yalla.common.manager.googlepay.GooglePaySignOrMd5;
import com.yalla.yalla.common.model.ApiError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import p016OooOoO0.OooOo00;
import p139o00OOOo0.o0ooOOo;
import p154o00Oo0oo.o0000Ooo;
import p168o00Ooo0.OooOOOO;
import p254o00ooO0O.o00000O;
import p485o0o000Oo.o000oOoO;
import p487o0o000oO.o00oO0o;
import p487o0o000oO.o0OOO0o;
import p487o0o000oO.o0Oo0oo;
import p516o0o0O000.o000000O;
import p516o0o0O000.o0OoOo0;
import p551o0oOO.OooOOO;
import p551o0oOO.OooOOO0;
import p660o0ooo0o0.o0O0ooO;
import p707oOooo0o.o000O;
import p708oo000o.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public final class o00OO0O0 {

    @Deprecated
    public interface OooO00o {
        void afterRequest();

        void beforeRequest();

        o000O getOldLoadingDialog();

        boolean isBeforeRequest();

        void onError(String str, String str2);

        void onFinish(String str);

        void onResponseLog(int i, String str, int i2);
    }

    public static void OooO00o(OooOOO oooOOO, Map<String, String> map) {
        String strOooO0Oo = o0OoOo0.OooO0Oo();
        String strQ = Apollo.f12658OooO00o.q("K1");
        if (StringsKt.isBlank(strQ)) {
            if (!o0OOO0o.OooO0OO()) {
                throw new NullPointerException("Apollo not init");
            }
            System.exit(1);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }
        String string = "";
        String strReplace = o000000O.OooO0OO(strOooO0Oo, strQ).replace("\n", "");
        String strOooO0Oo2 = o0OoOo0.OooO0Oo();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        o00oO0o o00oo0o2 = o00oO0o.f40931OooO00o;
        long j = jCurrentTimeMillis + o00oO0o.f40932OooO0O0;
        if (!OooO0OO.OooO00o(map)) {
            ArrayList arrayList = new ArrayList(map.entrySet());
            Collections.sort(arrayList, new o00OO00O());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arrayList.size(); i++) {
                Map.Entry entry = (Map.Entry) arrayList.get(i);
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                sb.append(str);
                sb.append("=");
                sb.append(str2);
                if (i != arrayList.size() - 1) {
                    sb.append("&");
                }
            }
            string = sb.toString();
        }
        StringBuilder sbOooO00o = Oooo0.OooO00o(GooglePaySignOrMd5.INSTANCE.md5(string), "|");
        o0Oo0oo o0oo0oo2 = o0Oo0oo.f40947OooO00o;
        sbOooO00o.append(o0Oo0oo.OooO00o());
        sbOooO00o.append("|");
        sbOooO00o.append(j);
        sbOooO00o.append("|");
        sbOooO00o.append(strOooO0Oo2);
        sbOooO00o.append("|");
        o0OOO0o o0ooo0o2 = o0OOO0o.f40936OooO00o;
        sbOooO00o.append(o0OOO0o.OooO00o());
        String string2 = sbOooO00o.toString();
        String strOooO0Oo3 = OooOOOO.OooO0Oo(strOooO0Oo, string2);
        oooOOO.OooO00o("bf", strReplace);
        oooOOO.OooO00o("timestamp", String.valueOf(j));
        oooOOO.OooO00o("nonce", strOooO0Oo2);
        oooOOO.OooO00o(DeviceRequestsHelper.DEVICE_INFO_DEVICE, o0Oo0oo.OooO00o());
        oooOOO.OooO00o("sign", strOooO0Oo3);
        for (Map.Entry<String, String> entry2 : o000oOoO.f40895OooO00o.OooO00o(string2).OooO00o().entrySet()) {
            oooOOO.OooO00o(entry2.getKey(), entry2.getValue());
        }
    }

    @Deprecated
    public static Map<String, String> OooO0O0() {
        return o0000Ooo.OooO00o();
    }

    public static void OooO0OO(String str, List<String> list, String str2, Map<String, String> map, OooO00o oooO00o) {
        if (oooO00o != null) {
            oooO00o.beforeRequest();
        }
        if (list.size() < 1) {
            return;
        }
        HashMap map2 = new HashMap();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            map2.put(it.next(), Boolean.FALSE);
        }
        String str3 = list.get(0);
        map2.put(str3, Boolean.TRUE);
        OooOOO0 oooOOO0 = new OooOOO0();
        oooOOO0.f44612OooO0O0 = str;
        oooOOO0.f44611OooO00o = OooOo00.OooO0Oo(str3, str2);
        oooOOO0.f44614OooO0Oo = map;
        OooO00o(oooOOO0, map);
        oooOOO0.OooO0O0().OooO00o(new o00OO000(oooOOO0, map2, str2, oooO00o));
    }

    public static void OooO0Oo(String str, List<String> list, String str2, Map<String, String> map, OooO00o oooO00o) {
        if (oooO00o != null) {
            oooO00o.beforeRequest();
        }
        if (list.size() < 1) {
            return;
        }
        HashMap map2 = new HashMap();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            map2.put(it.next(), Boolean.FALSE);
        }
        String str3 = list.get(0);
        map2.put(str3, Boolean.TRUE);
        p551o0oOO.OooOOOO oooOOOO = new p551o0oOO.OooOOOO();
        oooOOOO.f44612OooO0O0 = str;
        oooOOOO.f44611OooO00o = OooOo00.OooO0Oo(str3, str2);
        oooOOOO.f44614OooO0Oo = map;
        OooO00o(oooOOOO, map);
        oooOOOO.OooO0O0().OooO00o(new o00OO000(oooOOOO, map2, str2, oooO00o));
    }

    public static class OooO0O0 implements OooO00o {
        private static final String CANCELERROR = "-2";

        @Deprecated
        private Context mContext;
        private boolean mHaveBeforeAfter;

        @Deprecated
        private o000O mLoadingDialog;
        private String mTitle;

        public OooO0O0(Context context) {
            this.mHaveBeforeAfter = false;
            this.mTitle = "";
            this.mContext = context;
            if (this.mLoadingDialog == null) {
                Objects.requireNonNull(o0ooOOo.OooO00o());
                this.mLoadingDialog = new o000O();
            }
        }

        @Override // o00OoOO0.o00OO0O0.OooO00o
        public void afterRequest() {
            Context context;
            if (!this.mHaveBeforeAfter || (context = this.mContext) == null || !(context instanceof Activity) || ((Activity) context).isFinishing()) {
                return;
            }
            this.mLoadingDialog.OooO00o();
        }

        @Override // o00OoOO0.o00OO0O0.OooO00o
        public void beforeRequest() {
            Context context;
            if (!this.mHaveBeforeAfter || (context = this.mContext) == null || !(context instanceof Activity) || ((Activity) context).isFinishing()) {
                return;
            }
            this.mLoadingDialog.OooO0OO(this.mContext, this.mTitle);
        }

        public Context getContext() {
            return this.mContext;
        }

        @Override // o00OoOO0.o00OO0O0.OooO00o
        public o000O getOldLoadingDialog() {
            return this.mLoadingDialog;
        }

        @Override // o00OoOO0.o00OO0O0.OooO00o
        public boolean isBeforeRequest() {
            return this.mHaveBeforeAfter;
        }

        public void onCancel() {
        }

        @Override // o00OoOO0.o00OO0O0.OooO00o
        public void onError(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
            }
            int i = Integer.parseInt(str);
            if (str2 == null) {
                str2 = "";
            }
            ApiError error = new ApiError(i, str2);
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0o0000.OooOOOO(error, null), 3, null);
        }

        @Override // o00OoOO0.o00OO0O0.OooO00o
        public void onFinish(String str) {
        }

        public void onRequestError(o0O0ooO o0o0ooo, Exception exc, int i) {
            if (o0o0ooo.OooO0oo()) {
                onCancel();
            } else {
                onError(AppEventsConstants.EVENT_PARAM_VALUE_NO, "");
            }
        }

        @Override // o00OoOO0.o00OO0O0.OooO00o
        public void onResponseLog(int i, String str, int i2) {
        }

        @Deprecated
        public void setHaveBeforeAfter(boolean z) {
            this.mHaveBeforeAfter = z;
        }

        @Deprecated
        public void setTitle(String str) {
            this.mTitle = str;
        }

        public OooO0O0() {
            this.mHaveBeforeAfter = false;
            this.mTitle = "";
            this.mContext = o00000O.f34254OooO00o.OooO0O0();
            if (this.mLoadingDialog == null) {
                Objects.requireNonNull(o0ooOOo.OooO00o());
                this.mLoadingDialog = new o000O();
            }
        }
    }
}
