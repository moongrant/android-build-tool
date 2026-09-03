package com.common.support.permission;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.core.content.PermissionChecker;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o00000O.OooO00o;
import p188o00o0O.Oooo000;

/* JADX INFO: loaded from: classes2.dex */
public final class PermissionUtils {
    protected static final List<String> EMPTY_LIST = new ArrayList(0);
    private static final Oooo000<String, Integer> MIN_SDK_PERMISSIONS;

    static {
        Oooo000<String, Integer> oooo000 = new Oooo000<>(13);
        MIN_SDK_PERMISSIONS = oooo000;
        oooo000.put("com.android.voicemail.permission.ADD_VOICEMAIL", 14);
        oooo000.put("android.permission.READ_CALL_LOG", 16);
        oooo000.put("android.permission.READ_EXTERNAL_STORAGE", 16);
        oooo000.put("android.permission.WRITE_CALL_LOG", 16);
        oooo000.put("android.permission.BODY_SENSORS", 20);
        oooo000.put("android.permission.SYSTEM_ALERT_WINDOW", 23);
        oooo000.put("android.permission.WRITE_SETTINGS", 23);
        oooo000.put("android.permission.READ_PHONE_NUMBERS", 26);
        oooo000.put("android.permission.ANSWER_PHONE_CALLS", 26);
        oooo000.put("android.permission.ACCEPT_HANDOVER", 28);
        oooo000.put("android.permission.ACTIVITY_RECOGNITION", 29);
        oooo000.put("android.permission.ACCESS_MEDIA_LOCATION", 29);
        oooo000.put("android.permission.ACCESS_BACKGROUND_LOCATION", 29);
    }

    private PermissionUtils() {
    }

    public static List<String> findDeniedPermission(String[] strArr, int... iArr) {
        if (iArr.length == 0 || strArr.length != iArr.length) {
            return Arrays.asList(strArr);
        }
        ArrayList arrayList = new ArrayList(strArr.length / 2);
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] != 0) {
                arrayList.add(strArr[i]);
            }
        }
        return arrayList;
    }

    private static boolean hasSelfPermission(Context context, String str) {
        try {
            return PermissionChecker.OooO00o(context, str) == 0;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    public static boolean hasSelfPermissions(Context context, String... strArr) {
        for (String str : strArr) {
            if (permissionExists(str) && !hasSelfPermission(context, str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean permissionExists(String str) {
        Integer orDefault = MIN_SDK_PERMISSIONS.getOrDefault(str, null);
        return orDefault == null || Build.VERSION.SDK_INT >= orDefault.intValue();
    }

    public static boolean shouldShowRequestPermissionRationale(Activity activity, String... strArr) {
        for (String str : strArr) {
            if (OooO00o.OooO0o0(activity, str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean verifyPermissions(int... iArr) {
        if (iArr.length == 0) {
            return false;
        }
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean shouldShowRequestPermissionRationale(Fragment fragment, String... strArr) {
        for (String str : strArr) {
            if (fragment.shouldShowRequestPermissionRationale(str)) {
                return true;
            }
        }
        return false;
    }
}
