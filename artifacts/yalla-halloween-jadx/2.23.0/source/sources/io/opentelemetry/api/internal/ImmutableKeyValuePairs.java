package io.opentelemetry.api.internal;

import androidx.compose.foundation.layout.oo000o;
import io.opentelemetry.compat.BiConsumer;
import java.util.Arrays;
import java.util.Comparator;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes5.dex */
@Immutable
public abstract class ImmutableKeyValuePairs<K, V> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object[] f33038OooO0Oo;

    public ImmutableKeyValuePairs(Object[] objArr) {
        this.f33038OooO0Oo = objArr;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    public static void OooO00o(Object[] objArr, int i, int i2, Object[] objArr2, Comparator<?> comparator) {
        int iCompare;
        if (i2 - i <= 2) {
            return;
        }
        int i3 = ((i2 + i) / 4) * 2;
        OooO00o(objArr2, i, i3, objArr, comparator);
        OooO00o(objArr2, i3, i2, objArr, comparator);
        int i4 = i;
        int i5 = i3;
        while (i < i2) {
            if (i4 >= i3 - 1) {
                objArr2[i] = objArr[i5];
                objArr2[i + 1] = objArr[i5 + 1];
                i5 += 2;
            } else {
                if (i5 < i2 - 1) {
                    Object obj = objArr[i4];
                    Object obj2 = objArr[i5];
                    if (obj == null) {
                        iCompare = obj2 == null ? 0 : -1;
                    } else {
                        iCompare = obj2 == null ? 1 : comparator.compare(obj, obj2);
                    }
                    if (iCompare > 0) {
                        objArr2[i] = objArr[i5];
                        objArr2[i + 1] = objArr[i5 + 1];
                        i5 += 2;
                    }
                }
                objArr2[i] = objArr[i4];
                objArr2[i + 1] = objArr[i4 + 1];
                i4 += 2;
            }
            i += 2;
        }
    }

    public final void OooO0Oo(BiConsumer<? super K, ? super V> biConsumer) {
        int i = 0;
        while (true) {
            Object[] objArr = this.f33038OooO0Oo;
            if (i >= objArr.length) {
                return;
            }
            biConsumer.accept(objArr[i], objArr[i + 1]);
            i += 2;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ImmutableKeyValuePairs) {
            return Arrays.equals(this.f33038OooO0Oo, ((ImmutableKeyValuePairs) obj).f33038OooO0Oo);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f33038OooO0Oo) ^ 1000003;
    }

    public final boolean isEmpty() {
        return this.f33038OooO0Oo.length == 0;
    }

    public final int size() {
        return this.f33038OooO0Oo.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        int i = 0;
        while (true) {
            Object[] objArr = this.f33038OooO0Oo;
            if (i >= objArr.length) {
                break;
            }
            Object obj = objArr[i + 1];
            String strOooO00o = obj instanceof String ? oo000o.OooO00o(new StringBuilder("\""), (String) obj, Typography.quote) : obj.toString();
            sb.append(objArr[i]);
            sb.append("=");
            sb.append(strOooO00o);
            sb.append(", ");
            i += 2;
        }
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ImmutableKeyValuePairs(Comparator comparator, Object[] objArr) {
        if (objArr.length % 2 == 0) {
            if (objArr.length != 0) {
                Object[] objArr2 = new Object[objArr.length];
                System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
                OooO00o(objArr2, 0, objArr.length, objArr, comparator);
                Object obj = null;
                int i = 0;
                for (int i2 = 0; i2 < objArr.length; i2 += 2) {
                    Object obj2 = objArr[i2];
                    Object obj3 = objArr[i2 + 1];
                    if (obj2 != null) {
                        if (obj != null && comparator.compare(obj2, obj) == 0) {
                            i -= 2;
                        }
                        if (obj3 != null) {
                            int i3 = i + 1;
                            objArr[i] = obj2;
                            i = i3 + 1;
                            objArr[i3] = obj3;
                            obj = obj2;
                        }
                    }
                }
                if (objArr.length != i) {
                    Object[] objArr3 = new Object[i];
                    System.arraycopy(objArr, 0, objArr3, 0, i);
                    objArr = objArr3;
                }
            }
            this(objArr);
            return;
        }
        throw new IllegalArgumentException("You must provide an even number of key/value pair arguments.");
    }
}
