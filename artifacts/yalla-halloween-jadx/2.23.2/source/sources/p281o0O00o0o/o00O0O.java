package p281o0O00o0o;

import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O extends o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final SideSheetBehavior<? extends View> f41086OooO00o;

    public o00O0O(@NonNull SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f41086OooO00o = sideSheetBehavior;
    }

    public final int OooO00o() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f41086OooO00o;
        return Math.max(0, (sideSheetBehavior.f17215OooOOO0 - sideSheetBehavior.f17213OooOO0o) - sideSheetBehavior.f17214OooOOO);
    }
}
