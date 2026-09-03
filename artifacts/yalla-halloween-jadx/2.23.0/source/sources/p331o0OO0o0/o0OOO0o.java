package p331o0OO0o0;

import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.yalla.yalla.util.permission.OooO00o;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o0OOO0o implements o0Oo0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @JvmField
    @NotNull
    public final o000000 f43190OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @JvmField
    @Nullable
    public o0OOO0o f43191OooO0O0;

    public o0OOO0o(@NotNull o000000 pb) {
        Intrinsics.checkNotNullParameter(pb, "pb");
        this.f43190OooO00o = pb;
        Intrinsics.checkNotNullParameter(pb, "pb");
        Intrinsics.checkNotNullParameter(this, "chainTask");
        Intrinsics.checkNotNullParameter(pb, "pb");
        Intrinsics.checkNotNullParameter(this, "chainTask");
        Intrinsics.checkNotNullParameter(pb, "pb");
        Intrinsics.checkNotNullParameter(this, "chainTask");
        Intrinsics.checkNotNullParameter(pb, "pb");
        Intrinsics.checkNotNullParameter(this, "chainTask");
    }

    @Override // p331o0OO0o0.o0Oo0oo
    public final void finish() {
        Unit unit;
        o0OOO0o o0ooo0o2 = this.f43191OooO0O0;
        if (o0ooo0o2 == null) {
            unit = null;
        } else {
            o0ooo0o2.OooO00o();
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            ArrayList deniedList = new ArrayList();
            o000000 o000000Var = this.f43190OooO00o;
            deniedList.addAll(o000000Var.f43176OooO0oo);
            deniedList.addAll(o000000Var.f43168OooO);
            deniedList.addAll(o000000Var.f43173OooO0o);
            Set<String> set = o000000Var.f43174OooO0o0;
            boolean zContains = set.contains("android.permission.ACCESS_BACKGROUND_LOCATION");
            LinkedHashSet linkedHashSet = o000000Var.f43175OooO0oO;
            if (zContains) {
                if (ContextCompat.OooO00o(o000000Var.OooO00o(), "android.permission.ACCESS_BACKGROUND_LOCATION") == 0) {
                    linkedHashSet.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                } else {
                    deniedList.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                }
            }
            if (set.contains("android.permission.SYSTEM_ALERT_WINDOW") && o000000Var.OooO0Oo() >= 23) {
                if (Settings.canDrawOverlays(o000000Var.OooO00o())) {
                    linkedHashSet.add("android.permission.SYSTEM_ALERT_WINDOW");
                } else {
                    deniedList.add("android.permission.SYSTEM_ALERT_WINDOW");
                }
            }
            if (set.contains("android.permission.WRITE_SETTINGS") && o000000Var.OooO0Oo() >= 23) {
                if (Settings.System.canWrite(o000000Var.OooO00o())) {
                    linkedHashSet.add("android.permission.WRITE_SETTINGS");
                } else {
                    deniedList.add("android.permission.WRITE_SETTINGS");
                }
            }
            if (set.contains("android.permission.MANAGE_EXTERNAL_STORAGE")) {
                if (Build.VERSION.SDK_INT < 30 || !Environment.isExternalStorageManager()) {
                    deniedList.add("android.permission.MANAGE_EXTERNAL_STORAGE");
                } else {
                    linkedHashSet.add("android.permission.MANAGE_EXTERNAL_STORAGE");
                }
            }
            if (set.contains("android.permission.REQUEST_INSTALL_PACKAGES")) {
                if (Build.VERSION.SDK_INT < 26 || o000000Var.OooO0Oo() < 26 || !o000000Var.OooO00o().getPackageManager().canRequestPackageInstalls()) {
                    deniedList.add("android.permission.REQUEST_INSTALL_PACKAGES");
                } else {
                    linkedHashSet.add("android.permission.REQUEST_INSTALL_PACKAGES");
                }
            }
            o0O0O00 o0o0o00 = o000000Var.f43178OooOO0O;
            if (o0o0o00 != null) {
                Intrinsics.checkNotNull(o0o0o00);
                boolean zIsEmpty = deniedList.isEmpty();
                ArrayList grantedList = new ArrayList(linkedHashSet);
                OooO00o.C0376OooO00o this$0 = (OooO00o.C0376OooO00o) o0o0o00.f43188OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(grantedList, "grantedList");
                Intrinsics.checkNotNullParameter(deniedList, "deniedList");
                OooO00o.f32864OooO00o = false;
                if (zIsEmpty) {
                    Function1<? super List<String>, Unit> function1 = this$0.f32867OooO0OO;
                    if (function1 != null) {
                        function1.invoke(grantedList);
                    }
                } else {
                    Function1<? super List<String>, Unit> function2 = this$0.f32868OooO0Oo;
                    if (function2 != null) {
                        function2.invoke(deniedList);
                    }
                }
            }
            Fragment fragmentOooOoo = o000000Var.OooO0O0().OooOoo("InvisibleFragment");
            if (fragmentOooOoo != null) {
                FragmentManager fragmentManagerOooO0O0 = o000000Var.OooO0O0();
                fragmentManagerOooO0O0.getClass();
                androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(fragmentManagerOooO0O0);
                oooO00o.OooOOO0(fragmentOooOoo);
                oooO00o.OooO0o();
            }
            o000000Var.OooO00o().setRequestedOrientation(o000000Var.f43171OooO0OO);
        }
    }
}
