package p659o0oooO00;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p658o0oooO0.o00O;

/* JADX INFO: loaded from: classes5.dex */
public final class o000OO00 implements Comparable<o000OO00> {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final String f60221OooO0o0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final ByteString f60222OooO0Oo;

    public static final class OooO00o {
        @JvmStatic
        @JvmName(name = "get")
        @NotNull
        @JvmOverloads
        public static o000OO00 OooO00o(@NotNull String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            ByteString byteString = o00O.f60128OooO00o;
            Intrinsics.checkNotNullParameter(str, "<this>");
            o00000O o00000o = new o00000O();
            o00000o.o00000O(str);
            return o00O.OooO0Oo(o00000o, z);
        }

        public static o000OO00 OooO0O0(File file) {
            String str = o000OO00.f60221OooO0o0;
            Intrinsics.checkNotNullParameter(file, "<this>");
            String string = file.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString()");
            return OooO00o(string, false);
        }
    }

    static {
        new OooO00o();
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        f60221OooO0o0 = separator;
    }

    public o000OO00(@NotNull ByteString bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f60222OooO0Oo = bytes;
    }

    @NotNull
    public final ArrayList OooO00o() {
        ArrayList arrayList = new ArrayList();
        int iOooO00o = o00O.OooO00o(this);
        ByteString byteString = this.f60222OooO0Oo;
        if (iOooO00o == -1) {
            iOooO00o = 0;
        } else if (iOooO00o < byteString.OooO0o0() && byteString.OooOO0(iOooO00o) == ((byte) 92)) {
            iOooO00o++;
        }
        int iOooO0o0 = byteString.OooO0o0();
        int i = iOooO00o;
        while (iOooO00o < iOooO0o0) {
            if (byteString.OooOO0(iOooO00o) == ((byte) 47) || byteString.OooOO0(iOooO00o) == ((byte) 92)) {
                arrayList.add(byteString.OooOOOo(i, iOooO00o));
                i = iOooO00o + 1;
            }
            iOooO00o++;
        }
        if (i < byteString.OooO0o0()) {
            arrayList.add(byteString.OooOOOo(i, byteString.OooO0o0()));
        }
        return arrayList;
    }

    @JvmName(name = "parent")
    @Nullable
    public final o000OO00 OooO0O0() {
        o000OO00 o000oo01;
        ByteString byteString = o00O.f60131OooO0Oo;
        ByteString byteString2 = this.f60222OooO0Oo;
        if (!Intrinsics.areEqual(byteString2, byteString)) {
            ByteString byteString3 = o00O.f60128OooO00o;
            if (!Intrinsics.areEqual(byteString2, byteString3)) {
                ByteString prefix = o00O.f60129OooO0O0;
                if (!Intrinsics.areEqual(byteString2, prefix)) {
                    ByteString suffix = o00O.f60132OooO0o0;
                    byteString2.getClass();
                    Intrinsics.checkNotNullParameter(suffix, "suffix");
                    int iOooO0o0 = byteString2.OooO0o0();
                    byte[] bArr = suffix.data;
                    if (!(byteString2.OooOOO(iOooO0o0 - bArr.length, suffix, bArr.length) && (byteString2.OooO0o0() == 2 || byteString2.OooOOO(byteString2.OooO0o0() + (-3), byteString3, 1) || byteString2.OooOOO(byteString2.OooO0o0() + (-3), prefix, 1)))) {
                        int iOooOO0o = ByteString.OooOO0o(byteString2, byteString3);
                        if (iOooOO0o == -1) {
                            iOooOO0o = ByteString.OooOO0o(byteString2, prefix);
                        }
                        if (iOooOO0o != 2 || OooO0o() == null) {
                            if (iOooOO0o == 1) {
                                Intrinsics.checkNotNullParameter(prefix, "prefix");
                                if (!byteString2.OooOOO(0, prefix, prefix.OooO0o0())) {
                                }
                            }
                            if (iOooOO0o != -1 || OooO0o() == null) {
                                if (iOooOO0o == -1) {
                                    return new o000OO00(byteString);
                                }
                                o000oo01 = iOooOO0o == 0 ? new o000OO00(ByteString.OooOOo0(byteString2, 0, 1, 1)) : new o000OO00(ByteString.OooOOo0(byteString2, 0, iOooOO0o, 1));
                            } else if (byteString2.OooO0o0() != 2) {
                                o000oo01 = new o000OO00(ByteString.OooOOo0(byteString2, 0, 2, 1));
                            }
                            return o000oo01;
                        }
                        if (byteString2.OooO0o0() != 3) {
                            o000oo01 = new o000OO00(ByteString.OooOOo0(byteString2, 0, 3, 1));
                            return o000oo01;
                        }
                    }
                }
            }
        }
        return null;
    }

    @JvmName(name = "resolve")
    @NotNull
    public final o000OO00 OooO0OO(@NotNull String child) {
        Intrinsics.checkNotNullParameter(child, "child");
        o00000O o00000o = new o00000O();
        o00000o.o00000O(child);
        return o00O.OooO0O0(this, o00O.OooO0Oo(o00000o, false), false);
    }

    @NotNull
    public final File OooO0Oo() {
        return new File(toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003c, code lost:
    
        if (('A' <= r1 && r1 < '[') == false) goto L25;
     */
    @JvmName(name = "volumeLetter")
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Character OooO0o() {
        ByteString byteString = o00O.f60128OooO00o;
        ByteString byteString2 = this.f60222OooO0Oo;
        if (ByteString.OooO0oo(byteString2, byteString) == -1 && byteString2.OooO0o0() >= 2) {
            if (byteString2.OooOO0(1) == ((byte) 58)) {
                char cOooOO0 = (char) byteString2.OooOO0(0);
                if (!('a' <= cOooOO0 && cOooOO0 < '{')) {
                }
                return Character.valueOf(cOooOO0);
            }
        }
        return null;
    }

    @IgnoreJRERequirement
    @NotNull
    public final Path OooO0o0() {
        Path path = Paths.get(toString(), new String[0]);
        Intrinsics.checkNotNullExpressionValue(path, "get(toString())");
        return path;
    }

    @Override // java.lang.Comparable
    public final int compareTo(o000OO00 o000oo01) {
        o000OO00 other = o000oo01;
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f60222OooO0Oo.compareTo(other.f60222OooO0Oo);
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof o000OO00) && Intrinsics.areEqual(((o000OO00) obj).f60222OooO0Oo, this.f60222OooO0Oo);
    }

    public final int hashCode() {
        return this.f60222OooO0Oo.hashCode();
    }

    @NotNull
    public final String toString() {
        return this.f60222OooO0Oo.OooOo00();
    }
}
