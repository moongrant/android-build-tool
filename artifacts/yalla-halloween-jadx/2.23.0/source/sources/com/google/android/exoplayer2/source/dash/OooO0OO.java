package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.source.o00O0O;
import com.google.android.exoplayer2.source.o0OoOo0;
import com.yalla.yalla.data.constant.FeedbackType;
import java.io.IOException;
import java.util.TreeMap;
import p203o00o0o0o.o00OOO0O;
import p219o00oOOO0.o00000OO;
import p228o00oOo0o.o00Ooo;
import p244o00oo0Oo.o00;
import p244o00oo0Oo.o000OO0O;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O00;
import p636o0ooOO.O0000000;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO implements Handler.Callback {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public o00Ooo f13267OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000OO0O f13268OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0O0 f13270OooO0o0;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f13273OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f13274OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f13275OooOO0o;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final TreeMap<Long, Long> f13272OooO0oo = new TreeMap<>();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Handler f13271OooO0oO = o0O00.OooOO0O(this);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00000OO f13269OooO0o = new o00000OO();

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f13276OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f13277OooO0O0;

        public OooO00o(long j, long j2) {
            this.f13276OooO00o = j;
            this.f13277OooO0O0 = j2;
        }
    }

    public interface OooO0O0 {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public final class C0212OooO0OO implements TrackOutput {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o00O0O f13278OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o00OOO0O f13279OooO0O0 = new o00OOO0O();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final O0000000 f13280OooO0OO = new O0000000();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f13281OooO0Oo = -9223372036854775807L;

        public C0212OooO0OO(o000OO0O o000oo0o2) {
            this.f13278OooO00o = new o00O0O(o000oo0o2, null, null);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public final int OooO00o(o00 o00Var, int i, boolean z) {
            return OooO0o(o00Var, i, z);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public final void OooO0O0(int i, o00Oo00 o00oo00) {
            OooO0Oo(i, o00oo00);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public final void OooO0OO(OooOo oooOo) {
            this.f13278OooO00o.OooO0OO(oooOo);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public final void OooO0Oo(int i, o00Oo00 o00oo00) {
            o00O0O o00o0o2 = this.f13278OooO00o;
            o00o0o2.getClass();
            o00o0o2.OooO0Oo(i, o00oo00);
        }

        public final int OooO0o(o00 o00Var, int i, boolean z) throws IOException {
            o00O0O o00o0o2 = this.f13278OooO00o;
            o00o0o2.getClass();
            return o00o0o2.OooOo0o(o00Var, i, z);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public final void OooO0o0(long j, int i, int i2, int i3, @Nullable TrackOutput.OooO00o oooO00o) {
            long jOooO0o;
            long jOooo0o;
            this.f13278OooO00o.OooO0o0(j, i, i2, i3, oooO00o);
            while (true) {
                boolean z = false;
                if (!this.f13278OooO00o.OooOOo0(false)) {
                    break;
                }
                O0000000 o0000000 = this.f13280OooO0OO;
                o0000000.OooO0oo();
                if (this.f13278OooO00o.OooOo00(this.f13279OooO0O0, o0000000, 0, false) == -4) {
                    o0000000.OooOO0O();
                } else {
                    o0000000 = null;
                }
                if (o0000000 != null) {
                    long j2 = o0000000.f11677OooO0oo;
                    Metadata metadataOooO00o = OooO0OO.this.f13269OooO0o.OooO00o(o0000000);
                    if (metadataOooO00o != null) {
                        EventMessage eventMessage = (EventMessage) metadataOooO00o.f12530OooO0Oo[0];
                        String str = eventMessage.f12547OooO0Oo;
                        String str2 = eventMessage.f12549OooO0o0;
                        if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || FeedbackType.Suggestions.equals(str2) || FeedbackType.Recharge.equals(str2))) {
                            z = true;
                        }
                        if (z) {
                            try {
                                jOooo0o = o0O00.Oooo0o(o0O00.OooOOO0(eventMessage.f12551OooO0oo));
                            } catch (ParserException unused) {
                                jOooo0o = -9223372036854775807L;
                            }
                            if (jOooo0o != -9223372036854775807L) {
                                OooO00o oooO00o2 = new OooO00o(j2, jOooo0o);
                                Handler handler = OooO0OO.this.f13271OooO0oO;
                                handler.sendMessage(handler.obtainMessage(1, oooO00o2));
                            }
                        }
                    }
                }
            }
            o00O0O o00o0o2 = this.f13278OooO00o;
            o0OoOo0 o0oooo0 = o00o0o2.f13301OooO00o;
            synchronized (o00o0o2) {
                int i4 = o00o0o2.f13318OooOOoo;
                jOooO0o = i4 == 0 ? -1L : o00o0o2.OooO0o(i4);
            }
            o0oooo0.OooO0O0(jOooO0o);
        }
    }

    public OooO0OO(o00Ooo o00ooo2, DashMediaSource.OooO0OO oooO0OO, o000OO0O o000oo0o2) {
        this.f13267OooO = o00ooo2;
        this.f13270OooO0o0 = oooO0OO;
        this.f13268OooO0Oo = o000oo0o2;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.f13275OooOO0o) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        OooO00o oooO00o = (OooO00o) message.obj;
        long j = oooO00o.f13276OooO00o;
        TreeMap<Long, Long> treeMap = this.f13272OooO0oo;
        long j2 = oooO00o.f13277OooO0O0;
        Long l = treeMap.get(Long.valueOf(j2));
        if (l == null || l.longValue() > j) {
            treeMap.put(Long.valueOf(j2), Long.valueOf(j));
        }
        return true;
    }
}
