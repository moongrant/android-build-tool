package p381o0OOoOOO;

import android.R;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.yalla.yalla.data.db.model.NewFriendsOld;
import java.util.concurrent.atomic.AtomicInteger;
import net.sqlcipher.database.SQLiteDatabase;
import org.json.JSONArray;
import org.json.JSONException;
import p070o0000ooO.o00000;
import p070o0000ooO.o000000O;

/* JADX INFO: loaded from: classes2.dex */
public final class o00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final AtomicInteger f38716OooO00o = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o00000 f38717OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f38718OooO0O0;

        public OooO00o(o00000 o00000Var, String str) {
            this.f38717OooO00o = o00000Var;
            this.f38718OooO0O0 = str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:145:0x034a  */
    /* JADX WARN: Code duplicated, block: B:243:0x033c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x0160 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x008a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0091  */
    /* JADX WARN: Code duplicated, block: B:29:0x0097  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:69:0x0184  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r14v39, types: [int] */
    /* JADX WARN: Type inference failed for: r14v73 */
    /* JADX WARN: Type inference failed for: r14v74 */
    /* JADX WARN: Type inference failed for: r14v75 */
    /* JADX WARN: Type inference failed for: r14v76 */
    public static OooO00o OooO00o(Context context, o00O o00o2) {
        Bundle bundle;
        int identifier;
        String string;
        int i;
        int identifier2;
        Uri defaultUri;
        Intent launchIntentForPackage;
        PendingIntent activity;
        PendingIntent broadcast;
        Integer numValueOf;
        Long lValueOf;
        long[] jArr;
        int[] iArr;
        int i2;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                bundle = Bundle.EMPTY;
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e);
        }
        String strOooO0o0 = o00o2.OooO0o0("gcm.n.android_channel_id");
        int i3 = 0;
        if (Build.VERSION.SDK_INT < 26) {
            strOooO0o0 = null;
        } else {
            try {
                if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                    strOooO0o0 = null;
                } else {
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                    if (TextUtils.isEmpty(strOooO0o0)) {
                        strOooO0o0 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
                        if (!TextUtils.isEmpty(strOooO0o0)) {
                            Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                        } else if (notificationManager.getNotificationChannel(strOooO0o0) == null) {
                            Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                        strOooO0o0 = "fcm_fallback_notification_channel";
                        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                            if (identifier == 0) {
                                Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                                string = "Misc";
                            } else {
                                string = context.getString(identifier);
                            }
                            notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                        }
                    } else if (notificationManager.getNotificationChannel(strOooO0o0) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel requested (" + strOooO0o0 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                        strOooO0o0 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
                        if (!TextUtils.isEmpty(strOooO0o0)) {
                            Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                        } else if (notificationManager.getNotificationChannel(strOooO0o0) == null) {
                            Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                        strOooO0o0 = "fcm_fallback_notification_channel";
                        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                            if (identifier == 0) {
                                Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                                string = "Misc";
                            } else {
                                string = context.getString(identifier);
                            }
                            notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String packageName = context.getPackageName();
        Resources resources = context.getResources();
        PackageManager packageManager = context.getPackageManager();
        o00000 o00000Var = new o00000(context, strOooO0o0);
        String strOooO0Oo = o00o2.OooO0Oo(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strOooO0Oo)) {
            o00000Var.f27958OooO0o0 = o00000.OooO0O0(strOooO0Oo);
        }
        String strOooO0Oo2 = o00o2.OooO0Oo(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strOooO0Oo2)) {
            o00000Var.f27957OooO0o = o00000.OooO0O0(strOooO0Oo2);
            o000000O o000000o2 = new o000000O();
            o000000o2.f27975OooO0O0 = o00000.OooO0O0(strOooO0Oo2);
            o00000Var.OooO0o0(o000000o2);
        }
        String strOooO0o1 = o00o2.OooO0o0("gcm.n.icon");
        if (TextUtils.isEmpty(strOooO0o1)) {
            i = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (i == 0 && OooO0O0(resources, i)) {
                identifier2 = i;
            } else {
                try {
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.w("FirebaseMessaging", "Couldn't get own application info: " + e2);
                    identifier2 = i;
                }
            }
            if (identifier2 != 0 || !OooO0O0(resources, identifier2)) {
                identifier2 = R.drawable.sym_def_app_icon;
            }
        } else {
            identifier2 = resources.getIdentifier(strOooO0o1, "drawable", packageName);
            if ((identifier2 == 0 || !OooO0O0(resources, identifier2)) && ((identifier2 = resources.getIdentifier(strOooO0o1, "mipmap", packageName)) == 0 || !OooO0O0(resources, identifier2))) {
                Log.w("FirebaseMessaging", "Icon resource " + strOooO0o1 + " not found. Notification will use default icon.");
                i = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                identifier2 = i == 0 ? packageManager.getApplicationInfo(packageName, 0).icon : packageManager.getApplicationInfo(packageName, 0).icon;
                if (identifier2 != 0) {
                    identifier2 = R.drawable.sym_def_app_icon;
                } else {
                    identifier2 = R.drawable.sym_def_app_icon;
                }
            }
        }
        o00000Var.f27970OooOOoo.icon = identifier2;
        String strOooO0o2 = o00o2.OooO0o0("gcm.n.sound2");
        if (TextUtils.isEmpty(strOooO0o2)) {
            strOooO0o2 = o00o2.OooO0o0("gcm.n.sound");
        }
        if (TextUtils.isEmpty(strOooO0o2)) {
            defaultUri = null;
        } else if (NewFriendsOld.State_Default.equals(strOooO0o2) || resources.getIdentifier(strOooO0o2, "raw", packageName) == 0) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        } else {
            defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + strOooO0o2);
        }
        if (defaultUri != null) {
            Notification notification = o00000Var.f27970OooOOoo;
            notification.sound = defaultUri;
            notification.audioStreamType = -1;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
        }
        String strOooO0o3 = o00o2.OooO0o0("gcm.n.click_action");
        if (TextUtils.isEmpty(strOooO0o3)) {
            String strOooO0o4 = o00o2.OooO0o0("gcm.n.link_android");
            if (TextUtils.isEmpty(strOooO0o4)) {
                strOooO0o4 = o00o2.OooO0o0("gcm.n.link");
            }
            Uri uri = !TextUtils.isEmpty(strOooO0o4) ? Uri.parse(strOooO0o4) : null;
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
            launchIntentForPackage = new Intent(strOooO0o3);
            launchIntentForPackage.setPackage(packageName);
            launchIntentForPackage.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        }
        if (launchIntentForPackage == null) {
            activity = null;
        } else {
            launchIntentForPackage.addFlags(67108864);
            Bundle bundle2 = new Bundle(o00o2.f38741OooO00o);
            for (String str : o00o2.f38741OooO00o.keySet()) {
                if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                    bundle2.remove(str);
                }
            }
            launchIntentForPackage.putExtras(bundle2);
            if (o00o2.OooO00o("google.c.a.e")) {
                launchIntentForPackage.putExtra("gcm.n.analytics_data", o00o2.OooO0oO());
            }
            activity = PendingIntent.getActivity(context, f38716OooO00o.incrementAndGet(), launchIntentForPackage, Build.VERSION.SDK_INT >= 23 ? 1140850688 : 1073741824);
        }
        o00000Var.f27959OooO0oO = activity;
        if (o00o2.OooO00o("google.c.a.e")) {
            broadcast = PendingIntent.getBroadcast(context, f38716OooO00o.incrementAndGet(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra(CloudMessagingReceiver.IntentKeys.WRAPPED_INTENT, new Intent(CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_DISMISS).putExtras(o00o2.OooO0oO())), Build.VERSION.SDK_INT >= 23 ? 1140850688 : 1073741824);
        } else {
            broadcast = null;
        }
        if (broadcast != null) {
            o00000Var.f27970OooOOoo.deleteIntent = broadcast;
        }
        String strOooO0o5 = o00o2.OooO0o0("gcm.n.color");
        if (TextUtils.isEmpty(strOooO0o5)) {
            i2 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i2 != 0) {
                numValueOf = Integer.valueOf(o000O000.OooO00o.OooO0O0(context, i2));
            } else {
                numValueOf = null;
            }
        } else {
            try {
                numValueOf = Integer.valueOf(Color.parseColor(strOooO0o5));
            } catch (IllegalArgumentException unused2) {
                Log.w("FirebaseMessaging", "Color is invalid: " + strOooO0o5 + ". Notification will use default color.");
                i2 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i2 != 0) {
                    try {
                        numValueOf = Integer.valueOf(o000O000.OooO00o.OooO0O0(context, i2));
                    } catch (Resources.NotFoundException unused3) {
                        Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                        numValueOf = null;
                    }
                } else {
                    numValueOf = null;
                }
            }
        }
        if (numValueOf != null) {
            o00000Var.f27966OooOOOO = numValueOf.intValue();
        }
        o00000Var.OooO0OO(!o00o2.OooO00o("gcm.n.sticky"));
        o00000Var.f27965OooOOO0 = o00o2.OooO00o("gcm.n.local_only");
        String strOooO0o6 = o00o2.OooO0o0("gcm.n.ticker");
        if (strOooO0o6 != null) {
            o00000Var.f27970OooOOoo.tickerText = o00000.OooO0O0(strOooO0o6);
        }
        Integer numOooO0O0 = o00o2.OooO0O0("gcm.n.notification_priority");
        if (numOooO0O0 == null) {
            numOooO0O0 = null;
        } else if (numOooO0O0.intValue() < -2 || numOooO0O0.intValue() > 2) {
            Log.w("FirebaseMessaging", "notificationPriority is invalid " + numOooO0O0 + ". Skipping setting notificationPriority.");
            numOooO0O0 = null;
        }
        if (numOooO0O0 != null) {
            o00000Var.f27961OooOO0 = numOooO0O0.intValue();
        }
        Integer numOooO0O1 = o00o2.OooO0O0("gcm.n.visibility");
        if (numOooO0O1 == null) {
            numOooO0O1 = null;
        } else if (numOooO0O1.intValue() < -1 || numOooO0O1.intValue() > 1) {
            Log.w("NotificationParams", "visibility is invalid: " + numOooO0O1 + ". Skipping setting visibility.");
            numOooO0O1 = null;
        }
        if (numOooO0O1 != null) {
            o00000Var.f27967OooOOOo = numOooO0O1.intValue();
        }
        Integer numOooO0O2 = o00o2.OooO0O0("gcm.n.notification_count");
        if (numOooO0O2 == null) {
            numOooO0O2 = null;
        } else if (numOooO0O2.intValue() < 0) {
            Log.w("FirebaseMessaging", "notificationCount is invalid: " + numOooO0O2 + ". Skipping setting notificationCount.");
            numOooO0O2 = null;
        }
        if (numOooO0O2 != null) {
            o00000Var.f27952OooO = numOooO0O2.intValue();
        }
        String strOooO0o7 = o00o2.OooO0o0("gcm.n.event_time");
        if (TextUtils.isEmpty(strOooO0o7)) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(strOooO0o7));
            } catch (NumberFormatException unused4) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Couldn't parse value of ");
                sbOooO0o0.append(o00O.OooO0oo("gcm.n.event_time"));
                sbOooO0o0.append("(");
                sbOooO0o0.append(strOooO0o7);
                sbOooO0o0.append(") into a long");
                Log.w("NotificationParams", sbOooO0o0.toString());
                lValueOf = null;
            }
        }
        if (lValueOf != null) {
            o00000Var.f27962OooOO0O = true;
            o00000Var.f27970OooOOoo.when = lValueOf.longValue();
        }
        JSONArray jSONArrayOooO0OO = o00o2.OooO0OO("gcm.n.vibrate_timings");
        if (jSONArrayOooO0OO == null) {
            jArr = null;
        } else {
            try {
                if (jSONArrayOooO0OO.length() <= 1) {
                    throw new JSONException("vibrateTimings have invalid length");
                }
                int length = jSONArrayOooO0OO.length();
                jArr = new long[length];
                for (int i4 = 0; i4 < length; i4++) {
                    jArr[i4] = jSONArrayOooO0OO.optLong(i4);
                }
            } catch (NumberFormatException | JSONException unused5) {
                Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayOooO0OO + ". Skipping setting vibrateTimings.");
                jArr = null;
            }
        }
        if (jArr != null) {
            o00000Var.f27970OooOOoo.vibrate = jArr;
        }
        JSONArray jSONArrayOooO0OO2 = o00o2.OooO0OO("gcm.n.light_settings");
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
            } catch (JSONException unused6) {
                Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayOooO0OO2 + ". Skipping setting LightSettings");
                iArr = null;
            }
        }
        if (iArr != null) {
            int i5 = iArr[0];
            int i6 = iArr[1];
            int i7 = iArr[2];
            Notification notification2 = o00000Var.f27970OooOOoo;
            notification2.ledARGB = i5;
            notification2.ledOnMS = i6;
            notification2.ledOffMS = i7;
            if (i6 != 0 && i7 != 0) {
                i3 = 1;
            }
            notification2.flags = (notification2.flags & (-2)) | i3;
        }
        boolean zOooO00o = o00o2.OooO00o("gcm.n.default_sound");
        ?? r14 = zOooO00o;
        if (o00o2.OooO00o("gcm.n.default_vibrate_timings")) {
            r14 = (zOooO00o ? 1 : 0) | 2;
        }
        ?? r15 = r14;
        if (o00o2.OooO00o("gcm.n.default_light_settings")) {
            r15 = (r14 == true ? 1 : 0) | 4;
        }
        Notification notification3 = o00000Var.f27970OooOOoo;
        notification3.defaults = r15;
        if ((r15 & 4) != 0) {
            notification3.flags |= 1;
        }
        String strOooO0o8 = o00o2.OooO0o0("gcm.n.tag");
        if (TextUtils.isEmpty(strOooO0o8)) {
            StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("FCM-Notification:");
            sbOooO0o1.append(SystemClock.uptimeMillis());
            strOooO0o8 = sbOooO0o1.toString();
        }
        return new OooO00o(o00000Var, strOooO0o8);
    }

    @TargetApi(26)
    public static boolean OooO0O0(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i + ", treating it as an invalid icon");
            return false;
        }
    }
}
