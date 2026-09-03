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
import p106o000ooO.o00O00;
import p106o000ooO.o00O0O0;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final Executor f10517OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ProfileInstaller.OooO0OO f10518OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final byte[] f10519OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final File f10520OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f10521OooO0o = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final String f10522OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public o00O00[] f10523OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public byte[] f10524OooO0oo;

    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public OooO0O0(@NonNull AssetManager assetManager, @NonNull Executor executor, @NonNull ProfileInstaller.OooO0OO oooO0OO, @NonNull String str, @NonNull File file) {
        byte[] bArr;
        this.f10517OooO00o = executor;
        this.f10518OooO0O0 = oooO0OO;
        this.f10522OooO0o0 = str;
        this.f10520OooO0Oo = file;
        int i = Build.VERSION.SDK_INT;
        if (i >= 24 && i <= 33) {
            switch (i) {
                case 24:
                case 25:
                    bArr = o00O0O0.f35793OooO0o0;
                    break;
                case 26:
                    bArr = o00O0O0.f35791OooO0Oo;
                    break;
                case 27:
                    bArr = o00O0O0.f35790OooO0OO;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = o00O0O0.f35789OooO0O0;
                    break;
                case 31:
                case 32:
                case 33:
                    bArr = o00O0O0.f35788OooO00o;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = null;
        }
        this.f10519OooO0OO = bArr;
    }

    @Nullable
    public final FileInputStream OooO00o(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f10518OooO0O0.OooO00o();
            }
            return null;
        }
    }

    public final void OooO0O0(final int i, @Nullable final Serializable serializable) {
        this.f10517OooO00o.execute(new Runnable() { // from class: o000ooO.o00O000o
            @Override // java.lang.Runnable
            public final void run() {
                this.f35784OooO0Oo.f10518OooO0O0.OooO0O0(i, serializable);
            }
        });
    }
}
