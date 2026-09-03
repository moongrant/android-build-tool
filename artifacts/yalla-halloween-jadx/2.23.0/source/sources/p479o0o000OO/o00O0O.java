package p479o0o000OO;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000000;
import com.common.support.apm.utils.NumberExtensionsKt;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomLiveWebsocketMessagePackage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomLiveWebsocketMessagePackage.kt\ncom/yalla/yalla/service/room/socket/RoomLiveWebsocketMessagePackage\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,84:1\n1#2:85\n*E\n"})
public final class o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f47676OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final byte[] f47677OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f47678OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f47679OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final SecureRandom f47675OooO0o0 = new SecureRandom(NumberExtensionsKt.toByteArray$default(System.currentTimeMillis(), false, 1, (Object) null));

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final o00O0O f47674OooO0o = new o00O0O(0, new byte[0], 0);

    public static final class OooO00o {
        @NotNull
        public static o00O0O OooO00o(long j, boolean z, @Nullable byte[] bArr) {
            return new o00O0O(j, bArr, o000000.OooO0O0(Boolean.valueOf(z)));
        }
    }

    public o00O0O(long j, byte[] bArr, int i, long j2) {
        this.f47676OooO00o = j;
        this.f47677OooO0O0 = bArr;
        this.f47678OooO0OO = i;
        this.f47679OooO0Oo = j2;
    }

    @NotNull
    public final byte[] OooO00o() {
        byte[] bArr = this.f47677OooO0O0;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((bArr != null ? bArr.length : 0) + 20);
        byteBufferAllocate.put((byte) -65);
        byteBufferAllocate.putShort((short) 17);
        byteBufferAllocate.put((byte) this.f47678OooO0OO);
        byteBufferAllocate.putLong(this.f47679OooO0Oo);
        byteBufferAllocate.putLong(this.f47676OooO00o);
        if (bArr != null) {
            byteBufferAllocate.put(bArr);
        }
        byte[] bArrArray = byteBufferAllocate.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "byteBuffer.array()");
        return bArrArray;
    }

    public /* synthetic */ o00O0O(long j, byte[] bArr, int i) {
        this(j, bArr, i, f47675OooO0o0.nextLong());
    }
}
