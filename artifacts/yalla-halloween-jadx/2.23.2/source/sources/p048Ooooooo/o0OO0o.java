package p048Ooooooo;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import o000OO.OooOOO0;
import p044OooooOo.o0oOo0O0;
import p045Oooooo.o00O0000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0OO0o implements o00O0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00O0000 f2043OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Range<Integer> f2044OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Range<Integer> f2045OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashSet f2046OooO0Oo;

    public o0OO0o(@Nullable Size size, @NonNull o00O0000 o00o0001) {
        HashSet hashSet = new HashSet();
        this.f2046OooO0Oo = hashSet;
        this.f2043OooO00o = o00o0001;
        int iOooO0Oo = o00o0001.OooO0Oo();
        this.f2044OooO0O0 = Range.create(Integer.valueOf(iOooO0Oo), Integer.valueOf(((int) Math.ceil(4096.0d / ((double) iOooO0Oo))) * iOooO0Oo));
        int iOooO0O0 = o00o0001.OooO0O0();
        this.f2045OooO0OO = Range.create(Integer.valueOf(iOooO0O0), Integer.valueOf(((int) Math.ceil(2160.0d / ((double) iOooO0O0))) * iOooO0O0));
        if (size != null) {
            hashSet.add(size);
        }
        List<String> list = o0oOo0O0.f1810OooO00o;
        hashSet.addAll(o0oOo0O0.f1810OooO00o.contains(Build.MODEL.toLowerCase(Locale.US)) ? Collections.singleton(new Size(1920, 1080)) : Collections.emptySet());
    }

    @Override // p045Oooooo.o00O0000
    @NonNull
    public final Range<Integer> OooO00o(int i) {
        Integer numValueOf = Integer.valueOf(i);
        Range<Integer> range = this.f2045OooO0OO;
        boolean zContains = range.contains(numValueOf);
        o00O0000 o00o0001 = this.f2043OooO00o;
        OooOOO0.OooO0O0(zContains && i % o00o0001.OooO0O0() == 0, "Not supported height: " + i + " which is not in " + range + " or can not be divided by alignment " + o00o0001.OooO0O0());
        return this.f2044OooO0O0;
    }

    @Override // p045Oooooo.o00O0000
    public final int OooO0O0() {
        return this.f2043OooO00o.OooO0O0();
    }

    @Override // p045Oooooo.o00O0000
    public final boolean OooO0OO(int i, int i2) {
        HashSet hashSet = this.f2046OooO0Oo;
        if (!hashSet.isEmpty() && hashSet.contains(new Size(i, i2))) {
            return true;
        }
        if (this.f2044OooO0O0.contains(Integer.valueOf(i)) && this.f2045OooO0OO.contains(Integer.valueOf(i2))) {
            o00O0000 o00o0001 = this.f2043OooO00o;
            if (i % o00o0001.OooO0Oo() == 0 && i2 % o00o0001.OooO0O0() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // p045Oooooo.o00O0000
    public final int OooO0Oo() {
        return this.f2043OooO00o.OooO0Oo();
    }

    @Override // p045Oooooo.o00O0000
    @NonNull
    public final Range<Integer> OooO0o(int i) {
        Integer numValueOf = Integer.valueOf(i);
        Range<Integer> range = this.f2044OooO0O0;
        boolean zContains = range.contains(numValueOf);
        o00O0000 o00o0001 = this.f2043OooO00o;
        OooOOO0.OooO0O0(zContains && i % o00o0001.OooO0Oo() == 0, "Not supported width: " + i + " which is not in " + range + " or can not be divided by alignment " + o00o0001.OooO0Oo());
        return this.f2045OooO0OO;
    }

    @Override // p045Oooooo.o00O0000
    @NonNull
    public final Range<Integer> OooO0o0() {
        return this.f2043OooO00o.OooO0o0();
    }

    @Override // p045Oooooo.o00O0000
    @NonNull
    public final Range<Integer> OooO0oO() {
        return this.f2044OooO0O0;
    }

    @Override // p045Oooooo.o00O0000
    @NonNull
    public final Range<Integer> OooO0oo() {
        return this.f2045OooO0OO;
    }
}
