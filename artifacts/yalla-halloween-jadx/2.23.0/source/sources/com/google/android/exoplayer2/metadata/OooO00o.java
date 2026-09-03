package com.google.android.exoplayer2.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.OooO0o;
import com.google.android.exoplayer2.OooOOO;
import com.google.android.exoplayer2.OooOo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.checkerframework.dataflow.qual.SideEffectFree;
import p203o00o0o0o.o00OOO0O;
import p203o00o0o0o.o0OoO00O;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;
import p636o0ooOO.O0000000;
import p636o0ooOO.O0O0;
import p636o0ooOO.O0OO00;
import p636o0ooOO.oo00;
import p636o0ooOO.oo000000;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooO00o extends OooO0o implements Handler.Callback {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final oo00 f12532OooOOo;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final O0O0 f12533OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f12534OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final O0000000 f12535OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public final Handler f12536OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public oo000000 f12537OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f12538OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public Metadata f12539OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public long f12540OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public long f12541OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(OooOOO.OooO0O0 oooO0O0, @Nullable Looper looper) {
        Handler handler;
        super(5);
        oo00.OooO00o oooO00o = oo00.f57396OooO00o;
        this.f12533OooOOoo = oooO0O0;
        if (looper == null) {
            handler = null;
        } else {
            int i = o0O00.f40595OooO00o;
            handler = new Handler(looper, this);
        }
        this.f12536OooOo00 = handler;
        this.f12532OooOOo = oooO00o;
        this.f12535OooOo0 = new O0000000();
        this.f12541OooOoOO = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean OooO0O0() {
        return true;
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public final int OooO0OO(OooOo oooOo) {
        if (this.f12532OooOOo.OooO0OO(oooOo)) {
            return o0OoO00O.OooO00o(oooOo.f11232Oooo0O0 == 0 ? 4 : 2, 0, 0);
        }
        return o0OoO00O.OooO00o(0, 0, 0);
    }

    @Override // com.google.android.exoplayer2.OooO0o, com.google.android.exoplayer2.Renderer
    public final boolean OooO0Oo() {
        return this.f12534OooOo;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void OooOo00(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.f12538OooOo0o && this.f12539OooOoO == null) {
                O0000000 o0000000 = this.f12535OooOo0;
                o0000000.OooO0oo();
                o00OOO0O o00ooo0o = this.f11043OooO0o;
                o00ooo0o.OooO00o();
                int iOooo0 = Oooo0(o00ooo0o, o0000000, 0);
                if (iOooo0 == -4) {
                    if (o0000000.OooO0o(4)) {
                        this.f12538OooOo0o = true;
                    } else {
                        o0000000.f57395OooOO0o = this.f12540OooOoO0;
                        o0000000.OooOO0O();
                        oo000000 oo000000Var = this.f12537OooOo0O;
                        int i = o0O00.f40595OooO00o;
                        Metadata metadataOooO00o = oo000000Var.OooO00o(o0000000);
                        if (metadataOooO00o != null) {
                            ArrayList arrayList = new ArrayList(metadataOooO00o.f12530OooO0Oo.length);
                            Oooo0O0(metadataOooO00o, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f12539OooOoO = new Metadata(Oooo0OO(o0000000.f11677OooO0oo), (Metadata.Entry[]) arrayList.toArray(new Metadata.Entry[0]));
                            }
                        }
                    }
                } else if (iOooo0 == -5) {
                    OooOo oooOo = o00ooo0o.f39211OooO0O0;
                    oooOo.getClass();
                    this.f12540OooOoO0 = oooOo.f11215OooOOoo;
                }
            }
            Metadata metadata = this.f12539OooOoO;
            if (metadata == null || metadata.f12531OooO0o0 > Oooo0OO(j)) {
                z = false;
            } else {
                Metadata metadata2 = this.f12539OooOoO;
                Handler handler = this.f12536OooOo00;
                if (handler != null) {
                    handler.obtainMessage(0, metadata2).sendToTarget();
                } else {
                    this.f12533OooOOoo.onMetadata(metadata2);
                }
                this.f12539OooOoO = null;
                z = true;
            }
            if (this.f12538OooOo0o && this.f12539OooOoO == null) {
                this.f12534OooOo = true;
            }
        }
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public final void OooOoOO() {
        this.f12539OooOoO = null;
        this.f12537OooOo0O = null;
        this.f12541OooOoOO = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public final void OooOoo(long j, boolean z) {
        this.f12539OooOoO = null;
        this.f12538OooOo0o = false;
        this.f12534OooOo = false;
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public final void Oooo00o(OooOo[] oooOoArr, long j, long j2) {
        this.f12537OooOo0O = this.f12532OooOOo.OooO00o(oooOoArr[0]);
        Metadata metadata = this.f12539OooOoO;
        if (metadata != null) {
            long j3 = this.f12541OooOoOO;
            long j4 = metadata.f12531OooO0o0;
            long j5 = (j3 + j4) - j2;
            if (j4 != j5) {
                metadata = new Metadata(j5, metadata.f12530OooO0Oo);
            }
            this.f12539OooOoO = metadata;
        }
        this.f12541OooOoOO = j2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    public final void Oooo0O0(Metadata metadata, ArrayList arrayList) {
        int i = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f12530OooO0Oo;
            if (i >= entryArr.length) {
                return;
            }
            OooOo oooOoOooOo0 = entryArr[i].OooOo0();
            if (oooOoOooOo0 != null) {
                oo00 oo00Var = this.f12532OooOOo;
                if (oo00Var.OooO0OO(oooOoOooOo0)) {
                    O0OO00 o0oo00OooO00o = oo00Var.OooO00o(oooOoOooOo0);
                    byte[] bArrO0000OO = entryArr[i].o0000OO();
                    bArrO0000OO.getClass();
                    O0000000 o0000000 = this.f12535OooOo0;
                    o0000000.OooO0oo();
                    o0000000.OooOO0(bArrO0000OO.length);
                    ByteBuffer byteBuffer = o0000000.f11674OooO0o;
                    int i2 = o0O00.f40595OooO00o;
                    byteBuffer.put(bArrO0000OO);
                    o0000000.OooOO0O();
                    Metadata metadataOooO00o = o0oo00OooO00o.OooO00o(o0000000);
                    if (metadataOooO00o != null) {
                        Oooo0O0(metadataOooO00o, arrayList);
                    }
                } else {
                    arrayList.add(entryArr[i]);
                }
            } else {
                arrayList.add(entryArr[i]);
            }
            i++;
        }
    }

    @SideEffectFree
    public final long Oooo0OO(long j) {
        o00O000o.OooO0Oo(j != -9223372036854775807L);
        o00O000o.OooO0Oo(this.f12541OooOoOO != -9223372036854775807L);
        return j - this.f12541OooOoOO;
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        this.f12533OooOOoo.onMetadata((Metadata) message.obj);
        return true;
    }
}
