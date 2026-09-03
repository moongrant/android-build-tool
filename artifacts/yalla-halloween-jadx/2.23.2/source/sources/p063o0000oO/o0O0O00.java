package p063o0000oO;

import Oooo0.o000oOoO;
import android.os.LocaleList;
import androidx.annotation.RequiresApi;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(24)
public final class o0O0O00 implements o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final LocaleList f33782OooO00o;

    public o0O0O00(Object obj) {
        this.f33782OooO00o = o000oOoO.OooO0O0(obj);
    }

    @Override // p063o0000oO.o0OOO0o
    public final String OooO00o() {
        return this.f33782OooO00o.toLanguageTags();
    }

    @Override // p063o0000oO.o0OOO0o
    public final Object OooO0O0() {
        return this.f33782OooO00o;
    }

    public final boolean equals(Object obj) {
        return this.f33782OooO00o.equals(((o0OOO0o) obj).OooO0O0());
    }

    @Override // p063o0000oO.o0OOO0o
    public final Locale get(int i) {
        return this.f33782OooO00o.get(i);
    }

    public final int hashCode() {
        return this.f33782OooO00o.hashCode();
    }

    @Override // p063o0000oO.o0OOO0o
    public final boolean isEmpty() {
        return this.f33782OooO00o.isEmpty();
    }

    @Override // p063o0000oO.o0OOO0o
    public final int size() {
        return this.f33782OooO00o.size();
    }

    public final String toString() {
        return this.f33782OooO00o.toString();
    }
}
