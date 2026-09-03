package androidx.media3.session;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.media3.common.Player;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O00 implements androidx.media3.common.OooO0OO {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final Player.OooO0o f9433OooOOO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final o00O0O00 f9434OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final String f9435OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final String f9436OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final String f9437OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public static final String f9438OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final String f9439OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final String f9440OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final String f9441OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final String f9442OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final String f9443OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final o00O0 f9444OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final String f9445OooOoO0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f9446OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Player.OooO0o f9447OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f9448OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f9449OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f9450OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final long f9451OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final long f9452OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final long f9453OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final long f9454OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final long f9455OooOOO0;

    static {
        Player.OooO0o oooO0o = new Player.OooO0o(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f9433OooOOO = oooO0o;
        f9434OooOOOO = new o00O0O00(oooO0o, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        f9435OooOOOo = p080o000OoO.o00.Oooo00o(0);
        f9437OooOOo0 = p080o000OoO.o00.Oooo00o(1);
        f9436OooOOo = p080o000OoO.o00.Oooo00o(2);
        f9438OooOOoo = p080o000OoO.o00.Oooo00o(3);
        f9441OooOo00 = p080o000OoO.o00.Oooo00o(4);
        f9440OooOo0 = p080o000OoO.o00.Oooo00o(5);
        f9442OooOo0O = p080o000OoO.o00.Oooo00o(6);
        f9443OooOo0o = p080o000OoO.o00.Oooo00o(7);
        f9439OooOo = p080o000OoO.o00.Oooo00o(8);
        f9445OooOoO0 = p080o000OoO.o00.Oooo00o(9);
        f9444OooOoO = new o00O0();
    }

    public o00O0O00(Player.OooO0o oooO0o, boolean z, long j, long j2, long j3, int i, long j4, long j5, long j6, long j7) {
        p080o000OoO.o00Oo0.OooO00o(z == (oooO0o.f6722OooOO0O != -1));
        this.f9447OooO0Oo = oooO0o;
        this.f9449OooO0o0 = z;
        this.f9448OooO0o = j;
        this.f9450OooO0oO = j2;
        this.f9451OooO0oo = j3;
        this.f9446OooO = i;
        this.f9452OooOO0 = j4;
        this.f9453OooOO0O = j5;
        this.f9454OooOO0o = j6;
        this.f9455OooOOO0 = j7;
    }

    public final Bundle OooO0OO(boolean z, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putBundle(f9435OooOOOo, this.f9447OooO0Oo.OooO0OO(z, z2));
        bundle.putBoolean(f9437OooOOo0, z && this.f9449OooO0o0);
        bundle.putLong(f9436OooOOo, this.f9448OooO0o);
        bundle.putLong(f9438OooOOoo, z ? this.f9450OooO0oO : -9223372036854775807L);
        bundle.putLong(f9441OooOo00, z ? this.f9451OooO0oo : 0L);
        bundle.putInt(f9440OooOo0, z ? this.f9446OooO : 0);
        bundle.putLong(f9442OooOo0O, z ? this.f9452OooOO0 : 0L);
        bundle.putLong(f9443OooOo0o, z ? this.f9453OooOO0O : -9223372036854775807L);
        bundle.putLong(f9439OooOo, z ? this.f9454OooOO0o : -9223372036854775807L);
        bundle.putLong(f9445OooOoO0, z ? this.f9455OooOOO0 : 0L);
        return bundle;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o00O0O00.class != obj.getClass()) {
            return false;
        }
        o00O0O00 o00o0o01 = (o00O0O00) obj;
        return this.f9447OooO0Oo.equals(o00o0o01.f9447OooO0Oo) && this.f9449OooO0o0 == o00o0o01.f9449OooO0o0 && this.f9448OooO0o == o00o0o01.f9448OooO0o && this.f9450OooO0oO == o00o0o01.f9450OooO0oO && this.f9451OooO0oo == o00o0o01.f9451OooO0oo && this.f9446OooO == o00o0o01.f9446OooO && this.f9452OooOO0 == o00o0o01.f9452OooOO0 && this.f9453OooOO0O == o00o0o01.f9453OooOO0O && this.f9454OooOO0o == o00o0o01.f9454OooOO0o && this.f9455OooOOO0 == o00o0o01.f9455OooOOO0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9447OooO0Oo, Boolean.valueOf(this.f9449OooO0o0)});
    }

    @Override // androidx.media3.common.OooO0OO
    public final Bundle toBundle() {
        return OooO0OO(true, true);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        Player.OooO0o oooO0o = this.f9447OooO0Oo;
        sb.append(oooO0o.f6718OooO0o0);
        sb.append(", periodIndex=");
        sb.append(oooO0o.f6720OooO0oo);
        sb.append(", positionMs=");
        sb.append(oooO0o.f6715OooO);
        sb.append(", contentPositionMs=");
        sb.append(oooO0o.f6721OooOO0);
        sb.append(", adGroupIndex=");
        sb.append(oooO0o.f6722OooOO0O);
        sb.append(", adIndexInAdGroup=");
        sb.append(oooO0o.f6723OooOO0o);
        sb.append("}, isPlayingAd=");
        sb.append(this.f9449OooO0o0);
        sb.append(", eventTimeMs=");
        sb.append(this.f9448OooO0o);
        sb.append(", durationMs=");
        sb.append(this.f9450OooO0oO);
        sb.append(", bufferedPositionMs=");
        sb.append(this.f9451OooO0oo);
        sb.append(", bufferedPercentage=");
        sb.append(this.f9446OooO);
        sb.append(", totalBufferedDurationMs=");
        sb.append(this.f9452OooOO0);
        sb.append(", currentLiveOffsetMs=");
        sb.append(this.f9453OooOO0O);
        sb.append(", contentDurationMs=");
        sb.append(this.f9454OooOO0o);
        sb.append(", contentBufferedPositionMs=");
        return android.support.v4.media.session.OooO0OO.OooO0O0(sb, this.f9455OooOOO0, "}");
    }
}
