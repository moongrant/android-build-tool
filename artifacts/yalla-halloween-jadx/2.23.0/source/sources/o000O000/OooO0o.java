package o000O000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.Player;
import androidx.media3.common.util.UnstableApi;
import java.util.Formatter;
import java.util.Locale;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @UnstableApi
    public static final int f34423OooO00o = Build.VERSION.SDK_INT;

    @RequiresApi(21)
    public static final class OooO00o {
        @DoNotInline
        public static Drawable OooO00o(Context context, Resources resources, @DrawableRes int i) {
            return resources.getDrawable(i, context.getTheme());
        }
    }

    static {
        String str = Build.DEVICE;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.MODEL;
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
    }

    @UnstableApi
    public static String OooO(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(Character.forDigit((bArr[i] >> 4) & 15, 16));
            sb.append(Character.forDigit(bArr[i] & 15, 16));
        }
        return sb.toString();
    }

    @UnstableApi
    public static boolean OooO00o(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @UnstableApi
    public static String OooO0O0(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    @UnstableApi
    public static Drawable OooO0OO(Context context, Resources resources, @DrawableRes int i) {
        return f34423OooO00o >= 21 ? OooO00o.OooO00o(context, resources, i) : resources.getDrawable(i);
    }

    @UnstableApi
    public static String OooO0Oo(StringBuilder sb, Formatter formatter, long j) {
        if (j == -9223372036854775807L) {
            j = 0;
        }
        String str = j < 0 ? "-" : "";
        long jAbs = (Math.abs(j) + 500) / 1000;
        long j2 = jAbs % 60;
        long j3 = (jAbs / 60) % 60;
        long j4 = jAbs / 3600;
        sb.setLength(0);
        return j4 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j4), Long.valueOf(j3), Long.valueOf(j2)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j3), Long.valueOf(j2)).toString();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002a  */
    public static boolean OooO0o(@Nullable Player player) {
        boolean z;
        int iOooOOoo = player.OooOOoo();
        if (iOooOOoo != 1 || !player.OooOoOO()) {
            if (iOooOOoo == 4 && player.OooOoOO()) {
                player.OooO0o();
            } else {
                z = false;
            }
            if (player.OooOoOO()) {
                return z;
            }
            player.OooO0O0();
            return true;
        }
        player.OooO0OO();
        z = true;
        if (player.OooOoOO()) {
            return z;
        }
        player.OooO0O0();
        return true;
    }

    public static boolean OooO0o0(@Nullable Player player) {
        if (!player.OooOoOO()) {
            return false;
        }
        player.pause();
        return true;
    }

    @UnstableApi
    public static void OooO0oO(int i) {
        Integer.toString(i, 36);
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean OooO0oo(@Nullable Player player) {
        return player == null || !player.OooOOO() || player.OooOOoo() == 1 || player.OooOOoo() == 4;
    }

    @UnstableApi
    public static long OooOO0(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }
}
