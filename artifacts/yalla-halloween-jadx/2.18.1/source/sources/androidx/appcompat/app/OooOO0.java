package androidx.appcompat.app;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 implements p009OooOOo.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f4520OooO00o;

    public OooOO0(AppCompatActivity appCompatActivity) {
        this.f4520OooO00o = appCompatActivity;
    }

    @Override // p009OooOOo.OooOo
    public final void OooO00o(@NonNull Context context) {
        AppCompatDelegate appCompatDelegateOooOO0O = this.f4520OooO00o.OooOO0O();
        appCompatDelegateOooOO0O.OooO();
        this.f4520OooO00o.getSavedStateRegistry().OooO00o("androidx:appcompat");
        appCompatDelegateOooOO0O.OooOO0o();
    }
}
