package p070o0000ooO;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.Arrays;
import kotlin.ULong;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 extends o000O000.OooO00o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ int f28002OooO0OO = 0;

    public interface OooO {
        void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr);
    }

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ String[] f28003Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Activity f28004Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f28005Oooo0oo;

        public OooO00o(String[] strArr, Activity activity, int i) {
            this.f28003Oooo0o = strArr;
            this.f28004Oooo0oO = activity;
            this.f28005Oooo0oo = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int[] iArr = new int[this.f28003Oooo0o.length];
            PackageManager packageManager = this.f28004Oooo0oO.getPackageManager();
            String packageName = this.f28004Oooo0oO.getPackageName();
            int length = this.f28003Oooo0o.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.f28003Oooo0o[i], packageName);
            }
            ((OooO) this.f28004Oooo0oO).onRequestPermissionsResult(this.f28005Oooo0oo, this.f28003Oooo0o, iArr);
        }
    }

    @RequiresApi(16)
    public static class OooO0O0 {
        @DoNotInline
        public static void OooO00o(Activity activity) {
            activity.finishAffinity();
        }

        @DoNotInline
        public static void OooO0O0(Activity activity, Intent intent, int i, Bundle bundle) {
            activity.startActivityForResult(intent, i, bundle);
        }

        @DoNotInline
        public static void OooO0OO(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    @RequiresApi(21)
    public static class OooO0OO {
        @DoNotInline
        public static void OooO00o(Activity activity) {
            activity.finishAfterTransition();
        }

        @DoNotInline
        public static void OooO0O0(Activity activity) {
            activity.postponeEnterTransition();
        }

        @DoNotInline
        public static void OooO0OO(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        @DoNotInline
        public static void OooO0Oo(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        @DoNotInline
        public static void OooO0o0(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    @RequiresApi(23)
    public static class OooO0o {
        @DoNotInline
        public static void OooO00o(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        @DoNotInline
        public static void OooO0O0(Activity activity, String[] strArr, int i) {
            activity.requestPermissions(strArr, i);
        }

        @DoNotInline
        public static boolean OooO0OO(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface OooOO0 {
        void validateRequestPermissionsRequestCode(int i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void OooO0Oo(@NonNull Activity activity, @NonNull String[] strArr, @IntRange(from = ULong.MIN_VALUE) int i) {
        for (String str : strArr) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException(p058o0000OoO.OooO.OooO00o(OooO00o.OooO00o.OooO0o0("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof OooOO0) {
                ((OooOO0) activity).validateRequestPermissionsRequestCode(i);
            }
            OooO0o.OooO0O0(activity, strArr, i);
        } else if (activity instanceof OooO) {
            new Handler(Looper.getMainLooper()).post(new OooO00o(strArr, activity, i));
        }
    }
}
