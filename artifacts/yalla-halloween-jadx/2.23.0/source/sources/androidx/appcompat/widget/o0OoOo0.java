package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 extends o00000O0 {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner f3359OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner.OooOO0O f3360OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(AppCompatSpinner appCompatSpinner, View view, AppCompatSpinner.OooOO0O oooOO0O) {
        super(view);
        this.f3359OooOOO = appCompatSpinner;
        this.f3360OooOOO0 = oooOO0O;
    }

    @Override // androidx.appcompat.widget.o00000O0
    public final p018OooOoo0.Oooo000 OooO0O0() {
        return this.f3360OooOOO0;
    }

    @Override // androidx.appcompat.widget.o00000O0
    @SuppressLint({"SyntheticAccessor"})
    public final boolean OooO0OO() {
        AppCompatSpinner appCompatSpinner = this.f3359OooOOO;
        if (appCompatSpinner.getInternalPopup().OooO00o()) {
            return true;
        }
        appCompatSpinner.f2846OooO.OooOO0(AppCompatSpinner.OooO0OO.OooO0O0(appCompatSpinner), AppCompatSpinner.OooO0OO.OooO00o(appCompatSpinner));
        return true;
    }
}
