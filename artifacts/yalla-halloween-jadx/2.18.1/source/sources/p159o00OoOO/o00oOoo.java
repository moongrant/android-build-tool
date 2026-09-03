package p159o00OoOO;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class o00oOoo implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ byte[] f32476Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00 f32477Oooo0oO;

    public o00oOoo(o00 o00Var, byte[] bArr) {
        this.f32477Oooo0oO = o00Var;
        this.f32476Oooo0o = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            OutputStream outputStream = this.f32477Oooo0oO.f32381OooO0OO;
            byte[] bArr = this.f32476Oooo0o;
            outputStream.write(bArr, 0, bArr.length);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
