package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.android.billingclient.api.o0OO00O;
import com.efs.sdk.base.Constants;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import p265o00ooo00.Oooo0;
import p318o0O0oOo.o0000oo;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o extends p709oo0oOOo.OooOO0 implements HttpDataSource {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final HttpDataSource.OooO0OO f14856OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f14857OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f14858OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f14859OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f14860OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final HttpDataSource.OooO0OO f14861OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public DataSpec f14862OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public HttpURLConnection f14863OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f14864OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public InputStream f14865OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f14866OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public long f14867OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public long f14868OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public long f14869OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public long f14870OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final Pattern f14855OooOo00 = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final AtomicReference<byte[]> f14854OooOo0 = new AtomicReference<>();

    public OooO0o(String str, int i, int i2, boolean z, @Nullable HttpDataSource.OooO0OO oooO0OO) {
        super(true);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f14860OooO0oo = str;
        this.f14861OooOO0 = new HttpDataSource.OooO0OO();
        this.f14857OooO0o = i;
        this.f14859OooO0oO = i2;
        this.f14858OooO0o0 = z;
        this.f14856OooO = oooO0OO;
    }

    public static URL OooOo00(URL url, @Nullable String str) throws IOException {
        if (str == null) {
            throw new ProtocolException("Null location redirect");
        }
        URL url2 = new URL(url, str);
        String protocol = url2.getProtocol();
        if ("https".equals(protocol) || "http".equals(protocol)) {
            return url2;
        }
        String strValueOf = String.valueOf(protocol);
        throw new ProtocolException(strValueOf.length() != 0 ? "Unsupported protocol redirect: ".concat(strValueOf) : new String("Unsupported protocol redirect: "));
    }

    public static void OooOo0o(HttpURLConnection httpURLConnection, long j) {
        int i = o000OOo0.f36740OooO00o;
        if (i == 19 || i == 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003e  */
    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final long OooO0o(DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        long j;
        this.f14862OooOO0O = dataSpec;
        this.f14870OooOOoo = 0L;
        this.f14868OooOOo = 0L;
        OooOOo0(dataSpec);
        try {
            HttpURLConnection httpURLConnectionOooOo0 = OooOo0(dataSpec);
            this.f14863OooOO0o = httpURLConnectionOooOo0;
            try {
                this.f14866OooOOOO = httpURLConnectionOooOo0.getResponseCode();
                this.f14863OooOO0o.getResponseMessage();
                int i = this.f14866OooOOOO;
                if (i < 200 || i > 299) {
                    Map<String, List<String>> headerFields = this.f14863OooOO0o.getHeaderFields();
                    InputStream errorStream = this.f14863OooOO0o.getErrorStream();
                    try {
                        if (errorStream != null) {
                            o000OOo0.Oooo00o(errorStream);
                        } else {
                            byte[] bArr = o000OOo0.f36744OooO0o;
                        }
                        OooOOoo();
                        HttpDataSource.InvalidResponseCodeException invalidResponseCodeException = new HttpDataSource.InvalidResponseCodeException(this.f14866OooOOOO, headerFields, dataSpec);
                        if (this.f14866OooOOOO != 416) {
                            throw invalidResponseCodeException;
                        }
                        invalidResponseCodeException.initCause(new DataSourceException());
                        throw invalidResponseCodeException;
                    } catch (IOException e) {
                        throw new HttpDataSource.HttpDataSourceException("Error reading non-2xx response body", e);
                    }
                }
                this.f14863OooOO0o.getContentType();
                if (this.f14866OooOOOO == 200) {
                    j = dataSpec.f14805OooO0o;
                    if (j == 0) {
                        j = 0;
                    }
                } else {
                    j = 0;
                }
                this.f14867OooOOOo = j;
                boolean zEqualsIgnoreCase = Constants.CP_GZIP.equalsIgnoreCase(this.f14863OooOO0o.getHeaderField("Content-Encoding"));
                if (zEqualsIgnoreCase) {
                    this.f14869OooOOo0 = dataSpec.f14807OooO0oO;
                } else {
                    long j2 = dataSpec.f14807OooO0oO;
                    long jMax = -1;
                    if (j2 != -1) {
                        this.f14869OooOOo0 = j2;
                    } else {
                        HttpURLConnection httpURLConnection = this.f14863OooOO0o;
                        String headerField = httpURLConnection.getHeaderField("Content-Length");
                        if (!TextUtils.isEmpty(headerField)) {
                            try {
                                jMax = Long.parseLong(headerField);
                            } catch (NumberFormatException unused) {
                                StringBuilder sb = new StringBuilder(o0OO00O.OooO00o(headerField, 28));
                                sb.append("Unexpected Content-Length [");
                                sb.append(headerField);
                                sb.append("]");
                                Log.e("DefaultHttpDataSource", sb.toString());
                            }
                        }
                        String headerField2 = httpURLConnection.getHeaderField("Content-Range");
                        if (!TextUtils.isEmpty(headerField2)) {
                            Matcher matcher = f14855OooOo00.matcher(headerField2);
                            if (matcher.find()) {
                                try {
                                    long j3 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                    if (jMax < 0) {
                                        jMax = j3;
                                    } else if (jMax != j3) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(headerField).length() + 26 + String.valueOf(headerField2).length());
                                        sb2.append("Inconsistent headers [");
                                        sb2.append(headerField);
                                        sb2.append("] [");
                                        sb2.append(headerField2);
                                        sb2.append("]");
                                        Log.w("DefaultHttpDataSource", sb2.toString());
                                        jMax = Math.max(jMax, j3);
                                    }
                                } catch (NumberFormatException unused2) {
                                    StringBuilder sb3 = new StringBuilder(o0OO00O.OooO00o(headerField2, 27));
                                    sb3.append("Unexpected Content-Range [");
                                    sb3.append(headerField2);
                                    sb3.append("]");
                                    Log.e("DefaultHttpDataSource", sb3.toString());
                                }
                            }
                        }
                        this.f14869OooOOo0 = jMax != -1 ? jMax - this.f14867OooOOOo : -1L;
                    }
                }
                try {
                    this.f14865OooOOO0 = this.f14863OooOO0o.getInputStream();
                    if (zEqualsIgnoreCase) {
                        this.f14865OooOOO0 = new GZIPInputStream(this.f14865OooOOO0);
                    }
                    this.f14864OooOOO = true;
                    OooOOo(dataSpec);
                    return this.f14869OooOOo0;
                } catch (IOException e2) {
                    OooOOoo();
                    throw new HttpDataSource.HttpDataSourceException(e2);
                }
            } catch (IOException e3) {
                OooOOoo();
                throw new HttpDataSource.HttpDataSourceException("Unable to connect", e3);
            }
        } catch (IOException e4) {
            throw new HttpDataSource.HttpDataSourceException("Unable to connect", e4);
        }
    }

    @Override // p709oo0oOOo.OooOO0, com.google.android.exoplayer2.upstream.OooO00o
    public final Map<String, List<String>> OooO0oo() {
        HttpURLConnection httpURLConnection = this.f14863OooOO0o;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    @Nullable
    public final Uri OooOO0o() {
        HttpURLConnection httpURLConnection = this.f14863OooOO0o;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final void OooOOoo() {
        HttpURLConnection httpURLConnection = this.f14863OooOO0o;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                o0000oo.OooO0O0("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f14863OooOO0o = null;
        }
    }

    public final void OooOo() throws IOException {
        if (this.f14868OooOOo == this.f14867OooOOOo) {
            return;
        }
        byte[] andSet = f14854OooOo0.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[4096];
        }
        while (true) {
            long j = this.f14868OooOOo;
            long j2 = this.f14867OooOOOo;
            if (j == j2) {
                f14854OooOo0.set(andSet);
                return;
            }
            int i = this.f14865OooOOO0.read(andSet, 0, (int) Math.min(j2 - j, andSet.length));
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedIOException();
            }
            if (i == -1) {
                throw new EOFException();
            }
            this.f14868OooOOo += (long) i;
            OooOOOO(i);
        }
    }

    public final HttpURLConnection OooOo0(DataSpec dataSpec) throws IOException {
        DataSpec dataSpec2 = dataSpec;
        URL url = new URL(dataSpec2.f14801OooO00o.toString());
        int i = dataSpec2.f14803OooO0OO;
        byte[] bArr = dataSpec2.f14804OooO0Oo;
        long j = dataSpec2.f14805OooO0o;
        long j2 = dataSpec2.f14807OooO0oO;
        int i2 = 0;
        boolean z = (dataSpec2.f14800OooO & 1) == 1;
        if (!this.f14858OooO0o0) {
            return OooOo0O(url, i, bArr, j, j2, z, true, dataSpec2.f14806OooO0o0);
        }
        while (true) {
            int i3 = i2 + 1;
            if (i2 > 20) {
                throw new NoRouteToHostException(Oooo0.OooO00o(31, "Too many redirects: ", i3));
            }
            long j3 = j2;
            long j4 = j;
            HttpURLConnection httpURLConnectionOooOo0O = OooOo0O(url, i, bArr, j, j2, z, false, dataSpec2.f14806OooO0o0);
            int responseCode = httpURLConnectionOooOo0O.getResponseCode();
            String headerField = httpURLConnectionOooOo0O.getHeaderField("Location");
            if ((i == 1 || i == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionOooOo0O.disconnect();
                url = OooOo00(url, headerField);
            } else {
                if (i != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return httpURLConnectionOooOo0O;
                }
                httpURLConnectionOooOo0O.disconnect();
                url = OooOo00(url, headerField);
                i = 1;
                bArr = null;
            }
            dataSpec2 = dataSpec;
            i2 = i3;
            j2 = j3;
            j = j4;
        }
    }

    public final HttpURLConnection OooOo0O(URL url, int i, @Nullable byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f14857OooO0o);
        httpURLConnection.setReadTimeout(this.f14859OooO0oO);
        HashMap map2 = new HashMap();
        HttpDataSource.OooO0OO oooO0OO = this.f14856OooO;
        if (oooO0OO != null) {
            map2.putAll(oooO0OO.OooO00o());
        }
        map2.putAll(this.f14861OooOO0.OooO00o());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j != 0 || j2 != -1) {
            StringBuilder sb = new StringBuilder(27);
            sb.append("bytes=");
            sb.append(j);
            sb.append("-");
            String string = sb.toString();
            if (j2 != -1) {
                String strValueOf = String.valueOf(string);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 20);
                sb2.append(strValueOf);
                sb2.append((j + j2) - 1);
                string = sb2.toString();
            }
            httpURLConnection.setRequestProperty("Range", string);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f14860OooO0oo);
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? Constants.CP_GZIP : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(DataSpec.OooO00o(i));
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final void close() throws HttpDataSource.HttpDataSourceException {
        try {
            if (this.f14865OooOOO0 != null) {
                HttpURLConnection httpURLConnection = this.f14863OooOO0o;
                long j = this.f14869OooOOo0;
                if (j != -1) {
                    j -= this.f14870OooOOoo;
                }
                OooOo0o(httpURLConnection, j);
                try {
                    this.f14865OooOOO0.close();
                } catch (IOException e) {
                    throw new HttpDataSource.HttpDataSourceException(e);
                }
            }
            this.f14865OooOOO0 = null;
            OooOOoo();
            if (this.f14864OooOOO) {
                this.f14864OooOOO = false;
                OooOOOo();
            }
        } catch (Throwable th) {
            this.f14865OooOOO0 = null;
            OooOOoo();
            if (this.f14864OooOOO) {
                this.f14864OooOOO = false;
                OooOOOo();
            }
            throw th;
        }
    }

    @Override // p709oo0oOOo.OooOO0O
    public final int read(byte[] bArr, int i, int i2) throws HttpDataSource.HttpDataSourceException {
        try {
            OooOo();
            if (i2 == 0) {
                return 0;
            }
            long j = this.f14869OooOOo0;
            if (j != -1) {
                long j2 = j - this.f14870OooOOoo;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            int i3 = this.f14865OooOOO0.read(bArr, i, i2);
            if (i3 == -1) {
                if (this.f14869OooOOo0 == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.f14870OooOOoo += (long) i3;
            OooOOOO(i3);
            return i3;
        } catch (IOException e) {
            throw new HttpDataSource.HttpDataSourceException(e);
        }
    }
}
