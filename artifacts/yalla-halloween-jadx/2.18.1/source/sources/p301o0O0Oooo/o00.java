package p301o0O0Oooo;

import java.util.UUID;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00 implements o000OOo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final boolean f36038OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final UUID f36039OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final byte[] f36040OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f36041OooO0OO;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z;
        if ("Amazon".equals(o000OOo0.f36742OooO0OO)) {
            String str = o000OOo0.f36743OooO0Oo;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        f36038OooO0Oo = z;
    }

    public o00(UUID uuid, byte[] bArr, boolean z) {
        this.f36039OooO00o = uuid;
        this.f36040OooO0O0 = bArr;
        this.f36041OooO0OO = z;
    }
}
