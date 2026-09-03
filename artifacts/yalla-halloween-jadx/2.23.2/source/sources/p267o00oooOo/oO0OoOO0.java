package p267o00oooOo;

import com.google.android.gms.internal.common.zzo;
import com.google.android.gms.internal.common.zzs;
import com.google.android.gms.internal.common.zzx;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oO0OoOO0 implements Iterator {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f40409OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @CheckForNull
    public String f40410OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final CharSequence f40411OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f40413OooO0oO;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f40412OooO0o0 = 2;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f40414OooO0oo = 0;

    public oO0OoOO0(zzx zzxVar, CharSequence charSequence) {
        zzo zzoVar = zzxVar.f14887OooO00o;
        this.f40413OooO0oO = zzxVar.f14888OooO0O0;
        this.f40409OooO = Integer.MAX_VALUE;
        this.f40411OooO0o = charSequence;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final boolean hasNext() {
        int i;
        int i2 = this.f40412OooO0o0;
        if (i2 == 4) {
            throw new IllegalStateException();
        }
        int i3 = i2 - 1;
        String string = null;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0) {
            return true;
        }
        if (i3 != 2) {
            this.f40412OooO0o0 = 4;
            int i4 = this.f40414OooO0oo;
            while (true) {
                int length = this.f40414OooO0oo;
                if (length == -1) {
                    this.f40412OooO0o0 = 3;
                    break;
                }
                oO000O0O oo000o0o = (oO000O0O) this;
                zzo zzoVar = oo000o0o.f40406OooOO0.f40415OooO00o;
                CharSequence charSequence = oo000o0o.f40411OooO0o;
                int length2 = charSequence.length();
                zzs.zzb(length, length2, "index");
                while (true) {
                    if (length >= length2) {
                        length = -1;
                        break;
                    }
                    if (zzoVar.zza(charSequence.charAt(length))) {
                        break;
                    }
                    length++;
                }
                CharSequence charSequence2 = this.f40411OooO0o;
                if (length == -1) {
                    length = charSequence2.length();
                    this.f40414OooO0oo = -1;
                    i = -1;
                } else {
                    i = length + 1;
                    this.f40414OooO0oo = i;
                }
                if (i == i4) {
                    int i5 = i + 1;
                    this.f40414OooO0oo = i5;
                    if (i5 > charSequence2.length()) {
                        this.f40414OooO0oo = -1;
                    }
                } else {
                    if (i4 < length) {
                        charSequence2.charAt(i4);
                    }
                    if (i4 < length) {
                        charSequence2.charAt(length - 1);
                    }
                    if (!this.f40413OooO0oO || i4 != length) {
                        int i6 = this.f40409OooO;
                        if (i6 == 1) {
                            length = charSequence2.length();
                            this.f40414OooO0oo = -1;
                            if (length > i4) {
                                charSequence2.charAt(length - 1);
                            }
                        } else {
                            this.f40409OooO = i6 - 1;
                        }
                        string = charSequence2.subSequence(i4, length).toString();
                        break;
                    }
                    i4 = this.f40414OooO0oo;
                }
            }
            this.f40410OooO0Oo = string;
            if (this.f40412OooO0o0 != 3) {
                this.f40412OooO0o0 = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f40412OooO0o0 = 2;
        String str = this.f40410OooO0Oo;
        this.f40410OooO0Oo = null;
        return str;
    }

    public final void OooO0OO() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        OooO0OO();
        throw null;
    }
}
