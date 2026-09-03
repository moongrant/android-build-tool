package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class OooO0O0<T> implements Iterator<T> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public EnumC0223OooO0O0 f18587OooO0Oo = EnumC0223OooO0O0.NOT_READY;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @CheckForNull
    public String f18588OooO0o0;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f18589OooO00o;

        static {
            int[] iArr = new int[EnumC0223OooO0O0.values().length];
            f18589OooO00o = iArr;
            try {
                iArr[EnumC0223OooO0O0.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18589OooO00o[EnumC0223OooO0O0.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public enum EnumC0223OooO0O0 {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        OooO oooO;
        EnumC0223OooO0O0 enumC0223OooO0O0 = this.f18587OooO0Oo;
        EnumC0223OooO0O0 enumC0223OooO0O1 = EnumC0223OooO0O0.FAILED;
        o0OoOo0.OooOOO0(enumC0223OooO0O0 != enumC0223OooO0O1);
        int i = OooO00o.f18589OooO00o[this.f18587OooO0Oo.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        this.f18587OooO0Oo = enumC0223OooO0O1;
        oo0o0Oo.OooO00o oooO00o = (oo0o0Oo.OooO00o) this;
        int i2 = oooO00o.f18620OooO;
        while (true) {
            int i3 = oooO00o.f18620OooO;
            if (i3 == -1) {
                oooO00o.f18587OooO0Oo = EnumC0223OooO0O0.DONE;
                string = null;
                break;
            }
            int iOooO0O0 = oooO00o.OooO0O0(i3);
            CharSequence charSequence = oooO00o.f18621OooO0o;
            if (iOooO0O0 == -1) {
                iOooO0O0 = charSequence.length();
                oooO00o.f18620OooO = -1;
            } else {
                oooO00o.f18620OooO = oooO00o.OooO00o(iOooO0O0);
            }
            int i4 = oooO00o.f18620OooO;
            if (i4 == i2) {
                int i5 = i4 + 1;
                oooO00o.f18620OooO = i5;
                if (i5 > charSequence.length()) {
                    oooO00o.f18620OooO = -1;
                }
            } else {
                while (true) {
                    oooO = oooO00o.f18622OooO0oO;
                    if (i2 >= iOooO0O0 || !oooO.OooO0OO(charSequence.charAt(i2))) {
                        break;
                    }
                    i2++;
                }
                while (iOooO0O0 > i2) {
                    int i6 = iOooO0O0 - 1;
                    if (!oooO.OooO0OO(charSequence.charAt(i6))) {
                        break;
                    }
                    iOooO0O0 = i6;
                }
                if (!oooO00o.f18623OooO0oo || i2 != iOooO0O0) {
                    int i7 = oooO00o.f18624OooOO0;
                    if (i7 == 1) {
                        iOooO0O0 = charSequence.length();
                        oooO00o.f18620OooO = -1;
                        while (iOooO0O0 > i2) {
                            int i8 = iOooO0O0 - 1;
                            if (!oooO.OooO0OO(charSequence.charAt(i8))) {
                                break;
                            }
                            iOooO0O0 = i8;
                        }
                    } else {
                        oooO00o.f18624OooOO0 = i7 - 1;
                    }
                    string = charSequence.subSequence(i2, iOooO0O0).toString();
                    break;
                }
                i2 = oooO00o.f18620OooO;
            }
        }
        this.f18588OooO0o0 = string;
        if (this.f18587OooO0Oo == EnumC0223OooO0O0.DONE) {
            return false;
        }
        this.f18587OooO0Oo = EnumC0223OooO0O0.READY;
        return true;
    }

    @Override // java.util.Iterator
    @ParametricNullness
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f18587OooO0Oo = EnumC0223OooO0O0.NOT_READY;
        T t = (T) this.f18588OooO0o0;
        this.f18588OooO0o0 = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
