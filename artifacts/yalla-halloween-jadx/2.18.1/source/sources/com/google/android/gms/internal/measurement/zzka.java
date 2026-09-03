package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzka;
import com.google.android.gms.internal.measurement.zzke;
import java.io.IOException;
import p334o0OO00o.o00OO0O0;
import p334o0OO00o.o0O0O0o0;

/* JADX INFO: loaded from: classes2.dex */
public class zzka<MessageType extends zzke<MessageType, BuilderType>, BuilderType extends zzka<MessageType, BuilderType>> extends zzim<MessageType, BuilderType> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final zzke f15977Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public zzke f15978Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f15979Oooo0oo = false;

    public zzka(MessageType messagetype) {
        this.f15977Oooo0o = messagetype;
        this.f15978Oooo0oO = (zzke) messagetype.OooOO0(4);
    }

    @Override // com.google.android.gms.internal.measurement.zzim
    public final /* synthetic */ zzim OooO0OO(zzin zzinVar) {
        zzaC((zzke) zzinVar);
        return this;
    }

    public final void OooO0Oo() {
        zzke zzkeVar = (zzke) this.f15978Oooo0oO.OooOO0(4);
        o0O0O0o0.f37391OooO0OO.OooO00o(zzkeVar.getClass()).OooO0oO(zzkeVar, this.f15978Oooo0oO);
        this.f15978Oooo0oO = zzkeVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzim
    /* JADX INFO: renamed from: zzaB, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzka zzau() {
        zzka zzkaVar = (zzka) this.f15977Oooo0o.OooOO0(5);
        zzkaVar.zzaC(zzaG());
        return zzkaVar;
    }

    public final zzka zzaC(zzke zzkeVar) {
        if (this.f15979Oooo0oo) {
            OooO0Oo();
            this.f15979Oooo0oo = false;
        }
        zzke zzkeVar2 = this.f15978Oooo0oO;
        o0O0O0o0.f37391OooO0OO.OooO00o(zzkeVar2.getClass()).OooO0oO(zzkeVar2, zzkeVar);
        return this;
    }

    public final zzka zzaD(byte[] bArr, int i, int i2, zzjq zzjqVar) throws zzko {
        if (this.f15979Oooo0oo) {
            OooO0Oo();
            this.f15979Oooo0oo = false;
        }
        try {
            o0O0O0o0.f37391OooO0OO.OooO00o(this.f15978Oooo0oO.getClass()).OooO0O0(this.f15978Oooo0oO, bArr, 0, i2, new o00OO0O0(zzjqVar));
            return this;
        } catch (zzko e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzko.OooO0Oo();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (r1 != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MessageType zzaE() {
        MessageType messagetype = (MessageType) zzaG();
        byte bByteValue = ((Byte) messagetype.OooOO0(1)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue != 0) {
                boolean zOooO0Oo = o0O0O0o0.f37391OooO0OO.OooO00o(messagetype.getClass()).OooO0Oo(messagetype);
                messagetype.OooOO0(2);
            }
            throw new zzmm(messagetype);
        }
        return messagetype;
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    /* JADX INFO: renamed from: zzaF, reason: merged with bridge method [inline-methods] */
    public MessageType zzaG() {
        if (this.f15979Oooo0oo) {
            return (MessageType) this.f15978Oooo0oO;
        }
        zzke zzkeVar = this.f15978Oooo0oO;
        o0O0O0o0.f37391OooO0OO.OooO00o(zzkeVar.getClass()).OooO00o(zzkeVar);
        this.f15979Oooo0oo = true;
        return (MessageType) this.f15978Oooo0oO;
    }

    @Override // com.google.android.gms.internal.measurement.zzim
    public final /* bridge */ /* synthetic */ zzim zzaw(byte[] bArr, int i, int i2) throws zzko {
        zzaD(bArr, 0, i2, zzjq.f15974OooO0OO);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzim
    public final /* bridge */ /* synthetic */ zzim zzax(byte[] bArr, int i, int i2, zzjq zzjqVar) throws zzko {
        zzaD(bArr, 0, i2, zzjqVar);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final /* synthetic */ zzll zzbO() {
        return this.f15977Oooo0o;
    }
}
