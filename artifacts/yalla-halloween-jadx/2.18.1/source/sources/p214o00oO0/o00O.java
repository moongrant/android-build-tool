package p214o00oO0;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* JADX INFO: loaded from: classes.dex */
public abstract class o00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f33387OooO00o = new OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO0O0 f33388OooO0O0 = new OooO0O0();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO0OO f33389OooO0OO = new OooO0OO();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO0o f33390OooO0Oo = new OooO0o();

    public class OooO00o extends o00O {
        @Override // p214o00oO0.o00O
        public final boolean OooO00o() {
            return false;
        }

        @Override // p214o00oO0.o00O
        public final boolean OooO0O0() {
            return false;
        }

        @Override // p214o00oO0.o00O
        public final boolean OooO0OO(DataSource dataSource) {
            return false;
        }

        @Override // p214o00oO0.o00O
        public final boolean OooO0Oo(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    public class OooO0O0 extends o00O {
        @Override // p214o00oO0.o00O
        public final boolean OooO00o() {
            return true;
        }

        @Override // p214o00oO0.o00O
        public final boolean OooO0O0() {
            return false;
        }

        @Override // p214o00oO0.o00O
        public final boolean OooO0OO(DataSource dataSource) {
            return (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }

        @Override // p214o00oO0.o00O
        public final boolean OooO0Oo(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    public class OooO0OO extends o00O {
        @Override // p214o00oO0.o00O
        public final boolean OooO00o() {
            return false;
        }

        @Override // p214o00oO0.o00O
        public final boolean OooO0O0() {
            return true;
        }

        @Override // p214o00oO0.o00O
        public final boolean OooO0OO(DataSource dataSource) {
            return false;
        }

        @Override // p214o00oO0.o00O
        public final boolean OooO0Oo(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    public class OooO0o extends o00O {
        @Override // p214o00oO0.o00O
        public final boolean OooO00o() {
            return true;
        }

        @Override // p214o00oO0.o00O
        public final boolean OooO0O0() {
            return true;
        }

        @Override // p214o00oO0.o00O
        public final boolean OooO0OO(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // p214o00oO0.o00O
        public final boolean OooO0Oo(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return ((z && dataSource == DataSource.DATA_DISK_CACHE) || dataSource == DataSource.LOCAL) && encodeStrategy == EncodeStrategy.TRANSFORMED;
        }
    }

    public abstract boolean OooO00o();

    public abstract boolean OooO0O0();

    public abstract boolean OooO0OO(DataSource dataSource);

    public abstract boolean OooO0Oo(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy);
}
