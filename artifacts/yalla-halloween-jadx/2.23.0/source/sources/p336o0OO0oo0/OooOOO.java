package p336o0OO0oo0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class OooOOO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f43305OooO0Oo;

    public OooOOO(String str, Object... objArr) {
        this.f43305OooO0Oo = String.format(str, objArr);
    }

    public abstract void OooO00o();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f43305OooO0Oo);
        try {
            OooO00o();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
