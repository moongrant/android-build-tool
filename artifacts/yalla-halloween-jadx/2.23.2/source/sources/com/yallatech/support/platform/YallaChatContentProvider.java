package com.yallatech.support.platform;

import OooO0O0.OooO0OO;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import net.sqlcipher.database.SQLiteDatabase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p609o0oo0OOO.h5;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yallatech/support/platform/YallaChatContentProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class YallaChatContentProvider extends ContentProvider {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ int f32394OooO0Oo = 0;

    @Override // android.content.ContentProvider
    public final int delete(@NotNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final String getType(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final Uri insert(@NotNull Uri uri, @Nullable ContentValues contentValues) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final ParcelFileDescriptor openFile(@NotNull Uri uri, @NotNull String mode) throws FileNotFoundException {
        Pair pair;
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(mode, "mode");
        try {
            String path = uri.getPath();
            Intrinsics.checkNotNull(path);
            Intrinsics.checkNotNullExpressionValue(path, "uri.path!!");
            String strSubstring = path.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
            Object[] array = StringsKt__StringsKt.split$default((CharSequence) strSubstring, new String[]{"/"}, false, 0, 6, (Object) null).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            String str = strArr[0];
            String str2 = strArr[1];
            if ("..".contentEquals(str) || "..".contentEquals(str2)) {
                throw new Exception();
            }
            pair = new Pair(UUID.fromString(str), str2);
            if (pair == null) {
                throw new FileNotFoundException();
            }
            try {
                File fileOooO0O0 = OooO0OO.OooO0O0((UUID) pair.first, (String) pair.second);
                if (fileOooO0O0 != null) {
                    return ParcelFileDescriptor.open(fileOooO0O0, SQLiteDatabase.CREATE_IF_NECESSARY);
                }
                throw new FileNotFoundException();
            } catch (FileNotFoundException e) {
                String msg = Intrinsics.stringPlus("Got unexpected exception:", e);
                Intrinsics.checkNotNullParameter(msg, "msg");
                if (h5.f57416OooO0O0) {
                    Log.e(h5.f57415OooO00o, msg);
                }
                throw e;
            }
        } catch (Exception unused) {
            pair = null;
        }
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final Cursor query(@NotNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(@NotNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }
}
