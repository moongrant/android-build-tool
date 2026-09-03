package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public interface AudioProcessor {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ByteBuffer f13472OooO00o = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final OooO00o f13473OooO0o0 = new OooO00o(-1, -1, -1);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f13474OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f13475OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f13476OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f13477OooO0Oo;

        public OooO00o(int i, int i2, int i3) {
            this.f13474OooO00o = i;
            this.f13475OooO0O0 = i2;
            this.f13476OooO0OO = i3;
            this.f13477OooO0Oo = o000OOo0.OooOoO(i3) ? o000OOo0.OooOo00(i3, i2) : -1;
        }

        public final String toString() {
            int i = this.f13474OooO00o;
            int i2 = this.f13475OooO0O0;
            int i3 = this.f13476OooO0OO;
            StringBuilder sb = new StringBuilder(83);
            sb.append("AudioFormat[sampleRate=");
            sb.append(i);
            sb.append(", channelCount=");
            sb.append(i2);
            sb.append(", encoding=");
            sb.append(i3);
            sb.append(']');
            return sb.toString();
        }
    }

    public static final class UnhandledAudioFormatException extends Exception {
        public UnhandledAudioFormatException(OooO00o oooO00o) {
            String strValueOf = String.valueOf(oooO00o);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 18);
            sb.append("Unhandled format: ");
            sb.append(strValueOf);
            super(sb.toString());
        }
    }

    void OooO00o();

    ByteBuffer OooO0O0();

    void OooO0OO(ByteBuffer byteBuffer);

    boolean OooO0Oo();

    void OooO0o();

    OooO00o OooO0o0(OooO00o oooO00o) throws UnhandledAudioFormatException;

    void flush();

    boolean isActive();
}
