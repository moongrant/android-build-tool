package p347o0OOOOoo;

import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoOo0 {
    public static String OooO00o(long j) {
        int i = (int) (j / 1000);
        int i2 = i % 60;
        int i3 = (i / 60) % 60;
        int i4 = i / 3600;
        return i4 > 0 ? String.format(Locale.getDefault(), "%1$d:%2$02d:%3$02d", Integer.valueOf(i4), Integer.valueOf(i3), Integer.valueOf(i2)) : String.format(Locale.getDefault(), "%1$d:%2$02d", Integer.valueOf(i3), Integer.valueOf(i2));
    }
}
