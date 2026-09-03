package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0O00;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p245o00oo0o.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ImmutableList<AudioProcessor> f11606OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f11607OooO0O0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public ByteBuffer[] f11608OooO0OO = new ByteBuffer[0];

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f11609OooO0Oo;

    public OooO0OO(o0O00 o0o01) {
        this.f11606OooO00o = o0o01;
        AudioProcessor.OooO00o oooO00o = AudioProcessor.OooO00o.f11443OooO0o0;
        this.f11609OooO0Oo = false;
    }

    @CanIgnoreReturnValue
    public final AudioProcessor.OooO00o OooO00o(AudioProcessor.OooO00o oooO00o) throws AudioProcessor.UnhandledAudioFormatException {
        if (oooO00o.equals(AudioProcessor.OooO00o.f11443OooO0o0)) {
            throw new AudioProcessor.UnhandledAudioFormatException(oooO00o);
        }
        int i = 0;
        while (true) {
            ImmutableList<AudioProcessor> immutableList = this.f11606OooO00o;
            if (i >= immutableList.size()) {
                return oooO00o;
            }
            AudioProcessor audioProcessor = immutableList.get(i);
            AudioProcessor.OooO00o oooO00oOooO0OO = audioProcessor.OooO0OO(oooO00o);
            if (audioProcessor.isActive()) {
                o00O000o.OooO0Oo(!oooO00oOooO0OO.equals(AudioProcessor.OooO00o.f11443OooO0o0));
                oooO00o = oooO00oOooO0OO;
            }
            i++;
        }
    }

    public final void OooO0O0() {
        ArrayList arrayList = this.f11607OooO0O0;
        arrayList.clear();
        int i = 0;
        this.f11609OooO0Oo = false;
        int i2 = 0;
        while (true) {
            ImmutableList<AudioProcessor> immutableList = this.f11606OooO00o;
            if (i2 >= immutableList.size()) {
                break;
            }
            AudioProcessor audioProcessor = immutableList.get(i2);
            audioProcessor.flush();
            if (audioProcessor.isActive()) {
                arrayList.add(audioProcessor);
            }
            i2++;
        }
        this.f11608OooO0OO = new ByteBuffer[arrayList.size()];
        while (true) {
            ByteBuffer[] byteBufferArr = this.f11608OooO0OO;
            if (i > byteBufferArr.length - 1) {
                return;
            }
            byteBufferArr[i] = ((AudioProcessor) arrayList.get(i)).OooO00o();
            i++;
        }
    }

    public final boolean OooO0OO() {
        if (this.f11609OooO0Oo && ((AudioProcessor) this.f11607OooO0O0.get(this.f11608OooO0OO.length - 1)).OooO0Oo()) {
            ByteBuffer[] byteBufferArr = this.f11608OooO0OO;
            if (!byteBufferArr[byteBufferArr.length - 1].hasRemaining()) {
                return true;
            }
        }
        return false;
    }

    public final boolean OooO0Oo() {
        return !this.f11607OooO0O0.isEmpty();
    }

    public final void OooO0o() {
        int i = 0;
        while (true) {
            ImmutableList<AudioProcessor> immutableList = this.f11606OooO00o;
            if (i >= immutableList.size()) {
                this.f11608OooO0OO = new ByteBuffer[0];
                AudioProcessor.OooO00o oooO00o = AudioProcessor.OooO00o.f11443OooO0o0;
                this.f11609OooO0Oo = false;
                return;
            } else {
                AudioProcessor audioProcessor = immutableList.get(i);
                audioProcessor.flush();
                audioProcessor.reset();
                i++;
            }
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final void OooO0o0(java.nio.ByteBuffer r10) {
        /*
            r9 = this;
            r0 = 1
            r1 = r0
        L2:
            if (r1 == 0) goto L87
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            java.nio.ByteBuffer[] r4 = r9.f11608OooO0OO
            int r5 = r4.length
            int r5 = r5 + (-1)
            if (r3 > r5) goto L84
            r4 = r4[r3]
            boolean r4 = r4.hasRemaining()
            if (r4 == 0) goto L18
            goto L81
        L18:
            java.util.ArrayList r4 = r9.f11607OooO0O0
            java.lang.Object r5 = r4.get(r3)
            com.google.android.exoplayer2.audio.AudioProcessor r5 = (com.google.android.exoplayer2.audio.AudioProcessor) r5
            boolean r6 = r5.OooO0Oo()
            if (r6 == 0) goto L43
            java.nio.ByteBuffer[] r5 = r9.f11608OooO0OO
            r5 = r5[r3]
            boolean r5 = r5.hasRemaining()
            if (r5 != 0) goto L81
            java.nio.ByteBuffer[] r5 = r9.f11608OooO0OO
            int r5 = r5.length
            int r5 = r5 + (-1)
            if (r3 >= r5) goto L81
            int r5 = r3 + 1
            java.lang.Object r4 = r4.get(r5)
            com.google.android.exoplayer2.audio.AudioProcessor r4 = (com.google.android.exoplayer2.audio.AudioProcessor) r4
            r4.OooO0o0()
            goto L81
        L43:
            if (r3 <= 0) goto L4c
            java.nio.ByteBuffer[] r4 = r9.f11608OooO0OO
            int r6 = r3 + (-1)
            r4 = r4[r6]
            goto L56
        L4c:
            boolean r4 = r10.hasRemaining()
            if (r4 == 0) goto L54
            r4 = r10
            goto L56
        L54:
            java.nio.ByteBuffer r4 = com.google.android.exoplayer2.audio.AudioProcessor.f11442OooO00o
        L56:
            int r6 = r4.remaining()
            long r6 = (long) r6
            r5.OooO0O0(r4)
            java.nio.ByteBuffer[] r8 = r9.f11608OooO0OO
            java.nio.ByteBuffer r5 = r5.OooO00o()
            r8[r3] = r5
            int r4 = r4.remaining()
            long r4 = (long) r4
            long r6 = r6 - r4
            r4 = 0
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 > 0) goto L7f
            java.nio.ByteBuffer[] r4 = r9.f11608OooO0OO
            r4 = r4[r3]
            boolean r4 = r4.hasRemaining()
            if (r4 == 0) goto L7d
            goto L7f
        L7d:
            r4 = r1
            goto L80
        L7f:
            r4 = r0
        L80:
            r2 = r2 | r4
        L81:
            int r3 = r3 + 1
            goto L7
        L84:
            r1 = r2
            goto L2
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.OooO0OO.OooO0o0(java.nio.ByteBuffer):void");
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO0OO)) {
            return false;
        }
        OooO0OO oooO0OO = (OooO0OO) obj;
        ImmutableList<AudioProcessor> immutableList = this.f11606OooO00o;
        if (immutableList.size() != oooO0OO.f11606OooO00o.size()) {
            return false;
        }
        for (int i = 0; i < immutableList.size(); i++) {
            if (immutableList.get(i) != oooO0OO.f11606OooO00o.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f11606OooO00o.hashCode();
    }
}
