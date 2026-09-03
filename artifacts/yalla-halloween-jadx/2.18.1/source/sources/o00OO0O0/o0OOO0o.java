package o00OO0O0;

import android.app.Activity;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0OOO0o {
    public static void OooO0O0(Activity activity, String str, Activity activity2, Class cls) {
        Intrinsics.checkNotNullParameter(activity, str);
        activity.startActivity(new Intent(activity2, (Class<?>) cls));
    }
}
