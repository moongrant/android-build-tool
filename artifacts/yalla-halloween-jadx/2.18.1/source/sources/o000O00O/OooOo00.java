package o000O00O;

import android.os.LocaleList;
import androidx.annotation.RequiresApi;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(24)
public final class OooOo00 implements OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final LocaleList f28096OooO00o;

    public OooOo00(Object obj) {
        this.f28096OooO00o = (LocaleList) obj;
    }

    @Override // o000O00O.OooOOOO
    public final Object OooO00o() {
        return this.f28096OooO00o;
    }

    public final boolean equals(Object obj) {
        return this.f28096OooO00o.equals(((OooOOOO) obj).OooO00o());
    }

    @Override // o000O00O.OooOOOO
    public final Locale get() {
        return this.f28096OooO00o.get(0);
    }

    public final int hashCode() {
        return this.f28096OooO00o.hashCode();
    }

    public final String toString() {
        return this.f28096OooO00o.toString();
    }
}
