package p312o0O0oOO;

import android.os.Build;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;
import p308o0O0oO.OooO;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OOo extends HttpURLConnection {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00000O0 f41843OooO00o;

    public o000OOo(HttpURLConnection httpURLConnection, Timer timer, OooO oooO) {
        super(httpURLConnection.getURL());
        this.f41843OooO00o = new o00000O0(httpURLConnection, timer, oooO);
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        this.f41843OooO00o.f41833OooO00o.addRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public final void connect() throws IOException {
        this.f41843OooO00o.OooO00o();
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        o00000O0 o00000o1 = this.f41843OooO00o;
        long jOooO00o = o00000o1.f41837OooO0o0.OooO00o();
        OooO oooO = o00000o1.f41834OooO0O0;
        oooO.OooOO0(jOooO00o);
        oooO.OooO0O0();
        o00000o1.f41833OooO00o.disconnect();
    }

    public final boolean equals(Object obj) {
        return this.f41843OooO00o.equals(obj);
    }

    @Override // java.net.URLConnection
    public final boolean getAllowUserInteraction() {
        return this.f41843OooO00o.f41833OooO00o.getAllowUserInteraction();
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return this.f41843OooO00o.f41833OooO00o.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public final Object getContent() throws IOException {
        return this.f41843OooO00o.OooO0O0();
    }

    @Override // java.net.URLConnection
    public final String getContentEncoding() {
        o00000O0 o00000o1 = this.f41843OooO00o;
        o00000o1.OooO();
        return o00000o1.f41833OooO00o.getContentEncoding();
    }

    @Override // java.net.URLConnection
    public final int getContentLength() {
        o00000O0 o00000o1 = this.f41843OooO00o;
        o00000o1.OooO();
        return o00000o1.f41833OooO00o.getContentLength();
    }

    @Override // java.net.URLConnection
    public final long getContentLengthLong() {
        o00000O0 o00000o1 = this.f41843OooO00o;
        o00000o1.OooO();
        if (Build.VERSION.SDK_INT >= 24) {
            return o00000o1.f41833OooO00o.getContentLengthLong();
        }
        return 0L;
    }

    @Override // java.net.URLConnection
    public final String getContentType() {
        o00000O0 o00000o1 = this.f41843OooO00o;
        o00000o1.OooO();
        return o00000o1.f41833OooO00o.getContentType();
    }

    @Override // java.net.URLConnection
    public final long getDate() {
        o00000O0 o00000o1 = this.f41843OooO00o;
        o00000o1.OooO();
        return o00000o1.f41833OooO00o.getDate();
    }

    @Override // java.net.URLConnection
    public final boolean getDefaultUseCaches() {
        return this.f41843OooO00o.f41833OooO00o.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public final boolean getDoInput() {
        return this.f41843OooO00o.f41833OooO00o.getDoInput();
    }

    @Override // java.net.URLConnection
    public final boolean getDoOutput() {
        return this.f41843OooO00o.f41833OooO00o.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        return this.f41843OooO00o.OooO0Oo();
    }

    @Override // java.net.URLConnection
    public final long getExpiration() {
        o00000O0 o00000o1 = this.f41843OooO00o;
        o00000o1.OooO();
        return o00000o1.f41833OooO00o.getExpiration();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        o00000O0 o00000o1 = this.f41843OooO00o;
        o00000o1.OooO();
        return o00000o1.f41833OooO00o.getHeaderField(i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final long getHeaderFieldDate(String str, long j) {
        o00000O0 o00000o1 = this.f41843OooO00o;
        o00000o1.OooO();
        return o00000o1.f41833OooO00o.getHeaderFieldDate(str, j);
    }

    @Override // java.net.URLConnection
    public final int getHeaderFieldInt(String str, int i) {
        o00000O0 o00000o1 = this.f41843OooO00o;
        o00000o1.OooO();
        return o00000o1.f41833OooO00o.getHeaderFieldInt(str, i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i) {
        o00000O0 o00000o1 = this.f41843OooO00o;
        o00000o1.OooO();
        return o00000o1.f41833OooO00o.getHeaderFieldKey(i);
    }

    @Override // java.net.URLConnection
    public final long getHeaderFieldLong(String str, long j) {
        o00000O0 o00000o1 = this.f41843OooO00o;
        o00000o1.OooO();
        if (Build.VERSION.SDK_INT >= 24) {
            return o00000o1.f41833OooO00o.getHeaderFieldLong(str, j);
        }
        return 0L;
    }

    @Override // java.net.URLConnection
    public final Map<String, List<String>> getHeaderFields() {
        o00000O0 o00000o1 = this.f41843OooO00o;
        o00000o1.OooO();
        return o00000o1.f41833OooO00o.getHeaderFields();
    }

    @Override // java.net.URLConnection
    public final long getIfModifiedSince() {
        return this.f41843OooO00o.f41833OooO00o.getIfModifiedSince();
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() throws IOException {
        return this.f41843OooO00o.OooO0o0();
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return this.f41843OooO00o.f41833OooO00o.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public final long getLastModified() {
        o00000O0 o00000o1 = this.f41843OooO00o;
        o00000o1.OooO();
        return o00000o1.f41833OooO00o.getLastModified();
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() throws IOException {
        return this.f41843OooO00o.OooO0o();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() throws IOException {
        o00000O0 o00000o1 = this.f41843OooO00o;
        o00000o1.getClass();
        try {
            return o00000o1.f41833OooO00o.getPermission();
        } catch (IOException e) {
            long jOooO00o = o00000o1.f41837OooO0o0.OooO00o();
            OooO oooO = o00000o1.f41834OooO0O0;
            oooO.OooOO0(jOooO00o);
            o0000Ooo.OooO0OO(oooO);
            throw e;
        }
    }

    @Override // java.net.URLConnection
    public final int getReadTimeout() {
        return this.f41843OooO00o.f41833OooO00o.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public final String getRequestMethod() {
        return this.f41843OooO00o.f41833OooO00o.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public final Map<String, List<String>> getRequestProperties() {
        return this.f41843OooO00o.f41833OooO00o.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        return this.f41843OooO00o.f41833OooO00o.getRequestProperty(str);
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() throws IOException {
        return this.f41843OooO00o.OooO0oO();
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() throws IOException {
        return this.f41843OooO00o.OooO0oo();
    }

    @Override // java.net.URLConnection
    public final URL getURL() {
        return this.f41843OooO00o.f41833OooO00o.getURL();
    }

    @Override // java.net.URLConnection
    public final boolean getUseCaches() {
        return this.f41843OooO00o.f41833OooO00o.getUseCaches();
    }

    public final int hashCode() {
        return this.f41843OooO00o.hashCode();
    }

    @Override // java.net.URLConnection
    public final void setAllowUserInteraction(boolean z) {
        this.f41843OooO00o.f41833OooO00o.setAllowUserInteraction(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setChunkedStreamingMode(int i) {
        this.f41843OooO00o.f41833OooO00o.setChunkedStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i) {
        this.f41843OooO00o.f41833OooO00o.setConnectTimeout(i);
    }

    @Override // java.net.URLConnection
    public final void setDefaultUseCaches(boolean z) {
        this.f41843OooO00o.f41833OooO00o.setDefaultUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final void setDoInput(boolean z) {
        this.f41843OooO00o.f41833OooO00o.setDoInput(z);
    }

    @Override // java.net.URLConnection
    public final void setDoOutput(boolean z) {
        this.f41843OooO00o.f41833OooO00o.setDoOutput(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i) {
        this.f41843OooO00o.f41833OooO00o.setFixedLengthStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j) {
        this.f41843OooO00o.f41833OooO00o.setIfModifiedSince(j);
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z) {
        this.f41843OooO00o.f41833OooO00o.setInstanceFollowRedirects(z);
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i) {
        this.f41843OooO00o.f41833OooO00o.setReadTimeout(i);
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) throws ProtocolException {
        this.f41843OooO00o.f41833OooO00o.setRequestMethod(str);
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        o00000O0 o00000o1 = this.f41843OooO00o;
        o00000o1.getClass();
        if ("User-Agent".equalsIgnoreCase(str)) {
            o00000o1.f41834OooO0O0.f41771OooO = str2;
        }
        o00000o1.f41833OooO00o.setRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public final void setUseCaches(boolean z) {
        this.f41843OooO00o.f41833OooO00o.setUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final String toString() {
        return this.f41843OooO00o.toString();
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return this.f41843OooO00o.f41833OooO00o.usingProxy();
    }

    @Override // java.net.URLConnection
    public final Object getContent(Class[] clsArr) throws IOException {
        return this.f41843OooO00o.OooO0OO(clsArr);
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        o00000O0 o00000o1 = this.f41843OooO00o;
        o00000o1.OooO();
        return o00000o1.f41833OooO00o.getHeaderField(str);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j) {
        this.f41843OooO00o.f41833OooO00o.setFixedLengthStreamingMode(j);
    }
}
