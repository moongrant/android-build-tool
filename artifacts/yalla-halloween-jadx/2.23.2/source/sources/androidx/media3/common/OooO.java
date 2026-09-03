package androidx.media3.common;

import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final SparseBooleanArray f6338OooO00o;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final SparseBooleanArray f6339OooO00o = new SparseBooleanArray();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f6340OooO0O0;

        @CanIgnoreReturnValue
        public final void OooO00o(int i) {
            p080o000OoO.o00Oo0.OooO0Oo(!this.f6340OooO0O0);
            this.f6339OooO00o.append(i, true);
        }

        public final OooO OooO0O0() {
            p080o000OoO.o00Oo0.OooO0Oo(!this.f6340OooO0O0);
            this.f6340OooO0O0 = true;
            return new OooO(this.f6339OooO00o);
        }
    }

    public OooO(SparseBooleanArray sparseBooleanArray) {
        this.f6338OooO00o = sparseBooleanArray;
    }

    public final boolean OooO00o(int... iArr) {
        for (int i : iArr) {
            if (this.f6338OooO00o.get(i)) {
                return true;
            }
        }
        return false;
    }

    public final int OooO0O0(int i) {
        p080o000OoO.o00Oo0.OooO0OO(i, OooO0OO());
        return this.f6338OooO00o.keyAt(i);
    }

    public final int OooO0OO() {
        return this.f6338OooO00o.size();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO)) {
            return false;
        }
        OooO oooO = (OooO) obj;
        if (o00.f34910OooO00o >= 24) {
            return this.f6338OooO00o.equals(oooO.f6338OooO00o);
        }
        if (OooO0OO() != oooO.OooO0OO()) {
            return false;
        }
        for (int i = 0; i < OooO0OO(); i++) {
            if (OooO0O0(i) != oooO.OooO0O0(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (o00.f34910OooO00o >= 24) {
            return this.f6338OooO00o.hashCode();
        }
        int iOooO0OO = OooO0OO();
        for (int i = 0; i < OooO0OO(); i++) {
            iOooO0OO = (iOooO0OO * 31) + OooO0O0(i);
        }
        return iOooO0OO;
    }
}
