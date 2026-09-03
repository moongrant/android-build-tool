package androidx.fragment.app;

import com.app.base.protobuf.MessageIM;
import com.yalla.yalla.model.SystemMessageModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Oooo0 {
    public static long OooO00o(String str, String str2, MessageIM.Message message, SystemMessageModel systemMessageModel, String str3) {
        Intrinsics.checkNotNullExpressionValue(str, str2);
        long time = message.getTime();
        Intrinsics.checkNotNullExpressionValue(systemMessageModel, str3);
        return time;
    }

    public static String OooO0O0(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }
}
