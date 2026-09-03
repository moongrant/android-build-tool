package com.common.support.atd.detectors.virtualapk;

import android.content.ContentValues;
import android.content.Context;
import androidx.annotation.WorkerThread;
import com.common.support.atd.YS;
import com.common.support.atd.base.InitResult;
import com.common.support.atd.network.PackageRespModel;
import com.facebook.appevents.UserDataStore;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringBuilderJVMKt;
import net.sqlcipher.Cursor;
import net.sqlcipher.database.SQLiteDatabase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rJ&\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\bH\u0002J\u001e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¨\u0006\u0014"}, d2 = {"Lcom/common/support/atd/detectors/virtualapk/PackageDBUtil;", "", "()V", "insertPkgListToLocal", "", "context", "Landroid/content/Context;", "pkgList", "", "Lcom/common/support/atd/network/PackageRespModel$PackageModel;", "readLocalPkgList", "", "initResult", "Lcom/common/support/atd/base/InitResult;", "removeEmptyPkg", UserDataStore.DATE_OF_BIRTH, "Lnet/sqlcipher/database/SQLiteDatabase;", "emptyIds", "", "updatePkgListToLocal", "lib_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PackageDBUtil {

    @NotNull
    public static final PackageDBUtil INSTANCE = new PackageDBUtil();

    private PackageDBUtil() {
    }

    public static /* synthetic */ List readLocalPkgList$default(PackageDBUtil packageDBUtil, Context context, InitResult initResult, int i, Object obj) {
        if ((i & 2) != 0) {
            initResult = null;
        }
        return packageDBUtil.readLocalPkgList(context, initResult);
    }

    private final void removeEmptyPkg(Context context, SQLiteDatabase db, List<Integer> emptyIds) {
        db.delete(PackageDBOpenHelper.TABLE_NAME, "id IN " + CollectionsKt___CollectionsKt.joinToString$default(emptyIds, ", ", "(", ")", 0, null, null, 56, null), (String[]) null);
        HashSPUtil.INSTANCE.putHashToLocal(context, "");
    }

    @WorkerThread
    public final void insertPkgListToLocal(@NotNull Context context, @NotNull List<PackageRespModel.PackageModel> pkgList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pkgList, "pkgList");
        if (pkgList.isEmpty()) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = new PackageDBOpenHelper(context).getWritableDatabase(YS.D(PackageDBOpenHelper.DB_PWD));
            try {
                if (writableDatabase != null) {
                    try {
                        writableDatabase.beginTransaction();
                        StringBuilder sb = new StringBuilder();
                        int i = 0;
                        for (Object obj : pkgList) {
                            int i2 = i + 1;
                            if (i < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            PackageRespModel.PackageModel packageModel = (PackageRespModel.PackageModel) obj;
                            if (i % 100 == 0) {
                                StringsKt__StringBuilderJVMKt.clear(sb);
                                sb.append("insert or replace into vap_table(id, name) values (" + packageModel.getPkgId() + ",'" + packageModel.getPkgName() + "')");
                            } else {
                                sb.append(",(" + packageModel.getPkgId() + ",'" + packageModel.getPkgName() + "')");
                            }
                            if (i % 100 == 99 || i == CollectionsKt.getLastIndex(pkgList)) {
                                writableDatabase.execSQL(sb.toString());
                            }
                            i = i2;
                        }
                        writableDatabase.setTransactionSuccessful();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } finally {
                writableDatabase.endTransaction();
                writableDatabase.close();
            }
        } catch (Throwable unused) {
        }
    }

    @NotNull
    public final List<String> readLocalPkgList(@NotNull Context context, @Nullable InitResult initResult) {
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList arrayList = new ArrayList();
        try {
            SQLiteDatabase readableDatabase = new PackageDBOpenHelper(context).getReadableDatabase(YS.D(PackageDBOpenHelper.DB_PWD));
            if (readableDatabase != null) {
                try {
                    try {
                        Cursor cursor = readableDatabase.rawQuery("select * from vap_table", (String[]) null);
                        ArrayList arrayList2 = new ArrayList();
                        if (cursor != null) {
                            Intrinsics.checkNotNullExpressionValue(cursor, "cursor");
                            if (cursor.moveToFirst()) {
                                do {
                                    String name = cursor.getString(1);
                                    if (name == null || StringsKt.isBlank(name)) {
                                        arrayList2.add(Integer.valueOf(cursor.getInt(0)));
                                    } else {
                                        Intrinsics.checkNotNullExpressionValue(name, "name");
                                        arrayList.add(name);
                                    }
                                } while (cursor.moveToNext());
                            }
                            cursor.close();
                            if (!arrayList2.isEmpty()) {
                                INSTANCE.removeEmptyPkg(context, readableDatabase, arrayList2);
                            }
                            Unit unit = Unit.INSTANCE;
                        }
                    } catch (Exception e) {
                        if (initResult != null) {
                            initResult.setCode(initResult.getCode() | 2);
                            initResult.setMessage(initResult.getMessage() + '\n' + e);
                        }
                    }
                } finally {
                    readableDatabase.close();
                }
            }
        } catch (Throwable th) {
            if (initResult != null) {
                initResult.setCode(1 | initResult.getCode());
                initResult.setMessage(initResult.getMessage() + '\n' + th);
            }
        }
        return arrayList;
    }

    @WorkerThread
    public final void updatePkgListToLocal(@NotNull Context context, @NotNull List<PackageRespModel.PackageModel> pkgList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pkgList, "pkgList");
        if (pkgList.isEmpty()) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = new PackageDBOpenHelper(context).getWritableDatabase(YS.D(PackageDBOpenHelper.DB_PWD));
            if (writableDatabase != null) {
                try {
                    try {
                        writableDatabase.beginTransaction();
                        for (PackageRespModel.PackageModel packageModel : pkgList) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("name", packageModel.getPkgName());
                            writableDatabase.update(PackageDBOpenHelper.TABLE_NAME, contentValues, "id=?", new String[]{String.valueOf(packageModel.getPkgId())});
                        }
                        writableDatabase.setTransactionSuccessful();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } finally {
                    writableDatabase.endTransaction();
                    writableDatabase.close();
                }
            }
        } catch (Throwable unused) {
        }
    }
}
