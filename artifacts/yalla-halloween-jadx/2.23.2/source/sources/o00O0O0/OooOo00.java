package o00O0O0;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.NetworkType;
import androidx.work.impl.background.systemjob.SystemJobService;
import p115o00O00oO.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(api = 23)
@SuppressLint({"ClassVerificationFailure"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final String f36171OooO0O0 = o0Oo0oo.OooO0o("SystemJobInfoConverter");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ComponentName f36172OooO00o;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f36173OooO00o;

        static {
            int[] iArr = new int[NetworkType.values().length];
            f36173OooO00o = iArr;
            try {
                iArr[NetworkType.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36173OooO00o[NetworkType.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36173OooO00o[NetworkType.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36173OooO00o[NetworkType.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36173OooO00o[NetworkType.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @VisibleForTesting(otherwise = 3)
    public OooOo00(@NonNull Context context) {
        this.f36172OooO00o = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
