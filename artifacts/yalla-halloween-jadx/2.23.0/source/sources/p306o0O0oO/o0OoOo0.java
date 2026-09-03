package p306o0O0oO;

import android.os.Build;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import p308o0O0oO0O.o00O0O;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OoOo0 extends HttpsURLConnection {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00Ooo f42469OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HttpsURLConnection f42470OooO0O0;

    public o0OoOo0(HttpsURLConnection httpsURLConnection, Timer timer, o00O0O o00o0o2) {
        super(httpsURLConnection.getURL());
        this.f42470OooO0O0 = httpsURLConnection;
        this.f42469OooO00o = new o00Ooo(httpsURLConnection, timer, o00o0o2);
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        this.f42469OooO00o.f42460OooO00o.addRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public final void connect() throws IOException {
        this.f42469OooO00o.OooO00o();
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        o00Ooo o00ooo2 = this.f42469OooO00o;
        long jOooO00o = o00ooo2.f42464OooO0o0.OooO00o();
        o00O0O o00o0o2 = o00ooo2.f42461OooO0O0;
        o00o0o2.OooOO0(jOooO00o);
        o00o0o2.OooO0O0();
        o00ooo2.f42460OooO00o.disconnect();
    }

    public final boolean equals(Object obj) {
        return this.f42469OooO00o.equals(obj);
    }

    @Override // java.net.URLConnection
    public final boolean getAllowUserInteraction() {
        return this.f42469OooO00o.f42460OooO00o.getAllowUserInteraction();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final String getCipherSuite() {
        return this.f42470OooO0O0.getCipherSuite();
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return this.f42469OooO00o.f42460OooO00o.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public final Object getContent() throws IOException {
        return this.f42469OooO00o.OooO0O0();
    }

    @Override // java.net.URLConnection
    public final String getContentEncoding() {
        o00Ooo o00ooo2 = this.f42469OooO00o;
        o00ooo2.OooO();
        return o00ooo2.f42460OooO00o.getContentEncoding();
    }

    @Override // java.net.URLConnection
    public final int getContentLength() {
        o00Ooo o00ooo2 = this.f42469OooO00o;
        o00ooo2.OooO();
        return o00ooo2.f42460OooO00o.getContentLength();
    }

    @Override // java.net.URLConnection
    public final long getContentLengthLong() {
        o00Ooo o00ooo2 = this.f42469OooO00o;
        o00ooo2.OooO();
        if (Build.VERSION.SDK_INT >= 24) {
            return o00ooo2.f42460OooO00o.getContentLengthLong();
        }
        return 0L;
    }

    @Override // java.net.URLConnection
    public final String getContentType() {
        o00Ooo o00ooo2 = this.f42469OooO00o;
        o00ooo2.OooO();
        return o00ooo2.f42460OooO00o.getContentType();
    }

    @Override // java.net.URLConnection
    public final long getDate() {
        o00Ooo o00ooo2 = this.f42469OooO00o;
        o00ooo2.OooO();
        return o00ooo2.f42460OooO00o.getDate();
    }

    @Override // java.net.URLConnection
    public final boolean getDefaultUseCaches() {
        return this.f42469OooO00o.f42460OooO00o.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public final boolean getDoInput() {
        return this.f42469OooO00o.f42460OooO00o.getDoInput();
    }

    @Override // java.net.URLConnection
    public final boolean getDoOutput() {
        return this.f42469OooO00o.f42460OooO00o.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        return this.f42469OooO00o.OooO0Oo();
    }

    @Override // java.net.URLConnection
    public final long getExpiration() {
        o00Ooo o00ooo2 = this.f42469OooO00o;
        o00ooo2.OooO();
        return o00ooo2.f42460OooO00o.getExpiration();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        o00Ooo o00ooo2 = this.f42469OooO00o;
        o00ooo2.OooO();
        return o00ooo2.f42460OooO00o.getHeaderField(i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final long getHeaderFieldDate(String str, long j) {
        o00Ooo o00ooo2 = this.f42469OooO00o;
        o00ooo2.OooO();
        return o00ooo2.f42460OooO00o.getHeaderFieldDate(str, j);
    }

    @Override // java.net.URLConnection
    public final int getHeaderFieldInt(String str, int i) {
        o00Ooo o00ooo2 = this.f42469OooO00o;
        o00ooo2.OooO();
        return o00ooo2.f42460OooO00o.getHeaderFieldInt(str, i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i) {
        o00Ooo o00ooo2 = this.f42469OooO00o;
        o00ooo2.OooO();
        return o00ooo2.f42460OooO00o.getHeaderFieldKey(i);
    }

    @Override // java.net.URLConnection
    public final long getHeaderFieldLong(String str, long j) {
        o00Ooo o00ooo2 = this.f42469OooO00o;
        o00ooo2.OooO();
        if (Build.VERSION.SDK_INT >= 24) {
            return o00ooo2.f42460OooO00o.getHeaderFieldLong(str, j);
        }
        return 0L;
    }

    @Override // java.net.URLConnection
    public final Map<String, List<String>> getHeaderFields() {
        o00Ooo o00ooo2 = this.f42469OooO00o;
        o00ooo2.OooO();
        return o00ooo2.f42460OooO00o.getHeaderFields();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final HostnameVerifier getHostnameVerifier() {
        return this.f42470OooO0O0.getHostnameVerifier();
    }

    @Override // java.net.URLConnection
    public final long getIfModifiedSince() {
        return this.f42469OooO00o.f42460OooO00o.getIfModifiedSince();
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() throws IOException {
        return this.f42469OooO00o.OooO0o0();
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return this.f42469OooO00o.f42460OooO00o.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public final long getLastModified() {
        o00Ooo o00ooo2 = this.f42469OooO00o;
        o00ooo2.OooO();
        return o00ooo2.f42460OooO00o.getLastModified();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Certificate[] getLocalCertificates() {
        return this.f42470OooO0O0.getLocalCertificates();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Principal getLocalPrincipal() {
        return this.f42470OooO0O0.getLocalPrincipal();
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() throws IOException {
        return this.f42469OooO00o.OooO0o();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
        return this.f42470OooO0O0.getPeerPrincipal();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() throws IOException {
        o00Ooo o00ooo2 = this.f42469OooO00o;
        o00ooo2.getClass();
        try {
            return o00ooo2.f42460OooO00o.getPermission();
        } catch (IOException e) {
            long jOooO00o = o00ooo2.f42464OooO0o0.OooO00o();
            o00O0O o00o0o2 = o00ooo2.f42461OooO0O0;
            o00o0o2.OooOO0(jOooO00o);
            o0ooOOo.OooO0OO(o00o0o2);
            throw e;
        }
    }

    @Override // java.net.URLConnection
    public final int getReadTimeout() {
        return this.f42469OooO00o.f42460OooO00o.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public final String getRequestMethod() {
        return this.f42469OooO00o.f42460OooO00o.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public final Map<String, List<String>> getRequestProperties() {
        return this.f42469OooO00o.f42460OooO00o.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        return this.f42469OooO00o.f42460OooO00o.getRequestProperty(str);
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() throws IOException {
        return this.f42469OooO00o.OooO0oO();
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() throws IOException {
        return this.f42469OooO00o.OooO0oo();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final SSLSocketFactory getSSLSocketFactory() {
        return this.f42470OooO0O0.getSSLSocketFactory();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Certificate[] getServerCertificates() throws SSLPeerUnverifiedException {
        return this.f42470OooO0O0.getServerCertificates();
    }

    @Override // java.net.URLConnection
    public final URL getURL() {
        return this.f42469OooO00o.f42460OooO00o.getURL();
    }

    @Override // java.net.URLConnection
    public final boolean getUseCaches() {
        return this.f42469OooO00o.f42460OooO00o.getUseCaches();
    }

    public final int hashCode() {
        return this.f42469OooO00o.hashCode();
    }

    @Override // java.net.URLConnection
    public final void setAllowUserInteraction(boolean z) {
        this.f42469OooO00o.f42460OooO00o.setAllowUserInteraction(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setChunkedStreamingMode(int i) {
        this.f42469OooO00o.f42460OooO00o.setChunkedStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i) {
        this.f42469OooO00o.f42460OooO00o.setConnectTimeout(i);
    }

    @Override // java.net.URLConnection
    public final void setDefaultUseCaches(boolean z) {
        this.f42469OooO00o.f42460OooO00o.setDefaultUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final void setDoInput(boolean z) {
        this.f42469OooO00o.f42460OooO00o.setDoInput(z);
    }

    @Override // java.net.URLConnection
    public final void setDoOutput(boolean z) {
        this.f42469OooO00o.f42460OooO00o.setDoOutput(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i) {
        this.f42469OooO00o.f42460OooO00o.setFixedLengthStreamingMode(i);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f42470OooO0O0.setHostnameVerifier(hostnameVerifier);
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j) {
        this.f42469OooO00o.f42460OooO00o.setIfModifiedSince(j);
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z) {
        this.f42469OooO00o.f42460OooO00o.setInstanceFollowRedirects(z);
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i) {
        this.f42469OooO00o.f42460OooO00o.setReadTimeout(i);
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) throws ProtocolException {
        this.f42469OooO00o.f42460OooO00o.setRequestMethod(str);
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        o00Ooo o00ooo2 = this.f42469OooO00o;
        o00ooo2.getClass();
        if ("User-Agent".equalsIgnoreCase(str)) {
            o00ooo2.f42461OooO0O0.f42482OooO = str2;
        }
        o00ooo2.f42460OooO00o.setRequestProperty(str, str2);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f42470OooO0O0.setSSLSocketFactory(sSLSocketFactory);
    }

    @Override // java.net.URLConnection
    public final void setUseCaches(boolean z) {
        this.f42469OooO00o.f42460OooO00o.setUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final String toString() {
        return this.f42469OooO00o.toString();
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return this.f42469OooO00o.f42460OooO00o.usingProxy();
    }

    @Override // java.net.URLConnection
    public final Object getContent(Class[] clsArr) throws IOException {
        return this.f42469OooO00o.OooO0OO(clsArr);
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        o00Ooo o00ooo2 = this.f42469OooO00o;
        o00ooo2.OooO();
        return o00ooo2.f42460OooO00o.getHeaderField(str);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j) {
        this.f42469OooO00o.f42460OooO00o.setFixedLengthStreamingMode(j);
    }
}
