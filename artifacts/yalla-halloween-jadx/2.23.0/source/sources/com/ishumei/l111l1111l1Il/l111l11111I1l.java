package com.ishumei.l111l1111l1Il;

import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.ishumei.l111l1111llIl.l111l1111lIl;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class l111l11111I1l {
    private static final String l1111l111111Il = "sm";
    private static final String l111l11111I1l = "Content-Type";
    private static final String l111l11111Il = "application/octet-stream";
    private static final String l111l11111lIl = "Content-Length";
    private static final String l111l1111l1Il = "Connection";
    private static String l111l1111lI1l = "POST";
    private static final String l111l1111llIl = "Close";
    private int l111l1111lIl;
    private int l11l1111I11l;
    private int l11l1111I1l;
    private long l11l1111I1ll;
    private ArrayList<String> l11l1111lIIl = new ArrayList<>();
    private SSLContext l11l1111Il = null;
    private TrustManager[] l11l1111Il1l = null;
    private KeyStore l11l1111Ill = null;

    public static abstract class l1111l111111Il<T> extends com.ishumei.l111l11111I1l.l111l11111lIl<T> {
        private static int l111l11111I1l = 0;
        private static int l111l11111Il = 1;
        private static int l111l1111l1Il = 2;
        private static int l111l1111llIl = 3;
        protected l111l11111lIl l111l11111lIl;

        public l1111l111111Il(boolean z, int i) {
            super(z, i);
            this.l111l11111lIl = null;
        }

        public abstract void l1111l111111Il(String str);

        public boolean l1111l111111Il(String str, int i) {
            l111l11111lIl l111l11111lil = this.l111l11111lIl;
            if (l111l11111lil.l111l1111lI1l) {
                int i2 = l111l11111lil.l111l11111Il;
                if (i2 + 1 < l111l11111lil.l111l1111lIl) {
                    l111l11111lil.l111l11111Il = i2 + 1;
                    l111l1111lIl.l1111l111111Il(l111l11111lil.l1111l111111Il);
                    l111l11111lIl l111l11111lil2 = this.l111l11111lIl;
                    l111l11111lil2.l1111l111111Il = null;
                    l111l11111lil2.l111l1111llIl.l1111l111111Il();
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v11 */
        /* JADX WARN: Type inference failed for: r0v12, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r0v17, types: [java.io.Closeable, java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.StringBuilder] */
        @Override // java.lang.Runnable
        public void run() throws Throwable {
            BufferedReader bufferedReader;
            Exception e;
            l111l11111lIl l111l11111lil = this.l111l11111lIl;
            String str = l111l11111lil.l11l1111lIIl;
            if (str != null) {
                l1111l111111Il(str, 1);
                this.l111l11111lIl.l11l1111lIIl = null;
                return;
            }
            HttpURLConnection httpURLConnection = l111l11111lil.l1111l111111Il;
            if (httpURLConnection == null) {
                l1111l111111Il("HttpUrlConnection is null", 0);
                return;
            }
            ?? r1 = 2;
            try {
                ?? responseCode = httpURLConnection.getResponseCode();
                try {
                    if (responseCode != 200) {
                        l1111l111111Il("responseCode: " + responseCode, 2);
                        return;
                    }
                    try {
                        responseCode = this.l111l11111lIl.l1111l111111Il.getInputStream();
                        try {
                            bufferedReader = new BufferedReader(new InputStreamReader(responseCode));
                            try {
                                StringBuilder sb = new StringBuilder();
                                while (true) {
                                    String line = bufferedReader.readLine();
                                    if (line == null) {
                                        break;
                                    } else {
                                        sb.append(line);
                                    }
                                }
                                if (!TextUtils.isEmpty(this.l111l11111lIl.l11l1111I1l)) {
                                    com.ishumei.l111l11111lIl.l1111l111111Il.l1111l111111Il.l1111l111111Il().l1111l111111Il(l111l1111lIl.l111l1111l1Il(this.l111l11111lIl.l11l1111I11l), this.l111l11111lIl.l11l1111I1l);
                                }
                                l1111l111111Il(sb.toString());
                                l111l1111lIl.l1111l111111Il((Closeable) responseCode);
                                l111l1111lIl.l1111l111111Il((Closeable) bufferedReader);
                                l111l1111lIl.l1111l111111Il(this.l111l11111lIl.l1111l111111Il);
                            } catch (Exception e2) {
                                e = e2;
                                Log.getStackTraceString(e);
                                l1111l111111Il("response content err: " + e, 3);
                                l111l1111lIl.l1111l111111Il((Closeable) responseCode);
                                l111l1111lIl.l1111l111111Il((Closeable) bufferedReader);
                                l111l1111lIl.l1111l111111Il(this.l111l11111lIl.l1111l111111Il);
                            }
                        } catch (Exception e3) {
                            e = e3;
                            bufferedReader = null;
                        } catch (Throwable th) {
                            th = th;
                            r1 = 0;
                            l111l1111lIl.l1111l111111Il((Closeable) responseCode);
                            l111l1111lIl.l1111l111111Il((Closeable) r1);
                            l111l1111lIl.l1111l111111Il(this.l111l11111lIl.l1111l111111Il);
                            throw th;
                        }
                    } catch (Exception e4) {
                        bufferedReader = null;
                        e = e4;
                        responseCode = 0;
                    } catch (Throwable th2) {
                        r1 = 0;
                        th = th2;
                        responseCode = 0;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e5) {
                l111l1111lIl.l1111l111111Il(this.l111l11111lIl.l1111l111111Il);
                Log.getStackTraceString(e5);
                l1111l111111Il(e5.getMessage(), 2);
            }
        }

        private l1111l111111Il(boolean z, int i, boolean z2) {
            super(z, i, z2);
            this.l111l11111lIl = null;
        }

        private l1111l111111Il(boolean z, int i, boolean z2, long j, boolean z3) {
            super(z, i, z2, j, z3);
            this.l111l11111lIl = null;
        }
    }

    public static class l111l11111lIl {
        public String l11l1111I11l;
        String l11l1111I1l;
        public boolean l11l1111I1ll;
        HttpURLConnection l1111l111111Il = null;
        public byte[] l111l11111lIl = null;
        Map<String, String> l111l11111I1l = null;
        public int l111l11111Il = -1;
        l1111l111111Il l111l1111l1Il = null;
        com.ishumei.l111l11111I1l.l111l11111lIl<l111l11111lIl> l111l1111llIl = null;
        boolean l111l1111lI1l = false;
        public int l111l1111lIl = 0;
        String l11l1111lIIl = null;
    }

    public final l111l11111I1l l1111l111111Il(com.ishumei.l111l1111l1Il.l1111l111111Il l1111l111111il) {
        if (l1111l111111il == null) {
            return null;
        }
        int length = l1111l111111il.l111l1111llIl().length;
        this.l111l1111lIl = l1111l111111il.l111l11111Il();
        for (int i = 0; i < 3; i++) {
            this.l11l1111lIIl.add(l1111l111111il.l111l1111l1Il());
        }
        for (int i2 = 0; i2 < length; i2++) {
            for (int i3 = 0; i3 < 2; i3++) {
                this.l11l1111lIIl.add(l1111l111111il.l111l1111llIl()[i2]);
            }
        }
        this.l11l1111I11l = l1111l111111il.l111l11111lIl() * 1000;
        this.l11l1111I1l = l1111l111111il.l111l11111I1l() * 1000;
        this.l11l1111I1ll = l1111l111111il.l111l1111lIl() * 1000;
        if (1 == this.l111l1111lIl) {
            return this;
        }
        try {
            if (l1111l111111il.l1111l111111Il()) {
                Certificate certificateGenerateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(l1111l111111il.l111l1111lI1l()));
                KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                keyStore.load(null);
                keyStore.setCertificateEntry("smfp", certificateGenerateCertificate);
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init(keyStore);
                this.l11l1111Il1l = trustManagerFactory.getTrustManagers();
                SSLContext sSLContext = SSLContext.getInstance("SSL");
                this.l11l1111Il = sSLContext;
                sSLContext.init(null, this.l11l1111Il1l, null);
            }
            return this;
        } catch (Exception unused) {
            this.l11l1111Il = null;
            this.l11l1111Il1l = null;
            return this;
        }
    }

    public final String l1111l111111Il(byte[] bArr, Map<String, String> map) throws Exception {
        int size = this.l11l1111lIIl.size();
        int i = 0;
        while (i < this.l11l1111lIIl.size()) {
            int i2 = i % size;
            i++;
            try {
                return l1111l111111Il(bArr, (Map<String, String>) null, this.l11l1111lIIl.get(i2), i > 1);
            } catch (Exception e) {
                this.l11l1111lIIl.get(i2);
                Log.getStackTraceString(e);
            }
        }
        throw new Exception("all retry have fail");
    }

    public final String l1111l111111Il(byte[] bArr, Map<String, String> map, String str) {
        return l1111l111111Il(bArr, (Map<String, String>) null, str, false);
    }

    private String l1111l111111Il(byte[] bArr, Map<String, String> map, String str, boolean z) throws Throwable {
        InputStream inputStream;
        HttpURLConnection httpURLConnection;
        BufferedReader bufferedReader;
        SSLContext sSLContext;
        if (bArr == null || bArr.length == 0) {
            throw new IOException("data is null");
        }
        OutputStream outputStream = null;
        try {
            final String strL111l1111l1Il = l111l1111lIl.l111l1111l1Il(str);
            String strL1111l111111Il = com.ishumei.l111l11111lIl.l1111l111111Il.l1111l111111Il.l1111l111111Il().l1111l111111Il(strL111l1111l1Il, z);
            httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument((TextUtils.isEmpty(strL1111l111111Il) ? new URL(str) : new URL(Patterns.DOMAIN_NAME.matcher(str).replaceFirst(strL1111l111111Il))).openConnection()));
            try {
                if (this.l111l1111lIl == 0) {
                    ((HttpsURLConnection) httpURLConnection).setHostnameVerifier(new HostnameVerifier() { // from class: com.ishumei.l111l1111l1Il.l111l11111I1l.1
                        @Override // javax.net.ssl.HostnameVerifier
                        public final boolean verify(String str2, SSLSession sSLSession) {
                            if (TextUtils.isEmpty(strL111l1111l1Il) || Patterns.IP_ADDRESS.matcher(strL111l1111l1Il).matches()) {
                                return true;
                            }
                            return HttpsURLConnection.getDefaultHostnameVerifier().verify(strL111l1111l1Il, sSLSession);
                        }
                    });
                    if (this.l11l1111Il1l != null && (sSLContext = this.l11l1111Il) != null) {
                        ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLContext.getSocketFactory());
                    }
                }
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setRequestMethod(l111l1111lI1l);
                httpURLConnection.setRequestProperty("Content-Type", "application/octet-stream");
                httpURLConnection.setRequestProperty(l111l1111l1Il, l111l1111llIl);
                httpURLConnection.setConnectTimeout(this.l11l1111I11l);
                httpURLConnection.setReadTimeout(this.l11l1111I1l);
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                httpURLConnection.connect();
                OutputStream outputStream2 = httpURLConnection.getOutputStream();
                try {
                    outputStream2.write(bArr);
                    outputStream2.flush();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        throw new IOException("responseCode = " + responseCode);
                    }
                    InputStream inputStream2 = httpURLConnection.getInputStream();
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(inputStream2));
                        try {
                            StringBuilder sb = new StringBuilder();
                            while (true) {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                }
                                sb.append(line);
                            }
                            if (!TextUtils.isEmpty(strL1111l111111Il)) {
                                com.ishumei.l111l11111lIl.l1111l111111Il.l1111l111111Il.l1111l111111Il().l1111l111111Il(strL111l1111l1Il, strL1111l111111Il);
                            }
                            String string = sb.toString();
                            l111l1111lIl.l1111l111111Il((Closeable) outputStream2);
                            l111l1111lIl.l1111l111111Il((Closeable) inputStream2);
                            l111l1111lIl.l1111l111111Il((Closeable) bufferedReader);
                            l111l1111lIl.l1111l111111Il(httpURLConnection);
                            return string;
                        } catch (Throwable th) {
                            th = th;
                            outputStream = outputStream2;
                            inputStream = inputStream2;
                            th = th;
                            l111l1111lIl.l1111l111111Il((Closeable) outputStream);
                            l111l1111lIl.l1111l111111Il((Closeable) inputStream);
                            l111l1111lIl.l1111l111111Il((Closeable) bufferedReader);
                            l111l1111lIl.l1111l111111Il(httpURLConnection);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = null;
                    outputStream = outputStream2;
                    inputStream = null;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
                bufferedReader = null;
            }
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
            httpURLConnection = null;
            bufferedReader = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0032 A[Catch: all -> 0x00eb, Exception -> 0x00ed, TryCatch #2 {Exception -> 0x00ed, blocks: (B:11:0x0017, B:15:0x0020, B:17:0x0032, B:22:0x004e, B:18:0x0038, B:20:0x0049), top: B:64:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0038 A[Catch: all -> 0x00eb, Exception -> 0x00ed, TryCatch #2 {Exception -> 0x00ed, blocks: (B:11:0x0017, B:15:0x0020, B:17:0x0032, B:22:0x004e, B:18:0x0038, B:20:0x0049), top: B:64:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0049 A[Catch: all -> 0x00eb, Exception -> 0x00ed, TryCatch #2 {Exception -> 0x00ed, blocks: (B:11:0x0017, B:15:0x0020, B:17:0x0032, B:22:0x004e, B:18:0x0038, B:20:0x0049), top: B:64:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x005e A[Catch: Exception -> 0x00e8, all -> 0x00eb, TryCatch #3 {Exception -> 0x00e8, blocks: (B:23:0x005a, B:25:0x005e, B:27:0x006d, B:29:0x0071, B:30:0x007b, B:32:0x00aa, B:33:0x00b2, B:35:0x00b8, B:36:0x00ce), top: B:66:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00aa A[Catch: Exception -> 0x00e8, all -> 0x00eb, TryCatch #3 {Exception -> 0x00e8, blocks: (B:23:0x005a, B:25:0x005e, B:27:0x006d, B:29:0x0071, B:30:0x007b, B:32:0x00aa, B:33:0x00b2, B:35:0x00b8, B:36:0x00ce), top: B:66:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b8 A[Catch: Exception -> 0x00e8, all -> 0x00eb, LOOP:0: B:33:0x00b2->B:35:0x00b8, LOOP_END, TryCatch #3 {Exception -> 0x00e8, blocks: (B:23:0x005a, B:25:0x005e, B:27:0x006d, B:29:0x0071, B:30:0x007b, B:32:0x00aa, B:33:0x00b2, B:35:0x00b8, B:36:0x00ce), top: B:66:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f8 A[Catch: all -> 0x0113, TRY_LEAVE, TryCatch #1 {all -> 0x0113, blocks: (B:49:0x00f0, B:51:0x00f8), top: B:62:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0105  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    public void l1111l111111Il(byte[] bArr, Map<String, String> map, String str, l1111l111111Il<?> l1111l111111il) throws Throwable {
        HttpURLConnection httpURLConnection;
        OutputStream outputStream;
        Exception e;
        final String strL111l1111l1Il;
        String strL1111l111111Il;
        URL url;
        OutputStream outputStream2;
        SSLContext sSLContext;
        if (bArr == null || bArr.length == 0) {
            throw new IOException("data is null");
        }
        if (l1111l111111il != null && l1111l111111il.l111l11111lIl == null) {
            l1111l111111il.l111l11111lIl = new l111l11111lIl();
        }
        OutputStream outputStream3 = null;
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                if (l1111l111111il != null) {
                    try {
                        try {
                            boolean z = l1111l111111il.l111l11111lIl.l111l11111Il > 0;
                            strL111l1111l1Il = l111l1111lIl.l111l1111l1Il(str);
                            strL1111l111111Il = com.ishumei.l111l11111lIl.l1111l111111Il.l1111l111111Il.l1111l111111Il().l1111l111111Il(strL111l1111l1Il, z);
                            if (TextUtils.isEmpty(strL1111l111111Il)) {
                                url = new URL(str);
                            } else {
                                URL url2 = new URL(Patterns.DOMAIN_NAME.matcher(str).replaceFirst(strL1111l111111Il));
                                if (l1111l111111il != null) {
                                    l1111l111111il.l111l11111lIl.l11l1111I1l = strL1111l111111Il;
                                }
                                url = url2;
                            }
                            httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
                            if (this.l111l1111lIl == 0) {
                                ((HttpsURLConnection) httpURLConnection).setHostnameVerifier(new HostnameVerifier() { // from class: com.ishumei.l111l1111l1Il.l111l11111I1l.2
                                    @Override // javax.net.ssl.HostnameVerifier
                                    public final boolean verify(String str2, SSLSession sSLSession) {
                                        if (TextUtils.isEmpty(strL111l1111l1Il) || Patterns.IP_ADDRESS.matcher(strL111l1111l1Il).matches()) {
                                            return true;
                                        }
                                        return HttpsURLConnection.getDefaultHostnameVerifier().verify(strL111l1111l1Il, sSLSession);
                                    }
                                });
                                if (this.l11l1111Il1l != null && (sSLContext = this.l11l1111Il) != null) {
                                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLContext.getSocketFactory());
                                }
                            }
                            httpURLConnection.setDoInput(true);
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.setUseCaches(false);
                            httpURLConnection.setInstanceFollowRedirects(true);
                            httpURLConnection.setRequestMethod(l111l1111lI1l);
                            httpURLConnection.setRequestProperty("Content-Type", "application/octet-stream");
                            httpURLConnection.setRequestProperty(l111l1111l1Il, l111l1111llIl);
                            httpURLConnection.setConnectTimeout(this.l11l1111I11l);
                            httpURLConnection.setReadTimeout(this.l11l1111I1l);
                            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                            if (map != null) {
                                for (Map.Entry<String, String> entry : map.entrySet()) {
                                    httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                                }
                            }
                            httpURLConnection.connect();
                            outputStream2 = httpURLConnection.getOutputStream();
                            outputStream2.write(bArr);
                            outputStream2.flush();
                            l111l1111lIl.l1111l111111Il((Closeable) outputStream2);
                            httpURLConnection2 = httpURLConnection;
                        } catch (Exception e2) {
                            e = e2;
                            outputStream = null;
                            httpURLConnection = null;
                            try {
                                l111l1111lIl.l1111l111111Il(httpURLConnection);
                                Log.getStackTraceString(e);
                                if (l1111l111111il != null) {
                                    l1111l111111il.l111l11111lIl.l11l1111lIIl = e.toString();
                                }
                                l111l1111lIl.l1111l111111Il((Closeable) outputStream);
                                if (l1111l111111il != null) {
                                    l111l11111lIl l111l11111lil = l1111l111111il.l111l11111lIl;
                                    l111l11111lil.l1111l111111Il = httpURLConnection2;
                                    l111l11111lil.l111l11111lIl = bArr;
                                    l111l11111lil.l111l11111I1l = map;
                                    l111l11111lil.l11l1111I11l = str;
                                    l1111l111111il.l1111l111111Il();
                                }
                            } catch (Throwable th) {
                                th = th;
                                outputStream3 = outputStream;
                                l111l1111lIl.l1111l111111Il((Closeable) outputStream3);
                                throw th;
                            }
                        }
                        if (l1111l111111il != null) {
                            l111l11111lIl l111l11111lil2 = l1111l111111il.l111l11111lIl;
                            l111l11111lil2.l1111l111111Il = httpURLConnection2;
                            l111l11111lil2.l111l11111lIl = bArr;
                            l111l11111lil2.l111l11111I1l = map;
                            l111l11111lil2.l11l1111I11l = str;
                            l1111l111111il.l1111l111111Il();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        l111l1111lIl.l1111l111111Il((Closeable) outputStream3);
                        throw th;
                    }
                }
                outputStream2.write(bArr);
                outputStream2.flush();
                l111l1111lIl.l1111l111111Il((Closeable) outputStream2);
                httpURLConnection2 = httpURLConnection;
            } catch (Exception e3) {
                outputStream = outputStream2;
                e = e3;
                l111l1111lIl.l1111l111111Il(httpURLConnection);
                Log.getStackTraceString(e);
                if (l1111l111111il != null) {
                    l1111l111111il.l111l11111lIl.l11l1111lIIl = e.toString();
                }
                l111l1111lIl.l1111l111111Il((Closeable) outputStream);
            } catch (Throwable th3) {
                th = th3;
                outputStream3 = outputStream2;
                l111l1111lIl.l1111l111111Il((Closeable) outputStream3);
                throw th;
            }
            if (this.l111l1111lIl == 0) {
                ((HttpsURLConnection) httpURLConnection).setHostnameVerifier(new HostnameVerifier() { // from class: com.ishumei.l111l1111l1Il.l111l11111I1l.2
                    @Override // javax.net.ssl.HostnameVerifier
                    public final boolean verify(String str2, SSLSession sSLSession) {
                        if (TextUtils.isEmpty(strL111l1111l1Il) || Patterns.IP_ADDRESS.matcher(strL111l1111l1Il).matches()) {
                            return true;
                        }
                        return HttpsURLConnection.getDefaultHostnameVerifier().verify(strL111l1111l1Il, sSLSession);
                    }
                });
                if (this.l11l1111Il1l != null) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLContext.getSocketFactory());
                }
            }
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setRequestMethod(l111l1111lI1l);
            httpURLConnection.setRequestProperty("Content-Type", "application/octet-stream");
            httpURLConnection.setRequestProperty(l111l1111l1Il, l111l1111llIl);
            httpURLConnection.setConnectTimeout(this.l11l1111I11l);
            httpURLConnection.setReadTimeout(this.l11l1111I1l);
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            if (map != null) {
                while (r0.hasNext()) {
                    httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                }
            }
            httpURLConnection.connect();
            outputStream2 = httpURLConnection.getOutputStream();
        } catch (Exception e4) {
            e = e4;
            outputStream = null;
        }
        strL111l1111l1Il = l111l1111lIl.l111l1111l1Il(str);
        strL1111l111111Il = com.ishumei.l111l11111lIl.l1111l111111Il.l1111l111111Il.l1111l111111Il().l1111l111111Il(strL111l1111l1Il, z);
        if (TextUtils.isEmpty(strL1111l111111Il)) {
            url = new URL(str);
        } else {
            URL url3 = new URL(Patterns.DOMAIN_NAME.matcher(str).replaceFirst(strL1111l111111Il));
            if (l1111l111111il != null) {
                l1111l111111il.l111l11111lIl.l11l1111I1l = strL1111l111111Il;
            }
            url = url3;
        }
        httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        if (l1111l111111il != null) {
            l111l11111lIl l111l11111lil3 = l1111l111111il.l111l11111lIl;
            l111l11111lil3.l1111l111111Il = httpURLConnection2;
            l111l11111lil3.l111l11111lIl = bArr;
            l111l11111lil3.l111l11111I1l = map;
            l111l11111lil3.l11l1111I11l = str;
            l1111l111111il.l1111l111111Il();
        }
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [T, com.ishumei.l111l1111l1Il.l111l11111I1l$l111l11111lIl] */
    public final void l1111l111111Il(byte[] bArr, boolean z, Map<String, String> map, l1111l111111Il l1111l111111il) {
        if (l1111l111111il != null) {
            try {
                com.ishumei.l111l11111lIl.l111l11111lIl l111l11111lIl2 = com.ishumei.l111l11111lIl.l1111l111111Il.l1111l111111Il().l111l11111lIl();
                int iL111l1111l1Il = l111l11111lIl2 == null ? 2 : l111l11111lIl2.l111l1111l1Il();
                if (l1111l111111il.l111l11111lIl == null) {
                    l1111l111111il.l111l11111lIl = new l111l11111lIl();
                }
                l111l11111lIl l111l11111lil = l1111l111111il.l111l11111lIl;
                l111l11111lil.l111l11111Il = 0;
                l111l11111lil.l111l11111lIl = bArr;
                l111l11111lil.l111l11111I1l = null;
                l111l11111lil.l111l1111lI1l = true;
                l111l11111lil.l111l1111l1Il = l1111l111111il;
                l111l11111lil.l111l1111lIl = Math.min(iL111l1111l1Il, this.l11l1111lIIl.size());
                l1111l111111il.l111l11111lIl.l11l1111I11l = this.l11l1111lIIl.get(0);
                l111l11111lIl l111l11111lil2 = l1111l111111il.l111l11111lIl;
                l111l11111lil2.l11l1111I1ll = z;
                l111l11111lil2.l111l1111llIl = new com.ishumei.l111l11111I1l.l111l11111lIl<l111l11111lIl>(true, com.ishumei.l111l11111I1l.l1111l111111Il.l111l11111lIl().l1111l111111Il(), true, this.l11l1111I1ll, false) { // from class: com.ishumei.l111l1111l1Il.l111l11111I1l.3
                    {
                        super(true, i, true, j, false);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        l111l11111lIl l111l11111lil3 = (l111l11111lIl) this.l1111l111111Il;
                        try {
                            if (l111l11111lil3 == null) {
                                throw new Exception("sessionCache is null");
                            }
                            if (l111l11111lil3.l111l11111Il >= l111l11111I1l.this.l11l1111lIIl.size()) {
                                return;
                            }
                            l111l11111I1l l111l11111i1l = l111l11111I1l.this;
                            l111l11111i1l.l1111l111111Il(l111l11111lil3.l111l11111lIl, l111l11111lil3.l111l11111I1l, (String) l111l11111i1l.l11l1111lIIl.get(l111l11111lil3.l111l11111Il), (l1111l111111Il<?>) l111l11111lil3.l111l1111l1Il);
                        } catch (Exception e) {
                            Log.getStackTraceString(e);
                        }
                    }
                };
                ?? r12 = l1111l111111il.l111l11111lIl;
                r12.l111l1111llIl.l1111l111111Il = r12;
            } catch (Exception e) {
                Log.getStackTraceString(e);
                return;
            }
        }
        l1111l111111Il(bArr, (Map<String, String>) null, this.l11l1111lIIl.get(0), (l1111l111111Il<?>) l1111l111111il);
    }
}
