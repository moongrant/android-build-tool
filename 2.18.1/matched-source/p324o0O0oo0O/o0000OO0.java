package p324o0O0oo0O;

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
import p312o0O0oO0.OooO;
import p313o0O0oO0O.o000000O;
import p315o0O0oOO.o0O0O00;
import p316o0O0oOO0.o0000Ooo;
import p317o0O0oOOO.o00O000o;
import p317o0O0oOOO.o00O00o0;
import p318o0O0oOo.o0000oo;
import p318o0O0oOo.o000OO;
import p318o0O0oOo.o000OOo0;
import p466o0OooO0.o0000O0O;
import p712oooOO0.o0O00;
import p712oooOO0.o0O00O0o;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000OO0 extends OooO0o implements Handler.Callback {

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @Nullable
    public final Handler f36905OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final o0000O f36906OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final o0000O0 f36907OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public final o0000O0O f36908OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public boolean f36909Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public boolean f36910Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public boolean f36911OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public int f36912OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @Nullable
    public Format f36913OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @Nullable
    public o0000O0O f36914Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @Nullable
    public o0000oo f36915Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @Nullable
    public o000OO f36916OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    @Nullable
    public o000OO f36917Ooooooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public int f36918o0OoOo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000OO0(o0000O o0000o2, @Nullable Looper looper) {
        Handler handler;
        super(3);
        o0000O0.OooO00o oooO00o = o0000O0.f36903OooO00o;
        this.f36906OoooOo0 = o0000o2;
        if (looper == null) {
            handler = null;
        } else {
            int i = o000OOo0.f36740OooO00o;
            handler = new Handler(looper, this);
        }
        this.f36905OoooOOo = handler;
        this.f36907OoooOoO = oooO00o;
        this.f36908OoooOoo = new o0000O0O();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean OooO0O0() {
        return true;
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public final int OooO0OO(Format format) {
        Objects.requireNonNull((o0000O0.OooO00o) this.f36907OoooOoO);
        String str = format.f13131OoooOOo;
        if ("text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str)) {
            return (format.f13149o00ooo == null ? 4 : 2) | 0 | 0;
        }
        return o000OO.OooO0oo(format.f13131OoooOOo) ? 1 : 0;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean OooO0Oo() {
        return this.f36910Ooooo0o;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void OooOOOO(long j, long j2) throws DecoderException {
        boolean z;
        if (this.f36910Ooooo0o) {
            return;
        }
        if (this.f36917Ooooooo == null) {
            o0000oo o0000ooVar = this.f36915Oooooo0;
            Objects.requireNonNull(o0000ooVar);
            o0000ooVar.OooO00o(j);
            try {
                o0000oo o0000ooVar2 = this.f36915Oooooo0;
                Objects.requireNonNull(o0000ooVar2);
                this.f36917Ooooooo = o0000ooVar2.OooO0O0();
            } catch (SubtitleDecoderException e) {
                Oooo0OO(e);
                return;
            }
        }
        if (this.f13206OoooO00 != 2) {
            return;
        }
        if (this.f36916OoooooO != null) {
            long jOooo0O0 = Oooo0O0();
            z = false;
            while (jOooo0O0 <= j) {
                this.f36918o0OoOo0++;
                jOooo0O0 = Oooo0O0();
                z = true;
            }
        } else {
            z = false;
        }
        o000OO o000oo2 = this.f36917Ooooooo;
        if (o000oo2 != null) {
            if (o000oo2.isEndOfStream()) {
                if (!z && Oooo0O0() == Long.MAX_VALUE) {
                    if (this.f36912OooooOO == 2) {
                        Oooo0oO();
                    } else {
                        Oooo0o();
                        this.f36910Ooooo0o = true;
                    }
                }
            } else if (o000oo2.timeUs <= j) {
                o000OO o000oo3 = this.f36916OoooooO;
                if (o000oo3 != null) {
                    o000oo3.release();
                }
                o0000O00 o0000o00 = o000oo2.f36919Oooo0o;
                Objects.requireNonNull(o0000o00);
                this.f36918o0OoOo0 = o0000o00.OooO00o(j - o000oo2.f36920Oooo0oO);
                this.f36916OoooooO = o000oo2;
                this.f36917Ooooooo = null;
                z = true;
            }
        }
        if (z) {
            Objects.requireNonNull(this.f36916OoooooO);
            o000OO o000oo4 = this.f36916OoooooO;
            o0000O00 o0000o01 = o000oo4.f36919Oooo0o;
            Objects.requireNonNull(o0000o01);
            List<Cue> listOooO0Oo = o0000o01.OooO0Oo(j - o000oo4.f36920Oooo0oO);
            Handler handler = this.f36905OoooOOo;
            if (handler != null) {
                handler.obtainMessage(0, listOooO0Oo).sendToTarget();
            } else {
                this.f36906OoooOo0.OooO0o0(listOooO0Oo);
            }
        }
        if (this.f36912OooooOO == 2) {
            return;
        }
        while (!this.f36909Ooooo00) {
            try {
                o0000O0O o0000o0oOooO0OO = this.f36914Oooooo;
                if (o0000o0oOooO0OO == null) {
                    o0000oo o0000ooVar3 = this.f36915Oooooo0;
                    Objects.requireNonNull(o0000ooVar3);
                    o0000o0oOooO0OO = o0000ooVar3.OooO0OO();
                    if (o0000o0oOooO0OO == null) {
                        return;
                    } else {
                        this.f36914Oooooo = o0000o0oOooO0OO;
                    }
                }
                if (this.f36912OooooOO == 1) {
                    o0000o0oOooO0OO.setFlags(4);
                    o0000oo o0000ooVar4 = this.f36915Oooooo0;
                    Objects.requireNonNull(o0000ooVar4);
                    o0000ooVar4.OooO0Oo(o0000o0oOooO0OO);
                    this.f36914Oooooo = null;
                    this.f36912OooooOO = 2;
                    return;
                }
                int iOooo00o = Oooo00o(this.f36908OoooOoo, o0000o0oOooO0OO, false);
                if (iOooo00o == -4) {
                    if (o0000o0oOooO0OO.isEndOfStream()) {
                        this.f36909Ooooo00 = true;
                        this.f36911OooooO0 = false;
                    } else {
                        Format format = this.f36908OoooOoo.f40508OooO0O0;
                        if (format == null) {
                            return;
                        }
                        o0000o0oOooO0OO.f36904OoooO = format.f13135Ooooo00;
                        o0000o0oOooO0OO.OooO0oo();
                        this.f36911OooooO0 &= !o0000o0oOooO0OO.isKeyFrame();
                    }
                    if (!this.f36911OooooO0) {
                        o0000oo o0000ooVar5 = this.f36915Oooooo0;
                        Objects.requireNonNull(o0000ooVar5);
                        o0000ooVar5.OooO0Oo(o0000o0oOooO0OO);
                        this.f36914Oooooo = null;
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
        this.f36913OooooOo = null;
        Oooo0();
        Oooo0o();
        o0000oo o0000ooVar = this.f36915Oooooo0;
        Objects.requireNonNull(o0000ooVar);
        o0000ooVar.release();
        this.f36915Oooooo0 = null;
        this.f36912OooooOO = 0;
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public final void OooOoo(long j, boolean z) {
        Oooo0();
        this.f36909Ooooo00 = false;
        this.f36910Ooooo0o = false;
        if (this.f36912OooooOO != 0) {
            Oooo0oO();
            return;
        }
        Oooo0o();
        o0000oo o0000ooVar = this.f36915Oooooo0;
        Objects.requireNonNull(o0000ooVar);
        o0000ooVar.flush();
    }

    public final void Oooo0() {
        List<Cue> listEmptyList = Collections.emptyList();
        Handler handler = this.f36905OoooOOo;
        if (handler != null) {
            handler.obtainMessage(0, listEmptyList).sendToTarget();
        } else {
            this.f36906OoooOo0.OooO0o0(listEmptyList);
        }
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public final void Oooo00O(Format[] formatArr, long j, long j2) {
        this.f36913OooooOo = formatArr[0];
        if (this.f36915Oooooo0 != null) {
            this.f36912OooooOO = 1;
        } else {
            Oooo0o0();
        }
    }

    public final long Oooo0O0() {
        if (this.f36918o0OoOo0 == -1) {
            return Long.MAX_VALUE;
        }
        Objects.requireNonNull(this.f36916OoooooO);
        int i = this.f36918o0OoOo0;
        o0000O00 o0000o00 = this.f36916OoooooO.f36919Oooo0o;
        Objects.requireNonNull(o0000o00);
        if (i >= o0000o00.OooO0o0()) {
            return Long.MAX_VALUE;
        }
        o000OO o000oo2 = this.f36916OoooooO;
        int i2 = this.f36918o0OoOo0;
        o0000O00 o0000o01 = o000oo2.f36919Oooo0o;
        Objects.requireNonNull(o0000o01);
        return o0000o01.OooO0O0(i2) + o000oo2.f36920Oooo0oO;
    }

    public final void Oooo0OO(SubtitleDecoderException subtitleDecoderException) {
        String strValueOf = String.valueOf(this.f36913OooooOo);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 39);
        sb.append("Subtitle decoding failed. streamFormat=");
        sb.append(strValueOf);
        o0000oo.OooO0O0("TextRenderer", sb.toString(), subtitleDecoderException);
        Oooo0();
        Oooo0oO();
    }

    public final void Oooo0o() {
        this.f36914Oooooo = null;
        this.f36918o0OoOo0 = -1;
        o000OO o000oo2 = this.f36916OoooooO;
        if (o000oo2 != null) {
            o000oo2.release();
            this.f36916OoooooO = null;
        }
        o000OO o000oo3 = this.f36917Ooooooo;
        if (o000oo3 != null) {
            o000oo3.release();
            this.f36917Ooooooo = null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:50:0x009c  */
    public final void Oooo0o0() {
        o0000oo oooO;
        byte b = 1;
        this.f36911OooooO0 = true;
        o0000O0 o0000o1 = this.f36907OoooOoO;
        Format format = this.f36913OooooOo;
        Objects.requireNonNull(format);
        Objects.requireNonNull((o0000O0.OooO00o) o0000o1);
        String str = format.f13131OoooOOo;
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
                    oooO = new OooO(format.f13133OoooOoO);
                    break;
                case 1:
                    oooO = new o000000O();
                    break;
                case 2:
                    oooO = new o00O000o();
                    break;
                case 3:
                    oooO = new o00O00o0();
                    break;
                case 4:
                    oooO = new OooO00o(format.f13133OoooOoO);
                    break;
                case 5:
                    oooO = new com.google.android.exoplayer2.text.ssa.OooO00o(format.f13133OoooOoO);
                    break;
                case 6:
                case 7:
                    oooO = new o0O00(str, format.f13148o00o0O);
                    break;
                case 8:
                    oooO = new o0O00O0o(format.f13148o00o0O, format.f13133OoooOoO);
                    break;
                case 9:
                    oooO = new o0000Ooo();
                    break;
                case 10:
                    oooO = new o0O0O00();
                    break;
            }
            this.f36915Oooooo0 = oooO;
            return;
        }
        String strValueOf = String.valueOf(str);
        throw new IllegalArgumentException(strValueOf.length() != 0 ? "Attempted to create decoder for unsupported MIME type: ".concat(strValueOf) : new String("Attempted to create decoder for unsupported MIME type: "));
    }

    public final void Oooo0oO() {
        Oooo0o();
        o0000oo o0000ooVar = this.f36915Oooooo0;
        Objects.requireNonNull(o0000ooVar);
        o0000ooVar.release();
        this.f36915Oooooo0 = null;
        this.f36912OooooOO = 0;
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
        this.f36906OoooOo0.OooO0o0((List) message.obj);
        return true;
    }
}
