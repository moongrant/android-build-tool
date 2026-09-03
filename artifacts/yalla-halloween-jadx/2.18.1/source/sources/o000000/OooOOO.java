package o000000;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.node.LayoutNode;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o0O0O00.o000O000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO extends oo000o implements o0000O0O.OooO {

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    @NotNull
    public static final p145o00Oo0.Oooo0 f26602o00o0O;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public final /* synthetic */ o0O0O00.o00000O0 f26603o00Ooo;

    static {
        p145o00Oo0.Oooo0 oooo0 = new p145o00Oo0.Oooo0();
        o00Oo0.o00000O0.OooO00o oooO00o = p145o00Oo0.o00000O0.f32063OooO0O0;
        oooo0.OooOO0(p145o00Oo0.o00000O0.f32066OooO0o);
        oooo0.OooOo0O(1.0f);
        oooo0.OooOo0o(1);
        f26602o00o0O = oooo0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(@NotNull LayoutNode layoutNode) {
        super(layoutNode);
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f26603o00Ooo = layoutNode.f6151Ooooo0o;
    }

    @Override // o0000O0O.OooO
    @Stable
    public final float OooO0o0(int i) {
        return this.f26603o00Ooo.OooO0o0(i);
    }

    @Override // o0O0O00.OooOOOO
    public final int OooOOO(int i) {
        OooOOOO oooOOOO = this.f26702OoooO00.f6149OoooOoo;
        o0O0O00.o000000 o000000VarOooO00o = oooOOOO.OooO00o();
        LayoutNode layoutNode = oooOOOO.f26615OooO00o;
        return o000000VarOooO00o.OooO0Oo(layoutNode.f6151Ooooo0o, layoutNode.OooOOo0(), i);
    }

    @Override // o0000O0O.OooO
    @Stable
    public final long OooOoOO(float f) {
        return this.f26603o00Ooo.OooOoOO(f);
    }

    @Override // o0O0O00.OooOOOO
    public final int OooOoo(int i) {
        OooOOOO oooOOOO = this.f26702OoooO00.f6149OoooOoo;
        o0O0O00.o000000 o000000VarOooO00o = oooOOOO.OooO00o();
        LayoutNode layoutNode = oooOOOO.f26615OooO00o;
        return o000000VarOooO00o.OooO0O0(layoutNode.f6151Ooooo0o, layoutNode.OooOOo0(), i);
    }

    @Override // o0000O0O.OooO
    @Stable
    public final long OooOoo0(long j) {
        return this.f26603o00Ooo.OooOoo0(j);
    }

    @Override // o0O0O00.OooOOOO
    public final int OooOooO(int i) {
        OooOOOO oooOOOO = this.f26702OoooO00.f6149OoooOoo;
        o0O0O00.o000000 o000000VarOooO00o = oooOOOO.OooO00o();
        LayoutNode layoutNode = oooOOOO.f26615OooO00o;
        return o000000VarOooO00o.OooO0OO(layoutNode.f6151Ooooo0o, layoutNode.OooOOo0(), i);
    }

    @Override // o0O0O00.o0O0O00
    @NotNull
    public final o000O000 Oooo000(long j) {
        if (!o0000O0O.OooO0O0.OooO0O0(this.f35264Oooo, j)) {
            this.f35264Oooo = j;
            Oooooo();
        }
        p036OoooOOO.o000OOo<LayoutNode> o000oooOooOo0 = this.f26702OoooO00.OooOo0();
        int i = o000oooOooOo0.f3664Oooo0oo;
        if (i > 0) {
            int i2 = 0;
            LayoutNode[] layoutNodeArr = o000oooOooOo0.f3662Oooo0o;
            do {
                layoutNodeArr[i2].OoooOOO(LayoutNode.UsageByParent.NotUsed);
                i2++;
            } while (i2 < i);
        }
        LayoutNode layoutNode = this.f26702OoooO00;
        o0O0O00.o000000O measureResult = layoutNode.f6148OoooOoO.OooO00o(layoutNode.f6151Ooooo0o, layoutNode.OooOOo0(), j);
        LayoutNode layoutNode2 = this.f26702OoooO00;
        Objects.requireNonNull(layoutNode2);
        Intrinsics.checkNotNullParameter(measureResult, "measureResult");
        layoutNode2.f6165o00Ooo.o0000OO0(measureResult);
        o0000oO();
        return this;
    }

    @Override // o0O0O00.OooOOOO
    public final int OoooO(int i) {
        OooOOOO oooOOOO = this.f26702OoooO00.f6149OoooOoo;
        o0O0O00.o000000 o000000VarOooO00o = oooOOOO.OooO00o();
        LayoutNode layoutNode = oooOOOO.f26615OooO00o;
        return o000000VarOooO00o.OooO0o0(layoutNode.f6151Ooooo0o, layoutNode.OooOOo0(), i);
    }

    @Override // o0000O0O.OooO
    @Stable
    public final float OoooOO0(float f) {
        return this.f26603o00Ooo.OoooOO0(f);
    }

    @Override // o0000O0O.OooO
    public final float OoooOOo() {
        return this.f26603o00Ooo.OoooOOo();
    }

    @Override // o0000O0O.OooO
    @Stable
    public final float OoooOoo(float f) {
        return this.f26603o00Ooo.OoooOoo(f);
    }

    @Override // o0000O0O.OooO
    @Stable
    public final int OooooOO(long j) {
        return this.f26603o00Ooo.OooooOO(j);
    }

    @Override // o000000.oo000o, o0O0O00.o000O000
    public final void OooooOo(long j, float f, @Nullable Function1<? super p145o00Oo0.o0000, Unit> function1) {
        super.OooooOo(j, f, function1);
        oo000o oo000oVar = this.f26701OoooO0;
        if (oo000oVar != null && oo000oVar.f26711Ooooo0o) {
            return;
        }
        o0000O0O();
        LayoutNode layoutNode = this.f26702OoooO00;
        LayoutNode layoutNodeOooOOoo = layoutNode.OooOOoo();
        OooOOO oooOOO = layoutNode.f6165o00Ooo;
        float f2 = oooOOO.f26710Ooooo00;
        oo000o oo000oVar2 = layoutNode.f6166o00o0O.f26635OoooO0;
        while (!Intrinsics.areEqual(oo000oVar2, oooOOO)) {
            o0OOO0o o0ooo0o2 = (o0OOO0o) oo000oVar2;
            f2 += o0ooo0o2.f26710Ooooo00;
            oo000oVar2 = o0ooo0o2.f26665o00Ooo;
        }
        if (!(f2 == layoutNode.f6169o00ooo)) {
            layoutNode.f6169o00ooo = f2;
            if (layoutNodeOooOOoo != null) {
                layoutNodeOooOOoo.Oooo0o0();
            }
            if (layoutNodeOooOOoo != null) {
                layoutNodeOooOOoo.OooOoO0();
            }
        }
        if (!layoutNode.f6156Oooooo0) {
            if (layoutNodeOooOOoo != null) {
                layoutNodeOooOOoo.OooOoO0();
            }
            layoutNode.Oooo00O();
        }
        if (layoutNodeOooOOoo == null) {
            layoutNode.f6155Oooooo = 0;
        } else if (!layoutNode.f6170o0O0O00 && layoutNodeOooOOoo.f6144OoooOO0 == LayoutNode.LayoutState.LayingOut) {
            if (!(layoutNode.f6155Oooooo == Integer.MAX_VALUE)) {
                throw new IllegalStateException("Place was called on a node which was placed already".toString());
            }
            int i = layoutNodeOooOOoo.f6158Ooooooo;
            layoutNode.f6155Oooooo = i;
            layoutNodeOooOOoo.f6158Ooooooo = i + 1;
        }
        layoutNode.OooOooo();
    }

    @Override // o0000O0O.OooO
    @Stable
    public final int OoooooO(float f) {
        return this.f26603o00Ooo.OoooooO(f);
    }

    @Override // o0000O0O.OooO
    public final float getDensity() {
        return this.f26603o00Ooo.getDensity();
    }

    @Override // o000000.oo000o
    @NotNull
    public final o0O0O00.o00000O0 o00000O0() {
        return this.f26702OoooO00.f6151Ooooo0o;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    @Override // o000000.oo000o
    public final <T extends o00Oo0<T, M>, C, M extends o00OOOO0> void o00000oo(@NotNull oo000o.OooOO0<T, C, M> hitTestSource, long j, @NotNull OooOOO0<C> hitTestResult, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        LayoutNode[] layoutNodeArr;
        boolean z5;
        boolean z6;
        Intrinsics.checkNotNullParameter(hitTestSource, "hitTestSource");
        Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
        if (!hitTestSource.OooO0OO(this.f26702OoooO00)) {
            z3 = z2;
            z4 = false;
        } else if (o0000Oo(j)) {
            z3 = z2;
            z4 = true;
        } else if (z) {
            float fO0O0O00 = o0O0O00(j, o00000O());
            if ((Float.isInfinite(fO0O0O00) || Float.isNaN(fO0O0O00)) ? false : true) {
                z4 = true;
                z3 = false;
            } else {
                z3 = z2;
                z4 = false;
            }
        } else {
            z3 = z2;
            z4 = false;
        }
        if (z4) {
            int i = hitTestResult.f26607Oooo0oo;
            p036OoooOOO.o000OOo<LayoutNode> o000oooOooOo00 = this.f26702OoooO00.OooOo00();
            int i2 = o000oooOooOo00.f3664Oooo0oo;
            if (i2 > 0) {
                LayoutNode[] layoutNodeArr2 = o000oooOooOo00.f3662Oooo0o;
                int i3 = i2 - 1;
                while (true) {
                    LayoutNode layoutNode = layoutNodeArr2[i3];
                    if (layoutNode.f6156Oooooo0) {
                        layoutNodeArr = layoutNodeArr2;
                        hitTestSource.OooO0O0(layoutNode, j, hitTestResult, z, z3);
                        long jOooO00o = hitTestResult.OooO00o();
                        if (!(OooO.OooO0O0(jOooO00o) < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && OooO.OooO0OO(jOooO00o))) {
                            z6 = true;
                        } else if (layoutNode.f6166o00o0O.f26635OoooO0.o0000OO()) {
                            hitTestResult.f26607Oooo0oo = hitTestResult.f26604Oooo - 1;
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z5 = z6 ? false : true;
                        if (!!z5 || (i3 = i3 - 1) < 0) {
                            break;
                        } else {
                            layoutNodeArr2 = layoutNodeArr;
                        }
                    } else {
                        layoutNodeArr = layoutNodeArr2;
                    }
                    if (!z5) {
                        break;
                    }
                    break;
                    break;
                }
            }
            hitTestResult.f26607Oooo0oo = i;
        }
    }

    @Override // o000000.oo000o
    public final void o000OO(@NotNull p145o00Oo0.o0O0O00 canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        o00000 o00000VarOooO00o = o00Ooo.OooO00o(this.f26702OoooO00);
        p036OoooOOO.o000OOo<LayoutNode> o000oooOooOo00 = this.f26702OoooO00.OooOo00();
        int i = o000oooOooOo00.f3664Oooo0oo;
        if (i > 0) {
            int i2 = 0;
            LayoutNode[] layoutNodeArr = o000oooOooOo00.f3662Oooo0o;
            do {
                LayoutNode layoutNode = layoutNodeArr[i2];
                if (layoutNode.f6156Oooooo0) {
                    layoutNode.OooOOOo(canvas);
                }
                i2++;
            } while (i2 < i);
        }
        if (o00000VarOooO00o.getShowLayoutBounds()) {
            o000000(canvas, f26602o00o0O);
        }
    }

    @Override // o0000O0O.OooO
    @Stable
    public final long o00ooo(long j) {
        return this.f26603o00Ooo.o00ooo(j);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashMap, java.util.Map<o0O0O00.OooO00o, java.lang.Integer>] */
    @Override // o000000.oo000o
    public final int o0Oo0oo(@NotNull o0O0O00.OooO00o alignmentLine) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        LayoutNode layoutNode = this.f26702OoooO00;
        if (!layoutNode.f6166o00o0O.f26638OoooOO0) {
            if (layoutNode.f6144OoooOO0 == LayoutNode.LayoutState.Measuring) {
                o0OoOo0 o0oooo1 = layoutNode.f6154OooooOo;
                o0oooo1.f26682OooO0o = true;
                if (o0oooo1.f26679OooO0O0) {
                    layoutNode.f6159o000000 = true;
                }
            } else {
                layoutNode.f6154OooooOo.f26684OooO0oO = true;
            }
        }
        layoutNode.OooOooo();
        Integer num = (Integer) layoutNode.f6154OooooOo.f26677OooO.get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // o0000O0O.OooO
    @Stable
    public final float oo000o(long j) {
        return this.f26603o00Ooo.oo000o(j);
    }
}
