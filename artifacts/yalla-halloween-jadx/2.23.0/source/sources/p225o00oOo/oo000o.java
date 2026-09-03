package p225o00oOo;

import androidx.compose.animation.core.AnimationKt;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.UByte;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p205o00o0oO0.o00O000o;
import p209o00o0oo0.o00OOO00;
import p245o00oo0o.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class oo000o extends o00oO0o {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final byte[] f39817OooOOOO = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final byte[] f39818OooOOOo = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f39819OooOOO;

    public static boolean OooO0o0(o00Oo00 o00oo00, byte[] bArr) {
        int i = o00oo00.f40593OooO0OO;
        int i2 = o00oo00.f40592OooO0O0;
        if (i - i2 < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        o00oo00.OooO0Oo(0, bArr.length, bArr2);
        o00oo00.Oooo00O(i2);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // p225o00oOo.o00oO0o
    public final long OooO0O0(o00Oo00 o00oo00) {
        byte[] bArr = o00oo00.f40591OooO00o;
        return (((long) this.f39789OooO) * o00O000o.OooO0O0(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / AnimationKt.MillisToNanos;
    }

    @Override // p225o00oOo.o00oO0o
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean OooO0OO(o00Oo00 o00oo00, long j, o00oO0o.OooO00o oooO00o) throws ParserException {
        if (OooO0o0(o00oo00, f39817OooOOOO)) {
            byte[] bArrCopyOf = Arrays.copyOf(o00oo00.f40591OooO00o, o00oo00.f40593OooO0OO);
            int i = bArrCopyOf[9] & UByte.MAX_VALUE;
            ArrayList arrayListOooO00o = o00O000o.OooO00o(bArrCopyOf);
            if (oooO00o.f39802OooO00o != null) {
                return true;
            }
            OooOo.OooO00o oooO00o2 = new OooOo.OooO00o();
            oooO00o2.f11244OooOO0O = "audio/opus";
            oooO00o2.f11253OooOo = i;
            oooO00o2.f11259OooOoO0 = 48000;
            oooO00o2.f11247OooOOO0 = arrayListOooO00o;
            oooO00o.f39802OooO00o = new OooOo(oooO00o2);
            return true;
        }
        if (!OooO0o0(o00oo00, f39818OooOOOo)) {
            p245o00oo0o.o00O000o.OooO0o0(oooO00o.f39802OooO00o);
            return false;
        }
        p245o00oo0o.o00O000o.OooO0o0(oooO00o.f39802OooO00o);
        if (this.f39819OooOOO) {
            return true;
        }
        this.f39819OooOOO = true;
        o00oo00.Oooo00o(8);
        Metadata metadataOooO00o = o00OOO00.OooO00o(ImmutableList.OooOO0o(o00OOO00.OooO0O0(o00oo00, false, false).f39553OooO00o));
        if (metadataOooO00o == null) {
            return true;
        }
        OooOo oooOo = oooO00o.f39802OooO00o;
        oooOo.getClass();
        OooOo.OooO00o oooO00o3 = new OooOo.OooO00o(oooOo);
        Metadata metadata = oooO00o.f39802OooO00o.f11210OooOOO0;
        if (metadata != null) {
            metadataOooO00o = metadataOooO00o.OooO00o(metadata.f12530OooO0Oo);
        }
        oooO00o3.f11234OooO = metadataOooO00o;
        oooO00o.f39802OooO00o = new OooOo(oooO00o3);
        return true;
    }

    @Override // p225o00oOo.o00oO0o
    public final void OooO0Oo(boolean z) {
        super.OooO0Oo(z);
        if (z) {
            this.f39819OooOOO = false;
        }
    }
}
