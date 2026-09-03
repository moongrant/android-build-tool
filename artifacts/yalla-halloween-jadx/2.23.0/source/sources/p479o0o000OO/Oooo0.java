package p479o0o000OO;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000000;
import com.common.support.apm.utils.NumberExtensionsKt;
import java.security.SecureRandom;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p579o0oOoo.oO0000o0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final SecureRandom f47653OooO0Oo = new SecureRandom(NumberExtensionsKt.toByteArray$default(System.currentTimeMillis(), false, 1, (Object) null));

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f47654OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final byte[] f47655OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f47656OooO0OO;

    public static final class OooO00o {
        @NotNull
        public static Oooo0 OooO00o(long j, boolean z, @Nullable byte[] bArr) {
            return new Oooo0(j, bArr, o000000.OooO0O0(Boolean.valueOf(z)), 0);
        }
    }

    static {
        new Oooo0(0L, new byte[0], 0, 0);
    }

    public Oooo0(long j, byte[] bArr, int i) {
        this.f47654OooO00o = j;
        this.f47655OooO0O0 = bArr;
        this.f47656OooO0OO = i;
    }

    @NotNull
    public final byte[] OooO00o() {
        byte[] bArr = this.f47655OooO0O0;
        int length = (bArr != null ? bArr.length : 0) + 8;
        byte[] bArr2 = new byte[length];
        byte[] bArrOooO00o = oO0000o0.OooO00o(length);
        byte[] bArrOooO00o2 = oO0000o0.OooO00o((int) this.f47654OooO00o);
        System.arraycopy(bArrOooO00o, 0, bArr2, 0, 4);
        System.arraycopy(bArrOooO00o2, 0, bArr2, 4, 4);
        if (bArr != null) {
            if (!(bArr.length == 0)) {
                System.arraycopy(bArr, 0, bArr2, 8, bArr.length);
            }
        }
        return bArr2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Oooo0(long j, byte[] bArr, int i, int i2) {
        this(j, bArr, i);
        f47653OooO0Oo.nextLong();
    }
}
