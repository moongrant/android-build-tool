package p047Oooooo0;

import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o00O00 extends o00O000o {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f4059OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final o00O000o f4060OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00(int i, @NotNull o00O0O0 invalid, @Nullable Function1<Object, Unit> function1, @Nullable Function1<Object, Unit> function2, @NotNull o00O000o parent) {
        super(i, invalid, function1, function2);
        Intrinsics.checkNotNullParameter(invalid, "invalid");
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f4060OooOOO0 = parent;
        parent.OooOO0(this);
    }

    @Override // p047Oooooo0.o00O000o, p047Oooooo0.oo00o
    public final void OooO0OO() {
        if (this.f4152OooO0OO) {
            return;
        }
        super.OooO0OO();
        if (this.f4059OooOOO) {
            return;
        }
        this.f4059OooOOO = true;
        this.f4060OooOOO0.OooOO0O(this);
    }

    @Override // p047Oooooo0.o00O000o
    @NotNull
    public final o00O0 OooOo0() {
        o00O000o o00o000o2 = this.f4060OooOOO0;
        if (o00o000o2.f4071OooOO0o || o00o000o2.f4152OooO0OO) {
            return new o00O0.OooO00o(this);
        }
        Set<o0oOOo> set = this.f4068OooO0oo;
        int i = this.f4151OooO0O0;
        Map<o0O0o, ? extends o0O0o> mapOooO0OO = set != null ? oo0o0O0.OooO0OO(o00o000o2, this, o00o000o2.OooO0o0()) : null;
        Object obj = oo0o0O0.f4158OooO0OO;
        synchronized (obj) {
            oo0o0O0.OooO0Oo(this);
            if (set == null || set.size() == 0) {
                OooO00o();
            } else {
                o00O0 o00o0OooOo0o = OooOo0o(this.f4060OooOOO0.OooO0Oo(), mapOooO0OO, this.f4060OooOOO0.OooO0o0());
                if (!Intrinsics.areEqual(o00o0OooOo0o, o00O0.OooO0O0.f4058OooO00o)) {
                    return o00o0OooOo0o;
                }
                Set<o0oOOo> setOooOo0O = this.f4060OooOOO0.OooOo0O();
                if (setOooOo0O == null) {
                    setOooOo0O = new HashSet<>();
                    this.f4060OooOOO0.OooOoO0(setOooOo0O);
                }
                setOooOo0O.addAll(set);
            }
            if (this.f4060OooOOO0.OooO0Oo() < i) {
                this.f4060OooOOO0.OooOo00();
            }
            o00O000o o00o000o3 = this.f4060OooOOO0;
            o00o000o3.OooOOo(o00o000o3.OooO0o0().OooO0O0(i).OooO00o(this.f4065OooO));
            this.f4060OooOOO0.OooOo(i);
            o00O000o o00o000o4 = this.f4060OooOOO0;
            int i2 = this.f4153OooO0Oo;
            this.f4153OooO0Oo = -1;
            Objects.requireNonNull(o00o000o4);
            if (i2 >= 0) {
                o00o000o4.f4069OooOO0 = ArraysKt.plus(o00o000o4.f4069OooOO0, i2);
            }
            o00O000o o00o000o5 = this.f4060OooOOO0;
            o00O0O0 snapshots = this.f4065OooO;
            Objects.requireNonNull(o00o000o5);
            Intrinsics.checkNotNullParameter(snapshots, "snapshots");
            synchronized (obj) {
                o00o000o5.f4065OooO = o00o000o5.f4065OooO.OooO0o0(snapshots);
                Unit unit = Unit.INSTANCE;
                o00O000o o00o000o6 = this.f4060OooOOO0;
                int[] handles = this.f4069OooOO0;
                Objects.requireNonNull(o00o000o6);
                Intrinsics.checkNotNullParameter(handles, "handles");
                if (!(handles.length == 0)) {
                    int[] iArr = o00o000o6.f4069OooOO0;
                    if (iArr.length == 0) {
                        o00o000o6.f4069OooOO0 = handles;
                    } else {
                        o00o000o6.f4069OooOO0 = ArraysKt.plus(iArr, handles);
                    }
                }
            }
            this.f4071OooOO0o = true;
            if (!this.f4059OooOOO) {
                this.f4059OooOOO = true;
                this.f4060OooOOO0.OooOO0O(this);
            }
            return o00O0.OooO0O0.f4058OooO00o;
        }
    }
}
