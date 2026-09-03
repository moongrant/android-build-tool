package com.appsflyer.internal;

import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.TrafficStats;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.qiniu.android.http.request.Request;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.UByte;
import org.conscrypt.EvpMdRef;

/* JADX INFO: loaded from: classes.dex */
public class af implements Runnable {
    private final bv AFInAppEventType;

    public af() {
    }

    public af(bv bvVar) {
        this.AFInAppEventType = bvVar;
    }

    public static String AFInAppEventType(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(EvpMdRef.SHA256.JCA_NAME);
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
            MessageDigest messageDigest = MessageDigest.getInstance(EvpMdRef.SHA1.JCA_NAME);
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
            MessageDigest messageDigest = MessageDigest.getInstance(EvpMdRef.MD5.JCA_NAME);
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

    /* JADX WARN: Code duplicated, block: B:26:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c4 A[Catch: all -> 0x0181, TRY_LEAVE, TryCatch #0 {all -> 0x0181, blocks: (B:24:0x00a1, B:28:0x00bb, B:30:0x00c4, B:35:0x012d, B:37:0x0133, B:38:0x0134, B:40:0x0136, B:42:0x013c, B:43:0x013d, B:44:0x013e, B:46:0x014d, B:48:0x0156, B:50:0x015a, B:51:0x0161, B:54:0x017b, B:31:0x00c8, B:32:0x00fa), top: B:70:0x00a1, inners: #3, #5 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x014d A[Catch: all -> 0x0181, TryCatch #0 {all -> 0x0181, blocks: (B:24:0x00a1, B:28:0x00bb, B:30:0x00c4, B:35:0x012d, B:37:0x0133, B:38:0x0134, B:40:0x0136, B:42:0x013c, B:43:0x013d, B:44:0x013e, B:46:0x014d, B:48:0x0156, B:50:0x015a, B:51:0x0161, B:54:0x017b, B:31:0x00c8, B:32:0x00fa), top: B:70:0x00a1, inners: #3, #5 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0156 A[Catch: all -> 0x0181, TryCatch #0 {all -> 0x0181, blocks: (B:24:0x00a1, B:28:0x00bb, B:30:0x00c4, B:35:0x012d, B:37:0x0133, B:38:0x0134, B:40:0x0136, B:42:0x013c, B:43:0x013d, B:44:0x013e, B:46:0x014d, B:48:0x0156, B:50:0x015a, B:51:0x0161, B:54:0x017b, B:31:0x00c8, B:32:0x00fa), top: B:70:0x00a1, inners: #3, #5 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x015a A[Catch: all -> 0x0181, TryCatch #0 {all -> 0x0181, blocks: (B:24:0x00a1, B:28:0x00bb, B:30:0x00c4, B:35:0x012d, B:37:0x0133, B:38:0x0134, B:40:0x0136, B:42:0x013c, B:43:0x013d, B:44:0x013e, B:46:0x014d, B:48:0x0156, B:50:0x015a, B:51:0x0161, B:54:0x017b, B:31:0x00c8, B:32:0x00fa), top: B:70:0x00a1, inners: #3, #5 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x017b A[Catch: all -> 0x0181, TRY_LEAVE, TryCatch #0 {all -> 0x0181, blocks: (B:24:0x00a1, B:28:0x00bb, B:30:0x00c4, B:35:0x012d, B:37:0x0133, B:38:0x0134, B:40:0x0136, B:42:0x013c, B:43:0x013d, B:44:0x013e, B:46:0x014d, B:48:0x0156, B:50:0x015a, B:51:0x0161, B:54:0x017b, B:31:0x00c8, B:32:0x00fa), top: B:70:0x00a1, inners: #3, #5 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0198 A[PHI: r2 r3
      0x0198: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v3 java.lang.String) binds: [B:62:0x018a, B:53:0x0179] A[DONT_GENERATE, DONT_INLINE]
      0x0198: PHI (r3v5 java.net.HttpURLConnection) = (r3v4 java.net.HttpURLConnection), (r3v11 java.net.HttpURLConnection) binds: [B:62:0x018a, B:53:0x0179] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a5  */
    public HttpURLConnection AFInAppEventParameterName() {
        HttpURLConnection httpURLConnection;
        String str;
        String str2;
        int responseCode;
        String strAFInAppEventType = "";
        bv bvVar = this.AFInAppEventType;
        String str3 = bvVar.onInstallConversionFailureNative;
        String strAFLogger$LogLevel = bvVar.AFLogger$LogLevel();
        boolean zAFVersionDeclaration = this.AFInAppEventType.AFVersionDeclaration();
        boolean zAppsFlyer2dXConversionCallback = this.AFInAppEventType.AppsFlyer2dXConversionCallback();
        boolean level = this.AFInAppEventType.getLevel();
        boolean zValueOf = this.AFInAppEventType.valueOf();
        byte[] bytes = strAFLogger$LogLevel.getBytes();
        HttpURLConnection httpURLConnection2 = null;
        if (zAFVersionDeclaration) {
            return null;
        }
        boolean z = false;
        try {
            URL url = new URL(str3);
            if (level) {
                try {
                    if (ak.AFInAppEventType == null) {
                        try {
                            ak.AFInAppEventType = new ak();
                        } catch (Throwable th) {
                            th = th;
                            AFLogger.AFKeystoreWrapper("Error while calling ".concat(String.valueOf(str3)), th);
                            httpURLConnection = httpURLConnection2;
                            z = true;
                            StringBuilder sb = new StringBuilder("Connection ");
                            if (z) {
                                str = "error";
                            } else {
                                str = "call succeeded";
                            }
                            sb.append(str);
                            sb.append(": ");
                            sb.append(strAFInAppEventType);
                            AFLogger.AFInAppEventType(sb.toString());
                            return httpURLConnection;
                        }
                    }
                    ak.AFInAppEventType.valueOf("server_request", url.toString(), strAFLogger$LogLevel);
                    int length = strAFLogger$LogLevel.getBytes("UTF-8").length;
                    StringBuilder sb2 = new StringBuilder("call = ");
                    sb2.append(url);
                    sb2.append("; size = ");
                    sb2.append(length);
                    sb2.append(" byte");
                    sb2.append(length > 1 ? com.umeng.analytics.pro.ak.aB : "");
                    sb2.append("; body = ");
                    sb2.append(strAFLogger$LogLevel);
                    am.AFInAppEventType(sb2.toString());
                    try {
                        TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
                        httpURLConnection = (HttpURLConnection) url.openConnection();
                        try {
                            httpURLConnection.setReadTimeout(30000);
                            httpURLConnection.setConnectTimeout(30000);
                            httpURLConnection.setRequestMethod(Request.HttpMethodPOST);
                            httpURLConnection.setDoInput(true);
                            httpURLConnection.setDoOutput(true);
                            if (zValueOf) {
                                str2 = "application/octet-stream";
                            } else {
                                str2 = "application/json";
                            }
                            httpURLConnection.setRequestProperty("Content-Type", str2);
                            OutputStream outputStream = httpURLConnection.getOutputStream();
                            if (zValueOf) {
                                try {
                                    try {
                                        bytes = (byte[]) ((Class) e.AFKeystoreWrapper(24 - (AudioTrack.getMinVolume() > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? 1 : (AudioTrack.getMinVolume() == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? 0 : -1)), (char) Drawable.resolveOpacity(0, 0), 24 - (ViewConfiguration.getDoubleTapTimeout() >> 16))).getDeclaredMethod("AFInAppEventType", byte[].class).invoke(((Class) e.AFKeystoreWrapper(25 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 24)).getMethod("AFInAppEventType", String.class).invoke(null, this.AFInAppEventType.init), bytes);
                                    } catch (Throwable th2) {
                                        Throwable cause = th2.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th2;
                                    }
                                } catch (Throwable th3) {
                                    Throwable cause2 = th3.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th3;
                                }
                            }
                            outputStream.write(bytes);
                            outputStream.close();
                            httpURLConnection.connect();
                            responseCode = httpURLConnection.getResponseCode();
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
                            } else {
                                z = true;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            httpURLConnection2 = httpURLConnection;
                            AFLogger.AFKeystoreWrapper("Error while calling ".concat(String.valueOf(str3)), th);
                            httpURLConnection = httpURLConnection2;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        httpURLConnection2 = null;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    httpURLConnection2 = null;
                }
            } else {
                TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
                httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setReadTimeout(30000);
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setRequestMethod(Request.HttpMethodPOST);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                if (zValueOf) {
                    str2 = "application/octet-stream";
                } else {
                    str2 = "application/json";
                }
                httpURLConnection.setRequestProperty("Content-Type", str2);
                OutputStream outputStream2 = httpURLConnection.getOutputStream();
                if (zValueOf) {
                    bytes = (byte[]) ((Class) e.AFKeystoreWrapper(24 - (AudioTrack.getMinVolume() > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? 1 : (AudioTrack.getMinVolume() == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? 0 : -1)), (char) Drawable.resolveOpacity(0, 0), 24 - (ViewConfiguration.getDoubleTapTimeout() >> 16))).getDeclaredMethod("AFInAppEventType", byte[].class).invoke(((Class) e.AFKeystoreWrapper(25 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 24)).getMethod("AFInAppEventType", String.class).invoke(null, this.AFInAppEventType.init), bytes);
                }
                outputStream2.write(bytes);
                outputStream2.close();
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
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
                } else {
                    z = true;
                }
            }
        } catch (Throwable th7) {
            th = th7;
        }
        StringBuilder sb3 = new StringBuilder("Connection ");
        if (z) {
            str = "error";
        } else {
            str = "call succeeded";
        }
        sb3.append(str);
        sb3.append(": ");
        sb3.append(strAFInAppEventType);
        AFLogger.AFInAppEventType(sb3.toString());
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
            sb.append(Integer.toString((b & UByte.MAX_VALUE) + 256, 16).substring(1));
        }
        return sb.toString();
    }
}
