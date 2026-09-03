package p115o00O00o;

import android.os.SystemClock;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Stable;
import coil.size.Scale;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o00O0O.OooOo;
import o00O0O.OooOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0OOO00;
import p116o00O00oO.Oooo000;
import p146o00Oo0.o00000O;
import p192o00o0O.o0Oo0oo;
import p264o00ooo.o000OO0O;

/* JADX INFO: loaded from: classes.dex */
@Stable
public final class OooOO0 extends o000OO0O {

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @Nullable
    public o000OO0O f30276OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @NotNull
    public final Scale f30277OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final int f30278OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final boolean f30279OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f30280OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public long f30281OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public boolean f30282Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f30283Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f30284OooooO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @Nullable
    public final o000OO0O f30285o000oOoO;

    public OooOO0(@Nullable o000OO0O o000oo0o2, @Nullable o000OO0O o000oo0o3, @NotNull Scale scale, int i, boolean z) {
        Intrinsics.checkNotNullParameter(scale, "scale");
        this.f30276OoooOO0 = o000oo0o2;
        this.f30285o000oOoO = o000oo0o3;
        this.f30277OoooOOO = scale;
        this.f30278OoooOOo = i;
        this.f30279OoooOo0 = z;
        this.f30280OoooOoO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(0);
        this.f30281OoooOoo = -1L;
        this.f30283Ooooo0o = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Float.valueOf(1.0f));
        this.f30284OooooO0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(null);
    }

    @Override // p264o00ooo.o000OO0O
    public final boolean OooO0OO(float f) {
        this.f30283Ooooo0o.setValue(Float.valueOf(f));
        return true;
    }

    @Override // p264o00ooo.o000OO0O
    public final boolean OooO0o0(@Nullable o00000O o00000o) {
        this.f30284OooooO0.setValue(o00000o);
        return true;
    }

    @Override // p264o00ooo.o000OO0O
    public final long OooO0oo() {
        long j;
        long j2;
        o000OO0O o000oo0o2 = this.f30276OoooOO0;
        OooOo00 oooOo00 = o000oo0o2 == null ? null : new OooOo00(o000oo0o2.OooO0oo());
        if (oooOo00 == null) {
            OooOo00.OooO00o oooO00o = OooOo00.f30434OooO0O0;
            j = OooOo00.f30435OooO0OO;
        } else {
            j = oooOo00.f30437OooO00o;
        }
        o000OO0O o000oo0o3 = this.f30285o000oOoO;
        OooOo00 oooOo01 = o000oo0o3 != null ? new OooOo00(o000oo0o3.OooO0oo()) : null;
        if (oooOo01 == null) {
            OooOo00.OooO00o oooO00o2 = OooOo00.f30434OooO0O0;
            j2 = OooOo00.f30435OooO0OO;
        } else {
            j2 = oooOo01.f30437OooO00o;
        }
        OooOo00.OooO00o oooO00o3 = OooOo00.f30434OooO0O0;
        long j3 = OooOo00.f30436OooO0Oo;
        if (j != j3) {
            return j2 != j3 ? OooOo.OooO00o(Math.max(OooOo00.OooO0Oo(j), OooOo00.OooO0Oo(j2)), Math.max(OooOo00.OooO0O0(j), OooOo00.OooO0O0(j2))) : j3;
        }
        return j3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p264o00ooo.o000OO0O
    public final void OooOO0(@NotNull o0Oo0oo o0oo0oo2) {
        Intrinsics.checkNotNullParameter(o0oo0oo2, "<this>");
        if (this.f30282Ooooo00) {
            OooOO0O(o0oo0oo2, this.f30285o000oOoO, OooOO0o());
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f30281OoooOoo == -1) {
            this.f30281OoooOoo = jUptimeMillis;
        }
        float f = (jUptimeMillis - this.f30281OoooOoo) / this.f30278OoooOOo;
        float fOooOO0o = OooOO0o() * RangesKt.coerceIn(f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f);
        float fOooOO0o2 = this.f30279OoooOo0 ? OooOO0o() - fOooOO0o : OooOO0o();
        this.f30282Ooooo00 = ((double) f) >= 1.0d;
        OooOO0O(o0oo0oo2, this.f30276OoooOO0, fOooOO0o2);
        OooOO0O(o0oo0oo2, this.f30285o000oOoO, fOooOO0o);
        if (this.f30282Ooooo00) {
            this.f30276OoooOO0 = null;
        } else {
            this.f30280OoooOoO.setValue(Integer.valueOf(((Number) this.f30280OoooOoO.getValue()).intValue() + 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0078  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOO0O(o0Oo0oo o0oo0oo2, o000OO0O o000oo0o2, float f) {
        long jOooO00o;
        float fMax;
        if (o000oo0o2 == null || f <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            return;
        }
        long jOooO0OO = o0oo0oo2.OooO0OO();
        long jOooO0oo = o000oo0o2.OooO0oo();
        OooOo00.OooO00o oooO00o = OooOo00.f30434OooO0O0;
        long j = OooOo00.f30436OooO0Oo;
        if ((jOooO0oo == j) || OooOo00.OooO0o(jOooO0oo)) {
            jOooO00o = jOooO0OO;
        } else {
            if ((jOooO0OO == j) || OooOo00.OooO0o(jOooO0OO)) {
                jOooO00o = jOooO0OO;
            } else {
                float fOooO0Oo = OooOo00.OooO0Oo(jOooO0oo);
                float fOooO0O0 = OooOo00.OooO0O0(jOooO0oo);
                Oooo000 oooo000 = Oooo000.f30362OooO00o;
                float fOooO0Oo2 = OooOo00.OooO0Oo(jOooO0OO);
                float fOooO0O1 = OooOo00.OooO0O0(jOooO0OO);
                Scale scale = this.f30277OoooOOO;
                Intrinsics.checkNotNullParameter(scale, "scale");
                float f2 = fOooO0Oo2 / fOooO0Oo;
                float f3 = fOooO0O1 / fOooO0O0;
                int i = Oooo000.OooO00o.$EnumSwitchMapping$0[scale.ordinal()];
                if (i == 1) {
                    fMax = Math.max(f2, f3);
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fMax = Math.min(f2, f3);
                }
                jOooO00o = OooOo.OooO00o(fOooO0Oo * fMax, fMax * fOooO0O0);
            }
        }
        if ((jOooO0OO == j) || OooOo00.OooO0o(jOooO0OO)) {
            o000oo0o2.OooO0oO(o0oo0oo2, jOooO00o, f, (o00000O) this.f30284OooooO0.getValue());
            return;
        }
        float f4 = 2;
        float fOooO0Oo3 = (OooOo00.OooO0Oo(jOooO0OO) - OooOo00.OooO0Oo(jOooO00o)) / f4;
        float fOooO0O2 = (OooOo00.OooO0O0(jOooO0OO) - OooOo00.OooO0O0(jOooO00o)) / f4;
        o0oo0oo2.Ooooo0o().OooO0Oo().OooO0o(fOooO0Oo3, fOooO0O2, fOooO0Oo3, fOooO0O2);
        o000oo0o2.OooO0oO(o0oo0oo2, jOooO00o, f, (o00000O) this.f30284OooooO0.getValue());
        float f5 = -fOooO0Oo3;
        float f6 = -fOooO0O2;
        o0oo0oo2.Ooooo0o().OooO0Oo().OooO0o(f5, f6, f5, f6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float OooOO0o() {
        return ((Number) this.f30283Ooooo0o.getValue()).floatValue();
    }
}
