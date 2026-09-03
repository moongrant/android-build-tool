package p091o000o0O;

import androidx.annotation.Nullable;
import androidx.media3.decoder.DecoderException;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import kotlin.jvm.internal.LongCompanionObject;
import o000O00.OooOO0O;
import p026Oooo0o.OooOO0;
import p080o000OoO.o00;
import p080o000OoO.o00Oo0;
import p092o000o0O0.o000000;
import p092o000o0O0.o000OOo;
import p092o000o0O0.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o00Ooo implements oo0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayDeque<OooO00o> f35144OooO00o = new ArrayDeque<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayDeque<o000000> f35145OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final PriorityQueue<OooO00o> f35146OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public OooO00o f35147OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f35148OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f35149OooO0o0;

    public static final class OooO00o extends o000OOo implements Comparable<OooO00o> {

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public long f35150OooOOO0;

        @Override // java.lang.Comparable
        public final int compareTo(OooO00o oooO00o) {
            OooO00o oooO00o2 = oooO00o;
            if (OooO0o(4) == oooO00o2.OooO0o(4)) {
                long j = this.f7087OooO0oo - oooO00o2.f7087OooO0oo;
                if (j == 0) {
                    j = this.f35150OooOOO0 - oooO00o2.f35150OooOOO0;
                    if (j == 0) {
                        return 0;
                    }
                }
                if (j > 0) {
                    return 1;
                }
            } else if (OooO0o(4)) {
                return 1;
            }
            return -1;
        }
    }

    public static final class OooO0O0 extends o000000 {

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final OooOO0O.OooO00o<OooO0O0> f35151OooO0oo;

        public OooO0O0(OooOO0 oooOO1) {
            this.f35151OooO0oo = oooOO1;
        }

        @Override // o000O00.OooOO0O
        public final void OooO0oo() {
            o00Ooo o00ooo2 = (o00Ooo) ((OooOO0) this.f35151OooO0oo).f1070OooO0Oo;
            o00ooo2.getClass();
            this.f33931OooO0Oo = 0;
            this.f35190OooO0o = null;
            o00ooo2.f35145OooO0O0.add(this);
        }
    }

    public o00Ooo() {
        for (int i = 0; i < 10; i++) {
            this.f35144OooO00o.add(new OooO00o());
        }
        this.f35145OooO0O0 = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f35145OooO0O0.add(new OooO0O0(new OooOO0(this)));
        }
        this.f35146OooO0OO = new PriorityQueue<>();
    }

    @Override // p092o000o0O0.oo0o0Oo
    public final void OooO00o(long j) {
        this.f35149OooO0o0 = j;
    }

    @Override // o000O00.OooOO0
    public final void OooO0OO(o000OOo o000ooo2) throws DecoderException {
        o00Oo0.OooO00o(o000ooo2 == this.f35147OooO0Oo);
        OooO00o oooO00o = (OooO00o) o000ooo2;
        if (oooO00o.OooO0oO()) {
            oooO00o.OooO0oo();
            this.f35144OooO00o.add(oooO00o);
        } else {
            long j = this.f35148OooO0o;
            this.f35148OooO0o = 1 + j;
            oooO00o.f35150OooOOO0 = j;
            this.f35146OooO0OO.add(oooO00o);
        }
        this.f35147OooO0Oo = null;
    }

    @Override // o000O00.OooOO0
    @Nullable
    public final o000OOo OooO0Oo() throws DecoderException {
        o00Oo0.OooO0Oo(this.f35147OooO0Oo == null);
        ArrayDeque<OooO00o> arrayDeque = this.f35144OooO00o;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        OooO00o oooO00oPollFirst = arrayDeque.pollFirst();
        this.f35147OooO0Oo = oooO00oPollFirst;
        return oooO00oPollFirst;
    }

    public abstract void OooO0o(OooO00o oooO00o);

    public abstract oo000o OooO0o0();

    @Override // o000O00.OooOO0
    @Nullable
    /* JADX INFO: renamed from: OooO0oO, reason: merged with bridge method [inline-methods] */
    public o000000 OooO0O0() throws SubtitleDecoderException {
        ArrayDeque<o000000> arrayDeque = this.f35145OooO0O0;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            PriorityQueue<OooO00o> priorityQueue = this.f35146OooO0OO;
            if (!priorityQueue.isEmpty()) {
                OooO00o oooO00oPeek = priorityQueue.peek();
                int i = o00.f34910OooO00o;
                if (oooO00oPeek.f7087OooO0oo > this.f35149OooO0o0) {
                    break;
                }
                OooO00o oooO00oPoll = priorityQueue.poll();
                boolean zOooO0o = oooO00oPoll.OooO0o(4);
                ArrayDeque<OooO00o> arrayDeque2 = this.f35144OooO00o;
                if (zOooO0o) {
                    o000000 o000000VarPollFirst = arrayDeque.pollFirst();
                    o000000VarPollFirst.OooO0o0(4);
                    oooO00oPoll.OooO0oo();
                    arrayDeque2.add(oooO00oPoll);
                    return o000000VarPollFirst;
                }
                OooO0o(oooO00oPoll);
                if (OooO0oo()) {
                    oo000o oo000oVarOooO0o0 = OooO0o0();
                    o000000 o000000VarPollFirst2 = arrayDeque.pollFirst();
                    o000000VarPollFirst2.OooO(oooO00oPoll.f7087OooO0oo, oo000oVarOooO0o0, LongCompanionObject.MAX_VALUE);
                    oooO00oPoll.OooO0oo();
                    arrayDeque2.add(oooO00oPoll);
                    return o000000VarPollFirst2;
                }
                oooO00oPoll.OooO0oo();
                arrayDeque2.add(oooO00oPoll);
            } else {
                break;
            }
        }
        return null;
    }

    public abstract boolean OooO0oo();

    @Override // o000O00.OooOO0
    public void flush() {
        ArrayDeque<OooO00o> arrayDeque;
        this.f35148OooO0o = 0L;
        this.f35149OooO0o0 = 0L;
        while (true) {
            PriorityQueue<OooO00o> priorityQueue = this.f35146OooO0OO;
            boolean zIsEmpty = priorityQueue.isEmpty();
            arrayDeque = this.f35144OooO00o;
            if (zIsEmpty) {
                break;
            }
            OooO00o oooO00oPoll = priorityQueue.poll();
            int i = o00.f34910OooO00o;
            oooO00oPoll.OooO0oo();
            arrayDeque.add(oooO00oPoll);
        }
        OooO00o oooO00o = this.f35147OooO0Oo;
        if (oooO00o != null) {
            oooO00o.OooO0oo();
            arrayDeque.add(oooO00o);
            this.f35147OooO0Oo = null;
        }
    }

    @Override // o000O00.OooOO0
    public void release() {
    }
}
