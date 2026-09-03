package o0O0000O;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import com.common.support.atd.YS;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 extends o0O00000.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f35048OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f35049OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final String f35050OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final String f35051OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final String f35052OooO0o0;

    public OooOOO0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35048OooO00o = context;
        this.f35049OooO0O0 = "de.robv.android.xposed.XposedBridge";
        this.f35050OooO0OO = "de.robv.android.xposed.installer";
        this.f35051OooO0Oo = "com.saurik.substrate.MS";
        this.f35052OooO0o0 = "com.saurik.substrate";
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fe  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00f6: MOVE (r2 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:59:0x00f6 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // o0O00000.OooO00o
    public final void OooO00o(@NotNull o0O00.OooO00o model) throws Throwable {
        boolean zA;
        boolean z;
        BufferedReader bufferedReader;
        Exception e;
        BufferedReader bufferedReader2;
        boolean z2;
        ?? r6;
        Intrinsics.checkNotNullParameter(model, "model");
        try {
            zA = YS.A();
        } catch (Throwable th) {
            th.printStackTrace();
            zA = OooO0OO(this.f35049OooO0O0) || OooO0O0(this.f35048OooO00o, this.f35050OooO0OO);
        }
        model.f35022OooO0o = zA;
        if (!OooO0OO(this.f35051OooO0Oo) && !OooO0O0(this.f35048OooO00o, this.f35052OooO0o0)) {
            BufferedReader bufferedReader3 = null;
            try {
                try {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    bufferedReader = new BufferedReader(new FileReader("/proc/" + Process.myPid() + "/maps"));
                    try {
                        Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        objectRef.element = "";
                        while (true) {
                            ?? line = bufferedReader.readLine();
                            if (line == 0) {
                                r6 = 0;
                            } else {
                                objectRef.element = line;
                            }
                            if (r6 != 0) {
                                r6 = line;
                                if (StringsKt__StringsJVMKt.endsWith$default((String) objectRef.element, ".so", false, 2, null) || StringsKt__StringsJVMKt.endsWith$default((String) objectRef.element, ".jar", false, 2, null)) {
                                    int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) objectRef.element, ZegoConstants.ZegoVideoDataAuxPublishingStream, 0, false, 6, (Object) null);
                                    String str = (String) objectRef.element;
                                    int i = iLastIndexOf$default + 1;
                                    if (str == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                    }
                                    String strSubstring = str.substring(i);
                                    Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
                                    linkedHashSet.add(strSubstring);
                                }
                            } else {
                                r6 = line;
                                Iterator it = linkedHashSet.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        String str2 = (String) it.next();
                                        if (!StringsKt__StringsKt.contains$default(str2, "com.saurik.substrate", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default(str2, "XposedBridge.jar", false, 2, (Object) null)) {
                                        }
                                        bufferedReader.close();
                                        z2 = true;
                                    } else {
                                        bufferedReader.close();
                                        bufferedReader.close();
                                        z2 = false;
                                    }
                                    z = z2;
                                }
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        e.printStackTrace();
                        if (bufferedReader != null) {
                        }
                        z2 = false;
                        if (z2) {
                        }
                        model.f35024OooO0oO = z;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader3 = bufferedReader2;
                    if (bufferedReader3 != null) {
                        bufferedReader3.close();
                    }
                    throw th;
                }
            } catch (Exception e3) {
                bufferedReader = null;
                e = e3;
            } catch (Throwable th3) {
                th = th3;
                if (bufferedReader3 != null) {
                    bufferedReader3.close();
                }
                throw th;
            }
        }
        model.f35024OooO0oO = z;
    }

    public final boolean OooO0O0(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
        List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(128);
        Intrinsics.checkNotNullExpressionValue(installedApplications, "packageManager.getInstal…ageManager.GET_META_DATA)");
        Iterator<ApplicationInfo> it = installedApplications.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(it.next().packageName, str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean OooO0OO(String str) {
        try {
            throw new Exception("gg");
        } catch (Exception e) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "e.stackTrace");
            int length = stackTrace.length;
            int i = 0;
            while (i < length) {
                StackTraceElement stackTraceElement = stackTrace[i];
                i++;
                String className = stackTraceElement.getClassName();
                Intrinsics.checkNotNullExpressionValue(className, "stackTraceElement.className");
                if (StringsKt__StringsKt.contains$default(className, str, false, 2, (Object) null)) {
                    return true;
                }
            }
            return false;
        }
    }
}
