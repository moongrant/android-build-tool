package p229o00oOoO;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import kotlin.jvm.internal.LongCompanionObject;
import p206o00o0oOO.o0O00000;
import p230o00oOoO0.o000O00;
import p230o00oOoO0.o000O000;
import p230o00oOoO0.o000O00O;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class oo000o implements o000O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayDeque<OooO00o> f40102OooO00o = new ArrayDeque<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayDeque<o000O00O> f40103OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final PriorityQueue<OooO00o> f40104OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public OooO00o f40105OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f40106OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f40107OooO0o0;

    public static final class OooO00o extends o000O00 implements Comparable<OooO00o> {

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public long f40108OooOOO0;

        @Override // java.lang.Comparable
        public final int compareTo(OooO00o oooO00o) {
            OooO00o oooO00o2 = oooO00o;
            if (OooO0o(4) == oooO00o2.OooO0o(4)) {
                long j = this.f11677OooO0oo - oooO00o2.f11677OooO0oo;
                if (j == 0) {
                    j = this.f40108OooOOO0 - oooO00o2.f40108OooOOO0;
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

    public static final class OooO0O0 extends o000O00O {

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final o0O00000.OooO00o<OooO0O0> f40109OooO0oo;

        public OooO0O0(o00Ooo o00ooo2) {
            this.f40109OooO0oo = o00ooo2;
        }

        @Override // p206o00o0oOO.o0O00000
        public final void OooO0oo() {
            oo000o oo000oVar = (oo000o) ((o00Ooo) this.f40109OooO0oo).f40100OooO0Oo;
            oo000oVar.getClass();
            this.f39410OooO0Oo = 0;
            this.f40117OooO0o = null;
            oo000oVar.f40103OooO0O0.add(this);
        }
    }

    public oo000o() {
        for (int i = 0; i < 10; i++) {
            this.f40102OooO00o.add(new OooO00o());
        }
        this.f40103OooO0O0 = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f40103OooO0O0.add(new OooO0O0(new o00Ooo(this)));
        }
        this.f40104OooO0OO = new PriorityQueue<>();
    }

    @Override // p230o00oOoO0.o000O000
    public final void OooO00o(long j) {
        this.f40107OooO0o0 = j;
    }

    @Override // p206o00o0oOO.o0O0o
    public final void OooO0O0(o000O00 o000o01) throws DecoderException {
        o00O000o.OooO00o(o000o01 == this.f40105OooO0Oo);
        OooO00o oooO00o = (OooO00o) o000o01;
        if (oooO00o.OooO0oO()) {
            oooO00o.OooO0oo();
            this.f40102OooO00o.add(oooO00o);
        } else {
            long j = this.f40106OooO0o;
            this.f40106OooO0o = 1 + j;
            oooO00o.f40108OooOOO0 = j;
            this.f40104OooO0OO.add(oooO00o);
        }
        this.f40105OooO0Oo = null;
    }

    @Override // p206o00o0oOO.o0O0o
    @Nullable
    public final o000O00 OooO0Oo() throws DecoderException {
        o00O000o.OooO0Oo(this.f40105OooO0Oo == null);
        ArrayDeque<OooO00o> arrayDeque = this.f40102OooO00o;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        OooO00o oooO00oPollFirst = arrayDeque.pollFirst();
        this.f40105OooO0Oo = oooO00oPollFirst;
        return oooO00oPollFirst;
    }

    public abstract void OooO0o(OooO00o oooO00o);

    public abstract o00oO0o OooO0o0();

    @Override // p206o00o0oOO.o0O0o
    @Nullable
    /* JADX INFO: renamed from: OooO0oO, reason: merged with bridge method [inline-methods] */
    public o000O00O OooO0OO() throws SubtitleDecoderException {
        ArrayDeque<o000O00O> arrayDeque = this.f40103OooO0O0;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            PriorityQueue<OooO00o> priorityQueue = this.f40104OooO0OO;
            if (!priorityQueue.isEmpty()) {
                OooO00o oooO00oPeek = priorityQueue.peek();
                int i = o0O00.f40595OooO00o;
                if (oooO00oPeek.f11677OooO0oo > this.f40107OooO0o0) {
                    break;
                }
                OooO00o oooO00oPoll = priorityQueue.poll();
                boolean zOooO0o = oooO00oPoll.OooO0o(4);
                ArrayDeque<OooO00o> arrayDeque2 = this.f40102OooO00o;
                if (zOooO0o) {
                    o000O00O o000o00oPollFirst = arrayDeque.pollFirst();
                    o000o00oPollFirst.OooO0o0(4);
                    oooO00oPoll.OooO0oo();
                    arrayDeque2.add(oooO00oPoll);
                    return o000o00oPollFirst;
                }
                OooO0o(oooO00oPoll);
                if (OooO0oo()) {
                    o00oO0o o00oo0oOooO0o0 = OooO0o0();
                    o000O00O o000o00oPollFirst2 = arrayDeque.pollFirst();
                    o000o00oPollFirst2.OooO(oooO00oPoll.f11677OooO0oo, o00oo0oOooO0o0, LongCompanionObject.MAX_VALUE);
                    oooO00oPoll.OooO0oo();
                    arrayDeque2.add(oooO00oPoll);
                    return o000o00oPollFirst2;
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

    @Override // p206o00o0oOO.o0O0o
    public void flush() {
        ArrayDeque<OooO00o> arrayDeque;
        this.f40106OooO0o = 0L;
        this.f40107OooO0o0 = 0L;
        while (true) {
            PriorityQueue<OooO00o> priorityQueue = this.f40104OooO0OO;
            boolean zIsEmpty = priorityQueue.isEmpty();
            arrayDeque = this.f40102OooO00o;
            if (zIsEmpty) {
                break;
            }
            OooO00o oooO00oPoll = priorityQueue.poll();
            int i = o0O00.f40595OooO00o;
            oooO00oPoll.OooO0oo();
            arrayDeque.add(oooO00oPoll);
        }
        OooO00o oooO00o = this.f40105OooO0Oo;
        if (oooO00o != null) {
            oooO00o.OooO0oo();
            arrayDeque.add(oooO00o);
            this.f40105OooO0Oo = null;
        }
    }

    @Override // p206o00o0oOO.o0O0o
    public void release() {
    }
}
