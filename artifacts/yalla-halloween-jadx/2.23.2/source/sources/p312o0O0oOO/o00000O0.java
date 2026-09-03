package p312o0O0oOO;

import androidx.compose.animation.OooOOO;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import p308o0O0oO.OooO;
import p311o0O0oO0o.o0O0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000O0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final o0O0O00 f41832OooO0o = o0O0O00.OooO0Oo();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HttpURLConnection f41833OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO f41834OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f41835OooO0OO = -1;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f41836OooO0Oo = -1;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Timer f41837OooO0o0;

    public o00000O0(HttpURLConnection httpURLConnection, Timer timer, OooO oooO) {
        this.f41833OooO00o = httpURLConnection;
        this.f41834OooO0O0 = oooO;
        this.f41837OooO0o0 = timer;
        oooO.OooOO0O(httpURLConnection.getURL().toString());
    }

    public final void OooO() {
        long j = this.f41835OooO0OO;
        OooO oooO = this.f41834OooO0O0;
        if (j == -1) {
            Timer timer = this.f41837OooO0o0;
            timer.OooO0OO();
            long j2 = timer.f20004OooO0Oo;
            this.f41835OooO0OO = j2;
            oooO.OooO0oO(j2);
        }
        HttpURLConnection httpURLConnection = this.f41833OooO00o;
        String requestMethod = httpURLConnection.getRequestMethod();
        if (requestMethod != null) {
            oooO.OooO0Oo(requestMethod);
        } else if (httpURLConnection.getDoOutput()) {
            oooO.OooO0Oo("POST");
        } else {
            oooO.OooO0Oo("GET");
        }
    }

    public final void OooO00o() throws IOException {
        long j = this.f41835OooO0OO;
        OooO oooO = this.f41834OooO0O0;
        Timer timer = this.f41837OooO0o0;
        if (j == -1) {
            timer.OooO0OO();
            long j2 = timer.f20004OooO0Oo;
            this.f41835OooO0OO = j2;
            oooO.OooO0oO(j2);
        }
        try {
            this.f41833OooO00o.connect();
        } catch (IOException e) {
            OooOOO.OooO00o(timer, oooO, oooO);
            throw e;
        }
    }

    public final Object OooO0O0() throws IOException {
        Timer timer = this.f41837OooO0o0;
        OooO();
        HttpURLConnection httpURLConnection = this.f41833OooO00o;
        int responseCode = httpURLConnection.getResponseCode();
        OooO oooO = this.f41834OooO0O0;
        oooO.OooO0o0(responseCode);
        try {
            Object content = httpURLConnection.getContent();
            if (content instanceof InputStream) {
                oooO.OooO0oo(httpURLConnection.getContentType());
                return new oo0o0Oo((InputStream) content, oooO, timer);
            }
            oooO.OooO0oo(httpURLConnection.getContentType());
            oooO.OooO(httpURLConnection.getContentLength());
            oooO.OooOO0(timer.OooO00o());
            oooO.OooO0O0();
            return content;
        } catch (IOException e) {
            OooOOO.OooO00o(timer, oooO, oooO);
            throw e;
        }
    }

    public final Object OooO0OO(Class[] clsArr) throws IOException {
        Timer timer = this.f41837OooO0o0;
        OooO();
        HttpURLConnection httpURLConnection = this.f41833OooO00o;
        int responseCode = httpURLConnection.getResponseCode();
        OooO oooO = this.f41834OooO0O0;
        oooO.OooO0o0(responseCode);
        try {
            Object content = httpURLConnection.getContent(clsArr);
            if (content instanceof InputStream) {
                oooO.OooO0oo(httpURLConnection.getContentType());
                return new oo0o0Oo((InputStream) content, oooO, timer);
            }
            oooO.OooO0oo(httpURLConnection.getContentType());
            oooO.OooO(httpURLConnection.getContentLength());
            oooO.OooOO0(timer.OooO00o());
            oooO.OooO0O0();
            return content;
        } catch (IOException e) {
            OooOOO.OooO00o(timer, oooO, oooO);
            throw e;
        }
    }

    public final InputStream OooO0Oo() {
        HttpURLConnection httpURLConnection = this.f41833OooO00o;
        OooO oooO = this.f41834OooO0O0;
        OooO();
        try {
            oooO.OooO0o0(httpURLConnection.getResponseCode());
        } catch (IOException unused) {
            f41832OooO0o.OooO00o("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = httpURLConnection.getErrorStream();
        return errorStream != null ? new oo0o0Oo(errorStream, oooO, this.f41837OooO0o0) : errorStream;
    }

    public final OutputStream OooO0o() throws IOException {
        Timer timer = this.f41837OooO0o0;
        OooO oooO = this.f41834OooO0O0;
        try {
            OutputStream outputStream = this.f41833OooO00o.getOutputStream();
            return outputStream != null ? new o0O0O00(outputStream, oooO, timer) : outputStream;
        } catch (IOException e) {
            OooOOO.OooO00o(timer, oooO, oooO);
            throw e;
        }
    }

    public final InputStream OooO0o0() throws IOException {
        Timer timer = this.f41837OooO0o0;
        OooO();
        HttpURLConnection httpURLConnection = this.f41833OooO00o;
        int responseCode = httpURLConnection.getResponseCode();
        OooO oooO = this.f41834OooO0O0;
        oooO.OooO0o0(responseCode);
        oooO.OooO0oo(httpURLConnection.getContentType());
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            return inputStream != null ? new oo0o0Oo(inputStream, oooO, timer) : inputStream;
        } catch (IOException e) {
            OooOOO.OooO00o(timer, oooO, oooO);
            throw e;
        }
    }

    public final int OooO0oO() throws IOException {
        OooO();
        long j = this.f41836OooO0Oo;
        Timer timer = this.f41837OooO0o0;
        OooO oooO = this.f41834OooO0O0;
        if (j == -1) {
            long jOooO00o = timer.OooO00o();
            this.f41836OooO0Oo = jOooO00o;
            oooO.f41775OooO0oO.OooOOo(jOooO00o);
        }
        try {
            int responseCode = this.f41833OooO00o.getResponseCode();
            oooO.OooO0o0(responseCode);
            return responseCode;
        } catch (IOException e) {
            OooOOO.OooO00o(timer, oooO, oooO);
            throw e;
        }
    }

    public final String OooO0oo() throws IOException {
        HttpURLConnection httpURLConnection = this.f41833OooO00o;
        OooO();
        long j = this.f41836OooO0Oo;
        Timer timer = this.f41837OooO0o0;
        OooO oooO = this.f41834OooO0O0;
        if (j == -1) {
            long jOooO00o = timer.OooO00o();
            this.f41836OooO0Oo = jOooO00o;
            oooO.f41775OooO0oO.OooOOo(jOooO00o);
        }
        try {
            String responseMessage = httpURLConnection.getResponseMessage();
            oooO.OooO0o0(httpURLConnection.getResponseCode());
            return responseMessage;
        } catch (IOException e) {
            OooOOO.OooO00o(timer, oooO, oooO);
            throw e;
        }
    }

    public final boolean equals(Object obj) {
        return this.f41833OooO00o.equals(obj);
    }

    public final int hashCode() {
        return this.f41833OooO00o.hashCode();
    }

    public final String toString() {
        return this.f41833OooO00o.toString();
    }
}
