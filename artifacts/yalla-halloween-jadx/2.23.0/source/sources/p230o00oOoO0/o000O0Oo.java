package p230o00oOoO0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.OooO0o;
import com.google.android.exoplayer2.OooOOO;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.Log;
import com.google.common.collect.ImmutableList;
import kotlin.jvm.internal.LongCompanionObject;
import org.checkerframework.dataflow.qual.SideEffectFree;
import p203o00o0o0o.o00OOO0O;
import p203o00o0o0o.o0OoO00O;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00OO0OO;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o000O0Oo extends OooO0o implements Handler.Callback {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public final Handler f40119OooOOo;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final o000O0 f40120OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f40121OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final o00OOO0O f40122OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final o000O0o f40123OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f40124OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f40125OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public OooOo f40126OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f40127OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @Nullable
    public o000O000 f40128OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public o000O00O f40129OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @Nullable
    public o000O00 f40130OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @Nullable
    public o000O00O f40131OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f40132OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public long f40133Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public long f40134Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public long f40135Oooo00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0Oo(OooOOO.OooO0O0 oooO0O0, @Nullable Looper looper) {
        Handler handler;
        super(3);
        o000O0o.OooO00o oooO00o = o000O0o.f40136OooO00o;
        this.f40120OooOOoo = oooO0O0;
        if (looper == null) {
            handler = null;
        } else {
            int i = o0O00.f40595OooO00o;
            handler = new Handler(looper, this);
        }
        this.f40119OooOOo = handler;
        this.f40123OooOo00 = oooO00o;
        this.f40122OooOo0 = new o00OOO0O();
        this.f40133Oooo000 = -9223372036854775807L;
        this.f40134Oooo00O = -9223372036854775807L;
        this.f40135Oooo00o = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean OooO0O0() {
        return true;
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public final int OooO0OO(OooOo oooOo) {
        if (((o000O0o.OooO00o) this.f40123OooOo00).OooO0O0(oooOo)) {
            return o0OoO00O.OooO00o(oooOo.f11232Oooo0O0 == 0 ? 4 : 2, 0, 0);
        }
        return o00OO0OO.OooOO0O(oooOo.f11211OooOOOO) ? o0OoO00O.OooO00o(1, 0, 0) : o0OoO00O.OooO00o(0, 0, 0);
    }

    @Override // com.google.android.exoplayer2.OooO0o, com.google.android.exoplayer2.Renderer
    public final boolean OooO0Oo() {
        return this.f40125OooOo0o;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void OooOo00(long j, long j2) throws DecoderException {
        boolean z;
        long jOooO0OO;
        o00OOO0O o00ooo0o = this.f40122OooOo0;
        this.f40135Oooo00o = j;
        if (this.f11052OooOOOO) {
            long j3 = this.f40133Oooo000;
            if (j3 != -9223372036854775807L && j >= j3) {
                Oooo0o();
                this.f40125OooOo0o = true;
            }
        }
        if (this.f40125OooOo0o) {
            return;
        }
        o000O00O o000o00o2 = this.f40131OooOooO;
        o000O0o o000o0o2 = this.f40123OooOo00;
        if (o000o00o2 == null) {
            o000O000 o000o001 = this.f40128OooOoOO;
            o000o001.getClass();
            o000o001.OooO00o(j);
            try {
                o000O000 o000o002 = this.f40128OooOoOO;
                o000o002.getClass();
                this.f40131OooOooO = o000o002.OooO0OO();
            } catch (SubtitleDecoderException e) {
                Log.OooO0Oo("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f40126OooOoO, e);
                Oooo0O0();
                Oooo0o();
                o000O000 o000o003 = this.f40128OooOoOO;
                o000o003.getClass();
                o000o003.release();
                this.f40128OooOoOO = null;
                this.f40127OooOoO0 = 0;
                this.f40121OooOo = true;
                OooOo oooOo = this.f40126OooOoO;
                oooOo.getClass();
                this.f40128OooOoOO = ((o000O0o.OooO00o) o000o0o2).OooO00o(oooOo);
                return;
            }
        }
        if (this.f11047OooOO0 != 2) {
            return;
        }
        if (this.f40129OooOoo != null) {
            long jOooo0OO = Oooo0OO();
            z = false;
            while (jOooo0OO <= j) {
                this.f40132OooOooo++;
                jOooo0OO = Oooo0OO();
                z = true;
            }
        } else {
            z = false;
        }
        o000O00O o000o00o3 = this.f40131OooOooO;
        if (o000o00o3 != null) {
            if (o000o00o3.OooO0o(4)) {
                if (!z && Oooo0OO() == LongCompanionObject.MAX_VALUE) {
                    if (this.f40127OooOoO0 == 2) {
                        Oooo0o();
                        o000O000 o000o004 = this.f40128OooOoOO;
                        o000o004.getClass();
                        o000o004.release();
                        this.f40128OooOoOO = null;
                        this.f40127OooOoO0 = 0;
                        this.f40121OooOo = true;
                        OooOo oooOo2 = this.f40126OooOoO;
                        oooOo2.getClass();
                        this.f40128OooOoOO = ((o000O0o.OooO00o) o000o0o2).OooO00o(oooOo2);
                    } else {
                        Oooo0o();
                        this.f40125OooOo0o = true;
                    }
                }
            } else if (o000o00o3.f39411OooO0o0 <= j) {
                o000O00O o000o00o4 = this.f40129OooOoo;
                if (o000o00o4 != null) {
                    o000o00o4.OooO0oo();
                }
                this.f40132OooOooo = o000o00o3.OooO00o(j);
                this.f40129OooOoo = o000o00o3;
                this.f40131OooOooO = null;
                z = true;
            }
        }
        if (z) {
            this.f40129OooOoo.getClass();
            int iOooO00o = this.f40129OooOoo.OooO00o(j);
            if (iOooO00o == 0 || this.f40129OooOoo.OooO0Oo() == 0) {
                jOooO0OO = this.f40129OooOoo.f39411OooO0o0;
            } else if (iOooO00o == -1) {
                o000O00O o000o00o5 = this.f40129OooOoo;
                jOooO0OO = o000o00o5.OooO0OO(o000o00o5.OooO0Oo() - 1);
            } else {
                jOooO0OO = this.f40129OooOoo.OooO0OO(iOooO00o - 1);
            }
            o0000O0O o0000o0o2 = new o0000O0O(Oooo0o0(jOooO0OO), this.f40129OooOoo.OooO0O0(j));
            Handler handler = this.f40119OooOOo;
            if (handler != null) {
                handler.obtainMessage(0, o0000o0o2).sendToTarget();
            } else {
                ImmutableList<Cue> immutableList = o0000o0o2.f40114OooO0Oo;
                o000O0 o000o0 = this.f40120OooOOoo;
                o000o0.OooOo0o(immutableList);
                o000o0.onCues(o0000o0o2);
            }
        }
        if (this.f40127OooOoO0 == 2) {
            return;
        }
        while (!this.f40124OooOo0O) {
            try {
                o000O00 o000o00OooO0Oo = this.f40130OooOoo0;
                if (o000o00OooO0Oo == null) {
                    o000O000 o000o005 = this.f40128OooOoOO;
                    o000o005.getClass();
                    o000o00OooO0Oo = o000o005.OooO0Oo();
                    if (o000o00OooO0Oo == null) {
                        return;
                    } else {
                        this.f40130OooOoo0 = o000o00OooO0Oo;
                    }
                }
                if (this.f40127OooOoO0 == 1) {
                    o000o00OooO0Oo.f39410OooO0Oo = 4;
                    o000O000 o000o006 = this.f40128OooOoOO;
                    o000o006.getClass();
                    o000o006.OooO0O0(o000o00OooO0Oo);
                    this.f40130OooOoo0 = null;
                    this.f40127OooOoO0 = 2;
                    return;
                }
                int iOooo0 = Oooo0(o00ooo0o, o000o00OooO0Oo, 0);
                if (iOooo0 == -4) {
                    if (o000o00OooO0Oo.OooO0o(4)) {
                        this.f40124OooOo0O = true;
                        this.f40121OooOo = false;
                    } else {
                        OooOo oooOo3 = o00ooo0o.f39211OooO0O0;
                        if (oooOo3 == null) {
                            return;
                        }
                        o000o00OooO0Oo.f40116OooOO0o = oooOo3.f11215OooOOoo;
                        o000o00OooO0Oo.OooOO0O();
                        this.f40121OooOo &= !o000o00OooO0Oo.OooO0o(1);
                    }
                    if (!this.f40121OooOo) {
                        o000O000 o000o007 = this.f40128OooOoOO;
                        o000o007.getClass();
                        o000o007.OooO0O0(o000o00OooO0Oo);
                        this.f40130OooOoo0 = null;
                    }
                } else if (iOooo0 == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e2) {
                Log.OooO0Oo("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f40126OooOoO, e2);
                Oooo0O0();
                Oooo0o();
                o000O000 o000o008 = this.f40128OooOoOO;
                o000o008.getClass();
                o000o008.release();
                this.f40128OooOoOO = null;
                this.f40127OooOoO0 = 0;
                this.f40121OooOo = true;
                OooOo oooOo4 = this.f40126OooOoO;
                oooOo4.getClass();
                this.f40128OooOoOO = ((o000O0o.OooO00o) o000o0o2).OooO00o(oooOo4);
                return;
            }
        }
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public final void OooOoOO() {
        this.f40126OooOoO = null;
        this.f40133Oooo000 = -9223372036854775807L;
        Oooo0O0();
        this.f40134Oooo00O = -9223372036854775807L;
        this.f40135Oooo00o = -9223372036854775807L;
        Oooo0o();
        o000O000 o000o001 = this.f40128OooOoOO;
        o000o001.getClass();
        o000o001.release();
        this.f40128OooOoOO = null;
        this.f40127OooOoO0 = 0;
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public final void OooOoo(long j, boolean z) {
        this.f40135Oooo00o = j;
        Oooo0O0();
        this.f40124OooOo0O = false;
        this.f40125OooOo0o = false;
        this.f40133Oooo000 = -9223372036854775807L;
        if (this.f40127OooOoO0 == 0) {
            Oooo0o();
            o000O000 o000o001 = this.f40128OooOoOO;
            o000o001.getClass();
            o000o001.flush();
            return;
        }
        Oooo0o();
        o000O000 o000o002 = this.f40128OooOoOO;
        o000o002.getClass();
        o000o002.release();
        this.f40128OooOoOO = null;
        this.f40127OooOoO0 = 0;
        this.f40121OooOo = true;
        OooOo oooOo = this.f40126OooOoO;
        oooOo.getClass();
        this.f40128OooOoOO = ((o000O0o.OooO00o) this.f40123OooOo00).OooO00o(oooOo);
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public final void Oooo00o(OooOo[] oooOoArr, long j, long j2) {
        this.f40134Oooo00O = j2;
        OooOo oooOo = oooOoArr[0];
        this.f40126OooOoO = oooOo;
        if (this.f40128OooOoOO != null) {
            this.f40127OooOoO0 = 1;
            return;
        }
        this.f40121OooOo = true;
        oooOo.getClass();
        this.f40128OooOoOO = ((o000O0o.OooO00o) this.f40123OooOo00).OooO00o(oooOo);
    }

    public final void Oooo0O0() {
        o0000O0O o0000o0o2 = new o0000O0O(Oooo0o0(this.f40135Oooo00o), com.google.common.collect.o0O00.f19536OooO0oo);
        Handler handler = this.f40119OooOOo;
        if (handler != null) {
            handler.obtainMessage(0, o0000o0o2).sendToTarget();
            return;
        }
        ImmutableList<Cue> immutableList = o0000o0o2.f40114OooO0Oo;
        o000O0 o000o0 = this.f40120OooOOoo;
        o000o0.OooOo0o(immutableList);
        o000o0.onCues(o0000o0o2);
    }

    public final long Oooo0OO() {
        if (this.f40132OooOooo == -1) {
            return LongCompanionObject.MAX_VALUE;
        }
        this.f40129OooOoo.getClass();
        return this.f40132OooOooo >= this.f40129OooOoo.OooO0Oo() ? LongCompanionObject.MAX_VALUE : this.f40129OooOoo.OooO0OO(this.f40132OooOooo);
    }

    public final void Oooo0o() {
        this.f40130OooOoo0 = null;
        this.f40132OooOooo = -1;
        o000O00O o000o00o2 = this.f40129OooOoo;
        if (o000o00o2 != null) {
            o000o00o2.OooO0oo();
            this.f40129OooOoo = null;
        }
        o000O00O o000o00o3 = this.f40131OooOooO;
        if (o000o00o3 != null) {
            o000o00o3.OooO0oo();
            this.f40131OooOooO = null;
        }
    }

    @SideEffectFree
    public final long Oooo0o0(long j) {
        o00O000o.OooO0Oo(j != -9223372036854775807L);
        o00O000o.OooO0Oo(this.f40134Oooo00O != -9223372036854775807L);
        return j - this.f40134Oooo00O;
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
        o0000O0O o0000o0o2 = (o0000O0O) message.obj;
        ImmutableList<Cue> immutableList = o0000o0o2.f40114OooO0Oo;
        o000O0 o000o0 = this.f40120OooOOoo;
        o000o0.OooOo0o(immutableList);
        o000o0.onCues(o0000o0o2);
        return true;
    }
}
