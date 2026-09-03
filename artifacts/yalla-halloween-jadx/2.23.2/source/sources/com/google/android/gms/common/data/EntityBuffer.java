package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public abstract class EntityBuffer<T> extends AbstractDataBuffer<T> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ArrayList<Integer> f14497OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f14498OooO0o0;

    @NonNull
    @KeepForSdk
    public abstract Object OooO00o();

    @NonNull
    @KeepForSdk
    public abstract String OooO0OO();

    public final int OooOOo(int i) {
        if (i >= 0 && i < this.f14497OooO0o.size()) {
            return this.f14497OooO0o.get(i).intValue();
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("Position ");
        sb.append(i);
        sb.append(" is out of bounds for this buffer");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void OooOo00() {
        synchronized (this) {
            if (!this.f14498OooO0o0) {
                int count = ((DataHolder) Preconditions.checkNotNull(this.f14469OooO0Oo)).getCount();
                ArrayList<Integer> arrayList = new ArrayList<>();
                this.f14497OooO0o = arrayList;
                if (count > 0) {
                    arrayList.add(0);
                    String strOooO0OO = OooO0OO();
                    String string = this.f14469OooO0Oo.getString(strOooO0OO, 0, this.f14469OooO0Oo.getWindowIndex(0));
                    for (int i = 1; i < count; i++) {
                        int windowIndex = this.f14469OooO0Oo.getWindowIndex(i);
                        String string2 = this.f14469OooO0Oo.getString(strOooO0OO, i, windowIndex);
                        if (string2 == null) {
                            StringBuilder sb = new StringBuilder(String.valueOf(strOooO0OO).length() + 78);
                            sb.append("Missing value for markerColumn: ");
                            sb.append(strOooO0OO);
                            sb.append(", at row: ");
                            sb.append(i);
                            sb.append(", for window: ");
                            sb.append(windowIndex);
                            throw new NullPointerException(sb.toString());
                        }
                        if (!string2.equals(string)) {
                            this.f14497OooO0o.add(Integer.valueOf(i));
                            string = string2;
                        }
                    }
                }
                this.f14498OooO0o0 = true;
            }
        }
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @NonNull
    @KeepForSdk
    public final T get(int i) {
        int iIntValue;
        int iIntValue2;
        OooOo00();
        OooOOo(i);
        if (i >= 0 && i != this.f14497OooO0o.size()) {
            int size = this.f14497OooO0o.size() - 1;
            DataHolder dataHolder = this.f14469OooO0Oo;
            if (i == size) {
                iIntValue = ((DataHolder) Preconditions.checkNotNull(dataHolder)).getCount();
                iIntValue2 = this.f14497OooO0o.get(i).intValue();
            } else {
                iIntValue = this.f14497OooO0o.get(i + 1).intValue();
                iIntValue2 = this.f14497OooO0o.get(i).intValue();
            }
            if (iIntValue - iIntValue2 == 1) {
                ((DataHolder) Preconditions.checkNotNull(dataHolder)).getWindowIndex(OooOOo(i));
            }
        }
        return (T) OooO00o();
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @KeepForSdk
    public int getCount() {
        OooOo00();
        return this.f14497OooO0o.size();
    }
}
