package Jni;

import androidx.annotation.Keep;
import java.util.HashMap;
import p009OooOOo0.OooO0O0;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class FFmpegCmd {
    private static long duration;
    private static OooO0O0 listener;

    static {
        System.loadLibrary("myapplication");
    }

    @Keep
    public static native String checkEncoder(String[] strArr);

    @Keep
    public static native int exec(int i, String[] strArr);

    @Keep
    public static void exec(String[] strArr, long j, OooO0O0 oooO0O0) {
        listener = oooO0O0;
        duration = j;
        exec(strArr.length, strArr);
    }

    @Keep
    public static native void exit();

    public static native HashMap<String, Object> mp4Info(String str);

    @Keep
    public static void onCancel() {
        OooO0O0 oooO0O0 = listener;
        if (oooO0O0 != null) {
            oooO0O0.onCancel();
        }
    }

    @Keep
    public static void onExecuted(int i, String str) {
        OooO0O0 oooO0O0 = listener;
        if (oooO0O0 != null) {
            if (i != 0) {
                oooO0O0.onFailure();
                listener = null;
            } else {
                oooO0O0.OooO00o(1.0f);
                listener.onSuccess();
                listener = null;
            }
        }
    }

    @Keep
    public static void onProgress(float f) {
        OooO0O0 oooO0O0 = listener;
        if (oooO0O0 != null) {
            long j = duration;
            if (j != 0) {
                oooO0O0.OooO00o((f / (j / 1000000.0f)) * 0.95f);
            }
        }
    }
}
