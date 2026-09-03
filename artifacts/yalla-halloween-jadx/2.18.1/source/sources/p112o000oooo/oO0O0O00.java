package p112o000oooo;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import o00O000.OooO00o;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class oO0O0O00 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static oO0O0O00 f30062OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public oO0O000o f30063OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public oO0O00 f30064OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public oO0O00oO f30065OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public oO0O0 f30066OooO0Oo;

    public oO0O0O00(@NonNull Context context, @NonNull OooO00o oooO00o) {
        Context applicationContext = context.getApplicationContext();
        this.f30063OooO00o = new oO0O000o(applicationContext, oooO00o);
        this.f30064OooO0O0 = new oO0O00(applicationContext, oooO00o);
        this.f30065OooO0OO = new oO0O00oO(applicationContext, oooO00o);
        this.f30066OooO0Oo = new oO0O0(applicationContext, oooO00o);
    }

    @NonNull
    public static synchronized oO0O0O00 OooO00o(Context context, OooO00o oooO00o) {
        if (f30062OooO0o0 == null) {
            f30062OooO0o0 = new oO0O0O00(context, oooO00o);
        }
        return f30062OooO0o0;
    }
}
