package p348o0OOOOo;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOO0 f42847OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOo00<T> f42848OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f42849OooO0OO;

    public OooOOOO(OooOOO0 oooOOO0, OooOo00<T> oooOo00, String str) {
        this.f42847OooO00o = oooOOO0;
        this.f42848OooO0O0 = oooOo00;
        this.f42849OooO0OO = str;
    }

    @SuppressLint({"CommitPrefEdits"})
    public final void OooO00o(T t) {
        OooOOO oooOOO = (OooOOO) this.f42847OooO00o;
        SharedPreferences.Editor editorPutString = oooOOO.f42846OooO00o.edit().putString(this.f42849OooO0OO, this.f42848OooO0O0.OooO0O0(t));
        oooOOO.getClass();
        editorPutString.apply();
    }
}
