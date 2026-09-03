package p122o00O0o;

import androidx.annotation.NonNull;
import com.qiniu.android.http.request.Request;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 {
    @NonNull
    public final Oooo000 OooO00o(@NonNull String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(Request.HttpMethodGet);
        httpURLConnection.connect();
        return new Oooo000(httpURLConnection);
    }
}
