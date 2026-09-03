package com.google.android.exoplayer2.source;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.oo0o0Oo;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import java.io.IOException;
import p200o00o0o.o0O0OOO0;
import p207o00o0oOo.o0O00O0o;
import p226o00oOo00.o0000oo;
import p244o00oo0Oo.o000OO0O;
import p244o00oo0Oo.o000OOo0;
import p244o00oo0Oo.o00O0OO0;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface OooOOOO {

    public interface OooO00o {
        OooOOOO OooO00o(com.google.android.exoplayer2.o000oOoO o000oooo2);

        OooO00o OooO0O0(LoadErrorHandlingPolicy loadErrorHandlingPolicy);

        OooO00o OooO0OO(o000OOo0 o000ooo1);

        OooO00o OooO0Oo(o0O00O0o o0o00o0o);
    }

    public static final class OooO0O0 extends o0000oo {
        public OooO0O0(int i, long j, Object obj) {
            super(j, -1, -1, i, obj);
        }

        public final OooO0O0 OooO0O0(Object obj) {
            o0000oo o0000ooVar;
            if (this.f39859OooO00o.equals(obj)) {
                o0000ooVar = this;
            } else {
                o0000ooVar = new o0000oo(this.f39862OooO0Oo, this.f39860OooO0O0, this.f39861OooO0OO, this.f39863OooO0o0, obj);
            }
            return new OooO0O0(o0000ooVar);
        }

        public OooO0O0(int i, int i2, long j, Object obj) {
            super(j, i, i2, -1, obj);
        }
    }

    public interface OooO0OO {
        void OooO00o(OooOOOO oooOOOO, oo0o0Oo oo0o0oo);
    }

    void OooO(OooO0OO oooO0OO);

    void OooO00o(OooO0OO oooO0OO);

    void OooO0O0(Handler handler, OooOo00 oooOo00);

    void OooO0OO(OooOo00 oooOo00);

    com.google.android.exoplayer2.o000oOoO OooO0Oo();

    void OooO0o(OooO0OO oooO0OO, @Nullable o00O0OO0 o00o0oo1, o0O0OOO0 o0o0ooo0);

    void OooO0o0(OooOOO oooOOO);

    void OooO0oO(OooO0OO oooO0OO);

    OooOOO OooO0oo(OooO0O0 oooO0O0, o000OO0O o000oo0o2, long j);

    void OooOO0(Handler handler, com.google.android.exoplayer2.drm.OooO0O0 oooO0O0);

    void OooOO0O(com.google.android.exoplayer2.drm.OooO0O0 oooO0O0);

    void OooOO0o() throws IOException;

    @Nullable
    oo0o0Oo OooOOO();

    boolean OooOOO0();
}
