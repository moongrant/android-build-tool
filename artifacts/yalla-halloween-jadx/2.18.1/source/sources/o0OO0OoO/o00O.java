package o0OO0OoO;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzfw;
import com.google.android.gms.measurement.internal.zzih;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.DebugKt;
import o0OO0OoO.o00O;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@WorkerThread
public final class o00O implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final URL f37628Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ zzih f37629Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final zzfw f37630Oooo0oo;

    public o00O(zzih zzihVar, String str, URL url, zzfw zzfwVar) {
        this.f37629Oooo0oO = zzihVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzfwVar);
        this.f37628Oooo0o = url;
        this.f37630Oooo0oo = zzfwVar;
    }

    public final void OooO00o(final int i, final Exception exc, final byte[] bArr, final Map map) {
        this.f37629Oooo0oO.f37615OooO00o.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzif
            /* JADX WARN: Code duplicated, block: B:9:0x0024  */
            @Override // java.lang.Runnable
            public final void run() {
                List<ResolveInfo> listQueryIntentActivities;
                o00O o00o2 = this.zza;
                int i2 = i;
                Exception exc2 = exc;
                byte[] bArr2 = bArr;
                zzfy zzfyVar = o00o2.f37630Oooo0oo.zza;
                if (i2 == 200 || i2 == 204) {
                    if (exc2 == null) {
                        zzfyVar.zzm().f37778OooOOo0.zza(true);
                        if (bArr2 != null || bArr2.length == 0) {
                            zzfyVar.zzay().zzc().zza("Deferred Deep Link response empty.");
                            return;
                        }
                        try {
                            JSONObject jSONObject = new JSONObject(new String(bArr2));
                            String strOptString = jSONObject.optString("deeplink", "");
                            String strOptString2 = jSONObject.optString("gclid", "");
                            double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                            if (TextUtils.isEmpty(strOptString)) {
                                zzfyVar.zzay().zzc().zza("Deferred Deep Link is empty.");
                            } else {
                                zzlh zzlhVarZzv = zzfyVar.zzv();
                                zzfy zzfyVar2 = zzlhVarZzv.f37615OooO00o;
                                if (TextUtils.isEmpty(strOptString) || (listQueryIntentActivities = zzlhVarZzv.f37615OooO00o.f16193OooO00o.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0)) == null || listQueryIntentActivities.isEmpty()) {
                                    zzfyVar.zzay().zzk().zzc("Deferred Deep Link validation failed. gclid, deep link", strOptString2, strOptString);
                                } else {
                                    Bundle bundle = new Bundle();
                                    bundle.putString("gclid", strOptString2);
                                    bundle.putString("_cis", "ddp");
                                    zzfyVar.f16207OooOOOo.OooO0OO(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_cmp", bundle);
                                    zzlh zzlhVarZzv2 = zzfyVar.zzv();
                                    if (!TextUtils.isEmpty(strOptString)) {
                                        try {
                                            SharedPreferences.Editor editorEdit = zzlhVarZzv2.f37615OooO00o.f16193OooO00o.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                            editorEdit.putString("deeplink", strOptString);
                                            editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                                            if (editorEdit.commit()) {
                                                zzlhVarZzv2.f37615OooO00o.f16193OooO00o.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                            }
                                        } catch (RuntimeException e) {
                                            zzlhVarZzv2.f37615OooO00o.zzay().zzd().zzb("Failed to persist Deferred Deep Link. exception", e);
                                        }
                                    }
                                }
                            }
                            return;
                        } catch (JSONException e2) {
                            zzfyVar.zzay().zzd().zzb("Failed to parse the Deferred Deep Link response. exception", e2);
                            return;
                        }
                    }
                } else if (i2 == 304) {
                    i2 = 304;
                    if (exc2 == null) {
                        zzfyVar.zzm().f37778OooOOo0.zza(true);
                        if (bArr2 != null) {
                        }
                        zzfyVar.zzay().zzc().zza("Deferred Deep Link response empty.");
                        return;
                    }
                }
                zzfyVar.zzay().zzk().zzc("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), exc2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0099  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [o0OO0OoO.o00O] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        ?? r4;
        ?? r5;
        Throwable th;
        int responseCode;
        IOException e;
        InputStream inputStream;
        this.f37629Oooo0oO.zzax();
        try {
            zzih zzihVar = this.f37629Oooo0oO;
            URLConnection uRLConnectionOpenConnection = this.f37628Oooo0o.openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            zzihVar.f37615OooO00o.zzf();
            r4 = 60000;
            r5 = 60000;
            httpURLConnection.setConnectTimeout(60000);
            zzihVar.f37615OooO00o.zzf();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                responseCode = httpURLConnection.getResponseCode();
                try {
                    try {
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int i = inputStream.read(bArr);
                                    if (i <= 0) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        inputStream.close();
                                        httpURLConnection.disconnect();
                                        OooO00o(responseCode, null, byteArray, headerFields);
                                        return;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            inputStream = null;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        r5 = 0;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        OooO00o(responseCode, e, null, r5);
                    } catch (Throwable th4) {
                        th = th4;
                        r4 = 0;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        OooO00o(responseCode, null, null, r4);
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    OooO00o(responseCode, e, null, r5);
                } catch (Throwable th5) {
                    th = th5;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    OooO00o(responseCode, null, null, r4);
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
                r5 = 0;
                e = e;
                responseCode = 0;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                OooO00o(responseCode, e, null, r5);
            } catch (Throwable th6) {
                th = th6;
                r4 = 0;
                th = th;
                responseCode = 0;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                OooO00o(responseCode, null, null, r4);
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            httpURLConnection = null;
            r5 = 0;
        } catch (Throwable th7) {
            th = th7;
            httpURLConnection = null;
            r4 = 0;
        }
    }
}
