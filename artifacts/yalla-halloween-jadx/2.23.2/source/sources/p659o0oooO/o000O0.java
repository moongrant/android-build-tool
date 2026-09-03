package p659o0oooO;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p662o0oooO0O.o0O;
import p662o0oooO0O.o0O0oo00;
import p662o0oooO0O.o0OO000;
import p662o0oooO0O.o0OOOO00;
import p662o0oooO0O.oO00000;
import p662o0oooO0O.oo0OOoo;
import p662o0oooO0O.ooo0Oo0;

/* JADX INFO: loaded from: classes5.dex */
public final class o000O0 extends o0OO000 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final o0OOOO00 f59631OooO0OO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Lazy f59632OooO0O0;

    public static final class OooO00o {
        public static final boolean OooO00o(o0OOOO00 o0oooo01) {
            o0OOOO00 o0oooo02 = o000O0.f59631OooO0OO;
            o0oooo01.getClass();
            ByteString byteString = o0O0ooO.f59653OooO00o;
            ByteString byteStringOooOOo0 = o0oooo01.f59788OooO0Oo;
            int iOooOO0o = ByteString.OooOO0o(byteStringOooOOo0, byteString);
            if (iOooOO0o == -1) {
                iOooOO0o = ByteString.OooOO0o(byteStringOooOOo0, o0O0ooO.f59654OooO0O0);
            }
            if (iOooOO0o != -1) {
                byteStringOooOOo0 = ByteString.OooOOo0(byteStringOooOOo0, iOooOO0o + 1, 0, 2);
            } else if (o0oooo01.OooO0o() != null && byteStringOooOOo0.OooO0o0() == 2) {
                byteStringOooOOo0 = ByteString.f60193OooO0oO;
            }
            return !StringsKt__StringsJVMKt.endsWith(byteStringOooOOo0.OooOo00(), ".class", true);
        }
    }

    static {
        new OooO00o();
        String str = o0OOOO00.f59787OooO0o0;
        f59631OooO0OO = o0OOOO00.OooO00o.OooO00o("/", false);
    }

    public o000O0(@NotNull ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        this.f59632OooO0O0 = LazyKt.lazy(new o000O0Oo(classLoader));
    }

    public static String OooOOO0(o0OOOO00 child) throws EOFException {
        o0OOOO00 o0oooo00OooO0Oo;
        o0OOOO00 other = f59631OooO0OO;
        other.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        o0OOOO00 o0oooo00OooO0O0 = o0O0ooO.OooO0O0(other, child, true);
        Intrinsics.checkNotNullParameter(other, "other");
        int iOooO00o = o0O0ooO.OooO00o(o0oooo00OooO0O0);
        ByteString byteString = o0oooo00OooO0O0.f59788OooO0Oo;
        o0OOOO00 o0oooo01 = iOooO00o == -1 ? null : new o0OOOO00(byteString.OooOOOo(0, iOooO00o));
        int iOooO00o2 = o0O0ooO.OooO00o(other);
        ByteString byteString2 = other.f59788OooO0Oo;
        if (!Intrinsics.areEqual(o0oooo01, iOooO00o2 != -1 ? new o0OOOO00(byteString2.OooOOOo(0, iOooO00o2)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + o0oooo00OooO0O0 + " and " + other).toString());
        }
        ArrayList arrayListOooO00o = o0oooo00OooO0O0.OooO00o();
        ArrayList arrayListOooO00o2 = other.OooO00o();
        int iMin = Math.min(arrayListOooO00o.size(), arrayListOooO00o2.size());
        int i = 0;
        while (i < iMin && Intrinsics.areEqual(arrayListOooO00o.get(i), arrayListOooO00o2.get(i))) {
            i++;
        }
        if (i == iMin && byteString.OooO0o0() == byteString2.OooO0o0()) {
            String str = o0OOOO00.f59787OooO0o0;
            o0oooo00OooO0Oo = o0OOOO00.OooO00o.OooO00o(".", false);
        } else {
            if (!(arrayListOooO00o2.subList(i, arrayListOooO00o2.size()).indexOf(o0O0ooO.f59657OooO0o0) == -1)) {
                throw new IllegalArgumentException(("Impossible relative path to resolve: " + o0oooo00OooO0O0 + " and " + other).toString());
            }
            oo0OOoo oo0oooo = new oo0OOoo();
            ByteString byteStringOooO0OO = o0O0ooO.OooO0OO(other);
            if (byteStringOooO0OO == null && (byteStringOooO0OO = o0O0ooO.OooO0OO(o0oooo00OooO0O0)) == null) {
                byteStringOooO0OO = o0O0ooO.OooO0o(o0OOOO00.f59787OooO0o0);
            }
            int size = arrayListOooO00o2.size();
            for (int i2 = i; i2 < size; i2++) {
                oo0oooo.o00O0O(o0O0ooO.f59657OooO0o0);
                oo0oooo.o00O0O(byteStringOooO0OO);
            }
            int size2 = arrayListOooO00o.size();
            while (i < size2) {
                oo0oooo.o00O0O((ByteString) arrayListOooO00o.get(i));
                oo0oooo.o00O0O(byteStringOooO0OO);
                i++;
            }
            o0oooo00OooO0Oo = o0O0ooO.OooO0Oo(oo0oooo, false);
        }
        return o0oooo00OooO0Oo.toString();
    }

    @Override // p662o0oooO0O.o0OO000
    @Nullable
    public final o0O OooO(@NotNull o0OOOO00 path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        if (!OooO00o.OooO00o(path)) {
            return null;
        }
        String strOooOOO0 = OooOOO0(path);
        for (Pair pair : (List) this.f59632OooO0O0.getValue()) {
            o0O o0oOooO2 = ((o0OO000) pair.component1()).OooO(((o0OOOO00) pair.component2()).OooO0OO(strOooOOO0));
            if (o0oOooO2 != null) {
                return o0oOooO2;
            }
        }
        return null;
    }

    @Override // p662o0oooO0O.o0OO000
    @NotNull
    public final ooo0Oo0 OooO00o(@NotNull o0OOOO00 file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // p662o0oooO0O.o0OO000
    public final void OooO0O0(@NotNull o0OOOO00 source, @NotNull o0OOOO00 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // p662o0oooO0O.o0OO000
    public final void OooO0OO(@NotNull o0OOOO00 dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // p662o0oooO0O.o0OO000
    public final void OooO0Oo(@NotNull o0OOOO00 path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // p662o0oooO0O.o0OO000
    @NotNull
    public final List<o0OOOO00> OooO0oO(@NotNull o0OOOO00 dir) throws EOFException, FileNotFoundException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        String strOooOOO0 = OooOOO0(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (Pair pair : (List) this.f59632OooO0O0.getValue()) {
            o0OO000 o0oo000 = (o0OO000) pair.component1();
            o0OOOO00 base = (o0OOOO00) pair.component2();
            try {
                List<o0OOOO00> listOooO0oO = o0oo000.OooO0oO(base.OooO0OO(strOooOOO0));
                ArrayList<o0OOOO00> arrayList = new ArrayList();
                for (Object obj : listOooO0oO) {
                    if (OooO00o.OooO00o((o0OOOO00) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.OooO0oo(arrayList));
                for (o0OOOO00 o0oooo01 : arrayList) {
                    Intrinsics.checkNotNullParameter(o0oooo01, "<this>");
                    Intrinsics.checkNotNullParameter(base, "base");
                    arrayList2.add(f59631OooO0OO.OooO0OO(StringsKt__StringsJVMKt.replace$default(StringsKt.removePrefix(o0oooo01.toString(), (CharSequence) base.toString()), '\\', '/', false, 4, (Object) null)));
                }
                CollectionsKt__MutableCollectionsKt.addAll(linkedHashSet, arrayList2);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return CollectionsKt.toList(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + dir);
    }

    @Override // p662o0oooO0O.o0OO000
    @NotNull
    public final o0O0oo00 OooOO0(@NotNull o0OOOO00 file) throws EOFException, FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (!OooO00o.OooO00o(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        String strOooOOO0 = OooOOO0(file);
        for (Pair pair : (List) this.f59632OooO0O0.getValue()) {
            try {
                return ((o0OO000) pair.component1()).OooOO0(((o0OOOO00) pair.component2()).OooO0OO(strOooOOO0));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    @Override // p662o0oooO0O.o0OO000
    @NotNull
    public final ooo0Oo0 OooOO0O(@NotNull o0OOOO00 file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // p662o0oooO0O.o0OO000
    @NotNull
    public final oO00000 OooOO0o(@NotNull o0OOOO00 file) throws EOFException, FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (!OooO00o.OooO00o(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        String strOooOOO0 = OooOOO0(file);
        for (Pair pair : (List) this.f59632OooO0O0.getValue()) {
            try {
                return ((o0OO000) pair.component1()).OooOO0o(((o0OOOO00) pair.component2()).OooO0OO(strOooOOO0));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + file);
    }
}
