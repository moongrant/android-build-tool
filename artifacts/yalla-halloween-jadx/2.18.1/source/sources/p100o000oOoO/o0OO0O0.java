package p100o000oOoO;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import p046Oooooo.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO0O0 implements o0Oo0oo, Iterable<Object>, KMappedMarker {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f29600Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f29602Oooo0oO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f29605OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f29606OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f29607OoooO0O;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public int[] f29601Oooo0o = new int[0];

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public Object[] f29603Oooo0oo = new Object[0];

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public ArrayList<o00oOoo> f29604OoooO = new ArrayList<>();

    public final int OooO00o(@NotNull o00oOoo anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        if (!(!this.f29605OoooO0)) {
            oo0o0O0.OooO0Oo("Use active SlotWriter to determine anchor location instead".toString());
            throw null;
        }
        if (anchor.OooO00o()) {
            return anchor.f29511OooO00o;
        }
        throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
    }

    public final boolean OooO0O0(int i, @NotNull o00oOoo anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        if (!(!this.f29605OoooO0)) {
            oo0o0O0.OooO0Oo("Writer is active".toString());
            throw null;
        }
        if (!(i >= 0 && i < this.f29602Oooo0oO)) {
            oo0o0O0.OooO0Oo("Invalid group index".toString());
            throw null;
        }
        if (OooO0oO(anchor)) {
            int iOooO0Oo = o0OOooO0.OooO0Oo(this.f29601Oooo0o, i) + i;
            int i2 = anchor.f29511OooO00o;
            if (i <= i2 && i2 < iOooO0Oo) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final o0OO0 OooO0OO() {
        if (this.f29605OoooO0) {
            throw new IllegalStateException("Cannot read while a writer is pending".toString());
        }
        this.f29606OoooO00++;
        return new o0OO0(this);
    }

    @NotNull
    public final o0OO0o00 OooO0o0() {
        if (!(!this.f29605OoooO0)) {
            oo0o0O0.OooO0Oo("Cannot start a writer when another writer is pending".toString());
            throw null;
        }
        if (!(this.f29606OoooO00 <= 0)) {
            oo0o0O0.OooO0Oo("Cannot start a writer when a reader is pending".toString());
            throw null;
        }
        this.f29605OoooO0 = true;
        this.f29607OoooO0O++;
        return new o0OO0o00(this);
    }

    public final boolean OooO0oO(@NotNull o00oOoo anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        if (!anchor.OooO00o()) {
            return false;
        }
        int iOooOOo0 = o0OOooO0.OooOOo0(this.f29604OoooO, anchor.f29511OooO00o, this.f29602Oooo0oO);
        return iOooOOo0 >= 0 && Intrinsics.areEqual(this.f29604OoooO.get(iOooOOo0), anchor);
    }

    public final void OooO0oo(@NotNull int[] groups, int i, @NotNull Object[] slots, int i2, @NotNull ArrayList<o00oOoo> anchors) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        Intrinsics.checkNotNullParameter(slots, "slots");
        Intrinsics.checkNotNullParameter(anchors, "anchors");
        this.f29601Oooo0o = groups;
        this.f29602Oooo0oO = i;
        this.f29603Oooo0oo = slots;
        this.f29600Oooo = i2;
        this.f29604OoooO = anchors;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<Object> iterator() {
        return new oo00oO(this, 0, this.f29602Oooo0oO);
    }
}
