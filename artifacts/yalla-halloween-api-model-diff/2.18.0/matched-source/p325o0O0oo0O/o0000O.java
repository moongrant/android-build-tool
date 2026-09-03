package p325o0O0oo0O;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.OooO0o;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import o0O0oo00.OooO00o;
import p313o0O0oO0.OooO;
import p314o0O0oO0O.o000000O;
import p316o0O0oOO.o0O0O00;
import p317o0O0oOO0.o00000OO;
import p318o0O0oOOO.o00O000;
import p318o0O0oOOO.o00O00OO;
import p319o0O0oOo.o00;
import p319o0O0oOo.o0000O0;
import p468o0OooO0.o0000O0O;
import p714oooOO0.o0O00;
import p714oooOO0.o0O00O0o;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O extends OooO0o implements Handler.Callback {

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @Nullable
    public final Handler f36922OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public final o000OO f36923Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public final o0000oo f36924Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public final o0000O0O f36925OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public boolean f36926OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public boolean f36927OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public int f36928Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public boolean f36929Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @Nullable
    public Format f36930OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    @Nullable
    public o0000O00 f36931Ooooooo;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    @Nullable
    public o0000O0O f36932o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public int f36933o00Oo0;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    @Nullable
    public o0000O0 f36934o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    @Nullable
    public o0000O0O f36935ooOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O(o000OO o000oo2, @Nullable Looper looper) {
        Handler handler;
        super(3);
        o0000oo.OooO00o oooO00o = o0000oo.f36940OooO00o;
        this.f36923Ooooo00 = o000oo2;
        if (looper == null) {
            handler = null;
        } else {
            int i = o00.f36680OooO00o;
            handler = new Handler(looper, this);
        }
        this.f36922OoooOoo = handler;
        this.f36924Ooooo0o = oooO00o;
        this.f36925OooooO0 = new o0000O0O();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean OooO0O0() {
        return true;
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public final int OooO0OO(Format format) {
        Objects.requireNonNull((o0000oo.OooO00o) this.f36924Ooooo0o);
        String str = format.f13148OoooOoo;
        if ("text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str)) {
            return (format.f13163o00oO0O == null ? 4 : 2) | 0 | 0;
        }
        return p319o0O0oOo.o0000O.OooO0oo(format.f13148OoooOoo) ? 1 : 0;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean OooO0Oo() {
        return this.f36927OooooOo;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void OooOOOO(long j, long j2) throws DecoderException {
        boolean z;
        if (this.f36927OooooOo) {
            return;
        }
        if (this.f36932o00O0O == null) {
            o0000O00 o0000o00 = this.f36931Ooooooo;
            Objects.requireNonNull(o0000o00);
            o0000o00.OooO00o(j);
            try {
                o0000O00 o0000o01 = this.f36931Ooooooo;
                Objects.requireNonNull(o0000o01);
                this.f36932o00O0O = o0000o01.OooO0O0();
            } catch (SubtitleDecoderException e) {
                Oooo0OO(e);
                return;
            }
        }
        if (this.f13218OoooO != 2) {
            return;
        }
        if (this.f36935ooOO != null) {
            long jOooo0O0 = Oooo0O0();
            z = false;
            while (jOooo0O0 <= j) {
                this.f36933o00Oo0++;
                jOooo0O0 = Oooo0O0();
                z = true;
            }
        } else {
            z = false;
        }
        o0000O0O o0000o0o2 = this.f36932o00O0O;
        if (o0000o0o2 != null) {
            if (o0000o0o2.isEndOfStream()) {
                if (!z && Oooo0O0() == Long.MAX_VALUE) {
                    if (this.f36928Oooooo == 2) {
                        Oooo0oO();
                    } else {
                        Oooo0o();
                        this.f36927OooooOo = true;
                    }
                }
            } else if (o0000o0o2.timeUs <= j) {
                o0000O0O o0000o0o3 = this.f36935ooOO;
                if (o0000o0o3 != null) {
                    o0000o0o3.release();
                }
                o0000 o0000Var = o0000o0o2.f36937Oooo;
                Objects.requireNonNull(o0000Var);
                this.f36933o00Oo0 = o0000Var.OooO00o(j - o0000o0o2.f36938OoooO00);
                this.f36935ooOO = o0000o0o2;
                this.f36932o00O0O = null;
                z = true;
            }
        }
        if (z) {
            Objects.requireNonNull(this.f36935ooOO);
            o0000O0O o0000o0o4 = this.f36935ooOO;
            o0000 o0000Var2 = o0000o0o4.f36937Oooo;
            Objects.requireNonNull(o0000Var2);
            List<Cue> listOooO0Oo = o0000Var2.OooO0Oo(j - o0000o0o4.f36938OoooO00);
            Handler handler = this.f36922OoooOoo;
            if (handler != null) {
                handler.obtainMessage(0, listOooO0Oo).sendToTarget();
            } else {
                this.f36923Ooooo00.OooO0o0(listOooO0Oo);
            }
        }
        if (this.f36928Oooooo == 2) {
            return;
        }
        while (!this.f36926OooooOO) {
            try {
                o0000O0 o0000o0OooO0OO = this.f36934o0OoOo0;
                if (o0000o0OooO0OO == null) {
                    o0000O00 o0000o02 = this.f36931Ooooooo;
                    Objects.requireNonNull(o0000o02);
                    o0000o0OooO0OO = o0000o02.OooO0OO();
                    if (o0000o0OooO0OO == null) {
                        return;
                    } else {
                        this.f36934o0OoOo0 = o0000o0OooO0OO;
                    }
                }
                if (this.f36928Oooooo == 1) {
                    o0000o0OooO0OO.setFlags(4);
                    o0000O00 o0000o03 = this.f36931Ooooooo;
                    Objects.requireNonNull(o0000o03);
                    o0000o03.OooO0Oo(o0000o0OooO0OO);
                    this.f36934o0OoOo0 = null;
                    this.f36928Oooooo = 2;
                    return;
                }
                int iOooo00o = Oooo00o(this.f36925OooooO0, o0000o0OooO0OO, false);
                if (iOooo00o == -4) {
                    if (o0000o0OooO0OO.isEndOfStream()) {
                        this.f36926OooooOO = true;
                        this.f36929Oooooo0 = false;
                    } else {
                        Format format = this.f36925OooooO0.f40527OooO0O0;
                        if (format == null) {
                            return;
                        }
                        o0000o0OooO0OO.f36936OoooOOO = format.f13152OooooOO;
                        o0000o0OooO0OO.OooO0oo();
                        this.f36929Oooooo0 &= !o0000o0OooO0OO.isKeyFrame();
                    }
                    if (!this.f36929Oooooo0) {
                        o0000O00 o0000o04 = this.f36931Ooooooo;
                        Objects.requireNonNull(o0000o04);
                        o0000o04.OooO0Oo(o0000o0OooO0OO);
                        this.f36934o0OoOo0 = null;
                    }
                } else if (iOooo00o == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e2) {
                Oooo0OO(e2);
                return;
            }
        }
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public final void OooOoOO() {
        this.f36930OoooooO = null;
        Oooo0();
        Oooo0o();
        o0000O00 o0000o00 = this.f36931Ooooooo;
        Objects.requireNonNull(o0000o00);
        o0000o00.release();
        this.f36931Ooooooo = null;
        this.f36928Oooooo = 0;
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public final void OooOoo(long j, boolean z) {
        Oooo0();
        this.f36926OooooOO = false;
        this.f36927OooooOo = false;
        if (this.f36928Oooooo != 0) {
            Oooo0oO();
            return;
        }
        Oooo0o();
        o0000O00 o0000o00 = this.f36931Ooooooo;
        Objects.requireNonNull(o0000o00);
        o0000o00.flush();
    }

    public final void Oooo0() {
        List<Cue> listEmptyList = Collections.emptyList();
        Handler handler = this.f36922OoooOoo;
        if (handler != null) {
            handler.obtainMessage(0, listEmptyList).sendToTarget();
        } else {
            this.f36923Ooooo00.OooO0o0(listEmptyList);
        }
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public final void Oooo00O(Format[] formatArr, long j, long j2) {
        this.f36930OoooooO = formatArr[0];
        if (this.f36931Ooooooo != null) {
            this.f36928Oooooo = 1;
        } else {
            Oooo0o0();
        }
    }

    public final long Oooo0O0() {
        if (this.f36933o00Oo0 == -1) {
            return Long.MAX_VALUE;
        }
        Objects.requireNonNull(this.f36935ooOO);
        int i = this.f36933o00Oo0;
        o0000 o0000Var = this.f36935ooOO.f36937Oooo;
        Objects.requireNonNull(o0000Var);
        if (i >= o0000Var.OooO0o0()) {
            return Long.MAX_VALUE;
        }
        o0000O0O o0000o0o2 = this.f36935ooOO;
        int i2 = this.f36933o00Oo0;
        o0000 o0000Var2 = o0000o0o2.f36937Oooo;
        Objects.requireNonNull(o0000Var2);
        return o0000Var2.OooO0O0(i2) + o0000o0o2.f36938OoooO00;
    }

    public final void Oooo0OO(SubtitleDecoderException subtitleDecoderException) {
        String strValueOf = String.valueOf(this.f36930OoooooO);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 39);
        sb.append("Subtitle decoding failed. streamFormat=");
        sb.append(strValueOf);
        o0000O0.OooO0O0("TextRenderer", sb.toString(), subtitleDecoderException);
        Oooo0();
        Oooo0oO();
    }

    public final void Oooo0o() {
        this.f36934o0OoOo0 = null;
        this.f36933o00Oo0 = -1;
        o0000O0O o0000o0o2 = this.f36935ooOO;
        if (o0000o0o2 != null) {
            o0000o0o2.release();
            this.f36935ooOO = null;
        }
        o0000O0O o0000o0o3 = this.f36932o00O0O;
        if (o0000o0o3 != null) {
            o0000o0o3.release();
            this.f36932o00O0O = null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:50:0x009c  */
    public final void Oooo0o0() {
        o0000O00 oooO;
        byte b = 1;
        this.f36929Oooooo0 = true;
        o0000oo o0000ooVar = this.f36924Ooooo0o;
        Format format = this.f36930OoooooO;
        Objects.requireNonNull(format);
        Objects.requireNonNull((o0000oo.OooO00o) o0000ooVar);
        String str = format.f13148OoooOoo;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (!str.equals("application/dvbsubs")) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case -1248334819:
                    if (!str.equals("application/pgs")) {
                        b = -1;
                    }
                    break;
                case -1026075066:
                    if (!str.equals("application/x-mp4-vtt")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case -1004728940:
                    if (!str.equals("text/vtt")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case 691401887:
                    if (!str.equals("application/x-quicktime-tx3g")) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case 822864842:
                    if (!str.equals("text/x-ssa")) {
                        b = -1;
                    } else {
                        b = 5;
                    }
                    break;
                case 930165504:
                    if (!str.equals("application/x-mp4-cea-608")) {
                        b = -1;
                    } else {
                        b = 6;
                    }
                    break;
                case 1566015601:
                    if (!str.equals("application/cea-608")) {
                        b = -1;
                    } else {
                        b = 7;
                    }
                    break;
                case 1566016562:
                    if (!str.equals("application/cea-708")) {
                        b = -1;
                    } else {
                        b = 8;
                    }
                    break;
                case 1668750253:
                    if (!str.equals("application/x-subrip")) {
                        b = -1;
                    } else {
                        b = 9;
                    }
                    break;
                case 1693976202:
                    if (!str.equals("application/ttml+xml")) {
                        b = -1;
                    } else {
                        b = 10;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    oooO = new OooO(format.f13150Ooooo0o);
                    break;
                case 1:
                    oooO = new o000000O();
                    break;
                case 2:
                    oooO = new o00O000();
                    break;
                case 3:
                    oooO = new o00O00OO();
                    break;
                case 4:
                    oooO = new OooO00o(format.f13150Ooooo0o);
                    break;
                case 5:
                    oooO = new com.google.android.exoplayer2.text.ssa.OooO00o(format.f13150Ooooo0o);
                    break;
                case 6:
                case 7:
                    oooO = new o0O00(str, format.f13164o00oO0o);
                    break;
                case 8:
                    oooO = new o0O00O0o(format.f13164o00oO0o, format.f13150Ooooo0o);
                    break;
                case 9:
                    oooO = new o00000OO();
                    break;
                case 10:
                    oooO = new o0O0O00();
                    break;
            }
            this.f36931Ooooooo = oooO;
            return;
        }
        String strValueOf = String.valueOf(str);
        throw new IllegalArgumentException(strValueOf.length() != 0 ? "Attempted to create decoder for unsupported MIME type: ".concat(strValueOf) : new String("Attempted to create decoder for unsupported MIME type: "));
    }

    public final void Oooo0oO() {
        Oooo0o();
        o0000O00 o0000o00 = this.f36931Ooooooo;
        Objects.requireNonNull(o0000o00);
        o0000o00.release();
        this.f36931Ooooooo = null;
        this.f36928Oooooo = 0;
        Oooo0o0();
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public final String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        this.f36923Ooooo00.OooO0o0((List) message.obj);
        return true;
    }
}
