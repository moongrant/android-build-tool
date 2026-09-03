package androidx.media3.session;

import android.app.ForegroundServiceStartNotAllowedException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public class MediaButtonReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String[] f9196OooO00o = {"android.intent.action.MEDIA_BUTTON", "androidx.media3.session.MediaLibraryService", "androidx.media3.session.MediaSessionService"};

    @RequiresApi(31)
    public static final class OooO00o {
        @DoNotInline
        public static ForegroundServiceStartNotAllowedException OooO00o(IllegalStateException illegalStateException) {
            return Oooo000.OooO00o(illegalStateException);
        }

        @DoNotInline
        public static boolean OooO0O0(IllegalStateException illegalStateException) {
            return OooOo.OooO00o(illegalStateException);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, @Nullable Intent intent) {
        ComponentName componentName;
        if (intent == null || !Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Log.d("MediaButtonReceiver", "Ignore unsupported intent: " + intent);
            return;
        }
        if (p080o000OoO.o00.f34910OooO00o >= 26) {
            Bundle extras = intent.getExtras();
            extras.getClass();
            KeyEvent keyEvent = (KeyEvent) extras.getParcelable("android.intent.extra.KEY_EVENT");
            if (keyEvent != null && keyEvent.getKeyCode() != 126 && keyEvent.getKeyCode() != 85) {
                Log.w("MediaButtonReceiver", "Ignore key event that is not a `play` command on API 26 or above to avoid an 'ForegroundServiceDidNotStartInTimeException'");
                return;
            }
        }
        String[] strArr = f9196OooO00o;
        for (int i = 0; i < 3; i++) {
            String str = strArr[i];
            PackageManager packageManager = context.getPackageManager();
            Intent intent2 = new Intent(str);
            intent2.setPackage(context.getPackageName());
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent2, 0);
            if (listQueryIntentServices.size() == 1) {
                ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
            } else {
                if (!listQueryIntentServices.isEmpty()) {
                    StringBuilder sbOooO0O0 = p004OooO0oO.o0OoOo0.OooO0O0("Expected 1 service that handles ", str, ", found ");
                    sbOooO0O0.append(listQueryIntentServices.size());
                    throw new IllegalStateException(sbOooO0O0.toString());
                }
                componentName = null;
            }
            if (componentName != null) {
                intent.setComponent(componentName);
                try {
                    ContextCompat.OooO0Oo(context, intent);
                    return;
                } catch (IllegalStateException e) {
                    if (Build.VERSION.SDK_INT < 31 || !OooO00o.OooO0O0(e)) {
                        throw e;
                    }
                    androidx.media3.common.util.Log.OooO0OO("MediaButtonReceiver", "caught exception when trying to start a foreground service from the background: " + OooO00o.OooO00o(e).getMessage());
                    return;
                }
            }
        }
        throw new IllegalStateException("Could not find any Service that handles any of the actions " + Arrays.toString(strArr));
    }
}
