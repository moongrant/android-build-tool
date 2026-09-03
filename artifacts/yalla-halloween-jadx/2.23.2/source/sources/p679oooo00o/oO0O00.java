package p679oooo00o;

import androidx.compose.animation.core.AnimationKt;
import androidx.media3.common.Metadata;
import androidx.media3.common.OooOO0;
import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.UByte;
import o000OOoO.o00000O0;
import o000OOoO.o0O0O00;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p080o000OoO.o000O000;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class oO0O00 extends oO0O00O {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final byte[] f60399OooOOOO = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final byte[] f60400OooOOOo = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f60401OooOOO;

    public static boolean OooO0o0(o000O000 o000o001, byte[] bArr) {
        int i = o000o001.f34964OooO0OO;
        int i2 = o000o001.f34963OooO0O0;
        if (i - i2 < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        o000o001.OooO0Oo(0, bArr.length, bArr2);
        o000o001.Oooo00O(i2);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // p679oooo00o.oO0O00O
    public final long OooO0O0(o000O000 o000o001) {
        byte[] bArr = o000o001.f34962OooO00o;
        return (((long) this.f60409OooO) * o0O0O00.OooO0O0(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / AnimationKt.MillisToNanos;
    }

    @Override // p679oooo00o.oO0O00O
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean OooO0OO(o000O000 o000o001, long j, oO0O00O.OooO00o oooO00o) throws ParserException {
        if (OooO0o0(o000o001, f60399OooOOOO)) {
            byte[] bArrCopyOf = Arrays.copyOf(o000o001.f34962OooO00o, o000o001.f34964OooO0OO);
            int i = bArrCopyOf[9] & UByte.MAX_VALUE;
            ArrayList arrayListOooO00o = o0O0O00.OooO00o(bArrCopyOf);
            if (oooO00o.f60422OooO00o != null) {
                return true;
            }
            OooOO0.OooO00o oooO00o2 = new OooOO0.OooO00o();
            oooO00o2.f6445OooOO0O = "audio/opus";
            oooO00o2.f6454OooOo = i;
            oooO00o2.f6460OooOoO0 = 48000;
            oooO00o2.f6448OooOOO0 = arrayListOooO00o;
            oooO00o.f60422OooO00o = new OooOO0(oooO00o2);
            return true;
        }
        if (!OooO0o0(o000o001, f60400OooOOOo)) {
            o00Oo0.OooO0o(oooO00o.f60422OooO00o);
            return false;
        }
        o00Oo0.OooO0o(oooO00o.f60422OooO00o);
        if (this.f60401OooOOO) {
            return true;
        }
        this.f60401OooOOO = true;
        o000o001.Oooo00o(8);
        Metadata metadataOooO00o = o00000O0.OooO00o(ImmutableList.OooOO0o(o00000O0.OooO0O0(o000o001, false, false).f34704OooO00o));
        if (metadataOooO00o == null) {
            return true;
        }
        OooOO0 oooOO1 = oooO00o.f60422OooO00o;
        oooOO1.getClass();
        OooOO0.OooO00o oooO00o3 = new OooOO0.OooO00o(oooOO1);
        Metadata metadata = oooO00o.f60422OooO00o.f6411OooOOO0;
        if (metadata != null) {
            metadataOooO00o = metadataOooO00o.OooO00o(metadata.f6336OooO0Oo);
        }
        oooO00o3.f6435OooO = metadataOooO00o;
        oooO00o.f60422OooO00o = new OooOO0(oooO00o3);
        return true;
    }

    @Override // p679oooo00o.oO0O00O
    public final void OooO0Oo(boolean z) {
        super.OooO0Oo(z);
        if (z) {
            this.f60401OooOOO = false;
        }
    }
}
