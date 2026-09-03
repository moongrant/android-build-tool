package net.sqlcipher;

import p022Oooo00O.OooOO0;

/* JADX INFO: loaded from: classes5.dex */
public class CursorIndexOutOfBoundsException extends IndexOutOfBoundsException {
    public CursorIndexOutOfBoundsException(int i, int i2) {
        super(OooOO0.OooO00o("Index ", i, " requested, with a size of ", i2));
    }

    public CursorIndexOutOfBoundsException(String str) {
        super(str);
    }
}
