package p294o0O0OoOo;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000O implements o00000OO {
    /* JADX WARN: Code duplicated, block: B:23:0x0054  */
    @Override // p294o0O0OoOo.o00000OO
    public final StackTraceElement[] OooO00o(StackTraceElement[] stackTraceElementArr) {
        int i;
        boolean z;
        HashMap map = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i3];
            Integer num = (Integer) map.get(stackTraceElement);
            if (num != null) {
                int iIntValue = num.intValue();
                int i5 = i3 - iIntValue;
                if (i3 + i5 <= stackTraceElementArr.length) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= i5) {
                            z = true;
                            break;
                        }
                        if (!stackTraceElementArr[iIntValue + i6].equals(stackTraceElementArr[i3 + i6])) {
                            z = false;
                            break;
                        }
                        i6++;
                    }
                } else {
                    z = false;
                    break;
                }
                if (z) {
                    int iIntValue2 = i3 - num.intValue();
                    if (i2 < 10) {
                        System.arraycopy(stackTraceElementArr, i3, stackTraceElementArr2, i4, iIntValue2);
                        i4 += iIntValue2;
                        i2++;
                    }
                    i = (iIntValue2 - 1) + i3;
                } else {
                    stackTraceElementArr2[i4] = stackTraceElementArr[i3];
                    i4++;
                    i2 = 1;
                    i = i3;
                }
            } else {
                stackTraceElementArr2[i4] = stackTraceElementArr[i3];
                i4++;
                i2 = 1;
                i = i3;
            }
            map.put(stackTraceElement, Integer.valueOf(i3));
            i3 = i + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i4];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i4);
        return i4 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }
}
