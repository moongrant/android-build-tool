package com.facebook.appevents.aam;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import androidx.annotation.UiThread;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.appevents.UserDataStore;
import com.facebook.appevents.aam.MetadataViewObserver;
import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.umeng.commonsdk.framework.UMModuleRegister;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u000fH\u0002J\b\u0010\u001a\u001a\u00020\u000fH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/facebook/appevents/aam/MetadataViewObserver;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "activityWeakReference", "Ljava/lang/ref/WeakReference;", "isTracking", "Ljava/util/concurrent/atomic/AtomicBoolean;", "processedText", "", "", "uiThreadHandler", "Landroid/os/Handler;", "onGlobalFocusChanged", "", "oldView", "Landroid/view/View;", "newView", UMModuleRegister.PROCESS, ViewHierarchyConstants.VIEW_KEY, "processEditText", "runOnUIThread", "runnable", "Ljava/lang/Runnable;", "startTracking", "stopTracking", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class MetadataViewObserver implements ViewTreeObserver.OnGlobalFocusChangeListener {
    private static final int MAX_TEXT_LENGTH = 100;

    @NotNull
    private final WeakReference<Activity> activityWeakReference;

    @NotNull
    private final AtomicBoolean isTracking;

    @NotNull
    private final Set<String> processedText;

    @NotNull
    private final Handler uiThreadHandler;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Map<Integer, MetadataViewObserver> observers = new HashMap();

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J,\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/facebook/appevents/aam/MetadataViewObserver$Companion;", "", "()V", "MAX_TEXT_LENGTH", "", "observers", "", "Lcom/facebook/appevents/aam/MetadataViewObserver;", "preNormalize", "", "key", AppMeasurementSdk.ConditionalUserProperty.VALUE, "putUserData", "", "userData", "startTrackingActivity", "activity", "Landroid/app/Activity;", "stopTrackingActivity", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String preNormalize(String key, String value) {
            return Intrinsics.areEqual("r2", key) ? new Regex("[^\\d.]").replace(value, "") : value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:17:0x0047  */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final void putUserData(Map<String, String> userData, String key, String value) {
            switch (key.hashCode()) {
                case 3585:
                    if (key.equals("r3")) {
                        value = (!StringsKt.OooOoOO(value, "m") && !StringsKt.OooOoOO(value, "b") && !StringsKt.OooOoOO(value, UserDataStore.GENDER)) ? "f" : "m";
                    }
                    break;
                case 3586:
                    if (key.equals("r4")) {
                        value = new Regex("[^a-z]+").replace(value, "");
                    }
                    break;
                case 3587:
                    if (key.equals("r5")) {
                        value = new Regex("[^a-z]+").replace(value, "");
                    }
                    break;
                case 3588:
                    if (key.equals("r6") && StringsKt__StringsKt.contains$default(value, "-", false, 2, (Object) null)) {
                        Object[] array = new Regex("-").split(value, 0).toArray(new String[0]);
                        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                        value = ((String[]) array)[0];
                    }
                    break;
            }
            userData.put(key, value);
        }

        @JvmStatic
        @UiThread
        public final void startTrackingActivity(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            int iHashCode = activity.hashCode();
            Map mapAccess$getObservers$cp = MetadataViewObserver.access$getObservers$cp();
            Integer numValueOf = Integer.valueOf(iHashCode);
            Object metadataViewObserver = mapAccess$getObservers$cp.get(numValueOf);
            if (metadataViewObserver == null) {
                metadataViewObserver = new MetadataViewObserver(activity, null);
                mapAccess$getObservers$cp.put(numValueOf, metadataViewObserver);
            }
            MetadataViewObserver.access$startTracking((MetadataViewObserver) metadataViewObserver);
        }

        @JvmStatic
        @UiThread
        public final void stopTrackingActivity(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            MetadataViewObserver metadataViewObserver = (MetadataViewObserver) MetadataViewObserver.access$getObservers$cp().remove(Integer.valueOf(activity.hashCode()));
            if (metadataViewObserver == null) {
                return;
            }
            MetadataViewObserver.access$stopTracking(metadataViewObserver);
        }
    }

    private MetadataViewObserver(Activity activity) {
        this.processedText = new LinkedHashSet();
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        this.activityWeakReference = new WeakReference<>(activity);
        this.isTracking = new AtomicBoolean(false);
    }

    public /* synthetic */ MetadataViewObserver(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    public static final /* synthetic */ Map access$getObservers$cp() {
        if (CrashShieldHandler.isObjectCrashing(MetadataViewObserver.class)) {
            return null;
        }
        try {
            return observers;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MetadataViewObserver.class);
            return null;
        }
    }

    public static final /* synthetic */ void access$startTracking(MetadataViewObserver metadataViewObserver) {
        if (CrashShieldHandler.isObjectCrashing(MetadataViewObserver.class)) {
            return;
        }
        try {
            metadataViewObserver.startTracking();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MetadataViewObserver.class);
        }
    }

    public static final /* synthetic */ void access$stopTracking(MetadataViewObserver metadataViewObserver) {
        if (CrashShieldHandler.isObjectCrashing(MetadataViewObserver.class)) {
            return;
        }
        try {
            metadataViewObserver.stopTracking();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MetadataViewObserver.class);
        }
    }

    private final void process(final View view) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            runOnUIThread(new Runnable() { // from class: o0O00OOO.OooO0O0
                @Override // java.lang.Runnable
                public final void run() {
                    MetadataViewObserver.m129process$lambda0(view, this);
                }
            });
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: process$lambda-0, reason: not valid java name */
    public static final void m129process$lambda0(View view, MetadataViewObserver this$0) {
        if (CrashShieldHandler.isObjectCrashing(MetadataViewObserver.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "$view");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (view instanceof EditText) {
                this$0.processEditText(view);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MetadataViewObserver.class);
        }
    }

    private final void processEditText(View view) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            String string = ((EditText) view).getText().toString();
            if (string == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            String string2 = StringsKt.trim((CharSequence) string).toString();
            if (string2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = string2.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (!(lowerCase.length() == 0) && !this.processedText.contains(lowerCase) && lowerCase.length() <= 100) {
                this.processedText.add(lowerCase);
                HashMap map = new HashMap();
                MetadataMatcher metadataMatcher = MetadataMatcher.INSTANCE;
                List<String> currentViewIndicators = MetadataMatcher.getCurrentViewIndicators(view);
                List<String> aroundViewIndicators = null;
                for (MetadataRule metadataRule : MetadataRule.INSTANCE.getRules()) {
                    Companion companion = INSTANCE;
                    String strPreNormalize = companion.preNormalize(metadataRule.getName(), lowerCase);
                    if (metadataRule.getValRule().length() > 0) {
                        MetadataMatcher metadataMatcher2 = MetadataMatcher.INSTANCE;
                        if (!MetadataMatcher.matchValue(strPreNormalize, metadataRule.getValRule())) {
                        }
                    }
                    MetadataMatcher metadataMatcher3 = MetadataMatcher.INSTANCE;
                    if (MetadataMatcher.matchIndicator(currentViewIndicators, metadataRule.getKeyRules())) {
                        companion.putUserData(map, metadataRule.getName(), strPreNormalize);
                    } else {
                        if (aroundViewIndicators == null) {
                            aroundViewIndicators = MetadataMatcher.getAroundViewIndicators(view);
                        }
                        if (MetadataMatcher.matchIndicator(aroundViewIndicators, metadataRule.getKeyRules())) {
                            companion.putUserData(map, metadataRule.getName(), strPreNormalize);
                        }
                    }
                }
                InternalAppEventsLogger.INSTANCE.setInternalUserData(map);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void runOnUIThread(Runnable runnable) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.uiThreadHandler.post(runnable);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void startTracking() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (this.isTracking.getAndSet(true)) {
                return;
            }
            AppEventUtility appEventUtility = AppEventUtility.INSTANCE;
            View rootView = AppEventUtility.getRootView(this.activityWeakReference.get());
            if (rootView == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalFocusChangeListener(this);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @JvmStatic
    @UiThread
    public static final void startTrackingActivity(@NotNull Activity activity) {
        if (CrashShieldHandler.isObjectCrashing(MetadataViewObserver.class)) {
            return;
        }
        try {
            INSTANCE.startTrackingActivity(activity);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MetadataViewObserver.class);
        }
    }

    private final void stopTracking() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (this.isTracking.getAndSet(false)) {
                AppEventUtility appEventUtility = AppEventUtility.INSTANCE;
                View rootView = AppEventUtility.getRootView(this.activityWeakReference.get());
                if (rootView == null) {
                    return;
                }
                ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalFocusChangeListener(this);
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @JvmStatic
    @UiThread
    public static final void stopTrackingActivity(@NotNull Activity activity) {
        if (CrashShieldHandler.isObjectCrashing(MetadataViewObserver.class)) {
            return;
        }
        try {
            INSTANCE.stopTrackingActivity(activity);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MetadataViewObserver.class);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(@Nullable View oldView, @Nullable View newView) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        if (oldView != null) {
            try {
                process(oldView);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return;
            }
        }
        if (newView != null) {
            process(newView);
        }
    }
}
