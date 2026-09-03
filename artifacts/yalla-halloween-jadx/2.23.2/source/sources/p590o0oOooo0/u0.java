package p590o0oOooo0;

import android.content.Context;
import android.content.Intent;
import com.yalla.yalla.ui.activity.main.StartActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class u0 {
    public static void OooO00o(Context context, String str, int i) {
        Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
        intent.putExtra("duplicate", false);
        intent.putExtra("android.intent.extra.shortcut.NAME", str);
        intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(context, i));
        Intent intent2 = new Intent("android.intent.action.MAIN");
        intent2.setClass(context, StartActivity.class);
        intent2.addCategory("android.intent.category.LAUNCHER");
        intent.putExtra("android.intent.extra.shortcut.INTENT", intent2);
        context.sendBroadcast(intent);
    }
}
