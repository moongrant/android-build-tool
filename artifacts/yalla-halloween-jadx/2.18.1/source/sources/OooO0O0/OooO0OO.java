package OooO0O0;

import OooO00o.OooO;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import com.facebook.internal.ServerProtocol;
import com.qiniu.android.collect.ReportItem;
import com.qiniu.android.common.Constants;
import com.qiniu.android.http.ResponseInfo;
import com.qiniu.android.http.request.Request;
import com.umeng.commonsdk.internal.a;
import com.yallatech.support.basecore.net.BizResponse;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.base.IEnv;
import com.yallatech.support.platform.login.bean.AppStatus;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p625o0oo0oo.o000OO0O;
import p626o0oo0oo0.o000O0o;
import p626o0oo0oo0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO0OO f88OooO00o = new OooO0OO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Pair<String, String>[] f89OooO0O0 = {new Pair<>("app_platform", "1"), new Pair<>("Platform", "1"), new Pair<>("Sdk-Version", a.e)};

    /* JADX WARN: Code duplicated, block: B:129:0x0345  */
    /* JADX WARN: Code duplicated, block: B:130:0x0346 A[Catch: all -> 0x034a, TRY_LEAVE, TryCatch #9 {all -> 0x034a, blocks: (B:127:0x0340, B:130:0x0346), top: B:191:0x0340 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x036b  */
    /* JADX WARN: Code duplicated, block: B:145:0x036c A[Catch: all -> 0x0370, TRY_LEAVE, TryCatch #0 {all -> 0x0370, blocks: (B:142:0x0366, B:145:0x036c), top: B:175:0x0366 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x0379 A[PHI: r0 r18 r19
      0x0379: PHI (r0v27 't' java.lang.Throwable) = (r0v32 't' java.lang.Throwable), (r0v33 't' java.lang.Throwable) binds: [B:149:0x0376, B:134:0x0350] A[DONT_GENERATE, DONT_INLINE]
      0x0379: PHI (r18v2 kotlin.jvm.internal.Ref$IntRef) = (r18v4 kotlin.jvm.internal.Ref$IntRef), (r18v6 kotlin.jvm.internal.Ref$IntRef) binds: [B:149:0x0376, B:134:0x0350] A[DONT_GENERATE, DONT_INLINE]
      0x0379: PHI (r19v2 o0oo0oo0.o000O0o) = (r19v4 o0oo0oo0.o000O0o), (r19v6 o0oo0oo0.o000O0o) binds: [B:149:0x0376, B:134:0x0350] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:51:0x0153  */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final BizResponse<AppStatus> OooO00o(@NotNull String appId, @NotNull OooO appInfo) {
        String strOooO0O0;
        boolean z;
        Ref.IntRef intRef;
        o000O0o o000o0o2;
        OutputStream outputStream;
        InputStream connInputStream;
        Throwable t;
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("app_id", appId);
        pairArr[1] = new Pair(ServerProtocol.DIALOG_PARAM_REDIRECT_URI, YCSDKOpenKit.getDirectUrl$lib_release());
        Context context = YCSDKOpenKit.getApplicationContext$lib_release();
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 134217728);
                if ((packageInfo == null ? null : packageInfo.signingInfo) == null) {
                    strOooO0O0 = null;
                } else if (packageInfo.signingInfo.hasMultipleSigners()) {
                    byte[] byteArray = packageInfo.signingInfo.getApkContentsSigners()[0].toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray, "packageInfo.signingInfo.…sSigners[0].toByteArray()");
                    strOooO0O0 = OooOOO0.OooO00o.OooO0O0(byteArray);
                } else {
                    byte[] byteArray2 = packageInfo.signingInfo.getSigningCertificateHistory()[0].toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray2, "packageInfo.signingInfo.…eHistory[0].toByteArray()");
                    strOooO0O0 = OooOOO0.OooO00o.OooO0O0(byteArray2);
                }
            } else {
                PackageInfo packageInfo2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
                if ((packageInfo2 == null ? null : packageInfo2.signatures) != null) {
                    Signature[] signatureArr = packageInfo2.signatures;
                    Intrinsics.checkNotNullExpressionValue(signatureArr, "packageInfo.signatures");
                    if (signatureArr.length == 0) {
                        strOooO0O0 = null;
                    } else {
                        Signature[] signatureArr2 = packageInfo2.signatures;
                        if (signatureArr2[0] == null) {
                            strOooO0O0 = null;
                        } else {
                            byte[] byteArray3 = signatureArr2[0].toByteArray();
                            Intrinsics.checkNotNullExpressionValue(byteArray3, "packageInfo.signatures[0].toByteArray()");
                            strOooO0O0 = OooOOO0.OooO00o.OooO0O0(byteArray3);
                        }
                    }
                } else {
                    strOooO0O0 = null;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (strOooO0O0 == null) {
            strOooO0O0 = "";
        }
        pairArr[2] = new Pair("sign", strOooO0O0);
        Pair[] pairArr2 = StringsKt.isBlank(appInfo.f8OooO00o) ? null : new Pair[]{new Pair("yalla_open_version", appInfo.f8OooO00o)};
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Objects.requireNonNull((OooOOOO.OooO00o) IEnv.INSTANCE.impl());
        Objects.requireNonNull(OooOOOO.OooO00o.f176OooO0O0);
        Intrinsics.checkNotNullParameter("api.open.yalla.chat", ReportItem.RequestKeyHost);
        Intrinsics.checkNotNullParameter("v1/oauth2/app_check", "path");
        Intrinsics.checkNotNullParameter("https", "scheme");
        if (!Intrinsics.areEqual("https", "https")) {
            throw new IllegalStateException("Only Https connections are permitted!".toString());
        }
        Intrinsics.checkNotNullParameter(Request.HttpMethodPOST, "method");
        Pair[] params = (Pair[]) Arrays.copyOf(pairArr, 3);
        Intrinsics.checkNotNullParameter(params, "params");
        MapsKt.putAll(linkedHashMap2, params);
        Pair[] pairArr3 = (Pair[]) ArraysKt.plus(f89OooO0O0, new Pair("open_version", a.e));
        if (pairArr2 == null) {
            z = true;
        } else if (pairArr2.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            pairArr3 = (Pair[]) ArraysKt.plus((Object[]) pairArr3, (Object[]) pairArr2);
        }
        Pair[] headers = (Pair[]) Arrays.copyOf(pairArr3, pairArr3.length);
        Intrinsics.checkNotNullParameter(headers, "headers");
        MapsKt.putAll(linkedHashMap, headers);
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("v1/oauth2/app_check");
        if (Intrinsics.areEqual(Request.HttpMethodPOST, Request.HttpMethodGet) && !linkedHashMap2.isEmpty()) {
            sbOooO0o0.append("?");
            int i = 0;
            for (Object obj : linkedHashMap2.keySet()) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String value = (String) obj;
                if (i > 0) {
                    sbOooO0o0.append("&");
                }
                StringBuilder sb = new StringBuilder();
                Intrinsics.checkNotNullParameter(value, "value");
                try {
                    String strEncode = URLEncoder.encode(value, Constants.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(strEncode, "{\n      URLEncoder.encode(value, \"utf-8\")\n    }");
                    sb.append(strEncode);
                    sb.append('=');
                    Object obj2 = linkedHashMap2.get(value);
                    Intrinsics.checkNotNull(obj2);
                    String value2 = obj2.toString();
                    Intrinsics.checkNotNullParameter(value2, "value");
                    try {
                        String strEncode2 = URLEncoder.encode(value2, Constants.UTF_8);
                        Intrinsics.checkNotNullExpressionValue(strEncode2, "{\n      URLEncoder.encode(value, \"utf-8\")\n    }");
                        sb.append(strEncode2);
                        sbOooO0o0.append(sb.toString());
                        i = i2;
                    } catch (UnsupportedEncodingException unused2) {
                        throw new IllegalStateException("Unable to encode using UTF-8");
                    }
                } catch (UnsupportedEncodingException unused3) {
                    throw new IllegalStateException("Unable to encode using UTF-8");
                }
            }
        }
        String string = sbOooO0o0.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        URL url = new URL("https", "api.open.yalla.chat", string);
        Intrinsics.checkNotNull(url);
        o000O0o request = new o000O0o(url, Request.HttpMethodPOST, linkedHashMap, linkedHashMap2);
        Ref.IntRef intRef2 = new Ref.IntRef();
        String message = Intrinsics.stringPlus("Http request started! thread = ", Thread.currentThread().getName());
        Intrinsics.checkNotNullParameter(message, "message");
        if (o000OO0O.f48670OooO0O0) {
            Log.d(o000OO0O.f48669OooO00o, message);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        int i3 = 3;
        while (intRef2.element < i3) {
            OooO00o.OooO00o.OooO00o.OooO00o.OooOO0o.OooO00o onSuccess = new OooO00o.OooO00o.OooO00o.OooO00o.OooOO0o.OooO00o(objectRef, intRef2);
            OooO00o.OooO00o.OooO00o.OooO00o.OooOO0o.OooO0O0 onFail = new OooO00o.OooO00o.OooO00o.OooO00o.OooOO0o.OooO0O0(intRef2, objectRef);
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
            Intrinsics.checkNotNullParameter(onFail, "onFail");
            try {
                URLConnection uRLConnectionOpenConnection = request.f48673OooO00o.openConnection();
                if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) uRLConnectionOpenConnection).setConnectTimeout(30000);
                    ((HttpsURLConnection) uRLConnectionOpenConnection).setReadTimeout(15000);
                    ((HttpsURLConnection) uRLConnectionOpenConnection).setInstanceFollowRedirects(false);
                    ((HttpsURLConnection) uRLConnectionOpenConnection).setRequestMethod(request.f48674OooO0O0);
                    uRLConnectionOpenConnection.setRequestProperty("Accept", "application/json");
                    Map<String, String> map = request.f48675OooO0OO;
                    if (!map.isEmpty()) {
                        for (String str : map.keySet()) {
                            uRLConnectionOpenConnection.setRequestProperty(str, map.get(str));
                        }
                    }
                    Map<String, Object> map2 = request.f48676OooO0Oo;
                    if (Intrinsics.areEqual(request.f48674OooO0O0, Request.HttpMethodPOST)) {
                        o000Oo0.OooO00o((HttpURLConnection) uRLConnectionOpenConnection, map2);
                        outputStream = ((HttpsURLConnection) uRLConnectionOpenConnection).getOutputStream();
                    } else {
                        outputStream = null;
                    }
                    try {
                        int responseCode = ((HttpsURLConnection) uRLConnectionOpenConnection).getResponseCode();
                        boolean z2 = responseCode >= 200 && responseCode < 300;
                        connInputStream = z2 ? ((HttpsURLConnection) uRLConnectionOpenConnection).getInputStream() : ((HttpsURLConnection) uRLConnectionOpenConnection).getErrorStream();
                        try {
                            Intrinsics.checkNotNullExpressionValue(connInputStream, "connInputStream");
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connInputStream));
                            char[] cArr = new char[1024];
                            StringBuilder sb2 = new StringBuilder();
                            intRef = intRef2;
                            o000o0o2 = request;
                            int i4 = 0;
                            while (i4 != -1) {
                                try {
                                    i4 = bufferedReader.read(cArr);
                                    if (i4 != -1) {
                                        sb2.append(cArr, 0, i4);
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    try {
                                        onFail.invoke(-100, "", th);
                                        if (connInputStream != null) {
                                            try {
                                                connInputStream.close();
                                                if (outputStream == null) {
                                                    outputStream.close();
                                                }
                                            } catch (Throwable th2) {
                                                t = th2;
                                                Intrinsics.checkNotNullParameter(t, "t");
                                                if (o000OO0O.f48670OooO0O0) {
                                                    Log.e(o000OO0O.f48669OooO00o, "", t);
                                                }
                                            }
                                        } else if (outputStream == null) {
                                            outputStream.close();
                                        }
                                        i3 = 3;
                                        intRef2 = intRef;
                                        request = o000o0o2;
                                    } catch (Throwable th3) {
                                        if (connInputStream != null) {
                                            try {
                                                connInputStream.close();
                                            } catch (Throwable t2) {
                                                Intrinsics.checkNotNullParameter(t2, "t");
                                                if (!o000OO0O.f48670OooO0O0) {
                                                    throw th3;
                                                }
                                                Log.e(o000OO0O.f48669OooO00o, "", t2);
                                                throw th3;
                                            }
                                        }
                                        if (outputStream == null) {
                                            throw th3;
                                        }
                                        outputStream.close();
                                        throw th3;
                                    }
                                }
                            }
                            String string2 = sb2.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
                            if (z2) {
                                onSuccess.invoke(Integer.valueOf(responseCode), string2);
                            } else {
                                onFail.invoke(Integer.valueOf(responseCode), string2, null);
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            intRef = intRef2;
                            o000o0o2 = request;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        intRef = intRef2;
                        o000o0o2 = request;
                        connInputStream = null;
                    }
                } else {
                    intRef = intRef2;
                    o000o0o2 = request;
                    outputStream = null;
                    connInputStream = null;
                }
                if (connInputStream != null) {
                    try {
                        connInputStream.close();
                        if (outputStream == null) {
                            outputStream.close();
                        }
                    } catch (Throwable th6) {
                        t = th6;
                        Intrinsics.checkNotNullParameter(t, "t");
                        if (o000OO0O.f48670OooO0O0) {
                            Log.e(o000OO0O.f48669OooO00o, "", t);
                        }
                    }
                } else if (outputStream == null) {
                    outputStream.close();
                }
            } catch (Throwable th7) {
                th = th7;
                intRef = intRef2;
                o000o0o2 = request;
                outputStream = null;
                connInputStream = null;
            }
            i3 = 3;
            intRef2 = intRef;
            request = o000o0o2;
        }
        BizResponse<AppStatus> bizResponse = (BizResponse) objectRef.element;
        return bizResponse == null ? new BizResponse<>(ResponseInfo.CannotConnectToHost, "Unknown error", null, 4, null) : bizResponse;
    }
}
