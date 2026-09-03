package androidx.activity;

import android.annotation.SuppressLint;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final Runnable f4307OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayDeque<OooOOO> f4308OooO0O0 = new ArrayDeque<>();

    public class LifecycleOnBackPressedCancellable implements LifecycleEventObserver, androidx.activity.OooO00o {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final Lifecycle f4310Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final OooOOO f4311Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        @Nullable
        public OooO00o f4312Oooo0oo;

        public LifecycleOnBackPressedCancellable(@NonNull Lifecycle lifecycle, OooOOO oooOOO) {
            this.f4310Oooo0o = lifecycle;
            this.f4311Oooo0oO = oooOOO;
            lifecycle.addObserver(this);
        }

        @Override // androidx.activity.OooO00o
        public final void cancel() {
            this.f4310Oooo0o.removeObserver(this);
            this.f4311Oooo0oO.f4328OooO0O0.remove(this);
            OooO00o oooO00o = this.f4312Oooo0oo;
            if (oooO00o != null) {
                oooO00o.cancel();
                this.f4312Oooo0oo = null;
            }
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                OooOOO oooOOO = this.f4311Oooo0oO;
                onBackPressedDispatcher.f4308OooO0O0.add(oooOOO);
                OooO00o oooO00o = onBackPressedDispatcher.new OooO00o(oooOOO);
                oooOOO.f4328OooO0O0.add(oooO00o);
                this.f4312Oooo0oo = oooO00o;
                return;
            }
            if (event != Lifecycle.Event.ON_STOP) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    cancel();
                }
            } else {
                OooO00o oooO00o2 = this.f4312Oooo0oo;
                if (oooO00o2 != null) {
                    oooO00o2.cancel();
                }
            }
        }
    }

    public class OooO00o implements androidx.activity.OooO00o {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final OooOOO f4313Oooo0o;

        public OooO00o(OooOOO oooOOO) {
            this.f4313Oooo0o = oooOOO;
        }

        @Override // androidx.activity.OooO00o
        public final void cancel() {
            OnBackPressedDispatcher.this.f4308OooO0O0.remove(this.f4313Oooo0o);
            this.f4313Oooo0o.f4328OooO0O0.remove(this);
        }
    }

    public OnBackPressedDispatcher(@Nullable Runnable runnable) {
        this.f4307OooO00o = runnable;
    }

    @SuppressLint({"LambdaLast"})
    @MainThread
    public final void OooO00o(@NonNull LifecycleOwner lifecycleOwner, @NonNull OooOOO oooOOO) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        oooOOO.f4328OooO0O0.add(new LifecycleOnBackPressedCancellable(lifecycle, oooOOO));
    }

    @MainThread
    public final void OooO0O0() {
        Iterator<OooOOO> itDescendingIterator = this.f4308OooO0O0.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            OooOOO next = itDescendingIterator.next();
            if (next.f4327OooO00o) {
                next.OooO00o();
                return;
            }
        }
        Runnable runnable = this.f4307OooO00o;
        if (runnable != null) {
            runnable.run();
        }
    }
}
