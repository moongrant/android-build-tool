package p486o0o000oo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000000;
import com.common.support.apm.utils.NumberExtensionsKt;
import java.security.SecureRandom;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p590o0oOooo0.oOO00OO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oo00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final SecureRandom f48733OooO0Oo = new SecureRandom(NumberExtensionsKt.toByteArray$default(System.currentTimeMillis(), false, 1, (Object) null));

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f48734OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final byte[] f48735OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f48736OooO0OO;

    public static final class OooO00o {
        @NotNull
        public static oo00o OooO00o(long j, boolean z, @Nullable byte[] bArr) {
            return new oo00o(j, bArr, o000000.OooO0O0(Boolean.valueOf(z)), 0);
        }
    }

    static {
        new oo00o(0L, new byte[0], 0, 0);
    }

    public oo00o(long j, byte[] bArr, int i) {
        this.f48734OooO00o = j;
        this.f48735OooO0O0 = bArr;
        this.f48736OooO0OO = i;
    }

    @NotNull
    public final byte[] OooO00o() {
        byte[] bArr = this.f48735OooO0O0;
        int length = (bArr != null ? bArr.length : 0) + 8;
        byte[] bArr2 = new byte[length];
        byte[] bArrOooO00o = oOO00OO.OooO00o(length);
        byte[] bArrOooO00o2 = oOO00OO.OooO00o((int) this.f48734OooO00o);
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
    public /* synthetic */ oo00o(long j, byte[] bArr, int i, int i2) {
        this(j, bArr, i);
        f48733OooO0Oo.nextLong();
    }
}
