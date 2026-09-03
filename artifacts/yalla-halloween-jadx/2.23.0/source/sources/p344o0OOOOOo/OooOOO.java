package p344o0OOOOOo;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0O f43657OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOOO<T> f43658OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f43659OooO0OO;

    public OooOOO(OooOO0O oooOO0O, OooOOOO<T> oooOOOO, String str) {
        this.f43657OooO00o = oooOO0O;
        this.f43658OooO0O0 = oooOOOO;
        this.f43659OooO0OO = str;
    }

    @SuppressLint({"CommitPrefEdits"})
    public final void OooO00o(T t) {
        OooOOO0 oooOOO0 = (OooOOO0) this.f43657OooO00o;
        SharedPreferences.Editor editorPutString = oooOOO0.f43660OooO00o.edit().putString(this.f43659OooO0OO, this.f43658OooO0O0.OooO0O0(t));
        oooOOO0.getClass();
        editorPutString.apply();
    }
}
