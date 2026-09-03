package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class OooO00o implements OooOOO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f2593OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f2594OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooO f2595OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Context f2596OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final LayoutInflater f2597OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooOOO.OooO00o f2598OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f2599OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public OooOOOO f2600OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f2601OooOO0o;

    public OooO00o(Context context, int i, int i2) {
        this.f2594OooO0Oo = context;
        this.f2597OooO0oO = LayoutInflater.from(context);
        this.f2593OooO = i;
        this.f2599OooOO0 = i2;
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final void OooO0OO(OooOOO.OooO00o oooO00o) {
        this.f2598OooO0oo = oooO00o;
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final boolean OooO0Oo(OooOO0O oooOO0O) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final boolean OooO0oo(OooOO0O oooOO0O) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final int getId() {
        return this.f2601OooOO0o;
    }
}
