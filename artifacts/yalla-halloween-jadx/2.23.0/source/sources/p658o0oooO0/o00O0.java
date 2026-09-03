package p658o0oooO0;

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
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p659o0oooO00.o00000O;
import p659o0oooO00.o0000O0;
import p659o0oooO00.o0000O0O;
import p659o0oooO00.o0000oo;
import p659o0oooO00.o000OO00;
import p659o0oooO00.o00O00;
import p659o0oooO00.o00O000;

/* JADX INFO: loaded from: classes5.dex */
public final class o00O0 extends o0000O0O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final o000OO00 f60133OooO0OO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Lazy f60134OooO0O0;

    public static final class OooO00o {
        public static final boolean OooO00o(o000OO00 o000oo01) {
            o000OO00 o000oo02 = o00O0.f60133OooO0OO;
            o000oo01.getClass();
            ByteString byteString = o00O.f60128OooO00o;
            ByteString byteStringOooOOo0 = o000oo01.f60222OooO0Oo;
            int iOooOO0o = ByteString.OooOO0o(byteStringOooOOo0, byteString);
            if (iOooOO0o == -1) {
                iOooOO0o = ByteString.OooOO0o(byteStringOooOOo0, o00O.f60129OooO0O0);
            }
            if (iOooOO0o != -1) {
                byteStringOooOOo0 = ByteString.OooOOo0(byteStringOooOOo0, iOooOO0o + 1, 0, 2);
            } else if (o000oo01.OooO0o() != null && byteStringOooOOo0.OooO0o0() == 2) {
                byteStringOooOOo0 = ByteString.f60866OooO0oO;
            }
            return !StringsKt__StringsJVMKt.endsWith(byteStringOooOOo0.OooOo00(), ".class", true);
        }
    }

    static {
        new OooO00o();
        String str = o000OO00.f60221OooO0o0;
        f60133OooO0OO = o000OO00.OooO00o.OooO00o("/", false);
    }

    public o00O0(@NotNull ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        this.f60134OooO0O0 = LazyKt.lazy(new o00O0O00(classLoader));
    }

    public static String OooOOO0(o000OO00 child) throws EOFException {
        o000OO00 o000oo00OooO0Oo;
        o000OO00 other = f60133OooO0OO;
        other.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        o000OO00 o000oo00OooO0O0 = o00O.OooO0O0(other, child, true);
        Intrinsics.checkNotNullParameter(other, "other");
        int iOooO00o = o00O.OooO00o(o000oo00OooO0O0);
        ByteString byteString = o000oo00OooO0O0.f60222OooO0Oo;
        o000OO00 o000oo01 = iOooO00o == -1 ? null : new o000OO00(byteString.OooOOOo(0, iOooO00o));
        int iOooO00o2 = o00O.OooO00o(other);
        ByteString byteString2 = other.f60222OooO0Oo;
        if (!Intrinsics.areEqual(o000oo01, iOooO00o2 != -1 ? new o000OO00(byteString2.OooOOOo(0, iOooO00o2)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + o000oo00OooO0O0 + " and " + other).toString());
        }
        ArrayList arrayListOooO00o = o000oo00OooO0O0.OooO00o();
        ArrayList arrayListOooO00o2 = other.OooO00o();
        int iMin = Math.min(arrayListOooO00o.size(), arrayListOooO00o2.size());
        int i = 0;
        while (i < iMin && Intrinsics.areEqual(arrayListOooO00o.get(i), arrayListOooO00o2.get(i))) {
            i++;
        }
        if (i == iMin && byteString.OooO0o0() == byteString2.OooO0o0()) {
            String str = o000OO00.f60221OooO0o0;
            o000oo00OooO0Oo = o000OO00.OooO00o.OooO00o(".", false);
        } else {
            if (!(arrayListOooO00o2.subList(i, arrayListOooO00o2.size()).indexOf(o00O.f60132OooO0o0) == -1)) {
                throw new IllegalArgumentException(("Impossible relative path to resolve: " + o000oo00OooO0O0 + " and " + other).toString());
            }
            o00000O o00000o = new o00000O();
            ByteString byteStringOooO0OO = o00O.OooO0OO(other);
            if (byteStringOooO0OO == null && (byteStringOooO0OO = o00O.OooO0OO(o000oo00OooO0O0)) == null) {
                byteStringOooO0OO = o00O.OooO0o(o000OO00.f60221OooO0o0);
            }
            int size = arrayListOooO00o2.size();
            for (int i2 = i; i2 < size; i2++) {
                o00000o.OoooooO(o00O.f60132OooO0o0);
                o00000o.OoooooO(byteStringOooO0OO);
            }
            int size2 = arrayListOooO00o.size();
            while (i < size2) {
                o00000o.OoooooO((ByteString) arrayListOooO00o.get(i));
                o00000o.OoooooO(byteStringOooO0OO);
                i++;
            }
            o000oo00OooO0Oo = o00O.OooO0Oo(o00000o, false);
        }
        return o000oo00OooO0Oo.toString();
    }

    @Override // p659o0oooO00.o0000O0O
    @Nullable
    public final o0000O0 OooO(@NotNull o000OO00 path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        if (!OooO00o.OooO00o(path)) {
            return null;
        }
        String strOooOOO0 = OooOOO0(path);
        for (Pair pair : (List) this.f60134OooO0O0.getValue()) {
            o0000O0 o0000o0OooO = ((o0000O0O) pair.component1()).OooO(((o000OO00) pair.component2()).OooO0OO(strOooOOO0));
            if (o0000o0OooO != null) {
                return o0000o0OooO;
            }
        }
        return null;
    }

    @Override // p659o0oooO00.o0000O0O
    @NotNull
    public final o00O000 OooO00o(@NotNull o000OO00 file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // p659o0oooO00.o0000O0O
    public final void OooO0O0(@NotNull o000OO00 source, @NotNull o000OO00 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // p659o0oooO00.o0000O0O
    public final void OooO0OO(@NotNull o000OO00 dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // p659o0oooO00.o0000O0O
    public final void OooO0Oo(@NotNull o000OO00 path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // p659o0oooO00.o0000O0O
    @NotNull
    public final List<o000OO00> OooO0oO(@NotNull o000OO00 dir) throws EOFException, FileNotFoundException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        String strOooOOO0 = OooOOO0(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (Pair pair : (List) this.f60134OooO0O0.getValue()) {
            o0000O0O o0000o0o2 = (o0000O0O) pair.component1();
            o000OO00 base = (o000OO00) pair.component2();
            try {
                List<o000OO00> listOooO0oO = o0000o0o2.OooO0oO(base.OooO0OO(strOooOOO0));
                ArrayList<o000OO00> arrayList = new ArrayList();
                for (Object obj : listOooO0oO) {
                    if (OooO00o.OooO00o((o000OO00) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                for (o000OO00 o000oo01 : arrayList) {
                    Intrinsics.checkNotNullParameter(o000oo01, "<this>");
                    Intrinsics.checkNotNullParameter(base, "base");
                    arrayList2.add(f60133OooO0OO.OooO0OO(StringsKt__StringsJVMKt.replace$default(StringsKt.removePrefix(o000oo01.toString(), (CharSequence) base.toString()), '\\', '/', false, 4, (Object) null)));
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

    @Override // p659o0oooO00.o0000O0O
    @NotNull
    public final o0000oo OooOO0(@NotNull o000OO00 file) throws EOFException, FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (!OooO00o.OooO00o(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        String strOooOOO0 = OooOOO0(file);
        for (Pair pair : (List) this.f60134OooO0O0.getValue()) {
            try {
                return ((o0000O0O) pair.component1()).OooOO0(((o000OO00) pair.component2()).OooO0OO(strOooOOO0));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    @Override // p659o0oooO00.o0000O0O
    @NotNull
    public final o00O000 OooOO0O(@NotNull o000OO00 file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // p659o0oooO00.o0000O0O
    @NotNull
    public final o00O00 OooOO0o(@NotNull o000OO00 file) throws EOFException, FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (!OooO00o.OooO00o(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        String strOooOOO0 = OooOOO0(file);
        for (Pair pair : (List) this.f60134OooO0O0.getValue()) {
            try {
                return ((o0000O0O) pair.component1()).OooOO0o(((o000OO00) pair.component2()).OooO0OO(strOooOOO0));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + file);
    }
}
