package p565o0oOo000;

import android.annotation.TargetApi;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Set<String> f45176OooO00o = SetsKt.setOf((Object[]) new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION", "android.permission.SYSTEM_ALERT_WINDOW", "android.permission.WRITE_SETTINGS", "android.permission.MANAGE_EXTERNAL_STORAGE", "android.permission.REQUEST_INSTALL_PACKAGES"});

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @TargetApi(29)
    @NotNull
    public static final Map<String, String> f45177OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @TargetApi(30)
    @NotNull
    public static final Map<String, String> f45178OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @TargetApi(31)
    @NotNull
    public static final Map<String, String> f45179OooO0Oo;

    static {
        Map<String, String> mapMapOf = MapsKt.mapOf(TuplesKt.to("android.permission.READ_CALENDAR", "android.permission-group.CALENDAR"), TuplesKt.to("android.permission.WRITE_CALENDAR", "android.permission-group.CALENDAR"), TuplesKt.to("android.permission.READ_CALL_LOG", "android.permission-group.CALL_LOG"), TuplesKt.to("android.permission.WRITE_CALL_LOG", "android.permission-group.CALL_LOG"), TuplesKt.to("android.permission.PROCESS_OUTGOING_CALLS", "android.permission-group.CALL_LOG"), TuplesKt.to("android.permission.CAMERA", "android.permission-group.CAMERA"), TuplesKt.to("android.permission.READ_CONTACTS", "android.permission-group.CONTACTS"), TuplesKt.to("android.permission.WRITE_CONTACTS", "android.permission-group.CONTACTS"), TuplesKt.to("android.permission.GET_ACCOUNTS", "android.permission-group.CONTACTS"), TuplesKt.to("android.permission.ACCESS_FINE_LOCATION", "android.permission-group.LOCATION"), TuplesKt.to("android.permission.ACCESS_COARSE_LOCATION", "android.permission-group.LOCATION"), TuplesKt.to("android.permission.ACCESS_BACKGROUND_LOCATION", "android.permission-group.LOCATION"), TuplesKt.to("android.permission.RECORD_AUDIO", "android.permission-group.MICROPHONE"), TuplesKt.to("android.permission.READ_PHONE_STATE", "android.permission-group.PHONE"), TuplesKt.to("android.permission.READ_PHONE_NUMBERS", "android.permission-group.PHONE"), TuplesKt.to("android.permission.CALL_PHONE", "android.permission-group.PHONE"), TuplesKt.to("android.permission.ANSWER_PHONE_CALLS", "android.permission-group.PHONE"), TuplesKt.to("com.android.voicemail.permission.ADD_VOICEMAIL", "android.permission-group.PHONE"), TuplesKt.to("android.permission.USE_SIP", "android.permission-group.PHONE"), TuplesKt.to("android.permission.ACCEPT_HANDOVER", "android.permission-group.PHONE"), TuplesKt.to("android.permission.BODY_SENSORS", "android.permission-group.SENSORS"), TuplesKt.to("android.permission.ACTIVITY_RECOGNITION", "android.permission-group.ACTIVITY_RECOGNITION"), TuplesKt.to("android.permission.SEND_SMS", "android.permission-group.SMS"), TuplesKt.to("android.permission.RECEIVE_SMS", "android.permission-group.SMS"), TuplesKt.to("android.permission.READ_SMS", "android.permission-group.SMS"), TuplesKt.to("android.permission.RECEIVE_WAP_PUSH", "android.permission-group.SMS"), TuplesKt.to("android.permission.RECEIVE_MMS", "android.permission-group.SMS"), TuplesKt.to("android.permission.READ_EXTERNAL_STORAGE", "android.permission-group.STORAGE"), TuplesKt.to("android.permission.WRITE_EXTERNAL_STORAGE", "android.permission-group.STORAGE"), TuplesKt.to("android.permission.ACCESS_MEDIA_LOCATION", "android.permission-group.STORAGE"));
        f45177OooO0O0 = mapMapOf;
        f45178OooO0OO = mapMapOf;
        Map mutableMap = MapsKt.toMutableMap(MapsKt.mapOf(TuplesKt.to("android.permission.BLUETOOTH_SCAN", "android.permission-group.NEARBY_DEVICES"), TuplesKt.to("android.permission.BLUETOOTH_ADVERTISE", "android.permission-group.NEARBY_DEVICES"), TuplesKt.to("android.permission.BLUETOOTH_CONNECT", "android.permission-group.NEARBY_DEVICES")));
        mutableMap.putAll(mapMapOf);
        f45179OooO0Oo = MapsKt.toMap(mutableMap);
    }
}
