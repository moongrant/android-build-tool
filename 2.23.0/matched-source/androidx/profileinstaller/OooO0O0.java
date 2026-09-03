package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import o000O0Oo.OooOOO;
import p023Oooo00o.oO00OO0O;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final Executor f7423OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ProfileInstaller.OooO0OO f7424OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final byte[] f7425OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final File f7426OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f7427OooO0o = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final String f7428OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public o000O0Oo.OooO0O0[] f7429OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public byte[] f7430OooO0oo;

    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public OooO0O0(@NonNull AssetManager assetManager, @NonNull Executor executor, @NonNull ProfileInstaller.OooO0OO oooO0OO, @NonNull String str, @NonNull File file) {
        byte[] bArr;
        this.f7423OooO00o = executor;
        this.f7424OooO0O0 = oooO0OO;
        this.f7428OooO0o0 = str;
        this.f7426OooO0Oo = file;
        int i = Build.VERSION.SDK_INT;
        if (i >= 24 && i <= 33) {
            switch (i) {
                case 24:
                case 25:
                    bArr = OooOOO.f34844OooO0o0;
                    break;
                case 26:
                    bArr = OooOOO.f34842OooO0Oo;
                    break;
                case 27:
                    bArr = OooOOO.f34841OooO0OO;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = OooOOO.f34840OooO0O0;
                    break;
                case 31:
                case 32:
                case 33:
                    bArr = OooOOO.f34839OooO00o;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = null;
        }
        this.f7425OooO0OO = bArr;
    }

    @Nullable
    public final FileInputStream OooO00o(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f7424OooO0O0.OooO00o();
            }
            return null;
        }
    }

    public final void OooO0O0(int i, @Nullable Serializable serializable) {
        this.f7423OooO00o.execute(new oO00OO0O(this, i, serializable));
    }
}
