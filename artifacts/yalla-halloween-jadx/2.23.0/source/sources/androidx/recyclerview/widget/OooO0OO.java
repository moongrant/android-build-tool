package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO implements o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0ooOOo f7502OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f7503OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f7504OooO0OO = -1;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f7505OooO0Oo = -1;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Object f7506OooO0o0 = null;

    public OooO0OO(@NonNull o000O00O.o0000Ooo o0000ooo) {
        this.f7502OooO00o = o0000ooo;
    }

    @Override // androidx.recyclerview.widget.o0ooOOo
    public final void OooO00o(int i, int i2) {
        int i3;
        if (this.f7503OooO0O0 == 1 && i >= (i3 = this.f7504OooO0OO)) {
            int i4 = this.f7505OooO0Oo;
            if (i <= i3 + i4) {
                this.f7505OooO0Oo = i4 + i2;
                this.f7504OooO0OO = Math.min(i, i3);
                return;
            }
        }
        OooO0o0();
        this.f7504OooO0OO = i;
        this.f7505OooO0Oo = i2;
        this.f7503OooO0O0 = 1;
    }

    @Override // androidx.recyclerview.widget.o0ooOOo
    public final void OooO0O0(int i, int i2) {
        int i3;
        if (this.f7503OooO0O0 == 2 && (i3 = this.f7504OooO0OO) >= i && i3 <= i + i2) {
            this.f7505OooO0Oo += i2;
            this.f7504OooO0OO = i;
        } else {
            OooO0o0();
            this.f7504OooO0OO = i;
            this.f7505OooO0Oo = i2;
            this.f7503OooO0O0 = 2;
        }
    }

    @Override // androidx.recyclerview.widget.o0ooOOo
    @SuppressLint({"UnknownNullness"})
    public final void OooO0OO(int i, int i2, Object obj) {
        int i3;
        if (this.f7503OooO0O0 == 3) {
            int i4 = this.f7504OooO0OO;
            int i5 = this.f7505OooO0Oo;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.f7506OooO0o0 == obj) {
                this.f7504OooO0OO = Math.min(i, i4);
                this.f7505OooO0Oo = Math.max(i5 + i4, i3) - this.f7504OooO0OO;
                return;
            }
        }
        OooO0o0();
        this.f7504OooO0OO = i;
        this.f7505OooO0Oo = i2;
        this.f7506OooO0o0 = obj;
        this.f7503OooO0O0 = 3;
    }

    @Override // androidx.recyclerview.widget.o0ooOOo
    public final void OooO0Oo(int i, int i2) {
        OooO0o0();
        this.f7502OooO00o.OooO0Oo(i, i2);
    }

    public final void OooO0o0() {
        int i = this.f7503OooO0O0;
        if (i == 0) {
            return;
        }
        o0ooOOo o0ooooo = this.f7502OooO00o;
        if (i == 1) {
            o0ooooo.OooO00o(this.f7504OooO0OO, this.f7505OooO0Oo);
        } else if (i == 2) {
            o0ooooo.OooO0O0(this.f7504OooO0OO, this.f7505OooO0Oo);
        } else if (i == 3) {
            o0ooooo.OooO0OO(this.f7504OooO0OO, this.f7505OooO0Oo, this.f7506OooO0o0);
        }
        this.f7506OooO0o0 = null;
        this.f7503OooO0O0 = 0;
    }
}
