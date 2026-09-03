package com.google.android.exoplayer2.audio;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import p293o0O0Oo0O.OooOo;
import p294o0O0Oo0o.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public interface OooO00o {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0096OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final Handler f13552OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final OooO00o f13553OooO0O0;

        public C0096OooO00o(@Nullable Handler handler, @Nullable OooO00o oooO00o) {
            this.f13552OooO00o = handler;
            this.f13553OooO0O0 = oooO00o;
        }

        public final void OooO00o(o0O0O00 o0o0o00) {
            synchronized (o0o0o00) {
            }
            Handler handler = this.f13552OooO00o;
            if (handler != null) {
                handler.post(new OooOo(this, o0o0o00, 0));
            }
        }
    }

    void OooO0O0(int i);

    void OooO0o(boolean z);

    void OooOo0(o0O0O00 o0o0o00);

    void OooOo00(String str, long j, long j2);

    void Oooo00o(long j);

    void Oooo0O0(Format format);

    void Oooo0oo(o0O0O00 o0o0o00);

    void OoooO00(int i, long j, long j2);
}
