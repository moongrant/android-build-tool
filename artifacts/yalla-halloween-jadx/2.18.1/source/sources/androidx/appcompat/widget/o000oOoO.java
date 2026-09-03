package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO extends o0OO00O {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner f5410OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner.OooOO0O f5411o000oOoO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(AppCompatSpinner appCompatSpinner, View view, AppCompatSpinner.OooOO0O oooOO0O) {
        super(view);
        this.f5410OoooOOO = appCompatSpinner;
        this.f5411o000oOoO = oooOO0O;
    }

    @Override // androidx.appcompat.widget.o0OO00O
    public final p015OooOoO.o00Oo0 OooO0O0() {
        return this.f5411o000oOoO;
    }

    @Override // androidx.appcompat.widget.o0OO00O
    @SuppressLint({"SyntheticAccessor"})
    public final boolean OooO0OO() {
        if (this.f5410OoooOOO.getInternalPopup().OooO0O0()) {
            return true;
        }
        this.f5410OoooOOO.OooO0O0();
        return true;
    }
}
