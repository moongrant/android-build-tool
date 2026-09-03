package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o0O0O00.o000000O;
import o0O0O00.o00000O0;
import o0O0O00.o000O;
import o0O0O00.o000O000;
import o0O0O00.o0O0O00;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalFoundationApi
public final class Oooo000 implements OooOo, o00000O0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final OooOOO0 f5823Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final o000O f5824Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final HashMap<Integer, o000O000[]> f5825Oooo0oo;

    public Oooo000(@NotNull OooOOO0 itemContentFactory, @NotNull o000O subcomposeMeasureScope) {
        Intrinsics.checkNotNullParameter(itemContentFactory, "itemContentFactory");
        Intrinsics.checkNotNullParameter(subcomposeMeasureScope, "subcomposeMeasureScope");
        this.f5823Oooo0o = itemContentFactory;
        this.f5824Oooo0oO = subcomposeMeasureScope;
        this.f5825Oooo0oo = new HashMap<>();
    }

    @Override // androidx.compose.foundation.lazy.layout.OooOo, o0000O0O.OooO
    public final float OooO0o0(int i) {
        return this.f5824Oooo0oO.OooO0o0(i);
    }

    @Override // o0000O0O.OooO
    public final long OooOoOO(float f) {
        return this.f5824Oooo0oO.OooOoOO(f);
    }

    @Override // o0000O0O.OooO
    public final long OooOoo0(long j) {
        return this.f5824Oooo0oO.OooOoo0(j);
    }

    @Override // o0O0O00.o00000O0
    @NotNull
    public final o000000O OooOooo(int i, int i2, @NotNull Map<o0O0O00.OooO00o, Integer> alignmentLines, @NotNull Function1<? super o000O000.OooO00o, Unit> placementBlock) {
        Intrinsics.checkNotNullParameter(alignmentLines, "alignmentLines");
        Intrinsics.checkNotNullParameter(placementBlock, "placementBlock");
        return this.f5824Oooo0oO.OooOooo(i, i2, alignmentLines, placementBlock);
    }

    @Override // androidx.compose.foundation.lazy.layout.OooOo
    @NotNull
    public final o000O000[] OoooO0O(int i, long j) {
        o000O000[] o000o000Arr = this.f5825Oooo0oo.get(Integer.valueOf(i));
        if (o000o000Arr != null) {
            return o000o000Arr;
        }
        Object objOooO00o = this.f5823Oooo0o.f5802OooO0O0.invoke().OooO00o(i);
        List<o0O0O00> listOooOo0O = this.f5824Oooo0oO.OooOo0O(objOooO00o, this.f5823Oooo0o.OooO00o(i, objOooO00o));
        int size = listOooOo0O.size();
        o000O000[] o000o000Arr2 = new o000O000[size];
        for (int i2 = 0; i2 < size; i2++) {
            o000o000Arr2[i2] = listOooOo0O.get(i2).Oooo000(j);
        }
        this.f5825Oooo0oo.put(Integer.valueOf(i), o000o000Arr2);
        return o000o000Arr2;
    }

    @Override // o0000O0O.OooO
    public final float OoooOO0(float f) {
        return this.f5824Oooo0oO.OoooOO0(f);
    }

    @Override // o0000O0O.OooO
    public final float OoooOOo() {
        return this.f5824Oooo0oO.OoooOOo();
    }

    @Override // o0000O0O.OooO
    @Stable
    public final float OoooOoo(float f) {
        return this.f5824Oooo0oO.OoooOoo(f);
    }

    @Override // o0000O0O.OooO
    @Stable
    public final int OooooOO(long j) {
        return this.f5824Oooo0oO.OooooOO(j);
    }

    @Override // o0000O0O.OooO
    @Stable
    public final int OoooooO(float f) {
        return this.f5824Oooo0oO.OoooooO(f);
    }

    @Override // o0000O0O.OooO
    public final float getDensity() {
        return this.f5824Oooo0oO.getDensity();
    }

    @Override // o0O0O00.OooOo00
    @NotNull
    public final LayoutDirection getLayoutDirection() {
        return this.f5824Oooo0oO.getLayoutDirection();
    }

    @Override // o0000O0O.OooO
    public final long o00ooo(long j) {
        return this.f5824Oooo0oO.o00ooo(j);
    }

    @Override // o0000O0O.OooO
    @Stable
    public final float oo000o(long j) {
        return this.f5824Oooo0oO.oo000o(j);
    }
}
