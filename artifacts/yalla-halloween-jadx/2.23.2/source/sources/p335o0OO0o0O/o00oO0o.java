package p335o0OO0o0O;

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
import p022Oooo00O.o000oOoO;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o00oO0o implements o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @JvmField
    @NotNull
    public final oo0o0Oo f42472OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @JvmField
    @Nullable
    public o00oO0o f42473OooO0O0;

    public o00oO0o(@NotNull oo0o0Oo pb) {
        Intrinsics.checkNotNullParameter(pb, "pb");
        this.f42472OooO00o = pb;
        Intrinsics.checkNotNullParameter(pb, "pb");
        Intrinsics.checkNotNullParameter(this, "chainTask");
        Intrinsics.checkNotNullParameter(pb, "pb");
        Intrinsics.checkNotNullParameter(this, "chainTask");
        Intrinsics.checkNotNullParameter(pb, "pb");
        Intrinsics.checkNotNullParameter(this, "chainTask");
        Intrinsics.checkNotNullParameter(pb, "pb");
        Intrinsics.checkNotNullParameter(this, "chainTask");
    }

    @Override // p335o0OO0o0O.o0ooOOo
    public final void finish() {
        Unit unit;
        o00oO0o o00oo0o2 = this.f42473OooO0O0;
        if (o00oo0o2 == null) {
            unit = null;
        } else {
            o00oo0o2.OooO00o();
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            ArrayList deniedList = new ArrayList();
            oo0o0Oo oo0o0oo = this.f42472OooO00o;
            deniedList.addAll(oo0o0oo.f42493OooO0oo);
            deniedList.addAll(oo0o0oo.f42485OooO);
            deniedList.addAll(oo0o0oo.f42490OooO0o);
            Set<String> set = oo0o0oo.f42491OooO0o0;
            boolean zContains = set.contains("android.permission.ACCESS_BACKGROUND_LOCATION");
            LinkedHashSet linkedHashSet = oo0o0oo.f42492OooO0oO;
            if (zContains) {
                if (ContextCompat.OooO00o(oo0o0oo.OooO00o(), "android.permission.ACCESS_BACKGROUND_LOCATION") == 0) {
                    linkedHashSet.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                } else {
                    deniedList.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                }
            }
            if (set.contains("android.permission.SYSTEM_ALERT_WINDOW") && oo0o0oo.OooO0Oo() >= 23) {
                if (Settings.canDrawOverlays(oo0o0oo.OooO00o())) {
                    linkedHashSet.add("android.permission.SYSTEM_ALERT_WINDOW");
                } else {
                    deniedList.add("android.permission.SYSTEM_ALERT_WINDOW");
                }
            }
            if (set.contains("android.permission.WRITE_SETTINGS") && oo0o0oo.OooO0Oo() >= 23) {
                if (Settings.System.canWrite(oo0o0oo.OooO00o())) {
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
                if (Build.VERSION.SDK_INT < 26 || oo0o0oo.OooO0Oo() < 26 || !oo0o0oo.OooO00o().getPackageManager().canRequestPackageInstalls()) {
                    deniedList.add("android.permission.REQUEST_INSTALL_PACKAGES");
                } else {
                    linkedHashSet.add("android.permission.REQUEST_INSTALL_PACKAGES");
                }
            }
            o000oOoO o000oooo2 = oo0o0oo.f42495OooOO0O;
            if (o000oooo2 != null) {
                Intrinsics.checkNotNull(o000oooo2);
                boolean zIsEmpty = deniedList.isEmpty();
                ArrayList grantedList = new ArrayList(linkedHashSet);
                OooO00o.C0375OooO00o this$0 = (OooO00o.C0375OooO00o) o000oooo2.f603OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(grantedList, "grantedList");
                Intrinsics.checkNotNullParameter(deniedList, "deniedList");
                OooO00o.f32320OooO00o = false;
                if (zIsEmpty) {
                    Function1<? super List<String>, Unit> function1 = this$0.f32323OooO0OO;
                    if (function1 != null) {
                        function1.invoke(grantedList);
                    }
                } else {
                    Function1<? super List<String>, Unit> function2 = this$0.f32324OooO0Oo;
                    if (function2 != null) {
                        function2.invoke(deniedList);
                    }
                }
            }
            Fragment fragmentOooOoo = oo0o0oo.OooO0O0().OooOoo("InvisibleFragment");
            if (fragmentOooOoo != null) {
                FragmentManager fragmentManagerOooO0O0 = oo0o0oo.OooO0O0();
                fragmentManagerOooO0O0.getClass();
                androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(fragmentManagerOooO0O0);
                oooO00o.OooOO0o(fragmentOooOoo);
                oooO00o.OooO0o();
            }
            oo0o0oo.OooO00o().setRequestedOrientation(oo0o0oo.f42488OooO0OO);
        }
    }
}
