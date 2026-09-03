package androidx.recyclerview.widget;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO implements o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0ooOOo f8884OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f8885OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f8886OooO0OO = -1;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f8887OooO0Oo = -1;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Object f8888OooO0o0 = null;

    public OooO0OO(@NonNull o0ooOOo o0ooooo2) {
        this.f8884OooO00o = o0ooooo2;
    }

    @Override // androidx.recyclerview.widget.o0ooOOo
    public final void OooO00o(int i, int i2) {
        int i3;
        if (this.f8885OooO0O0 == 1 && i >= (i3 = this.f8886OooO0OO)) {
            int i4 = this.f8887OooO0Oo;
            if (i <= i3 + i4) {
                this.f8887OooO0Oo = i4 + i2;
                this.f8886OooO0OO = Math.min(i, i3);
                return;
            }
        }
        OooO0o0();
        this.f8886OooO0OO = i;
        this.f8887OooO0Oo = i2;
        this.f8885OooO0O0 = 1;
    }

    @Override // androidx.recyclerview.widget.o0ooOOo
    public final void OooO0O0(int i, int i2) {
        int i3;
        if (this.f8885OooO0O0 == 2 && (i3 = this.f8886OooO0OO) >= i && i3 <= i + i2) {
            this.f8887OooO0Oo += i2;
            this.f8886OooO0OO = i;
        } else {
            OooO0o0();
            this.f8886OooO0OO = i;
            this.f8887OooO0Oo = i2;
            this.f8885OooO0O0 = 2;
        }
    }

    @Override // androidx.recyclerview.widget.o0ooOOo
    public final void OooO0OO(int i, int i2) {
        OooO0o0();
        this.f8884OooO00o.OooO0OO(i, i2);
    }

    @Override // androidx.recyclerview.widget.o0ooOOo
    public final void OooO0Oo(int i, int i2, Object obj) {
        int i3;
        if (this.f8885OooO0O0 == 3) {
            int i4 = this.f8886OooO0OO;
            int i5 = this.f8887OooO0Oo;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.f8888OooO0o0 == obj) {
                this.f8886OooO0OO = Math.min(i, i4);
                this.f8887OooO0Oo = Math.max(i5 + i4, i3) - this.f8886OooO0OO;
                return;
            }
        }
        OooO0o0();
        this.f8886OooO0OO = i;
        this.f8887OooO0Oo = i2;
        this.f8888OooO0o0 = obj;
        this.f8885OooO0O0 = 3;
    }

    public final void OooO0o0() {
        int i = this.f8885OooO0O0;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            this.f8884OooO00o.OooO00o(this.f8886OooO0OO, this.f8887OooO0Oo);
        } else if (i == 2) {
            this.f8884OooO00o.OooO0O0(this.f8886OooO0OO, this.f8887OooO0Oo);
        } else if (i == 3) {
            this.f8884OooO00o.OooO0Oo(this.f8886OooO0OO, this.f8887OooO0Oo, this.f8888OooO0o0);
        }
        this.f8888OooO0o0 = null;
        this.f8885OooO0O0 = 0;
    }
}
