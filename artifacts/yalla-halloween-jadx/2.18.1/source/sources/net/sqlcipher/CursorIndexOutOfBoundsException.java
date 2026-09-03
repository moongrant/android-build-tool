package net.sqlcipher;

import p100o000oOoO.o00O00OO;

/* JADX INFO: loaded from: classes3.dex */
public class CursorIndexOutOfBoundsException extends IndexOutOfBoundsException {
    public CursorIndexOutOfBoundsException(int i, int i2) {
        super(o00O00OO.OooO00o("Index ", i, " requested, with a size of ", i2));
    }

    public CursorIndexOutOfBoundsException(String str) {
        super(str);
    }
}
