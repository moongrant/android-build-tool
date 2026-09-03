package p230o00oOoO0;

import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.common.primitives.OooO0o;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import p209o00o0oo0.o00O00o0;
import p209o00o0oo0.o00O0O0;
import p209o00o0oo0.o00O0O00;
import p209o00o0oo0.o00OO00O;
import p209o00o0oo0.o00OO0O0;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o000Oo0 implements Extractor {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f40145OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000O000 f40146OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000O0 f40147OooO0O0 = new o0000O0();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00Oo00 f40148OooO0OO = new o00Oo00();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOo f40149OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ArrayList f40150OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList f40151OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public o00O0O0 f40152OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public TrackOutput f40153OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f40154OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f40155OooOO0O;

    public o000Oo0(o000O000 o000o001, OooOo oooOo) {
        this.f40146OooO00o = o000o001;
        OooOo.OooO00o oooO00o = new OooOo.OooO00o(oooOo);
        oooO00o.f11244OooOO0O = "text/x-exoplayer-cues";
        oooO00o.f11242OooO0oo = oooOo.f11211OooOOOO;
        this.f40149OooO0Oo = new OooOo(oooO00o);
        this.f40151OooO0o0 = new ArrayList();
        this.f40150OooO0o = new ArrayList();
        this.f40154OooOO0 = 0;
        this.f40155OooOO0O = -9223372036854775807L;
    }

    public final void OooO00o() {
        o00O000o.OooO0o0(this.f40153OooO0oo);
        ArrayList arrayList = this.f40151OooO0o0;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f40150OooO0o;
        o00O000o.OooO0Oo(size == arrayList2.size());
        long j = this.f40155OooOO0O;
        for (int iOooO0OO = j == -9223372036854775807L ? 0 : o0O00.OooO0OO(arrayList, Long.valueOf(j), true); iOooO0OO < arrayList2.size(); iOooO0OO++) {
            o00Oo00 o00oo00 = (o00Oo00) arrayList2.get(iOooO0OO);
            o00oo00.Oooo00O(0);
            int length = o00oo00.f40591OooO00o.length;
            this.f40153OooO0oo.OooO0O0(length, o00oo00);
            this.f40153OooO0oo.OooO0o0(((Long) arrayList.get(iOooO0OO)).longValue(), 1, length, 0, null);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0O0(long j, long j2) {
        int i = this.f40154OooOO0;
        o00O000o.OooO0Oo((i == 0 || i == 5) ? false : true);
        this.f40155OooOO0O = j2;
        if (this.f40154OooOO0 == 2) {
            this.f40154OooOO0 = 1;
        }
        if (this.f40154OooOO0 == 4) {
            this.f40154OooOO0 = 3;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean OooO0Oo(o00O0O00 o00o0o01) throws IOException {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int OooO0oO(o00O0O00 o00o0o01, o00OO0O0 o00oo0o1) throws IOException, DecoderException {
        int i = this.f40154OooOO0;
        o00O000o.OooO0Oo((i == 0 || i == 5) ? false : true);
        int i2 = this.f40154OooOO0;
        int iOooO00o = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        o00Oo00 o00oo00 = this.f40148OooO0OO;
        if (i2 == 1) {
            long j = ((o00O00o0) o00o0o01).f39531OooO0OO;
            o00oo00.OooOooO(j != -1 ? OooO0o.OooO00o(j) : 1024);
            this.f40145OooO = 0;
            this.f40154OooOO0 = 2;
        }
        if (this.f40154OooOO0 == 2) {
            int length = o00oo00.f40591OooO00o.length;
            int i3 = this.f40145OooO;
            if (length == i3) {
                o00oo00.OooO00o(i3 + LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
            }
            byte[] bArr = o00oo00.f40591OooO00o;
            int i4 = this.f40145OooO;
            o00O00o0 o00o00o1 = (o00O00o0) o00o0o01;
            int i5 = o00o00o1.read(bArr, i4, bArr.length - i4);
            if (i5 != -1) {
                this.f40145OooO += i5;
            }
            long j2 = o00o00o1.f39531OooO0OO;
            if ((j2 != -1 && ((long) this.f40145OooO) == j2) || i5 == -1) {
                o000O000 o000o001 = this.f40146OooO00o;
                try {
                    o000O00 o000o00OooO0Oo = o000o001.OooO0Oo();
                    while (o000o00OooO0Oo == null) {
                        Thread.sleep(5L);
                        o000o00OooO0Oo = o000o001.OooO0Oo();
                    }
                    o000o00OooO0Oo.OooOO0(this.f40145OooO);
                    o000o00OooO0Oo.f11674OooO0o.put(o00oo00.f40591OooO00o, 0, this.f40145OooO);
                    o000o00OooO0Oo.f11674OooO0o.limit(this.f40145OooO);
                    o000o001.OooO0O0(o000o00OooO0Oo);
                    o000O00O o000o00oOooO0OO = o000o001.OooO0OO();
                    while (o000o00oOooO0OO == null) {
                        Thread.sleep(5L);
                        o000o00oOooO0OO = o000o001.OooO0OO();
                    }
                    for (int i6 = 0; i6 < o000o00oOooO0OO.OooO0Oo(); i6++) {
                        List<Cue> listOooO0O0 = o000o00oOooO0OO.OooO0O0(o000o00oOooO0OO.OooO0OO(i6));
                        this.f40147OooO0O0.getClass();
                        byte[] bArrOooO00o = o0000O0.OooO00o(listOooO0O0);
                        this.f40151OooO0o0.add(Long.valueOf(o000o00oOooO0OO.OooO0OO(i6)));
                        this.f40150OooO0o.add(new o00Oo00(bArrOooO00o));
                    }
                    o000o00oOooO0OO.OooO0oo();
                    OooO00o();
                    this.f40154OooOO0 = 4;
                } catch (SubtitleDecoderException e) {
                    throw ParserException.OooO00o("SubtitleDecoder failed.", e);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            }
        }
        if (this.f40154OooOO0 == 3) {
            o00O00o0 o00o00o2 = (o00O00o0) o00o0o01;
            long j3 = o00o00o2.f39531OooO0OO;
            if (j3 != -1) {
                iOooO00o = OooO0o.OooO00o(j3);
            }
            if (o00o00o2.OooOOOo(iOooO00o) == -1) {
                OooO00o();
                this.f40154OooOO0 = 4;
            }
        }
        return this.f40154OooOO0 == 4 ? -1 : 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0oo(o00O0O0 o00o0o0) {
        o00O000o.OooO0Oo(this.f40154OooOO0 == 0);
        this.f40152OooO0oO = o00o0o0;
        this.f40153OooO0oo = o00o0o0.OooOOO(0, 3);
        this.f40152OooO0oO.OooO00o();
        this.f40152OooO0oO.OooO0O0(new o00OO00O(-9223372036854775807L, new long[]{0}, new long[]{0}));
        this.f40153OooO0oo.OooO0OO(this.f40149OooO0Oo);
        this.f40154OooOO0 = 1;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
        if (this.f40154OooOO0 == 5) {
            return;
        }
        this.f40146OooO00o.release();
        this.f40154OooOO0 = 5;
    }
}
