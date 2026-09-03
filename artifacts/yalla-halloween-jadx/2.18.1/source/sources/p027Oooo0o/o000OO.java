package p027Oooo0o;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o0000O0O.OooOo;
import o0O0O00.o000O000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.o0000O0O;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO implements oo000o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final List<o0000O0O> f1916OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f1917OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f1918OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Object f1919OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f1920OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f1921OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f1922OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f1923OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f1924OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final o0OOO0o f1925OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final long f1926OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final boolean f1927OooOO0o;

    public o000OO(int i, int i2, Object obj, int i3, int i4, int i5, int i6, boolean z, List list, o0OOO0o o0ooo0o2, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this.f1917OooO00o = i;
        this.f1918OooO0O0 = i2;
        this.f1919OooO0OO = obj;
        this.f1920OooO0Oo = i3;
        this.f1922OooO0o0 = i4;
        this.f1921OooO0o = i5;
        this.f1923OooO0oO = i6;
        this.f1924OooO0oo = z;
        this.f1916OooO = list;
        this.f1925OooOO0 = o0ooo0o2;
        this.f1926OooOO0O = j;
        int iOooO0o0 = OooO0o0();
        boolean z2 = false;
        for (int i7 = 0; i7 < iOooO0o0; i7++) {
            if (OooO0O0(i7) != null) {
                z2 = true;
                break;
            }
        }
        this.f1927OooOO0o = z2;
    }

    @Override // p027Oooo0o.oo000o
    public final int OooO00o() {
        return this.f1917OooO00o;
    }

    @Nullable
    public final o0000O0O<OooOo> OooO0O0(int i) {
        Object obj = this.f1916OooO.get(i).f1840OooO0OO;
        if (obj instanceof o0000O0O) {
            return (o0000O0O) obj;
        }
        return null;
    }

    public final int OooO0OO(int i) {
        o000O000 o000o001 = this.f1916OooO.get(i).f1839OooO0O0;
        return this.f1924OooO0oo ? o000o001.f35266Oooo0oO : o000o001.f35265Oooo0o;
    }

    public final long OooO0Oo(int i) {
        return this.f1916OooO.get(i).f1838OooO00o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Object, Oooo0o.OooOo>] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList, java.util.List<Oooo0o.oOO00O>] */
    public final void OooO0o(@NotNull o000O000.OooO00o scope) {
        int i;
        o000O000 o000o001;
        long jOooO0Oo;
        o000OO o000oo2;
        Intrinsics.checkNotNullParameter(scope, "scope");
        o000OO o000oo3 = this;
        int i2 = 0;
        for (int iOooO0o0 = OooO0o0(); i2 < iOooO0o0; iOooO0o0 = i) {
            o000O000 o000o002 = o000oo3.f1916OooO.get(i2).f1839OooO0O0;
            int i3 = o000oo3.f1921OooO0o - (o000oo3.f1924OooO0oo ? o000o002.f35266Oooo0oO : o000o002.f35265Oooo0o);
            int i4 = o000oo3.f1923OooO0oO;
            if (o000oo3.OooO0O0(i2) != null) {
                o0OOO0o o0ooo0o2 = o000oo3.f1925OooOO0;
                Object key = o000oo3.f1919OooO0OO;
                jOooO0Oo = o000oo3.OooO0Oo(i2);
                Objects.requireNonNull(o0ooo0o2);
                Intrinsics.checkNotNullParameter(key, "key");
                OooOo oooOo = (OooOo) o0ooo0o2.f1996OooO0OO.get(key);
                if (oooOo == null) {
                    i = iOooO0o0;
                    o000o001 = o000o002;
                } else {
                    oOO00O ooo00o = (oOO00O) oooOo.f1745OooO0O0.get(i2);
                    long j = ooo00o.f2011OooO0O0.OooO0o().f27312OooO00o;
                    long j2 = oooOo.f1744OooO00o;
                    jOooO0Oo = o00oO0o.OooO00o(j2, OooOo.OooO0OO(j), ((int) (j >> 32)) + ((int) (j2 >> 32)));
                    long j3 = ooo00o.f2012OooO0OO;
                    long j4 = oooOo.f1744OooO00o;
                    int i5 = iOooO0o0;
                    o000o001 = o000o002;
                    i = i5;
                    long jOooO00o = o00oO0o.OooO00o(j4, OooOo.OooO0OO(j3), ((int) (j3 >> 32)) + ((int) (j4 >> 32)));
                    if (((Boolean) ooo00o.f2013OooO0Oo.getValue()).booleanValue() && ((o0ooo0o2.OooO0OO(jOooO00o) < i3 && o0ooo0o2.OooO0OO(jOooO0Oo) < i3) || (o0ooo0o2.OooO0OO(jOooO00o) > i4 && o0ooo0o2.OooO0OO(jOooO0Oo) > i4))) {
                        BuildersKt__Builders_commonKt.launch$default(o0ooo0o2.f1994OooO00o, null, null, new o0ooOOo(ooo00o, null), 3, null);
                    }
                }
                o000oo2 = this;
            } else {
                i = iOooO0o0;
                o000o001 = o000o002;
                jOooO0Oo = o000oo3.OooO0Oo(i2);
                o000oo2 = o000oo3;
            }
            if (o000oo2.f1924OooO0oo) {
                long j5 = o000oo2.f1926OooOO0O;
                OooOo.OooO00o oooO00o = OooOo.f27310OooO0O0;
                o000O000.OooO00o.OooOOO0(scope, o000o001, o00oO0o.OooO00o(j5, OooOo.OooO0OO(jOooO0Oo), ((int) (jOooO0Oo >> 32)) + ((int) (j5 >> 32))), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, 6, null);
            } else {
                long j6 = o000oo2.f1926OooOO0O;
                OooOo.OooO00o oooO00o2 = OooOo.f27310OooO0O0;
                o000O000.OooO00o.OooO(scope, o000o001, o00oO0o.OooO00o(j6, OooOo.OooO0OO(jOooO0Oo), ((int) (jOooO0Oo >> 32)) + ((int) (j6 >> 32))), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, 6, null);
            }
            i2++;
            o000oo3 = o000oo2;
        }
    }

    public final int OooO0o0() {
        return this.f1916OooO.size();
    }

    @Override // p027Oooo0o.oo000o
    public final int getIndex() {
        return this.f1918OooO0O0;
    }

    @Override // p027Oooo0o.oo000o
    public final int getSize() {
        return this.f1920OooO0Oo;
    }
}
