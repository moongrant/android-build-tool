package androidx.media3.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableList;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p022Oooo00O.o0O00oO0;

/* JADX INFO: loaded from: classes2.dex */
public final class LibraryResult<V> implements androidx.media3.common.OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final String f9186OooO = p080o000OoO.o00.Oooo00o(0);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final String f9187OooOO0 = p080o000OoO.o00.Oooo00o(1);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final String f9188OooOO0O = p080o000OoO.o00.Oooo00o(2);

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final String f9189OooOO0o = p080o000OoO.o00.Oooo00o(3);

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final String f9190OooOOO0 = p080o000OoO.o00.Oooo00o(4);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f9191OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final V f9192OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f9193OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f9194OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final MediaLibraryService.OooO00o f9195OooO0oo;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Code {
    }

    static {
        new o0O00oO0();
    }

    public LibraryResult(int i, long j, @Nullable MediaLibraryService.OooO00o oooO00o, @Nullable V v, int i2) {
        this.f9191OooO0Oo = i;
        this.f9193OooO0o0 = j;
        this.f9195OooO0oo = oooO00o;
        this.f9192OooO0o = v;
        this.f9194OooO0oO = i2;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0079  */
    public static LibraryResult<?> OooO0OO(Bundle bundle, @Nullable Integer num) {
        Object obj;
        Object objOooO0OO;
        int i = bundle.getInt(f9186OooO, 0);
        long j = bundle.getLong(f9187OooOO0, SystemClock.elapsedRealtime());
        Bundle bundle2 = bundle.getBundle(f9188OooOO0O);
        MediaLibraryService.OooO00o oooO00o = bundle2 == null ? null : (MediaLibraryService.OooO00o) MediaLibraryService.OooO00o.f9201OooOO0o.OooO0OO(bundle2);
        int i2 = bundle.getInt(f9190OooOOO0);
        if (i2 != 1) {
            String str = f9189OooOO0o;
            if (i2 != 2) {
                if (i2 == 3) {
                    p080o000OoO.o00Oo0.OooO0Oo(num == null || num.intValue() == 3);
                    IBinder iBinderOooO00o = p063o0000oO.Oooo0.OooO00o(bundle, str);
                    if (iBinderOooO00o != null) {
                        objOooO0OO = p080o000OoO.o00oO0o.OooO00o(androidx.media3.common.OooOOO0.f6482OooOOo0, p069o0000ooO.o000000O.OooO00o(iBinderOooO00o));
                        obj = objOooO0OO;
                    }
                } else if (i2 != 4) {
                    throw new IllegalStateException();
                }
                obj = null;
            } else {
                p080o000OoO.o00Oo0.OooO0Oo(num == null || num.intValue() == 2);
                Bundle bundle3 = bundle.getBundle(str);
                if (bundle3 == null) {
                    obj = null;
                } else {
                    objOooO0OO = androidx.media3.common.OooOOO0.f6482OooOOo0.OooO0OO(bundle3);
                    obj = objOooO0OO;
                }
            }
        } else {
            obj = null;
        }
        return new LibraryResult<>(i, j, oooO00o, obj, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if (r2 != 4) goto L23;
     */
    @Override // androidx.media3.common.OooO0OO
    @UnstableApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f9186OooO, this.f9191OooO0Oo);
        bundle.putLong(f9187OooOO0, this.f9193OooO0o0);
        MediaLibraryService.OooO00o oooO00o = this.f9195OooO0oo;
        if (oooO00o != null) {
            bundle.putBundle(f9188OooOO0O, oooO00o.toBundle());
        }
        String str = f9190OooOOO0;
        int i = this.f9194OooO0oO;
        bundle.putInt(str, i);
        V v = this.f9192OooO0o;
        if (v == null) {
            return bundle;
        }
        if (i != 1) {
            String str2 = f9189OooOO0o;
            if (i == 2) {
                bundle.putBundle(str2, ((androidx.media3.common.OooOOO0) v).toBundle());
            } else if (i == 3) {
                ImmutableList immutableList = (ImmutableList) v;
                ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f18681OooO0o0;
                ImmutableList.OooO00o oooO00o2 = new ImmutableList.OooO00o();
                for (int i2 = 0; i2 < immutableList.size(); i2++) {
                    oooO00o2.OooO0OO(((androidx.media3.common.OooO0OO) immutableList.get(i2)).toBundle());
                }
                p063o0000oO.Oooo0.OooO0O0(bundle, str2, new p069o0000ooO.o000000O(oooO00o2.OooO0oo()));
            }
            return bundle;
        }
        throw new IllegalStateException();
    }
}
