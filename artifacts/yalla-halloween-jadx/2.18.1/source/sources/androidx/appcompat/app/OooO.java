package androidx.appcompat.app;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class OooO implements o000o0OO.o0OoOo0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f4509OooO00o;

    public OooO(AppCompatActivity appCompatActivity) {
        this.f4509OooO00o = appCompatActivity;
    }

    @Override // o000o0OO.o0OoOo0.OooO0O0
    @NonNull
    public final Bundle saveState() {
        Bundle bundle = new Bundle();
        Objects.requireNonNull(this.f4509OooO00o.OooOO0O());
        return bundle;
    }
}
