package p626o0oo0oo0;

import android.util.Log;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p625o0oo0oo.o000OO00;
import p625o0oo0oo.o000OO0O;

/* JADX INFO: loaded from: classes3.dex */
public final class o000Oo0 {
    public static final void OooO00o(HttpURLConnection httpURLConnection, Map map) throws IOException {
        String strOooO0oo = "";
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
            strOooO0oo = o000OO00.f48668OooO00o.OooO0oo(map);
        } catch (Throwable t) {
            Intrinsics.checkNotNullParameter(t, "t");
            if (o000OO0O.f48670OooO0O0) {
                Log.e(o000OO0O.f48669OooO00o, "", t);
            }
        }
        String msg = Intrinsics.stringPlus("http params:", strOooO0oo);
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (o000OO0O.f48670OooO0O0) {
            Log.e(o000OO0O.f48669OooO00o, msg);
        }
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream());
        outputStreamWriter.write(strOooO0oo);
        outputStreamWriter.flush();
    }
}
