package p275o0O0000o;

import OooO00o.OooO0OO;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import o0O00000.OooO00o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO extends OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f35056OooO00o;

    public OooOOOO(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35056OooO00o = context;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x019b  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a1 A[LOOP:3: B:93:0x0153->B:104:0x01a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:105:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:107:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:108:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:110:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:113:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:122:0x01f4 A[Catch: all -> 0x0219, Exception -> 0x021b, TryCatch #14 {Exception -> 0x021b, all -> 0x0219, blocks: (B:119:0x01e2, B:120:0x01e7, B:122:0x01f4, B:123:0x01f8, B:125:0x01fe), top: B:201:0x01e2 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x01fe A[Catch: all -> 0x0219, Exception -> 0x021b, TRY_LEAVE, TryCatch #14 {Exception -> 0x021b, all -> 0x0219, blocks: (B:119:0x01e2, B:120:0x01e7, B:122:0x01f4, B:123:0x01f8, B:125:0x01fe), top: B:201:0x01e2 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x023c  */
    /* JADX WARN: Code duplicated, block: B:156:0x025a A[Catch: Exception -> 0x0270, TRY_LEAVE, TryCatch #0 {Exception -> 0x0270, blocks: (B:153:0x023e, B:154:0x0254, B:156:0x025a), top: B:177:0x023e }] */
    /* JADX WARN: Code duplicated, block: B:161:0x026e  */
    /* JADX WARN: Code duplicated, block: B:164:0x0274  */
    /* JADX WARN: Code duplicated, block: B:167:0x0278  */
    /* JADX WARN: Code duplicated, block: B:168:0x027a  */
    /* JADX WARN: Code duplicated, block: B:179:0x0230 A[EXC_TOP_SPLITTER, PHI: r3
      0x0230: PHI (r3v13 java.io.BufferedReader) = (r3v12 java.io.BufferedReader), (r3v16 java.io.BufferedReader) binds: [B:145:0x022e, B:121:0x01f2] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x020e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x01d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x00de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:? A[LOOP:2: B:56:0x00cc->B:207:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x019f A[EDGE_INSN: B:208:0x019f->B:103:0x019f BREAK  A[LOOP:3: B:93:0x0153->B:104:0x01a1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:? A[LOOP:4: B:111:0x01ba->B:211:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:? A[LOOP:5: B:120:0x01e7->B:212:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:? A[LOOP:6: B:123:0x01f8->B:213:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0268 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0084  */
    /* JADX WARN: Code duplicated, block: B:41:0x0093  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bf A[Catch: Exception -> 0x0106, TryCatch #14 {Exception -> 0x0106, blocks: (B:47:0x00b4, B:49:0x00bf, B:56:0x00cc, B:58:0x00d2, B:64:0x00e4), top: B:191:0x00b4 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:55:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d2 A[Catch: Exception -> 0x0106, TryCatch #14 {Exception -> 0x0106, blocks: (B:47:0x00b4, B:49:0x00bf, B:56:0x00cc, B:58:0x00d2, B:64:0x00e4), top: B:191:0x00b4 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e1 A[EDGE_INSN: B:62:0x00e1->B:63:0x00e2 BREAK  A[LOOP:2: B:56:0x00cc->B:207:?]] */
    /* JADX WARN: Code duplicated, block: B:64:0x00e4 A[Catch: Exception -> 0x0106, TRY_LEAVE, TryCatch #14 {Exception -> 0x0106, blocks: (B:47:0x00b4, B:49:0x00bf, B:56:0x00cc, B:58:0x00d2, B:64:0x00e4), top: B:191:0x00b4 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x010a  */
    /* JADX WARN: Code duplicated, block: B:71:0x010e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0117  */
    /* JADX WARN: Code duplicated, block: B:81:0x0128  */
    /* JADX WARN: Code duplicated, block: B:84:0x012d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0146  */
    /* JADX WARN: Code duplicated, block: B:87:0x0148  */
    /* JADX WARN: Code duplicated, block: B:90:0x014c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0151  */
    /* JADX WARN: Code duplicated, block: B:95:0x015d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0169  */
    /* JADX WARN: Code duplicated, block: B:98:0x016b  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r5v7, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v6, types: [T, java.lang.Object, java.lang.String] */
    @Override // o0O00000.OooO00o
    public final void OooO00o(@NotNull o0O00.OooO00o model) throws Throwable {
        ?? virtualPkgList;
        BufferedReader bufferedReader;
        String str;
        String strOooO00o;
        boolean z;
        String str2;
        String str3;
        boolean z2;
        boolean z3;
        String path;
        Iterator it;
        boolean z4;
        BufferedReader bufferedReader2;
        boolean z5;
        boolean z6;
        String packageName;
        Iterator<PackageInfo> it2;
        int i;
        Ref.ObjectRef objectRef;
        ?? it3;
        Iterator it4;
        String str4;
        String strOooO00o2;
        boolean z7;
        String[] strArr;
        boolean z8;
        int length;
        int i2;
        int i3;
        int i4;
        int i5;
        int iLastIndexOf$default;
        int i6;
        String strSubstring;
        int iLastIndexOf$default2;
        int iLastIndexOf$default3;
        String strReplace;
        boolean z9;
        boolean z10;
        int i7;
        char cCharAt;
        Intrinsics.checkNotNullParameter(model, "model");
        OooOOO oooOOO = OooOOO.f35053OooO00o;
        synchronized (OooOOO.f35055OooO0OO) {
            virtualPkgList = OooOOO.f35054OooO0O0;
        }
        Intrinsics.checkNotNullParameter(virtualPkgList, "virtualPkgList");
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/self/maps"));
            try {
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                while (true) {
                    ?? it5 = bufferedReader.readLine();
                    Intrinsics.checkNotNullExpressionValue(it5, "it");
                    objectRef2.element = it5;
                    if (it5 != 0) {
                        Iterator it6 = virtualPkgList.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                str = (String) it6.next();
                                if (StringsKt__StringsKt.contains$default((CharSequence) objectRef2.element, str, false, 2, (Object) null)) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException unused) {
                                    }
                                }
                            }
                            try {
                                bufferedReader.close();
                            } catch (IOException unused2) {
                            }
                            str = "";
                        }
                    } else {
                        bufferedReader.close();
                        str = "";
                    }
                    Objects.requireNonNull(model);
                    Intrinsics.checkNotNullParameter(str, "<set-?>");
                    strOooO00o = o0O000.OooO00o.OooO00o("cat /proc/self/cgroup");
                    if (strOooO00o != null || strOooO00o.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        str2 = null;
                    } else {
                        iLastIndexOf$default2 = StringsKt__StringsKt.lastIndexOf$default(strOooO00o, "uid", 0, false, 6, (Object) null);
                        iLastIndexOf$default3 = StringsKt__StringsKt.lastIndexOf$default(strOooO00o, "/pid", 0, false, 6, (Object) null);
                        if (iLastIndexOf$default2 >= 0) {
                            if (iLastIndexOf$default3 <= 0) {
                                iLastIndexOf$default3 = strOooO00o.length();
                            }
                            Objects.requireNonNull(strOooO00o, "null cannot be cast to non-null type java.lang.String");
                            String strSubstring2 = strOooO00o.substring(iLastIndexOf$default2 + 4, iLastIndexOf$default3);
                            Intrinsics.checkNotNullExpressionValue(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            try {
                                strReplace = new Regex("\n").replace(strSubstring2, "");
                                if (strReplace == null) {
                                    if (strReplace.length() == 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        i7 = 0;
                                        while (true) {
                                            if (i7 < strReplace.length()) {
                                                z9 = true;
                                                break;
                                            } else {
                                                cCharAt = strReplace.charAt(i7);
                                                i7++;
                                                if (!Character.isDigit(cCharAt)) {
                                                }
                                            }
                                        }
                                    }
                                    z9 = false;
                                    break;
                                }
                                z9 = false;
                                break;
                                if (z9) {
                                    Integer numValueOf = Integer.valueOf(strReplace);
                                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                    str2 = String.format("u0_a%d", Arrays.copyOf(new Object[]{Integer.valueOf(numValueOf.intValue() - 10000)}, 1));
                                    Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
                                } else {
                                    str2 = null;
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        } else {
                            str2 = null;
                        }
                    }
                    str3 = str2 != null ? str2 : "";
                    if (TextUtils.isEmpty(str3)) {
                        z2 = false;
                    } else {
                        strOooO00o2 = o0O000.OooO00o.OooO00o("ps");
                        if (strOooO00o2 != null || strOooO00o2.length() == 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (z7) {
                            z2 = false;
                        } else {
                            Object[] array = new Regex("\n").split(strOooO00o2, 0).toArray(new String[0]);
                            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                            strArr = (String[]) array;
                            if (strArr.length == 0) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (z8) {
                                z2 = false;
                            } else {
                                length = strArr.length - 1;
                                if (length >= 0) {
                                    i4 = 0;
                                    i3 = 0;
                                    while (true) {
                                        i5 = i4 + 1;
                                        if (StringsKt__StringsKt.contains$default(strArr[i4], str3, false, 2, (Object) null)) {
                                            iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default(strArr[i4], ZegoConstants.ZegoVideoDataAuxPublishingStream, 0, false, 6, (Object) null);
                                            String str5 = strArr[i4];
                                            if (iLastIndexOf$default <= 0) {
                                                i6 = 0;
                                            } else {
                                                i6 = iLastIndexOf$default + 1;
                                            }
                                            int length2 = strArr[i4].length();
                                            Objects.requireNonNull(str5, "null cannot be cast to non-null type java.lang.String");
                                            strSubstring = str5.substring(i6, length2);
                                            Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                                            if (new File(OooO0OO.OooO00o(new Object[]{strSubstring, Locale.CHINA}, 2, "/data/data/%s", "java.lang.String.format(format, *args)")).exists()) {
                                                i3++;
                                            }
                                        }
                                        if (i5 > length) {
                                            break;
                                        } else {
                                            i4 = i5;
                                        }
                                    }
                                    i2 = 1;
                                } else {
                                    i2 = 1;
                                    i3 = 0;
                                }
                                if (i3 > i2) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            }
                        }
                    }
                    if (z2) {
                        z3 = true;
                    } else {
                        path = this.f35056OooO00o.getFilesDir().getPath();
                        it = virtualPkgList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z4 = false;
                                break;
                            }
                            str4 = (String) it.next();
                            Intrinsics.checkNotNullExpressionValue(path, "path");
                            if (StringsKt__StringsKt.contains$default(path, str4, false, 2, (Object) null)) {
                                z4 = true;
                                break;
                            }
                        }
                        if (z4) {
                            z3 = true;
                        } else {
                            try {
                                bufferedReader2 = new BufferedReader(new FileReader("/proc/self/maps"));
                                try {
                                    objectRef = new Ref.ObjectRef();
                                    while (true) {
                                        it3 = bufferedReader2.readLine();
                                        Intrinsics.checkNotNullExpressionValue(it3, "it");
                                        objectRef.element = it3;
                                        if (it3 != 0) {
                                            it4 = virtualPkgList.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    if (StringsKt__StringsKt.contains$default((CharSequence) objectRef.element, (String) it4.next(), false, 2, (Object) null)) {
                                                        try {
                                                            bufferedReader2.close();
                                                        } catch (IOException e2) {
                                                            e2.printStackTrace();
                                                        }
                                                        z5 = true;
                                                    }
                                                }
                                                try {
                                                    bufferedReader2.close();
                                                } catch (IOException e3) {
                                                    e3.printStackTrace();
                                                }
                                                z5 = false;
                                            }
                                        } else {
                                            bufferedReader2.close();
                                            z5 = false;
                                        }
                                        if (z5) {
                                            z3 = true;
                                        } else {
                                            Context context = this.f35056OooO00o;
                                            try {
                                                packageName = context.getPackageName();
                                                List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
                                                Intrinsics.checkNotNullExpressionValue(installedPackages, "pm.getInstalledPackages(0)");
                                                it2 = installedPackages.iterator();
                                                i = 0;
                                                while (it2.hasNext()) {
                                                    if (Intrinsics.areEqual(packageName, it2.next().packageName)) {
                                                        i++;
                                                    }
                                                }
                                                if (i > 1) {
                                                    z6 = true;
                                                } else {
                                                    z6 = false;
                                                }
                                            } catch (Exception e4) {
                                                e4.printStackTrace();
                                            }
                                            if (z6) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                        }
                                    }
                                } catch (Exception unused3) {
                                    if (bufferedReader2 != null) {
                                    }
                                    z5 = false;
                                    if (z5) {
                                        Context context2 = this.f35056OooO00o;
                                        packageName = context2.getPackageName();
                                        List<PackageInfo> installedPackages2 = context2.getPackageManager().getInstalledPackages(0);
                                        Intrinsics.checkNotNullExpressionValue(installedPackages2, "pm.getInstalledPackages(0)");
                                        it2 = installedPackages2.iterator();
                                        i = 0;
                                        while (it2.hasNext()) {
                                            if (Intrinsics.areEqual(packageName, it2.next().packageName)) {
                                                i++;
                                            }
                                        }
                                        if (i > 1) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        if (z6) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                    } else {
                                        z3 = true;
                                    }
                                    model.f35017OooO = z3;
                                } catch (Throwable th) {
                                    th = th;
                                    Throwable th2 = th;
                                    if (bufferedReader2 == null) {
                                        throw th2;
                                    }
                                    try {
                                        bufferedReader2.close();
                                        throw th2;
                                    } catch (IOException e5) {
                                        e5.printStackTrace();
                                        throw th2;
                                    }
                                }
                            } catch (Exception unused4) {
                                bufferedReader2 = null;
                            } catch (Throwable th3) {
                                th = th3;
                                bufferedReader2 = null;
                            }
                        }
                    }
                    model.f35017OooO = z3;
                }
            } catch (Exception unused5) {
                if (bufferedReader != null) {
                }
                str = "";
                Objects.requireNonNull(model);
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                strOooO00o = o0O000.OooO00o.OooO00o("cat /proc/self/cgroup");
                if (strOooO00o != null) {
                    z = true;
                } else {
                    z = true;
                }
                if (z) {
                    str2 = null;
                } else {
                    iLastIndexOf$default2 = StringsKt__StringsKt.lastIndexOf$default(strOooO00o, "uid", 0, false, 6, (Object) null);
                    iLastIndexOf$default3 = StringsKt__StringsKt.lastIndexOf$default(strOooO00o, "/pid", 0, false, 6, (Object) null);
                    if (iLastIndexOf$default2 >= 0) {
                        if (iLastIndexOf$default3 <= 0) {
                            iLastIndexOf$default3 = strOooO00o.length();
                        }
                        Objects.requireNonNull(strOooO00o, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring3 = strOooO00o.substring(iLastIndexOf$default2 + 4, iLastIndexOf$default3);
                        Intrinsics.checkNotNullExpressionValue(strSubstring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        strReplace = new Regex("\n").replace(strSubstring3, "");
                        if (strReplace == null) {
                            if (strReplace.length() == 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                i7 = 0;
                                while (true) {
                                    if (i7 < strReplace.length()) {
                                        z9 = true;
                                        break;
                                    } else {
                                        cCharAt = strReplace.charAt(i7);
                                        i7++;
                                        if (!Character.isDigit(cCharAt)) {
                                        }
                                    }
                                }
                            }
                            z9 = false;
                            break;
                        }
                        z9 = false;
                        break;
                        if (z9) {
                            Integer numValueOf2 = Integer.valueOf(strReplace);
                            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                            str2 = String.format("u0_a%d", Arrays.copyOf(new Object[]{Integer.valueOf(numValueOf2.intValue() - 10000)}, 1));
                            Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
                        } else {
                            str2 = null;
                        }
                    } else {
                        str2 = null;
                    }
                }
                if (str2 != null) {
                }
                if (TextUtils.isEmpty(str3)) {
                    strOooO00o2 = o0O000.OooO00o.OooO00o("ps");
                    if (strOooO00o2 != null) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    if (z7) {
                        z2 = false;
                    } else {
                        Object[] array2 = new Regex("\n").split(strOooO00o2, 0).toArray(new String[0]);
                        Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
                        strArr = (String[]) array2;
                        if (strArr.length == 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (z8) {
                            length = strArr.length - 1;
                            if (length >= 0) {
                                i4 = 0;
                                i3 = 0;
                                while (true) {
                                    i5 = i4 + 1;
                                    if (StringsKt__StringsKt.contains$default(strArr[i4], str3, false, 2, (Object) null)) {
                                        iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default(strArr[i4], ZegoConstants.ZegoVideoDataAuxPublishingStream, 0, false, 6, (Object) null);
                                        String str6 = strArr[i4];
                                        if (iLastIndexOf$default <= 0) {
                                            i6 = 0;
                                        } else {
                                            i6 = iLastIndexOf$default + 1;
                                        }
                                        int length3 = strArr[i4].length();
                                        Objects.requireNonNull(str6, "null cannot be cast to non-null type java.lang.String");
                                        strSubstring = str6.substring(i6, length3);
                                        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                        StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                                        if (new File(OooO0OO.OooO00o(new Object[]{strSubstring, Locale.CHINA}, 2, "/data/data/%s", "java.lang.String.format(format, *args)")).exists()) {
                                            i3++;
                                        }
                                    }
                                    if (i5 > length) {
                                        break;
                                        break;
                                    }
                                    i4 = i5;
                                }
                                i2 = 1;
                            } else {
                                i2 = 1;
                                i3 = 0;
                            }
                            if (i3 > i2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z2 = false;
                        }
                    }
                } else {
                    z2 = false;
                }
                if (z2) {
                    path = this.f35056OooO00o.getFilesDir().getPath();
                    it = virtualPkgList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z4 = false;
                            break;
                        }
                        str4 = (String) it.next();
                        Intrinsics.checkNotNullExpressionValue(path, "path");
                        if (StringsKt__StringsKt.contains$default(path, str4, false, 2, (Object) null)) {
                            z4 = true;
                            break;
                        }
                    }
                    if (z4) {
                        bufferedReader2 = new BufferedReader(new FileReader("/proc/self/maps"));
                        objectRef = new Ref.ObjectRef();
                        while (true) {
                            it3 = bufferedReader2.readLine();
                            Intrinsics.checkNotNullExpressionValue(it3, "it");
                            objectRef.element = it3;
                            if (it3 != 0) {
                                it4 = virtualPkgList.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        if (StringsKt__StringsKt.contains$default((CharSequence) objectRef.element, (String) it4.next(), false, 2, (Object) null)) {
                                            bufferedReader2.close();
                                            z5 = true;
                                        }
                                    }
                                }
                            } else {
                                bufferedReader2.close();
                                z5 = false;
                            }
                            if (z5) {
                                Context context3 = this.f35056OooO00o;
                                packageName = context3.getPackageName();
                                List<PackageInfo> installedPackages3 = context3.getPackageManager().getInstalledPackages(0);
                                Intrinsics.checkNotNullExpressionValue(installedPackages3, "pm.getInstalledPackages(0)");
                                it2 = installedPackages3.iterator();
                                i = 0;
                                while (it2.hasNext()) {
                                    if (Intrinsics.areEqual(packageName, it2.next().packageName)) {
                                        i++;
                                    }
                                }
                                if (i > 1) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (z6) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            } else {
                                z3 = true;
                            }
                        }
                    } else {
                        z3 = true;
                    }
                } else {
                    z3 = true;
                }
                model.f35017OooO = z3;
            } catch (Throwable th4) {
                th = th4;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused6) {
                    }
                }
                throw th;
            }
        } catch (Exception unused7) {
            bufferedReader = null;
        } catch (Throwable th5) {
            th = th5;
            bufferedReader = null;
        }
    }
}
