package p271o00ooooo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzgd;
import com.google.android.gms.measurement.internal.zzio;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.json.JSONException;
import org.json.JSONObject;
import p271o00ooooo.oOOO0OOO;

/* JADX INFO: loaded from: classes3.dex */
@WorkerThread
public final class oOOO0OOO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final URL f40746OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final zzgb f40747OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzio f40748OooO0o0;

    public oOOO0OOO(zzio zzioVar, String str, URL url, zzgb zzgbVar) {
        this.f40748OooO0o0 = zzioVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzgbVar);
        this.f40746OooO0Oo = url;
        this.f40747OooO0o = zzgbVar;
    }

    public final void OooO00o(final int i, final IOException iOException, final byte[] bArr, final Map map) {
        this.f40748OooO0o0.f40788OooO00o.zzaB().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzim
            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            @Override // java.lang.Runnable
            public final void run() {
                List<ResolveInfo> listQueryIntentActivities;
                oOOO0OOO oooo0ooo = this.zza;
                int i2 = i;
                Exception exc = iOException;
                byte[] bArr2 = bArr;
                zzgd zzgdVar = oooo0ooo.f40747OooO0o.zza;
                zzgdVar.getClass();
                if (i2 == 200 || i2 == 204) {
                    if (exc == null) {
                        zzgdVar.zzm().f40778OooOOo.zza(true);
                        if (bArr2 != null || bArr2.length == 0) {
                            zzgdVar.zzaA().zzc().zza("Deferred Deep Link response empty.");
                            return;
                        }
                        try {
                            JSONObject jSONObject = new JSONObject(new String(bArr2));
                            String strOptString = jSONObject.optString("deeplink", "");
                            String strOptString2 = jSONObject.optString("gclid", "");
                            double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                            if (TextUtils.isEmpty(strOptString)) {
                                zzgdVar.zzaA().zzc().zza("Deferred Deep Link is empty.");
                            } else {
                                zzlp zzlpVarZzv = zzgdVar.zzv();
                                zzgd zzgdVar2 = zzlpVarZzv.f40788OooO00o;
                                if (TextUtils.isEmpty(strOptString) || (listQueryIntentActivities = zzlpVarZzv.f40788OooO00o.f15513OooO00o.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0)) == null || listQueryIntentActivities.isEmpty()) {
                                    zzgdVar.zzaA().zzk().zzc("Deferred Deep Link validation failed. gclid, deep link", strOptString2, strOptString);
                                } else {
                                    Bundle bundle = new Bundle();
                                    bundle.putString("gclid", strOptString2);
                                    bundle.putString("_cis", "ddp");
                                    zzgdVar.f15527OooOOOo.OooO0OO(bundle, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_cmp");
                                    zzlp zzlpVarZzv2 = zzgdVar.zzv();
                                    if (!TextUtils.isEmpty(strOptString)) {
                                        try {
                                            SharedPreferences.Editor editorEdit = zzlpVarZzv2.f40788OooO00o.f15513OooO00o.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                            editorEdit.putString("deeplink", strOptString);
                                            editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                                            if (editorEdit.commit()) {
                                                zzlpVarZzv2.f40788OooO00o.f15513OooO00o.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                            }
                                        } catch (RuntimeException e) {
                                            zzlpVarZzv2.f40788OooO00o.zzaA().zzd().zzb("Failed to persist Deferred Deep Link. exception", e);
                                        }
                                    }
                                }
                            }
                            return;
                        } catch (JSONException e2) {
                            zzgdVar.zzaA().zzd().zzb("Failed to parse the Deferred Deep Link response. exception", e2);
                            return;
                        }
                    }
                } else if (i2 == 304) {
                    i2 = 304;
                    if (exc == null) {
                        zzgdVar.zzm().f40778OooOOo.zza(true);
                        if (bArr2 != null) {
                        }
                        zzgdVar.zzaA().zzc().zza("Deferred Deep Link response empty.");
                        return;
                    }
                }
                zzgdVar.zzaA().zzk().zzc("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), exc);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [o00ooooo.oOOO0OOO] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        ?? r4;
        ?? r5;
        InputStream inputStream;
        zzio zzioVar = this.f40748OooO0o0;
        zzioVar.zzaz();
        zzgd zzgdVar = zzioVar.f40788OooO00o;
        int i = 0;
        try {
            URLConnection uRLConnectionOpenConnection = this.f40746OooO0Oo.openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            zzgdVar.zzf();
            ?? r6 = 60000;
            ?? r7 = 60000;
            httpURLConnection.setConnectTimeout(60000);
            zzgdVar.zzf();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                int responseCode = httpURLConnection.getResponseCode();
                try {
                    try {
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                byte[] bArr = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
                                while (true) {
                                    int i2 = inputStream.read(bArr);
                                    if (i2 <= 0) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        inputStream.close();
                                        httpURLConnection.disconnect();
                                        OooO00o(responseCode, null, byteArray, headerFields);
                                        return;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i2);
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            inputStream = null;
                        }
                    } catch (IOException e) {
                        e = e;
                        IOException iOException = e;
                        i = responseCode;
                        e = iOException;
                        r5 = r7;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        OooO00o(i, e, null, r5);
                    } catch (Throwable th3) {
                        th = th3;
                        Throwable th4 = th;
                        i = responseCode;
                        th = th4;
                        r4 = r6;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        OooO00o(i, null, null, r4);
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                    r7 = 0;
                    IOException iOException2 = e;
                    i = responseCode;
                    e = iOException2;
                    r5 = r7;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    OooO00o(i, e, null, r5);
                } catch (Throwable th5) {
                    th = th5;
                    r6 = 0;
                    Throwable th6 = th;
                    i = responseCode;
                    th = th6;
                    r4 = r6;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    OooO00o(i, null, null, r4);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                r5 = 0;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                OooO00o(i, e, null, r5);
            } catch (Throwable th7) {
                th = th7;
                r4 = 0;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                OooO00o(i, null, null, r4);
                throw th;
            }
        } catch (IOException e4) {
            e = e4;
            httpURLConnection = null;
        } catch (Throwable th8) {
            th = th8;
            httpURLConnection = null;
        }
    }
}
