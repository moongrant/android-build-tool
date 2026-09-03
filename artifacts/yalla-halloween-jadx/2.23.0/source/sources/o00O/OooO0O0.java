package o00O;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p126o00O0oOo.o000OOo;
import p127o00O0oo.o00oO0o;
import p605o0oo0OO0.o00;
import p605o0oo0OO0.o000O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 implements OooO00o {
    public static void OooO0OO(HttpURLConnection httpURLConnection, Map map) throws IOException {
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
            strOooO0oo = o00.f56900OooO00o.OooO0oo(map);
        } catch (Throwable t) {
            Intrinsics.checkNotNullParameter(t, "t");
            if (o000O.f56902OooO0O0) {
                Log.e(o000O.f56901OooO00o, "", t);
            }
            strOooO0oo = "";
        }
        String msg = Intrinsics.stringPlus("http params:", strOooO0oo);
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (o000O.f56902OooO0O0) {
            Log.e(o000O.f56901OooO00o, msg);
        }
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream());
        outputStreamWriter.write(strOooO0oo);
        outputStreamWriter.flush();
    }

    @Override // o00O.OooO00o
    public File OooO00o(o000OOo o000ooo2) {
        return null;
    }

    @Override // o00O.OooO00o
    public void OooO0O0(o000OOo o000ooo2, o00oO0o o00oo0o2) {
    }

    @Override // o00O.OooO00o
    public void clear() {
    }
}
