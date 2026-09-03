package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface AudioProcessor {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ByteBuffer f11442OooO00o = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final OooO00o f11443OooO0o0 = new OooO00o(-1, -1, -1);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f11444OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f11445OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f11446OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f11447OooO0Oo;

        public OooO00o(int i, int i2, int i3) {
            this.f11444OooO00o = i;
            this.f11445OooO0O0 = i2;
            this.f11446OooO0OO = i3;
            this.f11447OooO0Oo = o0O00.Oooo00o(i3) ? o0O00.OooOo0(i3, i2) : -1;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f11444OooO00o == oooO00o.f11444OooO00o && this.f11445OooO0O0 == oooO00o.f11445OooO0O0 && this.f11446OooO0OO == oooO00o.f11446OooO0OO;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11444OooO00o), Integer.valueOf(this.f11445OooO0O0), Integer.valueOf(this.f11446OooO0OO)});
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
            sb.append(this.f11444OooO00o);
            sb.append(", channelCount=");
            sb.append(this.f11445OooO0O0);
            sb.append(", encoding=");
            return androidx.compose.foundation.layout.OooO0O0.OooO00o(sb, this.f11446OooO0OO, ']');
        }
    }

    public static final class UnhandledAudioFormatException extends Exception {
        public UnhandledAudioFormatException(OooO00o oooO00o) {
            super("Unhandled input format: " + oooO00o);
        }
    }

    ByteBuffer OooO00o();

    void OooO0O0(ByteBuffer byteBuffer);

    @CanIgnoreReturnValue
    OooO00o OooO0OO(OooO00o oooO00o) throws UnhandledAudioFormatException;

    boolean OooO0Oo();

    void OooO0o0();

    void flush();

    boolean isActive();

    void reset();
}
