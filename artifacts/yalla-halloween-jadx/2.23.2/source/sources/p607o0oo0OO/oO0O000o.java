package p607o0oo0OO;

import android.util.Log;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p609o0oo0OOO.h5;
import p609o0oo0OOO.k5;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O000o {
    public static void OooO00o(HttpURLConnection httpURLConnection, Map map) throws IOException {
        String strOooO0oo;
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        boolean z = true;
        httpURLConnection.setDoOutput(true);
        if (map != null && !map.isEmpty()) {
            z = false;
        }
        if (z) {
            return;
        }
        try {
            strOooO0oo = k5.f57417OooO00o.OooO0oo(map);
        } catch (Throwable t) {
            Intrinsics.checkNotNullParameter(t, "t");
            if (h5.f57416OooO0O0) {
                Log.e(h5.f57415OooO00o, "", t);
            }
            strOooO0oo = "";
        }
        String msg = Intrinsics.stringPlus("http params:", strOooO0oo);
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (h5.f57416OooO0O0) {
            Log.e(h5.f57415OooO00o, msg);
        }
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream());
        outputStreamWriter.write(strOooO0oo);
        outputStreamWriter.flush();
    }
}
