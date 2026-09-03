package o000O0;

import android.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000OO implements com.google.common.base.o000OOo {
    @Override // com.google.common.base.o000OOo
    public final Object get() {
        byte[] bArr = new byte[12];
        androidx.media3.exoplayer.analytics.OooO0O0.f7356OooO.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }
}
