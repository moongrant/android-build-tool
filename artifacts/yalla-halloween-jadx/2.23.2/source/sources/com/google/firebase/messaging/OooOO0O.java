package com.google.firebase.messaging;

import android.R;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.ui.graphics.oo0O;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.yalla.yalla.data.db.model.NewFriendsOld;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import net.sqlcipher.database.SQLiteDatabase;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ExecutorService f19799OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Context f19800OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0Oo0oo f19801OooO0OO;

    public OooOO0O(Context context, o0Oo0oo o0oo0oo2, ExecutorService executorService) {
        this.f19799OooO00o = executorService;
        this.f19800OooO0O0 = context;
        this.f19801OooO0OO = o0oo0oo2;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0225  */
    /* JADX WARN: Code duplicated, block: B:172:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:21:0x0059 A[EDGE_INSN: B:21:0x0059->B:22:0x005a BREAK  A[LOOP:0: B:14:0x0041->B:309:?]] */
    /* JADX WARN: Code duplicated, block: B:294:0x03c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x0204 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x012c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0133  */
    /* JADX WARN: Code duplicated, block: B:60:0x0139  */
    /* JADX WARN: Code duplicated, block: B:63:0x0144  */
    /* JADX WARN: Code duplicated, block: B:65:0x0156  */
    /* JADX WARN: Code duplicated, block: B:66:0x015e  */
    /* JADX WARN: Code duplicated, block: B:69:0x016c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v109 */
    /* JADX WARN: Type inference failed for: r0v110, types: [int] */
    /* JADX WARN: Type inference failed for: r0v197 */
    /* JADX WARN: Type inference failed for: r0v198 */
    /* JADX WARN: Type inference failed for: r0v199 */
    /* JADX WARN: Type inference failed for: r0v200 */
    public final boolean OooO00o() {
        boolean z;
        final o00oO0o o00oo0o2;
        Bundle bundle;
        int identifier;
        String string;
        int i;
        int identifier2;
        Uri defaultUri;
        Intent launchIntentForPackage;
        PendingIntent activity;
        Integer numValueOf;
        Long lValueOf;
        long[] jArr;
        int[] iArr;
        IconCompat iconCompat;
        int i2;
        if (this.f19801OooO0OO.OooO00o("gcm.n.noui")) {
            return true;
        }
        Context context = this.f19800OooO0O0;
        if (!((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            if (!PlatformVersion.isAtLeastLollipop()) {
                SystemClock.sleep(10L);
            }
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                z = false;
                break;
            }
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (it.hasNext()) {
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == iMyPid) {
                        if (next.importance == 100) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                break;
            }
        }
        z = false;
        break;
        if (z) {
            return false;
        }
        String strOooO0o0 = this.f19801OooO0OO.OooO0o0("gcm.n.image");
        if (TextUtils.isEmpty(strOooO0o0)) {
            o00oo0o2 = null;
        } else {
            try {
                o00oo0o2 = new o00oO0o(new URL(strOooO0o0));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + strOooO0o0);
                o00oo0o2 = null;
            }
        }
        if (o00oo0o2 != null) {
            ExecutorService executorService = this.f19799OooO00o;
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            o00oo0o2.f19905OooO0o0 = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.oo000o
                @Override // java.lang.Runnable
                public final void run() {
                    TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                    o00oO0o o00oo0o3 = o00oo0o2;
                    o00oo0o3.getClass();
                    try {
                        taskCompletionSource2.setResult(o00oo0o3.OooO00o());
                    } catch (Exception e) {
                        taskCompletionSource2.setException(e);
                    }
                }
            });
            o00oo0o2.f19904OooO0o = taskCompletionSource.getTask();
        }
        Context context2 = this.f19800OooO0O0;
        o0Oo0oo o0oo0oo2 = this.f19801OooO0OO;
        AtomicInteger atomicInteger = OooO.f19775OooO00o;
        try {
            ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo(context2.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                bundle = Bundle.EMPTY;
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e);
        }
        Bundle bundle2 = bundle;
        String strOooO0o1 = o0oo0oo2.OooO0o0("gcm.n.android_channel_id");
        if (Build.VERSION.SDK_INT < 26) {
            strOooO0o1 = null;
        } else {
            try {
                if (context2.getPackageManager().getApplicationInfo(context2.getPackageName(), 0).targetSdkVersion < 26) {
                    strOooO0o1 = null;
                } else {
                    NotificationManager notificationManager = (NotificationManager) context2.getSystemService(NotificationManager.class);
                    if (TextUtils.isEmpty(strOooO0o1)) {
                        strOooO0o1 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                        if (!TextUtils.isEmpty(strOooO0o1)) {
                            Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                        } else if (notificationManager.getNotificationChannel(strOooO0o1) == null) {
                            Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            identifier = context2.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context2.getPackageName());
                            if (identifier == 0) {
                                Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                                string = "Misc";
                            } else {
                                string = context2.getString(identifier);
                            }
                            notificationManager.createNotificationChannel(oo0O.OooO00o(string));
                        }
                        strOooO0o1 = "fcm_fallback_notification_channel";
                    } else if (notificationManager.getNotificationChannel(strOooO0o1) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel requested (" + strOooO0o1 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                        strOooO0o1 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                        if (!TextUtils.isEmpty(strOooO0o1)) {
                            Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                        } else if (notificationManager.getNotificationChannel(strOooO0o1) == null) {
                            Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            identifier = context2.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context2.getPackageName());
                            if (identifier == 0) {
                                Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                                string = "Misc";
                            } else {
                                string = context2.getString(identifier);
                            }
                            notificationManager.createNotificationChannel(oo0O.OooO00o(string));
                        }
                        strOooO0o1 = "fcm_fallback_notification_channel";
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        o00000O.o00Oo0 o00oo1 = new o00000O.o00Oo0(context2, strOooO0o1);
        String strOooO0Oo = o0oo0oo2.OooO0Oo(packageName, resources, "gcm.n.title");
        if (!TextUtils.isEmpty(strOooO0Oo)) {
            o00oo1.f33433OooO0o0 = o00000O.o00Oo0.OooO0O0(strOooO0Oo);
        }
        String strOooO0Oo2 = o0oo0oo2.OooO0Oo(packageName, resources, "gcm.n.body");
        if (!TextUtils.isEmpty(strOooO0Oo2)) {
            o00oo1.f33432OooO0o = o00000O.o00Oo0.OooO0O0(strOooO0Oo2);
            o00000O.o00O0O o00o0o2 = new o00000O.o00O0O();
            o00o0o2.f33426OooO0O0 = o00000O.o00Oo0.OooO0O0(strOooO0Oo2);
            if (o00oo1.f33438OooOO0o != o00o0o2) {
                o00oo1.f33438OooOO0o = o00o0o2;
                o00o0o2.OooO0Oo(o00oo1);
            }
        }
        String strOooO0o2 = o0oo0oo2.OooO0o0("gcm.n.icon");
        if (TextUtils.isEmpty(strOooO0o2)) {
            i = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (i == 0 && OooO.OooO00o(resources, i)) {
                identifier2 = i;
            } else {
                try {
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.w("FirebaseMessaging", "Couldn't get own application info: " + e2);
                    identifier2 = i;
                }
            }
            if (identifier2 != 0 || !OooO.OooO00o(resources, identifier2)) {
                identifier2 = R.drawable.sym_def_app_icon;
            }
        } else {
            identifier2 = resources.getIdentifier(strOooO0o2, "drawable", packageName);
            if ((identifier2 == 0 || !OooO.OooO00o(resources, identifier2)) && ((identifier2 = resources.getIdentifier(strOooO0o2, "mipmap", packageName)) == 0 || !OooO.OooO00o(resources, identifier2))) {
                Log.w("FirebaseMessaging", "Icon resource " + strOooO0o2 + " not found. Notification will use default icon.");
                i = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                identifier2 = i == 0 ? packageManager.getApplicationInfo(packageName, 0).icon : packageManager.getApplicationInfo(packageName, 0).icon;
                if (identifier2 != 0) {
                    identifier2 = R.drawable.sym_def_app_icon;
                } else {
                    identifier2 = R.drawable.sym_def_app_icon;
                }
            }
        }
        Notification notification = o00oo1.f33445OooOOoo;
        notification.icon = identifier2;
        String strOooO0o3 = o0oo0oo2.OooO0o0("gcm.n.sound2");
        if (TextUtils.isEmpty(strOooO0o3)) {
            strOooO0o3 = o0oo0oo2.OooO0o0("gcm.n.sound");
        }
        if (TextUtils.isEmpty(strOooO0o3)) {
            defaultUri = null;
        } else if (NewFriendsOld.State_Default.equals(strOooO0o3) || resources.getIdentifier(strOooO0o3, "raw", packageName) == 0) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        } else {
            defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + strOooO0o3);
        }
        if (defaultUri != null) {
            notification.sound = defaultUri;
            notification.audioStreamType = -1;
            notification.audioAttributes = o00000O.o00Oo0.OooO00o.OooO00o(o00000O.o00Oo0.OooO00o.OooO0o0(o00000O.o00Oo0.OooO00o.OooO0OO(o00000O.o00Oo0.OooO00o.OooO0O0(), 4), 5));
        }
        String strOooO0o4 = o0oo0oo2.OooO0o0("gcm.n.click_action");
        if (TextUtils.isEmpty(strOooO0o4)) {
            String strOooO0o5 = o0oo0oo2.OooO0o0("gcm.n.link_android");
            if (TextUtils.isEmpty(strOooO0o5)) {
                strOooO0o5 = o0oo0oo2.OooO0o0("gcm.n.link");
            }
            Uri uri = !TextUtils.isEmpty(strOooO0o5) ? Uri.parse(strOooO0o5) : null;
            if (uri != null) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setData(uri);
            } else {
                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                if (launchIntentForPackage == null) {
                    Log.w("FirebaseMessaging", "No activity found to launch app");
                }
            }
        } else {
            launchIntentForPackage = new Intent(strOooO0o4);
            launchIntentForPackage.setPackage(packageName);
            launchIntentForPackage.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        }
        if (launchIntentForPackage == null) {
            activity = null;
        } else {
            launchIntentForPackage.addFlags(67108864);
            Bundle bundle3 = o0oo0oo2.f19912OooO00o;
            Bundle bundle4 = new Bundle(bundle3);
            for (String str : bundle3.keySet()) {
                if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                    bundle4.remove(str);
                }
            }
            launchIntentForPackage.putExtras(bundle4);
            if (o0oo0oo2.OooO00o("google.c.a.e")) {
                launchIntentForPackage.putExtra("gcm.n.analytics_data", o0oo0oo2.OooO0oO());
            }
            activity = PendingIntent.getActivity(context2, OooO.f19775OooO00o.incrementAndGet(), launchIntentForPackage, 1140850688);
        }
        o00oo1.f33434OooO0oO = activity;
        PendingIntent broadcast = !o0oo0oo2.OooO00o("google.c.a.e") ? null : PendingIntent.getBroadcast(context2, OooO.f19775OooO00o.incrementAndGet(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context2, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra(CloudMessagingReceiver.IntentKeys.WRAPPED_INTENT, new Intent(CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_DISMISS).putExtras(o0oo0oo2.OooO0oO())), 1140850688);
        if (broadcast != null) {
            notification.deleteIntent = broadcast;
        }
        String strOooO0o6 = o0oo0oo2.OooO0o0("gcm.n.color");
        if (TextUtils.isEmpty(strOooO0o6)) {
            i2 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i2 != 0) {
                Object obj = ContextCompat.f5281OooO00o;
                numValueOf = Integer.valueOf(ContextCompat.OooO0o.OooO00o(context2, i2));
            } else {
                numValueOf = null;
            }
        } else {
            try {
                numValueOf = Integer.valueOf(Color.parseColor(strOooO0o6));
            } catch (IllegalArgumentException unused3) {
                Log.w("FirebaseMessaging", "Color is invalid: " + strOooO0o6 + ". Notification will use default color.");
                i2 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i2 != 0) {
                    try {
                        Object obj2 = ContextCompat.f5281OooO00o;
                        numValueOf = Integer.valueOf(ContextCompat.OooO0o.OooO00o(context2, i2));
                    } catch (Resources.NotFoundException unused4) {
                        Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                        numValueOf = null;
                    }
                } else {
                    numValueOf = null;
                }
            }
        }
        if (numValueOf != null) {
            o00oo1.f33441OooOOOO = numValueOf.intValue();
        }
        o00oo1.OooO0OO(16, !o0oo0oo2.OooO00o("gcm.n.sticky"));
        o00oo1.f33440OooOOO0 = o0oo0oo2.OooO00o("gcm.n.local_only");
        String strOooO0o7 = o0oo0oo2.OooO0o0("gcm.n.ticker");
        if (strOooO0o7 != null) {
            o00oo1.f33445OooOOoo.tickerText = o00000O.o00Oo0.OooO0O0(strOooO0o7);
        }
        Integer numOooO0O0 = o0oo0oo2.OooO0O0("gcm.n.notification_priority");
        if (numOooO0O0 == null) {
            numOooO0O0 = null;
        } else if (numOooO0O0.intValue() < -2 || numOooO0O0.intValue() > 2) {
            Log.w("FirebaseMessaging", "notificationPriority is invalid " + numOooO0O0 + ". Skipping setting notificationPriority.");
            numOooO0O0 = null;
        }
        if (numOooO0O0 != null) {
            o00oo1.f33436OooOO0 = numOooO0O0.intValue();
        }
        Integer numOooO0O1 = o0oo0oo2.OooO0O0("gcm.n.visibility");
        if (numOooO0O1 == null) {
            numOooO0O1 = null;
        } else if (numOooO0O1.intValue() < -1 || numOooO0O1.intValue() > 1) {
            Log.w("NotificationParams", "visibility is invalid: " + numOooO0O1 + ". Skipping setting visibility.");
            numOooO0O1 = null;
        }
        if (numOooO0O1 != null) {
            o00oo1.f33442OooOOOo = numOooO0O1.intValue();
        }
        Integer numOooO0O2 = o0oo0oo2.OooO0O0("gcm.n.notification_count");
        if (numOooO0O2 == null) {
            numOooO0O2 = null;
        } else if (numOooO0O2.intValue() < 0) {
            Log.w("FirebaseMessaging", "notificationCount is invalid: " + numOooO0O2 + ". Skipping setting notificationCount.");
            numOooO0O2 = null;
        }
        if (numOooO0O2 != null) {
            o00oo1.f33427OooO = numOooO0O2.intValue();
        }
        String strOooO0o8 = o0oo0oo2.OooO0o0("gcm.n.event_time");
        if (TextUtils.isEmpty(strOooO0o8)) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(strOooO0o8));
            } catch (NumberFormatException unused5) {
                Log.w("NotificationParams", "Couldn't parse value of " + o0Oo0oo.OooO0oo("gcm.n.event_time") + "(" + strOooO0o8 + ") into a long");
                lValueOf = null;
            }
        }
        if (lValueOf != null) {
            o00oo1.f33437OooOO0O = true;
            notification.when = lValueOf.longValue();
        }
        JSONArray jSONArrayOooO0OO = o0oo0oo2.OooO0OO("gcm.n.vibrate_timings");
        if (jSONArrayOooO0OO == null) {
            jArr = null;
        } else {
            try {
                if (jSONArrayOooO0OO.length() <= 1) {
                    throw new JSONException("vibrateTimings have invalid length");
                }
                int length = jSONArrayOooO0OO.length();
                jArr = new long[length];
                for (int i3 = 0; i3 < length; i3++) {
                    jArr[i3] = jSONArrayOooO0OO.optLong(i3);
                }
            } catch (NumberFormatException | JSONException unused6) {
                Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayOooO0OO + ". Skipping setting vibrateTimings.");
                jArr = null;
            }
        }
        if (jArr != null) {
            notification.vibrate = jArr;
        }
        JSONArray jSONArrayOooO0OO2 = o0oo0oo2.OooO0OO("gcm.n.light_settings");
        if (jSONArrayOooO0OO2 == null) {
            iArr = null;
        } else {
            iArr = new int[3];
            try {
                if (jSONArrayOooO0OO2.length() != 3) {
                    throw new JSONException("lightSettings don't have all three fields");
                }
                int color = Color.parseColor(jSONArrayOooO0OO2.optString(0));
                if (color == -16777216) {
                    throw new IllegalArgumentException("Transparent color is invalid");
                }
                iArr[0] = color;
                iArr[1] = jSONArrayOooO0OO2.optInt(1);
                iArr[2] = jSONArrayOooO0OO2.optInt(2);
            } catch (IllegalArgumentException e3) {
                Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayOooO0OO2 + ". " + e3.getMessage() + ". Skipping setting LightSettings");
                iArr = null;
            } catch (JSONException unused7) {
                Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayOooO0OO2 + ". Skipping setting LightSettings");
                iArr = null;
            }
        }
        if (iArr != null) {
            int i4 = iArr[0];
            int i5 = iArr[1];
            int i6 = iArr[2];
            notification.ledARGB = i4;
            notification.ledOnMS = i5;
            notification.ledOffMS = i6;
            notification.flags = ((i5 == 0 || i6 == 0) ? 0 : 1) | ((-2) & notification.flags);
        }
        boolean zOooO00o = o0oo0oo2.OooO00o("gcm.n.default_sound");
        ?? r0 = zOooO00o;
        if (o0oo0oo2.OooO00o("gcm.n.default_vibrate_timings")) {
            r0 = (zOooO00o ? 1 : 0) | 2;
        }
        ?? r1 = r0;
        if (o0oo0oo2.OooO00o("gcm.n.default_light_settings")) {
            r1 = (r0 == true ? 1 : 0) | 4;
        }
        notification.defaults = r1;
        if ((r1 & 4) != 0) {
            notification.flags |= 1;
        }
        String strOooO0o9 = o0oo0oo2.OooO0o0("gcm.n.tag");
        if (TextUtils.isEmpty(strOooO0o9)) {
            strOooO0o9 = "FCM-Notification:" + SystemClock.uptimeMillis();
        }
        String str2 = strOooO0o9;
        if (o00oo0o2 != null) {
            try {
                Bitmap bitmap = (Bitmap) Tasks.await((Task) Preconditions.checkNotNull(o00oo0o2.f19904OooO0o), 5L, TimeUnit.SECONDS);
                o00oo1.OooO0Oo(bitmap);
                o00000O.o0OoOo0 o0oooo1 = new o00000O.o0OoOo0();
                if (bitmap == null) {
                    iconCompat = null;
                } else {
                    iconCompat = new IconCompat(1);
                    iconCompat.f5312OooO0O0 = bitmap;
                }
                o0oooo1.f33464OooO0O0 = iconCompat;
                o0oooo1.f33465OooO0OO = null;
                o0oooo1.f33466OooO0Oo = true;
                if (o00oo1.f33438OooOO0o != o0oooo1) {
                    o00oo1.f33438OooOO0o = o0oooo1;
                    o0oooo1.OooO0Oo(o00oo1);
                }
            } catch (InterruptedException unused8) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                o00oo0o2.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e4) {
                Log.w("FirebaseMessaging", "Failed to download image: " + e4.getCause());
            } catch (TimeoutException unused9) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                o00oo0o2.close();
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f19800OooO0O0.getSystemService("notification")).notify(str2, 0, o00oo1.OooO00o());
        return true;
    }
}
