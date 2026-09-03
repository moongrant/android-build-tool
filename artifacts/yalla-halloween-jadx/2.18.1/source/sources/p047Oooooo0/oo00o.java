package p047Oooooo0;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0OOo000;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public abstract class oo00o {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f4149OooO0o0 = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public o00O0O0 f4150OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f4151OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f4152OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f4153OooO0Oo;

    public static final class OooO00o {
        public final Object OooO00o(@Nullable Function1 function1, @NotNull Function0 block) {
            oo00o o0o00000;
            Intrinsics.checkNotNullParameter(block, "block");
            if (function1 == null) {
                return block.invoke();
            }
            oo00o oo00oVarOooO00o = oo0o0O0.f4157OooO0O0.OooO00o();
            if (oo00oVarOooO00o == null || (oo00oVarOooO00o instanceof o00O000o)) {
                o0o00000 = new o0O00000(oo00oVarOooO00o instanceof o00O000o ? (o00O000o) oo00oVarOooO00o : null, function1, null, true, false);
            } else {
                if (function1 == null) {
                    return block.invoke();
                }
                o0o00000 = oo00oVarOooO00o.OooOOoo(function1);
            }
            try {
                oo00o oo00oVarOooO = o0o00000.OooO();
                try {
                    Object objInvoke = block.invoke();
                    o0o00000.OooOOOo(oo00oVarOooO);
                    o0o00000.OooO0OO();
                    return objInvoke;
                } catch (Throwable th) {
                    o0o00000.OooOOOo(oo00oVarOooO);
                    throw th;
                }
            } catch (Throwable th2) {
                o0o00000.OooO0OO();
                throw th2;
            }
        }
    }

    public oo00o(int i, o00O0O0 o00o0o0) {
        int iOooO00o;
        int i2;
        int iOooO00o2;
        this.f4150OooO00o = o00o0o0;
        this.f4151OooO0O0 = i;
        if (i != 0) {
            o00O0O0 invalid = OooO0o0();
            Function1<o00O0O0, Unit> function1 = oo0o0O0.f4156OooO00o;
            Intrinsics.checkNotNullParameter(invalid, "invalid");
            int[] iArr = invalid.f4080Oooo;
            if (iArr != null) {
                i = iArr[0];
            } else {
                long j = invalid.f4082Oooo0oO;
                if (j != 0) {
                    i2 = invalid.f4083Oooo0oo;
                    iOooO00o2 = o00O0O0O.OooO00o(j);
                } else {
                    long j2 = invalid.f4081Oooo0o;
                    if (j2 != 0) {
                        i2 = invalid.f4083Oooo0oo + 64;
                        iOooO00o2 = o00O0O0O.OooO00o(j2);
                    }
                }
                i = i2 + iOooO00o2;
            }
            synchronized (oo0o0O0.f4158OooO0OO) {
                iOooO00o = oo0o0O0.f4160OooO0o.OooO00o(i);
            }
        } else {
            iOooO00o = -1;
        }
        this.f4153OooO0Oo = iOooO00o;
    }

    @PublishedApi
    @Nullable
    public final oo00o OooO() {
        o0OOo000<oo00o> o0ooo001 = oo0o0O0.f4157OooO0O0;
        oo00o oo00oVarOooO00o = o0ooo001.OooO00o();
        o0ooo001.OooO0O0(this);
        return oo00oVarOooO00o;
    }

    public final void OooO00o() {
        synchronized (oo0o0O0.f4158OooO0OO) {
            OooO0O0();
            OooOOOO();
            Unit unit = Unit.INSTANCE;
        }
    }

    public void OooO0O0() {
        oo0o0O0.f4159OooO0Oo = oo0o0O0.f4159OooO0Oo.OooO0O0(OooO0Oo());
    }

    public void OooO0OO() {
        this.f4152OooO0OO = true;
        synchronized (oo0o0O0.f4158OooO0OO) {
            OooOOO();
            Unit unit = Unit.INSTANCE;
        }
    }

    public int OooO0Oo() {
        return this.f4151OooO0O0;
    }

    @Nullable
    public abstract Function1<Object, Unit> OooO0o();

    @NotNull
    public o00O0O0 OooO0o0() {
        return this.f4150OooO00o;
    }

    public abstract boolean OooO0oO();

    @Nullable
    public abstract Function1<Object, Unit> OooO0oo();

    public abstract void OooOO0(@NotNull oo00o oo00oVar);

    public abstract void OooOO0O(@NotNull oo00o oo00oVar);

    public abstract void OooOO0o();

    public final void OooOOO() {
        int i = this.f4153OooO0Oo;
        if (i >= 0) {
            oo0o0O0.OooOOoo(i);
            this.f4153OooO0Oo = -1;
        }
    }

    public abstract void OooOOO0(@NotNull o0oOOo o0oooo2);

    public void OooOOOO() {
        OooOOO();
    }

    @PublishedApi
    public final void OooOOOo(@Nullable oo00o oo00oVar) {
        oo0o0O0.f4157OooO0O0.OooO0O0(oo00oVar);
    }

    public void OooOOo(@NotNull o00O0O0 o00o0o0) {
        Intrinsics.checkNotNullParameter(o00o0o0, "<set-?>");
        this.f4150OooO00o = o00o0o0;
    }

    public void OooOOo0(int i) {
        this.f4151OooO0O0 = i;
    }

    @NotNull
    public abstract oo00o OooOOoo(@Nullable Function1<Object, Unit> function1);
}
