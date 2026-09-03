package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.profileinstaller.OooO00o;
import java.io.File;
import java.util.concurrent.Executor;
import p088o000o00.OooO0OO;
import p088o000o00.OooOo00;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final AssetManager f8812OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Executor f8813OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ProfileInstaller.OooO0OO f8814OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final byte[] f8815OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f8816OooO0o = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final File f8817OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public OooO0OO[] f8818OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public byte[] f8819OooO0oo;

    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public OooO00o(@NonNull AssetManager assetManager, @NonNull Executor executor, @NonNull ProfileInstaller.OooO0OO oooO0OO, @NonNull String str, @NonNull File file) {
        byte[] bArr;
        this.f8812OooO00o = assetManager;
        this.f8813OooO0O0 = executor;
        this.f8814OooO0OO = oooO0OO;
        this.f8817OooO0o0 = file;
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            switch (i) {
                case 24:
                case 25:
                    bArr = OooOo00.f28615OooO0o0;
                    break;
                case 26:
                    bArr = OooOo00.f28613OooO0Oo;
                    break;
                case 27:
                    bArr = OooOo00.f28612OooO0OO;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = OooOo00.f28611OooO0O0;
                    break;
                case 31:
                    bArr = OooOo00.f28610OooO00o;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = null;
        }
        this.f8815OooO0Oo = bArr;
    }

    public final void OooO00o() {
        if (!this.f8816OooO0o) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    public final void OooO0O0(final int i, @Nullable final Object obj) {
        this.f8813OooO0O0.execute(new Runnable() { // from class: o000o00.OooO0O0
            @Override // java.lang.Runnable
            public final void run() {
                OooO00o oooO00o = this.f28586Oooo0o;
                oooO00o.f8814OooO0OO.OooO00o(i, obj);
            }
        });
    }
}
