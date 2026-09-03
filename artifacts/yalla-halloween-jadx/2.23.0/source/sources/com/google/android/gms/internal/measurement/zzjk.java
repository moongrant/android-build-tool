package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjj;
import com.google.android.gms.internal.measurement.zzjk;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzjk<MessageType extends zzjk<MessageType, BuilderType>, BuilderType extends zzjj<MessageType, BuilderType>> implements zzmi {
    protected int zzb = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static void OooO0O0(Iterable iterable, zzli zzliVar) {
        Charset charset = zzlj.f15753OooO00o;
        iterable.getClass();
        if (iterable instanceof zzlq) {
            List listZzh = ((zzlq) iterable).zzh();
            zzlq zzlqVar = (zzlq) zzliVar;
            int size = zzliVar.size();
            for (Object obj : listZzh) {
                if (obj == null) {
                    String strOooO00o = OooO0OO.OooO00o.OooO00o("Element at index ", zzlqVar.size() - size, " is null.");
                    int size2 = zzlqVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new NullPointerException(strOooO00o);
                        }
                        zzlqVar.remove(size2);
                    }
                } else if (obj instanceof zzka) {
                    zzlqVar.zzi((zzka) obj);
                } else {
                    zzlqVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof o0oOo0O0) {
            zzliVar.addAll((Collection) iterable);
            return;
        }
        if ((zzliVar instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) zzliVar).ensureCapacity(((Collection) iterable).size() + zzliVar.size());
        }
        int size3 = zzliVar.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String strOooO00o2 = OooO0OO.OooO00o.OooO00o("Element at index ", zzliVar.size() - size3, " is null.");
                int size4 = zzliVar.size();
                while (true) {
                    size4--;
                    if (size4 < size3) {
                        throw new NullPointerException(strOooO00o2);
                    }
                    zzliVar.remove(size4);
                }
            } else {
                zzliVar.add(obj2);
            }
        }
    }

    public int OooO00o(o0OO000o o0oo000o) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final zzka zzbv() {
        try {
            int iZzbz = zzbz();
            zzka zzkaVar = zzka.zzb;
            byte[] bArr = new byte[iZzbz];
            zzki zzkiVarZzz = zzki.zzz(bArr, 0, iZzbz);
            zzbQ(zzkiVarZzz);
            zzkiVarZzz.zzA();
            return new o0oOOo(bArr);
        } catch (IOException e) {
            throw new RuntimeException(p004OooO0oO.o000oOoO.OooO00o("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
        }
    }

    public final byte[] zzbx() {
        try {
            int iZzbz = zzbz();
            byte[] bArr = new byte[iZzbz];
            zzki zzkiVarZzz = zzki.zzz(bArr, 0, iZzbz);
            zzbQ(zzkiVarZzz);
            zzkiVarZzz.zzA();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(p004OooO0oO.o000oOoO.OooO00o("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
        }
    }
}
