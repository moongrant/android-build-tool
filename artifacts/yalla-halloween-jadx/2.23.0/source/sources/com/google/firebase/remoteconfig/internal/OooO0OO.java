package com.google.firebase.remoteconfig.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import com.qiniu.android.common.Constants;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o0O0o0.OooO;
import org.conscrypt.PSKKeyManager;
import org.json.JSONObject;
import p281o0O0O0oO.OooOO0;
import p313o0O0oOo.o000000;
import p313o0O0oOo.o0000oo;
import p671oo0oOOo.OooOOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @VisibleForTesting
    public static final int[] f20547OooOOOo = {2, 4, 8, 16, 32, 64, 128, PSKKeyManager.MAX_KEY_LENGTH_BYTES};

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final Pattern f20548OooOOo0 = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooO f20549OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @GuardedBy("this")
    public final Set<OooOOO0> f20550OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("this")
    public int f20552OooO0OO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ScheduledExecutorService f20554OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ConfigFetchHandler f20556OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooOO0 f20557OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o000000 f20558OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Context f20559OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final String f20560OooOO0o;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.OooO0O0 f20563OooOOOO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f20551OooO0O0 = false;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final Random f20562OooOOO0 = new Random();

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final Clock f20561OooOOO = DefaultClock.getInstance();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f20553OooO0Oo = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f20555OooO0o0 = false;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        /* JADX WARN: Code duplicated, block: B:66:0x012f  */
        /* JADX WARN: Code duplicated, block: B:68:0x0132  */
        /* JADX WARN: Code duplicated, block: B:76:0x016d  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            Integer num;
            Object[] objArr;
            OooO0OO oooO0OO = OooO0OO.this;
            if (oooO0OO.OooO00o()) {
                if (new Date(oooO0OO.f20561OooOOO.currentTimeMillis()).before(oooO0OO.f20563OooOOOO.OooO0O0().f20546OooO0O0)) {
                    oooO0OO.OooO0oo();
                    return;
                }
                oooO0OO.OooO(true);
                HttpURLConnection httpURLConnection = null;
                numValueOf = null;
                Integer numValueOf = null;
                httpURLConnection = null;
                try {
                    HttpURLConnection httpURLConnectionOooO0OO = oooO0OO.OooO0OO();
                    try {
                        numValueOf = Integer.valueOf(httpURLConnectionOooO0OO.getResponseCode());
                        if (numValueOf.intValue() == 200) {
                            synchronized (oooO0OO) {
                                oooO0OO.f20552OooO0OO = 8;
                            }
                            oooO0OO.f20563OooOOOO.OooO0o0(0, com.google.firebase.remoteconfig.internal.OooO0O0.f20537OooO0o);
                            oooO0OO.OooOO0(httpURLConnectionOooO0OO).OooO0OO();
                        }
                        OooO0OO.OooO0O0(httpURLConnectionOooO0OO);
                        oooO0OO.OooO(false);
                        boolean zOooO0Oo = OooO0OO.OooO0Oo(numValueOf.intValue());
                        if (zOooO0Oo) {
                            oooO0OO.OooOO0O(new Date(oooO0OO.f20561OooOOO.currentTimeMillis()));
                        }
                        if (!zOooO0Oo && numValueOf.intValue() != 200) {
                            String strOooO0o = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                            if (numValueOf.intValue() == 403) {
                                strOooO0o = OooO0OO.OooO0o(httpURLConnectionOooO0OO.getErrorStream());
                            }
                            oooO0OO.OooO0oO(new FirebaseRemoteConfigServerException(numValueOf.intValue(), strOooO0o, 0));
                            return;
                        }
                    } catch (IOException e) {
                        e = e;
                        num = numValueOf;
                        httpURLConnection = httpURLConnectionOooO0OO;
                        try {
                            Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                            OooO0OO.OooO0O0(httpURLConnection);
                            oooO0OO.OooO(false);
                            Object[] objArr2 = num == null || OooO0OO.OooO0Oo(num.intValue());
                            if (objArr2 != false) {
                                oooO0OO.OooOO0O(new Date(oooO0OO.f20561OooOOO.currentTimeMillis()));
                            }
                            if (objArr2 == false && num.intValue() != 200) {
                                String strOooO0o2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num);
                                if (num.intValue() == 403) {
                                    strOooO0o2 = OooO0OO.OooO0o(httpURLConnection.getErrorStream());
                                }
                                oooO0OO.OooO0oO(new FirebaseRemoteConfigServerException(num.intValue(), strOooO0o2, 0));
                                return;
                            }
                        } catch (Throwable th) {
                            th = th;
                            OooO0OO.OooO0O0(httpURLConnection);
                            oooO0OO.OooO(false);
                            if (num != null || OooO0OO.OooO0Oo(num.intValue())) {
                                objArr = true;
                            } else {
                                objArr = false;
                            }
                            if (objArr != false) {
                                oooO0OO.OooOO0O(new Date(oooO0OO.f20561OooOOO.currentTimeMillis()));
                            }
                            if (!objArr == true || num.intValue() == 200) {
                                oooO0OO.OooO0oo();
                            } else {
                                String strOooO0o3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num);
                                if (num.intValue() == 403) {
                                    strOooO0o3 = OooO0OO.OooO0o(httpURLConnection.getErrorStream());
                                }
                                oooO0OO.OooO0oO(new FirebaseRemoteConfigServerException(num.intValue(), strOooO0o3, 0));
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        num = numValueOf;
                        httpURLConnection = httpURLConnectionOooO0OO;
                        OooO0OO.OooO0O0(httpURLConnection);
                        oooO0OO.OooO(false);
                        if (num != null) {
                            objArr = true;
                        } else {
                            objArr = true;
                        }
                        if (objArr != false) {
                            oooO0OO.OooOO0O(new Date(oooO0OO.f20561OooOOO.currentTimeMillis()));
                        }
                        if (objArr == true) {
                            oooO0OO.OooO0oo();
                        } else {
                            oooO0OO.OooO0oo();
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                    num = null;
                } catch (Throwable th3) {
                    th = th3;
                    num = null;
                }
                oooO0OO.OooO0oo();
            }
        }
    }

    public class OooO0O0 implements OooOOO0 {
        public OooO0O0() {
        }

        @Override // p671oo0oOOo.OooOOO0
        public final void OooO00o(@NonNull FirebaseRemoteConfigException firebaseRemoteConfigException) {
            OooO0OO oooO0OO = OooO0OO.this;
            synchronized (oooO0OO) {
                oooO0OO.f20553OooO0Oo = true;
            }
            OooO0OO.this.OooO0oO(firebaseRemoteConfigException);
        }

        @Override // p671oo0oOOo.OooOOO0
        public final void onUpdate() {
        }
    }

    public OooO0OO(OooOO0 oooOO1, OooO oooO, ConfigFetchHandler configFetchHandler, o000000 o000000Var, Context context, String str, LinkedHashSet linkedHashSet, com.google.firebase.remoteconfig.internal.OooO0O0 oooO0O0, ScheduledExecutorService scheduledExecutorService) {
        this.f20550OooO00o = linkedHashSet;
        this.f20554OooO0o = scheduledExecutorService;
        this.f20552OooO0OO = Math.max(8 - oooO0O0.OooO0O0().f20545OooO00o, 1);
        this.f20557OooO0oo = oooOO1;
        this.f20556OooO0oO = configFetchHandler;
        this.f20549OooO = oooO;
        this.f20558OooOO0 = o000000Var;
        this.f20559OooOO0O = context;
        this.f20560OooOO0o = str;
        this.f20563OooOOOO = oooO0O0;
    }

    public static void OooO0O0(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
                if (httpURLConnection.getErrorStream() != null) {
                    httpURLConnection.getErrorStream().close();
                }
            } catch (IOException unused) {
            }
        }
    }

    public static boolean OooO0Oo(int i) {
        return i == 408 || i == 429 || i == 502 || i == 503 || i == 504;
    }

    public static String OooO0o(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    public final synchronized void OooO(boolean z) {
        this.f20551OooO0O0 = z;
    }

    public final synchronized boolean OooO00o() {
        return (this.f20550OooO00o.isEmpty() || this.f20551OooO0O0 || this.f20553OooO0Oo || this.f20555OooO0o0) ? false : true;
    }

    @SuppressLint({"VisibleForTests"})
    public final HttpURLConnection OooO0OO() throws IOException {
        URL url;
        String strBytesToStringUppercase;
        Pattern pattern = f20548OooOOo0;
        String str = this.f20560OooOO0o;
        OooOO0 oooOO1 = this.f20557OooO0oo;
        try {
            Object[] objArr = new Object[2];
            oooOO1.OooO00o();
            Matcher matcher = pattern.matcher(oooOO1.f41951OooO0OO.f41961OooO0O0);
            objArr[0] = matcher.matches() ? matcher.group(1) : null;
            objArr[1] = str;
            url = new URL(String.format("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations", objArr));
        } catch (MalformedURLException unused) {
            Log.e("FirebaseRemoteConfig", "URL is malformed");
            url = null;
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        this.f20549OooO.getToken().onSuccessTask(this.f20554OooO0o, new o0000oo(httpURLConnection));
        oooOO1.OooO00o();
        p281o0O0O0oO.OooOOO0 oooOOO0 = oooOO1.f41951OooO0OO;
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", oooOOO0.f41960OooO00o);
        Context context = this.f20559OooOO0O;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        try {
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes == null) {
                Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + context.getPackageName());
                strBytesToStringUppercase = null;
            } else {
                strBytesToStringUppercase = Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            Log.i("FirebaseRemoteConfig", "No such package: " + context.getPackageName());
        }
        httpURLConnection.setRequestProperty("X-Android-Cert", strBytesToStringUppercase);
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestMethod("POST");
        HashMap map = new HashMap();
        oooOO1.OooO00o();
        Matcher matcher2 = pattern.matcher(oooOOO0.f41961OooO0O0);
        map.put("project", matcher2.matches() ? matcher2.group(1) : null);
        map.put("namespace", str);
        map.put("lastKnownVersionNumber", Long.toString(this.f20556OooO0oO.f20515OooO0oo.f20539OooO00o.getLong("last_template_version", 0L)));
        oooOO1.OooO00o();
        map.put(RemoteConfigConstants$RequestFieldKey.APP_ID, oooOOO0.f41961OooO0O0);
        map.put(RemoteConfigConstants$RequestFieldKey.SDK_VERSION, "21.4.0");
        byte[] bytes = new JSONObject(map).toString().getBytes(Constants.UTF_8);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        return httpURLConnection;
    }

    public final synchronized void OooO0o0(long j) {
        if (OooO00o()) {
            int i = this.f20552OooO0OO;
            if (i > 0) {
                this.f20552OooO0OO = i - 1;
                this.f20554OooO0o.schedule(new OooO00o(), j, TimeUnit.MILLISECONDS);
            } else if (!this.f20555OooO0o0) {
                OooO0oO(new FirebaseRemoteConfigClientException());
            }
        }
    }

    public final synchronized void OooO0oO(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator<OooOOO0> it = this.f20550OooO00o.iterator();
        while (it.hasNext()) {
            it.next().OooO00o(firebaseRemoteConfigException);
        }
    }

    @SuppressLint({"VisibleForTests"})
    public final synchronized void OooO0oo() {
        OooO0o0(Math.max(0L, this.f20563OooOOOO.OooO0O0().f20546OooO0O0.getTime() - new Date(this.f20561OooOOO.currentTimeMillis()).getTime()));
    }

    @SuppressLint({"VisibleForTests"})
    public final synchronized com.google.firebase.remoteconfig.internal.OooO00o OooOO0(HttpURLConnection httpURLConnection) {
        return new com.google.firebase.remoteconfig.internal.OooO00o(httpURLConnection, this.f20556OooO0oO, this.f20558OooOO0, this.f20550OooO00o, new OooO0O0(), this.f20554OooO0o);
    }

    public final void OooOO0O(Date date) {
        com.google.firebase.remoteconfig.internal.OooO0O0 oooO0O0 = this.f20563OooOOOO;
        int i = oooO0O0.OooO0O0().f20545OooO00o + 1;
        long millis = TimeUnit.MINUTES.toMillis(f20547OooOOOo[(i < 8 ? i : 8) - 1]);
        oooO0O0.OooO0o0(i, new Date(date.getTime() + (millis / 2) + ((long) this.f20562OooOOO0.nextInt((int) millis))));
    }
}
