package com.yalla.yalla.common.ui.dialog.giftDialog;

import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.jeremyliao.liveeventbus.LiveEventBus;
import java.util.Objects;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p142o00OOooO.o000Oo0;
import p649o0ooOOoo.hg;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class GiftBlindWebManager {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f20886OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final FrameLayout f20887OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final hg f20888OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f20889OooO0Oo;

    public GiftBlindWebManager(@NotNull FragmentActivity context, @NotNull FrameLayout overrideGiftContainer) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(overrideGiftContainer, "overrideGiftContainer");
        this.f20886OooO00o = context;
        this.f20887OooO0O0 = overrideGiftContainer;
        hg hgVarInflate = hg.inflate(LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(hgVarInflate, "inflate(LayoutInflater.from(context))");
        this.f20888OooO0OO = hgVarInflate;
        context.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.yalla.yalla.common.ui.dialog.giftDialog.GiftBlindWebManager.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == Lifecycle.Event.ON_DESTROY) {
                    GiftBlindWebManager giftBlindWebManager = GiftBlindWebManager.this;
                    Objects.requireNonNull(giftBlindWebManager);
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        if (giftBlindWebManager.f20889OooO0Oo) {
                            giftBlindWebManager.f20888OooO0OO.f49626OooO0o0.OooO0OO();
                        }
                        Result.m502constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m502constructorimpl(ResultKt.createFailure(th));
                    }
                }
            }
        });
        LiveEventBus.get("SendGiftSuccess").observe(context, new o000Oo0(this, 2));
    }
}
