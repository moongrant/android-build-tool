package com.google.android.exoplayer2.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.OooO0o;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import o0O0o0.OooO0O0;
import o0O0o0.OooO0OO;
import p318o0O0oOo.o000OOo0;
import p466o0OooO0.o0000O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends OooO0o implements Handler.Callback {

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final OooO0O0 f14443OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final o0O0o0.OooO0o f14444OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @Nullable
    public final Handler f14445OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public final OooO0OO f14446OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public final Metadata[] f14447Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public final long[] f14448Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public int f14449OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public int f14450OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @Nullable
    public o0O0o0.OooO00o f14451OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public long f14452Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public boolean f14453Oooooo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(o0O0o0.OooO0o oooO0o, @Nullable Looper looper) {
        Handler handler;
        super(4);
        OooO0O0.OooO00o oooO00o = OooO0O0.f36066OooO00o;
        this.f14444OoooOo0 = oooO0o;
        if (looper == null) {
            handler = null;
        } else {
            int i = o000OOo0.f36740OooO00o;
            handler = new Handler(looper, this);
        }
        this.f14445OoooOoO = handler;
        this.f14443OoooOOo = oooO00o;
        this.f14446OoooOoo = new OooO0OO();
        this.f14447Ooooo00 = new Metadata[5];
        this.f14448Ooooo0o = new long[5];
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean OooO0O0() {
        return true;
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public final int OooO0OO(Format format) {
        if (this.f14443OoooOOo.OooO0OO(format)) {
            return (format.f13149o00ooo == null ? 4 : 2) | 0 | 0;
        }
        return 0;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean OooO0Oo() {
        return this.f14453Oooooo0;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void OooOOOO(long j, long j2) {
        if (!this.f14453Oooooo0 && this.f14450OooooOO < 5) {
            this.f14446OoooOoo.clear();
            o0000O0O o0000o0oOooOoO = OooOoO();
            int iOooo00o = Oooo00o(o0000o0oOooOoO, this.f14446OoooOoo, false);
            if (iOooo00o == -4) {
                if (this.f14446OoooOoo.isEndOfStream()) {
                    this.f14453Oooooo0 = true;
                } else {
                    OooO0OO oooO0OO = this.f14446OoooOoo;
                    oooO0OO.f36067OoooO = this.f14452Oooooo;
                    oooO0OO.OooO0oo();
                    o0O0o0.OooO00o oooO00o = this.f14451OooooOo;
                    int i = o000OOo0.f36740OooO00o;
                    Metadata metadataOooO00o = oooO00o.OooO00o(this.f14446OoooOoo);
                    if (metadataOooO00o != null) {
                        ArrayList arrayList = new ArrayList(metadataOooO00o.f14442Oooo0o.length);
                        Oooo0(metadataOooO00o, arrayList);
                        if (!arrayList.isEmpty()) {
                            Metadata metadata = new Metadata(arrayList);
                            int i2 = this.f14449OooooO0;
                            int i3 = this.f14450OooooOO;
                            int i4 = (i2 + i3) % 5;
                            this.f14447Ooooo00[i4] = metadata;
                            this.f14448Ooooo0o[i4] = this.f14446OoooOoo.f13640Oooo;
                            this.f14450OooooOO = i3 + 1;
                        }
                    }
                }
            } else if (iOooo00o == -5) {
                Format format = o0000o0oOooOoO.f40508OooO0O0;
                Objects.requireNonNull(format);
                this.f14452Oooooo = format.f13135Ooooo00;
            }
        }
        if (this.f14450OooooOO > 0) {
            long[] jArr = this.f14448Ooooo0o;
            int i5 = this.f14449OooooO0;
            if (jArr[i5] <= j) {
                Metadata metadata2 = this.f14447Ooooo00[i5];
                int i6 = o000OOo0.f36740OooO00o;
                Handler handler = this.f14445OoooOoO;
                if (handler != null) {
                    handler.obtainMessage(0, metadata2).sendToTarget();
                } else {
                    this.f14444OoooOo0.OooOo0o(metadata2);
                }
                Metadata[] metadataArr = this.f14447Ooooo00;
                int i7 = this.f14449OooooO0;
                metadataArr[i7] = null;
                this.f14449OooooO0 = (i7 + 1) % 5;
                this.f14450OooooOO--;
            }
        }
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public final void OooOoOO() {
        Arrays.fill(this.f14447Ooooo00, (Object) null);
        this.f14449OooooO0 = 0;
        this.f14450OooooOO = 0;
        this.f14451OooooOo = null;
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public final void OooOoo(long j, boolean z) {
        Arrays.fill(this.f14447Ooooo00, (Object) null);
        this.f14449OooooO0 = 0;
        this.f14450OooooOO = 0;
        this.f14453Oooooo0 = false;
    }

    public final void Oooo0(Metadata metadata, List<Metadata.Entry> list) {
        int i = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f14442Oooo0o;
            if (i >= entryArr.length) {
                return;
            }
            Format formatOooo0OO = entryArr[i].Oooo0OO();
            if (formatOooo0OO == null || !this.f14443OoooOOo.OooO0OO(formatOooo0OO)) {
                list.add(metadata.f14442Oooo0o[i]);
            } else {
                o0O0o0.OooO00o OooO00o2 = this.f14443OoooOOo.OooO00o(formatOooo0OO);
                byte[] bArrO0000 = metadata.f14442Oooo0o[i].o0000();
                Objects.requireNonNull(bArrO0000);
                this.f14446OoooOoo.clear();
                this.f14446OoooOoo.OooO0oO(bArrO0000.length);
                ByteBuffer byteBuffer = this.f14446OoooOoo.f13642Oooo0oO;
                int i2 = o000OOo0.f36740OooO00o;
                byteBuffer.put(bArrO0000);
                this.f14446OoooOoo.OooO0oo();
                Metadata metadataOooO00o = OooO00o2.OooO00o(this.f14446OoooOoo);
                if (metadataOooO00o != null) {
                    Oooo0(metadataOooO00o, list);
                }
            }
            i++;
        }
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public final void Oooo00O(Format[] formatArr, long j, long j2) {
        this.f14451OooooOo = this.f14443OoooOOo.OooO00o(formatArr[0]);
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
        this.f14444OoooOo0.OooOo0o((Metadata) message.obj);
        return true;
    }
}
