package p658o0oooO0;

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
import p659o0oooO00.o00000O;
import p659o0oooO00.o000OO00;

/* JADX INFO: loaded from: classes5.dex */
public final class o00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ByteString f60128OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final ByteString f60129OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final ByteString f60130OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final ByteString f60131OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final ByteString f60132OooO0o0;

    static {
        ByteString byteString = ByteString.f60866OooO0oO;
        f60128OooO00o = ByteString.OooO00o.OooO0OO("/");
        f60129OooO0O0 = ByteString.OooO00o.OooO0OO("\\");
        f60130OooO0OO = ByteString.OooO00o.OooO0OO("/\\");
        f60131OooO0Oo = ByteString.OooO00o.OooO0OO(".");
        f60132OooO0o0 = ByteString.OooO00o.OooO0OO("..");
    }

    public static final int OooO00o(o000OO00 o000oo01) {
        if (o000oo01.f60222OooO0Oo.OooO0o0() == 0) {
            return -1;
        }
        ByteString byteString = o000oo01.f60222OooO0Oo;
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
                ByteString other = f60129OooO0O0;
                Intrinsics.checkNotNullParameter(other, "other");
                int iOooO0oO = byteString.OooO0oO(2, other.data);
                return iOooO0oO == -1 ? byteString.OooO0o0() : iOooO0oO;
            }
        }
        return 1;
    }

    @NotNull
    public static final o000OO00 OooO0O0(@NotNull o000OO00 o000oo01, @NotNull o000OO00 child, boolean z) {
        Intrinsics.checkNotNullParameter(o000oo01, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        child.getClass();
        if ((OooO00o(child) != -1) || child.OooO0o() != null) {
            return child;
        }
        ByteString byteStringOooO0OO = OooO0OO(o000oo01);
        if (byteStringOooO0OO == null && (byteStringOooO0OO = OooO0OO(child)) == null) {
            byteStringOooO0OO = OooO0o(o000OO00.f60221OooO0o0);
        }
        o00000O o00000o = new o00000O();
        o00000o.OoooooO(o000oo01.f60222OooO0Oo);
        if (o00000o.f60177OooO0o0 > 0) {
            o00000o.OoooooO(byteStringOooO0OO);
        }
        o00000o.OoooooO(child.f60222OooO0Oo);
        return OooO0Oo(o00000o, z);
    }

    public static final ByteString OooO0OO(o000OO00 o000oo01) {
        ByteString byteString = o000oo01.f60222OooO0Oo;
        ByteString byteString2 = f60128OooO00o;
        if (ByteString.OooO0oo(byteString, byteString2) != -1) {
            return byteString2;
        }
        ByteString byteString3 = f60129OooO0O0;
        if (ByteString.OooO0oo(o000oo01.f60222OooO0Oo, byteString3) != -1) {
            return byteString3;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00a0  */
    @NotNull
    public static final o000OO00 OooO0Oo(@NotNull o00000O o00000o, boolean z) throws EOFException {
        ByteString byteString;
        boolean z2;
        ByteString byteString2;
        ByteString byteStringOooooo0;
        Intrinsics.checkNotNullParameter(o00000o, "<this>");
        o00000O o00000o2 = new o00000O();
        ByteString byteStringOooO0o0 = null;
        int i = 0;
        while (true) {
            if (!o00000o.Oooo00O(0L, f60128OooO00o)) {
                byteString = f60129OooO0O0;
                if (!o00000o.Oooo00O(0L, byteString)) {
                    break;
                }
            }
            byte b = o00000o.readByte();
            if (byteStringOooO0o0 == null) {
                byteStringOooO0o0 = OooO0o0(b);
            }
            i++;
        }
        boolean z3 = i >= 2 && Intrinsics.areEqual(byteStringOooO0o0, byteString);
        ByteString byteString3 = f60130OooO0OO;
        if (z3) {
            Intrinsics.checkNotNull(byteStringOooO0o0);
            o00000o2.OoooooO(byteStringOooO0o0);
            o00000o2.OoooooO(byteStringOooO0o0);
        } else if (i > 0) {
            Intrinsics.checkNotNull(byteStringOooO0o0);
            o00000o2.OoooooO(byteStringOooO0o0);
        } else {
            long jOooOoO0 = o00000o.OooOoO0(byteString3);
            if (byteStringOooO0o0 == null) {
                byteStringOooO0o0 = jOooOoO0 == -1 ? OooO0o(o000OO00.f60221OooO0o0) : OooO0o0(o00000o.OooOo(jOooOoO0));
            }
            if (Intrinsics.areEqual(byteStringOooO0o0, byteString) && o00000o.f60177OooO0o0 >= 2 && o00000o.OooOo(1L) == ((byte) 58)) {
                char cOooOo = (char) o00000o.OooOo(0L);
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
                    o00000o2.write(o00000o, 3L);
                } else {
                    o00000o2.write(o00000o, 2L);
                }
            }
        }
        boolean z4 = o00000o2.f60177OooO0o0 > 0;
        ArrayList arrayList = new ArrayList();
        while (true) {
            boolean zOo000o = o00000o.oo000o();
            byteString2 = f60131OooO0Oo;
            if (zOo000o) {
                break;
            }
            long jOooOoO1 = o00000o.OooOoO0(byteString3);
            if (jOooOoO1 == -1) {
                byteStringOooooo0 = o00000o.Oooo0o0();
            } else {
                byteStringOooooo0 = o00000o.Oooooo0(jOooOoO1);
                o00000o.readByte();
            }
            ByteString byteString4 = f60132OooO0o0;
            if (Intrinsics.areEqual(byteStringOooooo0, byteString4)) {
                if (!z4 || !arrayList.isEmpty()) {
                    if (!z || (!z4 && (arrayList.isEmpty() || Intrinsics.areEqual(CollectionsKt.last((List) arrayList), byteString4)))) {
                        arrayList.add(byteStringOooooo0);
                    } else if (!z3 || arrayList.size() != 1) {
                        CollectionsKt__MutableCollectionsKt.removeLastOrNull(arrayList);
                    }
                }
            } else if (!Intrinsics.areEqual(byteStringOooooo0, byteString2) && !Intrinsics.areEqual(byteStringOooooo0, ByteString.f60866OooO0oO)) {
                arrayList.add(byteStringOooooo0);
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                o00000o2.OoooooO(byteStringOooO0o0);
            }
            o00000o2.OoooooO((ByteString) arrayList.get(i2));
        }
        if (o00000o2.f60177OooO0o0 == 0) {
            o00000o2.OoooooO(byteString2);
        }
        return new o000OO00(o00000o2.Oooo0o0());
    }

    public static final ByteString OooO0o(String str) {
        if (Intrinsics.areEqual(str, "/")) {
            return f60128OooO00o;
        }
        if (Intrinsics.areEqual(str, "\\")) {
            return f60129OooO0O0;
        }
        throw new IllegalArgumentException(o00O00OO.OooO00o("not a directory separator: ", str));
    }

    public static final ByteString OooO0o0(byte b) {
        if (b == 47) {
            return f60128OooO00o;
        }
        if (b == 92) {
            return f60129OooO0O0;
        }
        throw new IllegalArgumentException(OooO00o.OooO00o("not a directory separator: ", b));
    }
}
