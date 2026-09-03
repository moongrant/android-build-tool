package p306o0O0oO;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import p307o0O0oO0.OooOOO0;
import p308o0O0oO0O.o00O0O;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final OooOOO0 f42459OooO0o = OooOOO0.OooO0Oo();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HttpURLConnection f42460OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00O0O f42461OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f42462OooO0OO = -1;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f42463OooO0Oo = -1;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Timer f42464OooO0o0;

    public o00Ooo(HttpURLConnection httpURLConnection, Timer timer, o00O0O o00o0o2) {
        this.f42460OooO00o = httpURLConnection;
        this.f42461OooO0O0 = o00o0o2;
        this.f42464OooO0o0 = timer;
        o00o0o2.OooOO0O(httpURLConnection.getURL().toString());
    }

    public final void OooO() {
        long j = this.f42462OooO0OO;
        o00O0O o00o0o2 = this.f42461OooO0O0;
        if (j == -1) {
            Timer timer = this.f42464OooO0o0;
            timer.OooO0OO();
            long j2 = timer.f20477OooO0Oo;
            this.f42462OooO0OO = j2;
            o00o0o2.OooO0oO(j2);
        }
        HttpURLConnection httpURLConnection = this.f42460OooO00o;
        String requestMethod = httpURLConnection.getRequestMethod();
        if (requestMethod != null) {
            o00o0o2.OooO0Oo(requestMethod);
        } else if (httpURLConnection.getDoOutput()) {
            o00o0o2.OooO0Oo("POST");
        } else {
            o00o0o2.OooO0Oo("GET");
        }
    }

    public final void OooO00o() throws IOException {
        long j = this.f42462OooO0OO;
        o00O0O o00o0o2 = this.f42461OooO0O0;
        Timer timer = this.f42464OooO0o0;
        if (j == -1) {
            timer.OooO0OO();
            long j2 = timer.f20477OooO0Oo;
            this.f42462OooO0OO = j2;
            o00o0o2.OooO0oO(j2);
        }
        try {
            this.f42460OooO00o.connect();
        } catch (IOException e) {
            OooOo.OooO00o(timer, o00o0o2, o00o0o2);
            throw e;
        }
    }

    public final Object OooO0O0() throws IOException {
        Timer timer = this.f42464OooO0o0;
        OooO();
        HttpURLConnection httpURLConnection = this.f42460OooO00o;
        int responseCode = httpURLConnection.getResponseCode();
        o00O0O o00o0o2 = this.f42461OooO0O0;
        o00o0o2.OooO0o0(responseCode);
        try {
            Object content = httpURLConnection.getContent();
            if (content instanceof InputStream) {
                o00o0o2.OooO0oo(httpURLConnection.getContentType());
                return new Oooo000((InputStream) content, o00o0o2, timer);
            }
            o00o0o2.OooO0oo(httpURLConnection.getContentType());
            o00o0o2.OooO(httpURLConnection.getContentLength());
            o00o0o2.OooOO0(timer.OooO00o());
            o00o0o2.OooO0O0();
            return content;
        } catch (IOException e) {
            OooOo.OooO00o(timer, o00o0o2, o00o0o2);
            throw e;
        }
    }

    public final Object OooO0OO(Class[] clsArr) throws IOException {
        Timer timer = this.f42464OooO0o0;
        OooO();
        HttpURLConnection httpURLConnection = this.f42460OooO00o;
        int responseCode = httpURLConnection.getResponseCode();
        o00O0O o00o0o2 = this.f42461OooO0O0;
        o00o0o2.OooO0o0(responseCode);
        try {
            Object content = httpURLConnection.getContent(clsArr);
            if (content instanceof InputStream) {
                o00o0o2.OooO0oo(httpURLConnection.getContentType());
                return new Oooo000((InputStream) content, o00o0o2, timer);
            }
            o00o0o2.OooO0oo(httpURLConnection.getContentType());
            o00o0o2.OooO(httpURLConnection.getContentLength());
            o00o0o2.OooOO0(timer.OooO00o());
            o00o0o2.OooO0O0();
            return content;
        } catch (IOException e) {
            OooOo.OooO00o(timer, o00o0o2, o00o0o2);
            throw e;
        }
    }

    public final InputStream OooO0Oo() {
        HttpURLConnection httpURLConnection = this.f42460OooO00o;
        o00O0O o00o0o2 = this.f42461OooO0O0;
        OooO();
        try {
            o00o0o2.OooO0o0(httpURLConnection.getResponseCode());
        } catch (IOException unused) {
            f42459OooO0o.OooO00o("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = httpURLConnection.getErrorStream();
        return errorStream != null ? new Oooo000(errorStream, o00o0o2, this.f42464OooO0o0) : errorStream;
    }

    public final OutputStream OooO0o() throws IOException {
        Timer timer = this.f42464OooO0o0;
        o00O0O o00o0o2 = this.f42461OooO0O0;
        try {
            OutputStream outputStream = this.f42460OooO00o.getOutputStream();
            return outputStream != null ? new Oooo0(outputStream, o00o0o2, timer) : outputStream;
        } catch (IOException e) {
            OooOo.OooO00o(timer, o00o0o2, o00o0o2);
            throw e;
        }
    }

    public final InputStream OooO0o0() throws IOException {
        Timer timer = this.f42464OooO0o0;
        OooO();
        HttpURLConnection httpURLConnection = this.f42460OooO00o;
        int responseCode = httpURLConnection.getResponseCode();
        o00O0O o00o0o2 = this.f42461OooO0O0;
        o00o0o2.OooO0o0(responseCode);
        o00o0o2.OooO0oo(httpURLConnection.getContentType());
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            return inputStream != null ? new Oooo000(inputStream, o00o0o2, timer) : inputStream;
        } catch (IOException e) {
            OooOo.OooO00o(timer, o00o0o2, o00o0o2);
            throw e;
        }
    }

    public final int OooO0oO() throws IOException {
        OooO();
        long j = this.f42463OooO0Oo;
        Timer timer = this.f42464OooO0o0;
        o00O0O o00o0o2 = this.f42461OooO0O0;
        if (j == -1) {
            long jOooO00o = timer.OooO00o();
            this.f42463OooO0Oo = jOooO00o;
            o00o0o2.f42486OooO0oO.OooOOoo(jOooO00o);
        }
        try {
            int responseCode = this.f42460OooO00o.getResponseCode();
            o00o0o2.OooO0o0(responseCode);
            return responseCode;
        } catch (IOException e) {
            OooOo.OooO00o(timer, o00o0o2, o00o0o2);
            throw e;
        }
    }

    public final String OooO0oo() throws IOException {
        HttpURLConnection httpURLConnection = this.f42460OooO00o;
        OooO();
        long j = this.f42463OooO0Oo;
        Timer timer = this.f42464OooO0o0;
        o00O0O o00o0o2 = this.f42461OooO0O0;
        if (j == -1) {
            long jOooO00o = timer.OooO00o();
            this.f42463OooO0Oo = jOooO00o;
            o00o0o2.f42486OooO0oO.OooOOoo(jOooO00o);
        }
        try {
            String responseMessage = httpURLConnection.getResponseMessage();
            o00o0o2.OooO0o0(httpURLConnection.getResponseCode());
            return responseMessage;
        } catch (IOException e) {
            OooOo.OooO00o(timer, o00o0o2, o00o0o2);
            throw e;
        }
    }

    public final boolean equals(Object obj) {
        return this.f42460OooO00o.equals(obj);
    }

    public final int hashCode() {
        return this.f42460OooO00o.hashCode();
    }

    public final String toString() {
        return this.f42460OooO00o.toString();
    }
}
