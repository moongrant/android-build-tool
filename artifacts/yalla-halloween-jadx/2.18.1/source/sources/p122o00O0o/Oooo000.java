package p122o00O0o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import p129o00O0oOo.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 implements Closeable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NonNull
    public final HttpURLConnection f30955Oooo0o;

    public Oooo000(@NonNull HttpURLConnection httpURLConnection) {
        this.f30955Oooo0o = httpURLConnection;
    }

    @Nullable
    public final String OooO00o() {
        boolean z = false;
        try {
            if (this.f30955Oooo0o.getResponseCode() / 100 == 2) {
                z = true;
            }
        } catch (IOException unused) {
        }
        if (z) {
            return null;
        }
        try {
            return "Unable to fetch " + this.f30955Oooo0o.getURL() + ". Failed with " + this.f30955Oooo0o.getResponseCode() + "\n" + OooO0O0(this.f30955Oooo0o);
        } catch (IOException e) {
            o000Oo0.OooO0Oo("get error failed ", e);
            return e.getMessage();
        }
    }

    public final String OooO0O0(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb.append(line);
                        sb.append('\n');
                    } else {
                        try {
                            break;
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception e) {
                    throw e;
                }
            } catch (Throwable th) {
                bufferedReader.close();
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (Exception unused2) {
            }
            throw th;
        }
        bufferedReader.close();
        return sb.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f30955Oooo0o.disconnect();
    }
}
