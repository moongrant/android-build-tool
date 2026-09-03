package p353o0OOOo00;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 {
    public static String OooO00o(long j) {
        int i = (int) (j / 1000);
        int i2 = i % 60;
        int i3 = (i / 60) % 60;
        int i4 = i / 3600;
        return i4 > 0 ? String.format(Locale.getDefault(), "%1$d:%2$02d:%3$02d", Integer.valueOf(i4), Integer.valueOf(i3), Integer.valueOf(i2)) : String.format(Locale.getDefault(), "%1$d:%2$02d", Integer.valueOf(i3), Integer.valueOf(i2));
    }
}
