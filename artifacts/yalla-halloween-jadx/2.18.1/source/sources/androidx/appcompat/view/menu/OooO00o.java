package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class OooO00o implements OooOOO0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public LayoutInflater f4680Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Context f4681Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Context f4682Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public OooO0o f4683Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public OooOOO f4684OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f4685OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public OooOOO0.OooO00o f4686OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f4687OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public int f4688OoooOO0;

    public OooO00o(Context context, int i, int i2) {
        this.f4681Oooo0o = context;
        this.f4680Oooo = LayoutInflater.from(context);
        this.f4685OoooO0 = i;
        this.f4687OoooO0O = i2;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO0o(OooOOO0.OooO00o oooO00o) {
        this.f4686OoooO00 = oooO00o;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final boolean OooO0oO(OooOO0 oooOO1) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final boolean OooOOO0(OooOO0 oooOO1) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final int getId() {
        return this.f4688OoooOO0;
    }
}
