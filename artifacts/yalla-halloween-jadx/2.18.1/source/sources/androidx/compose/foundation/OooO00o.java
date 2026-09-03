package androidx.compose.foundation;

import Oooo0.Oooo000;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.ui.unit.LayoutDirection;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import o000000.o0000;
import o0000O0O.o000oOoO;
import o00O0O.OooOOOO;
import o00O0O.OooOo00;
import p145o00Oo0.o00000O;
import p145o00Oo0.o00000O0;
import p145o00Oo0.o00000OO;
import p145o00Oo0.o0000O0;
import p145o00Oo0.o0000O0O;
import p145o00Oo0.o0000OO0;
import p145o00Oo0.o0000oo;
import p145o00Oo0.o000O0o;
import p145o00Oo0.o000OOo0;
import p145o00Oo0.o0O0O00;
import p145o00Oo0.o0O0ooO;
import p145o00Oo0.o0Oo0oo;
import p145o00Oo0.o0OoOo0;
import p145o00Oo0.o0ooOOo;
import p191o00o0O.o000000;
import p191o00o0O.o000OOo;
import p191o00o0O.o00Oo0;
import p191o00o0O.o0OOO0o;
import p442o0OoOo0.OooOo;
import p442o0OoOo0.o00Ooo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends Lambda implements Function1<OooOo, o00Ooo> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f5607Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ float f5608Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o000OOo0 f5609Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0000<Oooo0.OooOO0> f5610Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(float f, o000OOo0 o000ooo1, o0000<Oooo0.OooOO0> o0000Var, o0Oo0oo o0oo0oo2) {
        super(1);
        this.f5608Oooo0o = f;
        this.f5609Oooo0oO = o000ooo1;
        this.f5610Oooo0oo = o0000Var;
        this.f5607Oooo = o0oo0oo2;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0163  */
    /* JADX WARN: Type inference failed for: r13v9, types: [T, o00Oo0.o0000oo] */
    @Override // kotlin.jvm.functions.Function1
    public final o00Ooo invoke(OooOo oooOo) {
        o00000O o00000o;
        int i;
        boolean z;
        o00Ooo o00oooOooOOO;
        OooOo drawWithCache = oooOo;
        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
        if (drawWithCache.OoooOoo(this.f5608Oooo0o) >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && OooOo00.OooO0OO(drawWithCache.OooO0OO()) > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            float f = 2;
            float fMin = Math.min(o0000O0O.OooOOO0.OooO00o(this.f5608Oooo0o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) ? 1.0f : (float) Math.ceil(drawWithCache.OoooOoo(this.f5608Oooo0o)), (float) Math.ceil(OooOo00.OooO0OO(drawWithCache.OooO0OO()) / f));
            float f2 = fMin / f;
            long jOooO00o = o00O0O.OooOO0.OooO00o(f2, f2);
            long jOooO00o2 = o00O0O.OooOo.OooO00o(OooOo00.OooO0Oo(drawWithCache.OooO0OO()) - fMin, OooOo00.OooO0O0(drawWithCache.OooO0OO()) - fMin);
            float f3 = fMin * f;
            boolean z2 = f3 > OooOo00.OooO0OO(drawWithCache.OooO0OO());
            o0000OO0 o0000oo0OooO00o = this.f5609Oooo0oO.OooO00o(drawWithCache.OooO0OO(), drawWithCache.getLayoutDirection(), drawWithCache);
            if (!(o0000oo0OooO00o instanceof o0000OO0.OooO00o)) {
                if (!(o0000oo0OooO00o instanceof o0000OO0.OooO0OO)) {
                    if (!(o0000oo0OooO00o instanceof o0000OO0.OooO0O0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    o0Oo0oo o0oo0oo2 = this.f5607Oooo;
                    if (z2) {
                        o00O0O.OooO.OooO00o oooO00o = o00O0O.OooO.f30391OooO0O0;
                        jOooO00o = o00O0O.OooO.f30392OooO0OO;
                    }
                    if (z2) {
                        jOooO00o2 = drawWithCache.OooO0OO();
                    }
                    return drawWithCache.OooOOO(new Oooo0.OooOo00(o0oo0oo2, jOooO00o, jOooO00o2, z2 ? o000OOo.f33065OooO00o : new o000000(fMin, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0, 0, null, 30)));
                }
                o0000<Oooo0.OooOO0> o0000Var = this.f5610Oooo0oo;
                o0Oo0oo o0oo0oo3 = this.f5607Oooo;
                o0000OO0.OooO0OO oooO0OO = (o0000OO0.OooO0OO) o0000oo0OooO00o;
                if (OooOOOO.OooO0O0(oooO0OO.f32075OooO00o)) {
                    return drawWithCache.OooOOO(new Oooo0.OooOo(z2, o0oo0oo3, oooO0OO.f32075OooO00o.f30413OooO0o0, f2, fMin, jOooO00o, jOooO00o2, new o000000(fMin, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0, 0, null, 30)));
                }
                Oooo0.OooOO0 oooOO0OooO0Oo = BorderKt.OooO0Oo(o0000Var);
                o000O0o o000o0oOooO00o = oooOO0OooO0Oo.f500OooO0Oo;
                if (o000o0oOooO00o == null) {
                    o000o0oOooO00o = p145o00Oo0.o00Ooo.OooO00o();
                    oooOO0OooO0Oo.f500OooO0Oo = o000o0oOooO00o;
                }
                o00O0O.OooOOO oooOOO = oooO0OO.f32075OooO00o;
                o000o0oOooO00o.OooO00o();
                o000o0oOooO00o.OooO0oO(oooOOO);
                if (!z2) {
                    o000O0o o000o0oOooO00o2 = p145o00Oo0.o00Ooo.OooO00o();
                    ((o0OoOo0) o000o0oOooO00o2).OooO0oO(new o00O0O.OooOOO(fMin, fMin, (oooOOO.f30410OooO0OO - oooOOO.f30408OooO00o) - fMin, (oooOOO.f30411OooO0Oo - oooOOO.f30409OooO0O0) - fMin, BorderKt.OooO0o0(oooOOO.f30413OooO0o0, fMin), BorderKt.OooO0o0(oooOOO.f30412OooO0o, fMin), BorderKt.OooO0o0(oooOOO.f30414OooO0oO, fMin), BorderKt.OooO0o0(oooOOO.f30415OooO0oo, fMin)));
                    o000o0oOooO00o.OooO(o000o0oOooO00o, o000o0oOooO00o2, 0);
                }
                return drawWithCache.OooOOO(new Oooo000(o000o0oOooO00o, o0oo0oo3));
            }
            o0000<Oooo0.OooOO0> o0000Var2 = this.f5610Oooo0oo;
            o0Oo0oo o0oo0oo4 = this.f5607Oooo;
            o0000OO0.OooO00o oooO00o2 = (o0000OO0.OooO00o) o0000oo0OooO00o;
            if (!z2) {
                if (o0oo0oo4 instanceof o0O0ooO) {
                    long j = ((o0O0ooO) o0oo0oo4).f32140OooO0O0;
                    o00000o = new o00000O(Build.VERSION.SDK_INT >= 29 ? o0ooOOo.f32150OooO00o.OooO00o(j, 5) : new PorterDuffColorFilter(o00000OO.OooO0oO(j), p145o00Oo0.OooOOO0.OooO0O0(5)));
                    i = 1;
                } else {
                    o00000o = null;
                    i = 0;
                }
                o00O0O.OooOO0O bounds = oooO00o2.f32073OooO00o.getBounds();
                Oooo0.OooOO0 oooOO0OooO0Oo2 = BorderKt.OooO0Oo(o0000Var2);
                o000O0o o000o0oOooO00o3 = oooOO0OooO0Oo2.f500OooO0Oo;
                if (o000o0oOooO00o3 == null) {
                    o000o0oOooO00o3 = p145o00Oo0.o00Ooo.OooO00o();
                    oooOO0OooO0Oo2.f500OooO0Oo = o000o0oOooO00o3;
                }
                o000O0o o000o0o2 = o000o0oOooO00o3;
                o000o0o2.OooO00o();
                o000o0o2.OooO0OO(bounds);
                o000o0o2.OooO(o000o0o2, oooO00o2.f32073OooO00o, 0);
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                long jOooO00o3 = o0000O0O.o0OoOo0.OooO00o((int) Math.ceil(bounds.f30406OooO0OO - bounds.f30404OooO00o), (int) Math.ceil(bounds.f30407OooO0Oo - bounds.f30405OooO0O0));
                o0000oo o0000ooVarOooO00o = oooOO0OooO0Oo2.f497OooO00o;
                o0O0O00 o0o0o00OooO00o = oooOO0OooO0Oo2.f498OooO0O0;
                o0000O0 o0000o1 = o0000ooVarOooO00o != null ? new o0000O0(o0000ooVarOooO00o.OooO0O0()) : null;
                if (o0000o1 != null && o0000o1.f32071OooO00o == 0) {
                    z = true;
                } else {
                    o0000O0 o0000o2 = o0000ooVarOooO00o != null ? new o0000O0(o0000ooVarOooO00o.OooO0O0()) : null;
                    if ((o0000o2 instanceof o0000O0) && i == o0000o2.f32071OooO00o) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (o0000ooVarOooO00o == null || o0o0o00OooO00o == null || OooOo00.OooO0Oo(drawWithCache.OooO0OO()) > o0000ooVarOooO00o.getWidth() || OooOo00.OooO0O0(drawWithCache.OooO0OO()) > o0000ooVarOooO00o.getHeight() || !z) {
                    o0000ooVarOooO00o = o0000O0O.OooO00o((int) (jOooO00o3 >> 32), o000oOoO.OooO0O0(jOooO00o3), i, 24);
                    oooOO0OooO0Oo2.f497OooO00o = o0000ooVarOooO00o;
                    o0o0o00OooO00o = p145o00Oo0.o000000.OooO00o(o0000ooVarOooO00o);
                    oooOO0OooO0Oo2.f498OooO0O0 = o0o0o00OooO00o;
                }
                ?? r13 = o0000ooVarOooO00o;
                o0O0O00 o0o0o00 = o0o0o00OooO00o;
                o00Oo0 o00oo1 = oooOO0OooO0Oo2.f499OooO0OO;
                if (o00oo1 == null) {
                    o00oo1 = new o00Oo0();
                    oooOO0OooO0Oo2.f499OooO0OO = o00oo1;
                }
                o00Oo0 o00oo2 = o00oo1;
                long jOooO0O0 = o0000O0O.o0OoOo0.OooO0O0(jOooO00o3);
                LayoutDirection layoutDirection = drawWithCache.getLayoutDirection();
                o00Oo0.OooO00o oooO00o3 = o00oo2.f33067Oooo0o;
                o0000O0O.OooO oooO = oooO00o3.f33070OooO00o;
                LayoutDirection layoutDirection2 = oooO00o3.f33071OooO0O0;
                o0O0O00 o0o0o01 = oooO00o3.f33072OooO0OO;
                long j2 = oooO00o3.f33073OooO0Oo;
                Intrinsics.checkNotNullParameter(drawWithCache, "<set-?>");
                oooO00o3.f33070OooO00o = drawWithCache;
                oooO00o3.OooO0OO(layoutDirection);
                Intrinsics.checkNotNullParameter(o0o0o00, "<set-?>");
                oooO00o3.f33072OooO0OO = o0o0o00;
                oooO00o3.f33073OooO0Oo = jOooO0O0;
                o0o0o00.OooO0oo();
                o00000O0.OooO00o oooO00o4 = o00000O0.f32063OooO0O0;
                o0OOO0o.OooOO0(o00oo2, o00000O0.f32064OooO0OO, 0L, jOooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, null, 0, 58, null);
                float f4 = -bounds.f30404OooO00o;
                float f5 = -bounds.f30405OooO0O0;
                o00oo2.f33068Oooo0oO.f33074OooO00o.OooO0O0(f4, f5);
                o0OOO0o.OooO0oO(o00oo2, oooO00o2.f32073OooO00o, o0oo0oo4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, new o000000(f3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0, 0, null, 30), null, 0, 52, null);
                float f6 = 1;
                float fOooO0Oo = (OooOo00.OooO0Oo(o00oo2.OooO0OO()) + f6) / OooOo00.OooO0Oo(o00oo2.OooO0OO());
                float fOooO0O0 = (OooOo00.OooO0O0(o00oo2.OooO0OO()) + f6) / OooOo00.OooO0O0(o00oo2.OooO0OO());
                long jO00Oo0 = o00oo2.o00Oo0();
                o00Oo0.OooO0O0 oooO0O0 = o00oo2.f33068Oooo0oO;
                long jOooO0OO = oooO0O0.OooO0OO();
                oooO0O0.OooO0o().OooO0oo();
                oooO0O0.f33074OooO00o.OooO0o0(fOooO0Oo, fOooO0O0, jO00Oo0);
                o0OOO0o.OooO0oO(o00oo2, o000o0o2, o0oo0oo4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, null, 0, 28, null);
                oooO0O0.OooO0o().OooOOo0();
                oooO0O0.OooO0o0(jOooO0OO);
                o00oo2.f33068Oooo0oO.f33074OooO00o.OooO0O0(-f4, -f5);
                o0o0o00.OooOOo0();
                o00Oo0.OooO00o oooO00o5 = o00oo2.f33067Oooo0o;
                oooO00o5.OooO0O0(oooO);
                oooO00o5.OooO0OO(layoutDirection2);
                oooO00o5.OooO00o(o0o0o01);
                oooO00o5.f33073OooO0Oo = j2;
                r13.OooO00o();
                objectRef.element = r13;
                return drawWithCache.OooOOO(new Oooo0.OooOOOO(bounds, objectRef, jOooO00o3, o00000o));
            }
            o00oooOooOOO = drawWithCache.OooOOO(new Oooo0.OooOOO(oooO00o2, o0oo0oo4));
        } else {
            o00oooOooOOO = drawWithCache.OooOOO(Oooo0.OooOOO0.f503Oooo0o);
        }
        return o00oooOooOOO;
    }
}
