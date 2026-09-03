package p092o000o0O0;

import androidx.media3.common.OooOO0;
import androidx.media3.common.ParserException;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderException;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.google.common.primitives.OooO0OO;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import o000OOoO.OooOO0O;
import o000OOoO.Oooo0;
import o000OOoO.Oooo000;
import o000OOoO.o000OOo;
import o000OOoO.o0Oo0oo;
import p080o000OoO.o00;
import p080o000OoO.o000O000;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o0O0O00 implements Extractor {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f35193OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oo0o0Oo f35194OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0ooOOo f35195OooO0O0 = new o0ooOOo();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000O000 f35196OooO0OO = new o000O000();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOO0 f35197OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ArrayList f35198OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList f35199OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Oooo0 f35200OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public TrackOutput f35201OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f35202OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f35203OooOO0O;

    public o0O0O00(oo0o0Oo oo0o0oo, OooOO0 oooOO1) {
        this.f35194OooO00o = oo0o0oo;
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(oooOO1);
        oooO00o.f6445OooOO0O = "text/x-exoplayer-cues";
        oooO00o.f6443OooO0oo = oooOO1.f6412OooOOOO;
        this.f35197OooO0Oo = new OooOO0(oooO00o);
        this.f35199OooO0o0 = new ArrayList();
        this.f35198OooO0o = new ArrayList();
        this.f35202OooOO0 = 0;
        this.f35203OooOO0O = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.Extractor
    public final int OooO00o(Oooo000 oooo000, o000OOo o000ooo2) throws IOException, DecoderException {
        int i = this.f35202OooOO0;
        o00Oo0.OooO0Oo((i == 0 || i == 5) ? false : true);
        int i2 = this.f35202OooOO0;
        int iOooO00o = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        o000O000 o000o001 = this.f35196OooO0OO;
        if (i2 == 1) {
            long j = ((OooOO0O) oooo000).f34677OooO0OO;
            o000o001.OooOooO(j != -1 ? OooO0OO.OooO00o(j) : 1024);
            this.f35193OooO = 0;
            this.f35202OooOO0 = 2;
        }
        if (this.f35202OooOO0 == 2) {
            int length = o000o001.f34962OooO00o.length;
            int i3 = this.f35193OooO;
            if (length == i3) {
                o000o001.OooO00o(i3 + LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
            }
            byte[] bArr = o000o001.f34962OooO00o;
            int i4 = this.f35193OooO;
            OooOO0O oooOO0O = (OooOO0O) oooo000;
            int i5 = oooOO0O.read(bArr, i4, bArr.length - i4);
            if (i5 != -1) {
                this.f35193OooO += i5;
            }
            long j2 = oooOO0O.f34677OooO0OO;
            if ((j2 != -1 && ((long) this.f35193OooO) == j2) || i5 == -1) {
                oo0o0Oo oo0o0oo = this.f35194OooO00o;
                try {
                    o000OOo o000oooOooO0Oo = oo0o0oo.OooO0Oo();
                    while (o000oooOooO0Oo == null) {
                        Thread.sleep(5L);
                        o000oooOooO0Oo = oo0o0oo.OooO0Oo();
                    }
                    o000oooOooO0Oo.OooOO0(this.f35193OooO);
                    o000oooOooO0Oo.f7084OooO0o.put(o000o001.f34962OooO00o, 0, this.f35193OooO);
                    o000oooOooO0Oo.f7084OooO0o.limit(this.f35193OooO);
                    oo0o0oo.OooO0OO(o000oooOooO0Oo);
                    o000000 o000000VarOooO0O0 = oo0o0oo.OooO0O0();
                    while (o000000VarOooO0O0 == null) {
                        Thread.sleep(5L);
                        o000000VarOooO0O0 = oo0o0oo.OooO0O0();
                    }
                    for (int i6 = 0; i6 < o000000VarOooO0O0.OooO0Oo(); i6++) {
                        List<Cue> listOooO0O0 = o000000VarOooO0O0.OooO0O0(o000000VarOooO0O0.OooO0OO(i6));
                        this.f35195OooO0O0.getClass();
                        byte[] bArrOooO00o = o0ooOOo.OooO00o(listOooO0O0);
                        this.f35199OooO0o0.add(Long.valueOf(o000000VarOooO0O0.OooO0OO(i6)));
                        this.f35198OooO0o.add(new o000O000(bArrOooO00o));
                    }
                    o000000VarOooO0O0.OooO0oo();
                    OooO0Oo();
                    this.f35202OooOO0 = 4;
                } catch (SubtitleDecoderException e) {
                    throw ParserException.OooO00o("SubtitleDecoder failed.", e);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            }
        }
        if (this.f35202OooOO0 == 3) {
            OooOO0O oooOO0O2 = (OooOO0O) oooo000;
            long j3 = oooOO0O2.f34677OooO0OO;
            if (j3 != -1) {
                iOooO00o = OooO0OO.OooO00o(j3);
            }
            if (oooOO0O2.OooOOOo(iOooO00o) == -1) {
                OooO0Oo();
                this.f35202OooOO0 = 4;
            }
        }
        return this.f35202OooOO0 == 4 ? -1 : 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void OooO0O0(long j, long j2) {
        int i = this.f35202OooOO0;
        o00Oo0.OooO0Oo((i == 0 || i == 5) ? false : true);
        this.f35203OooOO0O = j2;
        if (this.f35202OooOO0 == 2) {
            this.f35202OooOO0 = 1;
        }
        if (this.f35202OooOO0 == 4) {
            this.f35202OooOO0 = 3;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void OooO0OO(Oooo0 oooo0) {
        o00Oo0.OooO0Oo(this.f35202OooOO0 == 0);
        this.f35200OooO0oO = oooo0;
        this.f35201OooO0oo = oooo0.OooOOOO(0, 3);
        this.f35200OooO0oO.OooOO0O();
        this.f35200OooO0oO.OooO(new o0Oo0oo(-9223372036854775807L, new long[]{0}, new long[]{0}));
        this.f35201OooO0oo.OooO0O0(this.f35197OooO0Oo);
        this.f35202OooOO0 = 1;
    }

    public final void OooO0Oo() {
        o00Oo0.OooO0o(this.f35201OooO0oo);
        ArrayList arrayList = this.f35199OooO0o0;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f35198OooO0o;
        o00Oo0.OooO0Oo(size == arrayList2.size());
        long j = this.f35203OooOO0O;
        for (int iOooO0OO = j == -9223372036854775807L ? 0 : o00.OooO0OO(arrayList, Long.valueOf(j), true); iOooO0OO < arrayList2.size(); iOooO0OO++) {
            o000O000 o000o001 = (o000O000) arrayList2.get(iOooO0OO);
            o000o001.Oooo00O(0);
            int length = o000o001.f34962OooO00o.length;
            this.f35201OooO0oo.OooO0OO(length, o000o001);
            this.f35201OooO0oo.OooO0o0(((Long) arrayList.get(iOooO0OO)).longValue(), 1, length, 0, null);
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean OooO0o(Oooo000 oooo000) throws IOException {
        return true;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
        if (this.f35202OooOO0 == 5) {
            return;
        }
        this.f35194OooO00o.release();
        this.f35202OooOO0 = 5;
    }
}
