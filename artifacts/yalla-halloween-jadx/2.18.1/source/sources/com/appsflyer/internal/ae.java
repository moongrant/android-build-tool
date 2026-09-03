package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ae {

    @VisibleForTesting
    public static long AFInAppEventType = 500;
    public static c valueOf;

    /* JADX INFO: renamed from: com.appsflyer.internal.ae$4, reason: invalid class name */
    public class AnonymousClass4 implements Application.ActivityLifecycleCallbacks {
        private /* synthetic */ Executor AFInAppEventParameterName;
        public final /* synthetic */ c AFKeystoreWrapper;
        public boolean valueOf = true;
        public boolean values;

        public AnonymousClass4(Executor executor, c cVar) {
            this.AFInAppEventParameterName = executor;
            this.AFKeystoreWrapper = cVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(@NonNull final Activity activity, Bundle bundle) {
            this.AFInAppEventParameterName.execute(new Runnable() { // from class: com.appsflyer.internal.ae.4.5
                @Override // java.lang.Runnable
                public final void run() {
                    j.AFInAppEventParameterName();
                    Intent intent = activity.getIntent();
                    if (j.AFInAppEventType(intent) == null || intent == j.AFInAppEventParameterName) {
                        return;
                    }
                    j.AFInAppEventParameterName = intent;
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(@NonNull final Activity activity) {
            this.AFInAppEventParameterName.execute(new Runnable() { // from class: com.appsflyer.internal.ae.4.4
                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass4.this.valueOf = true;
                    final Context applicationContext = activity.getApplicationContext();
                    try {
                        new Timer().schedule(new TimerTask() { // from class: com.appsflyer.internal.ae.4.4.2
                            @Override // java.util.TimerTask, java.lang.Runnable
                            public final void run() {
                                AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                                if (anonymousClass4.values && anonymousClass4.valueOf) {
                                    anonymousClass4.values = false;
                                    try {
                                        anonymousClass4.AFKeystoreWrapper.AFInAppEventType(applicationContext);
                                    } catch (Exception e) {
                                        AFLogger.AFKeystoreWrapper("Listener threw exception! ", e);
                                    }
                                }
                            }
                        }, ae.AFInAppEventType);
                    } catch (Throwable th) {
                        AFLogger.AFKeystoreWrapper("Background task failed with a throwable: ", th);
                    }
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(final Activity activity) {
            this.AFInAppEventParameterName.execute(new Runnable() { // from class: com.appsflyer.internal.ae.4.1
                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                    if (!anonymousClass4.values) {
                        try {
                            anonymousClass4.AFKeystoreWrapper.valueOf(activity);
                        } catch (Exception e) {
                            AFLogger.AFInAppEventType("Listener thrown an exception: ", e);
                        }
                    }
                    AnonymousClass4 anonymousClass5 = AnonymousClass4.this;
                    anonymousClass5.valueOf = false;
                    anonymousClass5.values = true;
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }
    }

    public interface c {
        void AFInAppEventType(Context context);

        void valueOf(Activity activity);
    }

    public static void AFKeystoreWrapper(Context context, c cVar, Executor executor) {
        valueOf = cVar;
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(executor, cVar);
        if (context instanceof Activity) {
            anonymousClass4.onActivityResumed((Activity) context);
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(anonymousClass4);
    }
}
