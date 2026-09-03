package coil.request;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcoil/request/CachePolicy;", "", "", "readEnabled", "Z", "OooO00o", "()Z", "writeEnabled", "OooO0O0", "ENABLED", "READ_ONLY", "WRITE_ONLY", "DISABLED", "coil-base_release"}, k = 1, mv = {1, 5, 1})
public enum CachePolicy {
    ENABLED(true, true),
    READ_ONLY(true, false),
    WRITE_ONLY(false, true),
    DISABLED(false, false);

    private final boolean readEnabled;
    private final boolean writeEnabled;

    CachePolicy(boolean z, boolean z2) {
        this.readEnabled = z;
        this.writeEnabled = z2;
    }

    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final boolean getReadEnabled() {
        return this.readEnabled;
    }

    /* JADX INFO: renamed from: OooO0O0, reason: from getter */
    public final boolean getWriteEnabled() {
        return this.writeEnabled;
    }
}
