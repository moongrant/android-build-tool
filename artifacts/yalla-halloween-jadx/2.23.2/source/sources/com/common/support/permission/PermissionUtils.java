package com.common.support.permission;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.core.content.PermissionChecker;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o00000O.OooO0O0;
import p190o00o0O.OooOo;

/* JADX INFO: loaded from: classes2.dex */
public final class PermissionUtils {
    protected static final List<String> EMPTY_LIST = new ArrayList(0);
    private static final OooOo<String, Integer> MIN_SDK_PERMISSIONS;

    static {
        OooOo<String, Integer> oooOo = new OooOo<>(13);
        MIN_SDK_PERMISSIONS = oooOo;
        oooOo.put("com.android.voicemail.permission.ADD_VOICEMAIL", 14);
        oooOo.put("android.permission.READ_CALL_LOG", 16);
        oooOo.put("android.permission.READ_EXTERNAL_STORAGE", 16);
        oooOo.put("android.permission.WRITE_CALL_LOG", 16);
        oooOo.put("android.permission.BODY_SENSORS", 20);
        oooOo.put("android.permission.SYSTEM_ALERT_WINDOW", 23);
        oooOo.put("android.permission.WRITE_SETTINGS", 23);
        oooOo.put("android.permission.READ_PHONE_NUMBERS", 26);
        oooOo.put("android.permission.ANSWER_PHONE_CALLS", 26);
        oooOo.put("android.permission.ACCEPT_HANDOVER", 28);
        oooOo.put("android.permission.ACTIVITY_RECOGNITION", 29);
        oooOo.put("android.permission.ACCESS_MEDIA_LOCATION", 29);
        oooOo.put("android.permission.ACCESS_BACKGROUND_LOCATION", 29);
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
            if (OooO0O0.OooO0o(activity, str)) {
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
