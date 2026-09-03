package p114o00O00o;

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
import p115o00O00oO.Oooo000;
import p145o00Oo0.o00000O;
import p191o00o0O.o0Oo0oo;
import p263o00ooo.o000OO0O;

/* JADX INFO: loaded from: classes.dex */
@Stable
public final class OooOO0 extends o000OO0O {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final Scale f30258OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public o000OO0O f30259OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public final o000OO0O f30260OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final int f30261OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f30262OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public long f30263OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean f30264OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f30265OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f30266OoooOoo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final boolean f30267o000oOoO;

    public OooOO0(@Nullable o000OO0O o000oo0o2, @Nullable o000OO0O o000oo0o3, @NotNull Scale scale, int i, boolean z) {
        Intrinsics.checkNotNullParameter(scale, "scale");
        this.f30259OoooO0 = o000oo0o2;
        this.f30260OoooO0O = o000oo0o3;
        this.f30258OoooO = scale;
        this.f30261OoooOO0 = i;
        this.f30267o000oOoO = z;
        this.f30262OoooOOO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(0);
        this.f30263OoooOOo = -1L;
        this.f30265OoooOoO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Float.valueOf(1.0f));
        this.f30266OoooOoo = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(null);
    }

    @Override // p263o00ooo.o000OO0O
    public final boolean OooO0OO(float f) {
        this.f30265OoooOoO.setValue(Float.valueOf(f));
        return true;
    }

    @Override // p263o00ooo.o000OO0O
    public final boolean OooO0o0(@Nullable o00000O o00000o) {
        this.f30266OoooOoo.setValue(o00000o);
        return true;
    }

    @Override // p263o00ooo.o000OO0O
    public final long OooO0oo() {
        long j;
        long j2;
        o000OO0O o000oo0o2 = this.f30259OoooO0;
        OooOo00 oooOo00 = o000oo0o2 == null ? null : new OooOo00(o000oo0o2.OooO0oo());
        if (oooOo00 == null) {
            OooOo00.OooO00o oooO00o = OooOo00.f30416OooO0O0;
            j = OooOo00.f30417OooO0OO;
        } else {
            j = oooOo00.f30419OooO00o;
        }
        o000OO0O o000oo0o3 = this.f30260OoooO0O;
        OooOo00 oooOo01 = o000oo0o3 != null ? new OooOo00(o000oo0o3.OooO0oo()) : null;
        if (oooOo01 == null) {
            OooOo00.OooO00o oooO00o2 = OooOo00.f30416OooO0O0;
            j2 = OooOo00.f30417OooO0OO;
        } else {
            j2 = oooOo01.f30419OooO00o;
        }
        OooOo00.OooO00o oooO00o3 = OooOo00.f30416OooO0O0;
        long j3 = OooOo00.f30418OooO0Oo;
        if (j != j3) {
            return j2 != j3 ? OooOo.OooO00o(Math.max(OooOo00.OooO0Oo(j), OooOo00.OooO0Oo(j2)), Math.max(OooOo00.OooO0O0(j), OooOo00.OooO0O0(j2))) : j3;
        }
        return j3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p263o00ooo.o000OO0O
    public final void OooOO0(@NotNull o0Oo0oo o0oo0oo2) {
        Intrinsics.checkNotNullParameter(o0oo0oo2, "<this>");
        if (this.f30264OoooOo0) {
            OooOO0O(o0oo0oo2, this.f30260OoooO0O, OooOO0o());
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f30263OoooOOo == -1) {
            this.f30263OoooOOo = jUptimeMillis;
        }
        float f = (jUptimeMillis - this.f30263OoooOOo) / this.f30261OoooOO0;
        float fOooOO0o = OooOO0o() * RangesKt.coerceIn(f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f);
        float fOooOO0o2 = this.f30267o000oOoO ? OooOO0o() - fOooOO0o : OooOO0o();
        this.f30264OoooOo0 = ((double) f) >= 1.0d;
        OooOO0O(o0oo0oo2, this.f30259OoooO0, fOooOO0o2);
        OooOO0O(o0oo0oo2, this.f30260OoooO0O, fOooOO0o);
        if (this.f30264OoooOo0) {
            this.f30259OoooO0 = null;
        } else {
            this.f30262OoooOOO.setValue(Integer.valueOf(((Number) this.f30262OoooOOO.getValue()).intValue() + 1));
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
        OooOo00.OooO00o oooO00o = OooOo00.f30416OooO0O0;
        long j = OooOo00.f30418OooO0Oo;
        if ((jOooO0oo == j) || OooOo00.OooO0o(jOooO0oo)) {
            jOooO00o = jOooO0OO;
        } else {
            if ((jOooO0OO == j) || OooOo00.OooO0o(jOooO0OO)) {
                jOooO00o = jOooO0OO;
            } else {
                float fOooO0Oo = OooOo00.OooO0Oo(jOooO0oo);
                float fOooO0O0 = OooOo00.OooO0O0(jOooO0oo);
                Oooo000 oooo000 = Oooo000.f30344OooO00o;
                float fOooO0Oo2 = OooOo00.OooO0Oo(jOooO0OO);
                float fOooO0O1 = OooOo00.OooO0O0(jOooO0OO);
                Scale scale = this.f30258OoooO;
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
            o000oo0o2.OooO0oO(o0oo0oo2, jOooO00o, f, (o00000O) this.f30266OoooOoo.getValue());
            return;
        }
        float f4 = 2;
        float fOooO0Oo3 = (OooOo00.OooO0Oo(jOooO0OO) - OooOo00.OooO0Oo(jOooO00o)) / f4;
        float fOooO0O2 = (OooOo00.OooO0O0(jOooO0OO) - OooOo00.OooO0O0(jOooO00o)) / f4;
        o0oo0oo2.Ooooo0o().OooO0Oo().OooO0o(fOooO0Oo3, fOooO0O2, fOooO0Oo3, fOooO0O2);
        o000oo0o2.OooO0oO(o0oo0oo2, jOooO00o, f, (o00000O) this.f30266OoooOoo.getValue());
        float f5 = -fOooO0Oo3;
        float f6 = -fOooO0O2;
        o0oo0oo2.Ooooo0o().OooO0Oo().OooO0o(f5, f6, f5, f6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float OooOO0o() {
        return ((Number) this.f30265OoooOoO.getValue()).floatValue();
    }
}
