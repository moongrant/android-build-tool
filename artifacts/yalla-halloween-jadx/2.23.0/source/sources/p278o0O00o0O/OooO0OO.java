package p278o0O00o0O;

import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO extends OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final SideSheetBehavior<? extends View> f41819OooO00o;

    public OooO0OO(@NonNull SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f41819OooO00o = sideSheetBehavior;
    }

    public final int OooO00o() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f41819OooO00o;
        return Math.max(0, (sideSheetBehavior.f17692OooOOO0 - sideSheetBehavior.f17690OooOO0o) - sideSheetBehavior.f17691OooOOO);
    }
}
