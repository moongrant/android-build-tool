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

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseMessagingService extends EnhancedIntentService {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
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
        if (o000OOo.OooO0o(extras)) {
            o000OOo o000ooo2 = new o000OOo(extras);
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Network-Io"));
            try {
                if (new OooOOOO(this, o000ooo2, executorServiceNewSingleThreadExecutor).OooO00o()) {
                    executorServiceNewSingleThreadExecutor.shutdown();
                    return;
                } else {
                    executorServiceNewSingleThreadExecutor.shutdown();
                    if (oo0o0Oo.OooO0O0(intent)) {
                        oo0o0Oo.OooO00o(intent.getExtras(), "_nf");
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:120:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:126:0x020d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0217  */
    /* JADX WARN: Code duplicated, block: B:136:0x022a  */
    /* JADX WARN: Code duplicated, block: B:155:0x0220 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x0202 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x01e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:55:0x00df  */
    private void passMessageIntentToSdk(Intent intent) {
        byte b;
        boolean z;
        long j;
        p281o0O0O0oO.OooOO0 oooOO0OooO0OO;
        p281o0O0O0oO.OooOOO0 oooOOO0;
        String str;
        String str2;
        String[] strArrSplit;
        String str3;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        int iIntValue = 0;
        switch (stringExtra) {
            case "deleted_messages":
                b = 0;
                break;
            case "gcm":
                b = 1;
                break;
            case "send_error":
                b = 2;
                break;
            case "send_event":
                b = 3;
                break;
            default:
                b = -1;
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
            } else if (b != 3) {
                Log.w("FirebaseMessaging", "Received message with unknown type: ".concat(stringExtra));
                return;
            } else {
                onMessageSent(intent.getStringExtra("google.message_id"));
                return;
            }
        }
        if (oo0o0Oo.OooO0O0(intent)) {
            oo0o0Oo.OooO00o(intent.getExtras(), "_nr");
        }
        if ("com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) {
            z = false;
        } else {
            try {
                p281o0O0O0oO.OooOO0.OooO0OO();
                p281o0O0O0oO.OooOO0 oooOO0OooO0OO2 = p281o0O0O0oO.OooOO0.OooO0OO();
                oooOO0OooO0OO2.OooO00o();
                Context context = oooOO0OooO0OO2.f41949OooO00o;
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
            p176o00o0.o0OoOo0 o0oooo0 = FirebaseMessaging.f20229OooOOO;
            if (o0oooo0 == null) {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            } else {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                Object obj = extras.get("google.ttl");
                if (obj instanceof Integer) {
                    iIntValue = ((Integer) obj).intValue();
                } else if (obj instanceof String) {
                    try {
                        iIntValue = Integer.parseInt((String) obj);
                    } catch (NumberFormatException unused3) {
                        Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                    }
                }
                int i = iIntValue;
                String string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                    try {
                        p281o0O0O0oO.OooOO0 oooOO0OooO0OO3 = p281o0O0O0oO.OooOO0.OooO0OO();
                        Object obj2 = com.google.firebase.installations.OooO00o.f20178OooOOO0;
                        Preconditions.checkArgument(true, "Null is not a valid value of FirebaseApp.");
                        string = (String) Tasks.await(((com.google.firebase.installations.OooO00o) oooOO0OooO0OO3.OooO0O0(o0O0o0.OooO.class)).getId());
                    } catch (InterruptedException | ExecutionException e) {
                        throw new RuntimeException(e);
                    }
                }
                String str4 = string;
                p281o0O0O0oO.OooOO0 oooOO0OooO0OO4 = p281o0O0O0oO.OooOO0.OooO0OO();
                oooOO0OooO0OO4.OooO00o();
                String packageName = oooOO0OooO0OO4.f41949OooO00o.getPackageName();
                MessagingClientEvent.SDKPlatform sDKPlatform = MessagingClientEvent.SDKPlatform.ANDROID;
                MessagingClientEvent.MessageType messageType = o000OOo.OooO0o(extras) ? MessagingClientEvent.MessageType.DISPLAY_NOTIFICATION : MessagingClientEvent.MessageType.DATA_MESSAGE;
                String string2 = extras.getString("google.message_id");
                if (string2 == null) {
                    string2 = extras.getString("message_id");
                }
                String str5 = string2 != null ? string2 : "";
                String string3 = extras.getString("from");
                if (string3 == null || !string3.startsWith("/topics/")) {
                    string3 = null;
                }
                String str6 = string3 != null ? string3 : "";
                String string4 = extras.getString("collapse_key");
                String str7 = string4 != null ? string4 : "";
                String string5 = extras.getString("google.c.a.m_l");
                String str8 = string5 != null ? string5 : "";
                String string6 = extras.getString("google.c.a.c_l");
                String str9 = string6 != null ? string6 : "";
                if (extras.containsKey("google.c.sender.id")) {
                    try {
                        j = Long.parseLong(extras.getString("google.c.sender.id"));
                    } catch (NumberFormatException e2) {
                        Log.w("FirebaseMessaging", "error parsing project number", e2);
                        oooOO0OooO0OO = p281o0O0O0oO.OooOO0.OooO0OO();
                        oooOO0OooO0OO.OooO00o();
                        oooOOO0 = oooOO0OooO0OO.f41951OooO0OO;
                        str = oooOOO0.f41965OooO0o0;
                        if (str != null) {
                            try {
                                j = Long.parseLong(str);
                            } catch (NumberFormatException e3) {
                                Log.w("FirebaseMessaging", "error parsing sender ID", e3);
                                oooOO0OooO0OO.OooO00o();
                                str2 = oooOOO0.f41961OooO0O0;
                                if (str2.startsWith("1:")) {
                                    strArrSplit = str2.split(CertificateUtil.DELIMITER);
                                    if (strArrSplit.length < 2) {
                                        j = 0;
                                    } else {
                                        str3 = strArrSplit[1];
                                        if (str3.isEmpty()) {
                                            j = 0;
                                        } else {
                                            try {
                                                j = Long.parseLong(str3);
                                            } catch (NumberFormatException e4) {
                                                Log.w("FirebaseMessaging", "error parsing app ID", e4);
                                                j = 0;
                                            }
                                        }
                                    }
                                } else {
                                    try {
                                        j = Long.parseLong(str2);
                                    } catch (NumberFormatException e5) {
                                        Log.w("FirebaseMessaging", "error parsing app ID", e5);
                                        j = 0;
                                    }
                                }
                            }
                        } else {
                            oooOO0OooO0OO.OooO00o();
                            str2 = oooOOO0.f41961OooO0O0;
                            if (str2.startsWith("1:")) {
                                j = Long.parseLong(str2);
                            } else {
                                strArrSplit = str2.split(CertificateUtil.DELIMITER);
                                if (strArrSplit.length < 2) {
                                    j = 0;
                                } else {
                                    str3 = strArrSplit[1];
                                    if (str3.isEmpty()) {
                                        j = 0;
                                    } else {
                                        j = Long.parseLong(str3);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    oooOO0OooO0OO = p281o0O0O0oO.OooOO0.OooO0OO();
                    oooOO0OooO0OO.OooO00o();
                    oooOOO0 = oooOO0OooO0OO.f41951OooO0OO;
                    str = oooOOO0.f41965OooO0o0;
                    if (str != null) {
                        j = Long.parseLong(str);
                    } else {
                        oooOO0OooO0OO.OooO00o();
                        str2 = oooOOO0.f41961OooO0O0;
                        if (str2.startsWith("1:")) {
                            j = Long.parseLong(str2);
                        } else {
                            strArrSplit = str2.split(CertificateUtil.DELIMITER);
                            if (strArrSplit.length < 2) {
                                j = 0;
                            } else {
                                str3 = strArrSplit[1];
                                if (str3.isEmpty()) {
                                    j = 0;
                                } else {
                                    j = Long.parseLong(str3);
                                }
                            }
                        }
                    }
                }
                try {
                    o0oooo0.OooO00o("FCM_CLIENT_EVENT_LOGGING", new p176o00o0.OooOo("proto"), new o0OO00O()).OooO00o(new p176o00o0.OooOo00(new p563o0oOo0O0.o00000(new MessagingClientEvent(j > 0 ? j : 0L, str5, str4, messageType, sDKPlatform, packageName, str7, i, str6, event, str8, str9)), Priority.DEFAULT), new p191o00o0O0O.oo0o0Oo());
                } catch (RuntimeException e6) {
                    Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e6);
                }
            }
        }
        dispatchMessage(intent);
    }

    @VisibleForTesting
    public static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    public Intent getStartCommandIntent(Intent intent) {
        return (Intent) o00000OO.OooO00o().f20303OooO0Oo.poll();
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    public void handleIntent(Intent intent) {
        String action = intent.getAction();
        if (ACTION_REMOTE_INTENT.equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            handleMessageIntent(intent);
        } else {
            if (ACTION_NEW_TOKEN.equals(action)) {
                onNewToken(intent.getStringExtra(EXTRA_TOKEN));
                return;
            }
            Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
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
