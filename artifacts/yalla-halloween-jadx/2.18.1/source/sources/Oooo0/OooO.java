package Oooo0;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ULong;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends androidx.compose.ui.platform.o00O00 implements p442o0OoOo0.o00O0O {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final float f481Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public final p145o00Oo0.o00000O0 f482Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public final p145o00Oo0.o0Oo0oo f483Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public o00O0O.OooOo00 f484OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final p145o00Oo0.o000OOo0 f485OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public p145o00Oo0.o0000OO0 f486OoooO0O;

    /* JADX WARN: Illegal instructions before constructor call */
    public OooO(p145o00Oo0.o00000O0 o00000o1, p145o00Oo0.o0Oo0oo o0oo0oo2, float f, p145o00Oo0.o000OOo0 o000ooo1, int i) {
        Function1<androidx.compose.ui.platform.o00O000o, Unit> function1 = androidx.compose.ui.platform.o00oOoo.f6560OooO00o;
        o00000o1 = (i & 1) != 0 ? null : o00000o1;
        o0oo0oo2 = (i & 2) != 0 ? null : o0oo0oo2;
        f = (i & 4) != 0 ? 1.0f : f;
        super(function1);
        this.f482Oooo0oO = o00000o1;
        this.f483Oooo0oo = o0oo0oo2;
        this.f481Oooo = f;
        this.f485OoooO00 = o000ooo1;
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ p048OoooooO.o00OOOO0 OooOOoo(p048OoooooO.o00OOOO0 o00oooo1) {
        return p048OoooooO.o0o0Oo.OooO00o(this, o00oooo1);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object Oooo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // p442o0OoOo0.o00O0O
    public final void Oooo0o(@NotNull p191o00o0O.o00oO0o drawOutline) {
        p145o00Oo0.o0000OO0 outline;
        p145o00Oo0.o000O0o o000o0o2;
        p145o00Oo0.o000O0o o000o0o3;
        Intrinsics.checkNotNullParameter(drawOutline, "<this>");
        if (this.f485OoooO00 == p145o00Oo0.o000O0Oo.f32099OooO00o) {
            p145o00Oo0.o00000O0 o00000o1 = this.f482Oooo0oO;
            if (o00000o1 != null) {
                p191o00o0O.o0OOO0o.OooOO0(drawOutline, o00000o1.f32070OooO00o, 0L, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, null, 0, 126, null);
            }
            p145o00Oo0.o0Oo0oo o0oo0oo2 = this.f483Oooo0oo;
            if (o0oo0oo2 != null) {
                p191o00o0O.o0OOO0o.OooO(drawOutline, o0oo0oo2, 0L, 0L, this.f481Oooo, null, null, 0, 118, null);
            }
        } else {
            o000000.o00O0O o00o0o2 = (o000000.o00O0O) drawOutline;
            long jOooO0OO = o00o0o2.OooO0OO();
            o00O0O.OooOo00 oooOo00 = this.f484OoooO0;
            o00O0O.OooOo00.OooO00o oooO00o = o00O0O.OooOo00.f30416OooO0O0;
            boolean z = false;
            if ((oooOo00 instanceof o00O0O.OooOo00) && jOooO0OO == oooOo00.f30419OooO00o) {
                z = true;
            }
            if (z && o00o0o2.getLayoutDirection() == null) {
                outline = this.f486OoooO0O;
                Intrinsics.checkNotNull(outline);
            } else {
                outline = this.f485OoooO00.OooO00o(o00o0o2.OooO0OO(), o00o0o2.getLayoutDirection(), drawOutline);
            }
            p145o00Oo0.o00000O0 o00000o2 = this.f482Oooo0oO;
            if (o00000o2 != null) {
                long j = o00000o2.f32070OooO00o;
                p191o00o0O.o000OOo style = p191o00o0O.o000OOo.f33065OooO00o;
                Intrinsics.checkNotNullParameter(drawOutline, "$this$drawOutline");
                Intrinsics.checkNotNullParameter(outline, "outline");
                Intrinsics.checkNotNullParameter(style, "style");
                if (outline instanceof o00Oo0.o0000OO0.OooO0O0) {
                    o00O0O.OooOO0O oooOO0O = ((o00Oo0.o0000OO0.OooO0O0) outline).f32074OooO00o;
                    o00o0o2.OooOO0O(j, o00O0O.OooOO0.OooO00o(oooOO0O.f30404OooO00o, oooOO0O.f30405OooO0O0), o00O0O.OooOo.OooO00o(oooOO0O.f30406OooO0OO - oooOO0O.f30404OooO00o, oooOO0O.f30407OooO0Oo - oooOO0O.f30405OooO0O0), 1.0f, style, null, 3);
                } else {
                    if (outline instanceof o00Oo0.o0000OO0.OooO0OO) {
                        o00Oo0.o0000OO0.OooO0OO oooO0OO = (o00Oo0.o0000OO0.OooO0OO) outline;
                        p145o00Oo0.o0OoOo0 o0oooo1 = oooO0OO.f32076OooO0O0;
                        if (o0oooo1 != null) {
                            o000o0o3 = o0oooo1;
                        } else {
                            o00O0O.OooOOO oooOOO = oooO0OO.f32075OooO00o;
                            float fOooO0O0 = o00O0O.OooO00o.OooO0O0(oooOOO.f30415OooO0oo);
                            o00o0o2.OooOOo(j, o00O0O.OooOO0.OooO00o(oooOOO.f30408OooO00o, oooOOO.f30409OooO0O0), o00O0O.OooOo.OooO00o(oooOOO.f30410OooO0OO - oooOOO.f30408OooO00o, oooOOO.f30411OooO0Oo - oooOOO.f30409OooO0O0), o00O0O.OooO0O0.OooO00o(fOooO0O0, fOooO0O0), style, 1.0f, null, 3);
                        }
                    } else {
                        if (!(outline instanceof o00Oo0.o0000OO0.OooO00o)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        o000o0o3 = ((o00Oo0.o0000OO0.OooO00o) outline).f32073OooO00o;
                    }
                    o00o0o2.Oooo0oO(o000o0o3, j, 1.0f, style, null, 3);
                }
            }
            p145o00Oo0.o0Oo0oo brush = this.f483Oooo0oo;
            if (brush != null) {
                float f = this.f481Oooo;
                p191o00o0O.o000OOo style2 = p191o00o0O.o000OOo.f33065OooO00o;
                Intrinsics.checkNotNullParameter(drawOutline, "$this$drawOutline");
                Intrinsics.checkNotNullParameter(outline, "outline");
                Intrinsics.checkNotNullParameter(brush, "brush");
                Intrinsics.checkNotNullParameter(style2, "style");
                if (outline instanceof o00Oo0.o0000OO0.OooO0O0) {
                    o00O0O.OooOO0O oooOO0O2 = ((o00Oo0.o0000OO0.OooO0O0) outline).f32074OooO00o;
                    o00o0o2.o00o0O(brush, o00O0O.OooOO0.OooO00o(oooOO0O2.f30404OooO00o, oooOO0O2.f30405OooO0O0), o00O0O.OooOo.OooO00o(oooOO0O2.f30406OooO0OO - oooOO0O2.f30404OooO00o, oooOO0O2.f30407OooO0Oo - oooOO0O2.f30405OooO0O0), f, style2, null, 3);
                } else {
                    if (outline instanceof o00Oo0.o0000OO0.OooO0OO) {
                        o00Oo0.o0000OO0.OooO0OO oooO0OO2 = (o00Oo0.o0000OO0.OooO0OO) outline;
                        p145o00Oo0.o0OoOo0 o0oooo2 = oooO0OO2.f32076OooO0O0;
                        if (o0oooo2 != null) {
                            o000o0o2 = o0oooo2;
                        } else {
                            o00O0O.OooOOO oooOOO2 = oooO0OO2.f32075OooO00o;
                            float fOooO0O1 = o00O0O.OooO00o.OooO0O0(oooOOO2.f30415OooO0oo);
                            o00o0o2.OooO0oO(brush, o00O0O.OooOO0.OooO00o(oooOOO2.f30408OooO00o, oooOOO2.f30409OooO0O0), o00O0O.OooOo.OooO00o(oooOOO2.f30410OooO0OO - oooOOO2.f30408OooO00o, oooOOO2.f30411OooO0Oo - oooOOO2.f30409OooO0O0), o00O0O.OooO0O0.OooO00o(fOooO0O1, fOooO0O1), f, style2, null, 3);
                        }
                    } else {
                        if (!(outline instanceof o00Oo0.o0000OO0.OooO00o)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        o000o0o2 = ((o00Oo0.o0000OO0.OooO00o) outline).f32073OooO00o;
                    }
                    o00o0o2.Oooo0O0(o000o0o2, brush, f, style2, null, 3);
                }
            }
            this.f486OoooO0O = outline;
            this.f484OoooO0 = new o00O0O.OooOo00(o00o0o2.OooO0OO());
        }
        ((o000000.o00O0O) drawOutline).o0ooOOo();
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ boolean OooooOo(Function1 function1) {
        return p048OoooooO.o00OOOOo.OooO00o(this, function1);
    }

    public final boolean equals(@Nullable Object obj) {
        OooO oooO = obj instanceof OooO ? (OooO) obj : null;
        if (oooO != null && Intrinsics.areEqual(this.f482Oooo0oO, oooO.f482Oooo0oO) && Intrinsics.areEqual(this.f483Oooo0oo, oooO.f483Oooo0oo)) {
            return ((this.f481Oooo > oooO.f481Oooo ? 1 : (this.f481Oooo == oooO.f481Oooo ? 0 : -1)) == 0) && Intrinsics.areEqual(this.f485OoooO00, oooO.f485OoooO00);
        }
        return false;
    }

    public final int hashCode() {
        p145o00Oo0.o00000O0 o00000o1 = this.f482Oooo0oO;
        int iM686hashCodeimpl = (o00000o1 != null ? ULong.m686hashCodeimpl(o00000o1.f32070OooO00o) : 0) * 31;
        p145o00Oo0.o0Oo0oo o0oo0oo2 = this.f483Oooo0oo;
        return this.f485OoooO00.hashCode() + Oooo000.o000O00O.OooO00o(this.f481Oooo, (iM686hashCodeimpl + (o0oo0oo2 != null ? o0oo0oo2.hashCode() : 0)) * 31, 31);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Background(color=");
        sbOooO0o0.append(this.f482Oooo0oO);
        sbOooO0o0.append(", brush=");
        sbOooO0o0.append(this.f483Oooo0oo);
        sbOooO0o0.append(", alpha = ");
        sbOooO0o0.append(this.f481Oooo);
        sbOooO0o0.append(", shape=");
        sbOooO0o0.append(this.f485OoooO00);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
