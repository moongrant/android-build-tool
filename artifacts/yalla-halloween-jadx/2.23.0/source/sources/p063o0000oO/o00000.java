package p063o0000oO;

import android.os.LocaleList;
import androidx.annotation.RequiresApi;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(24)
public final class o00000 implements oo0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final LocaleList f34290OooO00o;

    public o00000(Object obj) {
        this.f34290OooO00o = o000OOo.OooO00o(obj);
    }

    @Override // p063o0000oO.oo0o0Oo
    public final String OooO00o() {
        return this.f34290OooO00o.toLanguageTags();
    }

    @Override // p063o0000oO.oo0o0Oo
    public final Object OooO0O0() {
        return this.f34290OooO00o;
    }

    public final boolean equals(Object obj) {
        return this.f34290OooO00o.equals(((oo0o0Oo) obj).OooO0O0());
    }

    @Override // p063o0000oO.oo0o0Oo
    public final Locale get(int i) {
        return this.f34290OooO00o.get(i);
    }

    public final int hashCode() {
        return this.f34290OooO00o.hashCode();
    }

    @Override // p063o0000oO.oo0o0Oo
    public final boolean isEmpty() {
        return this.f34290OooO00o.isEmpty();
    }

    @Override // p063o0000oO.oo0o0Oo
    public final int size() {
        return this.f34290OooO00o.size();
    }

    public final String toString() {
        return this.f34290OooO00o.toString();
    }
}
