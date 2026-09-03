package o000O00O;

import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f28093OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOOO f28094OooO00o;

    @RequiresApi(24)
    public static class OooO00o {
        @DoNotInline
        public static LocaleList OooO00o(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        @DoNotInline
        public static LocaleList OooO0O0() {
            return LocaleList.getAdjustedDefault();
        }

        @DoNotInline
        public static LocaleList OooO0OO() {
            return LocaleList.getDefault();
        }
    }

    static {
        OooO00o(new Locale[0]);
    }

    public OooOOO0(OooOOOO oooOOOO) {
        this.f28094OooO00o = oooOOOO;
    }

    @NonNull
    public static OooOOO0 OooO00o(@NonNull Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new OooOOO0(new OooOo00(OooO00o.OooO00o(localeArr))) : new OooOOO0(new OooOOO(localeArr));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof OooOOO0) && this.f28094OooO00o.equals(((OooOOO0) obj).f28094OooO00o);
    }

    public final int hashCode() {
        return this.f28094OooO00o.hashCode();
    }

    @NonNull
    public final String toString() {
        return this.f28094OooO00o.toString();
    }
}
