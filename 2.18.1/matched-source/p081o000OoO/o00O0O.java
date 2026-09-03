package p081o000OoO;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.core.content.res.OooO00o;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.facebook.appevents.codeless.ViewIndexer;
import java.util.Objects;
import java.util.Random;
import p088o000o00.OooOOO0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O0O implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f28337Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f28338Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f28339Oooo0oo;

    public /* synthetic */ o00O0O(Object obj, Object obj2, int i) {
        this.f28337Oooo0o = i;
        this.f28338Oooo0oO = obj;
        this.f28339Oooo0oo = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28337Oooo0o) {
            case 0:
                ((OooO00o.OooO) this.f28338Oooo0oO).OooO0o0((Typeface) this.f28339Oooo0oo);
                break;
            case 1:
                ProfileInstallerInitializer profileInstallerInitializer = (ProfileInstallerInitializer) this.f28338Oooo0oO;
                Context context = (Context) this.f28339Oooo0oo;
                Objects.requireNonNull(profileInstallerInitializer);
                (Build.VERSION.SDK_INT >= 28 ? ProfileInstallerInitializer.OooO0O0.OooO00o(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new OooOOO0(context, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            default:
                ViewIndexer.m138sendToServer$lambda1((String) this.f28338Oooo0oO, (ViewIndexer) this.f28339Oooo0oo);
                break;
        }
    }
}
