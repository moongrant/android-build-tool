package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzkx;
import com.google.android.gms.internal.measurement.zzlb;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class zzkx<MessageType extends zzlb<MessageType, BuilderType>, BuilderType extends zzkx<MessageType, BuilderType>> extends zzjj<MessageType, BuilderType> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final zzlb f15750OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public zzlb f15751OooO0o0;

    public zzkx(MessageType messagetype) {
        this.f15750OooO0Oo = messagetype;
        if (messagetype.OooOO0O()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f15751OooO0o0 = (zzlb) messagetype.OooOO0o(4);
    }

    public final void OooO0O0() {
        if (this.f15751OooO0o0.OooOO0O()) {
            return;
        }
        zzlb zzlbVar = (zzlb) this.f15750OooO0Oo.OooOO0o(4);
        o0O0oo00.f15553OooO0OO.OooO00o(zzlbVar.getClass()).OooO0o(zzlbVar, this.f15751OooO0o0);
        this.f15751OooO0o0 = zzlbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzjj
    /* JADX INFO: renamed from: zzaA, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzkx zzav() {
        zzkx zzkxVar = (zzkx) this.f15750OooO0Oo.OooOO0o(5);
        zzkxVar.f15751OooO0o0 = zzaF();
        return zzkxVar;
    }

    public final zzkx zzaB(zzlb zzlbVar) {
        zzlb zzlbVar2 = this.f15750OooO0Oo;
        if (!zzlbVar2.equals(zzlbVar)) {
            if (!this.f15751OooO0o0.OooOO0O()) {
                zzlb zzlbVar3 = (zzlb) zzlbVar2.OooOO0o(4);
                o0O0oo00.f15553OooO0OO.OooO00o(zzlbVar3.getClass()).OooO0o(zzlbVar3, this.f15751OooO0o0);
                this.f15751OooO0o0 = zzlbVar3;
            }
            zzlb zzlbVar4 = this.f15751OooO0o0;
            o0O0oo00.f15553OooO0OO.OooO00o(zzlbVar4.getClass()).OooO0o(zzlbVar4, zzlbVar);
        }
        return this;
    }

    public final zzkx zzaC(byte[] bArr, int i, int i2, zzkn zzknVar) throws zzll {
        if (!this.f15751OooO0o0.OooOO0O()) {
            zzlb zzlbVar = (zzlb) this.f15750OooO0Oo.OooOO0o(4);
            o0O0oo00.f15553OooO0OO.OooO00o(zzlbVar.getClass()).OooO0o(zzlbVar, this.f15751OooO0o0);
            this.f15751OooO0o0 = zzlbVar;
        }
        try {
            o0O0oo00.f15553OooO0OO.OooO00o(this.f15751OooO0o0.getClass()).OooO0Oo(this.f15751OooO0o0, bArr, 0, i2, new o00OOOO0(zzknVar));
            return this;
        } catch (zzll e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzll.OooO0Oo();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (r1 != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MessageType zzaD() {
        MessageType messagetype = (MessageType) zzaF();
        byte bByteValue = ((Byte) messagetype.OooOO0o(1)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue != 0) {
                boolean zOooO0oo = o0O0oo00.f15553OooO0OO.OooO00o(messagetype.getClass()).OooO0oo(messagetype);
                messagetype.OooOO0o(2);
            }
            throw new zznj(messagetype);
        }
        return messagetype;
    }

    @Override // com.google.android.gms.internal.measurement.zzmh
    /* JADX INFO: renamed from: zzaE, reason: merged with bridge method [inline-methods] */
    public MessageType zzaF() {
        if (!this.f15751OooO0o0.OooOO0O()) {
            return (MessageType) this.f15751OooO0o0;
        }
        zzlb zzlbVar = this.f15751OooO0o0;
        zzlbVar.getClass();
        o0O0oo00.f15553OooO0OO.OooO00o(zzlbVar.getClass()).OooO00o(zzlbVar);
        zzlbVar.OooO0oo();
        return (MessageType) this.f15751OooO0o0;
    }

    @Override // com.google.android.gms.internal.measurement.zzjj
    public final /* bridge */ /* synthetic */ zzjj zzaw(byte[] bArr, int i, int i2) throws zzll {
        zzaC(bArr, 0, i2, zzkn.f15748OooO0OO);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzjj
    public final /* bridge */ /* synthetic */ zzjj zzax(byte[] bArr, int i, int i2, zzkn zzknVar) throws zzll {
        zzaC(bArr, 0, i2, zzknVar);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final /* bridge */ /* synthetic */ zzmi zzbV() {
        throw null;
    }
}
