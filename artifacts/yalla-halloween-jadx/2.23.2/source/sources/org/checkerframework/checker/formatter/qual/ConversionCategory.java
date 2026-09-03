package org.checkerframework.checker.formatter.qual;

import com.zego.zegoavkit2.ZegoConstants;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.StringJoiner;
import org.checkerframework.dataflow.qual.Pure;
import p665o0oooOO0.e1;

/* JADX INFO: loaded from: classes5.dex */
public enum ConversionCategory {
    GENERAL("bBhHsS", null),
    CHAR("cC", Character.class, Byte.class, Short.class, Integer.class),
    INT("doxX", Byte.class, Short.class, Integer.class, Long.class, BigInteger.class),
    FLOAT("eEfgGaA", Float.class, Double.class, BigDecimal.class),
    TIME("tT", Long.class, Calendar.class, Date.class),
    CHAR_AND_INT(null, Byte.class, Short.class, Integer.class),
    INT_AND_TIME(null, Long.class),
    NULL(null, new Class[0]),
    UNUSED(null, null);

    public final String chars;
    public final Class<?>[] types;

    ConversionCategory(String str, Class... clsArr) {
        this.chars = str;
        if (clsArr == null) {
            this.types = clsArr;
            return;
        }
        ArrayList arrayList = new ArrayList(clsArr.length);
        int length = clsArr.length;
        for (int i = 0; i < length; i++) {
            Class cls = clsArr[i];
            arrayList.add(cls);
            Class cls2 = cls == Byte.class ? Byte.TYPE : cls == Character.class ? Character.TYPE : cls == Short.class ? Short.TYPE : cls == Integer.class ? Integer.TYPE : cls == Long.class ? Long.TYPE : cls == Float.class ? Float.TYPE : cls == Double.class ? Double.TYPE : cls == Boolean.class ? Boolean.TYPE : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
        }
        this.types = (Class[]) arrayList.toArray(new Class[arrayList.size()]);
    }

    @Override // java.lang.Enum
    @Pure
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name());
        sb.append(" conversion category");
        Class<?>[] clsArr = this.types;
        if (clsArr == null || clsArr.length == 0) {
            return sb.toString();
        }
        StringJoiner stringJoinerOooO00o = e1.OooO00o();
        for (Class<?> cls : this.types) {
            stringJoinerOooO00o.add(cls.getSimpleName());
        }
        sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        sb.append(stringJoinerOooO00o);
        return sb.toString();
    }
}
