package o00O0O0O;

import android.graphics.Bitmap;
import android.os.Looper;
import android.view.View;
import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;
import coil.memory.ViewTargetRequestDelegate;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p660o0ooo0o0.o00O;

/* JADX INFO: loaded from: classes.dex */
public final class o00oO0o implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f30539Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @Nullable
    public ViewTargetRequestDelegate f30540Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public volatile UUID f30541Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public volatile Job f30542Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f30544OoooO00 = true;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final p021OooOooo.o00oO0o<Object, Bitmap> f30543OoooO0 = new p021OooOooo.o00oO0o<>();

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @AnyThread
    @NotNull
    public final UUID OooO00o(@NotNull Job job) {
        Intrinsics.checkNotNullParameter(job, "job");
        UUID uuidRandomUUID = this.f30541Oooo0oO;
        if (uuidRandomUUID == null || !this.f30539Oooo) {
            uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID()");
        } else {
            o00O o00o2 = p119o00O0Oo0.o00O0O.f30749OooO00o;
            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                uuidRandomUUID = UUID.randomUUID();
                Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID()");
            }
        }
        this.f30541Oooo0oO = uuidRandomUUID;
        this.f30542Oooo0oo = job;
        return uuidRandomUUID;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    @MainThread
    public final void onViewAttachedToWindow(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        if (this.f30544OoooO00) {
            this.f30544OoooO00 = false;
            return;
        }
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.f30540Oooo0o;
        if (viewTargetRequestDelegate == null) {
            return;
        }
        this.f30539Oooo = true;
        viewTargetRequestDelegate.f9872Oooo0o.OooO0O0(viewTargetRequestDelegate.f9873Oooo0oO);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    @MainThread
    public final void onViewDetachedFromWindow(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.f30544OoooO00 = false;
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.f30540Oooo0o;
        if (viewTargetRequestDelegate == null) {
            return;
        }
        viewTargetRequestDelegate.OooO0O0();
    }
}
