package p144o00Oo;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o000O00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0O0 f37588OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO0OO f37589OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO0o f37590OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO f37591OooO0Oo;

    public class OooO extends o000O00O {
        @Override // p144o00Oo.o000O00O
        public final boolean OooO00o() {
            return true;
        }

        @Override // p144o00Oo.o000O00O
        public final boolean OooO0O0() {
            return true;
        }

        @Override // p144o00Oo.o000O00O
        public final boolean OooO0OO(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // p144o00Oo.o000O00O
        public final boolean OooO0Oo(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return ((z && dataSource == DataSource.DATA_DISK_CACHE) || dataSource == DataSource.LOCAL) && encodeStrategy == EncodeStrategy.TRANSFORMED;
        }
    }

    public class OooO00o extends o000O00O {
        @Override // p144o00Oo.o000O00O
        public final boolean OooO00o() {
            return true;
        }

        @Override // p144o00Oo.o000O00O
        public final boolean OooO0O0() {
            return true;
        }

        @Override // p144o00Oo.o000O00O
        public final boolean OooO0OO(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // p144o00Oo.o000O00O
        public final boolean OooO0Oo(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    public class OooO0O0 extends o000O00O {
        @Override // p144o00Oo.o000O00O
        public final boolean OooO00o() {
            return false;
        }

        @Override // p144o00Oo.o000O00O
        public final boolean OooO0O0() {
            return false;
        }

        @Override // p144o00Oo.o000O00O
        public final boolean OooO0OO(DataSource dataSource) {
            return false;
        }

        @Override // p144o00Oo.o000O00O
        public final boolean OooO0Oo(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    public class OooO0OO extends o000O00O {
        @Override // p144o00Oo.o000O00O
        public final boolean OooO00o() {
            return true;
        }

        @Override // p144o00Oo.o000O00O
        public final boolean OooO0O0() {
            return false;
        }

        @Override // p144o00Oo.o000O00O
        public final boolean OooO0OO(DataSource dataSource) {
            return (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }

        @Override // p144o00Oo.o000O00O
        public final boolean OooO0Oo(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    public class OooO0o extends o000O00O {
        @Override // p144o00Oo.o000O00O
        public final boolean OooO00o() {
            return false;
        }

        @Override // p144o00Oo.o000O00O
        public final boolean OooO0O0() {
            return true;
        }

        @Override // p144o00Oo.o000O00O
        public final boolean OooO0OO(DataSource dataSource) {
            return false;
        }

        @Override // p144o00Oo.o000O00O
        public final boolean OooO0Oo(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    static {
        new OooO00o();
        f37588OooO00o = new OooO0O0();
        f37589OooO0O0 = new OooO0OO();
        f37590OooO0OO = new OooO0o();
        f37591OooO0Oo = new OooO();
    }

    public abstract boolean OooO00o();

    public abstract boolean OooO0O0();

    public abstract boolean OooO0OO(DataSource dataSource);

    public abstract boolean OooO0Oo(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy);
}
