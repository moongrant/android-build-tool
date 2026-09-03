package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.datatransport.Priority;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import o0O0O0Oo.OooOO0;
import p286o0O0O0oO.o0O0O00;
import p302o0O0o00.o000OOo0;
import p351o0OOOOo.OooOOO;
import p381o0OOoOOO.o00O;
import p381o0OOoOOO.o00O0OOO;
import p381o0OOoOOO.o00OO;
import p381o0OOoOOO.o0O0ooO;
import p383o0OOoOo0.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseMessagingService extends EnhancedIntentService {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    public static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    public static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    public static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);

    private boolean alreadyReceivedMessage(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = recentlyReceivedMessageIds;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        }
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        Log.d("FirebaseMessaging", "Received duplicate message: " + str);
        return true;
    }

    private void dispatchMessage(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (o00O.OooO0o(extras)) {
            o00O o00o2 = new o00O(extras);
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Network-Io"));
            try {
                if (new o0O0ooO(this, o00o2, executorServiceNewSingleThreadExecutor).OooO00o()) {
                    executorServiceNewSingleThreadExecutor.shutdown();
                    return;
                } else {
                    executorServiceNewSingleThreadExecutor.shutdown();
                    if (o00O0OOO.OooO0O0(intent)) {
                        o00O0OOO.OooO00o("_nf", intent.getExtras());
                    }
                }
            } catch (Throwable th) {
                executorServiceNewSingleThreadExecutor.shutdown();
                throw th;
            }
        }
        onMessageReceived(new RemoteMessage(extras));
    }

    private String getMessageId(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    private void handleMessageIntent(Intent intent) {
        if (alreadyReceivedMessage(intent.getStringExtra("google.message_id"))) {
            return;
        }
        passMessageIntentToSdk(intent);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:102:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:105:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:106:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:119:0x0203  */
    /* JADX WARN: Code duplicated, block: B:125:0x021f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0229  */
    /* JADX WARN: Code duplicated, block: B:135:0x023c  */
    /* JADX WARN: Code duplicated, block: B:138:0x0241  */
    /* JADX WARN: Code duplicated, block: B:139:0x0243  */
    /* JADX WARN: Code duplicated, block: B:156:0x0232 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x01db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0214 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x01f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x0146 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:78:0x0179  */
    /* JADX WARN: Code duplicated, block: B:79:0x017c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0185  */
    /* JADX WARN: Code duplicated, block: B:84:0x018d  */
    /* JADX WARN: Code duplicated, block: B:85:0x018f  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:98:0x01b5  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void passMessageIntentToSdk(Intent intent) {
        boolean z;
        int iIntValue;
        int i;
        String string;
        MessagingClientEvent.MessageType messageType;
        String string2;
        String str;
        String string3;
        String str2;
        String string4;
        String str3;
        String string5;
        String str4;
        String string6;
        String str5;
        long j;
        long j2;
        OooOOO oooOOOOooO0OO;
        String str6;
        String str7;
        String[] strArrSplit;
        String str8;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        byte b = -1;
        switch (stringExtra.hashCode()) {
            case -2062414158:
                if (stringExtra.equals("deleted_messages")) {
                    b = 0;
                }
                break;
            case 102161:
                if (stringExtra.equals("gcm")) {
                    b = 1;
                }
                break;
            case 814694033:
                if (stringExtra.equals("send_error")) {
                    b = 2;
                }
                break;
            case 814800675:
                if (stringExtra.equals("send_event")) {
                    b = 3;
                }
                break;
        }
        if (b == 0) {
            onDeletedMessages();
            return;
        }
        if (b != 1) {
            if (b == 2) {
                onSendError(getMessageId(intent), new SendException(intent.getStringExtra("error")));
                return;
            }
            if (b == 3) {
                onMessageSent(intent.getStringExtra("google.message_id"));
                return;
            }
            Log.w("FirebaseMessaging", "Received message with unknown type: " + stringExtra);
            return;
        }
        if (o00O0OOO.OooO0O0(intent)) {
            o00O0OOO.OooO00o("_nr", intent.getExtras());
        }
        if (ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction())) {
            z = false;
        } else {
            try {
                OooOOO.OooO0OO();
                OooOOO oooOOOOooO0OO2 = OooOOO.OooO0OO();
                oooOOOOooO0OO2.OooO00o();
                Context context = oooOOOOooO0OO2.f38263OooO00o;
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
                if (sharedPreferences.contains("export_to_big_query")) {
                    z = sharedPreferences.getBoolean("export_to_big_query", false);
                } else {
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                            z = false;
                        } else {
                            z = applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
            } catch (IllegalStateException unused2) {
                Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            }
        }
        if (z) {
            MessagingClientEvent.Event event = MessagingClientEvent.Event.MESSAGE_DELIVERED;
            OooOO0 oooOO1 = FirebaseMessaging.f19172OooOOOO;
            if (oooOO1 == null) {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            } else {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                Object obj = extras.get("google.ttl");
                try {
                    if (obj instanceof Integer) {
                        iIntValue = ((Integer) obj).intValue();
                    } else {
                        if (obj instanceof String) {
                            try {
                                iIntValue = Integer.parseInt((String) obj);
                            } catch (NumberFormatException unused3) {
                                Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                                i = 0;
                            }
                        }
                        i = 0;
                        string = extras.getString("google.to");
                        if (TextUtils.isEmpty(string)) {
                            try {
                                OooOOO oooOOOOooO0OO3 = OooOOO.OooO0OO();
                                Object obj2 = com.google.firebase.installations.OooO00o.f19120OooOOO0;
                                Preconditions.checkArgument(true, "Null is not a valid value of FirebaseApp.");
                                string = (String) Tasks.await(((com.google.firebase.installations.OooO00o) oooOOOOooO0OO3.OooO0O0(p377o0OOoO00.OooOOO.class)).getId());
                            } catch (InterruptedException | ExecutionException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        String str9 = string;
                        OooOOO oooOOOOooO0OO4 = OooOOO.OooO0OO();
                        oooOOOOooO0OO4.OooO00o();
                        String packageName = oooOOOOooO0OO4.f38263OooO00o.getPackageName();
                        MessagingClientEvent.SDKPlatform sDKPlatform = MessagingClientEvent.SDKPlatform.ANDROID;
                        if (o00O.OooO0o(extras)) {
                            messageType = MessagingClientEvent.MessageType.DISPLAY_NOTIFICATION;
                        } else {
                            messageType = MessagingClientEvent.MessageType.DATA_MESSAGE;
                        }
                        MessagingClientEvent.MessageType messageType2 = messageType;
                        string2 = extras.getString("google.message_id");
                        if (string2 == null) {
                            string2 = extras.getString("message_id");
                        }
                        if (string2 != null) {
                            str = string2;
                        } else {
                            str = "";
                        }
                        string3 = extras.getString("from");
                        if (string3 != null || !string3.startsWith("/topics/")) {
                            string3 = null;
                        }
                        if (string3 != null) {
                            str2 = string3;
                        } else {
                            str2 = "";
                        }
                        string4 = extras.getString("collapse_key");
                        if (string4 != null) {
                            str3 = string4;
                        } else {
                            str3 = "";
                        }
                        string5 = extras.getString("google.c.a.m_l");
                        if (string5 != null) {
                            str4 = string5;
                        } else {
                            str4 = "";
                        }
                        string6 = extras.getString("google.c.a.c_l");
                        if (string6 != null) {
                            str5 = string6;
                        } else {
                            str5 = "";
                        }
                        if (extras.containsKey("google.c.sender.id")) {
                            try {
                                j = Long.parseLong(extras.getString("google.c.sender.id"));
                            } catch (NumberFormatException e2) {
                                Log.w("FirebaseMessaging", "error parsing project number", e2);
                                oooOOOOooO0OO = OooOOO.OooO0OO();
                                oooOOOOooO0OO.OooO00o();
                                str6 = oooOOOOooO0OO.f38265OooO0OO.f38287OooO0o0;
                                if (str6 != null) {
                                    try {
                                        j = Long.parseLong(str6);
                                    } catch (NumberFormatException e3) {
                                        Log.w("FirebaseMessaging", "error parsing sender ID", e3);
                                        oooOOOOooO0OO.OooO00o();
                                        str7 = oooOOOOooO0OO.f38265OooO0OO.f38283OooO0O0;
                                        if (str7.startsWith("1:")) {
                                            strArrSplit = str7.split(CertificateUtil.DELIMITER);
                                            if (strArrSplit.length < 2) {
                                                j = 0;
                                            } else {
                                                str8 = strArrSplit[1];
                                                if (str8.isEmpty()) {
                                                    j = 0;
                                                } else {
                                                    try {
                                                        j = Long.parseLong(str8);
                                                    } catch (NumberFormatException e4) {
                                                        Log.w("FirebaseMessaging", "error parsing app ID", e4);
                                                        j = 0;
                                                    }
                                                }
                                            }
                                        } else {
                                            try {
                                                j = Long.parseLong(str7);
                                            } catch (NumberFormatException e5) {
                                                Log.w("FirebaseMessaging", "error parsing app ID", e5);
                                                j = 0;
                                            }
                                        }
                                    }
                                } else {
                                    oooOOOOooO0OO.OooO00o();
                                    str7 = oooOOOOooO0OO.f38265OooO0OO.f38283OooO0O0;
                                    if (str7.startsWith("1:")) {
                                        j = Long.parseLong(str7);
                                    } else {
                                        strArrSplit = str7.split(CertificateUtil.DELIMITER);
                                        if (strArrSplit.length < 2) {
                                            j = 0;
                                        } else {
                                            str8 = strArrSplit[1];
                                            if (str8.isEmpty()) {
                                                j = 0;
                                            } else {
                                                j = Long.parseLong(str8);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            oooOOOOooO0OO = OooOOO.OooO0OO();
                            oooOOOOooO0OO.OooO00o();
                            str6 = oooOOOOooO0OO.f38265OooO0OO.f38287OooO0o0;
                            if (str6 != null) {
                                j = Long.parseLong(str6);
                            } else {
                                oooOOOOooO0OO.OooO00o();
                                str7 = oooOOOOooO0OO.f38265OooO0OO.f38283OooO0O0;
                                if (str7.startsWith("1:")) {
                                    j = Long.parseLong(str7);
                                } else {
                                    strArrSplit = str7.split(CertificateUtil.DELIMITER);
                                    if (strArrSplit.length < 2) {
                                        j = 0;
                                    } else {
                                        str8 = strArrSplit[1];
                                        if (str8.isEmpty()) {
                                            j = 0;
                                        } else {
                                            j = Long.parseLong(str8);
                                        }
                                    }
                                }
                            }
                        }
                        if (j > 0) {
                            j2 = j;
                        } else {
                            j2 = 0;
                        }
                        ((o0O0O00) oooOO1.OooO00o("FCM_CLIENT_EVENT_LOGGING", new o0O0O0Oo.OooO0O0("proto"), o000OOo0.f36073OooO0Oo)).OooO00o(new o0O0O0Oo.OooO00o(new o0OoOo0(new MessagingClientEvent(j2, str, str9, messageType2, sDKPlatform, packageName, str3, i, str2, event, str4, str5)), Priority.DEFAULT), com.facebook.OooOOO.f12694OooO0o0);
                    }
                    ((o0O0O00) oooOO1.OooO00o("FCM_CLIENT_EVENT_LOGGING", new o0O0O0Oo.OooO0O0("proto"), o000OOo0.f36073OooO0Oo)).OooO00o(new o0O0O0Oo.OooO00o(new o0OoOo0(new MessagingClientEvent(j2, str, str9, messageType2, sDKPlatform, packageName, str3, i, str2, event, str4, str5)), Priority.DEFAULT), com.facebook.OooOOO.f12694OooO0o0);
                } catch (RuntimeException e6) {
                    Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e6);
                }
                i = iIntValue;
                string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                    OooOOO oooOOOOooO0OO5 = OooOOO.OooO0OO();
                    Object obj3 = com.google.firebase.installations.OooO00o.f19120OooOOO0;
                    Preconditions.checkArgument(true, "Null is not a valid value of FirebaseApp.");
                    string = (String) Tasks.await(((com.google.firebase.installations.OooO00o) oooOOOOooO0OO5.OooO0O0(p377o0OOoO00.OooOOO.class)).getId());
                }
                String str10 = string;
                OooOOO oooOOOOooO0OO6 = OooOOO.OooO0OO();
                oooOOOOooO0OO6.OooO00o();
                String packageName2 = oooOOOOooO0OO6.f38263OooO00o.getPackageName();
                MessagingClientEvent.SDKPlatform sDKPlatform2 = MessagingClientEvent.SDKPlatform.ANDROID;
                if (o00O.OooO0o(extras)) {
                    messageType = MessagingClientEvent.MessageType.DISPLAY_NOTIFICATION;
                } else {
                    messageType = MessagingClientEvent.MessageType.DATA_MESSAGE;
                }
                MessagingClientEvent.MessageType messageType3 = messageType;
                string2 = extras.getString("google.message_id");
                if (string2 == null) {
                    string2 = extras.getString("message_id");
                }
                if (string2 != null) {
                    str = string2;
                } else {
                    str = "";
                }
                string3 = extras.getString("from");
                if (string3 != null) {
                    string3 = null;
                } else {
                    string3 = null;
                }
                if (string3 != null) {
                    str2 = string3;
                } else {
                    str2 = "";
                }
                string4 = extras.getString("collapse_key");
                if (string4 != null) {
                    str3 = string4;
                } else {
                    str3 = "";
                }
                string5 = extras.getString("google.c.a.m_l");
                if (string5 != null) {
                    str4 = string5;
                } else {
                    str4 = "";
                }
                string6 = extras.getString("google.c.a.c_l");
                if (string6 != null) {
                    str5 = string6;
                } else {
                    str5 = "";
                }
                if (extras.containsKey("google.c.sender.id")) {
                    j = Long.parseLong(extras.getString("google.c.sender.id"));
                } else {
                    oooOOOOooO0OO = OooOOO.OooO0OO();
                    oooOOOOooO0OO.OooO00o();
                    str6 = oooOOOOooO0OO.f38265OooO0OO.f38287OooO0o0;
                    if (str6 != null) {
                        j = Long.parseLong(str6);
                    } else {
                        oooOOOOooO0OO.OooO00o();
                        str7 = oooOOOOooO0OO.f38265OooO0OO.f38283OooO0O0;
                        if (str7.startsWith("1:")) {
                            j = Long.parseLong(str7);
                        } else {
                            strArrSplit = str7.split(CertificateUtil.DELIMITER);
                            if (strArrSplit.length < 2) {
                                j = 0;
                            } else {
                                str8 = strArrSplit[1];
                                if (str8.isEmpty()) {
                                    j = 0;
                                } else {
                                    j = Long.parseLong(str8);
                                }
                            }
                        }
                    }
                }
                if (j > 0) {
                    j2 = j;
                } else {
                    j2 = 0;
                }
            }
        }
        dispatchMessage(intent);
    }

    @VisibleForTesting
    public static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayDeque, java.util.Queue<android.content.Intent>] */
    @Override // com.google.firebase.messaging.EnhancedIntentService
    public Intent getStartCommandIntent(Intent intent) {
        return (Intent) o00OO.OooO00o().f38772OooO0Oo.poll();
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    public void handleIntent(Intent intent) {
        String action = intent.getAction();
        if (ACTION_REMOTE_INTENT.equals(action) || ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
            handleMessageIntent(intent);
        } else {
            if (ACTION_NEW_TOKEN.equals(action)) {
                onNewToken(intent.getStringExtra(EXTRA_TOKEN));
                return;
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Unknown intent action: ");
            sbOooO0o0.append(intent.getAction());
            Log.d("FirebaseMessaging", sbOooO0o0.toString());
        }
    }

    @WorkerThread
    public void onDeletedMessages() {
    }

    @WorkerThread
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
    }

    @WorkerThread
    public void onMessageSent(@NonNull String str) {
    }

    @WorkerThread
    public void onNewToken(@NonNull String str) {
    }

    @WorkerThread
    public void onSendError(@NonNull String str, @NonNull Exception exc) {
    }
}
