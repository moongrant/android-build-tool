package p339o0OOO0Oo;

import android.content.res.Resources;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO {
    public static String OooO00o(String str, Resources resources) {
        Exception e;
        String str2;
        try {
            InputStream inputStreamOpen = resources.getAssets().open(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i = inputStreamOpen.read();
                if (i != -1) {
                    byteArrayOutputStream.write(i);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    inputStreamOpen.close();
                    str2 = new String(byteArray, "UTF-8");
                    try {
                        return str2.replaceAll("\\r\\n", "\n");
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
                e.printStackTrace();
                return str2;
            }
        } catch (Exception e3) {
            e = e3;
            str2 = null;
        }
    }
}
