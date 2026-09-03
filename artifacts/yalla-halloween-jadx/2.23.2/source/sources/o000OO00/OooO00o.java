package o000OO00;

import android.os.Bundle;
import android.os.Parcel;
import androidx.annotation.Nullable;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderException;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0O00;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import p080o000OoO.o00Oo0;
import p092o000o0O0.o000000;
import p092o000o0O0.o000OOo;
import p092o000o0O0.o00oO0o;
import p092o000o0O0.o0OO00O;
import p092o000o0O0.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooO00o implements oo0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00oO0o f34379OooO00o = new o00oO0o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OOo f34380OooO0O0 = new o000OOo();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayDeque f34381OooO0OO = new ArrayDeque();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f34382OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f34383OooO0o0;

    /* JADX INFO: renamed from: o000OO00.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C0397OooO00o extends o000000 {
        public C0397OooO00o() {
        }

        @Override // o000O00.OooOO0O
        public final void OooO0oo() {
            ArrayDeque arrayDeque = OooO00o.this.f34381OooO0OO;
            o00Oo0.OooO0Oo(arrayDeque.size() < 2);
            o00Oo0.OooO00o(!arrayDeque.contains(this));
            this.f33931OooO0Oo = 0;
            this.f35190OooO0o = null;
            arrayDeque.addFirst(this);
        }
    }

    public static final class OooO0O0 implements o0OO00O {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final long f34385OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final ImmutableList<Cue> f34386OooO0o0;

        public OooO0O0(long j, o0O00 o0o01) {
            this.f34385OooO0Oo = j;
            this.f34386OooO0o0 = o0o01;
        }

        @Override // p092o000o0O0.o0OO00O
        public final int OooO00o(long j) {
            return this.f34385OooO0Oo > j ? 0 : -1;
        }

        @Override // p092o000o0O0.o0OO00O
        public final List<Cue> OooO0O0(long j) {
            if (j >= this.f34385OooO0Oo) {
                return this.f34386OooO0o0;
            }
            ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f18681OooO0o0;
            return o0O00.f19060OooO0oo;
        }

        @Override // p092o000o0O0.o0OO00O
        public final long OooO0OO(int i) {
            o00Oo0.OooO00o(i == 0);
            return this.f34385OooO0Oo;
        }

        @Override // p092o000o0O0.o0OO00O
        public final int OooO0Oo() {
            return 1;
        }
    }

    public OooO00o() {
        for (int i = 0; i < 2; i++) {
            this.f34381OooO0OO.addFirst(new C0397OooO00o());
        }
        this.f34382OooO0Oo = 0;
    }

    @Override // p092o000o0O0.oo0o0Oo
    public final void OooO00o(long j) {
    }

    @Override // o000O00.OooOO0
    @Nullable
    public final o000000 OooO0O0() throws DecoderException {
        o00Oo0.OooO0Oo(!this.f34383OooO0o0);
        if (this.f34382OooO0Oo == 2) {
            ArrayDeque arrayDeque = this.f34381OooO0OO;
            if (!arrayDeque.isEmpty()) {
                o000000 o000000Var = (o000000) arrayDeque.removeFirst();
                o000OOo o000ooo2 = this.f34380OooO0O0;
                if (o000ooo2.OooO0o(4)) {
                    o000000Var.OooO0o0(4);
                } else {
                    long j = o000ooo2.f7087OooO0oo;
                    ByteBuffer byteBuffer = o000ooo2.f7084OooO0o;
                    byteBuffer.getClass();
                    byte[] bArrArray = byteBuffer.array();
                    this.f34379OooO00o.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.unmarshall(bArrArray, 0, bArrArray.length);
                    parcelObtain.setDataPosition(0);
                    Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                    parcelObtain.recycle();
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                    parcelableArrayList.getClass();
                    o000000Var.OooO(o000ooo2.f7087OooO0oo, new OooO0O0(j, p080o000OoO.o00oO0o.OooO00o(Cue.f6895Oooo0o, parcelableArrayList)), 0L);
                }
                o000ooo2.OooO0oo();
                this.f34382OooO0Oo = 0;
                return o000000Var;
            }
        }
        return null;
    }

    @Override // o000O00.OooOO0
    public final void OooO0OO(o000OOo o000ooo2) throws DecoderException {
        o00Oo0.OooO0Oo(!this.f34383OooO0o0);
        o00Oo0.OooO0Oo(this.f34382OooO0Oo == 1);
        o00Oo0.OooO00o(this.f34380OooO0O0 == o000ooo2);
        this.f34382OooO0Oo = 2;
    }

    @Override // o000O00.OooOO0
    @Nullable
    public final o000OOo OooO0Oo() throws DecoderException {
        o00Oo0.OooO0Oo(!this.f34383OooO0o0);
        if (this.f34382OooO0Oo != 0) {
            return null;
        }
        this.f34382OooO0Oo = 1;
        return this.f34380OooO0O0;
    }

    @Override // o000O00.OooOO0
    public final void flush() {
        o00Oo0.OooO0Oo(!this.f34383OooO0o0);
        this.f34380OooO0O0.OooO0oo();
        this.f34382OooO0Oo = 0;
    }

    @Override // o000O00.OooOO0
    public final void release() {
        this.f34383OooO0o0 = true;
    }
}
