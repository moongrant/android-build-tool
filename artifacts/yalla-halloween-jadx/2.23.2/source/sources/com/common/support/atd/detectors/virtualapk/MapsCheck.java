package com.common.support.atd.detectors.virtualapk;

import android.os.Process;
import com.common.support.atd.YS;
import com.common.support.atd.network.PackageRespModel;
import com.common.support.atd.utils.JsonUtilKt;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007J\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/common/support/atd/detectors/virtualapk/MapsCheck;", "", "()V", "DEFAULT_PKG_STR", "", "check", "virtualPkgList", "", "loadDefaultPkgList", "lib_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MapsCheck {

    @NotNull
    private static final String DEFAULT_PKG_STR = "/lJpl5wSkxILxT4vC2656sScvHIP8ZKOOZCu3tVqZwdbJ2n2Sf2gbI4dp9bTYlLV8+gK24aQspRBBijS7zf6watB5sgD9DB5h0R/BJdonRRg+pZbHSl5lp8wDJeAxUBqYj8zGEsZNYBdWZ5Gp+EO1E5iK6Lw/f8yVoSADL46IjbmzEPfEexXyaxJ2MIKRuJEI93LnByLQw7rp37dwow8bfbJ+ZINfTd/E13wwYo7rqq+oS4l6EjKDVsXJnH9Utpe3SAEQtqU8aFexd84FHUkwe4nMhZTdiK/2sviiVQpABhUlcEXKmtAJ8B83d/GnFJ+F3Jr8RdrMWkF4kCE4t1AiOUraueYiOG+RCX2f3+x1hOC6W4ChKtlWjOwf8dCxEIZaA6l2czTHfybNoQHQflmFZDP8bX5aNRt86+AT4NIP59FbtfNepsAIPy77hQRZ+oRnDUUdhsqP9lp6Hr5ztgpm+vZqYrxnl3EmzEZ82uPJW2ib1SujGD5YwBDKIoKb5EtWMph96Edku0MBq4MJwmNaVfjOQDkT4acOb30bUGdp6qhAwSuqqOd4AjoNr3+hG7q2/VYADjT7PkobnbS+uvXm3bvxBjrbqtw3JaZQLDJ3530WuAp1LWfMQiqfBGyT76YOo2koIP5e/lQEAI1UpM7cjLed0MwVABDEfic+gff+VioCJeKL3ZVGSsntxdT9BXKWB5M5oEKGPlxz2GQ3ks8QNSI6VVqcwg57hy5V7zZ3Jqlj0aHkxncbe73ZwG2OQS7kbTEsY3+1HKbjOeV2pDPcYzp5gYoWMbD3vs/P7CjULUsZEGZBPSHHUW+pY5LdKIybQe1nv/j0rwZ6vcAG6bYj+BbQ3J0tWB41O4ET8un/VzpXJtL5GiF39K7NOdhqfu/uxHFUzOxA0GpcF9x9+3OUKuCd2pOvnD3YfPulRjh0/cMgbb8tZ9BxkTzkLmRhxeaic8No2w6pzKf1xLm+1ioxHWsWDcaOwsu0VX0tDIauiEvTxSEEJg5ft5qj1QcXhzOEmnWH4OMg7Lr0pYgX11F/hyMSeDMWWk6in32A9UzvxU=";

    @NotNull
    public static final MapsCheck INSTANCE = new MapsCheck();

    private MapsCheck() {
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [T, java.lang.Object, java.lang.String] */
    @NotNull
    public final String check(@NotNull List<String> virtualPkgList) throws Throwable {
        Intrinsics.checkNotNullParameter(virtualPkgList, "virtualPkgList");
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader("/proc/" + Process.myPid() + "/maps"));
                try {
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    while (true) {
                        ?? it = bufferedReader2.readLine();
                        Intrinsics.checkNotNullExpressionValue(it, "it");
                        objectRef.element = it;
                        if (it == 0) {
                            bufferedReader2.close();
                            break;
                        }
                        for (String str : virtualPkgList) {
                            if (StringsKt__StringsKt.contains$default((CharSequence) objectRef.element, str, false, 2, (Object) null)) {
                                try {
                                    bufferedReader2.close();
                                } catch (IOException unused) {
                                }
                                return str;
                            }
                        }
                    }
                } catch (Exception unused2) {
                    bufferedReader = bufferedReader2;
                    if (bufferedReader == null) {
                        return "";
                    }
                    bufferedReader.close();
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused4) {
                return "";
            }
        } catch (Exception unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
        return "";
    }

    @Nullable
    public final List<String> loadDefaultPkgList() {
        try {
            Object objOooO0Oo = JsonUtilKt.getGson().OooO0Oo(YS.D(DEFAULT_PKG_STR), new TypeToken<List<? extends PackageRespModel.PackageModel>>() { // from class: com.common.support.atd.detectors.virtualapk.MapsCheck$loadDefaultPkgList$parsedList$1
            }.getType());
            Intrinsics.checkNotNullExpressionValue(objOooO0Oo, "gson.fromJson<List<Packa…Model>>() {}.type\n      )");
            ArrayList arrayList = new ArrayList();
            for (Object obj : (Iterable) objOooO0Oo) {
                if (!StringsKt.isBlank(((PackageRespModel.PackageModel) obj).getPkgName())) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.OooO0oo(arrayList));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((PackageRespModel.PackageModel) it.next()).getPkgName());
            }
            return arrayList2;
        } catch (JsonSyntaxException | JsonParseException unused) {
            return null;
        }
    }
}
