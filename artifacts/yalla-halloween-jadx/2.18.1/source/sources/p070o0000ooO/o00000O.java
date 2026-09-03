package p070o0000ooO;

import OooO00o.OooO00o;
import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat$Action;
import androidx.core.app.RemoteInput;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.bolts.AppLinks;
import com.facebook.share.internal.ShareConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p021OooOooo.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class o00000O implements o000OOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f27976OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Notification.Builder f27977OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00000 f27978OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<Bundle> f27979OooO0Oo = new ArrayList();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Bundle f27980OooO0o0 = new Bundle();

    public o00000O(o00000 o00000Var) {
        this.f27978OooO0OO = o00000Var;
        this.f27976OooO00o = o00000Var.f27953OooO00o;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f27977OooO0O0 = new Notification.Builder(o00000Var.f27953OooO00o, o00000Var.f27969OooOOo0);
        } else {
            this.f27977OooO0O0 = new Notification.Builder(o00000Var.f27953OooO00o);
        }
        Notification notification = o00000Var.f27970OooOOoo;
        this.f27977OooO0O0.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(o00000Var.f27958OooO0o0).setContentText(o00000Var.f27957OooO0o).setContentInfo(null).setContentIntent(o00000Var.f27959OooO0oO).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setLargeIcon(o00000Var.f27960OooO0oo).setNumber(o00000Var.f27952OooO).setProgress(0, 0, false);
        this.f27977OooO0O0.setSubText(null).setUsesChronometer(false).setPriority(o00000Var.f27961OooOO0);
        for (NotificationCompat$Action notificationCompat$Action : o00000Var.f27954OooO0O0) {
            int i = Build.VERSION.SDK_INT;
            IconCompat iconCompatOooO00o = notificationCompat$Action.OooO00o();
            Notification.Action.Builder builder = i >= 23 ? new Notification.Action.Builder(iconCompatOooO00o != null ? iconCompatOooO00o.OooO0o0() : null, notificationCompat$Action.f7805OooOO0, notificationCompat$Action.f7806OooOO0O) : new Notification.Action.Builder(iconCompatOooO00o != null ? iconCompatOooO00o.OooO0OO() : 0, notificationCompat$Action.f7805OooOO0, notificationCompat$Action.f7806OooOO0O);
            RemoteInput[] remoteInputArr = notificationCompat$Action.f7799OooO0OO;
            if (remoteInputArr != null) {
                int length = remoteInputArr.length;
                android.app.RemoteInput[] remoteInputArr2 = new android.app.RemoteInput[length];
                if (remoteInputArr.length > 0) {
                    RemoteInput remoteInput = remoteInputArr[0];
                    throw null;
                }
                for (int i2 = 0; i2 < length; i2++) {
                    builder.addRemoteInput(remoteInputArr2[i2]);
                }
            }
            Bundle bundle = notificationCompat$Action.f7797OooO00o != null ? new Bundle(notificationCompat$Action.f7797OooO00o) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", notificationCompat$Action.f7802OooO0o0);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 24) {
                builder.setAllowGeneratedReplies(notificationCompat$Action.f7802OooO0o0);
            }
            bundle.putInt("android.support.action.semanticAction", notificationCompat$Action.f7803OooO0oO);
            if (i3 >= 28) {
                builder.setSemanticAction(notificationCompat$Action.f7803OooO0oO);
            }
            if (i3 >= 29) {
                builder.setContextual(notificationCompat$Action.f7804OooO0oo);
            }
            if (i3 >= 31) {
                builder.setAuthenticationRequired(notificationCompat$Action.f7807OooOO0o);
            }
            bundle.putBoolean("android.support.action.showsUserInterface", notificationCompat$Action.f7801OooO0o);
            builder.addExtras(bundle);
            this.f27977OooO0O0.addAction(builder.build());
        }
        Bundle bundle2 = o00000Var.f27964OooOOO;
        if (bundle2 != null) {
            this.f27980OooO0o0.putAll(bundle2);
        }
        int i4 = Build.VERSION.SDK_INT;
        this.f27977OooO0O0.setShowWhen(o00000Var.f27962OooOO0O);
        this.f27977OooO0O0.setLocalOnly(o00000Var.f27965OooOOO0).setGroup(null).setGroupSummary(false).setSortKey(null);
        this.f27977OooO0O0.setCategory(null).setColor(o00000Var.f27966OooOOOO).setVisibility(o00000Var.f27967OooOOOo).setPublicVersion(null).setSound(notification.sound, notification.audioAttributes);
        List listOooO00o = i4 < 28 ? OooO00o(OooO0O0(o00000Var.f27955OooO0OO), o00000Var.f27971OooOo00) : o00000Var.f27971OooOo00;
        if (listOooO00o != null && !listOooO00o.isEmpty()) {
            Iterator it = listOooO00o.iterator();
            while (it.hasNext()) {
                this.f27977OooO0O0.addPerson((String) it.next());
            }
        }
        if (o00000Var.f27956OooO0Oo.size() > 0) {
            if (o00000Var.f27964OooOOO == null) {
                o00000Var.f27964OooOOO = new Bundle();
            }
            Bundle bundle3 = o00000Var.f27964OooOOO.getBundle("android.car.EXTENSIONS");
            bundle3 = bundle3 == null ? new Bundle() : bundle3;
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            for (int i5 = 0; i5 < o00000Var.f27956OooO0Oo.size(); i5++) {
                String string = Integer.toString(i5);
                NotificationCompat$Action notificationCompat$Action2 = o00000Var.f27956OooO0Oo.get(i5);
                Object obj = o00000OO.f27982OooO00o;
                Bundle bundle6 = new Bundle();
                IconCompat iconCompatOooO00o2 = notificationCompat$Action2.OooO00o();
                bundle6.putInt("icon", iconCompatOooO00o2 != null ? iconCompatOooO00o2.OooO0OO() : 0);
                bundle6.putCharSequence(ShareConstants.WEB_DIALOG_PARAM_TITLE, notificationCompat$Action2.f7805OooOO0);
                bundle6.putParcelable("actionIntent", notificationCompat$Action2.f7806OooOO0O);
                Bundle bundle7 = notificationCompat$Action2.f7797OooO00o != null ? new Bundle(notificationCompat$Action2.f7797OooO00o) : new Bundle();
                bundle7.putBoolean("android.support.allowGeneratedReplies", notificationCompat$Action2.f7802OooO0o0);
                bundle6.putBundle(AppLinks.KEY_NAME_EXTRAS, bundle7);
                bundle6.putParcelableArray("remoteInputs", o00000OO.OooO00o(notificationCompat$Action2.f7799OooO0OO));
                bundle6.putBoolean("showsUserInterface", notificationCompat$Action2.f7801OooO0o);
                bundle6.putInt("semanticAction", notificationCompat$Action2.f7803OooO0oO);
                bundle5.putBundle(string, bundle6);
            }
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            if (o00000Var.f27964OooOOO == null) {
                o00000Var.f27964OooOOO = new Bundle();
            }
            o00000Var.f27964OooOOO.putBundle("android.car.EXTENSIONS", bundle3);
            this.f27980OooO0o0.putBundle("android.car.EXTENSIONS", bundle4);
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 24) {
            this.f27977OooO0O0.setExtras(o00000Var.f27964OooOOO).setRemoteInputHistory(null);
        }
        if (i6 >= 26) {
            this.f27977OooO0O0.setBadgeIconType(0).setSettingsText(null).setShortcutId(null).setTimeoutAfter(0L).setGroupAlertBehavior(0);
            if (!TextUtils.isEmpty(o00000Var.f27969OooOOo0)) {
                this.f27977OooO0O0.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i6 >= 28) {
            for (o0000oo o0000ooVar : o00000Var.f27955OooO0OO) {
                Notification.Builder builder2 = this.f27977OooO0O0;
                Objects.requireNonNull(o0000ooVar);
                builder2.addPerson(o0000oo.OooO00o.OooO0O0(o0000ooVar));
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f27977OooO0O0.setAllowSystemGeneratedContextualActions(o00000Var.f27968OooOOo);
            this.f27977OooO0O0.setBubbleMetadata(null);
        }
    }

    @Nullable
    public static List<String> OooO00o(@Nullable List<String> list, @Nullable List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        o0OoOo0 o0oooo1 = new o0OoOo0(list2.size() + list.size());
        o0oooo1.addAll(list);
        o0oooo1.addAll(list2);
        return new ArrayList(o0oooo1);
    }

    @Nullable
    public static List<String> OooO0O0(@Nullable List<o0000oo> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (o0000oo o0000ooVar : list) {
            String string = o0000ooVar.f27988OooO0OO;
            if (string == null) {
                if (o0000ooVar.f27986OooO00o != null) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO0o0("name:");
                    sbOooO0o0.append((Object) o0000ooVar.f27986OooO00o);
                    string = sbOooO0o0.toString();
                } else {
                    string = "";
                }
            }
            arrayList.add(string);
        }
        return arrayList;
    }
}
