package o000OO00;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import androidx.media3.common.OooOO0;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderException;
import androidx.media3.exoplayer.OooO;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0O00;
import kotlin.jvm.internal.LongCompanionObject;
import o000O00O.o00O;
import o000O00O.o00O0000;
import org.checkerframework.dataflow.qual.SideEffectFree;
import p069o0000ooO.o0000oo;
import p080o000OoO.o00;
import p080o000OoO.o00Oo0;
import p092o000o0O0.o000000;
import p092o000o0O0.o000OOo;
import p092o000o0O0.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooO0o extends androidx.media3.exoplayer.OooO0O0 implements Handler.Callback {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public final Handler f34388OooOOo;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final OooO0OO f34389OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f34390OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final o00O0000 f34391OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final OooO0O0 f34392OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f34393OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f34394OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public OooOO0 f34395OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f34396OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @Nullable
    public oo0o0Oo f34397OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public o000000 f34398OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @Nullable
    public o000OOo f34399OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @Nullable
    public o000000 f34400OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f34401OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public long f34402Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public long f34403Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public long f34404Oooo00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(OooO.OooO0O0 oooO0O0, @Nullable Looper looper) {
        Handler handler;
        super(3);
        OooO0O0.OooO00o oooO00o = OooO0O0.f34387OooO00o;
        this.f34389OooOOoo = oooO0O0;
        if (looper == null) {
            handler = null;
        } else {
            int i = o00.f34910OooO00o;
            handler = new Handler(looper, this);
        }
        this.f34388OooOOo = handler;
        this.f34392OooOo00 = oooO00o;
        this.f34391OooOo0 = new o00O0000();
        this.f34402Oooo000 = -9223372036854775807L;
        this.f34403Oooo00O = -9223372036854775807L;
        this.f34404Oooo00o = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final int OooO0OO(OooOO0 oooOO1) {
        if (((OooO0O0.OooO00o) this.f34392OooOo00).OooO0O0(oooOO1)) {
            return o00O.OooO00o(oooOO1.f6433Oooo0O0 == 0 ? 4 : 2, 0, 0);
        }
        return o0000oo.OooO(oooOO1.f6412OooOOOO) ? o00O.OooO00o(1, 0, 0) : o00O.OooO00o(0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean OooO0Oo() {
        return true;
    }

    @Override // androidx.media3.exoplayer.OooO0O0, androidx.media3.exoplayer.Renderer
    public final boolean OooO0o0() {
        return this.f34394OooOo0o;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void OooOo00(long j, long j2) throws DecoderException {
        boolean z;
        long jOooO0OO;
        o00O0000 o00o0001 = this.f34391OooOo0;
        this.f34404Oooo00o = j;
        if (this.f7206OooOOOO) {
            long j3 = this.f34402Oooo000;
            if (j3 != -9223372036854775807L && j >= j3) {
                Oooo0o();
                this.f34394OooOo0o = true;
            }
        }
        if (this.f34394OooOo0o) {
            return;
        }
        o000000 o000000Var = this.f34400OooOooO;
        OooO0O0 oooO0O0 = this.f34392OooOo00;
        if (o000000Var == null) {
            oo0o0Oo oo0o0oo = this.f34397OooOoOO;
            oo0o0oo.getClass();
            oo0o0oo.OooO00o(j);
            try {
                oo0o0Oo oo0o0oo2 = this.f34397OooOoOO;
                oo0o0oo2.getClass();
                this.f34400OooOooO = oo0o0oo2.OooO0O0();
            } catch (SubtitleDecoderException e) {
                Log.OooO0Oo("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f34395OooOoO, e);
                Oooo0O0();
                Oooo0o();
                oo0o0Oo oo0o0oo3 = this.f34397OooOoOO;
                oo0o0oo3.getClass();
                oo0o0oo3.release();
                this.f34397OooOoOO = null;
                this.f34396OooOoO0 = 0;
                this.f34390OooOo = true;
                OooOO0 oooOO1 = this.f34395OooOoO;
                oooOO1.getClass();
                this.f34397OooOoOO = ((OooO0O0.OooO00o) oooO0O0).OooO00o(oooOO1);
                return;
            }
        }
        if (this.f7201OooOO0 != 2) {
            return;
        }
        if (this.f34398OooOoo != null) {
            long jOooo0OO = Oooo0OO();
            z = false;
            while (jOooo0OO <= j) {
                this.f34401OooOooo++;
                jOooo0OO = Oooo0OO();
                z = true;
            }
        } else {
            z = false;
        }
        o000000 o000000Var2 = this.f34400OooOooO;
        if (o000000Var2 != null) {
            if (o000000Var2.OooO0o(4)) {
                if (!z && Oooo0OO() == LongCompanionObject.MAX_VALUE) {
                    if (this.f34396OooOoO0 == 2) {
                        Oooo0o();
                        oo0o0Oo oo0o0oo4 = this.f34397OooOoOO;
                        oo0o0oo4.getClass();
                        oo0o0oo4.release();
                        this.f34397OooOoOO = null;
                        this.f34396OooOoO0 = 0;
                        this.f34390OooOo = true;
                        OooOO0 oooOO2 = this.f34395OooOoO;
                        oooOO2.getClass();
                        this.f34397OooOoOO = ((OooO0O0.OooO00o) oooO0O0).OooO00o(oooOO2);
                    } else {
                        Oooo0o();
                        this.f34394OooOo0o = true;
                    }
                }
            } else if (o000000Var2.f33932OooO0o0 <= j) {
                o000000 o000000Var3 = this.f34398OooOoo;
                if (o000000Var3 != null) {
                    o000000Var3.OooO0oo();
                }
                this.f34401OooOooo = o000000Var2.OooO00o(j);
                this.f34398OooOoo = o000000Var2;
                this.f34400OooOooO = null;
                z = true;
            }
        }
        if (z) {
            this.f34398OooOoo.getClass();
            int iOooO00o = this.f34398OooOoo.OooO00o(j);
            if (iOooO00o == 0 || this.f34398OooOoo.OooO0Oo() == 0) {
                jOooO0OO = this.f34398OooOoo.f33932OooO0o0;
            } else if (iOooO00o == -1) {
                o000000 o000000Var4 = this.f34398OooOoo;
                jOooO0OO = o000000Var4.OooO0OO(o000000Var4.OooO0Oo() - 1);
            } else {
                jOooO0OO = this.f34398OooOoo.OooO0OO(iOooO00o - 1);
            }
            o000O000.OooO0O0 oooO0O1 = new o000O000.OooO0O0(Oooo0o0(jOooO0OO), this.f34398OooOoo.OooO0O0(j));
            Handler handler = this.f34388OooOOo;
            if (handler != null) {
                handler.obtainMessage(0, oooO0O1).sendToTarget();
            } else {
                ImmutableList<Cue> immutableList = oooO0O1.f33952OooO0Oo;
                OooO0OO oooO0OO = this.f34389OooOOoo;
                oooO0OO.OooOo0o(immutableList);
                oooO0OO.onCues(oooO0O1);
            }
        }
        if (this.f34396OooOoO0 == 2) {
            return;
        }
        while (!this.f34393OooOo0O) {
            try {
                o000OOo o000oooOooO0Oo = this.f34399OooOoo0;
                if (o000oooOooO0Oo == null) {
                    oo0o0Oo oo0o0oo5 = this.f34397OooOoOO;
                    oo0o0oo5.getClass();
                    o000oooOooO0Oo = oo0o0oo5.OooO0Oo();
                    if (o000oooOooO0Oo == null) {
                        return;
                    } else {
                        this.f34399OooOoo0 = o000oooOooO0Oo;
                    }
                }
                if (this.f34396OooOoO0 == 1) {
                    o000oooOooO0Oo.f33931OooO0Oo = 4;
                    oo0o0Oo oo0o0oo6 = this.f34397OooOoOO;
                    oo0o0oo6.getClass();
                    oo0o0oo6.OooO0OO(o000oooOooO0Oo);
                    this.f34399OooOoo0 = null;
                    this.f34396OooOoO0 = 2;
                    return;
                }
                int iOooo0 = Oooo0(o00o0001, o000oooOooO0Oo, 0);
                if (iOooo0 == -4) {
                    if (o000oooOooO0Oo.OooO0o(4)) {
                        this.f34393OooOo0O = true;
                        this.f34390OooOo = false;
                    } else {
                        OooOO0 oooOO3 = o00o0001.f34055OooO0O0;
                        if (oooOO3 == null) {
                            return;
                        }
                        o000oooOooO0Oo.f35192OooOO0o = oooOO3.f6416OooOOoo;
                        o000oooOooO0Oo.OooOO0O();
                        this.f34390OooOo &= !o000oooOooO0Oo.OooO0o(1);
                    }
                    if (!this.f34390OooOo) {
                        oo0o0Oo oo0o0oo7 = this.f34397OooOoOO;
                        oo0o0oo7.getClass();
                        oo0o0oo7.OooO0OO(o000oooOooO0Oo);
                        this.f34399OooOoo0 = null;
                    }
                } else if (iOooo0 == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e2) {
                Log.OooO0Oo("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f34395OooOoO, e2);
                Oooo0O0();
                Oooo0o();
                oo0o0Oo oo0o0oo8 = this.f34397OooOoOO;
                oo0o0oo8.getClass();
                oo0o0oo8.release();
                this.f34397OooOoOO = null;
                this.f34396OooOoO0 = 0;
                this.f34390OooOo = true;
                OooOO0 oooOO4 = this.f34395OooOoO;
                oooOO4.getClass();
                this.f34397OooOoOO = ((OooO0O0.OooO00o) oooO0O0).OooO00o(oooOO4);
                return;
            }
        }
    }

    @Override // androidx.media3.exoplayer.OooO0O0
    public final void OooOoOO() {
        this.f34395OooOoO = null;
        this.f34402Oooo000 = -9223372036854775807L;
        Oooo0O0();
        this.f34403Oooo00O = -9223372036854775807L;
        this.f34404Oooo00o = -9223372036854775807L;
        Oooo0o();
        oo0o0Oo oo0o0oo = this.f34397OooOoOO;
        oo0o0oo.getClass();
        oo0o0oo.release();
        this.f34397OooOoOO = null;
        this.f34396OooOoO0 = 0;
    }

    @Override // androidx.media3.exoplayer.OooO0O0
    public final void OooOoo(long j, boolean z) {
        this.f34404Oooo00o = j;
        Oooo0O0();
        this.f34393OooOo0O = false;
        this.f34394OooOo0o = false;
        this.f34402Oooo000 = -9223372036854775807L;
        if (this.f34396OooOoO0 == 0) {
            Oooo0o();
            oo0o0Oo oo0o0oo = this.f34397OooOoOO;
            oo0o0oo.getClass();
            oo0o0oo.flush();
            return;
        }
        Oooo0o();
        oo0o0Oo oo0o0oo2 = this.f34397OooOoOO;
        oo0o0oo2.getClass();
        oo0o0oo2.release();
        this.f34397OooOoOO = null;
        this.f34396OooOoO0 = 0;
        this.f34390OooOo = true;
        OooOO0 oooOO1 = this.f34395OooOoO;
        oooOO1.getClass();
        this.f34397OooOoOO = ((OooO0O0.OooO00o) this.f34392OooOo00).OooO00o(oooOO1);
    }

    @Override // androidx.media3.exoplayer.OooO0O0
    public final void Oooo00o(OooOO0[] oooOO0Arr, long j, long j2) {
        this.f34403Oooo00O = j2;
        OooOO0 oooOO1 = oooOO0Arr[0];
        this.f34395OooOoO = oooOO1;
        if (this.f34397OooOoOO != null) {
            this.f34396OooOoO0 = 1;
            return;
        }
        this.f34390OooOo = true;
        oooOO1.getClass();
        this.f34397OooOoOO = ((OooO0O0.OooO00o) this.f34392OooOo00).OooO00o(oooOO1);
    }

    public final void Oooo0O0() {
        o000O000.OooO0O0 oooO0O0 = new o000O000.OooO0O0(Oooo0o0(this.f34404Oooo00o), o0O00.f19060OooO0oo);
        Handler handler = this.f34388OooOOo;
        if (handler != null) {
            handler.obtainMessage(0, oooO0O0).sendToTarget();
            return;
        }
        ImmutableList<Cue> immutableList = oooO0O0.f33952OooO0Oo;
        OooO0OO oooO0OO = this.f34389OooOOoo;
        oooO0OO.OooOo0o(immutableList);
        oooO0OO.onCues(oooO0O0);
    }

    public final long Oooo0OO() {
        if (this.f34401OooOooo == -1) {
            return LongCompanionObject.MAX_VALUE;
        }
        this.f34398OooOoo.getClass();
        return this.f34401OooOooo >= this.f34398OooOoo.OooO0Oo() ? LongCompanionObject.MAX_VALUE : this.f34398OooOoo.OooO0OO(this.f34401OooOooo);
    }

    public final void Oooo0o() {
        this.f34399OooOoo0 = null;
        this.f34401OooOooo = -1;
        o000000 o000000Var = this.f34398OooOoo;
        if (o000000Var != null) {
            o000000Var.OooO0oo();
            this.f34398OooOoo = null;
        }
        o000000 o000000Var2 = this.f34400OooOooO;
        if (o000000Var2 != null) {
            o000000Var2.OooO0oo();
            this.f34400OooOooO = null;
        }
    }

    @SideEffectFree
    public final long Oooo0o0(long j) {
        o00Oo0.OooO0Oo(j != -9223372036854775807L);
        o00Oo0.OooO0Oo(this.f34403Oooo00O != -9223372036854775807L);
        return j - this.f34403Oooo00O;
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public final String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        o000O000.OooO0O0 oooO0O0 = (o000O000.OooO0O0) message.obj;
        ImmutableList<Cue> immutableList = oooO0O0.f33952OooO0Oo;
        OooO0OO oooO0OO = this.f34389OooOOoo;
        oooO0OO.OooOo0o(immutableList);
        oooO0OO.onCues(oooO0O0);
        return true;
    }
}
