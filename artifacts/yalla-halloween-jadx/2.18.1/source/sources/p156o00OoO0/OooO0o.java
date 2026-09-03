package p156o00OoO0;

import java.io.IOException;
import java.util.Objects;
import p153o00Oo0oO.o00000O0;
import p660o0ooo0o0.o00OO0O0;
import p660o0ooo0o0.o0o0Oo;
import p674o0oooo0.o0;
import p674o0oooo0.o0O000Oo;
import p674o0oooo0.o0O00O;
import p674o0oooo0.o0O00o00;
import p674o0oooo0.o0oOO;
import p674o0oooo0.oo00oO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o extends o0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o0o0Oo f32344OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO0O0 f32345OooO0O0;

    public final class OooO00o extends o0 {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public long f32346Oooo0o;

        public OooO00o(o0O00o00 o0o00o01) {
            super(o0o00o01);
            this.f32346Oooo0o = 0L;
        }

        @Override // p674o0oooo0.o0, p674o0oooo0.o0O00o00
        public final void write(o0oOO o0ooo2, long j) throws IOException {
            super.write(o0ooo2, j);
            long j2 = this.f32346Oooo0o + j;
            this.f32346Oooo0o = j2;
            OooO0o oooO0o = OooO0o.this;
            OooO0O0 oooO0O0 = oooO0o.f32345OooO0O0;
            long jContentLength = oooO0o.contentLength();
            OooOOO0.OooO00o oooO00o = (OooOOO0.OooO00o) oooO0O0;
            Objects.requireNonNull(oooO00o);
            o00000O0.OooO0O0().f32200OooO0O0.OooO00o().execute(new OooOO0O(oooO00o, j2, jContentLength));
        }
    }

    public interface OooO0O0 {
    }

    public OooO0o(o0o0Oo o0o0oo, OooO0O0 oooO0O0) {
        this.f32344OooO00o = o0o0oo;
        this.f32345OooO0O0 = oooO0O0;
    }

    @Override // p660o0ooo0o0.o0o0Oo
    public final long contentLength() {
        try {
            return this.f32344OooO00o.contentLength();
        } catch (IOException e) {
            e.printStackTrace();
            return -1L;
        }
    }

    @Override // p660o0ooo0o0.o0o0Oo
    public final o00OO0O0 contentType() {
        return this.f32344OooO00o.contentType();
    }

    @Override // p660o0ooo0o0.o0o0Oo
    public final void writeTo(oo00oO oo00oo) throws IOException {
        oo00oO oo00ooOooO0O0 = o0O000Oo.OooO0O0(new OooO00o(oo00oo));
        this.f32344OooO00o.writeTo(oo00ooOooO0O0);
        ((o0O00O) oo00ooOooO0O0).flush();
    }
}
