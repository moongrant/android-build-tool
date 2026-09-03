package p434o0OoOOO;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O00<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000Ooo f39968OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000oo<T> f39969OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f39970OooO0OO;

    public o0000O00(o0000Ooo o0000ooo, o0000oo<T> o0000ooVar, String str) {
        this.f39968OooO00o = o0000ooo;
        this.f39969OooO0O0 = o0000ooVar;
        this.f39970OooO0OO = str;
    }

    @SuppressLint({"CommitPrefEdits"})
    public final void OooO00o(T t) {
        o0000Ooo o0000ooo = this.f39968OooO00o;
        SharedPreferences.Editor editorPutString = ((o0000) o0000ooo).f39967OooO00o.edit().putString(this.f39970OooO0OO, this.f39969OooO0O0.OooO0O0(t));
        Objects.requireNonNull((o0000) o0000ooo);
        editorPutString.apply();
    }
}
