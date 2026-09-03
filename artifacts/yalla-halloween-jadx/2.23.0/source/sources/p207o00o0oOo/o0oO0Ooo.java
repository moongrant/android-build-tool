package p207o00o0oOo;

import java.util.UUID;
import p206o00o0oOO.o00Oo00;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0oO0Ooo implements o00Oo00 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final boolean f39449OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final UUID f39450OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final byte[] f39451OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f39452OooO0OO;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z;
        if ("Amazon".equals(o0O00.f40597OooO0OO)) {
            String str = o0O00.f40598OooO0Oo;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        f39449OooO0Oo = z;
    }

    public o0oO0Ooo(UUID uuid, byte[] bArr, boolean z) {
        this.f39450OooO00o = uuid;
        this.f39451OooO0O0 = bArr;
        this.f39452OooO0OO = z;
    }
}
