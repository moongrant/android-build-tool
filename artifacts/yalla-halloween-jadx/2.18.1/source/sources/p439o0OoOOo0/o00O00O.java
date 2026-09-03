package p439o0OoOOo0;

import android.content.res.Resources;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import p021OooOooo.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final SimpleDateFormat f40156OooO00o = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy", Locale.ENGLISH);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO00o f40157OooO0O0 = new OooO00o();

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0ooOOo<SimpleDateFormat> f40158OooO00o = new o0ooOOo<>();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Locale f40159OooO0O0;

        public final synchronized DateFormat OooO00o(Resources resources, int i) {
            SimpleDateFormat simpleDateFormatOooO0oO;
            Locale locale = this.f40159OooO0O0;
            if (locale == null || locale != resources.getConfiguration().locale) {
                this.f40159OooO0O0 = resources.getConfiguration().locale;
                o0ooOOo<SimpleDateFormat> o0ooooo2 = this.f40158OooO00o;
                int i2 = o0ooooo2.f435Oooo;
                Object[] objArr = o0ooooo2.f438Oooo0oo;
                for (int i3 = 0; i3 < i2; i3++) {
                    objArr[i3] = null;
                }
                o0ooooo2.f435Oooo = 0;
                o0ooooo2.f436Oooo0o = false;
            }
            simpleDateFormatOooO0oO = this.f40158OooO00o.OooO0oO(i, null);
            if (simpleDateFormatOooO0oO == null) {
                simpleDateFormatOooO0oO = new SimpleDateFormat(resources.getString(i), Locale.getDefault());
                this.f40158OooO00o.OooOO0O(i, simpleDateFormatOooO0oO);
            }
            return simpleDateFormatOooO0oO;
        }
    }

    public static long OooO00o(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return f40156OooO00o.parse(str).getTime();
        } catch (ParseException unused) {
            return -1L;
        }
    }
}
