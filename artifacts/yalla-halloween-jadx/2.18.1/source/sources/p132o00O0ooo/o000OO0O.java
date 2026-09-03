package p132o00O0ooo;

import com.amazonaws.regions.Region;
import com.app.base.protobuf.MessageIM;
import com.yalla.yalla.model.SystemMessageModel;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000OO0O {
    public static long OooO00o(String str, String str2, MessageIM.Message message, SystemMessageModel systemMessageModel, String str3) {
        Intrinsics.checkNotNullExpressionValue(str, str2);
        long time = message.getTime();
        Intrinsics.checkNotNullExpressionValue(systemMessageModel, str3);
        return time;
    }

    public static Region OooO0O0(String str, String str2, ArrayList arrayList) {
        Region region = new Region(str, str2);
        arrayList.add(region);
        return region;
    }
}
