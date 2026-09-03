package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public abstract class EntityBuffer<T> extends AbstractDataBuffer<T> {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f15476Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public ArrayList<Integer> f15477Oooo0oo;

    @NonNull
    @KeepForSdk
    public abstract Object OooO00o();

    @NonNull
    @KeepForSdk
    public abstract String OooO0O0();

    public final int OooO0oo(int i) {
        if (i >= 0 && i < this.f15477Oooo0oo.size()) {
            return this.f15477Oooo0oo.get(i).intValue();
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("Position ");
        sb.append(i);
        sb.append(" is out of bounds for this buffer");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void OooOOoo() {
        synchronized (this) {
            if (!this.f15476Oooo0oO) {
                int count = ((DataHolder) Preconditions.checkNotNull(this.f15448Oooo0o)).getCount();
                ArrayList<Integer> arrayList = new ArrayList<>();
                this.f15477Oooo0oo = arrayList;
                if (count > 0) {
                    arrayList.add(0);
                    String strOooO0O0 = OooO0O0();
                    String string = this.f15448Oooo0o.getString(strOooO0O0, 0, this.f15448Oooo0o.getWindowIndex(0));
                    for (int i = 1; i < count; i++) {
                        int windowIndex = this.f15448Oooo0o.getWindowIndex(i);
                        String string2 = this.f15448Oooo0o.getString(strOooO0O0, i, windowIndex);
                        if (string2 == null) {
                            StringBuilder sb = new StringBuilder(String.valueOf(strOooO0O0).length() + 78);
                            sb.append("Missing value for markerColumn: ");
                            sb.append(strOooO0O0);
                            sb.append(", at row: ");
                            sb.append(i);
                            sb.append(", for window: ");
                            sb.append(windowIndex);
                            throw new NullPointerException(sb.toString());
                        }
                        if (!string2.equals(string)) {
                            this.f15477Oooo0oo.add(Integer.valueOf(i));
                            string = string2;
                        }
                    }
                }
                this.f15476Oooo0oO = true;
            }
        }
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @NonNull
    @KeepForSdk
    public final T get(int i) {
        int iIntValue;
        int iIntValue2;
        OooOOoo();
        OooO0oo(i);
        if (i >= 0 && i != this.f15477Oooo0oo.size()) {
            if (i == this.f15477Oooo0oo.size() - 1) {
                iIntValue = ((DataHolder) Preconditions.checkNotNull(this.f15448Oooo0o)).getCount();
                iIntValue2 = this.f15477Oooo0oo.get(i).intValue();
            } else {
                iIntValue = this.f15477Oooo0oo.get(i + 1).intValue();
                iIntValue2 = this.f15477Oooo0oo.get(i).intValue();
            }
            if (iIntValue - iIntValue2 == 1) {
                ((DataHolder) Preconditions.checkNotNull(this.f15448Oooo0o)).getWindowIndex(OooO0oo(i));
            }
        }
        return (T) OooO00o();
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @KeepForSdk
    public int getCount() {
        OooOOoo();
        return this.f15477Oooo0oo.size();
    }
}
