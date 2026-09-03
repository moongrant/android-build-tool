package net.sqlcipher;

import androidx.compose.compiler.plugins.kotlin.lower.OooO0O0;

/* JADX INFO: loaded from: classes5.dex */
public class CursorIndexOutOfBoundsException extends IndexOutOfBoundsException {
    public CursorIndexOutOfBoundsException(int i, int i2) {
        super(OooO0O0.OooO0O0("Index ", i, " requested, with a size of ", i2));
    }

    public CursorIndexOutOfBoundsException(String str) {
        super(str);
    }
}
