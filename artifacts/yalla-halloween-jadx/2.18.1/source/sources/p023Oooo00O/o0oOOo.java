package p023Oooo00O;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import p023Oooo00O.o0O0O00;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o0oOOo<V extends o0O0O00> implements o00Oo00<V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Map<Integer, Pair<V, o0000oo>> f1231OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f1232OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f1233OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public V f1234OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public V f1235OooO0o0;

    public o0oOOo(@NotNull Map keyframes, int i) {
        Intrinsics.checkNotNullParameter(keyframes, "keyframes");
        this.f1231OooO00o = keyframes;
        this.f1232OooO0O0 = i;
        this.f1233OooO0OO = 0;
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
        long jCoerceIn = RangesKt.coerceIn((j / 1000000) - ((long) OooO0OO()), 0L, OooO0o());
        if (jCoerceIn <= 0) {
            return initialVelocity;
        }
        o0O0O00 o0o0o00OooO00o = o0o0Oo.OooO00o(this, jCoerceIn - 1, initialValue, targetValue, initialVelocity);
        o0O0O00 o0o0o00OooO00o2 = o0o0Oo.OooO00o(this, jCoerceIn, initialValue, targetValue, initialVelocity);
        OooO0oo(initialValue);
        int i = 0;
        int iOooO0O0 = o0o0o00OooO00o.OooO0O0();
        while (true) {
            V v = null;
            if (i >= iOooO0O0) {
                break;
            }
            V v2 = this.f1235OooO0o0;
            if (v2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            } else {
                v = v2;
            }
            v.OooO0o0(i, (o0o0o00OooO00o.OooO00o(i) - o0o0o00OooO00o2.OooO00o(i)) * 1000.0f);
            i++;
        }
        V v3 = this.f1235OooO0o0;
        if (v3 != null) {
            return v3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
        return null;
    }

    @Override // p023Oooo00O.o00Oo00
    public final int OooO0OO() {
        return this.f1233OooO0OO;
    }

    @Override // p023Oooo00O.o00OOO00
    public final /* synthetic */ long OooO0Oo(o0O0O00 o0o0o00, o0O0O00 o0o0o01, o0O0O00 o0o0o02) {
        return o00OOOOo.OooO00o(this, o0o0o00, o0o0o01, o0o0o02);
    }

    @Override // p023Oooo00O.o00Oo00
    public final int OooO0o() {
        return this.f1232OooO0O0;
    }

    @Override // p023Oooo00O.o00OOO00
    public final /* synthetic */ o0O0O00 OooO0o0(o0O0O00 o0o0o00, o0O0O00 o0o0o01, o0O0O00 o0o0o02) {
        return o00OO.OooO00o(this, o0o0o00, o0o0o01, o0o0o02);
    }

    @Override // p023Oooo00O.o00OOO00
    @NotNull
    public final V OooO0oO(long j, @NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        int iCoerceIn = (int) RangesKt.coerceIn((j / 1000000) - ((long) this.f1233OooO0OO), 0L, this.f1232OooO0O0);
        if (this.f1231OooO00o.containsKey(Integer.valueOf(iCoerceIn))) {
            return (V) ((Pair) MapsKt.getValue(this.f1231OooO00o, Integer.valueOf(iCoerceIn))).getFirst();
        }
        int i = this.f1232OooO0O0;
        if (iCoerceIn >= i) {
            return targetValue;
        }
        if (iCoerceIn <= 0) {
            return initialValue;
        }
        o0000oo second = o0000O0.OooO00o.f1052OooO00o;
        int i2 = 0;
        V first = initialValue;
        int i3 = 0;
        for (Map.Entry<Integer, Pair<V, o0000oo>> entry : this.f1231OooO00o.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            Pair<V, o0000oo> value = entry.getValue();
            if (iCoerceIn > iIntValue && iIntValue >= i3) {
                first = value.getFirst();
                second = value.getSecond();
                i3 = iIntValue;
            } else if (iCoerceIn < iIntValue && iIntValue <= i) {
                targetValue = value.getFirst();
                i = iIntValue;
            }
        }
        float fOooO00o = second.OooO00o((iCoerceIn - i3) / (i - i3));
        OooO0oo(initialValue);
        int iOooO0O0 = first.OooO0O0();
        while (true) {
            V v = null;
            if (i2 >= iOooO0O0) {
                break;
            }
            V v2 = this.f1234OooO0Oo;
            if (v2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            } else {
                v = v2;
            }
            float fOooO00o2 = first.OooO00o(i2);
            float fOooO00o3 = targetValue.OooO00o(i2);
            o00OO0O0<Float, o0Oo0oo> o00oo0o1 = oo0O.f1293OooO00o;
            v.OooO0o0(i2, (fOooO00o3 * fOooO00o) + ((1 - fOooO00o) * fOooO00o2));
            i2++;
        }
        V v3 = this.f1234OooO0Oo;
        if (v3 != null) {
            return v3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("valueVector");
        return null;
    }

    public final void OooO0oo(V v) {
        if (this.f1234OooO0Oo == null) {
            Intrinsics.checkNotNullParameter(v, "<this>");
            this.f1234OooO0Oo = (V) v.OooO0OO();
            Intrinsics.checkNotNullParameter(v, "<this>");
            this.f1235OooO0o0 = (V) v.OooO0OO();
        }
    }
}
