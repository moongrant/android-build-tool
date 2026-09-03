package o000OO;

import com.zego.wrapper.callback.ZegoLiveRoomEngineDestroyCompletionCallback;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o implements ZegoLiveRoomEngineDestroyCompletionCallback {
    public static final float OooO00o(float f, float f2, float f3) {
        return (f3 * f2) + ((1 - f3) * f);
    }

    public static String OooO0O0(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }
}
