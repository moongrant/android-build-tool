package p045Oooooo;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.source.Oooo0;
import androidx.media3.exoplayer.source.o000oOoO;
import androidx.profileinstaller.ProfileInstaller;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.facebook.AccessToken;
import com.facebook.AccessTokenManager;
import com.google.common.util.concurrent.OooOO0O;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o000OOoO.o000000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1875OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1876OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1877OooO0o0;

    public /* synthetic */ o0000O(int i, Object obj, Object obj2) {
        this.f1875OooO0Oo = i;
        this.f1877OooO0o0 = obj;
        this.f1876OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1875OooO0Oo;
        Object obj = this.f1876OooO0o;
        Object obj2 = this.f1877OooO0o0;
        switch (i) {
            case 0:
                ((o0000Ooo.OooO0OO) obj2).f1934OooO0OO.remove((OooOO0O) obj);
                break;
            case 1:
                Oooo0 oooo0 = (Oooo0) obj2;
                o000000 o000000Var = (o000000) obj;
                oooo0.f7994OooOoo0 = oooo0.f7986OooOo0 == null ? o000000Var : new o000000.OooO0O0(-9223372036854775807L);
                oooo0.f7993OooOoo = o000000Var.OooO();
                boolean z = !oooo0.f7997Oooo0 && o000000Var.OooO() == -9223372036854775807L;
                oooo0.f7995OooOooO = z;
                oooo0.f7996OooOooo = z ? 7 : 1;
                ((o000oOoO) oooo0.f7975OooOO0).OooOo0(oooo0.f7993OooOoo, o000000Var.OooO0oO(), oooo0.f7995OooOooO);
                if (!oooo0.f7991OooOoO0) {
                    oooo0.OooOo();
                }
                break;
            case 2:
                final Context context = (Context) obj;
                ((ProfileInstallerInitializer) obj2).getClass();
                (Build.VERSION.SDK_INT >= 28 ? ProfileInstallerInitializer.OooO0O0.OooO00o(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new Runnable() { // from class: o000ooO.o00O00OO
                    @Override // java.lang.Runnable
                    public final void run() {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
                        final Context context2 = context;
                        threadPoolExecutor.execute(new Runnable() { // from class: o000ooO.o00O00o0
                            @Override // java.lang.Runnable
                            public final void run() throws IOException {
                                ProfileInstaller.OooO0O0(context2, new oOO00O(), ProfileInstaller.f10537OooO00o, false);
                            }
                        });
                    }
                }, new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            default:
                AccessTokenManager.m4033refreshCurrentAccessToken$lambda0((AccessTokenManager) obj2, (AccessToken.AccessTokenRefreshCallback) obj);
                break;
        }
    }
}
