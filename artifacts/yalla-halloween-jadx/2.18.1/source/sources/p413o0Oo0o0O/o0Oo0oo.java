package p413o0Oo0o0O;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o0Oo0oo implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final String f39372Oooo0o;

    public o0Oo0oo(String str, Object... objArr) {
        this.f39372Oooo0o = String.format(str, objArr);
    }

    public abstract void OooO00o();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f39372Oooo0o);
        try {
            OooO00o();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
