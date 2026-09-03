package com.common.support.utils;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0003"}, d2 = {"readStringFromAssets", "", "name", "utils_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class AssetsUtilsKt {
    @NotNull
    public static final String readStringFromAssets(@NotNull String name) throws Exception {
        Intrinsics.checkNotNullParameter(name, "name");
        StringBuilder sb = new StringBuilder();
        InputStream inputStreamOpen = Utils.INSTANCE.getApp().getAssets().open(name);
        Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "Utils.app.assets.open(name)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen));
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (TextUtils.isEmpty(line)) {
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(bufferedReader, null);
                    String string = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "str.toString()");
                    return string;
                }
                sb.append(line);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(bufferedReader, th);
                    throw th2;
                }
            }
        }
    }
}
