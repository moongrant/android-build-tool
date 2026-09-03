package com.appsflyer.internal;

import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.TrafficStats;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.UByte;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes2.dex */
public class af implements Runnable {
    private final bv AFInAppEventType;

    public af() {
    }

    public af(bv bvVar) {
        this.AFInAppEventType = bvVar;
    }

    public static String AFInAppEventType(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            return valueOf(messageDigest.digest());
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(str.substring(0, 6));
            sb.append(".. to SHA-256");
            AFLogger.AFKeystoreWrapper(sb.toString(), e);
            return null;
        }
    }

    public static String AFKeystoreWrapper(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.reset();
            messageDigest.update(str.getBytes("UTF-8"));
            return AFKeystoreWrapper(messageDigest.digest());
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(str.substring(0, 6));
            sb.append(".. to SHA1");
            AFLogger.AFKeystoreWrapper(sb.toString(), e);
            return null;
        }
    }

    public static String valueOf(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes("UTF-8"));
            return AFKeystoreWrapper(messageDigest.digest());
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(str.substring(0, 6));
            sb.append(".. to MD5");
            AFLogger.AFKeystoreWrapper(sb.toString(), e);
            return null;
        }
    }

    public static String values(String str, String str2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str2.getBytes(), "HmacSHA256"));
            return valueOf(mac.doFinal(str.getBytes())).toLowerCase();
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            AFLogger.AFInAppEventType(e.getMessage(), e);
            return e.getMessage();
        }
    }

    public HttpURLConnection AFInAppEventParameterName() {
        HttpURLConnection httpURLConnection;
        bv bvVar = this.AFInAppEventType;
        String str = bvVar.onInstallConversionFailureNative;
        String strAFLogger$LogLevel = bvVar.AFLogger$LogLevel();
        boolean zAFVersionDeclaration = this.AFInAppEventType.AFVersionDeclaration();
        boolean zAppsFlyer2dXConversionCallback = this.AFInAppEventType.AppsFlyer2dXConversionCallback();
        boolean level = this.AFInAppEventType.getLevel();
        boolean zValueOf = this.AFInAppEventType.valueOf();
        String strAFInAppEventType = "";
        byte[] bytes = strAFLogger$LogLevel.getBytes();
        HttpURLConnection httpURLConnection2 = null;
        if (zAFVersionDeclaration) {
            return null;
        }
        boolean z = true;
        try {
            URL url = new URL(str);
            if (level) {
                if (ak.AFInAppEventType == null) {
                    ak.AFInAppEventType = new ak();
                }
                ak.AFInAppEventType.valueOf("server_request", url.toString(), strAFLogger$LogLevel);
                int length = strAFLogger$LogLevel.getBytes("UTF-8").length;
                StringBuilder sb = new StringBuilder("call = ");
                sb.append(url);
                sb.append("; size = ");
                sb.append(length);
                sb.append(" byte");
                sb.append(length > 1 ? "s" : "");
                sb.append("; body = ");
                sb.append(strAFLogger$LogLevel);
                am.AFInAppEventType(sb.toString());
            }
            TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
            httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
            try {
                httpURLConnection.setReadTimeout(30000);
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestProperty("Content-Type", zValueOf ? "application/octet-stream" : "application/json");
                OutputStream outputStream = httpURLConnection.getOutputStream();
                if (zValueOf) {
                    try {
                        try {
                            bytes = (byte[]) ((Class) e.AFKeystoreWrapper(24 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) Drawable.resolveOpacity(0, 0), 24 - (ViewConfiguration.getDoubleTapTimeout() >> 16))).getDeclaredMethod("AFInAppEventType", byte[].class).invoke(((Class) e.AFKeystoreWrapper(25 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 24)).getMethod("AFInAppEventType", String.class).invoke(null, this.AFInAppEventType.init), bytes);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
                outputStream.write(bytes);
                outputStream.close();
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (zAppsFlyer2dXConversionCallback) {
                    ag.AFInAppEventType();
                    strAFInAppEventType = ag.AFInAppEventType(httpURLConnection);
                }
                if (level) {
                    if (ak.AFInAppEventType == null) {
                        ak.AFInAppEventType = new ak();
                    }
                    ak.AFInAppEventType.valueOf("server_response", url.toString(), String.valueOf(responseCode), strAFInAppEventType);
                }
                if (responseCode == 200) {
                    AFLogger.AFInAppEventType("Status 200 ok");
                    z = false;
                }
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection2 = httpURLConnection;
                AFLogger.AFKeystoreWrapper("Error while calling ".concat(String.valueOf(str)), th);
                httpURLConnection = httpURLConnection2;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        StringBuilder sb2 = new StringBuilder("Connection ");
        sb2.append(z ? "error" : "call succeeded");
        sb2.append(": ");
        sb2.append(strAFInAppEventType);
        AFLogger.AFInAppEventType(sb2.toString());
        return httpURLConnection;
    }

    @Override // java.lang.Runnable
    public void run() {
        HttpURLConnection httpURLConnectionAFInAppEventParameterName = AFInAppEventParameterName();
        if (httpURLConnectionAFInAppEventParameterName != null) {
            httpURLConnectionAFInAppEventParameterName.disconnect();
        }
    }

    private static String AFKeystoreWrapper(byte[] bArr) {
        Formatter formatter = new Formatter();
        for (byte b : bArr) {
            formatter.format("%02x", Byte.valueOf(b));
        }
        String string = formatter.toString();
        formatter.close();
        return string;
    }

    private static String valueOf(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(Integer.toString((b & UByte.MAX_VALUE) + PSKKeyManager.MAX_KEY_LENGTH_BYTES, 16).substring(1));
        }
        return sb.toString();
    }
}
