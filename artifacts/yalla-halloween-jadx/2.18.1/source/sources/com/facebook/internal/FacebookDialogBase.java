package com.facebook.internal;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.activity.result.ActivityResultRegistry;
import androidx.annotation.VisibleForTesting;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookDialog;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b&\u0018\u0000 F*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0002FGB\u0019\b\u0014\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\bC\u0010DB\u0019\b\u0014\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\bC\u0010EB\u0011\b\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\bC\u0010<J!\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\u001e\u0010\u0010\u001a\u0018\u0012\u0014\u0012\u00120\u000fR\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00000\u000eH\u0002J\u0010\u0010\u0011\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u001e\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H\u0016J&\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u001e\u0010\u0018\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00172\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H$J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ&\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020!0 2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0004J\u001e\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020!0 2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u001f\u0010#\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b#\u0010$J\u0018\u0010'\u001a\u00020\f2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0016\u001a\u00020\u0015H\u0004J\b\u0010(\u001a\u00020\u0007H$R\u0016\u0010*\u001a\u0004\u0018\u00010)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u0004\u0018\u00010,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R.\u0010/\u001a\u001a\u0012\u0014\u0012\u00120\u000fR\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R$\u0010\u000b\u001a\u0004\u0018\u00010\n8A@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010\u0016\u001a\u00020\u00152\u0006\u00108\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0016\u0010?\u001a\u0004\u0018\u00010)8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R*\u0010B\u001a\u0018\u0012\u0014\u0012\u00120\u000fR\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00000\u000e8$X¤\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006H"}, d2 = {"Lcom/facebook/internal/FacebookDialogBase;", "CONTENT", "RESULT", "Lcom/facebook/FacebookDialog;", "content", "", "mode", "Lcom/facebook/internal/AppCall;", "createAppCallForMode", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/facebook/internal/AppCall;", "Lcom/facebook/CallbackManager;", "callbackManager", "", "memorizeCallbackManager", "", "Lcom/facebook/internal/FacebookDialogBase$ModeHandler;", "cachedModeHandlers", "setCallbackManager", "Lcom/facebook/FacebookCallback;", "callback", "registerCallback", "", "requestCode", "Lcom/facebook/internal/CallbackManagerImpl;", "registerCallbackImpl", "", "canShow", "(Ljava/lang/Object;)Z", "canShowImpl", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "show", "(Ljava/lang/Object;)V", "LOooOOoo/OooO;", "Lcom/facebook/CallbackManager$ActivityResultParameters;", "createActivityResultContractForShowingDialog", "showImpl", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Landroid/content/Intent;", "intent", "startActivityForResult", "createBaseAppCall", "Landroid/app/Activity;", "activity", "Landroid/app/Activity;", "Lcom/facebook/internal/FragmentWrapper;", "fragmentWrapper", "Lcom/facebook/internal/FragmentWrapper;", "modeHandlers", "Ljava/util/List;", "requestCodeField", "I", "Lcom/facebook/CallbackManager;", "getCallbackManager$facebook_common_release", "()Lcom/facebook/CallbackManager;", "setCallbackManager$facebook_common_release", "(Lcom/facebook/CallbackManager;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getRequestCode", "()I", "setRequestCode", "(I)V", "getActivityContext", "()Landroid/app/Activity;", "activityContext", "getOrderedModeHandlers", "()Ljava/util/List;", "orderedModeHandlers", "<init>", "(Landroid/app/Activity;I)V", "(Lcom/facebook/internal/FragmentWrapper;I)V", "Companion", "ModeHandler", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public abstract class FacebookDialogBase<CONTENT, RESULT> implements FacebookDialog<CONTENT, RESULT> {

    @NotNull
    private static final String TAG = "FacebookDialog";

    @Nullable
    private final Activity activity;

    @Nullable
    private CallbackManager callbackManager;

    @Nullable
    private final FragmentWrapper fragmentWrapper;

    @Nullable
    private List<? extends FacebookDialogBase<CONTENT, RESULT>.ModeHandler> modeHandlers;
    private int requestCodeField;

    @JvmField
    @NotNull
    public static final Object BASE_AUTOMATIC_MODE = new Object();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b¤\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001d\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\tH&¢\u0006\u0002\u0010\fJ\u0017\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u0001X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/facebook/internal/FacebookDialogBase$ModeHandler;", "", "(Lcom/facebook/internal/FacebookDialogBase;)V", "mode", "getMode", "()Ljava/lang/Object;", "setMode", "(Ljava/lang/Object;)V", "canShow", "", "content", "isBestEffort", "(Ljava/lang/Object;Z)Z", "createAppCall", "Lcom/facebook/internal/AppCall;", "(Ljava/lang/Object;)Lcom/facebook/internal/AppCall;", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public abstract class ModeHandler {

        @NotNull
        private Object mode;
        public final /* synthetic */ FacebookDialogBase<CONTENT, RESULT> this$0;

        public ModeHandler(FacebookDialogBase this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
            this.mode = FacebookDialogBase.BASE_AUTOMATIC_MODE;
        }

        public abstract boolean canShow(CONTENT content, boolean isBestEffort);

        @Nullable
        public abstract AppCall createAppCall(CONTENT content);

        @NotNull
        public Object getMode() {
            return this.mode;
        }

        public void setMode(@NotNull Object obj) {
            Intrinsics.checkNotNullParameter(obj, "<set-?>");
            this.mode = obj;
        }
    }

    public FacebookDialogBase(@NotNull Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
        this.fragmentWrapper = null;
        this.requestCodeField = i;
        this.callbackManager = null;
    }

    private final List<FacebookDialogBase<CONTENT, RESULT>.ModeHandler> cachedModeHandlers() {
        if (this.modeHandlers == null) {
            this.modeHandlers = getOrderedModeHandlers();
        }
        List<? extends FacebookDialogBase<CONTENT, RESULT>.ModeHandler> list = this.modeHandlers;
        Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.List<com.facebook.internal.FacebookDialogBase.ModeHandler<CONTENT of com.facebook.internal.FacebookDialogBase, RESULT of com.facebook.internal.FacebookDialogBase>>");
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppCall createAppCallForMode(CONTENT content, Object mode) {
        boolean z = mode == BASE_AUTOMATIC_MODE;
        AppCall appCallCreateBaseAppCall = null;
        for (FacebookDialogBase<CONTENT, RESULT>.ModeHandler modeHandler : cachedModeHandlers()) {
            if (!z) {
                Utility utility = Utility.INSTANCE;
                if (!Utility.areObjectsEqual(modeHandler.getMode(), mode)) {
                    continue;
                }
            }
            if (modeHandler.canShow(content, true)) {
                try {
                    appCallCreateBaseAppCall = modeHandler.createAppCall(content);
                    break;
                } catch (FacebookException e) {
                    appCallCreateBaseAppCall = createBaseAppCall();
                    DialogPresenter dialogPresenter = DialogPresenter.INSTANCE;
                    DialogPresenter.setupAppCallForValidationError(appCallCreateBaseAppCall, e);
                }
            }
        }
        if (appCallCreateBaseAppCall != null) {
            return appCallCreateBaseAppCall;
        }
        AppCall appCallCreateBaseAppCall2 = createBaseAppCall();
        DialogPresenter dialogPresenter2 = DialogPresenter.INSTANCE;
        DialogPresenter.setupAppCallForCannotShowError(appCallCreateBaseAppCall2);
        return appCallCreateBaseAppCall2;
    }

    private final void memorizeCallbackManager(CallbackManager callbackManager) {
        CallbackManager callbackManager2 = this.callbackManager;
        if (callbackManager2 == null) {
            this.callbackManager = callbackManager;
        } else if (callbackManager2 != callbackManager) {
            Log.w(TAG, "You're registering a callback on a Facebook dialog with two different callback managers. It's almost wrong and may cause unexpected results. Only the first callback manager will be used for handling activity result with androidx.");
        }
    }

    @Override // com.facebook.FacebookDialog
    public boolean canShow(CONTENT content) {
        return canShowImpl(content, BASE_AUTOMATIC_MODE);
    }

    public boolean canShowImpl(CONTENT content, @NotNull Object mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        boolean z = mode == BASE_AUTOMATIC_MODE;
        for (FacebookDialogBase<CONTENT, RESULT>.ModeHandler modeHandler : cachedModeHandlers()) {
            if (!z) {
                Utility utility = Utility.INSTANCE;
                if (!Utility.areObjectsEqual(modeHandler.getMode(), mode)) {
                    continue;
                }
            }
            if (modeHandler.canShow(content, false)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final p011OooOOoo.OooO<CONTENT, CallbackManager.ActivityResultParameters> createActivityResultContractForShowingDialog(@Nullable final CallbackManager callbackManager, @NotNull final Object mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        return new p011OooOOoo.OooO<CONTENT, CallbackManager.ActivityResultParameters>(this) { // from class: com.facebook.internal.FacebookDialogBase.createActivityResultContractForShowingDialog.1
            public final /* synthetic */ FacebookDialogBase<CONTENT, RESULT> this$0;

            {
                this.this$0 = this;
            }

            @Override // p011OooOOoo.OooO
            @NotNull
            public Intent createIntent(@NotNull Context context, CONTENT content) {
                Intrinsics.checkNotNullParameter(context, "context");
                AppCall appCallCreateAppCallForMode = this.this$0.createAppCallForMode(content, mode);
                Intent requestIntent = appCallCreateAppCallForMode == null ? null : appCallCreateAppCallForMode.getRequestIntent();
                if (requestIntent != null) {
                    appCallCreateAppCallForMode.setPending();
                    return requestIntent;
                }
                throw new FacebookException("Content " + content + " is not supported");
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p011OooOOoo.OooO
            @NotNull
            public CallbackManager.ActivityResultParameters parseResult(int resultCode, @Nullable Intent intent) {
                CallbackManager callbackManager2 = callbackManager;
                if (callbackManager2 != null) {
                    callbackManager2.onActivityResult(this.this$0.getRequestCodeField(), resultCode, intent);
                }
                return new CallbackManager.ActivityResultParameters(this.this$0.getRequestCodeField(), resultCode, intent);
            }
        };
    }

    @NotNull
    public abstract AppCall createBaseAppCall();

    @Nullable
    public final Activity getActivityContext() {
        Activity activity = this.activity;
        if (activity != null) {
            return activity;
        }
        FragmentWrapper fragmentWrapper = this.fragmentWrapper;
        if (fragmentWrapper == null) {
            return null;
        }
        return fragmentWrapper.getActivity();
    }

    @VisibleForTesting(otherwise = 2)
    @Nullable
    /* JADX INFO: renamed from: getCallbackManager$facebook_common_release, reason: from getter */
    public final CallbackManager getCallbackManager() {
        return this.callbackManager;
    }

    @NotNull
    public abstract List<FacebookDialogBase<CONTENT, RESULT>.ModeHandler> getOrderedModeHandlers();

    /* JADX INFO: renamed from: getRequestCode, reason: from getter */
    public final int getRequestCodeField() {
        return this.requestCodeField;
    }

    @Override // com.facebook.FacebookDialog
    public void registerCallback(@NotNull CallbackManager callbackManager, @NotNull FacebookCallback<RESULT> callback) {
        Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!(callbackManager instanceof CallbackManagerImpl)) {
            throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        }
        memorizeCallbackManager(callbackManager);
        registerCallbackImpl((CallbackManagerImpl) callbackManager, callback);
    }

    public abstract void registerCallbackImpl(@NotNull CallbackManagerImpl callbackManager, @NotNull FacebookCallback<RESULT> callback);

    public final void setCallbackManager(@Nullable CallbackManager callbackManager) {
        this.callbackManager = callbackManager;
    }

    public final void setCallbackManager$facebook_common_release(@Nullable CallbackManager callbackManager) {
        this.callbackManager = callbackManager;
    }

    public final void setRequestCode(int i) {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        if (!(!FacebookSdk.isFacebookRequestCode(i))) {
            throw new IllegalArgumentException(OooO0O0.OooO00o.OooO00o("Request code ", i, " cannot be within the range reserved by the Facebook SDK.").toString());
        }
        this.requestCodeField = i;
    }

    @Override // com.facebook.FacebookDialog
    public void show(CONTENT content) {
        showImpl(content, BASE_AUTOMATIC_MODE);
    }

    public void showImpl(CONTENT content, @NotNull Object mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        AppCall appCallCreateAppCallForMode = createAppCallForMode(content, mode);
        if (appCallCreateAppCallForMode == null) {
            Log.e(TAG, "No code path should ever result in a null appCall");
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            if (!(!FacebookSdk.isDebugEnabled())) {
                throw new IllegalStateException("No code path should ever result in a null appCall".toString());
            }
            return;
        }
        if (getActivityContext() instanceof androidx.activity.result.OooO0OO) {
            ComponentCallbacks2 activityContext = getActivityContext();
            Objects.requireNonNull(activityContext, "null cannot be cast to non-null type androidx.activity.result.ActivityResultRegistryOwner");
            DialogPresenter dialogPresenter = DialogPresenter.INSTANCE;
            ActivityResultRegistry activityResultRegistry = ((androidx.activity.result.OooO0OO) activityContext).getActivityResultRegistry();
            Intrinsics.checkNotNullExpressionValue(activityResultRegistry, "registryOwner.activityResultRegistry");
            DialogPresenter.present(appCallCreateAppCallForMode, activityResultRegistry, this.callbackManager);
            appCallCreateAppCallForMode.setPending();
            return;
        }
        FragmentWrapper fragmentWrapper = this.fragmentWrapper;
        if (fragmentWrapper != null) {
            DialogPresenter dialogPresenter2 = DialogPresenter.INSTANCE;
            DialogPresenter.present(appCallCreateAppCallForMode, fragmentWrapper);
            return;
        }
        Activity activity = this.activity;
        if (activity != null) {
            DialogPresenter dialogPresenter3 = DialogPresenter.INSTANCE;
            DialogPresenter.present(appCallCreateAppCallForMode, activity);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void startActivityForResult(@NotNull Intent intent, int requestCode) {
        String str;
        Intrinsics.checkNotNullParameter(intent, "intent");
        Activity activityContext = getActivityContext();
        if (activityContext instanceof androidx.activity.result.OooO0OO) {
            DialogPresenter dialogPresenter = DialogPresenter.INSTANCE;
            ActivityResultRegistry activityResultRegistry = ((androidx.activity.result.OooO0OO) activityContext).getActivityResultRegistry();
            Intrinsics.checkNotNullExpressionValue(activityResultRegistry, "activity as ActivityResultRegistryOwner).activityResultRegistry");
            DialogPresenter.startActivityForResultWithAndroidX(activityResultRegistry, this.callbackManager, intent, requestCode);
        } else {
            if (activityContext == 0) {
                FragmentWrapper fragmentWrapper = this.fragmentWrapper;
                if (fragmentWrapper != null) {
                    fragmentWrapper.startActivityForResult(intent, requestCode);
                } else {
                    str = "Failed to find Activity or Fragment to startActivityForResult ";
                }
                if (str != null) {
                    Logger.Companion companion = Logger.INSTANCE;
                    LoggingBehavior loggingBehavior = LoggingBehavior.DEVELOPER_ERRORS;
                    String name = getClass().getName();
                    Intrinsics.checkNotNullExpressionValue(name, "this.javaClass.name");
                    companion.log(loggingBehavior, 6, name, str);
                }
            }
            activityContext.startActivityForResult(intent, requestCode);
        }
        str = null;
        if (str != null) {
            Logger.Companion companion2 = Logger.INSTANCE;
            LoggingBehavior loggingBehavior2 = LoggingBehavior.DEVELOPER_ERRORS;
            String name2 = getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name2, "this.javaClass.name");
            companion2.log(loggingBehavior2, 6, name2, str);
        }
    }

    @Override // com.facebook.FacebookDialog
    @NotNull
    public p011OooOOoo.OooO<CONTENT, CallbackManager.ActivityResultParameters> createActivityResultContractForShowingDialog(@Nullable CallbackManager callbackManager) {
        return createActivityResultContractForShowingDialog(callbackManager, BASE_AUTOMATIC_MODE);
    }

    @Override // com.facebook.FacebookDialog
    public void registerCallback(@NotNull CallbackManager callbackManager, @NotNull FacebookCallback<RESULT> callback, int requestCode) {
        Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        Intrinsics.checkNotNullParameter(callback, "callback");
        memorizeCallbackManager(callbackManager);
        setRequestCode(requestCode);
        registerCallback(callbackManager, callback);
    }

    public FacebookDialogBase(@NotNull FragmentWrapper fragmentWrapper, int i) {
        Intrinsics.checkNotNullParameter(fragmentWrapper, "fragmentWrapper");
        this.fragmentWrapper = fragmentWrapper;
        this.activity = null;
        this.requestCodeField = i;
        if (fragmentWrapper.getActivity() == null) {
            throw new IllegalArgumentException("Cannot use a fragment that is not attached to an activity".toString());
        }
    }

    public FacebookDialogBase(int i) {
        this.requestCodeField = i;
        this.activity = null;
        this.fragmentWrapper = null;
    }
}
