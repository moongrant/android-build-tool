package p659o0oooO;

import android.support.v4.media.OooO00o;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import p022Oooo00O.o00O00OO;
import p662o0oooO0O.o0OOOO00;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes5.dex */
public final class o0O0ooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ByteString f59653OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final ByteString f59654OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final ByteString f59655OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final ByteString f59656OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final ByteString f59657OooO0o0;

    static {
        ByteString byteString = ByteString.f60193OooO0oO;
        f59653OooO00o = ByteString.OooO00o.OooO0OO("/");
        f59654OooO0O0 = ByteString.OooO00o.OooO0OO("\\");
        f59655OooO0OO = ByteString.OooO00o.OooO0OO("/\\");
        f59656OooO0Oo = ByteString.OooO00o.OooO0OO(".");
        f59657OooO0o0 = ByteString.OooO00o.OooO0OO("..");
    }

    public static final int OooO00o(o0OOOO00 o0oooo01) {
        if (o0oooo01.f59788OooO0Oo.OooO0o0() == 0) {
            return -1;
        }
        ByteString byteString = o0oooo01.f59788OooO0Oo;
        boolean z = false;
        if (byteString.OooOO0(0) != ((byte) 47)) {
            byte b = (byte) 92;
            if (byteString.OooOO0(0) != b) {
                if (byteString.OooO0o0() <= 2 || byteString.OooOO0(1) != ((byte) 58) || byteString.OooOO0(2) != b) {
                    return -1;
                }
                char cOooOO0 = (char) byteString.OooOO0(0);
                if (!('a' <= cOooOO0 && cOooOO0 < '{')) {
                    if ('A' <= cOooOO0 && cOooOO0 < '[') {
                        z = true;
                    }
                    if (!z) {
                        return -1;
                    }
                }
                return 3;
            }
            if (byteString.OooO0o0() > 2 && byteString.OooOO0(1) == b) {
                ByteString other = f59654OooO0O0;
                Intrinsics.checkNotNullParameter(other, "other");
                int iOooO0oO = byteString.OooO0oO(2, other.data);
                return iOooO0oO == -1 ? byteString.OooO0o0() : iOooO0oO;
            }
        }
        return 1;
    }

    @NotNull
    public static final o0OOOO00 OooO0O0(@NotNull o0OOOO00 o0oooo01, @NotNull o0OOOO00 child, boolean z) {
        Intrinsics.checkNotNullParameter(o0oooo01, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        child.getClass();
        if ((OooO00o(child) != -1) || child.OooO0o() != null) {
            return child;
        }
        ByteString byteStringOooO0OO = OooO0OO(o0oooo01);
        if (byteStringOooO0OO == null && (byteStringOooO0OO = OooO0OO(child)) == null) {
            byteStringOooO0OO = OooO0o(o0OOOO00.f59787OooO0o0);
        }
        oo0OOoo oo0oooo = new oo0OOoo();
        oo0oooo.o00O0O(o0oooo01.f59788OooO0Oo);
        if (oo0oooo.f59828OooO0o0 > 0) {
            oo0oooo.o00O0O(byteStringOooO0OO);
        }
        oo0oooo.o00O0O(child.f59788OooO0Oo);
        return OooO0Oo(oo0oooo, z);
    }

    public static final ByteString OooO0OO(o0OOOO00 o0oooo01) {
        ByteString byteString = o0oooo01.f59788OooO0Oo;
        ByteString byteString2 = f59653OooO00o;
        if (ByteString.OooO0oo(byteString, byteString2) != -1) {
            return byteString2;
        }
        ByteString byteString3 = f59654OooO0O0;
        if (ByteString.OooO0oo(o0oooo01.f59788OooO0Oo, byteString3) != -1) {
            return byteString3;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00a0  */
    @NotNull
    public static final o0OOOO00 OooO0Oo(@NotNull oo0OOoo oo0oooo, boolean z) throws EOFException {
        ByteString byteString;
        boolean z2;
        ByteString byteString2;
        ByteString byteStringOooooo0;
        Intrinsics.checkNotNullParameter(oo0oooo, "<this>");
        oo0OOoo oo0oooo2 = new oo0OOoo();
        ByteString byteStringOooO0o0 = null;
        int i = 0;
        while (true) {
            if (!oo0oooo.Oooo00O(0L, f59653OooO00o)) {
                byteString = f59654OooO0O0;
                if (!oo0oooo.Oooo00O(0L, byteString)) {
                    break;
                }
            }
            byte b = oo0oooo.readByte();
            if (byteStringOooO0o0 == null) {
                byteStringOooO0o0 = OooO0o0(b);
            }
            i++;
        }
        boolean z3 = i >= 2 && Intrinsics.areEqual(byteStringOooO0o0, byteString);
        ByteString byteString3 = f59655OooO0OO;
        if (z3) {
            Intrinsics.checkNotNull(byteStringOooO0o0);
            oo0oooo2.o00O0O(byteStringOooO0o0);
            oo0oooo2.o00O0O(byteStringOooO0o0);
        } else if (i > 0) {
            Intrinsics.checkNotNull(byteStringOooO0o0);
            oo0oooo2.o00O0O(byteStringOooO0o0);
        } else {
            long jOooOoO0 = oo0oooo.OooOoO0(byteString3);
            if (byteStringOooO0o0 == null) {
                byteStringOooO0o0 = jOooOoO0 == -1 ? OooO0o(o0OOOO00.f59787OooO0o0) : OooO0o0(oo0oooo.OooOo(jOooOoO0));
            }
            if (Intrinsics.areEqual(byteStringOooO0o0, byteString) && oo0oooo.f59828OooO0o0 >= 2 && oo0oooo.OooOo(1L) == ((byte) 58)) {
                char cOooOo = (char) oo0oooo.OooOo(0L);
                if (!('a' <= cOooOo && cOooOo < '{')) {
                    if (!('A' <= cOooOo && cOooOo < '[')) {
                        z2 = false;
                    }
                }
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (jOooOoO0 == 2) {
                    oo0oooo2.write(oo0oooo, 3L);
                } else {
                    oo0oooo2.write(oo0oooo, 2L);
                }
            }
        }
        boolean z4 = oo0oooo2.f59828OooO0o0 > 0;
        ArrayList arrayList = new ArrayList();
        while (true) {
            boolean zO00oO0O = oo0oooo.o00oO0O();
            byteString2 = f59656OooO0Oo;
            if (zO00oO0O) {
                break;
            }
            long jOooOoO1 = oo0oooo.OooOoO0(byteString3);
            if (jOooOoO1 == -1) {
                byteStringOooooo0 = oo0oooo.Oooo0o0();
            } else {
                byteStringOooooo0 = oo0oooo.Oooooo0(jOooOoO1);
                oo0oooo.readByte();
            }
            ByteString byteString4 = f59657OooO0o0;
            if (Intrinsics.areEqual(byteStringOooooo0, byteString4)) {
                if (!z4 || !arrayList.isEmpty()) {
                    if (!z || (!z4 && (arrayList.isEmpty() || Intrinsics.areEqual(CollectionsKt.last((List) arrayList), byteString4)))) {
                        arrayList.add(byteStringOooooo0);
                    } else if (!z3 || arrayList.size() != 1) {
                        CollectionsKt__MutableCollectionsKt.removeLastOrNull(arrayList);
                    }
                }
            } else if (!Intrinsics.areEqual(byteStringOooooo0, byteString2) && !Intrinsics.areEqual(byteStringOooooo0, ByteString.f60193OooO0oO)) {
                arrayList.add(byteStringOooooo0);
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                oo0oooo2.o00O0O(byteStringOooO0o0);
            }
            oo0oooo2.o00O0O((ByteString) arrayList.get(i2));
        }
        if (oo0oooo2.f59828OooO0o0 == 0) {
            oo0oooo2.o00O0O(byteString2);
        }
        return new o0OOOO00(oo0oooo2.Oooo0o0());
    }

    public static final ByteString OooO0o(String str) {
        if (Intrinsics.areEqual(str, "/")) {
            return f59653OooO00o;
        }
        if (Intrinsics.areEqual(str, "\\")) {
            return f59654OooO0O0;
        }
        throw new IllegalArgumentException(o00O00OO.OooO00o("not a directory separator: ", str));
    }

    public static final ByteString OooO0o0(byte b) {
        if (b == 47) {
            return f59653OooO00o;
        }
        if (b == 92) {
            return f59654OooO0O0;
        }
        throw new IllegalArgumentException(OooO00o.OooO00o("not a directory separator: ", b));
    }
}
