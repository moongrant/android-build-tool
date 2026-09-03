package androidx.media3.common.audio;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface AudioProcessor {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ByteBuffer f6730OooO00o = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final OooO00o f6731OooO0o0 = new OooO00o(-1, -1, -1);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f6732OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f6733OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f6734OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f6735OooO0Oo;

        public OooO00o(int i, int i2, int i3) {
            this.f6732OooO00o = i;
            this.f6733OooO0O0 = i2;
            this.f6734OooO0OO = i3;
            this.f6735OooO0Oo = o00.Oooo0(i3) ? o00.OooOo0O(i3, i2) : -1;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f6732OooO00o == oooO00o.f6732OooO00o && this.f6733OooO0O0 == oooO00o.f6733OooO0O0 && this.f6734OooO0OO == oooO00o.f6734OooO0OO;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6732OooO00o), Integer.valueOf(this.f6733OooO0O0), Integer.valueOf(this.f6734OooO0OO)});
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
            sb.append(this.f6732OooO00o);
            sb.append(", channelCount=");
            sb.append(this.f6733OooO0O0);
            sb.append(", encoding=");
            return androidx.compose.foundation.layout.OooO0O0.OooO00o(sb, this.f6734OooO0OO, ']');
        }
    }

    public static final class UnhandledAudioFormatException extends Exception {
        public UnhandledAudioFormatException(OooO00o oooO00o) {
            super("Unhandled input format: " + oooO00o);
        }
    }

    @CanIgnoreReturnValue
    OooO00o OooO(OooO00o oooO00o) throws UnhandledAudioFormatException;

    ByteBuffer OooO0o();

    boolean OooO0o0();

    void OooO0oO(ByteBuffer byteBuffer);

    void OooO0oo();

    void flush();

    boolean isActive();

    void reset();
}
