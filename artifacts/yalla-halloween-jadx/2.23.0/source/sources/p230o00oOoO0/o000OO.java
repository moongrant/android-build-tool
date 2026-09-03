package p230o00oOoO0;

import android.os.Bundle;
import android.os.Parcel;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.text.Cue;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0O00;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import p245o00oo0o.o00O000o;
import p245o00oo0o.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o000OO implements o000O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000oo f40137OooO00o = new o0000oo();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000O00 f40138OooO0O0 = new o000O00();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayDeque f40139OooO0OO = new ArrayDeque();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f40140OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f40141OooO0o0;

    public class OooO00o extends o000O00O {
        public OooO00o() {
        }

        @Override // p206o00o0oOO.o0O00000
        public final void OooO0oo() {
            ArrayDeque arrayDeque = o000OO.this.f40139OooO0OO;
            o00O000o.OooO0Oo(arrayDeque.size() < 2);
            o00O000o.OooO00o(!arrayDeque.contains(this));
            this.f39410OooO0Oo = 0;
            this.f40117OooO0o = null;
            arrayDeque.addFirst(this);
        }
    }

    public static final class OooO0O0 implements o000 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final long f40143OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final ImmutableList<Cue> f40144OooO0o0;

        public OooO0O0(long j, o0O00 o0o01) {
            this.f40143OooO0Oo = j;
            this.f40144OooO0o0 = o0o01;
        }

        @Override // p230o00oOoO0.o000
        public final int OooO00o(long j) {
            return this.f40143OooO0Oo > j ? 0 : -1;
        }

        @Override // p230o00oOoO0.o000
        public final List<Cue> OooO0O0(long j) {
            if (j >= this.f40143OooO0Oo) {
                return this.f40144OooO0o0;
            }
            ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f19157OooO0o0;
            return o0O00.f19536OooO0oo;
        }

        @Override // p230o00oOoO0.o000
        public final long OooO0OO(int i) {
            o00O000o.OooO00o(i == 0);
            return this.f40143OooO0Oo;
        }

        @Override // p230o00oOoO0.o000
        public final int OooO0Oo() {
            return 1;
        }
    }

    public o000OO() {
        for (int i = 0; i < 2; i++) {
            this.f40139OooO0OO.addFirst(new OooO00o());
        }
        this.f40140OooO0Oo = 0;
    }

    @Override // p230o00oOoO0.o000O000
    public final void OooO00o(long j) {
    }

    @Override // p206o00o0oOO.o0O0o
    public final void OooO0O0(o000O00 o000o01) throws DecoderException {
        o00O000o.OooO0Oo(!this.f40141OooO0o0);
        o00O000o.OooO0Oo(this.f40140OooO0Oo == 1);
        o00O000o.OooO00o(this.f40138OooO0O0 == o000o01);
        this.f40140OooO0Oo = 2;
    }

    @Override // p206o00o0oOO.o0O0o
    @Nullable
    public final o000O00O OooO0OO() throws DecoderException {
        o00O000o.OooO0Oo(!this.f40141OooO0o0);
        if (this.f40140OooO0Oo == 2) {
            ArrayDeque arrayDeque = this.f40139OooO0OO;
            if (!arrayDeque.isEmpty()) {
                o000O00O o000o00o2 = (o000O00O) arrayDeque.removeFirst();
                o000O00 o000o01 = this.f40138OooO0O0;
                if (o000o01.OooO0o(4)) {
                    o000o00o2.OooO0o0(4);
                } else {
                    long j = o000o01.f11677OooO0oo;
                    ByteBuffer byteBuffer = o000o01.f11674OooO0o;
                    byteBuffer.getClass();
                    byte[] bArrArray = byteBuffer.array();
                    this.f40137OooO00o.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.unmarshall(bArrArray, 0, bArrArray.length);
                    parcelObtain.setDataPosition(0);
                    Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                    parcelObtain.recycle();
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                    parcelableArrayList.getClass();
                    o000o00o2.OooO(o000o01.f11677OooO0oo, new OooO0O0(j, oOO00O.OooO00o(Cue.f13399Oooo0o, parcelableArrayList)), 0L);
                }
                o000o01.OooO0oo();
                this.f40140OooO0Oo = 0;
                return o000o00o2;
            }
        }
        return null;
    }

    @Override // p206o00o0oOO.o0O0o
    @Nullable
    public final o000O00 OooO0Oo() throws DecoderException {
        o00O000o.OooO0Oo(!this.f40141OooO0o0);
        if (this.f40140OooO0Oo != 0) {
            return null;
        }
        this.f40140OooO0Oo = 1;
        return this.f40138OooO0O0;
    }

    @Override // p206o00o0oOO.o0O0o
    public final void flush() {
        o00O000o.OooO0Oo(!this.f40141OooO0o0);
        this.f40138OooO0O0.OooO0oo();
        this.f40140OooO0Oo = 0;
    }

    @Override // p206o00o0oOO.o0O0o
    public final void release() {
        this.f40141OooO0o0 = true;
    }
}
