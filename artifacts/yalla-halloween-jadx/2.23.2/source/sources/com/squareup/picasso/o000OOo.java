package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import android.net.http.HttpResponseCache;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OOo implements Downloader {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static volatile HttpResponseCache f21301OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Object f21302OooO0OO = new Object();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO00o f21303OooO0Oo = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f21304OooO00o;

    public static class OooO00o extends ThreadLocal<StringBuilder> {
        @Override // java.lang.ThreadLocal
        public final StringBuilder initialValue() {
            return new StringBuilder();
        }
    }

    public o000OOo(Context context) {
        this.f21304OooO00o = context.getApplicationContext();
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00f4  */
    @Override // com.squareup.picasso.Downloader
    public final Downloader.OooO00o OooO00o(Uri uri, int i) throws IOException {
        String string;
        Context context = this.f21304OooO00o;
        if (f21301OooO0O0 == null) {
            try {
                synchronized (f21302OooO0OO) {
                    if (f21301OooO0O0 == null) {
                        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        HttpResponseCache installed = HttpResponseCache.getInstalled();
                        if (installed == null) {
                            installed = HttpResponseCache.install(file, o000000O.OooO00o(file));
                        }
                        f21301OooO0O0 = installed;
                    }
                }
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(uri.toString()).openConnection()));
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(20000);
        boolean z = true;
        httpURLConnection.setUseCaches(true);
        if (i != 0) {
            if ((NetworkPolicy.OFFLINE.index & i) != 0) {
                string = "only-if-cached,max-age=2147483647";
            } else {
                StringBuilder sb = f21303OooO0Oo.get();
                sb.setLength(0);
                if (!((NetworkPolicy.NO_CACHE.index & i) == 0)) {
                    sb.append("no-cache");
                }
                if (!((NetworkPolicy.NO_STORE.index & i) == 0)) {
                    if (sb.length() > 0) {
                        sb.append(',');
                    }
                    sb.append("no-store");
                }
                string = sb.toString();
            }
            httpURLConnection.setRequestProperty("Cache-Control", string);
        }
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode >= 300) {
            httpURLConnection.disconnect();
            throw new Downloader.ResponseException(responseCode + ZegoConstants.ZegoVideoDataAuxPublishingStream + httpURLConnection.getResponseMessage(), i, responseCode);
        }
        long headerFieldInt = httpURLConnection.getHeaderFieldInt("Content-Length", -1);
        String headerField = httpURLConnection.getHeaderField("X-Android-Response-Source");
        if (headerField == null) {
            z = false;
        } else {
            String[] strArrSplit = headerField.split(ZegoConstants.ZegoVideoDataAuxPublishingStream, 2);
            if (!"CACHE".equals(strArrSplit[0])) {
                if (strArrSplit.length == 1) {
                    z = false;
                } else {
                    try {
                        if (!"CONDITIONAL_CACHE".equals(strArrSplit[0]) || Integer.parseInt(strArrSplit[1]) != 304) {
                            z = false;
                        }
                    } catch (NumberFormatException unused2) {
                    }
                }
            }
        }
        return new Downloader.OooO00o(headerFieldInt, httpURLConnection.getInputStream(), z);
    }
}
