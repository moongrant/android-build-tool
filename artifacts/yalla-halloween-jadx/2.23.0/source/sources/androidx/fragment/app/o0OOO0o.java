package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0OOO0o<E> extends oo000o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final Activity f6034OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final Handler f6035OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final Context f6036OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o00000 f6037OooO0oO;

    public o0OOO0o(@NonNull FragmentActivity fragmentActivity) {
        Handler handler = new Handler();
        this.f6037OooO0oO = new o00000();
        this.f6034OooO0Oo = fragmentActivity;
        o000OO.OooOOO0.OooO0o0(fragmentActivity, "context == null");
        this.f6036OooO0o0 = fragmentActivity;
        this.f6035OooO0o = handler;
    }

    public abstract void OooO0Oo(@NonNull PrintWriter printWriter, @Nullable String[] strArr);

    @NonNull
    public abstract LayoutInflater OooO0o();

    @Nullable
    public abstract FragmentActivity OooO0o0();

    public abstract boolean OooO0oO(@NonNull String str);

    public abstract void OooO0oo();
}
