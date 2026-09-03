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

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static Method f29762Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static Class<?> f29763Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static boolean f29764Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static Method f29765OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static boolean f29766OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static boolean f29767OoooO0O;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final View f29768Oooo0o;

    public oO0Ooooo(@NonNull View view) {
        this.f29768Oooo0o = view;
    }

    public static void OooO0O0() {
        if (f29764Oooo0oo) {
            return;
        }
        try {
            f29763Oooo0oO = Class.forName("android.view.GhostView");
        } catch (ClassNotFoundException e) {
            Log.i("GhostViewApi21", "Failed to retrieve GhostView class", e);
        }
        f29764Oooo0oo = true;
    }

    @Override // p101o000oOoo.oO000O0
    public final void OooO00o(ViewGroup viewGroup, View view) {
    }

    @Override // p101o000oOoo.oO000O0
    public final void setVisibility(int i) {
        this.f29768Oooo0o.setVisibility(i);
    }
}
