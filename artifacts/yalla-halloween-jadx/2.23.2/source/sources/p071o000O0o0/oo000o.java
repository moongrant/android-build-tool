package p071o000O0o0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.OooOO0;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.OooO;
import androidx.media3.exoplayer.OooO0O0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import o000O00O.o00O;
import o000O00O.o00O0000;
import org.checkerframework.dataflow.qual.SideEffectFree;
import p080o000OoO.o00;
import p080o000OoO.o00Oo0;
import p081o000OoOO.o00000O;
import p081o000OoOO.o00000OO;
import p081o000OoOO.o0000Ooo;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class oo000o extends OooO0O0 implements Handler.Callback {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final o00Oo0 f34340OooOOo;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final o00Ooo f34341OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f34342OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final o00000OO f34343OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public final Handler f34344OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public o00000O f34345OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f34346OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public Metadata f34347OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public long f34348OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public long f34349OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000o(OooO.OooO0O0 oooO0O0, @Nullable Looper looper) {
        Handler handler;
        super(5);
        o00Oo0.OooO00o oooO00o = o00Oo0.f34339OooO00o;
        this.f34341OooOOoo = oooO0O0;
        if (looper == null) {
            handler = null;
        } else {
            int i = o00.f34910OooO00o;
            handler = new Handler(looper, this);
        }
        this.f34344OooOo00 = handler;
        this.f34340OooOOo = oooO00o;
        this.f34343OooOo0 = new o00000OO();
        this.f34349OooOoOO = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final int OooO0OO(OooOO0 oooOO1) {
        if (this.f34340OooOOo.OooO0OO(oooOO1)) {
            return o00O.OooO00o(oooOO1.f6433Oooo0O0 == 0 ? 4 : 2, 0, 0);
        }
        return o00O.OooO00o(0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean OooO0Oo() {
        return true;
    }

    @Override // androidx.media3.exoplayer.OooO0O0, androidx.media3.exoplayer.Renderer
    public final boolean OooO0o0() {
        return this.f34342OooOo;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void OooOo00(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.f34346OooOo0o && this.f34347OooOoO == null) {
                o00000OO o00000oo2 = this.f34343OooOo0;
                o00000oo2.OooO0oo();
                o00O0000 o00o0001 = this.f7197OooO0o;
                o00o0001.OooO00o();
                int iOooo0 = Oooo0(o00o0001, o00000oo2, 0);
                if (iOooo0 == -4) {
                    if (o00000oo2.OooO0o(4)) {
                        this.f34346OooOo0o = true;
                    } else {
                        o00000oo2.f35001OooOO0o = this.f34348OooOoO0;
                        o00000oo2.OooOO0O();
                        o00000O o00000o = this.f34345OooOo0O;
                        int i = o00.f34910OooO00o;
                        Metadata metadataOooO00o = o00000o.OooO00o(o00000oo2);
                        if (metadataOooO00o != null) {
                            ArrayList arrayList = new ArrayList(metadataOooO00o.f6336OooO0Oo.length);
                            Oooo0O0(metadataOooO00o, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f34347OooOoO = new Metadata(Oooo0OO(o00000oo2.f7087OooO0oo), (Metadata.Entry[]) arrayList.toArray(new Metadata.Entry[0]));
                            }
                        }
                    }
                } else if (iOooo0 == -5) {
                    OooOO0 oooOO1 = o00o0001.f34055OooO0O0;
                    oooOO1.getClass();
                    this.f34348OooOoO0 = oooOO1.f6416OooOOoo;
                }
            }
            Metadata metadata = this.f34347OooOoO;
            if (metadata == null || metadata.f6337OooO0o0 > Oooo0OO(j)) {
                z = false;
            } else {
                Metadata metadata2 = this.f34347OooOoO;
                Handler handler = this.f34344OooOo00;
                if (handler != null) {
                    handler.obtainMessage(0, metadata2).sendToTarget();
                } else {
                    this.f34341OooOOoo.onMetadata(metadata2);
                }
                this.f34347OooOoO = null;
                z = true;
            }
            if (this.f34346OooOo0o && this.f34347OooOoO == null) {
                this.f34342OooOo = true;
            }
        }
    }

    @Override // androidx.media3.exoplayer.OooO0O0
    public final void OooOoOO() {
        this.f34347OooOoO = null;
        this.f34345OooOo0O = null;
        this.f34349OooOoOO = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.OooO0O0
    public final void OooOoo(long j, boolean z) {
        this.f34347OooOoO = null;
        this.f34346OooOo0o = false;
        this.f34342OooOo = false;
    }

    @Override // androidx.media3.exoplayer.OooO0O0
    public final void Oooo00o(OooOO0[] oooOO0Arr, long j, long j2) {
        this.f34345OooOo0O = this.f34340OooOOo.OooO00o(oooOO0Arr[0]);
        Metadata metadata = this.f34347OooOoO;
        if (metadata != null) {
            long j3 = this.f34349OooOoOO;
            long j4 = metadata.f6337OooO0o0;
            long j5 = (j3 + j4) - j2;
            if (j4 != j5) {
                metadata = new Metadata(j5, metadata.f6336OooO0Oo);
            }
            this.f34347OooOoO = metadata;
        }
        this.f34349OooOoOO = j2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    public final void Oooo0O0(Metadata metadata, ArrayList arrayList) {
        int i = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f6336OooO0Oo;
            if (i >= entryArr.length) {
                return;
            }
            OooOO0 OooOo1 = entryArr[i].OooOo0();
            if (OooOo1 != null) {
                o00Oo0 o00oo1 = this.f34340OooOOo;
                if (o00oo1.OooO0OO(OooOo1)) {
                    o0000Ooo o0000oooOooO00o = o00oo1.OooO00o(OooOo1);
                    byte[] bArrO0000OO = entryArr[i].o0000OO();
                    bArrO0000OO.getClass();
                    o00000OO o00000oo2 = this.f34343OooOo0;
                    o00000oo2.OooO0oo();
                    o00000oo2.OooOO0(bArrO0000OO.length);
                    ByteBuffer byteBuffer = o00000oo2.f7084OooO0o;
                    int i2 = o00.f34910OooO00o;
                    byteBuffer.put(bArrO0000OO);
                    o00000oo2.OooOO0O();
                    Metadata metadataOooO00o = o0000oooOooO00o.OooO00o(o00000oo2);
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
        o00Oo0.OooO0Oo(j != -9223372036854775807L);
        o00Oo0.OooO0Oo(this.f34349OooOoOO != -9223372036854775807L);
        return j - this.f34349OooOoOO;
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        this.f34341OooOOoo.onMetadata((Metadata) message.obj);
        return true;
    }
}
