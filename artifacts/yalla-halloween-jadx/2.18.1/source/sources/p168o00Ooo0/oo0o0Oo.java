package p168o00Ooo0;

import android.content.Context;
import android.content.Intent;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.main.StartActivity;

/* JADX INFO: loaded from: classes.dex */
public final class oo0o0Oo {
    public static void OooO00o(Context context, String str) {
        Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
        intent.putExtra("duplicate", false);
        intent.putExtra("android.intent.extra.shortcut.NAME", str);
        intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(context, R.drawable.ic_logo));
        Intent intent2 = new Intent("android.intent.action.MAIN");
        intent2.setClass(context, StartActivity.class);
        intent2.addCategory("android.intent.category.LAUNCHER");
        intent.putExtra("android.intent.extra.shortcut.INTENT", intent2);
        context.sendBroadcast(intent);
    }
}
