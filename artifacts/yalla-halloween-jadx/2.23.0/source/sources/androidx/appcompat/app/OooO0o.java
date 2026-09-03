package androidx.appcompat.app;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o implements OooOo00.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f2397OooO00o;

    public OooO0o(AppCompatActivity appCompatActivity) {
        this.f2397OooO00o = appCompatActivity;
    }

    @Override // OooOo00.OooO0O0
    public final void OooO00o(@NonNull Context context) {
        AppCompatActivity appCompatActivity = this.f2397OooO00o;
        AppCompatDelegate appCompatDelegateOooOO0o = appCompatActivity.OooOO0o();
        appCompatDelegateOooOO0o.OooOO0O();
        appCompatActivity.getSavedStateRegistry().OooO00o("androidx:appcompat");
        appCompatDelegateOooOO0o.OooOOOO();
    }
}
