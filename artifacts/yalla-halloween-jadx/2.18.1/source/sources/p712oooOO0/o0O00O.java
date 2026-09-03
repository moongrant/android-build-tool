package p712oooOO0;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import p176o00OoooO.oO000Oo0;
import p294o0O0Oo0o.o000OOo;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o000OOo0;
import p324o0O0oo0O.o0000O00;
import p324o0O0oo0O.o0000O0O;
import p324o0O0oo0O.o0000oo;
import p324o0O0oo0O.o000OO;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o0O00O implements o0000oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayDeque<OooO0O0> f53552OooO00o = new ArrayDeque<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayDeque<o000OO> f53553OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final PriorityQueue<OooO0O0> f53554OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public OooO0O0 f53555OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f53556OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f53557OooO0o0;

    public static final class OooO0O0 extends o0000O0O implements Comparable<OooO0O0> {

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public long f53558OoooOO0;

        public OooO0O0() {
        }

        @Override // java.lang.Comparable
        public final int compareTo(OooO0O0 oooO0O0) {
            OooO0O0 oooO0O1 = oooO0O0;
            if (isEndOfStream() == oooO0O1.isEndOfStream()) {
                long j = this.f13640Oooo - oooO0O1.f13640Oooo;
                if (j == 0) {
                    j = this.f53558OoooOO0 - oooO0O1.f53558OoooOO0;
                    if (j == 0) {
                        return 0;
                    }
                }
                if (j > 0) {
                    return 1;
                }
            } else if (isEndOfStream()) {
                return 1;
            }
            return -1;
        }

        public OooO0O0(OooO00o oooO00o) {
        }
    }

    public static final class OooO0OO extends o000OO {

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public o000OOo.OooO00o<OooO0OO> f53559Oooo0oo;

        public OooO0OO(o000OOo.OooO00o<OooO0OO> oooO00o) {
            this.f53559Oooo0oo = oooO00o;
        }

        @Override // p294o0O0Oo0o.o000OOo
        public final void release() {
            this.f53559Oooo0oo.OooO0O0(this);
        }
    }

    public o0O00O() {
        for (int i = 0; i < 10; i++) {
            this.f53552OooO00o.add(new OooO0O0(null));
        }
        this.f53553OooO0O0 = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f53553OooO0O0.add(new OooO0OO(new oO000Oo0(this)));
        }
        this.f53554OooO0OO = new PriorityQueue<>();
    }

    public final void OooO(OooO0O0 oooO0O0) {
        oooO0O0.clear();
        this.f53552OooO00o.add(oooO0O0);
    }

    @Override // p324o0O0oo0O.o0000oo
    public final void OooO00o(long j) {
        this.f53557OooO0o0 = j;
    }

    @Override // p294o0O0Oo0o.oo0o0Oo
    @Nullable
    public final o0000O0O OooO0OO() throws DecoderException {
        o00000O0.OooO0Oo(this.f53555OooO0Oo == null);
        if (this.f53552OooO00o.isEmpty()) {
            return null;
        }
        OooO0O0 oooO0O0PollFirst = this.f53552OooO00o.pollFirst();
        this.f53555OooO0Oo = oooO0O0PollFirst;
        return oooO0O0PollFirst;
    }

    @Override // p294o0O0Oo0o.oo0o0Oo
    public final void OooO0Oo(o0000O0O o0000o0o2) throws DecoderException {
        o0000O0O o0000o0o3 = o0000o0o2;
        o00000O0.OooO00o(o0000o0o3 == this.f53555OooO0Oo);
        OooO0O0 oooO0O0 = (OooO0O0) o0000o0o3;
        if (oooO0O0.isDecodeOnly()) {
            oooO0O0.clear();
            this.f53552OooO00o.add(oooO0O0);
        } else {
            long j = this.f53556OooO0o;
            this.f53556OooO0o = 1 + j;
            oooO0O0.f53558OoooOO0 = j;
            this.f53554OooO0OO.add(oooO0O0);
        }
        this.f53555OooO0Oo = null;
    }

    public abstract void OooO0o(o0000O0O o0000o0o2);

    public abstract o0000O00 OooO0o0();

    @Override // p294o0O0Oo0o.oo0o0Oo
    @Nullable
    /* JADX INFO: renamed from: OooO0oO, reason: merged with bridge method [inline-methods] */
    public o000OO OooO0O0() throws SubtitleDecoderException {
        if (this.f53553OooO0O0.isEmpty()) {
            return null;
        }
        while (!this.f53554OooO0OO.isEmpty()) {
            OooO0O0 oooO0O0Peek = this.f53554OooO0OO.peek();
            int i = o000OOo0.f36740OooO00o;
            if (oooO0O0Peek.f13640Oooo > this.f53557OooO0o0) {
                break;
            }
            OooO0O0 oooO0O0Poll = this.f53554OooO0OO.poll();
            if (oooO0O0Poll.isEndOfStream()) {
                o000OO o000ooPollFirst = this.f53553OooO0O0.pollFirst();
                o000ooPollFirst.addFlag(4);
                oooO0O0Poll.clear();
                this.f53552OooO00o.add(oooO0O0Poll);
                return o000ooPollFirst;
            }
            OooO0o(oooO0O0Poll);
            if (OooO0oo()) {
                o0000O00 o0000o00OooO0o0 = OooO0o0();
                o000OO o000ooPollFirst2 = this.f53553OooO0O0.pollFirst();
                o000ooPollFirst2.OooO0o(oooO0O0Poll.f13640Oooo, o0000o00OooO0o0, Long.MAX_VALUE);
                oooO0O0Poll.clear();
                this.f53552OooO00o.add(oooO0O0Poll);
                return o000ooPollFirst2;
            }
            oooO0O0Poll.clear();
            this.f53552OooO00o.add(oooO0O0Poll);
        }
        return null;
    }

    public abstract boolean OooO0oo();

    @Override // p294o0O0Oo0o.oo0o0Oo
    public void flush() {
        this.f53556OooO0o = 0L;
        this.f53557OooO0o0 = 0L;
        while (!this.f53554OooO0OO.isEmpty()) {
            OooO0O0 oooO0O0Poll = this.f53554OooO0OO.poll();
            int i = o000OOo0.f36740OooO00o;
            OooO(oooO0O0Poll);
        }
        OooO0O0 oooO0O0 = this.f53555OooO0Oo;
        if (oooO0O0 != null) {
            oooO0O0.clear();
            this.f53552OooO00o.add(oooO0O0);
            this.f53555OooO0Oo = null;
        }
    }

    @Override // p294o0O0Oo0o.oo0o0Oo
    public void release() {
    }
}
