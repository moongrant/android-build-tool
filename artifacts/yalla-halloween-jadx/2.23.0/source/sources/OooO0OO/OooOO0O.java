package OooO0OO;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import com.facebook.internal.ServerProtocol;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.qiniu.android.collect.ReportItem;
import com.qiniu.android.common.Constants;
import com.qiniu.android.http.ResponseInfo;
import com.yallatech.support.basecore.net.BizResponse;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.base.IEnv;
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
import javax.net.ssl.HttpsURLConnection;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jetbrains.annotations.NotNull;
import p007OooOOOo.OooOo00;
import p605o0oo0OO0.o000O;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Pair<String, String>[] f110OooO00o = {new Pair<>("app_platform", "1"), new Pair<>("Platform", "1"), new Pair<>("Sdk-Version", "1.2.0")};

    /* JADX WARN: Code duplicated, block: B:148:0x0376  */
    /* JADX WARN: Code duplicated, block: B:149:0x0377 A[Catch: all -> 0x037b, TRY_LEAVE, TryCatch #9 {all -> 0x037b, blocks: (B:146:0x0371, B:149:0x0377), top: B:207:0x0371 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x0396 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:162:0x0398  */
    /* JADX WARN: Code duplicated, block: B:163:0x0399 A[Catch: all -> 0x039d, TRY_LEAVE, TryCatch #12 {all -> 0x039d, blocks: (B:160:0x0393, B:163:0x0399), top: B:213:0x0393 }] */
    /* JADX WARN: Code duplicated, block: B:169:0x03a6 A[PHI: r0 r20
      0x03a6: PHI (r0v27 't' java.lang.Throwable) = (r0v31 't' java.lang.Throwable), (r0v32 't' java.lang.Throwable) binds: [B:167:0x03a3, B:153:0x0381] A[DONT_GENERATE, DONT_INLINE]
      0x03a6: PHI (r20v3 kotlin.jvm.internal.Ref$IntRef) = (r20v5 kotlin.jvm.internal.Ref$IntRef), (r20v7 kotlin.jvm.internal.Ref$IntRef) binds: [B:167:0x03a3, B:153:0x0381] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:213:0x0393 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:51:0x015b  */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static BizResponse OooO00o(@NotNull String appId, @NotNull OooO0O0.OooO0o appInfo) {
        String strOooO0O0;
        boolean z;
        InputStream connInputStream;
        OutputStream outputStream;
        Throwable t;
        OutputStream outputStream2;
        Signature signature;
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
                    strOooO0O0 = OooOOO.OooO00o.OooO0O0(byteArray);
                } else {
                    byte[] byteArray2 = packageInfo.signingInfo.getSigningCertificateHistory()[0].toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray2, "packageInfo.signingInfo.…eHistory[0].toByteArray()");
                    strOooO0O0 = OooOOO.OooO00o.OooO0O0(byteArray2);
                }
            } else {
                PackageInfo packageInfo2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
                if ((packageInfo2 == null ? null : packageInfo2.signatures) != null) {
                    Signature[] signatureArr = packageInfo2.signatures;
                    Intrinsics.checkNotNullExpressionValue(signatureArr, "packageInfo.signatures");
                    if ((signatureArr.length == 0) || (signature = packageInfo2.signatures[0]) == null) {
                        strOooO0O0 = null;
                    } else {
                        byte[] byteArray3 = signature.toByteArray();
                        Intrinsics.checkNotNullExpressionValue(byteArray3, "packageInfo.signatures[0].toByteArray()");
                        strOooO0O0 = OooOOO.OooO00o.OooO0O0(byteArray3);
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
        Pair[] pairArr2 = StringsKt.isBlank(appInfo.f95OooO00o) ? null : new Pair[]{new Pair("yalla_open_version", appInfo.f95OooO00o)};
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ((OooOo00) IEnv.INSTANCE.impl()).getClass();
        OooOo00.f200OooO0O0.getClass();
        Intrinsics.checkNotNullParameter("api.open.yalla.chat", ReportItem.RequestKeyHost);
        Intrinsics.checkNotNullParameter("v1/oauth2/app_check", "path");
        Intrinsics.checkNotNullParameter("https", "scheme");
        if (!Intrinsics.areEqual("https", "https")) {
            throw new IllegalStateException("Only Https connections are permitted!".toString());
        }
        Intrinsics.checkNotNullParameter("POST", "method");
        Pair[] params = (Pair[]) Arrays.copyOf(pairArr, 3);
        Intrinsics.checkNotNullParameter(params, "params");
        MapsKt.putAll(linkedHashMap2, params);
        Pair[] pairArr3 = (Pair[]) ArraysKt.plus(f110OooO00o, new Pair("open_version", "1.2.0"));
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
        StringBuilder sb = new StringBuilder("v1/oauth2/app_check");
        if (Intrinsics.areEqual("POST", "GET") && !linkedHashMap2.isEmpty()) {
            sb.append("?");
            int i = 0;
            for (Object obj : linkedHashMap2.keySet()) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String value = (String) obj;
                if (i > 0) {
                    sb.append("&");
                }
                StringBuilder sb2 = new StringBuilder();
                Intrinsics.checkNotNullParameter(value, "value");
                try {
                    String strEncode = URLEncoder.encode(value, Constants.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(strEncode, "{\n      URLEncoder.encode(value, \"utf-8\")\n    }");
                    sb2.append(strEncode);
                    sb2.append('=');
                    Object obj2 = linkedHashMap2.get(value);
                    Intrinsics.checkNotNull(obj2);
                    String value2 = obj2.toString();
                    Intrinsics.checkNotNullParameter(value2, "value");
                    try {
                        String strEncode2 = URLEncoder.encode(value2, Constants.UTF_8);
                        Intrinsics.checkNotNullExpressionValue(strEncode2, "{\n      URLEncoder.encode(value, \"utf-8\")\n    }");
                        sb2.append(strEncode2);
                        sb.append(sb2.toString());
                        i = i2;
                    } catch (UnsupportedEncodingException unused2) {
                        throw new IllegalStateException("Unable to encode using UTF-8");
                    }
                } catch (UnsupportedEncodingException unused3) {
                    throw new IllegalStateException("Unable to encode using UTF-8");
                }
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        URL url = new URL("https", "api.open.yalla.chat", string);
        Intrinsics.checkNotNull(url);
        p600o0oo0O.OooOo00 request = new p600o0oo0O.OooOo00(url, "POST", linkedHashMap, linkedHashMap2);
        Ref.IntRef intRef = new Ref.IntRef();
        String message = Intrinsics.stringPlus("Http request started! thread = ", Thread.currentThread().getName());
        Intrinsics.checkNotNullParameter(message, "message");
        if (o000O.f56902OooO0O0) {
            Log.d(o000O.f56901OooO00o, message);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        for (int i3 = 3; intRef.element < i3; i3 = 3) {
            OooO00o.OooO00o.OooO00o.OooO00o.OooOO0o.OooO00o onSuccess = new OooO00o.OooO00o.OooO00o.OooO00o.OooOO0o.OooO00o(objectRef, intRef);
            OooO00o.OooO00o.OooO00o.OooO00o.OooOO0o.OooO0O0 onFail = new OooO00o.OooO00o.OooO00o.OooO00o.OooOO0o.OooO0O0(intRef, objectRef);
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
            Intrinsics.checkNotNullParameter(onFail, "onFail");
            try {
                URL url2 = request.f56866OooO00o;
                String str = request.f56867OooO0O0;
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url2.openConnection());
                if (uRLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) uRLConnection).setConnectTimeout(30000);
                    ((HttpsURLConnection) uRLConnection).setReadTimeout(15000);
                    try {
                        ((HttpsURLConnection) uRLConnection).setInstanceFollowRedirects(false);
                        ((HttpsURLConnection) uRLConnection).setRequestMethod(str);
                        uRLConnection.setRequestProperty("Accept", "application/json");
                        Map<String, String> map = request.f56868OooO0OO;
                        if (!map.isEmpty()) {
                            for (String str2 : map.keySet()) {
                                uRLConnection.setRequestProperty(str2, map.get(str2));
                            }
                        }
                        Map<String, Object> map2 = request.f56869OooO0Oo;
                        if (Intrinsics.areEqual(str, "POST")) {
                            o00O.OooO0O0.OooO0OO((HttpURLConnection) uRLConnection, map2);
                            outputStream2 = ((HttpsURLConnection) uRLConnection).getOutputStream();
                        } else {
                            outputStream2 = null;
                        }
                        try {
                            int responseCode = ((HttpsURLConnection) uRLConnection).getResponseCode();
                            boolean z2 = responseCode >= 200 && responseCode < 300;
                            connInputStream = z2 ? ((HttpsURLConnection) uRLConnection).getInputStream() : ((HttpsURLConnection) uRLConnection).getErrorStream();
                            try {
                                Intrinsics.checkNotNullExpressionValue(connInputStream, "connInputStream");
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connInputStream));
                                char[] cArr = new char[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
                                StringBuilder sb3 = new StringBuilder();
                                intRef = intRef;
                                outputStream = outputStream2;
                                int i4 = 0;
                                while (i4 != -1) {
                                    try {
                                        i4 = bufferedReader.read(cArr);
                                        if (i4 != -1) {
                                            try {
                                                sb3.append(cArr, 0, i4);
                                            } catch (Throwable th) {
                                                th = th;
                                                try {
                                                    onFail.invoke(-100, "", th);
                                                    if (connInputStream == null) {
                                                        try {
                                                            connInputStream.close();
                                                            if (outputStream == null) {
                                                                outputStream.close();
                                                            }
                                                        } catch (Throwable th2) {
                                                            t = th2;
                                                            Intrinsics.checkNotNullParameter(t, "t");
                                                            if (o000O.f56902OooO0O0) {
                                                                Log.e(o000O.f56901OooO00o, "", t);
                                                            }
                                                        }
                                                    } else if (outputStream == null) {
                                                        outputStream.close();
                                                    }
                                                    intRef = intRef;
                                                } catch (Throwable th3) {
                                                    if (connInputStream != null) {
                                                        try {
                                                            connInputStream.close();
                                                        } catch (Throwable t2) {
                                                            Intrinsics.checkNotNullParameter(t2, "t");
                                                            if (!o000O.f56902OooO0O0) {
                                                                throw th3;
                                                            }
                                                            Log.e(o000O.f56901OooO00o, "", t2);
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
                                    } catch (Throwable th4) {
                                        th = th4;
                                        onFail.invoke(-100, "", th);
                                        if (connInputStream == null) {
                                            connInputStream.close();
                                            if (outputStream == null) {
                                                outputStream.close();
                                            }
                                        } else if (outputStream == null) {
                                            outputStream.close();
                                        }
                                        intRef = intRef;
                                    }
                                }
                                String string2 = sb3.toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
                                if (z2) {
                                    onSuccess.invoke(Integer.valueOf(responseCode), string2);
                                } else {
                                    try {
                                        onFail.invoke(Integer.valueOf(responseCode), string2, null);
                                    } catch (Throwable th5) {
                                        th = th5;
                                        onFail.invoke(-100, "", th);
                                        if (connInputStream == null) {
                                            connInputStream.close();
                                            if (outputStream == null) {
                                                outputStream.close();
                                            }
                                        } else if (outputStream == null) {
                                            outputStream.close();
                                        }
                                    }
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                intRef = intRef;
                                outputStream = outputStream2;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            intRef = intRef;
                            outputStream = outputStream2;
                            connInputStream = null;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        connInputStream = null;
                        outputStream = null;
                        onFail.invoke(-100, "", th);
                        if (connInputStream == null) {
                            connInputStream.close();
                            if (outputStream == null) {
                                outputStream.close();
                            }
                        } else if (outputStream == null) {
                            outputStream.close();
                        }
                        intRef = intRef;
                    }
                } else {
                    intRef = intRef;
                    connInputStream = null;
                    outputStream = null;
                }
                if (connInputStream != null) {
                    try {
                        connInputStream.close();
                        if (outputStream == null) {
                            outputStream.close();
                        }
                    } catch (Throwable th9) {
                        t = th9;
                        Intrinsics.checkNotNullParameter(t, "t");
                        if (o000O.f56902OooO0O0) {
                            Log.e(o000O.f56901OooO00o, "", t);
                        }
                    }
                } else if (outputStream == null) {
                    outputStream.close();
                }
            } catch (Throwable th10) {
                th = th10;
            }
            intRef = intRef;
        }
        BizResponse bizResponse = (BizResponse) objectRef.element;
        return bizResponse == null ? new BizResponse(ResponseInfo.CannotConnectToHost, "Unknown error", null, 4, null) : bizResponse;
    }
}
