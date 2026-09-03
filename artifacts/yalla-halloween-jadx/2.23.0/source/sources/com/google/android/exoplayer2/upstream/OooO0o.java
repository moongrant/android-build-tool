package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.ui.o0000OO0;
import com.google.android.exoplayer2.util.Log;
import com.google.common.base.o0OoOo0;
import com.google.common.collect.o000;
import com.google.common.collect.o00O0O0O;
import com.google.common.collect.o00OO00O;
import com.google.common.collect.o00oO0o;
import com.google.common.collect.o0O0O0Oo;
import com.google.common.collect.o0OoO00O;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import p028Oooo0oO.o00O0000;
import p244o00oo0Oo.o000OO00;
import p244o00oo0Oo.o00O00OO;
import p244o00oo0Oo.o00O00o0;
import p244o00oo0Oo.oOO00O;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooO0o extends o000OO00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final o00O00OO f14226OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f14227OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f14228OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f14229OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final String f14230OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o00O00OO f14231OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f14232OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public final o0OoOo0<String> f14233OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public InputStream f14234OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public HttpURLConnection f14235OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f14236OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f14237OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public long f14238OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public long f14239OooOOo0;

    public static final class OooO00o implements com.google.android.exoplayer2.upstream.OooO00o.InterfaceC0215OooO00o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public String f14241OooO0O0;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f14244OooO0o0;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o00O00OO f14240OooO00o = new o00O00OO();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f14242OooO0OO = 8000;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f14243OooO0Oo = 8000;

        @Override // com.google.android.exoplayer2.upstream.OooO00o.InterfaceC0215OooO00o
        public final com.google.android.exoplayer2.upstream.OooO00o OooO00o() {
            return new OooO0o(this.f14241OooO0O0, this.f14242OooO0OO, this.f14243OooO0Oo, this.f14244OooO0o0, this.f14240OooO00o);
        }
    }

    public static class OooO0O0 extends o000<String, List<String>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Map<String, List<String>> f14245OooO0Oo;

        public OooO0O0(Map<String, List<String>> map) {
            this.f14245OooO0Oo = map;
        }

        @Override // com.google.common.collect.o000, com.google.common.collect.o000Oo0
        public final Object OooO00o() {
            return this.f14245OooO0Oo;
        }

        @Override // com.google.common.collect.o000
        /* JADX INFO: renamed from: OooO0O0 */
        public final Map<String, List<String>> OooO00o() {
            return this.f14245OooO0Oo;
        }

        @Override // com.google.common.collect.o000, java.util.Map
        public final boolean containsKey(@Nullable Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // com.google.common.collect.o000, java.util.Map
        public final boolean containsValue(@Nullable Object obj) {
            return o00O0O0O.OooO0OO(obj, new o00OO00O(((o00oO0o.OooO00o) entrySet()).iterator()));
        }

        @Override // com.google.common.collect.o000, java.util.Map
        public final Set<Map.Entry<String, List<String>>> entrySet() {
            return o0O0O0Oo.OooO0O0(super.entrySet(), new oOO00O());
        }

        @Override // com.google.common.collect.o000, java.util.Map
        public final boolean equals(@Nullable Object obj) {
            boolean zEquals;
            if (obj == null) {
                return false;
            }
            if (this == obj) {
                zEquals = true;
            } else if (obj instanceof Map) {
                zEquals = ((o0O0O0Oo.OooO00o) entrySet()).equals(((Map) obj).entrySet());
            } else {
                zEquals = false;
            }
            return zEquals;
        }

        @Override // com.google.common.collect.o000, java.util.Map
        @Nullable
        public final Object get(@Nullable Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // com.google.common.collect.o000, java.util.Map
        public final int hashCode() {
            return o0O0O0Oo.OooO0OO(entrySet());
        }

        @Override // com.google.common.collect.o000, java.util.Map
        public final boolean isEmpty() {
            if (super.isEmpty()) {
                return true;
            }
            return super.size() == 1 && super.containsKey(null);
        }

        @Override // com.google.common.collect.o000, java.util.Map
        public final Set<String> keySet() {
            return o0O0O0Oo.OooO0O0(super.keySet(), new o0000OO0());
        }

        @Override // com.google.common.collect.o000, java.util.Map
        public final int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }
    }

    public OooO0o(String str, int i, int i2, boolean z, o00O00OO o00o00oo2) {
        super(true);
        this.f14230OooO0oo = str;
        this.f14227OooO0o = i;
        this.f14229OooO0oO = i2;
        this.f14228OooO0o0 = z;
        this.f14226OooO = o00o00oo2;
        this.f14233OooOO0o = null;
        this.f14231OooOO0 = new o00O00OO();
        this.f14232OooOO0O = false;
    }

    public static void OooOo00(@Nullable HttpURLConnection httpURLConnection, long j) {
        int i;
        if (httpURLConnection == null || (i = o0O00.f40595OooO00o) < 19 || i > 20) {
            return;
        }
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
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                superclass.getClass();
                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0114  */
    /* JADX WARN: Code duplicated, block: B:82:0x019f  */
    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final long OooO00o(DataSpec dataSpec) throws HttpDataSource$HttpDataSourceException {
        boolean z;
        long j;
        OooO0o oooO0o;
        HttpURLConnection httpURLConnection;
        long j2;
        long j3;
        long jMax;
        this.f14238OooOOo = 0L;
        this.f14239OooOOo0 = 0L;
        OooOOO(dataSpec);
        try {
            HttpURLConnection httpURLConnectionOooOOo = OooOOo(dataSpec);
            this.f14235OooOOO0 = httpURLConnectionOooOOo;
            this.f14237OooOOOo = httpURLConnectionOooOOo.getResponseCode();
            httpURLConnectionOooOOo.getResponseMessage();
            int i = this.f14237OooOOOo;
            long j4 = dataSpec.f14165OooO0o;
            long j5 = dataSpec.f14167OooO0oO;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionOooOOo.getHeaderFields();
                if (this.f14237OooOOOo == 416) {
                    String headerField = httpURLConnectionOooOOo.getHeaderField("Content-Range");
                    Pattern pattern = o00O00o0.f40513OooO00o;
                    if (TextUtils.isEmpty(headerField)) {
                        z = true;
                        j = -1;
                    } else {
                        Matcher matcher = o00O00o0.f40514OooO0O0.matcher(headerField);
                        if (matcher.matches()) {
                            z = true;
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            j = Long.parseLong(strGroup);
                        } else {
                            z = true;
                            j = -1;
                        }
                    }
                    if (j4 == j) {
                        this.f14236OooOOOO = z;
                        OooOOOO(dataSpec);
                        if (j5 != -1) {
                            return j5;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionOooOOo.getErrorStream();
                try {
                    if (errorStream != null) {
                        int i2 = o0O00.f40595OooO00o;
                        byte[] bArr = new byte[4096];
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            int i3 = errorStream.read(bArr);
                            if (i3 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i3);
                        }
                        byteArrayOutputStream.toByteArray();
                    } else {
                        int i4 = o0O00.f40595OooO00o;
                    }
                } catch (IOException unused) {
                    int i5 = o0O00.f40595OooO00o;
                }
                OooOOOo();
                throw new HttpDataSource$InvalidResponseCodeException(this.f14237OooOOOo, this.f14237OooOOOo == 416 ? new DataSourceException(2008) : null, headerFields);
            }
            final String contentType = httpURLConnectionOooOOo.getContentType();
            o0OoOo0<String> o0oooo0 = this.f14233OooOO0o;
            if (o0oooo0 != null && !o0oooo0.apply(contentType)) {
                OooOOOo();
                throw new HttpDataSource$HttpDataSourceException(contentType) { // from class: com.google.android.exoplayer2.upstream.HttpDataSource$InvalidContentTypeException
                    {
                        super(p022Oooo00O.o00O00OO.OooO00o("Invalid content type: ", contentType), 2003);
                    }
                };
            }
            if (this.f14237OooOOOo != 200 || j4 == 0) {
                j4 = 0;
            }
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionOooOOo.getHeaderField("Content-Encoding"));
            if (zEqualsIgnoreCase) {
                oooO0o = this;
                httpURLConnection = httpURLConnectionOooOOo;
                oooO0o.f14239OooOOo0 = j5;
            } else if (j5 != -1) {
                this.f14239OooOOo0 = j5;
                oooO0o = this;
                httpURLConnection = httpURLConnectionOooOOo;
            } else {
                String headerField2 = httpURLConnectionOooOOo.getHeaderField("Content-Length");
                String headerField3 = httpURLConnectionOooOOo.getHeaderField("Content-Range");
                Pattern pattern2 = o00O00o0.f40513OooO00o;
                if (TextUtils.isEmpty(headerField2)) {
                    j2 = -1;
                } else {
                    try {
                        j2 = Long.parseLong(headerField2);
                    } catch (NumberFormatException unused2) {
                        Log.OooO0OO("HttpUtil", "Unexpected Content-Length [" + headerField2 + "]");
                        j2 = -1;
                    }
                }
                long j6 = j2;
                if (TextUtils.isEmpty(headerField3)) {
                    httpURLConnection = httpURLConnectionOooOOo;
                    j3 = j6;
                    jMax = j3;
                } else {
                    Matcher matcher2 = o00O00o0.f40513OooO00o.matcher(headerField3);
                    if (matcher2.matches()) {
                        try {
                            String strGroup2 = matcher2.group(2);
                            strGroup2.getClass();
                            long j7 = Long.parseLong(strGroup2);
                            String strGroup3 = matcher2.group(1);
                            strGroup3.getClass();
                            httpURLConnection = httpURLConnectionOooOOo;
                            long j8 = (j7 - Long.parseLong(strGroup3)) + 1;
                            j3 = j6;
                            if (j3 < 0) {
                                jMax = j8;
                            } else if (j3 != j8) {
                                try {
                                    Log.OooO0o("HttpUtil", "Inconsistent headers [" + headerField2 + "] [" + headerField3 + "]");
                                    jMax = Math.max(j3, j8);
                                } catch (NumberFormatException unused3) {
                                    Log.OooO0OO("HttpUtil", "Unexpected Content-Range [" + headerField3 + "]");
                                    jMax = j3;
                                }
                            }
                        } catch (NumberFormatException unused4) {
                            httpURLConnection = httpURLConnectionOooOOo;
                            j3 = j6;
                        }
                    } else {
                        httpURLConnection = httpURLConnectionOooOOo;
                        j3 = j6;
                    }
                    jMax = j3;
                }
                oooO0o = this;
                oooO0o.f14239OooOOo0 = jMax != -1 ? jMax - j4 : -1L;
            }
            try {
                oooO0o.f14234OooOOO = httpURLConnection.getInputStream();
                if (zEqualsIgnoreCase) {
                    oooO0o.f14234OooOOO = new GZIPInputStream(oooO0o.f14234OooOOO);
                }
                oooO0o.f14236OooOOOO = true;
                OooOOOO(dataSpec);
                try {
                    oooO0o.OooOo0(j4);
                    return oooO0o.f14239OooOOo0;
                } catch (IOException e) {
                    OooOOOo();
                    if (e instanceof HttpDataSource$HttpDataSourceException) {
                        throw ((HttpDataSource$HttpDataSourceException) e);
                    }
                    throw new HttpDataSource$HttpDataSourceException(e, 2000, 1);
                }
            } catch (IOException e2) {
                OooOOOo();
                throw new HttpDataSource$HttpDataSourceException(e2, 2000, 1);
            }
        } catch (IOException e3) {
            OooOOOo();
            throw HttpDataSource$HttpDataSourceException.OooO00o(e3, 1);
        }
    }

    @Override // p244o00oo0Oo.o000OO00, com.google.android.exoplayer2.upstream.OooO00o
    public final Map<String, List<String>> OooO0o0() {
        HttpURLConnection httpURLConnection = this.f14235OooOOO0;
        return httpURLConnection == null ? o0OoO00O.f19626OooOO0 : new OooO0O0(httpURLConnection.getHeaderFields());
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    @Nullable
    public final Uri OooOO0O() {
        HttpURLConnection httpURLConnection = this.f14235OooOOO0;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final void OooOOOo() {
        HttpURLConnection httpURLConnection = this.f14235OooOOO0;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                Log.OooO0Oo("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f14235OooOOO0 = null;
        }
    }

    public final HttpURLConnection OooOOo(DataSpec dataSpec) throws IOException {
        DataSpec dataSpec2 = dataSpec;
        URL url = new URL(dataSpec2.f14161OooO00o.toString());
        int i = dataSpec2.f14163OooO0OO;
        byte[] bArr = dataSpec2.f14164OooO0Oo;
        long j = dataSpec2.f14165OooO0o;
        long j2 = dataSpec2.f14167OooO0oO;
        boolean z = (dataSpec2.f14160OooO & 1) == 1;
        boolean z2 = this.f14228OooO0o0;
        boolean z3 = this.f14232OooOO0O;
        if (!z2 && !z3) {
            return OooOOoo(url, i, bArr, j, j2, z, true, dataSpec2.f14166OooO0o0);
        }
        URL urlOooOOo0 = url;
        int i2 = i;
        byte[] bArr2 = bArr;
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i3 > 20) {
                throw new HttpDataSource$HttpDataSourceException(new NoRouteToHostException(android.support.v4.media.OooO00o.OooO00o("Too many redirects: ", i4)), ZegoConstants.StreamUpdateType.Added, 1);
            }
            Map<String, String> map = dataSpec2.f14166OooO0o0;
            URL url2 = urlOooOOo0;
            int i5 = i2;
            boolean z4 = z3;
            long j3 = j2;
            HttpURLConnection httpURLConnectionOooOOoo = OooOOoo(urlOooOOo0, i2, bArr2, j, j2, z, false, map);
            int responseCode = httpURLConnectionOooOOoo.getResponseCode();
            String headerField = httpURLConnectionOooOOoo.getHeaderField("Location");
            if ((i5 == 1 || i5 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionOooOOoo.disconnect();
                urlOooOOo0 = OooOOo0(url2, headerField);
                i2 = i5;
            } else {
                if (i5 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return httpURLConnectionOooOOoo;
                }
                httpURLConnectionOooOOoo.disconnect();
                if (z4 && responseCode == 302) {
                    i2 = i5;
                } else {
                    bArr2 = null;
                    i2 = 1;
                }
                urlOooOOo0 = OooOOo0(url2, headerField);
            }
            dataSpec2 = dataSpec;
            i3 = i4;
            z3 = z4;
            j2 = j3;
        }
    }

    public final URL OooOOo0(URL url, @Nullable String str) throws HttpDataSource$HttpDataSourceException {
        if (str == null) {
            throw new HttpDataSource$HttpDataSourceException("Null location redirect", ZegoConstants.StreamUpdateType.Added);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new HttpDataSource$HttpDataSourceException(p022Oooo00O.o00O00OO.OooO00o("Unsupported protocol redirect: ", protocol), ZegoConstants.StreamUpdateType.Added);
            }
            if (this.f14228OooO0o0 || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new HttpDataSource$HttpDataSourceException("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", ZegoConstants.StreamUpdateType.Added);
        } catch (MalformedURLException e) {
            throw new HttpDataSource$HttpDataSourceException(e, ZegoConstants.StreamUpdateType.Added, 1);
        }
    }

    public final HttpURLConnection OooOOoo(URL url, int i, @Nullable byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) throws IOException {
        Map<String, String> map2;
        String string;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        httpURLConnection.setConnectTimeout(this.f14227OooO0o);
        httpURLConnection.setReadTimeout(this.f14229OooO0oO);
        HashMap map3 = new HashMap();
        o00O00OO o00o00oo2 = this.f14226OooO;
        if (o00o00oo2 != null) {
            map3.putAll(o00o00oo2.OooO00o());
        }
        o00O00OO o00o00oo3 = this.f14231OooOO0;
        synchronized (o00o00oo3) {
            if (o00o00oo3.f40512OooO0O0 == null) {
                o00o00oo3.f40512OooO0O0 = Collections.unmodifiableMap(new HashMap(o00o00oo3.f40511OooO00o));
            }
            map2 = o00o00oo3.f40512OooO0O0;
        }
        map3.putAll(map2);
        map3.putAll(map);
        for (Map.Entry entry : map3.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = o00O00o0.f40513OooO00o;
        if (j == 0 && j2 == -1) {
            string = null;
        } else {
            StringBuilder sbOooO00o = o00O0000.OooO00o("bytes=", j, "-");
            if (j2 != -1) {
                sbOooO00o.append((j + j2) - 1);
            }
            string = sbOooO00o.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        String str2 = this.f14230OooO0oo;
        if (str2 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str2);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        int i2 = DataSpec.f14159OooOO0O;
        if (i == 1) {
            str = "GET";
        } else if (i == 2) {
            str = "POST";
        } else {
            if (i != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        httpURLConnection.setRequestMethod(str);
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

    public final void OooOo0(long j) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int iMin = (int) Math.min(j, 4096);
            InputStream inputStream = this.f14234OooOOO;
            int i = o0O00.f40595OooO00o;
            int i2 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(new InterruptedIOException(), 2000, 1);
            }
            if (i2 == -1) {
                throw new HttpDataSource$HttpDataSourceException();
            }
            j -= (long) i2;
            OooOO0o(i2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final void close() throws HttpDataSource$HttpDataSourceException {
        try {
            InputStream inputStream = this.f14234OooOOO;
            if (inputStream != null) {
                long j = this.f14239OooOOo0;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.f14238OooOOo;
                }
                OooOo00(this.f14235OooOOO0, j2);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    int i = o0O00.f40595OooO00o;
                    throw new HttpDataSource$HttpDataSourceException(e, 2000, 3);
                }
            }
            this.f14234OooOOO = null;
            OooOOOo();
            if (this.f14236OooOOOO) {
                this.f14236OooOOOO = false;
                OooOOO0();
            }
        } catch (Throwable th) {
            this.f14234OooOOO = null;
            OooOOOo();
            if (this.f14236OooOOOO) {
                this.f14236OooOOOO = false;
                OooOOO0();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029 A[Catch: IOException -> 0x0033, TRY_LEAVE, TryCatch #0 {IOException -> 0x0033, blocks: (B:4:0x0004, B:6:0x000d, B:9:0x0017, B:10:0x001d, B:13:0x0029), top: B:18:0x0004 }] */
    @Override // p244o00oo0Oo.o00
    public final int read(byte[] bArr, int i, int i2) throws HttpDataSource$HttpDataSourceException {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.f14239OooOOo0;
            if (j != -1) {
                long j2 = j - this.f14238OooOOo;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                    InputStream inputStream = this.f14234OooOOO;
                    int i4 = o0O00.f40595OooO00o;
                    i3 = inputStream.read(bArr, i, i2);
                    if (i3 != -1) {
                        this.f14238OooOOo += (long) i3;
                        OooOO0o(i3);
                        return i3;
                    }
                }
            } else {
                InputStream inputStream2 = this.f14234OooOOO;
                int i5 = o0O00.f40595OooO00o;
                i3 = inputStream2.read(bArr, i, i2);
                if (i3 != -1) {
                    this.f14238OooOOo += (long) i3;
                    OooOO0o(i3);
                    return i3;
                }
            }
            return -1;
        } catch (IOException e) {
            int i6 = o0O00.f40595OooO00o;
            throw HttpDataSource$HttpDataSourceException.OooO00o(e, 2);
        }
    }
}
