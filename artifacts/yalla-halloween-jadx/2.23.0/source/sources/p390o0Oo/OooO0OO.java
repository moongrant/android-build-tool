package p390o0Oo;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO {
    /* JADX INFO: Removed unreachable split cross block B:24:0x0031 */
    public static void OooO00o(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            try {
                Uri uriFromFile = Uri.fromFile(new File(str));
                if (uriFromFile != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                        intent.setData(uriFromFile);
                        context.sendBroadcast(intent);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }
}
