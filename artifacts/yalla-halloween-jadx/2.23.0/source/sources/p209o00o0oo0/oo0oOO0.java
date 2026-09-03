package p209o00o0oo0;

import androidx.annotation.Nullable;
import androidx.compose.animation.core.AnimationKt;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Collections;
import kotlin.jvm.internal.ByteCompanionObject;
import p245o00oo0o.o00OOOOo;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class oo0oOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f39578OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f39579OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f39580OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f39581OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f39582OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f39583OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f39584OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f39585OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f39586OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final long f39587OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final OooO00o f39588OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public final Metadata f39589OooOO0o;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long[] f39590OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long[] f39591OooO0O0;

        public OooO00o(long[] jArr, long[] jArr2) {
            this.f39590OooO00o = jArr;
            this.f39591OooO0O0 = jArr2;
        }
    }

    public oo0oOO0(byte[] bArr, int i) {
        o00OOOOo o00ooooo2 = new o00OOOOo(bArr, bArr.length);
        o00ooooo2.OooOO0O(i * 8);
        this.f39579OooO00o = o00ooooo2.OooO0oO(16);
        this.f39580OooO0O0 = o00ooooo2.OooO0oO(16);
        this.f39581OooO0OO = o00ooooo2.OooO0oO(24);
        this.f39582OooO0Oo = o00ooooo2.OooO0oO(24);
        int iOooO0oO = o00ooooo2.OooO0oO(20);
        this.f39584OooO0o0 = iOooO0oO;
        this.f39583OooO0o = OooO0Oo(iOooO0oO);
        this.f39585OooO0oO = o00ooooo2.OooO0oO(3) + 1;
        int iOooO0oO2 = o00ooooo2.OooO0oO(5) + 1;
        this.f39586OooO0oo = iOooO0oO2;
        this.f39578OooO = OooO00o(iOooO0oO2);
        int iOooO0oO3 = o00ooooo2.OooO0oO(4);
        int iOooO0oO4 = o00ooooo2.OooO0oO(32);
        int i2 = o0O00.f40595OooO00o;
        this.f39587OooOO0 = ((((long) iOooO0oO3) & 4294967295L) << 32) | (((long) iOooO0oO4) & 4294967295L);
        this.f39588OooOO0O = null;
        this.f39589OooOO0o = null;
    }

    public static int OooO00o(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int OooO0Oo(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long OooO0O0() {
        long j = this.f39587OooOO0;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * AnimationKt.MillisToNanos) / ((long) this.f39584OooO0o0);
    }

    public final OooOo OooO0OO(byte[] bArr, @Nullable Metadata metadata) {
        bArr[4] = ByteCompanionObject.MIN_VALUE;
        int i = this.f39582OooO0Oo;
        if (i <= 0) {
            i = -1;
        }
        Metadata metadata2 = this.f39589OooOO0o;
        if (metadata2 != null) {
            metadata = metadata == null ? metadata2 : metadata2.OooO00o(metadata.f12530OooO0Oo);
        }
        OooOo.OooO00o oooO00o = new OooOo.OooO00o();
        oooO00o.f11244OooOO0O = "audio/flac";
        oooO00o.f11245OooOO0o = i;
        oooO00o.f11253OooOo = this.f39585OooO0oO;
        oooO00o.f11259OooOoO0 = this.f39584OooO0o0;
        oooO00o.f11247OooOOO0 = Collections.singletonList(bArr);
        oooO00o.f11234OooO = metadata;
        return new OooOo(oooO00o);
    }

    public oo0oOO0(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, @Nullable OooO00o oooO00o, @Nullable Metadata metadata) {
        this.f39579OooO00o = i;
        this.f39580OooO0O0 = i2;
        this.f39581OooO0OO = i3;
        this.f39582OooO0Oo = i4;
        this.f39584OooO0o0 = i5;
        this.f39583OooO0o = OooO0Oo(i5);
        this.f39585OooO0oO = i6;
        this.f39586OooO0oo = i7;
        this.f39578OooO = OooO00o(i7);
        this.f39587OooOO0 = j;
        this.f39588OooOO0O = oooO00o;
        this.f39589OooOO0o = metadata;
    }
}
