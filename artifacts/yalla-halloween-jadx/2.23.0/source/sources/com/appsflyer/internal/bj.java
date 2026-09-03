package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class bj {
    private final int AFKeystoreWrapper;

    public bj(int i) {
        this.AFKeystoreWrapper = i;
    }

    @NonNull
    private static String AFInAppEventType(HttpURLConnection httpURLConnection, boolean z) throws Throwable {
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader = null;
        try {
            try {
                InputStream inputStream = z ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                if (inputStream == null) {
                    return "";
                }
                StringBuilder sb = new StringBuilder();
                InputStreamReader inputStreamReader2 = new InputStreamReader(inputStream);
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
                    boolean z2 = true;
                    while (true) {
                        try {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                String string = sb.toString();
                                inputStreamReader2.close();
                                bufferedReader2.close();
                                return string;
                            }
                            if (!z2) {
                                sb.append('\n');
                            }
                            sb.append(line);
                            z2 = false;
                        } catch (IOException e) {
                            e = e;
                            StringBuilder sb2 = new StringBuilder("Could not read connection response from: ");
                            sb2.append(httpURLConnection.getURL().toString());
                            AFLogger.AFKeystoreWrapper(sb2.toString(), e);
                            throw e;
                        } catch (Exception e2) {
                            e = e2;
                            StringBuilder sb3 = new StringBuilder("Could not read connection response from: ");
                            sb3.append(httpURLConnection.getURL().toString());
                            AFLogger.AFKeystoreWrapper(sb3.toString(), e);
                            StringBuilder sb4 = new StringBuilder("Could not read connection response: ");
                            sb4.append(e.getMessage());
                            throw new bq(sb4.toString(), e);
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            inputStreamReader = inputStreamReader2;
                            if (inputStreamReader != null) {
                                inputStreamReader.close();
                            }
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            throw th;
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                } catch (Exception e4) {
                    e = e4;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = null;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e5) {
            e = e5;
        } catch (Exception e6) {
            e = e6;
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
        }
        StringBuilder sb5 = new StringBuilder("Could not read connection response from: ");
        sb5.append(httpURLConnection.getURL().toString());
        AFLogger.AFKeystoreWrapper(sb5.toString(), e);
        throw e;
    }

    public final bi<String> valueOf(v vVar) throws Throwable {
        HttpURLConnection httpURLConnection = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            StringBuilder sb = new StringBuilder("HTTP: url: ");
            sb.append(vVar.AFInAppEventType);
            AFLogger.valueOf(sb.toString());
            byte[] bArr = vVar.values;
            if (bArr != null) {
                AFLogger.valueOf("HTTP: data: ".concat(new String(bArr)));
            }
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(vVar.AFInAppEventType).openConnection()));
            try {
                httpURLConnection2.setRequestMethod(vVar.valueOf);
                httpURLConnection2.setConnectTimeout(this.AFKeystoreWrapper);
                httpURLConnection2.setReadTimeout(this.AFKeystoreWrapper);
                httpURLConnection2.addRequestProperty("Content-Type", "application/json");
                for (Map.Entry<String, String> entry : vVar.AFKeystoreWrapper.entrySet()) {
                    httpURLConnection2.setRequestProperty(entry.getKey(), entry.getValue());
                }
                byte[] bArr2 = vVar.values;
                boolean z = true;
                if (bArr2 != null) {
                    httpURLConnection2.setDoOutput(true);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(bArr2.length);
                    httpURLConnection2.setRequestProperty("Content-Length", sb2.toString());
                    try {
                        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                        try {
                            bufferedOutputStream2.write(bArr2);
                            bufferedOutputStream2.close();
                        } catch (Throwable th) {
                            th = th;
                            bufferedOutputStream = bufferedOutputStream2;
                            if (bufferedOutputStream != null) {
                                bufferedOutputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                int responseCode = httpURLConnection2.getResponseCode();
                if (responseCode / 100 != 2) {
                    z = false;
                }
                String strAFInAppEventType = AFInAppEventType(httpURLConnection2, z);
                StringBuilder sb3 = new StringBuilder("HTTP: response code: ");
                sb3.append(responseCode);
                sb3.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
                sb3.append(httpURLConnection2.getResponseMessage());
                AFLogger.valueOf(sb3.toString());
                AFLogger.valueOf("HTTP: response body: ".concat(String.valueOf(strAFInAppEventType)));
                bi<String> biVar = new bi<>(strAFInAppEventType, httpURLConnection2.getResponseCode(), z);
                httpURLConnection2.disconnect();
                return biVar;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection = httpURLConnection2;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
