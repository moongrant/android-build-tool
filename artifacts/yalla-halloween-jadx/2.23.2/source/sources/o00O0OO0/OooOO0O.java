package o00O0OO0;

import android.content.Context;
import androidx.annotation.RestrictTo;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p039OoooOoo.o00OOO0;
import p119o00O0Oo0.o00O0O;
import p119o00O0Oo0.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class OooOO0O<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0OoOo0 f36256OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Context f36257OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Object f36258OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final LinkedHashSet<o00O0O0O.OooO00o<T>> f36259OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public T f36260OooO0o0;

    public OooOO0O(@NotNull Context context, @NotNull o00O0O taskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.f36256OooO00o = taskExecutor;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f36257OooO0O0 = applicationContext;
        this.f36258OooO0OO = new Object();
        this.f36259OooO0Oo = new LinkedHashSet<>();
    }

    public abstract T OooO00o();

    public final void OooO0O0(@NotNull p116o00O0O0o.OooOOO0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f36258OooO0OO) {
            if (this.f36259OooO0Oo.remove(listener) && this.f36259OooO0Oo.isEmpty()) {
                OooO0o0();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void OooO0OO(T t) {
        synchronized (this.f36258OooO0OO) {
            T t2 = this.f36260OooO0o0;
            if (t2 == null || !Intrinsics.areEqual(t2, t)) {
                this.f36260OooO0o0 = t;
                ((o00O0O) this.f36256OooO00o).f36416OooO0OO.execute(new o00OOO0(3, CollectionsKt.toList(this.f36259OooO0Oo), this));
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public abstract void OooO0Oo();

    public abstract void OooO0o0();
}
