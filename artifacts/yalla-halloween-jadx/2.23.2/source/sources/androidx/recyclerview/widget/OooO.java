package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0O0 f10574OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f10575OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList f10576OooO0OO = new ArrayList();

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public long f10577OooO00o = 0;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public OooO00o f10578OooO0O0;

        public final void OooO00o(int i) {
            if (i < 64) {
                this.f10577OooO00o &= ~(1 << i);
                return;
            }
            OooO00o oooO00o = this.f10578OooO0O0;
            if (oooO00o != null) {
                oooO00o.OooO00o(i - 64);
            }
        }

        public final int OooO0O0(int i) {
            OooO00o oooO00o = this.f10578OooO0O0;
            if (oooO00o == null) {
                return i >= 64 ? Long.bitCount(this.f10577OooO00o) : Long.bitCount(this.f10577OooO00o & ((1 << i) - 1));
            }
            if (i < 64) {
                return Long.bitCount(this.f10577OooO00o & ((1 << i) - 1));
            }
            return Long.bitCount(this.f10577OooO00o) + oooO00o.OooO0O0(i - 64);
        }

        public final void OooO0OO() {
            if (this.f10578OooO0O0 == null) {
                this.f10578OooO0O0 = new OooO00o();
            }
        }

        public final boolean OooO0Oo(int i) {
            if (i < 64) {
                return (this.f10577OooO00o & (1 << i)) != 0;
            }
            OooO0OO();
            return this.f10578OooO0O0.OooO0Oo(i - 64);
        }

        public final boolean OooO0o(int i) {
            if (i >= 64) {
                OooO0OO();
                return this.f10578OooO0O0.OooO0o(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f10577OooO00o;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.f10577OooO00o = j3;
            long j4 = j - 1;
            this.f10577OooO00o = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            OooO00o oooO00o = this.f10578OooO0O0;
            if (oooO00o != null) {
                if (oooO00o.OooO0Oo(0)) {
                    OooO0oo(63);
                }
                this.f10578OooO0O0.OooO0o(0);
            }
            return z;
        }

        public final void OooO0o0(int i, boolean z) {
            if (i >= 64) {
                OooO0OO();
                this.f10578OooO0O0.OooO0o0(i - 64, z);
                return;
            }
            long j = this.f10577OooO00o;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.f10577OooO00o = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                OooO0oo(i);
            } else {
                OooO00o(i);
            }
            if (z2 || this.f10578OooO0O0 != null) {
                OooO0OO();
                this.f10578OooO0O0.OooO0o0(0, z2);
            }
        }

        public final void OooO0oO() {
            this.f10577OooO00o = 0L;
            OooO00o oooO00o = this.f10578OooO0O0;
            if (oooO00o != null) {
                oooO00o.OooO0oO();
            }
        }

        public final void OooO0oo(int i) {
            if (i < 64) {
                this.f10577OooO00o |= 1 << i;
            } else {
                OooO0OO();
                this.f10578OooO0O0.OooO0oo(i - 64);
            }
        }

        public final String toString() {
            if (this.f10578OooO0O0 == null) {
                return Long.toBinaryString(this.f10577OooO00o);
            }
            return this.f10578OooO0O0.toString() + "xx" + Long.toBinaryString(this.f10577OooO00o);
        }
    }

    public interface OooO0O0 {
    }

    public OooO(RecyclerView.OooO oooO) {
        this.f10574OooO00o = oooO;
    }

    public final void OooO(View view) {
        this.f10576OooO0OO.add(view);
        RecyclerView.OooO oooO = (RecyclerView.OooO) this.f10574OooO00o;
        oooO.getClass();
        RecyclerView.o0O0O00 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
        }
    }

    public final void OooO00o(View view, int i, boolean z) {
        OooO0O0 oooO0O0 = this.f10574OooO00o;
        int iOooO00o = i < 0 ? ((RecyclerView.OooO) oooO0O0).OooO00o() : OooO0o(i);
        this.f10575OooO0O0.OooO0o0(iOooO00o, z);
        if (z) {
            OooO(view);
        }
        RecyclerView recyclerView = RecyclerView.this;
        recyclerView.addView(view, iOooO00o);
        recyclerView.dispatchChildAttached(view);
    }

    public final void OooO0O0(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        OooO0O0 oooO0O0 = this.f10574OooO00o;
        int iOooO00o = i < 0 ? ((RecyclerView.OooO) oooO0O0).OooO00o() : OooO0o(i);
        this.f10575OooO0O0.OooO0o0(iOooO00o, z);
        if (z) {
            OooO(view);
        }
        RecyclerView.OooO oooO = (RecyclerView.OooO) oooO0O0;
        oooO.getClass();
        RecyclerView.o0O0O00 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        RecyclerView recyclerView = RecyclerView.this;
        if (childViewHolderInt != null) {
            if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(childViewHolderInt);
                throw new IllegalArgumentException(OooO0o.OooO00o(recyclerView, sb));
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "reAttach " + childViewHolderInt);
            }
            childViewHolderInt.clearTmpDetachFlag();
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(iOooO00o);
            throw new IllegalArgumentException(OooO0o.OooO00o(recyclerView, sb2));
        }
        recyclerView.attachViewToParent(view, iOooO00o, layoutParams);
    }

    public final void OooO0OO(int i) {
        int iOooO0o = OooO0o(i);
        this.f10575OooO0O0.OooO0o(iOooO0o);
        RecyclerView.OooO oooO = (RecyclerView.OooO) this.f10574OooO00o;
        View childAt = RecyclerView.this.getChildAt(iOooO0o);
        RecyclerView recyclerView = RecyclerView.this;
        if (childAt != null) {
            RecyclerView.o0O0O00 childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
            if (childViewHolderInt != null) {
                if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(childViewHolderInt);
                    throw new IllegalArgumentException(OooO0o.OooO00o(recyclerView, sb));
                }
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "tmpDetach " + childViewHolderInt);
                }
                childViewHolderInt.addFlags(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            }
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(iOooO0o);
            throw new IllegalArgumentException(OooO0o.OooO00o(recyclerView, sb2));
        }
        recyclerView.detachViewFromParent(iOooO0o);
    }

    public final View OooO0Oo(int i) {
        return RecyclerView.this.getChildAt(OooO0o(i));
    }

    public final int OooO0o(int i) {
        if (i < 0) {
            return -1;
        }
        int iOooO00o = ((RecyclerView.OooO) this.f10574OooO00o).OooO00o();
        int i2 = i;
        while (i2 < iOooO00o) {
            OooO00o oooO00o = this.f10575OooO0O0;
            int iOooO0O0 = i - (i2 - oooO00o.OooO0O0(i2));
            if (iOooO0O0 == 0) {
                while (oooO00o.OooO0Oo(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iOooO0O0;
        }
        return -1;
    }

    public final int OooO0o0() {
        return ((RecyclerView.OooO) this.f10574OooO00o).OooO00o() - this.f10576OooO0OO.size();
    }

    public final View OooO0oO(int i) {
        return RecyclerView.this.getChildAt(i);
    }

    public final int OooO0oo() {
        return ((RecyclerView.OooO) this.f10574OooO00o).OooO00o();
    }

    public final int OooOO0(View view) {
        int iIndexOfChild = RecyclerView.this.indexOfChild(view);
        if (iIndexOfChild == -1) {
            return -1;
        }
        OooO00o oooO00o = this.f10575OooO0O0;
        if (oooO00o.OooO0Oo(iIndexOfChild)) {
            return -1;
        }
        return iIndexOfChild - oooO00o.OooO0O0(iIndexOfChild);
    }

    public final boolean OooOO0O(View view) {
        return this.f10576OooO0OO.contains(view);
    }

    public final void OooOO0o(int i) {
        int iOooO0o = OooO0o(i);
        RecyclerView.OooO oooO = (RecyclerView.OooO) this.f10574OooO00o;
        View childAt = RecyclerView.this.getChildAt(iOooO0o);
        if (childAt == null) {
            return;
        }
        if (this.f10575OooO0O0.OooO0o(iOooO0o)) {
            OooOOO0(childAt);
        }
        oooO.OooO0O0(iOooO0o);
    }

    public final void OooOOO0(View view) {
        if (this.f10576OooO0OO.remove(view)) {
            RecyclerView.OooO oooO = (RecyclerView.OooO) this.f10574OooO00o;
            oooO.getClass();
            RecyclerView.o0O0O00 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
        }
    }

    public final String toString() {
        return this.f10575OooO0O0.toString() + ", hidden list:" + this.f10576OooO0OO.size();
    }
}
