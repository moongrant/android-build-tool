package p101o000oOoo;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class oO0Ooooo implements oO000O0 {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public static boolean f29780OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static boolean f29781OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static Class<?> f29782OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static Method f29783OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public static Method f29784OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public static boolean f29785o000oOoO;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final View f29786Oooo;

    public oO0Ooooo(@NonNull View view) {
        this.f29786Oooo = view;
    }

    public static void OooO0O0() {
        if (f29781OoooO0) {
            return;
        }
        try {
            f29782OoooO00 = Class.forName("android.view.GhostView");
        } catch (ClassNotFoundException e) {
            Log.i("GhostViewApi21", "Failed to retrieve GhostView class", e);
        }
        f29781OoooO0 = true;
    }

    @Override // p101o000oOoo.oO000O0
    public final void OooO00o(ViewGroup viewGroup, View view) {
    }

    @Override // p101o000oOoo.oO000O0
    public final void setVisibility(int i) {
        this.f29786Oooo.setVisibility(i);
    }
}
