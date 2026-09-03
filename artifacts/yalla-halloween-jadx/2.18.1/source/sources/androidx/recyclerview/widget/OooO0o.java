package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0O0 f8889OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f8890OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<View> f8891OooO0OO = new ArrayList();

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public long f8892OooO00o = 0;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public OooO00o f8893OooO0O0;

        public final void OooO00o(int i) {
            if (i < 64) {
                this.f8892OooO00o &= ~(1 << i);
                return;
            }
            OooO00o oooO00o = this.f8893OooO0O0;
            if (oooO00o != null) {
                oooO00o.OooO00o(i - 64);
            }
        }

        public final int OooO0O0(int i) {
            OooO00o oooO00o = this.f8893OooO0O0;
            if (oooO00o == null) {
                return i >= 64 ? Long.bitCount(this.f8892OooO00o) : Long.bitCount(this.f8892OooO00o & ((1 << i) - 1));
            }
            if (i < 64) {
                return Long.bitCount(this.f8892OooO00o & ((1 << i) - 1));
            }
            return Long.bitCount(this.f8892OooO00o) + oooO00o.OooO0O0(i - 64);
        }

        public final void OooO0OO() {
            if (this.f8893OooO0O0 == null) {
                this.f8893OooO0O0 = new OooO00o();
            }
        }

        public final boolean OooO0Oo(int i) {
            if (i < 64) {
                return (this.f8892OooO00o & (1 << i)) != 0;
            }
            OooO0OO();
            return this.f8893OooO0O0.OooO0Oo(i - 64);
        }

        public final boolean OooO0o(int i) {
            if (i >= 64) {
                OooO0OO();
                return this.f8893OooO0O0.OooO0o(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f8892OooO00o;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.f8892OooO00o = j3;
            long j4 = j - 1;
            this.f8892OooO00o = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            OooO00o oooO00o = this.f8893OooO0O0;
            if (oooO00o != null) {
                if (oooO00o.OooO0Oo(0)) {
                    OooO0oo(63);
                }
                this.f8893OooO0O0.OooO0o(0);
            }
            return z;
        }

        public final void OooO0o0(int i, boolean z) {
            if (i >= 64) {
                OooO0OO();
                this.f8893OooO0O0.OooO0o0(i - 64, z);
                return;
            }
            long j = this.f8892OooO00o;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.f8892OooO00o = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                OooO0oo(i);
            } else {
                OooO00o(i);
            }
            if (z2 || this.f8893OooO0O0 != null) {
                OooO0OO();
                this.f8893OooO0O0.OooO0o0(0, z2);
            }
        }

        public final void OooO0oO() {
            this.f8892OooO00o = 0L;
            OooO00o oooO00o = this.f8893OooO0O0;
            if (oooO00o != null) {
                oooO00o.OooO0oO();
            }
        }

        public final void OooO0oo(int i) {
            if (i < 64) {
                this.f8892OooO00o |= 1 << i;
            } else {
                OooO0OO();
                this.f8893OooO0O0.OooO0oo(i - 64);
            }
        }

        public final String toString() {
            if (this.f8893OooO0O0 == null) {
                return Long.toBinaryString(this.f8892OooO00o);
            }
            return this.f8893OooO0O0.toString() + "xx" + Long.toBinaryString(this.f8892OooO00o);
        }
    }

    public interface OooO0O0 {
    }

    public OooO0o(OooO0O0 oooO0O0) {
        this.f8889OooO00o = oooO0O0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<android.view.View>] */
    public final void OooO(View view) {
        this.f8891OooO0OO.add(view);
        RecyclerView.OooO oooO = (RecyclerView.OooO) this.f8889OooO00o;
        Objects.requireNonNull(oooO);
        RecyclerView.oo0o0Oo childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
        }
    }

    public final void OooO00o(View view, int i, boolean z) {
        int iOooO0O0 = i < 0 ? ((RecyclerView.OooO) this.f8889OooO00o).OooO0O0() : OooO0o(i);
        this.f8890OooO0O0.OooO0o0(iOooO0O0, z);
        if (z) {
            OooO(view);
        }
        RecyclerView.OooO oooO = (RecyclerView.OooO) this.f8889OooO00o;
        RecyclerView.this.addView(view, iOooO0O0);
        RecyclerView.this.dispatchChildAttached(view);
    }

    public final void OooO0O0(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int iOooO0O0 = i < 0 ? ((RecyclerView.OooO) this.f8889OooO00o).OooO0O0() : OooO0o(i);
        this.f8890OooO0O0.OooO0o0(iOooO0O0, z);
        if (z) {
            OooO(view);
        }
        RecyclerView.OooO oooO = (RecyclerView.OooO) this.f8889OooO00o;
        Objects.requireNonNull(oooO);
        RecyclerView.oo0o0Oo childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called attach on a child which is not detached: ");
                sb.append(childViewHolderInt);
                throw new IllegalArgumentException(Oooo0.OooOO0O.OooO00o(RecyclerView.this, sb));
            }
            childViewHolderInt.clearTmpDetachFlag();
        }
        RecyclerView.this.attachViewToParent(view, iOooO0O0, layoutParams);
    }

    public final void OooO0OO(int i) {
        RecyclerView.oo0o0Oo childViewHolderInt;
        int iOooO0o = OooO0o(i);
        this.f8890OooO0O0.OooO0o(iOooO0o);
        RecyclerView.OooO oooO = (RecyclerView.OooO) this.f8889OooO00o;
        View viewOooO00o = oooO.OooO00o(iOooO0o);
        if (viewOooO00o != null && (childViewHolderInt = RecyclerView.getChildViewHolderInt(viewOooO00o)) != null) {
            if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                StringBuilder sb = new StringBuilder();
                sb.append("called detach on an already detached child ");
                sb.append(childViewHolderInt);
                throw new IllegalArgumentException(Oooo0.OooOO0O.OooO00o(RecyclerView.this, sb));
            }
            childViewHolderInt.addFlags(256);
        }
        RecyclerView.this.detachViewFromParent(iOooO0o);
    }

    public final View OooO0Oo(int i) {
        return ((RecyclerView.OooO) this.f8889OooO00o).OooO00o(OooO0o(i));
    }

    public final int OooO0o(int i) {
        if (i < 0) {
            return -1;
        }
        int iOooO0O0 = ((RecyclerView.OooO) this.f8889OooO00o).OooO0O0();
        int i2 = i;
        while (i2 < iOooO0O0) {
            int iOooO0O1 = i - (i2 - this.f8890OooO0O0.OooO0O0(i2));
            if (iOooO0O1 == 0) {
                while (this.f8890OooO0O0.OooO0Oo(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iOooO0O1;
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<android.view.View>] */
    public final int OooO0o0() {
        return ((RecyclerView.OooO) this.f8889OooO00o).OooO0O0() - this.f8891OooO0OO.size();
    }

    public final View OooO0oO(int i) {
        return ((RecyclerView.OooO) this.f8889OooO00o).OooO00o(i);
    }

    public final int OooO0oo() {
        return ((RecyclerView.OooO) this.f8889OooO00o).OooO0O0();
    }

    public final int OooOO0(View view) {
        int iOooO0OO = ((RecyclerView.OooO) this.f8889OooO00o).OooO0OO(view);
        if (iOooO0OO == -1 || this.f8890OooO0O0.OooO0Oo(iOooO0OO)) {
            return -1;
        }
        return iOooO0OO - this.f8890OooO0O0.OooO0O0(iOooO0OO);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<android.view.View>] */
    public final boolean OooOO0O(View view) {
        return this.f8891OooO0OO.contains(view);
    }

    public final void OooOO0o(int i) {
        int iOooO0o = OooO0o(i);
        View viewOooO00o = ((RecyclerView.OooO) this.f8889OooO00o).OooO00o(iOooO0o);
        if (viewOooO00o == null) {
            return;
        }
        if (this.f8890OooO0O0.OooO0o(iOooO0o)) {
            OooOOO0(viewOooO00o);
        }
        ((RecyclerView.OooO) this.f8889OooO00o).OooO0Oo(iOooO0o);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<android.view.View>] */
    public final boolean OooOOO0(View view) {
        if (!this.f8891OooO0OO.remove(view)) {
            return false;
        }
        RecyclerView.OooO oooO = (RecyclerView.OooO) this.f8889OooO00o;
        Objects.requireNonNull(oooO);
        RecyclerView.oo0o0Oo childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt == null) {
            return true;
        }
        childViewHolderInt.onLeftHiddenState(RecyclerView.this);
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList, java.util.List<android.view.View>] */
    public final String toString() {
        return this.f8890OooO0O0.toString() + ", hidden list:" + this.f8891OooO0OO.size();
    }
}
