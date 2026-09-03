package androidx.appcompat.app;

import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO implements androidx.savedstate.OooO00o.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f2396OooO00o;

    public OooO0OO(AppCompatActivity appCompatActivity) {
        this.f2396OooO00o = appCompatActivity;
    }

    @Override // androidx.savedstate.OooO00o.OooO0O0
    @NonNull
    public final Bundle saveState() {
        Bundle bundle = new Bundle();
        this.f2396OooO00o.OooOO0o().getClass();
        return bundle;
    }
}
