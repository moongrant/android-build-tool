package androidx.media3.common.audio;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0O00;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ImmutableList<AudioProcessor> f6736OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f6737OooO0O0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public ByteBuffer[] f6738OooO0OO = new ByteBuffer[0];

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f6739OooO0Oo;

    public OooO00o(o0O00 o0o01) {
        this.f6736OooO00o = o0o01;
        AudioProcessor.OooO00o oooO00o = AudioProcessor.OooO00o.f6731OooO0o0;
        this.f6739OooO0Oo = false;
    }

    @CanIgnoreReturnValue
    public final AudioProcessor.OooO00o OooO00o(AudioProcessor.OooO00o oooO00o) throws AudioProcessor.UnhandledAudioFormatException {
        if (oooO00o.equals(AudioProcessor.OooO00o.f6731OooO0o0)) {
            throw new AudioProcessor.UnhandledAudioFormatException(oooO00o);
        }
        int i = 0;
        while (true) {
            ImmutableList<AudioProcessor> immutableList = this.f6736OooO00o;
            if (i >= immutableList.size()) {
                return oooO00o;
            }
            AudioProcessor audioProcessor = immutableList.get(i);
            AudioProcessor.OooO00o oooO00oOooO = audioProcessor.OooO(oooO00o);
            if (audioProcessor.isActive()) {
                o00Oo0.OooO0Oo(!oooO00oOooO.equals(AudioProcessor.OooO00o.f6731OooO0o0));
                oooO00o = oooO00oOooO;
            }
            i++;
        }
    }

    public final void OooO0O0() {
        ArrayList arrayList = this.f6737OooO0O0;
        arrayList.clear();
        int i = 0;
        this.f6739OooO0Oo = false;
        int i2 = 0;
        while (true) {
            ImmutableList<AudioProcessor> immutableList = this.f6736OooO00o;
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
        this.f6738OooO0OO = new ByteBuffer[arrayList.size()];
        while (true) {
            ByteBuffer[] byteBufferArr = this.f6738OooO0OO;
            if (i > byteBufferArr.length - 1) {
                return;
            }
            byteBufferArr[i] = ((AudioProcessor) arrayList.get(i)).OooO0o();
            i++;
        }
    }

    public final boolean OooO0OO() {
        if (this.f6739OooO0Oo && ((AudioProcessor) this.f6737OooO0O0.get(this.f6738OooO0OO.length - 1)).OooO0o0()) {
            ByteBuffer[] byteBufferArr = this.f6738OooO0OO;
            if (!byteBufferArr[byteBufferArr.length - 1].hasRemaining()) {
                return true;
            }
        }
        return false;
    }

    public final boolean OooO0Oo() {
        return !this.f6737OooO0O0.isEmpty();
    }

    public final void OooO0o() {
        int i = 0;
        while (true) {
            ImmutableList<AudioProcessor> immutableList = this.f6736OooO00o;
            if (i >= immutableList.size()) {
                this.f6738OooO0OO = new ByteBuffer[0];
                AudioProcessor.OooO00o oooO00o = AudioProcessor.OooO00o.f6731OooO0o0;
                this.f6739OooO0Oo = false;
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
            java.nio.ByteBuffer[] r4 = r9.f6738OooO0OO
            int r5 = r4.length
            int r5 = r5 + (-1)
            if (r3 > r5) goto L84
            r4 = r4[r3]
            boolean r4 = r4.hasRemaining()
            if (r4 == 0) goto L18
            goto L81
        L18:
            java.util.ArrayList r4 = r9.f6737OooO0O0
            java.lang.Object r5 = r4.get(r3)
            androidx.media3.common.audio.AudioProcessor r5 = (androidx.media3.common.audio.AudioProcessor) r5
            boolean r6 = r5.OooO0o0()
            if (r6 == 0) goto L43
            java.nio.ByteBuffer[] r5 = r9.f6738OooO0OO
            r5 = r5[r3]
            boolean r5 = r5.hasRemaining()
            if (r5 != 0) goto L81
            java.nio.ByteBuffer[] r5 = r9.f6738OooO0OO
            int r5 = r5.length
            int r5 = r5 + (-1)
            if (r3 >= r5) goto L81
            int r5 = r3 + 1
            java.lang.Object r4 = r4.get(r5)
            androidx.media3.common.audio.AudioProcessor r4 = (androidx.media3.common.audio.AudioProcessor) r4
            r4.OooO0oo()
            goto L81
        L43:
            if (r3 <= 0) goto L4c
            java.nio.ByteBuffer[] r4 = r9.f6738OooO0OO
            int r6 = r3 + (-1)
            r4 = r4[r6]
            goto L56
        L4c:
            boolean r4 = r10.hasRemaining()
            if (r4 == 0) goto L54
            r4 = r10
            goto L56
        L54:
            java.nio.ByteBuffer r4 = androidx.media3.common.audio.AudioProcessor.f6730OooO00o
        L56:
            int r6 = r4.remaining()
            long r6 = (long) r6
            r5.OooO0oO(r4)
            java.nio.ByteBuffer[] r8 = r9.f6738OooO0OO
            java.nio.ByteBuffer r5 = r5.OooO0o()
            r8[r3] = r5
            int r4 = r4.remaining()
            long r4 = (long) r4
            long r6 = r6 - r4
            r4 = 0
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 > 0) goto L7f
            java.nio.ByteBuffer[] r4 = r9.f6738OooO0OO
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.audio.OooO00o.OooO0o0(java.nio.ByteBuffer):void");
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO00o)) {
            return false;
        }
        OooO00o oooO00o = (OooO00o) obj;
        ImmutableList<AudioProcessor> immutableList = this.f6736OooO00o;
        if (immutableList.size() != oooO00o.f6736OooO00o.size()) {
            return false;
        }
        for (int i = 0; i < immutableList.size(); i++) {
            if (immutableList.get(i) != oooO00o.f6736OooO00o.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f6736OooO00o.hashCode();
    }
}
