package p406o0Oo0OOO;

import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o000O000.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p074o000O0oo.OooOOO0;
import p618o0oo0o0.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oO0Oo implements o0oo0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @JvmField
    @NotNull
    public oO00000o f39127OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @JvmField
    @Nullable
    public oO0Oo f39128OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public ooo0Oo0 f39129OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public o f39130OooO0Oo;

    public oO0Oo(@NotNull oO00000o pb) {
        Intrinsics.checkNotNullParameter(pb, "pb");
        this.f39127OooO00o = pb;
        this.f39129OooO0OO = new ooo0Oo0(pb, this);
        this.f39130OooO0Oo = new o(this.f39127OooO00o, this);
        this.f39129OooO0OO = new ooo0Oo0(this.f39127OooO00o, this);
        this.f39130OooO0Oo = new o(this.f39127OooO00o, this);
    }

    @Override // p406o0Oo0OOO.o0oo0000
    public final void OooO0O0() {
        Unit unit;
        oO0Oo oo0oo = this.f39128OooO0O0;
        if (oo0oo == null) {
            unit = null;
        } else {
            oo0oo.OooO00o();
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            ArrayList deniedList = new ArrayList();
            deniedList.addAll(this.f39127OooO00o.f39121OooO0oo);
            deniedList.addAll(this.f39127OooO00o.f39113OooO);
            deniedList.addAll(this.f39127OooO00o.f39118OooO0o);
            if (this.f39127OooO00o.f39119OooO0o0.contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                if (OooO00o.OooO00o(this.f39127OooO00o.OooO00o(), "android.permission.ACCESS_BACKGROUND_LOCATION") == 0) {
                    this.f39127OooO00o.f39120OooO0oO.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                } else {
                    deniedList.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                }
            }
            if (this.f39127OooO00o.f39119OooO0o0.contains("android.permission.SYSTEM_ALERT_WINDOW") && Build.VERSION.SDK_INT >= 23 && this.f39127OooO00o.OooO0Oo() >= 23) {
                if (Settings.canDrawOverlays(this.f39127OooO00o.OooO00o())) {
                    this.f39127OooO00o.f39120OooO0oO.add("android.permission.SYSTEM_ALERT_WINDOW");
                } else {
                    deniedList.add("android.permission.SYSTEM_ALERT_WINDOW");
                }
            }
            if (this.f39127OooO00o.f39119OooO0o0.contains("android.permission.WRITE_SETTINGS") && Build.VERSION.SDK_INT >= 23 && this.f39127OooO00o.OooO0Oo() >= 23) {
                if (Settings.System.canWrite(this.f39127OooO00o.OooO00o())) {
                    this.f39127OooO00o.f39120OooO0oO.add("android.permission.WRITE_SETTINGS");
                } else {
                    deniedList.add("android.permission.WRITE_SETTINGS");
                }
            }
            if (this.f39127OooO00o.f39119OooO0o0.contains("android.permission.MANAGE_EXTERNAL_STORAGE")) {
                if (Build.VERSION.SDK_INT < 30 || !Environment.isExternalStorageManager()) {
                    deniedList.add("android.permission.MANAGE_EXTERNAL_STORAGE");
                } else {
                    this.f39127OooO00o.f39120OooO0oO.add("android.permission.MANAGE_EXTERNAL_STORAGE");
                }
            }
            if (this.f39127OooO00o.f39119OooO0o0.contains("android.permission.REQUEST_INSTALL_PACKAGES")) {
                if (Build.VERSION.SDK_INT < 26 || this.f39127OooO00o.OooO0Oo() < 26 || !this.f39127OooO00o.OooO00o().getPackageManager().canRequestPackageInstalls()) {
                    deniedList.add("android.permission.REQUEST_INSTALL_PACKAGES");
                } else {
                    this.f39127OooO00o.f39120OooO0oO.add("android.permission.REQUEST_INSTALL_PACKAGES");
                }
            }
            OooOOO0 oooOOO0 = this.f39127OooO00o.f39124OooOO0o;
            if (oooOOO0 != null) {
                Intrinsics.checkNotNull(oooOOO0);
                boolean zIsEmpty = deniedList.isEmpty();
                ArrayList grantedList = new ArrayList(this.f39127OooO00o.f39120OooO0oO);
                o0O0O00.OooO00o this$0 = (o0O0O00.OooO00o) oooOOO0.f28223OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(grantedList, "grantedList");
                Intrinsics.checkNotNullParameter(deniedList, "deniedList");
                o0O0O00.f48590OooO00o = false;
                if (zIsEmpty) {
                    Function1<? super List<String>, Unit> function1 = this$0.f48593OooO0OO;
                    if (function1 != null) {
                        function1.invoke(grantedList);
                    }
                } else {
                    Function1<? super List<String>, Unit> function2 = this$0.f48594OooO0Oo;
                    if (function2 != null) {
                        function2.invoke(deniedList);
                    }
                }
            }
            oO00000o oo00000o = this.f39127OooO00o;
            Fragment fragmentOooo00O = oo00000o.OooO0O0().Oooo00O("InvisibleFragment");
            if (fragmentOooo00O != null) {
                androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(oo00000o.OooO0O0());
                oooO00o.OooOOO0(fragmentOooo00O);
                oooO00o.OooO0oo();
            }
            oO00000o oo00000o2 = this.f39127OooO00o;
            oo00000o2.OooO00o().setRequestedOrientation(oo00000o2.f39116OooO0OO);
        }
    }
}
