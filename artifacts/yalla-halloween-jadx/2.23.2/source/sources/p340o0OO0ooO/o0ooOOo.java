package p340o0OO0ooO;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o0ooOOo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f42597OooO0Oo;

    public o0ooOOo(String str, Object... objArr) {
        this.f42597OooO0Oo = String.format(str, objArr);
    }

    public abstract void OooO00o();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f42597OooO0Oo);
        try {
            OooO00o();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
