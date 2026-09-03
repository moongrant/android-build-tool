package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.DoNotInline;
import androidx.annotation.MainThread;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nOnBackPressedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,317:1\n1747#2,3:318\n533#2,6:321\n*S KotlinDebug\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n*L\n194#1:318,3\n209#1:321,6\n*E\n"})
public final class OnBackPressedDispatcher {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final Runnable f2156OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ArrayDeque<o000oOoO> f2157OooO0O0 = new ArrayDeque<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final OooO00o f2158OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final OnBackInvokedCallback f2159OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f2160OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public OnBackInvokedDispatcher f2161OooO0o0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/activity/OooO00o;", "activity_release"}, k = 1, mv = {1, 8, 0})
    public final class LifecycleOnBackPressedCancellable implements LifecycleEventObserver, androidx.activity.OooO00o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final Lifecycle f2162OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public OooO0o f2163OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public final o000oOoO f2164OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ OnBackPressedDispatcher f2165OooO0oO;

        public LifecycleOnBackPressedCancellable(@NotNull OnBackPressedDispatcher onBackPressedDispatcher, @NotNull Lifecycle lifecycle, o000oOoO onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.f2165OooO0oO = onBackPressedDispatcher;
            this.f2162OooO0Oo = lifecycle;
            this.f2164OooO0o0 = onBackPressedCallback;
            lifecycle.addObserver(this);
        }

        @Override // androidx.activity.OooO00o
        public final void cancel() {
            this.f2162OooO0Oo.removeObserver(this);
            o000oOoO o000oooo2 = this.f2164OooO0o0;
            o000oooo2.getClass();
            Intrinsics.checkNotNullParameter(this, "cancellable");
            o000oooo2.f2192OooO0O0.remove(this);
            OooO0o oooO0o = this.f2163OooO0o;
            if (oooO0o != null) {
                oooO0o.cancel();
            }
            this.f2163OooO0o = null;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event != Lifecycle.Event.ON_START) {
                if (event != Lifecycle.Event.ON_STOP) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        cancel();
                        return;
                    }
                    return;
                } else {
                    OooO0o oooO0o = this.f2163OooO0o;
                    if (oooO0o != null) {
                        oooO0o.cancel();
                        return;
                    }
                    return;
                }
            }
            OnBackPressedDispatcher onBackPressedDispatcher = this.f2165OooO0oO;
            onBackPressedDispatcher.getClass();
            o000oOoO onBackPressedCallback = this.f2164OooO0o0;
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            onBackPressedDispatcher.f2157OooO0O0.add(onBackPressedCallback);
            OooO0o cancellable = new OooO0o(onBackPressedDispatcher, onBackPressedCallback);
            Intrinsics.checkNotNullParameter(cancellable, "cancellable");
            onBackPressedCallback.f2192OooO0O0.add(cancellable);
            if (Build.VERSION.SDK_INT >= 33) {
                onBackPressedDispatcher.OooO0OO();
                onBackPressedCallback.f2193OooO0OO = onBackPressedDispatcher.f2158OooO0OO;
            }
            this.f2163OooO0o = cancellable;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            OnBackPressedDispatcher.this.OooO0OO();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            OnBackPressedDispatcher.this.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    @RequiresApi(33)
    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public static final OooO0OO f2168OooO00o = new OooO0OO();

        @DoNotInline
        @NotNull
        public final OnBackInvokedCallback OooO00o(@NotNull final Function0<Unit> onBackInvoked) {
            Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.o0OoOo0
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    Function0 onBackInvoked2 = onBackInvoked;
                    Intrinsics.checkNotNullParameter(onBackInvoked2, "$onBackInvoked");
                    onBackInvoked2.invoke();
                }
            };
        }

        @DoNotInline
        public final void OooO0O0(@NotNull Object dispatcher, int i, @NotNull Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) callback);
        }

        @DoNotInline
        public final void OooO0OO(@NotNull Object dispatcher, @NotNull Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    public final class OooO0o implements androidx.activity.OooO00o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final o000oOoO f2169OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ OnBackPressedDispatcher f2170OooO0o0;

        public OooO0o(@NotNull OnBackPressedDispatcher onBackPressedDispatcher, o000oOoO onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.f2170OooO0o0 = onBackPressedDispatcher;
            this.f2169OooO0Oo = onBackPressedCallback;
        }

        @Override // androidx.activity.OooO00o
        public final void cancel() {
            OnBackPressedDispatcher onBackPressedDispatcher = this.f2170OooO0o0;
            ArrayDeque<o000oOoO> arrayDeque = onBackPressedDispatcher.f2157OooO0O0;
            o000oOoO o000oooo2 = this.f2169OooO0Oo;
            arrayDeque.remove(o000oooo2);
            o000oooo2.getClass();
            Intrinsics.checkNotNullParameter(this, "cancellable");
            o000oooo2.f2192OooO0O0.remove(this);
            if (Build.VERSION.SDK_INT >= 33) {
                o000oooo2.f2193OooO0OO = null;
                onBackPressedDispatcher.OooO0OO();
            }
        }
    }

    @JvmOverloads
    public OnBackPressedDispatcher(@Nullable Runnable runnable) {
        this.f2156OooO00o = runnable;
        if (Build.VERSION.SDK_INT >= 33) {
            this.f2158OooO0OO = new OooO00o();
            this.f2159OooO0Oo = OooO0OO.f2168OooO00o.OooO00o(new OooO0O0());
        }
    }

    @MainThread
    public final void OooO00o(@NotNull LifecycleOwner owner, @NotNull o000oOoO onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        Lifecycle lifecycle = owner.getLifecycle();
        if (lifecycle.getState() == Lifecycle.State.DESTROYED) {
            return;
        }
        LifecycleOnBackPressedCancellable cancellable = new LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback);
        onBackPressedCallback.getClass();
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        onBackPressedCallback.f2192OooO0O0.add(cancellable);
        if (Build.VERSION.SDK_INT >= 33) {
            OooO0OO();
            onBackPressedCallback.f2193OooO0OO = this.f2158OooO0OO;
        }
    }

    @MainThread
    public final void OooO0O0() {
        o000oOoO o000ooooPrevious;
        ArrayDeque<o000oOoO> arrayDeque = this.f2157OooO0O0;
        ListIterator<o000oOoO> listIterator = arrayDeque.listIterator(arrayDeque.size());
        do {
            if (!listIterator.hasPrevious()) {
                o000ooooPrevious = null;
                break;
            }
            o000ooooPrevious = listIterator.previous();
        } while (!o000ooooPrevious.f2191OooO00o);
        o000oOoO o000oooo2 = o000ooooPrevious;
        if (o000oooo2 != null) {
            o000oooo2.OooO00o();
            return;
        }
        Runnable runnable = this.f2156OooO00o;
        if (runnable != null) {
            runnable.run();
        }
    }

    @RequiresApi(33)
    public final void OooO0OO() {
        boolean z;
        OnBackInvokedCallback onBackInvokedCallback;
        ArrayDeque<o000oOoO> arrayDeque = this.f2157OooO0O0;
        if (!(arrayDeque instanceof Collection) || !arrayDeque.isEmpty()) {
            Iterator<o000oOoO> it = arrayDeque.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else if (it.next().f2191OooO00o) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f2161OooO0o0;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f2159OooO0Oo) == null) {
            return;
        }
        OooO0OO oooO0OO = OooO0OO.f2168OooO00o;
        if (z && !this.f2160OooO0o) {
            oooO0OO.OooO0O0(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f2160OooO0o = true;
        } else {
            if (z || !this.f2160OooO0o) {
                return;
            }
            oooO0OO.OooO0OO(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f2160OooO0o = false;
        }
    }
}
