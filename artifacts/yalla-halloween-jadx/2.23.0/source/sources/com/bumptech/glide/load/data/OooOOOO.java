package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import p022Oooo00O.o00O00OO;
import p532o0o0Oo.o00000O;
import p532o0o0Oo.o000OOo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO implements OooO0o<InputStream> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00OO00O.OooOOO0 f9958OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public HttpURLConnection f9959OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f9960OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public InputStream f9961OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public volatile boolean f9962OooO0oo;

    public static class OooO00o {
    }

    static {
        new OooO00o();
    }

    public OooOOOO(o00OO00O.OooOOO0 oooOOO0, int i) {
        this.f9958OooO0Oo = oooOOO0;
        this.f9960OooO0o0 = i;
    }

    public static int OooO0OO(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e);
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    @NonNull
    public final Class<InputStream> OooO00o() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    public final void OooO0O0() {
        InputStream inputStream = this.f9961OooO0oO;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f9959OooO0o;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f9959OooO0o = null;
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    public final void OooO0Oo(@NonNull Priority priority, @NonNull OooO0o.OooO00o<? super InputStream> oooO00o) {
        StringBuilder sb;
        o00OO00O.OooOOO0 oooOOO0 = this.f9958OooO0Oo;
        int i = o00000O.f54564OooO0O0;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            if (oooOOO0.f37106OooO0o == null) {
                oooOOO0.f37106OooO0o = new URL(oooOOO0.OooO0Oo());
            }
            oooO00o.OooO0o0(OooO0o0(oooOOO0.f37106OooO0o, 0, null, oooOOO0.f37103OooO0O0.OooO00o()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder("Finished http url fetcher fetch in ");
                sb.append(o00000O.OooO00o(jElapsedRealtimeNanos));
                String string = sb.toString();
            }
        } catch (IOException e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e);
            }
            oooO00o.OooO0OO(e);
            if (!Log.isLoggable("HttpUrlFetcher", 2)) {
            } else {
                sb = new StringBuilder("Finished http url fetcher fetch in ");
            }
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + o00000O.OooO00o(jElapsedRealtimeNanos));
            }
        }
    }

    public final InputStream OooO0o0(URL url, int i, URL url2, Map<String, String> map) throws HttpException {
        if (i >= 5) {
            throw new HttpException(null, -1, "Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException(null, -1, "In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
            }
            int i2 = this.f9960OooO0o0;
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.f9959OooO0o = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f9961OooO0oO = this.f9959OooO0o.getInputStream();
                if (this.f9962OooO0oo) {
                    return null;
                }
                int iOooO0OO = OooO0OO(this.f9959OooO0o);
                int i3 = iOooO0OO / 100;
                if (i3 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f9959OooO0o;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.f9961OooO0oO = new o000OOo(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.f9961OooO0oO = httpURLConnection2.getInputStream();
                        }
                        return this.f9961OooO0oO;
                    } catch (IOException e) {
                        throw new HttpException(e, OooO0OO(httpURLConnection2), "Failed to obtain InputStream");
                    }
                }
                if (!(i3 == 3)) {
                    if (iOooO0OO == -1) {
                        throw new HttpException(null, iOooO0OO, "Http request failed");
                    }
                    try {
                        throw new HttpException(null, iOooO0OO, this.f9959OooO0o.getResponseMessage());
                    } catch (IOException e2) {
                        throw new HttpException(e2, iOooO0OO, "Failed to get a response message");
                    }
                }
                String headerField = this.f9959OooO0o.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new HttpException(null, iOooO0OO, "Received empty or null redirect url");
                }
                try {
                    URL url3 = new URL(url, headerField);
                    OooO0O0();
                    return OooO0o0(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new HttpException(e3, iOooO0OO, o00O00OO.OooO00o("Bad redirect url: ", headerField));
                }
            } catch (IOException e4) {
                throw new HttpException(e4, OooO0OO(this.f9959OooO0o), "Failed to connect or obtain data");
            }
        } catch (IOException e5) {
            throw new HttpException(e5, 0, "URL.openConnection threw");
        }
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    public final void cancel() {
        this.f9962OooO0oo = true;
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    @NonNull
    public final DataSource getDataSource() {
        return DataSource.REMOTE;
    }
}
