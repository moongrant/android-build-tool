package com.yalla.yalla.download.fs;

import android.content.Context;
import android.util.Log;
import androidx.core.content.ContextCompat;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p063o0000oO.o00Oo0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nDirectoryHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DirectoryHelper.kt\ncom/yalla/yalla/download/fs/DirectoryHelper\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1282#2,2:95\n288#3,2:97\n1#4:99\n*S KotlinDebug\n*F\n+ 1 DirectoryHelper.kt\ncom/yalla/yalla/download/fs/DirectoryHelper\n*L\n38#1:95,2\n89#1:97,2\n*E\n"})
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static OooO0OO f22914OooO00o;

    @NotNull
    public static File OooO00o(@NotNull Context context, @NotNull String dirName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dirName, "dirName");
        File parentDir = context.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(parentDir, "getCacheDir(...)");
        Intrinsics.checkNotNullParameter(parentDir, "parentDir");
        Intrinsics.checkNotNullParameter(dirName, "dirName");
        File file = new File(parentDir, dirName);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Nullable
    public static File OooO0O0(@NotNull Context context, @NotNull String type) {
        File file;
        boolean zAreEqual;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(type, "type");
        Object obj = ContextCompat.f5281OooO00o;
        File[] fileArrOooO0O0 = ContextCompat.OooO0O0.OooO0O0(context, type);
        Intrinsics.checkNotNullExpressionValue(fileArrOooO0O0, "getExternalFilesDirs(...)");
        int length = fileArrOooO0O0.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                file = null;
                break;
            }
            file = fileArrOooO0O0[i];
            try {
                String strOooO00o = o00Oo0.OooO00o(file);
                Intrinsics.checkNotNullExpressionValue(strOooO00o, "getStorageState(...)");
                zAreEqual = Intrinsics.areEqual(strOooO00o, "mounted");
            } catch (Exception unused) {
                zAreEqual = false;
            }
            if (zAreEqual) {
                break;
            }
            i++;
        }
        if (file == null) {
            Log.e("YDirectory", "Can not found available external private path");
        }
        if (file != null && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
