package o00000O;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.res.Resources;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.RemoteViews;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat$Action;
import androidx.core.app.NotificationCompat$CallStyle;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.bolts.AppLinks;
import com.facebook.share.internal.ShareConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class oo000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f33467OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Notification.Builder f33468OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00Oo0 f33469OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Bundle f33470OooO0Oo;

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
        public static Notification.Builder OooO0O0(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        @DoNotInline
        public static Notification.Builder OooO0OO(Notification.Builder builder, Object obj) {
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
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40, types: [android.net.Uri, java.lang.CharSequence, java.lang.String, long[]] */
    /* JADX WARN: Type inference failed for: r4v43 */
    public oo000o(o00Oo0 o00oo1) {
        ArrayList<o0Oo0oo> arrayList;
        ?? r4;
        ArrayList<o0Oo0oo> arrayList2;
        Bundle[] bundleArr;
        int i;
        ArrayList<String> arrayList3;
        oo000o oo000oVar = this;
        new ArrayList();
        oo000oVar.f33470OooO0Oo = new Bundle();
        oo000oVar.f33469OooO0OO = o00oo1;
        Context context = o00oo1.f33428OooO00o;
        oo000oVar.f33467OooO00o = context;
        if (Build.VERSION.SDK_INT >= 26) {
            oo000oVar.f33468OooO0O0 = OooOOO0.OooO00o(context, o00oo1.f33444OooOOo0);
        } else {
            oo000oVar.f33468OooO0O0 = new Notification.Builder(o00oo1.f33428OooO00o);
        }
        Notification notification = o00oo1.f33445OooOOoo;
        Resources resources = null;
        int i2 = 2;
        int i3 = 0;
        oo000oVar.f33468OooO0O0.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(o00oo1.f33433OooO0o0).setContentText(o00oo1.f33432OooO0o).setContentInfo(null).setContentIntent(o00oo1.f33434OooO0oO).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(o00oo1.f33427OooO).setProgress(0, 0, false);
        Notification.Builder builder = oo000oVar.f33468OooO0O0;
        IconCompat iconCompat = o00oo1.f33435OooO0oo;
        OooOO0.OooO0O0(builder, iconCompat == null ? null : IconCompat.OooO00o.OooO0o(iconCompat, context));
        OooO00o.OooO0O0(OooO00o.OooO0Oo(OooO00o.OooO0OO(oo000oVar.f33468OooO0O0, null), false), o00oo1.f33436OooOO0);
        o00Ooo o00ooo2 = o00oo1.f33438OooOO0o;
        if (o00ooo2 instanceof NotificationCompat$CallStyle) {
            NotificationCompat$CallStyle notificationCompat$CallStyle = (NotificationCompat$CallStyle) o00ooo2;
            int i4 = o00000O0.OooO0o.ic_call_decline;
            int i5 = o00000O0.OooOO0.call_notification_hang_up_action;
            int i6 = o00000O0.OooO0O0.call_notification_decline_color;
            Context context2 = notificationCompat$CallStyle.f33447OooO00o.f33428OooO00o;
            Object obj = ContextCompat.f5281OooO00o;
            Integer numValueOf = Integer.valueOf(ContextCompat.OooO0o.OooO00o(context2, i6));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) notificationCompat$CallStyle.f33447OooO00o.f33428OooO00o.getResources().getString(i5));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(numValueOf.intValue()), 0, spannableStringBuilder.length(), 18);
            IconCompat iconCompatOooO0O0 = IconCompat.OooO0O0(i4, notificationCompat$CallStyle.f33447OooO00o.f33428OooO00o);
            Bundle bundle = new Bundle();
            CharSequence charSequenceOooO0O0 = o00Oo0.OooO0O0(spannableStringBuilder);
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            NotificationCompat$Action notificationCompat$Action = new NotificationCompat$Action(iconCompatOooO0O0, charSequenceOooO0O0, null, bundle, arrayList5.isEmpty() ? null : (androidx.core.app.RemoteInput[]) arrayList5.toArray(new androidx.core.app.RemoteInput[arrayList5.size()]), arrayList4.isEmpty() ? null : (androidx.core.app.RemoteInput[]) arrayList4.toArray(new androidx.core.app.RemoteInput[arrayList4.size()]), true, 0, true, false, false);
            notificationCompat$Action.f5261OooO00o.putBoolean("key_action_priority", true);
            ArrayList arrayList6 = new ArrayList(3);
            arrayList6.add(notificationCompat$Action);
            ArrayList<NotificationCompat$Action> arrayList7 = notificationCompat$CallStyle.f33447OooO00o.f33429OooO0O0;
            if (arrayList7 != null) {
                for (NotificationCompat$Action notificationCompat$Action2 : arrayList7) {
                    if (notificationCompat$Action2.f5267OooO0oO) {
                        arrayList6.add(notificationCompat$Action2);
                    } else if (!notificationCompat$Action2.f5261OooO00o.getBoolean("key_action_priority") && i2 > 1) {
                        arrayList6.add(notificationCompat$Action2);
                        i2--;
                    }
                }
            }
            Iterator it = arrayList6.iterator();
            while (it.hasNext()) {
                oo000oVar.OooO00o((NotificationCompat$Action) it.next());
            }
        } else {
            Iterator<NotificationCompat$Action> it2 = o00oo1.f33429OooO0O0.iterator();
            while (it2.hasNext()) {
                oo000oVar.OooO00o(it2.next());
            }
        }
        Bundle bundle2 = o00oo1.f33439OooOOO;
        if (bundle2 != null) {
            oo000oVar.f33470OooO0Oo.putAll(bundle2);
        }
        int i7 = Build.VERSION.SDK_INT;
        OooO0O0.OooO00o(oo000oVar.f33468OooO0O0, o00oo1.f33437OooOO0O);
        OooO0o.OooO(oo000oVar.f33468OooO0O0, o00oo1.f33440OooOOO0);
        OooO0o.OooO0oO(oo000oVar.f33468OooO0O0, null);
        OooO0o.OooOO0(oo000oVar.f33468OooO0O0, null);
        OooO0o.OooO0oo(oo000oVar.f33468OooO0O0, false);
        OooO.OooO0O0(oo000oVar.f33468OooO0O0, null);
        OooO.OooO0OO(oo000oVar.f33468OooO0O0, o00oo1.f33441OooOOOO);
        OooO.OooO0o(oo000oVar.f33468OooO0O0, o00oo1.f33442OooOOOo);
        OooO.OooO0Oo(oo000oVar.f33468OooO0O0, null);
        OooO.OooO0o0(oo000oVar.f33468OooO0O0, notification.sound, notification.audioAttributes);
        ArrayList<o0Oo0oo> arrayList8 = o00oo1.f33430OooO0OO;
        ArrayList<String> arrayList9 = o00oo1.f33446OooOo00;
        String str = "";
        if (i7 < 28) {
            if (arrayList8 == null) {
                arrayList3 = null;
            } else {
                arrayList3 = new ArrayList<>(arrayList8.size());
                for (o0Oo0oo o0oo0oo2 : arrayList8) {
                    String str2 = o0oo0oo2.f33454OooO0OO;
                    if (str2 == null) {
                        CharSequence charSequence = o0oo0oo2.f33452OooO00o;
                        str2 = charSequence != null ? "name:" + ((Object) charSequence) : "";
                    }
                    arrayList3.add(str2);
                }
            }
            if (arrayList3 != null) {
                if (arrayList9 != null) {
                    p190o00o0O.OooOO0O oooOO0O = new p190o00o0O.OooOO0O(arrayList9.size() + arrayList3.size());
                    oooOO0O.addAll(arrayList3);
                    oooOO0O.addAll(arrayList9);
                    arrayList3 = new ArrayList<>(oooOO0O);
                }
                arrayList9 = arrayList3;
            }
        }
        if (arrayList9 != null && !arrayList9.isEmpty()) {
            Iterator<String> it3 = arrayList9.iterator();
            while (it3.hasNext()) {
                OooO.OooO00o(oo000oVar.f33468OooO0O0, it3.next());
            }
        }
        ArrayList<NotificationCompat$Action> arrayList10 = o00oo1.f33431OooO0Oo;
        if (arrayList10.size() > 0) {
            if (o00oo1.f33439OooOOO == null) {
                o00oo1.f33439OooOOO = new Bundle();
            }
            Bundle bundle3 = o00oo1.f33439OooOOO.getBundle("android.car.EXTENSIONS");
            bundle3 = bundle3 == null ? new Bundle() : bundle3;
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            int i8 = 0;
            while (i3 < arrayList10.size()) {
                String string = Integer.toString(i3);
                NotificationCompat$Action notificationCompat$Action3 = arrayList10.get(i3);
                Object obj2 = o00oO0o.f33448OooO00o;
                Bundle bundle6 = new Bundle();
                if (notificationCompat$Action3.f5262OooO0O0 == null && (i = notificationCompat$Action3.f5268OooO0oo) != 0) {
                    notificationCompat$Action3.f5262OooO0O0 = IconCompat.OooO0OO(resources, str, i);
                }
                IconCompat iconCompat2 = notificationCompat$Action3.f5262OooO0O0;
                bundle6.putInt("icon", iconCompat2 != null ? iconCompat2.OooO0Oo() : i8);
                bundle6.putCharSequence(ShareConstants.WEB_DIALOG_PARAM_TITLE, notificationCompat$Action3.f5260OooO);
                bundle6.putParcelable("actionIntent", notificationCompat$Action3.f5269OooOO0);
                Bundle bundle7 = notificationCompat$Action3.f5261OooO00o;
                Bundle bundle8 = bundle7 != null ? new Bundle(bundle7) : new Bundle();
                bundle8.putBoolean("android.support.allowGeneratedReplies", notificationCompat$Action3.f5264OooO0Oo);
                bundle6.putBundle(AppLinks.KEY_NAME_EXTRAS, bundle8);
                androidx.core.app.RemoteInput[] remoteInputArr = notificationCompat$Action3.f5263OooO0OO;
                if (remoteInputArr == null) {
                    bundleArr = null;
                    arrayList2 = arrayList8;
                } else {
                    Bundle[] bundleArr2 = new Bundle[remoteInputArr.length];
                    int i9 = 0;
                    while (i9 < remoteInputArr.length) {
                        androidx.core.app.RemoteInput remoteInput = remoteInputArr[i9];
                        androidx.core.app.RemoteInput[] remoteInputArr2 = remoteInputArr;
                        Bundle bundle9 = new Bundle();
                        remoteInput.getClass();
                        bundle9.putString("resultKey", null);
                        bundle9.putCharSequence("label", null);
                        bundle9.putCharSequenceArray("choices", null);
                        bundle9.putBoolean("allowFreeFormInput", false);
                        bundle9.putBundle(AppLinks.KEY_NAME_EXTRAS, null);
                        bundleArr2[i9] = bundle9;
                        i9++;
                        remoteInputArr = remoteInputArr2;
                        arrayList8 = arrayList8;
                    }
                    arrayList2 = arrayList8;
                    bundleArr = bundleArr2;
                }
                bundle6.putParcelableArray("remoteInputs", bundleArr);
                bundle6.putBoolean("showsUserInterface", notificationCompat$Action3.f5266OooO0o0);
                bundle6.putInt("semanticAction", notificationCompat$Action3.f5265OooO0o);
                bundle5.putBundle(string, bundle6);
                i3++;
                resources = null;
                i8 = 0;
                str = str;
                arrayList10 = arrayList10;
                arrayList8 = arrayList2;
            }
            arrayList = arrayList8;
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            if (o00oo1.f33439OooOOO == null) {
                o00oo1.f33439OooOOO = new Bundle();
            }
            o00oo1.f33439OooOOO.putBundle("android.car.EXTENSIONS", bundle3);
            oo000oVar = this;
            oo000oVar.f33470OooO0Oo.putBundle("android.car.EXTENSIONS", bundle4);
        } else {
            arrayList = arrayList8;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            OooO0OO.OooO00o(oo000oVar.f33468OooO0O0, o00oo1.f33439OooOOO);
            r4 = 0;
            OooOO0O.OooO0o0(oo000oVar.f33468OooO0O0, null);
        } else {
            r4 = 0;
        }
        if (i10 >= 26) {
            OooOOO0.OooO0O0(oo000oVar.f33468OooO0O0, 0);
            OooOOO0.OooO0o0(oo000oVar.f33468OooO0O0, r4);
            OooOOO0.OooO0o(oo000oVar.f33468OooO0O0, r4);
            OooOOO0.OooO0oO(oo000oVar.f33468OooO0O0, 0L);
            OooOOO0.OooO0Oo(oo000oVar.f33468OooO0O0, 0);
            if (!TextUtils.isEmpty(o00oo1.f33444OooOOo0)) {
                oo000oVar.f33468OooO0O0.setSound(r4).setDefaults(0).setLights(0, 0, 0).setVibrate(r4);
            }
        }
        if (i10 >= 28) {
            for (o0Oo0oo o0oo0oo3 : arrayList) {
                Notification.Builder builder2 = oo000oVar.f33468OooO0O0;
                o0oo0oo3.getClass();
                OooOOO.OooO00o(builder2, o0Oo0oo.OooO00o.OooO0O0(o0oo0oo3));
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            OooOOOO.OooO00o(oo000oVar.f33468OooO0O0, o00oo1.f33443OooOOo);
            OooOOOO.OooO0O0(oo000oVar.f33468OooO0O0, null);
        }
    }

    public final void OooO00o(NotificationCompat$Action notificationCompat$Action) {
        int i;
        if (notificationCompat$Action.f5262OooO0O0 == null && (i = notificationCompat$Action.f5268OooO0oo) != 0) {
            notificationCompat$Action.f5262OooO0O0 = IconCompat.OooO0OO(null, "", i);
        }
        IconCompat iconCompat = notificationCompat$Action.f5262OooO0O0;
        Notification.Action.Builder builderOooO00o = OooOO0.OooO00o(iconCompat != null ? IconCompat.OooO00o.OooO0o(iconCompat, null) : null, notificationCompat$Action.f5260OooO, notificationCompat$Action.f5269OooOO0);
        androidx.core.app.RemoteInput[] remoteInputArr = notificationCompat$Action.f5263OooO0OO;
        if (remoteInputArr != null) {
            RemoteInput[] remoteInputArr2 = new RemoteInput[remoteInputArr.length];
            for (int i2 = 0; i2 < remoteInputArr.length; i2++) {
                remoteInputArr2[i2] = androidx.core.app.RemoteInput.OooO00o(remoteInputArr[i2]);
            }
            for (RemoteInput remoteInput : remoteInputArr2) {
                OooO0o.OooO0OO(builderOooO00o, remoteInput);
            }
        }
        Bundle bundle = notificationCompat$Action.f5261OooO00o;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        boolean z = notificationCompat$Action.f5264OooO0Oo;
        bundle2.putBoolean("android.support.allowGeneratedReplies", z);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 24) {
            OooOO0O.OooO00o(builderOooO00o, z);
        }
        int i4 = notificationCompat$Action.f5265OooO0o;
        bundle2.putInt("android.support.action.semanticAction", i4);
        if (i3 >= 28) {
            OooOOO.OooO0O0(builderOooO00o, i4);
        }
        if (i3 >= 29) {
            OooOOOO.OooO0OO(builderOooO00o, notificationCompat$Action.f5267OooO0oO);
        }
        if (i3 >= 31) {
            OooOo00.OooO00o(builderOooO00o, notificationCompat$Action.f5270OooOO0O);
        }
        bundle2.putBoolean("android.support.action.showsUserInterface", notificationCompat$Action.f5266OooO0o0);
        OooO0o.OooO0O0(builderOooO00o, bundle2);
        OooO0o.OooO00o(this.f33468OooO0O0, OooO0o.OooO0Oo(builderOooO00o));
    }
}
