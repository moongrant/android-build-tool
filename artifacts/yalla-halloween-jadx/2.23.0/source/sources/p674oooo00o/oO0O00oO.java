package p674oooo00o;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import p096o000o0o0.o0000O0;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class oO0O00oO {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static oO0O00oO f60995OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oOo000o0 f60996OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oO0 f60997OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final oO0O00O f60998OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oO0O00o0 f60999OooO0Oo;

    public oO0O00oO(@NonNull Context context, @NonNull o0000O0 o0000o1) {
        Context applicationContext = context.getApplicationContext();
        this.f60996OooO00o = new oOo000o0(applicationContext, o0000o1);
        this.f60997OooO0O0 = new oO0(applicationContext, o0000o1);
        this.f60998OooO0OO = new oO0O00O(applicationContext, o0000o1);
        this.f60999OooO0Oo = new oO0O00o0(applicationContext, o0000o1);
    }

    @NonNull
    public static synchronized oO0O00oO OooO00o(Context context, o0000O0 o0000o1) {
        if (f60995OooO0o0 == null) {
            f60995OooO0o0 = new oO0O00oO(context, o0000o1);
        }
        return f60995OooO0o0;
    }
}
