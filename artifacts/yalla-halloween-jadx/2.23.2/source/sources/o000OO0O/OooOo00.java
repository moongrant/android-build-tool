package o000OO0O;

import androidx.media3.common.util.UnstableApi;
import java.util.UUID;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooOo00 implements o000O00.OooO0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final boolean f34416OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final UUID f34417OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final byte[] f34418OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f34419OooO0OO;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z;
        if ("Amazon".equals(o00.f34912OooO0OO)) {
            String str = o00.f34913OooO0Oo;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        f34416OooO0Oo = z;
    }

    public OooOo00(UUID uuid, byte[] bArr, boolean z) {
        this.f34417OooO00o = uuid;
        this.f34418OooO0O0 = bArr;
        this.f34419OooO0OO = z;
    }
}
