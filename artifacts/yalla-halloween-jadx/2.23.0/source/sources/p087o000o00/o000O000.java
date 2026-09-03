package p087o000o00;

import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.NetworkType;
import androidx.work.impl.background.systemjob.SystemJobService;
import p084o000Ooo0.o000oOoO;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(api = 23)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o000O000 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final String f35212OooO0O0 = o000oOoO.OooO0o0("SystemJobInfoConverter");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ComponentName f35213OooO00o;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f35214OooO00o;

        static {
            int[] iArr = new int[NetworkType.values().length];
            f35214OooO00o = iArr;
            try {
                iArr[NetworkType.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35214OooO00o[NetworkType.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35214OooO00o[NetworkType.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35214OooO00o[NetworkType.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35214OooO00o[NetworkType.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @VisibleForTesting(otherwise = 3)
    public o000O000(@NonNull Context context) {
        this.f35213OooO00o = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
