package o00000O;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat$Action;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.bolts.AppLinks;
import com.facebook.share.internal.ShareConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f33960OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Notification.Builder f33961OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00O0O f33962OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Bundle f33963OooO0Oo;

    @RequiresApi(21)
    public static class OooO {
        @DoNotInline
        public static Notification.Builder OooO00o(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        @DoNotInline
        public static Notification.Builder OooO0O0(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        @DoNotInline
        public static Notification.Builder OooO0OO(Notification.Builder builder, int i) {
            return builder.setColor(i);
        }

        @DoNotInline
        public static Notification.Builder OooO0Oo(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        @DoNotInline
        public static Notification.Builder OooO0o(Notification.Builder builder, int i) {
            return builder.setVisibility(i);
        }

        @DoNotInline
        public static Notification.Builder OooO0o0(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }
    }

    @RequiresApi(16)
    public static class OooO00o {
        @DoNotInline
        public static Notification OooO00o(Notification.Builder builder) {
            return builder.build();
        }

        @DoNotInline
        public static Notification.Builder OooO0O0(Notification.Builder builder, int i) {
            return builder.setPriority(i);
        }

        @DoNotInline
        public static Notification.Builder OooO0OO(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSubText(charSequence);
        }

        @DoNotInline
        public static Notification.Builder OooO0Oo(Notification.Builder builder, boolean z) {
            return builder.setUsesChronometer(z);
        }
    }

    @RequiresApi(17)
    public static class OooO0O0 {
        @DoNotInline
        public static Notification.Builder OooO00o(Notification.Builder builder, boolean z) {
            return builder.setShowWhen(z);
        }
    }

    @RequiresApi(19)
    public static class OooO0OO {
        @DoNotInline
        public static Notification.Builder OooO00o(Notification.Builder builder, Bundle bundle) {
            return builder.setExtras(bundle);
        }
    }

    @RequiresApi(20)
    public static class OooO0o {
        @DoNotInline
        public static Notification.Builder OooO(Notification.Builder builder, boolean z) {
            return builder.setLocalOnly(z);
        }

        @DoNotInline
        public static Notification.Builder OooO00o(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        @DoNotInline
        public static Notification.Action.Builder OooO0O0(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        @DoNotInline
        public static Notification.Action.Builder OooO0OO(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        @DoNotInline
        public static Notification.Action OooO0Oo(Notification.Action.Builder builder) {
            return builder.build();
        }

        @DoNotInline
        public static String OooO0o(Notification notification) {
            return notification.getGroup();
        }

        @DoNotInline
        public static Notification.Action.Builder OooO0o0(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i, charSequence, pendingIntent);
        }

        @DoNotInline
        public static Notification.Builder OooO0oO(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        @DoNotInline
        public static Notification.Builder OooO0oo(Notification.Builder builder, boolean z) {
            return builder.setGroupSummary(z);
        }

        @DoNotInline
        public static Notification.Builder OooOO0(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    @RequiresApi(23)
    public static class OooOO0 {
        @DoNotInline
        public static Notification.Action.Builder OooO00o(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        @DoNotInline
        public static Notification.Builder OooO0O0(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    @RequiresApi(24)
    public static class OooOO0O {
        @DoNotInline
        public static Notification.Action.Builder OooO00o(Notification.Action.Builder builder, boolean z) {
            return builder.setAllowGeneratedReplies(z);
        }

        @DoNotInline
        public static Notification.Builder OooO0O0(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        @DoNotInline
        public static Notification.Builder OooO0OO(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        @DoNotInline
        public static Notification.Builder OooO0Oo(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        @DoNotInline
        public static Notification.Builder OooO0o0(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    @RequiresApi(28)
    public static class OooOOO {
        @DoNotInline
        public static Notification.Builder OooO00o(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        @DoNotInline
        public static Notification.Action.Builder OooO0O0(Notification.Action.Builder builder, int i) {
            return builder.setSemanticAction(i);
        }
    }

    @RequiresApi(26)
    public static class OooOOO0 {
        @DoNotInline
        public static Notification.Builder OooO00o(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        @DoNotInline
        public static Notification.Builder OooO0O0(Notification.Builder builder, int i) {
            return builder.setBadgeIconType(i);
        }

        @DoNotInline
        public static Notification.Builder OooO0OO(Notification.Builder builder, boolean z) {
            return builder.setColorized(z);
        }

        @DoNotInline
        public static Notification.Builder OooO0Oo(Notification.Builder builder, int i) {
            return builder.setGroupAlertBehavior(i);
        }

        @DoNotInline
        public static Notification.Builder OooO0o(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        @DoNotInline
        public static Notification.Builder OooO0o0(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        @DoNotInline
        public static Notification.Builder OooO0oO(Notification.Builder builder, long j) {
            return builder.setTimeoutAfter(j);
        }
    }

    @RequiresApi(29)
    public static class OooOOOO {
        @DoNotInline
        public static Notification.Builder OooO00o(Notification.Builder builder, boolean z) {
            return builder.setAllowSystemGeneratedContextualActions(z);
        }

        @DoNotInline
        public static Notification.Builder OooO0O0(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        @DoNotInline
        public static Notification.Action.Builder OooO0OO(Notification.Action.Builder builder, boolean z) {
            return builder.setContextual(z);
        }

        @DoNotInline
        public static Notification.Builder OooO0Oo(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    @RequiresApi(31)
    public static class OooOo00 {
        @DoNotInline
        public static Notification.Action.Builder OooO00o(Notification.Action.Builder builder, boolean z) {
            return builder.setAuthenticationRequired(z);
        }

        @DoNotInline
        public static Notification.Builder OooO0O0(Notification.Builder builder, int i) {
            return builder.setForegroundServiceBehavior(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.net.Uri, java.lang.CharSequence, java.lang.String, long[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    public o00Ooo(o00O0O o00o0o2) {
        ?? r5;
        Bundle[] bundleArr;
        int i;
        int i2;
        new ArrayList();
        this.f33963OooO0Oo = new Bundle();
        this.f33962OooO0OO = o00o0o2;
        Context context = o00o0o2.f33940OooO00o;
        this.f33960OooO00o = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f33961OooO0O0 = OooOOO0.OooO00o(context, o00o0o2.f33956OooOOo0);
        } else {
            this.f33961OooO0O0 = new Notification.Builder(o00o0o2.f33940OooO00o);
        }
        Notification notification = o00o0o2.f33957OooOOoo;
        ArrayList<String> arrayList = null;
        int i3 = 0;
        this.f33961OooO0O0.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(o00o0o2.f33945OooO0o0).setContentText(o00o0o2.f33944OooO0o).setContentInfo(null).setContentIntent(o00o0o2.f33946OooO0oO).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setLargeIcon(o00o0o2.f33947OooO0oo).setNumber(o00o0o2.f33939OooO).setProgress(0, 0, false);
        OooO00o.OooO0O0(OooO00o.OooO0Oo(OooO00o.OooO0OO(this.f33961OooO0O0, null), false), o00o0o2.f33948OooOO0);
        for (NotificationCompat$Action notificationCompat$Action : o00o0o2.f33941OooO0O0) {
            if (notificationCompat$Action.f5256OooO0O0 == null && (i2 = notificationCompat$Action.f5262OooO0oo) != 0) {
                notificationCompat$Action.f5256OooO0O0 = IconCompat.OooO0O0("", i2);
            }
            IconCompat iconCompat = notificationCompat$Action.f5256OooO0O0;
            Notification.Action.Builder builderOooO00o = OooOO0.OooO00o(iconCompat != null ? IconCompat.OooO00o.OooO0o(iconCompat, null) : null, notificationCompat$Action.f5254OooO, notificationCompat$Action.f5263OooOO0);
            androidx.core.app.RemoteInput[] remoteInputArr = notificationCompat$Action.f5257OooO0OO;
            if (remoteInputArr != null) {
                int length = remoteInputArr.length;
                RemoteInput[] remoteInputArr2 = new RemoteInput[length];
                if (remoteInputArr.length > 0) {
                    androidx.core.app.RemoteInput remoteInput = remoteInputArr[0];
                    throw null;
                }
                for (int i4 = 0; i4 < length; i4++) {
                    OooO0o.OooO0OO(builderOooO00o, remoteInputArr2[i4]);
                }
            }
            Bundle bundle = notificationCompat$Action.f5255OooO00o;
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            boolean z = notificationCompat$Action.f5258OooO0Oo;
            bundle2.putBoolean("android.support.allowGeneratedReplies", z);
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 24) {
                OooOO0O.OooO00o(builderOooO00o, z);
            }
            int i6 = notificationCompat$Action.f5259OooO0o;
            bundle2.putInt("android.support.action.semanticAction", i6);
            if (i5 >= 28) {
                OooOOO.OooO0O0(builderOooO00o, i6);
            }
            if (i5 >= 29) {
                OooOOOO.OooO0OO(builderOooO00o, notificationCompat$Action.f5261OooO0oO);
            }
            if (i5 >= 31) {
                OooOo00.OooO00o(builderOooO00o, notificationCompat$Action.f5264OooOO0O);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", notificationCompat$Action.f5260OooO0o0);
            OooO0o.OooO0O0(builderOooO00o, bundle2);
            OooO0o.OooO00o(this.f33961OooO0O0, OooO0o.OooO0Oo(builderOooO00o));
        }
        Bundle bundle3 = o00o0o2.f33951OooOOO;
        if (bundle3 != null) {
            this.f33963OooO0Oo.putAll(bundle3);
        }
        int i7 = Build.VERSION.SDK_INT;
        OooO0O0.OooO00o(this.f33961OooO0O0, o00o0o2.f33949OooOO0O);
        OooO0o.OooO(this.f33961OooO0O0, o00o0o2.f33952OooOOO0);
        OooO0o.OooO0oO(this.f33961OooO0O0, null);
        OooO0o.OooOO0(this.f33961OooO0O0, null);
        OooO0o.OooO0oo(this.f33961OooO0O0, false);
        OooO.OooO0O0(this.f33961OooO0O0, null);
        OooO.OooO0OO(this.f33961OooO0O0, o00o0o2.f33953OooOOOO);
        OooO.OooO0o(this.f33961OooO0O0, o00o0o2.f33954OooOOOo);
        OooO.OooO0Oo(this.f33961OooO0O0, null);
        OooO.OooO0o0(this.f33961OooO0O0, notification.sound, notification.audioAttributes);
        ArrayList<o0Oo0oo> arrayList2 = o00o0o2.f33942OooO0OO;
        ArrayList<String> arrayList3 = o00o0o2.f33958OooOo00;
        if (i7 < 28) {
            if (arrayList2 != null) {
                arrayList = new ArrayList<>(arrayList2.size());
                for (o0Oo0oo o0oo0oo2 : arrayList2) {
                    String str = o0oo0oo2.f33971OooO0OO;
                    if (str == null) {
                        CharSequence charSequence = o0oo0oo2.f33969OooO00o;
                        str = charSequence != null ? "name:" + ((Object) charSequence) : "";
                    }
                    arrayList.add(str);
                }
            }
            if (arrayList != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList;
                } else {
                    p188o00o0O.OooOOO0 oooOOO0 = new p188o00o0O.OooOOO0(arrayList3.size() + arrayList.size());
                    oooOOO0.addAll(arrayList);
                    oooOOO0.addAll(arrayList3);
                    arrayList3 = new ArrayList<>(oooOOO0);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            Iterator<String> it = arrayList3.iterator();
            while (it.hasNext()) {
                OooO.OooO00o(this.f33961OooO0O0, it.next());
            }
        }
        ArrayList<NotificationCompat$Action> arrayList4 = o00o0o2.f33943OooO0Oo;
        if (arrayList4.size() > 0) {
            if (o00o0o2.f33951OooOOO == null) {
                o00o0o2.f33951OooOOO = new Bundle();
            }
            Bundle bundle4 = o00o0o2.f33951OooOOO.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            int i8 = 0;
            while (i3 < arrayList4.size()) {
                String string = Integer.toString(i3);
                NotificationCompat$Action notificationCompat$Action2 = arrayList4.get(i3);
                Object obj = oo000o.f33982OooO00o;
                Bundle bundle7 = new Bundle();
                if (notificationCompat$Action2.f5256OooO0O0 == null && (i = notificationCompat$Action2.f5262OooO0oo) != 0) {
                    notificationCompat$Action2.f5256OooO0O0 = IconCompat.OooO0O0("", i);
                }
                IconCompat iconCompat2 = notificationCompat$Action2.f5256OooO0O0;
                bundle7.putInt("icon", iconCompat2 != null ? iconCompat2.OooO0OO() : i8);
                bundle7.putCharSequence(ShareConstants.WEB_DIALOG_PARAM_TITLE, notificationCompat$Action2.f5254OooO);
                bundle7.putParcelable("actionIntent", notificationCompat$Action2.f5263OooOO0);
                Bundle bundle8 = notificationCompat$Action2.f5255OooO00o;
                Bundle bundle9 = bundle8 != null ? new Bundle(bundle8) : new Bundle();
                bundle9.putBoolean("android.support.allowGeneratedReplies", notificationCompat$Action2.f5258OooO0Oo);
                bundle7.putBundle(AppLinks.KEY_NAME_EXTRAS, bundle9);
                androidx.core.app.RemoteInput[] remoteInputArr3 = notificationCompat$Action2.f5257OooO0OO;
                if (remoteInputArr3 == null) {
                    bundleArr = null;
                } else {
                    Bundle[] bundleArr2 = new Bundle[remoteInputArr3.length];
                    if (remoteInputArr3.length > 0) {
                        androidx.core.app.RemoteInput remoteInput2 = remoteInputArr3[0];
                        new Bundle();
                        throw null;
                    }
                    bundleArr = bundleArr2;
                }
                bundle7.putParcelableArray("remoteInputs", bundleArr);
                bundle7.putBoolean("showsUserInterface", notificationCompat$Action2.f5260OooO0o0);
                bundle7.putInt("semanticAction", notificationCompat$Action2.f5259OooO0o);
                bundle6.putBundle(string, bundle7);
                i3++;
                i8 = 0;
                arrayList4 = arrayList4;
            }
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (o00o0o2.f33951OooOOO == null) {
                o00o0o2.f33951OooOOO = new Bundle();
            }
            o00o0o2.f33951OooOOO.putBundle("android.car.EXTENSIONS", bundle4);
            this.f33963OooO0Oo.putBundle("android.car.EXTENSIONS", bundle5);
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 24) {
            OooO0OO.OooO00o(this.f33961OooO0O0, o00o0o2.f33951OooOOO);
            r5 = 0;
            OooOO0O.OooO0o0(this.f33961OooO0O0, null);
        } else {
            r5 = 0;
        }
        if (i9 >= 26) {
            OooOOO0.OooO0O0(this.f33961OooO0O0, 0);
            OooOOO0.OooO0o0(this.f33961OooO0O0, r5);
            OooOOO0.OooO0o(this.f33961OooO0O0, r5);
            OooOOO0.OooO0oO(this.f33961OooO0O0, 0L);
            OooOOO0.OooO0Oo(this.f33961OooO0O0, 0);
            if (!TextUtils.isEmpty(o00o0o2.f33956OooOOo0)) {
                this.f33961OooO0O0.setSound(r5).setDefaults(0).setLights(0, 0, 0).setVibrate(r5);
            }
        }
        if (i9 >= 28) {
            for (o0Oo0oo o0oo0oo3 : arrayList2) {
                Notification.Builder builder = this.f33961OooO0O0;
                o0oo0oo3.getClass();
                OooOOO.OooO00o(builder, o0Oo0oo.OooO00o.OooO0O0(o0oo0oo3));
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            OooOOOO.OooO00o(this.f33961OooO0O0, o00o0o2.f33955OooOOo);
            OooOOOO.OooO0O0(this.f33961OooO0O0, null);
        }
    }
}
