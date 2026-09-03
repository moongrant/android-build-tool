package o0OO00OO;

import io.agora.rtc.Constants;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO extends OooOOO {
    public OooO0OO() {
        super(false, 1558, 620, 22, 22, 36, -1, 62);
    }

    @Override // o0OO00OO.OooOOO
    public final int OooO00o(int i) {
        return i <= 8 ? Constants.ERR_PUBLISH_STREAM_FORMAT_NOT_SUPPORTED : Constants.ERR_PUBLISH_STREAM_NOT_FOUND;
    }

    @Override // o0OO00OO.OooOOO
    public final int OooO0OO() {
        return 10;
    }
}
