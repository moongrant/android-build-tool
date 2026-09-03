package oo0O;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import o00OOO0.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements Closeable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final HttpURLConnection f60308OooO0Oo;

    public OooO00o(@NonNull HttpURLConnection httpURLConnection) {
        this.f60308OooO0Oo = httpURLConnection;
    }

    public static String OooO0OO(HttpURLConnection httpURLConnection) throws IOException {
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

    @Nullable
    public final String OooO00o() {
        boolean z;
        HttpURLConnection httpURLConnection = this.f60308OooO0Oo;
        try {
            z = httpURLConnection.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
        }
        if (z) {
            return null;
        }
        try {
            return "Unable to fetch " + httpURLConnection.getURL() + ". Failed with " + httpURLConnection.getResponseCode() + "\n" + OooO0OO(httpURLConnection);
        } catch (IOException e) {
            OooOO0.OooO0OO("get error failed ", e);
            return e.getMessage();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f60308OooO0Oo.disconnect();
    }
}
