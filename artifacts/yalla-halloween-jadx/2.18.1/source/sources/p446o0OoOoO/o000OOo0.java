package p446o0OoOoO;

import com.google.android.gms.internal.common.zzo;
import com.google.android.gms.internal.common.zzs;
import com.google.android.gms.internal.common.zzx;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o000OOo0 implements Iterator {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final boolean f40267Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @CheckForNull
    public String f40268Oooo0o;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final CharSequence f40270Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f40271OoooO0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f40269Oooo0oO = 2;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f40272OoooO00 = 0;

    public o000OOo0(zzx zzxVar, CharSequence charSequence) {
        zzo zzoVar = zzxVar.f15875OooO00o;
        this.f40267Oooo = zzxVar.f15876OooO0O0;
        this.f40271OoooO0 = Integer.MAX_VALUE;
        this.f40270Oooo0oo = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2 = this.f40269Oooo0oO;
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
            this.f40269Oooo0oO = 4;
            int i4 = this.f40272OoooO00;
            while (true) {
                int length = this.f40272OoooO00;
                if (length == -1) {
                    this.f40269Oooo0oO = 3;
                    break;
                }
                o000O o000o = (o000O) this;
                zzo zzoVar = (zzo) o000o.f40256OoooO0O.f38845OooO00o;
                CharSequence charSequence = o000o.f40270Oooo0oo;
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
                if (length == -1) {
                    length = this.f40270Oooo0oo.length();
                    this.f40272OoooO00 = -1;
                    i = -1;
                } else {
                    i = length + 1;
                    this.f40272OoooO00 = i;
                }
                if (i == i4) {
                    int i5 = i + 1;
                    this.f40272OoooO00 = i5;
                    if (i5 > this.f40270Oooo0oo.length()) {
                        this.f40272OoooO00 = -1;
                    }
                } else {
                    if (i4 < length) {
                        this.f40270Oooo0oo.charAt(i4);
                    }
                    if (i4 < length) {
                        this.f40270Oooo0oo.charAt(length - 1);
                    }
                    if (!this.f40267Oooo || i4 != length) {
                        int i6 = this.f40271OoooO0;
                        if (i6 == 1) {
                            length = this.f40270Oooo0oo.length();
                            this.f40272OoooO00 = -1;
                            if (length > i4) {
                                this.f40270Oooo0oo.charAt(length - 1);
                            }
                        } else {
                            this.f40271OoooO0 = i6 - 1;
                        }
                        string = this.f40270Oooo0oo.subSequence(i4, length).toString();
                        break;
                    }
                    i4 = this.f40272OoooO00;
                }
            }
            this.f40268Oooo0o = string;
            if (this.f40269Oooo0oO != 3) {
                this.f40269Oooo0oO = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f40269Oooo0oO = 2;
        String str = this.f40268Oooo0o;
        this.f40268Oooo0o = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
