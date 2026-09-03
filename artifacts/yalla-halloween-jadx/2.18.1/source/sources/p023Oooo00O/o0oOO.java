package p023Oooo00O;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import p023Oooo00O.o0O0O00;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o0oOO<V extends o0O0O00> implements o00OOO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000000 f1226OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public V f1227OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public V f1228OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public V f1229OooO0Oo;

    public static final class OooO00o implements o000000 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o000OO f1230OooO00o;

        public OooO00o(o000OO o000oo2) {
            this.f1230OooO00o = o000oo2;
        }

        @Override // p023Oooo00O.o000000
        @NotNull
        public final o000OO get(int i) {
            return this.f1230OooO00o;
        }
    }

    public o0oOO(@NotNull o000000 anims) {
        Intrinsics.checkNotNullParameter(anims, "anims");
        this.f1226OooO00o = anims;
    }

    @Override // p023Oooo00O.o00OOO00
    public final /* synthetic */ boolean OooO00o() {
        return false;
    }

    @Override // p023Oooo00O.o00OOO00
    @NotNull
    public final V OooO0O0(long j, @NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.f1228OooO0OO == null) {
            Intrinsics.checkNotNullParameter(initialVelocity, "<this>");
            this.f1228OooO0OO = (V) initialVelocity.OooO0OO();
        }
        V v = this.f1228OooO0OO;
        if (v == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            v = null;
        }
        int iOooO0O0 = v.OooO0O0();
        for (int i = 0; i < iOooO0O0; i++) {
            V v2 = this.f1228OooO0OO;
            if (v2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
                v2 = null;
            }
            v2.OooO0o0(i, this.f1226OooO00o.get(i).OooO0O0(j, initialValue.OooO00o(i), targetValue.OooO00o(i), initialVelocity.OooO00o(i)));
        }
        V v3 = this.f1228OooO0OO;
        if (v3 != null) {
            return v3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
        return null;
    }

    @Override // p023Oooo00O.o00OOO00
    public final long OooO0Oo(@NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        Iterator<Integer> it = RangesKt.until(0, initialValue.OooO0O0()).iterator();
        long jMax = 0;
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            jMax = Math.max(jMax, this.f1226OooO00o.get(iNextInt).OooO0OO(initialValue.OooO00o(iNextInt), targetValue.OooO00o(iNextInt), initialVelocity.OooO00o(iNextInt)));
        }
        return jMax;
    }

    @Override // p023Oooo00O.o00OOO00
    @NotNull
    public final V OooO0o0(@NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.f1229OooO0Oo == null) {
            Intrinsics.checkNotNullParameter(initialVelocity, "<this>");
            this.f1229OooO0Oo = (V) initialVelocity.OooO0OO();
        }
        V v = this.f1229OooO0Oo;
        if (v == null) {
            Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
            v = null;
        }
        int iOooO0O0 = v.OooO0O0();
        for (int i = 0; i < iOooO0O0; i++) {
            V v2 = this.f1229OooO0Oo;
            if (v2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
                v2 = null;
            }
            v2.OooO0o0(i, this.f1226OooO00o.get(i).OooO0Oo(initialValue.OooO00o(i), targetValue.OooO00o(i), initialVelocity.OooO00o(i)));
        }
        V v3 = this.f1229OooO0Oo;
        if (v3 != null) {
            return v3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
        return null;
    }

    @Override // p023Oooo00O.o00OOO00
    @NotNull
    public final V OooO0oO(long j, @NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.f1227OooO0O0 == null) {
            Intrinsics.checkNotNullParameter(initialValue, "<this>");
            this.f1227OooO0O0 = (V) initialValue.OooO0OO();
        }
        V v = this.f1227OooO0O0;
        if (v == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            v = null;
        }
        int iOooO0O0 = v.OooO0O0();
        for (int i = 0; i < iOooO0O0; i++) {
            V v2 = this.f1227OooO0O0;
            if (v2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                v2 = null;
            }
            v2.OooO0o0(i, this.f1226OooO00o.get(i).OooO0o0(j, initialValue.OooO00o(i), targetValue.OooO00o(i), initialVelocity.OooO00o(i)));
        }
        V v3 = this.f1227OooO0O0;
        if (v3 != null) {
            return v3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("valueVector");
        return null;
    }

    public o0oOO(@NotNull o000OO anim) {
        Intrinsics.checkNotNullParameter(anim, "anim");
        OooO00o anims = new OooO00o(anim);
        Intrinsics.checkNotNullParameter(anims, "anims");
        this.f1226OooO00o = anims;
    }
}
