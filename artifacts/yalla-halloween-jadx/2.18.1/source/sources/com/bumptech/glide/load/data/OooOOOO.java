package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import p221o00oOO.o0Oo0oo;
import p243o00oo00O.o0000O00;
import p243o00oo00O.o0000O0O;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO implements OooO0o<InputStream> {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @VisibleForTesting
    public static final OooO00o f12478OoooO0 = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public InputStream f12479Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final o0Oo0oo f12480Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f12481Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public HttpURLConnection f12482Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public volatile boolean f12483OoooO00;

    public static class OooO00o {
    }

    public OooOOOO(o0Oo0oo o0oo0oo2, int i) {
        this.f12480Oooo0o = o0oo0oo2;
        this.f12481Oooo0oO = i;
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
        InputStream inputStream = this.f12479Oooo;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f12482Oooo0oo;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f12482Oooo0oo = null;
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    @NonNull
    public final DataSource OooO0Oo() {
        return DataSource.REMOTE;
    }

    public final InputStream OooO0o(URL url, int i, URL url2, Map<String, String> map) throws HttpException {
        if (i >= 5) {
            throw new HttpException("Too many (> 5) redirects!", -1, null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException("In re-direct loop", -1, null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnection.setConnectTimeout(this.f12481Oooo0oO);
            httpURLConnection.setReadTimeout(this.f12481Oooo0oO);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.f12482Oooo0oo = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f12479Oooo = this.f12482Oooo0oo.getInputStream();
                if (this.f12483OoooO00) {
                    return null;
                }
                int iOooO0OO = OooO0OO(this.f12482Oooo0oo);
                int i2 = iOooO0OO / 100;
                if (i2 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f12482Oooo0oo;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.f12479Oooo = new o0000O00(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.f12479Oooo = httpURLConnection2.getInputStream();
                        }
                        return this.f12479Oooo;
                    } catch (IOException e) {
                        throw new HttpException("Failed to obtain InputStream", OooO0OO(httpURLConnection2), e);
                    }
                }
                if (!(i2 == 3)) {
                    if (iOooO0OO == -1) {
                        throw new HttpException("Http request failed", iOooO0OO, null);
                    }
                    try {
                        throw new HttpException(this.f12482Oooo0oo.getResponseMessage(), iOooO0OO, null);
                    } catch (IOException e2) {
                        throw new HttpException("Failed to get a response message", iOooO0OO, e2);
                    }
                }
                String headerField = this.f12482Oooo0oo.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new HttpException("Received empty or null redirect url", iOooO0OO, null);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    OooO0O0();
                    return OooO0o(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new HttpException(p016OooOoO0.OooOo00.OooO0Oo("Bad redirect url: ", headerField), iOooO0OO, e3);
                }
            } catch (IOException e4) {
                throw new HttpException("Failed to connect or obtain data", OooO0OO(this.f12482Oooo0oo), e4);
            }
        } catch (IOException e5) {
            throw new HttpException("URL.openConnection threw", 0, e5);
        }
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    public final void OooO0o0(@NonNull Priority priority, @NonNull OooO0o.OooO00o<? super InputStream> oooO00o) {
        StringBuilder sb;
        int i = o0000O0O.f34164OooO0O0;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            o0Oo0oo o0oo0oo2 = this.f12480Oooo0o;
            if (o0oo0oo2.f33757OooO0o == null) {
                o0oo0oo2.f33757OooO0o = new URL(o0oo0oo2.OooO0Oo());
            }
            oooO00o.OooO0o(OooO0o(o0oo0oo2.f33757OooO0o, 0, null, this.f12480Oooo0o.f33754OooO0O0.OooO00o()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(o0000O0O.OooO00o(jElapsedRealtimeNanos));
                String string = sb.toString();
            }
        } catch (IOException e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e);
            }
            oooO00o.OooO0OO(e);
            if (!Log.isLoggable("HttpUrlFetcher", 2)) {
            } else {
                sb = new StringBuilder();
            }
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Finished http url fetcher fetch in ");
                sbOooO0o0.append(o0000O0O.OooO00o(jElapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", sbOooO0o0.toString());
            }
        }
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    public final void cancel() {
        this.f12483OoooO00 = true;
    }
}
