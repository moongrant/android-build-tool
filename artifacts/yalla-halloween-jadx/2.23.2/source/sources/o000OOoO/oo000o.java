package o000OOoO;

import androidx.annotation.Nullable;
import androidx.compose.animation.core.AnimationKt;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import java.util.Collections;
import kotlin.jvm.internal.ByteCompanionObject;
import p080o000OoO.o00;
import p080o000OoO.o000;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class oo000o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f34732OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f34733OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f34734OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f34735OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f34736OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f34737OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f34738OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f34739OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f34740OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final long f34741OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final OooO00o f34742OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public final Metadata f34743OooOO0o;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long[] f34744OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long[] f34745OooO0O0;

        public OooO00o(long[] jArr, long[] jArr2) {
            this.f34744OooO00o = jArr;
            this.f34745OooO0O0 = jArr2;
        }
    }

    public oo000o(byte[] bArr, int i) {
        o000 o000Var = new o000(bArr, bArr.length);
        o000Var.OooOO0O(i * 8);
        this.f34733OooO00o = o000Var.OooO0oO(16);
        this.f34734OooO0O0 = o000Var.OooO0oO(16);
        this.f34735OooO0OO = o000Var.OooO0oO(24);
        this.f34736OooO0Oo = o000Var.OooO0oO(24);
        int iOooO0oO = o000Var.OooO0oO(20);
        this.f34738OooO0o0 = iOooO0oO;
        this.f34737OooO0o = OooO0Oo(iOooO0oO);
        this.f34739OooO0oO = o000Var.OooO0oO(3) + 1;
        int iOooO0oO2 = o000Var.OooO0oO(5) + 1;
        this.f34740OooO0oo = iOooO0oO2;
        this.f34732OooO = OooO00o(iOooO0oO2);
        int iOooO0oO3 = o000Var.OooO0oO(4);
        int iOooO0oO4 = o000Var.OooO0oO(32);
        int i2 = o00.f34910OooO00o;
        this.f34741OooOO0 = ((((long) iOooO0oO3) & 4294967295L) << 32) | (((long) iOooO0oO4) & 4294967295L);
        this.f34742OooOO0O = null;
        this.f34743OooOO0o = null;
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
        long j = this.f34741OooOO0;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * AnimationKt.MillisToNanos) / ((long) this.f34738OooO0o0);
    }

    public final androidx.media3.common.OooOO0 OooO0OO(byte[] bArr, @Nullable Metadata metadata) {
        bArr[4] = ByteCompanionObject.MIN_VALUE;
        int i = this.f34736OooO0Oo;
        if (i <= 0) {
            i = -1;
        }
        Metadata metadata2 = this.f34743OooOO0o;
        if (metadata2 != null) {
            metadata = metadata == null ? metadata2 : metadata2.OooO00o(metadata.f6336OooO0Oo);
        }
        androidx.media3.common.OooOO0.OooO00o oooO00o = new androidx.media3.common.OooOO0.OooO00o();
        oooO00o.f6445OooOO0O = "audio/flac";
        oooO00o.f6446OooOO0o = i;
        oooO00o.f6454OooOo = this.f34739OooO0oO;
        oooO00o.f6460OooOoO0 = this.f34738OooO0o0;
        oooO00o.f6448OooOOO0 = Collections.singletonList(bArr);
        oooO00o.f6435OooO = metadata;
        return new androidx.media3.common.OooOO0(oooO00o);
    }

    public oo000o(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, @Nullable OooO00o oooO00o, @Nullable Metadata metadata) {
        this.f34733OooO00o = i;
        this.f34734OooO0O0 = i2;
        this.f34735OooO0OO = i3;
        this.f34736OooO0Oo = i4;
        this.f34738OooO0o0 = i5;
        this.f34737OooO0o = OooO0Oo(i5);
        this.f34739OooO0oO = i6;
        this.f34740OooO0oo = i7;
        this.f34732OooO = OooO00o(i7);
        this.f34741OooOO0 = j;
        this.f34742OooOO0O = oooO00o;
        this.f34743OooOO0o = metadata;
    }
}
