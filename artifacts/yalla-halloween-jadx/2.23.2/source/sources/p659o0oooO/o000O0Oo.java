package p659o0oooO;

import com.facebook.share.internal.ShareInternalUtility;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.UShort;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import p662o0oooO0O.o0O0oo00;
import p662o0oooO0O.o0OO;
import p662o0oooO0O.o0OO000;
import p662o0oooO0O.o0OO0o00;
import p662o0oooO0O.o0OOOO00;
import p662o0oooO0O.o0o0000;
import p662o0oooO0O.oO0000Oo;

/* JADX INFO: loaded from: classes5.dex */
public final class o000O0Oo extends Lambda implements Function0<List<? extends Pair<? extends o0OO000, ? extends o0OOOO00>>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ClassLoader f59637OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0Oo(ClassLoader classLoader) {
        super(0);
        this.f59637OooO0Oo = classLoader;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends Pair<? extends o0OO000, ? extends o0OOOO00>> invoke() throws IOException {
        String str;
        Iterator it;
        Pair pair;
        int iLastIndexOf$default;
        o0o0000 o0o0000Var;
        Pair pair2;
        o0OOOO00 o0oooo01 = o000O0.f59631OooO0OO;
        ClassLoader classLoader = this.f59637OooO0Oo;
        Intrinsics.checkNotNullParameter(classLoader, "<this>");
        Enumeration<URL> resources = classLoader.getResources("");
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(\"\")");
        ArrayList list = Collections.list(resources);
        Intrinsics.checkNotNullExpressionValue(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (true) {
            str = "it";
            if (!it2.hasNext()) {
                break;
            }
            URL it3 = (URL) it2.next();
            o0OOOO00 o0oooo02 = o000O0.f59631OooO0OO;
            Intrinsics.checkNotNullExpressionValue(it3, "it");
            Intrinsics.checkNotNullParameter(it3, "<this>");
            if (Intrinsics.areEqual(it3.getProtocol(), ShareInternalUtility.STAGING_PARAM)) {
                o0OO0o00 o0oo0o01 = o0OO000.f59771OooO00o;
                String str2 = o0OOOO00.f59787OooO0o0;
                pair2 = TuplesKt.to(o0oo0o01, o0OOOO00.OooO00o.OooO0O0(new File(it3.toURI())));
            } else {
                pair2 = null;
            }
            if (pair2 != null) {
                arrayList.add(pair2);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(\"META-INF/MANIFEST.MF\")");
        ArrayList list2 = Collections.list(resources2);
        Intrinsics.checkNotNullExpressionValue(list2, "list(this)");
        ArrayList arrayList2 = new ArrayList();
        Iterator it4 = list2.iterator();
        while (it4.hasNext()) {
            URL url = (URL) it4.next();
            o0OOOO00 o0oooo03 = o000O0.f59631OooO0OO;
            Intrinsics.checkNotNullExpressionValue(url, str);
            Intrinsics.checkNotNullParameter(url, "<this>");
            String string = url.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString()");
            if (StringsKt__StringsJVMKt.startsWith$default(string, "jar:file:", false, 2, null) && (iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default(string, "!", 0, false, 6, (Object) null)) != -1) {
                String str3 = o0OOOO00.f59787OooO0o0;
                String strSubstring = string.substring(4, iLastIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                o0OOOO00 zipPath = o0OOOO00.OooO00o.OooO0O0(new File(URI.create(strSubstring)));
                o0OO0o00 fileSystem = o0OO000.f59771OooO00o;
                Intrinsics.checkNotNullParameter(zipPath, "zipPath");
                Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
                o000O00O predicate = o000O00O.f59636OooO0Oo;
                Intrinsics.checkNotNullParameter(predicate, "predicate");
                o0O0oo00 o0o0oo00OooOO0 = fileSystem.OooOO0(zipPath);
                try {
                    long size = o0o0oo00OooOO0.size() - ((long) 22);
                    if (size < 0) {
                        throw new IOException("not a zip: size=" + o0o0oo00OooOO0.size());
                    }
                    long jMax = Math.max(size - 65536, 0L);
                    while (true) {
                        o0o0000 o0o0000VarOooO0O0 = o0OO.OooO0O0(o0o0oo00OooOO0.OooOOo(size));
                        try {
                            if (o0o0000VarOooO0O0.o0000Ooo() == 101010256) {
                                int iOooO0oO = o0o0000VarOooO0O0.OooO0oO() & UShort.MAX_VALUE;
                                int iOooO0oO2 = o0o0000VarOooO0O0.OooO0oO() & UShort.MAX_VALUE;
                                it = it4;
                                long jOooO0oO = o0o0000VarOooO0O0.OooO0oO() & UShort.MAX_VALUE;
                                if (jOooO0oO != (o0o0000VarOooO0O0.OooO0oO() & UShort.MAX_VALUE) || iOooO0oO != 0 || iOooO0oO2 != 0) {
                                    o0o0000Var = o0o0000VarOooO0O0;
                                    throw new IOException("unsupported zip: spanned");
                                }
                                o0o0000Var = o0o0000VarOooO0O0;
                                try {
                                    o0o0000Var.skip(4L);
                                    long jO0000Ooo = ((long) o0o0000Var.o0000Ooo()) & 4294967295L;
                                    int iOooO0oO3 = o0o0000Var.OooO0oO() & UShort.MAX_VALUE;
                                    o000Oo0 o000oo1 = new o000Oo0(jOooO0oO, jO0000Ooo, iOooO0oO3);
                                    o0o0000Var.OooooOO(iOooO0oO3);
                                    o0o0000Var.close();
                                    long j = size - ((long) 20);
                                    if (j > 0) {
                                        o0o0000 o0o0000VarOooO0O1 = o0OO.OooO0O0(o0o0oo00OooOO0.OooOOo(j));
                                        try {
                                            if (o0o0000VarOooO0O1.o0000Ooo() == 117853008) {
                                                int iO0000Ooo = o0o0000VarOooO0O1.o0000Ooo();
                                                long jO000oOoO = o0o0000VarOooO0O1.o000oOoO();
                                                if (o0o0000VarOooO0O1.o0000Ooo() != 1 || iO0000Ooo != 0) {
                                                    throw new IOException("unsupported zip: spanned");
                                                }
                                                o0o0000 o0o0000VarOooO0O2 = o0OO.OooO0O0(o0o0oo00OooOO0.OooOOo(jO000oOoO));
                                                try {
                                                    int iO0000Ooo2 = o0o0000VarOooO0O2.o0000Ooo();
                                                    if (iO0000Ooo2 != 101075792) {
                                                        throw new IOException("bad zip: expected " + o000OOo0.OooO0O0(101075792) + " but was " + o000OOo0.OooO0O0(iO0000Ooo2));
                                                    }
                                                    o0o0000VarOooO0O2.skip(12L);
                                                    int iO0000Ooo3 = o0o0000VarOooO0O2.o0000Ooo();
                                                    int iO0000Ooo4 = o0o0000VarOooO0O2.o0000Ooo();
                                                    long jO000oOoO2 = o0o0000VarOooO0O2.o000oOoO();
                                                    if (jO000oOoO2 != o0o0000VarOooO0O2.o000oOoO() || iO0000Ooo3 != 0 || iO0000Ooo4 != 0) {
                                                        throw new IOException("unsupported zip: spanned");
                                                    }
                                                    o0o0000VarOooO0O2.skip(8L);
                                                    o000Oo0 o000oo2 = new o000Oo0(jO000oOoO2, o0o0000VarOooO0O2.o000oOoO(), iOooO0oO3);
                                                    Unit unit = Unit.INSTANCE;
                                                    CloseableKt.closeFinally(o0o0000VarOooO0O2, null);
                                                    o000oo1 = o000oo2;
                                                } catch (Throwable th) {
                                                    try {
                                                        throw th;
                                                    } catch (Throwable th2) {
                                                        CloseableKt.closeFinally(o0o0000VarOooO0O2, th);
                                                        throw th2;
                                                    }
                                                }
                                                try {
                                                    throw th;
                                                } catch (Throwable th3) {
                                                    CloseableKt.closeFinally(o0o0oo00OooOO0, th);
                                                    throw th3;
                                                }
                                            }
                                            Unit unit2 = Unit.INSTANCE;
                                            CloseableKt.closeFinally(o0o0000VarOooO0O1, null);
                                        } catch (Throwable th4) {
                                            try {
                                                throw th4;
                                            } catch (Throwable th5) {
                                                CloseableKt.closeFinally(o0o0000VarOooO0O1, th4);
                                                throw th5;
                                            }
                                        }
                                    }
                                    long j2 = o000oo1.f59651OooO0O0;
                                    ArrayList arrayList3 = new ArrayList();
                                    o0o0000 o0o0000VarOooO0O3 = o0OO.OooO0O0(o0o0oo00OooOO0.OooOOo(j2));
                                    try {
                                        long j3 = o000oo1.f59650OooO00o;
                                        long j4 = 0;
                                        while (j4 < j3) {
                                            o000OO0O o000oo0oOooO0OO = o000OOo0.OooO0OO(o0o0000VarOooO0O3);
                                            long j5 = j3;
                                            if (o000oo0oOooO0OO.f59648OooO0oO >= j2) {
                                                throw new IOException("bad zip: local file header offset >= central directory offset");
                                            }
                                            if (((Boolean) predicate.invoke(o000oo0oOooO0OO)).booleanValue()) {
                                                arrayList3.add(o000oo0oOooO0OO);
                                            }
                                            j4++;
                                            j3 = j5;
                                            throw th;
                                        }
                                        Unit unit3 = Unit.INSTANCE;
                                        CloseableKt.closeFinally(o0o0000VarOooO0O3, null);
                                        oO0000Oo oo0000oo = new oO0000Oo(zipPath, fileSystem, o000OOo0.OooO00o(arrayList3));
                                        CloseableKt.closeFinally(o0o0oo00OooOO0, null);
                                        pair = TuplesKt.to(oo0000oo, o000O0.f59631OooO0OO);
                                        break;
                                    } catch (Throwable th6) {
                                        try {
                                            throw th6;
                                        } catch (Throwable th7) {
                                            CloseableKt.closeFinally(o0o0000VarOooO0O3, th6);
                                            throw th7;
                                        }
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                }
                                th = th8;
                            } else {
                                Iterator it5 = it4;
                                o0o0000VarOooO0O0.close();
                                size--;
                                if (size < jMax) {
                                    throw new IOException("not a zip: end of central directory signature not found");
                                }
                                it4 = it5;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            o0o0000Var = o0o0000VarOooO0O0;
                        }
                        o0o0000Var.close();
                        throw th;
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            it = it4;
            pair = null;
            if (pair != null) {
                arrayList2.add(pair);
            }
            str = str;
            it4 = it;
        }
        return CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2);
    }
}
