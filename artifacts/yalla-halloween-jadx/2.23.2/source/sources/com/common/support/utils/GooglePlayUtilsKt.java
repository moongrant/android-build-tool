package com.common.support.utils;

import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.sqlcipher.database.SQLiteDatabase;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0004"}, d2 = {"GOOGLE_PLAY_APP_STORE_PACKAGE_NAME", "", "getGoogleAppStoreIntent", "Landroid/content/Intent;", "utils_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class GooglePlayUtilsKt {

    @NotNull
    private static final String GOOGLE_PLAY_APP_STORE_PACKAGE_NAME = "com.android.vending";

    @NotNull
    public static final Intent getGoogleAppStoreIntent() {
        Uri uri = Uri.parse(Intrinsics.stringPlus("market://details?id=", Utils.INSTANCE.getApp().getPackageName()));
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        intent.setPackage("com.android.vending");
        return intent;
    }
}
