package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class oo000o<E> extends o00O0O {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final o000OOo f8527Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @Nullable
    public final Activity f8528Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NonNull
    public final Context f8529Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NonNull
    public final Handler f8530Oooo0oo;

    public oo000o(@NonNull FragmentActivity fragmentActivity) {
        Handler handler = new Handler();
        this.f8527Oooo = new o000OOo();
        this.f8528Oooo0o = fragmentActivity;
        o000OO0O.OooOOO0.OooO0Oo(fragmentActivity, "context == null");
        this.f8529Oooo0oO = fragmentActivity;
        this.f8530Oooo0oo = handler;
    }

    public abstract void OooO0Oo(@NonNull PrintWriter printWriter, @Nullable String[] strArr);

    @NonNull
    public abstract LayoutInflater OooO0o();

    @Nullable
    public abstract E OooO0o0();

    public abstract boolean OooO0oO(@NonNull String str);

    public abstract void OooO0oo();
}
