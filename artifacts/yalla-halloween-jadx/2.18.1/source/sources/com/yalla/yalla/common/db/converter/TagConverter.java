package com.yalla.yalla.common.db.converter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.TypeConverter;
import com.android.billingclient.api.o0Oo0oo;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.yalla.yalla.common.db.table.UserInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p388o0OOooO.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/yalla/yalla/common/db/converter/TagConverter;", "", "()V", "listToString", "", "list", "", "Lcom/yalla/yalla/common/db/table/UserInfo$TagInfo;", "stringToList", AppMeasurementSdk.ConditionalUserProperty.VALUE, "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class TagConverter {
    public static final int $stable = 0;

    @TypeConverter
    @NotNull
    public final String listToString(@Nullable List<UserInfo.TagInfo> list) {
        String strOooO0Oo = o0Oo0oo.OooO0Oo(list);
        return strOooO0Oo == null ? "" : strOooO0Oo;
    }

    @TypeConverter
    @NotNull
    public final List<UserInfo.TagInfo> stringToList(@Nullable String value) {
        List<UserInfo.TagInfo> list = (List) o0Oo0oo.OooO0OO(value, new o00000O0<List<UserInfo.TagInfo>>() { // from class: com.yalla.yalla.common.db.converter.TagConverter$stringToList$listType$1
        }.getType());
        return list == null ? new ArrayList() : list;
    }
}
