package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import p101o000oo.o000O00O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OOO0o f10590OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f10591OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f10592OooO0OO = -1;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f10593OooO0Oo = -1;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Object f10594OooO0o0 = null;

    public OooO0OO(@NonNull o000O00O o000o00o2) {
        this.f10590OooO00o = o000o00o2;
    }

    @Override // androidx.recyclerview.widget.o0OOO0o
    public final void OooO00o(int i, int i2) {
        int i3;
        if (this.f10591OooO0O0 == 1 && i >= (i3 = this.f10592OooO0OO)) {
            int i4 = this.f10593OooO0Oo;
            if (i <= i3 + i4) {
                this.f10593OooO0Oo = i4 + i2;
                this.f10592OooO0OO = Math.min(i, i3);
                return;
            }
        }
        OooO0o0();
        this.f10592OooO0OO = i;
        this.f10593OooO0Oo = i2;
        this.f10591OooO0O0 = 1;
    }

    @Override // androidx.recyclerview.widget.o0OOO0o
    public final void OooO0O0(int i, int i2) {
        int i3;
        if (this.f10591OooO0O0 == 2 && (i3 = this.f10592OooO0OO) >= i && i3 <= i + i2) {
            this.f10593OooO0Oo += i2;
            this.f10592OooO0OO = i;
        } else {
            OooO0o0();
            this.f10592OooO0OO = i;
            this.f10593OooO0Oo = i2;
            this.f10591OooO0O0 = 2;
        }
    }

    @Override // androidx.recyclerview.widget.o0OOO0o
    @SuppressLint({"UnknownNullness"})
    public final void OooO0OO(int i, int i2, Object obj) {
        int i3;
        if (this.f10591OooO0O0 == 3) {
            int i4 = this.f10592OooO0OO;
            int i5 = this.f10593OooO0Oo;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.f10594OooO0o0 == obj) {
                this.f10592OooO0OO = Math.min(i, i4);
                this.f10593OooO0Oo = Math.max(i5 + i4, i3) - this.f10592OooO0OO;
                return;
            }
        }
        OooO0o0();
        this.f10592OooO0OO = i;
        this.f10593OooO0Oo = i2;
        this.f10594OooO0o0 = obj;
        this.f10591OooO0O0 = 3;
    }

    @Override // androidx.recyclerview.widget.o0OOO0o
    public final void OooO0Oo(int i, int i2) {
        OooO0o0();
        this.f10590OooO00o.OooO0Oo(i, i2);
    }

    public final void OooO0o0() {
        int i = this.f10591OooO0O0;
        if (i == 0) {
            return;
        }
        o0OOO0o o0ooo0o2 = this.f10590OooO00o;
        if (i == 1) {
            o0ooo0o2.OooO00o(this.f10592OooO0OO, this.f10593OooO0Oo);
        } else if (i == 2) {
            o0ooo0o2.OooO0O0(this.f10592OooO0OO, this.f10593OooO0Oo);
        } else if (i == 3) {
            o0ooo0o2.OooO0OO(this.f10592OooO0OO, this.f10593OooO0Oo, this.f10594OooO0o0);
        }
        this.f10594OooO0o0 = null;
        this.f10591OooO0O0 = 0;
    }
}
