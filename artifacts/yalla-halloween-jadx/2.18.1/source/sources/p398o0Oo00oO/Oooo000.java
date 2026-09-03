package p398o0Oo00oO;

import io.agora.rtc.Constants;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 extends o00Ooo {
    public Oooo000() {
        super(false, 1558, 620, 22, 22, 36, -1, 62);
    }

    @Override // p398o0Oo00oO.o00Ooo
    public final int OooO00o(int i) {
        return i <= 8 ? Constants.ERR_PUBLISH_STREAM_FORMAT_NOT_SUPPORTED : Constants.ERR_PUBLISH_STREAM_NOT_FOUND;
    }

    @Override // p398o0Oo00oO.o00Ooo
    public final int OooO0OO() {
        return 10;
    }
}
