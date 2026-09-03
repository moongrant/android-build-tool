package p658o0oooO0;

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
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import p659o0oooO00.o0000O0O;
import p659o0oooO00.o0000oo;
import p659o0oooO00.o000O00O;
import p659o0oooO00.o000O0Oo;
import p659o0oooO00.o000OO00;
import p659o0oooO00.o00O0000;
import p659o0oooO00.o00O00OO;

/* JADX INFO: loaded from: classes5.dex */
public final class o00O0O00 extends Lambda implements Function0<List<? extends Pair<? extends o0000O0O, ? extends o000OO00>>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ClassLoader f60148OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O00(ClassLoader classLoader) {
        super(0);
        this.f60148OooO0Oo = classLoader;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends Pair<? extends o0000O0O, ? extends o000OO00>> invoke() throws IOException {
        String str;
        Iterator it;
        Pair pair;
        int iLastIndexOf$default;
        o00O0000 o00o0001;
        Pair pair2;
        o000OO00 o000oo01 = o00O0.f60133OooO0OO;
        ClassLoader classLoader = this.f60148OooO0Oo;
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
            o000OO00 o000oo02 = o00O0.f60133OooO0OO;
            Intrinsics.checkNotNullExpressionValue(it3, "it");
            Intrinsics.checkNotNullParameter(it3, "<this>");
            if (Intrinsics.areEqual(it3.getProtocol(), ShareInternalUtility.STAGING_PARAM)) {
                o000O00O o000o00o2 = o0000O0O.f60198OooO00o;
                String str2 = o000OO00.f60221OooO0o0;
                pair2 = TuplesKt.to(o000o00o2, o000OO00.OooO00o.OooO0O0(new File(it3.toURI())));
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
            o000OO00 o000oo03 = o00O0.f60133OooO0OO;
            Intrinsics.checkNotNullExpressionValue(url, str);
            Intrinsics.checkNotNullParameter(url, "<this>");
            String string = url.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString()");
            if (StringsKt.Oooo00o(string, "jar:file:") && (iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default(string, "!", 0, false, 6, (Object) null)) != -1) {
                String str3 = o000OO00.f60221OooO0o0;
                String strSubstring = string.substring(4, iLastIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                o000OO00 zipPath = o000OO00.OooO00o.OooO0O0(new File(URI.create(strSubstring)));
                o000O00O fileSystem = o0000O0O.f60198OooO00o;
                Intrinsics.checkNotNullParameter(zipPath, "zipPath");
                Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
                oo00o predicate = oo00o.f60156OooO0Oo;
                Intrinsics.checkNotNullParameter(predicate, "predicate");
                o0000oo o0000ooVarOooOO0 = fileSystem.OooOO0(zipPath);
                try {
                    long size = o0000ooVarOooOO0.size() - ((long) 22);
                    if (size < 0) {
                        throw new IOException("not a zip: size=" + o0000ooVarOooOO0.size());
                    }
                    long jMax = Math.max(size - 65536, 0L);
                    while (true) {
                        o00O0000 o00o0000OooO0O0 = o000O0Oo.OooO0O0(o0000ooVarOooOO0.OooOOo0(size));
                        try {
                            if (o00o0000OooO0O0.o0000Ooo() == 101010256) {
                                int iOooO0oO = o00o0000OooO0O0.OooO0oO() & UShort.MAX_VALUE;
                                int iOooO0oO2 = o00o0000OooO0O0.OooO0oO() & UShort.MAX_VALUE;
                                it = it4;
                                long jOooO0oO = o00o0000OooO0O0.OooO0oO() & UShort.MAX_VALUE;
                                if (jOooO0oO != (o00o0000OooO0O0.OooO0oO() & UShort.MAX_VALUE) || iOooO0oO != 0 || iOooO0oO2 != 0) {
                                    o00o0001 = o00o0000OooO0O0;
                                    throw new IOException("unsupported zip: spanned");
                                }
                                o00o0001 = o00o0000OooO0O0;
                                try {
                                    o00o0001.skip(4L);
                                    long jO0000Ooo = ((long) o00o0001.o0000Ooo()) & 4294967295L;
                                    int iOooO0oO3 = o00o0001.OooO0oO() & UShort.MAX_VALUE;
                                    o00O00OO o00o00oo2 = new o00O00OO(jOooO0oO, jO0000Ooo, iOooO0oO3);
                                    o00o0001.OooooO0(iOooO0oO3);
                                    o00o0001.close();
                                    long j = size - ((long) 20);
                                    if (j > 0) {
                                        o00O0000 o00o0000OooO0O1 = o000O0Oo.OooO0O0(o0000ooVarOooOO0.OooOOo0(j));
                                        try {
                                            if (o00o0000OooO0O1.o0000Ooo() == 117853008) {
                                                int iO0000Ooo = o00o0000OooO0O1.o0000Ooo();
                                                long jO000oOoO = o00o0000OooO0O1.o000oOoO();
                                                if (o00o0000OooO0O1.o0000Ooo() != 1 || iO0000Ooo != 0) {
                                                    throw new IOException("unsupported zip: spanned");
                                                }
                                                o00O0000 o00o0000OooO0O2 = o000O0Oo.OooO0O0(o0000ooVarOooOO0.OooOOo0(jO000oOoO));
                                                try {
                                                    int iO0000Ooo2 = o00o0000OooO0O2.o0000Ooo();
                                                    if (iO0000Ooo2 != 101075792) {
                                                        throw new IOException("bad zip: expected " + o00O0OO.OooO0O0(101075792) + " but was " + o00O0OO.OooO0O0(iO0000Ooo2));
                                                    }
                                                    o00o0000OooO0O2.skip(12L);
                                                    int iO0000Ooo3 = o00o0000OooO0O2.o0000Ooo();
                                                    int iO0000Ooo4 = o00o0000OooO0O2.o0000Ooo();
                                                    long jO000oOoO2 = o00o0000OooO0O2.o000oOoO();
                                                    if (jO000oOoO2 != o00o0000OooO0O2.o000oOoO() || iO0000Ooo3 != 0 || iO0000Ooo4 != 0) {
                                                        throw new IOException("unsupported zip: spanned");
                                                    }
                                                    o00o0000OooO0O2.skip(8L);
                                                    o00O00OO o00o00oo3 = new o00O00OO(jO000oOoO2, o00o0000OooO0O2.o000oOoO(), iOooO0oO3);
                                                    Unit unit = Unit.INSTANCE;
                                                    CloseableKt.closeFinally(o00o0000OooO0O2, null);
                                                    o00o00oo2 = o00o00oo3;
                                                } catch (Throwable th) {
                                                    try {
                                                        throw th;
                                                    } catch (Throwable th2) {
                                                        CloseableKt.closeFinally(o00o0000OooO0O2, th);
                                                        throw th2;
                                                    }
                                                }
                                                try {
                                                    throw th;
                                                } catch (Throwable th3) {
                                                    CloseableKt.closeFinally(o0000ooVarOooOO0, th);
                                                    throw th3;
                                                }
                                            }
                                            Unit unit2 = Unit.INSTANCE;
                                            CloseableKt.closeFinally(o00o0000OooO0O1, null);
                                        } catch (Throwable th4) {
                                            try {
                                                throw th4;
                                            } catch (Throwable th5) {
                                                CloseableKt.closeFinally(o00o0000OooO0O1, th4);
                                                throw th5;
                                            }
                                        }
                                    }
                                    long j2 = o00o00oo2.f60136OooO0O0;
                                    ArrayList arrayList3 = new ArrayList();
                                    o00O0000 o00o0000OooO0O3 = o000O0Oo.OooO0O0(o0000ooVarOooOO0.OooOOo0(j2));
                                    try {
                                        long j3 = o00o00oo2.f60135OooO00o;
                                        long j4 = 0;
                                        while (j4 < j3) {
                                            o00O0O0 o00o0o0OooO0OO = o00O0OO.OooO0OO(o00o0000OooO0O3);
                                            long j5 = j3;
                                            if (o00o0o0OooO0OO.f60146OooO0oO >= j2) {
                                                throw new IOException("bad zip: local file header offset >= central directory offset");
                                            }
                                            if (((Boolean) predicate.invoke(o00o0o0OooO0OO)).booleanValue()) {
                                                arrayList3.add(o00o0o0OooO0OO);
                                            }
                                            j4++;
                                            j3 = j5;
                                            throw th;
                                        }
                                        Unit unit3 = Unit.INSTANCE;
                                        CloseableKt.closeFinally(o00o0000OooO0O3, null);
                                        o00O00OO o00o00oo4 = new o00O00OO(zipPath, fileSystem, o00O0OO.OooO00o(arrayList3));
                                        CloseableKt.closeFinally(o0000ooVarOooOO0, null);
                                        pair = TuplesKt.to(o00o00oo4, o00O0.f60133OooO0OO);
                                        break;
                                    } catch (Throwable th6) {
                                        try {
                                            throw th6;
                                        } catch (Throwable th7) {
                                            CloseableKt.closeFinally(o00o0000OooO0O3, th6);
                                            throw th7;
                                        }
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                }
                                th = th8;
                            } else {
                                Iterator it5 = it4;
                                o00o0000OooO0O0.close();
                                size--;
                                if (size < jMax) {
                                    throw new IOException("not a zip: end of central directory signature not found");
                                }
                                it4 = it5;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            o00o0001 = o00o0000OooO0O0;
                        }
                        o00o0001.close();
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
