package com.google.android.gms.internal.measurement;

import OooO00o.OooO00o;
import OooO0o.OooO0OO;
import com.google.android.gms.internal.measurement.zzim;
import com.google.android.gms.internal.measurement.zzin;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import p334o0OO00o.o00OOO0O;
import p334o0OO00o.o0O0O0Oo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzin<MessageType extends zzin<MessageType, BuilderType>, BuilderType extends zzim<MessageType, BuilderType>> implements zzll {
    public int zzb = 0;

    public static void OooO0O0(Iterable iterable, List list) {
        Charset charset = zzkm.f15980OooO00o;
        Objects.requireNonNull(iterable);
        if (iterable instanceof zzkt) {
            List listZzh = ((zzkt) iterable).zzh();
            zzkt zzktVar = (zzkt) list;
            int size = list.size();
            for (Object obj : listZzh) {
                if (obj == null) {
                    int size2 = zzktVar.size();
                    StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Element at index ");
                    sbOooO0o0.append(size2 - size);
                    sbOooO0o0.append(" is null.");
                    String string = sbOooO0o0.toString();
                    int size3 = zzktVar.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            throw new NullPointerException(string);
                        }
                        zzktVar.remove(size3);
                    }
                } else if (obj instanceof zzjd) {
                    zzktVar.zzi((zzjd) obj);
                } else {
                    zzktVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof o0O0O0Oo) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size4 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                int size5 = list.size();
                StringBuilder sbOooO0o1 = OooO00o.OooO0o0("Element at index ");
                sbOooO0o1.append(size5 - size4);
                sbOooO0o1.append(" is null.");
                String string2 = sbOooO0o1.toString();
                int size6 = list.size();
                while (true) {
                    size6--;
                    if (size6 < size4) {
                        throw new NullPointerException(string2);
                    }
                    list.remove(size6);
                }
            } else {
                list.add(obj2);
            }
        }
    }

    public int OooO00o() {
        throw null;
    }

    public void OooO0OO(int i) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final zzjd zzbs() {
        try {
            int iZzbw = zzbw();
            zzjd zzjdVar = zzjd.zzb;
            byte[] bArr = new byte[iZzbw];
            zzjl zzjlVarZzC = zzjl.zzC(bArr);
            zzbK(zzjlVarZzC);
            zzjlVarZzC.zzD();
            return new o00OOO0O(bArr);
        } catch (IOException e) {
            throw new RuntimeException(OooO0OO.OooO00o("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
        }
    }

    public final byte[] zzbv() {
        try {
            byte[] bArr = new byte[zzbw()];
            zzjl zzjlVarZzC = zzjl.zzC(bArr);
            zzbK(zzjlVarZzC);
            zzjlVarZzC.zzD();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(OooO0OO.OooO00o("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
        }
    }
}
